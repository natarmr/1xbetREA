package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vq10 extends w46 {
    public c4m0 A;
    public final r7v b;
    public final o24 c;
    public final o24 d;
    public final qgd e;
    public final vd1 f;
    public final m1e g;
    public final g2v h;
    public final cyh i;
    public final dq00 j;
    public final z4w0 k;
    public final ort l;
    public final mne m;
    public final duj n;
    public final ctf0 o;
    public final rou p;
    public final i1w0 q;
    public final sek r;
    public final mi70 s;
    public final ik4 t;
    public final rpt u;
    public final p7m0 v;
    public final qoj0 w;
    public List x;
    public bby y;
    public c4m0 z;

    public vq10(r7v r7vVar, o24 o24Var, o24 o24Var2, qgd qgdVar, vd1 vd1Var, m1e m1eVar, g2v g2vVar, cyh cyhVar, dq00 dq00Var, z4w0 z4w0Var, ort ortVar, mne mneVar, duj dujVar, ctf0 ctf0Var, rou rouVar, i1w0 i1w0Var, sek sekVar, mi70 mi70Var, ik4 ik4Var, rpt rptVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        i1w0Var.getClass();
        this.b = r7vVar;
        this.c = o24Var;
        this.d = o24Var2;
        this.e = qgdVar;
        this.f = vd1Var;
        this.g = m1eVar;
        this.h = g2vVar;
        this.i = cyhVar;
        this.j = dq00Var;
        this.k = z4w0Var;
        this.l = ortVar;
        this.m = mneVar;
        this.n = dujVar;
        this.o = ctf0Var;
        this.p = rouVar;
        this.q = i1w0Var;
        this.r = sekVar;
        this.s = mi70Var;
        this.t = ik4Var;
        this.u = rptVar;
        this.v = q7m0.a(iq10.f15187a);
        this.w = ckb.F();
        this.x = iun.f15405a;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x025d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0401, code lost:
    
        if (a.qjj.d0(r5, r6, r2) == r3) goto L263;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [a.yje] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r32, a.zje r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vq10.w(boolean, a.zje):java.lang.Object");
    }

    public final void x(boolean z) {
        bby bbyVar = this.y;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.y = sac.V(jiu0.a(this), new aq10(this, b), null, this.m.b, new u88((Object) this, z, (yje) null, (byte) 29), 10);
        }
    }

    public final void y() {
        kq10 kq10Var = (kq10) this.v.getValue();
        if ((kq10Var instanceof jq10) && ((jq10) kq10Var).b) {
            sac.V(jiu0.a(this), new pf10(1, this, vq10.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, this.m.f22085a, new qq10(this, null, (byte) 1), 10);
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
