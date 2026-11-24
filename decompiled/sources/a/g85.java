package a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class g85 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final f7u o;
    public final ctf0 p;
    public final vw3 q;
    public final pw70 r;
    public final xex s;
    public final zn00 t;
    public final ali u;
    public final oeg0 v;
    public final duj w;
    public final mne x;
    public c4m0 y;
    public fk80 z;

    public g85(f7u f7uVar, ctf0 ctf0Var, iqt iqtVar, m1e m1eVar, vw3 vw3Var, pw70 pw70Var, xex xexVar, zn00 zn00Var, ali aliVar, oeg0 oeg0Var, duj dujVar, mne mneVar, kc60 kc60Var, pru pruVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        pw70Var.getClass();
        oeg0Var.getClass();
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        g090 g090VarP = cvm0.p(vs10Var, dvjVar);
        gj4 gj4Var = new gj4(iqtVar, pruVar, (byte) 6);
        on onVar = new on(iqtVar, pruVar, ctf0Var);
        super(gj4Var, g090VarP, onVar, (yzn0) null);
        this.o = f7uVar;
        this.p = ctf0Var;
        this.q = vw3Var;
        this.r = pw70Var;
        this.s = xexVar;
        this.t = zn00Var;
        this.u = aliVar;
        this.v = oeg0Var;
        this.w = dujVar;
        this.x = mneVar;
        sac.T(new fnq(dtb.z(m1eVar.b(), 1), new qv3(this, null, (byte) 6), (byte) 4), d5c.S(jiu0.a(this), dvjVar), e85.h);
        sac.T(new fnq(kc60Var.a(), new c85(this, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), dvjVar), f85.h);
        x(d75.f5579a);
    }

    public final void M() {
        sac.T(new fnq(this.u.o(), new c85(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.x.b), d85.h);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void x(k75 k75Var) {
        k75Var.getClass();
        final byte b = 0;
        if (k75Var.equals(i75.f14275a)) {
            fk80 fk80Var = this.z;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (k75Var instanceof d75) {
            O();
            return;
        }
        if (k75Var instanceof j75) {
            O();
            return;
        }
        boolean z = k75Var instanceof g75;
        mne mneVar = this.x;
        if (z) {
            long j = ((g75) k75Var).f10798a;
            Iterator it = ((s75) D()).f31733a.c.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((mlr) it.next()).f22006a == j) {
                    break;
                } else {
                    i++;
                }
            }
            mlr mlrVar = (mlr) CollectionsKt.W(i, ((s75) D()).f31733a.c);
            if (mlrVar == null) {
                return;
            }
            I(mneVar.f22085a, new Function1(this) { // from class: a.a85
                public final /* synthetic */ g85 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b2 = b;
                    g85 g85Var = this.b;
                    Throwable th = (Throwable) obj;
                    switch (b2) {
                        case 0:
                            th.getClass();
                            g85Var.w.b(th, new o33((byte) 29));
                            break;
                        default:
                            th.getClass();
                            if (th instanceof jfp) {
                                ctf0 ctf0Var = g85Var.p;
                                g85Var.G(new p75(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                            } else {
                                g85Var.w.b(th, new fa2(g85Var, (byte) 15));
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, new za(this, mlrVar, null, (byte) 22));
            return;
        }
        if (k75Var instanceof f75) {
            f75 f75Var = (f75) k75Var;
            long j2 = f75Var.f9043a;
            final byte b2 = 1;
            sac.V(jiu0.a(this), new Function1(this) { // from class: a.a85
                public final /* synthetic */ g85 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    g85 g85Var = this.b;
                    Throwable th = (Throwable) obj;
                    switch (b3) {
                        case 0:
                            th.getClass();
                            g85Var.w.b(th, new o33((byte) 29));
                            break;
                        default:
                            th.getClass();
                            if (th instanceof jfp) {
                                ctf0 ctf0Var = g85Var.p;
                                g85Var.G(new p75(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                            } else {
                                g85Var.w.b(th, new fa2(g85Var, (byte) 15));
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, null, mneVar.b, new j33(this, f75Var.b, j2, (yje) null), 10);
            return;
        }
        if (!(k75Var instanceof e75)) {
            if (k75Var.equals(h75.f12561a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0VarC = this.v.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    public final void O() {
        Object value;
        yje yjeVar;
        byte b;
        if (((s75) D()).d) {
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            yjeVar = null;
            b = 15;
        } while (!p7m0Var.m(value, s75.a((s75) value, null, false, true, 15)));
        c4m0 c4m0Var = this.y;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        int i = this.q.f38129a;
        f7u f7uVar = this.o;
        boolean z = ((pru) f7uVar.e).a().b.N;
        qgd qgdVar = (qgd) f7uVar.b;
        String strA = ((ntu) f7uVar.d).a();
        boolean zA = ((j1q0) f7uVar.c).f15748a.a();
        strA.getClass();
        k06 k06Var = new k06(new x860(16, false), new xe1(qgdVar, z, i, zA, strA, null));
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.x;
        fk80 fk80Var = new fk80(k06Var, bvcVarA, mneVar.b);
        this.y = sac.T(new fnq(dtb.z(fk80Var.g, 1), new vp3(2, this, g85.class, "onPagingStateChange", "onPagingStateChange(Lorg/xplatform/aggregator/core/paging/presentation/PagingLoadState;)V", 4, (byte) 10), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new wa(this, yjeVar, b));
        this.z = fk80Var;
        M();
    }
}
