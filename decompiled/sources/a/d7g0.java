package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f5591a = q3d.j(new Pair(Integer.valueOf(R.string.stage_table_title_count_games), Integer.valueOf(R.string.stage_table_full_title_count_games)), new Pair(Integer.valueOf(R.string.stage_table_status_win), Integer.valueOf(R.string.stage_table_full_title_win)), new Pair(Integer.valueOf(R.string.stage_table_status_draw), Integer.valueOf(R.string.stage_table_full_title_draw)), new Pair(Integer.valueOf(R.string.stage_table_status_lose), Integer.valueOf(R.string.stage_table_full_title_lose)), new Pair(Integer.valueOf(R.string.stage_table_title_count_goals_scored), Integer.valueOf(R.string.stage_table_full_title_count_goals_scored)), new Pair(Integer.valueOf(R.string.stage_table_title_count_goals_missed), Integer.valueOf(R.string.stage_table_full_title_count_goals_missed)), new Pair(Integer.valueOf(R.string.stage_table_title_count_goals_difference), Integer.valueOf(R.string.stage_table_full_title_count_goals_difference)));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, fet fetVar) {
        fet fetVar2;
        fet fetVar3 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar3.g0(758562549);
        boolean z = true;
        int i2 = 0;
        if (fetVar3.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z2 = fetVar3.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar3.l(function0);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar4);
            jpm0.o(fetVar3, bh90VarM, shdVar3);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), shdVar2);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, shdVar);
            fetVar3.e0(2097995498);
            fet fetVar4 = fetVar3;
            for (Pair pair : f5591a) {
                int iIntValue = ((Number) pair.f46059a).intValue();
                int iIntValue2 = ((Number) pair.b).intValue();
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar4, i2);
                int iHashCode2 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM2 = fetVar4.m();
                mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarD);
                mkd.c0.getClass();
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(function0);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, thg0VarA, shdVar4);
                jpm0.o(fetVar4, bh90VarM2, shdVar3);
                jpm0.o(fetVar4, Integer.valueOf(iHashCode2), shdVar2);
                jpm0.n(fetVar4);
                jpm0.o(fetVar4, mm40VarC1, shdVar);
                v8q0.a(rsm0.w(iIntValue, 0, fetVar4), o7k0.s(jm40Var, 56.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.m(), fetVar4), fetVar, 48, 0, 131068);
                v8q0.a(rsm0.w(iIntValue2, 0, fetVar), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.n(), fetVar), fetVar, 0, 0, 131070);
                fet fetVar5 = fetVar;
                fetVar5.r(true);
                i2 = 0;
                z = true;
                jm40Var = jm40Var;
                function0 = function0;
                shdVar2 = shdVar2;
                shdVar3 = shdVar3;
                shdVar4 = shdVar4;
                shdVar = shdVar;
                fetVar4 = fetVar5;
            }
            fetVar4.r(i2);
            fetVar4.r(z);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vtf0(i, (byte) 5);
        }
    }

    public static final void b(kx50 kx50Var, fet fetVar, int i) {
        y3d y3dVar;
        long backgroundContent;
        fetVar.g0(1958966799);
        int i2 = i | (fetVar.g(kx50Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            Integer numL = n2x.L(kx50Var.b);
            if (numL == null) {
                fetVar.e0(1147237740);
                fetVar.r(false);
                y3dVar = null;
            } else {
                fetVar.e0(1147237741);
                long jO = obc.O(numL.intValue(), fetVar);
                fetVar.r(false);
                y3dVar = new y3d(jO);
            }
            if (y3dVar == null) {
                fetVar.e0(37009421);
                backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                fetVar.r(false);
            } else {
                fetVar.e0(37006476);
                fetVar.r(false);
                backgroundContent = y3dVar.f41946a;
            }
            v8q0.a(kx50Var.f19036a, s5x0.J(i120.Q(mm40VarE, backgroundContent, jd8.n), 12.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 0, 131068);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dke0(kx50Var, i, (byte) 15);
        }
    }

    public static final void c(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1530408970);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            h7g0 h7g0Var = (h7g0) l7m0Var.getValue();
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.information, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(o050.W(n0qVar), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new pme0(function1, (byte) 17);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mm40 mm40VarA0 = wha0.a0(n0qVar, wha0.T(fetVar), false, 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarA0, 16.0f, 16.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean z3 = h7g0Var instanceof f7g0;
            jm40 jm40Var = jm40.b;
            if (z3) {
                fetVar.e0(1924498292);
                d(rsm0.w(R.string.stage_table_color_info, 0, fetVar), fetVar, 0);
                qxw.o(fetVar, o7k0.e(jm40Var, 12.0f));
                fetVar.e0(62085976);
                Iterator<E> it = ((f7g0) h7g0Var).b.iterator();
                while (it.hasNext()) {
                    b((kx50) it.next(), fetVar, 0);
                    zcl zclVar2 = qmk.f28987a;
                    qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
                }
                fetVar.r(false);
                zcl zclVar3 = qmk.f28987a;
                rz4.t(jm40Var, 16.0f, fetVar, false);
            } else {
                fetVar.e0(1924882692);
                fetVar.r(false);
            }
            d(rsm0.w(R.string.stage_table_abbreviations, 0, fetVar), fetVar, 0);
            qxw.o(fetVar, o7k0.e(jm40Var, 12.0f));
            a(0, fetVar);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i, (byte) 17);
        }
    }

    public static final void d(String str, fet fetVar, int i) {
        fetVar.g0(-629025285);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, i2 & 14, 0, 131070);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 21, i, str);
        }
    }
}
