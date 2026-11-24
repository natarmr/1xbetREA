package a;

/* JADX INFO: loaded from: classes.dex */
public final class l8m0 implements xpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xpg0 f19612a;
    public final zi90 b;

    public l8m0(xpg0 xpg0Var, zi90 zi90Var) {
        this.f19612a = xpg0Var;
        this.b = zi90Var;
        Thread.currentThread().getId();
    }

    @Override // a.xpg0
    public final String J0(int i) {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return this.f19612a.J0(i);
        }
        m2x.J(21, "Statement is recycled");
        throw null;
    }

    @Override // a.xpg0
    public final boolean W0() {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return this.f19612a.W0();
        }
        m2x.J(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (((Boolean) this.b.get()).booleanValue()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        this.f19612a.close();
    }

    @Override // a.xpg0
    public final byte[] getBlob(int i) {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return this.f19612a.getBlob(i);
        }
        m2x.J(21, "Statement is recycled");
        throw null;
    }

    @Override // a.xpg0
    public final int getColumnCount() {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return this.f19612a.getColumnCount();
        }
        m2x.J(21, "Statement is recycled");
        throw null;
    }

    @Override // a.xpg0
    public final String getColumnName(int i) {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return this.f19612a.getColumnName(i);
        }
        m2x.J(21, "Statement is recycled");
        throw null;
    }

    @Override // a.xpg0
    public final double getDouble(int i) {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return this.f19612a.getDouble(i);
        }
        m2x.J(21, "Statement is recycled");
        throw null;
    }

    @Override // a.xpg0
    public final long getLong(int i) {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return this.f19612a.getLong(i);
        }
        m2x.J(21, "Statement is recycled");
        throw null;
    }

    @Override // a.xpg0
    public final void i(byte[] bArr, int i) {
        bArr.getClass();
        if (((Boolean) this.b.get()).booleanValue()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        this.f19612a.i(bArr, i);
    }

    @Override // a.xpg0
    public final boolean isNull(int i) {
        if (!((Boolean) this.b.get()).booleanValue()) {
            return this.f19612a.isNull(i);
        }
        m2x.J(21, "Statement is recycled");
        throw null;
    }

    @Override // a.xpg0
    public final void o(int i, long j) {
        if (((Boolean) this.b.get()).booleanValue()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        this.f19612a.o(i, j);
    }

    @Override // a.xpg0
    public final void p(double d, int i) {
        if (((Boolean) this.b.get()).booleanValue()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        this.f19612a.p(d, i);
    }

    @Override // a.xpg0
    public final void reset() {
        if (((Boolean) this.b.get()).booleanValue()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        this.f19612a.reset();
    }

    @Override // a.xpg0
    public final void s(int i) {
        if (((Boolean) this.b.get()).booleanValue()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        this.f19612a.s(i);
    }

    @Override // a.xpg0
    public final void t() {
        if (((Boolean) this.b.get()).booleanValue()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        this.f19612a.t();
    }

    @Override // a.xpg0
    public final void z(int i, String str) {
        str.getClass();
        if (((Boolean) this.b.get()).booleanValue()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        this.f19612a.z(i, str);
    }
}
