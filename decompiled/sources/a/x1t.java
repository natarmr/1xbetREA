package a;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class x1t extends w46 implements r0t, dke {
    public final ali b;
    public final yqc c;
    public final mpx d;
    public final kut e;
    public final m1e f;
    public final mne g;
    public final sdi0 h;
    public final fuj0 i;
    public final nw20 j;
    public final chf0 k;
    public final xex l;
    public final p7m0 m;
    public final p7m0 n;
    public bby o;

    public x1t(ali aliVar, yqc yqcVar, mpx mpxVar, kut kutVar, m1e m1eVar, mne mneVar, sdi0 sdi0Var, fuj0 fuj0Var, nw20 nw20Var, chf0 chf0Var, xex xexVar, wgu wguVar) {
        m1eVar.getClass();
        this.b = aliVar;
        this.c = yqcVar;
        this.d = mpxVar;
        this.e = kutVar;
        this.f = m1eVar;
        this.g = mneVar;
        this.h = sdi0Var;
        this.i = fuj0Var;
        this.j = nw20Var;
        this.k = chf0Var;
        this.l = xexVar;
        this.m = q7m0.a(new j1t(0L, 0L, 0, 0L, "", false, false, false, false, false, wguVar.a(), w3w0.b, false, true, ""));
        this.n = q7m0.a(g1t.f10532a);
    }

    @Override // a.r0t
    @JavascriptInterface
    public void canChangeViewZone(boolean z) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, false, false, null, z, null, 28671)));
    }

    @Override // a.r0t
    @JavascriptInterface
    public void getModeZone(int i) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, false, false, i == 1 ? w3w0.b : w3w0.f38519a, false, null, 30719)));
    }

    @Override // a.r0t
    @JavascriptInterface
    public void returnResult() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.m;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, j1t.a((j1t) value, 0L, 0L, 0, 0L, null, false, true, false, null, false, null, 32575)));
    }

    @Override // a.diu0
    public final void v() {
        p7m0 p7m0Var = this.m;
        if (((j1t) p7m0Var.getValue()).n) {
            b49 b49VarM = this.k.M(((j1t) p7m0Var.getValue()).o);
            if (b49VarM instanceof a49) {
                a49 a49Var = (a49) b49VarM;
                this.l.O(a49Var.b, a49Var.c, a49Var.f212a, a49Var.d, a49Var.e);
            }
        }
    }

    public final void w() {
        bby bbyVar = this.o;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.o = sac.V(jiu0.a(this), v1t.f36648a, null, this.g.c, new r1t(this, null, (byte) 3), 10);
        }
    }

    public final void x() {
        this.j.o(((j1t) this.m.getValue()).o);
    }

    public final void y() {
        j1t j1tVar = (j1t) this.m.getValue();
        this.i.A(j1tVar.f15752a, j1tVar.b, j1tVar.d, v39.ZONE, String.valueOf(j1tVar.c), j1tVar.o);
    }
}
