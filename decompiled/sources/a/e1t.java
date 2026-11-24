package a;

import android.webkit.JavascriptInterface;
import com.huawei.hms.framework.common.BundleUtil;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes4.dex */
public final class e1t extends w46 implements r0t, dke {
    public final GameBroadcastingParams b;
    public final ali c;
    public final a5v d;
    public final yqc e;
    public final xsc f;
    public final xsc g;
    public final m1e h;
    public final mne i;
    public final fuj0 j;
    public final nw20 k;
    public final chf0 l;
    public final xex m;
    public final p7m0 n;
    public final p7m0 o;
    public c4m0 p;
    public bby q;

    public e1t(GameBroadcastingParams gameBroadcastingParams, ali aliVar, a5v a5vVar, yqc yqcVar, xsc xscVar, xsc xscVar2, bdu bduVar, m1e m1eVar, mne mneVar, wgu wguVar, fuj0 fuj0Var, nw20 nw20Var, chf0 chf0Var, xex xexVar) {
        m1eVar.getClass();
        this.b = gameBroadcastingParams;
        this.c = aliVar;
        this.d = a5vVar;
        this.e = yqcVar;
        this.f = xscVar;
        this.g = xscVar2;
        this.h = m1eVar;
        this.i = mneVar;
        this.j = fuj0Var;
        this.k = nw20Var;
        this.l = chf0Var;
        this.m = xexVar;
        this.n = q7m0.a(new s0t(gameBroadcastingParams.f46691a, gameBroadcastingParams.d, gameBroadcastingParams.e, gameBroadcastingParams.g, bduVar.a(), false, false, false, false, false, wguVar.a(), w3w0.b, false, true, e1t.class.getSimpleName() + BundleUtil.UNDERLINE_TAG + gameBroadcastingParams.f46691a));
        this.o = q7m0.a(j0t.f15697a);
        x();
    }

    @Override // a.r0t
    @JavascriptInterface
    public void canChangeViewZone(boolean z) {
        while (true) {
            p7m0 p7m0Var = this.n;
            Object value = p7m0Var.getValue();
            boolean z2 = z;
            if (p7m0Var.m(value, s0t.a((s0t) value, false, false, false, false, null, z2, false, 28671))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // a.r0t
    @JavascriptInterface
    public void getModeZone(int i) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.n;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, s0t.a((s0t) value, false, false, false, false, i == 1 ? w3w0.b : w3w0.f38519a, false, false, 30719)));
    }

    @Override // a.r0t
    @JavascriptInterface
    public void returnResult() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.n;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, s0t.a((s0t) value, false, true, false, false, null, false, false, 32575)));
    }

    @Override // a.diu0
    public final void v() {
        if (((s0t) this.n.getValue()).n) {
            w();
        }
    }

    public final void w() {
        b49 b49VarM = this.l.M(((s0t) this.n.getValue()).o);
        if (b49VarM instanceof a49) {
            a49 a49Var = (a49) b49VarM;
            this.m.O(a49Var.b, a49Var.c, a49Var.f212a, a49Var.d, a49Var.e);
        }
    }

    public final void x() {
        c4m0 c4m0Var = this.p;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.p = slb.U(new fnq(this.h.b(), new b1t(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.i.f22085a));
        }
    }

    public final void y() {
        this.k.o(((s0t) this.n.getValue()).o);
    }

    public final void z() {
        GameBroadcastingParams gameBroadcastingParams = this.b;
        this.j.A(gameBroadcastingParams.f46691a, gameBroadcastingParams.d, gameBroadcastingParams.g, v39.ZONE, String.valueOf(gameBroadcastingParams.e), ((s0t) this.n.getValue()).o);
    }
}
