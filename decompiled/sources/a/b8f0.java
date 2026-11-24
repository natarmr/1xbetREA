package a;

import java.util.ListIterator;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class b8f0 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final dmt o;
    public final jru p;
    public final i1w0 q;
    public final ag3 r;
    public final je s;
    public final s64 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8f0(vzg0 vzg0Var, ctf0 ctf0Var, dmt dmtVar, jru jruVar, i1w0 i1w0Var, ag3 ag3Var, je jeVar, s64 s64Var, rqt rqtVar, bzt bztVar, pru pruVar, mne mneVar) {
        super(null, new p2e0(pruVar, rqtVar), new a8f0(ctf0Var, bztVar), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = dmtVar;
        this.p = jruVar;
        this.q = i1w0Var;
        this.r = ag3Var;
        this.s = jeVar;
        this.t = s64Var;
        i3t0.K(this, null, null, new hhb0(this, null, (byte) 3), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        u7f0 u7f0Var = (u7f0) obj;
        u7f0Var.getClass();
        if (!(u7f0Var instanceof t7f0)) {
            if (u7f0Var.equals(s7f0.f31748a)) {
                y1p y1pVar = y1p.MAIN;
                this.t.c("registration");
                G(x7f0.f40411a);
                return;
            } else if (u7f0Var.equals(r7f0.f29972a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        q7f0 q7f0Var = ((t7f0) u7f0Var).f33463a;
        int iOrdinal = q7f0Var.ordinal();
        je jeVar = this.s;
        ag3 ag3Var = this.r;
        if (iOrdinal == 0) {
            i8i.D("option", "full", ag3Var.f809a, "reg_option");
            b1j.v("full", jeVar.f16351a, 3021L);
        } else if (iOrdinal == 1) {
            i8i.D("option", "phone", ag3Var.f809a, "reg_option");
            b1j.v("phone", jeVar.f16351a, 3021L);
        } else if (iOrdinal == 2) {
            i8i.D("option", "one_click", ag3Var.f809a, "reg_option");
            b1j.v("one_click", jeVar.f16351a, 3021L);
        } else if (iOrdinal == 3) {
            i8i.D("option", "social_media", ag3Var.f809a, "reg_option");
            b1j.v("social_media", jeVar.f16351a, 3021L);
        } else if (iOrdinal != 4) {
            t9f.b();
            return;
        } else {
            i8i.D("option", "itsme", ag3Var.f809a, "reg_option");
            b1j.v("itsme", jeVar.f16351a, 3021L);
        }
        i1w0 i1w0Var = this.q;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(this.o.a(new RegistrationDefaultScreenParams(q7f0Var)));
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
