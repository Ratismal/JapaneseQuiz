package io.github.ratismal.japanesequiz.reference;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ratismal on 2015-09-14.
 */

public class HiraganaBasicMap {

    private static final ArrayList<String> characterList = new ArrayList<String>();

    public HiraganaBasicMap() {

        characterList.add("a");
        characterList.add("i");
        characterList.add("u");
        characterList.add("e");
        characterList.add("o");

        characterList.add("ka");
        characterList.add("ki");
        characterList.add("ku");
        characterList.add("ke");
        characterList.add("ko");

        characterList.add("sa");
        characterList.add("si");
        characterList.add("su");
        characterList.add("se");
        characterList.add("so");

        characterList.add("ta");
        characterList.add("chi");
        characterList.add("tsu");
        characterList.add("te");
        characterList.add("to");

        characterList.add("na");
        characterList.add("ni");
        characterList.add("nu");
        characterList.add("ne");
        characterList.add("no");

        characterList.add("ha");
        characterList.add("hi");
        characterList.add("hu");
        characterList.add("he");
        characterList.add("ho");

        characterList.add("ma");
        characterList.add("mi");
        characterList.add("mu");
        characterList.add("me");
        characterList.add("mo");

        characterList.add("ya");
        characterList.add("yu");
        characterList.add("yo");

        characterList.add("ra");
        characterList.add("ri");
        characterList.add("ru");
        characterList.add("re");
        characterList.add("ro");

        characterList.add("wa");
        characterList.add("wo");

        characterList.add("n");

    }

    public static ArrayList<String> getCharacterList() {
        return characterList;
    }

}
