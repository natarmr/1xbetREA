package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class f3j extends eiu0 implements bvs {
    public final /* synthetic */ byte c = 1;
    public final mne d;
    public final i1w0 e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;

    public f3j(rl1 rl1Var, iqt iqtVar, mne mneVar, ctf0 ctf0Var, q5j q5jVar, kd30 kd30Var, crt crtVar, rpt rptVar, oeg0 oeg0Var, peg0 peg0Var, b4j b4jVar, je jeVar, pru pruVar, kc60 kc60Var, pmi pmiVar) {
        Object i3jVar;
        gst0 gst0Var = iqtVar.f15225a;
        ctf0Var.getClass();
        oeg0Var.getClass();
        this.e = rl1Var;
        this.d = mneVar;
        this.f = ctf0Var;
        this.g = q5jVar;
        this.h = crtVar;
        this.i = rptVar;
        this.j = oeg0Var;
        this.k = peg0Var;
        this.l = b4jVar;
        this.m = jeVar;
        sff0 sff0VarA = pruVar.a();
        this.o = sff0VarA;
        vs10 vs10Var = mneVar.c;
        kin0 kin0VarE = qem0.e();
        vs10Var.getClass();
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(vs10Var, kin0VarE));
        this.p = sjeVarA;
        this.q = new cub(sjeVarA, i99.b);
        p6d p6dVar = new p6d(pmiVar.w(), kc60Var.a(), new wx4((Object) this, (yje) null, (byte) 4), (byte) 1);
        hl1 hl1Var = sff0VarA.b;
        if (hl1Var.z && gst0Var.a()) {
            i3jVar = k3j.f17621a;
        } else {
            d3j d3jVarU = ieb.U(hl1Var.z, hl1Var.A, gst0Var.a(), null, null, null);
            i3jVar = d3jVarU instanceof b3j ? j3j.f15836a : new i3j(d3jVarU);
        }
        this.r = vtb.h0(p6dVar, sjeVarA, kpj0.b, i3jVar);
    }

    @Override // a.bvs
    public void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        c8d c8dVar = new c8d(y7d.f42146a, p0w0.f26173a);
        i1w0 i1w0Var = this.e;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, c8dVar, i1w0Var, copyOnWriteArrayList, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    @Override // a.bvs
    public void g() {
        ((lhf0) this.n).P("game_menu");
        sac.V(jiu0.a(s()), rvs.f31186a, null, this.d.f22085a, new lvs(this, null, (byte) 3), 10);
    }

    @Override // a.bvs
    public void p() {
        ((lhf0) this.n).P("one_click");
        if (!((yk50) this.j).g()) {
            this.e.d(new g7p((Object) this, (byte) 26));
        } else {
            sac.V(jiu0.a(s()), tvs.f34616a, null, this.d.f22085a, new e3p(this, null, (byte) 3), 10);
        }
    }

    @Override // a.eiu0
    public void t() {
        switch (this.c) {
            case 0:
                d5c.G((sje) this.p, null);
                break;
        }
    }

    @Override // a.eiu0
    public void u(diu0 diu0Var, vzg0 vzg0Var) {
        switch (this.c) {
            case 1:
                vzg0Var.getClass();
                this.f7878a = diu0Var;
                this.b = vzg0Var;
                bvc bvcVarA = jiu0.a(diu0Var);
                mne mneVar = this.d;
                yje yjeVar = null;
                sac.V(bvcVarA, qvs.f29401a, null, mneVar.b, new wn2(this, yjeVar, (byte) 15), 10);
                byte b = 1;
                sac.T(new p6d(new fc4(((n9s) ((hnu) this.h).f13365a).a(), (byte) 28), ((s1u) this.p).a(), new wx4((Object) this, yjeVar, (byte) 13), b), jiu0.a(s()), pvs.h);
                sac.V(jiu0.a(s()), evs.f8487a, null, mneVar.c, new lvs(this, yjeVar, (byte) 0), 10);
                sac.V(jiu0.a(s()), ovs.f25939a, null, mneVar.f22085a, new lvs(this, yjeVar, (byte) 2), 10);
                sac.V(jiu0.a(s()), mvs.f22471a, null, mneVar.b, new lvs(this, yjeVar, b), 10);
                sac.T(new fnq(((reu) this.i).b(), new fvs(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(s()), mneVar.c), nvs.h);
                break;
            default:
                super.u(diu0Var, vzg0Var);
                break;
        }
    }

    public f3j(mne mneVar, i1w0 i1w0Var, jru jruVar, rbu rbuVar, hnu hnuVar, reu reuVar, yk50 yk50Var, vpu vpuVar, vpu vpuVar2, r1u r1uVar, lhf0 lhf0Var, lbu lbuVar, npn npnVar, s1u s1uVar) {
        this.d = mneVar;
        this.e = i1w0Var;
        this.f = jruVar;
        this.g = rbuVar;
        this.h = hnuVar;
        this.i = reuVar;
        this.j = yk50Var;
        this.k = vpuVar;
        this.l = vpuVar2;
        this.m = r1uVar;
        this.n = lhf0Var;
        this.o = npnVar;
        this.p = s1uVar;
        boolean z = !lbuVar.j();
        long j = npnVar.f23922a;
        this.q = q7m0.a(new yus(j, "", -1L, npnVar.b, npnVar.c, "", "", "", false, false, z, false, false, false, false, false, j, nx7.f24269a, false));
        this.r = q7m0.a(ny30.f24311a);
    }
}
