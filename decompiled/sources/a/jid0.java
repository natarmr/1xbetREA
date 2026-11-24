package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.authqr.impl.qr.presentation.confirmation.secret_question.params.QrConfirmSecretQuestionFragmentScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class jid0 extends w46 {
    public final ctf0 b;
    public final i1w0 c;
    public final yox d;
    public final mne e;
    public final QrConfirmSecretQuestionFragmentScreenParams f;
    public final rou g;
    public final ubu h;
    public final zoi0 i;
    public final m1e j;
    public final p7m0 k;
    public final ol60 l;
    public c4m0 m;

    public jid0(ctf0 ctf0Var, i1w0 i1w0Var, yox yoxVar, mne mneVar, QrConfirmSecretQuestionFragmentScreenParams qrConfirmSecretQuestionFragmentScreenParams, rou rouVar, ubu ubuVar, zoi0 zoi0Var, m1e m1eVar) {
        ctf0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        this.b = ctf0Var;
        this.c = i1w0Var;
        this.d = yoxVar;
        this.e = mneVar;
        this.f = qrConfirmSecretQuestionFragmentScreenParams;
        this.g = rouVar;
        this.h = ubuVar;
        this.i = zoi0Var;
        this.j = m1eVar;
        this.k = q7m0.a(new iid0(kng0.l(ctf0Var.f(R.string.answer_question, new Object[0]), ": ", qrConfirmSecretQuestionFragmentScreenParams.f46363a), "", false, true));
        this.l = new ol60(3);
    }

    public final void w() {
        i1w0 i1w0Var = this.c;
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

    public final void x() {
        p7m0 p7m0Var = this.k;
        if (!((iid0) p7m0Var.getValue()).d) {
            this.l.f(aid0.f920a);
            return;
        }
        String str = ((iid0) p7m0Var.getValue()).b;
        if (StringsKt.W(str)) {
            return;
        }
        sac.V(jiu0.a(this), new v6d0(this, (byte) 6), null, this.e.b, new er60(this, str, null, (byte) 25), 10);
    }

    public final void y(hid0 hid0Var) {
        sac.V(jiu0.a(this), new ljc0((byte) 24), null, this.e.c, new s9c0(this, hid0Var, null, (byte) 13), 10);
    }
}
