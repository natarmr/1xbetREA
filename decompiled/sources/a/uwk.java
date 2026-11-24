package a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class uwk extends fhe0 {
    public static final int[] d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f36397a;
    public final boolean b;
    public final Rect c = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    public uwk(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f36397a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.b = i;
        } else {
            jf4.o("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
            throw null;
        }
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        Drawable drawable = this.f36397a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.b) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // a.fhe0
    public final void g(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f36397a == null) {
            return;
        }
        int i = 0;
        boolean z = this.b;
        Rect rect = this.c;
        if (z) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView.Y(rect, childAt);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f36397a.setBounds(paddingLeft, iRound - this.f36397a.getIntrinsicHeight(), width, iRound);
                this.f36397a.draw(canvas);
                i++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            recyclerView.getLayoutManager().M(rect, childAt2);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f36397a.setBounds(iRound2 - this.f36397a.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f36397a.draw(canvas);
            i++;
        }
        canvas.restore();
    }
}
