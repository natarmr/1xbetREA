package a;

/* JADX INFO: loaded from: classes4.dex */
public final class gkf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ncz f11441a;
    public final /* synthetic */ ma80 b;

    public gkf0(ncz nczVar, ma80 ma80Var) {
        this.f11441a = nczVar;
        this.b = ma80Var;
    }

    public final long a() {
        int i = this.f11441a.p;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return ((long) i) & 4294967295L;
        }
        if (iOrdinal == 1) {
            return ((long) i) << 32;
        }
        t9f.b();
        return 0L;
    }

    public final long b() {
        int i = this.f11441a.q;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return ((long) i) & 4294967295L;
        }
        if (iOrdinal == 1) {
            return ((long) i) << 32;
        }
        t9f.b();
        return 0L;
    }
}
