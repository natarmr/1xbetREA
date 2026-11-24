package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wfs0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final String o;
    public final String p;
    public final mne q;
    public final b8u r;
    public final z7u s;
    public final nrt t;
    public final hnu u;
    public final m1e v;
    public final duj w;
    public final i1w0 x;
    public c4m0 y;
    public bby z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfs0(vzg0 vzg0Var, String str, String str2, mne mneVar, ctf0 ctf0Var, ocl oclVar, ryu ryuVar, b8u b8uVar, z7u z7uVar, nrt nrtVar, hnu hnuVar, luu luuVar, m1e m1eVar, duj dujVar, i1w0 i1w0Var) {
        super(vzg0Var, new m8s0(ryuVar, str, luuVar, (byte) 1), cvm0.p(mneVar.c, mneVar.f22085a), new gpb0(ctf0Var, oclVar, (byte) 19));
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = str;
        this.p = str2;
        this.q = mneVar;
        this.r = b8uVar;
        this.s = z7uVar;
        this.t = nrtVar;
        this.u = hnuVar;
        this.v = m1eVar;
        this.w = dujVar;
        this.x = i1w0Var;
        sac.V(jiu0.a(this), new ofs0(this, (byte) 0), null, mneVar.f22085a, new kpb0(this, null, (byte) 25), 10);
    }

    public final void M() {
        sac.V(jiu0.a(this), new ofs0(this, (byte) 3), null, this.q.f22085a, new tfs0(this, null, (byte) 0), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        a5w a5wVar;
        kes0 kes0Var = (kes0) obj;
        kes0Var.getClass();
        super.x(kes0Var);
        boolean zEquals = kes0Var.equals(ies0.f14650a);
        byte b = 1;
        mne mneVar = this.q;
        yje yjeVar = null;
        if (zEquals) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, ifs0.a((ifs0) value, false, null, null, true, null, null, null, 495)));
            bby bbyVar = this.z;
            if ((bbyVar != null && bbyVar.isActive()) || ((a5wVar = ((ifs0) D()).c) != null && a5wVar.b() != i0w.b)) {
                sac.V(jiu0.a(this), new ofs0(this, b), null, mneVar.b, new tfs0(this, yjeVar, b), 10);
                return;
            }
            byte b2 = 2;
            this.z = sac.V(jiu0.a(this), null, null, mneVar.b, new tfs0(this, yjeVar, b2), 11);
            sac.V(jiu0.a(this), new ofs0(this, b2), null, mneVar.b, new wup0(this, yjeVar, (byte) 5), 10);
            return;
        }
        byte b3 = 0;
        if (!kes0Var.equals(fes0.f9420a)) {
            if (kes0Var.equals(ges0.f11171a)) {
                sac.V(jiu0.a(this), new ofs0(this, b3), null, mneVar.f22085a, new kpb0(this, yjeVar, (byte) 25), 10);
                M();
                return;
            } else if (kes0Var.equals(hes0.f12938a)) {
                v3c.N(this.y);
                return;
            } else if (!kes0Var.equals(jes0.f16391a)) {
                t9f.b();
                return;
            } else {
                v3c.N(this.y);
                this.y = sac.T(new fnq(i120.W(new dnq(this.v.b(), new jgb0((Object) this, yjeVar, (byte) 27), (byte) 1)), new tfs0(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), ufs0.h);
                return;
            }
        }
        i1w0 i1w0Var = this.x;
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
