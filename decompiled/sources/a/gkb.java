package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gkb {
    public static final void A(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-1352859010);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 9);
        }
    }

    public static final void B(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(57190244);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            l7m0 l7m0VarT = ahb.T(a4xVar, fetVar, (i2 >> 3) & 14);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
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
            fetVar.e0(-261703174);
            int i3 = 0;
            for (Object obj : (List) l7m0VarT.getValue()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                fetVar.b0(1472584831, Integer.valueOf(i3));
                feb.n((egm) obj, fetVar);
                fetVar.r(false);
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 10);
        }
    }

    public static final void C(y5m y5mVar, boolean z, fet fetVar, int i) {
        int i2;
        fetVar.g0(-301966056);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(y5mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new gpm();
                fetVar.o0(objP);
            }
            gpm gpmVar = (gpm) objP;
            boolean z2 = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new kpm(qpm.f29126a, gpmVar, d5c.O(y5mVar.f42055a, y5mVar.b, false, false, gpmVar));
                fetVar.o0(objP2);
            }
            n4c.l(null, (kpm) objP2, z, fetVar, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(y5mVar, z, i, b);
        }
    }

    public static final void D(mm40 mm40Var, lpm lpmVar, boolean z, fet fetVar, int i) {
        fetVar.g0(-1367259519);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(lpmVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n4c.l(mm40Var, lpmVar, z, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f1n(mm40Var, lpmVar, z, i, (byte) 1);
        }
    }

    public static final void E(mm40 mm40Var, a6m a6mVar, boolean z, float f, float f2, fet fetVar, int i) {
        mm40 mm40Var2;
        float f3;
        float f4;
        int i2;
        mm40 mm40Var3;
        float f5;
        float f6;
        l6m l6mVar;
        boolean z2;
        boolean z3;
        fetVar.g0(-1458525340);
        int i3 = i | 6 | (fetVar.g(a6mVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | 9216;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                i2 = i3 & (-64513);
                mm40Var3 = jm40.b;
                f5 = 120.0f;
                f6 = 8.0f;
            } else {
                fetVar.X();
                i2 = i3 & (-64513);
                mm40Var3 = mm40Var;
                f5 = f;
                f6 = f2;
            }
            fetVar.s();
            mm40 mm40VarN = s5x0.N(o7k0.s(mm40Var3, f5), 0.0f, f6, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            boolean z5 = a6mVar instanceof z5m;
            if (z5) {
                l6mVar = ((z5m) a6mVar).f43824a;
            } else {
                if (!(a6mVar instanceof y5m)) {
                    t9f.b();
                    return;
                }
                l6mVar = ((y5m) a6mVar).d;
            }
            if (l6mVar == null) {
                fetVar.e0(1365737045);
                fetVar.r(false);
                z2 = true;
            } else {
                fetVar.e0(1365737046);
                z2 = true;
                L(l6mVar, true, fetVar, 48);
                fetVar.r(false);
            }
            x7z x7zVar = new x7z(1.0f, z2);
            xx7 xx7Var = gqw0.n;
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40Var4 = mm40Var3;
            float f7 = f5;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
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
            if (z5) {
                fetVar.e0(1408410707);
                M(0, fetVar);
                fetVar.r(false);
                z3 = false;
            } else {
                if (!(a6mVar instanceof y5m)) {
                    throw b1j.f(1408408837, fetVar, false);
                }
                fetVar.e0(711133173);
                y5m y5mVar = (y5m) a6mVar;
                C(y5mVar, z, fetVar, (i2 >> 3) & 126);
                e6m e6mVar = y5mVar.c;
                if (e6mVar == null) {
                    fetVar.e0(711297906);
                    z3 = false;
                } else {
                    z3 = false;
                    fetVar.e0(711297907);
                    K(e6mVar, fetVar, 0);
                }
                fetVar.r(z3);
                fetVar.r(z3);
            }
            fetVar.r(true);
            if (l6mVar == null) {
                fetVar.e0(1366443380);
            } else {
                fetVar.e0(1366443381);
                L(l6mVar, z3, fetVar, 48);
            }
            fetVar.r(z3);
            fetVar.r(true);
            mm40Var2 = mm40Var4;
            f4 = f6;
            f3 = f7;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            f3 = f;
            f4 = f2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w5m(mm40Var2, a6mVar, z, f3, f4, i);
        }
    }

    public static final void F(CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams, fet fetVar, int i) {
        byte b;
        boolean z;
        mpm lpmVar;
        CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams2 = cyberTournamentBracketMatchParams;
        cyberTournamentBracketMatchParams2.getClass();
        fetVar.g0(-1173421028);
        int i2 = i | (fetVar.i(cyberTournamentBracketMatchParams2) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 0.0f, 13), 68.0f);
            long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str = cyberTournamentBracketMatchParams2.b;
            int i3 = cyberTournamentBracketMatchParams2.e;
            G(zhg0Var.a(1.0f, jm40Var, true), str, 6, s5x0.t(8.0f, 0.0f, 2), fetVar, 0);
            J(cyberTournamentBracketMatchParams2.f46615a, fetVar, 0);
            fetVar.r(true);
            int i4 = cyberTournamentBracketMatchParams2.f;
            opm opmVar = opm.f25648a;
            if (i3 == -1 || i4 == -1) {
                z = false;
                lpmVar = new lpm(opmVar, new hpm(0L, 3));
            } else {
                lpmVar = new kpm(opmVar, new hpm(0L, 3), d5c.O(String.valueOf(i3), String.valueOf(i4), false, false, new hpm(0L, 3)));
                z = false;
            }
            n4c.l(jm40Var, lpmVar, z, fetVar, 4);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
            thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            cyberTournamentBracketMatchParams2 = cyberTournamentBracketMatchParams;
            J(cyberTournamentBracketMatchParams2.c, fetVar, 0);
            b = 1;
            G(zhg0Var.a(1.0f, jm40Var, true), cyberTournamentBracketMatchParams2.d, 5, s5x0.t(8.0f, 0.0f, 2), fetVar, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            b = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vjh(cyberTournamentBracketMatchParams2, i, b);
        }
    }

    public static final void G(mm40 mm40Var, String str, int i, lh80 lh80Var, fet fetVar, int i2) {
        fetVar.g0(-721257839);
        byte b = 4;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.g(lh80Var) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean z2 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            int i5 = ((Boolean) pz40Var.getValue()).booleanValue() ? 2 : 1;
            y9q0 y9q0Var = ((Boolean) pz40Var2.getValue()).booleanValue() ? new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109) : new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            mm40 mm40VarI = s5x0.I(mm40Var, lh80Var);
            f2q0 f2q0Var = new f2q0(i);
            boolean zG = fetVar.g(pz40Var) | fetVar.g(pz40Var2);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = new cw7(pz40Var, pz40Var2, b);
                fetVar.o0(objP3);
            }
            v8q0.a(str, mm40VarI, textPrimary, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, true, i5, 0, (Function1) objP3, y9q0Var, fetVar, (i3 >> 3) & 14, ((i3 >> 6) & 14) | 3456, 35832);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51(mm40Var, str, i, lh80Var, i2);
        }
    }

    public static final void H(mm40 mm40Var, String str, boolean z, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        mm40 mm40Var2;
        boolean z2;
        fetVar.g0(-291427663);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new LinkedHashSet();
                fetVar.o0(objP);
            }
            Set set = (Set) objP;
            boolean zContains = set.contains(str);
            boolean z3 = !zContains;
            int i3 = i2 & 112;
            int i4 = i2 & 896;
            boolean z4 = (i3 == 32) | (i4 == 256);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == obj) {
                objP2 = xf0.c((!z || zContains) ? 0.0f : 1.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var = (t33) objP2;
            boolean zI = fetVar.i(t33Var) | fetVar.d(fB);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new ntf(b, fB, t33Var);
                fetVar.o0(objP3);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = ffb0.P(jm40Var, (Function1) objP3);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
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
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar, 6);
            fetVar.r(true);
            boolean zI2 = fetVar.i(set) | (i3 == 32);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                z2 = false;
                objP4 = new otf(set, str, (byte) 0);
                fetVar.o0(objP4);
            } else {
                z2 = false;
            }
            m0x0.D((Function0) objP4, fetVar);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI3 = fetVar.i(t33Var) | (i4 == 256 ? true : z2) | fetVar.h(z3);
            Object objP5 = fetVar.P();
            if (zI3 || objP5 == obj) {
                Object qtfVar = new qtf(z, t33Var, z3, null, (byte) 0);
                fetVar.o0(qtfVar);
                objP5 = qtfVar;
            }
            m0x0.v(str, boolValueOf, (Function2) objP5, fetVar);
            mm40Var2 = jm40Var;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ptf(mm40Var2, str, z, ugdVar2, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(a4x a4xVar, fet fetVar, int i) {
        a4x a4xVar2;
        fet fetVar2;
        byte b;
        yje yjeVar;
        byte b2;
        fetVar.g0(-55623087);
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            gy40 gy40Var = xczVarA.g;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(a4xVar.size());
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            float fW0 = w6kVar.w0(196.0f);
            boolean zE = fetVar.e(a4xVar.size());
            Object objP4 = fetVar.P();
            if (zE || objP4 == cl5Var) {
                objP4 = Boolean.valueOf((a4xVar.size() <= cgk0Var.l() || ((Boolean) pz40Var.getValue()).booleanValue() || ((Boolean) pz40Var2.getValue()).booleanValue()) ? false : true);
                fetVar.o0(objP4);
            }
            Boolean bool = (Boolean) objP4;
            boolean zBooleanValue = bool.booleanValue();
            boolean zE2 = fetVar.e(a4xVar.size());
            Object objP5 = fetVar.P();
            if (zE2 || objP5 == cl5Var) {
                fuf fufVar = (fuf) CollectionsKt.f0(a4xVar);
                objP5 = fufVar != null ? fufVar.f10159a : null;
                fetVar.o0(objP5);
            }
            String str = (String) objP5;
            mm40 mm40VarG = aad.G(o7k0.d(jm40.b, 1.0f), xfn.a(fetVar).c, xfn.a(fetVar).c);
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar).c, 0.0f, xfn.a(fetVar).c, 0.0f, 10);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            int i3 = i2 & 14;
            boolean zH = (i3 == 4) | fetVar.h(zBooleanValue) | fetVar.g(str);
            Object objP6 = fetVar.P();
            if (zH || objP6 == cl5Var) {
                objP6 = new r91((Object) a4xVar, zBooleanValue, (Object) str, (byte) 7);
                fetVar.o0(objP6);
            }
            b8k0.f(mm40VarG, xczVarA, lh80VarU, false, qw3Var, null, null, false, null, (Function1) objP6, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            fetVar2 = fetVar;
            boolean zG = fetVar2.g(gy40Var);
            Object objP7 = fetVar2.P();
            if (zG || objP7 == cl5Var) {
                b = 0;
                objP7 = new ttf(gy40Var, pz40Var2, null, b);
                fetVar2.o0(objP7);
            } else {
                b = 0;
            }
            m0x0.t(fetVar2, gy40Var, (Function2) objP7);
            Unit unit = Unit.f46060a;
            boolean z = (i3 == 4 ? (byte) 1 : b) | (fetVar2.g(xczVarA) ? 1 : 0);
            Object objP8 = fetVar2.P();
            if (z != 0 || objP8 == cl5Var) {
                yjeVar = null;
                b2 = 1;
                a4xVar2 = a4xVar;
                objP8 = new b18(a4xVar2, xczVarA, yjeVar, b2);
                fetVar2.o0(objP8);
            } else {
                yjeVar = null;
                b2 = 1;
                a4xVar2 = a4xVar;
            }
            m0x0.t(fetVar2, unit, (Function2) objP8);
            Integer numValueOf = Integer.valueOf(cgk0Var.l());
            boolean zG2 = fetVar2.g(xczVarA) | fetVar2.d(fW0);
            Object objP9 = fetVar2.P();
            if (zG2 || objP9 == cl5Var) {
                utf utfVar = new utf(xczVarA, fW0, pz40Var2, yjeVar, (byte) 0);
                fetVar2.o0(utfVar);
                objP9 = utfVar;
            }
            m0x0.v(bool, numValueOf, (Function2) objP9, fetVar2);
            byte b3 = i3 == 4 ? b2 : b;
            Object objP10 = fetVar2.P();
            if (b3 != 0 || objP10 == cl5Var) {
                objP10 = new mtf(a4xVar2, cgk0Var, pz40Var, b);
                fetVar2.o0(objP10);
            }
            m0x0.D((Function0) objP10, fetVar2);
        } else {
            a4xVar2 = a4xVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar2, i, (byte) 3);
        }
    }

    public static final void J(String str, fet fetVar, int i) {
        String str2;
        fet fetVar2;
        fetVar.g0(-1900429295);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            long secondary60 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary60();
            pge pgeVar = gqw0.f1;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            str2 = str;
            fetVar2 = fetVar;
            lgb.v(o7k0.n(jm40Var, 32.0f), o7k0.n(jm40Var, 32.0f), str2, R.drawable.ic_glyph_circle_globe, secondary60, pgeVar, fetVar2, ((i2 << 6) & 896) | 196608, 0);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0((byte) 19, i, str2);
        }
    }

    public static final void K(e6m e6mVar, fet fetVar, int i) {
        byte b;
        fetVar.g0(1988633210);
        int i2 = (fetVar.g(e6mVar) ? 4 : 2) | i;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            Long lValueOf = Long.valueOf(e6mVar.b);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (z || objP3 == obj) {
                objP3 = new t5m(e6mVar, pz40Var, yjeVar, b2);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, lValueOf, (Function2) objP3);
            boolean z2 = i3 == 4;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == obj) {
                objP4 = new c8n(e6mVar.f7292a, new w7n(new z7n(), e6mVar.b, e6mVar.c, e6mVar.f, e6mVar.e, e6mVar.d));
                fetVar.o0(objP4);
            }
            c8n c8nVar = (c8n) objP4;
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar.e0(-1406079425);
                boolean zI = fetVar.i(vneVar);
                Object objP5 = fetVar.P();
                if (zI || objP5 == obj) {
                    objP5 = new s5m(vneVar, pz40Var, b2);
                    fetVar.o0(objP5);
                }
                v7n.c(null, c8nVar, (Function0) objP5, fetVar, 1);
                b = 0;
                fetVar.r(false);
            } else {
                b = 0;
                fetVar.e0(-1405824760);
                fetVar.r(false);
            }
        } else {
            b = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x5m(e6mVar, i, b);
        }
    }

    public static final void L(l6m l6mVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(444185178);
        int i2 = (fetVar.g(l6mVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                long j = l6mVar.d;
                objP = new x8n(z ? new q8n(j) : new r8n(j), l6mVar.f19513a, z ? l6mVar.b : l6mVar.c);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            p8n.b(o2e.e0(jm40.b, z ? "FirstDsSportVictoryIndicatorTag" : "SecondDsSportVictoryIndicatorTag"), (x8n) objP, true, fetVar2, 384, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jv1(l6mVar, z, i, (byte) 7);
        }
    }

    public static final void M(int i, fet fetVar) {
        fetVar.g0(1713907937);
        if (fetVar.U(i & 1, i != 0)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new lpm(qpm.f29126a, new gpm());
                fetVar.o0(objP);
            }
            n4c.l(null, (lpm) objP, false, fetVar, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 2);
        }
    }

    public static final void N(mm40 mm40Var, long j, n0x n0xVar, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(841575490);
        int i2 = i | 6 | (fetVar.f(j) ? 32 : 16) | (fetVar.g(n0xVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar), new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), null, 10);
            jm40 jm40Var = jm40.b;
            fetVar.e0(1651942753);
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40Var;
            k7x.b(n0xVar.f22722a, null, o7k0.n(jm40Var, 14.0f), oilVarT, oilVarT, null, null, null, null, null, gqw0.B, h2t0.a(j, y3d.g) ? null : new m78(j, 5), fetVar, 36912, 6, 27616);
            fetVar2 = fetVar;
            fetVar2.r(false);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2(mm40Var2, j, n0xVar, i);
        }
    }

    public static final pz40 O(gmq gmqVar, Object obj, s7g s7gVar, fet fetVar, int i, int i2) {
        lkz lkzVar = lkz.c;
        clz clzVar = s7gVar;
        if ((i2 & 2) != 0) {
            clzVar = (clz) fetVar.k(or00.f25714a);
        }
        if ((i2 & 4) != 0) {
            lkzVar = lkz.d;
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
        return P(gmqVar, obj, clzVar.x(), lkzVar, gVar, fetVar, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (i & 57344));
    }

    public static final pz40 P(gmq gmqVar, Object obj, glz glzVar, lkz lkzVar, CoroutineContext coroutineContext, fet fetVar, int i) {
        Object[] objArr = {gmqVar, glzVar, lkzVar, coroutineContext};
        boolean zI = ((((i & 7168) ^ 3072) > 2048 && fetVar.e(lkzVar.ordinal())) || (i & 3072) == 2048) | fetVar.i(glzVar) | fetVar.i(coroutineContext) | fetVar.i(gmqVar);
        Object objP = fetVar.P();
        Object obj2 = ukd.f35823a;
        if (zI || objP == obj2) {
            Object wn2Var = new wn2((Object) glzVar, (Object) lkzVar, (Object) coroutineContext, (Object) gmqVar, (yje) null, (byte) 14);
            fetVar.o0(wn2Var);
            objP = wn2Var;
        }
        Function2 function2 = (Function2) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj2) {
            objP2 = androidx.compose.runtime.e.e(obj);
            fetVar.o0(objP2);
        }
        pz40 pz40Var = (pz40) objP2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zI2 = fetVar.i(function2);
        Object objP3 = fetVar.P();
        if (zI2 || objP3 == obj2) {
            objP3 = new kgk0(function2, pz40Var, null, (byte) 2);
            fetVar.o0(objP3);
        }
        m0x0.w(objArrCopyOf, (Function2) objP3, fetVar);
        return pz40Var;
    }

    public static final pz40 Q(n7m0 n7m0Var, clz clzVar, fet fetVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            clzVar = (clz) fetVar.k(or00.f25714a);
        }
        lkz lkzVar = lkz.d;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
        Object value = n7m0Var.getValue();
        glz glzVarX = clzVar.x();
        int i3 = i & 14;
        int i4 = i << 3;
        return P(n7m0Var, value, glzVarX, lkzVar, gVar, fetVar, i3 | (i4 & 7168) | (i4 & 57344));
    }

    public static final wkm R(int i, boolean z, boolean z2) {
        long secondary;
        if (z2) {
            pz40 pz40Var = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getPrimary();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            secondary = s6t0.b().f33626a.getSecondary();
        }
        return new wkm(0, i, z, ra50.f30118a, secondary);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static c2 S(Bundle bundle, String str) throws d0u {
        str.getClass();
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            obj.getClass();
                            return obj instanceof byte[] ? new omk(new String((byte[]) obj, Charsets.UTF_8), bundle, (byte) 0) : new omk((String) obj, bundle, (byte) 0);
                        } catch (Exception unused) {
                            throw new t7r();
                        }
                    }
                    throw new t7r();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string == null) {
                            throw new d0u("The device does not contain a restore credential.", (byte) 4);
                        }
                        omk omkVar = new omk(bundle, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                return omkVar;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new t7r();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string2.getClass();
                            string3.getClass();
                            return new omk(string3, bundle, (byte) 1);
                        } catch (Exception unused3) {
                            throw new t7r();
                        }
                    }
                    throw new t7r();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string4.getClass();
                            return new omk(string4, bundle, (byte) 2);
                        } catch (Exception unused4) {
                            throw new t7r();
                        }
                    }
                    throw new t7r();
                default:
                    throw new t7r();
            }
        } catch (t7r unused5) {
            return new hxf(bundle, str);
        }
    }

    public static final gbn T(Function1 function1) {
        return new gbn(new f4m((byte) 26), new e9k(3, (byte) 16), new btm(function1, (byte) 9), zdh.Y);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public static final p6m U(ctf0 ctf0Var, String str, boolean z) {
        str.getClass();
        if (!kotlin.text.c.x(str, ujn.h, false)) {
            if (str.length() == 0) {
                str = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str)) {
                    str = "";
                } else {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        }
        return new p6m(new c280(str, R.drawable.ic_glyph_placeholder_player), z ? ctf0Var.b.a(R.string.about_map_win_tag, Arrays.copyOf(new Object[0], 0)) : null);
    }

    public static final ArrayList V(long j, ArrayList arrayList) {
        Object bc90Var;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            sc90 sc90Var = (sc90) obj;
            if (Intrinsics.d(sc90Var, rc90.f30227a)) {
                bc90Var = new gc90(bww.H(j));
            } else if (Intrinsics.d(sc90Var, rc90.b)) {
                bc90Var = new gc90(azw.O(j));
            } else {
                if (!(sc90Var instanceof qc90)) {
                    t9f.b();
                    return null;
                }
                boolean z = ((qc90) sc90Var).f28475a;
                bc90Var = new bc90(z ? R.drawable.bg_penalty_beating : R.drawable.bg_penalty_expected, z ? R.color.static_white : R.color.static_white_60, String.valueOf(i2));
            }
            arrayList2.add(bc90Var);
            i = i2;
        }
        return arrayList2;
    }

    public static final List W(h2g h2gVar) {
        ArrayList arrayList;
        List list;
        if (h2gVar == null || (list = h2gVar.c) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l = ((z9h) it.next()).f44018a;
                if (l != null) {
                    arrayList.add(l);
                }
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static boolean X(Context context) {
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT == 28 && str != null) {
            for (String str2 : context.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int Y(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int Z(Object obj) {
        return Y(obj == null ? 0 : obj.hashCode());
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-324555443);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.d(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 109560);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 8);
        }
    }

    public static final uvc a0(xvc xvcVar, String str, String str2) {
        bp5 bp5Var;
        xvcVar.getClass();
        str.getClass();
        str2.getClass();
        Integer num = xvcVar.f41552a;
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        String str3 = xvcVar.b;
        String strConcat = str3 != null ? str.concat(str3) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        String str4 = xvcVar.c;
        String strConcat2 = str4 != null ? str.concat(str4) : null;
        if (strConcat2 == null) {
            strConcat2 = "";
        }
        String str5 = xvcVar.d;
        String strConcat3 = str5 != null ? str.concat(str5) : null;
        if (strConcat3 == null) {
            strConcat3 = "";
        }
        String str6 = xvcVar.e;
        String strConcat4 = str6 != null ? str.concat(str6) : null;
        if (strConcat4 == null) {
            strConcat4 = "";
        }
        String str7 = xvcVar.f;
        String strConcat5 = str7 != null ? str.concat(str7) : null;
        if (strConcat5 == null) {
            strConcat5 = "";
        }
        String str8 = xvcVar.g;
        String strConcat6 = str8 != null ? str.concat(str8) : null;
        String str9 = strConcat6 == null ? "" : strConcat6;
        yk5 yk5Var = bp5.b;
        Integer num2 = xvcVar.i;
        yk5Var.getClass();
        bp5[] bp5VarArr = bp5.c;
        int length = bp5VarArr.length;
        while (true) {
            if (i >= length) {
                bp5Var = null;
                break;
            }
            bp5Var = bp5VarArr[i];
            byte b = bp5Var.f2964a;
            bp5[] bp5VarArr2 = bp5VarArr;
            if (num2 != null && b == num2.intValue()) {
                break;
            }
            i++;
            bp5VarArr = bp5VarArr2;
        }
        if (bp5Var == null) {
            bp5Var = bp5.INFO_TYPE;
        }
        bp5 bp5Var2 = bp5Var;
        String str10 = xvcVar.j;
        String str11 = str10 == null ? "" : str10;
        String str12 = xvcVar.k;
        String str13 = str12 == null ? "" : str12;
        String str14 = xvcVar.m;
        String strA = str14 != null ? uwc.a(str14, str2) : null;
        String str15 = strA == null ? "" : strA;
        String str16 = xvcVar.l;
        String strP = str16 != null ? twn.p("#deeplink_appKey#", str16, str2) : null;
        return new uvc(iIntValue, strConcat, strConcat2, strConcat3, strConcat4, strConcat5, str9, bp5Var2, str11, str13, strP == null ? "" : strP, str15);
    }

    public static final void b(mm40 mm40Var, ikb ikbVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(555204756);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ikbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10);
            jjm jjmVar = ikbVar.b;
            kjm kjmVar = kjm.f18392a;
            int i3 = i2 & 896;
            boolean z2 = (i3 == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new yw9(function1, ikbVar, (byte) 7);
                fetVar.o0(objP);
            }
            int i4 = i3;
            nkb.h(mm40VarN, jjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            mm40 mm40VarI = s5x0.I(o7k0.d(jm40Var, 1.0f), s5x0.t(xfn.a(fetVar).c, 0.0f, 2));
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(1836528850);
            for (nla nlaVar : ikbVar.c) {
                boolean z3 = ikbVar.d;
                int i5 = i4;
                boolean zG = fetVar.g(nlaVar) | (i5 == 256);
                Object objP2 = fetVar.P();
                if (zG || objP2 == obj) {
                    objP2 = new fkb(nlaVar, function1, (byte) 0);
                    fetVar.o0(objP2);
                }
                rcb.C(null, nlaVar, z3, (Function1) objP2, fetVar, 1);
                i4 = i5;
            }
            ohs0.x(fetVar, false, true, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 23, i, (Object) mm40Var2, (Object) ikbVar, function1);
        }
    }

    public static final npo b0(r6l0 r6l0Var) {
        int iOrdinal = r6l0Var.ordinal();
        if (iOrdinal == 0) {
            return npo.f23923a;
        }
        if (iOrdinal == 1) {
            return npo.b;
        }
        if (iOrdinal == 2) {
            return npo.c;
        }
        if (iOrdinal == 3) {
            return npo.d;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:60:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:67:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void c(a4x a4xVar, mm40 mm40Var, Function1 function1, int i, fet fetVar, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        yfe0 yfe0VarU;
        int i7;
        xx7 xx7Var;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objP;
        boolean z5;
        Object objP2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1698482837);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(a4xVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.i(function1) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= fetVar.e(i5) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i8 != 0) {
                    i7 = 0;
                } else {
                    i7 = i5;
                }
                mm40 mm40VarN = s5x0.N(mm40Var, xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10);
                mw3 mw3Var = uc9.c;
                xx7Var = gqw0.m;
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
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
                cl5 cl5Var = ukd.f35823a;
                if (i7 != 0) {
                    fetVar.e0(-275071865);
                    wkw wkwVar = new wkw(xx7Var);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(wkwVar, 0.0f, 8.0f, 1);
                    if ((i4 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP2 = fetVar.P();
                    if (z5 || objP2 == cl5Var) {
                        objP2 = new dx2(i7, (byte) 6);
                        fetVar.o0(objP2);
                    }
                    fbc.b(R.style.Widget_Chips_Primary, 0, fetVar, mm40VarL, (Function1) objP2);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-274675933);
                    fetVar.r(false);
                }
                y3m0 y3m0Var = new y3m0(2);
                zcl zclVar2 = qmk.f28987a;
                z2 = false;
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                lh80 lh80VarU = s5x0.u(0.0f, 4.0f, 0.0f, 24.0f, 5);
                if ((i4 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i4 & 896) == 256) {
                    z2 = true;
                }
                z4 = z3 | z2;
                objP = fetVar.P();
                if (z4 || objP == cl5Var) {
                    objP = new or0(a4xVar, function1, (byte) 9);
                    fetVar.o0(objP);
                }
                ydx.f(y3m0Var, null, null, lh80VarU, 8.0f, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 918);
                fetVar.r(true);
                i6 = i7;
            } else {
                fetVar.X();
                i6 = i5;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ofe(a4xVar, mm40Var, function1, i6, i2, i3);
            }
        }
        i4 |= 3072;
        i5 = i;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            if (i8 != 0) {
                i7 = 0;
            } else {
                i7 = i5;
            }
            mm40 mm40VarN2 = s5x0.N(mm40Var, xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10);
            mw3 mw3Var2 = uc9.c;
            xx7Var = gqw0.m;
            x5d x5dVarA2 = w5d.a(mw3Var2, xx7Var, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            cl5 cl5Var2 = ukd.f35823a;
            if (i7 != 0) {
                fetVar.e0(-275071865);
                wkw wkwVar2 = new wkw(xx7Var);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarL2 = s5x0.L(wkwVar2, 0.0f, 8.0f, 1);
                if ((i4 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objP2 = fetVar.P();
                if (z5) {
                    objP2 = new dx2(i7, (byte) 6);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new dx2(i7, (byte) 6);
                    fetVar.o0(objP2);
                }
                fbc.b(R.style.Widget_Chips_Primary, 0, fetVar, mm40VarL2, (Function1) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(-274675933);
                fetVar.r(false);
            }
            y3m0 y3m0Var2 = new y3m0(2);
            zcl zclVar4 = qmk.f28987a;
            z2 = false;
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarU2 = s5x0.u(0.0f, 4.0f, 0.0f, 24.0f, 5);
            if ((i4 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i4 & 896) == 256) {
                z2 = true;
            }
            z4 = z3 | z2;
            objP = fetVar.P();
            if (z4) {
                objP = new or0(a4xVar, function1, (byte) 9);
                fetVar.o0(objP);
            } else {
                objP = new or0(a4xVar, function1, (byte) 9);
                fetVar.o0(objP);
            }
            ydx.f(y3m0Var2, null, null, lh80VarU2, 8.0f, qw3Var2, null, false, null, (Function1) objP, fetVar, 0, 918);
            fetVar.r(true);
            i6 = i7;
        } else {
            fetVar.X();
            i6 = i5;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofe(a4xVar, mm40Var, function1, i6, i2, i3);
        }
    }

    public static final gfr c0(jfr jfrVar) {
        List list = jfrVar.c;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dnm0.q((gip0) it.next()));
        }
        List list2 = jfrVar.f16442a;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(dnm0.r((xft0) it2.next(), arrayList));
        }
        Long l = jfrVar.b;
        return new gfr(l != null ? l.longValue() : 0L, arrayList2);
    }

    public static final void d(kuf kufVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1954549929);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(kufVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
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
            nkb.h(s5x0.L(jm40.b, xfn.a(fetVar).e, 0.0f, 2), kufVar.f18907a, kjm.b, null, null, null, fetVar, 384, 56);
            I(kufVar.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(kufVar, i, (byte) 27);
        }
    }

    public static final fyr d0(d0t d0tVar, boolean z, boolean z2, String str, boolean z3, ArrayList arrayList, boolean z4, boolean z5, String str2) {
        boolean zH0;
        d0tVar.getClass();
        boolean z6 = d0tVar.C;
        str.getClass();
        long j = d0tVar.v;
        rqs rqsVar = d0tVar.p;
        f0t f0tVar = d0tVar.r;
        f0t f0tVar2 = d0tVar.q;
        boolean zH1 = true;
        boolean z7 = j == 40;
        long j2 = d0tVar.f5282a;
        dur durVarY = xbc.Y(d0tVar, str, str2, arrayList, z, z2, true, z4, z5);
        qtr qtrVarF0 = vbc.f0(d0tVar, false, z3, false);
        long j3 = f0tVar2.f8731a;
        String strC0 = qzb.c0(d0tVar);
        String str3 = (String) CollectionsKt.firstOrNull(f0tVar2.d);
        if (str3 == null) {
            str3 = "";
        }
        long j4 = uvg.d.b;
        byr byrVar = new byr(j3, strC0, str3, j != j4);
        long j5 = f0tVar.f8731a;
        String strR0 = qzb.r0(d0tVar);
        String str4 = (String) CollectionsKt.firstOrNull(f0tVar.d);
        cyr cyrVar = new cyr((j == jrg.d.b || j == jwg.d.b || j == mxg.d.b) ? R.drawable.ic_banker : R.drawable.no_photo_new, j5, strR0, str4 == null ? "" : str4, j != j4);
        String str5 = z7 ? d0tVar.c : rqsVar.m;
        long j6 = d0tVar.s;
        tvg tvgVar = tvg.d;
        if (j == tvgVar.b) {
            zH0 = true;
        } else {
            zH0 = z6 ? qzb.H0(d0tVar) : qzb.E0(d0tVar);
        }
        ayr ayrVar = new ayr(j6, str5, zH0, z7);
        if (j != tvgVar.b) {
            zH1 = z6 ? qzb.H0(d0tVar) : qzb.E0(d0tVar);
        }
        return new fyr(j2, durVarY, qtrVarF0, byrVar, cyrVar, ayrVar, new fus(z6 ? rqsVar.j : d0tVar.t, d0tVar.P.getTime(), zH1, true));
    }

    public static final void e(ir8 ir8Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-390818309);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            vuh vuhVar = (vuh) l7m0Var.getValue();
            if (vuhVar != null) {
                if (vuhVar instanceof uuh) {
                    fetVar.e0(-1914233175);
                    u(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = vuhVar instanceof tuh;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(788372838);
                        n(ir8Var.b(jm40Var, gqw0.e), ((tuh) vuhVar).e, function1, fetVar, i2 & 896);
                        fetVar.r(false);
                    } else if (vuhVar instanceof suh) {
                        fetVar.e0(788623473);
                        a4x a4xVar = ((suh) vuhVar).e;
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        boolean z2 = (i2 & 896) == 256;
                        Object objP = fetVar.P();
                        if (z2 || objP == ukd.f35823a) {
                            objP = new olh(function1, b);
                            fetVar.o0(objP);
                        }
                        c(a4xVar, mm40VarD, (Function1) objP, 0, fetVar, 48, 8);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(-1914234885, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuh(ir8Var, l7m0Var, function1, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:513:0x08b2 A[PHI: r6
  0x08b2: PHI (r6v35 java.lang.String) = (r6v18 java.lang.String), (r6v36 java.lang.String) binds: [B:517:0x08bb, B:511:0x08af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:523:0x08d6  */
    public static final m9s e0(f5h f5hVar, Map map, List list, List list2, boolean z, String str, boolean z2, vby vbyVar, boolean z3, boolean z4, boolean z5) {
        String strB;
        edy edyVar;
        Class<w9l> cls;
        Class<w9l> cls2;
        edy edyVar2;
        iqg hvd0Var;
        ka30 ka30Var;
        long j;
        int i;
        qqs qqsVar;
        String str2;
        String str3;
        long j2;
        ArrayList arrayList;
        szj0 szj0Var;
        szj0 szj0Var2;
        Boolean bool;
        Long l;
        Integer num;
        Long l2;
        Long l3;
        Long l4;
        ArrayList arrayList2;
        Integer num2;
        Integer num3;
        Integer num4;
        Boolean bool2;
        Long l5;
        String strValueOf;
        String strValueOf2;
        edy edyVar3;
        Long l6;
        Long l7;
        Long l8;
        edy edyVar4;
        mcy mcyVar;
        f5hVar.getClass();
        zpg zpgVar = f5hVar.G;
        Long l9 = f5hVar.h;
        map.getClass();
        list.getClass();
        list2.getClass();
        str.getClass();
        vbyVar.getClass();
        jch jchVar = f5hVar.I;
        Integer num5 = f5hVar.L;
        k2g k2gVar = f5hVar.y;
        h2g h2gVar = f5hVar.B;
        h2g h2gVar2 = f5hVar.A;
        gdh gdhVar = f5hVar.x;
        e2g e2gVar = f5hVar.z;
        int iF = (jchVar == null || (edyVar4 = jchVar.q) == null || (mcyVar = (mcy) edyVar4.get("tdc")) == null) ? 1 : ncy.f(ncy.j(mcyVar));
        sip.f32274a.getClass();
        sip sipVarM = bek.m(num5);
        edy edyVar5 = jchVar != null ? jchVar.q : null;
        long jLongValue = 0;
        long jLongValue2 = (gdhVar == null || (l8 = gdhVar.f11103a) == null) ? 0L : l8.longValue();
        long jLongValue3 = (e2gVar == null || (l7 = e2gVar.f7083a) == null) ? 0L : l7.longValue();
        long jLongValue4 = (k2gVar == null || (l6 = k2gVar.f17569a) == null) ? 0L : l6.longValue();
        mcy mcyVar2 = (jchVar == null || (edyVar3 = jchVar.q) == null) ? null : (mcy) edyVar3.get("Ch");
        jdy jdyVar = mcyVar2 instanceof jdy ? (jdy) mcyVar2 : null;
        if (jdyVar != null) {
            scx scxVar = ncy.f23316a;
            if (jdyVar instanceof bdy) {
                strB = null;
            } else {
                strB = jdyVar.b();
            }
        } else {
            strB = null;
        }
        Class<w9l> cls3 = w9l.class;
        if (jLongValue2 != 40) {
            edyVar = edyVar5;
            cls = ten.class;
            cls2 = cls3;
            if (jLongValue2 == mxg.d.b) {
                cls3 = nus0.class;
            } else if (jLongValue2 == jrg.d.b) {
                cls3 = ag5.class;
            } else if (jLongValue2 == jwg.d.b) {
                cls3 = rij0.class;
            } else if (jLongValue2 == qtg.d.b) {
                cls3 = Intrinsics.d(strB, "2") ? g08.class : clk.class;
            } else if (jLongValue2 == ktg.d.b) {
                cls3 = d6t0.class;
            } else if (jLongValue2 == iwg.d.b) {
                cls3 = myh0.class;
            } else if (jLongValue2 == kvg.d.b) {
                cls3 = lr40.class;
            } else if (jLongValue2 == iug.d.b) {
                cls3 = txv.class;
            } else if (jLongValue2 == ewg.d.b) {
                cls3 = epg0.class;
            } else if (jLongValue2 == fwg.d.b) {
                cls3 = kdh0.class;
            } else if (jLongValue2 == pxg.d.b) {
                cls3 = jdu0.class;
            } else if (jLongValue2 == xrg.d.b) {
                cls3 = cls;
            } else if (jLongValue2 == yug.d.b || jLongValue2 == uug.d.b || jLongValue2 == evg.d.b || jLongValue2 == gvg.d.b || jLongValue2 == sug.d.b) {
                cls3 = xq20.class;
            } else if (jLongValue2 == ntg.d.b) {
                cls3 = m8j.class;
            } else if (jLongValue2 == yrg.d.b) {
                cls3 = pha.class;
            } else if (jLongValue2 == fsg.d.b) {
                cls3 = ahf.class;
            } else if (jLongValue2 == rtg.d.b) {
                cls3 = mkk.class;
            } else if (jLongValue2 == hwg.d.b) {
                cls3 = ayh0.class;
            } else if (jLongValue2 == cwg.d.b) {
                cls3 = bfg0.class;
            } else if (jLongValue2 == jtg.d.b) {
                cls3 = xtp0.class;
            } else if (jLongValue2 == lug.d.b) {
                cls3 = hoy.class;
            } else if (jLongValue2 == uvg.d.b) {
                cls3 = hqb0.class;
            } else if (jLongValue2 == cug.d.b) {
                cls3 = jav.class;
            } else if (jLongValue2 == wrg.d.b) {
                cls3 = zea.class;
            } else if (jLongValue2 == bxg.d.b) {
                cls3 = bsp.class;
            } else if (jLongValue2 == vrg.d.b) {
                cls3 = nba.class;
            } else if (jLongValue2 == tvg.d.b) {
                cls3 = jLongValue3 == 2566618 ? p5x.class : qpa0.class;
            } else if (jLongValue2 == lxg.d.b) {
                cls3 = odq0.class;
            } else if (jLongValue2 == dug.d.b) {
                cls3 = xiv.class;
            } else if (jLongValue2 == wtg.d.b) {
                cls3 = p0p.class;
            } else if (jLongValue2 == hsg.d.b) {
                cls3 = ytf.class;
            } else if (jLongValue2 == ovg.d.b) {
                cls3 = l960.class;
            } else if (jLongValue2 == awg.d.b) {
                cls3 = akg0.class;
            } else {
                cls3 = jLongValue2 == mwg.d.b ? wlk0.class : kjg.class;
            }
        } else if (jLongValue4 == 1) {
            edyVar = edyVar5;
            cls = ten.class;
            cls2 = cls3;
        } else if (jLongValue4 == 46) {
            edyVar = edyVar5;
            cls = ten.class;
            cls2 = cls3;
            cls3 = lrf.class;
        } else if (jLongValue4 == 2) {
            edyVar = edyVar5;
            cls = ten.class;
            cls2 = cls3;
            cls3 = a110.class;
        } else if (jLongValue4 == 36) {
            edyVar = edyVar5;
            cls = ten.class;
            cls2 = cls3;
            cls3 = bj40.class;
        } else if (jLongValue4 == 27) {
            edyVar = edyVar5;
            cls = ten.class;
            cls2 = cls3;
            cls3 = g0u0.class;
        } else if (jLongValue4 == 15) {
            edyVar = edyVar5;
            cls = ten.class;
            cls2 = cls3;
            cls3 = hvd0.class;
        } else {
            edyVar = edyVar5;
            cls = ten.class;
            cls2 = cls3;
        }
        if (edyVar == null) {
            try {
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                edyVar2 = new edy(lunVar);
            } catch (Exception e) {
                e.printStackTrace();
                if (cls3.equals(nus0.class)) {
                    hvd0Var = new nus0();
                } else if (cls3.equals(ag5.class)) {
                    hvd0Var = new ag5();
                } else if (cls3.equals(rij0.class)) {
                    hvd0Var = new rij0();
                } else if (cls3.equals(clk.class)) {
                    hvd0Var = new clk();
                } else if (cls3.equals(d6t0.class)) {
                    hvd0Var = new d6t0();
                } else if (cls3.equals(myh0.class)) {
                    hvd0Var = new myh0();
                } else if (cls3.equals(lr40.class)) {
                    hvd0Var = new lr40();
                } else if (cls3.equals(txv.class)) {
                    hvd0Var = new txv();
                } else if (cls3.equals(epg0.class)) {
                    hvd0Var = new epg0();
                } else if (cls3.equals(kdh0.class)) {
                    hvd0Var = new kdh0();
                } else if (cls3.equals(jdu0.class)) {
                    hvd0Var = new jdu0();
                } else if (cls3.equals(cls)) {
                    hvd0Var = new ten();
                } else if (cls3.equals(xq20.class)) {
                    hvd0Var = new xq20();
                } else if (cls3.equals(m8j.class)) {
                    hvd0Var = new m8j();
                } else if (cls3.equals(pha.class)) {
                    hvd0Var = new pha();
                } else if (cls3.equals(ahf.class)) {
                    hvd0Var = new ahf();
                } else if (cls3.equals(mkk.class)) {
                    hvd0Var = new mkk();
                } else if (cls3.equals(ayh0.class)) {
                    hvd0Var = new ayh0();
                } else if (cls3.equals(bfg0.class)) {
                    hvd0Var = new bfg0();
                } else if (cls3.equals(xtp0.class)) {
                    hvd0Var = new xtp0();
                } else if (cls3.equals(hoy.class)) {
                    hvd0Var = new hoy();
                } else if (cls3.equals(hqb0.class)) {
                    hvd0Var = new hqb0();
                } else if (cls3.equals(jav.class)) {
                    hvd0Var = new jav();
                } else if (cls3.equals(zea.class)) {
                    hvd0Var = new zea();
                } else if (cls3.equals(bsp.class)) {
                    hvd0Var = new bsp();
                } else if (cls3.equals(nba.class)) {
                    hvd0Var = new nba();
                } else if (cls3.equals(p5x.class)) {
                    hvd0Var = new p5x();
                } else if (cls3.equals(g08.class)) {
                    hvd0Var = new g08();
                } else if (cls3.equals(qpa0.class)) {
                    hvd0Var = new qpa0();
                } else if (cls3.equals(odq0.class)) {
                    hvd0Var = new odq0();
                } else if (cls3.equals(xiv.class)) {
                    hvd0Var = new xiv();
                } else if (cls3.equals(p0p.class)) {
                    hvd0Var = new p0p();
                } else if (cls3.equals(ytf.class)) {
                    hvd0Var = new ytf();
                } else if (cls3.equals(l960.class)) {
                    hvd0Var = new l960();
                } else if (cls3.equals(akg0.class)) {
                    hvd0Var = new akg0();
                } else if (cls3.equals(wlk0.class)) {
                    hvd0Var = new wlk0();
                } else if (Intrinsics.d(cls3, cls2)) {
                    hvd0Var = new w9l();
                } else if (Intrinsics.d(cls3, lrf.class)) {
                    hvd0Var = new lrf();
                } else if (Intrinsics.d(cls3, a110.class)) {
                    hvd0Var = new a110();
                } else if (Intrinsics.d(cls3, bj40.class)) {
                    hvd0Var = new bj40();
                } else if (Intrinsics.d(cls3, g0u0.class)) {
                    hvd0Var = new g0u0();
                } else {
                    hvd0Var = Intrinsics.d(cls3, hvd0.class) ? new hvd0() : kjg.INSTANCE;
                }
            }
        } else {
            edyVar2 = edyVar;
        }
        Object objA = vbyVar.a(q5x.Q(vbyVar.b, cls3), edyVar2);
        objA.getClass();
        hvd0Var = (iqg) objA;
        Long l10 = f5hVar.f8961a;
        if (l10 != null) {
            jLongValue = l10.longValue();
        }
        Long l11 = f5hVar.e;
        long jLongValue5 = l11 != null ? l11.longValue() : jLongValue;
        List listW = W(h2gVar2);
        List listW2 = W(h2gVar);
        String str4 = f5hVar.g;
        String str5 = str4 == null ? "" : str4;
        String str6 = e2gVar != null ? e2gVar.b : null;
        String str7 = str6 == null ? "" : str6;
        gog gogVar = f5hVar.F;
        if (gogVar != null) {
            String str8 = gogVar.f11630a;
            if (str8 == null) {
                str8 = "";
            }
            ka30Var = new ka30(str8);
        } else {
            ka30Var = new ka30("");
        }
        ka30 ka30Var2 = ka30Var;
        if (jchVar != null) {
            jog jogVar = jchVar.k;
            bih bihVar = jchVar.j;
            String str9 = jchVar.d;
            String str10 = str9 == null ? "" : str9;
            String str11 = jchVar.f16276a;
            String str12 = str11 == null ? "" : str11;
            List<fah> list3 = jchVar.b;
            if (list3 != null) {
                arrayList2 = new ArrayList(r3d.q(list3, 10));
                for (fah fahVar : list3) {
                    String strValueOf3 = fahVar.d;
                    long j3 = jLongValue;
                    Integer num6 = fahVar.c;
                    Integer num7 = fahVar.b;
                    if (strValueOf3 == null) {
                        strValueOf3 = "";
                    }
                    Integer num8 = fahVar.f9207a;
                    int iIntValue = num8 != null ? num8.intValue() : 0;
                    if (strValueOf3.length() == 0) {
                        strValueOf3 = String.valueOf(iIntValue);
                    }
                    String str13 = "0";
                    String str14 = (num7 == null || (strValueOf2 = String.valueOf(num7.intValue())) == null) ? "0" : strValueOf2;
                    if (num6 != null && (strValueOf = String.valueOf(num6.intValue())) != null) {
                        str13 = strValueOf;
                    }
                    arrayList2.add(new ve90(strValueOf3, str14, str13, num7 == null && num6 == null));
                    jLongValue = j3;
                }
            } else {
                arrayList2 = null;
            }
            j = jLongValue;
            List list4 = arrayList2;
            if (arrayList2 == null) {
                list4 = iun.f15405a;
            }
            List list5 = list4;
            Integer num9 = jchVar.e;
            int iIntValue2 = num9 != null ? num9.intValue() : 0;
            Integer num10 = jchVar.f;
            int iIntValue3 = num10 != null ? num10.intValue() : 0;
            Integer num11 = jchVar.g;
            int iIntValue4 = num11 != null ? num11.intValue() : 0;
            String str15 = jchVar.i;
            String str16 = str15 == null ? "" : str15;
            long jLongValue6 = (bihVar == null || (l5 = bihVar.f2659a) == null) ? j : l5.longValue();
            boolean zBooleanValue = (bihVar == null || (bool2 = bihVar.c) == null) ? false : bool2.booleanValue();
            boolean z6 = (bihVar == null || (num4 = bihVar.b) == null || num4.intValue() != -1) ? false : true;
            Long l12 = jchVar.p;
            znq0 znq0Var = l12 != null ? new znq0(l12.longValue()) : null;
            String str17 = jchVar.l;
            String str18 = str17 == null ? "" : str17;
            Boolean bool3 = jchVar.m;
            boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
            Integer num12 = jchVar.o;
            int iIntValue5 = num12 != null ? num12.intValue() : 0;
            oqs oqsVar = new oqs((jogVar == null || (num3 = jogVar.f16856a) == null) ? 0 : num3.intValue(), (jogVar == null || (num2 = jogVar.b) == null) ? 0 : num2.intValue());
            Integer num13 = jchVar.c;
            qqsVar = new qqs(str10, str12, list5, iIntValue2, iIntValue3, iIntValue4, str16, jLongValue6, zBooleanValue, z6, znq0Var, str18, zBooleanValue2, iIntValue5, oqsVar, num13 != null ? num13.intValue() : -1);
            i = 0;
        } else {
            j = jLongValue;
            i = 0;
            qqsVar = new qqs("", "", iun.f15405a, 0, 0, 0, "", 0L, false, false, null, "", false, 0, new oqs(0, 0), 0);
        }
        String str19 = h2gVar2 != null ? h2gVar2.f12331a : null;
        if (str19 == null) {
            str19 = "";
        }
        String string = StringsKt.u0(str19).toString();
        String str20 = h2gVar != null ? h2gVar.f12331a : null;
        if (str20 == null) {
            str20 = "";
        }
        String string2 = StringsKt.u0(str20).toString();
        String str21 = h2gVar2 != null ? h2gVar2.f12331a : null;
        if (str21 == null) {
            str21 = "";
        }
        String string3 = StringsKt.u0(str21).toString();
        String str22 = h2gVar != null ? h2gVar.f12331a : null;
        if (str22 == null) {
            str22 = "";
        }
        String string4 = StringsKt.u0(str22).toString();
        List listP = d5c.P(h2gVar2);
        List listP2 = d5c.P(h2gVar);
        long jLongValue7 = (gdhVar == null || (l4 = gdhVar.f11103a) == null) ? j : l4.longValue();
        long jLongValue8 = (k2gVar == null || (l3 = k2gVar.f17569a) == null) ? j : l3.longValue();
        Long l13 = f5hVar.f;
        Boolean bool4 = f5hVar.t;
        Boolean bool5 = Boolean.TRUE;
        boolean zD = Intrinsics.d(bool4, bool5);
        boolean zD2 = Intrinsics.d(f5hVar.v, bool5);
        String str23 = f5hVar.o;
        String str24 = str23 == null ? "" : str23;
        gxs gxsVar = f5hVar.H;
        String str25 = gxsVar != null ? gxsVar.b : null;
        String str26 = str25 == null ? "" : str25;
        long jLongValue9 = l9 != null ? l9.longValue() : j;
        boolean zU = kpb.u(r28);
        sip.f32274a.getClass();
        sip sipVarM2 = bek.m(num5);
        if (k2gVar == null || (str2 = k2gVar.b) == null) {
            str2 = gdhVar != null ? gdhVar.b : null;
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
        } else {
            str3 = str2;
        }
        if (l9 != null) {
            long jLongValue10 = l9.longValue() - (System.currentTimeMillis() / 1000);
            if (jLongValue10 > j) {
                j2 = jLongValue10;
            } else {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        long jLongValue11 = (e2gVar == null || (l2 = e2gVar.f7083a) == null) ? j : l2.longValue();
        Integer num14 = f5hVar.w;
        int iIntValue6 = num14 != null ? num14.intValue() : i;
        boolean zD3 = Intrinsics.d(f5hVar.D, bool5);
        int iIntValue7 = (r30 == 0 || (num = zpgVar.b) == null) ? i : num.intValue();
        String str27 = f5hVar.l;
        String str28 = str27 == null ? "" : str27;
        List list6 = f5hVar.C;
        int i2 = (list6 == null || list6.isEmpty()) ? 1 : i;
        List list7 = f5hVar.J;
        if (list7 != null) {
            arrayList = new ArrayList();
            for (Object obj : list7) {
                iqg iqgVar = hvd0Var;
                List list8 = ((zxm0) obj).d;
                if (list8 != null && !list8.isEmpty()) {
                    arrayList.add(obj);
                }
                hvd0Var = iqgVar;
            }
        } else {
            arrayList = null;
        }
        iqg iqgVar2 = hvd0Var;
        boolean z7 = i2 == 0 || !(arrayList == null || arrayList.isEmpty());
        String str29 = r30 != 0 ? r30.f44758a : null;
        if (str29 == null) {
            str29 = "";
        }
        ArrayList arrayListC0 = acb.c0(f5hVar, map, kpb.u(sipVarM), list, list2, z2, z, str, z4, z5);
        cqg cqgVarG0 = jcb.g0(iqgVar2, vbyVar, (gdhVar == null || (l = gdhVar.f11103a) == null) ? j : l.longValue(), f5hVar, z3);
        boolean zBooleanValue3 = (e2gVar == null || (bool = e2gVar.d) == null) ? false : bool.booleanValue();
        qud qudVar = boh.b;
        Integer num15 = e2gVar != null ? e2gVar.e : null;
        Boolean bool6 = Boolean.TRUE;
        qudVar.getClass();
        boh bohVarD = qud.d(num15, bool6);
        l0k0 l0k0Var = f5hVar.M;
        if (l0k0Var != null) {
            Long l14 = l0k0Var.c;
            Long l15 = l0k0Var.e;
            Long l16 = l0k0Var.f19208a;
            if (l14 == null || l14.longValue() <= j) {
                l14 = null;
            }
            Long l17 = l16 == null ? l15 : l16;
            Integer num16 = l0k0Var.b;
            sip sipVar = (num16 != null && num16.intValue() == 1) ? sip.c : (num16 != null && num16.intValue() == 3) ? sip.b : null;
            rzj0 rzj0Var = l16 != null ? qzj0.f29581a : l15 != null ? pzj0.f27849a : null;
            if (l14 == null || l17 == null || sipVar == null || rzj0Var == null) {
                szj0Var2 = null;
            } else {
                long jLongValue12 = l14.longValue();
                Long l18 = l0k0Var.d;
                Long l19 = l0k0Var.f;
                szj0Var2 = new szj0(l17, sipVar, jLongValue12, l18, rzj0Var, l19 != null ? new znq0(l19.longValue()) : null);
            }
            szj0Var = szj0Var2;
        } else {
            str29 = str29;
            cqgVarG0 = cqgVarG0;
            szj0Var = null;
        }
        return new m9s(jLongValue, jLongValue5, listW, listW2, str5, str7, ka30Var2, qqsVar, string, string2, string3, string4, listP, listP2, jLongValue7, jLongValue8, l13, zD, zD2, str24, str26, jLongValue9, j2, zU, sipVarM2, str3, jLongValue11, iIntValue6, zD3, iIntValue7, str28, z7, str29, arrayListC0, cqgVarG0, iF, zBooleanValue3, bohVarD, szj0Var, Intrinsics.d(f5hVar.N, bool6));
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(750124627);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(0.0f, 0.0f, 0.0f, 0.0f, fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new x2i((byte) 11);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarQ, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, 817889280, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 28);
        }
    }

    public static final LinkedHashMap f0(long j, int i, Integer num, String str, String str2, int i2, int i3, boolean z, boolean z2, List list, List list2, String str3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("whence", String.valueOf(22)), new Pair("fcountry", String.valueOf(i)), new Pair("ref", String.valueOf(1)), new Pair("lng", str2), new Pair("gr", String.valueOf(1357)), new Pair("limit", String.valueOf(i2)), new Pair("skip", String.valueOf(i3)));
        if (num != null) {
            linkedHashMapH.put("country", String.valueOf(num.intValue()));
        }
        if (j != nw80.t.getId()) {
            linkedHashMapH.put("partId", String.valueOf(j));
        }
        if (!list.isEmpty()) {
            linkedHashMapH.put("categoryIds", CollectionsKt.b0(list, Separators.COMMA, null, null, null, 62));
        }
        if (!list2.isEmpty()) {
            linkedHashMapH.put(z2 ? "productIds" : "brandIds", CollectionsKt.b0(list2, Separators.COMMA, null, null, null, 62));
        }
        if (str3.length() > 0) {
            linkedHashMapH.put("nameSubstr", str3);
        }
        if (z) {
            linkedHashMapH.put("test", String.valueOf(z));
        }
        if (str.length() > 0) {
            linkedHashMapH.put("filterType", str);
        }
        return linkedHashMapH;
    }

    public static final void g(int i, long j, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1960415517);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 16.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dls((byte) 6, j);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarE, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var, j, i, (byte) 11);
        }
    }

    public static final void h(mm40 mm40Var, jml jmlVar, Function1 function1, Function1 function2, Function2 function3, fet fetVar, int i) {
        int i2;
        boolean z;
        mm40 mm40VarD;
        boolean z2;
        fet fetVar2 = fetVar;
        jmlVar.getClass();
        fetVar2.g0(1684619878);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(jmlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = bdl.b(((yez) ((rhv0) fetVar2.k(bmd.u))).a()) >= 560.0f;
            mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD2);
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
            boolean z4 = jmlVar instanceof hml;
            jm40 jm40Var = jm40.b;
            zhg0 zhg0Var = zhg0.f44392a;
            if (z4) {
                fetVar2.e0(958553966);
                hml hmlVar = (hml) jmlVar;
                eml emlVar = hmlVar.b;
                if (emlVar != null) {
                    mm40VarD = zhg0Var.a(1.0f, jm40Var, true);
                } else {
                    mm40VarD = o7k0.d(jm40Var, z3 ? 0.5f : 1.0f);
                }
                mm40 mm40Var2 = mm40VarD;
                int i3 = i2 & 7168;
                boolean z5 = (i3 == 2048) | ((i2 & 112) == 32);
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (z5 || objP == cl5Var) {
                    objP = new lrk(function2, jmlVar, (byte) 9);
                    fetVar2.o0(objP);
                }
                int i4 = ((i2 >> 3) & 7168) | (i2 & 896);
                qjj.n(y860.W(mm40Var2, null, null, false, null, (Function0) objP, 28), hmlVar.f13313a, function1, function3, fetVar2, i4, 0);
                if (emlVar != null) {
                    fetVar2.e0(959829740);
                    mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
                    boolean zG = (i3 == 2048) | fetVar2.g(emlVar);
                    Object objP2 = fetVar2.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new dml(function2, emlVar, (byte) 1);
                        fetVar2.o0(objP2);
                    }
                    qjj.n(y860.W(mm40VarA, null, null, false, null, (Function0) objP2, 28), emlVar, function1, function3, fetVar2, i4, 0);
                    z2 = false;
                    fetVar2.r(false);
                } else {
                    z2 = false;
                    fetVar2.e0(960487064);
                    fetVar2.r(false);
                }
                fetVar2.r(z2);
                z = true;
            } else {
                if (!jmlVar.equals(iml.f15031a)) {
                    throw b1j.f(446560994, fetVar2, false);
                }
                fetVar2.e0(960580715);
                z = true;
                mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, true);
                fml fmlVar = fml.f9788a;
                qjj.n(mm40VarA2, fmlVar, null, null, fetVar2, 48, 12);
                fetVar2 = fetVar;
                qjj.n(zhg0Var.a(1.0f, jm40Var, true), fmlVar, null, null, fetVar2, 48, 12);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) jmlVar, (Object) function1, (Object) function2, (Object) function3, i, (byte) 17);
        }
    }

    public static final void i(mm40 mm40Var, vul vulVar, wul wulVar, wul wulVar2, long j, Function0 function0, Function0 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        long j2;
        int i4;
        long j3;
        wulVar.getClass();
        wulVar2.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(946322518);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.e(vulVar.ordinal()) ? 32 : 16;
        }
        int i6 = i3 | (fetVar.g(wulVar) ? 256 : 128) | (fetVar.g(wulVar2) ? 2048 : 1024);
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i6 | 24576;
            j2 = j;
        } else {
            j2 = j;
            i4 = i6 | (fetVar.f(j2) ? 16384 : 8192);
        }
        int i8 = i4 | (fetVar.i(function0) ? 131072 : 65536);
        if ((i & 1572864) == 0) {
            i8 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i8 & 1, (599187 & i8) != 599186)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var2;
            j3 = i7 != 0 ? y3d.f : j2;
            mm40 mm40VarQ = i120.Q(mm40Var3, j3, jd8.n);
            i4 i4VarG0 = dyb.g0(wulVar, wulVar2);
            boolean z = ((458752 & i8) == 131072) | ((i8 & 3670016) == 1048576);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new yhd(function0, function1, (byte) 3);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            int iOrdinal = vulVar.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1117103733);
                zcl zclVar = qmk.f28987a;
                j120.i(mm40VarQ, i4VarG0, 8.0f, true, null, function2, fetVar, 3072, 16);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-1117105665, fetVar, false);
                }
                fetVar.e0(-1117094449);
                j120.j(0, fetVar, i4VarG0, mm40VarQ, function2);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            j3 = j2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ool(mm40Var2, vulVar, wulVar, wulVar2, j3, function0, function1, i, i2);
        }
    }

    public static final void j(mm40 mm40Var, mp0 mp0Var, boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        List listJ;
        boolean z2;
        long backgroundContent;
        boolean z3;
        long secondary;
        fetVar.g0(1876971250);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(mp0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z4 = by7.c().f3402a;
            boolean zH = fetVar.h(z4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                if (z4) {
                    pz40 pz40Var = s6t0.f31722a;
                    listJ = q3d.j(new y3d(s6t0.b().f33626a.getBackground()), new y3d(s6t0.b().f33626a.getBackground()), new y3d(s6t0.b().f33626a.getBackground()), new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()));
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    listJ = q3d.j(new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()), new y3d(s6t0.b().f33626a.getBackground()), new y3d(s6t0.b().f33626a.getBackground()), new y3d(s6t0.b().f33626a.getBackground()));
                }
                objP = listJ;
                fetVar.o0(objP);
            }
            List list = (List) objP;
            int i3 = z ? R.drawable.ic_glyph_filter_line_active : R.drawable.ic_glyph_filter_line_inactive;
            mp0 mp0Var2 = mp0.f22154a;
            zcl zclVar = qmk.f28987a;
            float f = mp0Var == mp0Var2 ? 8.0f : 4.0f;
            float f2 = mp0Var == mp0Var2 ? 6.0f : 8.0f;
            float f3 = mp0Var == mp0Var2 ? 32.0f : 40.0f;
            mm40 mm40VarP = i120.P(mm40Var, yk5.g(list, 0.0f, 0.0f, 14), null, 6);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            float f4 = f2;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
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
            mm40 mm40VarN = o7k0.n(s5x0.N(jr8.f16991a.b(jm40.b, gqw0.f), 8.0f, f, 0.0f, f, 4), f3);
            if (z) {
                fetVar.e0(393832416);
                backgroundContent = afn0.m(fetVar).getCommerce();
                z2 = false;
            } else {
                z2 = false;
                fetVar.e0(393833449);
                backgroundContent = afn0.m(fetVar).getBackgroundContent();
            }
            fetVar.r(z2);
            int i4 = i3;
            long j = backgroundContent;
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), f4);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP2;
            boolean z6 = (i2 & 7168) == 2048;
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                objP3 = new unl(function0, (byte) 13);
                fetVar.o0(objP3);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarJ, gy40Var, null, false, null, (Function0) objP3, 28), "AGGREGATOR_DS_FILTER_BOX");
            boolean z7 = (i2 & 896) == 256;
            Object objP4 = fetVar.P();
            if (z7 || objP4 == cl5Var) {
                objP4 = new z((byte) 22, z);
                fetVar.o0(objP4);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP4);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA);
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
            mz3 mz3VarT = lv00.T(new m0x(i4, null, 6), null, null, null, fetVar, 0, 14);
            if (z) {
                fetVar.e0(1800070672);
                secondary = afn0.m(fetVar).getCommerceForeground();
                z3 = false;
            } else {
                z3 = false;
                fetVar.e0(1800072007);
                secondary = afn0.m(fetVar).getSecondary();
            }
            fetVar.r(z3);
            j0x.b(mz3VarT, null, null, null, gqw0.A, 0.0f, new m78(secondary, 5), fetVar, 24624, 44);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((Object) mm40Var, (Object) mp0Var, z, (wdr) function0, i, (byte) 15);
        }
    }

    public static final void k(mm40 mm40Var, xnm xnmVar, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        fetVar.g0(-2094186515);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(xnmVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(i120.Q(o7k0.d(o7k0.e(mm40Var, 44.0f), 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f, 2.0f, 12.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar.l(function0);
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
            mm40 mm40VarN2 = jm40.b;
            mm40 mm40VarN3 = s5x0.N(mm40VarN2, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str = xnmVar.c;
            String str2 = xnmVar.f41176a;
            z(0, fetVar, mm40VarN3, str);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean zG = fetVar.g(str2);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                if (str2.length() == 0) {
                    mm40Var2 = mm40VarN2;
                } else {
                    mm40VarN2 = s5x0.N(mm40VarN2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    mm40Var2 = mm40VarN2;
                }
                z = true;
                objP = mm40VarN2.e(new x7z(1.0f, true));
                fetVar.o0(objP);
            } else {
                mm40Var2 = mm40VarN2;
                z = true;
            }
            A(0, fetVar, (mm40) objP, xnmVar.b);
            a(0, fetVar, yyw.U(mm40Var2, 0.5f), str2);
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, xnmVar, i, (byte) 28);
        }
    }

    public static final void l(mm40 mm40Var, nym nymVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        String str = nymVar.h;
        String str2 = nymVar.g;
        fetVar.g0(797307592);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nymVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (nymVar.i) {
                fetVar.e0(1708423343);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(1708424267);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
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
            if (str2.length() <= 0 && str.length() <= 0) {
                fetVar.e0(1207342084);
                fetVar.r(false);
            } else {
                fetVar.e0(1207201778);
                t(0, fetVar, null, str2, str);
                fetVar.r(false);
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(664212478, new mxm(nymVar, (byte) 6), fetVar), fetVar, 56);
            B(0, fetVar, nymVar.e, null);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 24, i, mm40Var, nymVar);
        }
    }

    public static final void m(mm40 mm40Var, kim0 kim0Var, Function1 function1, fet fetVar, int i) {
        float f;
        long backgroundContent;
        kim0Var.getClass();
        function1.getClass();
        fetVar.g0(-1245474087);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(kim0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (kim0Var instanceof fim0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            float f2 = f;
            pim0 pim0VarE = kim0Var.e();
            if (pim0VarE != null) {
                if (pim0VarE instanceof nim0) {
                    fetVar.e0(1395291203);
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                    fetVar.r(false);
                } else if (pim0VarE instanceof oim0) {
                    fetVar.e0(1395294122);
                    backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    fetVar.r(false);
                }
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new gnm(function1, kim0Var, (byte) 18);
                    fetVar.o0(objP);
                }
                a8k0.n(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), f2, backgroundContent, null, j47.b, u1c.M(815175193, new mxm(kim0Var, (byte) 17), fetVar), j47.c, fetVar, 1797120, 0);
            }
            throw b1j.f(1395288269, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var, kim0Var, function1, i, (byte) 20);
        }
    }

    public static final void n(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(868359173);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ouh(function1, b);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i2 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i, (byte) 7);
        }
    }

    public static final void o(mm40 mm40Var, g8o g8oVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(1167783210);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(g8oVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = g8oVar instanceof e8o;
            byte b = 14;
            cl5 cl5Var = ukd.f35823a;
            jm40 jm40Var2 = jm40.b;
            if (z) {
                fetVar2.e0(194790016);
                zcl zclVar = qmk.f28987a;
                qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
                lh80 lh80VarT = s5x0.t(qmk.a(fetVar2).c, 0.0f, 2);
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    objP = new qzn(g8oVar, function1, (byte) 20);
                    fetVar2.o0(objP);
                }
                b8k0.f(jm40Var2, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar2, i2 & 14, 490);
                fetVar2.r(false);
                jm40Var = jm40Var2;
                fetVar2 = fetVar2;
            } else {
                if (!g8oVar.equals(f8o.f9116a)) {
                    throw b1j.f(1253207617, fetVar2, false);
                }
                fetVar2.e0(195495886);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                jm40Var = jm40Var2;
                qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b));
                lh80 lh80VarT2 = s5x0.t(qmk.a(fetVar2).c, 0.0f, 2);
                Object objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = new mmn((byte) 12);
                    fetVar2.o0(objP2);
                }
                fetVar2 = fetVar;
                b8k0.f(mm40VarN, null, lh80VarT2, false, qw3Var2, null, null, false, null, (Function1) objP2, fetVar2, 805306368, 490);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var2, (Object) g8oVar, (Object) function1, i, (byte) 1);
        }
    }

    public static final void p(mm40 mm40Var, dhm dhmVar, Function1 function1, fet fetVar, int i) {
        k6z k6zVar;
        dhmVar.getClass();
        fetVar.g0(-1108346098);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(dhmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (dhmVar.i) {
                fetVar.e0(31296149);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(31297073);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-818765874, new udp(mm40Var, function1, dhmVar), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new udp(mm40Var, dhmVar, function1, i);
        }
    }

    public static final void q(int i, long j, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1547948392);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var, 8.0f, 16.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dls((byte) 5, j);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarP, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var, j, i, (byte) 10);
        }
    }

    public static final void r(int i, long j, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1607588987);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var, 8.0f, 16.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dls((byte) 7, j);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarP, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var, j, i, (byte) 12);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(271159300);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(147793092, new a21(((ThemeColors) fetVar.k(zaq0.b)).getBackground()), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 3);
        }
    }

    public static final void t(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1198127614);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
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
                fetVar2.e0(-1254970137);
                j6n.h(str2, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 6) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1254823104);
                fetVar2.r(false);
            }
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
            yfe0VarU.d = new g15(mm40Var2, str, str2, i, (byte) 29);
        }
    }

    public static final void u(int i, fet fetVar) {
        fetVar.g0(-1237416599);
        if (fetVar.U(i & 1, i != 0)) {
            s0x.t(iym0.r((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L)), 48, fetVar, o7k0.d(jm40.b, 1.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i, (byte) 27);
        }
    }

    public static final void v(mm40 mm40Var, dhm dhmVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-778354545);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(dhmVar) ? 32 : 16);
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
            D(s5x0.L(jm40Var, 0.0f, 8.0f, 1), dhmVar.h, dhmVar.i, fetVar2, 0);
            String str = dhmVar.f;
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(g1t0.e(), fetVar2), fetVar, 0, 24960, 109562);
            v8q0.a(dhmVar.g, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(g1t0.e(), fetVar), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, dhmVar, i, (byte) 28);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, d280 d280Var, String str) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1315334342);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(d280Var) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new m00(d280Var, b);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, (i2 >> 6) & 14, 24960, 109554);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdp(mm40Var, d280Var, str, i, (byte) 0);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, c280 c280Var, String str) {
        int i2;
        String str2;
        fetVar.g0(-940475798);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(c280Var) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 72.0f);
            x5d x5dVarA = w5d.a(uc9.g, gqw0.n, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
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
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.f, c280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new d1n(u6nVar, b);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            mm40 mm40VarE2 = o7k0.e(jm40.b, 30.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            f1t0.a(null, str2, textPrimary, null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, g1t0.d(), 0L, fetVar, i2 & 112, 437241);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iym(mm40Var, str, c280Var, i, (byte) 3);
        }
    }

    public static final void y(mm40 mm40Var, String str, String str2, c280 c280Var, c280 c280Var2, y1m y1mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1918469025);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(c280Var) ? 2048 : 1024) | (fetVar.g(c280Var2) ? 16384 : 8192) | (fetVar.g(y1mVar) ? 131072 : 65536) | (fetVar.h(z) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 >> 3;
            x((i2 & 112) | (i3 & 896), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c280Var, str);
            obb.q(null, y1mVar, z, fetVar, (i2 >> 12) & 1008, 1);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x(((i2 >> 6) & 896) | (i3 & 112), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c280Var2, str2);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pym(mm40Var2, str, str2, c280Var, c280Var2, y1mVar, z, i, (byte) 1);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1421276912);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarD, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, (i2 >> 3) & 14, 24960, 109560);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 10);
        }
    }
}
