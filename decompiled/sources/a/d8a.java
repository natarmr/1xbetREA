package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d8a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5637a;
    public final /* synthetic */ ibe0 b;

    public /* synthetic */ d8a(ibe0 ibe0Var, byte b) {
        this.f5637a = b;
        this.b = ibe0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f5637a;
        ibe0 ibe0Var = this.b;
        switch (b) {
            case 0:
                ibe0Var.e();
                break;
            case 1:
                if (ibe0Var != null) {
                    ibe0Var.e();
                }
                break;
            case 2:
                if (ibe0Var != null) {
                    ibe0Var.e();
                }
                break;
            case 3:
                ibe0Var.e();
                break;
            default:
                ibe0Var.e();
                break;
        }
    }
}
