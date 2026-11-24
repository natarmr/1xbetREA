package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yln0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42853a;
    public final /* synthetic */ bmn0 b;

    public /* synthetic */ yln0(bmn0 bmn0Var, byte b) {
        this.f42853a = b;
        this.b = bmn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f42853a;
        bmn0 bmn0Var = this.b;
        switch (b) {
            case 0:
                bmn0Var.a();
                break;
            case 1:
                bmn0Var.b();
                break;
            default:
                imn0 imn0Var = bmn0Var.q;
                if (imn0Var != null) {
                    imn0Var.d();
                }
                if (bmn0Var.p == null) {
                    bmn0Var.o.c();
                }
                bmn0Var.p = null;
                break;
        }
    }
}
