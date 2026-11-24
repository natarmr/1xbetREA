package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xln0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41083a;
    public final /* synthetic */ cmn0 b;

    public /* synthetic */ xln0(cmn0 cmn0Var, byte b) {
        this.f41083a = b;
        this.b = cmn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f41083a;
        cmn0 cmn0Var = this.b;
        switch (b) {
            case 0:
                ((lmv) j120.T()).execute(new xln0(cmn0Var, (byte) 1));
                break;
            default:
                if (!cmn0Var.n) {
                    cmn0Var.d();
                }
                break;
        }
    }
}
