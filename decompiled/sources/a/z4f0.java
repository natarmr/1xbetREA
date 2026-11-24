package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z4f0 implements t2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43769a;
    public final /* synthetic */ x5f0 b;

    public /* synthetic */ z4f0(x5f0 x5f0Var, byte b) {
        this.f43769a = b;
        this.b = x5f0Var;
    }

    @Override // a.t2g0
    public final void onResult(Object obj) {
        switch (this.f43769a) {
            case 0:
                obj.getClass();
                yje yjeVar = null;
                if ((obj instanceof kl90 ? (kl90) obj : null) != null) {
                    kl90 kl90Var = (kl90) obj;
                    int i = kl90Var.f18476a;
                    boolean z = kl90Var.b;
                    x5f0 x5f0Var = this.b;
                    sac.V(jiu0.a(x5f0Var), t5f0.f33366a, null, x5f0Var.Z.f22085a, new a48(x5f0Var, i, z, yjeVar, (byte) 4), 10);
                }
                break;
            default:
                obj.getClass();
                yje yjeVar2 = null;
                if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                    int iIntValue = ((Number) obj).intValue();
                    x5f0 x5f0Var2 = this.b;
                    sac.V(jiu0.a(x5f0Var2), new y4f0(x5f0Var2, (byte) 2), null, x5f0Var2.Z.f22085a, new defpackage.e(x5f0Var2, iIntValue, yjeVar2, (byte) 7), 10);
                }
                break;
        }
    }
}
