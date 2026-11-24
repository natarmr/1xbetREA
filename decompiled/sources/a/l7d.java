package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l7d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19552a;
    public final /* synthetic */ bmf0 b;
    public final /* synthetic */ gnf0 c;

    public /* synthetic */ l7d(bmf0 bmf0Var, gnf0 gnf0Var, byte b) {
        this.f19552a = b;
        this.b = bmf0Var;
        this.c = gnf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19552a) {
            case 0:
                this.b.x(this.c);
                break;
            case 1:
                this.b.k(this.c);
                break;
            default:
                this.b.n(this.c);
                break;
        }
    }
}
