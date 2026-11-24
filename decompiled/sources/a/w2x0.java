package a;

/* JADX INFO: loaded from: classes2.dex */
public final class w2x0 extends bmw0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ a4x0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2x0(a4x0 a4x0Var, syw0 syw0Var, byte b) {
        super(syw0Var);
        this.e = b;
        this.f = a4x0Var;
    }

    @Override // a.bmw0
    public final void a() {
        byte b = this.e;
        a4x0 a4x0Var = this.f;
        switch (b) {
            case 0:
                a4x0Var.m1();
                if (a4x0Var.C1()) {
                    uuw0 uuw0Var = ((kxw0) a4x0Var.b).f;
                    kxw0.g(uuw0Var);
                    uuw0Var.o.a("Inactivity, disconnecting from the service");
                    a4x0Var.t1();
                    break;
                }
                break;
            default:
                uuw0 uuw0Var2 = ((kxw0) a4x0Var.b).f;
                kxw0.g(uuw0Var2);
                uuw0Var2.j.a("Tasks have been queued for a long time");
                break;
        }
    }
}
