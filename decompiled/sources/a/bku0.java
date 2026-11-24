package a;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bku0 {
    public Interpolator c;
    public cku0 d;
    public boolean e;
    public long b = -1;
    public final aku0 f = new aku0(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2767a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.f2767a.iterator();
            while (it.hasNext()) {
                ((zju0) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        for (zju0 zju0Var : this.f2767a) {
            long j = this.b;
            if (j >= 0) {
                zju0Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) zju0Var.f44498a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                zju0Var.d(this.f);
            }
            View view2 = (View) zju0Var.f44498a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
