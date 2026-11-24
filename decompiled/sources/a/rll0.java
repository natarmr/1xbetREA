package a;

/* JADX INFO: loaded from: classes6.dex */
public final class rll0 implements ull0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rll0 f30703a = new rll0();
    public static final float b;
    public static final float c;

    static {
        zcl zclVar = qmk.f28987a;
        b = 192.0f;
        c = 20.0f;
    }

    @Override // a.ull0
    public final float a() {
        return b;
    }

    @Override // a.ull0
    public final float b() {
        return c;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rll0);
    }

    public final int hashCode() {
        return -1619094096;
    }

    public final String toString() {
        return "LargeCardWatermark";
    }
}
