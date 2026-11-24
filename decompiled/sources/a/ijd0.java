package a;

import java.util.ListIterator;
import kotlin.Unit;
import org.xplatform.authqr.impl.qr.presentation.confirmation.mail.check.QrCheckCodeByMailScreen;
import org.xplatform.authqr.impl.qr.presentation.confirmation.mail.send.params.QrSendConfirmationMailParams;

/* JADX INFO: loaded from: classes3.dex */
public final class ijd0 extends w46 {
    public final i1w0 b;
    public final QrSendConfirmationMailParams c;
    public final duj d;
    public final n5c e;
    public final mne f;
    public final rou g;
    public final p7m0 h;
    public final ol60 i;
    public final c4m0 j;

    public ijd0(i1w0 i1w0Var, QrSendConfirmationMailParams qrSendConfirmationMailParams, duj dujVar, n5c n5cVar, mne mneVar, rou rouVar, m1e m1eVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        this.b = i1w0Var;
        this.c = qrSendConfirmationMailParams;
        this.d = dujVar;
        this.e = n5cVar;
        this.f = mneVar;
        this.g = rouVar;
        this.h = q7m0.a(new fjd0("", true));
        this.i = new ol60(3);
        c4m0 c4m0Var = this.j;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.j = sac.T(new fnq(m1eVar.b(), new a220(this, yjeVar, (byte) 15), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new st20(2, yjeVar, (byte) 20));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        gjd0 gjd0Var;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof gjd0) {
            gjd0Var = (gjd0) zjeVar;
            int i = gjd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gjd0Var.k = i - Integer.MIN_VALUE;
            } else {
                gjd0Var = new gjd0(this, zjeVar);
            }
        } else {
            gjd0Var = new gjd0(this, zjeVar);
        }
        Object objA = gjd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gjd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            gjd0Var.k = 1;
            objA = this.g.a(false, gjd0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        String str = ((m2c0) objA).T;
        do {
            p7m0Var = this.h;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, fjd0.a((fjd0) value, str, false, 2)));
        return Unit.f46060a;
    }

    public final void x(ejd0 ejd0Var) {
        sac.V(jiu0.a(this), new ljc0((byte) 25), null, this.f.c, new s9c0(this, ejd0Var, null, (byte) 14), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(zje zjeVar) {
        hjd0 hjd0Var;
        if (zjeVar instanceof hjd0) {
            hjd0Var = (hjd0) zjeVar;
            int i = hjd0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hjd0Var.k = i - Integer.MIN_VALUE;
            } else {
                hjd0Var = new hjd0(this, zjeVar);
            }
        } else {
            hjd0Var = new hjd0(this, zjeVar);
        }
        Object objA = hjd0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hjd0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            swp0 swp0Var = this.c.f46362a;
            obk0 obk0Var = obk0.SMS;
            hjd0Var.k = 1;
            objA = this.e.a(swp0Var, obk0Var, 0, false, "", hjd0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        pfi0 pfi0Var = (pfi0) objA;
        i1w0 i1w0Var = this.b;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(new QrCheckCodeByMailScreen(pfi0Var.b, pfi0Var.f26908a));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }
}
