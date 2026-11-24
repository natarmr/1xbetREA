package a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class wn8 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39435a;
    public final Drawable b;

    public /* synthetic */ wn8(Drawable drawable, byte b) {
        this.f39435a = b;
        this.b = drawable;
    }

    @Override // a.fhe0
    public final void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        View view;
        int iU;
        byte b = this.f39435a;
        Drawable drawable = this.b;
        canvas.getClass();
        the0Var.getClass();
        switch (b) {
            case 0:
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                yge0 adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    Iterator it = new ihu0(recyclerView).iterator();
                    while (true) {
                        jhu0 jhu0Var = (jhu0) it;
                        if (jhu0Var.hasNext() && (iU = RecyclerView.U((view = (View) jhu0Var.next()))) != -1) {
                            if (iU != adapter.d() - 1) {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                layoutParams.getClass();
                                int bottom = view.getBottom() + ((ViewGroup.MarginLayoutParams) ((hhe0) layoutParams)).bottomMargin;
                                int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom;
                                if (drawable != null) {
                                    drawable.setBounds(paddingLeft, bottom, width, intrinsicHeight);
                                }
                                if (drawable != null) {
                                    drawable.draw(canvas);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                int paddingLeft2 = recyclerView.getPaddingLeft();
                int width2 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount() - 1;
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    if (RecyclerView.U(childAt) >= 0) {
                        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                        layoutParams2.getClass();
                        int bottom2 = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((hhe0) layoutParams2)).bottomMargin;
                        int intrinsicHeight2 = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom2;
                        if (drawable != null) {
                            drawable.setBounds(paddingLeft2, bottom2, width2, intrinsicHeight2);
                        }
                        if (drawable != null) {
                            drawable.draw(canvas);
                        }
                    }
                }
                break;
        }
    }
}
