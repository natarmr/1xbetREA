package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e58 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7220a;
    public final /* synthetic */ l58 b;

    public /* synthetic */ e58(l58 l58Var, int i, CharSequence charSequence) {
        this.f7220a = (byte) 1;
        this.b = l58Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f7220a;
        l58 l58Var = this.b;
        switch (b) {
            case 0:
                t58 t58Var = l58Var.H1;
                if (t58Var.c == null) {
                    t58Var.c = new s58();
                }
                break;
            case 1:
                t58 t58Var2 = l58Var.H1;
                if (t58Var2.c == null) {
                    t58Var2.c = new s58();
                }
                break;
            default:
                l58Var.H1.y = false;
                break;
        }
    }

    public /* synthetic */ e58(l58 l58Var, byte b) {
        this.f7220a = b;
        this.b = l58Var;
    }
}
