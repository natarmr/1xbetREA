package a;

/* JADX INFO: loaded from: classes3.dex */
public final class r2v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9s0 f29757a;

    public r2v(j9s0 j9s0Var, byte b) {
        switch (b) {
            case 1:
                this.f29757a = j9s0Var;
                break;
            case 2:
                j9s0Var.getClass();
                this.f29757a = j9s0Var;
                break;
            default:
                j9s0Var.getClass();
                this.f29757a = j9s0Var;
                break;
        }
    }

    public o7s0 a(long j) {
        return new o7s0(vtb.N(this.f29757a.d.f30101a), j, (byte) 1);
    }
}
