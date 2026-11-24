package a;

import android.gov.nist.core.Separators;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xcm0 {
    public static final void a(au6 au6Var, fet fetVar, int i) {
        fetVar.g0(1148510948);
        byte b = 4;
        int i2 = (fetVar.e(au6Var.ordinal()) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            int iOrdinal = au6Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-351540564);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1986914355);
                zcl zclVar = qmk.f28987a;
                j0x.b(a8k0.F(R.drawable.ic_glyph_coupon_done, 0, fetVar), null, o7k0.n(jm40Var, 64.0f), null, null, 0.0f, null, fetVar, 56, 120);
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-351551497, fetVar, false);
                }
                fetVar.e0(-351549990);
                cem0.f(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(au6Var, i, b);
        }
    }

    public static final void b(int i, fet fetVar, boolean z) {
        fetVar.g0(-464990926);
        int i2 = (fetVar.h(z) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).d;
            lh80 lh80Var = new lh80(f, 12.0f, f, 12.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new jno((byte) 6, z);
                fetVar.o0(objP);
            }
            b8k0.e(null, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 12582912, 363);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxi0((byte) 20, i, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void c(ylp0 ylp0Var, mm40 mm40Var, boolean z, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        boolean z2;
        mm40 mm40Var3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        int i4;
        ylp0Var.getClass();
        fetVar.g0(1801456244);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(ylp0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar.g(mm40Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (fetVar.h(z)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i3 & 1, z2)) {
                if (i5 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarD = o7k0.d(s5x0.N(mm40Var4, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
                long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 8.0f, 8.0f, 0.0f, 8), "LOL_TEAM_STATISTICS");
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
                atm0.b(ylp0Var.b, fetVar, 0);
                hmw0.C(i3 & 896, fetVar, ylp0Var.c, null, z);
                yqm0.c(ylp0Var.d, fetVar, 0);
                ipm0.a(ylp0Var.e, fetVar, 0);
                afn0.g(ylp0Var.f, fetVar, 0);
                fetVar.r(true);
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new m8n(ylp0Var, mm40Var3, z, i, i2);
            }
        }
        i3 |= 48;
        mm40Var2 = mm40Var;
        if ((i & 384) == 0) {
            if (fetVar.h(z)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i3 & 1, z2)) {
            if (i5 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarD2 = o7k0.d(s5x0.N(mm40Var4, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
            long jM73getBlack400d7_KjU2 = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar4 = qmk.i;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarE1 = o2e.e0(s5x0.N(i120.Q(mm40VarD2, jM73getBlack400d7_KjU2, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 8.0f, 8.0f, 8.0f, 0.0f, 8), "LOL_TEAM_STATISTICS");
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            atm0.b(ylp0Var.b, fetVar, 0);
            hmw0.C(i3 & 896, fetVar, ylp0Var.c, null, z);
            yqm0.c(ylp0Var.d, fetVar, 0);
            ipm0.a(ylp0Var.e, fetVar, 0);
            afn0.g(ylp0Var.f, fetVar, 0);
            fetVar.r(true);
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m8n(ylp0Var, mm40Var3, z, i, i2);
        }
    }

    public static final void d(String str, long j, xdr xdrVar, xdr xdrVar2, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        xdr xdrVar3;
        fetVar.g0(472527397);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        int i3 = i & 384;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 |= fetVar.g(jm40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 8.0f, 5), 28.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            if (xdrVar2 == null) {
                fetVar.e0(258961238);
            } else {
                fetVar.e0(-1377119733);
                xdrVar2.F(jr8Var, fetVar, Integer.valueOf(6 | ((i2 >> 9) & 112)));
            }
            fetVar.r(false);
            int i4 = i2;
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            zx7 zx7Var2 = gqw0.e;
            mm40 mm40VarB = jr8Var.b(mm40VarY, zx7Var2);
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarK0 = q8a.k0(jm40Var, enx.f8115a);
            lw3 lw3Var = uc9.f35418a;
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarK0);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(str, o7k0.y(jm40Var, null, 3), j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar), fetVar, (i4 & 14) | 48 | ((i4 << 3) & 896), 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarL = twn.l(yx7Var, o7k0.c(jm40Var, 1.0f));
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC3, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            if (xdrVar == null) {
                fetVar2.e0(-1827062746);
                fetVar2.r(false);
                xdrVar3 = xdrVar;
            } else {
                fetVar2.e0(-1167316165);
                xdrVar3 = xdrVar;
                xdrVar3.F(jr8Var, fetVar2, Integer.valueOf(6 | ((i4 >> 6) & 112)));
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            xdrVar3 = xdrVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg(str, j, xdrVar3, xdrVar2, i);
        }
    }

    public static final void e(mm40 mm40Var, he80 he80Var, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        fetVar2.g0(-1282420156);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(he80Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarW, 4.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            nkb.h(o7k0.d(jm40.b, 1.0f), new hjm(he80Var.b, new mjm(127), null, new n0x(he80Var.f12910a), new y3d(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary()), new m0x(R.drawable.sport_new, null, 6), false, null, null, false, null, null, 8132), kjm.f18392a, null, null, null, fetVar2, 390, 56);
            b = 1;
            v8q0.a(he80Var.c, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 3, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 24576, 114686);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, he80Var, i, b);
        }
    }

    public static final void f(mm40 mm40Var, g7t0 g7t0Var, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        function1.getClass();
        fetVar.g0(499004707);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(g7t0Var) : fetVar.i(g7t0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var3 = i4 != 0 ? jm40.b : mm40Var2;
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var3);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(x7zVar, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.c;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(g7t0Var.f10833a), true, false, false);
            int i5 = i3 & 896;
            boolean z = i5 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new nas0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar, 0, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            wul wulVar2 = new wul(iul.e, oe9Var, new ue9(g7t0Var.b), true, false, false);
            boolean z2 = i5 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new nas0(function1, (byte) 21);
                fetVar.o0(objP2);
            }
            qzb.n(mm40VarN2, wulVar2, (Function0) objP2, fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040(mm40Var3, (Object) g7t0Var, (Object) function1, i, i2, (byte) 19);
        }
    }

    public static final List g(vxt0 vxt0Var, m9s m9sVar) {
        if (vxt0Var == null) {
            return iun.f15405a;
        }
        qrh qrhVar = vxt0Var.c;
        d0u0 d0u0Var = vxt0Var.f38218a;
        lc00 lc00VarB = kotlin.collections.a.b();
        c0o c0oVar = c0u0.c;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            c0u0 c0u0Var = (c0u0) y2VarH.next();
            int iOrdinal = c0u0Var.ordinal();
            short s = c0u0Var.f3541a.f33572a;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                if (iOrdinal != 5) {
                                    t9f.b();
                                    return null;
                                }
                                if (x2x.b0(vxt0Var.d, m9sVar)) {
                                    lc00VarB.add(Integer.valueOf(s));
                                }
                            } else if (ofm0.s(qrhVar)) {
                                lc00VarB.add(Integer.valueOf(s));
                            }
                        } else if (ofm0.q(qrhVar)) {
                            lc00VarB.add(Integer.valueOf(s));
                        }
                    } else if (ofm0.r(d0u0Var, m9sVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                } else if (ofm0.t(d0u0Var)) {
                    lc00VarB.add(Integer.valueOf(s));
                }
            } else if (ofm0.u(d0u0Var)) {
                lc00VarB.add(Integer.valueOf(s));
            }
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final void h(View view, sa80 sa80Var) {
        view.getClass();
        sa80Var.getClass();
        view.setRotation(sa80Var.f31879a);
        view.animate().rotation(sa80Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
    public static final y6p0 i(long j, String str, List list) {
        List<String> list2;
        String str2;
        ?? arrayList;
        String strValueOf;
        String str3;
        String str4;
        char c;
        String strValueOf2 = j == 0 ? "" : String.valueOf(j);
        boolean z = true;
        boolean z2 = false;
        if (!list.isEmpty()) {
            list2 = list;
            str2 = (String) list2.get(0);
            str2.getClass();
            if (!kotlin.text.c.x(str2, ujn.h, false)) {
                if (str2.length() != 0) {
                    List list3 = u0d.f34849a;
                    if (!u0d.c(str2)) {
                        str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                    }
                }
            }
            if (list2.size() > 1) {
                arrayList = new ArrayList();
                for (String str5 : list2) {
                    if (j == 0) {
                        strValueOf = "";
                    } else {
                        strValueOf = String.valueOf(j);
                    }
                    str5.getClass();
                    if (kotlin.text.c.x(str5, ujn.h, z2)) {
                        str3 = str5;
                    } else {
                        if (str5.length() != 0) {
                            List list4 = u0d.f34849a;
                            if (u0d.c(str5)) {
                                if (StringsKt.O(str5, "playerlogo/", z)) {
                                    str4 = "%s/%s";
                                } else {
                                    str4 = "%s/playerlogo/%s";
                                }
                                Locale locale = Locale.ENGLISH;
                                Object[] objArr = {ujn.h, str5};
                                c = 2;
                                str3 = String.format(locale, str4, Arrays.copyOf(objArr, 2));
                            }
                            arrayList.add(new y6p0(iun.f15405a, strValueOf, str, str3));
                            z = true;
                            z2 = false;
                        }
                        str3 = "";
                    }
                    c = 2;
                    arrayList.add(new y6p0(iun.f15405a, strValueOf, str, str3));
                    z = true;
                    z2 = false;
                }
            } else {
                arrayList = iun.f15405a;
            }
            return new y6p0(arrayList, strValueOf2, str, str2);
        }
        list2 = list;
        str2 = "";
        if (list2.size() > 1) {
            arrayList = new ArrayList();
            while (r5.hasNext()) {
                if (j == 0) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(j);
                }
                str5.getClass();
                if (kotlin.text.c.x(str5, ujn.h, z2)) {
                    str3 = str5;
                } else {
                    if (str5.length() != 0) {
                        List list5 = u0d.f34849a;
                        if (u0d.c(str5)) {
                            if (StringsKt.O(str5, "playerlogo/", z)) {
                                str4 = "%s/%s";
                            } else {
                                str4 = "%s/playerlogo/%s";
                            }
                            Locale locale2 = Locale.ENGLISH;
                            Object[] objArr2 = {ujn.h, str5};
                            c = 2;
                            str3 = String.format(locale2, str4, Arrays.copyOf(objArr2, 2));
                        }
                        arrayList.add(new y6p0(iun.f15405a, strValueOf, str, str3));
                        z = true;
                        z2 = false;
                    }
                    str3 = "";
                }
                c = 2;
                arrayList.add(new y6p0(iun.f15405a, strValueOf, str, str3));
                z = true;
                z2 = false;
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new y6p0(arrayList, strValueOf2, str, str2);
    }

    public static final j1r0 j(f0r0 f0r0Var) {
        return f0r0Var.a() instanceof i1r0 ? d1r0.f5324a : f0r0Var.a();
    }

    public static int k(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        jf4.o(twn.m(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final y0n l(pws0 pws0Var) {
        pws0Var.getClass();
        return new y0n(0, pws0Var.b, pws0Var.f27726a);
    }

    public static final y0n m(uws0 uws0Var) {
        String str = uws0Var.f36408a;
        return new y0n(uws0Var.b, uws0Var.c, str);
    }

    public static final z0n n(qws0 qws0Var) {
        qws0Var.getClass();
        return new z0n(qws0Var.f29450a, 0, "", "", "", false, false, false);
    }

    public static final z0n o(vws0 vws0Var) {
        return new z0n(vws0Var.f38169a, vws0Var.b, vws0Var.c, vws0Var.d, vws0Var.e, vws0Var.f, vws0Var.g, vws0Var.h);
    }

    public static final a1n p(rws0 rws0Var) {
        rws0Var.getClass();
        return new a1n(rws0Var.f31231a, rws0Var.b, 0, "", "", "", false, false, false);
    }

    public static final a1n q(wws0 wws0Var) {
        return new a1n(wws0Var.f39900a, wws0Var.b, wws0Var.c, wws0Var.d, wws0Var.e, wws0Var.f, wws0Var.g, wws0Var.h, wws0Var.i);
    }

    public static final b1n r(sws0 sws0Var) {
        sws0Var.getClass();
        return new b1n(0, sws0Var.b, sws0Var.f32939a);
    }

    public static final c1n s(tws0 tws0Var) {
        tws0Var.getClass();
        return new c1n(0, tws0Var.b, tws0Var.f34667a);
    }

    public static final vcm0 t(l9s l9sVar) {
        Integer intOrNull;
        Integer intOrNull2;
        l9sVar.getClass();
        cno0 cno0Var = (cno0) CollectionsKt.firstOrNull(l9sVar.P());
        bno0 bno0Var = null;
        Object obj = null;
        if (cno0Var != null) {
            for (Object obj2 : cno0Var.f4666a) {
                if (((bno0) obj2).f2894a == ano0.c) {
                    obj = obj2;
                    break;
                }
            }
            bno0Var = (bno0) obj;
        }
        String strR = kotlin.text.c.r(l9sVar.h(), "-", " : ", false);
        List listSplit$default = StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 2, 2, null);
        ArrayList arrayList = new ArrayList(r3d.q(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.u0((String) it.next()).toString());
        }
        String strI = l9sVar.i();
        long jC = l9sVar.c();
        String strN = l9sVar.N();
        long jG = znq0.g(l9sVar.u());
        Long l = (Long) CollectionsKt.firstOrNull(l9sVar.p());
        y6p0 y6p0VarI = i(l != null ? l.longValue() : 0L, l9sVar.j(), l9sVar.G());
        Long l2 = (Long) CollectionsKt.firstOrNull(l9sVar.m());
        y6p0 y6p0VarI2 = i(l2 != null ? l2.longValue() : 0L, l9sVar.g(), l9sVar.v());
        String str = (String) CollectionsKt.firstOrNull(arrayList);
        String str2 = str == null ? "0" : str;
        String str3 = (String) CollectionsKt.f0(arrayList);
        String str4 = str3 == null ? "0" : str3;
        int iIntValue = (bno0Var == null || (intOrNull2 = StringsKt.toIntOrNull(bno0Var.c)) == null) ? 0 : intOrNull2.intValue();
        int iIntValue2 = (bno0Var == null || (intOrNull = StringsKt.toIntOrNull(bno0Var.d)) == null) ? 0 : intOrNull.intValue();
        boolean zE = l9sVar.e();
        String strO = l9sVar.o();
        boolean zE2 = l9sVar.E();
        boolean zE3 = l9sVar.e();
        String str5 = (String) CollectionsKt.firstOrNull(arrayList);
        String str6 = str5 == null ? "0" : str5;
        String str7 = (String) CollectionsKt.f0(arrayList);
        return new vcm0(strI, jC, strN, jG, strR, str2, str4, y6p0VarI, y6p0VarI2, iIntValue, iIntValue2, zE, strO, zE2, zE3, str6, str7 == null ? "0" : str7);
    }

    public static final y6p0 u(ufp0 ufp0Var) {
        String str = ufp0Var.f35586a;
        String str2 = ufp0Var.b;
        String str3 = ufp0Var.d;
        List<y3n0> list = ufp0Var.e;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (y3n0 y3n0Var : list) {
            y3n0Var.getClass();
            str.getClass();
            arrayList.add(new y6p0(iun.f15405a, str, y3n0Var.f41961a, y3n0Var.b));
        }
        return new y6p0(arrayList, str, str2, str3);
    }

    public static final acs0 v(m0k0 m0k0Var) {
        m0k0Var.getClass();
        long j = m0k0Var.Y;
        long j2 = m0k0Var.f20959a;
        long j3 = m0k0Var.B;
        boolean z = m0k0Var.x;
        long j4 = m0k0Var.z;
        String str = m0k0Var.s;
        String strB = m0k0Var.b();
        String str2 = m0k0Var.t;
        long j5 = m0k0Var.y;
        String str3 = m0k0Var.b;
        long j6 = m0k0Var.c;
        String str4 = m0k0Var.d;
        String str5 = m0k0Var.e;
        String str6 = m0k0Var.f;
        return new acs0(j, j2, j3, z, j4, str, strB, str2, j5, str3, j6, str4, str5, m0k0Var.g, m0k0Var.h, m0k0Var.i, m0k0Var.l, m0k0Var.u, m0k0Var.v, m0k0Var.A, m0k0Var.Z, str6, m0k0Var.j, Boolean.valueOf(m0k0Var.g1));
    }

    public static void w(int i, int i2) {
        String strX;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strX = qem0.x("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    jf4.o(b1j.h(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strX = qem0.x("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strX);
        }
    }

    public static void x(int i, int i2, int i3) {
        String strY;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strY = y(i, i3, "start index");
            } else {
                strY = (i2 < 0 || i2 > i3) ? y(i2, i3, "end index") : qem0.x("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strY);
        }
    }

    public static String y(int i, int i2, String str) {
        if (i < 0) {
            return qem0.x("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return qem0.x("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        jf4.o(b1j.h(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
