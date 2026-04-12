package dbTest;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.stream.Collectors;

class dbConfigTest {

    Connection connection;

    @BeforeEach
    void setUp() throws Exception {

        System.out.println("🔵 [SETUP] Démarrage du test setup...");

        // 1. Connexion H2 en mémoire
        System.out.println("🔵 [SETUP] Connexion à H2...");
        connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
        System.out.println("✅ [SETUP] Connexion H2 OK");

        // 2. Lire schema.sql
        System.out.println("🔵 [SETUP] Lecture du fichier schema.sql...");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream("/schema.sql"))
        );

        String sql = reader.lines().collect(Collectors.joining("\n"));
        System.out.println("📄 [SETUP] SQL chargé :");
        System.out.println(sql);

        // 3. Exécuter le script SQL
        System.out.println("🔵 [SETUP] Exécution du schema.sql...");
        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        System.out.println("✅ [SETUP] schema.sql exécuté avec succès !");
    }

    @Test
    void testDB() throws Exception {

        System.out.println("🟢 [TEST] Début du test testDB");

        Statement stmt = connection.createStatement();

        System.out.println("🟢 [TEST] Insertion dans la table students...");
        stmt.execute("INSERT INTO students (id, name) VALUES (1, 'Hamza')");

        System.out.println("✅ [TEST] Insert OK");

        System.out.println("🎉 [TEST] Fin du test testDB");
    }
}