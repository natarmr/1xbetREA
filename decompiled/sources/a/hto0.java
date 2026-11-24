package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hto0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13644a;
    public final /* synthetic */ ito0 b;

    public /* synthetic */ hto0(ito0 ito0Var, byte b) {
        this.f13644a = b;
        this.b = ito0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f13644a;
        ito0 ito0Var = this.b;
        switch (b) {
            case 0:
                ito0Var.d = null;
                ito0Var.c();
                break;
            default:
                ito0Var.c();
                break;
        }
    }
}
