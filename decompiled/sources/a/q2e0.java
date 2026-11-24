package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class q2e0 extends i3t0 {
    public static final /* synthetic */ int s = 0;
    public final i1w0 o;
    public final pru p;
    public final s9m0 q;
    public final dpi0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2e0(i1w0 i1w0Var, ctf0 ctf0Var, pru pruVar, s9m0 s9m0Var, dpi0 dpi0Var, jgu jguVar, mne mneVar) {
        Object value;
        super(null, new p2e0(pruVar, (byte) 0), new iv80(ctf0Var, (byte) 14), cvm0.p(mneVar.c, mneVar.b), null);
        ctf0Var.getClass();
        this.o = i1w0Var;
        this.p = pruVar;
        this.q = s9m0Var;
        this.r = dpi0Var;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, t2e0.a((t2e0) value, 0, true, 5)));
        vwb0 vwb0Var = (vwb0) ((gxu) jguVar.f16498a.f15470a).f12096a;
        vwb0Var.e("RATE_APP_DIALOG_SHOWN_KEY", true);
        vwb0Var.g("RATE_APP_DIALOG_SHOWN_TIME_KEY", System.currentTimeMillis());
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        l2e0 l2e0Var = (l2e0) obj;
        l2e0Var.getClass();
        if (l2e0Var instanceof k2e0) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, t2e0.a((t2e0) value, ((k2e0) l2e0Var).f17567a, false, 6)));
            return;
        }
        if (!l2e0Var.equals(j2e0.f15776a)) {
            if (l2e0Var.equals(i2e0.f14043a)) {
                qjj.W(jiu0.a(this), null, null, new coc0(this, null, (byte) 7), 3);
                return;
            } else if (l2e0Var.equals(h2e0.f12328a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        boolean z = this.p.a().G;
        ((q7d0) ((gxu) ((iw20) this.r.f6468a).f15470a).b).d("RATE_APP_PERFORMED_KEY", true);
        int i = ((t2e0) D()).f33211a;
        i1w0 i1w0Var = this.o;
        if (i > 3 || !z) {
            if (!StringsKt.W(((t2e0) D()).c)) {
                G(new s2e0(((t2e0) D()).c));
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
        } else {
            SupportMenuScreenParams supportMenuScreenParams = new SupportMenuScreenParams(false, pjn0.f27099a, SupportMenuScreenParams.AdditionalParams.None.f47112a);
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            this.q.getClass();
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, new d1w0(s9m0.f(supportMenuScreenParams))), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
