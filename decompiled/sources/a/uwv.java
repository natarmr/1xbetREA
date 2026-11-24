package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class uwv extends w46 {
    public final svu b;
    public final hnu c;
    public final i1w0 d;
    public final qoj0 e = roj0.b(0, 1, null, 5);

    public uwv(svu svuVar, hnu hnuVar, i1w0 i1w0Var) {
        this.b = svuVar;
        this.c = hnuVar;
        this.d = i1w0Var;
    }

    public final void w(boolean z) {
        if (!z) {
            return;
        }
        q7d0 q7d0Var = (q7d0) ((y3v) this.c.f13365a).d;
        q7d0Var.d("HIDDEN_BETTING_NEED_SIMPLE_UPDATE", false);
        q7d0Var.d("HIDDEN_BETTING_NEED_HARD_UPDATE", false);
        i1w0 i1w0Var = this.d;
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
