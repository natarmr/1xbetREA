package a;

import android.webkit.JavascriptInterface;
import com.huawei.hms.framework.common.BundleUtil;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;

/* JADX INFO: loaded from: classes4.dex */
public final class p89 extends w46 implements r0t, dke {
    public final BroadcastingZoneLandscapeParams b;
    public final m1e c;
    public final mne d;
    public final ali e;
    public final a5v f;
    public final sdi0 g;
    public final fuj0 h;
    public final nw20 i;
    public final chf0 j;
    public final xex k;
    public final p7m0 l;
    public final p7m0 m;
    public c4m0 n;
    public bby o;

    public p89(BroadcastingZoneLandscapeParams broadcastingZoneLandscapeParams, m1e m1eVar, mne mneVar, ali aliVar, a5v a5vVar, sdi0 sdi0Var, wgu wguVar, fuj0 fuj0Var, nw20 nw20Var, chf0 chf0Var, xex xexVar, bdu bduVar) {
        m1eVar.getClass();
        this.b = broadcastingZoneLandscapeParams;
        this.c = m1eVar;
        this.d = mneVar;
        this.e = aliVar;
        this.f = a5vVar;
        this.g = sdi0Var;
        this.h = fuj0Var;
        this.i = nw20Var;
        this.j = chf0Var;
        this.k = xexVar;
        this.l = q7m0.a(new b89(broadcastingZoneLandscapeParams.f46690a, broadcastingZoneLandscapeParams.b, broadcastingZoneLandscapeParams.c, broadcastingZoneLandscapeParams.d, bduVar.a(), false, false, false, false, false, wguVar.a(), w3w0.b, false, true, p89.class.getSimpleName() + BundleUtil.UNDERLINE_TAG + broadcastingZoneLandscapeParams.f46690a));
        this.m = q7m0.a(t79.f33455a);
    }

    @Override // a.r0t
    @JavascriptInterface
    public void canChangeViewZone(boolean z) {
        while (true) {
            p7m0 p7m0Var = this.l;
            Object value = p7m0Var.getValue();
            boolean z2 = z;
            if (p7m0Var.m(value, b89.a((b89) value, false, false, false, false, null, z2, 28671))) {
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
            p7m0Var = this.l;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, b89.a((b89) value, false, false, false, false, i == 1 ? w3w0.b : w3w0.f38519a, false, 30719)));
    }

    @Override // a.r0t
    @JavascriptInterface
    public void returnResult() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.l;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, b89.a((b89) value, false, true, false, false, null, false, 32575)));
    }

    @Override // a.diu0
    public final void v() {
        p7m0 p7m0Var = this.l;
        if (((b89) p7m0Var.getValue()).n) {
            b49 b49VarM = this.j.M(((b89) p7m0Var.getValue()).o);
            if (b49VarM instanceof a49) {
                a49 a49Var = (a49) b49VarM;
                this.k.O(a49Var.b, a49Var.c, a49Var.f212a, a49Var.d, a49Var.e);
            }
        }
    }

    public final void w() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.l;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, b89.a((b89) value, false, false, false, false, null, false, 24575)));
        if (this.b.e) {
            x();
            return;
        }
        p7m0 p7m0Var2 = this.m;
        p7m0Var2.getClass();
        p7m0Var2.o(null, u79.f35173a);
        this.e.d();
        sac.V(jiu0.a(this), j89.f16072a, null, this.d.f22085a, new k89(this, null, (byte) 0), 10);
    }

    public final void x() {
        sac.V(jiu0.a(this), o89.f24820a, null, this.d.f22085a, new k89(this, null, (byte) 4), 10);
        v79 v79Var = new v79(new vb8((Object) this, (byte) 19));
        p7m0 p7m0Var = this.m;
        p7m0Var.getClass();
        p7m0Var.o(null, v79Var);
    }

    public final void y() {
        this.i.o(((b89) this.l.getValue()).o);
    }

    public final void z() {
        BroadcastingZoneLandscapeParams broadcastingZoneLandscapeParams = this.b;
        this.h.A(broadcastingZoneLandscapeParams.f46690a, broadcastingZoneLandscapeParams.b, broadcastingZoneLandscapeParams.d, v39.ZONE, String.valueOf(broadcastingZoneLandscapeParams.c), ((b89) this.l.getValue()).o);
    }
}
