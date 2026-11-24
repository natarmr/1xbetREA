package a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class icu0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14553a;
    public final int b;
    public final int c;
    public final int d;
    public final e4p e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public icu0(int i, int i2, int i3, int i4, e4p e4pVar, int i5, int i6) {
        rmk0 rmk0Var = rmk0.b;
        this.f14553a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = e4pVar;
        int i7 = i5 / 2;
        this.f = i7;
        this.g = i5 - i7;
        int i8 = (int) (i6 * 0.0f);
        this.h = i8;
        this.i = i6 - i8;
    }

    public static void i(Rect rect, int i, int i2, int i3, int i4, boolean z) {
        Pair pair = z ? new Pair(Integer.valueOf(i3), Integer.valueOf(i)) : new Pair(Integer.valueOf(i), Integer.valueOf(i3));
        rect.set(((Number) pair.f46059a).intValue(), i2, ((Number) pair.b).intValue(), i4);
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        Object objJ;
        Pair pair;
        Pair pair2;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (objJ = kcx.J(recyclerView, view)) == null || !((Boolean) this.e.invoke(objJ)).booleanValue()) {
            return;
        }
        boolean z = layoutManager instanceof GridLayoutManager;
        int i = this.d;
        int i2 = this.h;
        int i3 = this.b;
        int i4 = this.i;
        if (!z) {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                throw new IllegalAccessError("Unsupported RecyclerView.LayoutManager");
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            boolean z2 = linearLayoutManager.b.getLayoutDirection() == 1;
            int iU = RecyclerView.U(view);
            int iS = linearLayoutManager.S();
            if (iU == 0) {
                pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
            } else {
                pair = iU == iS - 1 ? new Pair(Integer.valueOf(i2), Integer.valueOf(i)) : new Pair(Integer.valueOf(i2), Integer.valueOf(i4));
            }
            i(rect, this.f14553a, ((Number) pair.f46059a).intValue(), this.c, ((Number) pair.b).intValue(), z2);
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        rgv rgvVar = layoutParams instanceof rgv ? (rgv) layoutParams : null;
        if (rgvVar == null) {
            return;
        }
        boolean z3 = gridLayoutManager.b.getLayoutDirection() == 1;
        int i5 = gridLayoutManager.h1;
        int iS2 = gridLayoutManager.S();
        int iC = rgvVar.f13060a.c();
        int i6 = rgvVar.e;
        if (i6 < 0 || i6 >= i5) {
            return;
        }
        int i7 = iC / i5;
        int i8 = (iS2 - 1) / i5;
        if (i7 == 0) {
            pair2 = new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
        } else {
            pair2 = i7 == i8 ? new Pair(Integer.valueOf(i2), Integer.valueOf(i)) : new Pair(Integer.valueOf(i2), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) pair2.f46059a).intValue();
        int iIntValue2 = ((Number) pair2.b).intValue();
        int i9 = rgvVar.f;
        if (i9 >= i5) {
            i(rect, this.f14553a, iIntValue, this.c, iIntValue2, z3);
            return;
        }
        int i10 = rgvVar.e;
        if (i10 == 0) {
            i(rect, this.f14553a, iIntValue, this.g, iIntValue2, z3);
            return;
        }
        int i11 = i5 - i9;
        int i12 = this.f;
        if (i10 >= i11) {
            i(rect, i12, iIntValue, this.c, iIntValue2, z3);
        } else {
            i(rect, i12, iIntValue, this.g, iIntValue2, z3);
        }
    }
}
