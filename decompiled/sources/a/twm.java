package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class twm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f34657a;
    public static final float b;

    static {
        zcl zclVar = qmk.f28987a;
        f34657a = 18.0f;
        b = 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01df  */
    /* JADX WARN: Code duplicated, block: B:57:0x0205  */
    /* JADX WARN: Code duplicated, block: B:61:0x0219  */
    public static final void a(mm40 mm40Var, nwm nwmVar, fet fetVar, int i) {
        int i2;
        nwm nwmVar2;
        cl5 cl5Var;
        dlk dlkVar;
        cl5 cl5Var2;
        boolean zG;
        Object objP;
        boolean zG2;
        Object objP2;
        boolean zG3;
        Object objP3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2092056172);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(nwmVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarK0 = q8a.k0(mm40Var, enx.f8115a);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarK0, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            String str = nwmVar.c;
            dlk dlkVar2 = nwmVar.f;
            fetVar2.e0(-1950284624);
            boolean zG4 = fetVar2.g(str);
            Object objP4 = fetVar2.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (zG4 || objP4 == cl5Var3) {
                objP4 = twn.j(str.length() > 0 ? 94.0f : 76.0f, fetVar2);
            }
            float f = ((ycl) objP4).f42389a;
            bhm bhmVar = bhm.b;
            jm40 jm40Var = jm40.b;
            jeb.r(o7k0.e(s5x0.L(jm40Var, 4.0f, 0.0f, 2), f), bhmVar, fetVar2, 48);
            fetVar2.r(false);
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarC);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (str.length() > 0) {
                fetVar2.e0(-1255375267);
                cl5Var = cl5Var3;
                dlkVar = dlkVar2;
                v8q0.a(nwmVar.c, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                cl5Var = cl5Var3;
                dlkVar = dlkVar2;
                fetVar2.e0(-1255104792);
                fetVar2.r(false);
            }
            boolean zG5 = fetVar2.g(dlkVar);
            Object objP5 = fetVar2.P();
            if (zG5) {
                cl5Var2 = cl5Var;
            } else {
                cl5Var2 = cl5Var;
                if (objP5 == cl5Var2) {
                }
                String str2 = (String) objP5;
                zG = fetVar2.g(dlkVar);
                objP = fetVar2.P();
                if (zG || objP == cl5Var2) {
                    objP = Boolean.valueOf(dlkVar.c);
                    fetVar2.o0(objP);
                }
                nwmVar2 = nwmVar;
                b(null, nwmVar2.f24240a, nwmVar2.d, str2, ((Boolean) objP).booleanValue(), fetVar2, 0);
                zG2 = fetVar2.g(dlkVar);
                objP2 = fetVar2.P();
                if (zG2 || objP2 == cl5Var2) {
                    objP2 = dlkVar.b;
                    fetVar2.o0(objP2);
                }
                String str3 = (String) objP2;
                zG3 = fetVar2.g(dlkVar);
                objP3 = fetVar2.P();
                if (zG3 || objP3 == cl5Var2) {
                    objP3 = Boolean.valueOf(dlkVar.d);
                    fetVar2.o0(objP3);
                }
                b(null, nwmVar2.b, nwmVar2.e, str3, ((Boolean) objP3).booleanValue(), fetVar2, 0);
                fetVar2.r(true);
                fetVar2.r(true);
            }
            objP5 = dlkVar.f6286a;
            fetVar2.o0(objP5);
            String str4 = (String) objP5;
            zG = fetVar2.g(dlkVar);
            objP = fetVar2.P();
            if (zG) {
                objP = Boolean.valueOf(dlkVar.c);
                fetVar2.o0(objP);
            } else {
                objP = Boolean.valueOf(dlkVar.c);
                fetVar2.o0(objP);
            }
            nwmVar2 = nwmVar;
            b(null, nwmVar2.f24240a, nwmVar2.d, str4, ((Boolean) objP).booleanValue(), fetVar2, 0);
            zG2 = fetVar2.g(dlkVar);
            objP2 = fetVar2.P();
            if (zG2) {
                objP2 = dlkVar.b;
                fetVar2.o0(objP2);
            } else {
                objP2 = dlkVar.b;
                fetVar2.o0(objP2);
            }
            String str5 = (String) objP2;
            zG3 = fetVar2.g(dlkVar);
            objP3 = fetVar2.P();
            if (zG3) {
                objP3 = Boolean.valueOf(dlkVar.d);
                fetVar2.o0(objP3);
            } else {
                objP3 = Boolean.valueOf(dlkVar.d);
                fetVar2.o0(objP3);
            }
            b(null, nwmVar2.b, nwmVar2.e, str5, ((Boolean) objP3).booleanValue(), fetVar2, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            nwmVar2 = nwmVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 5, i, mm40Var, nwmVar2);
        }
    }

    public static final void b(mm40 mm40Var, String str, dkk dkkVar, String str2, boolean z, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(1475738701);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(dkkVar) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            float f = f34657a * 2.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            v8q0.a(str, dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), true), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, i3 & 14, 24960, 110584);
            fetVar2 = fetVar;
            c(null, dkkVar, fetVar2, i3 & 112);
            d((i2 >> 6) & 1008, fetVar2, null, str2, z);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 15, i, mm40Var2, (Object) str, (Object) dkkVar, (Object) str2, z);
        }
    }

    public static final void c(mm40 mm40Var, dkk dkkVar, fet fetVar, int i) {
        dkk dkkVar2;
        mm40 mm40Var2;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1150283713);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(dkkVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var2);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_cyber_kosti_one, 0, fetVar2), "", o7k0.n(mm40Var2, 16.0f), afn0.m(fetVar2).getSecondary(), fetVar2, 56, 0);
            dww.c(a8k0.F(R.drawable.ic_glyph_cyber_kosti_two, 0, fetVar2), "", o7k0.n(mm40Var2, 16.0f), afn0.m(fetVar2).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(mm40Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            long separator60 = afn0.m(fetVar2).getSeparator60();
            float f = b;
            dn8 dn8VarH = j120.h(f, separator60);
            mm40 mm40VarT = i120.T(mm40VarN2, dn8VarH.f6356a, dn8VarH.b, vgg0.a(6.0f));
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarT);
            fetVar2.i0();
            if (fetVar2.S) {
                pcyVar = pcyVar2;
                fetVar2.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            float f2 = f34657a;
            mm40 mm40VarE = o7k0.e(mm40Var2, f2);
            yx7 yx7Var2 = gqw0.j;
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var2, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            e(null, dkkVar.f6234a, afn0.m(fetVar2).getSecondary80(), false, fetVar2, 0, 9);
            e(null, dkkVar.b, afn0.m(fetVar).getSecondary80(), false, fetVar, 0, 9);
            mm40 mm40VarE2 = o7k0.e(o7k0.s(mm40Var2, f), f2);
            long separator61 = afn0.m(fetVar).getSeparator60();
            ljc ljcVar = jd8.n;
            qxw.o(fetVar, i120.Q(mm40VarE2, separator61, ljcVar));
            e(null, dkkVar.c, afn0.m(fetVar).getTextPrimary(), true, fetVar, 3072, 1);
            fetVar.r(true);
            qxw.o(fetVar, i120.Q(o7k0.e(o7k0.s(mm40Var2, f2 * 3.0f), f), afn0.m(fetVar).getSeparator60(), ljcVar));
            mm40 mm40VarE3 = o7k0.e(mm40Var2, f2);
            thg0 thg0VarA3 = shg0.a(lw3Var, yx7Var2, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarE3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            dkkVar2 = dkkVar;
            e(null, dkkVar2.d, afn0.m(fetVar).getSecondary80(), false, fetVar, 0, 9);
            fetVar2 = fetVar;
            e(null, dkkVar2.e, afn0.m(fetVar).getSecondary80(), false, fetVar2, 0, 9);
            qxw.o(fetVar2, i120.Q(o7k0.e(o7k0.s(mm40Var2, f), f2), afn0.m(fetVar2).getSeparator60(), ljcVar));
            e(null, dkkVar2.f, afn0.m(fetVar2).getTextPrimary(), true, fetVar2, 3072, 1);
            ohs0.x(fetVar2, true, true, true);
        } else {
            dkkVar2 = dkkVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 6, i, mm40Var2, dkkVar2);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str, boolean z) {
        fet fetVar2;
        mm40 mm40Var2;
        long primary;
        fetVar.g0(-1014841243);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f = f34657a * 2.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (z) {
                fetVar.e0(780044834);
                primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(780103238);
                primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
            v8q0.a(ttm0.L(2, str), null, primary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw(mm40Var2, str, z, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void e(mm40 mm40Var, final String str, final long j, boolean z, fet fetVar, final int i, final int i2) {
        boolean z2;
        boolean z3;
        fet fetVar2;
        mm40 mm40Var2;
        final boolean z4;
        yfe0 yfe0VarU;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objP;
        String strL;
        fetVar.g0(-1487925223);
        int i3 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.f(j) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                float f = f34657a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarN = o7k0.n(jm40Var, f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                if ((i3 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | ((i3 & 7168) == 2048);
                objP = fetVar.P();
                if (z7 || objP == ukd.f35823a) {
                    strL = null;
                    if (z5) {
                        if (str != null) {
                            strL = ttm0.L(2, str);
                        }
                    } else if (str != null) {
                        strL = ttm0.L(1, str);
                    }
                    if (strL == null) {
                        strL = "-";
                    }
                    objP = strL;
                    fetVar.o0(objP);
                }
                mm40Var2 = jm40Var;
                v8q0.a((String) objP, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i3 & 896, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(true);
                z4 = z5;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                mm40Var2 = mm40Var;
                z4 = z2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final mm40 mm40Var3 = mm40Var2;
                yfe0VarU.d = new Function2() { // from class: a.swm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        twm.e(mm40Var3, str, j, z4, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            float f2 = f34657a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN2 = o7k0.n(jm40Var2, f2);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            if ((i3 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z6 | ((i3 & 7168) == 2048);
            objP = fetVar.P();
            if (z7) {
                strL = null;
                if (z5) {
                    if (str != null) {
                        strL = ttm0.L(2, str);
                    }
                } else if (str != null) {
                    strL = ttm0.L(1, str);
                }
                if (strL == null) {
                    strL = "-";
                }
                objP = strL;
                fetVar.o0(objP);
            } else {
                strL = null;
                if (z5) {
                    if (str != null) {
                        strL = ttm0.L(2, str);
                    }
                } else if (str != null) {
                    strL = ttm0.L(1, str);
                }
                if (strL == null) {
                    strL = "-";
                }
                objP = strL;
                fetVar.o0(objP);
            }
            mm40Var2 = jm40Var2;
            v8q0.a((String) objP, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i3 & 896, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            z4 = z5;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
            z4 = z2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final mm40 mm40Var4 = mm40Var2;
            yfe0VarU.d = new Function2() { // from class: a.swm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    twm.e(mm40Var4, str, j, z4, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }
}
