package view;
/**
 * This is an enum class that represents all the
 * Civilizations that the user may chose from
 */
public enum CivEnum {

    ANCIENT_EGYPT {
        @Override
        public String toString() {
            return "Ancient Egypt";
        }
    },
    QIN_DYNASTY {
        @Override
        public String toString() {
            return "Qin Dynasty";
        }
    },
    ROMAN_EMPIRE {
        @Override
        public String toString() {
            return "Roman Empire";
        }
    },
    INCAN_EMPIRE {
        @Override
        public String toString() {
            return "Incan Empire";
        }
    },
    GREEK_EMPIRE {
        @Override
        public String toString() {
            return "Greek Empire";
        }
    },
    HAN_DYNASTY {
        @Override
        public String toString() {
            return "Han Dynasty";
        }
    }
}