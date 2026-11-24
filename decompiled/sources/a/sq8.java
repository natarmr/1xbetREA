package a;

import android.content.Context;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class sq8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32615a;
    public final int b;
    public final int c;
    public final int d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public sq8(r68 r68Var, d3g0 d3g0Var, d3g0 d3g0Var2, d3g0 d3g0Var3, d3g0 d3g0Var4) throws o660 {
        boolean z = d3g0Var == null || d3g0Var2 == null;
        boolean z2 = d3g0Var3 == null || d3g0Var4 == null;
        if (z && z2) {
            throw o660.a();
        }
        if (z) {
            d3g0Var = new d3g0(0.0f, d3g0Var3.b);
            d3g0Var2 = new d3g0(0.0f, d3g0Var4.b);
        } else if (z2) {
            int i = r68Var.f29923a;
            d3g0Var3 = new d3g0(i - 1, d3g0Var.b);
            d3g0Var4 = new d3g0(i - 1, d3g0Var2.b);
        }
        this.e = r68Var;
        this.f = d3g0Var;
        this.g = d3g0Var2;
        this.h = d3g0Var3;
        this.i = d3g0Var4;
        this.f32615a = (int) Math.min(d3g0Var.f5402a, d3g0Var2.f5402a);
        this.b = (int) Math.max(d3g0Var3.f5402a, d3g0Var4.f5402a);
        this.c = (int) Math.min(d3g0Var.b, d3g0Var3.b);
        this.d = (int) Math.max(d3g0Var2.b, d3g0Var4.b);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    public void a(cue cueVar, yse yseVar) {
        View sizVar;
        View view;
        View xak0Var;
        cueVar.getClass();
        yseVar.getClass();
        l4l0 l4l0Var = (l4l0) this.e;
        View view2 = null;
        if (((due) this.i) == null || cueVar.getClass() != ((cue) this.g).getClass()) {
            Object obj = (due) this.i;
            View view3 = obj != null ? (View) obj : null;
            if (view3 != null) {
                l4l0Var.removeView(view3);
            }
            this.g = cueVar;
            if (cueVar instanceof aue) {
                Context context = l4l0Var.getContext();
                context.getClass();
                l5k0 l5k0Var = new l5k0(context);
                cem0.n(R.style.TextStyle_Caption_Medium_L_TextPrimary, l5k0Var);
                int i = this.c;
                l5k0Var.setPadding(0, i, 0, i);
                sizVar = l5k0Var;
            } else if (cueVar instanceof bue) {
                Context context2 = l4l0Var.getContext();
                context2.getClass();
                sizVar = new siz(context2);
            } else {
                sizVar = null;
            }
            if (sizVar != null) {
                l4l0Var.addView(sizVar);
                view = sizVar;
            } else {
                view = null;
            }
            this.i = view;
        }
        due dueVar = (due) this.i;
        if (dueVar != null) {
            dueVar.setTeamsUiModel(cueVar);
        }
        l4l0Var.requestLayout();
        if ((((zse) this.h) == null || yseVar.getClass() != ((yse) this.f).getClass()) && !(((cue) this.g) instanceof zte)) {
            Object obj2 = (zse) this.h;
            View view4 = obj2 != null ? (View) obj2 : null;
            if (view4 != null) {
                l4l0Var.removeView(view4);
            }
            this.f = yseVar;
            cue cueVar2 = (cue) this.g;
            if ((cueVar2 instanceof aue) || (cueVar2 instanceof zte)) {
                xak0Var = null;
            } else if (yseVar instanceof vse) {
                Context context3 = l4l0Var.getContext();
                context3.getClass();
                xak0Var = new yak0(context3);
            } else if (yseVar instanceof tse) {
                Context context4 = l4l0Var.getContext();
                context4.getClass();
                xak0Var = new udf(context4);
            } else if (yseVar instanceof use) {
                Context context5 = l4l0Var.getContext();
                context5.getClass();
                xak0Var = new xak0(context5);
            } else {
                xak0Var = null;
            }
            if (xak0Var != null) {
                l4l0Var.addView(xak0Var);
                view2 = xak0Var;
            }
            this.h = view2;
        }
        zse zseVar = (zse) this.h;
        if (zseVar != null) {
            zseVar.setScoreUiModel(yseVar);
        }
        this.f = yseVar;
        this.g = cueVar;
        l4l0Var.invalidate();
        l4l0Var.requestLayout();
    }

    public sq8(l4l0 l4l0Var) {
        this.e = l4l0Var;
        this.f = wse.f39686a;
        this.g = zte.f44954a;
        this.b = l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_12);
        this.c = l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = l4l0Var.getResources().getDimensionPixelSize(R.dimen.space_8);
    }

    public sq8(sq8 sq8Var) {
        this.e = (r68) sq8Var.e;
        this.f = (d3g0) sq8Var.f;
        this.g = (d3g0) sq8Var.g;
        this.h = (d3g0) sq8Var.h;
        this.i = (d3g0) sq8Var.i;
        this.f32615a = sq8Var.f32615a;
        this.b = sq8Var.b;
        this.c = sq8Var.c;
        this.d = sq8Var.d;
    }
}
