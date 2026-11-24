package org.xplatform.ui_core.viewcomponents.views;

import a.acm0;
import a.hrf0;
import a.jf4;
import a.jw5;
import a.no8;
import a.rgu0;
import a.son0;
import a.t9f;
import a.ton0;
import a.ygu0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class SwipeBackLayout extends ViewGroup {
    public static final /* synthetic */ int q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygu0 f47212a;
    public int b;
    public int c;
    public byte d;
    public int e;
    public float f;
    public float g;
    public float h;
    public son0 i;
    public View j;
    public View k;
    public ton0 l;
    public boolean m;
    public float n;
    public Function0 o;
    public Function2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.i = son0.f32552a;
        this.l = ton0.d;
        this.m = true;
        this.o = new hrf0(context, (byte) 22);
        this.p = new acm0((byte) 13);
        ygu0 ygu0Var = new ygu0(getContext(), this, new no8(this, (byte) 2));
        ygu0Var.b = (int) (12.658227f * ygu0Var.b);
        this.f47212a = ygu0Var;
        setOnTouchListener(new jw5(this, (byte) 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDragRange() {
        int iOrdinal = this.l.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return 0;
                    }
                }
            }
            return this.b;
        }
        return this.c;
    }

    private final void setDragDirectMode(son0 son0Var) {
        this.i = son0Var;
        if (son0Var == son0.b) {
            this.l = ton0.b;
        } else if (son0Var == son0.c) {
            this.l = ton0.f34294a;
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f47212a.f()) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            postInvalidateOnAnimation();
        }
    }

    public final Function0<Unit> getDoOnFinish() {
        return this.o;
    }

    public final Function2<Float, Float, Unit> getDoOnSwipeBack() {
        return this.p;
    }

    public final boolean getEnableFlingBack() {
        return this.m;
    }

    public final float getFinishAnchor() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        boolean zO = false;
        if (this.j == null) {
            if (getChildCount() > 1) {
                jf4.n("SwipeBackLayout must contains only one direct child");
                return false;
            }
            View childAt = getChildAt(0);
            this.j = childAt;
            if (this.k == null && childAt != null) {
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    this.k = viewGroup;
                    if (viewGroup.getChildCount() > 0) {
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt2 = viewGroup.getChildAt(i);
                            childAt2.getClass();
                            if ((childAt2 instanceof AbsListView) || (childAt2 instanceof ScrollView) || (childAt2 instanceof ViewPager) || (childAt2 instanceof WebView)) {
                                this.k = childAt2;
                                break;
                            }
                        }
                    }
                } else {
                    this.k = childAt;
                }
            }
        }
        boolean zIsEnabled = isEnabled();
        ygu0 ygu0Var = this.f47212a;
        if (zIsEnabled) {
            zO = ygu0Var.o(motionEvent);
        } else {
            ygu0Var.a();
        }
        return zO ? zO : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int paddingLeft2 = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        childAt.layout(paddingLeft2, paddingTop2, paddingLeft + paddingLeft2, paddingTop + paddingTop2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 1) {
            jf4.n("SwipeBackLayout must contains only one direct child.");
        } else if (getChildCount() > 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        this.b = i2;
        this.c = i;
        int iOrdinal = this.l.ordinal();
        if (iOrdinal == 0) {
            f = this.n;
            if (f <= 0.0f) {
                i5 = this.c;
                f = i5 * 0.5f;
            }
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    f = this.n;
                    if (f <= 0.0f) {
                        i5 = this.c;
                        f = i5 * 0.5f;
                    }
                } else if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
            }
            f = this.n;
            if (f <= 0.0f) {
                i5 = this.b;
                f = i5 * 0.5f;
            }
        }
        this.n = f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        super.onTouchEvent(motionEvent);
        this.f47212a.i(motionEvent);
        return true;
    }

    public final void setDoOnFinish(Function0<Unit> function0) {
        function0.getClass();
        this.o = function0;
    }

    public final void setDoOnSwipeBack(Function2<? super Float, ? super Float, Unit> function2) {
        function2.getClass();
        this.p = function2;
    }

    public final void setEnableFlingBack(boolean z) {
        this.m = z;
    }

    public final void setFinishAnchor(float f) {
        this.n = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeBackLayout(Context context) {
        this(context, null);
        context.getClass();
    }
}
