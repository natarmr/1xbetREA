package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cjk0 extends w46 {
    public final mne b;
    public final yk50 c;
    public final jru d;
    public final ag3 e;
    public final au0 f;
    public final i1w0 g;
    public final duj h;
    public final sa10 i;
    public final rpt j;
    public final v8d k;
    public final f3c0 l;
    public final p7m0 m;
    public final p7m0 n;

    public cjk0(mne mneVar, yk50 yk50Var, jru jruVar, ag3 ag3Var, au0 au0Var, i1w0 i1w0Var, duj dujVar, sa10 sa10Var, rpt rptVar, bzt bztVar, pru pruVar, m1e m1eVar) {
        m1eVar.getClass();
        this.b = mneVar;
        this.c = yk50Var;
        this.d = jruVar;
        this.e = ag3Var;
        this.f = au0Var;
        this.g = i1w0Var;
        this.h = dujVar;
        this.i = sa10Var;
        this.j = rptVar;
        this.k = bztVar.f3488a.a();
        this.l = pruVar.a().k;
        this.m = q7m0.a(new nik0(true));
        this.n = q7m0.a(wik0.f39218a);
        sac.V(jiu0.a(this), new vik0(this, (byte) 0), null, mneVar.f22085a, new kbh0(m1eVar, this, null, (byte) 19), 10);
    }

    public static ijk0 w(int i, List list) {
        boolean z = false;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((wtu) it.next()).f39760a == i) {
                    z = true;
                    break;
                }
            }
        }
        return new ijk0(z, i);
    }

    public final void x() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new nik0(true)));
        sac.V(jiu0.a(this), new vik0(this, (byte) 2), null, this.b.f22085a, new yng0(this, null, (byte) 20), 10);
    }
}
