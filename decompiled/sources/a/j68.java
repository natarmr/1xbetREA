package a;

import android.content.SharedPreferences;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j68 extends w46 {
    public final dbu b;
    public final krc c;
    public final gu00 d;
    public final myg0 e;
    public final pmi0 f;
    public final zpu g;
    public final i1w0 h;
    public final bh3 i;
    public final p7m0 j = q7m0.a(new x58(false));
    public final ol60 k = new ol60(3);

    public j68(dbu dbuVar, krc krcVar, gu00 gu00Var, myg0 myg0Var, pmi0 pmi0Var, zpu zpuVar, i1w0 i1w0Var, bh3 bh3Var) {
        this.b = dbuVar;
        this.c = krcVar;
        this.d = gu00Var;
        this.e = myg0Var;
        this.f = pmi0Var;
        this.g = zpuVar;
        this.h = i1w0Var;
        this.i = bh3Var;
    }

    @Override // a.diu0
    public final void v() {
        w(lwf.d);
    }

    public final void w(w58 w58Var) {
        boolean zEquals = w58Var.equals(gqw0.q);
        pmi0 pmi0Var = this.f;
        if (zEquals) {
            ((xwb0) ((a1d) pmi0Var.f27236a).b).a("biometrics_passed", false);
            ((xwb0) this.d.f11906a.b).a("FINGER_LOCK", true);
            return;
        }
        if (w58Var.equals(lwf.d)) {
            ((xwb0) this.e.f22602a.b).a("FINGER_LOCK", false);
            return;
        }
        boolean zEquals2 = w58Var.equals(rv00.d);
        ol60 ol60Var = this.k;
        if (zEquals2) {
            boolean z = ((SharedPreferences) ((xwb0) this.b.f5820a.b).c.getValue()).getBoolean("fingerprint_enabled", false) && this.g.l();
            x58 x58Var = new x58(z);
            p7m0 p7m0Var = this.j;
            p7m0Var.getClass();
            p7m0Var.o(null, x58Var);
            if (z) {
                ol60Var.f(h68.f12518a);
                return;
            }
            return;
        }
        if (w58Var instanceof v58) {
            ol60Var.f(new g68(((v58) w58Var).f36816a.equals(this.c.a())));
            return;
        }
        if (!w58Var.equals(m2a.e)) {
            t9f.b();
            return;
        }
        ((xwb0) ((a1d) pmi0Var.f27236a).b).a("biometrics_passed", true);
        i1w0 i1w0Var = this.h;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new y0w0(this.i.a())), i1w0Var, copyOnWriteArrayListQ, 0);
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
