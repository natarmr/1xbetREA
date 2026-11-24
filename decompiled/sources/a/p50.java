package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p50 {
    public static final p50 c;
    public static final p50 d;
    public static final p50 e;
    public static final p50 f;
    public static final p50 g;
    public static final p50 h;
    public static final p50 i;
    public static final p50 j;
    public static final p50 k;
    public static final p50 l;
    public static final p50 m;
    public static final p50 n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26380a;
    public String b;

    static {
        byte b = 0;
        c = new p50("TINK", b);
        d = new p50("CRUNCHY", b);
        e = new p50("LEGACY", b);
        f = new p50("NO_PREFIX", b);
        byte b2 = 1;
        g = new p50("VERTICAL", b2);
        h = new p50("HORIZONTAL", b2);
        byte b3 = 2;
        i = new p50("TINK", b3);
        j = new p50("CRUNCHY", b3);
        k = new p50("NO_PREFIX", b3);
        byte b4 = 3;
        l = new p50("TINK", b4);
        m = new p50("CRUNCHY", b4);
        n = new p50("NO_PREFIX", b4);
    }

    public /* synthetic */ p50(String str, byte b) {
        this.f26380a = b;
        this.b = str;
    }

    public String toString() {
        switch (this.f26380a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            default:
                return super.toString();
        }
    }
}
