package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rxj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31267a;
    public final /* synthetic */ pmn0 b;

    public /* synthetic */ rxj(pmn0 pmn0Var, byte b) {
        this.f31267a = b;
        this.b = pmn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f31267a;
        pmn0 pmn0Var = this.b;
        switch (b) {
            case 0:
                pmn0Var.c();
                break;
            default:
                pmn0Var.f.cancel(true);
                break;
        }
    }
}
