package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ors0 extends rv5 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // a.rv5, a.u34
    public final boolean a() {
        return super.a() && this.n == 0;
    }

    @Override // a.rv5, a.u34
    public final ByteBuffer b() {
        int i;
        if (super.a() && (i = this.n) > 0) {
            l(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // a.u34
    public final void d(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferL = l(length);
        int i3 = vtt0.i(length, 0, this.n);
        byteBufferL.put(this.m, 0, i3);
        int i4 = vtt0.i(length - i3, 0, i2);
        byteBuffer.limit(byteBuffer.position() + i4);
        byteBufferL.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i5 = i2 - i4;
        int i6 = this.n - i3;
        this.n = i6;
        byte[] bArr = this.m;
        System.arraycopy(bArr, i3, bArr, 0, i6);
        byteBuffer.get(this.m, this.n, i5);
        this.n += i5;
        byteBufferL.flip();
    }

    @Override // a.u34
    public final long g(long j) {
        return Math.max(0L, j - vtt0.R(this.b.f28032a, this.j + this.i));
    }

    @Override // a.rv5
    public final q34 h(q34 q34Var) throws t34 {
        if (!vtt0.I(q34Var.c)) {
            throw new t34(q34Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? q34.e : q34Var;
    }

    @Override // a.rv5
    public final void i() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // a.rv5
    public final void j() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // a.rv5
    public final void k() {
        this.m = vtt0.b;
    }
}
