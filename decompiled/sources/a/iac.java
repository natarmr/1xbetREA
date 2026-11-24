package a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class iac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw20 f14431a;
    public View e;
    public byte d = 0;
    public final hac b = new hac();
    public final ArrayList c = new ArrayList();

    public iac(jw20 jw20Var) {
        this.f14431a = jw20Var;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.f14431a.b;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.v(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        xhe0 xhe0VarX = RecyclerView.X(view);
        yge0 yge0Var = recyclerView.m;
        if (yge0Var != null && xhe0VarX != null) {
            yge0Var.s(xhe0VarX);
        }
        ArrayList arrayList = recyclerView.f1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ihe0) recyclerView.f1.get(size)).d(view);
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.f14431a.b;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.v(childCount, z);
        if (z) {
            i(view);
        }
        xhe0 xhe0VarX = RecyclerView.X(view);
        if (xhe0VarX != null) {
            if (!xhe0VarX.m() && !xhe0VarX.r()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(xhe0VarX);
                c99.q(sb, recyclerView.H());
                return;
            } else {
                if (RecyclerView.e2) {
                    Log.d("RecyclerView", "reAttach " + xhe0VarX);
                }
                xhe0VarX.j &= -257;
            }
        } else if (RecyclerView.d2) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strH = recyclerView.H();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strH);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.b.x(iF);
        RecyclerView recyclerView = (RecyclerView) this.f14431a.b;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            xhe0 xhe0VarX = RecyclerView.X(childAt);
            if (xhe0VarX != null) {
                if (xhe0VarX.m() && !xhe0VarX.r()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(xhe0VarX);
                    c99.q(sb, recyclerView.H());
                    return;
                } else {
                    if (RecyclerView.e2) {
                        Log.d("RecyclerView", "tmpDetach " + xhe0VarX);
                    }
                    xhe0VarX.b(256);
                }
            }
        } else if (RecyclerView.d2) {
            c99.k(iF, "No view at offset ", recyclerView.H());
            return;
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return ((RecyclerView) this.f14431a.b).getChildAt(f(i));
    }

    public final int e() {
        return ((RecyclerView) this.f14431a.b).getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) this.f14431a.b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            hac hacVar = this.b;
            int iR = i - (i2 - hacVar.r(i2));
            if (iR == 0) {
                while (hacVar.t(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iR;
        }
        return -1;
    }

    public final View g(int i) {
        return ((RecyclerView) this.f14431a.b).getChildAt(i);
    }

    public final int h() {
        return ((RecyclerView) this.f14431a.b).getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        xhe0 xhe0VarX = RecyclerView.X(view);
        if (xhe0VarX != null) {
            View view2 = xhe0VarX.f40887a;
            RecyclerView recyclerView = (RecyclerView) this.f14431a.b;
            int i = xhe0VarX.q;
            if (i != -1) {
                xhe0VarX.p = i;
            } else {
                xhe0VarX.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.c0()) {
                view2.setImportantForAccessibility(4);
            } else {
                xhe0VarX.q = 4;
                recyclerView.V1.add(xhe0VarX);
            }
        }
    }

    public final int j(View view) {
        int iIndexOfChild = ((RecyclerView) this.f14431a.b).indexOfChild(view);
        if (iIndexOfChild != -1) {
            hac hacVar = this.b;
            if (!hacVar.t(iIndexOfChild)) {
                return iIndexOfChild - hacVar.r(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i) {
        jw20 jw20Var = this.f14431a;
        byte b = this.d;
        if (b == 1) {
            jf4.n("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            jf4.n("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iF = f(i);
            View childAt = ((RecyclerView) jw20Var.b).getChildAt(iF);
            if (childAt == null) {
                return;
            }
            this.d = (byte) 1;
            this.e = childAt;
            if (this.b.x(iF)) {
                l(childAt);
            }
            jw20Var.o(iF);
        } finally {
            this.d = (byte) 0;
            this.e = null;
        }
    }

    public final void l(View view) {
        xhe0 xhe0VarX;
        if (!this.c.remove(view) || (xhe0VarX = RecyclerView.X(view)) == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.f14431a.b;
        int i = xhe0VarX.p;
        if (recyclerView.c0()) {
            xhe0VarX.q = i;
            recyclerView.V1.add(xhe0VarX);
        } else {
            xhe0VarX.f40887a.setImportantForAccessibility(i);
        }
        xhe0VarX.p = 0;
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
