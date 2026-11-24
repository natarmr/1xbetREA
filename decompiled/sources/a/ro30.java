package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ro30 extends hy40 {
    public atg0 l;

    @Override // a.wh00
    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            wsg0 wsg0Var = (wsg0) it;
            if (!wsg0Var.hasNext()) {
                return;
            }
            qo30 qo30Var = (qo30) ((Map.Entry) wsg0Var.next()).getValue();
            qo30Var.f29053a.f(qo30Var);
        }
    }

    @Override // a.wh00
    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            wsg0 wsg0Var = (wsg0) it;
            if (!wsg0Var.hasNext()) {
                return;
            }
            qo30 qo30Var = (qo30) ((Map.Entry) wsg0Var.next()).getValue();
            qo30Var.f29053a.j(qo30Var);
        }
    }
}
