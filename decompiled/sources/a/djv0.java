package a;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class djv0 {
    public static final WeakHashMap w = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q33 f6205a;
    public final q33 b;
    public final q33 c;
    public final q33 d;
    public final q33 e;
    public final q33 f;
    public final q33 g;
    public final q33 h;
    public final q33 i;
    public final g3u0 j;
    public final pz40 k;
    public final y7t0 l;
    public final g3u0 m;
    public final g3u0 n;
    public final g3u0 o;
    public final g3u0 p;
    public final g3u0 q;
    public final g3u0 r;
    public final g3u0 s;
    public final boolean t;
    public int u;
    public final yfx v;

    public djv0(View view) {
        q33 q33Var = new q33(4, "captionBar");
        this.f6205a = q33Var;
        q33 q33Var2 = new q33(128, "displayCutout");
        this.b = q33Var2;
        q33 q33Var3 = new q33(8, "ime");
        this.c = q33Var3;
        q33 q33Var4 = new q33(32, "mandatorySystemGestures");
        this.d = q33Var4;
        q33 q33Var5 = new q33(2, "navigationBars");
        this.e = q33Var5;
        q33 q33Var6 = new q33(1, "statusBars");
        this.f = q33Var6;
        q33 q33Var7 = new q33(519, "systemBars");
        this.g = q33Var7;
        q33 q33Var8 = new q33(16, "systemGestures");
        this.h = q33Var8;
        q33 q33Var9 = new q33(64, "tappableElement");
        this.i = q33Var9;
        g3u0 g3u0Var = new g3u0(new dgx(0, 0, 0, 0), "waterfall");
        this.j = g3u0Var;
        this.k = androidx.compose.runtime.e.e(null);
        y7t0 y7t0Var = new y7t0(new y7t0(q33Var7, q33Var3), q33Var2);
        this.l = y7t0Var;
        new y7t0(y7t0Var, new y7t0(new y7t0(new y7t0(q33Var9, q33Var4), q33Var8), g3u0Var));
        this.m = zcm0.q(4, "captionBarIgnoringVisibility");
        this.n = zcm0.q(2, "navigationBarsIgnoringVisibility");
        this.o = zcm0.q(1, "statusBarsIgnoringVisibility");
        this.p = zcm0.q(519, "systemBarsIgnoringVisibility");
        this.q = zcm0.q(64, "tappableElementIgnoringVisibility");
        this.r = new g3u0(new dgx(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new g3u0(new dgx(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new yfx(this);
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(view);
        if (xiv0VarA != null) {
            uiv0 uiv0Var = xiv0VarA.f40966a;
            q33Var.f(uiv0Var.u(4));
            q33Var2.f(uiv0Var.u(128));
            q33Var3.f(uiv0Var.u(8));
            q33Var4.f(uiv0Var.u(32));
            q33Var5.f(uiv0Var.u(2));
            q33Var6.f(uiv0Var.u(1));
            q33Var7.f(uiv0Var.u(519));
            q33Var8.f(uiv0Var.u(16));
            q33Var9.f(uiv0Var.u(64));
        }
    }

    public static void b(djv0 djv0Var, xiv0 xiv0Var) {
        boolean z = false;
        djv0Var.f6205a.g(xiv0Var, 0);
        djv0Var.c.g(xiv0Var, 0);
        djv0Var.b.g(xiv0Var, 0);
        djv0Var.e.g(xiv0Var, 0);
        djv0Var.f.g(xiv0Var, 0);
        djv0Var.g.g(xiv0Var, 0);
        djv0Var.h.g(xiv0Var, 0);
        djv0Var.i.g(xiv0Var, 0);
        djv0Var.d.g(xiv0Var, 0);
        djv0Var.m.f(aem0.w(xiv0Var.f40966a.j(4)));
        djv0Var.n.f(aem0.w(xiv0Var.f40966a.j(2)));
        djv0Var.o.f(aem0.w(xiv0Var.f40966a.j(1)));
        djv0Var.p.f(aem0.w(xiv0Var.f40966a.j(519)));
        djv0Var.q.f(aem0.w(xiv0Var.f40966a.j(64)));
        vvk vvkVarH = xiv0Var.f40966a.h();
        djv0Var.j.f(aem0.w(vvkVarH != null ? vvkVarH.a() : pfx.e));
        w03 w03Var = null;
        if (vvkVarH != null) {
            Path pathE = Build.VERSION.SDK_INT >= 31 ? gy2.e(vvkVarH.f38104a) : null;
            if (pathE != null) {
                w03Var = new w03(pathE);
            }
        }
        ((hgk0) djv0Var.k).setValue(w03Var);
        synchronized (xfk0.c) {
            iz40 iz40Var = xfk0.j.h;
            if (iz40Var != null && iz40Var.h()) {
                z = true;
            }
        }
        if (z) {
            xfk0.c();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            yfx yfxVar = this.v;
            yfxVar.d = false;
            yfxVar.e = false;
            yfxVar.f = null;
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(view, yfxVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(yfxVar);
            div0.a(view, yfxVar);
        }
        this.u++;
    }
}
