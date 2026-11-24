package a;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.security.api.domain.models.SecretQuestionModel;

/* JADX INFO: loaded from: classes5.dex */
public final class qmh0 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final i1w0 o;
    public final rsu p;
    public final dpi0 q;
    public final rsu r;
    public final qu s;
    public final s64 t;
    public final m1e u;
    public final ctf0 v;
    public final duj w;
    public bby x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmh0(vzg0 vzg0Var, i1w0 i1w0Var, rsu rsuVar, dpi0 dpi0Var, rsu rsuVar2, qu quVar, s64 s64Var, m1e m1eVar, ctf0 ctf0Var, duj dujVar, mne mneVar, g2v g2vVar) {
        super(vzg0Var, new w0h0((byte) 26), new o20(ctf0Var, g2vVar, (byte) 24), cvm0.p(mneVar.f22085a, mneVar.b));
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = i1w0Var;
        this.p = rsuVar;
        this.q = dpi0Var;
        this.r = rsuVar2;
        this.s = quVar;
        this.t = s64Var;
        this.u = m1eVar;
        this.v = ctf0Var;
        this.w = dujVar;
    }

    public final void M() {
        Object value;
        oyg0 oyg0Var;
        Object next;
        String str;
        Object value2;
        ocj ocjVar = this.i;
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            oyg0Var = this.f;
            oyg0Var.getClass();
        } while (!p7m0Var.m(value, mmh0.a((mmh0) value, null, null, false, 0, null, null, null, false, null, 255)));
        boolean z = ((mmh0) D()).h;
        imh0 imh0Var = imh0.f15026a;
        if (!z) {
            G(imh0Var);
            return;
        }
        if (((mmh0) D()).d == 0) {
            str = ((mmh0) D()).e;
        } else {
            Iterator it = ((mmh0) D()).b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((SecretQuestionModel) next).f46923a != ((mmh0) D()).d);
            SecretQuestionModel secretQuestionModel = (SecretQuestionModel) next;
            if (secretQuestionModel == null || (str = secretQuestionModel.b) == null) {
                return;
            }
        }
        G(imh0Var);
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value2, mmh0.a((mmh0) value2, null, null, true, 0, null, null, null, false, null, 507)));
        i3t0.K(this, null, new omh0(this, (byte) 0), new gv60(this, str, null, (byte) 11), 1);
    }

    public final void N() {
        Object value;
        if (((mmh0) D()).b.isEmpty()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, mmh0.a((mmh0) value, jlh0.f16718a, null, false, 0, null, null, null, false, null, 510)));
        }
        i3t0.K(this, null, new omh0(this, (byte) 1), new pmh0(this, null, (byte) 0), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        ylh0 ylh0Var;
        Object value3;
        okh0 okh0Var = (okh0) obj;
        okh0Var.getClass();
        super.x(okh0Var);
        yje yjeVar = null;
        if (okh0Var.equals(dkh0.f6230a)) {
            bby bbyVar = this.x;
            byte b = 1;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.x = i3t0.K(this, null, new w0h0((byte) 27), new pmh0(this, yjeVar, b), 1);
                return;
            }
            return;
        }
        if (okh0Var.equals(ekh0.f7951a)) {
            e3c.n(this.x);
            return;
        }
        if (okh0Var.equals(ckh0.f4507a)) {
            E();
            return;
        }
        if (okh0Var.equals(bkh0.f2747a) || okh0Var.equals(fkh0.f9692a)) {
            i1w0 i1w0Var = this.o;
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
            if (okh0Var.equals(nkh0.f23681a)) {
                N();
                return;
            }
            if (okh0Var.equals(jkh0.f16668a)) {
                M();
                return;
            }
            boolean z = okh0Var instanceof ikh0;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            zlh0 zlh0Var = zlh0.f44581a;
            ylh0 ylh0Var2 = ylh0.f42842a;
            if (z) {
                amh0 amh0Var = ((ikh0) okh0Var).f14926a;
                if (amh0Var.equals(zlh0Var)) {
                    ylh0Var = ylh0Var2;
                } else {
                    if (!amh0Var.equals(ylh0Var2)) {
                        t9f.b();
                        return;
                    }
                    ylh0Var = null;
                }
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, mmh0.a((mmh0) value3, null, null, false, 0, null, null, null, false, ylh0Var, 255)));
                return;
            }
            if (okh0Var.equals(hkh0.f13209a)) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, mmh0.a((mmh0) value2, null, null, false, 0, null, null, null, false, null, 255)));
                if (((mmh0) D()).d != 0 ? ((mmh0) D()).f.length() <= 0 : ((mmh0) D()).e.length() <= 0 || ((mmh0) D()).f.length() <= 0) {
                    G(imh0.f15026a);
                    return;
                } else {
                    M();
                    return;
                }
            }
            if (okh0Var instanceof mkh0) {
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value, mmh0.a((mmh0) value, null, null, false, 0, null, null, null, false, ((mkh0) okh0Var).f21944a, 255)));
                return;
            }
            if (okh0Var instanceof gkh0) {
                G(new kmh0(((mmh0) D()).d));
                return;
            }
            if (!(okh0Var instanceof lkh0)) {
                if (okh0Var instanceof kkh0) {
                    H(new dke0((kkh0) okh0Var, (byte) 27));
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            lkh0 lkh0Var = (lkh0) okh0Var;
            amh0 amh0Var2 = lkh0Var.b;
            if (amh0Var2.equals(ylh0Var2)) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                    amh0 amh0Var3 = amh0Var2;
                    if (p7m0Var4.m(value4, mmh0.a((mmh0) value4, null, null, false, 0, null, lkh0Var.f20203a, null, false, amh0Var3, 223))) {
                        return;
                    } else {
                        amh0Var2 = amh0Var3;
                    }
                }
            } else {
                amh0 amh0Var4 = amh0Var2;
                if (!amh0Var4.equals(zlh0Var)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                while (true) {
                    Object value5 = p7m0Var5.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                    amh0 amh0Var5 = amh0Var4;
                    if (p7m0Var5.m(value5, mmh0.a((mmh0) value5, null, null, false, 0, lkh0Var.f20203a, null, "", false, amh0Var5, 175))) {
                        return;
                    } else {
                        amh0Var4 = amh0Var5;
                    }
                }
            }
        }
    }
}
