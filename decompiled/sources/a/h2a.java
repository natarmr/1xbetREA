package a;

/* JADX INFO: loaded from: classes.dex */
public final class h2a implements fag0 {
    public final /* synthetic */ byte b;
    public final fag0 c;

    public h2a(byte b, long j) {
        this.b = b;
        switch (b) {
            case 1:
                this.c = new rmq0(j, new g2a(j));
                break;
            default:
                this.c = new h2a((byte) 1, j);
                break;
        }
    }

    @Override // a.fag0
    public final long a() {
        byte b = this.b;
        fag0 fag0Var = this.c;
        switch (b) {
            case 0:
                return ((rmq0) ((h2a) fag0Var).c).b;
            default:
                return ((rmq0) fag0Var).b;
        }
    }

    @Override // a.fag0
    public final eag0 b(f2a f2aVar) {
        byte b = this.b;
        fag0 fag0Var = this.c;
        switch (b) {
            case 0:
                if (((rmq0) ((h2a) fag0Var).c).b(f2aVar).b) {
                    return eag0.e;
                }
                Throwable th = f2aVar.c;
                if (th instanceof w3a) {
                    l8x.X("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    if (((w3a) th).f38492a > 0) {
                        return eag0.f;
                    }
                }
                return eag0.d;
            default:
                return ((rmq0) fag0Var).b(f2aVar);
        }
    }
}
