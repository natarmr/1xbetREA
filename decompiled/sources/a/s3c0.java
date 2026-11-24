package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s3c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31551a;
    public final /* synthetic */ y3c0 b;

    public /* synthetic */ s3c0(y3c0 y3c0Var, byte b) {
        this.f31551a = b;
        this.b = y3c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f31551a;
        y3c0 y3c0Var = this.b;
        switch (b) {
            case 0:
                y3c0Var.n1 = true;
                break;
            case 1:
                y3c0Var.B();
                break;
            default:
                if (!y3c0Var.t1) {
                    ln30 ln30Var = y3c0Var.r;
                    ln30Var.getClass();
                    ln30Var.a(y3c0Var);
                }
                break;
        }
    }
}
