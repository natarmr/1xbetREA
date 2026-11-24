package a;

/* JADX INFO: loaded from: classes4.dex */
public final class drq {
    public static final drq c;
    public static final drq d;
    public static final drq e;
    public static final drq f;
    public static final drq g;
    public static final drq h;
    public static final drq i;
    public static final drq j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6575a;
    public String b;

    static {
        byte b = 0;
        c = new drq("NONE", b);
        d = new drq("FULL", b);
        byte b2 = 1;
        e = new drq("TINK", b2);
        f = new drq("CRUNCHY", b2);
        g = new drq("NO_PREFIX", b2);
        byte b3 = 2;
        h = new drq("TINK", b3);
        i = new drq("CRUNCHY", b3);
        j = new drq("NO_PREFIX", b3);
    }

    public /* synthetic */ drq(String str, byte b) {
        this.f6575a = b;
        this.b = str;
    }

    public String toString() {
        switch (this.f6575a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }
}
