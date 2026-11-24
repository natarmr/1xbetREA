package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class lrd0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public final fhj A;
    public bby B;
    public c4m0 C;
    public bby D;
    public final String o;
    public final long p;
    public final f4u q;
    public final mne r;
    public final peg0 s;
    public final m1e t;
    public final i1w0 u;
    public final ctf0 v;
    public final cge0 w;
    public final s9m0 x;
    public final tqt y;
    public final jwu z;

    public lrd0(String str, long j, f4u f4uVar, mne mneVar, peg0 peg0Var, m1e m1eVar, i1w0 i1w0Var, ocl oclVar, ctf0 ctf0Var, cge0 cge0Var, s9m0 s9m0Var, tqt tqtVar, jwu jwuVar, f7u f7uVar, weu weuVar, qzt qztVar, fhj fhjVar, uyu uyuVar, wyu wyuVar, r9u r9uVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        xvo xvoVar = new xvo(weuVar, str, qztVar, ctf0Var, fhjVar, j, wyuVar, (byte) 5);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 10);
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(null, xvoVar, xuhVar, g090VarP, null);
        this.o = str;
        this.p = j;
        this.q = f4uVar;
        this.r = mneVar;
        this.s = peg0Var;
        this.t = m1eVar;
        this.u = i1w0Var;
        this.v = ctf0Var;
        this.w = cge0Var;
        this.x = s9m0Var;
        this.y = tqtVar;
        this.z = jwuVar;
        this.A = fhjVar;
        M(false);
        sac.T(new fnq(uyuVar.f36509a.h(), new s9c0(this, yjeVar, (byte) 18), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), jrd0.h);
        sac.T(new fnq(f7uVar.n(str), new qkb0((Object) this, (Object) qztVar.a(), yjeVar, (byte) 1), (byte) 4), jiu0.a(this), ird0.h);
    }

    public final void M(boolean z) {
        bby bbyVar = this.D;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.D = sac.V(jiu0.a(this), new erd0(this, (byte) 3), null, this.r.b, new a220(z, (Object) this, (yje) null, (byte) 17), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        vqd0 vqd0Var = (vqd0) obj;
        vqd0Var.getClass();
        boolean zEquals = vqd0Var.equals(qqd0.f29162a);
        byte b = 0;
        i1w0 i1w0Var = this.u;
        if (!zEquals) {
            byte b2 = 1;
            if (vqd0Var.equals(sqd0.f32625a)) {
                M(true);
                return;
            }
            yje yjeVar = null;
            if (vqd0Var.equals(tqd0.f34377a)) {
                c4m0 c4m0Var = this.C;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.C = sac.T(new fnq(this.t.b(), new frd0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.r.b), grd0.h);
                    return;
                }
                return;
            }
            if (vqd0Var instanceof rqd0) {
                xsd0 xsd0Var = ((rqd0) vqd0Var).f30927a;
                if (xsd0Var instanceof vsd0) {
                    i1w0Var.d(new erd0(this, b));
                    return;
                }
                if (xsd0Var instanceof usd0) {
                    i1w0Var.d(new erd0(this, b2));
                    return;
                } else if (xsd0Var instanceof tsd0) {
                    i1w0Var.d(new erd0(this, (byte) 2));
                    return;
                } else {
                    if (xsd0Var instanceof wsd0) {
                        return;
                    }
                    t9f.b();
                    return;
                }
            }
            if (!vqd0Var.equals(uqd0.f36114a)) {
                t9f.b();
                return;
            }
            c4m0 c4m0Var2 = this.C;
            if (c4m0Var2 != null) {
                c4m0Var2.cancel(null);
            }
            bby bbyVar = this.B;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.D;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
                return;
            }
            return;
        }
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
