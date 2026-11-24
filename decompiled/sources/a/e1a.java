package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class e1a extends j16 {
    public final wkj t;
    public final fq80 u;
    public d1a v;
    public long w;

    public e1a() {
        super(6);
        this.t = new wkj(1);
        this.u = new fq80();
    }

    @Override // a.j16, a.x8a0
    public final void c(int i, Object obj) {
        if (i == 8) {
            this.v = (d1a) obj;
        }
    }

    @Override // a.j16
    public final void p() {
        d1a d1aVar = this.v;
        if (d1aVar != null) {
            d1aVar.b();
        }
    }

    @Override // a.j16
    public final void r(long j, boolean z, boolean z2) {
        this.w = Long.MIN_VALUE;
        d1a d1aVar = this.v;
        if (d1aVar != null) {
            d1aVar.b();
        }
    }

    @Override // a.j16
    public final void z(long j, long j2) {
        float[] fArr;
        while (!l() && this.w < 100000 + j) {
            wkj wkjVar = this.t;
            wkjVar.v();
            hsj hsjVar = this.c;
            hsjVar.e();
            if (y(hsjVar, wkjVar, 0) != -4 || wkjVar.m(4)) {
                return;
            }
            long j3 = wkjVar.i;
            this.w = j3;
            boolean z = j3 < this.l;
            if (this.v != null && !z) {
                wkjVar.y();
                ByteBuffer byteBuffer = wkjVar.g;
                String str = vtt0.f38024a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    fq80 fq80Var = this.u;
                    fq80Var.K(bArrArray, iLimit);
                    fq80Var.M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(fq80Var.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.v.a(this.w - this.k, fArr);
                }
            }
        }
    }
}
