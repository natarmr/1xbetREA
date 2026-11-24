package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class euz extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final diu o;
    public final uqi0 p;
    public final i1w0 q;
    public final mne r;
    public final duj s;
    public final c4m0 t;
    public bby u;
    public bby v;

    public euz(pru pruVar, sa10 sa10Var, diu diuVar, uqi0 uqi0Var, i1w0 i1w0Var, m1e m1eVar, ctf0 ctf0Var, mne mneVar, duj dujVar) {
        diuVar.getClass();
        uqi0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        b6u b6uVar = new b6u(pruVar, (byte) 15);
        ytz ytzVar = new ytz(ctf0Var, sa10Var, (byte) 0);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, b6uVar, ytzVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = diuVar;
        this.p = uqi0Var;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = dujVar;
        c4m0 c4m0Var = this.t;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.t = sac.T(new fnq(m1eVar.b(), new cuz(this, null, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), duz.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(zje zjeVar) {
        buz buzVar;
        if (zjeVar instanceof buz) {
            buzVar = (buz) zjeVar;
            int i = buzVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                buzVar.k = i - Integer.MIN_VALUE;
            } else {
                buzVar = new buz(this, zjeVar);
            }
        } else {
            buzVar = new buz(this, zjeVar);
        }
        Object objA = buzVar.i;
        wne wneVar = wne.f39444a;
        int i2 = buzVar.k;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objA);
            boolean z = ((ttz) D()).f;
            boolean z2 = ((ttz) D()).g;
            boolean z3 = ((ttz) D()).h;
            buzVar.k = 1;
            objA = this.o.a(z, z2, z3, buzVar);
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
        Iterable iterable = (List) ((gzz) objA).b.get(LimitGroupEnum.c);
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        for (Object obj2 : iterable) {
            if (((oiq0) obj2).b == miq0.f21857a) {
                obj = obj2;
                break;
            }
        }
        oiq0 oiq0Var = (oiq0) obj;
        if (oiq0Var == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(oiq0Var.i != qrz.b);
    }

    public final void N() {
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = tvk.f34603a;
            byte b = 0;
            this.u = sac.V(bvcVarA, new ztz(this, (byte) 1), new auz(this, b), dvj.c, new cuz(this, null, b), 8);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        usz uszVar = (usz) obj;
        uszVar.getClass();
        super.x(uszVar);
        if (!uszVar.equals(ksz.f18837a)) {
            if (uszVar.equals(qsz.f29274a)) {
                N();
                return;
            }
            boolean zEquals = uszVar.equals(msz.f22346a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (zEquals) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, ttz.a((ttz) value3, null, null, 0, false, false, false, null, null, 1791)));
                return;
            }
            if (uszVar.equals(rsz.f31054a)) {
                if (((ttz) D()).j != null) {
                    G(qtz.f29323a);
                    return;
                }
                return;
            }
            if (uszVar.equals(psz.f27537a)) {
                N();
                return;
            }
            if (uszVar.equals(jsz.f17075a)) {
                E();
                return;
            }
            byte b = 2;
            yje yjeVar = null;
            if (uszVar.equals(ssz.f32749a)) {
                sac.V(jiu0.a(this), new ztz(this, (byte) 3), new auz(this, b), this.r.b, new cuz(this, yjeVar, b), 8);
                return;
            }
            byte b2 = 1;
            if (uszVar.equals(lsz.f20604a)) {
                bby bbyVar = this.v;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.v = sac.V(jiu0.a(this), new ztz(this, (byte) 0), null, null, new e3p(this, yjeVar, (byte) 13), 14);
                    return;
                }
                return;
            }
            if (uszVar instanceof nsz) {
                H(new hxk(((nsz) uszVar).f24072a, (byte) 25));
                return;
            }
            if (uszVar instanceof tsz) {
                int i = ((tsz) uszVar).f34485a;
                if (((ttz) D()).d) {
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, ttz.a((ttz) value2, null, null, i, false, false, false, null, null, 2043)));
                return;
            }
            if (!(uszVar instanceof osz)) {
                t9f.b();
                return;
            }
            trz trzVar = ((osz) uszVar).f25805a;
            bby bbyVar2 = this.u;
            if (bbyVar2 == null || !bbyVar2.isActive()) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, ttz.a((ttz) value, null, null, 0, true, false, false, null, null, 2039)));
                this.u = sac.V(jiu0.a(this), new ztz(this, (byte) 2), new auz(this, b2), null, new juy((Object) this, (Object) trzVar, yjeVar, (byte) 7), 12);
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
