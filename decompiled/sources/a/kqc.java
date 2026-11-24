package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18716a;
    public final pbt b;

    public kqc(pbt pbtVar, byte b) {
        this.f18716a = b;
        pbtVar.getClass();
        switch (b) {
            case 1:
                this.b = pbtVar;
                break;
            case 2:
                this.b = pbtVar;
                break;
            default:
                this.b = pbtVar;
                break;
        }
    }

    public sub0 a() {
        byte b = this.f18716a;
        pbt pbtVar = this.b;
        switch (b) {
            case 1:
                uub0 uub0Var = pbtVar.e;
                uub0Var.getClass();
                nh70 nh70Var = sub0.b;
                int i = uub0Var.f36291a.a().getInt("PreviewServiceStatusLocalDataSource.ACTIONS_KEY", 1);
                nh70Var.getClass();
                return nh70.g(i);
            default:
                uub0 uub0Var2 = pbtVar.e;
                uub0Var2.getClass();
                nh70 nh70Var2 = sub0.b;
                int i2 = uub0Var2.f36291a.a().getInt("PreviewServiceStatusLocalDataSource.PREVIEW_KEY", 1);
                nh70Var2.getClass();
                return nh70.g(i2);
        }
    }
}
