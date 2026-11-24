package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class s690 extends w46 {
    public final ra10 A;
    public bby B;
    public final String b;
    public final hse0 c;
    public final hru d;
    public final ort e;
    public final pmi f;
    public final b8u g;
    public final jh70 h;
    public final i1w0 i;
    public final m1e j;
    public final mne k;
    public final duj l;
    public final vqc m;
    public final j1q0 n;
    public final ntu o;
    public final n4u p;
    public final ctf0 q;
    public final grj r;
    public final wgu s;
    public final n0o0 t;
    public boolean u;
    public final p7m0 v;
    public final p7m0 w;
    public final ol60 x;
    public final ol60 y;
    public final ra10 z;

    public s690(hse0 hse0Var, hru hruVar, ort ortVar, pmi pmiVar, b8u b8uVar, jh70 jh70Var, i1w0 i1w0Var, sa10 sa10Var, m1e m1eVar, mne mneVar, duj dujVar, vqc vqcVar, j1q0 j1q0Var, ntu ntuVar, n4u n4uVar, ctf0 ctf0Var, grj grjVar, wgu wguVar, pru pruVar) {
        hse0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        j1q0Var.getClass();
        ctf0Var.getClass();
        wguVar.getClass();
        this.b = "/PaymentConsultant/office/payment/requests?set-base-url=v3-api&skip-lang-redirect=1";
        this.c = hse0Var;
        this.d = hruVar;
        this.e = ortVar;
        this.f = pmiVar;
        this.g = b8uVar;
        this.h = jh70Var;
        this.i = i1w0Var;
        this.j = m1eVar;
        this.k = mneVar;
        this.l = dujVar;
        this.m = vqcVar;
        this.n = j1q0Var;
        this.o = ntuVar;
        this.p = n4uVar;
        this.q = ctf0Var;
        this.r = grjVar;
        this.s = wguVar;
        this.t = maz.b(new b6u(pruVar, (byte) 27));
        this.v = q7m0.a(h690.f12520a);
        this.w = q7m0.a(z590.f43805a);
        this.x = new ol60(3);
        this.y = new ol60(3);
        pb10 pb10Var = pb10.g;
        this.z = sa10.b(sa10Var, pb10Var, R.string.page_not_found_error, 0, null, 28);
        this.A = sa10.b(sa10Var, pb10Var, R.string.data_retrieval_error, 0, null, 28);
    }

    public final void w() {
        i1w0 i1w0Var = this.i;
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

    public final void x(String str) {
        String strN = ohs0.n(this.o.a(), str);
        String strA = this.s.a();
        j690 j690Var = new j690(this.u);
        p7m0 p7m0Var = this.v;
        p7m0Var.getClass();
        p7m0Var.o(null, j690Var);
        sac.V(jiu0.a(this), new x590(this, (byte) 1), null, this.k.b, new wmq((Object) this, (Object) strN, false, (Object) strA, (yje) null, (byte) 15), 10);
    }

    public final void y() {
        yje yjeVar = null;
        sac.T(new dnq(new fnq(sac.L(6, ((sff0) this.t.getValue()).u1 * 1000, 0L), new m690(this, yjeVar, (byte) 2)), new gbv(this, yjeVar, (byte) 18), (byte) 0), jiu0.a(this), p690.h);
    }
}
