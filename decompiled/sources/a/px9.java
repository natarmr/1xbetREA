package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27742a;
    public final /* synthetic */ vx9 b;
    public final /* synthetic */ gnf0 c;

    public /* synthetic */ px9(vx9 vx9Var, ux9 ux9Var, gnf0 gnf0Var, byte b) {
        this.f27742a = b;
        this.b = vx9Var;
        this.c = gnf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27742a) {
            case 0:
                this.b.e(ux9.g(this.c));
                break;
            default:
                this.b.a(ux9.g(this.c));
                break;
        }
    }
}
