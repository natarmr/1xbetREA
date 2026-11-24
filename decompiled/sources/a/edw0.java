package a;

/* JADX INFO: loaded from: classes2.dex */
public final class edw0 {
    public static final edw0 b = new edw0(0);
    public static final edw0 c = new edw0(1);
    public static final edw0 d = new edw0(2);
    public static final edw0 e = new edw0(3);
    public static final edw0 f = new edw0(4);
    public static final edw0 g = new edw0(5);
    public static final edw0 h = new edw0(6);
    public static final edw0 i = new edw0(7);
    public static final edw0 j = new edw0(8);
    public static final edw0 k = new edw0(9);
    public static final edw0 l = new edw0(10);
    public static final edw0 m = new edw0(11);
    public static final edw0 n = new edw0(12);
    public static final edw0 o = new edw0(13);
    public static final edw0 p = new edw0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7641a;

    public /* synthetic */ edw0(byte b2) {
        this.f7641a = b2;
    }

    public final boolean a(int i2) {
        switch (this.f7641a) {
            case 0:
                return fdw0.a(i2) != null;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 2:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 4:
                return yum0.q(i2) != 0;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 9:
                return i2 == 0 || i2 == 1;
            case 10:
                return i2 == 1 || i2 == 2;
            case 11:
                return esw0.g(i2) != 0;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
