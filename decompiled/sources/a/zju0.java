package a;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f44498a;

    public zju0(View view) {
        this.f44498a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.f44498a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.f44498a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f44498a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(cku0 cku0Var) {
        View view = (View) this.f44498a.get();
        if (view != null) {
            if (cku0Var != null) {
                view.animate().setListener(new ywv(cku0Var, view, (byte) 3));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.f44498a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
