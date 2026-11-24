package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41371a = 1;
    public final Object b;

    public xri(gle0 gle0Var, us00 us00Var) {
        this.b = new xri(us00Var);
    }

    public final svu a() {
        byte b = this.f41371a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new svu(new bb6((us00) obj));
            default:
                return ((xri) obj).a();
        }
    }

    public xri(us00 us00Var) {
        this.b = us00Var;
    }
}
