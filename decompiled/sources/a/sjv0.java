package a;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.coroutines.CoroutineContext;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class sjv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hz40 f32320a;

    static {
        long[] jArr = u1h0.f34903a;
        f32320a = new hz40();
    }

    public static final nld a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof nld) {
            return (nld) tag;
        }
        return null;
    }

    public static final fge0 b(View view) {
        CoroutineContext coroutineContext;
        f390 f390Var;
        if (!view.isAttachedToWindow()) {
            xcx.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objV = k7n0.v(view);
        while (objV instanceof View) {
            View view2 = (View) objV;
            if (view2.getId() == 16908290) {
                break;
            }
            objV = view2.getParent();
            view = view2;
        }
        nld nldVarA = a(view);
        yje yjeVar = null;
        if (nldVarA != null) {
            if (nldVarA instanceof fge0) {
                return (fge0) nldVarA;
            }
            jf4.n("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((pjv0) qjv0.f28859a.get()).getClass();
        CoroutineContext coroutineContext2 = kotlin.coroutines.g.f46065a;
        ake akeVar = kotlin.coroutines.d.d1;
        coroutineContext2.getClass();
        akeVar.getClass();
        n0o0 n0o0Var = r23.m;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            coroutineContext = (CoroutineContext) r23.m.getValue();
        } else {
            coroutineContext = (CoroutineContext) r23.n.get();
            if (coroutineContext == null) {
                jf4.n("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
        qq40 qq40Var = (qq40) coroutineContextPlus.get(lwf.t);
        if (qq40Var != null) {
            f390Var = new f390(qq40Var);
            o24 o24Var = f390Var.b;
            synchronized (o24Var.b) {
                o24Var.f24513a = false;
            }
        } else {
            f390Var = null;
        }
        mie0 mie0Var = new mie0();
        CoroutineContext ls40Var = (ks40) coroutineContextPlus.get(ujn.u);
        if (ls40Var == null) {
            ls40Var = new ls40(view.getContext().getApplicationContext());
            mie0Var.f21842a = ls40Var;
        }
        if (f390Var != null) {
            coroutineContext2 = f390Var;
        }
        CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(coroutineContext2).plus(ls40Var);
        fge0 fge0Var = new fge0(coroutineContextPlus2);
        synchronized (fge0Var.c) {
            fge0Var.t = true;
        }
        sje sjeVarA = d5c.a(coroutineContextPlus2);
        clz clzVarL = s7n0.l(view);
        glz glzVarX = clzVarL != null ? clzVarL.x() : null;
        if (glzVarX == null) {
            xcx.c("ViewTreeLifecycleOwner not found from " + view);
            csj.b();
            return null;
        }
        view.addOnAttachStateChangeListener(new j14(view, fge0Var, (byte) 7));
        glzVarX.a(new n1r(sjeVarA, f390Var, fge0Var, mie0Var));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, fge0Var);
        v7v v7vVar = v7v.f36948a;
        Handler handler = view.getHandler();
        int i = imv.f15044a;
        view.addOnAttachStateChangeListener(new bc0(qjj.W(v7vVar, new hmv(handler, "windowRecomposer cleanup", false).f, null, new n7t0(fge0Var, view, yjeVar, (byte) 17), 2), (byte) 14));
        return fge0Var;
    }
}
