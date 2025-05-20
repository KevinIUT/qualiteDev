package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({StatistiqueImplTest.class, VoitureTest.class})  // Liste des classes à inclure dans la suite
public class TestSuite {
    // Pas besoin de code dans cette classe, elle sert uniquement à regrouper les tests
}
