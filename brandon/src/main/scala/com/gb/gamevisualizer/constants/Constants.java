package com.gb.gamevisualizer.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constants {
    enum GiantBombInfo{
        API_CODE("?api_key=e8a3ee2589f8db0821210188ca6e7181f83ac104"),
        URL("http://www.giantbomb.com/api"),
        GAME("/game/");

        private String val;

        GiantBombInfo(String val) {
            this.val = val;
        }

        public String getVal() {
            return val;
        }
    }

    enum Platforms {
        AMIGA("Amiga", 1),
        GAME_BOY("Game Boy", 3),
        GAME_BOY_ADVANCE("Game Boy Advance", 4),
        GAME_GEAR("Game Gear", 5),
        GENESIS("Genesis", 6),
        ATARI_LYNX("Atari Lynx", 7),
        SEGA_MASTER_SYSTEM("Sega Master System", 8),
        SNES("Super Nintendo Entertainment System", 9),
        AMSTRAD_CPC("Amstrad CPC", 11),
        APPLE_II("Apple II", 12),
        ATARI_ST("Atari ST", 13),
        COMMODORE_64("Commodore 64", 14),
        MSX("MSX", 15),
        ZX_SPECTRUM("ZX Spectrum", 16),
        MAC("Mac", 17),
        PSP("PlayStation Portable", 18),
        PS2("PlayStation 2", 19),
        XBOX_360("Xbox 360", 20),
        NES("Nintendo Entertainment System", 21),
        PLAYSTATION("PlayStation", 22),
        GAMECUBE("GameCube", 23),
        ATARI_8_BIT("Atari 8-bit", 24),
        NEO_GEO("Neo Geo", 25),
        THREE_D_O("3DO", 26),
        CD_I("CD-i", 27),
        JAGUAR("Jaguar", 28),
        SEGA_CD("Sega CD", 29),
        VIC_20("VIC-20", 30),
        SEGA_32X("Sega 32X", 31),
        XBOX("Xbox", 32),
        N_GAGE("N-Gage", 34),
        PLATSTAION_3("PlayStation 3", 35),
        WII("Wii", 36),
        DREAMCAST("Dreamcast", 37),
        APPLE_II_GS("Apple IIgs", 38),
        AMIGA_CD_32("Amiga CD32", 39),
        ATARI_2600("Atari 2600", 40),
        SATURN("Saturn", 42),
        NINTENDO_64("Nintendo 64", 43),
        COLECOVISION("ColecoVision", 47),
        TI_99("TI-99/4A", 48),
        INTELLIVISION("Intellivision", 51),
        NINTENDO_DS("Nintendo DS", 52),
        TURBOGRAFX_CD("TurboGrafx-CD", 53),
        WONDERSWAN_COLOR("WonderSwan Color", 54),
        TURBOGRAFX_16("TurboGrafx-16", 55),
        GAMEBOY_COLOR("Game Boy Color", 57),
        COMMODOR_128("Commodore 128", 58),
        NEO_GEO_CD("Neo Geo CD", 59),
        ODYSSEY_2("Odyssey 2", 60),
        DRAGON_32_64("Dragon 32/64", 61),
        COMMODOR_PET_CBM("Commodore PET/CBM", 62),
        TRS_80("TRS-80", 63),
        ZODIAC("Zodiac", 64),
        WONDERSWAN("WonderSwan", 65),
        CHANNEL_F("Channel F", 66),
        ATARI_5200("Atari 5200", 67),
        TRS_80_COCO("TRS-80 CoCo", 68),
        ATARI_7800("Atari 7800", 70),
        IPOD("iPod", 72),
        OSYSSEY("Odyssey", 74),
        PC_FX("PC-FX", 75),
        VECTREX("Vectrex", 76),
        GAME_COM("Game.Com", 77),
        GIZMONDO("Gizmondo", 78),
        VIRTUAL_BOY("Virtual Boy", 79),
        NEO_GEO_POCKET("New Geo Pocket", 80),
        NEO_GEO_POCKET_COLOR("New Geo Pocket Color", 81),
        V_SMILE("V.Smile", 82),
        PINBALL("Pinball", 83),
        ARCADE("Arcade", 84),
        NUON("NUON", 85),
        LEAPSTER("Leapster", 89),
        MICROVISION("Microvision", 90),
        FAMICOM_DISK_SYSTEM("Famicom Disk System", 91),
        PIONEER_LASERACTIVE("Pioneer LaserActive", 92),
        ADVENTURE_VISION("Adventure Vision", 93),
        PC("PC", 94),
        SHARP_X68000("Sharp X68000", 95),
        IPHONE("iPhone", 96),
        SATELLAVIEW("Satellaview", 98),
        ACARDIA_2001("Arcadia 2001", 99),
        AQUARIUS("Aquarius", 100),
        NINTENDO_64DD("Nintendo 64DD", 101),
        PIPPIN("Pippin", 102),
        R_ZONE("R-Zone", 103),
        HYPERSCAN("HyperScan", 104),
        GAME_WAVE("Game Wave", 105),
        RDI_HALCYON("RDI Halcyon", 107),
        FM_TOWNS("FM Towns", 108),
        NEC_PC_8801("NEC PC-8801", 109),
        BBC_MICRO("BBC Micro", 110),
        PLATO("PLATO", 111),
        NEC_PC_9801("NEC PC-9801", 112),
        SHARP_X1("Sharp X1", 113),
        FM_7("FM-7", 114);

        private String name;
        private Integer id;
        private final Map<String, Integer> nameToId = new HashMap<>();
        private final Map<Integer, String> idToName = new HashMap<>();

        Platforms(String name, Integer id) {
            this.name = name;
            this.id = id;
        }

        public void buildMaps() {
            List<String> names = new ArrayList<>();
             Platforms[] platforms = Platforms.values();
        }

    }
}
