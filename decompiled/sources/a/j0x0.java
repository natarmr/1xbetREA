package a;

/* JADX INFO: loaded from: classes2.dex */
public final class j0x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15702a;
    public final /* synthetic */ xyw0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ b1x0 e;

    public /* synthetic */ j0x0(b1x0 b1x0Var, xyw0 xyw0Var, long j, boolean z, byte b) {
        this.f15702a = b;
        this.b = xyw0Var;
        this.c = j;
        this.d = z;
        this.e = b1x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f15702a;
        long j = this.c;
        boolean z = this.d;
        xyw0 xyw0Var = this.b;
        b1x0 b1x0Var = this.e;
        switch (b) {
            case 0:
                b1x0Var.L1(xyw0Var);
                b1x0Var.B1(xyw0Var, j, z);
                break;
            default:
                b1x0Var.L1(xyw0Var);
                b1x0Var.B1(xyw0Var, j, z);
                break;
        }
    }
}
