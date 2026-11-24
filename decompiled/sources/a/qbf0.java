package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qbf0 implements t2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28443a;
    public final /* synthetic */ ocf0 b;

    public /* synthetic */ qbf0(ocf0 ocf0Var, byte b) {
        this.f28443a = b;
        this.b = ocf0Var;
    }

    @Override // a.t2g0
    public final void onResult(Object obj) {
        Object value;
        byte b = this.f28443a;
        ocf0 ocf0Var = this.b;
        switch (b) {
            case 0:
                obj.getClass();
                p7m0 p7m0Var = ocf0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    ocf0Var.f.getClass();
                } while (!p7m0Var.m(value, mbf0.a((mbf0) value, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741822)));
                break;
            case 1:
                obj.getClass();
                yje yjeVar = null;
                if ((obj instanceof Integer ? (Integer) obj : null) != null) {
                    sac.V(jiu0.a(ocf0Var), new pbf0(ocf0Var, (byte) 2), null, ocf0Var.Z.f22085a, new defpackage.e(ocf0Var, ((Number) obj).intValue(), yjeVar, (byte) 8), 10);
                }
                break;
            default:
                obj.getClass();
                yje yjeVar2 = null;
                if ((obj instanceof kl90 ? (kl90) obj : null) != null) {
                    kl90 kl90Var = (kl90) obj;
                    int i = kl90Var.f18476a;
                    boolean z = kl90Var.b;
                    ocf0 ocf0Var2 = this.b;
                    sac.V(jiu0.a(ocf0Var2), kcf0.f18056a, null, ocf0Var2.Z.f22085a, new a48(ocf0Var2, i, z, yjeVar2, (byte) 5), 10);
                }
                break;
        }
    }
}
