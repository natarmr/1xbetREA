package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;
import org.xplatform.limits_ne.impl.presentation.LimitsNeScreens$ChoiceNewLimitNeFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class p100 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final biu o;
    public final tqi0 p;
    public final rti0 q;
    public final i1w0 r;
    public final mne s;
    public final duj t;
    public final rot u;
    public final msc v;
    public final lsc w;
    public final c4m0 x;
    public bby y;
    public bby z;

    public p100(pru pruVar, ocl oclVar, biu biuVar, tqi0 tqi0Var, rti0 rti0Var, i1w0 i1w0Var, m1e m1eVar, ctf0 ctf0Var, mne mneVar, duj dujVar, rot rotVar, msc mscVar, lsc lscVar) {
        biuVar.getClass();
        tqi0Var.getClass();
        rti0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        rotVar.getClass();
        mscVar.getClass();
        lscVar.getClass();
        b6u b6uVar = new b6u(pruVar, (byte) 18);
        cz czVar = new cz(ctf0Var, oclVar, (byte) 19);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, b6uVar, czVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = biuVar;
        this.p = tqi0Var;
        this.q = rti0Var;
        this.r = i1w0Var;
        this.s = mneVar;
        this.t = dujVar;
        this.u = rotVar;
        this.v = mscVar;
        this.w = lscVar;
        c4m0 c4m0Var = this.x;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.x = sac.T(new fnq(m1eVar.b(), new m100(this, null, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), n100.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object M(zje zjeVar) {
        l100 l100Var;
        if (zjeVar instanceof l100) {
            l100Var = (l100) zjeVar;
            int i = l100Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                l100Var.k = i - Integer.MIN_VALUE;
            } else {
                l100Var = new l100(this, zjeVar);
            }
        } else {
            l100Var = new l100(this, zjeVar);
        }
        l100 l100Var2 = l100Var;
        Object objA = l100Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = l100Var2.k;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objA);
            boolean z = ((e100) D()).f;
            boolean z2 = ((e100) D()).g;
            boolean z3 = ((e100) D()).h;
            boolean z4 = ((e100) D()).i;
            l100Var2.k = 1;
            objA = this.o.a(true, z, z2, z3, z4, l100Var2);
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
        Iterable iterable = (List) ((jzz) objA).b.get(LimitNeGroupEnum.SELF_EXCLUSION_LIMITS);
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        for (Object obj2 : iterable) {
            if (((riq0) obj2).b == g8i0.f10866a) {
                obj = obj2;
                break;
            }
        }
        riq0 riq0Var = (riq0) obj;
        if (riq0Var == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(riq0Var.d != orz.b);
    }

    public final void N() {
        bby bbyVar = this.y;
        if (bbyVar == null || !bbyVar.isActive()) {
            bvc bvcVarA = jiu0.a(this);
            rwj rwjVar = tvk.f34603a;
            this.y = sac.V(bvcVarA, new j100(this, (byte) 3), null, dvj.c, new m100(this, null, (byte) 0), 10);
        }
    }

    public final void O() {
        LimitNeGroupEnum limitNeGroupEnum;
        Object value;
        bby bbyVar = this.z;
        if ((bbyVar == null || !bbyVar.isActive()) && (limitNeGroupEnum = ((e100) D()).l) != null) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, e100.a((e100) value, null, null, 0, true, false, null, null, null, 4087)));
            this.z = sac.V(jiu0.a(this), new j100(this, (byte) 2), null, null, new o100(this, limitNeGroupEnum, null, (byte) 0), 14);
        }
    }

    @Override // a.diu0
    public final void v() {
        ((ConcurrentHashMap) this.v.f22311a.b.b).clear();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        bby bbyVar;
        LimitNeGroupEnum limitNeGroupEnum;
        Object value3;
        yzz yzzVar = (yzz) obj;
        yzzVar.getClass();
        super.x(yzzVar);
        boolean zEquals = yzzVar.equals(qzz.f29600a);
        i1w0 i1w0Var = this.r;
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
            if (yzzVar.equals(uzz.f36557a)) {
                N();
                return;
            }
            if (yzzVar.equals(tzz.f34827a)) {
                N();
                return;
            }
            if (yzzVar.equals(ozz.f26121a)) {
                E();
                return;
            }
            byte b = 2;
            yje yjeVar = null;
            if (yzzVar.equals(wzz.f40041a)) {
                sac.V(jiu0.a(this), new j100(this, (byte) 0), new rcz(this, (byte) 14), this.s.b, new m100(this, yjeVar, b), 8);
                return;
            }
            boolean zEquals2 = yzzVar.equals(rzz.f31385a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (zEquals2) {
                LimitNeGroupEnum limitNeGroupEnum2 = ((e100) D()).l;
                int i = limitNeGroupEnum2 == null ? -1 : k100.f17495a[limitNeGroupEnum2.ordinal()];
                byte b2 = 1;
                if (i == 1 || i == 2) {
                    O();
                } else if (i == 3 && (((bbyVar = this.z) == null || !bbyVar.isActive()) && (limitNeGroupEnum = ((e100) D()).l) != null)) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value3, e100.a((e100) value3, null, null, 0, true, false, null, null, null, 4087)));
                    this.z = sac.V(jiu0.a(this), new j100(this, (byte) 1), null, null, new o100(this, limitNeGroupEnum, yjeVar, b2), 14);
                }
                if (((e100) D()).l != LimitNeGroupEnum.SESSION_TIME_LIMITS) {
                    O();
                    return;
                }
                return;
            }
            if (yzzVar instanceof xzz) {
                int i2 = ((xzz) yzzVar).f41776a;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, e100.a((e100) value2, null, null, i2, false, false, null, null, null, 4091)));
                return;
            }
            if (yzzVar instanceof szz) {
                wrz wrzVar = ((szz) yzzVar).f33091a;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                FragmentScreen limitsNeScreens$ChoiceNewLimitNeFragmentScreen = new LimitsNeScreens$ChoiceNewLimitNeFragmentScreen(wrzVar.getId());
                if (limitsNeScreens$ChoiceNewLimitNeFragmentScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) limitsNeScreens$ChoiceNewLimitNeFragmentScreen)));
                } else {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(limitsNeScreens$ChoiceNewLimitNeFragmentScreen)));
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
            } else {
                if (yzzVar.equals(vzz.f38321a)) {
                    Map mapN = xp20.n((ConcurrentHashMap) this.u.f30855a.b.b);
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value = p7m0Var3.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value, e100.a((e100) value, null, null, 0, false, false, null, mapN, null, 3071)));
                    return;
                }
                if (!(yzzVar instanceof pzz)) {
                    t9f.b();
                    return;
                }
                LimitNeGroupEnum limitNeGroupEnum3 = ((pzz) yzzVar).f27867a;
                p7m0 p7m0Var4 = ocjVar.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                    LimitNeGroupEnum limitNeGroupEnum4 = limitNeGroupEnum3;
                    if (p7m0Var4.m(value4, e100.a((e100) value4, null, null, 0, false, false, null, null, limitNeGroupEnum4, 2047))) {
                        G(b100.f1785a);
                        return;
                    }
                    limitNeGroupEnum3 = limitNeGroupEnum4;
                }
            }
        }
    }
}
