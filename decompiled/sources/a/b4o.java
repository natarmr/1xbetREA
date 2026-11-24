package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class b4o implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3o f1968a;
    public final g2v b;
    public final ctf0 c;
    public final y78 d;
    public final long e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;

    public b4o(y3o y3oVar, g2v g2vVar, ctf0 ctf0Var, y78 y78Var) {
        long j;
        j0g0 j0g0Var = y3oVar.c;
        j0g0 j0g0Var2 = y3oVar.b;
        ctf0Var.getClass();
        this.f1968a = y3oVar;
        this.b = g2vVar;
        this.c = ctf0Var;
        this.d = y78Var;
        EsportsGamesScreenParams esportsGamesScreenParams = y3oVar.f41962a;
        Object obj = null;
        EsportsGamesScreenParams.SportGames sportGames = esportsGamesScreenParams instanceof EsportsGamesScreenParams.SportGames ? (EsportsGamesScreenParams.SportGames) esportsGamesScreenParams : null;
        if (sportGames != null) {
            j = sportGames.d == CyberGamesPage.Real.INSTANCE.f46556a ? sportGames.b : sportGames.f46563a;
        } else {
            j = 40;
        }
        this.e = j;
        this.f = bkb.H(Boolean.valueOf(y3oVar.o));
        this.g = bkb.H(Integer.valueOf(y3oVar.e));
        this.h = bkb.H(Boolean.valueOf(y3oVar.h));
        this.i = bkb.H(Integer.valueOf(esportsGamesScreenParams.getD()));
        this.j = bkb.H(y3oVar.i);
        this.k = bkb.H(Boolean.valueOf(y3oVar.m));
        this.l = bkb.H(y3oVar.j);
        this.m = bkb.H(j0g0Var2);
        this.n = bkb.H(j0g0Var);
        this.o = bkb.H(Boolean.valueOf(y3oVar.n));
        this.p = maz.b(new yw9(null, new a4o(this), (byte) 20));
        this.q = maz.b(new yw9(null, new w0((Object) this, (byte) 21), (byte) 20));
        j0g0Var = ((Number) a().c()).intValue() == 0 ? j0g0Var2 : j0g0Var;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            obj = (m3o) (obj2 instanceof g0g0 ? null : obj2);
        }
        this.r = maz.b(new yw9(obj, new yhn((Object) this, (byte) 9), (byte) 20));
    }

    public final fee a() {
        return (fee) this.g.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        e4o e4oVar;
        l0l0 l0l0Var;
        g2v g2vVar;
        Object g0g0Var;
        mdm mdmVarB;
        n0o0 n0o0Var = this.r;
        y3o y3oVar = (y3o) obj;
        y3oVar.getClass();
        boolean z = y3oVar.g;
        fee feeVar = (fee) this.f.getValue();
        feeVar.getClass();
        pz40 pz40VarA = feeVar.a();
        ((Boolean) feeVar.a().getValue()).getClass();
        pz40VarA.setValue(Boolean.valueOf(y3oVar.o));
        fee feeVar2 = (fee) this.h.getValue();
        feeVar2.getClass();
        pz40 pz40VarA2 = feeVar2.a();
        ((Boolean) feeVar2.a().getValue()).getClass();
        pz40VarA2.setValue(Boolean.valueOf(y3oVar.h));
        fee feeVar3 = (fee) this.j.getValue();
        feeVar3.getClass();
        pz40 pz40VarA3 = feeVar3.a();
        ((ygq0) feeVar3.a().getValue()).getClass();
        pz40VarA3.setValue(y3oVar.i);
        fee feeVar4 = (fee) this.k.getValue();
        feeVar4.getClass();
        pz40 pz40VarA4 = feeVar4.a();
        ((Boolean) feeVar4.a().getValue()).getClass();
        pz40VarA4.setValue(Boolean.valueOf(y3oVar.m));
        fee feeVar5 = (fee) this.m.getValue();
        feeVar5.getClass();
        pz40 pz40VarA5 = feeVar5.a();
        j0g0 j0g0Var = y3oVar.b;
        pz40VarA5.setValue(j0g0Var);
        fee feeVar6 = (fee) this.n.getValue();
        feeVar6.getClass();
        pz40 pz40VarA6 = feeVar6.a();
        j0g0 j0g0Var2 = y3oVar.c;
        pz40VarA6.setValue(j0g0Var2);
        fee feeVar7 = (fee) this.o.getValue();
        feeVar7.getClass();
        pz40 pz40VarA7 = feeVar7.a();
        ((Boolean) feeVar7.a().getValue()).getClass();
        pz40VarA7.setValue(Boolean.valueOf(y3oVar.n));
        fee feeVar8 = (fee) this.l.getValue();
        feeVar8.getClass();
        pz40 pz40VarA8 = feeVar8.a();
        ((String) feeVar8.a().getValue()).getClass();
        pz40VarA8.setValue(y3oVar.j);
        fee feeVarA = a();
        feeVarA.getClass();
        pz40 pz40VarA9 = feeVarA.a();
        ((Integer) feeVarA.a().getValue()).getClass();
        pz40VarA9.setValue(Integer.valueOf(y3oVar.e));
        zbk zbkVar = ((fee) this.p.getValue()).e;
        l2o l2oVar = (l2o) ((fee) this.q.getValue()).b();
        boolean z2 = y3oVar.p;
        EsportsGamesScreenParams esportsGamesScreenParams = this.f1968a.f41962a;
        Pair pairC = org.xplatform.cyber.section.api.domain.entity.d.c(this.e, org.xplatform.cyber.section.api.domain.entity.d.d(esportsGamesScreenParams.getD()));
        Object obj2 = pairC.b;
        Object obj3 = pairC.f46059a;
        boolean z3 = ((Number) a().c()).intValue() == 0;
        if (z3) {
            j0g0Var2 = j0g0Var;
        }
        Object obj4 = null;
        if (j0g0Var2 != null) {
            Object e4oVar2 = j0g0Var2.f15681a;
            boolean z4 = e4oVar2 instanceof g0g0;
            g2v g2vVar2 = this.b;
            if (z4) {
                g2vVar = g2vVar2;
            } else {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    m3o m3oVar = (m3o) e4oVar2;
                    try {
                        if (m3oVar.f21125a.isEmpty()) {
                            long jLongValue = ((Number) obj3).longValue();
                            long jLongValue2 = ((Number) obj2).longValue();
                            if (m3oVar.c.length() > 0) {
                                g2vVar = g2vVar2;
                                mdmVarB = g2v.b(g2vVar, ozb.N(jLongValue, jLongValue2), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
                            } else {
                                g2vVar = g2vVar2;
                                mdmVarB = g2v.b(g2vVar, ozb.N(jLongValue, jLongValue2), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                            }
                            g0g0Var = new e4o(new o3o(jLongValue2, mdmVarB), z);
                        } else {
                            g2vVar = g2vVar2;
                            fee feeVar9 = (fee) n0o0Var.getValue();
                            feeVar9.getClass();
                            pz40 pz40VarA10 = feeVar9.a();
                            if (j0g0Var != null) {
                                Object obj5 = j0g0Var.f15681a;
                                if (!(obj5 instanceof g0g0)) {
                                    obj4 = obj5;
                                }
                                obj4 = (m3o) obj4;
                            }
                            pz40VarA10.setValue(obj4);
                            CyberGamesPage cyberGamesPageD = org.xplatform.cyber.section.api.domain.entity.d.d(esportsGamesScreenParams.getD());
                            a4x a4xVar = (a4x) ((fee) n0o0Var.getValue()).b();
                            a4xVar.getClass();
                            g0g0Var = new e4o(new n3o(z3, z2, false, cyberGamesPageD), a4xVar, z);
                        }
                    } catch (Throwable th) {
                        th = th;
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    g2vVar = g2vVar2;
                }
                e4oVar2 = g0g0Var;
            }
            if (j0g0.a(e4oVar2) != null) {
                long jLongValue3 = ((Number) obj3).longValue();
                long jLongValue4 = ((Number) obj2).longValue();
                e4oVar2 = new e4o(new o3o(jLongValue4, g2v.b(g2vVar, ozb.N(jLongValue3, jLongValue4), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)), z);
            }
            e4oVar = (e4o) e4oVar2;
        } else {
            CyberGamesPage cyberGamesPageD2 = org.xplatform.cyber.section.api.domain.entity.d.d(esportsGamesScreenParams.getD());
            v5l0 v5l0Var = y3oVar.f.g.y;
            n3o n3oVar = new n3o(z3, z2, true, cyberGamesPageD2);
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
            ArrayList arrayList = new ArrayList(12);
            for (int i = 0; i < 12; i++) {
                arrayList.add(new x56(l0l0Var));
            }
            e4oVar = new e4o(n3oVar, dyb.o0(arrayList), false);
        }
        return new z3o(zbkVar, l2oVar, e4oVar);
    }
}
