package a;

/* JADX INFO: loaded from: classes.dex */
public final class ab8 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f567a;
    public final r3k0 b;

    public ab8(byte b) {
        this.f567a = b;
        switch (b) {
            case 1:
                this.b = new r3k0(35152, 2, "image/png");
                break;
            default:
                this.b = new r3k0(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) {
        byte b = this.f567a;
        r3k0 r3k0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return r3k0Var.a(guoVar, mtcVar);
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        byte b = this.f567a;
        r3k0 r3k0Var = this.b;
        switch (b) {
            case 0:
                r3k0Var.b(j, j2);
                break;
            default:
                r3k0Var.b(j, j2);
                break;
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        byte b = this.f567a;
        r3k0 r3k0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return r3k0Var.c(guoVar);
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        byte b = this.f567a;
        r3k0 r3k0Var = this.b;
        switch (b) {
            case 0:
                r3k0Var.e(huoVar);
                break;
            default:
                r3k0Var.e(huoVar);
                break;
        }
    }

    @Override // a.fuo
    public final void release() {
        byte b = this.f567a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
