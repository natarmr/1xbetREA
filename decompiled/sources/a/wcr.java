package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class wcr extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final String o;
    public final int p;
    public final i1w0 q;
    public final nvu r;
    public final ctf0 s;

    public wcr(String str, int i, i1w0 i1w0Var, yiu yiuVar, ocl oclVar, m1e m1eVar, mne mneVar, nvu nvuVar, ctf0 ctf0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        yip yipVar = new yip(yiuVar, (byte) 19);
        yar yarVar = new yar(oclVar, (byte) 1);
        rwj rwjVar = mneVar.f22085a;
        super(null, yipVar, yarVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = str;
        this.p = i;
        this.q = i1w0Var;
        this.r = nvuVar;
        this.s = ctf0Var;
        M();
        yje yjeVar = null;
        sac.T(new dnq(new fnq(m1eVar.a(), new hij(this, yjeVar, (byte) 29), (byte) 4), new lo3(3, yjeVar, (byte) 11), (byte) 1), d5c.S(jiu0.a(this), rwjVar), new f1e(2, yjeVar, (byte) 28));
    }

    public final void M() {
        Object value;
        boolean zC = cy7.c();
        s4v0 s4v0VarH = this.r.H(this.p, this.s.e.f14784a.getResources().getDisplayMetrics().widthPixels, this.o, zC);
        String strConcat = s4v0VarH.f31627a;
        if (!kotlin.text.c.x(strConcat, "http", false) && !kotlin.text.c.x(strConcat, "mailto", false) && !kotlin.text.c.x(strConcat, "tel", false)) {
            strConcat = "http://".concat(strConcat);
        }
        String str = strConcat;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, scr.a((scr) value, false, false, str, wp20.b(new Pair("HTTP_X_PROJECT_ID", String.valueOf(s4v0VarH.b))), 13)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        ncr ncrVar = (ncr) obj;
        ncrVar.getClass();
        if (!ncrVar.equals(jcr.f16291a)) {
            boolean zEquals = ncrVar.equals(lcr.f19813a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (zEquals) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, scr.a((scr) value3, false, false, null, null, 62)));
                return;
            }
            if (ncrVar.equals(kcr.f18074a)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, scr.a((scr) value2, false, true, null, null, 61)));
                return;
            }
            if (!ncrVar.equals(mcr.f21564a)) {
                t9f.b();
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, scr.a((scr) value, true, false, null, null, 62)));
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
