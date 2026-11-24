package a;

import android.gov.nist.core.Separators;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class iv40 implements fuo {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public huo F;
    public hv40[] G;
    public long[][] H;
    public int I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jfn0 f15428a;
    public final int b;
    public final boolean c;
    public final fq80 d;
    public final fq80 e;
    public final fq80 f;
    public final fq80 g;
    public final ArrayDeque h;
    public final tvh0 i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public rcf0 m;
    public int n;
    public int o;
    public long p;
    public int q;
    public fq80 r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public iv40(jfn0 jfn0Var, int i) {
        this.f15428a = jfn0Var;
        this.b = i;
        this.c = (i & 256) != 0;
        v3x v3xVar = b4x.b;
        this.m = rcf0.e;
        this.n = (i & 4) != 0 ? 3 : 0;
        this.i = new tvh0();
        this.j = new ArrayList();
        this.g = new fq80(16);
        this.h = new ArrayDeque();
        this.d = new fq80(ntr.j);
        this.e = new fq80(6);
        this.f = new fq80();
        this.s = -1;
        this.F = huo.f0;
        this.G = new hv40[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:234:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:235:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:342:0x0715  */
    /* JADX WARN: Code duplicated, block: B:343:0x0721  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01de  */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        long j;
        boolean zEquals;
        char c;
        int i;
        int iJ0;
        int i2;
        long j2;
        long j3;
        long position;
        long j4;
        fq80 fq80Var;
        char c2;
        hv40[] hv40VarArr;
        int i3;
        cd40 cd40Var;
        boolean z;
        boolean z2;
        ev40 ev40Var;
        if (!this.c || !this.B) {
            while (true) {
                int i4 = this.n;
                ArrayDeque arrayDeque = this.h;
                fq80 fq80Var2 = this.f;
                int i5 = 0;
                boolean z3 = true;
                if (i4 != 0) {
                    int i6 = 4;
                    if (i4 == 1) {
                        long j5 = this.p - ((long) this.q);
                        long position2 = guoVar.getPosition() + j5;
                        fq80 fq80Var3 = this.r;
                        if (fq80Var3 == null) {
                            if (!this.x && this.o == 1835295092) {
                                this.I = 1;
                            }
                            if (j5 < 262144) {
                                guoVar.m((int) j5);
                            } else {
                                mtcVar.f22363a = guoVar.getPosition() + j5;
                                z = true;
                            }
                            g(position2);
                            i2 = 1;
                            if (this.y) {
                                this.A = true;
                                mtcVar.f22363a = this.z;
                                this.y = false;
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (z2 && this.n != 2) {
                                break;
                            }
                        } else {
                            guoVar.readFully(fq80Var3.f9961a, this.q, (int) j5);
                            if (this.o == 1718909296) {
                                this.x = true;
                                fq80Var3.M(8);
                                int i7 = fq80Var3.m() != 1903435808 ? 0 : 1;
                                if (i7 == 0) {
                                    fq80Var3.N(4);
                                    do {
                                        if (fq80Var3.a() <= 0) {
                                            i7 = 0;
                                            break;
                                        }
                                        i7 = fq80Var3.m() != 1903435808 ? 0 : 1;
                                    } while (i7 == 0);
                                }
                                this.I = i7;
                            } else if (!arrayDeque.isEmpty()) {
                                ((ev40) arrayDeque.peek()).f.add(new fv40(this.o, fq80Var3));
                            }
                        }
                        z = false;
                        g(position2);
                        i2 = 1;
                        if (this.y) {
                            this.A = true;
                            mtcVar.f22363a = this.z;
                            this.y = false;
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            continue;
                        }
                    } else {
                        if (i4 == 2) {
                            long position3 = guoVar.getPosition();
                            int i8 = this.s;
                            if (i8 == -1) {
                                long jMin = Long.MAX_VALUE;
                                boolean z4 = true;
                                boolean z5 = true;
                                int i9 = 0;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                long j6 = Long.MAX_VALUE;
                                long j7 = Long.MAX_VALUE;
                                long j8 = Long.MAX_VALUE;
                                long j9 = Long.MAX_VALUE;
                                while (true) {
                                    hv40[] hv40VarArr2 = this.G;
                                    j = position3;
                                    if (i9 >= hv40VarArr2.length) {
                                        break;
                                    }
                                    hv40 hv40Var = hv40VarArr2[i9];
                                    int i13 = hv40Var.g;
                                    ocs0 ocs0Var = hv40Var.b;
                                    boolean z6 = z4;
                                    if (i13 == ocs0Var.b) {
                                        z4 = z6;
                                    } else {
                                        int i14 = i11;
                                        int i15 = i12;
                                        long j10 = ocs0Var.f[i13];
                                        if (hv40Var.e) {
                                            jMin = Math.min(jMin, j10);
                                        } else if (hv40Var.f && j10 < j6) {
                                            i10 = i9;
                                            j6 = j10;
                                        }
                                        long j11 = ocs0Var.c[i13];
                                        long[][] jArr = this.H;
                                        jArr.getClass();
                                        long j12 = jArr[i9][i13];
                                        long j13 = j11 - j;
                                        boolean z7 = j13 < 0 || j13 >= 262144;
                                        if ((z7 || !z5) && (z7 != z5 || j13 >= j9)) {
                                            i12 = i15;
                                        } else {
                                            z5 = z7;
                                            j9 = j13;
                                            j7 = j12;
                                            i12 = i9;
                                        }
                                        if (j12 < j8) {
                                            z4 = z7;
                                            i11 = i9;
                                            j8 = j12;
                                        } else {
                                            z4 = z6;
                                            i11 = i14;
                                        }
                                    }
                                    i9++;
                                    position3 = j;
                                }
                                i8 = (jMin == Long.MAX_VALUE || i10 == -1 || j6 > jMin) ? (j8 == Long.MAX_VALUE || !z4 || j7 < j8 + 10485760) ? i12 : i11 : i10;
                                this.s = i8;
                                if (i8 == -1) {
                                    return -1;
                                }
                            } else {
                                j = position3;
                            }
                            hv40 hv40Var2 = this.G[i8];
                            ncs0 ncs0Var = hv40Var2.c;
                            ocs0 ocs0Var2 = hv40Var2.b;
                            lbs0 lbs0Var = hv40Var2.f13710a;
                            int i16 = hv40Var2.g;
                            long[] jArr2 = ocs0Var2.c;
                            int[] iArr = ocs0Var2.d;
                            long j14 = jArr2[i16] + this.E;
                            int i17 = iArr[i16];
                            rrs0 rrs0Var = hv40Var2.d;
                            long j15 = (j14 - j) + ((long) this.t);
                            if (j15 < 0 || j15 >= 262144) {
                                mtcVar.f22363a = j14;
                                return 1;
                            }
                            boolean z8 = lbs0Var.h;
                            int i18 = lbs0Var.k;
                            androidx.media3.common.b bVar = lbs0Var.g;
                            if (z8) {
                                j15 += 8;
                                i17 -= 8;
                            }
                            guoVar.m((int) j15);
                            String str = bVar.p;
                            String str2 = bVar.p;
                            boolean zEquals2 = Objects.equals(str, "video/avc");
                            int i19 = this.b;
                            if (zEquals2) {
                                if ((i19 & 32) != 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (!Objects.equals(str, "video/hevc")) {
                                zEquals = Objects.equals(str, "video/apv");
                            } else if ((i19 & 128) != 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                c = 1;
                            } else {
                                c = 1;
                                this.w = true;
                            }
                            if (i18 == 0) {
                                androidx.media3.common.b bVar2 = hv40Var2.h;
                                if ("audio/ac4".equals(str2)) {
                                    if (this.u == 0) {
                                        b34.f0(i17, fq80Var2);
                                        ncs0Var.a(7, fq80Var2);
                                        this.u += 7;
                                    }
                                    i17 += 7;
                                } else if (bVar2 != null && Objects.equals(str2, "audio/mpeg")) {
                                    fq80Var2.J(4);
                                    guoVar.n(fq80Var2.f9961a, 0, 4);
                                    guoVar.g();
                                    mv40 mv40Var = new mv40();
                                    if (mv40Var.d(fq80Var2.m()) && !Objects.equals(bVar2.p, (String) mv40Var.g)) {
                                        awq awqVarA = bVar2.a();
                                        String str3 = (String) mv40Var.g;
                                        str3.getClass();
                                        awqVarA.o = mg40.n(str3);
                                        bVar2 = new androidx.media3.common.b(awqVarA);
                                    }
                                    ncs0Var.c(bVar2);
                                    hv40Var2.h = null;
                                } else if (bVar2 != null && hew0.P(str2)) {
                                    ncs0Var.c(hew0.Z(guoVar, i17, bVar2));
                                    hv40Var2.h = null;
                                } else if (rrs0Var != null) {
                                    rrs0Var.c(guoVar);
                                }
                                while (true) {
                                    int i20 = this.u;
                                    if (i20 >= i17) {
                                        break;
                                    }
                                    int iE = ncs0Var.e(guoVar, i17 - i20, false);
                                    this.t += iE;
                                    this.u += iE;
                                    this.v -= iE;
                                }
                            } else {
                                fq80 fq80Var4 = this.e;
                                byte[] bArr = fq80Var4.f9961a;
                                bArr[0] = 0;
                                bArr[c] = 0;
                                bArr[2] = 0;
                                int i21 = 4 - i18;
                                i17 += i21;
                                while (this.u < i17) {
                                    int i22 = this.v;
                                    if (i22 == 0) {
                                        if (this.w || ntr.j0(bVar) + i18 > iArr[i16] - this.t) {
                                            i = i18;
                                            iJ0 = 0;
                                        } else {
                                            iJ0 = ntr.j0(bVar);
                                            i = i18 + iJ0;
                                        }
                                        guoVar.readFully(bArr, i21, i);
                                        this.t += i;
                                        fq80Var4.M(0);
                                        int iM = fq80Var4.m();
                                        if (iM < 0) {
                                            throw kq80.a("Invalid NAL length", null);
                                        }
                                        this.v = iM - iJ0;
                                        fq80 fq80Var5 = this.d;
                                        fq80Var5.M(0);
                                        ncs0Var.a(4, fq80Var5);
                                        this.u += 4;
                                        if (iJ0 > 0) {
                                            ncs0Var.a(iJ0, fq80Var4);
                                            this.u += iJ0;
                                            if (ntr.g0(bArr, iJ0, bVar)) {
                                                this.w = true;
                                            }
                                        }
                                    } else {
                                        int iE2 = ncs0Var.e(guoVar, i22, false);
                                        this.t += iE2;
                                        this.u += iE2;
                                        this.v -= iE2;
                                    }
                                }
                            }
                            int i23 = i17;
                            long j16 = ocs0Var2.f[i16];
                            int i24 = ocs0Var2.g[i16];
                            if (!this.w) {
                                i24 |= 67108864;
                            }
                            int i25 = i24;
                            if (rrs0Var != null) {
                                rrs0Var.b(ncs0Var, j16, i25, i23, 0, null);
                                if (i16 + 1 == ocs0Var2.b) {
                                    rrs0Var.a(ncs0Var, null);
                                }
                            } else {
                                ncs0Var.b(j16, i25, i23, 0, null);
                            }
                            hv40Var2.g++;
                            this.s = -1;
                            this.t = 0;
                            this.u = 0;
                            this.v = 0;
                            this.w = false;
                            return 0;
                        }
                        if (i4 != 3) {
                            if (i4 != 4) {
                                v4i0.e();
                                return 0;
                            }
                            int i26 = this.C;
                            ArrayList arrayList = this.k;
                            ocs0 ocs0Var3 = (ocs0) arrayList.get(i26);
                            int i27 = this.D;
                            int i28 = ocs0Var3.b;
                            long[] jArr3 = ocs0Var3.f;
                            ArrayList arrayList2 = this.l;
                            if (i27 < i28) {
                                long j17 = ocs0Var3.c[i27];
                                if (guoVar.getPosition() != j17) {
                                    mtcVar.f22363a = j17;
                                    return 1;
                                }
                                int i29 = ocs0Var3.d[this.D];
                                fq80Var2.J(i29);
                                guoVar.readFully(fq80Var2.f9961a, 0, i29);
                                String strX = fq80Var2.x(Math.min(fq80Var2.G(), fq80Var2.a()), StandardCharsets.UTF_8);
                                long jY = vtt0.Y(jArr3[this.D]);
                                int i30 = this.D + 1;
                                arrayList2.add(new gub(jY, i30 < ocs0Var3.b ? vtt0.Y(jArr3[i30]) : vtt0.Y(ocs0Var3.i), false, new uty(null, strX)));
                                this.D++;
                                return 0;
                            }
                            hv40[] hv40VarArr3 = this.G;
                            int length = hv40VarArr3.length;
                            int i31 = 0;
                            while (i31 < length) {
                                hv40 hv40Var3 = hv40VarArr3[i31];
                                if (hv40Var3.f13710a.l == ocs0Var3.f25043a.f19766a) {
                                    androidx.media3.common.b bVar3 = hv40Var3.h;
                                    bVar3.getClass();
                                    ed40 ed40Var = bVar3.m;
                                    ArrayList arrayList3 = new ArrayList();
                                    if (ed40Var != null) {
                                        u3x u3xVarL = b4x.l();
                                        cd40[] cd40VarArr = ed40Var.f7600a;
                                        int length2 = cd40VarArr.length;
                                        while (i5 < length2) {
                                            cd40 cd40Var2 = cd40VarArr[i5];
                                            hv40[] hv40VarArr4 = hv40VarArr3;
                                            int i32 = length;
                                            if (cd40.class.isAssignableFrom(cd40Var2.getClass())) {
                                                cd40Var = (cd40) cd40.class.cast(cd40Var2);
                                                if (cd40Var instanceof eub) {
                                                    cd40Var = null;
                                                }
                                            } else {
                                                cd40Var = null;
                                            }
                                            if (cd40Var != null) {
                                                u3xVarL.b(cd40Var);
                                            }
                                            i5++;
                                            hv40VarArr3 = hv40VarArr4;
                                            length = i32;
                                        }
                                        hv40VarArr = hv40VarArr3;
                                        i3 = length;
                                        arrayList3.addAll(u3xVarL.g());
                                    } else {
                                        hv40VarArr = hv40VarArr3;
                                        i3 = length;
                                    }
                                    arrayList3.addAll(arrayList2);
                                    awq awqVarA2 = bVar3.a();
                                    awqVarA2.l = new ed40(arrayList3);
                                    androidx.media3.common.b bVar4 = new androidx.media3.common.b(awqVarA2);
                                    String str4 = bVar4.p;
                                    if (Objects.equals(str4, "audio/mpeg") || hew0.P(str4)) {
                                        hv40Var3.h = bVar4;
                                    } else {
                                        hv40Var3.c.c(bVar4);
                                        hv40Var3.h = null;
                                    }
                                } else {
                                    hv40VarArr = hv40VarArr3;
                                    i3 = length;
                                    z3 = z3;
                                }
                                i31++;
                                hv40VarArr3 = hv40VarArr;
                                length = i3;
                                z3 = z3;
                                i5 = 0;
                            }
                            this.C++;
                            this.D = 0;
                            arrayList2.clear();
                            if (this.C == arrayList.size()) {
                                this.n = 2;
                            }
                            return 0;
                        }
                        tvh0 tvh0Var = this.i;
                        ArrayList arrayList4 = tvh0Var.f34599a;
                        byte b = tvh0Var.b;
                        if (b != 0) {
                            if (b != 1) {
                                short s = 2817;
                                int i33 = 8;
                                if (b == 2) {
                                    long length3 = guoVar.getLength();
                                    int i34 = tvh0Var.c - 20;
                                    fq80 fq80Var6 = new fq80(i34);
                                    guoVar.readFully(fq80Var6.f9961a, 0, i34);
                                    int i35 = 0;
                                    while (i35 < i34 / 12) {
                                        fq80Var6.N(2);
                                        fq80Var6.f(2);
                                        byte[] bArr2 = fq80Var6.f9961a;
                                        int i36 = fq80Var6.b;
                                        int i37 = i36 + 1;
                                        fq80Var6.b = i37;
                                        int i38 = bArr2[i36] & 255;
                                        fq80Var6.b = i36 + 2;
                                        short s2 = (short) (((bArr2[i37] & 255) << 8) | i38);
                                        if (s2 != 2192 && s2 != 2816 && s2 != s) {
                                            if (s2 != 2819 && s2 != 2820) {
                                                fq80Var6.N(i33);
                                                fq80Var = fq80Var6;
                                            }
                                            i35++;
                                            fq80Var6 = fq80Var;
                                            s = 2817;
                                            i33 = 8;
                                        }
                                        fq80Var = fq80Var6;
                                        arrayList4.add(new svh0((length3 - ((long) tvh0Var.c)) - ((long) fq80Var.o()), fq80Var.o()));
                                        i35++;
                                        fq80Var6 = fq80Var;
                                        s = 2817;
                                        i33 = 8;
                                    }
                                    if (arrayList4.isEmpty()) {
                                        mtcVar.f22363a = 0L;
                                        j4 = 0;
                                    } else {
                                        tvh0Var.b = (byte) 3;
                                        j4 = ((svh0) arrayList4.get(0)).f32866a;
                                        mtcVar.f22363a = j4;
                                    }
                                    j2 = j4;
                                } else {
                                    if (b != 3) {
                                        v4i0.e();
                                        return 0;
                                    }
                                    long position4 = guoVar.getPosition();
                                    int length4 = (int) ((guoVar.getLength() - guoVar.getPosition()) - ((long) tvh0Var.c));
                                    fq80 fq80Var7 = new fq80(length4);
                                    guoVar.readFully(fq80Var7.f9961a, 0, length4);
                                    int i39 = 0;
                                    while (i39 < arrayList4.size()) {
                                        svh0 svh0Var = (svh0) arrayList4.get(i39);
                                        fq80Var7.M((int) (svh0Var.f32866a - position4));
                                        fq80Var7.N(i6);
                                        int iO = fq80Var7.o();
                                        Charset charset = StandardCharsets.UTF_8;
                                        switch (fq80Var7.x(iO, charset)) {
                                            case "SlowMotion_Data":
                                                c2 = 2192;
                                                break;
                                            case "Super_SlowMotion_Edit_Data":
                                                c2 = 2819;
                                                break;
                                            case "Super_SlowMotion_Data":
                                                c2 = 2816;
                                                break;
                                            case "Super_SlowMotion_Deflickering_On":
                                                c2 = 2820;
                                                break;
                                            case "Super_SlowMotion_BGM":
                                                c2 = 2817;
                                                break;
                                            default:
                                                throw kq80.a("Invalid SEF name", null);
                                        }
                                        int i40 = svh0Var.b - (iO + 8);
                                        if (c2 == 2192) {
                                            ArrayList arrayList5 = new ArrayList();
                                            List listH = tvh0.e.h(fq80Var7.x(i40, charset));
                                            for (int i41 = 0; i41 < listH.size(); i41++) {
                                                List listH2 = tvh0.d.h((CharSequence) listH.get(i41));
                                                if (listH2.size() != 3) {
                                                    throw kq80.a(null, null);
                                                }
                                                try {
                                                    arrayList5.add(new w9k0(1 << (Integer.parseInt((String) listH2.get(2)) - 1), Long.parseLong((String) listH2.get(0)), Long.parseLong((String) listH2.get(1))));
                                                } catch (NumberFormatException e) {
                                                    throw kq80.a(null, e);
                                                }
                                            }
                                            this.j.add(new x9k0(arrayList5));
                                        } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                            v4i0.e();
                                            return 0;
                                        }
                                        i39++;
                                        i6 = 4;
                                    }
                                    mtcVar.f22363a = 0L;
                                    j3 = 0;
                                    i2 = 1;
                                    j2 = 0;
                                }
                            } else {
                                fq80 fq80Var8 = new fq80(8);
                                guoVar.readFully(fq80Var8.f9961a, 0, 8);
                                tvh0Var.c = fq80Var8.o() + 8;
                                if (fq80Var8.m() != 1397048916) {
                                    mtcVar.f22363a = 0L;
                                    position = 0;
                                } else {
                                    position = guoVar.getPosition() - ((long) (tvh0Var.c - 12));
                                    mtcVar.f22363a = position;
                                    tvh0Var.b = (byte) 2;
                                }
                                j2 = position;
                            }
                            j3 = 0;
                            i2 = 1;
                        } else {
                            long length5 = guoVar.getLength();
                            long j18 = (length5 == -1 || length5 < 8) ? 0L : length5 - 8;
                            mtcVar.f22363a = j18;
                            i2 = 1;
                            tvh0Var.b = (byte) 1;
                            j2 = j18;
                            j3 = 0;
                        }
                        if (j2 == j3) {
                            this.n = 0;
                            this.q = 0;
                            return i2;
                        }
                    }
                } else {
                    int i42 = this.q;
                    fq80 fq80Var9 = this.g;
                    if (i42 == 0) {
                        if (guoVar.h(fq80Var9.f9961a, 0, 8, true)) {
                            this.q = 8;
                            fq80Var9.M(0);
                            this.p = fq80Var9.B();
                            this.o = fq80Var9.m();
                        }
                    }
                    long j19 = this.p;
                    if (j19 == 1) {
                        guoVar.readFully(fq80Var9.f9961a, 8, 8);
                        this.q += 8;
                        this.p = fq80Var9.F();
                    } else if (j19 == 0) {
                        long length6 = guoVar.getLength();
                        if (length6 == -1 && (ev40Var = (ev40) arrayDeque.peek()) != null) {
                            length6 = ev40Var.e;
                        }
                        if (length6 != -1) {
                            this.p = (length6 - guoVar.getPosition()) + ((long) this.q);
                        }
                    }
                    long j20 = this.p;
                    int i43 = this.q;
                    long j21 = i43;
                    if (j20 < j21) {
                        if (this.o != 1718773093 || i43 != 8) {
                            throw kq80.e("Atom size less than header length (unsupported).");
                        }
                        this.p = j21;
                    }
                    int i44 = this.o;
                    if (i44 == 1836019574 || i44 == 1953653099 || i44 == 1835297121 || i44 == 1835626086 || i44 == 1937007212 || i44 == 1701082227 || i44 == 1835365473 || i44 == 1635284069 || i44 == 1953654118) {
                        long position5 = guoVar.getPosition();
                        long j22 = this.p;
                        long j23 = this.q;
                        long j24 = (position5 + j22) - j23;
                        if (j22 != j23 && this.o == 1835365473) {
                            fq80Var2.J(8);
                            guoVar.n(fq80Var2.f9961a, 0, 8);
                            hr8.a(fq80Var2);
                            guoVar.m(fq80Var2.b);
                            guoVar.g();
                        }
                        arrayDeque.push(new ev40(this.o, j24));
                        if (this.p == this.q) {
                            g(j24);
                        } else {
                            this.n = 0;
                            this.q = 0;
                        }
                    } else if (i44 == 1835296868 || i44 == 1836476516 || i44 == 1751411826 || i44 == 1937011556 || i44 == 1937011827 || i44 == 1937011571 || i44 == 1668576371 || i44 == 1701606260 || i44 == 1937011555 || i44 == 1937011578 || i44 == 1937013298 || i44 == 1937007471 || i44 == 1668232756 || i44 == 1953196132 || i44 == 1718909296 || i44 == 1969517665 || i44 == 1801812339 || i44 == 1768715124 || i44 == 1667785072) {
                        x0x.K(i43 == 8);
                        x0x.K(this.p <= 2147483647L);
                        fq80 fq80Var10 = new fq80((int) this.p);
                        System.arraycopy(fq80Var9.f9961a, 0, fq80Var10.f9961a, 0, 8);
                        this.r = fq80Var10;
                        this.n = 1;
                    } else {
                        this.r = null;
                        this.n = 1;
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        this.h.clear();
        this.q = 0;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.k.clear();
        this.l.clear();
        if (j == 0) {
            if (this.n != 3) {
                this.n = 0;
                this.q = 0;
                return;
            } else {
                tvh0 tvh0Var = this.i;
                tvh0Var.f34599a.clear();
                tvh0Var.b = (byte) 0;
                this.j.clear();
                return;
            }
        }
        for (hv40 hv40Var : this.G) {
            ocs0 ocs0Var = hv40Var.b;
            int iA = ocs0Var.a(j2);
            if (iA == -1) {
                iA = ocs0Var.b(j2);
            }
            hv40Var.g = iA;
            rrs0 rrs0Var = hv40Var.d;
            if (rrs0Var != null) {
                rrs0Var.b = false;
                rrs0Var.c = 0;
            }
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        rcf0 rcf0VarT;
        qgk0 qgk0VarO = zgc.O(guoVar, false);
        if (qgk0VarO != null) {
            rcf0VarT = b4x.t(qgk0VarO);
        } else {
            v3x v3xVar = b4x.b;
            rcf0VarT = rcf0.e;
        }
        this.m = rcf0VarT;
        return qgk0VarO == null;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        if ((this.b & 16) == 0) {
            huoVar = new o24(huoVar, this.f15428a);
        }
        this.F = huoVar;
    }

    @Override // a.fuo
    public final List f() {
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x036b  */
    /* JADX WARN: Code duplicated, block: B:186:0x037b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0396  */
    /* JADX WARN: Code duplicated, block: B:197:0x039c  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:214:0x03e8 A[EDGE_INSN: B:214:0x03e8->B:215:0x03ea BREAK  A[LOOP:8: B:209:0x03d4->B:315:?]] */
    /* JADX WARN: Code duplicated, block: B:217:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[LOOP:1: B:14:0x004d->B:24:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:285:0x007d A[EDGE_INSN: B:285:0x007d->B:26:0x007d BREAK  A[LOOP:1: B:14:0x004d->B:24:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g(long j) {
        int i;
        ArrayList arrayList;
        ed40 ed40VarF;
        ArrayList arrayList2;
        boolean z;
        ed40 ed40VarK;
        long[][] jArr;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        hv40 hv40Var;
        long j2;
        int i3;
        ed40 ed40Var;
        ArrayList arrayList5;
        ed40 ed40Var2;
        ed40 ed40Var3;
        ed40 ed40Var4;
        ed40 ed40Var5;
        androidx.media3.common.b bVar;
        int i4;
        int i5;
        hv40 hv40Var2;
        int size;
        ArrayList arrayList6;
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList7;
        cd40 cd40Var;
        cd40 cd40Var2;
        cd40 cd40Var3;
        int i10;
        while (true) {
            ArrayDeque arrayDeque = this.h;
            if (arrayDeque.isEmpty() || ((ev40) arrayDeque.peek()).e != j) {
                break;
            }
            ev40 ev40Var = (ev40) arrayDeque.pop();
            if (ev40Var.b == 1836019574) {
                ev40 ev40VarV = ev40Var.v(1835365473);
                ArrayList arrayList8 = new ArrayList();
                byte b = 1;
                ArrayList arrayList9 = this.k;
                boolean z2 = this.c;
                long j3 = 0;
                int i11 = this.b;
                if (ev40VarV != null) {
                    ed40VarF = hr8.f(ev40VarV);
                    if (this.A) {
                        ed40VarF.getClass();
                        cd40[] cd40VarArr = ed40VarF.f7600a;
                        int length = cd40VarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                i = 0;
                                cd40Var2 = null;
                                break;
                            }
                            cd40 cd40Var4 = cd40VarArr[i12];
                            if (nj30.class.isAssignableFrom(cd40Var4.getClass())) {
                                cd40Var2 = (cd40) nj30.class.cast(cd40Var4);
                                i = 0;
                                if (!((nj30) cd40Var2).f23615a.equals("auxiliary.tracks.interleaved")) {
                                }
                                if (cd40Var2 != null) {
                                    break;
                                } else {
                                    i12++;
                                }
                            } else {
                                i = 0;
                            }
                            cd40Var2 = null;
                            if (cd40Var2 != null) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        nj30 nj30Var = (nj30) cd40Var2;
                        if (nj30Var != null && nj30Var.b[i] == 0) {
                            this.E = this.z + 16;
                        }
                        int length2 = cd40VarArr.length;
                        int i13 = i;
                        while (true) {
                            if (i13 >= length2) {
                                cd40Var3 = null;
                                break;
                            }
                            cd40 cd40Var5 = cd40VarArr[i13];
                            if (nj30.class.isAssignableFrom(cd40Var5.getClass())) {
                                cd40Var3 = (cd40) nj30.class.cast(cd40Var5);
                                if (!((nj30) cd40Var3).f23615a.equals("auxiliary.tracks.map")) {
                                    cd40Var3 = null;
                                }
                            } else {
                                cd40Var3 = null;
                            }
                            if (cd40Var3 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        nj30 nj30Var2 = (nj30) cd40Var3;
                        nj30Var2.getClass();
                        ArrayList arrayListD = nj30Var2.d();
                        arrayList8 = new ArrayList(arrayListD.size());
                        int iC = i;
                        while (iC < arrayListD.size()) {
                            int iIntValue = ((Integer) arrayListD.get(iC)).intValue();
                            if (iIntValue == 0) {
                                i10 = 1;
                            } else if (iIntValue != 1) {
                                i10 = 3;
                                if (iIntValue != 2) {
                                    i10 = iIntValue != 3 ? i : 4;
                                }
                            } else {
                                i10 = 2;
                            }
                            iC = w6x.c(i10, iC, 1, arrayList8);
                        }
                    } else {
                        i = 0;
                        if (ed40VarF != null && (i11 & 64) != 0) {
                            cd40[] cd40VarArr2 = ed40VarF.f7600a;
                            int length3 = cd40VarArr2.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length3) {
                                    cd40Var = null;
                                    break;
                                }
                                cd40 cd40Var6 = cd40VarArr2[i14];
                                if (nj30.class.isAssignableFrom(cd40Var6.getClass())) {
                                    cd40Var = (cd40) nj30.class.cast(cd40Var6);
                                    if (!((nj30) cd40Var).f23615a.equals("auxiliary.tracks.offset")) {
                                        cd40Var = null;
                                    }
                                } else {
                                    cd40Var = null;
                                }
                                if (cd40Var != null) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                            nj30 nj30Var3 = (nj30) cd40Var;
                            if (nj30Var3 != null) {
                                long jF = new fq80(nj30Var3.b).F();
                                if (jF > 0) {
                                    this.z = jF;
                                    this.y = true;
                                    arrayList2 = arrayList9;
                                    z = z2;
                                }
                                arrayDeque.clear();
                                this.B = true;
                                if (this.y && !z) {
                                    this.n = !arrayList2.isEmpty() ? 4 : 2;
                                }
                            }
                        }
                    }
                    arrayList = arrayList8;
                } else {
                    i = 0;
                    arrayList = arrayList8;
                    ed40VarF = null;
                }
                ArrayList arrayList10 = new ArrayList();
                boolean z3 = this.I == 1 ? 1 : i;
                met metVar = new met();
                fv40 fv40VarW = ev40Var.w(1969517665);
                if (fv40VarW != null) {
                    ed40VarK = hr8.k(fv40VarW, (i11 & 512) != 0 ? 1 : i);
                    metVar.b(ed40VarK);
                } else {
                    ed40VarK = null;
                }
                fv40 fv40VarW2 = ev40Var.w(1836476516);
                fv40VarW2.getClass();
                cd40[] cd40VarArr3 = new cd40[1];
                cd40VarArr3[i] = hr8.g(fv40VarW2.e);
                ed40 ed40Var6 = new ed40(cd40VarArr3);
                ArrayList arrayList11 = arrayList9;
                z = z2;
                ArrayList<ocs0> arrayListJ = hr8.j(ev40Var, metVar, -9223372036854775807L, null, (i11 & 1) != 0 ? 1 : i, z3, new t6r(this, b), this.c);
                if (this.A) {
                    boolean z4 = arrayList.size() == arrayListJ.size() ? 1 : i;
                    Locale locale = Locale.US;
                    x0x.J(ohs0.m("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", Separators.RPAREN, arrayListJ.size()), z4);
                }
                ArrayList arrayList12 = new ArrayList();
                for (ocs0 ocs0Var : arrayListJ) {
                    int i15 = ocs0Var.f25043a.l;
                    if (i15 != -1 && !arrayList12.contains(Integer.valueOf(i15))) {
                        arrayList12.add(Integer.valueOf(ocs0Var.f25043a.l));
                    }
                }
                arrayList11.clear();
                for (ocs0 ocs0Var2 : arrayListJ) {
                    if (arrayList12.contains(Integer.valueOf(ocs0Var2.f25043a.f19766a))) {
                        arrayList7 = arrayList11;
                        arrayList7.add(ocs0Var2);
                    } else {
                        arrayList7 = arrayList11;
                    }
                    arrayList11 = arrayList7;
                }
                ArrayList arrayList13 = arrayList11;
                String strK = d9x.K(arrayListJ);
                int i16 = -1;
                int i17 = i;
                int i18 = i17;
                long j4 = -9223372036854775807L;
                while (i17 < arrayListJ.size()) {
                    ocs0 ocs0Var3 = (ocs0) arrayListJ.get(i17);
                    ArrayList arrayList14 = arrayListJ;
                    int i19 = ocs0Var3.b;
                    long[] jArr2 = ocs0Var3.f;
                    String str = strK;
                    lbs0 lbs0Var = ocs0Var3.f25043a;
                    if (i19 == 0) {
                        arrayList4 = arrayList10;
                        arrayList3 = arrayList13;
                    } else {
                        arrayList3 = arrayList13;
                        boolean z5 = lbs0Var.m;
                        androidx.media3.common.b bVar2 = lbs0Var.g;
                        arrayList4 = arrayList10;
                        int i20 = lbs0Var.l;
                        int i21 = lbs0Var.b;
                        if (z5) {
                            ed40 ed40Var7 = ed40VarF;
                            ed40 ed40Var8 = ed40VarK;
                            int i22 = i18 + 1;
                            ncs0 ncs0VarQ = this.F.q(i18, i21);
                            hv40 hv40Var3 = new hv40(lbs0Var, ocs0Var3, ncs0VarQ);
                            ed40 ed40Var9 = ed40Var6;
                            long j5 = lbs0Var.e;
                            if (j5 == -9223372036854775807L) {
                                j5 = ocs0Var3.i;
                            }
                            ncs0VarQ.f(j5);
                            long jMax = Math.max(j4, j5);
                            String str2 = bVar2.p;
                            boolean zEquals = "audio/true-hd".equals(str2);
                            int i23 = ocs0Var3.e;
                            int i24 = zEquals ? i23 * 16 : i23 + 30;
                            awq awqVarA = bVar2.a();
                            awqVarA.p = i24;
                            if (i21 == 2) {
                                int i25 = bVar2.f;
                                if ((i11 & 8) != 0) {
                                    i25 |= i16 == -1 ? 1 : 2;
                                }
                                if (this.A) {
                                    i25 |= 32768;
                                    awqVarA.h = ((Integer) arrayList.get(i17)).intValue();
                                }
                                awqVarA.f = i25;
                            }
                            int[] iArr = ocs0Var3.h;
                            boolean z6 = ocs0Var3.j;
                            if (!mg40.m(bVar2.p) || jArr2.length <= 0) {
                                i2 = i16;
                                hv40Var = hv40Var3;
                            } else {
                                int iMin = Math.min(z6 ? ocs0Var3.b : iArr.length, 20);
                                x0x.K(j5 != -9223372036854775807L ? 1 : i);
                                i2 = i16;
                                hv40Var = hv40Var3;
                                long jMin = Math.min(j5, 10000000L);
                                int i26 = i;
                                int i27 = i26;
                                int i28 = -1;
                                while (i26 < iMin) {
                                    int i29 = z6 ? i26 : iArr[i26];
                                    long j6 = jArr2[i29];
                                    if (j6 > jMin) {
                                        break;
                                    }
                                    if (j6 >= 0 && (i9 = ocs0Var3.d[(i8 = i29)]) > i27) {
                                        i27 = i9;
                                        i28 = i8;
                                    }
                                    i26++;
                                }
                                if (i28 != -1) {
                                    j2 = jArr2[i28];
                                }
                                if (j2 != -9223372036854775807L) {
                                    kdq0 kdq0Var = new kdq0(j2);
                                    i3 = 1;
                                    cd40[] cd40VarArr4 = new cd40[1];
                                    cd40VarArr4[i] = kdq0Var;
                                    ed40Var = new ed40(cd40VarArr4);
                                } else {
                                    i3 = 1;
                                    ed40Var = null;
                                }
                                if (i21 == i3 && (i6 = metVar.f21663a) != -1 && (i7 = metVar.b) != -1) {
                                    awqVarA.M = i6;
                                    awqVarA.N = i7;
                                }
                                ed40 ed40Var10 = bVar2.m;
                                arrayList5 = this.j;
                                if (arrayList5.isEmpty()) {
                                    ed40Var2 = null;
                                } else {
                                    ed40Var2 = new ed40(arrayList5);
                                }
                                ed40Var3 = ed40Var8;
                                ed40Var4 = ed40Var9;
                                ed40[] ed40VarArr = {ed40Var2, ed40Var3, ed40Var4, ed40Var};
                                ed40Var5 = ed40Var7;
                                l7x.Z(i21, ed40Var5, awqVarA, ed40Var10, ed40VarArr);
                                awqVarA.n = mg40.n(str);
                                bVar = new androidx.media3.common.b(awqVarA);
                                if (!Objects.equals(str2, "audio/mpeg") || hew0.P(str2)) {
                                    i4 = 1;
                                } else {
                                    i4 = i;
                                }
                                if (z && i20 != -1) {
                                    Iterator it = arrayList3.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((ocs0) it.next()).f25043a.f19766a == i20) {
                                                i5 = 1;
                                                break;
                                            }
                                        } else {
                                            i5 = i;
                                            break;
                                        }
                                    }
                                } else {
                                    i5 = i;
                                    break;
                                }
                                if (i4 == 0 || i5 != 0) {
                                    hv40Var2 = hv40Var;
                                    hv40Var2.h = bVar;
                                } else {
                                    hv40Var2 = hv40Var;
                                    hv40Var2.c.c(bVar);
                                }
                                size = (i21 == 2 || i2 != -1) ? i2 : arrayList4.size();
                                arrayList6 = arrayList4;
                                arrayList6.add(hv40Var2);
                                i18 = i22;
                                j4 = jMax;
                            }
                            j2 = -9223372036854775807L;
                            if (j2 != -9223372036854775807L) {
                                kdq0 kdq0Var2 = new kdq0(j2);
                                i3 = 1;
                                cd40[] cd40VarArr5 = new cd40[1];
                                cd40VarArr5[i] = kdq0Var2;
                                ed40Var = new ed40(cd40VarArr5);
                            } else {
                                i3 = 1;
                                ed40Var = null;
                            }
                            if (i21 == i3) {
                                awqVarA.M = i6;
                                awqVarA.N = i7;
                            }
                            ed40 ed40Var11 = bVar2.m;
                            arrayList5 = this.j;
                            if (arrayList5.isEmpty()) {
                                ed40Var2 = null;
                            } else {
                                ed40Var2 = new ed40(arrayList5);
                            }
                            ed40Var3 = ed40Var8;
                            ed40Var4 = ed40Var9;
                            ed40[] ed40VarArr2 = {ed40Var2, ed40Var3, ed40Var4, ed40Var};
                            ed40Var5 = ed40Var7;
                            l7x.Z(i21, ed40Var5, awqVarA, ed40Var11, ed40VarArr2);
                            awqVarA.n = mg40.n(str);
                            bVar = new androidx.media3.common.b(awqVarA);
                            if (Objects.equals(str2, "audio/mpeg")) {
                                i4 = 1;
                            } else {
                                i4 = 1;
                            }
                            if (z) {
                                i5 = i;
                                break;
                            } else {
                                i5 = i;
                                break;
                            }
                            if (i4 == 0) {
                                hv40Var2 = hv40Var;
                                hv40Var2.h = bVar;
                            } else {
                                hv40Var2 = hv40Var;
                                hv40Var2.h = bVar;
                            }
                            if (i21 == 2) {
                            }
                            arrayList6 = arrayList4;
                            arrayList6.add(hv40Var2);
                            i18 = i22;
                            j4 = jMax;
                        }
                        i17++;
                        i16 = size;
                        arrayList10 = arrayList6;
                        ed40Var6 = ed40Var4;
                        arrayListJ = arrayList14;
                        arrayList13 = arrayList3;
                        arrayList = arrayList;
                        ed40VarK = ed40Var3;
                        ed40VarF = ed40Var5;
                        strK = str;
                    }
                    size = i16;
                    ed40Var5 = ed40VarF;
                    ed40Var3 = ed40VarK;
                    ed40Var4 = ed40Var6;
                    arrayList6 = arrayList4;
                    i17++;
                    i16 = size;
                    arrayList10 = arrayList6;
                    ed40Var6 = ed40Var4;
                    arrayListJ = arrayList14;
                    arrayList13 = arrayList3;
                    arrayList = arrayList;
                    ed40VarK = ed40Var3;
                    ed40VarF = ed40Var5;
                    strK = str;
                }
                int i30 = i16;
                arrayList2 = arrayList13;
                int i31 = -1;
                hv40[] hv40VarArr = (hv40[]) arrayList10.toArray(new hv40[i]);
                this.G = hv40VarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[hv40VarArr.length][];
                    int[] iArr2 = new int[hv40VarArr.length];
                    long[] jArr3 = new long[hv40VarArr.length];
                    boolean[] zArr = new boolean[hv40VarArr.length];
                    for (int i32 = 0; i32 < hv40VarArr.length; i32++) {
                        jArr[i32] = new long[hv40VarArr[i32].b.b];
                        jArr3[i32] = hv40VarArr[i32].b.f[0];
                    }
                    int i33 = 0;
                    while (i33 < hv40VarArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i34 = i31;
                        for (int i35 = 0; i35 < hv40VarArr.length; i35++) {
                            if (!zArr[i35]) {
                                long j8 = jArr3[i35];
                                if (j8 <= j7) {
                                    i34 = i35;
                                    j7 = j8;
                                }
                            }
                        }
                        int i36 = iArr2[i34];
                        long[] jArr4 = jArr[i34];
                        jArr4[i36] = j3;
                        ocs0 ocs0Var4 = hv40VarArr[i34].b;
                        hv40[] hv40VarArr2 = hv40VarArr;
                        j3 += (long) ocs0Var4.d[i36];
                        int i37 = i36 + 1;
                        iArr2[i34] = i37;
                        if (i37 < jArr4.length) {
                            jArr3[i34] = ocs0Var4.f[i37];
                        } else {
                            zArr[i34] = true;
                            i33++;
                        }
                        hv40VarArr = hv40VarArr2;
                        i31 = -1;
                    }
                }
                this.H = jArr;
                this.F.o();
                this.F.f(new gv40(j4, this.G, i30));
                arrayDeque.clear();
                this.B = true;
                if (this.y) {
                }
            } else if (!arrayDeque.isEmpty()) {
                ((ev40) arrayDeque.peek()).g.add(ev40Var);
            }
        }
        int i38 = this.n;
        if (i38 == 4 || i38 == 2) {
            return;
        }
        this.n = 0;
        this.q = 0;
    }

    @Override // a.fuo
    public final void release() {
    }
}
