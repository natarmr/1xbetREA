package org.xplatform.cyber.game.core;

import a.kk50;
import a.si30;
import a.vj50;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class HeaderNestedScrollContainer extends FrameLayout implements kk50 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderNestedScrollContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // a.jk50
    public final void b(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
    }

    @Override // a.jk50
    public final void c(View view, int i) {
        view.getClass();
    }

    @Override // a.jk50
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        view.getClass();
    }

    @Override // a.kk50
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        vj50 nestedScrollConnection;
        view.getClass();
        if (i4 >= 0) {
            return;
        }
        InterceptTouchRecyclerView interceptTouchRecyclerView = view instanceof InterceptTouchRecyclerView ? (InterceptTouchRecyclerView) view : null;
        if (interceptTouchRecyclerView == null || (nestedScrollConnection = interceptTouchRecyclerView.getNestedScrollConnection()) == null) {
            return;
        }
        int iB = si30.b(-Float.intBitsToFloat((int) (nestedScrollConnection.S(i5 == 0 ? 1 : 2, 0L, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-i4)) & 4294967295L)) & 4294967295L)));
        if (iB != 0) {
            iArr[1] = iArr[1] + iB;
        }
    }

    @Override // a.jk50
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        view.getClass();
    }

    @Override // a.jk50
    public final boolean i(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        view.getClass();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        view.getClass();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        view.getClass();
        iArr.getClass();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        view.getClass();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        view.getClass();
        view2.getClass();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        view.getClass();
        view2.getClass();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        view.getClass();
    }
}
