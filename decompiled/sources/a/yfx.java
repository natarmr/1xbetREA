package a;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yfx extends oyc implements Runnable, zf60, View.OnAttachStateChangeListener {
    public final djv0 c;
    public boolean d;
    public boolean e;
    public xiv0 f;

    public yfx(djv0 djv0Var) {
        super(!djv0Var.t ? 1 : 0);
        this.c = djv0Var;
    }

    @Override // a.oyc
    public final void f(div0 div0Var) {
        this.d = false;
        this.e = false;
        xiv0 xiv0Var = this.f;
        if (div0Var.f6156a.b() > 0 && xiv0Var != null) {
            uiv0 uiv0Var = xiv0Var.f40966a;
            djv0 djv0Var = this.c;
            djv0Var.s.f(aem0.w(uiv0Var.i(8)));
            djv0Var.r.f(aem0.w(uiv0Var.i(8)));
            djv0.b(djv0Var, xiv0Var);
        }
        this.f = null;
    }

    @Override // a.oyc
    public final void g(div0 div0Var) {
        this.d = true;
        this.e = true;
    }

    @Override // a.oyc
    public final xiv0 h(xiv0 xiv0Var, List list) {
        djv0 djv0Var = this.c;
        djv0.b(djv0Var, xiv0Var);
        return djv0Var.t ? xiv0.b : xiv0Var;
    }

    @Override // a.oyc
    public final hcp0 i(div0 div0Var, hcp0 hcp0Var) {
        this.d = false;
        return hcp0Var;
    }

    @Override // a.zf60
    public final xiv0 l(View view, xiv0 xiv0Var) {
        this.f = xiv0Var;
        djv0 djv0Var = this.c;
        g3u0 g3u0Var = djv0Var.r;
        uiv0 uiv0Var = xiv0Var.f40966a;
        g3u0Var.f(aem0.w(uiv0Var.i(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            djv0Var.s.f(aem0.w(uiv0Var.i(8)));
            djv0.b(djv0Var, xiv0Var);
        }
        return djv0Var.t ? xiv0.b : xiv0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            xiv0 xiv0Var = this.f;
            if (xiv0Var != null) {
                djv0 djv0Var = this.c;
                djv0Var.s.f(aem0.w(xiv0Var.f40966a.i(8)));
                djv0.b(djv0Var, xiv0Var);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
