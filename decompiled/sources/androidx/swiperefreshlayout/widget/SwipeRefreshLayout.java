package androidx.swiperefreshlayout.widget;

import a.apj0;
import a.bkc;
import a.ckc;
import a.eld0;
import a.gjc;
import a.hk50;
import a.ik50;
import a.jk50;
import a.kk50;
import a.mpd0;
import a.rgu0;
import a.von0;
import a.won0;
import a.xon0;
import a.yon0;
import a.zon0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements kk50, jk50, hk50 {
    public static final int[] o1 = {R.attr.enabled};
    public won0 A;
    public won0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f45406a;
    public zon0 b;
    public boolean c;
    public final int d;
    public float e;
    public float f;
    public xon0 f1;
    public final eld0 g;
    public xon0 g1;
    public final ik50 h;
    public boolean h1;
    public final int[] i;
    public int i1;
    public final int[] j;
    public boolean j1;
    public final int[] k;
    public boolean k1;
    public boolean l;
    public final von0 l1;
    public final int m;
    public final won0 m1;
    public int n;
    public final won0 n1;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public final DecelerateInterpolator s;
    public final gjc t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public final ckc z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.j = new int[2];
        this.k = new int[2];
        this.r = -1;
        this.u = -1;
        this.l1 = new von0(this, (byte) 0);
        this.m1 = new won0(this, (byte) 2);
        this.n1 = new won0(this, (byte) 3);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.i1 = (int) (displayMetrics.density * 40.0f);
        gjc gjcVar = new gjc(getContext());
        float f = gjcVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = gjcVar.getContext().obtainStyledAttributes(mpd0.f22174a);
        gjcVar.b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = rgu0.f30456a;
        gjcVar.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(gjcVar.b);
        gjcVar.setBackground(shapeDrawable);
        this.t = gjcVar;
        ckc ckcVar = new ckc(getContext());
        this.z = ckcVar;
        ckcVar.c(1);
        this.t.setImageDrawable(this.z);
        this.t.setVisibility(8);
        addView(this.t);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.x = i;
        this.e = i;
        this.g = new eld0((byte) 9);
        this.h = new ik50(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.i1;
        this.n = i2;
        this.w = i2;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, o1);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.t.getBackground().setAlpha(i);
        this.z.setAlpha(i);
    }

    public final boolean a() {
        View view = this.f45406a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // a.jk50
    public final void b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // a.jk50
    public final void c(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a.jk50
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.h.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.h.d(i, i2, i3, i4, iArr, 0, null);
    }

    public final void e() {
        if (this.f45406a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.t)) {
                    this.f45406a = childAt;
                    return;
                }
            }
        }
    }

    public final void f(float f) {
        if (f > this.e) {
            m(true, true);
            return;
        }
        this.c = false;
        ckc ckcVar = this.z;
        bkc bkcVar = ckcVar.f4499a;
        bkcVar.e = 0.0f;
        bkcVar.f = 0.0f;
        ckcVar.invalidateSelf();
        von0 von0Var = new von0(this, (byte) 1);
        this.v = this.n;
        won0 won0Var = this.n1;
        won0Var.reset();
        won0Var.setDuration(200L);
        won0Var.setInterpolator(this.s);
        gjc gjcVar = this.t;
        gjcVar.f11391a = von0Var;
        gjcVar.clearAnimation();
        gjcVar.startAnimation(won0Var);
        bkc bkcVar2 = ckcVar.f4499a;
        if (bkcVar2.n) {
            bkcVar2.n = false;
        }
        ckcVar.invalidateSelf();
    }

    @Override // a.kk50
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.h.d(i, i2, i3, i4, this.j, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.j[1] + i4 : i7;
        if (i8 >= 0 || a()) {
            return;
        }
        float fAbs = this.f + Math.abs(i8);
        this.f = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.u;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        eld0 eld0Var = this.g;
        return eld0Var.c | eld0Var.b;
    }

    public int getProgressCircleDiameter() {
        return this.i1;
    }

    public int getProgressViewEndOffset() {
        return this.x;
    }

    public int getProgressViewStartOffset() {
        return this.w;
    }

    @Override // a.jk50
    public final void h(View view, int i, int i2, int i3, int i4, int i5) {
        g(view, i, i2, i3, i4, i5, this.k);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.f(0);
    }

    @Override // a.jk50
    public final boolean i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.d;
    }

    public final void j(float f) {
        float f2;
        xon0 xon0Var;
        xon0 xon0Var2;
        ckc ckcVar = this.z;
        bkc bkcVar = ckcVar.f4499a;
        if (!bkcVar.n) {
            bkcVar.n = true;
        }
        ckcVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.e;
        int i = this.y;
        if (i > 0) {
            f2 = i;
        } else {
            boolean z = this.j1;
            int i2 = this.x;
            if (z) {
                i2 -= this.w;
            }
            f2 = i2;
        }
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i3 = this.w + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        gjc gjcVar = this.t;
        if (gjcVar.getVisibility() != 0) {
            gjcVar.setVisibility(0);
        }
        gjcVar.setScaleX(1.0f);
        gjcVar.setScaleY(1.0f);
        if (f < this.e) {
            if (ckcVar.f4499a.t > 76 && ((xon0Var2 = this.f1) == null || !xon0Var2.hasStarted() || xon0Var2.hasEnded())) {
                xon0 xon0Var3 = new xon0(this, ckcVar.f4499a.t, 76);
                xon0Var3.setDuration(300L);
                gjcVar.f11391a = null;
                gjcVar.clearAnimation();
                gjcVar.startAnimation(xon0Var3);
                this.f1 = xon0Var3;
            }
        } else if (ckcVar.f4499a.t < 255 && ((xon0Var = this.g1) == null || !xon0Var.hasStarted() || xon0Var.hasEnded())) {
            xon0 xon0Var4 = new xon0(this, ckcVar.f4499a.t, 255);
            xon0Var4.setDuration(300L);
            gjcVar.f11391a = null;
            gjcVar.clearAnimation();
            gjcVar.startAnimation(xon0Var4);
            this.g1 = xon0Var4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        bkc bkcVar2 = ckcVar.f4499a;
        bkcVar2.e = 0.0f;
        bkcVar2.f = fMin2;
        ckcVar.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        bkc bkcVar3 = ckcVar.f4499a;
        if (fMin3 != bkcVar3.p) {
            bkcVar3.p = fMin3;
        }
        ckcVar.invalidateSelf();
        ckcVar.f4499a.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        ckcVar.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.n);
    }

    public final void k(float f) {
        int i = this.v;
        setTargetOffsetTopAndBottom((i + ((int) ((this.w - i) * f))) - this.t.getTop());
    }

    public final void l() {
        this.t.clearAnimation();
        this.z.stop();
        this.t.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.w - this.n);
        this.n = this.t.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.c != z) {
            this.h1 = z2;
            e();
            this.c = z;
            gjc gjcVar = this.t;
            von0 von0Var = this.l1;
            if (!z) {
                won0 won0Var = new won0(this, (byte) 1);
                this.B = won0Var;
                won0Var.setDuration(150L);
                gjcVar.f11391a = von0Var;
                gjcVar.clearAnimation();
                gjcVar.startAnimation(this.B);
                return;
            }
            this.v = this.n;
            won0 won0Var2 = this.m1;
            won0Var2.reset();
            won0Var2.setDuration(200L);
            won0Var2.setInterpolator(this.s);
            if (von0Var != null) {
                gjcVar.f11391a = von0Var;
            }
            gjcVar.clearAnimation();
            gjcVar.startAnimation(won0Var2);
        }
    }

    public final void n(boolean z, boolean z2) {
        if (!z || this.c == z) {
            m(z, false);
            return;
        }
        this.c = z;
        boolean z3 = this.j1;
        int i = this.x;
        if (!z3) {
            i += this.w;
        }
        setTargetOffsetTopAndBottom(i - this.n);
        this.h1 = z2;
        gjc gjcVar = this.t;
        gjcVar.setVisibility(0);
        this.z.setAlpha(255);
        won0 won0Var = new won0(this, (byte) 0);
        this.A = won0Var;
        won0Var.setDuration(this.m);
        von0 von0Var = this.l1;
        if (von0Var != null) {
            gjcVar.f11391a = von0Var;
        }
        gjcVar.clearAnimation();
        gjcVar.startAnimation(this.A);
    }

    public final void o(float f) {
        float f2 = this.p;
        float f3 = f - f2;
        float f4 = this.d;
        if (f3 <= f4 || this.q) {
            return;
        }
        this.o = f2 + f4;
        this.q = true;
        this.z.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.q = false;
                    this.r = -1;
                } else if (actionMasked == 2) {
                    int i = this.r;
                    if (i == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        o(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.q = false;
                    this.r = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.r) {
                        this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.q;
            }
            setTargetOffsetTopAndBottom(this.w - this.t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.r = pointerId;
            this.q = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.p = motionEvent.getY(iFindPointerIndex2);
                return this.q;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f45406a == null) {
            e();
        }
        View view = this.f45406a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.t.getMeasuredWidth();
        int measuredHeight2 = this.t.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.n;
        this.t.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f45406a == null) {
            e();
        }
        View view = this.f45406a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.t.measure(View.MeasureSpec.makeMeasureSpec(this.i1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.i1, 1073741824));
        this.u = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.t) {
                this.u = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f;
        if (i2 > 0) {
            float f2 = this.f;
            if (f2 > 0.0f) {
                float f3 = i2;
                if (f3 > f2) {
                    iArr[1] = (int) f2;
                    this.f = 0.0f;
                    f = 0.0f;
                } else {
                    f = f2 - f3;
                    this.f = f;
                    iArr[1] = i2;
                }
                j(f);
            }
        }
        if (this.j1 && i2 > 0 && this.f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.t.setVisibility(8);
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        g(view, i, i2, i3, i4, 0, this.k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g.b = i;
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f45407a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g.b = 0;
        this.l = false;
        float f = this.f;
        if (f > 0.0f) {
            f(f);
            this.f = 0.0f;
        } else {
            post(new apj0((Object) this, (byte) 8));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.c && !this.l) {
            if (actionMasked == 0) {
                this.r = motionEvent.getPointerId(0);
                this.q = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.q) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.o) * 0.5f;
                    this.q = false;
                    f(y);
                }
                this.r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.r);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                o(y2);
                if (this.q) {
                    float f = (y2 - this.o) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        j(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.r) {
                            this.r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.r = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.k1 && (view = this.f45406a) != null) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.t.setScaleX(f);
        this.t.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        e();
        ckc ckcVar = this.z;
        bkc bkcVar = ckcVar.f4499a;
        bkcVar.i = iArr;
        bkcVar.a(0);
        bkcVar.a(0);
        ckcVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.k1 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.h.g(z);
    }

    public void setOnRefreshListener(zon0 zon0Var) {
        this.b = zon0Var;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.t.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        n(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.i1 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.i1 = (int) (displayMetrics.density * 40.0f);
            }
            this.t.setImageDrawable(null);
            this.z.c(i);
            this.t.setImageDrawable(this.z);
        }
    }

    public void setSlingshotDistance(int i) {
        this.y = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        gjc gjcVar = this.t;
        gjcVar.bringToFront();
        WeakHashMap weakHashMap = rgu0.f30456a;
        gjcVar.offsetTopAndBottom(i);
        this.n = gjcVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.i(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45407a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f45407a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f45407a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f45407a = z;
        }
    }

    public void setOnChildScrollUpCallback(yon0 yon0Var) {
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
