package io.github.ratismal.japanesequiz.reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ratismal on 2015-09-14.
 */

public class CharacterMap {

    private static ArrayList<String> characterList;

    public CharacterMap(boolean hiraBasic) {
        characterList = new ArrayList<>();
        if (hiraBasic) {
            for (String c: HiraganaBasicMap.getCharacterList()) {
                characterList.add(c);
            }
        }
    }

}
