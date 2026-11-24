package a;

/* JADX INFO: loaded from: classes2.dex */
public enum zky implements wlx {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44555a;

    zky(int i) {
        this.f44555a = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f44555a;
        }
        jf4.o("Can't get the number of an unknown enum value.");
        return 0;
    }
}
