package a;

/* JADX INFO: loaded from: classes2.dex */
public final class h5d0 implements d3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12475a = false;
    public boolean b = false;
    public sqp c;
    public final g5d0 d;

    public h5d0(g5d0 g5d0Var) {
        this.d = g5d0Var;
    }

    @Override // a.d3u0
    public final d3u0 b(String str) {
        if (this.f12475a) {
            throw new hwn("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f12475a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // a.d3u0
    public final d3u0 g(boolean z) {
        if (this.f12475a) {
            throw new hwn("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f12475a = true;
        this.d.g(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
