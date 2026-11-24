package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fye0 implements t2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10355a;
    public final /* synthetic */ eze0 b;

    public /* synthetic */ fye0(eze0 eze0Var, byte b) {
        this.f10355a = b;
        this.b = eze0Var;
    }

    @Override // a.t2g0
    public final void onResult(Object obj) {
        Object value;
        byte b = this.f10355a;
        eze0 eze0Var = this.b;
        switch (b) {
            case 0:
                obj.getClass();
                yje yjeVar = null;
                if ((obj instanceof kl90 ? (kl90) obj : null) != null) {
                    kl90 kl90Var = (kl90) obj;
                    int i = kl90Var.f18476a;
                    boolean z = kl90Var.b;
                    eze0 eze0Var2 = this.b;
                    sac.V(jiu0.a(eze0Var2), aze0.f1714a, null, eze0Var2.a0.f22085a, new a48(eze0Var2, i, z, yjeVar, (byte) 3), 10);
                }
                break;
            case 1:
                obj.getClass();
                p7m0 p7m0Var = eze0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    eze0Var.f.getClass();
                } while (!p7m0Var.m(value, aye0.a((aye0) value, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483646)));
                break;
            default:
                obj.getClass();
                yje yjeVar2 = null;
                if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                    sac.V(jiu0.a(eze0Var), new eye0(eze0Var, (byte) 0), null, eze0Var.a0.f22085a, new defpackage.e(eze0Var, ((Number) obj).intValue(), yjeVar2, (byte) 6), 10);
                }
                break;
        }
    }
}
