package a;

import org.xplatform.cyber.section.api.meta_heroes.presentation.MetaHeroesParams;
import org.xplatform.cyber.section.impl.meta_heroes.presentation.dialog.MetaHeroesRoleModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final class bd40 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final i1w0 o;
    public final MetaHeroesParams p;
    public final m1e q;
    public final cyu r;
    public final hzg s;
    public final qv2 t;
    public final p4u u;
    public c4m0 v;
    public bby w;

    public bd40(i1w0 i1w0Var, MetaHeroesParams metaHeroesParams, mne mneVar, m1e m1eVar, cyu cyuVar, g2v g2vVar, ctf0 ctf0Var, hzg hzgVar, qv2 qv2Var, p4u p4uVar, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        bz bzVar = new bz(r9uVar, (byte) 1);
        rwj rwjVar = mneVar.f22085a;
        super(bzVar, cvm0.p(rwjVar, rwjVar), new o20(g2vVar, ctf0Var, (byte) 14), (yzn0) null);
        this.o = i1w0Var;
        this.p = metaHeroesParams;
        this.q = m1eVar;
        this.r = cyuVar;
        this.s = hzgVar;
        this.t = qv2Var;
        this.u = p4uVar;
    }

    public final void M() {
        e3c.n(this.v);
        this.v = i3t0.L(this, new fnq(this.q.b(), new w620((Object) this, (yje) null, (byte) 12), (byte) 4), null, null, 3);
    }

    public final void N(xb40 xb40Var) {
        bby bbyVar = this.w;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.w = i3t0.K(this, null, null, new ffd(this, xb40Var, null, (byte) 28), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        bb40 bb40Var = (bb40) obj;
        bb40Var.getClass();
        super.x(bb40Var);
        if (!(bb40Var instanceof ab40)) {
            if (bb40Var instanceof ua40) {
                ua40 ua40Var = (ua40) bb40Var;
                if (ua40Var.equals(ra40.f30116a)) {
                    E();
                    return;
                }
                if (ua40Var.equals(sa40.f31875a)) {
                    c4m0 c4m0Var = this.v;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    bby bbyVar = this.w;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                        return;
                    }
                    return;
                }
                if (!ua40Var.equals(ta40.f33597a)) {
                    t9f.b();
                    return;
                }
                M();
                if (((yc40) D()).f42368a != xb40.f40583a) {
                    N(((yc40) D()).f42368a);
                    return;
                }
                return;
            }
            return;
        }
        ab40 ab40Var = (ab40) bb40Var;
        if (ab40Var.equals(va40.f37068a)) {
            ((uzg) this.s).a();
            return;
        }
        if (ab40Var instanceof wa40) {
            if (((wa40) ab40Var).f38811a == 1) {
                G(new pc40(new MetaHeroesRoleModelParams(((yc40) D()).f42368a, ((yc40) D()).b)));
                return;
            }
            return;
        }
        if (ab40Var instanceof za40) {
            xb40 xb40Var = ((za40) ab40Var).f44052a;
            if (((yc40) D()).f42368a != xb40Var) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, yc40.a((yc40) value, xb40Var, null, null, false, 62)));
                N(xb40Var);
                return;
            }
            return;
        }
        if (ab40Var instanceof xa40) {
            this.o.d(new bw20((Object) this, ab40Var, (byte) 24));
        } else if (!ab40Var.equals(ya40.f42277a)) {
            t9f.b();
        } else {
            M();
            N(((yc40) D()).f42368a);
        }
    }
}
