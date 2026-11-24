package a;

/* JADX INFO: loaded from: classes.dex */
public final class zfk0 extends e8m0 {
    public float c;

    public zfk0(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // a.e8m0
    public final void a(e8m0 e8m0Var) {
        e8m0Var.getClass();
        this.c = ((zfk0) e8m0Var).c;
    }

    @Override // a.e8m0
    public final e8m0 b(long j) {
        return new zfk0(this.c, j);
    }
}
