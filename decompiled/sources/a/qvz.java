package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.limits_ee.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class qvz extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final zhu o;
    public final i1w0 p;
    public final mne q;
    public final duj r;
    public final c4m0 s;
    public bby t;

    public qvz(pru pruVar, sa10 sa10Var, zhu zhuVar, i1w0 i1w0Var, m1e m1eVar, ctf0 ctf0Var, mne mneVar, duj dujVar) {
        zhuVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        b6u b6uVar = new b6u(pruVar, (byte) 16);
        byte b = 1;
        ytz ytzVar = new ytz(ctf0Var, sa10Var, b);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, b6uVar, ytzVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = zhuVar;
        this.p = i1w0Var;
        this.q = mneVar;
        this.r = dujVar;
        c4m0 c4m0Var = this.s;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.s = sac.T(new fnq(m1eVar.b(), new ovz(this, null, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), pvz.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(zje zjeVar) {
        nvz nvzVar;
        if (zjeVar instanceof nvz) {
            nvzVar = (nvz) zjeVar;
            int i = nvzVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvzVar.k = i - Integer.MIN_VALUE;
            } else {
                nvzVar = new nvz(this, zjeVar);
            }
        } else {
            nvzVar = new nvz(this, zjeVar);
        }
        Object objA = nvzVar.i;
        wne wneVar = wne.f39444a;
        int i2 = nvzVar.k;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objA);
            boolean z = ((gvz) D()).f;
            boolean z2 = ((gvz) D()).g;
            nvzVar.k = 1;
            objA = this.o.a(z, z2, nvzVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Iterable iterable = (List) ((hzz) objA).b.get(LimitGroupEnum.b);
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        for (Object obj2 : iterable) {
            if (((piq0) obj2).b == kiq0.f18349a) {
                obj = obj2;
                break;
            }
        }
        piq0 piq0Var = (piq0) obj;
        if (piq0Var == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(piq0Var.i != mrz.b);
    }

    public final void N() {
        bby bbyVar = this.t;
        if (bbyVar == null || !bbyVar.isActive()) {
            byte b = 0;
            this.t = sac.V(jiu0.a(this), new lvz(this, (byte) 0), new mvz(this, b), this.q.b, new ovz(this, null, b), 8);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        tuz tuzVar = (tuz) obj;
        tuzVar.getClass();
        super.x(tuzVar);
        if (tuzVar.equals(nuz.f24168a)) {
            i1w0 i1w0Var = this.p;
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
            if (tuzVar.equals(quz.f29364a)) {
                N();
                return;
            }
            if (tuzVar.equals(puz.f27639a)) {
                N();
                return;
            }
            if (tuzVar.equals(muz.f22434a)) {
                E();
                return;
            }
            boolean zEquals = tuzVar.equals(ruz.f31147a);
            byte b = 2;
            byte b2 = 1;
            yje yjeVar = null;
            mne mneVar = this.q;
            if (zEquals) {
                sac.V(jiu0.a(this), new lvz(this, (byte) 1), new mvz(this, b2), mneVar.b, new ovz(this, yjeVar, b), 8);
                return;
            }
            if (!(tuzVar instanceof suz)) {
                if (!(tuzVar instanceof ouz)) {
                    t9f.b();
                    return;
                }
                l810 l810Var = ((ouz) tuzVar).f25900a;
                bby bbyVar = this.t;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.t = sac.V(jiu0.a(this), new lvz(this, (byte) 2), new mvz(this, b), mneVar.b, new juy((Object) this, (Object) l810Var, yjeVar, (byte) 8), 8);
                    return;
                }
                return;
            }
            int i = ((suz) tuzVar).f32842a;
            p7m0 p7m0Var = this.i.f25029a;
            while (true) {
                Object value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                int i2 = i;
                if (p7m0Var.m(value, gvz.a((gvz) value, null, null, i, false, false, null, null, 507))) {
                    return;
                } else {
                    i = i2;
                }
            }
        }
    }
}
