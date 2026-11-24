package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.stage.api.domain.TypeStageId;
import org.xplatform.statistic.stage.impl.stagetable.presentation.main.screen.StageTableInfoScreen;
import org.xplatform.statistic.team.impl.team_statistic.presentation.screen.SingleTeamStatisticFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class umo0 extends i3t0 {
    public static final /* synthetic */ int I = 0;
    public final zrc A;
    public final y2m0 B;
    public final luu C;
    public final zrc D;
    public final e1u E;
    public final cu F;
    public bby G;
    public bby H;
    public final TypeStageId o;
    public final long p;
    public final long q;
    public final String r;
    public final ctf0 s;
    public final mne t;
    public final i1w0 u;
    public final m1e v;
    public final qzt w;
    public final fhj x;
    public final wyu y;
    public final ivn z;

    public umo0(final TypeStageId typeStageId, final long j, final long j2, final String str, final ctf0 ctf0Var, mne mneVar, i1w0 i1w0Var, ocl oclVar, m1e m1eVar, final weu weuVar, final qzt qztVar, final fhj fhjVar, uyu uyuVar, final wyu wyuVar, ivn ivnVar, zrc zrcVar, y2m0 y2m0Var, luu luuVar, zrc zrcVar2, e1u e1uVar, cu cuVar, r9u r9uVar) {
        ctf0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        Function0 function0 = new Function0() { // from class: a.qmo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypeStageId typeStageId2 = typeStageId;
                return new x2m0(true, false, null, iun.f15405a, aem0.x(weuVar.a(org.xplatform.statistic.stage.api.domain.c.a(typeStageId2)), qztVar.a(), ctf0Var), fhjVar.s(org.xplatform.statistic.stage.api.domain.c.a(typeStageId2), j, wyuVar.a(), j2), str);
            }
        };
        tla0 tla0Var = new tla0(ctf0Var, oclVar, r9uVar, (byte) 4);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, function0, tla0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = typeStageId;
        this.p = j;
        this.q = j2;
        this.r = str;
        this.s = ctf0Var;
        this.t = mneVar;
        this.u = i1w0Var;
        this.v = m1eVar;
        this.w = qztVar;
        this.x = fhjVar;
        this.y = wyuVar;
        this.z = ivnVar;
        this.A = zrcVar;
        this.B = y2m0Var;
        this.C = luuVar;
        this.D = zrcVar2;
        this.E = e1uVar;
        this.F = cuVar;
        M();
        N();
        sac.T(new fnq(uyuVar.f36509a.h(), new tmg0(this, null, (byte) 28), (byte) 4), d5c.S(jiu0.a(this), rwjVar), tmo0.h);
    }

    public final void M() {
        bby bbyVar = this.G;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.G = sac.V(jiu0.a(this), new tfo0(1, this, umo0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), new jfm0(this, (byte) 26), this.t.b, new gc1((Object) this, (yje) null, (byte) 24), 8);
        }
    }

    public final void N() {
        sac.T(new fnq(this.v.a(), new rmo0(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.t.f22085a), smo0.h);
    }

    @Override // a.diu0
    public final void v() {
        zrc zrcVar = this.A;
        zrcVar.getClass();
        TypeStageId typeStageId = this.o;
        typeStageId.getClass();
        q2m0 q2m0Var = zrcVar.f44846a;
        q2m0Var.getClass();
        l2m0 l2m0Var = q2m0Var.c;
        l2m0Var.getClass();
        l2m0Var.f19317a.remove(typeStageId);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        String str;
        e2m0 e2m0Var = (e2m0) obj;
        e2m0Var.getClass();
        if (e2m0Var instanceof z1m0) {
            M();
            return;
        }
        boolean zEquals = e2m0Var.equals(v1m0.f36640a);
        i1w0 i1w0Var = this.u;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (e2m0Var.equals(c2m0.f3632a)) {
                return;
            }
            if (e2m0Var.equals(d2m0.f5363a)) {
                N();
                return;
            }
            if (e2m0Var.equals(y1m0.f41863a)) {
                G(v2m0.f36692a);
                return;
            }
            boolean zEquals2 = e2m0Var.equals(b2m0.f1859a);
            TypeStageId typeStageId = this.o;
            if (zEquals2) {
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI.h(new StageTableInfoScreen(typeStageId));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (e2m0Var.equals(w1m0.f38409a)) {
                    G(u2m0.f34953a);
                    return;
                }
                if (!(e2m0Var instanceof a2m0)) {
                    if (e2m0Var.equals(x1m0.f40129a)) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                y8b y8bVar = ((a2m0) e2m0Var).f131a;
                i5s0 i5s0Var = y8bVar instanceof i5s0 ? (i5s0) y8bVar : null;
                if (i5s0Var == null) {
                    return;
                }
                TypeStageId.Champ champ = typeStageId instanceof TypeStageId.Champ ? (TypeStageId.Champ) typeStageId : null;
                int i = (champ == null || (str = champ.f47067a) == null) ? -1 : Integer.parseInt(str);
                String str2 = i5s0Var.g;
                int i2 = i5s0Var.i;
                this.B.getClass();
                str2.getClass();
                FragmentScreen singleTeamStatisticFragmentScreen = new SingleTeamStatisticFragmentScreen(str2, i, i2, this.p);
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                if (singleTeamStatisticFragmentScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) singleTeamStatisticFragmentScreen)));
                } else {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(singleTeamStatisticFragmentScreen)));
                }
                ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO2;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            }
        }
    }
}
