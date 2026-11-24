package a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ncu0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23311a;
    public final int b;
    public final int c;
    public final int d;
    public final Function1 e;
    public final int f;
    public final int g;

    public ncu0(int i, int i2, int i3, int i4, int i5) {
        d4u0 d4u0Var = new d4u0((byte) 9);
        this.f23311a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = d4u0Var;
        int i6 = i5 / 2;
        this.f = i6;
        this.g = i5 - i6;
    }

    public static void i(Rect rect, int i, int i2, int i3, int i4, boolean z) {
        Pair pair = z ? new Pair(Integer.valueOf(i3), Integer.valueOf(i)) : new Pair(Integer.valueOf(i), Integer.valueOf(i3));
        rect.set(((Number) pair.f46059a).intValue(), i2, ((Number) pair.b).intValue(), i4);
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        Object objJ;
        int i;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (objJ = kcx.J(recyclerView, view)) == null || !((Boolean) this.e.invoke(objJ)).booleanValue()) {
            return;
        }
        if (!(layoutManager instanceof GridLayoutManager)) {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                throw new IllegalAccessError("Unsupported RecyclerView.LayoutManager");
            }
            i(rect, this.f23311a, this.b, this.c, this.d, ((LinearLayoutManager) layoutManager).b.getLayoutDirection() == 1);
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        rgv rgvVar = layoutParams instanceof rgv ? (rgv) layoutParams : null;
        if (rgvVar == null) {
            return;
        }
        boolean z = gridLayoutManager.b.getLayoutDirection() == 1;
        int i2 = rgvVar.e;
        if (i2 < 0 || i2 >= (i = gridLayoutManager.h1)) {
            return;
        }
        int i3 = rgvVar.f;
        if (i3 >= i) {
            i(rect, this.f23311a, this.b, this.c, this.d, z);
            return;
        }
        if (i2 == 0) {
            i(rect, this.f23311a, this.b, this.g, this.d, z);
            return;
        }
        int i4 = i - i3;
        int i5 = this.f;
        int i6 = this.b;
        if (i2 >= i4) {
            i(rect, i5, i6, this.c, this.d, z);
        } else {
            i(rect, i5, i6, this.g, this.d, z);
        }
    }
}
