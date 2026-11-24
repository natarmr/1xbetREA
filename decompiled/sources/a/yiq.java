package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class yiq implements fuo {
    public huo f;
    public ncs0 g;
    public ed40 i;
    public ajq j;
    public int k;
    public int l;
    public xiq m;
    public int n;
    public long o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f42706a = new byte[42];
    public final fq80 b = new fq80(new byte[32768], 0);
    public final boolean c = false;
    public final boolean d = false;
    public final mtc e = new mtc();
    public byte h = 0;

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        ajq ajqVar;
        fvh0 ca5Var;
        long j;
        long j2;
        boolean zQ;
        byte b = this.h;
        boolean z = this.d;
        boolean z2 = true;
        byte b2 = 0;
        if (b == 0) {
            boolean z3 = !this.c;
            guoVar.g();
            long jI = guoVar.i();
            ed40 ed40VarR = jeb.R(guoVar, z3, z);
            guoVar.m((int) (guoVar.i() - jI));
            this.i = ed40VarR;
            this.h = (byte) 1;
            return 0;
        }
        byte[] bArr = this.f42706a;
        if (b == 1) {
            guoVar.n(bArr, 0, bArr.length);
            guoVar.g();
            this.h = (byte) 2;
            return 0;
        }
        int i = 4;
        int i2 = 3;
        if (b == 2) {
            fq80 fq80Var = new fq80(4);
            guoVar.readFully(fq80Var.f9961a, 0, 4);
            if (fq80Var.B() != 1716281667) {
                throw kq80.a("Failed to read FLAC stream marker.", null);
            }
            this.h = (byte) 3;
            return 0;
        }
        int i3 = 7;
        int i4 = 6;
        if (b == 3) {
            int i5 = 0;
            ajq ajqVar2 = this.j;
            boolean z4 = false;
            while (!z4) {
                guoVar.g();
                byte[] bArr2 = new byte[i];
                q8b q8bVar = new q8b(bArr2, i);
                guoVar.n(bArr2, i5, i);
                boolean zF = q8bVar.f();
                int iG = q8bVar.g(i3);
                int iG2 = q8bVar.g(24) + i;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    guoVar.readFully(bArr3, i5, 38);
                    ajqVar2 = new ajq(bArr3, i);
                } else {
                    if (ajqVar2 == null) {
                        e9d0.o();
                        return 0;
                    }
                    ed40 ed40Var = ajqVar2.l;
                    if (iG == i2) {
                        fq80 fq80Var2 = new fq80(iG2);
                        guoVar.readFully(fq80Var2.f9961a, i5, iG2);
                        ajqVar = new ajq(ajqVar2.f989a, ajqVar2.b, ajqVar2.c, ajqVar2.d, ajqVar2.e, ajqVar2.g, ajqVar2.h, ajqVar2.j, jeb.S(fq80Var2), ajqVar2.l);
                    } else if (iG == i) {
                        fq80 fq80Var3 = new fq80(iG2);
                        guoVar.readFully(fq80Var3.f9961a, 0, iG2);
                        fq80Var3.N(i);
                        ed40 ed40VarA = kvu0.a(Arrays.asList((String[]) dnm0.p(fq80Var3, false, false).f14945a));
                        if (ed40Var != null) {
                            ed40VarA = ed40Var.b(ed40VarA);
                        }
                        ajqVar = new ajq(ajqVar2.f989a, ajqVar2.b, ajqVar2.c, ajqVar2.d, ajqVar2.e, ajqVar2.g, ajqVar2.h, ajqVar2.j, ajqVar2.k, ed40VarA);
                    } else if (iG != i4) {
                        guoVar.m(iG2);
                    } else if (z) {
                        guoVar.m(iG2);
                    } else {
                        fq80 fq80Var4 = new fq80(iG2);
                        guoVar.readFully(fq80Var4.f9961a, 0, iG2);
                        fq80Var4.N(4);
                        ed40 ed40Var2 = new ed40(b4x.t(nt90.d(fq80Var4)));
                        if (ed40Var != null) {
                            ed40Var2 = ed40Var.b(ed40Var2);
                        }
                        ajqVar = new ajq(ajqVar2.f989a, ajqVar2.b, ajqVar2.c, ajqVar2.d, ajqVar2.e, ajqVar2.g, ajqVar2.h, ajqVar2.j, ajqVar2.k, ed40Var2);
                    }
                    ajqVar2 = ajqVar;
                }
                String str = vtt0.f38024a;
                this.j = ajqVar2;
                z4 = zF;
                i = 4;
                i2 = 3;
                i3 = 7;
                i4 = 6;
                i5 = 0;
            }
            this.j.getClass();
            this.k = Math.max(this.j.c, 6);
            androidx.media3.common.b bVarC = this.j.c(bArr, this.i);
            ncs0 ncs0Var = this.g;
            String str2 = vtt0.f38024a;
            awq awqVarA = bVarC.a();
            awqVarA.n = mg40.n("audio/flac");
            ohs0.w(awqVarA, ncs0Var);
            this.g.f(this.j.b());
            this.h = (byte) 4;
            return 0;
        }
        long j3 = 0;
        if (b == 4) {
            guoVar.g();
            fq80 fq80Var5 = new fq80(2);
            guoVar.n(fq80Var5.f9961a, 0, 2);
            int iG3 = fq80Var5.G();
            if ((iG3 >> 2) != 16382) {
                guoVar.g();
                throw kq80.a("First frame does not start with sync code.", null);
            }
            guoVar.g();
            this.l = iG3;
            huo huoVar = this.f;
            String str3 = vtt0.f38024a;
            long position = guoVar.getPosition();
            long length = guoVar.getLength();
            this.j.getClass();
            ajq ajqVar3 = this.j;
            jtj jtjVar = ajqVar3.k;
            if (jtjVar != null && ((long[]) jtjVar.b).length > 0) {
                ca5Var = new ca5(ajqVar3, position, (byte) 1);
                b2 = 0;
            } else if (length == -1 || ajqVar3.j <= 0) {
                b2 = 0;
                ca5Var = new ca5(ajqVar3.b());
            } else {
                int i6 = this.l;
                int i7 = ajqVar3.c;
                viq viqVar = new viq(ajqVar3, b2);
                wiq wiqVar = new wiq(ajqVar3, i6);
                long jB = ajqVar3.b();
                long j4 = ajqVar3.j;
                int i8 = ajqVar3.d;
                if (i8 > 0) {
                    j = ((((long) i8) + ((long) i7)) / 2) + 1;
                } else {
                    int i9 = ajqVar3.f989a;
                    j = 64 + (((((i9 != ajqVar3.b || i9 <= 0) ? 4096L : i9) * ((long) ajqVar3.g)) * ((long) ajqVar3.h)) / 8);
                }
                xiq xiqVar = new xiq(viqVar, wiqVar, jB, j4, position, length, j, Math.max(6, i7));
                this.m = xiqVar;
                ca5Var = xiqVar.f40957a;
            }
            huoVar.f(ca5Var);
            this.h = (byte) 5;
            return b2;
        }
        if (b != 5) {
            v4i0.e();
            return 0;
        }
        this.g.getClass();
        this.j.getClass();
        xiq xiqVar2 = this.m;
        if (xiqVar2 != null && xiqVar2.c != null) {
            return xiqVar2.a(guoVar, mtcVar);
        }
        if (this.o == -1) {
            ajq ajqVar4 = this.j;
            guoVar.g();
            guoVar.j(1);
            byte[] bArr4 = new byte[1];
            guoVar.n(bArr4, 0, 1);
            boolean z5 = (bArr4[0] & 1) == 1;
            guoVar.j(2);
            i3 = z5 ? 7 : 6;
            fq80 fq80Var6 = new fq80(i3);
            byte[] bArr5 = fq80Var6.f9961a;
            int i10 = 0;
            while (i10 < i3) {
                int iL = guoVar.l(bArr5, i10, i3 - i10);
                if (iL == -1) {
                    break;
                }
                i10 += iL;
            }
            fq80Var6.L(i10);
            guoVar.g();
            try {
                long jH = fq80Var6.H();
                if (!z5) {
                    jH *= (long) ajqVar4.b;
                }
                long j5 = ajqVar4.j;
                if (j5 == 0 || jH <= j5) {
                    j3 = jH;
                } else {
                    z2 = false;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z2) {
                throw kq80.a(null, null);
            }
            this.o = j3;
        } else {
            fq80 fq80Var7 = this.b;
            int i11 = fq80Var7.c;
            if (i11 < 32768) {
                int i12 = guoVar.read(fq80Var7.f9961a, i11, 32768 - i11);
                z2 = i12 == -1;
                if (!z2) {
                    fq80Var7.L(i11 + i12);
                } else if (fq80Var7.a() == 0) {
                    long j6 = this.o * 1000000;
                    ajq ajqVar5 = this.j;
                    String str4 = vtt0.f38024a;
                    this.g.b(j6 / ((long) ajqVar5.e), 1, this.n, 0, null);
                    return -1;
                }
            } else {
                z2 = false;
            }
            int i13 = fq80Var7.b;
            int i14 = this.n;
            int i15 = this.k;
            if (i14 < i15) {
                fq80Var7.N(Math.min(i15 - i14, fq80Var7.a()));
            }
            this.j.getClass();
            int i16 = fq80Var7.b;
            while (true) {
                int i17 = fq80Var7.c - 16;
                mtc mtcVar2 = this.e;
                if (i16 > i17) {
                    if (z2) {
                        while (true) {
                            int i18 = fq80Var7.c;
                            if (i16 <= i18 - this.k) {
                                fq80Var7.M(i16);
                                try {
                                    zQ = ieb.Q(fq80Var7, this.j, this.l, mtcVar2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zQ = false;
                                }
                                if (fq80Var7.b > fq80Var7.c) {
                                    zQ = false;
                                }
                                if (zQ) {
                                    fq80Var7.M(i16);
                                    j2 = mtcVar2.f22363a;
                                    break;
                                }
                                i16++;
                            } else {
                                fq80Var7.M(i18);
                            }
                        }
                    } else {
                        fq80Var7.M(i16);
                    }
                    j2 = -1;
                    break;
                }
                fq80Var7.M(i16);
                if (ieb.Q(fq80Var7, this.j, this.l, mtcVar2)) {
                    fq80Var7.M(i16);
                    j2 = mtcVar2.f22363a;
                    break;
                }
                i16++;
            }
            int i19 = fq80Var7.b - i13;
            fq80Var7.M(i13);
            this.g.a(i19, fq80Var7);
            int i20 = this.n + i19;
            this.n = i20;
            if (j2 != -1) {
                long j7 = this.o * 1000000;
                ajq ajqVar6 = this.j;
                String str5 = vtt0.f38024a;
                this.g.b(j7 / ((long) ajqVar6.e), 1, i20, 0, null);
                this.n = 0;
                this.o = j2;
            }
            int length2 = fq80Var7.f9961a.length - fq80Var7.c;
            if (fq80Var7.a() < 16 && length2 < 16) {
                int iA = fq80Var7.a();
                byte[] bArr6 = fq80Var7.f9961a;
                System.arraycopy(bArr6, fq80Var7.b, bArr6, 0, iA);
                fq80Var7.M(0);
                fq80Var7.L(iA);
            }
        }
        return 0;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        if (j == 0) {
            this.h = (byte) 0;
        } else {
            xiq xiqVar = this.m;
            if (xiqVar != null) {
                xiqVar.d(j2);
            }
        }
        this.o = j2 != 0 ? -1L : 0L;
        this.n = 0;
        this.b.J(0);
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        jeb.R(guoVar, false, false);
        fq80 fq80Var = new fq80(4);
        ((guj) guoVar).b(fq80Var.f9961a, 0, 4, false);
        return fq80Var.B() == 1716281667;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.f = huoVar;
        this.g = huoVar.q(0, 1);
        huoVar.o();
    }

    @Override // a.fuo
    public final void release() {
    }
}
