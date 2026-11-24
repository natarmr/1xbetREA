package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class jn90 extends i3t0 {
    public static final /* synthetic */ int s = 0;
    public final d1u o;
    public final ivn p;
    public final ljf0 q;
    public final o8f r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn90(mne mneVar, d1u d1uVar, ivn ivnVar, ljf0 ljf0Var, o8f o8fVar) {
        super(null, new wm90((byte) 1), new ev80((byte) 27), cvm0.p(mneVar.f22085a, mneVar.c), null);
        o8fVar.getClass();
        this.o = d1uVar;
        this.p = ivnVar;
        this.q = ljf0Var;
        this.r = o8fVar;
        i3t0.K(this, null, null, new hr(this, null, (byte) 23), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object next;
        Object value;
        bn90 bn90Var = (bn90) obj;
        bn90Var.getClass();
        super.x(bn90Var);
        long j = bn90Var.f2872a;
        Iterator it = ((gn90) D()).f11576a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((rvm0) next).f31177a != j);
        rvm0 rvm0Var = (rvm0) next;
        if (rvm0Var == null) {
            return;
        }
        ljf0 ljf0Var = this.q;
        ljf0Var.getClass();
        udn udnVar = ((vdn) ljf0Var.f20148a).f37240a;
        udnVar.getClass();
        p7m0 p7m0Var = udnVar.b;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, rvm0Var));
        G(fn90.f9824a);
    }
}
