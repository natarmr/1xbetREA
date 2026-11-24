package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class eyb0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f8621a;
    public final int b;
    public final Rect c = new Rect();

    public eyb0(Context context) {
        this.f8621a = context.getDrawable(R.drawable.prized_item_decorator);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.prizes_list_padding_horizontal);
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        yge0 adapter;
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        Drawable drawable = this.f8621a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int iU = RecyclerView.U(view);
        Integer numValueOf = null;
        if (iU != -1 && (adapter = recyclerView.getAdapter()) != null) {
            numValueOf = Integer.valueOf(adapter.f(iU));
        }
        if (numValueOf == null || numValueOf.intValue() == 1) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        }
    }

    @Override // a.fhe0
    public final void g(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        canvas.getClass();
        the0Var.getClass();
        canvas.save();
        Drawable drawable = this.f8621a;
        if (drawable == null) {
            return;
        }
        int width = recyclerView.getWidth();
        int i = this.b;
        int i2 = width - i;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            int iU = RecyclerView.U(childAt);
            if (iU != -1) {
                yge0 adapter = recyclerView.getAdapter();
                Integer numValueOf = adapter != null ? Integer.valueOf(adapter.f(iU)) : null;
                if (numValueOf != null && numValueOf.intValue() != 1) {
                    Rect rect = this.c;
                    RecyclerView.Y(rect, childAt);
                    int iB = si30.b(childAt.getTranslationY()) + rect.bottom;
                    drawable.setBounds(i, iB - drawable.getIntrinsicHeight(), i2, iB);
                    drawable.draw(canvas);
                }
            }
        }
        canvas.restore();
    }
}
