package a;

/* JADX INFO: loaded from: classes2.dex */
public enum af80 implements wlx {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f766a;

    af80(int i) {
        this.f766a = i;
    }

    public static af80 a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f766a;
        }
        jf4.o("Can't get the number of an unknown enum value.");
        return 0;
    }
}
