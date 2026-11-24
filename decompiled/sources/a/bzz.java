package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class bzz extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final aiu o;
    public final sqi0 p;
    public final i1w0 q;
    public final mne r;
    public final duj s;
    public final c4m0 t;
    public bby u;
    public bby v;

    public bzz(pru pruVar, sa10 sa10Var, aiu aiuVar, sqi0 sqi0Var, i1w0 i1w0Var, m1e m1eVar, ctf0 ctf0Var, mne mneVar, duj dujVar) {
        aiuVar.getClass();
        sqi0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        b6u b6uVar = new b6u(pruVar, (byte) 17);
        ytz ytzVar = new ytz(ctf0Var, sa10Var, (byte) 2);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, b6uVar, ytzVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = aiuVar;
        this.p = sqi0Var;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = dujVar;
        c4m0 c4m0Var = this.t;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.t = sac.T(new fnq(m1eVar.b(), new zyz(this, null, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), azz.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object M(zje zjeVar) {
        yyz yyzVar;
        if (zjeVar instanceof yyz) {
            yyzVar = (yyz) zjeVar;
            int i = yyzVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yyzVar.k = i - Integer.MIN_VALUE;
            } else {
                yyzVar = new yyz(this, zjeVar);
            }
        } else {
            yyzVar = new yyz(this, zjeVar);
        }
        yyz yyzVar2 = yyzVar;
        Object objA = yyzVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = yyzVar2.k;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objA);
            boolean z = ((ryz) D()).f;
            boolean z2 = ((ryz) D()).g;
            boolean z3 = ((ryz) D()).h;
            yyzVar2.k = 1;
            objA = this.o.a(true, z, z2, z3, yyzVar2);
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
        Iterable iterable = (List) ((izz) objA).b.get(LimitKenyaGroupEnum.c);
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        for (Object obj2 : iterable) {
            if (((qiq0) obj2).b == liq0.f20118a) {
                obj = obj2;
                break;
            }
        }
        qiq0 qiq0Var = (qiq0) obj;
        if (qiq0Var == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(qiq0Var.i != nrz.b);
    }

    public final void N() {
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = tvk.f34603a;
            byte b = 0;
            this.u = sac.V(bvcVarA, new wyz(this, (byte) 1), new xyz(this, b), dvj.c, new zyz(this, null, b), 8);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        mxz mxzVar = (mxz) obj;
        mxzVar.getClass();
        super.x(mxzVar);
        if (!mxzVar.equals(exz.f8601a)) {
            if (mxzVar.equals(ixz.f15564a)) {
                N();
                return;
            }
            if (mxzVar.equals(hxz.f13836a)) {
                N();
                return;
            }
            if (mxzVar.equals(dxz.f6869a)) {
                E();
                return;
            }
            byte b = 2;
            yje yjeVar = null;
            if (mxzVar.equals(jxz.f17334a)) {
                sac.V(jiu0.a(this), new wyz(this, (byte) 3), new xyz(this, b), this.r.b, new zyz(this, yjeVar, b), 8);
                return;
            }
            byte b2 = 1;
            if (mxzVar.equals(fxz.f10335a)) {
                bby bbyVar = this.v;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.v = sac.V(jiu0.a(this), new wyz(this, (byte) 0), null, null, new defpackage.e(this, yjeVar, (byte) 4), 14);
                    return;
                }
                return;
            }
            boolean z = mxzVar instanceof kxz;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z) {
                String str = ((kxz) mxzVar).f19083a;
                rn40 rn40Var = ((ryz) D()).i;
                if (rn40Var != null) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value3, ryz.a((ryz) value3, null, null, 0, false, false, null, str, 1023)));
                    Collection collection = (List) ((ryz) D()).f31334a.get(rn40Var.f30770a);
                    if (collection == null) {
                        collection = iun.f15405a;
                    }
                    if (collection == null || !collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            if (((rn40) it.next()).h == nrz.b) {
                                G(nyz.f24351a);
                                return;
                            }
                        }
                    }
                    G(oyz.f26081a);
                    return;
                }
                return;
            }
            if (mxzVar instanceof lxz) {
                int i = ((lxz) mxzVar).f20839a;
                if (((ryz) D()).d) {
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, ryz.a((ryz) value2, null, null, i, false, false, null, null, 2043)));
                return;
            }
            if (!(mxzVar instanceof gxz)) {
                t9f.b();
                return;
            }
            vrz vrzVar = ((gxz) mxzVar).f12101a;
            bby bbyVar2 = this.u;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, ryz.a((ryz) value, null, null, 0, true, false, null, null, 2039)));
                this.u = sac.V(jiu0.a(this), new wyz(this, (byte) 2), new xyz(this, b2), null, new juy((Object) this, (Object) vrzVar, yjeVar, (byte) 9), 12);
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.q;
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
    }
}
