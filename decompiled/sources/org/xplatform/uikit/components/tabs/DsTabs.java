package org.xplatform.uikit.components.tabs;

import a.akc;
import a.aoo0;
import a.b99;
import a.hne;
import a.jmu0;
import a.m5d;
import a.q3d;
import a.q4i;
import a.r3d;
import a.s4i;
import a.s9m0;
import a.t9f;
import a.tje;
import a.wg;
import a.x4d;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes6.dex */
public final class DsTabs extends HorizontalScrollView {
    public static final /* synthetic */ int g1 = 0;
    public float A;
    public float B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47270a;
    public final LinearLayout b;
    public final DsSeparator c;
    public final int d;
    public final int e;
    public final int f;
    public int f1;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public final ArrayList t;
    public aoo0 u;
    public Function1 v;
    public boolean w;
    public ValueAnimator x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsTabs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f47270a = new View(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(0);
        this.b = linearLayout;
        this.c = new DsSeparator(new tje(context, R.style.Widget_DSSeparator_Separator60), null, 0);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_56);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_68);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_40);
        this.g = getResources().getDimensionPixelSize(R.dimen.size_52);
        this.h = getResources().getDimensionPixelSize(R.dimen.size_64);
        this.i = getResources().getDimensionPixelSize(R.dimen.size_3);
        this.j = getResources().getDimensionPixelSize(R.dimen.size_6);
        this.k = getResources().getDimensionPixelSize(R.dimen.size_4);
        this.l = getResources().getDimensionPixelSize(R.dimen.size_8);
        this.m = getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
        this.n = getResources().getDimensionPixelOffset(R.dimen.space_8);
        this.o = getResources().getDimensionPixelOffset(R.dimen.space_1);
        this.q = R.attr.uikitPrimary;
        this.r = R.attr.uikitSecondary;
        this.s = R.attr.uikitBackground;
        this.t = new ArrayList();
        this.u = aoo0.b;
        setTag("DsTabs");
        setScrollBarSize(0);
        setHorizontalScrollBarEnabled(false);
        addView(linearLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(FrameLayout frameLayout, final DsTabs dsTabs) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float measuredWidth;
        ValueAnimator valueAnimator3;
        if (frameLayout.isSelected()) {
            return;
        }
        int i = dsTabs.y;
        View view = dsTabs.f47270a;
        ArrayList arrayList = dsTabs.t;
        dsTabs.z = i;
        dsTabs.y = arrayList.indexOf(frameLayout);
        q4i q4iVar = (q4i) frameLayout;
        dsTabs.j(q4iVar);
        final byte b = 1;
        final byte b2 = 0;
        if (dsTabs.f()) {
            ValueAnimator valueAnimator4 = dsTabs.x;
            if (valueAnimator4 != null) {
                valueAnimator4.end();
            }
            dsTabs.A = view.getX();
            LinearLayout linearLayout = dsTabs.b;
            int i2 = dsTabs.m;
            boolean z = dsTabs.getLayoutDirection() == 0;
            if (dsTabs.f() && dsTabs.g()) {
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    if (Intrinsics.d((q4i) obj, q4iVar)) {
                        dsTabs.y = i3;
                    }
                    i3 = i4;
                }
                float fE = dsTabs.e(dsTabs.g());
                measuredWidth = z ? (dsTabs.y * fE) + i2 : ((linearLayout.getMeasuredWidth() - i2) - (dsTabs.y * fE)) - ((q4i) arrayList.get(dsTabs.z)).b(dsTabs.getSelectedTabWidthForScrollableBubbleTab());
                valueAnimator2 = null;
            } else if (dsTabs.f()) {
                int iMax = Math.max(((linearLayout.getMeasuredWidth() - i2) - i2) / arrayList.size(), dsTabs.getSelectedTabMinWidthForFixedBubbleTab());
                int measuredWidth2 = (((linearLayout.getMeasuredWidth() - iMax) - i2) - i2) / (arrayList.size() - 1);
                int i5 = 0;
                valueAnimator2 = null;
                int i6 = 0;
                for (Object obj2 : arrayList) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        q3d.p();
                        throw null;
                    }
                    if (Intrinsics.d((q4i) obj2, q4iVar)) {
                        i6 = i5;
                    }
                    i5 = i7;
                }
                measuredWidth = z ? (i6 * measuredWidth2) + i2 : ((linearLayout.getMeasuredWidth() - i2) - (i6 * measuredWidth2)) - iMax;
            } else {
                valueAnimator2 = null;
                measuredWidth = 0.0f;
            }
            dsTabs.B = measuredWidth;
            dsTabs.f1 = view.getWidth();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(dsTabs) { // from class: a.o5n
                    public final /* synthetic */ DsTabs b;

                    {
                        this.b = dsTabs;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        byte b3 = b2;
                        DsTabs dsTabs2 = this.b;
                        switch (b3) {
                            case 0:
                                int i8 = DsTabs.g1;
                                valueAnimator5.getClass();
                                dsTabs2.requestLayout();
                                break;
                            default:
                                int i9 = DsTabs.g1;
                                valueAnimator5.getClass();
                                dsTabs2.i();
                                break;
                        }
                    }
                });
                valueAnimatorOfFloat.addListener(new akc(dsTabs, q4iVar, (byte) 6));
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.start();
                valueAnimator3 = valueAnimatorOfFloat;
            } else {
                valueAnimator3 = valueAnimator2;
            }
            dsTabs.x = valueAnimator3;
        } else {
            ValueAnimator valueAnimator5 = dsTabs.x;
            if (valueAnimator5 != null) {
                valueAnimator5.end();
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(view.getX(), ((View) q4iVar).getX());
            if (valueAnimatorOfFloat2 != null) {
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(dsTabs) { // from class: a.o5n
                    public final /* synthetic */ DsTabs b;

                    {
                        this.b = dsTabs;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator6) {
                        byte b3 = b;
                        DsTabs dsTabs2 = this.b;
                        switch (b3) {
                            case 0:
                                int i8 = DsTabs.g1;
                                valueAnimator6.getClass();
                                dsTabs2.requestLayout();
                                break;
                            default:
                                int i9 = DsTabs.g1;
                                valueAnimator6.getClass();
                                dsTabs2.i();
                                break;
                        }
                    }
                });
                valueAnimatorOfFloat2.setDuration(300L);
                valueAnimatorOfFloat2.start();
                valueAnimator = valueAnimatorOfFloat2;
            } else {
                valueAnimator = null;
            }
            dsTabs.x = valueAnimator;
        }
        Function1 function1 = dsTabs.v;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(dsTabs.y));
        }
        q4i q4iVar2 = (q4i) CollectionsKt.W(dsTabs.y, arrayList);
        if (q4iVar2 == null) {
            return;
        }
        int[] iArr = new int[2];
        q4iVar2.getLocationOnScreen(iArr);
        int i8 = iArr[0];
        dsTabs.smoothScrollBy((((q4iVar2.getMeasuredWidth() + i8) + i8) / 2) - (dsTabs.getMeasuredWidth() / 2), 0);
    }

    private final int getBubbleScrollableIndicatorWidthDifference() {
        int i = this.z;
        ArrayList arrayList = this.t;
        q4i q4iVar = (q4i) arrayList.get(i);
        q4i q4iVar2 = (q4i) arrayList.get(this.y);
        int selectedTabWidthForScrollableBubbleTab = getSelectedTabWidthForScrollableBubbleTab();
        return q4iVar2.b(selectedTabWidthForScrollableBubbleTab) - q4iVar.b(selectedTabWidthForScrollableBubbleTab);
    }

    private final int getParentHeight() {
        if (f()) {
            return this.g;
        }
        if (this.w) {
            return this.f;
        }
        return g() ? this.e : this.d;
    }

    private final float getScreenSize() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return displayMetrics.widthPixels / displayMetrics.density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSelectedTabMinWidthForFixedBubbleTab() {
        float screenSize = getScreenSize();
        if (screenSize < 360.0f) {
            return getResources().getDimensionPixelSize(R.dimen.size_120);
        }
        return screenSize >= 480.0f ? getResources().getDimensionPixelSize(R.dimen.size_256) : getResources().getDimensionPixelSize(R.dimen.size_168);
    }

    private final q4i getSelectedTabView() {
        Object next;
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((q4i) next).isSelected()) {
                return (q4i) next;
            }
        }
        next = null;
        return (q4i) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSelectedTabWidthForScrollableBubbleTab() {
        float screenSize = getScreenSize();
        if (screenSize < 392.0f) {
            return getResources().getDimensionPixelSize(R.dimen.size_128);
        }
        return screenSize >= 480.0f ? getResources().getDimensionPixelSize(R.dimen.size_256) : getResources().getDimensionPixelSize(R.dimen.size_164);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [a.q4i, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void c(List list) {
        ?? x4dVar;
        list.getClass();
        ArrayList<Object> arrayList = this.t;
        arrayList.clear();
        LinearLayout linearLayout = this.b;
        linearLayout.removeAllViews();
        setScrollBarSize(0);
        this.y = 0;
        this.z = 0;
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                if (arrayList.size() >= 2) {
                    int iOrdinal = this.u.ordinal();
                    View view = this.f47270a;
                    if (iOrdinal == 0) {
                        view.setBackground(view.getContext().getDrawable(R.drawable.ds_tab_indicator));
                        Context context = view.getContext();
                        context.getClass();
                        jmu0.j(view, ColorStateList.valueOf(m5d.b(this.q, context)));
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        view.setBackground(view.getContext().getDrawable(R.drawable.ds_tab_indicator));
                        Context context2 = view.getContext();
                        context2.getClass();
                        jmu0.j(view, ColorStateList.valueOf(m5d.b(this.q, context2)));
                    } else {
                        view.setBackground(view.getContext().getDrawable(R.drawable.ds_tab_background_indicator));
                        Context context3 = view.getContext();
                        context3.getClass();
                        jmu0.j(view, ColorStateList.valueOf(m5d.b(this.s, context3)));
                    }
                    linearLayout.addView(this.c);
                    linearLayout.addView(view);
                    for (Object obj : arrayList) {
                        obj.getClass();
                        linearLayout.addView((View) obj);
                    }
                    setScrollBarSize(arrayList.size());
                    q4i q4iVar = (q4i) CollectionsKt.firstOrNull(arrayList);
                    if (q4iVar != null) {
                        j(q4iVar);
                        return;
                    }
                    return;
                }
                return;
            }
            s4i s4iVar = (s4i) it.next();
            int iOrdinal2 = this.u.ordinal();
            if (iOrdinal2 == 0) {
                Context context4 = getContext();
                context4.getClass();
                x4dVar = new x4d(context4);
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    t9f.b();
                    return;
                }
                Context context5 = getContext();
                context5.getClass();
                x4dVar = new x4d(context5);
            } else {
                Context context6 = getContext();
                context6.getClass();
                x4dVar = new b99(context6);
            }
            x4dVar.setStyle(this.u);
            if (list.size() <= 5) {
                z = false;
            }
            x4dVar.a(s4iVar, z);
            x4dVar.setOnClickListener(new wg((Object) x4dVar, (Object) this, (byte) 19));
            x4dVar.setActiveColor(this.q);
            x4dVar.setInactiveColor(this.r);
            arrayList2.add(Boolean.valueOf(arrayList.add(x4dVar)));
        }
    }

    public final int e(boolean z) {
        return z ? getResources().getDimensionPixelSize(R.dimen.size_52) : getResources().getDimensionPixelSize(R.dimen.size_40);
    }

    public final boolean f() {
        return this.u == aoo0.c;
    }

    public final boolean g() {
        return this.t.size() > 5;
    }

    public final aoo0 getCurrentTabsStyle() {
        return this.u;
    }

    public final s4i getSelectedTabModel() {
        q4i selectedTabView = getSelectedTabView();
        if (selectedTabView != null) {
            return selectedTabView.getTabModel();
        }
        return null;
    }

    public final void h() {
        int x;
        int x2;
        Object selectedTabView = getSelectedTabView();
        if (selectedTabView != null) {
            View view = (View) selectedTabView;
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                x = (int) view.getX();
                x2 = ((int) view.getX()) + view.getMeasuredWidth();
            } else {
                ValueAnimator valueAnimator2 = this.x;
                Object animatedValue = valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null;
                animatedValue.getClass();
                float fFloatValue = ((Float) animatedValue).floatValue();
                float f = this.B - this.A;
                int bubbleScrollableIndicatorWidthDifference = g() ? (int) (getBubbleScrollableIndicatorWidthDifference() * fFloatValue) : 0;
                x = (int) ((f * fFloatValue) + this.A);
                x2 = this.f1 + x + bubbleScrollableIndicatorWidthDifference;
            }
            int top = view.getTop();
            int i = this.l;
            this.f47270a.layout(x, top + i, x2, view.getBottom() - i);
        }
    }

    public final void i() {
        int x;
        int x2;
        int measuredWidth;
        Object selectedTabView = getSelectedTabView();
        if (selectedTabView != null) {
            View view = (View) selectedTabView;
            ValueAnimator valueAnimator = this.x;
            int i = this.k;
            int i2 = this.j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                x = i2 + ((int) view.getX());
                x2 = (int) view.getX();
                measuredWidth = view.getMeasuredWidth();
            } else {
                ValueAnimator valueAnimator2 = this.x;
                Object animatedValue = valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null;
                animatedValue.getClass();
                x2 = (int) ((Float) animatedValue).floatValue();
                x = i2 + x2;
                measuredWidth = view.getMeasuredWidth();
            }
            int i3 = (measuredWidth + x2) - i;
            LinearLayout linearLayout = this.b;
            this.f47270a.layout(x, linearLayout.getBottom() - this.i, i3, linearLayout.getBottom());
        }
    }

    public final void j(q4i q4iVar) {
        for (Object obj : this.t) {
            obj.getClass();
            ((View) obj).setSelected(obj.equals(q4iVar));
        }
    }

    public final void k(int i) {
        if (i < 0 || i == this.y) {
            return;
        }
        this.y = i;
        j((q4i) this.t.get(i));
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.x;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        this.x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        LinearLayout linearLayout = this.b;
        int measuredWidth = linearLayout.getMeasuredWidth() - this.p;
        this.p = linearLayout.getMeasuredWidth();
        if (measuredWidth < 0 && getLayoutDirection() != 0 && f()) {
            setScrollX(getScrollX() + measuredWidth);
            this.A += measuredWidth;
        }
        super.onLayout(z, i, i2, i3, i4);
        ArrayList<Object> arrayList = this.t;
        if (arrayList.size() >= 2) {
            boolean zF = f();
            int i7 = this.m;
            if (zF && getLayoutDirection() == 0) {
                for (Object obj : arrayList) {
                    obj.getClass();
                    View view = (View) obj;
                    int measuredWidth2 = view.getMeasuredWidth() + i7;
                    view.layout(i7, 0, measuredWidth2, view.getMeasuredHeight());
                    i7 = measuredWidth2;
                }
                h();
            } else if (f()) {
                int measuredWidth3 = linearLayout.getMeasuredWidth() - i7;
                for (Object obj2 : arrayList) {
                    obj2.getClass();
                    View view2 = (View) obj2;
                    int measuredWidth4 = measuredWidth3 - view2.getMeasuredWidth();
                    view2.layout(measuredWidth4, 0, measuredWidth3, view2.getMeasuredHeight());
                    measuredWidth3 = measuredWidth4;
                }
                h();
            } else {
                int i8 = 0;
                for (Object obj3 : arrayList) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        q3d.p();
                        throw null;
                    }
                    Object obj4 = (q4i) obj3;
                    obj4.getClass();
                    View view3 = (View) obj4;
                    boolean z2 = view3.getLayoutDirection() == 0;
                    int i10 = g() ? this.n : 0;
                    int i11 = g() ? i7 : 0;
                    int measuredWidth5 = view3.getMeasuredWidth();
                    if (z2) {
                        i5 = (i10 * i8) + (measuredWidth5 * i8) + i11;
                        i6 = measuredWidth5 + i5;
                    } else {
                        int measuredWidth6 = linearLayout.getMeasuredWidth() - ((i10 * i8) + ((measuredWidth5 * i8) + i11));
                        i5 = measuredWidth6 - measuredWidth5;
                        i6 = measuredWidth6;
                    }
                    view3.layout(i5, 0, i6, linearLayout.getMeasuredHeight());
                    i8 = i9;
                }
                i();
            }
            this.c.layout(0, linearLayout.getMeasuredHeight() - this.o, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
        }
        if (measuredWidth <= 0 || getLayoutDirection() == 0 || !f()) {
            return;
        }
        setScrollX(getScrollX() + measuredWidth);
        this.A += measuredWidth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ArrayList<q4i> arrayList = this.t;
        if (arrayList.size() < 2) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int parentHeight = getParentHeight();
        boolean zG = g();
        int size2 = this.h;
        int i3 = this.m;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((zG && f()) ? hne.D((arrayList.size() - 1) * e(true), i3, i3, ((q4i) arrayList.get(this.y)).b(getSelectedTabWidthForScrollableBubbleTab())) : g() ? (arrayList.size() * size2) + ((arrayList.size() - 1) * this.n) + i3 + i3 : size, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(parentHeight, 1073741824);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int i4 = 0;
        boolean z = f() && g();
        if (z && (valueAnimator2 = this.x) != null && valueAnimator2.isRunning()) {
            int iE = e(true);
            ValueAnimator valueAnimator3 = this.x;
            Object animatedValue = valueAnimator3 != null ? valueAnimator3.getAnimatedValue() : null;
            animatedValue.getClass();
            float fFloatValue = ((Float) animatedValue).floatValue();
            for (Object obj : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                q4i q4iVar = (q4i) obj;
                int iB = q4iVar.b(getSelectedTabWidthForScrollableBubbleTab());
                float f = (iB - iE) * fFloatValue;
                ((View) q4iVar).measure(View.MeasureSpec.makeMeasureSpec((i4 == this.z ? Float.valueOf(iB - f) : i4 == this.y ? Float.valueOf(iE + f) : Integer.valueOf(iE)).intValue(), 1073741824), View.MeasureSpec.makeMeasureSpec(parentHeight, 1073741824));
                i4 = i5;
            }
        } else if (f() && (valueAnimator = this.x) != null && valueAnimator.isRunning()) {
            int measuredWidth = (linearLayout.getMeasuredWidth() - i3) - i3;
            int iMax = Math.max(measuredWidth / arrayList.size(), getSelectedTabMinWidthForFixedBubbleTab());
            int iMax2 = Math.max((measuredWidth - iMax) / (arrayList.size() - 1), e(false));
            ValueAnimator valueAnimator4 = this.x;
            Object animatedValue2 = valueAnimator4 != null ? valueAnimator4.getAnimatedValue() : null;
            animatedValue2.getClass();
            float fFloatValue2 = (iMax - iMax2) * ((Float) animatedValue2).floatValue();
            float f2 = iMax - fFloatValue2;
            float f3 = iMax2 + fFloatValue2;
            for (Object obj2 : arrayList) {
                int i6 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                Object obj3 = (q4i) obj2;
                Number numberValueOf = i4 == this.z ? Float.valueOf(f2) : i4 == this.y ? Float.valueOf(f3) : Integer.valueOf(iMax2);
                obj3.getClass();
                ((View) obj3).measure(View.MeasureSpec.makeMeasureSpec(numberValueOf.intValue(), 1073741824), View.MeasureSpec.makeMeasureSpec(parentHeight, 1073741824));
                i4 = i6;
            }
        } else if (z) {
            int iE2 = e(true);
            for (q4i q4iVar2 : arrayList) {
                ((View) q4iVar2).measure(View.MeasureSpec.makeMeasureSpec(q4iVar2.isSelected() ? q4iVar2.b(getSelectedTabWidthForScrollableBubbleTab()) : iE2, 1073741824), View.MeasureSpec.makeMeasureSpec(parentHeight, 1073741824));
            }
        } else if (f()) {
            int measuredWidth2 = (linearLayout.getMeasuredWidth() - i3) - i3;
            int iMax3 = Math.max(measuredWidth2 / arrayList.size(), getSelectedTabMinWidthForFixedBubbleTab());
            int iMax4 = Math.max((measuredWidth2 - iMax3) / (arrayList.size() - 1), e(false));
            for (q4i q4iVar3 : arrayList) {
                ((View) q4iVar3).measure(View.MeasureSpec.makeMeasureSpec(q4iVar3.isSelected() ? iMax3 : iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(parentHeight, 1073741824));
            }
        } else {
            if (!g()) {
                size2 = size / arrayList.size();
            }
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(parentHeight, 1073741824);
            for (Object obj4 : arrayList) {
                obj4.getClass();
                ((View) obj4).measure(View.MeasureSpec.makeMeasureSpec(iMakeMeasureSpec3, 1073741824), View.MeasureSpec.makeMeasureSpec(iMakeMeasureSpec4, 1073741824));
            }
        }
        setMeasuredDimension(size, parentHeight);
    }

    public final void setActiveColor(int i) {
        this.q = i;
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((q4i) it.next()).setActiveColor(this.q);
        }
        if (f()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        jmu0.j(this.f47270a, ColorStateList.valueOf(m5d.b(this.q, context)));
    }

    public final void setBackgroundBubbleIndicatorColor(int i) {
        if (f()) {
            this.s = i;
            Context context = getContext();
            context.getClass();
            jmu0.j(this.f47270a, ColorStateList.valueOf(m5d.b(i, context)));
        }
    }

    public final void setInactiveColor(int i) {
        this.r = i;
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((q4i) it.next()).setInactiveColor(this.r);
        }
        if (f()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        jmu0.j(this.f47270a, ColorStateList.valueOf(m5d.b(this.r, context)));
    }

    public final void setTabsStyle(String str) {
        str.getClass();
        aoo0.f1212a.getClass();
        aoo0 aoo0VarG = s9m0.g(str);
        this.u = aoo0VarG;
        this.w = aoo0VarG == aoo0.d;
    }

    public final void setTabsStyle(aoo0 aoo0Var) {
        aoo0Var.getClass();
        this.u = aoo0Var;
        this.w = aoo0Var == aoo0.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTabs(Context context) {
        this(context, null);
        context.getClass();
    }
}
