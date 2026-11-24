package a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class pmk0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27240a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Function1 f;
    public final boolean g;
    public final int h;
    public final int i;

    public pmk0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        i2 = (i7 & 2) != 0 ? 0 : i2;
        i3 = (i7 & 4) != 0 ? 0 : i3;
        i4 = (i7 & 8) != 0 ? 0 : i4;
        ejk0 ejk0Var = new ejk0((byte) 2);
        this.f27240a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = ejk0Var;
        this.g = false;
        int i8 = i / 2;
        this.h = i8;
        this.i = i - i8;
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        int i;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        int iU = RecyclerView.U(view);
        if (iU == -1) {
            iU = RecyclerView.V(view);
        }
        if (iU == -1) {
            return;
        }
        yge0 adapter = recyclerView.getAdapter();
        int iD = adapter != null ? adapter.d() : the0Var.b();
        xhe0 xhe0VarW = recyclerView.W(view);
        if (((Boolean) this.f.invoke(xhe0VarW instanceof cp ? ((cp) xhe0VarW).u() : null)).booleanValue()) {
            int i2 = this.d;
            int i3 = this.b;
            boolean z = this.g;
            int i4 = this.i;
            int i5 = this.c;
            int i6 = this.h;
            int i7 = this.f27240a;
            int i8 = this.e;
            if (i8 != 0) {
                if (i8 != 1) {
                    return;
                }
                rect.left = i7;
                rect.top = i6;
                rect.right = i5;
                rect.bottom = i4;
                int i9 = z ? iD - 1 : 0;
                i = z ? 0 : iD - 1;
                if (iU == i9) {
                    rect.top = i3;
                    return;
                } else {
                    if (iU == i) {
                        rect.bottom = i2;
                        return;
                    }
                    return;
                }
            }
            boolean z2 = recyclerView.getLayoutDirection() == 1;
            rect.left = i6;
            rect.top = i3;
            rect.right = i4;
            rect.bottom = i2;
            int i10 = z ? iD - 1 : 0;
            i = z ? 0 : iD - 1;
            if (iU == i10) {
                if (z2) {
                    rect.right = i7;
                    return;
                } else {
                    rect.left = i7;
                    return;
                }
            }
            if (iU == i) {
                if (z2) {
                    rect.left = i5;
                } else {
                    rect.right = i5;
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pmk0(int i, int i2, int i3, int i4, int i5) {
        int i6 = (i5 & 4) != 0 ? 0 : i3;
        this(i, i2, i6, i2, i6, i4, 64);
    }
}
