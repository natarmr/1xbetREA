package a;

/* JADX INFO: loaded from: classes.dex */
public final class agn {
    public static final agn c = new agn(0, 0);
    public static final agn d = new agn(1, 8);
    public static final agn e = new agn(3, 10);
    public static final agn f = new agn(4, 10);
    public static final agn g = new agn(5, 10);
    public static final agn h = new agn(6, 10);
    public static final agn i = new agn(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f832a;
    public final int b;

    public agn(int i2, int i3) {
        this.f832a = i2;
        this.b = i3;
    }

    public final boolean a() {
        return b() && this.f832a != 1 && this.b == 10;
    }

    public final boolean b() {
        int i2 = this.f832a;
        return (i2 == 0 || i2 == 2 || this.b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agn) {
            agn agnVar = (agn) obj;
            if (this.f832a == agnVar.f832a && this.b == agnVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.f832a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f832a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return rz4.j(this.b, "}", sb);
    }
}
