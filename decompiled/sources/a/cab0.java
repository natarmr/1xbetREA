package a;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class cab0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4002a;
    public final int b;
    public final int c;
    public final int d;

    public cab0(Resources resources) {
        resources.getClass();
        this.f4002a = resources.getDimensionPixelOffset(R.dimen.space_40);
        this.b = resources.getDimensionPixelOffset(R.dimen.space_32);
        this.c = resources.getDimensionPixelOffset(R.dimen.space_8);
        this.d = resources.getDimensionPixelOffset(R.dimen.space_4);
    }

    public static void i(Rect rect, int i, int i2, int i3, boolean z) {
        Pair pair = z ? new Pair(Integer.valueOf(i2), Integer.valueOf(i)) : new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        rect.set(((Number) pair.f46059a).intValue(), 0, ((Number) pair.b).intValue(), i3);
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        int i;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        xhe0 xhe0VarW = recyclerView.W(view);
        cp cpVar = xhe0VarW instanceof cp ? (cp) xhe0VarW : null;
        yge0 adapter = recyclerView.getAdapter();
        zz3 zz3Var = adapter instanceof zz3 ? (zz3) adapter : null;
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null || cpVar == null || zz3Var == null) {
            return;
        }
        boolean z = cpVar.u() instanceof ghj;
        int i2 = this.c;
        if (z) {
            int i3 = this.f4002a;
            rect.left = i3;
            rect.right = i3;
            rect.top = i2;
            rect.bottom = 0;
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        rgv rgvVar = layoutParams instanceof rgv ? (rgv) layoutParams : null;
        if (rgvVar == null) {
            return;
        }
        boolean z2 = gridLayoutManager.b.getLayoutDirection() == 1;
        int i4 = rgvVar.e;
        if (i4 < 0 || i4 >= (i = gridLayoutManager.h1)) {
            return;
        }
        int i5 = this.d;
        int i6 = this.b;
        if (i4 == 0) {
            i(rect, i6, i5, i2, z2);
        } else if (i4 >= i - rgvVar.f) {
            i(rect, i5, i6, i2, z2);
        } else {
            i(rect, i5, i5, i2, z2);
        }
    }
}
