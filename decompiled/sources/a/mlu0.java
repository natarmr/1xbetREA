package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class mlu0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f22012a;
    public fbv b;
    public bby c;
    public llu0 d;
    public boolean e;

    public mlu0(View view) {
        this.f22012a = view;
    }

    public final synchronized void a() {
        try {
            bby bbyVar = this.c;
            yje yjeVar = null;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            v7v v7vVar = v7v.f36948a;
            rwj rwjVar = tvk.f34603a;
            this.c = qjj.W(v7vVar, ys10.f43147a.x(), null, new wup0(this, yjeVar, (byte) 13), 2);
            this.b = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        llu0 llu0Var = this.d;
        if (llu0Var == null) {
            return;
        }
        this.e = true;
        llu0Var.f20266a.a(llu0Var.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        llu0 llu0Var = this.d;
        if (llu0Var != null) {
            glz glzVar = llu0Var.d;
            llu0Var.e.cancel(null);
            zjt zjtVar = llu0Var.c;
            if (zjtVar != null && glzVar != null) {
                glzVar.f(zjtVar);
            }
            if (glzVar != null) {
                glzVar.f(llu0Var);
            }
        }
    }
}
