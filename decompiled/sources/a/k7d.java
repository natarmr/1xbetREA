package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17813a;
    public final /* synthetic */ bmf0 b;
    public final /* synthetic */ gnf0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ oz2 e;

    public /* synthetic */ k7d(bmf0 bmf0Var, gnf0 gnf0Var, long j, oz2 oz2Var, byte b) {
        this.f17813a = b;
        this.b = bmf0Var;
        this.c = gnf0Var;
        this.d = j;
        this.e = oz2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f17813a;
        oz2 oz2Var = this.e;
        long j = this.d;
        gnf0 gnf0Var = this.c;
        bmf0 bmf0Var = this.b;
        switch (b) {
            case 0:
                bmf0Var.d(gnf0Var, j, oz2Var);
                break;
            default:
                bmf0Var.y(gnf0Var, j, oz2Var);
                break;
        }
    }
}
