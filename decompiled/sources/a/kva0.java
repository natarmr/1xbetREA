package a;

/* JADX INFO: loaded from: classes.dex */
public final class kva0 implements xpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xpg0 f18949a;
    public final long b;
    public final /* synthetic */ yva0 c;

    public kva0(yva0 yva0Var, xpg0 xpg0Var) {
        xpg0Var.getClass();
        this.c = yva0Var;
        this.f18949a = xpg0Var;
        this.b = icq0.a();
    }

    @Override // a.xpg0
    public final String J0(int i) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            return this.f18949a.J0(i);
        }
        m2x.J(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // a.xpg0
    public final boolean W0() {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            return this.f18949a.W0();
        }
        m2x.J(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            this.f18949a.close();
        } else {
            m2x.J(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // a.xpg0
    public final byte[] getBlob(int i) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            return this.f18949a.getBlob(i);
        }
        m2x.J(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // a.xpg0
    public final int getColumnCount() {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            return this.f18949a.getColumnCount();
        }
        m2x.J(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // a.xpg0
    public final String getColumnName(int i) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            return this.f18949a.getColumnName(i);
        }
        m2x.J(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // a.xpg0
    public final double getDouble(int i) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            return this.f18949a.getDouble(i);
        }
        m2x.J(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // a.xpg0
    public final long getLong(int i) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            return this.f18949a.getLong(i);
        }
        m2x.J(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // a.xpg0
    public final void i(byte[] bArr, int i) {
        bArr.getClass();
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            this.f18949a.i(bArr, i);
        } else {
            m2x.J(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // a.xpg0
    public final boolean isNull(int i) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            return this.f18949a.isNull(i);
        }
        m2x.J(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // a.xpg0
    public final void o(int i, long j) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            this.f18949a.o(i, j);
        } else {
            m2x.J(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // a.xpg0
    public final void p(double d, int i) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            this.f18949a.p(d, i);
        } else {
            m2x.J(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // a.xpg0
    public final void reset() {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            this.f18949a.reset();
        } else {
            m2x.J(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // a.xpg0
    public final void s(int i) {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            this.f18949a.s(i);
        } else {
            m2x.J(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // a.xpg0
    public final void t() {
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            this.f18949a.t();
        } else {
            m2x.J(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // a.xpg0
    public final void z(int i, String str) {
        str.getClass();
        if (this.c.d.get()) {
            m2x.J(21, "Statement is recycled");
            throw null;
        }
        if (this.b == icq0.a()) {
            this.f18949a.z(i, str);
        } else {
            m2x.J(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
