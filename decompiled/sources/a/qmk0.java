package a;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class qmk0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28988a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Function1 f;
    public final boolean g;
    public final int h;
    public final int i;

    /* JADX WARN: Multi-variable type inference failed */
    public qmk0(int i, int i2, int i3, int i4, int i5, int i6, Function1 function1, rmk0 rmk0Var, int i7) {
        i2 = (i7 & 2) != 0 ? 0 : i2;
        i3 = (i7 & 4) != 0 ? 0 : i3;
        i4 = (i7 & 8) != 0 ? 0 : i4;
        i5 = (i7 & 16) != 0 ? 0 : i5;
        function1 = (i7 & 64) != 0 ? new ejk0((byte) 2) : function1;
        rmk0Var = (i7 & 128) != 0 ? rmk0.c : rmk0Var;
        boolean zC = (i7 & 256) != 0 ? cy7.c() : false;
        this.f28988a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = function1;
        this.g = zC;
        int i8 = (int) (i * rmk0Var.f30748a);
        this.h = i8;
        this.i = i - i8;
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        int iU = RecyclerView.U(view);
        if (iU == -1) {
            iU = RecyclerView.V(view);
        }
        if (iU == -1) {
            Log.w(qmk0.class.getSimpleName(), "No position for item in RecyclerView");
            return;
        }
        if (((Boolean) this.f.invoke(kcx.J(recyclerView, view))).booleanValue()) {
            int i = this.d;
            int i2 = this.b;
            int i3 = this.i;
            int i4 = this.c;
            int i5 = this.h;
            int i6 = this.f28988a;
            boolean z = this.e;
            if (z) {
                if (!z) {
                    return;
                }
                rect.left = i6;
                rect.top = i5;
                rect.right = i4;
                rect.bottom = i3;
                if (iU == 0) {
                    rect.top = i2;
                }
                if (iU == the0Var.b() - 1) {
                    rect.bottom = i;
                    return;
                }
                return;
            }
            rect.left = i5;
            rect.top = i2;
            rect.right = i3;
            rect.bottom = i;
            boolean z2 = this.g;
            if (iU == 0) {
                if (z2) {
                    rect.right = i6;
                } else {
                    rect.left = i6;
                }
            }
            if (iU == the0Var.b() - 1) {
                if (z2) {
                    rect.left = i4;
                } else {
                    rect.right = i4;
                }
            }
        }
    }

    public qmk0(int i) {
        this(i, 0, 0, 0, 0, 1, null, null, 448);
    }
}
