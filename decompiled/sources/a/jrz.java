package a;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jrz extends owq {
    public final long b;
    public final boolean c;
    public long d;

    public jrz(emk0 emk0Var, long j, boolean z) {
        super(emk0Var);
        this.b = j;
        this.c = z;
        if (j >= 0) {
            return;
        }
        c99.s(h97.h(j, "byteCount < 0: "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // a.owq, a.emk0
    public final long Y(f99 f99Var, long j) throws IOException {
        long jY;
        long j2;
        f99Var.getClass();
        long j3 = this.d;
        long j4 = this.b;
        long j5 = j4 - j3;
        if (j5 < 0) {
            StringBuilder sbQ = kng0.q(j4, "expected ", " bytes but got ");
            sbQ.append(this.d);
            throw new IOException(sbQ.toString());
        }
        if (this.c) {
            j5++;
            if (j <= j5) {
                j5 = j;
            }
            jY = this.f25976a.Y(f99Var, j5);
            if (jY == -1) {
                long j6 = this.d + jY;
                this.d = j6;
                j2 = j6 - j4;
                if (j2 <= 0) {
                    return jY;
                }
                long j7 = f99Var.b - j2;
                f99 f99Var2 = new f99();
                f99Var2.P(f99Var);
                f99Var.F0(f99Var2, j7);
                f99Var2.a();
                StringBuilder sbQ2 = kng0.q(j4, "expected ", " bytes but got ");
                sbQ2.append(this.d);
                throw new IOException(sbQ2.toString());
            }
            if (j5 != 0) {
                StringBuilder sbQ3 = kng0.q(j4, "expected ", " bytes but got ");
                sbQ3.append(this.d);
                throw new EOFException(sbQ3.toString());
            }
        } else if (j5 != 0) {
            if (j <= j5) {
                j5 = j;
            }
            jY = this.f25976a.Y(f99Var, j5);
            if (jY == -1) {
                long j8 = this.d + jY;
                this.d = j8;
                j2 = j8 - j4;
                if (j2 <= 0) {
                    return jY;
                }
                long j9 = f99Var.b - j2;
                f99 f99Var3 = new f99();
                f99Var3.P(f99Var);
                f99Var.F0(f99Var3, j9);
                f99Var3.a();
                StringBuilder sbQ4 = kng0.q(j4, "expected ", " bytes but got ");
                sbQ4.append(this.d);
                throw new IOException(sbQ4.toString());
            }
            if (j5 != 0) {
                StringBuilder sbQ5 = kng0.q(j4, "expected ", " bytes but got ");
                sbQ5.append(this.d);
                throw new EOFException(sbQ5.toString());
            }
        }
        return -1L;
    }
}
