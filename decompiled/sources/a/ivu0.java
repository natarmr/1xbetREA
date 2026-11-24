package a;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ivu0 extends orm0 {
    public fht0 n;
    public int o;
    public boolean p;
    public jvu0 q;
    public ikt0 r;

    @Override // a.orm0
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        jvu0 jvu0Var = this.q;
        this.o = jvu0Var != null ? jvu0Var.e : 0;
    }

    @Override // a.orm0
    public final long b(fq80 fq80Var) {
        if ((fq80Var.f9961a[0] & 1) == 1) {
            return -1L;
        }
        fht0 fht0Var = this.n;
        fht0Var.getClass();
        byte b = fq80Var.f9961a[0];
        jvu0 jvu0Var = (jvu0) fht0Var.f9559a;
        nqd[] nqdVarArr = (nqd[]) fht0Var.d;
        int i = nqdVarArr[(b >> 1) & (255 >>> (8 - dnm0.o(nqdVarArr.length - 1)))].b ? jvu0Var.f : jvu0Var.e;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = fq80Var.f9961a;
        int length = bArr.length;
        int i2 = fq80Var.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            fq80Var.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            fq80Var.L(i2);
        }
        byte[] bArr2 = fq80Var.f9961a;
        int i3 = fq80Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0388 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:157:0x038b  */
    @Override // a.orm0
    public final boolean c(fq80 fq80Var, long j, fck0 fck0Var) throws kq80 {
        fht0 fht0Var;
        if (this.n != null) {
            ((androidx.media3.common.b) fck0Var.b).getClass();
            return false;
        }
        jvu0 jvu0Var = this.q;
        int i = 4;
        if (jvu0Var != null) {
            ikt0 ikt0Var = this.r;
            if (ikt0Var == null) {
                this.r = dnm0.p(fq80Var, true, true);
            } else {
                int i2 = fq80Var.c;
                byte[] bArr = new byte[i2];
                System.arraycopy(fq80Var.f9961a, 0, bArr, 0, i2);
                short s = jvu0Var.f17221a;
                int i3 = 5;
                dnm0.s(5, fq80Var, false);
                int iZ = fq80Var.z() + 1;
                q8b q8bVar = new q8b(fq80Var.f9961a);
                int i4 = 8;
                q8bVar.o(fq80Var.b * 8);
                int i5 = 0;
                while (true) {
                    int i6 = 16;
                    if (i5 < iZ) {
                        int i7 = i4;
                        if (q8bVar.g(24) != 5653314) {
                            throw kq80.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((q8bVar.d * 8) + q8bVar.e), null);
                        }
                        int iG = q8bVar.g(16);
                        int iG2 = q8bVar.g(24);
                        if (q8bVar.f()) {
                            q8bVar.o(5);
                            for (int iG3 = 0; iG3 < iG2; iG3 += q8bVar.g(dnm0.o(iG2 - iG3))) {
                            }
                        } else {
                            boolean zF = q8bVar.f();
                            for (int i8 = 0; i8 < iG2; i8++) {
                                if (!zF) {
                                    q8bVar.o(5);
                                } else if (q8bVar.f()) {
                                    q8bVar.o(5);
                                }
                            }
                        }
                        int iG4 = q8bVar.g(i);
                        if (iG4 > 2) {
                            throw kq80.a("lookup type greater than 2 not decodable: " + iG4, null);
                        }
                        if (iG4 == 1 || iG4 == 2) {
                            q8bVar.o(32);
                            q8bVar.o(32);
                            int iG5 = q8bVar.g(i) + 1;
                            q8bVar.o(1);
                            q8bVar.o((int) ((iG4 == 1 ? iG != 0 ? (long) Math.floor(Math.pow(iG2, 1.0d / ((double) iG))) : 0L : ((long) iG2) * ((long) iG)) * ((long) iG5)));
                        }
                        i5++;
                        i4 = i7;
                        i = 4;
                    } else {
                        int i9 = i4;
                        int i10 = 6;
                        int iG6 = q8bVar.g(6) + 1;
                        for (int i11 = 0; i11 < iG6; i11++) {
                            if (q8bVar.g(16) != 0) {
                                throw kq80.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i12 = 1;
                        int iG7 = q8bVar.g(6) + 1;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iG7) {
                                int iG8 = q8bVar.g(i10) + 1;
                                int i15 = 0;
                                while (i15 < iG8) {
                                    if (q8bVar.g(16) > 2) {
                                        throw kq80.a("residueType greater than 2 is not decodable", null);
                                    }
                                    q8bVar.o(24);
                                    q8bVar.o(24);
                                    q8bVar.o(24);
                                    int iG9 = q8bVar.g(i10) + 1;
                                    int i16 = 8;
                                    q8bVar.o(8);
                                    int[] iArr = new int[iG9];
                                    for (int i17 = 0; i17 < iG9; i17++) {
                                        iArr[i17] = ((q8bVar.f() ? q8bVar.g(5) : 0) * 8) + q8bVar.g(3);
                                    }
                                    int i18 = 0;
                                    while (i18 < iG9) {
                                        int i19 = 0;
                                        while (i19 < i16) {
                                            if ((iArr[i18] & (1 << i19)) != 0) {
                                                q8bVar.o(i16);
                                            }
                                            i19++;
                                            i16 = 8;
                                        }
                                        i18++;
                                        i16 = 8;
                                    }
                                    i15++;
                                    i10 = 6;
                                }
                                int iG10 = q8bVar.g(i10) + 1;
                                for (int i20 = 0; i20 < iG10; i20++) {
                                    int iG11 = q8bVar.g(16);
                                    if (iG11 != 0) {
                                        f1t0.Q("VorbisUtil", "mapping type other than 0 not supported: " + iG11);
                                    } else {
                                        int iG12 = q8bVar.f() ? q8bVar.g(4) + 1 : 1;
                                        if (q8bVar.f()) {
                                            int iG13 = q8bVar.g(8) + 1;
                                            for (int i21 = 0; i21 < iG13; i21++) {
                                                int i22 = s - 1;
                                                q8bVar.o(dnm0.o(i22));
                                                q8bVar.o(dnm0.o(i22));
                                            }
                                        }
                                        if (q8bVar.g(2) != 0) {
                                            throw kq80.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iG12 > 1) {
                                            for (int i23 = 0; i23 < s; i23++) {
                                                q8bVar.o(4);
                                            }
                                        }
                                        for (int i24 = 0; i24 < iG12; i24++) {
                                            q8bVar.o(8);
                                            q8bVar.o(8);
                                            q8bVar.o(8);
                                        }
                                    }
                                }
                                int iG14 = q8bVar.g(6) + 1;
                                nqd[] nqdVarArr = new nqd[iG14];
                                for (int i25 = 0; i25 < iG14; i25++) {
                                    boolean zF2 = q8bVar.f();
                                    q8bVar.g(16);
                                    q8bVar.g(16);
                                    q8bVar.g(8);
                                    nqdVarArr[i25] = new nqd((byte) 8, zF2);
                                }
                                if (!q8bVar.f()) {
                                    throw kq80.a("framing bit after modes not set as expected", null);
                                }
                                fht0Var = new fht0(jvu0Var, ikt0Var, bArr, nqdVarArr);
                                break;
                            }
                            int iG15 = q8bVar.g(i6);
                            if (iG15 == 0) {
                                int i26 = i9;
                                q8bVar.o(i26);
                                q8bVar.o(16);
                                q8bVar.o(16);
                                q8bVar.o(6);
                                q8bVar.o(i26);
                                int iG16 = q8bVar.g(4) + 1;
                                int i27 = 0;
                                while (i27 < iG16) {
                                    q8bVar.o(i26);
                                    i27++;
                                    i26 = 8;
                                }
                            } else {
                                if (iG15 != i12) {
                                    throw kq80.a("floor type greater than 1 not decodable: " + iG15, null);
                                }
                                int iG17 = q8bVar.g(i3);
                                int[] iArr2 = new int[iG17];
                                int i28 = -1;
                                for (int i29 = 0; i29 < iG17; i29++) {
                                    int iG18 = q8bVar.g(4);
                                    iArr2[i29] = iG18;
                                    if (iG18 > i28) {
                                        i28 = iG18;
                                    }
                                }
                                int i30 = i28 + 1;
                                int[] iArr3 = new int[i30];
                                int i31 = 0;
                                while (i31 < i30) {
                                    iArr3[i31] = q8bVar.g(i14) + 1;
                                    int iG19 = q8bVar.g(2);
                                    int i32 = i9;
                                    if (iG19 > 0) {
                                        q8bVar.o(i32);
                                    }
                                    int i33 = i30;
                                    int i34 = 0;
                                    for (int i35 = 1; i34 < (i35 << iG19); i35 = 1) {
                                        q8bVar.o(i32);
                                        i34++;
                                        i32 = 8;
                                    }
                                    i31++;
                                    i30 = i33;
                                    i9 = 8;
                                    i14 = 3;
                                }
                                q8bVar.o(2);
                                int iG20 = q8bVar.g(4);
                                int i36 = 0;
                                int i37 = 0;
                                for (int i38 = 0; i38 < iG17; i38++) {
                                    i36 += iArr3[iArr2[i38]];
                                    while (i37 < i36) {
                                        q8bVar.o(iG20);
                                        i37++;
                                    }
                                }
                            }
                            i13++;
                            i9 = 8;
                            i10 = 6;
                            i12 = 1;
                            i6 = 16;
                            i3 = 5;
                        }
                    }
                }
            }
            this.n = fht0Var;
            if (fht0Var == null) {
                return true;
            }
            jvu0 jvu0Var2 = (jvu0) fht0Var.f9559a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(jvu0Var2.g);
            arrayList.add((byte[]) fht0Var.c);
            ed40 ed40VarA = kvu0.a(b4x.q((String[]) ((ikt0) fht0Var.b).f14945a));
            awq awqVar = new awq();
            awqVar.n = mg40.n("audio/ogg");
            awqVar.o = mg40.n("audio/vorbis");
            awqVar.i = jvu0Var2.d;
            awqVar.j = jvu0Var2.c;
            awqVar.I = jvu0Var2.f17221a;
            awqVar.K = jvu0Var2.b;
            awqVar.r = arrayList;
            awqVar.l = ed40VarA;
            fck0Var.b = new androidx.media3.common.b(awqVar);
            return true;
        }
        dnm0.s(1, fq80Var, false);
        fq80Var.r();
        int iZ2 = fq80Var.z();
        int iR = fq80Var.r();
        int iO = fq80Var.o();
        int i39 = iO <= 0 ? -1 : iO;
        int iO2 = fq80Var.o();
        int i40 = iO2 <= 0 ? -1 : iO2;
        fq80Var.o();
        int iZ3 = fq80Var.z();
        int iPow = (int) Math.pow(2.0d, iZ3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iZ3 & 240) >> 4);
        fq80Var.z();
        this.q = new jvu0(iZ2, iR, i39, i40, iPow, iPow2, Arrays.copyOf(fq80Var.f9961a, fq80Var.c));
        fht0Var = null;
        this.n = fht0Var;
        if (fht0Var == null) {
            return true;
        }
        jvu0 jvu0Var3 = (jvu0) fht0Var.f9559a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(jvu0Var3.g);
        arrayList2.add((byte[]) fht0Var.c);
        ed40 ed40VarA2 = kvu0.a(b4x.q((String[]) ((ikt0) fht0Var.b).f14945a));
        awq awqVar2 = new awq();
        awqVar2.n = mg40.n("audio/ogg");
        awqVar2.o = mg40.n("audio/vorbis");
        awqVar2.i = jvu0Var3.d;
        awqVar2.j = jvu0Var3.c;
        awqVar2.I = jvu0Var3.f17221a;
        awqVar2.K = jvu0Var3.b;
        awqVar2.r = arrayList2;
        awqVar2.l = ed40VarA2;
        fck0Var.b = new androidx.media3.common.b(awqVar2);
        return true;
    }

    @Override // a.orm0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
