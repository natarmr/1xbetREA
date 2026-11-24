package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ygc extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final noc o;
    public final wgu p;
    public final f4u q;
    public final nv20 r;
    public final mne s;
    public final iqt t;
    public final ctf0 u;
    public bby v;

    public ygc(noc nocVar, wgu wguVar, f4u f4uVar, nv20 nv20Var, mne mneVar, iqt iqtVar, ctf0 ctf0Var, vzg0 vzg0Var) {
        wguVar.getClass();
        ctf0Var.getClass();
        zxb zxbVar = new zxb((byte) 13);
        e6c e6cVar = new e6c((byte) 9);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, zxbVar, e6cVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = nocVar;
        this.p = wguVar;
        this.q = f4uVar;
        this.r = nv20Var;
        this.s = mneVar;
        this.t = iqtVar;
        this.u = ctf0Var;
        sac.V(jiu0.a(this), lgc.f20001a, null, rwjVar, new vxb((Object) this, (yje) null, (byte) 12), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        yje yjeVar;
        Object next;
        nfc nfcVar = (nfc) obj;
        nfcVar.getClass();
        if (!(nfcVar instanceof lfc)) {
            if (!(nfcVar instanceof mfc)) {
                if (nfcVar instanceof kfc) {
                    E();
                    return;
                }
                return;
            } else {
                String str = ((mfc) nfcVar).f21688a;
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, egc.a((egc) value, null, null, str, null, null, 27)));
                return;
            }
        }
        int i = ((lfc) nfcVar).f19947a;
        Iterator<E> it = ((egc) D()).d.iterator();
        do {
            yjeVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((muy) next).e != i);
        muy muyVar = (muy) next;
        if (muyVar != null) {
            String str2 = muyVar.c;
            if (str2.equals(((egc) D()).e)) {
                return;
            }
            vff0 vff0Var = this.o.f23861a;
            vff0Var.getClass();
            vff0Var.c.g("ISO_CODE_TO_CHANGE", str2);
            if (!this.t.f15225a.a()) {
                G(cgc.f4304a);
                return;
            }
            bby bbyVar = this.v;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.v = sac.V(jiu0.a(this), wgc.f39108a, new h8a(this, (byte) 15), this.s.c, new jtb(this, muyVar, yjeVar, (byte) 8), 8);
            }
        }
    }
}
