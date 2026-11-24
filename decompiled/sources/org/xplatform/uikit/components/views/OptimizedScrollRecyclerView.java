package org.xplatform.uikit.components.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;

/* JADX INFO: loaded from: classes6.dex */
public class OptimizedScrollRecyclerView extends RecyclerView {
    public float m2;
    public float n2;

    /* JADX WARN: Illegal instructions before constructor call */
    public OptimizedScrollRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zQ;
        motionEvent.getClass();
        b layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                zQ = Math.abs(motionEvent.getX() - this.m2) > Math.abs(motionEvent.getY() - this.n2) ? layoutManager.q() : layoutManager.r();
            }
            if (zQ) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
        this.m2 = motionEvent.getX();
        this.n2 = motionEvent.getY();
        zQ = true;
        if (zQ) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptimizedScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptimizedScrollRecyclerView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }
}
