package a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fvl extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10221a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final List g;

    public fvl(int i, int i2, int i3, int i4, int i5, boolean z, List list) {
        list.getClass();
        this.f10221a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = list;
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        int iU = RecyclerView.U(view);
        if (iU >= 0 && !m0x0.R(m0x0.O(recyclerView, iU), this.g)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            rgv rgvVar = layoutParams instanceof rgv ? (rgv) layoutParams : null;
            if (rgvVar != null) {
                int i = rgvVar.f;
                int i2 = this.c;
                int i3 = this.b;
                int i4 = this.f10221a;
                int i5 = this.d;
                if (i == 2) {
                    rect.bottom = i5;
                    rect.left = i3;
                    rect.right = i2;
                    rect.top = i4;
                    return;
                }
                int i6 = rgvVar.e;
                int i7 = this.e;
                boolean z = this.f;
                if ((i6 == 0 && !z) || (i6 == 1 && z)) {
                    rect.bottom = i5;
                    rect.left = i3;
                    rect.right = i7 / 2;
                    rect.top = i4;
                    return;
                }
                if (i6 == 1 || (i6 == 0 && z)) {
                    rect.bottom = i5;
                    rect.left = i7 / 2;
                    rect.right = i2;
                    rect.top = i4;
                    return;
                }
                rect.bottom = i5;
                int i8 = i7 / 2;
                rect.left = i8;
                rect.right = i8;
                rect.top = i4;
            }
        }
    }
}
