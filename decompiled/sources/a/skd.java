package a;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class skd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f32341a;
    public boolean b;
    public nld c;
    public clz d;
    public i0h0 e;
    public riu0 f;
    public final u2x g;
    public final btf0 h;
    public final Configuration i;
    public final pz40 j;
    public final ew2 k;
    public final u23 l;
    public final c5k m;
    public final iuc n;
    public final hrq o;
    public final pz40 p;
    public final omv q;
    public final c33 r;
    public final g7z s;
    public final yez t;
    public final b6a u;
    public int v;
    public final h8a w;
    public a23 x;
    public final rkd y;

    public skd(skd skdVar, View view, nld nldVar, clz clzVar, i0h0 i0h0Var, riu0 riu0Var) {
        u2x u2xVar;
        Configuration configuration;
        pz40 pz40VarE;
        ew2 ew2Var;
        u23 u23Var;
        c5k c5kVar;
        iuc zw2Var;
        hrq rek0Var;
        pz40 pz40VarD;
        c33 c33Var;
        boolean zD = Intrinsics.d(skdVar != null ? skdVar.f32341a.getContext() : null, view.getContext());
        this.f32341a = view;
        this.c = nldVar;
        this.d = clzVar;
        this.e = i0h0Var;
        this.f = riu0Var;
        if (zD) {
            skdVar.getClass();
            u2xVar = skdVar.g;
        } else {
            u2xVar = new u2x();
        }
        this.g = u2xVar;
        this.h = skdVar != null ? skdVar.h : new btf0();
        if (zD) {
            skdVar.getClass();
            configuration = skdVar.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (zD) {
            skdVar.getClass();
            pz40VarE = skdVar.j;
        } else {
            pz40VarE = androidx.compose.runtime.e.e(new Configuration(configuration));
        }
        this.j = pz40VarE;
        if (zD) {
            skdVar.getClass();
            ew2Var = skdVar.k;
        } else {
            Context context = view.getContext();
            ew2Var = new ew2();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.k = ew2Var;
        if (zD) {
            skdVar.getClass();
            u23Var = skdVar.l;
        } else {
            u23Var = new u23(view.getContext());
        }
        this.l = u23Var;
        if (zD) {
            skdVar.getClass();
            c5kVar = skdVar.m;
        } else {
            Context context2 = view.getContext();
            c5kVar = new c5k();
            c5kVar.f3775a = context2;
        }
        this.m = c5kVar;
        if (zD) {
            skdVar.getClass();
            zw2Var = skdVar.n;
        } else {
            zw2Var = new zw2(c5kVar);
        }
        this.n = zw2Var;
        if (zD) {
            skdVar.getClass();
            rek0Var = skdVar.o;
        } else {
            view.getContext();
            rek0Var = new rek0((byte) 21);
        }
        this.o = rek0Var;
        if (zD) {
            skdVar.getClass();
            pz40VarD = skdVar.p;
        } else {
            pz40VarD = androidx.compose.runtime.e.d(vzb.B(view.getContext()), ujn.A);
        }
        this.p = pz40VarD;
        this.q = view == (skdVar != null ? skdVar.f32341a : null) ? skdVar.q : new tv90(view);
        if (zD) {
            skdVar.getClass();
            c33Var = skdVar.r;
        } else {
            c33Var = new c33(ViewConfiguration.get(view.getContext()));
        }
        this.r = c33Var;
        this.s = skdVar != null ? skdVar.s : new g7z();
        this.t = new yez();
        this.u = skdVar != null ? skdVar.u : new b6a();
        this.w = new h8a(this, (byte) 28);
        this.y = new rkd(this);
    }

    public final void a(AndroidComposeView androidComposeView, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(123858079);
        byte b = 2;
        int i2 = (fetVar.i(androidComposeView) ? 4 : 2) | i | (fetVar.i(ugdVar) ? 32 : 16) | (fetVar.i(this) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set set = null;
            Set set2 = (!(tag instanceof Set) || ((tag instanceof khy) && !(tag instanceof vhy))) ? null : (Set) tag;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if ((tag2 instanceof Set) && (!(tag2 instanceof khy) || (tag2 instanceof vhy))) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(fetVar.z());
                fetVar.q = true;
                fetVar.C = true;
                fetVar.c.c();
                fetVar.H.c();
                t9k0 t9k0Var = fetVar.I;
                q9k0 q9k0Var = t9k0Var.f33568a;
                t9k0Var.e = q9k0Var.j;
                t9k0Var.f = q9k0Var.k;
            }
            boolean zG = fetVar.g(androidComposeView.getView());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new xlu0(androidComposeView.getView());
                fetVar.o0(objP);
            }
            xlu0 xlu0Var = (xlu0) objP;
            l5d0 l5d0VarA = or00.f25714a.a(d());
            androidx.compose.runtime.d dVar = xr00.f41346a;
            g();
            i0h0 i0h0Var = this.e;
            i0h0Var.getClass();
            l5d0 l5d0VarA2 = dVar.a(i0h0Var);
            l5d0 l5d0VarA3 = dy2.d.a(this.g);
            l5d0 l5d0VarA4 = dy2.e.a(this.h);
            zfn zfnVar = bmd.v;
            boolean zI = fetVar.i(this);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new ejd(this, b);
                fetVar.o0(objP2);
            }
            l5d0 l5d0VarC = zfnVar.c((Function1) objP2);
            l5d0 l5d0VarA5 = dy2.b.a(androidComposeView.getContext());
            l5d0 l5d0VarA6 = lix.f20127a.a(set);
            l5d0 l5d0VarA7 = dy2.f6873a.a(androidComposeView.getConfiguration());
            zfn zfnVar2 = hzg0.f13904a;
            boolean zI2 = fetVar.i(androidComposeView);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new ax2(androidComposeView, (byte) 3);
                fetVar.o0(objP3);
            }
            l5d0 l5d0VarC2 = zfnVar2.c((Function1) objP3);
            l5d0 l5d0VarA8 = dy2.f.a(androidComposeView.getView());
            zfn zfnVar3 = bmd.x;
            boolean zI3 = fetVar.i(androidComposeView);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new ax2(androidComposeView, (byte) 4);
                fetVar.o0(objP4);
            }
            obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, l5d0VarA4, l5d0VarC, l5d0VarA5, l5d0VarA6, l5d0VarA7, l5d0VarC2, l5d0VarA8, zfnVar3.c((Function1) objP4), bmd.t.a(androidComposeView.getViewConfiguration()), wrw.f39666a.a(xlu0Var)}, u1c.M(1317454175, new qkd(androidComposeView, this, ugdVar), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qkd(this, androidComposeView, ugdVar, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.f32341a;
            Context context = view.getContext();
            rkd rkdVar = this.y;
            context.unregisterComponentCallbacks(rkdVar);
            yez yezVar = this.t;
            if (yezVar.b == null) {
                yezVar.f42515a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(rkdVar);
        }
    }

    public final nld c() {
        g();
        nld nldVar = this.c;
        nldVar.getClass();
        return nldVar;
    }

    public final clz d() {
        g();
        clz clzVar = this.d;
        clzVar.getClass();
        return clzVar;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.f32341a;
            Context context = view.getContext();
            rkd rkdVar = this.y;
            context.registerComponentCallbacks(rkdVar);
            f(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            yez yezVar = this.t;
            ((hgk0) yezVar.c).setValue(Boolean.valueOf(zHasWindowFocus));
            pz40 pz40Var = yezVar.b;
            h8a h8aVar = this.w;
            if (pz40Var == null) {
                yezVar.f42515a = h8aVar;
            }
            if (pz40Var != null) {
                ((hgk0) pz40Var).setValue(h8aVar.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(rkdVar);
        }
    }

    public final void f(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.f34967a.entrySet().iterator();
            while (it.hasNext()) {
                s2x s2xVar = (s2x) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (s2xVar == null || Configuration.needNewResources(iUpdateFrom, s2xVar.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            btf0 btf0Var = this.h;
            synchronized (btf0Var) {
                btf0Var.f3181a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.p.setValue(vzb.B(this.f32341a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                yez yezVar = this.t;
                h8a h8aVar = this.w;
                pz40 pz40Var = yezVar.b;
                if (pz40Var != null) {
                    ((hgk0) pz40Var).setValue(h8aVar.invoke());
                }
            }
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.b = true;
        nld nldVar = this.c;
        View view = this.f32341a;
        if (nldVar == null) {
            nld nldVarA = sjv0.a(view);
            if (nldVarA == null) {
                Object parent = view.getParent();
                while (nldVarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    nldVarA = sjv0.a(view2);
                    parent = k7n0.v(view2);
                }
            }
            if (nldVarA == null) {
                nldVarA = sjv0.b(view);
            }
            this.c = nldVarA;
        }
        if (this.d == null) {
            clz clzVarL = s7n0.l(view);
            if (clzVarL == null) {
                jf4.n("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = clzVarL;
        }
        if (this.e == null) {
            i0h0 i0h0VarP = w7n0.p(view);
            if (i0h0VarP == null) {
                jf4.n("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = i0h0VarP;
        }
        if (this.f == null) {
            this.f = n8n0.h(view);
        }
    }
}
