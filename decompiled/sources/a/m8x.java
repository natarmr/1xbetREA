package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m8x {
    public static final void A(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1954722120);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 10.0f, 1);
            long jM139getBackgroundContent0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarL, jM139getBackgroundContent0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            azw.t(new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), null, dwi0.h, fetVar, 384);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 28);
        }
    }

    public static final a4d0 A0(c4d0 c4d0Var, roi0 roi0Var) {
        roi0Var.getClass();
        int i = c4d0Var.c;
        if ((i & 4) == 4) {
            a4d0 a4d0Var = c4d0Var.g;
            a4d0Var.getClass();
            return a4d0Var;
        }
        if ((i & 8) == 8) {
            return roi0Var.c(c4d0Var.h);
        }
        jf4.n("No underlyingType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final void B(int i, fet fetVar, mm40 mm40Var, String str, Function0 function0, boolean z) {
        fetVar.g0(1114594680);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (z) {
            fetVar.e0(498154640);
            qzb.n(o7k0.d(mm40Var, 1.0f), new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.make_bet, fetVar)), true, false, false), function0, fetVar, (i2 >> 3) & 896, 0);
            fetVar.r(false);
        } else {
            fetVar.e0(498645649);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 40.0f);
            zfn zfnVar = zaq0.b;
            long jM167getSecondary100d7_KjU = ((ThemeColors) fetVar.k(zfnVar)).getSecondary10();
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            d(i2 & 896, qmk.o, fetVar, s5x0.K(i120.Q(mm40VarE, jM167getSecondary100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 12.0f, 10.0f), y9q0.a(g1t0.j(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), y9q0.a(g1t0.j(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), xsm0.s(R.string.toto_chosen_2, fetVar), str);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b0y(mm40Var, z, str, function0, i);
        }
    }

    public static final qlc B0(qlc qlcVar) {
        swq swqVar = e4m0.f7189a;
        return new qlc(e4m0.f7189a, g950.e(TokenNames.U.concat(qlcVar.f().c())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(Function1 function1, mv00 mv00Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        byte b;
        function1.getClass();
        mv00Var.getClass();
        fetVar.g0(-1491097335);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mv00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i3 == 4) | (i4 == 32);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new x6h0(function1, mv00Var, (byte) 18);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40Var, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = w1j0.f38403a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new wvi0((byte) 14);
                fetVar.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            boolean z2 = (i3 == 4) | (i4 == 32);
            Object objP4 = fetVar.P();
            if (z2 || objP4 == obj) {
                b = 1;
                objP4 = new lb(mv00Var, function1, b);
                fetVar.o0(objP4);
            } else {
                b = 1;
            }
            y860.g(xdrVar, null, function2, null, (Function1) objP4, fetVar, 390, 10);
            fetVar.r(b);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) function1, (Object) mv00Var, mm40Var, i, (byte) 11);
        }
    }

    public static final List C0(f4d0 f4d0Var, roi0 roi0Var) {
        f4d0Var.getClass();
        roi0Var.getClass();
        List arrayList = f4d0Var.h;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = f4d0Var.i;
            list.getClass();
            arrayList = new ArrayList(r3d.q(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(roi0Var.c(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final void D(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(401554870);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 94.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 3);
        }
    }

    public static final void D0(vpy vpyVar, List list, List list2, List list3, hhk hhkVar) {
        ArrayList arrayListC = vpyVar.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListC.add(q0((i3d0) it.next(), hhkVar));
        }
        ArrayList arrayListA = vpyVar.a();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA.add(s0((p3d0) it2.next(), hhkVar));
        }
        ArrayList arrayListB = vpyVar.b();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            c4d0 c4d0Var = (c4d0) it3.next();
            gqy gqyVar = new gqy(c4d0Var.d, ((h950) hhkVar.b).getString(c4d0Var.e));
            List list4 = c4d0Var.f;
            list4.getClass();
            hhk hhkVarI = hhkVar.i(list4);
            h950 h950Var = (h950) hhkVarI.b;
            roi0 roi0Var = (roi0) hhkVarI.c;
            List<f4d0> list5 = c4d0Var.f;
            list5.getClass();
            for (f4d0 f4d0Var : list5) {
                f4d0Var.getClass();
                gqyVar.b.add(u0(f4d0Var, hhkVarI));
            }
            t0(A0(c4d0Var, roi0Var), hhkVarI);
            t0(P(c4d0Var, roi0Var), hhkVarI);
            List<p2d0> list6 = c4d0Var.k;
            list6.getClass();
            for (p2d0 p2d0Var : list6) {
                p2d0Var.getClass();
                gqyVar.c.add(l8x.m0(p2d0Var, h950Var));
            }
            List<Integer> list7 = c4d0Var.l;
            list7.getClass();
            for (Integer num : list7) {
                num.getClass();
                gqyVar.d.add(e0(num.intValue(), hhkVarI));
            }
            List<t2d0> list8 = c4d0Var.m;
            list8.getClass();
            for (t2d0 t2d0Var : list8) {
                gqyVar.e.put(h950Var.getString(t2d0Var.c), t2d0Var.d.o());
            }
            Iterator it4 = ((List) hhkVarI.h).iterator();
            while (it4.hasNext()) {
                ((kd40) it4.next()).getClass();
            }
            arrayListB.add(gqyVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v11, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v6, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v7, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v8, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r10v9, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void E(ff6 ff6Var, awj0 awj0Var, Function1 function1, fet fetVar, int i) {
        ?? r10;
        hxo0 hxo0Var;
        knd0 knd0Var;
        f9x f9xVar;
        ?? r0;
        knd0 knd0Var2;
        ?? r11;
        mm40 mm40Var;
        ?? r12;
        fet fetVar2 = fetVar;
        ff6Var.getClass();
        awj0Var.getClass();
        zv6 zv6Var = awj0Var.f1577a;
        function1.getClass();
        fetVar2.g0(-1057163989);
        int i2 = i | (fetVar2.g(ff6Var) ? 32 : 16) | (fetVar2.g(awj0Var) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 1169) != 1168)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            pz40 pz40VarF = androidx.compose.runtime.e.f(ff6Var.f9436a, fetVar2);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(ff6Var.b, fetVar2);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new nrj0(function1, b);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new nrj0(function1, (byte) 3);
                fetVar2.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new nrj0(function1, (byte) 5);
                fetVar2.o0(objP3);
            }
            jiq0.d(mm40VarL, pz40VarF, pz40VarF2, function0, function2, (Function0) objP3, fetVar, 0);
            fet fetVar3 = fetVar;
            f9x f9xVar2 = awj0Var.d;
            hxo0 hxo0Var2 = awj0Var.b;
            knd0 knd0Var3 = awj0Var.c;
            if (zv6Var.g) {
                fetVar3.e0(1023527194);
                hxo0Var = hxo0Var2;
                knd0Var = knd0Var3;
                wvb.o(null, 8.0f, 0L, fetVar3, 0, 5);
                nx6 nx6Var = zv6Var.f45042a;
                pln0 pln0Var = zv6Var.b;
                wnb0 wnb0Var = zv6Var.c;
                kke kkeVar = zv6Var.d;
                gx6 gx6Var = zv6Var.e;
                String str = zv6Var.f;
                boolean z4 = i3 == 2048;
                Object objP4 = fetVar3.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new nrj0(function1, (byte) 7);
                    fetVar3.o0(objP4);
                }
                Function0 function3 = (Function0) objP4;
                boolean z5 = i3 == 2048;
                Object objP5 = fetVar3.P();
                if (z5 || objP5 == cl5Var) {
                    objP5 = new nrj0(function1, (byte) 8);
                    fetVar3.o0(objP5);
                }
                Function0 function4 = (Function0) objP5;
                boolean z6 = i3 == 2048;
                Object objP6 = fetVar3.P();
                if (z6 || objP6 == cl5Var) {
                    objP6 = new abh0(function1, (byte) 16);
                    fetVar3.o0(objP6);
                }
                Function1 function5 = (Function1) objP6;
                boolean z7 = i3 == 2048;
                Object objP7 = fetVar3.P();
                if (z7 || objP7 == cl5Var) {
                    objP7 = new nrj0(function1, (byte) 9);
                    fetVar3.o0(objP7);
                }
                Function0 function6 = (Function0) objP7;
                f9xVar = f9xVar2;
                r0 = 0;
                cwr0.h(null, nx6Var, pln0Var, wnb0Var, kkeVar, gx6Var, str, null, function3, function4, function5, function6, null, fetVar, 0, 4225);
                fetVar3 = fetVar;
                wvb.o(null, 4.0f, 0L, fetVar3, 0, 5);
                fetVar3.r(false);
            } else {
                hxo0Var = hxo0Var2;
                knd0Var = knd0Var3;
                f9xVar = f9xVar2;
                r0 = 0;
                fetVar3.e0(1024569879);
                fetVar3.r(false);
            }
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 16.0f, 8.0f);
            wul wulVar = awj0Var.e;
            ?? r8 = i3 == 2048 ? 1 : r0;
            Object objP8 = fetVar3.P();
            if (r8 != 0 || objP8 == cl5Var) {
                objP8 = new nrj0(function1, (byte) 10);
                fetVar3.o0(objP8);
            }
            qzb.n(mm40VarK, wulVar, phu0.G(r0, 1, fetVar3, (Function0) objP8), fetVar, 0, 0);
            ?? r13 = fetVar;
            hxo0 hxo0Var3 = hxo0Var;
            if (hxo0Var3.f13820a) {
                r13.e0(1024943398);
                wvb.o(null, 4.0f, 0L, r13, 0, 5);
                btm0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), hxo0Var3.b, hxo0Var3.d, hxo0Var3.e, hxo0Var3.c, null, fetVar, 0);
                ?? r14 = fetVar;
                knd0Var2 = knd0Var;
                if (knd0Var2 == null || !knd0Var2.b) {
                    r14.e0(1025568823);
                    r14.r(r0);
                } else {
                    r14.e0(1025496748);
                    wvb.o(null, 12.0f, 0L, r14, 0, 5);
                    r14.r(r0);
                }
                r14.r(r0);
                r11 = r14;
            } else {
                knd0Var2 = knd0Var;
                r13.e0(1025574775);
                r13.r(r0);
                r11 = r13;
            }
            if (knd0Var2 == null || !knd0Var2.b) {
                mm40Var = null;
                r11.e0(1026020183);
                r11.r(r0);
                r12 = r11;
            } else {
                r11.e0(1025683833);
                vtb.t(null, qqm.b, null, 0L, fetVar, 48, 13);
                ?? r15 = fetVar;
                wvb.o(null, 4.0f, 0L, r15, 0, 5);
                epd0 epd0Var = knd0Var2.f18581a;
                ?? r16 = i3 == 2048 ? 1 : r0;
                Object objP9 = r15.P();
                if (r16 != 0 || objP9 == cl5Var) {
                    objP9 = new abh0(function1, (byte) 17);
                    r15.o0(objP9);
                }
                mm40Var = null;
                zvw.s(null, epd0Var, (Function1) objP9, r15, r0);
                r15.r(r0);
                r12 = r15;
            }
            if (f9xVar.b) {
                r12.e0(1026081098);
                wvb.o(null, 4.0f, 0L, r12, 0, 5);
                d9x.b(r0, 1, r12, mm40Var, f9xVar.f9177a);
                r12.r(r0);
                r10 = r12;
            } else {
                r12.e0(1026247351);
                r12.r(r0);
                r10 = r12;
            }
        } else {
            fetVar2.X();
            r10 = fetVar2;
        }
        yfe0 yfe0VarU = r10.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0((byte) 15, i, (Object) ff6Var, (Object) awj0Var, function1);
        }
    }

    public static final void F(mm40 mm40Var, ier0 ier0Var, lh80 lh80Var, d9z d9zVar, qw3 qw3Var, qw3 qw3Var2, Function1 function1, fet fetVar, int i) {
        int i2;
        ier0Var.getClass();
        int i3 = ier0Var.b;
        d9zVar.getClass();
        function1.getClass();
        fetVar.g0(236848189);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ier0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(lh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(d9zVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(qw3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(qw3Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            float f = ((ycl) fetVar.k(wdr0.f38987a)).f42389a;
            ngv ngvVar = new ngv(i3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, i3 * 70.0f);
            boolean zD = ((i2 & 112) == 32) | fetVar.d(f) | ((i2 & 3670016) == 1048576);
            Object objP = fetVar.P();
            if (zD || objP == ukd.f35823a) {
                objP = new ny2((Object) ier0Var, f, (Object) function1, (byte) 14);
                fetVar.o0(objP);
            }
            int i4 = (i2 >> 3) & 896;
            int i5 = i2 << 3;
            g8x.h(ngvVar, mm40VarE, d9zVar, lh80Var, qw3Var, qw3Var2, null, false, null, (Function1) objP, fetVar, i4 | (i5 & 7168) | (458752 & i5) | (i5 & 3670016), 0, 912);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) ier0Var, (Object) lh80Var, (Object) d9zVar, (Object) qw3Var, (Object) qw3Var2, (Object) function1, i, (byte) 20);
        }
    }

    public static final qlc G(String str) {
        swq swqVar = e4m0.f7189a;
        return new qlc(e4m0.i, g950.e(str));
    }

    public static final qlc H(String str) {
        swq swqVar = e4m0.f7189a;
        return new qlc(e4m0.f7189a, g950.e(str));
    }

    public static final qlc I(String str) {
        swq swqVar = e4m0.f7189a;
        return new qlc(e4m0.c, g950.e(str));
    }

    public static pz40 J() {
        return androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
    }

    public static final List K(s2d0 s2d0Var, roi0 roi0Var) {
        s2d0Var.getClass();
        roi0Var.getClass();
        List arrayList = s2d0Var.m;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = s2d0Var.n;
            list.getClass();
            arrayList = new ArrayList(r3d.q(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(roi0Var.c(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List L(i3d0 i3d0Var, roi0 roi0Var) {
        i3d0Var.getClass();
        roi0Var.getClass();
        List arrayList = i3d0Var.l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = i3d0Var.m;
            list.getClass();
            arrayList = new ArrayList(r3d.q(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(roi0Var.c(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List M(p3d0 p3d0Var, roi0 roi0Var) {
        p3d0Var.getClass();
        roi0Var.getClass();
        List arrayList = p3d0Var.l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = p3d0Var.m;
            list.getClass();
            arrayList = new ArrayList(r3d.q(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(roi0Var.c(num.intValue()));
            }
        }
        return arrayList;
    }

    public static void N(Object obj, String str, String str2) {
        String strY = Y(str);
        if (Log.isLoggable(strY, 3)) {
            Log.d(strY, String.format(str2, obj));
        }
    }

    public static void O(Exception exc, String str, String str2) {
        String strY = Y(str);
        if (Log.isLoggable(strY, 6)) {
            Log.e(strY, str2, exc);
        }
    }

    public static final a4d0 P(c4d0 c4d0Var, roi0 roi0Var) {
        roi0Var.getClass();
        int i = c4d0Var.c;
        if ((i & 16) == 16) {
            a4d0 a4d0Var = c4d0Var.i;
            a4d0Var.getClass();
            return a4d0Var;
        }
        if ((i & 32) == 32) {
            return roi0Var.c(c4d0Var.j);
        }
        jf4.n("No expandedType in ProtoBuf.TypeAlias");
        return null;
    }

    public static final f3w Q(vw4 vw4Var, ctf0 ctf0Var, String str) {
        String strA = ctf0Var.b.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var = pn40.f27267a;
        return new f3w("", strA, pn40.c(vw4Var.f, p3u0.c), str, e3w.f7156a);
    }

    public static final l3w R(vw4 vw4Var, ctf0 ctf0Var) {
        iy4 iy4Var = vw4Var.g;
        String str = vw4Var.D;
        if (iy4Var != iy4.c || str.length() <= 0) {
            return null;
        }
        return new l3w(kotlin.text.c.r(ctf0Var.b.a(R.string.cancellation_reason, Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false), str, j8x.f16108a);
    }

    public static final int S(int i) {
        return njq.b(njq.c.e(i).booleanValue(), (o4d0) njq.d.e(i), (k3d0) njq.e.e(i));
    }

    public static final duy T(vw4 vw4Var, ctf0 ctf0Var, boolean z) {
        int i;
        iy4 iy4Var = vw4Var.g;
        iy4 iy4Var2 = iy4.b;
        if (iy4Var == iy4Var2 && vw4Var.B) {
            i = R.string.drop_on;
        } else {
            if (iy4Var != iy4Var2) {
                return null;
            }
            i = R.string.not_drop_on;
        }
        String strR = kotlin.text.c.r(ctf0Var.b.a(R.string.when_score_change, Arrays.copyOf(new Object[0], 0)), Separators.COLON, "", false);
        String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        duy duyVar = new duy(strR, strA, s6t0.b().f33626a.getTextPrimary());
        if (z) {
            return duyVar;
        }
        return null;
    }

    public static final LinkedHashSet U(List list) {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BetGroupZip betGroupZip = (BetGroupZip) it.next();
            Long lValueOf = Long.valueOf(betGroupZip.b);
            if (!betGroupZip.h) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                linkedHashSet.add(lValueOf);
            }
        }
        return linkedHashSet;
    }

    public static final boolean V(y9q0 y9q0Var) {
        ew90 ew90Var;
        rw90 rw90Var = y9q0Var.c;
        etn etnVar = (rw90Var == null || (ew90Var = rw90Var.f31208a) == null) ? null : new etn(ew90Var.b);
        boolean z = false;
        if (etnVar != null && etnVar.f8383a == 1) {
            z = true;
        }
        return !z;
    }

    public static final a4x W(v5l0 v5l0Var, boolean z) {
        l0l0 l0l0Var;
        int i = z ? 12 : 4;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int iOrdinal = v5l0Var.ordinal();
            if (iOrdinal == 0) {
                l0l0Var = g0l0.f10465a;
            } else if (iOrdinal == 1) {
                l0l0Var = k0l0.f17474a;
            } else if (iOrdinal == 2) {
                l0l0Var = j0l0.f15687a;
            } else if (iOrdinal == 3) {
                l0l0Var = i0l0.f13953a;
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                l0l0Var = h0l0.f12241a;
            }
            arrayList.add(new x56(l0l0Var));
        }
        return dyb.o0(arrayList);
    }

    public static final bfj X(vw4 vw4Var, ctf0 ctf0Var) {
        int i;
        long jM113getRed0d7_KjU;
        iy4 iy4Var = vw4Var.g;
        int iOrdinal = iy4Var.ordinal();
        if (iOrdinal == 0) {
            i = R.string.error;
        } else if (iOrdinal == 1) {
            i = R.string.autobet_waiting;
        } else if (iOrdinal == 2) {
            i = R.string.autobet_dropped;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            i = R.string.accepted;
        }
        String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
        int iOrdinal2 = iy4Var.ordinal();
        if (iOrdinal2 == 0) {
            pz40 pz40Var = s6t0.f31722a;
            jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else if (iOrdinal2 == 1) {
            pz40 pz40Var2 = s6t0.f31722a;
            jM113getRed0d7_KjU = s6t0.b().f33626a.getSecondary();
        } else if (iOrdinal2 == 2) {
            pz40 pz40Var3 = s6t0.f31722a;
            jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else {
            if (iOrdinal2 != 3) {
                t9f.b();
                return null;
            }
            pz40 pz40Var4 = s6t0.f31722a;
            jM113getRed0d7_KjU = s6t0.b().f33626a.getPrimary();
        }
        long j = jM113getRed0d7_KjU;
        int iOrdinal3 = iy4Var.ordinal();
        int i2 = R.drawable.ic_glyph_status_outline_cancel;
        if (iOrdinal3 != 0) {
            if (iOrdinal3 == 1) {
                i2 = R.drawable.ic_glyph_status_outline_clock;
            } else if (iOrdinal3 != 2) {
                if (iOrdinal3 != 3) {
                    t9f.b();
                    return null;
                }
                i2 = R.drawable.ic_glyph_status_outline_check;
            }
        }
        return new bfj(i2, j, bfb.R(vw4Var.d, ctf0Var), strA);
    }

    public static String Y(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final void Z(pz40 pz40Var) {
        pz40Var.setValue(Unit.f46060a);
    }

    public static final void a(mm40 mm40Var, bhl0 bhl0Var, ahl0 ahl0Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        k2q k2qVar;
        fetVar.g0(1513906391);
        byte b = 2;
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(bhl0Var) ? 32 : 16) | (fetVar.g(ahl0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 >> 6;
            ahl0Var.getClass();
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(ahl0Var)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (ahl0Var instanceof zgl0) {
                    pz40 pz40Var = s6t0.f31722a;
                    k2qVar = new k2q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary());
                } else if (!(ahl0Var instanceof ygl0)) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    k2qVar = new k2q(staticColors.m125getWhite100d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                objP = k2qVar;
                fetVar.o0(objP);
            }
            k2q k2qVar2 = (k2q) objP;
            b(mm40Var2, k2qVar2.f17586a, function0, u1c.M(-787131924, new nhl0(bhl0Var, k2qVar2, b), fetVar), u1c.M(-25250613, new rqc0(k2qVar2, (byte) 20), fetVar), fetVar, (i3 & 14) | 27648 | ((i3 >> 3) & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new phl0(mm40Var, bhl0Var, ahl0Var, function0, i, (byte) 1);
        }
    }

    public static final LinkedHashMap a0(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iA = wp20.a(r3d.q(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final void b(mm40 mm40Var, long j, Function0 function0, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-654669293);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new l3c0(function0, (byte) 27);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarW, 0.0f, 6.0f, 1), 36.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            mm40 mm40VarJ = s5x0.J(jr8.f16991a.b(jm40.b, gqw0.e), 8.0f);
            int i3 = i2;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            Object objValueOf = Integer.valueOf(((i3 >> 6) & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, objValueOf);
            h97.p(((i3 >> 9) & 112) | 6, ugdVar2, zhg0Var, fetVar, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lhl0(mm40Var, j, function0, ugdVar, ugdVar2, i, (byte) 2);
        }
    }

    public static final int b0(r8z r8zVar, ma80 ma80Var) {
        return (int) (ma80Var == ma80.f21447a ? r8zVar.x & 4294967295L : r8zVar.x >> 32);
    }

    public static final void c(ir8 ir8Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(646619692);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarB = ir8Var.b(jm40.b, gqw0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = ffb0.Q(mm40VarB, 2.0f, -6.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            h97.p((i2 & 112) | 6, ugdVar, zhg0.f44392a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mhl0(ir8Var, ugdVar, i, b);
        }
    }

    public static final a4d0 c0(a4d0 a4d0Var, roi0 roi0Var) {
        a4d0Var.getClass();
        roi0Var.getClass();
        int i = a4d0Var.c;
        if ((i & 256) == 256) {
            return a4d0Var.m;
        }
        if ((i & 512) == 512) {
            return roi0Var.c(a4d0Var.n);
        }
        return null;
    }

    public static final void d(int i, long j, fet fetVar, mm40 mm40Var, y9q0 y9q0Var, y9q0 y9q0Var2, String str, String str2) {
        int i2;
        str.getClass();
        fetVar.g0(842528106);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(y9q0Var2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            nnw0.g(o7k0.d(mm40Var, 1.0f), gqw0.e, false, u1c.M(-1026212032, new acv0(str, str2, y9q0Var, j, y9q0Var2), fetVar), fetVar, 3120, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fsn(mm40Var, str, str2, j, y9q0Var, y9q0Var2, i);
        }
    }

    public static final qlc d0(g950 g950Var) {
        swq swqVar = e4m0.f7189a;
        qlc qlcVar = e4m0.m;
        return new qlc(qlcVar.f28927a, g950.e(g950Var.c().concat(qlcVar.f().c())));
    }

    public static final void e(fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(1964015640);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.K(jm40.b, 16.0f, 8.0f), 1.0f), 32.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 14, i, fqj0Var);
        }
    }

    public static final a6u e0(int i, hhk hhkVar) {
        wbu0 wbu0Var;
        nbk nbkVar;
        vkr0 vkr0Var;
        nqy nqyVar;
        mqy mqyVar;
        a6u a6uVar = new a6u();
        h950 h950Var = (h950) hhkVar.b;
        xbu0 xbu0Var = (xbu0) hhkVar.d;
        h950Var.getClass();
        xbu0Var.getClass();
        m4d0 m4d0Var = (m4d0) CollectionsKt.W(i, xbu0Var.f40617a);
        wbu0 wbu0Var2 = wbu0.d;
        if (m4d0Var == null) {
            vkr0Var = null;
        } else {
            Integer numValueOf = (m4d0Var.b & 1) == 1 ? Integer.valueOf(m4d0Var.c) : null;
            Integer numValueOf2 = (m4d0Var.b & 2) == 2 ? Integer.valueOf(m4d0Var.d) : null;
            if (numValueOf2 != null) {
                wbu0Var = new wbu0(numValueOf2.intValue() & 255, (numValueOf2.intValue() >> 8) & 255, (numValueOf2.intValue() >> 16) & 255);
            } else {
                wbu0Var = numValueOf != null ? new wbu0(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : wbu0Var2;
            }
            k4d0 k4d0Var = m4d0Var.e;
            k4d0Var.getClass();
            int iOrdinal = k4d0Var.ordinal();
            if (iOrdinal == 0) {
                nbkVar = nbk.f23245a;
            } else if (iOrdinal == 1) {
                nbkVar = nbk.b;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                nbkVar = nbk.c;
            }
            nbk nbkVar2 = nbkVar;
            Integer numValueOf3 = (m4d0Var.b & 8) == 8 ? Integer.valueOf(m4d0Var.f) : null;
            String string = (m4d0Var.b & 16) == 16 ? h950Var.getString(m4d0Var.g) : null;
            l4d0 l4d0Var = m4d0Var.h;
            l4d0Var.getClass();
            vkr0Var = new vkr0(wbu0Var, l4d0Var, nbkVar2, numValueOf3, string);
        }
        if (vkr0Var == null && !hhkVar.f13068a) {
            throw new w4x("No VersionRequirement with the given id in the table", null);
        }
        l4d0 l4d0Var2 = vkr0Var != null ? (l4d0) vkr0Var.c : null;
        int i2 = l4d0Var2 == null ? -1 : uae0.f35323a[l4d0Var2.ordinal()];
        if (i2 == -1) {
            nqyVar = nqy.d;
        } else if (i2 == 1) {
            nqyVar = nqy.f23976a;
        } else if (i2 == 2) {
            nqyVar = nqy.b;
        } else {
            if (i2 != 3) {
                t9f.b();
                return null;
            }
            nqyVar = nqy.c;
        }
        nbk nbkVar3 = vkr0Var != null ? (nbk) vkr0Var.d : null;
        int i3 = nbkVar3 == null ? -1 : uae0.b[nbkVar3.ordinal()];
        if (i3 == -1) {
            mqyVar = mqy.c;
        } else if (i3 == 1) {
            mqyVar = mqy.f22243a;
        } else if (i3 != 2) {
            if (i3 != 3) {
                t9f.b();
                return null;
            }
            mqyVar = mqy.c;
        } else {
            mqyVar = mqy.b;
        }
        a6uVar.b = nqyVar;
        a6uVar.c = mqyVar;
        a6uVar.d = vkr0Var != null ? (Integer) vkr0Var.e : null;
        a6uVar.e = vkr0Var != null ? (String) vkr0Var.f : null;
        if (vkr0Var != null) {
            wbu0Var2 = (wbu0) vkr0Var.b;
        }
        a6uVar.f = new lqy(wbu0Var2.f38897a, wbu0Var2.b, wbu0Var2.c);
        return a6uVar;
    }

    public static final void f(mm40 mm40Var, final int i, final int i2, final boolean z, final Function0 function0, fet fetVar, final int i3, final int i4) {
        mm40 mm40Var2;
        int i5;
        fet fetVar2;
        final mm40 mm40Var3;
        long jM169getSecondary400d7_KjU;
        long jM169getSecondary400d7_KjU2;
        fetVar.g0(-2038013618);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i5 = (fetVar.g(mm40Var2) ? 4 : 2) | i3;
        }
        int i7 = i5 | (fetVar.e(i) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128);
        if ((i3 & 3072) == 0) {
            i7 |= fetVar.h(z) ? 2048 : 1024;
        }
        int i8 = i7 | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i8 & 1, (i8 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i6 != 0 ? jm40Var : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.s(mm40Var4, 96.0f), 0.0f, 6.0f, 0.0f, 8.0f, 5);
            boolean z2 = (57344 & i8) == 16384;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new dbn(function0, (byte) 20);
                fetVar.o0(objP);
            }
            mm40 mm40Var5 = mm40Var4;
            mm40 mm40VarW = y860.W(mm40VarN, null, null, z, null, (Function0) objP, 24);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            s4u0 s4u0VarR = iom0.r(jpm0.t(i2, ((i8 >> 3) & 112) | 6, fetVar), fetVar);
            if (z) {
                jM169getSecondary400d7_KjU = cs0.e(fetVar, -793591573, fetVar, false);
            } else {
                fetVar.e0(-793590577);
                jM169getSecondary400d7_KjU = afn0.m(fetVar).getSecondary40();
                fetVar.r(false);
            }
            dww.c(s4u0VarR, null, o7k0.n(jm40Var, 32.0f), jM169getSecondary400d7_KjU, fetVar, 56, 0);
            mm40 mm40VarA = o7k0.A(s5x0.N(jm40Var, 6.0f, 4.0f, 6.0f, 0.0f, 8), null, 3);
            String strS = xsm0.s(i, fetVar);
            if (z) {
                jM169getSecondary400d7_KjU2 = cs0.e(fetVar, -793577621, fetVar, false);
            } else {
                fetVar.e0(-793576625);
                jM169getSecondary400d7_KjU2 = afn0.m(fetVar).getSecondary40();
                fetVar.r(false);
            }
            kc5.N(strS, mm40VarA, jM169getSecondary400d7_KjU2, null, null, 0L, qmk.o, g1t0.d().f42262a.b, null, null, 0L, null, 2, false, 1, 0, false, null, g1t0.d(), 0.0f, fetVar, 0, 1597440, 0, 3063608);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var3 = mm40Var5;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.c0y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m8x.f(mm40Var3, i, i2, z, function0, (fet) obj, x8x.L(i3 | 1), i4 ? 1 : 0);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final a4d0 f0(i3d0 i3d0Var, roi0 roi0Var) {
        i3d0Var.getClass();
        roi0Var.getClass();
        int i = i3d0Var.c;
        if ((i & 32) == 32) {
            return i3d0Var.j;
        }
        if ((i & 64) == 64) {
            return roi0Var.c(i3d0Var.k);
        }
        return null;
    }

    public static final void g(mm40 mm40Var, w5c0 w5c0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        boolean z;
        String str;
        fet fetVar2 = fetVar;
        fetVar2.g0(1787031175);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(w5c0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = fetVar2.k(bmd.n) == k6z.b;
            zfn zfnVar = gxf.f12075a;
            long jM46getPromoGradientStart0d7_KjU = ((CustomColors) fetVar2.k(zfnVar)).m46getPromoGradientStart0d7_KjU();
            long jM45getPromoGradientEnd0d7_KjU = ((CustomColors) fetVar2.k(zfnVar)).m45getPromoGradientEnd0d7_KjU();
            boolean zH = fetVar2.h(z2) | fetVar2.f(jM46getPromoGradientStart0d7_KjU) | fetVar2.f(jM45getPromoGradientEnd0d7_KjU);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = yk5.g(z2 ? q3d.j(new y3d(jM45getPromoGradientEnd0d7_KjU), new y3d(jM46getPromoGradientStart0d7_KjU)) : q3d.j(new y3d(jM46getPromoGradientStart0d7_KjU), new y3d(jM45getPromoGradientEnd0d7_KjU)), 0.0f, 0.0f, 14);
                fetVar2.o0(objP);
            }
            byte b = 14;
            mm40 mm40VarE0 = o2e.e0(phu0.F(i120.P(mm40Var, (t89) objP, null, 6), null, null, false, null, function0, fetVar2, (i2 << 9) & 458752, 15), "PROMO_BANNER");
            boolean zH2 = fetVar2.h(z2) | fetVar2.f(jM45getPromoGradientEnd0d7_KjU) | fetVar2.f(jM46getPromoGradientStart0d7_KjU);
            Object objP2 = fetVar2.P();
            if (zH2 || objP2 == cl5Var) {
                z = z2;
                objP2 = new qip(z, jM45getPromoGradientEnd0d7_KjU, jM46getPromoGradientStart0d7_KjU);
                fetVar2.o0(objP2);
            } else {
                z = z2;
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            zx7 zx7Var = gqw0.f;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            s(o7k0.c(jr8Var.b(jm40Var, zx7Var), 1.0f), w5c0Var.d, z, fetVar2, 0);
            mm40 mm40VarB = jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.d);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarB, 16.0f, 0.0f, 96.0f, 0.0f, 10);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            mm40 mm40VarE1 = o2e.e0(jm40Var, "PROMO_BANNER_TITLE");
            String str2 = w5c0Var.f38576a;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            zfn zfnVar3 = m8m0.f21378a;
            v8q0.a(str2, mm40VarE1, ((StaticColors) fetVar2.k(zfnVar3)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarG, fetVar2, 48, 24960, 110584);
            fetVar2 = fetVar2;
            String str3 = w5c0Var.b;
            if (str3 == null || StringsKt.W(str3) || (str = w5c0Var.c) == null || StringsKt.W(str)) {
                fetVar2.e0(801869183);
                fetVar2.r(false);
            } else {
                fetVar2.e0(801498764);
                String str4 = w5c0Var.b;
                String str5 = w5c0Var.c;
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                paq0.b(null, str4, str5, ((StaticColors) fetVar2.k(zfnVar3)).m123getWhite0d7_KjU(), g1t0.q(), qmk.G, qmk.C, 0.0f, fetVar2, 0, 129);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5c0(mm40Var, w5c0Var, function0, i, (byte) 1);
        }
    }

    public static final a4d0 g0(p3d0 p3d0Var, roi0 roi0Var) {
        p3d0Var.getClass();
        roi0Var.getClass();
        int i = p3d0Var.c;
        if ((i & 32) == 32) {
            return p3d0Var.j;
        }
        if ((i & 64) == 64) {
            return roi0Var.c(p3d0Var.k);
        }
        return null;
    }

    public static final void h(mm40 mm40Var, pz40 pz40Var, final hil0 hil0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        l2q l2qVar;
        Object obj;
        pz40 pz40Var2;
        Object mf5Var;
        fetVar.g0(109518204);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.g(hil0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            ahl0 ahl0VarC = hil0Var.c();
            ahl0VarC.getClass();
            boolean zG = fetVar.g(ahl0VarC);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (ahl0VarC instanceof zgl0) {
                    pz40 pz40Var3 = s6t0.f31722a;
                    zgl0 zgl0Var = (zgl0) ahl0VarC;
                    l2qVar = new l2q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getPrimary20(), s6t0.b().f33626a.getPrimary60(), zgl0Var.f44350a, zgl0Var.b, s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary());
                } else {
                    if (!(ahl0VarC instanceof ygl0)) {
                        t9f.b();
                        return;
                    }
                    pz40 pz40Var4 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    ygl0 ygl0Var = (ygl0) ahl0VarC;
                    l2qVar = new l2q(staticColors.m125getWhite100d7_KjU(), staticColors.m126getWhite200d7_KjU(), staticColors.m130getWhite600d7_KjU(), ygl0Var.f42591a, ygl0Var.b, staticColors.m62getBlack0d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                obj = l2qVar;
                fetVar.o0(obj);
            } else {
                obj = objP;
            }
            l2q l2qVar2 = (l2q) obj;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                pz40Var2 = pz40Var;
                objP2 = jgk0.b(new m9l0(pz40Var2, (byte) 23));
                fetVar.o0(objP2);
            } else {
                pz40Var2 = pz40Var;
            }
            final l7m0 l7m0Var = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new m9l0(pz40Var2, (byte) 17));
                fetVar.o0(objP3);
            }
            final l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = jgk0.b(new m9l0(pz40Var2, (byte) 18));
                fetVar.o0(objP4);
            }
            final l7m0 l7m0Var3 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new m9l0(pz40Var2, (byte) 19));
                fetVar.o0(objP5);
            }
            final l7m0 l7m0Var4 = (l7m0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = jgk0.b(new m9l0(pz40Var2, (byte) 20));
                fetVar.o0(objP6);
            }
            final l7m0 l7m0Var5 = (l7m0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = jgk0.b(new m9l0(pz40Var2, (byte) 21));
                fetVar.o0(objP7);
            }
            final l7m0 l7m0Var6 = (l7m0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = jgk0.b(new m9l0(pz40Var2, (byte) 22));
                fetVar.o0(objP8);
            }
            l7m0 l7m0Var7 = (l7m0) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                objP9 = jgk0.b(new hhl0(pz40Var2, l7m0Var5, l7m0Var6, (byte) 4));
                fetVar.o0(objP9);
            }
            final l7m0 l7m0Var8 = (l7m0) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = jgk0.b(new hhl0(pz40Var2, l7m0Var5, l7m0Var6, (byte) 5));
                fetVar.o0(objP10);
            }
            final l7m0 l7m0Var9 = (l7m0) objP10;
            long j = l2qVar2.f;
            long j2 = l2qVar2.h;
            long j3 = l2qVar2.g;
            boolean zF = fetVar.f(j);
            Object objP11 = fetVar.P();
            if (zF || objP11 == cl5Var) {
                objP11 = new tsl(new psl(j));
                fetVar.o0(objP11);
            }
            final tsl tslVar = (tsl) objP11;
            boolean zF2 = fetVar.f(j);
            Object objP12 = fetVar.P();
            if (zF2 || objP12 == cl5Var) {
                objP12 = new usl(new psl(j));
                fetVar.o0(objP12);
            }
            final usl uslVar = (usl) objP12;
            boolean zF3 = fetVar.f(j) | fetVar.f(j3);
            Object objP13 = fetVar.P();
            if (zF3 || objP13 == cl5Var) {
                objP13 = new p1m(j, j3);
                fetVar.o0(objP13);
            }
            final p1m p1mVar = (p1m) objP13;
            boolean zF4 = fetVar.f(j);
            Object objP14 = fetVar.P();
            if (zF4 || objP14 == cl5Var) {
                objP14 = new j1m(j);
                fetVar.o0(objP14);
            }
            final j1m j1mVar = (j1m) objP14;
            boolean zF5 = fetVar.f(j) | fetVar.f(j2);
            Object objP15 = fetVar.P();
            if (zF5 || objP15 == cl5Var) {
                objP15 = new a1m(j, j2);
                fetVar.o0(objP15);
            }
            final a1m a1mVar = (a1m) objP15;
            boolean zG2 = fetVar.g(hil0Var.c());
            Object objP16 = fetVar.P();
            if (zG2 || objP16 == cl5Var) {
                ahl0 ahl0VarC2 = hil0Var.c();
                if (ahl0VarC2 != null) {
                    if (ahl0VarC2 instanceof zgl0) {
                        mf5Var = new lf5(3, null);
                    } else if (ahl0VarC2 instanceof ygl0) {
                        mf5Var = new mf5();
                    }
                    objP16 = mf5Var;
                    fetVar.o0(objP16);
                }
                t9f.b();
                return;
            }
            final nf5 nf5Var = (nf5) objP16;
            int i4 = (i3 & 14) | 100663728;
            int i5 = i3 << 9;
            i(mm40Var, l7m0Var3, l7m0Var7, l2qVar2.f19324a, l2qVar2.b, l2qVar2.c, function0, function1, u1c.M(-1661051888, new xdr() { // from class: a.uhl0
                @Override // a.xdr
                public final Object F(Object obj2, Object obj3, Object obj4) {
                    ir8 ir8Var = (ir8) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ir8Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(ir8Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        l7m0 l7m0Var10 = l7m0Var;
                        hil0 hil0Var2 = hil0Var;
                        l7m0 l7m0Var11 = l7m0Var3;
                        int i6 = iIntValue & 14;
                        tfx.d(ir8Var, 0.0f, 0.0f, 0.0f, u1c.M(1207417507, new dfc0((Object) l7m0Var10, (Object) hil0Var2, (Object) l7m0Var11, (Object) l7m0Var2, (byte) 28), fetVar2), fetVar2, i6 | 24576, 7);
                        if (((Boolean) l7m0Var4.getValue()).booleanValue()) {
                            fetVar2.e0(-2077086067);
                            zcl zclVar = qmk.f28987a;
                            thb.f(o2e.e0(ffb0.Q(jm40.b, -2.0f, -4.0f), "DS_TAG_DOT"), nf5Var, fetVar2, 0, 0);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-2076835246);
                            fetVar2.r(false);
                        }
                        m8x.c(ir8Var, u1c.M(440774254, new i9x(l7m0Var11, a1mVar, l7m0Var5, p1mVar, l7m0Var6, j1mVar, l7m0Var8, tslVar, l7m0Var9, uslVar, (byte) 3), fetVar2), fetVar2, i6 | 48);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, i4 | (3670016 & i5) | (i5 & 29360128));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(mm40Var, pz40Var, hil0Var, function0, function1, i, (byte) 7);
        }
    }

    public static final qlc h0(String str) {
        swq swqVar = e4m0.f7189a;
        return new qlc(e4m0.b, g950.e(str));
    }

    public static final void i(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, long j, long j2, long j3, Function0 function0, Function0 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var3;
        l7m0 l7m0Var4;
        boolean z;
        z5z z5zVar;
        fetVar.g0(-710388826);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var3 = l7m0Var;
            i2 |= fetVar.g(l7m0Var3) ? 32 : 16;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i & 384) == 0) {
            l7m0Var4 = l7m0Var2;
            i2 |= fetVar.g(l7m0Var4) ? 256 : 128;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.f(j3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean z2 = l7m0Var3.getValue() == k0d.b;
            Context context = (Context) fetVar.k(dy2.b);
            float f = z2 ? 0.5f : 1.0f;
            if (z2) {
                z = true;
                zcl zclVar = qmk.f28987a;
                z5zVar = new z5z(10);
            } else {
                z = true;
                z5zVar = z5z.c;
            }
            mm40 mm40VarU = i4w0.U(mm40Var, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, z5zVar, 524283);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object objJ = objP;
            if (objP == obj) {
                objJ = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objJ;
            boolean z3 = !z2;
            boolean zI = ((29360128 & i2) == 8388608 ? z : false) | fetVar.i(context);
            Object objP2 = fetVar.P();
            Object obj2 = objP2;
            if (zI || objP2 == obj) {
                Object jhl0Var = new jhl0(function1, context, (byte) 2);
                fetVar.o0(jhl0Var);
                obj2 = jhl0Var;
            }
            Function0 function2 = (Function0) obj2;
            boolean z4 = (3670016 & i2) == 1048576 ? z : false;
            Object objP3 = fetVar.P();
            Object obj3 = objP3;
            if (z4 || objP3 == obj) {
                Object l3c0Var = new l3c0(function0, (byte) 28);
                fetVar.o0(l3c0Var);
                obj3 = l3c0Var;
            }
            mm40 mm40VarZ = y860.Z(mm40VarU, gy40Var, z3, function2, (Function0) obj3, 440);
            zcl zclVar2 = qmk.f28987a;
            boolean z5 = z;
            mm40 mm40VarE0 = o2e.e0(o7k0.b(s5x0.L(mm40VarZ, 0.0f, 6.0f, z5 ? 1 : 0), 0.0f, 36.0f, z5 ? 1 : 0), "MARKET_BOX_CONTAINER");
            boolean z6 = ((57344 & i2) == 16384) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072);
            Object objP4 = fetVar.P();
            if (z6 || objP4 == obj) {
                Object shl0Var = new shl0(l7m0Var4, j2, j, j3, (byte) 1);
                fetVar.o0(shl0Var);
                objP4 = shl0Var;
            }
            mm40 mm40VarK = rq8.K(mm40VarE0, (Function1) objP4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            ua80.p(((i2 >> 21) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new khl0(mm40Var, l7m0Var3, l7m0Var2, j, j2, j3, function0, function1, ugdVar, i, (byte) 2);
        }
    }

    public static final a4d0 i0(i3d0 i3d0Var, roi0 roi0Var) {
        i3d0Var.getClass();
        roi0Var.getClass();
        int i = i3d0Var.c;
        if ((i & 8) == 8) {
            a4d0 a4d0Var = i3d0Var.g;
            a4d0Var.getClass();
            return a4d0Var;
        }
        if ((i & 16) == 16) {
            return roi0Var.c(i3d0Var.h);
        }
        jf4.n("No returnType in ProtoBuf.Function");
        return null;
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-2017762313);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long jM139getBackgroundContent0d7_KjU = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, jM139getBackgroundContent0d7_KjU, ugg0Var2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
            mm40 mm40VarM = s5x0.M(jm40Var, 12.0f, 12.0f, 8.0f, 12.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_self_exclusion_info, 0, fetVar2);
            pz40 pz40Var = s6t0.f31722a;
            dww.c(pm80VarF, null, mm40VarM, StaticColors.INSTANCE.m132getYellow0d7_KjU(), fetVar2, 56, 0);
            mm40 mm40VarM2 = s5x0.M(jm40Var, 4.0f, 10.0f, 16.0f, 10.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarM2, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i2 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var2, str2, i, (byte) 7);
        }
    }

    public static final a4d0 j0(p3d0 p3d0Var, roi0 roi0Var) {
        p3d0Var.getClass();
        roi0Var.getClass();
        int i = p3d0Var.c;
        if ((i & 8) == 8) {
            a4d0 a4d0Var = p3d0Var.g;
            a4d0Var.getClass();
            return a4d0Var;
        }
        if ((i & 16) == 16) {
            return roi0Var.c(p3d0Var.h);
        }
        jf4.n("No returnType in ProtoBuf.Property");
        return null;
    }

    public static final void k(mm40 mm40Var, in8 in8Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(-1721997911);
        byte b = 4;
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(in8Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            byte b2 = 3;
            mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
            long jM62getBlack0d7_KjU = StaticColors.INSTANCE.m62getBlack0d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(qcc.F(mm40VarW, jM62getBlack0d7_KjU, 20.0f, 8.0f, 0.0f, 0.16f, 88), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            float f = xfn.a(fetVar2).d;
            mm40 mm40VarI = s5x0.I(mm40VarQ, knm0.f(new lh80(f, 12.0f, f, 12.0f), fetVar2));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarI);
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
            boolean z = in8Var.c;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new u9x(function1, b2);
                fetVar2.o0(objP);
            }
            f(null, R.string.clear, R.drawable.ic_glyph_clear, z, (Function0) objP, fetVar2, 0, 1);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new u9x(function1, b);
                fetVar2.o0(objP2);
            }
            f(mm40VarN, R.string.toto_random, R.drawable.ic_glyph_shuffle, true, (Function0) objP2, fetVar2, 3072, 0);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean z4 = in8Var.b;
            String str = in8Var.f15060a;
            boolean z5 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new u9x(function1, (byte) 5);
                fetVar2.o0(objP3);
            }
            B(0, fetVar2, mm40VarN2, str, (Function0) objP3, z4);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, in8Var, function1, i, (byte) 17);
        }
    }

    public static final List k0(s2d0 s2d0Var, roi0 roi0Var) {
        s2d0Var.getClass();
        roi0Var.getClass();
        List arrayList = s2d0Var.h;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = s2d0Var.i;
            list.getClass();
            arrayList = new ArrayList(r3d.q(list, 10));
            for (Integer num : list) {
                num.getClass();
                arrayList.add(roi0Var.c(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final void l(mm40 mm40Var, String str, xdr xdrVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(1666899659);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str != null ? new c15(str) : null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            y5d y5dVar = y5d.f42040a;
            if (xdrVar == null) {
                fetVar.e0(1403568896);
            } else {
                fetVar.e0(1153655073);
                xdrVar.F(y5dVar, fetVar, Integer.valueOf(((i2 >> 3) & 112) | 6));
            }
            fetVar.r(false);
            ugdVar2.F(y5dVar, fetVar, Integer.valueOf(((i2 >> 9) & 112) | 6));
            ugdVar.F(y5dVar, fetVar, Integer.valueOf(((i2 >> 6) & 112) | 6));
            if (str == null) {
                fetVar.e0(1403683844);
                fetVar.r(false);
            } else {
                fetVar.e0(1403683845);
                zcl zclVar = qmk.f28987a;
                j47.K(0, 0, fetVar, s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), str);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) str, (Object) xdrVar, (Object) ugdVar, (Object) ugdVar2, i, (byte) 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final fak0 l0(vw4 vw4Var, ctf0 ctf0Var, List list, String str, Map map, boolean z, List list2, boolean z2, BetHistoryScreenModel betHistoryScreenModel, List list3, boolean z3, List list4, boolean z4, boolean z5) {
        boolean z6;
        char c;
        String str2;
        Object next;
        Object obj;
        long j;
        i4 i4Var;
        tvw tvwVar;
        oww owwVar;
        u180 s180Var;
        u180 r180Var;
        String str3;
        String str4 = vw4Var.i;
        String str5 = vw4Var.z;
        ctf0Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        q4f q4fVar = vw4Var.b;
        List list5 = vw4Var.T;
        int iOrdinal = q4fVar.ordinal();
        u180 u180Var = p180.f26188a;
        Object g3wVar = null;
        switch (iOrdinal) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                int i = vw4Var.t;
                ArrayList arrayList = new ArrayList(r3d.q(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((z0w) it.next()).F));
                }
                HashSet hashSetJ0 = CollectionsKt.J0(arrayList);
                String str6 = vw4Var.f38130a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((xco) obj2).e) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    z6 = false;
                } else {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z6 = false;
                        } else if (hashSetJ0.contains(Long.valueOf(((xco) it2.next()).f40655a))) {
                            z6 = true;
                        }
                    }
                }
                i4 i4VarM = jwb.M(vw4Var, ctf0Var, list3, z6, "");
                Object[] objArr = {vw4Var.f38130a};
                lsm0 lsm0Var = ctf0Var.b;
                String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(objArr, 1));
                tvw tvwVarZ = lmc.Z(vw4Var);
                oww owwVar2 = new oww();
                xww xwwVarY = vtb.Y(list4, false);
                szv szvVar = new szv(i > 0 ? i / vw4Var.r : 0.0f, lsm0Var.a(R.string.events_completed, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.search_result, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(vw4Var.s)}, 2)));
                if (!z3 || q4fVar == q4f.d) {
                    c = 0;
                    g3wVar = new g3w(lsm0Var.a(R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0)), str4);
                } else {
                    c = 0;
                }
                f3w f3wVarQ = Q(vw4Var, ctf0Var, str);
                duy duyVarT = T(vw4Var, ctf0Var, z3);
                l3w l3wVarR = R(vw4Var, ctf0Var);
                bfj bfjVarX = X(vw4Var, ctf0Var);
                h3w[] h3wVarArr = new h3w[6];
                h3wVarArr[c] = szvVar;
                h3wVarArr[1] = g3wVar;
                h3wVarArr[2] = f3wVarQ;
                h3wVarArr[3] = duyVarT;
                h3wVarArr[4] = l3wVarR;
                h3wVarArr[5] = bfjVarX;
                return new fak0(str6, i4VarM, str6, strA, str5, false, tvwVarZ, owwVar2, xwwVarY, dyb.r0(tx3.z(h3wVarArr)), u180Var, "", "", "", "", "", false);
            default:
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        str2 = str5;
                        if (((xco) next).f40655a != vw4Var.O) {
                            str5 = str2;
                        }
                    } else {
                        str2 = str5;
                        next = null;
                    }
                }
                xco xcoVar = (xco) next;
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next2 = it4.next();
                        ueo ueoVar = (ueo) next2;
                        z0w z0wVar = (z0w) CollectionsKt.firstOrNull(list5);
                        obj = (z0wVar != null && ueoVar.f35538a == z0wVar.v) ? next2 : null;
                        it4 = it4;
                    }
                }
                ueo ueoVar2 = (ueo) obj;
                String str7 = vw4Var.f38130a;
                long j2 = vw4Var.h;
                i4 i4VarM2 = jwb.M(vw4Var, ctf0Var, list3, xcoVar != null ? xcoVar.e : false, "");
                String str8 = vw4Var.f38130a;
                lsm0 lsm0Var2 = ctf0Var.b;
                String strA2 = lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str8}, 1));
                tvw tvwVarZ2 = lmc.Z(vw4Var);
                oww owwVar3 = new oww();
                xww xwwVarY2 = vtb.Y(list4, false);
                i4 i4VarR0 = dyb.r0(tx3.z(new h3w[]{(!z3 || q4fVar == q4f.d) ? new g3w(lsm0Var2.a(R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0)), str4) : null, Q(vw4Var, ctf0Var, str), T(vw4Var, ctf0Var, z3), R(vw4Var, ctf0Var), X(vw4Var, ctf0Var)}));
                z0w z0wVar2 = (z0w) CollectionsKt.firstOrNull(list5);
                if (z0wVar2 == null) {
                    i4Var = i4VarR0;
                    tvwVar = tvwVarZ2;
                    owwVar = owwVar3;
                    j = 95;
                } else {
                    String str9 = z0wVar2.m;
                    String str10 = z0wVar2.p;
                    List list6 = z0wVar2.r;
                    j = 95;
                    List list7 = z0wVar2.o;
                    opm opmVar = opm.f25648a;
                    if (j2 == 95) {
                        i4Var = i4VarR0;
                        tvwVar = tvwVarZ2;
                        owwVar = owwVar3;
                        r180Var = new q180(str9, str10, new lpm(opmVar, new hpm(0L, 3)));
                    } else {
                        i4Var = i4VarR0;
                        tvwVar = tvwVarZ2;
                        owwVar = owwVar3;
                        if (list7.size() == 2 && list6.size() == 2) {
                            String str11 = (String) CollectionsKt.firstOrNull(list7);
                            if (str11 == null) {
                                str11 = "";
                            }
                            c280 c280Var = new c280(vsm0.t(str11), R.drawable.ic_glyph_placeholder_player);
                            String str12 = (String) CollectionsKt.f0(list7);
                            if (str12 == null) {
                                str12 = "";
                            }
                            c280 c280Var2 = new c280(vsm0.t(str12), R.drawable.ic_glyph_placeholder_player);
                            String str13 = (String) CollectionsKt.firstOrNull(list6);
                            if (str13 == null) {
                                str13 = "";
                            }
                            c280 c280Var3 = new c280(vsm0.t(str13), R.drawable.ic_glyph_placeholder_player);
                            String str14 = (String) CollectionsKt.f0(list6);
                            if (str14 == null) {
                                str14 = "";
                            }
                            s180Var = new t180(str9, c280Var, c280Var2, str10, c280Var3, new c280(vsm0.t(str14), R.drawable.ic_glyph_placeholder_player), new lpm(opmVar, new hpm(0L, 3)));
                        } else if (str10.length() == 0) {
                            r180Var = new r180(str9);
                        } else {
                            String str15 = (String) CollectionsKt.firstOrNull(list7);
                            if (str15 == null) {
                                str15 = "";
                            }
                            c280 c280Var4 = new c280(vsm0.s(z0wVar2.n, str15), R.drawable.ic_glyph_placeholder_player);
                            String str16 = (String) CollectionsKt.firstOrNull(list6);
                            if (str16 == null) {
                                str16 = "";
                            }
                            s180Var = new s180(str9, c280Var4, str10, new c280(vsm0.s(z0wVar2.q, str16), R.drawable.ic_glyph_placeholder_player), new lpm(opmVar, new hpm(0L, 3)));
                        }
                        u180Var = s180Var;
                    }
                    u180Var = r180Var;
                }
                z0w z0wVar3 = (z0w) CollectionsKt.U(list5);
                ril0 ril0Var = (ril0) map.get(Long.valueOf(j2));
                if (ril0Var == null || (str3 = ril0Var.b) == null) {
                    str3 = z0wVar3.u;
                }
                String strConcat = str3.concat(". ");
                if (str3.length() <= 0) {
                    strConcat = null;
                }
                if (strConcat == null) {
                    strConcat = "";
                }
                String strA3 = j2 == j ? lsm0Var2.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0)) : strConcat.concat(vw4Var.y);
                g3wVar = xcoVar != null ? xcoVar.b : null;
                return new fak0(str7, i4VarM2, str8, strA2, str2, false, tvwVar, owwVar, xwwVarY2, i4Var, u180Var, strA3, cfx0.L(vw4Var, z, z2, ueoVar2, g3wVar == null ? "" : g3wVar, z4, z5), wvb.S(vw4Var, betHistoryScreenModel), vw4Var.i, "", true);
        }
    }

    public static final void m(mm40 mm40Var, al30 al30Var, fet fetVar, int i) {
        Object obj;
        al30Var.getClass();
        fetVar.g0(1835615527);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(al30Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            Object obj3 = objP;
            if (objP == obj2) {
                Drawable drawable = context.getDrawable(R.drawable.ic_glyph_language);
                if (drawable != null) {
                    sj3.B0(drawable, context, R.attr.uikitSecondary60);
                    obj = drawable;
                } else {
                    obj = null;
                }
                fetVar.o0(obj);
                obj3 = obj;
            }
            Object obj4 = (Drawable) obj3;
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = new tr20((byte) 9);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI = fetVar.i(obj4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            byte b2 = 6;
            if (zI || objP3 == obj2) {
                objP3 = new bw20(al30Var, obj4, b2);
                fetVar.o0(objP3);
            }
            dwi0.b(function1, mm40Var, (Function1) objP3, fetVar, ((i2 << 3) & 112) | 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var, al30Var, i, b);
        }
    }

    public static final String m0(mx70 mx70Var) {
        Long l = mx70Var.f22540a;
        return kng0.k("://open/sports?", l != null ? h97.h(l.longValue(), "oppId=") : null);
    }

    public static final void n(mm40 mm40Var, j43 j43Var, String str, xdr xdrVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        boolean z;
        fetVar.g0(-1014700597);
        int i2 = i | 6 | (fetVar.g(j43Var) ? 32 : 16) | (fetVar.g(str != null ? new c15(str) : null) ? 256 : 128);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(s5x0.L(mm40VarD, 0.0f, 4.0f, 1), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            mm40Var = jm40Var;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            l(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str, xdrVar, ugdVar, ugdVar2, fetVar, (i2 >> 3) & 65520);
            if (j43Var != null) {
                fetVar.e0(-1159876205);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                z = true;
                w(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j43Var, fetVar, i2 & 112);
                fetVar.r(false);
            } else {
                z = true;
                fetVar.e0(-1159693615);
                fetVar.r(false);
            }
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var2, j43Var, str, xdrVar, ugdVar, ugdVar2, i, (byte) 22);
        }
    }

    public static final tny n0(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ncy.c((String) entry.getValue()));
        }
        return new tny("event", linkedHashMap);
    }

    public static final void o(mm40 mm40Var, ahl0 ahl0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1432562206);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(ahl0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            ahl0Var.getClass();
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(ahl0Var)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (ahl0Var instanceof zgl0) {
                    pz40 pz40Var = s6t0.f31722a;
                    objP = new m2q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary());
                } else if (!(ahl0Var instanceof ygl0)) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    objP = new m2q(staticColors.m125getWhite100d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                fetVar.o0(objP);
            }
            m2q m2qVar = (m2q) objP;
            p(mm40Var, m2qVar.f21075a, function0, u1c.M(315776603, new rqc0(m2qVar, (byte) 19), fetVar), fetVar, (i3 & 14) | 3072 | (i3 & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new thl0(mm40Var, ahl0Var, function0, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:97:0x02d8  */
    public static qpy o0(s2d0 s2d0Var, h950 h950Var, boolean z, int i) {
        String string;
        boolean z2 = false;
        boolean z3 = (i & 2) != 0 ? false : z;
        iun iunVar = iun.f15405a;
        s2d0Var.getClass();
        h950Var.getClass();
        iunVar.getClass();
        qpy qpyVar = new qpy();
        g4d0 g4d0Var = s2d0Var.A;
        g4d0Var.getClass();
        roi0 roi0Var = new roi0(g4d0Var);
        xbu0 xbu0Var = xbu0.b;
        n4d0 n4d0Var = s2d0Var.Y;
        n4d0Var.getClass();
        hhk hhkVar = new hhk(h950Var, roi0Var, tnq0.j(n4d0Var), z3, iunVar, 16);
        List list = s2d0Var.g;
        list.getClass();
        hhk hhkVarI = hhkVar.i(list);
        h950 h950Var2 = (h950) hhkVarI.b;
        List list2 = (List) hhkVarI.h;
        roi0 roi0Var2 = (roi0) hhkVarI.c;
        qpyVar.f29142a = s2d0Var.d;
        String strB0 = l8x.b0(h950Var2, s2d0Var.e);
        strB0.getClass();
        qpyVar.b = strB0;
        List<f4d0> list3 = s2d0Var.g;
        list3.getClass();
        for (f4d0 f4d0Var : list3) {
            f4d0Var.getClass();
            qpyVar.c.add(u0(f4d0Var, hhkVarI));
        }
        Iterator it = k0(s2d0Var, roi0Var2).iterator();
        while (it.hasNext()) {
            qpyVar.d.add(t0((a4d0) it.next(), hhkVarI));
        }
        List list4 = s2d0Var.p;
        list4.getClass();
        Iterator it2 = list4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            v2d0 v2d0Var = (v2d0) it2.next();
            v2d0Var.getClass();
            upy upyVar = new upy(v2d0Var.d);
            List<i4d0> list5 = v2d0Var.e;
            list5.getClass();
            for (i4d0 i4d0Var : list5) {
                i4d0Var.getClass();
                upyVar.b.add(v0(i4d0Var, hhkVarI));
            }
            List<Integer> list6 = v2d0Var.f;
            list6.getClass();
            for (Integer num : list6) {
                num.getClass();
                upyVar.c.add(e0(num.intValue(), hhkVarI));
            }
            List<t2d0> list7 = v2d0Var.g;
            list7.getClass();
            for (t2d0 t2d0Var : list7) {
                upyVar.d.put(h950Var2.getString(t2d0Var.c), t2d0Var.d.o());
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((ffy) ((kd40) it3.next())).getClass();
                zpy zpyVar = sey.b;
                zpyVar.getClass();
                sey seyVar = (sey) slb.V(upyVar.f, zpyVar);
                List<p2d0> list8 = v2d0Var.h;
                list8.getClass();
                for (p2d0 p2d0Var : list8) {
                    p2d0Var.getClass();
                    upyVar.e.add(l8x.m0(p2d0Var, h950Var2));
                }
                sso ssoVar = egy.f7784a;
                dfy dfyVarA = egy.a(v2d0Var, h950Var2, roi0Var2);
                seyVar.f32094a = dfyVarA != null ? new hfy(dfyVarA.b, dfyVarA.c) : null;
            }
            qpyVar.h.add(upyVar);
        }
        List list9 = s2d0Var.q;
        list9.getClass();
        List list10 = s2d0Var.r;
        list10.getClass();
        List list11 = s2d0Var.s;
        list11.getClass();
        D0(qpyVar, list9, list10, list11, hhkVarI);
        if ((s2d0Var.c & 4) == 4) {
            h950Var2.getString(s2d0Var.f);
        }
        List<Integer> list12 = s2d0Var.k;
        list12.getClass();
        for (Integer num2 : list12) {
            num2.getClass();
            qpyVar.i.add(h950Var2.getString(num2.intValue()));
        }
        for (d3d0 d3d0Var : s2d0Var.t) {
            if ((d3d0Var.c & 1) != 1) {
                throw new w4x("No name for EnumEntry", null);
            }
            qpyVar.j.add(h950Var2.getString(d3d0Var.d));
            abu abuVar = new abu(h950Var2.getString(d3d0Var.d));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                ((ffy) ((kd40) it4.next())).getClass();
                for (p2d0 p2d0Var2 : d3d0Var.e) {
                    ArrayList arrayList = (ArrayList) abuVar.c;
                    p2d0Var2.getClass();
                    arrayList.add(l8x.m0(p2d0Var2, h950Var2));
                }
            }
            qpyVar.k.add(abuVar);
        }
        List<Integer> list13 = s2d0Var.u;
        list13.getClass();
        for (Integer num3 : list13) {
            num3.getClass();
            qpyVar.l.add(l8x.b0(h950Var2, num3.intValue()));
        }
        if ((s2d0Var.c & 8) == 8) {
            qpyVar.m = h950Var2.getString(s2d0Var.w);
        }
        int i2 = s2d0Var.c;
        a4d0 a4d0VarC = (i2 & 16) == 16 ? s2d0Var.x : (i2 & 32) == 32 ? roi0Var2.c(s2d0Var.y) : null;
        if (a4d0VarC == null) {
            if ((s2d0Var.c & 8) == 8) {
                List list14 = s2d0Var.r;
                list14.getClass();
                Iterator it5 = list14.iterator();
                Object obj = null;
                while (true) {
                    if (!it5.hasNext()) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Object next = it5.next();
                    p3d0 p3d0Var = (p3d0) next;
                    p3d0Var.getClass();
                    if (g0(p3d0Var, roi0Var2) == null && Intrinsics.d(h950Var2.getString(p3d0Var.f), h950Var2.getString(s2d0Var.w))) {
                        if (!z2) {
                            z2 = true;
                            obj = next;
                        }
                    }
                    obj = null;
                    break;
                }
                p3d0 p3d0Var2 = (p3d0) obj;
                if (p3d0Var2 != null) {
                    a4d0VarC = j0(p3d0Var2, roi0Var2);
                } else {
                    a4d0VarC = null;
                }
            } else {
                a4d0VarC = null;
            }
        }
        qpyVar.n = a4d0VarC != null ? t0(a4d0VarC, hhkVarI) : null;
        Iterator it6 = K(s2d0Var, roi0Var2).iterator();
        while (it6.hasNext()) {
            qpyVar.p.add(t0((a4d0) it6.next(), hhkVarI));
        }
        List<Integer> list15 = s2d0Var.B;
        list15.getClass();
        for (Integer num4 : list15) {
            num4.getClass();
            qpyVar.q.add(e0(num4.intValue(), hhkVarI));
        }
        List<t2d0> list16 = s2d0Var.Z;
        list16.getClass();
        for (t2d0 t2d0Var2 : list16) {
            qpyVar.r.put(h950Var2.getString(t2d0Var2.c), t2d0Var2.d.o());
        }
        Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            ((ffy) ((kd40) it7.next())).getClass();
            qey qeyVarT = j0x.t(qpyVar);
            List<p2d0> list17 = s2d0Var.z;
            list17.getClass();
            for (p2d0 p2d0Var3 : list17) {
                p2d0Var3.getClass();
                qpyVar.o.add(l8x.m0(p2d0Var3, h950Var2));
            }
            ijt ijtVar = dgy.i;
            ijtVar.getClass();
            Integer num5 = (Integer) h8x.L(s2d0Var, ijtVar);
            if (num5 != null) {
                h950Var2.getString(num5.intValue());
            }
            for (p3d0 p3d0Var3 : (List) s2d0Var.l(dgy.h)) {
                ArrayList arrayList2 = qeyVarT.f28605a;
                p3d0Var3.getClass();
                arrayList2.add(s0(p3d0Var3, hhkVarI));
            }
            ijt ijtVar2 = dgy.g;
            ijtVar2.getClass();
            Integer num6 = (Integer) h8x.L(s2d0Var, ijtVar2);
            if (num6 == null || (string = h950Var2.getString(num6.intValue())) == null) {
                string = "main";
            }
            qeyVarT.b = string;
            ijt ijtVar3 = dgy.j;
            ijtVar3.getClass();
        }
        return qpyVar;
    }

    public static final void p(mm40 mm40Var, long j, Function0 function0, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1437905262);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new l3c0(function0, (byte) 26);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarW, 0.0f, 6.0f, 1), 36.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
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
            ua80.p(((i2 >> 6) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ihl0(mm40Var, j, function0, ugdVar, i, (byte) 2);
        }
    }

    public static final qgn p0(g3d0 g3d0Var, hhk hhkVar) {
        qgn qgnVar = new qgn((byte) 1);
        int i = g3d0Var.c;
        a4d0 a4d0VarC = null;
        if ((g3d0Var.b & 4) == 4) {
            f3d0 f3d0Var = g3d0Var.e;
            if (f3d0Var == null) {
                jf4.o("Required value was null.");
                return null;
            }
            int iOrdinal = f3d0Var.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                t9f.b();
                return null;
            }
        }
        roi0 roi0Var = (roi0) hhkVar.c;
        roi0Var.getClass();
        int i2 = g3d0Var.b;
        if ((i2 & 8) == 8) {
            a4d0VarC = g3d0Var.f;
        } else if ((i2 & 16) == 16) {
            a4d0VarC = roi0Var.c(g3d0Var.g);
        }
        if (a4d0VarC != null) {
            t0(a4d0VarC, hhkVar);
        }
        List<g3d0> list = g3d0Var.h;
        list.getClass();
        for (g3d0 g3d0Var2 : list) {
            g3d0Var2.getClass();
            qgnVar.f28694a.add(p0(g3d0Var2, hhkVar));
        }
        List<g3d0> list2 = g3d0Var.i;
        list2.getClass();
        for (g3d0 g3d0Var3 : list2) {
            g3d0Var3.getClass();
            qgnVar.b.add(p0(g3d0Var3, hhkVar));
        }
        return qgnVar;
    }

    public static final void q(mm40 mm40Var, q180 q180Var, boolean z, k6z k6zVar, fet fetVar, int i) {
        int i2;
        k6zVar.getClass();
        fetVar.g0(-1777080391);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(q180Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(k6zVar.ordinal()) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new kp2((byte) 7, z);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(q180Var.f27940a, null, 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(qzb.y0(6, k6zVar, z)), 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 109558);
            n4c.l(null, q180Var.c, z, fetVar, 1);
            v8q0.a(q180Var.b, null, 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(qzb.y0(5, k6zVar, z)), 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 109558);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 2, i, (Object) mm40Var, (Object) q180Var, (Object) k6zVar, z);
        }
    }

    public static final bqy q0(i3d0 i3d0Var, hhk hhkVar) {
        ArrayList arrayList;
        xpy xpyVar;
        bqy bqyVar = new bqy(i3d0Var.d, ((h950) hhkVar.b).getString(i3d0Var.f));
        List list = i3d0Var.i;
        list.getClass();
        hhk hhkVarI = hhkVar.i(list);
        h950 h950Var = (h950) hhkVarI.b;
        roi0 roi0Var = (roi0) hhkVarI.c;
        List<f4d0> list2 = i3d0Var.i;
        list2.getClass();
        for (f4d0 f4d0Var : list2) {
            f4d0Var.getClass();
            bqyVar.c.add(u0(f4d0Var, hhkVarI));
        }
        a4d0 a4d0VarF0 = f0(i3d0Var, roi0Var);
        bqyVar.d = a4d0VarF0 != null ? t0(a4d0VarF0, hhkVarI) : null;
        List list3 = i3d0Var.o;
        list3.getClass();
        Iterator it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = bqyVar.g;
            if (!zHasNext) {
                break;
            }
            i4d0 i4d0Var = (i4d0) it.next();
            i4d0Var.getClass();
            arrayList.add(v0(i4d0Var, hhkVarI));
        }
        if (i3d0Var.o.isEmpty()) {
            List list4 = i3d0Var.l;
            list4.getClass();
            if (!list4.isEmpty()) {
                Iterator it2 = L(i3d0Var, roi0Var).iterator();
                while (it2.hasNext()) {
                    fqy fqyVarT0 = t0((a4d0) it2.next(), hhkVarI);
                    jqy jqyVar = new jqy(0, BundleUtil.UNDERLINE_TAG);
                    jqyVar.c = fqyVarT0;
                    arrayList.add(jqyVar);
                }
            }
        }
        List<i4d0> list5 = i3d0Var.p;
        list5.getClass();
        for (i4d0 i4d0Var2 : list5) {
            i4d0Var2.getClass();
            bqyVar.f.add(v0(i4d0Var2, hhkVarI));
        }
        bqyVar.h = t0(i0(i3d0Var, roi0Var), hhkVarI);
        if ((i3d0Var.c & 256) == 256) {
            x2d0 x2d0Var = i3d0Var.s;
            x2d0Var.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            for (b3d0 b3d0Var : x2d0Var.b) {
                if ((b3d0Var.b & 1) == 1) {
                    z2d0 z2d0Var = b3d0Var.c;
                    if (z2d0Var == null) {
                        jf4.o("Required value was null.");
                        return null;
                    }
                    int iOrdinal = z2d0Var.ordinal();
                    if (iOrdinal == 0) {
                        xpyVar = xpy.f41288a;
                    } else if (iOrdinal == 1) {
                        xpyVar = xpy.b;
                    } else if (iOrdinal == 2) {
                        xpyVar = xpy.c;
                    } else {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        xpyVar = xpy.d;
                    }
                    if ((b3d0Var.b & 4) == 4) {
                        a3d0 a3d0Var = b3d0Var.f;
                        if (a3d0Var == null) {
                            jf4.o("Required value was null.");
                            return null;
                        }
                        int iOrdinal2 = a3d0Var.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                            t9f.b();
                            return null;
                        }
                        wpy[] wpyVarArr = wpy.f39565a;
                    }
                    svu svuVar = new svu(xpyVar);
                    List<g3d0> list6 = b3d0Var.d;
                    list6.getClass();
                    ArrayList arrayList3 = (ArrayList) svuVar.f32888a;
                    for (g3d0 g3d0Var : list6) {
                        g3d0Var.getClass();
                        arrayList3.add(p0(g3d0Var, hhkVarI));
                    }
                    if ((b3d0Var.b & 2) == 2) {
                        g3d0 g3d0Var2 = b3d0Var.e;
                        g3d0Var2.getClass();
                        p0(g3d0Var2, hhkVarI);
                    }
                    arrayList2.add(svuVar);
                }
            }
        }
        List<Integer> list7 = i3d0Var.r;
        list7.getClass();
        for (Integer num : list7) {
            num.getClass();
            bqyVar.i.add(e0(num.intValue(), hhkVarI));
        }
        List<t2d0> list8 = i3d0Var.t;
        list8.getClass();
        for (t2d0 t2d0Var : list8) {
            bqyVar.j.put(h950Var.getString(t2d0Var.c), t2d0Var.d.o());
        }
        Iterator it3 = ((List) hhkVarI.h).iterator();
        while (it3.hasNext()) {
            ((ffy) ((kd40) it3.next())).getClass();
            wey weyVarU = j0x.u(bqyVar);
            List<p2d0> list9 = i3d0Var.u;
            list9.getClass();
            for (p2d0 p2d0Var : list9) {
                p2d0Var.getClass();
                bqyVar.k.add(l8x.m0(p2d0Var, h950Var));
            }
            List<p2d0> list10 = i3d0Var.v;
            list10.getClass();
            for (p2d0 p2d0Var2 : list10) {
                p2d0Var2.getClass();
                bqyVar.e.add(l8x.m0(p2d0Var2, h950Var));
            }
            sso ssoVar = egy.f7784a;
            dfy dfyVarC = egy.c(i3d0Var, h950Var, roi0Var);
            weyVarU.f39041a = dfyVarC != null ? new hfy(dfyVarC.b, dfyVarC.c) : null;
            ijt ijtVar = dgy.c;
            ijtVar.getClass();
            Integer num2 = (Integer) h8x.L(i3d0Var, ijtVar);
            if (num2 != null) {
                h950Var.getString(num2.intValue());
            }
        }
        return bqyVar;
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(653164936);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
            wwb.i(null, ((lo90) l7m0Var.getValue()).f20381a, 0L, 0, 0L, fetVar, 0, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            mm40 mm40VarK = s5x0.K(jm40.b, 16.0f, 8.0f);
            Unit unit = Unit.f46060a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new qo90(function1, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = fnn0.a(mm40VarK, unit, (PointerInputEventHandler) objP);
            String str = ((lo90) l7m0Var.getValue()).b;
            b = i3 == 32 ? (byte) 1 : (byte) 0;
            Object objP2 = fetVar.P();
            if (b != 0 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 10);
                fetVar.o0(objP2);
            }
            dtb.m(mm40VarA, null, str, 0L, (Function1) objP2, null, fetVar, 0, 90);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            vtb.t(null, qqm.b, zfi0.f44303a, 0L, fetVar, 432, 9);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, (byte) 6);
        }
    }

    public static cqy r0(m3d0 m3d0Var, h950 h950Var, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        iun iunVar = iun.f15405a;
        m3d0Var.getClass();
        h950Var.getClass();
        iunVar.getClass();
        cqy cqyVar = new cqy();
        g4d0 g4d0Var = m3d0Var.g;
        g4d0Var.getClass();
        roi0 roi0Var = new roi0(g4d0Var);
        xbu0 xbu0Var = xbu0.b;
        n4d0 n4d0Var = m3d0Var.h;
        n4d0Var.getClass();
        hhk hhkVar = new hhk(h950Var, roi0Var, tnq0.j(n4d0Var), z2, iunVar, 16);
        List list = m3d0Var.d;
        list.getClass();
        List list2 = m3d0Var.e;
        list2.getClass();
        List list3 = m3d0Var.f;
        list3.getClass();
        D0(cqyVar, list, list2, list3, hhkVar);
        Iterator it = ((List) hhkVar.h).iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            zpy zpyVar = jfy.b;
            zpyVar.getClass();
            jfy jfyVar = (jfy) slb.V(cqyVar.d, zpyVar);
            for (p3d0 p3d0Var : (List) m3d0Var.l(dgy.l)) {
                ArrayList arrayList = jfyVar.f16452a;
                p3d0Var.getClass();
                arrayList.add(s0(p3d0Var, hhkVar));
            }
            ijt ijtVar = dgy.k;
            ijtVar.getClass();
            Integer num = (Integer) h8x.L(m3d0Var, ijtVar);
            if (num != null) {
                ((h950) hhkVar.b).getString(num.intValue());
            }
        }
        return cqyVar;
    }

    public static final void s(mm40 mm40Var, m0x m0xVar, boolean z, fet fetVar, int i) {
        fetVar.g0(2008711040);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(m0xVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = m0xVar.a();
                fetVar.o0(objP);
            }
            mz3 mz3VarX = l7x.X(objP, null, null, fetVar, 0, 30);
            if (((lz3) ydx.F(mz3VarX.u, fetVar).getValue()) instanceof kz3) {
                fetVar.e0(-268401712);
                j0x.b(mz3VarX, null, o2e.e0(yyw.V(o7k0.c(mm40Var, 1.0f), z), "PROMO_BANNER_IMAGE"), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
                fetVar.r(false);
            } else {
                fetVar.e0(-268132446);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) m0xVar, z, i, (byte) 18);
        }
    }

    public static final dqy s0(p3d0 p3d0Var, hhk hhkVar) {
        ArrayList arrayList;
        p3d0Var.getClass();
        dqy dqyVar = new dqy(p3d0Var.d, (p3d0Var.c & 256) == 256 ? p3d0Var.q : S(p3d0Var.d), (p3d0Var.c & 512) == 512 ? p3d0Var.r : S(p3d0Var.d), ((h950) hhkVar.b).getString(p3d0Var.f));
        List list = p3d0Var.i;
        list.getClass();
        hhk hhkVarI = hhkVar.i(list);
        roi0 roi0Var = (roi0) hhkVarI.c;
        h950 h950Var = (h950) hhkVarI.b;
        List<f4d0> list2 = p3d0Var.i;
        list2.getClass();
        for (f4d0 f4d0Var : list2) {
            f4d0Var.getClass();
            dqyVar.e.add(u0(f4d0Var, hhkVarI));
        }
        a4d0 a4d0VarG0 = g0(p3d0Var, roi0Var);
        dqyVar.f = a4d0VarG0 != null ? t0(a4d0VarG0, hhkVarI) : null;
        List list3 = p3d0Var.o;
        list3.getClass();
        Iterator it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = dqyVar.h;
            if (!zHasNext) {
                break;
            }
            i4d0 i4d0Var = (i4d0) it.next();
            i4d0Var.getClass();
            arrayList.add(v0(i4d0Var, hhkVarI));
        }
        if (p3d0Var.o.isEmpty()) {
            List list4 = p3d0Var.l;
            list4.getClass();
            if (!list4.isEmpty()) {
                Iterator it2 = M(p3d0Var, roi0Var).iterator();
                while (it2.hasNext()) {
                    fqy fqyVarT0 = t0((a4d0) it2.next(), hhkVarI);
                    jqy jqyVar = new jqy(0, BundleUtil.UNDERLINE_TAG);
                    jqyVar.c = fqyVarT0;
                    arrayList.add(jqyVar);
                }
            }
        }
        if ((p3d0Var.c & 128) == 128) {
            i4d0 i4d0Var2 = p3d0Var.p;
            i4d0Var2.getClass();
            dqyVar.i = v0(i4d0Var2, hhkVarI);
        }
        dqyVar.j = t0(j0(p3d0Var, roi0Var), hhkVarI);
        List<Integer> list5 = p3d0Var.s;
        list5.getClass();
        for (Integer num : list5) {
            num.getClass();
            dqyVar.k.add(e0(num.intValue(), hhkVarI));
        }
        List<t2d0> list6 = p3d0Var.t;
        list6.getClass();
        for (t2d0 t2d0Var : list6) {
            dqyVar.l.put(h950Var.getString(t2d0Var.c), t2d0Var.d.o());
        }
        Iterator it3 = ((List) hhkVarI.h).iterator();
        while (it3.hasNext()) {
            ((ffy) ((kd40) it3.next())).getClass();
            nfy nfyVarV = j0x.v(dqyVar);
            List<p2d0> list7 = p3d0Var.u;
            list7.getClass();
            for (p2d0 p2d0Var : list7) {
                p2d0Var.getClass();
                dqyVar.m.add(l8x.m0(p2d0Var, h950Var));
            }
            List<p2d0> list8 = p3d0Var.v;
            list8.getClass();
            ArrayList arrayList2 = dqyVar.c.b;
            for (p2d0 p2d0Var2 : list8) {
                p2d0Var2.getClass();
                arrayList2.add(l8x.m0(p2d0Var2, h950Var));
            }
            eqy eqyVar = dqyVar.d;
            if (eqyVar != null) {
                List<p2d0> list9 = p3d0Var.w;
                list9.getClass();
                ArrayList arrayList3 = eqyVar.b;
                for (p2d0 p2d0Var3 : list9) {
                    p2d0Var3.getClass();
                    arrayList3.add(l8x.m0(p2d0Var3, h950Var));
                }
            }
            List<p2d0> list10 = p3d0Var.x;
            list10.getClass();
            for (p2d0 p2d0Var4 : list10) {
                p2d0Var4.getClass();
                dqyVar.g.add(l8x.m0(p2d0Var4, h950Var));
            }
            List<p2d0> list11 = p3d0Var.y;
            list11.getClass();
            for (p2d0 p2d0Var5 : list11) {
                p2d0Var5.getClass();
                dqyVar.n.add(l8x.m0(p2d0Var5, h950Var));
            }
            List<p2d0> list12 = p3d0Var.z;
            list12.getClass();
            for (p2d0 p2d0Var6 : list12) {
                p2d0Var6.getClass();
                dqyVar.o.add(l8x.m0(p2d0Var6, h950Var));
            }
            sso ssoVar = egy.f7784a;
            cfy cfyVarB = egy.b(p3d0Var, h950Var, roi0Var, true);
            ijt ijtVar = dgy.d;
            ijtVar.getClass();
            xfy xfyVar = (xfy) h8x.L(p3d0Var, ijtVar);
            vfy vfyVar = (xfyVar == null || !xfyVar.j()) ? null : xfyVar.e;
            vfy vfyVar2 = (xfyVar == null || (xfyVar.b & 8) != 8) ? null : xfyVar.f;
            Object objL = p3d0Var.l(dgy.e);
            objL.getClass();
            nfyVarV.f23458a = ((Number) objL).intValue();
            nfyVarV.b = cfyVarB != null ? new tey(cfyVarB.b, cfyVarB.c) : null;
            nfyVarV.c = vfyVar != null ? new hfy(h950Var.getString(vfyVar.c), h950Var.getString(vfyVar.d)) : null;
            nfyVarV.d = vfyVar2 != null ? new hfy(h950Var.getString(vfyVar2.c), h950Var.getString(vfyVar2.d)) : null;
            vfy vfyVar3 = (xfyVar == null || (xfyVar.b & 2) != 2) ? null : xfyVar.d;
            nfyVarV.e = vfyVar3 != null ? new hfy(h950Var.getString(vfyVar3.c), h950Var.getString(vfyVar3.d)) : null;
            vfy vfyVar4 = (xfyVar == null || (xfyVar.b & 16) != 16) ? null : xfyVar.g;
            nfyVarV.f = vfyVar4 != null ? new hfy(h950Var.getString(vfyVar4.c), h950Var.getString(vfyVar4.d)) : null;
        }
        return dqyVar;
    }

    public static final void t(mm40 mm40Var, w5c0 w5c0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        w5c0Var.getClass();
        fetVar.g0(-1852044940);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(w5c0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarJ = lgb.J(o7k0.d(o7k0.e(mm40Var, y4c0.f41996a), 1.0f), y4c0.b);
            if (!(w5c0Var instanceof w5c0)) {
                throw b1j.f(-1698718434, fetVar, false);
            }
            fetVar.e0(-1698716769);
            g(mm40VarJ, w5c0Var, function0, fetVar, i2 & 1008);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5c0(mm40Var, w5c0Var, function0, i, (byte) 0);
        }
    }

    public static final fqy t0(a4d0 a4d0Var, hhk hhkVar) {
        x8x tpyVar;
        kqy kqyVar;
        roi0 roi0Var = (roi0) hhkVar.c;
        h950 h950Var = (h950) hhkVar.b;
        fqy fqyVar = new fqy((a4d0Var.e ? 1 : 0) + (a4d0Var.q << 1));
        aqy aqyVar = null;
        if (a4d0Var.r()) {
            tpyVar = new rpy(l8x.b0(h950Var, a4d0Var.i));
        } else {
            int i = a4d0Var.c;
            if ((i & 128) == 128) {
                tpyVar = new spy(l8x.b0(h950Var, a4d0Var.l));
            } else if ((i & 32) == 32) {
                tpyVar = new tpy(a4d0Var.j);
            } else {
                if ((i & 64) != 64) {
                    throw new w4x("No classifier (class, type alias or type parameter) recorded for Type", null);
                }
                Integer numD = hhkVar.d(a4d0Var.k);
                if (numD == null) {
                    throw new w4x("No type parameter id for " + h950Var.getString(a4d0Var.k), null);
                }
                tpyVar = new tpy(numD.intValue());
            }
        }
        fqyVar.b = tpyVar;
        for (y3d0 y3d0Var : a4d0Var.d) {
            x3d0 x3d0Var = y3d0Var.c;
            if (x3d0Var == null) {
                jf4.o("Required value was null.");
                return null;
            }
            int iOrdinal = x3d0Var.ordinal();
            if (iOrdinal == 0) {
                kqyVar = kqy.b;
            } else if (iOrdinal == 1) {
                kqyVar = kqy.c;
            } else if (iOrdinal == 2) {
                kqyVar = kqy.f18740a;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                kqyVar = null;
            }
            ArrayList arrayList = fqyVar.c;
            if (kqyVar != null) {
                roi0Var.getClass();
                int i2 = y3d0Var.b;
                a4d0 a4d0VarC = (i2 & 2) == 2 ? y3d0Var.d : (i2 & 4) == 4 ? roi0Var.c(y3d0Var.e) : null;
                if (a4d0VarC == null) {
                    throw new w4x("No type argument for non-STAR projection in Type", null);
                }
                arrayList.add(new iqy(kqyVar, t0(a4d0VarC, hhkVar)));
            } else {
                arrayList.add(iqy.c);
            }
        }
        roi0Var.getClass();
        int i3 = a4d0Var.c;
        a4d0 a4d0VarC2 = (i3 & 1024) == 1024 ? a4d0Var.o : (i3 & 2048) == 2048 ? roi0Var.c(a4d0Var.p) : null;
        fqyVar.d = a4d0VarC2 != null ? t0(a4d0VarC2, hhkVar) : null;
        a4d0 a4d0VarC0 = c0(a4d0Var, roi0Var);
        fqyVar.e = a4d0VarC0 != null ? t0(a4d0VarC0, hhkVar) : null;
        int i4 = a4d0Var.c;
        a4d0 a4d0VarC3 = (i4 & 4) == 4 ? a4d0Var.g : (i4 & 8) == 8 ? roi0Var.c(a4d0Var.h) : null;
        if (a4d0VarC3 != null) {
            fqy fqyVarT0 = t0(a4d0VarC3, hhkVar);
            String string = (a4d0Var.c & 2) == 2 ? h950Var.getString(a4d0Var.f) : null;
            aqy aqyVar2 = new aqy();
            aqyVar2.f1318a = fqyVarT0;
            aqyVar2.b = string;
            aqyVar = aqyVar2;
        }
        fqyVar.f = aqyVar;
        Iterator it = ((List) hhkVar.h).iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            lgy lgyVarW = j0x.w(fqyVar);
            Object objL = a4d0Var.l(dgy.f);
            objL.getClass();
            lgyVarW.f20028a = ((Boolean) objL).booleanValue();
            for (p2d0 p2d0Var : a4d0Var.r) {
                ArrayList arrayList2 = lgyVarW.b;
                p2d0Var.getClass();
                arrayList2.add(l8x.m0(p2d0Var, h950Var));
            }
        }
        return fqyVar;
    }

    public static final void u(mm40 mm40Var, muc0 muc0Var, fqj0 fqj0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1042303165);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(muc0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(fqj0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 12.0f, 8.0f, 0.0f, 8);
            pz40 pz40Var = s6t0.f31722a;
            long jM139getBackgroundContent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, jM139getBackgroundContent0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), 124.0f), 16.0f)), fqj0Var));
            v(null, muc0Var, fetVar, i2 & 112);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, muc0Var, fqj0Var, i, (byte) 29);
        }
    }

    public static final hqy u0(f4d0 f4d0Var, hhk hhkVar) {
        kqy kqyVar;
        h950 h950Var = (h950) hhkVar.b;
        e4d0 e4d0Var = f4d0Var.g;
        if (e4d0Var == null) {
            jf4.o("Required value was null.");
            return null;
        }
        int iOrdinal = e4d0Var.ordinal();
        if (iOrdinal == 0) {
            kqyVar = kqy.b;
        } else if (iOrdinal == 1) {
            kqyVar = kqy.c;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            kqyVar = kqy.f18740a;
        }
        boolean z = f4d0Var.f;
        hqy hqyVar = new hqy(z ? 1 : 0, h950Var.getString(f4d0Var.e), f4d0Var.d, kqyVar);
        Iterator it = C0(f4d0Var, (roi0) hhkVar.c).iterator();
        while (it.hasNext()) {
            hqyVar.e.add(t0((a4d0) it.next(), hhkVar));
        }
        Iterator it2 = ((List) hhkVar.h).iterator();
        while (it2.hasNext()) {
            ((ffy) ((kd40) it2.next())).getClass();
            zpy zpyVar = mgy.b;
            zpyVar.getClass();
            mgy mgyVar = (mgy) slb.V(hqyVar.f, zpyVar);
            for (p2d0 p2d0Var : f4d0Var.k) {
                ArrayList arrayList = mgyVar.f21764a;
                p2d0Var.getClass();
                arrayList.add(l8x.m0(p2d0Var, h950Var));
            }
        }
        return hqyVar;
    }

    public static final void v(mm40 mm40Var, muc0 muc0Var, fet fetVar, int i) {
        muc0 muc0Var2;
        fet fetVar2;
        fetVar.g0(-4855768);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(muc0Var) ? 32 : 16;
        }
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new bue0(b);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            muc0Var2 = muc0Var;
            fetVar2 = fetVar;
            x2x.k(jm40Var, muc0Var2, false, (Function1) objP, fetVar2, (i2 & 14) | 3072 | (i2 & 112), 4);
            mm40Var = jm40Var;
        } else {
            muc0Var2 = muc0Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) mm40Var, (Object) muc0Var2, i, (byte) 20);
        }
    }

    public static final jqy v0(i4d0 i4d0Var, hhk hhkVar) {
        int i = i4d0Var.d;
        int i2 = i4d0Var.e;
        h950 h950Var = (h950) hhkVar.b;
        jqy jqyVar = new jqy(i, h950Var.getString(i2));
        roi0 roi0Var = (roi0) hhkVar.c;
        jqyVar.c = t0(z0(i4d0Var, roi0Var), hhkVar);
        int i3 = i4d0Var.c;
        a4d0 a4d0VarC = (i3 & 16) == 16 ? i4d0Var.h : (i3 & 32) == 32 ? roi0Var.c(i4d0Var.i) : null;
        jqyVar.d = a4d0VarC != null ? t0(a4d0VarC, hhkVar) : null;
        if ((i4d0Var.c & 64) == 64) {
            m2d0 m2d0Var = i4d0Var.k;
            m2d0Var.getClass();
            l8x.n0(m2d0Var, h950Var);
        }
        Iterator it = ((List) hhkVar.h).iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            List<p2d0> list = i4d0Var.j;
            list.getClass();
            for (p2d0 p2d0Var : list) {
                p2d0Var.getClass();
                jqyVar.e.add(l8x.m0(p2d0Var, h950Var));
            }
        }
        return jqyVar;
    }

    public static final void w(mm40 mm40Var, j43 j43Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1870711215);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j43Var) ? 32 : 16;
        }
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            i4w0.g(mm40Var, j43Var, new by6(null, 1023), fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, j43Var, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final a600 w0(d600 d600Var) {
        ?? arrayList;
        Integer num;
        d600Var.getClass();
        Integer num2 = d600Var.f5529a;
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num2.intValue();
        Integer num3 = d600Var.b;
        if (num3 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue2 = num3.intValue();
        List<z500> list = d600Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (z500 z500Var : list) {
                z500Var.getClass();
                Integer num4 = z500Var.f43797a;
                if (num4 == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue3 = num4.intValue();
                jaa0 jaa0Var = z500Var.b;
                int iIntValue4 = (jaa0Var == null || (num = jaa0Var.f16181a) == null) ? 0 : num.intValue();
                Double d = z500Var.c;
                if (d == null) {
                    jf4.k(null);
                    return null;
                }
                double dDoubleValue = d.doubleValue();
                String str = z500Var.d;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Double d2 = z500Var.e;
                arrayList.add(new w500(dDoubleValue, d2 != null ? d2.doubleValue() : 0.0d, iIntValue3, iIntValue4, str2));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new a600(iIntValue, iIntValue2, arrayList);
    }

    public static final void x(String str, float f, fet fetVar, int i) {
        str.getClass();
        fetVar.g0(1478260687);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.d(f) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = epv0.N(o7k0.n(jm40Var, 24.0f), f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM62getBlack0d7_KjU = staticColors.m62getBlack0d7_KjU();
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(i120.S(mm40VarN, 1.0f, jM62getBlack0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), staticColors.m123getWhite0d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 0.0f, 4.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            k7x.a(str, null, o7k0.n(jm40Var, 20.0f), gqw0.A, null, fetVar, (i2 & 14) | 1572912, 1976);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new blb(f, i, str);
        }
    }

    public static final xa20 x0(wa20 wa20Var) {
        wa20Var.getClass();
        switch (wa20Var.ordinal()) {
            case 0:
                return xa20.f40534a;
            case 1:
                return xa20.b;
            case 2:
                return xa20.c;
            case 3:
                return xa20.d;
            case 4:
                return xa20.e;
            case 5:
                return xa20.f;
            case 6:
                return xa20.g;
            case 7:
                return xa20.h;
            case 8:
                return xa20.i;
            case 9:
                return xa20.j;
            case 10:
                return xa20.k;
            case 11:
                return xa20.l;
            default:
                t9f.b();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:123:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x0191  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x0234  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    public static final void y(mm40 mm40Var, Function2 function2, Function2 function3, Function2 function4, Function2 function5, int i, long j, long j2, vhv0 vhv0Var, final ugd ugdVar, fet fetVar, final int i2, final int i3) {
        mm40 mm40Var2;
        int i4;
        Function2 function6;
        int i5;
        Function2 function7;
        int i6;
        int i7;
        int i8;
        Function2 function8;
        int i9;
        int i10;
        long j3;
        vhv0 vhv0VarK;
        boolean z;
        final Function2 function9;
        final int i11;
        final long j4;
        final mm40 mm40Var3;
        final Function2 function10;
        final Function2 function11;
        final Function2 function12;
        final long j5;
        final vhv0 vhv0Var2;
        yfe0 yfe0VarU;
        Function2 function13;
        long jB;
        int i12;
        mm40 mm40Var4;
        boolean z2;
        Object objP;
        zz40 zz40Var;
        boolean zG;
        Object objP2;
        int i13;
        fetVar.g0(-1211482744);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i2 & 48) == 0) {
                function6 = function2;
                i4 |= fetVar.i(function6) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    function7 = function3;
                    if (fetVar.i(function7)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 3072;
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((i2 & 24576) == 0) {
                        function8 = function5;
                        if (fetVar.i(function8)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i7 |= i9;
                    }
                    i10 = i7 | 196608;
                    if ((1572864 & i2) == 0) {
                        if ((i3 & 64) == 0) {
                            j3 = j;
                            int i16 = fetVar.f(j3) ? 1048576 : 524288;
                            i10 |= i16;
                        } else {
                            j3 = j;
                        }
                        i10 |= i16;
                    } else {
                        j3 = j;
                    }
                    if ((i2 & 12582912) != 0) {
                        i10 |= ((i3 & 128) == 0 || !fetVar.f(j2)) ? 4194304 : 8388608;
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i3 & 256) == 0) {
                            vhv0VarK = vhv0Var;
                            int i17 = fetVar.g(vhv0VarK) ? 67108864 : 33554432;
                            i10 |= i17;
                        } else {
                            vhv0VarK = vhv0Var;
                        }
                        i10 |= i17;
                    } else {
                        vhv0VarK = vhv0Var;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (fetVar.i(ugdVar)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i10 |= i13;
                    }
                    if ((306783379 & i10) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i10 & 1, z)) {
                        fetVar.Z();
                        if ((i2 & 1) != 0 || fetVar.B()) {
                            if (i14 != 0) {
                                mm40Var2 = jm40.b;
                            }
                            if (i15 != 0) {
                                function6 = nhd.f23526a;
                            }
                            if (i5 != 0) {
                                function7 = nhd.b;
                            }
                            function13 = nhd.c;
                            if (i8 != 0) {
                                function8 = nhd.d;
                            }
                            if ((i3 & 64) != 0) {
                                j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                jB = v4d.b(j3, fetVar);
                                i10 &= -29360129;
                            } else {
                                jB = j2;
                            }
                            if ((i3 & 256) != 0) {
                                i10 &= -234881025;
                                mm40Var4 = mm40Var2;
                                vhv0VarK = jtt0.k(fetVar);
                                i12 = 2;
                            } else {
                                i12 = 2;
                            }
                            fetVar.s();
                            int i18 = (234881024 & i10) ^ 100663296;
                            z2 = (i18 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864;
                            objP = fetVar.P();
                            Object obj = ukd.f35823a;
                            if (z2 || objP == obj) {
                                objP = new zz40(vhv0VarK);
                                fetVar.o0(objP);
                            }
                            zz40Var = (zz40) objP;
                            Function2 function14 = function13;
                            zG = fetVar.g(zz40Var) | ((i18 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
                            objP2 = fetVar.P();
                            if (zG || objP2 == obj) {
                                objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                                fetVar.o0(objP2);
                            }
                            Function2 function15 = function8;
                            Function2 function16 = function6;
                            Function2 function17 = function7;
                            int i19 = i12;
                            int i20 = i10 >> 12;
                            long j6 = j3;
                            vhv0 vhv0Var3 = vhv0VarK;
                            long j7 = jB;
                            gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j6, j7, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i19, function16, ugdVar, function14, function15, zz40Var, function17), fetVar), fetVar, (i20 & 7168) | (i20 & 896) | 12582912, 114);
                            j5 = j6;
                            j4 = j7;
                            mm40Var3 = mm40Var4;
                            function10 = function16;
                            function12 = function17;
                            function9 = function14;
                            function11 = function15;
                            vhv0Var2 = vhv0Var3;
                            i11 = i19;
                        } else {
                            fetVar.X();
                            if ((i3 & 64) != 0) {
                                i10 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i10 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i10 &= -234881025;
                            }
                            function13 = function4;
                            i12 = i;
                            jB = j2;
                        }
                        mm40Var4 = mm40Var2;
                        fetVar.s();
                        int i110 = (234881024 & i10) ^ 100663296;
                        if (i110 <= 67108864) {
                        }
                        objP = fetVar.P();
                        Object obj2 = ukd.f35823a;
                        if (z2) {
                            objP = new zz40(vhv0VarK);
                            fetVar.o0(objP);
                        } else {
                            objP = new zz40(vhv0VarK);
                            fetVar.o0(objP);
                        }
                        zz40Var = (zz40) objP;
                        Function2 function18 = function13;
                        zG = fetVar.g(zz40Var) | ((i110 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
                        objP2 = fetVar.P();
                        if (zG) {
                            objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                            fetVar.o0(objP2);
                        }
                        Function2 function19 = function8;
                        Function2 function110 = function6;
                        Function2 function111 = function7;
                        int i111 = i12;
                        int i21 = i10 >> 12;
                        long j8 = j3;
                        vhv0 vhv0Var4 = vhv0VarK;
                        long j9 = jB;
                        gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j8, j9, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i111, function110, ugdVar, function18, function19, zz40Var, function111), fetVar), fetVar, (i21 & 7168) | (i21 & 896) | 12582912, 114);
                        j5 = j8;
                        j4 = j9;
                        mm40Var3 = mm40Var4;
                        function10 = function110;
                        function12 = function111;
                        function9 = function18;
                        function11 = function19;
                        vhv0Var2 = vhv0Var4;
                        i11 = i111;
                    } else {
                        fetVar.X();
                        function9 = function4;
                        i11 = i;
                        j4 = j2;
                        mm40Var3 = mm40Var2;
                        function10 = function6;
                        function11 = function8;
                        function12 = function7;
                        j5 = j3;
                        vhv0Var2 = vhv0VarK;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.a1h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iL = x8x.L(i2 | 1);
                                m8x.y(mm40Var3, function10, function12, function9, function11, i11, j5, j4, vhv0Var2, ugdVar, (fet) obj3, iL, i3);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i7 = i4 | 27648;
                function8 = function5;
                i10 = i7 | 196608;
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        j3 = j;
                        if (fetVar.f(j3)) {
                        }
                        i10 |= i16;
                    } else {
                        j3 = j;
                    }
                    i10 |= i16;
                } else {
                    j3 = j;
                }
                if ((i2 & 12582912) != 0) {
                    i10 |= ((i3 & 128) == 0 || !fetVar.f(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        vhv0VarK = vhv0Var;
                        if (fetVar.g(vhv0VarK)) {
                        }
                        i10 |= i17;
                    } else {
                        vhv0VarK = vhv0Var;
                    }
                    i10 |= i17;
                } else {
                    vhv0VarK = vhv0Var;
                }
                if ((i2 & 805306368) == 0) {
                    if (fetVar.i(ugdVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i10 |= i13;
                }
                if ((306783379 & i10) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i10 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i15 != 0) {
                            function6 = nhd.f23526a;
                        }
                        if (i5 != 0) {
                            function7 = nhd.b;
                        }
                        function13 = nhd.c;
                        if (i8 != 0) {
                            function8 = nhd.d;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB = v4d.b(j3, fetVar);
                            i10 &= -29360129;
                        } else {
                            jB = j2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 &= -234881025;
                            mm40Var4 = mm40Var2;
                            vhv0VarK = jtt0.k(fetVar);
                            i12 = 2;
                        } else {
                            i12 = 2;
                            mm40Var4 = mm40Var2;
                        }
                    } else {
                        if (i14 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i15 != 0) {
                            function6 = nhd.f23526a;
                        }
                        if (i5 != 0) {
                            function7 = nhd.b;
                        }
                        function13 = nhd.c;
                        if (i8 != 0) {
                            function8 = nhd.d;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB = v4d.b(j3, fetVar);
                            i10 &= -29360129;
                        } else {
                            jB = j2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 &= -234881025;
                            mm40Var4 = mm40Var2;
                            vhv0VarK = jtt0.k(fetVar);
                            i12 = 2;
                        } else {
                            i12 = 2;
                            mm40Var4 = mm40Var2;
                        }
                    }
                    fetVar.s();
                    int i112 = (234881024 & i10) ^ 100663296;
                    if (i112 <= 67108864) {
                    }
                    objP = fetVar.P();
                    Object obj3 = ukd.f35823a;
                    if (z2) {
                        objP = new zz40(vhv0VarK);
                        fetVar.o0(objP);
                    } else {
                        objP = new zz40(vhv0VarK);
                        fetVar.o0(objP);
                    }
                    zz40Var = (zz40) objP;
                    Function2 function112 = function13;
                    zG = fetVar.g(zz40Var) | ((i112 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                        fetVar.o0(objP2);
                    }
                    Function2 function113 = function8;
                    Function2 function114 = function6;
                    Function2 function115 = function7;
                    int i113 = i12;
                    int i22 = i10 >> 12;
                    long j10 = j3;
                    vhv0 vhv0Var5 = vhv0VarK;
                    long j11 = jB;
                    gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j10, j11, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i113, function114, ugdVar, function112, function113, zz40Var, function115), fetVar), fetVar, (i22 & 7168) | (i22 & 896) | 12582912, 114);
                    j5 = j10;
                    j4 = j11;
                    mm40Var3 = mm40Var4;
                    function10 = function114;
                    function12 = function115;
                    function9 = function112;
                    function11 = function113;
                    vhv0Var2 = vhv0Var5;
                    i11 = i113;
                } else {
                    fetVar.X();
                    function9 = function4;
                    i11 = i;
                    j4 = j2;
                    mm40Var3 = mm40Var2;
                    function10 = function6;
                    function11 = function8;
                    function12 = function7;
                    j5 = j3;
                    vhv0Var2 = vhv0VarK;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.a1h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            int iL = x8x.L(i2 | 1);
                            m8x.y(mm40Var3, function10, function12, function9, function11, i11, j5, j4, vhv0Var2, ugdVar, (fet) obj4, iL, i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i4 |= 384;
            function7 = function3;
            i7 = i4 | 3072;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    function8 = function5;
                    if (fetVar.i(function8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i7 |= i9;
                }
                i10 = i7 | 196608;
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        j3 = j;
                        if (fetVar.f(j3)) {
                        }
                        i10 |= i16;
                    } else {
                        j3 = j;
                    }
                    i10 |= i16;
                } else {
                    j3 = j;
                }
                if ((i2 & 12582912) != 0) {
                    i10 |= ((i3 & 128) == 0 || !fetVar.f(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        vhv0VarK = vhv0Var;
                        if (fetVar.g(vhv0VarK)) {
                        }
                        i10 |= i17;
                    } else {
                        vhv0VarK = vhv0Var;
                    }
                    i10 |= i17;
                } else {
                    vhv0VarK = vhv0Var;
                }
                if ((i2 & 805306368) == 0) {
                    if (fetVar.i(ugdVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i10 |= i13;
                }
                if ((306783379 & i10) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i10 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i15 != 0) {
                            function6 = nhd.f23526a;
                        }
                        if (i5 != 0) {
                            function7 = nhd.b;
                        }
                        function13 = nhd.c;
                        if (i8 != 0) {
                            function8 = nhd.d;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB = v4d.b(j3, fetVar);
                            i10 &= -29360129;
                        } else {
                            jB = j2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 &= -234881025;
                            mm40Var4 = mm40Var2;
                            vhv0VarK = jtt0.k(fetVar);
                            i12 = 2;
                        } else {
                            i12 = 2;
                            mm40Var4 = mm40Var2;
                        }
                    } else {
                        if (i14 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i15 != 0) {
                            function6 = nhd.f23526a;
                        }
                        if (i5 != 0) {
                            function7 = nhd.b;
                        }
                        function13 = nhd.c;
                        if (i8 != 0) {
                            function8 = nhd.d;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB = v4d.b(j3, fetVar);
                            i10 &= -29360129;
                        } else {
                            jB = j2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 &= -234881025;
                            mm40Var4 = mm40Var2;
                            vhv0VarK = jtt0.k(fetVar);
                            i12 = 2;
                        } else {
                            i12 = 2;
                            mm40Var4 = mm40Var2;
                        }
                    }
                    fetVar.s();
                    int i114 = (234881024 & i10) ^ 100663296;
                    if (i114 <= 67108864) {
                    }
                    objP = fetVar.P();
                    Object obj4 = ukd.f35823a;
                    if (z2) {
                        objP = new zz40(vhv0VarK);
                        fetVar.o0(objP);
                    } else {
                        objP = new zz40(vhv0VarK);
                        fetVar.o0(objP);
                    }
                    zz40Var = (zz40) objP;
                    Function2 function116 = function13;
                    zG = fetVar.g(zz40Var) | ((i114 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                        fetVar.o0(objP2);
                    }
                    Function2 function117 = function8;
                    Function2 function118 = function6;
                    Function2 function119 = function7;
                    int i115 = i12;
                    int i23 = i10 >> 12;
                    long j12 = j3;
                    vhv0 vhv0Var6 = vhv0VarK;
                    long j13 = jB;
                    gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j12, j13, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i115, function118, ugdVar, function116, function117, zz40Var, function119), fetVar), fetVar, (i23 & 7168) | (i23 & 896) | 12582912, 114);
                    j5 = j12;
                    j4 = j13;
                    mm40Var3 = mm40Var4;
                    function10 = function118;
                    function12 = function119;
                    function9 = function116;
                    function11 = function117;
                    vhv0Var2 = vhv0Var6;
                    i11 = i115;
                } else {
                    fetVar.X();
                    function9 = function4;
                    i11 = i;
                    j4 = j2;
                    mm40Var3 = mm40Var2;
                    function10 = function6;
                    function11 = function8;
                    function12 = function7;
                    j5 = j3;
                    vhv0Var2 = vhv0VarK;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.a1h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            int iL = x8x.L(i2 | 1);
                            m8x.y(mm40Var3, function10, function12, function9, function11, i11, j5, j4, vhv0Var2, ugdVar, (fet) obj5, iL, i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 = i4 | 27648;
            function8 = function5;
            i10 = i7 | 196608;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    j3 = j;
                    if (fetVar.f(j3)) {
                    }
                    i10 |= i16;
                } else {
                    j3 = j;
                }
                i10 |= i16;
            } else {
                j3 = j;
            }
            if ((i2 & 12582912) != 0) {
                i10 |= ((i3 & 128) == 0 || !fetVar.f(j2)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    vhv0VarK = vhv0Var;
                    if (fetVar.g(vhv0VarK)) {
                    }
                    i10 |= i17;
                } else {
                    vhv0VarK = vhv0Var;
                }
                i10 |= i17;
            } else {
                vhv0VarK = vhv0Var;
            }
            if ((i2 & 805306368) == 0) {
                if (fetVar.i(ugdVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i10 |= i13;
            }
            if ((306783379 & i10) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i10 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i15 != 0) {
                        function6 = nhd.f23526a;
                    }
                    if (i5 != 0) {
                        function7 = nhd.b;
                    }
                    function13 = nhd.c;
                    if (i8 != 0) {
                        function8 = nhd.d;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB = v4d.b(j3, fetVar);
                        i10 &= -29360129;
                    } else {
                        jB = j2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 &= -234881025;
                        mm40Var4 = mm40Var2;
                        vhv0VarK = jtt0.k(fetVar);
                        i12 = 2;
                    } else {
                        i12 = 2;
                        mm40Var4 = mm40Var2;
                    }
                } else {
                    if (i14 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i15 != 0) {
                        function6 = nhd.f23526a;
                    }
                    if (i5 != 0) {
                        function7 = nhd.b;
                    }
                    function13 = nhd.c;
                    if (i8 != 0) {
                        function8 = nhd.d;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB = v4d.b(j3, fetVar);
                        i10 &= -29360129;
                    } else {
                        jB = j2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 &= -234881025;
                        mm40Var4 = mm40Var2;
                        vhv0VarK = jtt0.k(fetVar);
                        i12 = 2;
                    } else {
                        i12 = 2;
                        mm40Var4 = mm40Var2;
                    }
                }
                fetVar.s();
                int i116 = (234881024 & i10) ^ 100663296;
                if (i116 <= 67108864) {
                }
                objP = fetVar.P();
                Object obj5 = ukd.f35823a;
                if (z2) {
                    objP = new zz40(vhv0VarK);
                    fetVar.o0(objP);
                } else {
                    objP = new zz40(vhv0VarK);
                    fetVar.o0(objP);
                }
                zz40Var = (zz40) objP;
                Function2 function1110 = function13;
                zG = fetVar.g(zz40Var) | ((i116 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
                objP2 = fetVar.P();
                if (zG) {
                    objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                    fetVar.o0(objP2);
                }
                Function2 function1111 = function8;
                Function2 function1112 = function6;
                Function2 function1113 = function7;
                int i117 = i12;
                int i24 = i10 >> 12;
                long j14 = j3;
                vhv0 vhv0Var7 = vhv0VarK;
                long j15 = jB;
                gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j14, j15, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i117, function1112, ugdVar, function1110, function1111, zz40Var, function1113), fetVar), fetVar, (i24 & 7168) | (i24 & 896) | 12582912, 114);
                j5 = j14;
                j4 = j15;
                mm40Var3 = mm40Var4;
                function10 = function1112;
                function12 = function1113;
                function9 = function1110;
                function11 = function1111;
                vhv0Var2 = vhv0Var7;
                i11 = i117;
            } else {
                fetVar.X();
                function9 = function4;
                i11 = i;
                j4 = j2;
                mm40Var3 = mm40Var2;
                function10 = function6;
                function11 = function8;
                function12 = function7;
                j5 = j3;
                vhv0Var2 = vhv0VarK;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.a1h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int iL = x8x.L(i2 | 1);
                        m8x.y(mm40Var3, function10, function12, function9, function11, i11, j5, j4, vhv0Var2, ugdVar, (fet) obj6, iL, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 48;
        function6 = function2;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                function7 = function3;
                if (fetVar.i(function7)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i4 | 3072;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i2 & 24576) == 0) {
                    function8 = function5;
                    if (fetVar.i(function8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i7 |= i9;
                }
                i10 = i7 | 196608;
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        j3 = j;
                        if (fetVar.f(j3)) {
                        }
                        i10 |= i16;
                    } else {
                        j3 = j;
                    }
                    i10 |= i16;
                } else {
                    j3 = j;
                }
                if ((i2 & 12582912) != 0) {
                    i10 |= ((i3 & 128) == 0 || !fetVar.f(j2)) ? 4194304 : 8388608;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        vhv0VarK = vhv0Var;
                        if (fetVar.g(vhv0VarK)) {
                        }
                        i10 |= i17;
                    } else {
                        vhv0VarK = vhv0Var;
                    }
                    i10 |= i17;
                } else {
                    vhv0VarK = vhv0Var;
                }
                if ((i2 & 805306368) == 0) {
                    if (fetVar.i(ugdVar)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i10 |= i13;
                }
                if ((306783379 & i10) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i10 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i15 != 0) {
                            function6 = nhd.f23526a;
                        }
                        if (i5 != 0) {
                            function7 = nhd.b;
                        }
                        function13 = nhd.c;
                        if (i8 != 0) {
                            function8 = nhd.d;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB = v4d.b(j3, fetVar);
                            i10 &= -29360129;
                        } else {
                            jB = j2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 &= -234881025;
                            mm40Var4 = mm40Var2;
                            vhv0VarK = jtt0.k(fetVar);
                            i12 = 2;
                        } else {
                            i12 = 2;
                            mm40Var4 = mm40Var2;
                        }
                    } else {
                        if (i14 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i15 != 0) {
                            function6 = nhd.f23526a;
                        }
                        if (i5 != 0) {
                            function7 = nhd.b;
                        }
                        function13 = nhd.c;
                        if (i8 != 0) {
                            function8 = nhd.d;
                        }
                        if ((i3 & 64) != 0) {
                            j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                            i10 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            jB = v4d.b(j3, fetVar);
                            i10 &= -29360129;
                        } else {
                            jB = j2;
                        }
                        if ((i3 & 256) != 0) {
                            i10 &= -234881025;
                            mm40Var4 = mm40Var2;
                            vhv0VarK = jtt0.k(fetVar);
                            i12 = 2;
                        } else {
                            i12 = 2;
                            mm40Var4 = mm40Var2;
                        }
                    }
                    fetVar.s();
                    int i118 = (234881024 & i10) ^ 100663296;
                    if (i118 <= 67108864) {
                    }
                    objP = fetVar.P();
                    Object obj6 = ukd.f35823a;
                    if (z2) {
                        objP = new zz40(vhv0VarK);
                        fetVar.o0(objP);
                    } else {
                        objP = new zz40(vhv0VarK);
                        fetVar.o0(objP);
                    }
                    zz40Var = (zz40) objP;
                    Function2 function1114 = function13;
                    zG = fetVar.g(zz40Var) | ((i118 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
                    objP2 = fetVar.P();
                    if (zG) {
                        objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                        fetVar.o0(objP2);
                    }
                    Function2 function1115 = function8;
                    Function2 function1116 = function6;
                    Function2 function1117 = function7;
                    int i119 = i12;
                    int i25 = i10 >> 12;
                    long j16 = j3;
                    vhv0 vhv0Var8 = vhv0VarK;
                    long j17 = jB;
                    gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j16, j17, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i119, function1116, ugdVar, function1114, function1115, zz40Var, function1117), fetVar), fetVar, (i25 & 7168) | (i25 & 896) | 12582912, 114);
                    j5 = j16;
                    j4 = j17;
                    mm40Var3 = mm40Var4;
                    function10 = function1116;
                    function12 = function1117;
                    function9 = function1114;
                    function11 = function1115;
                    vhv0Var2 = vhv0Var8;
                    i11 = i119;
                } else {
                    fetVar.X();
                    function9 = function4;
                    i11 = i;
                    j4 = j2;
                    mm40Var3 = mm40Var2;
                    function10 = function6;
                    function11 = function8;
                    function12 = function7;
                    j5 = j3;
                    vhv0Var2 = vhv0VarK;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.a1h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            ((Integer) obj8).getClass();
                            int iL = x8x.L(i2 | 1);
                            m8x.y(mm40Var3, function10, function12, function9, function11, i11, j5, j4, vhv0Var2, ugdVar, (fet) obj7, iL, i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i7 = i4 | 27648;
            function8 = function5;
            i10 = i7 | 196608;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    j3 = j;
                    if (fetVar.f(j3)) {
                    }
                    i10 |= i16;
                } else {
                    j3 = j;
                }
                i10 |= i16;
            } else {
                j3 = j;
            }
            if ((i2 & 12582912) != 0) {
                i10 |= ((i3 & 128) == 0 || !fetVar.f(j2)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    vhv0VarK = vhv0Var;
                    if (fetVar.g(vhv0VarK)) {
                    }
                    i10 |= i17;
                } else {
                    vhv0VarK = vhv0Var;
                }
                i10 |= i17;
            } else {
                vhv0VarK = vhv0Var;
            }
            if ((i2 & 805306368) == 0) {
                if (fetVar.i(ugdVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i10 |= i13;
            }
            if ((306783379 & i10) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i10 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i15 != 0) {
                        function6 = nhd.f23526a;
                    }
                    if (i5 != 0) {
                        function7 = nhd.b;
                    }
                    function13 = nhd.c;
                    if (i8 != 0) {
                        function8 = nhd.d;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB = v4d.b(j3, fetVar);
                        i10 &= -29360129;
                    } else {
                        jB = j2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 &= -234881025;
                        mm40Var4 = mm40Var2;
                        vhv0VarK = jtt0.k(fetVar);
                        i12 = 2;
                    } else {
                        i12 = 2;
                        mm40Var4 = mm40Var2;
                    }
                } else {
                    if (i14 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i15 != 0) {
                        function6 = nhd.f23526a;
                    }
                    if (i5 != 0) {
                        function7 = nhd.b;
                    }
                    function13 = nhd.c;
                    if (i8 != 0) {
                        function8 = nhd.d;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB = v4d.b(j3, fetVar);
                        i10 &= -29360129;
                    } else {
                        jB = j2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 &= -234881025;
                        mm40Var4 = mm40Var2;
                        vhv0VarK = jtt0.k(fetVar);
                        i12 = 2;
                    } else {
                        i12 = 2;
                        mm40Var4 = mm40Var2;
                    }
                }
                fetVar.s();
                int i1110 = (234881024 & i10) ^ 100663296;
                if (i1110 <= 67108864) {
                }
                objP = fetVar.P();
                Object obj7 = ukd.f35823a;
                if (z2) {
                    objP = new zz40(vhv0VarK);
                    fetVar.o0(objP);
                } else {
                    objP = new zz40(vhv0VarK);
                    fetVar.o0(objP);
                }
                zz40Var = (zz40) objP;
                Function2 function1118 = function13;
                zG = fetVar.g(zz40Var) | ((i1110 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
                objP2 = fetVar.P();
                if (zG) {
                    objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                    fetVar.o0(objP2);
                }
                Function2 function1119 = function8;
                Function2 function11110 = function6;
                Function2 function11111 = function7;
                int i1111 = i12;
                int i26 = i10 >> 12;
                long j18 = j3;
                vhv0 vhv0Var9 = vhv0VarK;
                long j19 = jB;
                gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j18, j19, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i1111, function11110, ugdVar, function1118, function1119, zz40Var, function11111), fetVar), fetVar, (i26 & 7168) | (i26 & 896) | 12582912, 114);
                j5 = j18;
                j4 = j19;
                mm40Var3 = mm40Var4;
                function10 = function11110;
                function12 = function11111;
                function9 = function1118;
                function11 = function1119;
                vhv0Var2 = vhv0Var9;
                i11 = i1111;
            } else {
                fetVar.X();
                function9 = function4;
                i11 = i;
                j4 = j2;
                mm40Var3 = mm40Var2;
                function10 = function6;
                function11 = function8;
                function12 = function7;
                j5 = j3;
                vhv0Var2 = vhv0VarK;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.a1h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj8, Object obj9) {
                        ((Integer) obj9).getClass();
                        int iL = x8x.L(i2 | 1);
                        m8x.y(mm40Var3, function10, function12, function9, function11, i11, j5, j4, vhv0Var2, ugdVar, (fet) obj8, iL, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 384;
        function7 = function3;
        i7 = i4 | 3072;
        i8 = i3 & 16;
        if (i8 != 0) {
            if ((i2 & 24576) == 0) {
                function8 = function5;
                if (fetVar.i(function8)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i7 |= i9;
            }
            i10 = i7 | 196608;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    j3 = j;
                    if (fetVar.f(j3)) {
                    }
                    i10 |= i16;
                } else {
                    j3 = j;
                }
                i10 |= i16;
            } else {
                j3 = j;
            }
            if ((i2 & 12582912) != 0) {
                i10 |= ((i3 & 128) == 0 || !fetVar.f(j2)) ? 4194304 : 8388608;
            }
            if ((i2 & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    vhv0VarK = vhv0Var;
                    if (fetVar.g(vhv0VarK)) {
                    }
                    i10 |= i17;
                } else {
                    vhv0VarK = vhv0Var;
                }
                i10 |= i17;
            } else {
                vhv0VarK = vhv0Var;
            }
            if ((i2 & 805306368) == 0) {
                if (fetVar.i(ugdVar)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i10 |= i13;
            }
            if ((306783379 & i10) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i10 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i15 != 0) {
                        function6 = nhd.f23526a;
                    }
                    if (i5 != 0) {
                        function7 = nhd.b;
                    }
                    function13 = nhd.c;
                    if (i8 != 0) {
                        function8 = nhd.d;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB = v4d.b(j3, fetVar);
                        i10 &= -29360129;
                    } else {
                        jB = j2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 &= -234881025;
                        mm40Var4 = mm40Var2;
                        vhv0VarK = jtt0.k(fetVar);
                        i12 = 2;
                    } else {
                        i12 = 2;
                        mm40Var4 = mm40Var2;
                    }
                } else {
                    if (i14 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i15 != 0) {
                        function6 = nhd.f23526a;
                    }
                    if (i5 != 0) {
                        function7 = nhd.b;
                    }
                    function13 = nhd.c;
                    if (i8 != 0) {
                        function8 = nhd.d;
                    }
                    if ((i3 & 64) != 0) {
                        j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                        i10 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        jB = v4d.b(j3, fetVar);
                        i10 &= -29360129;
                    } else {
                        jB = j2;
                    }
                    if ((i3 & 256) != 0) {
                        i10 &= -234881025;
                        mm40Var4 = mm40Var2;
                        vhv0VarK = jtt0.k(fetVar);
                        i12 = 2;
                    } else {
                        i12 = 2;
                        mm40Var4 = mm40Var2;
                    }
                }
                fetVar.s();
                int i1112 = (234881024 & i10) ^ 100663296;
                if (i1112 <= 67108864) {
                }
                objP = fetVar.P();
                Object obj8 = ukd.f35823a;
                if (z2) {
                    objP = new zz40(vhv0VarK);
                    fetVar.o0(objP);
                } else {
                    objP = new zz40(vhv0VarK);
                    fetVar.o0(objP);
                }
                zz40Var = (zz40) objP;
                Function2 function11112 = function13;
                zG = fetVar.g(zz40Var) | ((i1112 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
                objP2 = fetVar.P();
                if (zG) {
                    objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                    fetVar.o0(objP2);
                }
                Function2 function11113 = function8;
                Function2 function11114 = function6;
                Function2 function11115 = function7;
                int i1113 = i12;
                int i27 = i10 >> 12;
                long j110 = j3;
                vhv0 vhv0Var10 = vhv0VarK;
                long j111 = jB;
                gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j110, j111, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i1113, function11114, ugdVar, function11112, function11113, zz40Var, function11115), fetVar), fetVar, (i27 & 7168) | (i27 & 896) | 12582912, 114);
                j5 = j110;
                j4 = j111;
                mm40Var3 = mm40Var4;
                function10 = function11114;
                function12 = function11115;
                function9 = function11112;
                function11 = function11113;
                vhv0Var2 = vhv0Var10;
                i11 = i1113;
            } else {
                fetVar.X();
                function9 = function4;
                i11 = i;
                j4 = j2;
                mm40Var3 = mm40Var2;
                function10 = function6;
                function11 = function8;
                function12 = function7;
                j5 = j3;
                vhv0Var2 = vhv0VarK;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.a1h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj9, Object obj10) {
                        ((Integer) obj10).getClass();
                        int iL = x8x.L(i2 | 1);
                        m8x.y(mm40Var3, function10, function12, function9, function11, i11, j5, j4, vhv0Var2, ugdVar, (fet) obj9, iL, i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i7 = i4 | 27648;
        function8 = function5;
        i10 = i7 | 196608;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                j3 = j;
                if (fetVar.f(j3)) {
                }
                i10 |= i16;
            } else {
                j3 = j;
            }
            i10 |= i16;
        } else {
            j3 = j;
        }
        if ((i2 & 12582912) != 0) {
            i10 |= ((i3 & 128) == 0 || !fetVar.f(j2)) ? 4194304 : 8388608;
        }
        if ((i2 & 100663296) == 0) {
            if ((i3 & 256) == 0) {
                vhv0VarK = vhv0Var;
                if (fetVar.g(vhv0VarK)) {
                }
                i10 |= i17;
            } else {
                vhv0VarK = vhv0Var;
            }
            i10 |= i17;
        } else {
            vhv0VarK = vhv0Var;
        }
        if ((i2 & 805306368) == 0) {
            if (fetVar.i(ugdVar)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i10 |= i13;
        }
        if ((306783379 & i10) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i10 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i15 != 0) {
                    function6 = nhd.f23526a;
                }
                if (i5 != 0) {
                    function7 = nhd.b;
                }
                function13 = nhd.c;
                if (i8 != 0) {
                    function8 = nhd.d;
                }
                if ((i3 & 64) != 0) {
                    j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                    i10 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    jB = v4d.b(j3, fetVar);
                    i10 &= -29360129;
                } else {
                    jB = j2;
                }
                if ((i3 & 256) != 0) {
                    i10 &= -234881025;
                    mm40Var4 = mm40Var2;
                    vhv0VarK = jtt0.k(fetVar);
                    i12 = 2;
                } else {
                    i12 = 2;
                    mm40Var4 = mm40Var2;
                }
            } else {
                if (i14 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i15 != 0) {
                    function6 = nhd.f23526a;
                }
                if (i5 != 0) {
                    function7 = nhd.b;
                }
                function13 = nhd.c;
                if (i8 != 0) {
                    function8 = nhd.d;
                }
                if ((i3 & 64) != 0) {
                    j3 = ((t4d) fetVar.k(v4d.f36771a)).n;
                    i10 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    jB = v4d.b(j3, fetVar);
                    i10 &= -29360129;
                } else {
                    jB = j2;
                }
                if ((i3 & 256) != 0) {
                    i10 &= -234881025;
                    mm40Var4 = mm40Var2;
                    vhv0VarK = jtt0.k(fetVar);
                    i12 = 2;
                } else {
                    i12 = 2;
                    mm40Var4 = mm40Var2;
                }
            }
            fetVar.s();
            int i1114 = (234881024 & i10) ^ 100663296;
            if (i1114 <= 67108864) {
            }
            objP = fetVar.P();
            Object obj9 = ukd.f35823a;
            if (z2) {
                objP = new zz40(vhv0VarK);
                fetVar.o0(objP);
            } else {
                objP = new zz40(vhv0VarK);
                fetVar.o0(objP);
            }
            zz40Var = (zz40) objP;
            Function2 function11116 = function13;
            zG = fetVar.g(zz40Var) | ((i1114 <= 67108864 && fetVar.g(vhv0VarK)) || (i10 & 100663296) == 67108864);
            objP2 = fetVar.P();
            if (zG) {
                objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                fetVar.o0(objP2);
            } else {
                objP2 = new dff0(zz40Var, vhv0VarK, (byte) 21);
                fetVar.o0(objP2);
            }
            Function2 function11117 = function8;
            Function2 function11118 = function6;
            Function2 function11119 = function7;
            int i1115 = i12;
            int i28 = i10 >> 12;
            long j112 = j3;
            vhv0 vhv0Var11 = vhv0VarK;
            long j113 = jB;
            gmn0.a(j120.a0(mm40Var4, (Function1) objP2), null, j112, j113, 0.0f, 0.0f, null, u1c.M(848889571, new d1h0(i1115, function11118, ugdVar, function11116, function11117, zz40Var, function11119), fetVar), fetVar, (i28 & 7168) | (i28 & 896) | 12582912, 114);
            j5 = j112;
            j4 = j113;
            mm40Var3 = mm40Var4;
            function10 = function11118;
            function12 = function11119;
            function9 = function11116;
            function11 = function11117;
            vhv0Var2 = vhv0Var11;
            i11 = i1115;
        } else {
            fetVar.X();
            function9 = function4;
            i11 = i;
            j4 = j2;
            mm40Var3 = mm40Var2;
            function10 = function6;
            function11 = function8;
            function12 = function7;
            j5 = j3;
            vhv0Var2 = vhv0VarK;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.a1h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    int iL = x8x.L(i2 | 1);
                    m8x.y(mm40Var3, function10, function12, function9, function11, i11, j5, j4, vhv0Var2, ugdVar, (fet) obj10, iL, i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final chl0 y0(BetZip betZip, BetZip betZip2, boolean z, boolean z2) {
        k0d k0dVar;
        if (Intrinsics.d(betZip, y860.a0())) {
            return null;
        }
        if (betZip.b == 0.0d && betZip.t.length() == 0) {
            return null;
        }
        if (betZip.f) {
            k0dVar = k0d.b;
        } else if (z2 || betZip2 == null || betZip2.f46426a != betZip.f46426a) {
            k0dVar = k0d.f17460a;
        } else {
            double d = betZip.b;
            double d2 = betZip2.b;
            if (d > d2) {
                k0dVar = k0d.c;
            } else {
                k0dVar = d < d2 ? k0d.d : k0d.f17460a;
            }
        }
        k0d k0dVar2 = k0dVar;
        String str = betZip.t;
        String strM = ju70.M(betZip, z);
        a65 a65Var = a65.f301a;
        boolean z3 = betZip.w;
        long j = betZip.f46426a;
        return new chl0(str, strM, k0dVar2, a65Var, false, z3, false, false, new xgl0(j, betZip.d, betZip.b, betZip.t, (int) j, betZip.c, betZip.l.f36034a, betZip.m, false));
    }

    public static final void z(final int i, Function2 function2, ugd ugdVar, Function2 function3, Function2 function4, final vhv0 vhv0Var, Function2 function5, fet fetVar, int i2) {
        int i3;
        int i4;
        fetVar.g0(-280287501);
        int i5 = i2 | (fetVar.e(i) ? 4 : 2) | (fetVar.i(function2) ? 32 : 16) | (fetVar.i(ugdVar) ? 256 : 128) | (fetVar.i(function3) ? 2048 : 1024) | (fetVar.i(function4) ? 16384 : 8192) | (fetVar.g(vhv0Var) ? 131072 : 65536) | (fetVar.i(function5) ? 1048576 : 524288);
        byte b = 1;
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new f1h0();
                fetVar.o0(objP);
            }
            final f1h0 f1h0Var = (f1h0) objP;
            boolean z = (i5 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new ugd(605195056, true, new e1h0(function2, (byte) 3));
                fetVar.o0(objP2);
            }
            final Function2 function6 = (Function2) objP2;
            boolean z2 = (i5 & 7168) == 2048;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new ugd(418899191, true, new e1h0(function3, (byte) 2));
                fetVar.o0(objP3);
            }
            final Function2 function7 = (Function2) objP3;
            boolean z3 = (57344 & i5) == 16384;
            Object objP4 = fetVar.P();
            if (z3 || objP4 == obj) {
                objP4 = new ugd(338600263, true, new e1h0(function4, b));
                fetVar.o0(objP4);
            }
            final Function2 function8 = (Function2) objP4;
            boolean z4 = (i5 & 896) == 256;
            Object objP5 = fetVar.P();
            if (z4 || objP5 == obj) {
                objP5 = new ugd(-1776388365, true, new a8(ugdVar, f1h0Var, (byte) 21));
                fetVar.o0(objP5);
            }
            final Function2 function9 = (Function2) objP5;
            boolean z5 = (i5 & 3670016) == 1048576;
            Object objP6 = fetVar.P();
            if (z5 || objP6 == obj) {
                objP6 = new ugd(-1731662488, true, new e1h0(function5, (byte) 0));
                fetVar.o0(objP6);
            }
            final Function2 function10 = (Function2) objP6;
            boolean zG = ((i5 & 458752) == 131072) | fetVar.g(function6) | fetVar.g(function7) | fetVar.g(function8) | ((i5 & 14) == 4) | fetVar.g(function10) | fetVar.g(function9);
            Object objP7 = fetVar.P();
            if (zG || objP7 == obj) {
                i3 = 1;
                i4 = 0;
                Object obj2 = new Function2() { // from class: a.b1h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        int i6;
                        int iT;
                        int iT2;
                        eld0 eld0Var;
                        Integer numValueOf;
                        int i7;
                        int iIntValue;
                        int iT3;
                        int iB;
                        final c5n0 c5n0Var = (c5n0) obj3;
                        p4e p4eVar = (p4e) obj4;
                        final int i8 = p4e.i(p4eVar.f26347a);
                        final int iH = p4e.h(p4eVar.f26347a);
                        long jB = p4e.b(p4eVar.f26347a, 0, 0, 0, 0, 10);
                        k6z layoutDirection = c5n0Var.getLayoutDirection();
                        final vhv0 vhv0Var2 = vhv0Var;
                        int iA = vhv0Var2.a(c5n0Var, layoutDirection);
                        int iC = vhv0Var2.c(c5n0Var, c5n0Var.getLayoutDirection());
                        int iB2 = vhv0Var2.b(c5n0Var);
                        final pu90 pu90VarS = ((pj30) CollectionsKt.U(c5n0Var.k(i1h0.f13999a, function6))).S(jB);
                        int i9 = (-iA) - iC;
                        int i10 = -iB2;
                        final pu90 pu90VarS2 = ((pj30) CollectionsKt.U(c5n0Var.k(i1h0.c, function7))).S(r4e.i(i9, i10, jB));
                        final pu90 pu90VarS3 = ((pj30) CollectionsKt.U(c5n0Var.k(i1h0.d, function8))).S(r4e.i(i9, i10, jB));
                        int i11 = pu90VarS3.f27604a;
                        byte b2 = i;
                        if (i11 == 0 && pu90VarS3.b == 0) {
                            eld0Var = null;
                        } else {
                            int i12 = pu90VarS3.b;
                            if (b2 == 0) {
                                i6 = iA;
                                if (c5n0Var.getLayoutDirection() == k6z.f17794a) {
                                    iT = c5n0Var.T(16.0f);
                                    iT2 = iT + i6;
                                } else {
                                    iT2 = ((i8 - c5n0Var.T(16.0f)) - i11) - iC;
                                }
                            } else {
                                i6 = iA;
                                if (b2 != 2 && b2 != 3) {
                                    iT2 = (((i8 - i11) + i6) - iC) / 2;
                                } else if (c5n0Var.getLayoutDirection() == k6z.f17794a) {
                                    iT2 = ((i8 - c5n0Var.T(16.0f)) - i11) - iC;
                                } else {
                                    iT = c5n0Var.T(16.0f);
                                    iT2 = iT + i6;
                                }
                            }
                            eld0Var = new eld0(iT2, i12, (byte) 4);
                        }
                        final pu90 pu90VarS4 = ((pj30) CollectionsKt.U(c5n0Var.k(i1h0.e, function10))).S(jB);
                        boolean z6 = pu90VarS4.f27604a == 0 && pu90VarS4.b == 0;
                        if (eld0Var != null) {
                            int i13 = eld0Var.c;
                            if (z6 || b2 == 3) {
                                iT3 = c5n0Var.T(16.0f) + i13;
                                iB = vhv0Var2.b(c5n0Var);
                            } else {
                                iT3 = pu90VarS4.b + i13;
                                iB = c5n0Var.T(16.0f);
                            }
                            numValueOf = Integer.valueOf(iB + iT3);
                        } else {
                            numValueOf = null;
                        }
                        int i14 = pu90VarS2.b;
                        if (i14 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = Integer.valueOf(pu90VarS4.b);
                                if (z6) {
                                    numValueOf2 = null;
                                }
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : vhv0Var2.b(c5n0Var);
                            }
                            i7 = i14 + iIntValue;
                        } else {
                            i7 = 0;
                        }
                        bgx bgxVar = new bgx(vhv0Var2, c5n0Var);
                        final eld0 eld0Var2 = eld0Var;
                        ((hgk0) f1h0Var.b).setValue(new lh80(s5x0.B(bgxVar, c5n0Var.getLayoutDirection()), (pu90VarS.f27604a == 0 && pu90VarS.b == 0) ? bgxVar.d() : c5n0Var.r0(pu90VarS.b), s5x0.A(bgxVar, c5n0Var.getLayoutDirection()), z6 ? bgxVar.a() : c5n0Var.r0(pu90VarS4.b)));
                        final pu90 pu90VarS5 = ((pj30) CollectionsKt.U(c5n0Var.k(i1h0.b, function9))).S(jB);
                        final Integer num = numValueOf;
                        final int i15 = i7;
                        return vj30.x(c5n0Var, i8, iH, new Function1() { // from class: a.c1h0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ou90 ou90Var = (ou90) obj5;
                                ou90Var.g(pu90VarS5, 0, 0, 0.0f);
                                ou90Var.g(pu90VarS, 0, 0, 0.0f);
                                pu90 pu90Var = pu90VarS2;
                                int i16 = i8 - pu90Var.f27604a;
                                c5n0 c5n0Var2 = c5n0Var;
                                k6z layoutDirection2 = c5n0Var2.getLayoutDirection();
                                vhv0 vhv0Var3 = vhv0Var2;
                                int iA2 = ((vhv0Var3.a(c5n0Var2, layoutDirection2) + i16) - vhv0Var3.c(c5n0Var2, c5n0Var2.getLayoutDirection())) / 2;
                                int i17 = iH;
                                ou90Var.g(pu90Var, iA2, i17 - i15, 0.0f);
                                pu90 pu90Var2 = pu90VarS4;
                                ou90Var.g(pu90Var2, 0, i17 - pu90Var2.b, 0.0f);
                                eld0 eld0Var3 = eld0Var2;
                                if (eld0Var3 != null) {
                                    int i18 = eld0Var3.b;
                                    Integer num2 = num;
                                    num2.getClass();
                                    ou90Var.g(pu90VarS3, i18, i17 - num2.intValue(), 0.0f);
                                }
                                return Unit.f46060a;
                            }
                        });
                    }
                };
                fetVar.o0(obj2);
                objP7 = obj2;
            } else {
                i3 = 1;
                i4 = 0;
            }
            x4n0.a(null, (Function2) objP7, fetVar, i4, i3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tl0(i, function2, ugdVar, function3, function4, vhv0Var, function5, i2);
        }
    }

    public static final a4d0 z0(i4d0 i4d0Var, roi0 roi0Var) {
        i4d0Var.getClass();
        roi0Var.getClass();
        int i = i4d0Var.c;
        if ((i & 4) == 4) {
            a4d0 a4d0Var = i4d0Var.f;
            a4d0Var.getClass();
            return a4d0Var;
        }
        if ((i & 8) == 8) {
            return roi0Var.c(i4d0Var.g);
        }
        jf4.n("No type in ProtoBuf.ValueParameter");
        return null;
    }
}
