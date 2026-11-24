package a;

import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n8n0 {
    public static final void a(a4x a4xVar, fet fetVar, int i) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(850525546);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            float f = xfn.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, f, 0.0f, 11), "GAME_HERO_INFO_TABLE");
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, shdVar, -1590364105, a4xVar);
            while (itO.hasNext()) {
                tlo0 tlo0Var = (tlo0) itO.next();
                mm40 mm40VarE1 = o2e.e0(jm40Var, "GAME_HERO_INFO_TABLE_ROW");
                zcl zclVar2 = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(6.0f, z, new jf4(b)), gqw0.j, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                fetVar.e0(922781149);
                Iterator<E> it = tlo0Var.b.iterator();
                while (it.hasNext()) {
                    s7n0.c((nlo0) it.next(), fetVar, 0);
                }
                fetVar.r(false);
                fetVar.r(true);
                z = true;
                b = 14;
            }
            fetVar.r(false);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 26);
        }
    }

    public static final void b(a4x a4xVar, fet fetVar, int i) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(-1896914804);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            rah0 rah0VarT = wha0.T(fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "GAME_HERO_ITEMS_TABLE");
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 200.0f - xfn.a(fetVar).c), 32.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            byte b = 14;
            mm40 mm40VarE1 = o2e.e0(wha0.P(o7k0.s(jm40Var, 200.0f), rah0VarT, false, 14), "GAME_HERO_ITEMS_TABLE_ITEMS_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar4);
            jpm0.o(fetVar, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, xfn.a(fetVar).c, 0.0f, 11);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4(b)), xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar4);
            jpm0.o(fetVar, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC2, shdVar, 315868376, a4xVar);
            while (itO.hasNext()) {
                tlo0 tlo0Var = (tlo0) itO.next();
                mm40 mm40VarE2 = o2e.e0(jm40Var, "GAME_HERO_ITEMS_TABLE_ROW");
                zcl zclVar3 = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM4, shdVar3);
                vqd.u(iHashCode4, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar);
                fetVar.e0(1756760072);
                Iterator<E> it = tlo0Var.b.iterator();
                while (it.hasNext()) {
                    s7n0.c((nlo0) it.next(), fetVar, 0);
                }
                fetVar.r(false);
                fetVar.r(true);
                z = false;
            }
            fetVar.r(z);
            fetVar.r(true);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 27);
        }
    }

    public static final void c(mm40 mm40Var, jlo0 jlo0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        jlo0Var.getClass();
        fetVar.g0(1832796307);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jlo0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            float f2 = xfn.a(fetVar).c;
            boolean z = jlo0Var.d;
            a4x a4xVar = jlo0Var.b;
            if (z) {
                zcl zclVar = qmk.f28987a;
                f = 8.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 0.0f;
            }
            mm40 mm40VarE0 = o2e.e0(knx.Q(s5x0.N(mm40VarD, f2, f, 0.0f, 0.0f, 12), new k82(xfn.a(fetVar).c, (byte) 6)), "TABLE_STATISTIC_INFO");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            mm40 mm40VarE1 = o2e.e0(s5x0.N(ohs0.i(fetVar, mm40VarC0, shdVar4, 1.0f, true), 0.0f, 0.0f, 6.0f, 0.0f, 11), "TABLE_STATISTIC_INFO_PLAYERS_TABLE");
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC1, shdVar4, 416079669, a4xVar);
            while (itO.hasNext()) {
                zlo0 zlo0Var = ((tlo0) itO.next()).f34156a;
                if (zlo0Var instanceof vlo0) {
                    fetVar.e0(-1887219191);
                    k7n0.f((vlo0) zlo0Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (!(zlo0Var instanceof ylo0)) {
                        throw b1j.f(-1887222003, fetVar, false);
                    }
                    fetVar.e0(-1887214457);
                    w7n0.h((ylo0) zlo0Var, fetVar, 0);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
            fetVar.r(true);
            int iOrdinal = jlo0Var.c.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1231114155);
                a(a4xVar, fetVar, 0);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-791572589, fetVar, false);
                }
                fetVar.e0(1231223306);
                b(a4xVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var2, (Object) jlo0Var, i, (byte) 18);
        }
    }

    public static final void d(mm40 mm40Var, sqp0 sqp0Var, Function1 function1, Function0 function0, fet fetVar, int i) {
        sqp0Var.getClass();
        function1.getClass();
        function0.getClass();
        fetVar.g0(254789999);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(sqp0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "TEAMS_LAZY_ROW_TAG");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nej0((Object) sqp0Var, (Object) function0, (Object) function1, (byte) 15);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 12, i, mm40Var, sqp0Var, function1, function0);
        }
    }

    public static final void e(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        str2.getClass();
        fetVar2.g0(-1295206330);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.S(mm40VarE, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 10.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            n05 n05Var = new n05(idm0.t(16), idm0.t(24), idm0.t(1));
            f2q0 f2q0Var = new f2q0(3);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarD2, primary, n05Var, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 1, 0, null, g1t0.p(), fetVar, (i2 & 14) | 48, 24960, 109552);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            n05 n05Var2 = new n05(idm0.t(10), idm0.t(12), idm0.t(1));
            f2q0 f2q0Var2 = new f2q0(3);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            str3 = str2;
            v8q0.a(str3, mm40VarD3, secondary, n05Var2, 0L, null, null, null, 0L, f2q0Var2, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, ((i2 >> 3) & 14) | 48, 24960, 109552);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 24, i, str, str3);
        }
    }

    public static final void f(mm40 mm40Var, imm immVar, Function1 function1, fet fetVar, int i) {
        int i2;
        imm immVar2;
        immVar.getClass();
        function1.getClass();
        fetVar.g0(-579277170);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            immVar2 = immVar;
            i2 |= fetVar.g(immVar2) ? 32 : 16;
        } else {
            immVar2 = immVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ntu0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new szu0(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new szu0(function1, (byte) 6);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarD, immVar2, null, function0, null, function2, (Function1) objP3, null, null, null, null, null, fetVar, i2 & 112, 0, 3988);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o4q(mm40Var, immVar, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    public static final void g(lc00 lc00Var, k4h k4hVar, m9s m9sVar, ctf0 ctf0Var, boolean z) {
        boolean z2;
        boolean z3;
        m9sVar.getClass();
        ctf0Var.getClass();
        p310 p310Var = k4hVar.f17669a;
        if (idx.J(p310Var.f26277a)) {
            return;
        }
        o310 o310Var = p310Var.f26277a;
        y3h y3hVar = k4hVar.c;
        int iOrdinal = o310Var.f.g.ordinal();
        if (iOrdinal == 0) {
            z2 = false;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                } else if (o310Var.g.g == d310.DIRE) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (z) {
            z3 = z2;
        } else {
            z3 = !z2;
        }
        lc00Var.add(bcm0.k(o310Var, y3hVar, m9sVar, ctf0Var, z3, false));
    }

    public static final riu0 h(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            riu0 riu0Var = tag instanceof riu0 ? (riu0) tag : null;
            if (riu0Var != null) {
                return riu0Var;
            }
            Object objV = k7n0.v(view);
            view = objV instanceof View ? (View) objV : null;
        }
        return null;
    }

    public static boolean i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = Build.MODEL;
            str2.getClass();
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (kotlin.text.c.x(upperCase, str, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[PHI: r11
  0x00b3: PHI (r11v8 java.lang.String) = (r11v7 java.lang.String), (r11v9 java.lang.String) binds: [B:40:0x00c1, B:34:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    public static yut0 j(JSONObject jSONObject, String str, Bundle bundle) throws JSONException {
        JSONArray jSONArray;
        String strOptString;
        String str2;
        jSONObject.getClass();
        if (str == null) {
            str = jSONObject.optString("method");
        }
        String str3 = "";
        String str4 = str == null ? "" : str;
        int iOptInt = jSONObject.optInt("error_code", 1);
        int iOptInt2 = jSONObject.optInt("error_subcode", 1);
        jSONObject.optString("error_msg");
        try {
            jSONArray = jSONObject.getJSONArray("request_params");
        } catch (JSONException unused) {
            jSONArray = new JSONArray();
        }
        IntRange intRangeO = l1e0.o(0, jSONArray.length());
        int iA = wp20.a(r3d.q(intRangeO, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = intRangeO.iterator();
        while (((kkx) it).c) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(((bkx) it).nextInt());
            linkedHashMap.put(jSONObject2.getString("key"), jSONObject2.getString("value"));
        }
        String strOptString2 = jSONObject.optString("view");
        String str5 = strOptString2 == null ? "" : strOptString2;
        if (StringsKt.W(str5)) {
            Log.d("VkApiErrorViewType", "Empty error view type");
        } else {
            try {
                String upperCase = str5.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                rw2.A(upperCase);
            } catch (IllegalArgumentException e) {
                Log.e("VkApiErrorViewType", "Unknown error view type: ".concat(str5), e);
            }
        }
        if (jSONObject.has("error_text")) {
            strOptString = jSONObject.optString("error_text");
            if (strOptString == null) {
                str2 = str3;
            } else {
                str2 = strOptString;
            }
        } else {
            if (jSONObject.has("error_description")) {
                strOptString = jSONObject.optString("error_description");
                if (strOptString != null) {
                    str2 = strOptString;
                }
            } else {
                String strOptString3 = jSONObject.optString("error_msg");
                if (strOptString3 == null) {
                    strOptString3 = jSONObject.toString();
                    strOptString3.getClass();
                }
                str3 = strOptString3 + " (" + iOptInt + ':' + iOptInt2 + ") | by [" + str4 + ']';
            }
            str2 = str3;
        }
        jSONObject.has("error_text");
        return new yut0(iOptInt, str4, str2, bundle, null, linkedHashMap, 32);
    }

    public static final String k(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public static final oas l(m8n0 m8n0Var) {
        ?? arrayList;
        Long l;
        List list;
        Integer numValueOf = null;
        Long l2 = (m8n0Var == null || (list = m8n0Var.d) == null) ? null : (Long) CollectionsKt.firstOrNull(list);
        String str = m8n0Var != null ? m8n0Var.b : null;
        List list2 = m8n0Var != null ? m8n0Var.d : null;
        if (m8n0Var != null) {
            List<String> list3 = m8n0Var.f21380a;
            if (list3 != null) {
                arrayList = new ArrayList();
                for (String str2 : list3) {
                    String strP0 = str2 != null ? StringsKt.p0(str2, Separators.SLASH, str2) : null;
                    if (strP0 != null) {
                        arrayList.add(strP0);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
        } else {
            arrayList = 0;
        }
        if (m8n0Var != null && (l = m8n0Var.c) != null) {
            numValueOf = Integer.valueOf((int) l.longValue());
        }
        return new oas(l2, str, list2, arrayList, numValueOf);
    }

    public static final nyg m(fzq0 fzq0Var, boolean z) {
        String str;
        Long l;
        Long l2;
        Long l3;
        fzq0Var.getClass();
        l26 l26Var = fzq0Var.c;
        wz5 wz5Var = fzq0Var.f10421a;
        l26 l26Var2 = fzq0Var.d;
        long jLongValue = 0;
        long jLongValue2 = (l26Var == null || (l3 = l26Var.f19293a) == null) ? 0L : l3.longValue();
        long jLongValue3 = (l26Var2 == null || (l2 = l26Var2.f19293a) == null) ? 0L : l2.longValue();
        Integer num = fzq0Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = fzq0Var.e;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        String strY = f7k.Y(l26Var2 != null ? l26Var2.b : null, wz5Var != null ? wz5Var.b : null);
        if (wz5Var != null && (l = wz5Var.f40006a) != null) {
            jLongValue = l.longValue();
        }
        long j = jLongValue;
        Integer num3 = fzq0Var.f;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        if (l26Var2 == null || (str = l26Var2.b) == null) {
            String str2 = l26Var != null ? l26Var.b : null;
            if (str2 == null) {
                String str3 = "";
                str = str3;
            } else {
                str = str2;
            }
        } else {
            str = str3;
        }
        return new nyg(iIntValue, iIntValue2, iIntValue3, 2, j, jLongValue2, jLongValue3, "", "", strY, str, "", true, z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[PHI: r10
  0x002f: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v7 java.lang.String) binds: [B:8:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Iterable] */
    public static final for0 n(lor0 lor0Var) {
        String str;
        Double d;
        q4f q4fVar;
        ?? arrayList;
        lvo0 lvo0Var;
        lor0Var.getClass();
        String str2 = lor0Var.d;
        Integer num = lor0Var.g;
        pxu pxuVar = lor0Var.s;
        Double d2 = lor0Var.l;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        String strValueOf = lor0Var.m;
        if (strValueOf != null) {
            str = strValueOf;
        } else {
            strValueOf = d2 != null ? String.valueOf(d2.doubleValue()) : null;
            if (strValueOf == null) {
                str = "";
            } else {
                str = strValueOf;
            }
        }
        Long l = lor0Var.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num2 = lor0Var.k;
        i0w i0wVarM = kkb.M(num2 != null ? num2.intValue() : 0);
        List list = null;
        Double d3 = lor0Var.h;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
        double dDoubleValue3 = ((pxuVar == null || (lvo0Var = pxuVar.f) == null || (d = lvo0Var.b) == null) && (d = lor0Var.i) == null) ? 0.0d : d.doubleValue();
        String strL = lor0Var.e;
        if (strL == null) {
            strL = "";
        }
        String str3 = lor0Var.f;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() > 0) {
            strL = kng0.l(strL, Separators.SP, str3);
        }
        String string = StringsKt.u0(strL).toString();
        Boolean bool = lor0Var.n;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        switch (num != null ? num.intValue() : 0) {
            case 1:
                q4fVar = q4f.q;
                break;
            case 2:
                q4fVar = q4f.o;
                break;
            case 3:
                q4fVar = q4f.n;
                break;
            case 4:
                q4fVar = q4f.p;
                break;
            case 5:
            case 12:
                q4fVar = q4f.t;
                break;
            case 6:
                q4fVar = q4f.r;
                break;
            case 7:
                q4fVar = q4f.u;
                break;
            case 8:
            case 10:
            default:
                q4fVar = q4f.b;
                break;
            case 9:
                q4fVar = q4f.s;
                break;
            case 11:
                q4fVar = q4f.v;
                break;
        }
        Boolean bool2 = lor0Var.o;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        hxu hxuVarN0 = pxuVar != null ? dyb.n0(pxuVar) : hxu.h;
        List<inb> list2 = lor0Var.r;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (inb inbVar : list2) {
                String str4 = str2;
                Integer num3 = num;
                List list3 = inbVar.f;
                hxu hxuVar = hxuVarN0;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        onr0 onr0Var = (onr0) it.next();
                        onr0Var.getClass();
                        Iterator it2 = it;
                        Long l2 = inbVar.f15065a;
                        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                        String str5 = inbVar.b;
                        String str6 = str5 == null ? "" : str5;
                        Long l3 = onr0Var.b;
                        inb inbVar2 = inbVar;
                        Long l4 = onr0Var.f25561a;
                        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                        long jLongValue5 = l4 != null ? l4.longValue() : 0L;
                        w0w w0wVarF = nkb.F(onr0Var.p);
                        String str7 = onr0Var.h;
                        String str8 = str7 == null ? "" : str7;
                        Long l5 = onr0Var.q;
                        long jLongValue6 = l5 != null ? l5.longValue() : 0L;
                        String str9 = onr0Var.s;
                        if (str9 == null) {
                            str9 = "";
                        }
                        List listC = kotlin.collections.a.c(str9);
                        String str10 = onr0Var.i;
                        String str11 = str10 == null ? "" : str10;
                        Long l6 = onr0Var.r;
                        long jLongValue7 = l6 != null ? l6.longValue() : 0L;
                        String str12 = onr0Var.t;
                        if (str12 == null) {
                            str12 = "";
                        }
                        List listC2 = kotlin.collections.a.c(str12);
                        String str13 = onr0Var.e;
                        String str14 = str13 == null ? "" : str13;
                        Long l7 = onr0Var.f;
                        long jLongValue8 = l7 != null ? l7.longValue() : 0L;
                        List list4 = onr0Var.n;
                        String strB0 = list4 != null ? CollectionsKt.b0(list4, null, null, null, null, 63) : null;
                        String str15 = strB0 == null ? "" : strB0;
                        Integer num4 = onr0Var.y;
                        int iIntValue = num4 != null ? num4.intValue() : 0;
                        String str16 = onr0Var.c;
                        String str17 = str16 == null ? "" : str16;
                        String str18 = onr0Var.d;
                        String str19 = str18 == null ? "" : str18;
                        Double d4 = onr0Var.l;
                        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
                        mnr0 mnr0Var = onr0Var.z;
                        List list5 = mnr0Var != null ? mnr0Var.f22103a : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        List list6 = list5;
                        List list7 = mnr0Var != null ? mnr0Var.b : null;
                        if (list7 == null) {
                            list7 = iun.f15405a;
                        }
                        arrayList.add(new wmr0(jLongValue2, str6, jLongValue3, jLongValue4, jLongValue5, w0wVarF, str8, jLongValue6, listC, str11, jLongValue7, listC2, str14, jLongValue8, str15, iIntValue, dDoubleValue4, str17, str19, list6, list7));
                        it = it2;
                        inbVar = inbVar2;
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                w3d.u(arrayList2, arrayList);
                num = num3;
                str2 = str4;
                hxuVarN0 = hxuVar;
                i0wVarM = i0wVarM;
            }
            list = arrayList2;
        }
        String str20 = str2;
        Integer num5 = num;
        hxu hxuVar2 = hxuVarN0;
        i0w i0wVar = i0wVarM;
        if (list == null) {
            list = iun.f15405a;
        }
        Long l8 = lor0Var.t;
        long jLongValue9 = l8 != null ? l8.longValue() : 0L;
        a6w a6wVar = ((num5 != null && num5.intValue() == 0) || num5 == null || num5.intValue() != 7) ? a6w.f336a : a6w.b;
        return new for0(str20, q4fVar, dDoubleValue3, jLongValue, dDoubleValue, dDoubleValue2, i0wVar, str, string, zBooleanValue, zBooleanValue2, hxuVar2, list, jLongValue9, a6wVar);
    }

    public static final w56 o(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        w56 r56Var;
        xem xemVar;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        str.getClass();
        list.getClass();
        y78Var.getClass();
        v5l0Var.getClass();
        ctf0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        r0n r0nVar = o0n.f24435a;
        q0n q0nVar = q0n.f27908a;
        if (iOrdinal == 0) {
            long j = d0tVar.f5282a;
            i4i i4iVarQ = w7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
            z6m0 z6m0Var = z6m0.f43877a;
            Integer intOrNull = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            Integer intOrNull2 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
            int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
            uws0 uws0Var = new uws0(iIntValue, kpb.D(d0tVar), qzb.c0(d0tVar));
            uws0 uws0Var2 = new uws0(iIntValue2, kpb.U(d0tVar), qzb.r0(d0tVar));
            kpm kpmVarS = kpb.S(d0tVar);
            if (kpb.e0(d0tVar)) {
                r0nVar = q0nVar;
            }
            r56Var = new r56(j, i4iVarQ, new z76(uws0Var, uws0Var2, kpmVarS, kpb.H(d0tVar, y78Var, z5), r0nVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal != 1) {
            f2i f2iVar = null;
            if (iOrdinal == 2) {
                long j2 = d0tVar.f5282a;
                boolean z6 = true;
                k4i k4iVarT = w7n0.t(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                z6m0 z6m0Var2 = z6m0.f43877a;
                Integer intOrNull3 = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
                int iIntValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                Integer intOrNull4 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
                int iIntValue4 = intOrNull4 != null ? intOrNull4.intValue() : 0;
                boolean z7 = d0tVar.G;
                boolean z8 = z7 && !z && z4;
                boolean z9 = (!d0tVar.H || z7 || z) ? false : true;
                int i = gql0.f11739a;
                int i2 = rqsVar.g;
                boolean z10 = i2 > 0;
                boolean z11 = i2 == 1;
                boolean z12 = z10 && z11;
                if (!z10 || z11) {
                    z6 = false;
                }
                wws0 wws0Var = new wws0(qzb.c0(d0tVar), kpb.D(d0tVar), iIntValue3, "", kpb.E(d0tVar), kpb.R(d0tVar).f33307a, rqsVar.t, false, rqsVar.r);
                wws0 wws0Var2 = new wws0(qzb.r0(d0tVar), kpb.U(d0tVar), iIntValue4, "", kpb.V(d0tVar), kpb.R(d0tVar).b, rqsVar.u, false, rqsVar.s);
                r0n r0nVar2 = kpb.e0(d0tVar) ? q0nVar : r0nVar;
                String strH = kpb.H(d0tVar, y78Var, z5);
                String strM = kpb.M(d0tVar);
                lsm0 lsm0Var = ctf0Var.b;
                String strA = lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                if (z8) {
                    f2iVar = c2i.f3624a;
                } else if (z9) {
                    f2iVar = e2i.f7087a;
                }
                f2i f2iVar2 = f2iVar;
                String strA2 = lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                if (z12) {
                    xemVar = vem.f37292a;
                } else {
                    xemVar = z6 ? wem.f39025a : tem.f33827a;
                }
                r56Var = new u56(j2, k4iVarT, new x86(wws0Var, wws0Var2, f2iVar2, strA2, strH, strM, strA, r0nVar2, xemVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    long j3 = d0tVar.f5282a;
                    k4i k4iVarR = w7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
                    z6m0 z6m0Var3 = z6m0.f43877a;
                    Integer intOrNull5 = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
                    int iIntValue5 = intOrNull5 != null ? intOrNull5.intValue() : 0;
                    Integer intOrNull6 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
                    return new s56(j3, k4iVarR, new h86(new yws0(iIntValue5, kpb.D(d0tVar), qzb.c0(d0tVar)), new yws0(intOrNull6 != null ? intOrNull6.intValue() : 0, kpb.U(d0tVar), qzb.r0(d0tVar)), kpb.C(d0tVar), kpb.H(d0tVar, y78Var, z5), ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), kpb.e0(d0tVar) ? q0nVar : r0nVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                long j4 = d0tVar.f5282a;
                n0x n0xVar = new n0x(dtb.F(str));
                l4i l4iVarS = w7n0.s(null, d0tVar, str, kpb.H(d0tVar, y78Var, z5), ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z2, z3, kpb.e0(d0tVar), kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
                z6m0 z6m0Var4 = z6m0.f43877a;
                Integer intOrNull7 = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
                int iIntValue6 = intOrNull7 != null ? intOrNull7.intValue() : 0;
                Integer intOrNull8 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
                r56Var = new t56(j4, l4iVarS, new p86(new xws0(iIntValue6, kpb.D(d0tVar), qzb.c0(d0tVar)), new xws0(intOrNull8 != null ? intOrNull8.intValue() : 0, kpb.U(d0tVar), qzb.r0(d0tVar)), kpb.C(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
            }
        } else {
            long j5 = d0tVar.f5282a;
            j4i j4iVarU = w7n0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z2, z3, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            z6m0 z6m0Var5 = z6m0.f43877a;
            Integer intOrNull9 = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
            int iIntValue7 = intOrNull9 != null ? intOrNull9.intValue() : 0;
            Integer intOrNull10 = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
            r56Var = new v56(j5, j4iVarU, new f96(new vws0(qzb.c0(d0tVar), iIntValue7, "", kpb.E(d0tVar), kpb.R(d0tVar).f33307a, rqsVar.t, false, rqsVar.r), new vws0(qzb.r0(d0tVar), intOrNull10 != null ? intOrNull10.intValue() : 0, "", kpb.V(d0tVar), kpb.R(d0tVar).b, rqsVar.u, false, rqsVar.s), kpb.H(d0tVar, y78Var, z5), kpb.M(d0tVar), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), qem.f28591a, uem.f35536a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return r56Var;
    }

    public static final String p(LimitTypeEnum limitTypeEnum, List list, String str, ctf0 ctf0Var, prz przVar) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            kzz kzzVar = (kzz) next;
            if (kzzVar.f19172a == limitTypeEnum && kzzVar.h == przVar) {
                break;
            }
        }
        kzz kzzVar2 = (kzz) next;
        bst bstVar = prz.b;
        String str2 = przVar.f27489a;
        bstVar.getClass();
        if (bst.b(str2) == prz.ACTIVE && kzzVar2 != null && kzzVar2.g == 0) {
            switch (kzzVar2.f19172a.ordinal()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return "0 ".concat(str);
            }
        }
        Long lValueOf = kzzVar2 != null ? Long.valueOf(kzzVar2.g) : null;
        if (lValueOf == null || lValueOf.longValue() == 0 || lValueOf.longValue() == 999999999) {
            return ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
        }
        return lValueOf + Separators.SP + str;
    }

    public static h3x0 q(fck0 fck0Var, n7x0 n7x0Var) throws GeneralSecurityException {
        icw0 icw0VarV;
        List arrayList;
        if (!x7x0.a(fck0Var)) {
            hny.o("keyset doesn't contain a valid primary key");
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < ((List) fck0Var.b).size(); i++) {
            dow0 dow0VarQ = fck0Var.q(i);
            if (dow0VarQ.c == pfw.g) {
                dnw0 dnw0Var = (dnw0) n7x0Var.d(dow0VarQ);
                atm0 atm0Var = dow0VarQ.f6432a;
                if (atm0Var instanceof i1x0) {
                    icw0VarV = ((m1x0) ((i1x0) atm0Var).u()).u();
                } else {
                    if (!(atm0Var instanceof o5x0)) {
                        throw new GeneralSecurityException(ua80.i("Cannot get output prefix for key of class ", atm0Var.getClass().getName(), " with parameters ", String.valueOf(atm0Var.s())));
                    }
                    icw0VarV = ((o5x0) atm0Var).v();
                }
                j3x0 j3x0Var = new j3x0(dnw0Var, dow0VarQ.d);
                byte[] bArr = icw0VarV.f14556a;
                if (bArr.length != 0 && bArr.length != 5) {
                    hny.o("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (map.containsKey(icw0VarV)) {
                    arrayList = (List) map.get(icw0VarV);
                } else {
                    arrayList = new ArrayList();
                    map.put(icw0VarV, arrayList);
                }
                arrayList.add(j3x0Var);
            }
        }
        fck0Var.x();
        return new h3x0(new b7x0(map));
    }
}
