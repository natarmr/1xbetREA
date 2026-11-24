package a;

import android.javax.sip.message.Response;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class hbn implements trn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f12776a;
    public final String c;
    public final int d;
    public String e;
    public ncs0 f;
    public int h;
    public int i;
    public int j;
    public long k;
    public androidx.media3.common.b l;
    public int m;
    public int n;
    public int o;
    public boolean r;
    public boolean u;
    public boolean v;
    public byte g = 0;
    public long s = -9223372036854775807L;
    public long t = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int p = -1;
    public int q = -1;

    public hbn(String str, int i, int i2) {
        this.f12776a = new fq80(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // a.trn
    public final void a(fq80 fq80Var) throws kq80 {
        int i;
        byte b;
        int i2;
        byte b2;
        int iG;
        int i3;
        int i4;
        this.f.getClass();
        while (fq80Var.a() > 0) {
            byte b3 = this.g;
            long jT = -9223372036854775807L;
            fq80 fq80Var2 = this.f12776a;
            switch (b3) {
                case 0:
                    while (fq80Var.a() > 0) {
                        int i5 = this.j << 8;
                        this.j = i5;
                        int iZ = i5 | fq80Var.z();
                        this.j = iZ;
                        int I = hew0.I(iZ);
                        this.o = I;
                        if (I != 0) {
                            h(this.j);
                            this.j = 0;
                            if (!this.v || this.o != 2) {
                                int i6 = this.o;
                                if (i6 == 1) {
                                    this.v = false;
                                }
                                if (i6 != 3 && i6 != 4) {
                                    if (i6 == 1) {
                                        this.g = (byte) 1;
                                    } else {
                                        this.g = (byte) 2;
                                    }
                                }
                                this.g = (byte) 4;
                            }
                            this.h = 0;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (b(fq80Var, fq80Var2.f9961a, 18)) {
                        this.u = true;
                        byte[] bArr = fq80Var2.f9961a;
                        if (this.l == null) {
                            String str = this.e;
                            q8b q8bVarM = hew0.M(bArr);
                            q8bVarM.o(60);
                            int i7 = hew0.k[q8bVarM.g(6)];
                            int i8 = hew0.l[q8bVarM.g(4)];
                            int iG2 = q8bVarM.g(5);
                            int i9 = iG2 >= 29 ? -1 : (hew0.m[iG2] * 1000) / 2;
                            q8bVarM.o(10);
                            int i10 = i7 + (q8bVarM.g(2) > 0 ? 1 : 0);
                            awq awqVar = new awq();
                            awqVar.f1587a = str;
                            awqVar.n = mg40.n("video/mp2t");
                            awqVar.o = mg40.n("audio/vnd.dts");
                            awqVar.i = i9;
                            awqVar.I = i10;
                            awqVar.K = i8;
                            awqVar.s = null;
                            awqVar.d = this.c;
                            awqVar.f = this.d;
                            this.l = new androidx.media3.common.b(awqVar);
                            this.r = true;
                        }
                        this.m = hew0.H(bArr);
                        byte b4 = bArr[0];
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i = (bArr[4] & 7) << 4;
                                b2 = bArr[7];
                            } else if (b4 != 31) {
                                i = (bArr[4] & 1) << 6;
                                b = bArr[5];
                            } else {
                                i = (bArr[r3] & 7) << 4;
                                b2 = bArr[6];
                            }
                            i2 = b2 & 60;
                            this.k = n6x.s(vtt0.R(this.l.L, (((i2 >> 2) | i) + 1) * 32));
                            fq80Var2.M(0);
                            this.f.a(18, fq80Var2);
                            this.g = (byte) 6;
                        } else {
                            i = (bArr[r3] & 1) << 6;
                            b = bArr[4];
                        }
                        i2 = b & 252;
                        this.k = n6x.s(vtt0.R(this.l.L, (((i2 >> 2) | i) + 1) * 32));
                        fq80Var2.M(0);
                        this.f.a(18, fq80Var2);
                        this.g = (byte) 6;
                        break;
                    }
                    break;
                case 2:
                    if (b(fq80Var, fq80Var2.f9961a, 7)) {
                        q8b q8bVarM2 = hew0.M(fq80Var2.f9961a);
                        q8bVarM2.o(42);
                        this.p = q8bVarM2.g(q8bVarM2.f() ? 12 : 8) + 1;
                        this.g = (byte) 3;
                    }
                    break;
                case 3:
                    if (b(fq80Var, fq80Var2.f9961a, this.p)) {
                        ibn ibnVarQ = hew0.Q(fq80Var2.f9961a);
                        i(ibnVarQ);
                        this.m = ibnVarQ.d;
                        long j = ibnVarQ.e;
                        if (j != -9223372036854775807L) {
                            this.k = j;
                        }
                        fq80Var2.M(0);
                        this.f.a(this.p, fq80Var2);
                        this.g = (byte) 6;
                    }
                    break;
                case 4:
                    if (b(fq80Var, fq80Var2.f9961a, 6)) {
                        q8b q8bVarM3 = hew0.M(fq80Var2.f9961a);
                        q8bVarM3.o(32);
                        int iS = hew0.S(q8bVarM3, hew0.s) + 1;
                        this.q = iS;
                        int i11 = this.h;
                        if (i11 > iS) {
                            int i12 = i11 - iS;
                            this.h = i11 - i12;
                            fq80Var.M(fq80Var.b - i12);
                        }
                        this.g = (byte) 5;
                    }
                    break;
                case 5:
                    if (b(fq80Var, fq80Var2.f9961a, this.q)) {
                        byte[] bArr2 = fq80Var2.f9961a;
                        q8b q8bVarM4 = hew0.M(bArr2);
                        int i13 = q8bVarM4.g(32) == 1078008818 ? 1 : 0;
                        int iS2 = hew0.S(q8bVarM4, hew0.o);
                        int i14 = iS2 + 1;
                        if (i13 == 0) {
                            iG = -2147483647;
                        } else {
                            if (!q8bVarM4.f()) {
                                throw kq80.e("Only supports full channel mask-based audio presentation");
                            }
                            int i15 = iS2 - 1;
                            int i16 = (bArr2[iS2] & 255) | ((bArr2[i15] << 8) & 65535);
                            String str2 = vtt0.f38024a;
                            int i17 = 65535;
                            for (int i18 = 0; i18 < i15; i18++) {
                                byte b5 = bArr2[i18];
                                int i19 = (((b5 & 255) >> 4) ^ ((i17 >> 12) & 255)) & 255;
                                int i20 = (i17 << 4) & 65535;
                                int[] iArr = vtt0.i;
                                int i21 = (iArr[i19] ^ i20) & 65535;
                                i17 = (((i21 << 4) & 65535) ^ iArr[((b5 & 15) ^ ((i21 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i16 != i17) {
                                throw kq80.a("CRC check failed", null);
                            }
                            int iG3 = q8bVarM4.g(2);
                            if (iG3 == 0) {
                                i3 = 512;
                            } else if (iG3 == 1) {
                                i3 = Response.TEMPORARILY_UNAVAILABLE;
                            } else {
                                if (iG3 != 2) {
                                    throw kq80.a("Unsupported base duration index in DTS UHD header: " + iG3, null);
                                }
                                i3 = 384;
                            }
                            int iG4 = (q8bVarM4.g(3) + 1) * i3;
                            int iG5 = q8bVarM4.g(2);
                            if (iG5 == 0) {
                                i4 = 32000;
                            } else if (iG5 == 1) {
                                i4 = 44100;
                            } else {
                                if (iG5 != 2) {
                                    throw kq80.a("Unsupported clock rate index in DTS UHD header: " + iG5, null);
                                }
                                i4 = 48000;
                            }
                            if (q8bVarM4.f()) {
                                q8bVarM4.o(36);
                            }
                            iG = (1 << q8bVarM4.g(2)) * i4;
                            jT = vtt0.T(iG4, 1000000L, i4, RoundingMode.DOWN);
                        }
                        int i22 = iG;
                        int iS3 = 0;
                        for (int i23 = 0; i23 < i13; i23++) {
                            iS3 += hew0.S(q8bVarM4, hew0.p);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i13 != 0) {
                            atomicInteger.set(hew0.S(q8bVarM4, hew0.q));
                        }
                        int iS4 = iS3 + (atomicInteger.get() != 0 ? hew0.S(q8bVarM4, hew0.r) : 0) + i14;
                        ibn ibnVar = new ibn(2, i22, iS4, jT, "audio/vnd.dts.uhd;profile=p2");
                        if (this.o == 3) {
                            i(ibnVar);
                        }
                        this.m = iS4;
                        if (jT == -9223372036854775807) {
                            jT = 0;
                        }
                        this.k = jT;
                        fq80Var2.M(0);
                        this.f.a(this.q, fq80Var2);
                        this.g = (byte) 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(fq80Var.a(), this.m - this.h);
                    this.f.a(iMin, fq80Var);
                    int i24 = this.h + iMin;
                    this.h = i24;
                    int i25 = this.m;
                    if (i24 == i25) {
                        if (this.o == 1) {
                            this.n = i25;
                            this.h = 0;
                            this.i = 0;
                            this.g = (byte) 7;
                        } else {
                            x0x.K(this.s != -9223372036854775807L);
                            int i26 = this.m;
                            int i27 = this.o;
                            int i28 = i26 + (i27 == 2 ? this.n : 0);
                            long j2 = this.s;
                            this.f.b(j2, i27 == 4 ? 0 : 1, i28, 0, null);
                            this.s += this.k;
                            long j3 = this.t;
                            if (j3 != -9223372036854775807L) {
                                if (j3 != j2) {
                                    this.s = j3;
                                }
                                this.t = -9223372036854775807L;
                            }
                            this.n = 0;
                            this.g = (byte) 0;
                        }
                    }
                    break;
                case 7:
                    while (fq80Var.a() > 0 && this.h < 4) {
                        int i29 = this.i << 8;
                        this.i = i29;
                        this.i = i29 | fq80Var.z();
                        this.h++;
                    }
                    if (this.h == 4) {
                        if (hew0.I(this.i) == 2) {
                            h(this.i);
                            this.o = 2;
                            this.i = 0;
                            this.g = (byte) 2;
                        } else {
                            if (this.r) {
                                ncs0 ncs0Var = this.f;
                                androidx.media3.common.b bVar = this.l;
                                bVar.getClass();
                                ncs0Var.c(bVar);
                                this.r = false;
                            }
                            x0x.K(this.s != -9223372036854775807L);
                            long j4 = this.s;
                            this.f.b(j4, 1, this.n, 0, null);
                            this.s += this.k;
                            long j5 = this.t;
                            if (j5 != -9223372036854775807L) {
                                if (j5 != j4) {
                                    this.s = j5;
                                }
                                this.t = -9223372036854775807L;
                            }
                            this.n = 0;
                            int i30 = this.i;
                            this.j = i30;
                            this.i = 0;
                            int I2 = hew0.I(i30);
                            this.o = I2;
                            if (I2 == 3 || I2 == 4) {
                                h(this.j);
                                this.j = 0;
                                this.g = (byte) 4;
                            } else if (I2 == 1) {
                                h(this.j);
                                this.j = 0;
                                this.g = (byte) 1;
                            } else {
                                this.h = 0;
                                this.g = (byte) 0;
                            }
                        }
                    }
                    break;
                default:
                    v4i0.e();
                    return;
            }
        }
    }

    public final boolean b(fq80 fq80Var, byte[] bArr, int i) {
        int iMin = Math.min(fq80Var.a(), i - this.h);
        fq80Var.k(bArr, this.h, iMin);
        int i2 = this.h + iMin;
        this.h = i2;
        return i2 == i;
    }

    @Override // a.trn
    public final void c() {
        this.g = (byte) 0;
        this.h = 0;
        this.j = 0;
        this.i = 0;
        this.n = 0;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.b.set(0);
        this.r = false;
        this.v = this.u;
    }

    @Override // a.trn
    public final void d() {
        if (this.g == 7) {
            this.f.getClass();
            if (this.r) {
                ncs0 ncs0Var = this.f;
                androidx.media3.common.b bVar = this.l;
                bVar.getClass();
                ncs0Var.c(bVar);
                this.r = false;
            }
            long j = this.s;
            if (j != -9223372036854775807L) {
                this.f.b(j, 1, this.n, 0, null);
                this.s += this.k;
            }
            this.n = 0;
            this.h = 0;
            this.j = 0;
            this.i = 0;
            this.g = (byte) 0;
        }
    }

    @Override // a.trn
    public final void e(huo huoVar, zrs0 zrs0Var) {
        zrs0Var.a();
        zrs0Var.b();
        this.e = zrs0Var.e;
        zrs0Var.b();
        this.f = huoVar.q(zrs0Var.d, 1);
    }

    @Override // a.trn
    public final void g(int i, long j) {
        if (j != -9223372036854775807L) {
            if (this.g != 0) {
                this.t = j;
            } else {
                this.s = j;
                this.t = -9223372036854775807L;
            }
        }
    }

    public final void h(int i) {
        byte[] bArr = this.f12776a.f9961a;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.h = 4;
    }

    public final void i(ibn ibnVar) {
        int i = ibnVar.b;
        int i2 = ibnVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        String str = ibnVar.f14496a;
        if (str == null) {
            androidx.media3.common.b bVar = this.l;
            str = bVar != null ? bVar.p : null;
        }
        androidx.media3.common.b bVar2 = this.l;
        if (bVar2 != null && !this.r && i2 == bVar2.J && i == bVar2.L && Objects.equals(str, bVar2.p)) {
            return;
        }
        androidx.media3.common.b bVar3 = this.l;
        awq awqVar = bVar3 == null ? new awq() : bVar3.a();
        awqVar.f1587a = this.e;
        awqVar.n = mg40.n("video/mp2t");
        awqVar.o = mg40.n(str);
        awqVar.I = i2;
        awqVar.K = i;
        awqVar.d = this.c;
        awqVar.f = this.d;
        androidx.media3.common.b bVar4 = new androidx.media3.common.b(awqVar);
        this.l = bVar4;
        this.f.c(bVar4);
        this.r = false;
    }
}
