package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.DartsLiveView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wzb {
    public static final void A(n0x n0xVar, String str, fet fetVar, int i) {
        Object obj = str;
        fet fetVar2 = fetVar;
        fetVar2.g0(421837313);
        int i2 = i | (fetVar2.g(n0xVar) ? 4 : 2) | (fetVar2.g(obj) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(o7k0.e(mm40VarD, 38.0f), 4.0f, 4.0f, 8.0f, 2.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            mm40 mm40VarJ = s5x0.J(jm40Var, 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            Integer numValueOf2 = Integer.valueOf(R.drawable.ic_sport_boxing_champs_228);
            zfn zfnVar = m8m0.f21378a;
            uc9.c(mm40VarN, null, n0xVar, numValueOf2, new y3d(((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU()), new y3d(((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU()), null, gqw0.B, null, fetVar2, ((i2 << 6) & 896) | 12582912, 322);
            fetVar2.r(true);
            x7z x7zVar = new x7z(1.0f, true);
            long jM130getWhite600d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, x7zVar, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 24960, 110584);
            obj = str;
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(n0xVar, obj, i, (byte) 7);
        }
    }

    public static final void A0(dpi0 dpi0Var, qal0 qal0Var) {
        String str = qal0Var.f28401a;
        StaticColors staticColors = StaticColors.INSTANCE;
        O(dpi0Var, str, staticColors.m130getWhite600d7_KjU());
        P(dpi0Var, Separators.SP);
        String str2 = qal0Var.b;
        if (str2 != null) {
            O(dpi0Var, str2, staticColors.m130getWhite600d7_KjU());
            O(dpi0Var, Separators.COLON, staticColors.m130getWhite600d7_KjU());
        }
        String str3 = qal0Var.c;
        if (str3 != null) {
            O(dpi0Var, str3, staticColors.m130getWhite600d7_KjU());
            O(dpi0Var, Separators.COLON, staticColors.m130getWhite600d7_KjU());
        }
        String str4 = qal0Var.d;
        if (str4 != null) {
            O(dpi0Var, str4, staticColors.m130getWhite600d7_KjU());
        }
    }

    public static final void B(String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-890692295);
        int i2 = i | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 40.0f), 8.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            long jM130getWhite600d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD2, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, (i2 & 14) | 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 21, i, str);
        }
    }

    public static final String B0(byp bypVar) {
        bypVar.getClass();
        return bypVar.f3429a + " (" + E0(Float.valueOf(bypVar.b)) + Separators.RPAREN;
    }

    public static final void C(mm40 mm40Var, l0n l0nVar, fet fetVar, int i) {
        int i2;
        byte b;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-647994976);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(l0nVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 8.0f, 5);
            a2m a2mVar = l0nVar.e;
            g0n g0nVar = l0nVar.b;
            G(mm40VarN, a2mVar, l0nVar.f19211a, fetVar2, 0);
            if (g0nVar instanceof e0n) {
                fetVar2.e0(-1862990228);
                e0n e0nVar = (e0n) g0nVar;
                rcb.x(null, e0nVar.f6996a, h2m.c, e0nVar.b, e0nVar.d, null, fetVar, 384);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str = e0nVar.c;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                z = true;
                b = 0;
                v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                b = 0;
                z = true;
                if (Intrinsics.d(g0nVar, f0n.f8723a)) {
                    fetVar2.e0(-1862210888);
                    j6n.h("VAR", kro0.f18776a, null, 0, 0, fetVar2, 54, 28);
                    fetVar2.r(false);
                } else {
                    if (g0nVar != null) {
                        throw b1j.f(1048279361, fetVar2, false);
                    }
                    fetVar2.e0(-1862053098);
                    fetVar2.r(false);
                }
            }
            fetVar2.r(z);
        } else {
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n(mm40Var, l0nVar, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static final sjf C0(vjf vjfVar) {
        ?? arrayList;
        if (vjfVar == null) {
            return new sjf(0L, "", "", "", iun.f15405a);
        }
        String str = vjfVar.f37525a;
        String str2 = str == null ? "" : str;
        String str3 = vjfVar.b;
        String str4 = str3 == null ? "" : str3;
        Long l = vjfVar.c;
        long jLongValue = l != null ? l.longValue() : 0L;
        StringBuilder sb = new StringBuilder(ujn.h);
        String str5 = vjfVar.d;
        if (str5 == null) {
            str5 = "";
        }
        String strConcat = "playerlogo/".concat(str5);
        if (strConcat.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
            sb.setLength(0);
            sb.append(strConcat);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strConcat, '/'));
        }
        String string = sb.toString();
        List<rjf> list = vjfVar.e;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (rjf rjfVar : list) {
                String str6 = rjfVar.f30590a;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = rjfVar.b;
                if (str7 == null) {
                    str7 = "";
                }
                arrayList.add(new ojf(str6, str7));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new sjf(jLongValue, str2, str4, string, arrayList);
    }

    public static final void D(mm40 mm40Var, boolean z, ows0 ows0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        int i2 = ows0Var.b;
        fetVar2.g0(-1002133689);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ows0Var) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 64.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new b0n(ows0Var, (byte) 4);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            if (i2 > 0) {
                fetVar2.e0(-387824744);
                tdc.e(new rpe(i2), ipe.f15159a, ffb0.Q(jr8.f16991a.b(jm40Var, z ? gqw0.i : gqw0.g), z ? 3.0f : -3.0f, 2.0f), fetVar2, 48, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-387202977);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            kc5.N(ows0Var.f25981a, o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 36.0f), 0L, null, null, 0L, qmk.q, g1t0.m().f42262a.b, null, null, 0L, gqw0.e, 2, false, 2, 0, false, null, y9q0.a(ibm0.t(g1t0.l(), fetVar2), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), 0.0f, fetVar, 0, 1600512, 0, 3055420);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c0n(mm40Var, z, ows0Var, i, (byte) 4);
        }
    }

    public static final a2m D0(d0t d0tVar) {
        Object next;
        rqs rqsVar = d0tVar.p;
        Iterator it = rqsVar.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((df90) next).f5989a != rqsVar.b);
        boolean z = next == null;
        boolean zIsEmpty = rqsVar.d.isEmpty();
        c2m c2mVar = c2m.f3631a;
        if (zIsEmpty || d0tVar.z || z) {
            return new z1m(c2mVar);
        }
        t480 t480VarL = kpb.L(d0tVar);
        return new y1m(c2mVar, new x1m(), t480VarL.f33307a, t480VarL.b, rqsVar.r, rqsVar.s);
    }

    public static final void E(mm40 mm40Var, String str, a4x a4xVar, String str2, boolean z, fet fetVar, int i) {
        int i2;
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1946491816);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(a4xVar) : fetVar2.i(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            int i3 = i2 >> 3;
            v8q0.a(str3, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, i3 & 14, 24960, 110586);
            m((i3 & 112) | ((i2 >> 6) & 896), fetVar2, a4xVar, null, z);
            if (str2.length() > 0) {
                fetVar2.e0(-1327825472);
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                v8q0.a(str2, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 9) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(-1327569536);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtm(mm40Var, str, a4xVar, str2, z, i, (byte) 3);
        }
    }

    public static final String E0(Float f) {
        return H0(f).concat(Separators.PERCENT);
    }

    public static final void F(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, y1m y1mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(658302584);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(a4xVar) ? 2048 : 1024) | (fetVar2.g(a4xVar2) ? 16384 : 8192) | (fetVar2.g(str3) ? 131072 : 65536) | (fetVar2.g(str4) ? 1048576 : 524288) | (fetVar2.g(y1mVar) ? 8388608 : 4194304) | (fetVar2.h(z) ? 67108864 : 33554432);
        if (fetVar2.U(i2 & 1, (38347923 & i2) != 38347922)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            zhg0 zhg0Var = zhg0.f44392a;
            int i3 = i2 >> 3;
            int i4 = i2 >> 6;
            E(zhg0Var.a(1.0f, jm40Var, true), str, a4xVar, str3, true, fetVar2, (i2 & 112) | 24576 | (i3 & 896) | (i4 & 7168));
            obb.q(zhg0Var.b(gqw0.k, jm40Var), y1mVar, z, fetVar, (i2 >> 18) & 1008, 0);
            fetVar2 = fetVar;
            E(zhg0Var.a(1.0f, jm40Var, true), str2, a4xVar2, str4, false, fetVar2, (i3 & 112) | 24576 | (i4 & 896) | ((i2 >> 9) & 7168));
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iwm(mm40Var2, str, str2, a4xVar, a4xVar2, str3, str4, y1mVar, z, i, (byte) 1);
        }
    }

    public static final p5h0 F0(d0t d0tVar) {
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        List listSplit$default = StringsKt__StringsKt.split$default(rqsVar.c, new String[]{"-"}, false, 0, 6, null);
        String str = (String) CollectionsKt.firstOrNull(listSplit$default);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.f0(listSplit$default);
        String str3 = str2 != null ? str2 : "";
        return (str.length() == 0 && str3.length() == 0) ? o5h0.f24687a : new n5h0(str, str3, rqsVar.t, rqsVar.u);
    }

    public static final void G(mm40 mm40Var, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        a2m a2mVar2;
        boolean z2;
        fet fetVar2;
        fetVar.g0(1978922385);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a2mVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar2 = fetVar;
            obb.q(mm40Var, a2mVar, z, fetVar2, i2 & 1022, 0);
            mm40Var2 = mm40Var;
            a2mVar2 = a2mVar;
            z2 = z;
        } else {
            mm40Var2 = mm40Var;
            a2mVar2 = a2mVar;
            z2 = z;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wwm(mm40Var2, a2mVar2, z2, i, (byte) 3);
        }
    }

    public static final u180 G0(wmr0 wmr0Var) {
        String str = wmr0Var.m;
        String str2 = wmr0Var.j;
        String str3 = wmr0Var.g;
        Set setB = cui0.b(w0w.f38369a);
        w0w w0wVar = wmr0Var.f;
        long j = wmr0Var.n;
        long j2 = wmr0Var.k;
        List list = wmr0Var.l;
        long j3 = wmr0Var.h;
        List list2 = wmr0Var.i;
        if (setB.contains(w0wVar)) {
            String str4 = (String) CollectionsKt.firstOrNull(list2);
            if (str4 == null) {
                str4 = "";
            }
            c280 c280Var = new c280(vsm0.s(j3, str4), R.drawable.ic_glyph_placeholder_player);
            String str5 = (String) CollectionsKt.firstOrNull(list);
            return new s180(str3, c280Var, str2, new c280(vsm0.s(j2, str5 != null ? str5 : ""), R.drawable.ic_glyph_placeholder_player), new lpm(opm.f25648a, new hpm(0L, 3)));
        }
        if (j != 66 && j != 99) {
            String str6 = (String) CollectionsKt.firstOrNull(list2);
            if (str6 == null) {
                str6 = "";
            }
            c280 c280Var2 = new c280(vsm0.s(j3, str6), R.drawable.ic_glyph_placeholder_player);
            String str7 = (String) CollectionsKt.firstOrNull(list);
            return new s180(str3, c280Var2, str2, new c280(vsm0.s(j2, str7 != null ? str7 : ""), R.drawable.ic_glyph_placeholder_player), r4n.a(j, str));
        }
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.COLON}, false, 0, 6, null);
        Pair pair = listSplit$default.size() == 2 ? new Pair(listSplit$default.get(0), listSplit$default.get(1)) : new Pair("", "");
        String str8 = (String) pair.f46059a;
        String str9 = (String) pair.b;
        String str10 = (String) CollectionsKt.firstOrNull(list2);
        if (str10 == null) {
            str10 = "";
        }
        c280 c280Var3 = new c280(vsm0.s(j3, str10), R.drawable.ic_glyph_placeholder_player);
        String str11 = (String) CollectionsKt.firstOrNull(list);
        return new o180(str3, c280Var3, str2, new c280(vsm0.s(j2, str11 != null ? str11 : ""), R.drawable.ic_glyph_placeholder_player), str8, str9);
    }

    public static final void H(int i, fet fetVar, a4x a4xVar, Function0 function0, Function1 function1, boolean z) {
        k6z k6zVar;
        fetVar.g0(2063497291);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                fetVar.e0(-1253985806);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1253984882);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(300207371, new pbg(a4xVar, function1, function0), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((Object) a4xVar, z, (Object) function0, function1, i, (byte) 9);
        }
    }

    public static final String H0(Float f) {
        return StringsKt.e0(f.toString(), ".0");
    }

    public static final void I(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(306229735);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(r2n.f29744a) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            if (str2.length() > 0) {
                fetVar2.e0(-1229657506);
                j6n.h(str2, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 6) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1229510473);
                fetVar2.r(false);
            }
            fetVar2.e0(-870942769);
            fetVar2.r(false);
            long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02af  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:148:0x0312  */
    /* JADX WARN: Code duplicated, block: B:150:0x0318  */
    /* JADX WARN: Code duplicated, block: B:151:0x0319 A[PHI: r14
  0x0319: PHI (r14v2 int) = (r14v1 int), (r14v5 int) binds: [B:147:0x0310, B:150:0x0318] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x031b  */
    /* JADX WARN: Code duplicated, block: B:158:0x032e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0353  */
    /* JADX WARN: Code duplicated, block: B:164:0x0355  */
    /* JADX WARN: Code duplicated, block: B:168:0x035b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0378  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(lc00 lc00Var, c5l c5lVar, m9s m9sVar, ctf0 ctf0Var, yws ywsVar, boolean z) {
        y9l y9lVar;
        String strA;
        boolean z2;
        boolean z3;
        long j;
        long jE;
        long jE2;
        long jMax;
        boolean z4;
        boolean z5;
        StringBuilder sb;
        int i;
        boolean z6;
        boolean z7;
        boolean z8;
        Object b9lVar;
        char c;
        char c2;
        y9l y9lVar2 = c5lVar.c;
        m9sVar.getClass();
        String str = m9sVar.j;
        String str2 = m9sVar.i;
        ctf0Var.getClass();
        y9l y9lVar3 = c5lVar.b;
        i6l i6lVar = y9lVar3.f42253a;
        i6l i6lVar2 = i6l.f14245a;
        boolean z9 = i6lVar == i6lVar2 || y9lVar2.f42253a == i6lVar2;
        List list = c5lVar.d;
        g9l g9lVar = c5lVar.f3777a;
        jwb jwbVar = g9lVar.d;
        long j2 = g9lVar.c;
        long j3 = g9lVar.e;
        if (z9) {
            return;
        }
        if (bkb.V(c5lVar) && z) {
            return;
        }
        if (ywsVar == null || ywsVar.b <= 0 || z) {
            y9l y9lVar4 = y9lVar2;
            long j4 = g9lVar.f;
            if (z) {
                boolean z10 = j4 == 0 && j3 == 0;
                boolean z11 = list.size() == 10;
                i6l i6lVar3 = i6l.b;
                i6l i6lVar4 = y9lVar3.f42253a;
                y9l y9lVar5 = i6lVar4 == i6lVar3 ? y9lVar3 : y9lVar4;
                i6l i6lVar5 = i6l.c;
                if (i6lVar4 == i6lVar5) {
                    y9lVar4 = y9lVar3;
                }
                boolean z12 = z10;
                String str3 = i6lVar4 == i6lVar3 ? str2 : str;
                String strS = vzb.S(c5lVar, m9sVar, i6lVar3);
                lsm0 lsm0Var = ctf0Var.b;
                b8l b8lVar = new b8l(str3, strS, lsm0Var.a(R.string.cyber_dota_radiant_short, Arrays.copyOf(new Object[0], 0)));
                t7l t7lVar = new t7l(y9lVar3.f42253a == i6lVar5 ? str2 : str, vzb.S(c5lVar, m9sVar, i6lVar5), lsm0Var.a(R.string.cyber_dota_dire_short, Arrays.copyOf(new Object[0], 0)));
                List list2 = y9lVar5.b;
                int i2 = y9lVar5.e;
                int i3 = y9lVar5.d;
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(wwb.T((z4l) it.next()));
                }
                List list3 = y9lVar4.b;
                int i4 = y9lVar4.e;
                int i5 = y9lVar4.d;
                ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(wwb.T((z4l) it2.next()));
                }
                z7l z7lVar = new z7l(vzb.I(i3, ctf0Var), i3 > 0 && z11);
                r7l r7lVar = new r7l(vzb.I(i5, ctf0Var), i5 > 0 && z11);
                y9l y9lVar6 = y9lVar5;
                c8l c8lVar = new c8l(i2);
                u7l u7lVar = new u7l(i4);
                long jR = vzb.R(y9lVar6);
                y7l y7lVar = new y7l(jR > vzb.R(y9lVar4), jR);
                long jR2 = vzb.R(y9lVar6);
                long jR3 = vzb.R(y9lVar4);
                q7l q7lVar = new q7l(jR3 > jR2, jR3);
                d8l d8lVar = new d8l(z11, j2);
                StringBuilder sb2 = new StringBuilder(ujn.h);
                int i6 = 0;
                if (StringsKt.O("static/img/ImgDefault/Esports/Dota2/Map.png", ujn.h, false)) {
                    sb2.setLength(i6);
                    sb2.append("static/img/ImgDefault/Esports/Dota2/Map.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Dota2/Map.png", "https://", false)) {
                    i6 = 0;
                    sb2.setLength(i6);
                    sb2.append("static/img/ImgDefault/Esports/Dota2/Map.png");
                } else {
                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        c2 = '/';
                    } else {
                        c2 = '/';
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/Dota2/Map.png", c2));
                }
                x7l x7lVar = new x7l(sb2.toString(), z12);
                List listD0 = ozb.d0(c5lVar, z12, i2 == 0, i4 == 0);
                listD0.getClass();
                b9lVar = new e8l(b8lVar, t7lVar, arrayList, arrayList2, z7lVar, r7lVar, c8lVar, u7lVar, y7lVar, q7lVar, d8lVar, x7lVar, listD0, pzb.q0(c5lVar, z12));
            } else {
                boolean z13 = j4 == 0 && j3 == 0;
                boolean z14 = list.size() == 10;
                boolean z15 = jwbVar instanceof m6l;
                i6l i6lVar6 = i6l.b;
                i6l i6lVar7 = y9lVar3.f42253a;
                if (i6lVar7 == i6lVar6) {
                    y9lVar = y9lVar4;
                } else {
                    y9lVar3 = y9lVar4;
                    y9lVar = y9lVar3;
                }
                int i7 = y9lVar3.d;
                y9l y9lVar7 = y9lVar3;
                i6l i6lVar8 = i6l.c;
                y9l y9lVar8 = i6lVar7 == i6lVar8 ? y9lVar3 : y9lVar;
                boolean z16 = z13;
                int i8 = y9lVar8.d;
                String strF = u1c.F(c5lVar, m9sVar, i6lVar6);
                String strF2 = u1c.F(c5lVar, m9sVar, i6lVar8);
                lsm0 lsm0Var2 = ctf0Var.b;
                x8l x8lVar = new x8l(lsm0Var2.a(R.string.cyber_dota_radiant_short, Arrays.copyOf(new Object[0], 0)));
                r8l r8lVar = new r8l(lsm0Var2.a(R.string.cyber_dota_dire_short, Arrays.copyOf(new Object[0], 0)));
                int iMax = Math.max(i7, i8);
                if (iMax <= 0) {
                    strA = "";
                } else {
                    if (iMax < 1000) {
                        strA = lsm0Var2.a(R.string.dota_net_worth_less, Arrays.copyOf(new Object[]{1}, 1));
                    } else {
                        strA = lsm0Var2.a(R.string.dota_net_worth_more, Arrays.copyOf(new Object[]{Integer.valueOf(iMax / 1000)}, 1));
                    }
                    if (i7 > i8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z14 || strA.length() <= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    w8l w8lVar = new w8l(strA, z2, z3);
                    if (jwbVar instanceof m6l) {
                        j = ((m6l) jwbVar).f21276a;
                    } else {
                        if (jwbVar.equals(n6l.f23001a)) {
                            t9f.b();
                            return;
                        }
                        j = 0;
                    }
                    a9l a9lVar = new a9l(z15, j);
                    jE = u1c.E(y9lVar8);
                    jE2 = u1c.E(y9lVar7);
                    jMax = Math.max(jE2, jE);
                    if (jE2 > jE) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (jMax > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    q8l q8lVar = new q8l(jMax, z4, z5);
                    z8l z8lVar = new z8l(z14, j2);
                    sb = new StringBuilder(ujn.h);
                    i = 0;
                    if (StringsKt.O("static/img/ImgDefault/Esports/Dota2/Map.png", ujn.h, false)) {
                        z6 = true;
                        sb.setLength(i);
                        sb.append("static/img/ImgDefault/Esports/Dota2/Map.png");
                    } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Dota2/Map.png", "https://", false)) {
                        i = 0;
                        z6 = true;
                        sb.setLength(i);
                        sb.append("static/img/ImgDefault/Esports/Dota2/Map.png");
                    } else {
                        if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                            c = '/';
                        } else {
                            c = '/';
                            sb.append('/');
                        }
                        z6 = true;
                        i = 0;
                        sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Dota2/Map.png", c));
                    }
                    v8l v8lVar = new v8l(sb.toString(), z16);
                    if (y9lVar7.e == 0) {
                        z7 = z6 ? 1 : 0;
                    } else {
                        z7 = i;
                    }
                    z8 = z6;
                    if (y9lVar8.e != 0) {
                        z8 = i;
                    }
                    List listD1 = ozb.d0(c5lVar, z16, z7, z8);
                    listD1.getClass();
                    b9lVar = new b9l(strF, strF2, x8lVar, r8lVar, w8lVar, a9lVar, q8lVar, z8lVar, v8lVar, listD1, pzb.q0(c5lVar, z16));
                }
                if (i7 > i8) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z14) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                w8l w8lVar2 = new w8l(strA, z2, z3);
                if (jwbVar instanceof m6l) {
                    j = ((m6l) jwbVar).f21276a;
                } else {
                    if (jwbVar.equals(n6l.f23001a)) {
                        t9f.b();
                        return;
                    }
                    j = 0;
                }
                a9l a9lVar2 = new a9l(z15, j);
                jE = u1c.E(y9lVar8);
                jE2 = u1c.E(y9lVar7);
                jMax = Math.max(jE2, jE);
                if (jE2 > jE) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (jMax > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                q8l q8lVar2 = new q8l(jMax, z4, z5);
                z8l z8lVar2 = new z8l(z14, j2);
                sb = new StringBuilder(ujn.h);
                i = 0;
                if (StringsKt.O("static/img/ImgDefault/Esports/Dota2/Map.png", ujn.h, false)) {
                    z6 = true;
                    sb.setLength(i);
                    sb.append("static/img/ImgDefault/Esports/Dota2/Map.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Dota2/Map.png", "https://", false)) {
                    i = 0;
                    z6 = true;
                    sb.setLength(i);
                    sb.append("static/img/ImgDefault/Esports/Dota2/Map.png");
                } else {
                    if (sb.length() > 0) {
                        c = '/';
                    } else {
                        c = '/';
                    }
                    z6 = true;
                    i = 0;
                    sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Dota2/Map.png", c));
                }
                v8l v8lVar2 = new v8l(sb.toString(), z16);
                if (y9lVar7.e == 0) {
                    z7 = z6 ? 1 : 0;
                } else {
                    z7 = i;
                }
                z8 = z6;
                if (y9lVar8.e != 0) {
                    z8 = i;
                }
                List listD2 = ozb.d0(c5lVar, z16, z7, z8);
                listD2.getClass();
                b9lVar = new b9l(strF, strF2, x8lVar, r8lVar, w8lVar2, a9lVar2, q8lVar2, z8lVar2, v8lVar2, listD2, pzb.q0(c5lVar, z16));
            }
            lc00Var.add(b9lVar);
        }
    }

    public static final ArrayList K(viw viwVar) {
        List list;
        List list2 = null;
        if (viwVar != null) {
            Object obj = viwVar.f37502a;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        if (viwVar != null) {
            Object obj2 = viwVar.b;
            e0g0 e0g0Var2 = j0g0.b;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(list, list2);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListQ0.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((tiw) it.next()).f34025a);
        }
        return arrayList;
    }

    public static final void L(h1o0 h1o0Var, h9j h9jVar, f9a0 f9a0Var) {
        DartsLiveView dartsLiveView = h1o0Var.b;
        int iOrdinal = f9a0Var.ordinal();
        if (iOrdinal == 0) {
            dartsLiveView.w();
            return;
        }
        if (iOrdinal == 1) {
            dartsLiveView.u();
        } else if (iOrdinal != 2) {
            t9f.b();
        } else {
            if (h9jVar.g.isEmpty()) {
                return;
            }
            dartsLiveView.u();
        }
    }

    public static final void M(dpi0 dpi0Var, long j) {
        if (dpi0Var.k()) {
            O(dpi0Var, Separators.COMMA, j);
            P(dpi0Var, Separators.SP);
        }
    }

    public static osv N(long j, int i, ctf0 ctf0Var, int i2) {
        ctf0Var.getClass();
        return new osv(ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)), R.color.static_white, j);
    }

    public static final void O(dpi0 dpi0Var, String str, long j) {
        dpi0Var.getClass();
        str.getClass();
        h83 h83Var = new h83();
        long j2 = y3d.g;
        long j3 = daq0.c;
        smk0 smk0Var = new smk0(j, j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0.b, null, null, 17424);
        h83Var.c(str);
        ((h83) dpi0Var.f6468a).b(kng0.c(h83Var.f12607a, h83Var, smk0Var, 0));
    }

    public static void P(dpi0 dpi0Var, String str) {
        O(dpi0Var, str, y3d.g);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method Q(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            method = methodArr[i];
            if (str.equals(method.getName()) || kotlin.text.c.x(method.getName(), str.concat("-"), z)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z2 = z;
                    ?? r12 = z2;
                    for (?? r11 = z2; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        arrayList.add(Boolean.valueOf(azw.M(cls).equals(azw.M(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i2;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (it.hasNext()) {
                            }
                        } while (((Boolean) it.next()).booleanValue());
                    }
                    if (method != null) {
                        return method;
                    }
                    throw new NoSuchMethodException(str.concat(" not found"));
                }
                continue;
            }
            i++;
            z = false;
        }
        method = null;
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method R(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                IntRange intRangeO = l1e0.o(0, iCeil);
                ArrayList arrayList2 = new ArrayList(r3d.q(intRangeO, 10));
                Iterator it = intRangeO.iterator();
                while (((kkx) it).c) {
                    ((bkx) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                jdg0 jdg0Var = new jdg0(3);
                ArrayList arrayList3 = jdg0Var.b;
                jdg0Var.b(clsArr);
                jdg0Var.a(fet.class);
                jdg0Var.b(clsArr2);
                return Q(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Intrinsics.d(method.getName(), str)) {
                    if (!kotlin.text.c.x(method.getName(), str + "-", false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    public static final String S(String str) {
        str.getClass();
        return "\u200e" + str;
    }

    public static final void T(dpi0 dpi0Var, String str, long j) {
        if (dpi0Var.k()) {
            O(dpi0Var, ". ", StaticColors.INSTANCE.m123getWhite0d7_KjU());
        }
        O(dpi0Var, str, j);
    }

    public static final j83 U(ctf0 ctf0Var, d3h0 d3h0Var, boolean z, boolean z2) {
        ctf0Var.getClass();
        if (z && d3h0Var != null) {
            return b0(d3h0Var, z2);
        }
        h83 h83Var = new h83();
        h83Var.c(ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)));
        StringBuilder sb = h83Var.f12607a;
        sb.length();
        sb.length();
        return h83Var.h();
    }

    public static final String V(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, boolean z) {
        d0tVar.getClass();
        y78Var.getClass();
        ctf0Var.getClass();
        long j = d0tVar.v;
        String str = d0tVar.p.m;
        boolean z2 = d0tVar.z;
        if (j == 40 && z2) {
            return str.length() == 0 ? kpb.G(d0tVar, ctf0Var) : str;
        }
        if (z2) {
            return kpb.X(d0tVar);
        }
        return (j == 40 || !qzb.H0(d0tVar)) ? y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), z, 4).toString() : str;
    }

    public static final gex W(int i) {
        if (i != 1) {
            return i != 2 ? gex.c : gex.b;
        }
        return gex.f11177a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a  */
    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    public static final j83 X(ctf0 ctf0Var, qal0 qal0Var, boolean z, boolean z2, d3h0 d3h0Var, String str, String str2, boolean z3) {
        izm0 izm0Var;
        ctf0Var.getClass();
        str.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        if (!z) {
            StaticColors staticColors = StaticColors.INSTANCE;
            O(dpi0Var, str2, staticColors.m130getWhite600d7_KjU());
            if (dpi0Var.k()) {
                O(dpi0Var, ". ", staticColors.m130getWhite600d7_KjU());
            }
            if (qal0Var != null) {
                A0(dpi0Var, qal0Var);
            }
        } else if (z2) {
            O(dpi0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)), StaticColors.INSTANCE.m130getWhite600d7_KjU());
        } else {
            if (str.length() > 0) {
                StaticColors staticColors2 = StaticColors.INSTANCE;
                M(dpi0Var, staticColors2.m130getWhite600d7_KjU());
                O(dpi0Var, str, staticColors2.m130getWhite600d7_KjU());
            }
            if (d3h0Var != null) {
                if (d3h0Var instanceof pz10) {
                    pz10 pz10Var = (pz10) d3h0Var;
                    if (!pz10Var.d().isEmpty()) {
                        StaticColors staticColors3 = StaticColors.INSTANCE;
                        M(dpi0Var, staticColors3.m130getWhite600d7_KjU());
                        O(dpi0Var, Separators.LPAREN, staticColors3.m130getWhite600d7_KjU());
                        w0(dpi0Var, pz10Var, staticColors3.m130getWhite600d7_KjU(), z3);
                        O(dpi0Var, Separators.RPAREN, staticColors3.m130getWhite600d7_KjU());
                    } else if (d3h0Var instanceof izm0) {
                        izm0Var = (izm0) d3h0Var;
                        if (!izm0Var.d().isEmpty()) {
                            StaticColors staticColors4 = StaticColors.INSTANCE;
                            M(dpi0Var, staticColors4.m130getWhite600d7_KjU());
                            O(dpi0Var, Separators.LPAREN, staticColors4.m130getWhite600d7_KjU());
                            x0(dpi0Var, izm0Var, staticColors4.m130getWhite600d7_KjU(), z3);
                            O(dpi0Var, Separators.RPAREN, staticColors4.m130getWhite600d7_KjU());
                        }
                    }
                } else if (d3h0Var instanceof izm0) {
                    izm0Var = (izm0) d3h0Var;
                    if (!izm0Var.d().isEmpty()) {
                        StaticColors staticColors5 = StaticColors.INSTANCE;
                        M(dpi0Var, staticColors5.m130getWhite600d7_KjU());
                        O(dpi0Var, Separators.LPAREN, staticColors5.m130getWhite600d7_KjU());
                        x0(dpi0Var, izm0Var, staticColors5.m130getWhite600d7_KjU(), z3);
                        O(dpi0Var, Separators.RPAREN, staticColors5.m130getWhite600d7_KjU());
                    }
                }
            }
            if (qal0Var != null) {
                if (dpi0Var.k()) {
                    O(dpi0Var, ". ", StaticColors.INSTANCE.m130getWhite600d7_KjU());
                }
                A0(dpi0Var, qal0Var);
            }
        }
        return ((h83) dpi0Var.f6468a).h();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
    public static final j83 Y(ctf0 ctf0Var, d3h0 d3h0Var, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        izm0 izm0Var;
        ctf0Var.getClass();
        str2.getClass();
        str3.getClass();
        d3h0Var.getClass();
        str4.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        if (z) {
            O(dpi0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)), StaticColors.INSTANCE.m123getWhite0d7_KjU());
        } else {
            if (str.length() > 0) {
                O(dpi0Var, str, StaticColors.INSTANCE.m123getWhite0d7_KjU());
            }
            if (str2.length() > 0 && !kotlin.text.c.l(StringsKt.u0(str4).toString(), StringsKt.u0(str2).toString())) {
                if (dpi0Var.k()) {
                    P(dpi0Var, Separators.SP);
                }
                O(dpi0Var, str2, StaticColors.INSTANCE.m123getWhite0d7_KjU());
            }
            if (str4.length() > 0) {
                StaticColors staticColors = StaticColors.INSTANCE;
                M(dpi0Var, staticColors.m123getWhite0d7_KjU());
                O(dpi0Var, str4, staticColors.m123getWhite0d7_KjU());
            }
            if (d3h0Var instanceof pz10) {
                pz10 pz10Var = (pz10) d3h0Var;
                if (!pz10Var.d().isEmpty()) {
                    StaticColors staticColors2 = StaticColors.INSTANCE;
                    M(dpi0Var, staticColors2.m123getWhite0d7_KjU());
                    O(dpi0Var, Separators.LPAREN, staticColors2.m123getWhite0d7_KjU());
                    w0(dpi0Var, pz10Var, staticColors2.m123getWhite0d7_KjU(), z2);
                    O(dpi0Var, Separators.RPAREN, staticColors2.m123getWhite0d7_KjU());
                } else if (d3h0Var instanceof izm0) {
                    izm0Var = (izm0) d3h0Var;
                    if (!izm0Var.d().isEmpty()) {
                        StaticColors staticColors3 = StaticColors.INSTANCE;
                        M(dpi0Var, staticColors3.m123getWhite0d7_KjU());
                        O(dpi0Var, Separators.LPAREN, staticColors3.m123getWhite0d7_KjU());
                        x0(dpi0Var, izm0Var, staticColors3.m123getWhite0d7_KjU(), z2);
                        O(dpi0Var, Separators.RPAREN, staticColors3.m123getWhite0d7_KjU());
                    }
                }
            } else if (d3h0Var instanceof izm0) {
                izm0Var = (izm0) d3h0Var;
                if (!izm0Var.d().isEmpty()) {
                    StaticColors staticColors4 = StaticColors.INSTANCE;
                    M(dpi0Var, staticColors4.m123getWhite0d7_KjU());
                    O(dpi0Var, Separators.LPAREN, staticColors4.m123getWhite0d7_KjU());
                    x0(dpi0Var, izm0Var, staticColors4.m123getWhite0d7_KjU(), z2);
                    O(dpi0Var, Separators.RPAREN, staticColors4.m123getWhite0d7_KjU());
                }
            }
            if (str3.length() > 0) {
                StaticColors staticColors5 = StaticColors.INSTANCE;
                M(dpi0Var, staticColors5.m123getWhite0d7_KjU());
                O(dpi0Var, str3, staticColors5.m123getWhite0d7_KjU());
            }
        }
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final long Z(boolean z, long j) {
        return z ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : j;
    }

    public static final void a(mm40 mm40Var, f3d f3dVar, j73 j73Var, qkq qkqVar, float f, ugd ugdVar, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, fet fetVar, int i) {
        ugd ugdVar2;
        j73 j73Var2;
        qkq qkqVar2;
        int i2;
        j73 j73Var3;
        qkq qkqVar3;
        boolean z;
        fetVar.g0(-1725847345);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | 48 | (fetVar.g(f3dVar) ? 256 : 128) | 11264 | (fetVar.d(f) ? 131072 : 65536) | 805306368;
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                nul0 nul0VarG0 = ro4.g0(0.0f, 280.0f, null, 5);
                uek0 uek0VarJ0 = dyb.j0(f3dVar, nul0VarG0, fetVar, (i3 >> 6) & 126);
                i2 = i3 & (-57345);
                j73Var3 = nul0VarG0;
                qkqVar3 = uek0VarJ0;
            } else {
                fetVar.X();
                i2 = i3 & (-57345);
                j73Var3 = j73Var;
                qkqVar3 = qkqVar;
            }
            fetVar.s();
            pz40 pz40VarA0 = v3c.a0(0, new Object[0], fetVar, 6);
            pz40 pz40VarA1 = v3c.a0(0, new Object[0], fetVar, 6);
            pz40 pz40VarA2 = v3c.a0(0, new Object[0], fetVar, 6);
            pz40 pz40VarA3 = v3c.a0(0, new Object[0], fetVar, 6);
            mm40 mm40VarA = fbh0.a(o7k0.d(lgb.K(mm40Var), 1.0f), f3dVar.e, ma80.f21447a, false, qkqVar3, 44);
            boolean zG = ((i2 & 458752) == 131072) | fetVar.g(pz40VarA2) | fetVar.g(pz40VarA3) | fetVar.g(pz40VarA1) | fetVar.g(pz40VarA0) | ((((i2 & 896) ^ 384) > 256 && fetVar.g(f3dVar)) || (i2 & 384) == 256);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                Object h3dVar = new h3d(f, f3dVar, pz40VarA2, pz40VarA3, pz40VarA1, pz40VarA0);
                fetVar.o0(h3dVar);
                objP = h3dVar;
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            if (xdrVar == null) {
                fetVar.e0(-196491904);
                z = false;
            } else {
                z = false;
                fetVar.e0(1656229537);
                xdrVar.F(mrv.k0(jm40Var, "BACKGROUND_KEY"), fetVar, 54);
            }
            fetVar.r(z);
            if (xdrVar3 == null) {
                fetVar.e0(-196423270);
            } else {
                fetVar.e0(1656231751);
                xdrVar3.F(mrv.k0(jm40Var, "ANIMATED_CONTENT_KEY"), fetVar, 54);
            }
            fetVar.r(z);
            ugdVar2 = ugdVar;
            ugdVar2.F(mrv.k0(jm40Var, "TOOLBAR_KEY"), fetVar, 54);
            fetVar.e0(-196287335);
            fetVar.r(z);
            if (xdrVar2 == null) {
                fetVar.e0(-196213059);
            } else {
                fetVar.e0(1656238532);
                xdrVar2.F(mrv.k0(jm40Var, "STATIC_HEADER_KEY"), fetVar, 54);
            }
            fetVar.r(z);
            fetVar.r(true);
            j73Var2 = j73Var3;
            qkqVar2 = qkqVar3;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            j73Var2 = j73Var;
            qkqVar2 = qkqVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g3d(mm40Var, f3dVar, j73Var2, qkqVar2, f, ugdVar2, xdrVar, xdrVar2, xdrVar3, i);
        }
    }

    public static final j83 a0(ctf0 ctf0Var, izm0 izm0Var, boolean z, boolean z2, String str, String str2, long j, String str3, boolean z3) {
        ctf0Var.getClass();
        str.getClass();
        str2.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        boolean z4 = false;
        if (str3 != null) {
            O(dpi0Var, str3, j);
            O(dpi0Var, ": ", StaticColors.INSTANCE.m123getWhite0d7_KjU());
            if (cy7.c() && z3) {
                z4 = true;
            }
            if (izm0Var == null) {
                O(dpi0Var, "0", j);
                O(dpi0Var, "-", j);
                O(dpi0Var, "0", j);
            } else {
                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                    t9f.b();
                    return null;
                }
                P(dpi0Var, "\u2066");
                if (z4) {
                    O(dpi0Var, izm0Var.b(), Z(izm0Var.i(), j));
                    O(dpi0Var, "-", j);
                    O(dpi0Var, izm0Var.a(), Z(izm0Var.j(), j));
                } else {
                    O(dpi0Var, izm0Var.a(), Z(izm0Var.j(), j));
                    O(dpi0Var, "-", j);
                    O(dpi0Var, izm0Var.b(), Z(izm0Var.i(), j));
                }
                P(dpi0Var, "\u2069");
            }
        } else {
            O(dpi0Var, str2, j);
            if (str.length() > 0) {
                M(dpi0Var, j);
                O(dpi0Var, str, j);
            }
            if (z) {
                M(dpi0Var, j);
                O(dpi0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)), j);
            }
            if (z2) {
                M(dpi0Var, j);
                O(dpi0Var, ctf0Var.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[0], 0)), j);
            }
        }
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final int b(pz40 pz40Var) {
        return ((Number) pz40Var.getValue()).intValue();
    }

    public static final j83 b0(d3h0 d3h0Var, boolean z) {
        d3h0Var.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        boolean z2 = cy7.c() && z;
        P(dpi0Var, "\u2066");
        if (z2) {
            String strB = d3h0Var.b();
            boolean zI = d3h0Var.i();
            StaticColors staticColors = StaticColors.INSTANCE;
            O(dpi0Var, strB, Z(zI, staticColors.m123getWhite0d7_KjU()));
            O(dpi0Var, " : ", staticColors.m123getWhite0d7_KjU());
            O(dpi0Var, d3h0Var.a(), Z(d3h0Var.j(), staticColors.m123getWhite0d7_KjU()));
        } else {
            String strA = d3h0Var.a();
            boolean zJ = d3h0Var.j();
            StaticColors staticColors2 = StaticColors.INSTANCE;
            O(dpi0Var, strA, Z(zJ, staticColors2.m123getWhite0d7_KjU()));
            O(dpi0Var, " : ", staticColors2.m123getWhite0d7_KjU());
            O(dpi0Var, d3h0Var.b(), Z(d3h0Var.i(), staticColors2.m123getWhite0d7_KjU()));
        }
        P(dpi0Var, "\u2069");
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final void c(mm40 mm40Var, w8m w8mVar, n8m n8mVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        v8m v8mVar = w8mVar.c;
        fetVar2.g0(1489770702);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(w8mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(n8mVar) : fetVar2.i(n8mVar) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            boolean zE = fetVar2.e(v8mVar.ordinal());
            Object objP = fetVar2.P();
            if (zE || objP == ukd.f35823a) {
                objP = Integer.valueOf(v8mVar == v8m.f36992a ? R.drawable.ic_glyph_circle_globe : R.drawable.ic_glyph_placeholder_player);
                fetVar2.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            rq8.b(o7k0.n(jm40Var, 32.0f), o7k0.n(jm40Var, 32.0f), w8mVar.b, iIntValue, new y3d(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60()), null, null, gqw0.B, null, fetVar2, 12582912, 352);
            v8q0.a(w8mVar.f38729a, s5x0.N(jm40Var, 8.0f, 0.0f, 12.0f, 0.0f, 10), n8mVar.d, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) w8mVar, (Object) n8mVar, i, (byte) 13);
        }
    }

    public static final j83 c0(mz10 mz10Var) {
        h83 h83Var = new h83();
        String str = mz10Var.h;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(mz10Var.i, StaticColors.INSTANCE.m130getWhite600d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void d(String str, n8m n8mVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(15935945);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(n8mVar) : fetVar2.i(n8mVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarC = o7k0.c(o7k0.s(s5x0.J(jm40.b, 4.0f), 40.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, null, n8mVar.c, new n05(idm0.t(12), idm0.t(18), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.f15753a, 0L, null, 0, 0, qmk.G, 16646109), fetVar, i2 & 14, 24960, 109554);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) str, (Object) n8mVar, i, (byte) 19);
        }
    }

    public static final j83 d0(oz10 oz10Var) {
        h83 h83Var = new h83();
        String str = oz10Var.k;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(oz10Var.l, StaticColors.INSTANCE.m130getWhite600d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void e(mm40 mm40Var, u8m u8mVar, n8m n8mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1491606960);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(u8mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(n8mVar) : fetVar.i(n8mVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (u8mVar instanceof r8m) {
                fetVar.e0(-1114548088);
                f((r8m) u8mVar, n8mVar, fetVar, (i2 >> 3) & 126);
                fetVar.r(false);
            } else if (u8mVar instanceof t8m) {
                fetVar.e0(-1114544634);
                h((t8m) u8mVar, n8mVar, fetVar, (i2 >> 3) & 126);
                fetVar.r(false);
            } else {
                if (!(u8mVar instanceof s8m)) {
                    throw b1j.f(-1114550175, fetVar, false);
                }
                fetVar.e0(-1114541226);
                g((s8m) u8mVar, fetVar, (i2 >> 3) & 14);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) u8mVar, (Object) n8mVar, i, (byte) 12);
        }
    }

    public static final j83 e0(nz10 nz10Var) {
        h83 h83Var = new h83();
        String strA = nz10Var.a();
        strA.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(nz10Var.j(), StaticColors.INSTANCE.m123getWhite0d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(strA);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void f(r8m r8mVar, n8m n8mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1189825080);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(r8mVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(n8mVar) : fetVar.i(n8mVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            v8q0.a(r8mVar.f30034a, jm40.b, n8mVar.e, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 48, 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) r8mVar, (Object) n8mVar, i, (byte) 20);
        }
    }

    public static final j83 f0(te90 te90Var) {
        te90Var.getClass();
        h83 h83Var = new h83();
        String str = te90Var.b;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(te90Var.c, StaticColors.INSTANCE.m130getWhite600d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void g(s8m s8mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(769586025);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(s8mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            rq8.b(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 24.0f), s8mVar.f31809a, R.drawable.ic_glyph_circle_globe, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary60()), null, null, gqw0.B, null, fetVar, 12582912, 352);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(s8mVar, i, (byte) 18);
        }
    }

    public static final j83 g0(mz10 mz10Var) {
        h83 h83Var = new h83();
        String str = mz10Var.j;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(mz10Var.k, StaticColors.INSTANCE.m130getWhite600d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void h(t8m t8mVar, n8m n8mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(889877596);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(t8mVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(n8mVar) : fetVar.i(n8mVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            v8q0.a(t8mVar.f33517a, jm40.b, n8mVar.e, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 48, 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) t8mVar, (Object) n8mVar, i, (byte) 21);
        }
    }

    public static final j83 h0(oz10 oz10Var) {
        h83 h83Var = new h83();
        String str = oz10Var.m;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(oz10Var.n, StaticColors.INSTANCE.m130getWhite600d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-1085451630);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 8.0f, 8.0f, 8.0f, 2.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var2, 1.0f), 30.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarE2 = o7k0.e(o7k0.s(mm40Var2, 128.0f), 14.0f);
            zcl zclVar2 = qmk.m;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, true);
            mm40 mm40VarE3 = o7k0.e(o7k0.d(mm40Var2, 1.0f), 48.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarD2 = o7k0.d(mm40Var2, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            fetVar.e0(-714642459);
            for (int i3 = 0; i3 < 3; i3++) {
                x7z x7zVar = new x7z(1.0f, true);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE4 = o7k0.e(x7zVar, 36.0f);
                zcl zclVar4 = qmk.f;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE4), vbc.d0(null, fetVar, 0, 1)));
            }
            fetVar.r(false);
            fetVar.r(true);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var2, i, (byte) 13);
        }
    }

    public static final j83 i0(nz10 nz10Var) {
        h83 h83Var = new h83();
        String strB = nz10Var.b();
        strB.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(nz10Var.i(), StaticColors.INSTANCE.m123getWhite0d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(strB);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void j(mm40 mm40Var, hh80 hh80Var, fet fetVar, int i, int i2) {
        fetVar.g0(523573591);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && fetVar.g(hh80Var)) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            } else if ((i2 & 2) != 0) {
                zcl zclVar = qmk.f28987a;
                hh80Var = s5x0.u(8.0f, 8.0f, 8.0f, 0.0f, 8);
            }
            fetVar.s();
            mm40 mm40VarI = s5x0.I(o7k0.v(o7k0.d(mm40Var, 1.0f), gqw0.j, true), hh80Var);
            zcl zclVar2 = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(1852760091);
            for (int i4 = 0; i4 < 3; i4++) {
                i(0, fetVar, null);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        hh80 hh80Var2 = hh80Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e7h(mm40Var, (Object) hh80Var2, i, i2, (byte) 0);
        }
    }

    public static final j83 j0(te90 te90Var) {
        te90Var.getClass();
        h83 h83Var = new h83();
        String str = te90Var.d;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(te90Var.e, StaticColors.INSTANCE.m130getWhite600d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void k(mm40 mm40Var, qoh qohVar, boolean z, Function1 function1, fet fetVar, int i) {
        boolean z2;
        qohVar.getClass();
        function1.getClass();
        fetVar.g0(-1852603751);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qohVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 140.0f);
            mm40Var = jm40Var;
            long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new vef(function1, qohVar, (byte) 12);
                fetVar.o0(objP);
            }
            mm40 mm40VarN = s5x0.N(feb.O(mm40VarS, (Function0) objP), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            A(qohVar.c, qohVar.d, fetVar, 0);
            u1c.b(null, qohVar.e, qohVar.f, qohVar.g, z2, fetVar, (i2 << 9) & 458752);
            B(qohVar.h, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((Object) mm40Var2, (Object) qohVar, z, (wdr) function1, i, (byte) 9);
        }
    }

    public static final j83 k0(oz10 oz10Var) {
        h83 h83Var = new h83();
        String str = oz10Var.g;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(oz10Var.h, StaticColors.INSTANCE.m130getWhite600d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void l(mm40 mm40Var, u1i u1iVar, u1i u1iVar2, boolean z, Function0 function0, Function0 function1, fet fetVar, int i) {
        k6z k6zVar;
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1027346275);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(u1iVar) ? 32 : 16) | (fetVar.g(u1iVar2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            if (z) {
                fetVar.e0(562720068);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(562720992);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-2134580259, new v1i(mm40Var, u1iVar, function0, u1iVar2, function1, (byte) 0), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w1i(mm40Var, u1iVar, u1iVar2, z, function0, function1, i, (byte) 0);
        }
    }

    public static final j83 l0(oz10 oz10Var) {
        h83 h83Var = new h83();
        String str = oz10Var.i;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(Z(oz10Var.j, StaticColors.INSTANCE.m130getWhite600d7_KjU()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void m(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, boolean z) {
        fetVar.g0(-187281688);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            Object objK = fetVar.k(zfnVar);
            k6z k6zVar = k6z.b;
            boolean z2 = objK == k6zVar;
            if (z2 != z) {
                k6zVar = k6z.f17794a;
            }
            obc.d(zfnVar.a(k6zVar), u1c.M(-1345146328, new hwm((byte) 2, ozb.b0(a4xVar, fetVar, (i2 >> 3) & 14), z2), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvm(mm40Var2, a4xVar, z, i, (byte) 3);
        }
    }

    public static final znq0 m0(anq0 anq0Var) {
        boolean z = anq0Var.b;
        long j = anq0Var.d;
        long j2 = anq0Var.e;
        if (!z) {
            return new znq0(j2 + j);
        }
        long j3 = j2 - j;
        if (j3 < 0) {
            j3 = 0;
        }
        return new znq0(j3);
    }

    public static final void n(mm40 mm40Var, qdz qdzVar, uqk uqkVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        qdzVar.getClass();
        uqkVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-341467039);
        int i2 = i | 6 | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.g(uqkVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarB = qdzVar.b(uqkVar.f36122a, new svj((byte) 17), fetVar2, (i2 << 3) & 896);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 228.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            int i3 = i2 >> 3;
            nkb.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), xczVarB, uqkVar.c, function1, fetVar2, i3 & 7168);
            fetVar2 = fetVar;
            e3c.b(null, uqkVar.d, function0, fetVar2, i3 & 896, 1);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var2, (Object) qdzVar, (Object) uqkVar, (Object) function0, (Object) function1, i, (byte) 1);
        }
    }

    public static final evq0 n0(boolean z) {
        return z ? evq0.f8484a : evq0.b;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0106  */
    /* JADX WARN: Code duplicated, block: B:36:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0163  */
    /* JADX WARN: Code duplicated, block: B:40:0x0167  */
    /* JADX WARN: Code duplicated, block: B:43:0x018f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0191  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0213  */
    public static final void o(mm40 mm40Var, bpl bplVar, Function0 function0, fet fetVar, int i) {
        cl5 cl5Var;
        boolean z;
        pcy pcyVar;
        boolean z2;
        boolean zI;
        Object xolVar;
        pz40 pz40Var;
        long jM123getWhite0d7_KjU;
        bpl bplVar2 = bplVar;
        fet fetVar2 = fetVar;
        bplVar2.getClass();
        fetVar2.g0(-974980327);
        int i2 = i | (fetVar2.g(bplVar2) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                objP = new ngk0();
                fetVar2.o0(objP);
            }
            ngk0 ngk0Var = (ngk0) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var2) {
                objP2 = androidx.compose.runtime.e.e(new y3d(backgroundContent));
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Context context = (Context) fetVar2.k(dy2.b);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 52.0f), 1.0f);
            long j = ((y3d) pz40Var2.getValue()).f41946a;
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            zfn zfnVar2 = m8m0.f21378a;
            mm40 mm40VarS = i120.S(mm40VarQ, 1.0f, ((StaticColors) fetVar2.k(zfnVar2)).m126getWhite200d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z3 = (i2 & 896) == 256;
            Object objP3 = fetVar2.P();
            if (z3) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP3 == cl5Var) {
                }
                mm40 mm40VarW = y860.W(mm40VarS, null, null, false, null, (Function0) objP3, 28);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
                mkd.c0.getClass();
                fetVar2.i0();
                z = fetVar2.S;
                pcyVar = e7z.u1;
                if (z) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(fetVar2, tj30VarC, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar2, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar2, numValueOf, shdVar3);
                jpm0.n(fetVar2);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar2, mm40VarC0, shdVar4);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarN = s5x0.N(jm40Var, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 36.0f), vgg0.f37379a);
                bplVar2 = bplVar;
                String str = bplVar2.c;
                pge pgeVar = gqw0.A;
                if ((i2 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zI = z2 | fetVar2.i(context);
                Object objP4 = fetVar2.P();
                if (!zI || objP4 == cl5Var) {
                    xolVar = new xol(ngk0Var, bplVar2, context, pz40Var2, (byte) 1);
                    pz40Var = pz40Var2;
                    fetVar2.o0(xolVar);
                } else {
                    xolVar = objP4;
                    pz40Var = pz40Var2;
                }
                k7x.b(str, null, mm40VarJ, null, null, null, null, (Function1) xolVar, null, null, pgeVar, null, fetVar, 48, 6, 31608);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                String str2 = bplVar2.b;
                if (h2t0.a(((y3d) pz40Var.getValue()).f41946a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent())) {
                    fetVar.e0(-29364370);
                    jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
                } else {
                    fetVar.e0(-29363064);
                    jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU();
                }
                fetVar.r(false);
                long j2 = jM123getWhite0d7_KjU;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                v8q0.a(str2, mm40VarN2, j2, null, qmk.s, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 109544);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(true);
            }
            objP3 = new unl(function0, (byte) 4);
            fetVar2.o0(objP3);
            mm40 mm40VarW2 = y860.W(mm40VarS, null, null, false, null, (Function0) objP3, 28);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarW2);
            mkd.c0.getClass();
            fetVar2.i0();
            z = fetVar2.S;
            pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC2, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM3, shdVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf2, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC2, shdVar8);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN3 = s5x0.N(jm40Var2, 16.0f, 0.0f, 16.0f, 0.0f, 10);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar5);
            jpm0.o(fetVar2, bh90VarM4, shdVar6);
            vqd.u(iHashCode4, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar8);
            mm40 mm40VarJ2 = lgb.J(o7k0.n(jm40Var2, 36.0f), vgg0.f37379a);
            bplVar2 = bplVar;
            String str3 = bplVar2.c;
            pge pgeVar2 = gqw0.A;
            if ((i2 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            zI = z2 | fetVar2.i(context);
            Object objP5 = fetVar2.P();
            if (zI) {
                xolVar = new xol(ngk0Var, bplVar2, context, pz40Var2, (byte) 1);
                pz40Var = pz40Var2;
                fetVar2.o0(xolVar);
            } else {
                xolVar = new xol(ngk0Var, bplVar2, context, pz40Var2, (byte) 1);
                pz40Var = pz40Var2;
                fetVar2.o0(xolVar);
            }
            k7x.b(str3, null, mm40VarJ2, null, null, null, null, (Function1) xolVar, null, null, pgeVar2, null, fetVar, 48, 6, 31608);
            mm40 mm40VarN4 = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            String str4 = bplVar2.b;
            if (h2t0.a(((y3d) pz40Var.getValue()).f41946a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent())) {
                fetVar.e0(-29364370);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            } else {
                fetVar.e0(-29363064);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU();
            }
            fetVar.r(false);
            long j3 = jM123getWhite0d7_KjU;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str4, mm40VarN4, j3, null, qmk.s, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 109544);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yol(mm40Var, bplVar2, function0, i, (byte) 1);
        }
    }

    public static final int o0(d0t d0tVar) {
        if (d0tVar.z) {
            return 0;
        }
        yk5 yk5Var = mc6.b;
        Integer numValueOf = Integer.valueOf(d0tVar.p.q);
        yk5Var.getClass();
        return yk5.d(numValueOf).f21536a;
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fetVar.g0(-1259471383);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(o7k0.s(mm40Var, 64.0f), 54.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            y9q0 y9q0VarS = g1t0.s();
            zfn zfnVar2 = m8m0.f21378a;
            aad.e(str, null, y9q0.a(y9q0VarS, ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 1, false, 1, 0, null, null, fetVar, ((i2 >> 3) & 14) | 1794048, 906);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            aad.e(str2, null, y9q0.a(g1t0.g(), ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 1, 0, null, new n05(qmk.p, qmk.q, qmk.n), fetVar, ((i2 >> 6) & 14) | 1794048, 394);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 22);
        }
    }

    public static String p0(String str) {
        str.getClass();
        try {
            double d = Double.parseDouble(str);
            int iV = StringsKt.V(str, Separators.DOT, 0, false, 6);
            int length = iV != -1 ? (str.length() - iV) - 1 : 0;
            pn40 pn40Var = pn40.f27267a;
            return pn40.b(d, length, true);
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public static final void q(mm40 mm40Var, m8m m8mVar, n8m n8mVar, Function1 function1, fet fetVar, int i) {
        n8mVar.getClass();
        function1.getClass();
        fetVar.g0(33500232);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(m8mVar) ? 32 : 16) | (fetVar.g(n8mVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            long j = n8mVar.b;
            ene eneVar = n8mVar.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(i120.S(mm40VarE, 1.0f, j, new ugg0(eneVar, eneVar, eneVar, eneVar)), n8mVar.f23097a, new ugg0(eneVar, eneVar, eneVar, eneVar));
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new lrk(function1, m8mVar, (byte) 21);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            d(m8mVar.c, n8mVar, fetVar, (i2 >> 3) & 112);
            jm40 jm40Var = jm40.b;
            int i3 = i2 & 896;
            c(dw9.h(1.0f, o7k0.c(jm40Var, 1.0f), true), m8mVar.b, n8mVar, fetVar, i3);
            e(o7k0.u(s5x0.N(o7k0.c(jm40Var, 1.0f), 0.0f, 0.0f, 12.0f, 0.0f, 11), 0.0f, 100.0f, 1), m8mVar.d, n8mVar, fetVar, i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fy7((byte) 2, i, mm40Var, m8mVar, n8mVar, function1);
        }
    }

    public static final void q0(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = one.f25542a.iterator();
        while (it.hasNext()) {
            try {
                ((nne) it.next()).l(th, coroutineContext);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    tjo.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            tjo.a(th, new eik(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    public static final void r(sma smaVar, boolean z, fet fetVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        fet fetVar2 = fetVar;
        boolean z7 = smaVar instanceof tla;
        jm40 jm40Var = jm40.b;
        if (z7) {
            fetVar2.e0(-145505017);
            tla tlaVar = (tla) smaVar;
            if (tlaVar instanceof ola) {
                fetVar2.e0(-401573299);
                ola olaVar = (ola) tlaVar;
                ttm ttmVar = new ttm(olaVar.f25442a, olaVar.b, olaVar.c, olaVar.d, olaVar.e, olaVar.f, olaVar.g, olaVar.h, olaVar.i, olaVar.j, olaVar.k);
                z6 = false;
                d9x.A(jm40Var, z, ttmVar, fetVar2, 0);
                fetVar2.r(false);
            } else if (tlaVar instanceof pla) {
                fetVar2.e0(437028342);
                pla plaVar = (pla) tlaVar;
                uzm uzmVar = plaVar.f27173a;
                uzm uzmVar2 = plaVar.b;
                mpm mpmVar = plaVar.c;
                jwm jwmVar = plaVar.d;
                jwm jwmVar2 = plaVar.e;
                jwm jwmVar3 = plaVar.f;
                uso0 uso0Var = uso0.f36223a;
                jiq0.z(jm40Var, uzmVar, uzmVar2, mpmVar, jwmVar, jwmVar2, jwmVar3, z, fetVar2, 100663296);
                z6 = false;
                fetVar2.r(false);
            } else if (tlaVar instanceof qla) {
                fetVar2.e0(-401523726);
                qla qlaVar = (qla) tlaVar;
                nxm nxmVar = new nxm(qlaVar.f28923a, qlaVar.b, qlaVar.c, qlaVar.d);
                z6 = false;
                vfc.p(jm40Var, z, nxmVar, fetVar2, 0);
                fetVar2.r(false);
            } else if (tlaVar instanceof rla) {
                fetVar2.e0(438817135);
                rla rlaVar = (rla) tlaVar;
                uzm uzmVar3 = rlaVar.f30686a;
                uzm uzmVar4 = rlaVar.b;
                mpm mpmVar2 = rlaVar.c;
                jwm jwmVar4 = rlaVar.d;
                jwm jwmVar5 = rlaVar.e;
                jwm jwmVar6 = rlaVar.f;
                uso0 uso0Var2 = uso0.f36223a;
                jiq0.z(jm40Var, uzmVar3, uzmVar4, mpmVar2, jwmVar4, jwmVar5, jwmVar6, z, fetVar2, 0);
                z6 = false;
                fetVar2.r(false);
            } else {
                if (!(tlaVar instanceof sla)) {
                    throw b1j.f(-401573247, fetVar2, false);
                }
                fetVar2.e0(-401465900);
                sla slaVar = (sla) tlaVar;
                q1n q1nVar = new q1n(slaVar.f32389a, slaVar.b, slaVar.c, slaVar.d, slaVar.e, slaVar.f, z);
                z6 = false;
                jcb.m(jm40Var, q1nVar, fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(z6);
            return;
        }
        if (smaVar instanceof fma) {
            fetVar2.e0(-145498649);
            fma fmaVar = (fma) smaVar;
            if (fmaVar instanceof ama) {
                fetVar2.e0(576005970);
                ama amaVar = (ama) fmaVar;
                z5 = false;
                k9x.v(jm40Var, z, new vtm(amaVar.f1098a, amaVar.b, amaVar.c, amaVar.d, amaVar.e, amaVar.f, amaVar.g, amaVar.h, amaVar.i, amaVar.j), fetVar2, 0);
                fetVar2.r(false);
            } else if (fmaVar instanceof bma) {
                fetVar2.e0(576034727);
                bma bmaVar = (bma) fmaVar;
                r1n r1nVar = new r1n(bmaVar.f2827a, bmaVar.b, bmaVar.c, bmaVar.d, bmaVar.e, z);
                z5 = false;
                rcb.A(jm40Var, r1nVar, fetVar2, 0);
                fetVar2.r(false);
            } else if (fmaVar instanceof cma) {
                fetVar2.e0(576051828);
                cma cmaVar = (cma) fmaVar;
                qxm qxmVar = new qxm(cmaVar.f4594a, cmaVar.b, cmaVar.c);
                z5 = false;
                plc.l(jm40Var, qxmVar, z, fetVar2, 0);
                fetVar2.r(false);
            } else if (fmaVar instanceof dma) {
                fetVar2.e0(678783891);
                dma dmaVar = (dma) fmaVar;
                xzm xzmVar = dmaVar.f6313a;
                xzm xzmVar2 = dmaVar.b;
                jwm jwmVar7 = dmaVar.e;
                jwm jwmVar8 = dmaVar.d;
                a2m a2mVar = dmaVar.c;
                uso0 uso0Var3 = uso0.f36223a;
                fxb.o(jm40Var, xzmVar, xzmVar2, a2mVar, jwmVar7, jwmVar8, null, z, fetVar2, 1572864);
                z5 = false;
                fetVar2.r(false);
            } else {
                if (!(fmaVar instanceof ema)) {
                    throw b1j.f(576005513, fetVar2, false);
                }
                fetVar2.e0(576105823);
                ema emaVar = (ema) fmaVar;
                r1n r1nVar2 = new r1n(emaVar.f8038a, emaVar.b, emaVar.c, emaVar.d, emaVar.e, z);
                z5 = false;
                rcb.A(jm40Var, r1nVar2, fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(z5);
            return;
        }
        if (smaVar instanceof zla) {
            fetVar2.e0(-145492149);
            zla zlaVar = (zla) smaVar;
            if (zlaVar instanceof ula) {
                fetVar2.e0(-1622548476);
                ula ulaVar = (ula) zlaVar;
                z4 = false;
                t9x.x(jm40Var, z, new wtm(ulaVar.f35862a, ulaVar.b, ulaVar.c, ulaVar.d, ulaVar.e, ulaVar.f, ulaVar.g, ulaVar.h, ulaVar.i, ulaVar.j, ulaVar.k), fetVar2, 0);
                fetVar2.r(false);
            } else if (zlaVar instanceof vla) {
                fetVar2.e0(-1622517959);
                vla vlaVar = (vla) zlaVar;
                z4 = false;
                vdb.y(jm40Var, new s1n(vlaVar.f37612a, vlaVar.b, vlaVar.c, vlaVar.d, vlaVar.e, vlaVar.f, z), fetVar2, 0);
                fetVar2.r(false);
            } else if (zlaVar instanceof wla) {
                fetVar2.e0(-1622499093);
                wla wlaVar = (wla) zlaVar;
                z4 = false;
                lmc.p(jm40Var, new rxm(wlaVar.f39344a, wlaVar.b, wlaVar.c, wlaVar.d), z, fetVar2, 0);
                fetVar2.r(false);
            } else if (zlaVar instanceof xla) {
                fetVar2.e0(1243305952);
                xla xlaVar = (xla) zlaVar;
                yzm yzmVar = xlaVar.f41062a;
                yzm yzmVar2 = xlaVar.b;
                jwm jwmVar9 = xlaVar.e;
                jwm jwmVar10 = xlaVar.f;
                a2m a2mVar2 = xlaVar.c;
                String str = xlaVar.d;
                uso0 uso0Var4 = uso0.f36223a;
                dyb.t(jm40Var, yzmVar, yzmVar2, a2mVar2, str, jwmVar9, jwmVar10, z, fetVar2, 0);
                z4 = false;
                fetVar2.r(false);
            } else {
                if (!(zlaVar instanceof yla)) {
                    throw b1j.f(-1622548801, fetVar2, false);
                }
                fetVar2.e0(-1622440307);
                yla ylaVar = (yla) zlaVar;
                z4 = false;
                vdb.y(jm40Var, new s1n(ylaVar.f42831a, ylaVar.b, ylaVar.c, ylaVar.d, ylaVar.e, ylaVar.f, z), fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(z4);
            return;
        }
        if (smaVar instanceof lma) {
            fetVar2.e0(-215081962);
            lma lmaVar = (lma) smaVar;
            if (lmaVar instanceof gma) {
                fetVar2.e0(-1366621464);
                gma gmaVar = (gma) lmaVar;
                z3 = false;
                e9x.D(jm40Var, z, new utm(gmaVar.f11533a, gmaVar.b, gmaVar.c, gmaVar.d, gmaVar.e, gmaVar.f, gmaVar.g, gmaVar.h, gmaVar.i, gmaVar.j, gmaVar.k), fetVar2, 0);
                fetVar2.r(false);
            } else if (lmaVar instanceof hma) {
                fetVar2.e0(585356240);
                hma hmaVar = (hma) lmaVar;
                wzm wzmVar = hmaVar.f13296a;
                wzm wzmVar2 = hmaVar.b;
                jwm jwmVar11 = hmaVar.d;
                jwm jwmVar12 = hmaVar.e;
                jwm jwmVar13 = hmaVar.f;
                String str2 = hmaVar.c;
                uso0 uso0Var5 = uso0.f36223a;
                wwb.m(jm40Var, wzmVar, wzmVar2, str2, jwmVar11, jwmVar12, jwmVar13, z, fetVar2, 12582912);
                z3 = false;
                fetVar2.r(false);
            } else if (lmaVar instanceof ima) {
                fetVar2.e0(-1366570321);
                ima imaVar = (ima) lmaVar;
                vic.h(jm40Var, new pxm(imaVar.f15015a, imaVar.b, imaVar.c, imaVar.d), z, fetVar2, 0);
                fetVar2.r(false);
                z3 = false;
            } else if (lmaVar instanceof jma) {
                fetVar2.e0(587164873);
                jma jmaVar = (jma) lmaVar;
                wzm wzmVar3 = jmaVar.f16754a;
                wzm wzmVar4 = jmaVar.b;
                jwm jwmVar14 = jmaVar.d;
                jwm jwmVar15 = jmaVar.e;
                jwm jwmVar16 = jmaVar.f;
                String str3 = jmaVar.c;
                uso0 uso0Var6 = uso0.f36223a;
                wwb.m(jm40Var, wzmVar3, wzmVar4, str3, jwmVar14, jwmVar15, jwmVar16, z, fetVar2, 0);
                z3 = false;
                fetVar2.r(false);
            } else {
                if (!(lmaVar instanceof kma)) {
                    throw b1j.f(-1366621718, fetVar2, false);
                }
                fetVar2.e0(587807224);
                kma kmaVar = (kma) lmaVar;
                wzm wzmVar5 = kmaVar.f18529a;
                wzm wzmVar6 = kmaVar.b;
                jwm jwmVar17 = kmaVar.d;
                jwm jwmVar18 = kmaVar.e;
                jwm jwmVar19 = kmaVar.f;
                String str4 = kmaVar.c;
                uso0 uso0Var7 = uso0.f36223a;
                wwb.m(jm40Var, wzmVar5, wzmVar6, str4, jwmVar17, jwmVar18, jwmVar19, z, fetVar2, 12582912);
                z3 = false;
                fetVar2.r(false);
            }
            fetVar2.r(z3);
            return;
        }
        if (!(smaVar instanceof rma)) {
            throw b1j.f(-145506920, fetVar2, false);
        }
        fetVar2.e0(-214877703);
        rma rmaVar = (rma) smaVar;
        if (rmaVar instanceof mma) {
            fetVar2.e0(-1261333113);
            mma mmaVar = (mma) rmaVar;
            vzm vzmVar = mmaVar.f22027a;
            vzm vzmVar2 = mmaVar.b;
            jwm jwmVar20 = mmaVar.c;
            jwm jwmVar21 = mmaVar.d;
            jwm jwmVar22 = mmaVar.e;
            uso0 uso0Var8 = uso0.f36223a;
            jwb.n(jm40Var, vzmVar, vzmVar2, jwmVar20, jwmVar21, jwmVar22, z, fetVar, 1572864);
            fetVar2 = fetVar;
            z2 = false;
            fetVar2.r(false);
        } else if (rmaVar instanceof nma) {
            fetVar2.e0(-1261313945);
            nma nmaVar = (nma) rmaVar;
            vzm vzmVar3 = nmaVar.f23761a;
            vzm vzmVar4 = nmaVar.b;
            jwm jwmVar23 = nmaVar.c;
            jwm jwmVar24 = nmaVar.d;
            jwm jwmVar25 = nmaVar.e;
            uso0 uso0Var9 = uso0.f36223a;
            jwb.n(jm40Var, vzmVar3, vzmVar4, jwmVar23, jwmVar24, jwmVar25, z, fetVar, 1572864);
            fetVar2 = fetVar;
            z2 = false;
            fetVar2.r(false);
        } else if (rmaVar instanceof oma) {
            fetVar2.e0(-1261295211);
            oma omaVar = (oma) rmaVar;
            oxm oxmVar = new oxm(omaVar.f25494a, omaVar.b, omaVar.c, omaVar.d);
            z2 = false;
            hic.n(jm40Var, oxmVar, z, fetVar2, 0);
            fetVar2.r(false);
        } else if (rmaVar instanceof pma) {
            fetVar2.e0(-1261260562);
            pma pmaVar = (pma) rmaVar;
            vzm vzmVar5 = pmaVar.f27221a;
            vzm vzmVar6 = pmaVar.b;
            jwm jwmVar26 = pmaVar.c;
            jwm jwmVar27 = pmaVar.d;
            jwm jwmVar28 = pmaVar.e;
            uso0 uso0Var10 = uso0.f36223a;
            jwb.n(jm40Var, vzmVar5, vzmVar6, jwmVar26, jwmVar27, jwmVar28, z, fetVar, 0);
            fetVar2 = fetVar;
            z2 = false;
            fetVar2.r(false);
        } else {
            if (!(rmaVar instanceof qma)) {
                throw b1j.f(-1261333508, fetVar2, false);
            }
            fetVar2.e0(-1261241661);
            qma qmaVar = (qma) rmaVar;
            vzm vzmVar7 = qmaVar.f28973a;
            vzm vzmVar8 = qmaVar.b;
            jwm jwmVar29 = qmaVar.c;
            jwm jwmVar30 = qmaVar.d;
            jwm jwmVar31 = qmaVar.e;
            uso0 uso0Var11 = uso0.f36223a;
            jwb.n(jm40Var, vzmVar7, vzmVar8, jwmVar29, jwmVar30, jwmVar31, z, fetVar, 1572864);
            fetVar2 = fetVar;
            z2 = false;
            fetVar2.r(false);
        }
        fetVar2.r(z2);
    }

    public static void r0(String str, String str2, fet fetVar, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodR = R(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodR != null) {
                methodR.setAccessible(true);
                if (Modifier.isStatic(methodR.getModifiers())) {
                    s0(methodR, null, fetVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    s0(methodR, cls.getConstructor(null).newInstance(null), fetVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + Separators.DOT + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", b1j.k("Failed to invoke Composable Method '", str, Separators.DOT, str2, Separators.QUOTE), null);
            throw e;
        }
    }

    public static final void s(mm40 mm40Var, ewm ewmVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        boolean z;
        fet fetVar2 = fetVar;
        String str = ewmVar.i;
        String str2 = ewmVar.h;
        fetVar2.g0(-1667568497);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(ewmVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (ewmVar.k) {
                fetVar2.e0(-510518026);
                k6zVar = (k6z) fetVar2.k(bmd.n);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-510517102);
                fetVar2.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            if (str2.length() <= 0 && str.length() <= 0) {
                fetVar2.e0(-965035683);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-965223078);
                I(0, fetVar2, null, str2, str);
                fetVar2.r(false);
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-131300667, new i3l(ewmVar, (byte) 27), fetVar2), fetVar2, 56);
            if (ewmVar.g.length() > 0) {
                fetVar2.e0(-964282817);
                String str3 = ewmVar.g;
                long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                z = true;
                v8q0.a(str3, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-964028803);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 3, i, mm40Var, ewmVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00eb  */
    public static void s0(Method method, Object obj, fet fetVar, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Object objValueOf;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (Intrinsics.d(parameterTypes[length], fet.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int iCeil = (i != 0 ? (int) Math.ceil(((double) ((obj != null ? 1 : 0) + i)) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iCeil ? (int) Math.ceil(((double) i) / 31.0d) : 0) + iCeil != length2) {
            jf4.n("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    objValueOf = fetVar;
                } else if (i3 <= i4 && i4 < iCeil) {
                    objValueOf = 0;
                } else {
                    if (iCeil > i4 || i4 >= length2) {
                        jf4.n("Unexpected index");
                        return;
                    }
                    objValueOf = 2097151;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                switch (method.getParameterTypes()[i4].getName()) {
                    case "double":
                        objValueOf = Double.valueOf(0.0d);
                        break;
                    case "int":
                        objValueOf = 0;
                        break;
                    case "byte":
                        objValueOf = (byte) 0;
                        break;
                    case "char":
                        objValueOf = (char) 0;
                        break;
                    case "long":
                        objValueOf = 0L;
                        break;
                    case "boolean":
                        objValueOf = Boolean.FALSE;
                        break;
                    case "float":
                        objValueOf = Float.valueOf(0.0f);
                        break;
                    case "short":
                        objValueOf = (short) 0;
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                objValueOf = objArr[i4];
            }
            objArr2[i4] = objValueOf;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    public static final void t(mm40 mm40Var, l0n l0nVar, fet fetVar, int i) {
        l0n l0nVar2;
        float f;
        ?? r3;
        fet fetVar2 = fetVar;
        fetVar2.g0(881564065);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(l0nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 170.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarG);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            String str = l0nVar.c;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarP = g1t0.p();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, mm40VarL, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarP, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (l0nVar.d.length() > 0) {
                fetVar2.e0(6002399);
                mm40 mm40VarL2 = s5x0.L(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 8.0f, 0.0f, 2);
                String str2 = l0nVar.d;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                f = 8.0f;
                v8q0.a(str2, mm40VarL2, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.n(), fetVar2, 0, 24960, 109560);
                fetVar2 = fetVar2;
                r3 = 0;
                fetVar2.r(false);
            } else {
                f = 8.0f;
                r3 = 0;
                fetVar2.e0(6435159);
                fetVar2.r(false);
            }
            mm40 mm40VarM = s5x0.M(r41, f, 10.0f, f, f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, r3);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            l0nVar2 = l0nVar;
            D(zhg0Var.a(0.33f, r41, true), true, l0nVar2.f, fetVar2, 48);
            C(zhg0Var.a(0.33f, r41, true), l0nVar2, fetVar2, i2 & 112);
            D(zhg0Var.a(0.33f, jm40Var, true), r3, l0nVar2.g, fetVar2, 48);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            l0nVar2 = l0nVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 4, i, mm40Var, l0nVar2);
        }
    }

    public static final void t0(dpi0 dpi0Var, te90 te90Var, long j, boolean z) {
        if (cy7.c() && z) {
            O(dpi0Var, te90Var.d, Z(te90Var.e, j));
            O(dpi0Var, "-", j);
            O(dpi0Var, te90Var.b, Z(te90Var.c, j));
            O(dpi0Var, Separators.STAR, j);
            return;
        }
        O(dpi0Var, Separators.STAR, j);
        O(dpi0Var, te90Var.b, Z(te90Var.c, j));
        O(dpi0Var, "-", j);
        O(dpi0Var, te90Var.d, Z(te90Var.e, j));
    }

    public static final void u(int i, fet fetVar) {
        fetVar.g0(-38523865);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.s(jm40.b, 128.0f), 84.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 17);
        }
    }

    public static final void u0(dpi0 dpi0Var, te90 te90Var, long j, boolean z) {
        if (cy7.c() && z) {
            O(dpi0Var, te90Var.d, Z(te90Var.e, j));
            O(dpi0Var, Separators.STAR, j);
            O(dpi0Var, "-", j);
            O(dpi0Var, te90Var.b, Z(te90Var.c, j));
            return;
        }
        O(dpi0Var, te90Var.b, Z(te90Var.c, j));
        O(dpi0Var, "-", j);
        O(dpi0Var, Separators.STAR, j);
        O(dpi0Var, te90Var.d, Z(te90Var.e, j));
    }

    public static final void v(h9j h9jVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1691031282);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(h9jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new thd((byte) 20);
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) objP;
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(clzVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(h9jVar, clzVar, (byte) 6);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(clzVar) | (i3 == 4);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(h9jVar, clzVar, (byte) 5);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, h9jVar, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(h9jVar, i, (byte) 29);
        }
    }

    public static final void v0(dpi0 dpi0Var, te90 te90Var, long j, boolean z) {
        if (cy7.c() && z) {
            O(dpi0Var, te90Var.d, Z(te90Var.e, j));
            O(dpi0Var, "-", j);
            O(dpi0Var, te90Var.b, Z(te90Var.c, j));
        } else {
            O(dpi0Var, te90Var.b, Z(te90Var.c, j));
            O(dpi0Var, "-", j);
            O(dpi0Var, te90Var.d, Z(te90Var.e, j));
        }
    }

    public static final void w(mm40 mm40Var, nco ncoVar, qdz qdzVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        ncoVar.getClass();
        qdzVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-1805205132);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ncoVar) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 180.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            uzb.C(null, ncoVar.f23304a, qdzVar, g5h.EVENT_FOCUS, function1, fetVar, (i2 & 896) | 3072 | (57344 & i2), 1);
            fetVar2 = fetVar;
            e3c.b(null, k3g.f17616a, function0, fetVar2, (i2 >> 3) & 896, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (p6t0) ncoVar, qdzVar, function0, (wdr) function1, i, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    public static final void w0(dpi0 dpi0Var, pz10 pz10Var, long j, boolean z) {
        P(dpi0Var, "\u2066");
        int i = 0;
        if (pz10Var instanceof kz10) {
            kz10 kz10Var = (kz10) pz10Var;
            boolean z2 = cy7.c() && z;
            List listT0 = kz10Var.f;
            if (z2) {
                listT0 = CollectionsKt.t0(listT0);
            }
            int i2 = z2 ? 0 : q3d.i(listT0);
            for (Object obj : listT0) {
                int i3 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                te90 te90Var = (te90) obj;
                if (i == i2) {
                    int i4 = gql0.f11739a;
                    int i5 = kz10Var.g;
                    if (i5 <= 0) {
                        v0(dpi0Var, te90Var, j, z);
                    } else if (i5 == 1) {
                        t0(dpi0Var, te90Var, j, z);
                    } else {
                        u0(dpi0Var, te90Var, j, z);
                    }
                } else {
                    v0(dpi0Var, te90Var, j, z);
                }
                if (i != listT0.size() - 1) {
                    O(dpi0Var, Separators.COMMA, j);
                    P(dpi0Var, Separators.SP);
                }
                i = i3;
            }
        } else if (pz10Var instanceof lz10) {
            List listT1 = ((lz10) pz10Var).f;
            if (cy7.c() && z) {
                listT1 = CollectionsKt.t0(listT1);
            }
            for (Object obj2 : listT1) {
                int i6 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                v0(dpi0Var, (te90) obj2, j, z);
                if (i != listT1.size() - 1) {
                    O(dpi0Var, Separators.COMMA, j);
                    P(dpi0Var, Separators.SP);
                }
                i = i6;
            }
        } else if (pz10Var instanceof mz10) {
            mz10 mz10Var = (mz10) pz10Var;
            boolean z3 = cy7.c() && z;
            List listT2 = mz10Var.f;
            if (z3) {
                listT2 = CollectionsKt.t0(listT2);
            }
            int i7 = z3 ? 0 : q3d.i(listT2);
            for (Object obj3 : listT2) {
                int i8 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                te90 te90Var2 = (te90) obj3;
                if (i == i7) {
                    int i9 = gql0.f11739a;
                    int i10 = mz10Var.g;
                    if (i10 <= 0) {
                        v0(dpi0Var, te90Var2, j, z);
                    } else if (i10 == 1) {
                        t0(dpi0Var, te90Var2, j, z);
                    } else {
                        u0(dpi0Var, te90Var2, j, z);
                    }
                } else {
                    v0(dpi0Var, te90Var2, j, z);
                }
                if (i != listT2.size() - 1) {
                    O(dpi0Var, Separators.COMMA, j);
                    P(dpi0Var, Separators.SP);
                }
                i = i8;
            }
        } else {
            if (!(pz10Var instanceof oz10)) {
                t9f.b();
                return;
            }
            if (cy7.c() && z) {
                oz10 oz10Var = (oz10) pz10Var;
                z0(dpi0Var, oz10Var, j, z);
                y0(dpi0Var, oz10Var, j, z);
            } else {
                oz10 oz10Var2 = (oz10) pz10Var;
                y0(dpi0Var, oz10Var2, j, z);
                z0(dpi0Var, oz10Var2, j, z);
            }
        }
        P(dpi0Var, "\u2069");
    }

    public static atf0 x(int i) {
        return new atf0(i, psq.e, new osq(new nsq[0]));
    }

    public static final void x0(dpi0 dpi0Var, izm0 izm0Var, long j, boolean z) {
        P(dpi0Var, "\u2066");
        List listT0 = (cy7.c() && z) ? CollectionsKt.t0(izm0Var.d()) : izm0Var.d();
        int i = 0;
        for (Object obj : listT0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            v0(dpi0Var, (te90) obj, j, z);
            if (i != listT0.size() - 1) {
                O(dpi0Var, Separators.COMMA, j);
                P(dpi0Var, Separators.SP);
            }
            i = i2;
        }
        P(dpi0Var, "\u2069");
    }

    public static final void y(mm40 mm40Var, List list, fet fetVar) {
        list.getClass();
        kr00.a(u1c.M(1068333425, new ika((byte) 2, mm40Var, list), fetVar), fetVar, 6);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    public static final void y0(dpi0 dpi0Var, oz10 oz10Var, long j, boolean z) {
        int i = 0;
        boolean z2 = cy7.c() && z;
        List listT0 = oz10Var.f;
        if (z2) {
            listT0 = CollectionsKt.t0(listT0);
        }
        int i2 = z2 ? 0 : q3d.i(listT0);
        for (Object obj : listT0) {
            int i3 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            te90 te90Var = (te90) obj;
            if (i == i2) {
                int i4 = gql0.f11739a;
                int i5 = oz10Var.o;
                if (i5 <= 0) {
                    v0(dpi0Var, te90Var, j, z);
                } else if (i5 == 1) {
                    t0(dpi0Var, te90Var, j, z);
                } else {
                    u0(dpi0Var, te90Var, j, z);
                }
            } else {
                v0(dpi0Var, te90Var, j, z);
            }
            if (i != listT0.size() - 1) {
                O(dpi0Var, Separators.COMMA, j);
                P(dpi0Var, Separators.SP);
            }
            i = i3;
        }
    }

    public static final void z(mm40 mm40Var, ehm0 ehm0Var, boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(450522582);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ehm0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = ehm0Var.f7815a;
            boolean z3 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new hcr(function1, (byte) 7);
                fetVar.o0(objP);
            }
            tfx.p(R.string.statistic_info_events, R.drawable.ic_glyph_info_circle_primary, z2, (Function0) objP, o7k0.y(mm40Var, null, 3), u1c.M(-166268632, new kfe(ehm0Var, z, function1, (byte) 13), fetVar), fetVar, 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new euq(mm40Var, ehm0Var, z, function1, i, (byte) 1);
        }
    }

    public static final void z0(dpi0 dpi0Var, oz10 oz10Var, long j, boolean z) {
        String str = oz10Var.g;
        boolean z2 = oz10Var.h;
        boolean z3 = oz10Var.j;
        String str2 = oz10Var.i;
        if (str.length() <= 0 && str2.length() <= 0) {
            return;
        }
        if (cy7.c() && z) {
            O(dpi0Var, str2, Z(z3, j));
            O(dpi0Var, "-", j);
            O(dpi0Var, str, Z(z2, j));
            O(dpi0Var, Separators.COLON, j);
            return;
        }
        O(dpi0Var, Separators.COLON, j);
        O(dpi0Var, str, Z(z2, j));
        O(dpi0Var, "-", j);
        O(dpi0Var, str2, Z(z3, j));
    }
}
