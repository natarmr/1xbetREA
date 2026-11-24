package a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class pyl extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27805a;
    public final boolean b = by7.c().f3402a;

    public pyl(int i) {
        this.f27805a = i;
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        int i;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        int iU = RecyclerView.U(view);
        if (iU == -1) {
            return;
        }
        int iB = the0Var.b();
        int i2 = 0;
        rect.top = 0;
        rect.bottom = 0;
        boolean z = this.b;
        if (z && iU == iB - 1) {
            i = this.f27805a;
        } else {
            i = (z || iU != 0) ? 0 : this.f27805a;
        }
        rect.left = i;
        if (z && iU == 0) {
            i2 = this.f27805a;
        } else if (!z && iU == iB - 1) {
            i2 = this.f27805a;
        }
        rect.right = i2;
    }
}
