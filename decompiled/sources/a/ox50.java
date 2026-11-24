package a;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class ox50 extends ViewGroup implements dqs0, sps0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25995a;
    public rh60 b;
    public boolean c;
    public int d;

    private final void setAlphaToSafes(float f) {
        IntRange intRangeO = l1e0.o(0, getChildCount());
        ArrayList arrayList = new ArrayList();
        for (Object obj : intRangeO) {
            if (((Number) obj).intValue() != this.d) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getChildAt(((Number) it.next()).intValue()).setAlpha(f);
        }
    }

    @Override // a.dqs0
    public final void a(int i, int i2, cym0 cym0Var) {
        View childAt = getChildAt(i);
        childAt.getClass();
        setAlphaToSafes(0.35f);
        ((htg0) childAt).c(i2, cym0Var);
    }

    @Override // a.dqs0
    public final void b(boolean z) {
        egi0 egi0VarA = igi0.a((Function2) phu0.M(this).b);
        while (egi0VarA.hasNext()) {
            ((View) egi0VarA.next()).setEnabled(z);
        }
    }

    @Override // a.sps0
    public final void c() {
        this.c = false;
    }

    @Override // a.dqs0
    public final void d(int i, int i2) {
        this.c = true;
        this.d = i;
        View childAt = getChildAt(i);
        childAt.getClass();
        setAlphaToSafes(0.35f);
        ((htg0) childAt).d(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet;
        super.onDetachedFromWindow();
        Iterator it = l1e0.o(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((bkx) it).nextInt());
            htg0 htg0Var = childAt instanceof htg0 ? (htg0) childAt : null;
            if (htg0Var != null && (animatorSet = htg0Var.d) != null) {
                animatorSet.cancel();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getMeasuredWidth() > getMeasuredHeight();
        int measuredHeight = z2 ? getMeasuredHeight() : getMeasuredWidth();
        int measuredHeight2 = z2 ? 0 : (getMeasuredHeight() - measuredHeight) / 2;
        int measuredWidth = z2 ? (getMeasuredWidth() - measuredHeight) / 2 : 0;
        int i5 = measuredHeight / 3;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int i9 = this.f25995a;
            i6++;
            int i10 = i7 + 1;
            childAt.layout((i5 * i6) + measuredWidth + i9, vqd.a(i5, i7, measuredHeight2, i9), ((i5 * i6) + measuredWidth) - i9, ((i5 * i10) + measuredHeight2) - i9);
            if (i6 == 3) {
                i6 = 0;
                i7 = i10;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() > getMeasuredHeight() ? getMeasuredHeight() : getMeasuredWidth()) / 3) - (this.f25995a * 2), Integer.MIN_VALUE);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    @Override // a.dqs0
    public final void reset() {
        this.c = false;
        Iterator it = l1e0.o(0, getChildCount()).iterator();
        while (((kkx) it).c) {
            View childAt = getChildAt(((bkx) it).nextInt());
            htg0 htg0Var = childAt instanceof htg0 ? (htg0) childAt : null;
            if (htg0Var != null) {
                htg0Var.a();
            }
        }
        setAlphaToSafes(1.0f);
    }

    @Override // a.dqs0
    public void setOnSelectedListener(rh60 rh60Var) {
        rh60Var.getClass();
        this.b = rh60Var;
    }

    @Override // a.sps0
    public final void f() {
    }
}
