package a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class vwk extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38155a = 1;
    public final int b;
    public final Object c;

    public vwk(int i) {
        ejk0 ejk0Var = new ejk0((byte) 2);
        this.b = i;
        this.c = ejk0Var;
    }

    @Override // a.fhe0
    public void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        switch (this.f38155a) {
            case 1:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                if (RecyclerView.V(view) == 0 && ((Boolean) ((Function1) this.c).invoke(kcx.J(recyclerView, view))).booleanValue()) {
                    rect.top = this.b;
                } else {
                    rect.top = 0;
                }
                break;
            default:
                super.f(rect, view, recyclerView, the0Var);
                break;
        }
    }

    @Override // a.fhe0
    public void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        switch (this.f38155a) {
            case 0:
                Drawable drawable = (Drawable) this.c;
                canvas.getClass();
                the0Var.getClass();
                int paddingLeft = recyclerView.getPaddingLeft();
                int i = this.b;
                int i2 = paddingLeft + i;
                int width = recyclerView.getWidth() - (recyclerView.getPaddingRight() + i);
                int childCount = recyclerView.getChildCount() - 2;
                if (childCount >= 0) {
                    int i3 = 0;
                    while (true) {
                        View childAt = recyclerView.getChildAt(i3);
                        childAt.getClass();
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        layoutParams.getClass();
                        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((hhe0) layoutParams)).bottomMargin;
                        int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
                        if (drawable != null) {
                            drawable.setBounds(i2, bottom, width, intrinsicHeight);
                        }
                        if (drawable != null) {
                            drawable.draw(canvas);
                        }
                        if (i3 != childCount) {
                            i3++;
                        }
                    }
                }
                break;
        }
    }

    public vwk(Drawable drawable, int i) {
        this.c = drawable;
        this.b = i;
    }
}
