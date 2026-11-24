package a;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class yge0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zge0 f42580a = new zge0();
    public boolean b = false;
    public int c = 1;

    public final void a(xhe0 xhe0Var, int i) {
        yge0 yge0Var = xhe0Var.s;
        View view = xhe0Var.f40887a;
        boolean z = yge0Var == null;
        if (z) {
            xhe0Var.c = i;
            if (this.b) {
                xhe0Var.e = e(i);
            }
            xhe0Var.j = (xhe0Var.j & (-520)) | 1;
            if (ebs0.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(xhe0Var.f)));
            }
        }
        xhe0Var.s = this;
        if (RecyclerView.d2) {
            if (view.getParent() == null && view.isAttachedToWindow() != xhe0Var.m()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + xhe0Var.m() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + xhe0Var);
            }
            if (view.getParent() == null && view.isAttachedToWindow()) {
                e9d0.v(xhe0Var, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                return;
            }
        }
        o(xhe0Var, i, xhe0Var.f());
        if (z) {
            ArrayList arrayList = xhe0Var.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            xhe0Var.j &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof hhe0) {
                ((hhe0) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public final xhe0 b(ViewGroup viewGroup, int i) {
        try {
            if (ebs0.a()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
            }
            xhe0 xhe0VarP = p(viewGroup, i);
            if (xhe0VarP.f40887a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            xhe0VarP.f = i;
            Trace.endSection();
            return xhe0VarP;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public int c(yge0 yge0Var, xhe0 xhe0Var, int i) {
        if (yge0Var == this) {
            return i;
        }
        return -1;
    }

    public int d() {
        return 2;
    }

    public long e(int i) {
        return -1L;
    }

    public int f(int i) {
        return 0;
    }

    public final void g() {
        this.f42580a.b();
    }

    public final void h(int i) {
        this.f42580a.d(i, 1, null);
    }

    public final void i(int i, int i2) {
        this.f42580a.c(i, i2);
    }

    public final void j(int i, int i2, Object obj) {
        this.f42580a.d(i, i2, obj);
    }

    public final void k(int i, int i2) {
        this.f42580a.e(i, i2);
    }

    public final void l(int i, int i2) {
        this.f42580a.f(i, i2);
    }

    public abstract void n(xhe0 xhe0Var, int i);

    public void o(xhe0 xhe0Var, int i, List list) {
        n(xhe0Var, i);
    }

    public xhe0 p(ViewGroup viewGroup, int i) {
        int i2 = m6r.u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new m6r(frameLayout);
    }

    public boolean r(xhe0 xhe0Var) {
        return false;
    }

    public final void v(ahe0 ahe0Var) {
        this.f42580a.registerObserver(ahe0Var);
    }

    public final void w(boolean z) {
        if (this.f42580a.a()) {
            jf4.n("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = z;
        }
    }

    public void x(int i) {
        this.c = i;
        this.f42580a.g();
    }

    public final void y(ahe0 ahe0Var) {
        this.f42580a.unregisterObserver(ahe0Var);
    }

    public void m(RecyclerView recyclerView) {
    }

    public void q(RecyclerView recyclerView) {
    }

    public void s(xhe0 xhe0Var) {
    }

    public void t(xhe0 xhe0Var) {
    }

    public void u(xhe0 xhe0Var) {
    }
}
