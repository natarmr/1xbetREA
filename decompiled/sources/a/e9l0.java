package a;

/* JADX INFO: loaded from: classes6.dex */
public final class e9l0 implements h9l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e9l0 f7428a = new e9l0();
    public static final float b;
    public static final float c;

    static {
        zcl zclVar = qmk.f28987a;
        b = 260.0f;
        c = 20.0f;
    }

    @Override // a.h9l0
    public final float a() {
        return b;
    }

    @Override // a.h9l0
    public final float b() {
        return c;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e9l0);
    }

    public final int hashCode() {
        return 137542011;
    }

    public final String toString() {
        return "LargeCardWatermark";
    }
}
