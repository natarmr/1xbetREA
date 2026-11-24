package a;

import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zsf f19029a = new zsf(0.0f, 0.0f, 0.58f, 0.0f);

    public static final void a(mm40 mm40Var, asl aslVar, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(581518517);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(aslVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (aslVar instanceof yrl) {
            fetVar.e0(493554454);
            c(mm40Var, (yrl) aslVar, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!aslVar.equals(zrl.f44860a)) {
                throw b1j.f(493552272, fetVar, false);
            }
            fetVar.e0(493561256);
            d(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ax1(mm40Var, aslVar, function0, i, (byte) 3);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, long j, Function0 function0, fet fetVar, int i) {
        String str5;
        boolean z;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        lw3 lw3Var;
        xx7 xx7Var;
        yx7 yx7Var;
        mw3 mw3Var;
        boolean z2;
        float f;
        shd shdVar4;
        yx7 yx7Var2;
        lw3 lw3Var2;
        float f2;
        float f3;
        int i2;
        mw3 mw3Var2;
        shd shdVar5;
        float f4;
        fet fetVar2 = fetVar;
        shd shdVar6 = gqw0.v;
        shd shdVar7 = gqw0.y;
        shd shdVar8 = gqw0.w;
        shd shdVar9 = gqw0.x;
        yx7 yx7Var3 = gqw0.j;
        lw3 lw3Var3 = uc9.f35418a;
        mw3 mw3Var3 = uc9.c;
        xx7 xx7Var2 = gqw0.n;
        fetVar2.g0(-56788720);
        int i3 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.g(str3) ? 256 : 128) | (fetVar2.g(str4) ? 2048 : 1024) | (fetVar2.f(j) ? 16384 : 8192) | (fetVar2.h(true) ? 131072 : 65536) | (fetVar2.i(function0) ? 1048576 : 524288);
        if (fetVar2.U(i3 & 1, (i3 & 599187) != 599186)) {
            pz40 pz40VarD0 = uc9.d0(j, function0, fetVar2, ((i3 >> 12) & 14) | ((i3 >> 15) & 112));
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar9);
            jpm0.o(fetVar2, bh90VarM, shdVar8);
            vqd.u(iHashCode, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar6);
            x5d x5dVarA = w5d.a(mw3Var3, xx7Var2, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar9);
            jpm0.o(fetVar2, bh90VarM2, shdVar8);
            vqd.u(iHashCode2, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar6);
            thg0 thg0VarA2 = shg0.a(lw3Var3, yx7Var3, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar9);
            jpm0.o(fetVar2, bh90VarM3, shdVar8);
            vqd.u(iHashCode3, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar6);
            fetVar2.e0(1779806729);
            String str6 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str6 == null) {
                fetVar2.e0(-660566248);
                z = false;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(-660566247);
                for (int i4 = 0; i4 < str6.length(); i4++) {
                    e(0, fetVar2, null, String.valueOf(str6.charAt(i4)));
                }
                fetVar2.r(false);
            }
            fetVar2.r(z);
            fetVar2.r(true);
            String str7 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str7 == null || str7.length() == 0) {
                shdVar = shdVar7;
                shdVar2 = shdVar8;
                shdVar3 = shdVar9;
                lw3Var = lw3Var3;
                xx7Var = xx7Var2;
                yx7Var = yx7Var3;
                mw3Var = mw3Var3;
                z2 = true;
                fetVar2.e0(-2137986484);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2138691331);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(o7k0.u(jm40Var, 0.0f, 44.0f, 1), 2.0f, 0.0f, 2);
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                lw3Var = lw3Var3;
                yx7Var = yx7Var3;
                shdVar = shdVar7;
                shdVar2 = shdVar8;
                mw3Var = mw3Var3;
                z2 = true;
                shdVar3 = shdVar9;
                xx7Var = xx7Var2;
                v8q0.a(upperCase, mm40VarL, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), new n05(qmk.o, qmk.p, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.b(), fetVar2, 0, 24960, 109552);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(z2);
            String str8 = ((xnq0) pz40VarD0.getValue()).f41181a;
            if (str8 == null || str8.length() == 0) {
                f = 44.0f;
                fetVar2.e0(-2066788330);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2067050993);
                zcl zclVar3 = qmk.f28987a;
                f = 44.0f;
                jcb.H(o7k0.e(s5x0.L(jm40Var, 14.0f, 0.0f, 2), 44.0f), 2.0f, ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator60(), fetVar2, 0, 0);
                fetVar2.r(false);
            }
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar3);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar6);
            lw3 lw3Var4 = lw3Var;
            yx7 yx7Var4 = yx7Var;
            thg0 thg0VarA3 = shg0.a(lw3Var4, yx7Var4, fetVar2, 0);
            mw3 mw3Var4 = mw3Var;
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA3, shdVar3);
            jpm0.o(fetVar2, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar2, shdVar, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar6);
            fetVar2.e0(1129345962);
            String str9 = ((xnq0) pz40VarD0.getValue()).b;
            for (int i5 = 0; i5 < str9.length(); i5++) {
                e(0, fetVar2, null, String.valueOf(str9.charAt(i5)));
            }
            fetVar2.r(false);
            fetVar2.r(true);
            if (((xnq0) pz40VarD0.getValue()).b.length() > 0) {
                fetVar2.e0(1549026995);
                zcl zclVar4 = qmk.f28987a;
                f3 = 0.0f;
                mm40 mm40VarL2 = s5x0.L(o7k0.u(jm40Var, 0.0f, f, 1), 2.0f, 0.0f, 2);
                String upperCase2 = str2.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                i2 = 2;
                shdVar4 = shdVar6;
                f2 = 14.0f;
                lw3Var2 = lw3Var4;
                yx7Var2 = yx7Var4;
                v8q0.a(upperCase2, mm40VarL2, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), new n05(qmk.o, qmk.p, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 0, 24960, 109552);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                shdVar4 = shdVar6;
                yx7Var2 = yx7Var4;
                lw3Var2 = lw3Var4;
                f2 = 14.0f;
                f3 = 0.0f;
                i2 = 2;
                fetVar2.e0(1549732803);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            zcl zclVar5 = qmk.f28987a;
            jcb.H(o7k0.e(s5x0.L(jm40Var, f2, f3, i2), 44.0f), 2.0f, ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator60(), fetVar2, 0, 0);
            x5d x5dVarA3 = w5d.a(mw3Var4, xx7Var, fetVar2, 48);
            int iHashCode6 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM6 = fetVar2.m();
            mm40 mm40VarC5 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA3, shdVar3);
            jpm0.o(fetVar2, bh90VarM6, shdVar2);
            shd shdVar10 = shdVar;
            vqd.u(iHashCode6, fetVar2, shdVar10, fetVar2);
            shd shdVar11 = shdVar4;
            jpm0.o(fetVar2, mm40VarC5, shdVar11);
            yx7 yx7Var5 = yx7Var2;
            lw3 lw3Var5 = lw3Var2;
            thg0 thg0VarA4 = shg0.a(lw3Var5, yx7Var5, fetVar2, 0);
            xx7 xx7Var3 = xx7Var;
            int iHashCode7 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM7 = fetVar2.m();
            mm40 mm40VarC6 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA4, shdVar3);
            jpm0.o(fetVar2, bh90VarM7, shdVar2);
            vqd.u(iHashCode7, fetVar2, shdVar10, fetVar2);
            jpm0.o(fetVar2, mm40VarC6, shdVar11);
            fetVar2.e0(-1994412599);
            String str10 = ((xnq0) pz40VarD0.getValue()).c;
            for (int i6 = 0; i6 < str10.length(); i6++) {
                e(0, fetVar2, null, String.valueOf(str10.charAt(i6)));
            }
            fetVar2.r(false);
            fetVar2.r(true);
            if (((xnq0) pz40VarD0.getValue()).c.length() > 0) {
                fetVar2.e0(-798205838);
                zcl zclVar6 = qmk.f28987a;
                mm40 mm40VarL3 = s5x0.L(o7k0.u(jm40Var, 0.0f, 44.0f, 1), 2.0f, 0.0f, 2);
                String upperCase3 = str3.toUpperCase(Locale.ROOT);
                upperCase3.getClass();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                mw3Var2 = mw3Var4;
                shdVar5 = shdVar10;
                f4 = 44.0f;
                v8q0.a(upperCase3, mm40VarL3, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), new n05(qmk.o, qmk.p, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 0, 24960, 109552);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                mw3Var2 = mw3Var4;
                shdVar5 = shdVar10;
                f4 = 44.0f;
                fetVar2.e0(-797498108);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            zcl zclVar7 = qmk.f28987a;
            jcb.H(o7k0.e(s5x0.L(jm40Var, 14.0f, 0.0f, 2), f4), 2.0f, ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator60(), fetVar2, 0, 0);
            x5d x5dVarA4 = w5d.a(mw3Var2, xx7Var3, fetVar2, 48);
            int iHashCode8 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM8 = fetVar2.m();
            mm40 mm40VarC7 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA4, shdVar3);
            jpm0.o(fetVar2, bh90VarM8, shdVar2);
            vqd.u(iHashCode8, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC7, shdVar11);
            thg0 thg0VarA5 = shg0.a(lw3Var5, yx7Var5, fetVar2, 0);
            int iHashCode9 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM9 = fetVar2.m();
            mm40 mm40VarC8 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA5, shdVar3);
            jpm0.o(fetVar2, bh90VarM9, shdVar2);
            vqd.u(iHashCode9, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC8, shdVar11);
            fetVar2.e0(-823203928);
            String str11 = ((xnq0) pz40VarD0.getValue()).d;
            for (int i7 = 0; i7 < str11.length(); i7++) {
                e(0, fetVar2, null, String.valueOf(str11.charAt(i7)));
            }
            fetVar2.r(false);
            fetVar2.r(true);
            if (((xnq0) pz40VarD0.getValue()).d.length() > 0) {
                fetVar2.e0(1149524595);
                zcl zclVar8 = qmk.f28987a;
                mm40 mm40VarL4 = s5x0.L(o7k0.u(jm40Var, 0.0f, f4, 1), 2.0f, 0.0f, 2);
                str5 = str4;
                String upperCase4 = str5.toUpperCase(Locale.ROOT);
                upperCase4.getClass();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(upperCase4, mm40VarL4, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), new n05(qmk.o, qmk.p, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.b(), fetVar, 0, 24960, 109552);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                str5 = str4;
                fetVar2.e0(1150232325);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            str5 = str4;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jx1(str, str2, str3, str5, j, function0, i);
        }
    }

    public static final void c(mm40 mm40Var, yrl yrlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(942468457);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yrlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = yrlVar.f43127a;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            fetVar.e0(2068318026);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            fetVar.r(false);
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarG, fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-676273505, new bx1(yrlVar, function0, (byte) 3), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx1(mm40Var, yrlVar, function0, i, (byte) 3);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(970708042);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.s(o7k0.e(jm40Var, 12.0f), 128.0f), 1.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(o7k0.s(o7k0.e(jm40Var, 40.0f), 304.0f), 1.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 8);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fetVar.g0(594388695);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new dj1((byte) 12);
                fetVar.o0(objP);
            }
            ugd ugdVar = phu0.f27015a;
            int i3 = ((i2 >> 3) & 14) | 1573296;
            mm40Var2 = jm40.b;
            ay3.f(str, mm40Var2, (Function1) objP, null, null, null, ugdVar, fetVar, i3, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str, i, (byte) 1);
        }
    }
}
