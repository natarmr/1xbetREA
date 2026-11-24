package a;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class she0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32207a = -1;
    public RecyclerView b;
    public androidx.recyclerview.widget.b c;
    public boolean d;
    public boolean e;
    public View f;
    public final qhe0 g;
    public boolean h;

    public she0() {
        qhe0 qhe0Var = new qhe0();
        qhe0Var.d = -1;
        qhe0Var.f = false;
        qhe0Var.g = 0;
        qhe0Var.f28734a = 0;
        qhe0Var.b = 0;
        qhe0Var.c = Integer.MIN_VALUE;
        qhe0Var.e = null;
        this.g = qhe0Var;
    }

    public static void b(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public PointF a(int i) {
        Object obj = this.c;
        if (obj instanceof rhe0) {
            return ((rhe0) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + rhe0.class.getCanonicalName());
        return null;
    }

    public final void c(int i, int i2) {
        PointF pointFA;
        RecyclerView recyclerView = this.b;
        if (this.f32207a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f == null && this.c != null && (pointFA = a(this.f32207a)) != null) {
            float f = pointFA.x;
            if (f != 0.0f || pointFA.y != 0.0f) {
                recyclerView.x0((int) Math.signum(f), (int) Math.signum(pointFA.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        qhe0 qhe0Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.V(view) == this.f32207a) {
                g(this.f, recyclerView.H1, qhe0Var);
                qhe0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            d(i, i2, recyclerView.H1, qhe0Var);
            boolean z = qhe0Var.d >= 0;
            qhe0Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.E1.b();
            }
        }
    }

    public abstract void d(int i, int i2, the0 the0Var, qhe0 qhe0Var);

    public abstract void f();

    public abstract void g(View view, the0 the0Var, qhe0 qhe0Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.H1.f33958a = -1;
            this.f = null;
            this.f32207a = -1;
            this.d = false;
            androidx.recyclerview.widget.b bVar = this.c;
            if (bVar.e == this) {
                bVar.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    public void e() {
    }
}
