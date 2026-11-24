package a;

/* JADX INFO: loaded from: classes.dex */
public final class o06 implements xpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xpg0 f24407a;

    public o06(xpg0 xpg0Var) {
        this.f24407a = xpg0Var;
    }

    @Override // a.xpg0
    public final boolean B0() {
        return this.f24407a.B0();
    }

    @Override // a.xpg0
    public final String J0(int i) {
        return this.f24407a.J0(i);
    }

    @Override // a.xpg0
    public final boolean W0() {
        return this.f24407a.W0();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        xpg0 xpg0Var = this.f24407a;
        xpg0Var.reset();
        xpg0Var.t();
    }

    @Override // a.xpg0
    public final byte[] getBlob(int i) {
        return this.f24407a.getBlob(i);
    }

    @Override // a.xpg0
    public final int getColumnCount() {
        return this.f24407a.getColumnCount();
    }

    @Override // a.xpg0
    public final String getColumnName(int i) {
        return this.f24407a.getColumnName(i);
    }

    @Override // a.xpg0
    public final double getDouble(int i) {
        return this.f24407a.getDouble(i);
    }

    @Override // a.xpg0
    public final long getLong(int i) {
        return this.f24407a.getLong(i);
    }

    @Override // a.xpg0
    public final void i(byte[] bArr, int i) {
        bArr.getClass();
        this.f24407a.i(bArr, i);
    }

    @Override // a.xpg0
    public final boolean isNull(int i) {
        return this.f24407a.isNull(i);
    }

    @Override // a.xpg0
    public final void o(int i, long j) {
        this.f24407a.o(i, j);
    }

    @Override // a.xpg0
    public final void p(double d, int i) {
        this.f24407a.p(d, i);
    }

    @Override // a.xpg0
    public final void reset() {
        this.f24407a.reset();
    }

    @Override // a.xpg0
    public final void s(int i) {
        this.f24407a.s(i);
    }

    @Override // a.xpg0
    public final void t() {
        this.f24407a.t();
    }

    @Override // a.xpg0
    public final void z(int i, String str) {
        str.getClass();
        this.f24407a.z(i, str);
    }
}
