package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.player.impl.player.players_statistic_cricket.presentation.results.PlayersStatisticsCricketResultsScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class cma0 extends i3t0 {
    public static final /* synthetic */ int M = 0;
    public final mrc A;
    public final jwu B;
    public final wyu C;
    public final f7u D;
    public final fhj E;
    public final mne F;
    public final duj G;
    public final i1w0 H;
    public bby I;
    public bby J;
    public c4m0 K;
    public bby L;
    public final String o;
    public final long p;
    public final bwl q;
    public final t1u r;
    public final mrc s;
    public final v1u t;
    public final mrc u;
    public final fhj v;
    public final afm0 w;
    public final f7u x;
    public final v1u y;
    public final ouu z;

    public cma0(String str, long j, bwl bwlVar, t1u t1uVar, mrc mrcVar, v1u v1uVar, mrc mrcVar2, fhj fhjVar, afm0 afm0Var, f7u f7uVar, v1u v1uVar2, ouu ouuVar, mrc mrcVar3, jwu jwuVar, qzt qztVar, wyu wyuVar, f7u f7uVar2, weu weuVar, fhj fhjVar2, m1e m1eVar, uyu uyuVar, mne mneVar, duj dujVar, i1w0 i1w0Var, r9u r9uVar, ctf0 ctf0Var, ocl oclVar) {
        str.getClass();
        wyuVar.getClass();
        m1eVar.getClass();
        i1w0Var.getClass();
        r9uVar.getClass();
        ctf0Var.getClass();
        sla0 sla0Var = new sla0(qztVar, weuVar, str, fhjVar2, j, wyuVar, (byte) 0);
        byte b = 0;
        tla0 tla0Var = new tla0(oclVar, ctf0Var, r9uVar, b);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, sla0Var, tla0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = bwlVar;
        this.r = t1uVar;
        this.s = mrcVar;
        this.t = v1uVar;
        this.u = mrcVar2;
        this.v = fhjVar;
        this.w = afm0Var;
        this.x = f7uVar;
        this.y = v1uVar2;
        this.z = ouuVar;
        this.A = mrcVar3;
        this.B = jwuVar;
        this.C = wyuVar;
        this.D = f7uVar2;
        this.E = fhjVar2;
        this.F = mneVar;
        this.G = dujVar;
        this.H = i1w0Var;
        yje yjeVar = null;
        byte b2 = 2;
        sac.T(new fnq(uyuVar.f36509a.h(), new xla0(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), ama0.h);
        sac.T(new fnq(m1eVar.b(), new vla0(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new xla0(this, yjeVar, b));
        N();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.J;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, lla0.a((lla0) value, null, null, null, null, null, 0, null, false, false, true, false, 1023)));
            this.J = i3t0.K(this, null, new yi90(1, this, cma0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), new epp(this, null, (byte) 26), 1);
        }
    }

    public final void N() {
        c4m0 c4m0Var;
        bby bbyVar;
        bby bbyVar2 = this.I;
        byte b = 1;
        yje yjeVar = null;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.I) != null) {
            bbyVar.cancel(null);
        }
        boolean z = ((lla0) D()).j;
        mne mneVar = this.F;
        this.I = z ? sac.X(jiu0.a(this), 30L, mneVar.b, ula0.f35863a, new vla0(this, yjeVar, (byte) 0)) : sac.V(jiu0.a(this), wla0.f39345a, null, mneVar.b, new vla0(this, yjeVar, b), 10);
        c4m0 c4m0Var2 = this.K;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.K) != null) {
            c4m0Var.cancel(null);
        }
        this.K = sac.T(new fnq(this.D.n(this.o), new xla0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), zla0.h);
        M();
        sac.T(new fnq(new vsg0(new v6d(((eia0) this.y.f36649a.b).d, yjeVar, (byte) 3)), new yla0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), bma0.h);
    }

    @Override // a.diu0
    public final void v() {
        eia0 eia0Var = (eia0) this.A.f22263a.b;
        eia0Var.e = eia0Var.f7849a;
        eia0Var.b.clear();
        eia0Var.c.clear();
        eia0Var.f = "";
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        String str;
        Object value2;
        mka0 mka0Var = (mka0) obj;
        mka0Var.getClass();
        super.x(mka0Var);
        boolean z = mka0Var instanceof ika0;
        i1w0 i1w0Var = this.H;
        if (z) {
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
            boolean z2 = mka0Var instanceof lka0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            f7u f7uVar = this.x;
            fhj fhjVar = this.v;
            ouu ouuVar = this.z;
            if (z2) {
                ufp0 ufp0Var = (ufp0) CollectionsKt.W(((lka0) mka0Var).f20191a, ((lla0) D()).d);
                if (ufp0Var == null || (str = ufp0Var.f35586a) == null) {
                    return;
                }
                v1u v1uVar = this.t;
                v1uVar.getClass();
                eia0 eia0Var = (eia0) v1uVar.f36649a.b;
                eia0Var.getClass();
                eia0Var.f = str;
                lla0 lla0VarA = lla0.a((lla0) D(), null, null, null, this.s.b(), null, ((mrc) fhjVar.f9543a).a(((mrc) fhjVar.b).b()), f7uVar.q(), ouuVar.G(), false, false, false, 3631);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, lla0VarA));
                return;
            }
            if (mka0Var instanceof kka0) {
                aex aexVar = (aex) CollectionsKt.W((int) ((kka0) mka0Var).f18427a, ((lla0) D()).f);
                if (aexVar != null) {
                    int i = aexVar.f751a;
                    afm0 afm0Var = this.w;
                    roi0 roi0Var = (roi0) afm0Var.b;
                    String strB = ((mrc) afm0Var.c).b();
                    strB.getClass();
                    eia0 eia0Var2 = (eia0) ((gxu) roi0Var.f30839a).b;
                    eia0Var2.getClass();
                    eia0Var2.b.put(strB, Integer.valueOf(i));
                    lla0 lla0VarA2 = lla0.a((lla0) D(), null, null, null, null, null, ((mrc) fhjVar.f9543a).a(((mrc) fhjVar.b).b()), f7uVar.q(), ouuVar.G(), false, false, false, 3647);
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, lla0VarA2));
                    return;
                }
                return;
            }
            if (mka0Var instanceof hka0) {
                if (((hka0) mka0Var).f13198a == 1) {
                    G(ila0.f14967a);
                    return;
                } else {
                    G(jla0.f16707a);
                    return;
                }
            }
            if (mka0Var.equals(jka0.c)) {
                M();
                return;
            }
            if (!mka0Var.equals(jka0.b)) {
                if (mka0Var.equals(jka0.f16658a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen playersStatisticsCricketResultsScreen = new PlayersStatisticsCricketResultsScreen();
            if (playersStatisticsCricketResultsScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) playersStatisticsCricketResultsScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(playersStatisticsCricketResultsScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
