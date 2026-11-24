package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m7d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21314a;
    public final /* synthetic */ bmf0 b;
    public final /* synthetic */ gnf0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ kft0 e;

    public /* synthetic */ m7d(bmf0 bmf0Var, gnf0 gnf0Var, long j, kft0 kft0Var, byte b) {
        this.f21314a = b;
        this.b = bmf0Var;
        this.c = gnf0Var;
        this.d = j;
        this.e = kft0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f21314a;
        kft0 kft0Var = this.e;
        long j = this.d;
        gnf0 gnf0Var = this.c;
        bmf0 bmf0Var = this.b;
        switch (b) {
            case 0:
                bmf0Var.w(gnf0Var, j, (qmf0) kft0Var);
                break;
            default:
                bmf0Var.c(gnf0Var, j, (pz2) kft0Var);
                break;
        }
    }
}
