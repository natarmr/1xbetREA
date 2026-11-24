package a;

/* JADX INFO: loaded from: classes2.dex */
public enum l2d0 implements vlx {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f19303a;

    /* JADX WARN: Multi-variable type inference failed */
    l2d0(int i) {
        this.f19303a = i;
    }

    public static l2d0 b(int i) {
        switch (i) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // a.vlx
    public final int a() {
        return this.f19303a;
    }
}
