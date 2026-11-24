package a;

/* JADX INFO: loaded from: classes6.dex */
public final class zkl0 implements cll0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zkl0 f44539a = new zkl0();
    public static final float b;
    public static final float c;

    static {
        zcl zclVar = qmk.f28987a;
        b = 150.0f;
        c = 20.0f;
    }

    @Override // a.cll0
    public final float a() {
        return b;
    }

    @Override // a.cll0
    public final float b() {
        return c;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zkl0);
    }

    public final int hashCode() {
        return 1194472099;
    }

    public final String toString() {
        return "LargeCardWatermark";
    }
}
