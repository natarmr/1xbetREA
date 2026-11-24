package a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class gvl extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11980a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ gvl(int i, int i2, int i3, byte b) {
        this.f11980a = b;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        byte b = this.f11980a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        switch (b) {
            case 0:
                if (RecyclerView.U(view) >= 0) {
                    rect.bottom = i3;
                    rect.left = i2;
                    rect.right = i;
                    break;
                }
                break;
            case 1:
                rect.top = i3;
                rect.bottom = 0;
                rect.left = i2;
                rect.right = i;
                break;
            case 2:
                rect.top = i3;
                rect.bottom = 0;
                rect.left = i2;
                rect.right = i;
                break;
            default:
                rect.top = i3;
                rect.bottom = 0;
                rect.left = i2;
                rect.right = i;
                break;
        }
    }
}
