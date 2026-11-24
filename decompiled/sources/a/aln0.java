package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aln0 extends bln0 {
    public final d8r e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aln0(w7r w7rVar, String str) {
        super(w7rVar, str, (byte) 1);
        w7rVar.getClass();
        str.getClass();
        this.e = w7rVar.e(str);
    }

    @Override // a.xpg0
    public final String J0(int i) {
        a();
        m2x.J(21, "no row");
        throw null;
    }

    @Override // a.xpg0
    public final boolean W0() {
        a();
        this.e.c();
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
        this.d = true;
    }

    @Override // a.xpg0
    public final byte[] getBlob(int i) {
        a();
        m2x.J(21, "no row");
        throw null;
    }

    @Override // a.xpg0
    public final int getColumnCount() {
        a();
        return 0;
    }

    @Override // a.xpg0
    public final String getColumnName(int i) {
        a();
        m2x.J(21, "no row");
        throw null;
    }

    @Override // a.xpg0
    public final double getDouble(int i) {
        a();
        m2x.J(21, "no row");
        throw null;
    }

    @Override // a.xpg0
    public final long getLong(int i) {
        a();
        m2x.J(21, "no row");
        throw null;
    }

    @Override // a.xpg0
    public final void i(byte[] bArr, int i) {
        bArr.getClass();
        a();
        this.e.i(bArr, i);
    }

    @Override // a.xpg0
    public final boolean isNull(int i) {
        a();
        m2x.J(21, "no row");
        throw null;
    }

    @Override // a.xpg0
    public final void o(int i, long j) {
        a();
        this.e.o(i, j);
    }

    @Override // a.xpg0
    public final void p(double d, int i) {
        a();
        this.e.p(d, i);
    }

    @Override // a.xpg0
    public final void s(int i) {
        a();
        this.e.s(i);
    }

    @Override // a.bln0, a.xpg0
    public final void t() {
        a();
        this.e.t();
    }

    @Override // a.xpg0
    public final void z(int i, String str) {
        str.getClass();
        a();
        this.e.r0(i, str);
    }

    @Override // a.bln0, a.xpg0
    public final void reset() {
    }
}
