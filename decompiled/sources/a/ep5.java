package a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ep5 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8170a;
    public final int b;
    public final int c;
    public final int d;

    public ep5(Resources resources, int i, int i2) {
        resources.getClass();
        this.f8170a = i;
        this.b = i2;
        this.c = resources.getDimensionPixelSize(R.dimen.space_8);
        this.d = resources.getDimensionPixelSize(R.dimen.space_16);
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        xhe0 xhe0VarW = recyclerView.W(view);
        int iU = RecyclerView.U(view);
        yge0 adapter = recyclerView.getAdapter();
        if (adapter == null) {
            adapter = null;
        }
        if (xhe0VarW == null || adapter == null) {
            return;
        }
        View view2 = xhe0VarW.f40887a;
        if (view2 != null && ((view2 instanceof is5) || (view2 instanceof js5) || (view2 instanceof ks5) || (view2 instanceof ns5))) {
            int i = this.d;
            int i2 = i / 2;
            rect.left = i2;
            rect.right = i - i2;
        } else {
            int i3 = this.c;
            int i4 = i3 / 2;
            rect.left = i4;
            rect.right = i3 - i4;
        }
        boolean z = recyclerView.getLayoutDirection() == 1;
        if (iU == 0) {
            int i5 = this.f8170a;
            if (z) {
                rect.right = i5;
            } else {
                rect.left = i5;
            }
        }
        if (iU == the0Var.b() - 1) {
            int i6 = this.b;
            if (z) {
                rect.left = i6;
            } else {
                rect.right = i6;
            }
        }
    }
}
