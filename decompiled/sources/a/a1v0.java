package a;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a1v0 implements fuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public huo f92a;
    public ncs0 b;
    public y0v0 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    /* JADX WARN: Code duplicated, block: B:67:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x020c  */
    /* JADX WARN: Code duplicated, block: B:78:0x020f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x0221  */
    /* JADX WARN: Code duplicated, block: B:85:0x0237  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0237, please report this as an issue */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        byte[] bArr;
        int i;
        int i2;
        byte[] bArr2;
        b1v0 b1v0Var;
        int iZ;
        int i3;
        this.b.getClass();
        String str = vtt0.f38024a;
        int i4 = this.c;
        if (i4 == 0) {
            x0x.K(guoVar.getPosition() == 0);
            int i5 = this.f;
            if (i5 != -1) {
                guoVar.m(i5);
                this.c = 4;
                return 0;
            }
            if (!ntr.X(guoVar)) {
                throw kq80.a("Unsupported or unrecognized wav file type.", null);
            }
            guoVar.m((int) (guoVar.i() - guoVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long jP = -1;
        if (i4 == 1) {
            fq80 fq80Var = new fq80(8);
            ejx ejxVarC = ejx.c(guoVar, fq80Var);
            if (ejxVarC.f7928a != 1685272116) {
                guoVar.g();
            } else {
                guoVar.j(8);
                fq80Var.M(0);
                guoVar.n(fq80Var.f9961a, 0, 8);
                jP = fq80Var.p();
                guoVar.m(((int) ejxVarC.b) + 8);
            }
            this.d = jP;
            this.c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    v4i0.e();
                    return 0;
                }
                x0x.K(this.g != -1);
                long position = this.g - guoVar.getPosition();
                y0v0 y0v0Var = this.e;
                y0v0Var.getClass();
                return y0v0Var.b(guoVar, position) ? -1 : 0;
            }
            guoVar.g();
            ejx ejxVarS0 = ntr.s0(1684108385, guoVar, new fq80(8));
            guoVar.m(8);
            Pair pairCreate = Pair.create(Long.valueOf(guoVar.getPosition()), Long.valueOf(ejxVarS0.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long length = guoVar.getLength();
            if (length != -1 && this.g > length) {
                f1t0.g0("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            y0v0 y0v0Var2 = this.e;
            y0v0Var2.getClass();
            y0v0Var2.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        fq80 fq80Var2 = new fq80(16);
        long j2 = ntr.s0(1718449184, guoVar, fq80Var2).b;
        x0x.K(j2 >= 16);
        guoVar.n(fq80Var2.f9961a, 0, 16);
        fq80Var2.M(0);
        int iS = fq80Var2.s();
        int iS2 = fq80Var2.s();
        int iR = fq80Var2.r();
        fq80Var2.r();
        int iS3 = fq80Var2.s();
        int iS4 = fq80Var2.s();
        int i6 = ((int) j2) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            guoVar.n(bArr, 0, i6);
            if (iS == 65534 && i6 == 24) {
                fq80 fq80Var3 = new fq80(bArr);
                fq80Var3.s();
                int iS5 = fq80Var3.s();
                if (iS5 != 0 && iS5 != iS4) {
                    throw kq80.e("validBits ( " + iS5 + ")  != bitsPerSample( " + iS4 + ") are not supported");
                }
                int iR2 = fq80Var3.r();
                if ((iR2 >> 18) != 0 || (iR2 != 0 && Integer.bitCount(iR2) != iS2)) {
                    throw kq80.e("Channel mask " + iR2 + " is invalid or does not match channel count " + iS2);
                }
                int iS6 = fq80Var3.s();
                byte[] bArr3 = new byte[14];
                fq80Var3.k(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, ntr.o) && !Arrays.equals(bArr3, ntr.p)) {
                    throw kq80.e("invalid wav format extension guid");
                }
                i2 = iR2;
                bArr2 = bArr;
                i = iS6;
            }
            guoVar.m((int) (guoVar.i() - guoVar.getPosition()));
            b1v0Var = new b1v0(i, iS2, iR, iS3, iS4, i2, bArr2);
            if (i == 17) {
                this.e = new x0v0(this.f92a, this.b, b1v0Var);
            } else if (i == 6) {
                this.e = new z0v0(this.f92a, this.b, b1v0Var, "audio/g711-alaw", -1);
            } else if (i == 7) {
                this.e = new z0v0(this.f92a, this.b, b1v0Var, "audio/g711-mlaw", -1);
            } else {
                if (i == 1) {
                    iZ = vtt0.z(iS4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iZ;
                } else if (i != 3) {
                    iZ = vtt0.x(iS4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iZ;
                } else if (i != 65534) {
                    i3 = 0;
                } else {
                    iZ = vtt0.z(iS4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iZ;
                }
                if (i3 != 0) {
                    throw kq80.e("Unsupported WAV format type: " + i);
                }
                this.e = new z0v0(this.f92a, this.b, b1v0Var, "audio/raw", i3);
            }
            this.c = 3;
            return 0;
        }
        bArr = vtt0.b;
        i = iS;
        i2 = 0;
        bArr2 = bArr;
        guoVar.m((int) (guoVar.i() - guoVar.getPosition()));
        b1v0Var = new b1v0(i, iS2, iR, iS3, iS4, i2, bArr2);
        if (i == 17) {
            this.e = new x0v0(this.f92a, this.b, b1v0Var);
        } else if (i == 6) {
            this.e = new z0v0(this.f92a, this.b, b1v0Var, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.e = new z0v0(this.f92a, this.b, b1v0Var, "audio/g711-mlaw", -1);
        } else {
            if (i == 1) {
                iZ = vtt0.z(iS4, ByteOrder.LITTLE_ENDIAN);
                i3 = iZ;
            } else if (i != 3) {
                iZ = vtt0.x(iS4, ByteOrder.LITTLE_ENDIAN);
                i3 = iZ;
            } else if (i != 65534) {
                i3 = 0;
            } else {
                iZ = vtt0.z(iS4, ByteOrder.LITTLE_ENDIAN);
                i3 = iZ;
            }
            if (i3 != 0) {
                throw kq80.e("Unsupported WAV format type: " + i);
            }
            this.e = new z0v0(this.f92a, this.b, b1v0Var, "audio/raw", i3);
        }
        this.c = 3;
        return 0;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        y0v0 y0v0Var = this.e;
        if (y0v0Var != null) {
            y0v0Var.c(j2);
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        return ntr.X(guoVar);
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.f92a = huoVar;
        this.b = huoVar.q(0, 1);
        huoVar.o();
    }

    @Override // a.fuo
    public final void release() {
    }
}
