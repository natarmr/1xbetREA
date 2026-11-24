package a;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class zkk0 implements u34 {
    public float b;
    public float c;
    public q34 d;
    public q34 e;
    public q34 f;
    public q34 g;
    public boolean h;
    public ykk0 i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override // a.u34
    public final boolean a() {
        if (this.n) {
            ykk0 ykk0Var = this.i;
            if (ykk0Var != null) {
                x0x.K(ykk0Var.k >= 0);
                if (ykk0Var.i.q() * ykk0Var.k * ykk0Var.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // a.u34
    public final ByteBuffer b() {
        ykk0 ykk0Var = this.i;
        if (ykk0Var != null) {
            xkk0 xkk0Var = ykk0Var.i;
            int i = ykk0Var.b;
            x0x.K(ykk0Var.k >= 0);
            int iQ = xkk0Var.q() * ykk0Var.k * i;
            if (iQ > 0) {
                if (this.j.capacity() < iQ) {
                    this.j = ByteBuffer.allocateDirect(iQ).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                x0x.K(ykk0Var.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (xkk0Var.q() * i), ykk0Var.k);
                xkk0Var.b(iMin, byteBuffer);
                ykk0Var.k -= iMin;
                System.arraycopy(xkk0Var.n(), iMin * i, xkk0Var.n(), 0, ykk0Var.k * i);
                this.j.flip();
                this.m += (long) iQ;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = u34.f34978a;
        return byteBuffer2;
    }

    @Override // a.u34
    public final void c(s34 s34Var) {
        if (isActive()) {
            q34 q34Var = this.d;
            this.f = q34Var;
            q34 q34Var2 = this.e;
            this.g = q34Var2;
            if (this.h) {
                this.i = new ykk0(q34Var.f28032a, q34Var.b, this.b, this.c, q34Var2.f28032a, q34Var.c == 4);
            } else {
                ykk0 ykk0Var = this.i;
                if (ykk0Var != null) {
                    ykk0Var.j = 0;
                    ykk0Var.k = 0;
                    ykk0Var.l = 0;
                    ykk0Var.m = 0;
                    ykk0Var.n = 0;
                    ykk0Var.o = 0;
                    ykk0Var.p = 0;
                    ykk0Var.q = 0.0d;
                    ykk0Var.i.flush();
                }
            }
        }
        this.k = u34.f34978a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // a.u34
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ykk0 ykk0Var = this.i;
            ykk0Var.getClass();
            this.l += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = ykk0Var.b;
            xkk0 xkk0Var = ykk0Var.i;
            int iQ = iRemaining / (xkk0Var.q() * i);
            xkk0Var.i(iQ);
            xkk0Var.a(iRemaining, byteBuffer);
            ykk0Var.j += iQ;
            ykk0Var.b();
        }
    }

    @Override // a.u34
    public final void e() {
        ykk0 ykk0Var = this.i;
        if (ykk0Var != null) {
            int i = ykk0Var.j;
            float f = ykk0Var.c;
            float f2 = ykk0Var.d;
            double d = f / f2;
            double d2 = ykk0Var.e * f2;
            int i2 = ykk0Var.o;
            int i3 = ykk0Var.k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + ykk0Var.q) + ((double) ykk0Var.l)) / d2) + 0.5d));
            ykk0Var.q = 0.0d;
            xkk0 xkk0Var = ykk0Var.i;
            int i4 = ykk0Var.h * 2;
            xkk0Var.i(i4 + i);
            xkk0Var.c(i * ykk0Var.b, i4);
            ykk0Var.j = i4 + ykk0Var.j;
            ykk0Var.b();
            if (ykk0Var.k > i3) {
                ykk0Var.k = Math.max(i3, 0);
            }
            ykk0Var.j = 0;
            ykk0Var.o = 0;
            ykk0Var.l = 0;
        }
        this.n = true;
    }

    @Override // a.u34
    public final q34 f(q34 q34Var) throws t34 {
        int i = q34Var.c;
        if (i != 2 && i != 4) {
            throw new t34(q34Var);
        }
        int i2 = q34Var.f28032a;
        this.d = q34Var;
        q34 q34Var2 = new q34(i2, q34Var.b, i);
        this.e = q34Var2;
        this.h = true;
        return q34Var2;
    }

    @Override // a.u34
    public final long g(long j) {
        if (this.m < 1024) {
            return (long) (j / ((double) this.b));
        }
        long j2 = this.l;
        ykk0 ykk0Var = this.i;
        ykk0Var.getClass();
        long jQ = j2 - ((long) (ykk0Var.i.q() * (ykk0Var.j * ykk0Var.b)));
        int i = this.g.f28032a;
        int i2 = this.f.f28032a;
        long j3 = this.m;
        return i == i2 ? vtt0.T(j, j3, jQ, RoundingMode.DOWN) : vtt0.T(j, j3 * ((long) i2), jQ * ((long) i), RoundingMode.DOWN);
    }

    @Override // a.u34
    public final boolean isActive() {
        if (this.e.f28032a != -1) {
            return Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.f28032a != this.d.f28032a;
        }
        return false;
    }

    @Override // a.u34
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        q34 q34Var = q34.e;
        this.d = q34Var;
        this.e = q34Var;
        this.f = q34Var;
        this.g = q34Var;
        ByteBuffer byteBuffer = u34.f34978a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
