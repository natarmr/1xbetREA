package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bxi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3377a = 0;
    public final Object b;

    public bxi(us3 us3Var, us00 us00Var, q7d0 q7d0Var, vby vbyVar) {
        us3Var.getClass();
        q7d0Var.getClass();
        vbyVar.getClass();
        this.b = new bxi(us3Var);
    }

    public final epi0 a() {
        byte b = this.f3377a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new epi0(new j6m0(new y2m0((byte) 18), new s2m0(), (us3) obj), (byte) 11);
            default:
                return ((bxi) obj).a();
        }
    }

    public bxi(us3 us3Var) {
        this.b = us3Var;
    }
}
