package a;

import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParserException;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j5n0 {
    public static final String A(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? ntm0.b(CollectionsKt.b0(collection, ",\n", Separators.RETURN, Separators.RETURN, null, 56)).concat("},") : " }";
    }

    public static final boolean B(XmlResourceParser xmlResourceParser) {
        return xmlResourceParser.getEventType() == 1 || (xmlResourceParser.getDepth() < 1 && xmlResourceParser.getEventType() == 3);
    }

    public static final void C(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int next = xmlResourceParser.next();
        while (next != 2 && next != 1) {
            next = xmlResourceParser.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
    }

    public static boolean D(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void a(final xk80 xk80Var, final boolean z, final int i, final Function0 function0, fet fetVar, final int i2) {
        int i3;
        boolean z2;
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(1911108916);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xk80Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (i == 1) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                final boolean z3 = z2;
                function2 = new Function2() { // from class: a.tev0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b) {
                            case 0:
                                ((Integer) obj2).intValue();
                                j5n0.a(xk80Var, z3, i, function0, (fet) obj, x8x.L(i2 | 1));
                                break;
                            default:
                                ((Integer) obj2).intValue();
                                j5n0.a(xk80Var, z3, i, function0, (fet) obj, x8x.L(i2 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                int i4 = i3 & 112;
                boolean z4 = i4 == 32;
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (z4 || objP == obj) {
                    objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP);
                }
                pz40 pz40Var = (pz40) objP;
                Object obj2 = xk80Var.p;
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zG = ((i3 & 7168) == 2048) | fetVar.g(obj2) | fetVar.g(pz40Var);
                Object objP2 = fetVar.P();
                yje yjeVar = null;
                if (zG || objP2 == obj) {
                    objP2 = new npu0(obj2, (Object) function0, (Object) pz40Var, yjeVar, (byte) 17);
                    fetVar.o0(objP2);
                }
                m0x0.v(obj2, boolValueOf, (Function2) objP2, fetVar);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                Boolean bool = (Boolean) pz40Var.getValue();
                bool.booleanValue();
                boolean zG2 = fetVar.g(pz40Var) | (i4 == 32) | ((i3 & 14) == 4);
                Object objP3 = fetVar.P();
                if (zG2 || objP3 == obj) {
                    Object lvVar = new lv(z, (Object) xk80Var, (Object) pz40Var, yjeVar, (byte) 14);
                    fetVar.o0(lvVar);
                    objP3 = lvVar;
                }
                m0x0.v(boolValueOf2, bool, (Function2) objP3, fetVar);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2() { // from class: a.tev0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    switch (b2) {
                        case 0:
                            ((Integer) obj4).intValue();
                            j5n0.a(xk80Var, z, i, function0, (fet) obj3, x8x.L(i2 | 1));
                            break;
                        default:
                            ((Integer) obj4).intValue();
                            j5n0.a(xk80Var, z, i, function0, (fet) obj3, x8x.L(i2 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void b(mm40 mm40Var, xk80 xk80Var, int i, fet fetVar, int i2) {
        fet fetVar2;
        mm40 mm40Var2;
        xk80 xk80Var2 = xk80Var;
        int i3 = i;
        fetVar.g0(-1029617027);
        int i4 = i2 | 6 | (fetVar.g(xk80Var2) ? 32 : 16) | (fetVar.e(i3) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new x9c(xk80Var2, i3, (byte) 12));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            fetVar.b0(-1619476282, fetVar.G(Integer.valueOf(((Number) l7m0Var.getValue()).intValue()), Integer.valueOf(i3)));
            int iIntValue = ((Number) l7m0Var.getValue()).intValue();
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new y02(i3, (byte) 6);
                fetVar.o0(objP2);
            }
            kwj kwjVarB = zk80.b(iIntValue, (Function0) objP2, fetVar, 0, 2);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zG = ((i4 & 112) == 32) | fetVar.g(kwjVarB) | (i5 == 256);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                d21 d21Var = new d21((Object) kwjVarB, (Object) xk80Var2, i3, (yje) null, (byte) 19);
                fetVar.o0(d21Var);
                objP3 = d21Var;
            }
            m0x0.v(kwjVarB, numValueOf, (Function2) objP3, fetVar);
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13);
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
            fetVar2 = fetVar;
            n1i.a(null, kwjVarB, smm.b, null, fetVar2, 384, 9);
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            xk80Var2 = xk80Var2;
            i3 = i3;
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0(mm40Var2, xk80Var2, i3, i2);
        }
    }

    public static final void c(mm40 mm40Var, xcz xczVar, pz40 pz40Var, lh80 lh80Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1279274716);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(pz40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(lh80Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            float fB0 = f7k.b0(fetVar);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "EVENT_CARD_LAZY_ROW");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zD = ((i2 & 7168) == 2048) | ((458752 & i2) == 131072) | fetVar.d(fB0);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new tb90(pz40Var, ugdVar, fB0, b);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, xczVar, lh80Var, false, qw3Var, null, null, true, null, (Function1) objP, fetVar, ((i2 << 15) & 29360128) | (i2 & 112) | ((i2 >> 6) & 896), 360);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p4t0(mm40Var, xczVar, pz40Var, lh80Var, ugdVar, i, (byte) 0);
        }
    }

    public static final void d(mm40 mm40Var, String str, ux3 ux3Var, long j, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        long coefLower;
        fet fetVar2 = fetVar;
        fetVar2.g0(1515658867);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.e(ux3Var.ordinal()) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024);
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            if (ux3Var == ux3.UP) {
                fetVar2.e0(2309145);
                coefLower = ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefHigher();
                fetVar2.r(false);
            } else {
                fetVar2.e0(2368634);
                coefLower = ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefLower();
                fetVar2.r(false);
            }
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            dww.c(iom0.r(jpm0.t(ux3Var.f36421a, 6, fetVar2), fetVar2), null, o7k0.n(jm40Var, 14.0f), coefLower, fetVar2, 56, 0);
            v8q0.a(str, o7k0.d(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), coefLower, null, j, null, null, null, 0L, null, 0L, 2, false, 5, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, ((i5 >> 3) & 14) | ((i5 << 3) & 57344), 24960, 110568);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i5n0(mm40Var2, str, ux3Var, j, i, i2, (byte) 0);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, String str, String str2) {
        fetVar.g0(286804267);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.g(mm40Var) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            int i3 = i2 << 3;
            m(rsm0.w(R.string.toto_pool_from, 0, fetVar), str, str2, s5x0.N(x7zVar, 0.0f, 0.0f, 2.0f, 0.0f, 11), null, 0L, fetVar, (i3 & 112) | 3072 | (i3 & 896));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            r((i2 >> 3) & 112, fetVar, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 2.0f, 0.0f, 0.0f, 0.0f, 14), l7m0Var);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 21, i, str, str2, l7m0Var, mm40Var);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fetVar.g0(532048174);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mbc.k(rsm0.w(R.string.toto_tiraj, 0, fetVar), str, 5, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, 0L, fetVar, (i2 << 3) & 112);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mbc.k(rsm0.w(R.string.toto_accept_bets_to, 0, fetVar), str2, 6, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, 0L, fetVar, i2 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(str, str2, mm40Var, i, (byte) 28);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1459330486);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(o7k0.w(mm40Var, null, false, 3), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_cyber_cs2_cup, 0, fetVar2);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, twn.l(gqw0.k, o7k0.n(jm40Var, 32.0f)), jM130getWhite600d7_KjU, fetVar2, 56, 0);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
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
            v8q0.a(rsm0.w(R.string.toto_jackpot, 0, fetVar2), o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 28032, 102396);
            qxw.o(fetVar, o7k0.e(jm40Var, 2.0f));
            str2 = str;
            kc5.N(str2, null, 0L, null, null, 0L, qmk.q, g1t0.j().f42262a.b, null, null, 0L, gqw0.d, 2, false, 1, 0, false, null, y9q0.a(g1t0.j(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), 0.0f, fetVar, i2 & 14, 1600512, 0, 3055422);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(str2, mm40Var, i, (byte) 9);
        }
    }

    public static final void h(mm40 mm40Var, pz40 pz40Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(110481205);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            g9q0 g9q0VarN = pym0.n(fetVar);
            String str = ((r5n0) pz40Var.getValue()).f29896a;
            String str2 = ((r5n0) pz40Var.getValue()).b.f24749a;
            ux3 ux3Var = ((r5n0) pz40Var.getValue()).b.b;
            boolean zG = fetVar.g(str) | fetVar.g(str2) | fetVar.g(g9q0VarN) | fetVar.e(ux3Var.ordinal());
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                stl0 stl0Var = new stl0((Object) str, (Object) str2, (Object) g9q0VarN, (Object) ux3Var, (byte) 6);
                fetVar.o0(stl0Var);
                objP = stl0Var;
            }
            x4n0.a(mm40Var, (Function2) objP, fetVar, i2 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0(mm40Var, pz40Var, i, b);
        }
    }

    public static final void i(mm40 mm40Var, y4p0 y4p0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        y4p0 y4p0Var2 = y4p0Var;
        fet fetVar2 = fetVar;
        y4p0Var2.getClass();
        function1.getClass();
        fetVar2.g0(-1045683181);
        int i2 = i | 6 | (fetVar2.g(y4p0Var2) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new o0k0((Object) function1, (Object) y4p0Var2, (byte) 27);
                fetVar2.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, null, null, false, null, (Function0) objP, 28);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarN = o7k0.n(i120.Q(jm40Var, s6t0.b().f33626a.getBackgroundGroupSecondary(), vgg0.a(16.0f)), 56.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_glyph_placeholder_team, 0, fetVar2), new m78(s6t0.b().f33626a.getSecondary60(), 5), null, 10);
            mm40Var2 = jm40Var;
            k7x.b(y4p0Var2.b, null, o7k0.n(jm40Var, 40.0f), oilVarT, oilVarT, null, null, null, null, null, null, null, fetVar2, 36912, 0, 32736);
            fetVar2.r(true);
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var2, 24.0f), 56.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            y4p0Var2 = y4p0Var;
            v8q0.a(y4p0Var2.c, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var2, y4p0Var2, function1, i, (byte) 12);
        }
    }

    public static final void j(rkp0 rkp0Var, Function1 function1, fet fetVar, int i) {
        byte b;
        pcy pcyVar;
        rkp0 rkp0Var2 = rkp0Var;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(1787062687);
        int i2 = i | (fetVar2.g(rkp0Var2) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(i120.Q(o7k0.e(mm40VarD, 36.0f), rkp0Var2.i, jd8.n), xfn.a(fetVar2).d, 0.0f, 2);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new yip0(function1, rkp0Var2, b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarL, false, null, null, (Function0) objP, 15);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarY);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.05f, jm40Var, true);
            String str = rkp0Var2.b;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarA, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            mm40 mm40VarA2 = zhg0Var.a(0.52f, jm40Var, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA2);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            pcy pcyVar3 = pcyVar;
            v8q0.a(rkp0Var.c, s5x0.L(o7k0.s(jm40Var, 128.0f), 8.0f, 0.0f, 2), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            v8q0.a(rkp0Var.d, zhg0Var.a(1.0f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar.r(true);
            v8q0.a(rkp0Var.e, zhg0Var.a(0.19f, jm40Var, true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            mm40 mm40VarA3 = zhg0Var.a(0.24f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
            thg0 thg0VarA3 = shg0.a(uc9.g, yx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(rkp0Var.f, o7k0.s(jm40Var, 16.0f), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            v8q0.a(rkp0Var.h, o7k0.s(jm40Var, 16.0f), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            rkp0Var2 = rkp0Var;
            b = 3;
            v8q0.a(rkp0Var2.g, o7k0.s(jm40Var, 16.0f), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0(rkp0Var2, function1, i, b);
        }
    }

    public static final void k(mm40 mm40Var, m9q0 m9q0Var, Function1 function1, fet fetVar, int i) {
        m9q0Var.getClass();
        function1.getClass();
        fetVar.g0(187358634);
        int i2 = i | (fetVar.g(m9q0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            s6q0 s6q0Var = m9q0Var.b;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b8q0((Object) function1, (Object) m9q0Var, (byte) 5);
                fetVar.o0(objP);
            }
            jwb.o(mm40Var, s6q0Var, 0, null, (Function1) objP, fetVar, 6, 12);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, m9q0Var, function1, i, (byte) 16);
        }
    }

    public static final void l(mm40 mm40Var, String str, String str2, int i, y9q0 y9q0Var, y9q0 y9q0Var2, fet fetVar, int i2) {
        String str3;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-61305210);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str3 = str2;
            i3 |= fetVar2.g(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(y9q0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.g(y9q0Var2) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar2.Z();
            int i4 = i2 & 1;
            jm40 jm40Var = jm40.b;
            if (i4 == 0 || fetVar2.B()) {
                mm40Var2 = jm40Var;
            } else {
                fetVar2.X();
                mm40Var2 = mm40Var;
            }
            fetVar2.s();
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = mu90.m;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i5 = (i3 >> 9) & 14;
            mm40Var = mm40Var2;
            int i6 = i3;
            v8q0.a(str, mrv.k0(jm40Var, "title"), 0L, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 1, 0, null, y9q0Var, fetVar2, ((i3 >> 3) & 14) | 48, i5 | 28032 | ((i3 << 9) & 29360128), 101372);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
            v8q0.a(str3, mrv.k0(jm40Var, "timer"), 0L, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 0, false, 1, 0, null, y9q0Var2, fetVar2, ((i6 >> 6) & 14) | 48, i5 | 27648 | ((i6 << 6) & 29360128), 105468);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        mm40 mm40Var3 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnr0(mm40Var3, str, str2, i, y9q0Var, y9q0Var2, i2, (byte) 0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void m(String str, String str2, String str3, mm40 mm40Var, y9q0 y9q0Var, long j, fet fetVar, int i) {
        int i2;
        String str4;
        y9q0 y9q0Var2;
        long j2;
        fet fetVar2;
        int i3;
        y9q0 y9q0VarA;
        long j3;
        int i4;
        int i5;
        fet fetVar3 = fetVar;
        zx7 zx7Var = gqw0.d;
        fetVar3.g0(1320963229);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str3;
            i2 |= fetVar3.g(str4) ? 256 : 128;
        } else {
            str4 = str3;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.g(zx7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar3.g(mm40Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= 524288;
        }
        if (fetVar3.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar3.Z();
            if ((i & 1) == 0 || fetVar3.B()) {
                i3 = i2 & (-4128769);
                y9q0VarA = y9q0.a(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), StaticColors.INSTANCE.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                j3 = qmk.o;
            } else {
                fetVar3.X();
                i3 = i2 & (-4128769);
                y9q0VarA = y9q0Var;
                j3 = j;
            }
            fetVar3.s();
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (zx7Var.equals(gqw0.f11754a) || zx7Var.equals(zx7Var) || zx7Var.equals(gqw0.g)) {
                i4 = 5;
            } else if (zx7Var.equals(gqw0.b) || zx7Var.equals(gqw0.e) || zx7Var.equals(gqw0.h)) {
                i4 = 3;
            } else {
                if (zx7Var.equals(gqw0.c) || zx7Var.equals(gqw0.f) || zx7Var.equals(gqw0.i)) {
                    i4 = 6;
                } else {
                    i5 = 0;
                }
                y9q0 y9q0VarG = g1t0.g();
                StaticColors staticColors = StaticColors.INSTANCE;
                l(null, str, str2, i5, y9q0.a(y9q0VarG, staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.d(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar3, (i3 << 3) & 1008);
                zcl zclVar = qmk.f28987a;
                qxw.o(fetVar3, o7k0.e(jm40.b, 2.0f));
                y9q0 y9q0Var3 = y9q0VarA;
                kc5.N(str4, null, 0L, null, null, 0L, j3, y9q0VarA.f42262a.b, null, null, 0L, zx7Var, 0, false, 1, 0, false, null, y9q0Var3, 0.0f, fetVar, (i3 >> 6) & 14, (i3 & 7168) | 1572864, 0, 3071806);
                fet fetVar4 = fetVar;
                fetVar4.r(true);
                j2 = j3;
                y9q0Var2 = y9q0Var3;
                fetVar2 = fetVar4;
            }
            i5 = i4;
            y9q0 y9q0VarG2 = g1t0.g();
            StaticColors staticColors2 = StaticColors.INSTANCE;
            l(null, str, str2, i5, y9q0.a(y9q0VarG2, staticColors2.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.d(), staticColors2.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar3, (i3 << 3) & 1008);
            zcl zclVar2 = qmk.f28987a;
            qxw.o(fetVar3, o7k0.e(jm40.b, 2.0f));
            y9q0 y9q0Var4 = y9q0VarA;
            kc5.N(str4, null, 0L, null, null, 0L, j3, y9q0VarA.f42262a.b, null, null, 0L, zx7Var, 0, false, 1, 0, false, null, y9q0Var4, 0.0f, fetVar, (i3 >> 6) & 14, (i3 & 7168) | 1572864, 0, 3071806);
            fet fetVar5 = fetVar;
            fetVar5.r(true);
            j2 = j3;
            y9q0Var2 = y9q0Var4;
            fetVar2 = fetVar5;
        } else {
            fetVar3.X();
            y9q0Var2 = y9q0Var;
            j2 = j;
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pnr0(str, str2, str3, mm40Var, y9q0Var2, j2, i, (byte) 0);
        }
    }

    public static final void n(mm40 mm40Var, x00 x00Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(998060671);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(x00Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 38.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            lgb.s(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 6.0f, 5), x00Var.f40044a, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2);
            v8q0.a(x00Var.b, s5x0.N(new x7z(1.0f, true), 8.0f, 6.0f, 0.0f, 4.0f, 4), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) mm40Var, (Object) x00Var, i, (byte) 18);
        }
    }

    public static final void o(mm40 mm40Var, tnr0 tnr0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1408888166);
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i | (fetVar2.g(tnr0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40VarE = ydx.E(tnr0Var.e, "", null, fetVar2, 48, 2);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, jM75getBlack600d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            g(0, fetVar2, s5x0.N(jm40Var, 12.0f, 0.0f, 16.0f, 0.0f, 10), tnr0Var.f34250a);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            mbc.o(wfi0.f39073a, o7k0.e(jm40Var, 1.0f), false, fetVar2, 6, 4);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            f(0, fetVar2, o7k0.w(o7k0.d(s5x0.L(jm40Var, 12.0f, 0.0f, 2), 1.0f), null, false, 3), tnr0Var.b, tnr0Var.c);
            qxw.o(fetVar2, o7k0.e(jm40Var, 12.0f));
            e(0, fetVar2, o7k0.w(o7k0.d(s5x0.L(jm40Var, 12.0f, 0.0f, 2), 1.0f), null, false, 3), pz40VarE, tnr0Var.d, tnr0Var.f);
            fetVar2 = fetVar2;
            rz4.t(jm40Var, 12.0f, fetVar2, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) mm40Var, (Object) tnr0Var, i, (byte) 26);
        }
    }

    public static final void p(dus0 dus0Var, fet fetVar, int i) {
        fetVar.g0(1611768423);
        int i2 = (fetVar.g(dus0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            float f = dus0Var.g;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = dus0Var.f6712a;
            String str2 = dus0Var.b;
            String str3 = dus0Var.c;
            mm40 mm40VarN = s5x0.N(jm40Var, dus0Var.h, 0.0f, 0.0f, 0.0f, 14);
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            k5n0.m(str, str2, str3, dus0Var.e, dus0Var.f, jr8Var.b(mm40VarN, zx7Var), fetVar, 0);
            v2n0.i(0, fetVar, dus0Var.d, o2e.e0(jr8Var.b(jm40Var, gqw0.e), "TWENTY_ONE_DOTA_CARD"));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p6r0(dus0Var, i, (byte) 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.mm40] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void q(mm40 mm40Var, q4t0 q4t0Var, xcz xczVar, lh80 lh80Var, Function1 function1, fet fetVar, int i, int i2) {
        xczVar.getClass();
        function1.getClass();
        int i3 = i2 & 1;
        Object obj = jm40.b;
        ?? r0 = i3 != 0 ? obj : mm40Var;
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            fetVar.o0(obj);
        } else {
            obj = objP;
        }
        mm40 mm40Var2 = (mm40) obj;
        y3t0 y3t0Var = q4t0Var.b;
        a4x a4xVar = q4t0Var.c;
        int iOrdinal = y3t0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw b1j.f(1719672506, fetVar, false);
            }
            fetVar.e0(1770858834);
            c(r0, xczVar, androidx.compose.runtime.e.f(a4xVar, fetVar), lh80Var, u1c.M(-1739806919, new n82(mm40Var2, q4t0Var, function1, (byte) 26), fetVar), fetVar, (i & 14) | 196608 | ((i >> 6) & 112) | (i & 57344));
            fetVar.r(false);
            return;
        }
        fetVar.e0(1770289178);
        mm40 mm40VarI = s5x0.I(r0, lh80Var);
        zcl zclVar = qmk.f28987a;
        x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
        Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1872606351, a4xVar);
        while (itO.hasNext()) {
            mm40 mm40Var3 = mm40Var2;
            feb.h(mm40Var3, (grh) itO.next(), q4t0Var.d, function1, fetVar, ((i >> 6) & 7168) | 6);
            mm40Var2 = mm40Var3;
        }
        ohs0.x(fetVar, false, true, false);
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        int i2;
        fetVar.g0(1386469045);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mbc.k(rsm0.w(R.string.toto_till_end, 0, fetVar), (String) l7m0Var.getValue(), 6, mm40Var, null, null, 0L, fetVar, (i2 << 9) & 7168);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf4(mm40Var, l7m0Var, i, b);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-2128275035);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 56.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            vqm vqmVar = vqm.b;
            qxw.o(fetVar, xbc.c0(mm40VarE, vbc.d0(vqmVar, fetVar, 6, 0)));
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.n(jm40Var, 56.0f)), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, true);
            mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 256.0f), 120.0f);
            zcl zclVar3 = qmk.k;
            h97.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE2), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, (byte) 29);
        }
    }

    public static final void t(xk80 xk80Var, final a4x a4xVar, final Function1 function1, fet fetVar, int i) {
        xk80 xk80Var2;
        int i2;
        fetVar.g0(-21062617);
        if ((i & 6) == 0) {
            xk80Var2 = xk80Var;
            i2 = (fetVar.g(xk80Var2) ? 4 : 2) | i;
        } else {
            xk80Var2 = xk80Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            final int size = a4xVar.size();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new zsf(0.42f, 0.0f, 0.58f, 1.0f);
                fetVar.o0(objP);
            }
            final zsf zsfVar = (zsf) objP;
            final xk80 xk80Var3 = xk80Var2;
            q5x.e(xk80Var, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-365345240, new ydr() { // from class: a.sev0
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    fet fetVar2 = (fet) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((rk80) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= fetVar2.e(iIntValue) ? 32 : 16;
                    }
                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        int i4 = size;
                        int i5 = iIntValue % i4;
                        xk80 xk80Var4 = xk80Var3;
                        boolean z = xk80Var4.k() % i4 == i5;
                        float f = z ? 1.0f : 0.0f;
                        zsf zsfVar2 = zsfVar;
                        boolean z2 = z;
                        l7m0 l7m0VarB = d43.b(f, ro4.m0(350, 0, zsfVar2, 2), "ScaleAnimation", null, fetVar2, 3120, 20);
                        l7m0 l7m0VarB2 = d43.b(z2 ? 1.0f : 0.0f, ro4.m0(350, 0, zsfVar2, 2), "AlphaAnimation", null, fetVar2, 3120, 20);
                        boolean zG = fetVar2.g(xk80Var4) | ((iIntValue2 & 112) == 32) | fetVar2.g(l7m0VarB) | fetVar2.g(l7m0VarB2);
                        Object objP2 = fetVar2.P();
                        cl5 cl5Var = ukd.f35823a;
                        if (zG || objP2 == cl5Var) {
                            objP2 = new ec3(xk80Var4, iIntValue, l7m0VarB, l7m0VarB2, (byte) 14);
                            fetVar2.o0(objP2);
                        }
                        mm40 mm40VarE0 = o2e.e0(i4w0.T(jm40.b, (Function1) objP2), "WIDGET_EVENT_ITEM");
                        a4x a4xVar2 = a4xVar;
                        rdv0 rdv0Var = (rdv0) a4xVar2.get(i5);
                        Function1 function2 = function1;
                        boolean zG2 = fetVar2.g(function2) | fetVar2.g(a4xVar2) | fetVar2.e(i5);
                        Object objP3 = fetVar2.P();
                        if (zG2 || objP3 == cl5Var) {
                            objP3 = new zwl0((byte) 1, i5, a4xVar2, function2);
                            fetVar2.o0(objP3);
                        }
                        iym0.k(mm40VarE0, rdv0Var, (Function0) objP3, fetVar2, 0, 0);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, i3 & 14, 27648, 8190);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(xk80Var, a4xVar, function1, i, (byte) 28);
        }
    }

    public static final void u(mm40 mm40Var, aev0 aev0Var, boolean z, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        boolean z2;
        Function0 function3;
        Function1 function4;
        yfe0 yfe0VarU;
        rev0 rev0Var;
        a4x a4xVar = aev0Var.c;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1726298918);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(aev0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            function3 = function0;
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        } else {
            function3 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            int size = a4xVar.size();
            if (size == 0) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    rev0Var = new rev0(mm40Var, aev0Var, z2, function3, function1, function2, i, (byte) 1);
                }
            } else {
                function4 = function2;
                boolean zE = fetVar.e(size);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zE || objP == cl5Var) {
                    objP = Integer.valueOf(5000 - (5000 % size));
                    fetVar.o0(objP);
                }
                int iIntValue = ((Number) objP).intValue();
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new y9v0((byte) 3);
                    fetVar.o0(objP2);
                }
                kwj kwjVarB = zk80.b(iIntValue, (Function0) objP2, fetVar, 384, 2);
                a(kwjVarB, z, size, function0, fetVar, ((i3 >> 3) & 112) | (i3 & 7168));
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40Var, 8.0f, 0.0f, 2);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
                mkd.c0.getClass();
                fetVar.i0();
                boolean z3 = fetVar.S;
                pcy pcyVar = e7z.u1;
                if (z3) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(fetVar, thg0VarA, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar, numValueOf, shdVar3);
                jpm0.n(fetVar);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar, mm40VarC0, shdVar4);
                jm40 jm40Var = jm40.b;
                y860.o((i3 >> 6) & 896, fetVar, s5x0.N(o7k0.e(jm40Var, 120.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), aev0Var.b, function1);
                mm40 mm40VarS = o7k0.s(jm40Var, 256.0f);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                t(kwjVarB, a4xVar, function4, fetVar, (i3 >> 9) & 896);
                b(null, kwjVarB, size, fetVar, 0);
                fetVar.r(true);
                fetVar.r(true);
            }
            yfe0VarU.d = rev0Var;
        }
        function4 = function2;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            rev0Var = new rev0(mm40Var, aev0Var, z, function0, function1, function4, i, (byte) 2);
            yfe0VarU.d = rev0Var;
        }
    }

    public static final void v(lc00 lc00Var, ctf0 ctf0Var, List list, boolean z, boolean z2) {
        ctf0Var.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            hdg hdgVar = (hdg) obj;
            if (hdgVar.c.f19849a.length() != 0 && hdgVar.f12868a.length() != 0 && hdgVar.b >= 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        lc00Var.add(u1c.B(5L, R.string.tournament_prize_pool, ctf0Var));
        int size = arrayList.size();
        List listD0 = arrayList;
        if (size <= 5) {
            lc00Var.addAll(w(arrayList, ctf0Var, z2));
            return;
        }
        if (z) {
            listD0 = CollectionsKt.D0(arrayList, 5);
        }
        lc00Var.addAll(w(listD0, ctf0Var, z2));
        lc00Var.add(new a8s0(z));
    }

    public static final ArrayList w(List list, ctf0 ctf0Var, boolean z) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            hdg hdgVar = (hdg) obj;
            ldg ldgVar = hdgVar.c;
            String str = hdgVar.f12868a;
            String str2 = ldgVar.f19849a;
            String str3 = ldgVar.b;
            int i3 = hdgVar.b;
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setGroupingSeparator('.');
            String strValueOf = String.valueOf(new DecimalFormat("#,###", decimalFormatSymbols).format(i3));
            String strConcat = z ? "$".concat(strValueOf) : strValueOf.concat("$");
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (!Character.isLetter(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            arrayList.add(new c8s0((int) (str.length() > 2 ? ctf0Var.d.f27239a.getResources().getDimension(R.dimen.text_12) : ctf0Var.d.f27239a.getResources().getDimension(R.dimen.text_16)), sb.toString(), str2, str3, strConcat, i != 0));
            i = i2;
        }
        return arrayList;
    }

    public static HashMap x(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map map) {
        boolean z2 = false;
        z1x.t("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((h55) entry.getValue()).f12463a.getWidth(), ((h55) entry.getValue()).f12463a.getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((fot0) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rational2 = (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
        if (i2 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i2 != 2) {
                    jf4.n(twn.m(i2, "Unexpected scale type: "));
                    return null;
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z3 = z ^ (i3 == 1);
            boolean z4 = i == 0 && !z3;
            boolean z5 = i == 90 && z3;
            if (z4 || z5) {
                rectF2 = rectF6;
            } else {
                boolean z6 = i == 0 && z3;
                boolean z7 = i == 270 && !z3;
                if (z6 || z7) {
                    float fCenterX = rectF2.centerX();
                    float f = fCenterX + fCenterX;
                    rectF2 = new RectF(f - rectF6.right, rectF6.top, f - rectF6.left, rectF6.bottom);
                } else {
                    boolean z8 = i == 90 && !z3;
                    boolean z9 = i == 180 && z3;
                    if (z8 || z9) {
                        float fCenterY = rectF2.centerY();
                        float f2 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f2 - rectF6.bottom, rectF6.right, f2 - rectF6.top);
                    } else {
                        boolean z10 = i == 180 && !z3;
                        if (i == 270 && z3) {
                            z2 = true;
                        }
                        if (!z10 && !z2) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z3 + " rotation " + i);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f3 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f3 - rectF6.bottom, rectF6.right, f3 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f4 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f4 - rectF7.right, rectF7.top, f4 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((fot0) entry2.getKey(), rect2);
        }
        return map3;
    }

    public static final String y(iys0 iys0Var) {
        StringBuilder sb = new StringBuilder("type: " + iys0Var);
        sb.append('\n');
        sb.append("hashCode: " + iys0Var.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + iys0Var.getClass().getCanonicalName());
        sb.append('\n');
        for (vjj vjjVarN = iys0Var.n(); vjjVarN != null; vjjVarN = vjjVarN.j()) {
            sb.append("fqName: ".concat(iek.c.n(vjjVarN)));
            sb.append('\n');
            sb.append("javaClass: " + vjjVarN.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    public static final boolean z(String str, String str2) {
        str.getClass();
        if (Intrinsics.d(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return Intrinsics.d(StringsKt.u0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }
}
