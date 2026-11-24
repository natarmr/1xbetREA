package a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class xkn0 extends bln0 {
    public final /* synthetic */ byte e = 1;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkn0(w7r w7rVar, String str) {
        super(w7rVar, str, (byte) 0);
        str.getClass();
        this.f = w7rVar.e(str);
    }

    @Override // a.xpg0
    public boolean B0() {
        switch (this.e) {
            case 0:
                return ((ykn0) this.f).B0();
            default:
                return super.B0();
        }
    }

    @Override // a.xpg0
    public final String J0(int i) {
        switch (this.e) {
            case 0:
                return ((ykn0) this.f).J0(i);
            case 1:
                a();
                m2x.J(21, "no row");
                throw null;
            default:
                a();
                m2x.J(21, "no row");
                throw null;
        }
    }

    @Override // a.xpg0
    public final boolean W0() throws IllegalAccessException, InvocationTargetException {
        byte b = this.e;
        w7r w7rVar = this.b;
        Object obj = this.f;
        switch (b) {
            case 0:
                ykn0 ykn0Var = (ykn0) obj;
                boolean zW0 = ykn0Var.W0();
                if (ykn0Var.J0(0).equalsIgnoreCase("wal")) {
                    w7rVar.f38688a.enableWriteAheadLogging();
                } else {
                    w7rVar.f38688a.disableWriteAheadLogging();
                }
                return zW0;
            case 1:
                a();
                ((d8r) obj).c();
                return false;
            default:
                int iOrdinal = ((wkn0) obj).ordinal();
                if (iOrdinal == 0) {
                    w7rVar.r();
                    w7rVar.k();
                } else if (iOrdinal == 1) {
                    w7rVar.k();
                } else if (iOrdinal == 2) {
                    w7rVar.a();
                } else if (iOrdinal == 3) {
                    w7rVar.c();
                } else if (iOrdinal == 4) {
                    w7rVar.d();
                } else {
                    t9f.b();
                }
                return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((ykn0) obj).close();
                break;
            case 1:
                ((d8r) obj).close();
                this.d = true;
                break;
            default:
                this.d = true;
                break;
        }
    }

    @Override // a.xpg0
    public final byte[] getBlob(int i) {
        switch (this.e) {
            case 0:
                return ((ykn0) this.f).getBlob(i);
            case 1:
                a();
                m2x.J(21, "no row");
                throw null;
            default:
                a();
                m2x.J(21, "no row");
                throw null;
        }
    }

    @Override // a.xpg0
    public final int getColumnCount() {
        switch (this.e) {
            case 0:
                return ((ykn0) this.f).getColumnCount();
            case 1:
                a();
                return 0;
            default:
                a();
                return 0;
        }
    }

    @Override // a.xpg0
    public final String getColumnName(int i) {
        switch (this.e) {
            case 0:
                return ((ykn0) this.f).getColumnName(i);
            case 1:
                a();
                m2x.J(21, "no row");
                throw null;
            default:
                a();
                m2x.J(21, "no row");
                throw null;
        }
    }

    @Override // a.xpg0
    public final double getDouble(int i) {
        switch (this.e) {
            case 0:
                return ((ykn0) this.f).getDouble(i);
            case 1:
                a();
                m2x.J(21, "no row");
                throw null;
            default:
                a();
                m2x.J(21, "no row");
                throw null;
        }
    }

    @Override // a.xpg0
    public final long getLong(int i) {
        switch (this.e) {
            case 0:
                return ((ykn0) this.f).getLong(i);
            case 1:
                a();
                m2x.J(21, "no row");
                throw null;
            default:
                a();
                m2x.J(21, "no row");
                throw null;
        }
    }

    @Override // a.xpg0
    public final void i(byte[] bArr, int i) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                bArr.getClass();
                ((ykn0) obj).i(bArr, i);
                return;
            case 1:
                bArr.getClass();
                a();
                ((d8r) obj).i(bArr, i);
                return;
            default:
                bArr.getClass();
                a();
                m2x.J(25, "column index out of range");
                throw null;
        }
    }

    @Override // a.xpg0
    public final boolean isNull(int i) {
        switch (this.e) {
            case 0:
                return ((ykn0) this.f).isNull(i);
            case 1:
                a();
                m2x.J(21, "no row");
                throw null;
            default:
                a();
                m2x.J(21, "no row");
                throw null;
        }
    }

    @Override // a.xpg0
    public final void o(int i, long j) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((ykn0) obj).o(i, j);
                return;
            case 1:
                a();
                ((d8r) obj).o(i, j);
                return;
            default:
                a();
                m2x.J(25, "column index out of range");
                throw null;
        }
    }

    @Override // a.xpg0
    public final void p(double d, int i) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((ykn0) obj).p(d, i);
                return;
            case 1:
                a();
                ((d8r) obj).p(d, i);
                return;
            default:
                a();
                m2x.J(25, "column index out of range");
                throw null;
        }
    }

    @Override // a.bln0, a.xpg0
    public void reset() {
        switch (this.e) {
            case 0:
                ((ykn0) this.f).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // a.xpg0
    public final void s(int i) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((ykn0) obj).s(i);
                return;
            case 1:
                a();
                ((d8r) obj).s(i);
                return;
            default:
                a();
                m2x.J(25, "column index out of range");
                throw null;
        }
    }

    @Override // a.bln0, a.xpg0
    public void t() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((ykn0) obj).t();
                break;
            case 1:
                a();
                ((d8r) obj).t();
                break;
            default:
                super.t();
                break;
        }
    }

    @Override // a.xpg0
    public final void z(int i, String str) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                str.getClass();
                ((ykn0) obj).z(i, str);
                return;
            case 1:
                str.getClass();
                a();
                ((d8r) obj).r0(i, str);
                return;
            default:
                str.getClass();
                a();
                m2x.J(25, "column index out of range");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkn0(w7r w7rVar, String str, wkn0 wkn0Var) {
        super(w7rVar, str, (byte) 0);
        str.getClass();
        this.f = wkn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkn0(w7r w7rVar, String str, ykn0 ykn0Var) {
        super(w7rVar, str, (byte) 0);
        str.getClass();
        this.f = ykn0Var;
    }
}
