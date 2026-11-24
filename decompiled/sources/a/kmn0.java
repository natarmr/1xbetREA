package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kmn0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18549a;
    public final /* synthetic */ omn0 b;
    public final /* synthetic */ l55 c;

    public /* synthetic */ kmn0(omn0 omn0Var, l55 l55Var, byte b) {
        this.f18549a = b;
        this.b = omn0Var;
        this.c = l55Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f18549a;
        l55 l55Var = this.c;
        omn0 omn0Var = this.b;
        switch (b) {
            case 0:
                omn0Var.d(l55Var);
                break;
            default:
                omn0Var.d(l55Var);
                break;
        }
    }
}
