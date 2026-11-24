package org.xplatform.uikit.components.tabbar;

import a.a99;
import a.bqd0;
import a.cvc;
import a.dvc;
import a.epv0;
import a.fxy;
import a.gd5;
import a.gx00;
import a.igu0;
import a.ihu0;
import a.jmu0;
import a.k6;
import a.kao0;
import a.lao0;
import a.m5d;
import a.oao0;
import a.pao0;
import a.rgu0;
import a.t9f;
import a.w4d;
import a.z9f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes6.dex */
public final class DsTabBar extends FrameLayout {
    public static final /* synthetic */ int n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47269a;
    public final int b;
    public final int c;
    public final int d;
    public lao0 e;
    public Function1 f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public int i;
    public final DsSeparator j;
    public final FrameLayout k;
    public final FrameLayout l;
    public kao0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsTabBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = getResources().getDimensionPixelOffset(R.dimen.space_2);
        this.c = getResources().getDimensionPixelOffset(R.dimen.space_8);
        getResources().getDimensionPixelOffset(R.dimen.space_4);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.size_56);
        this.d = dimensionPixelOffset;
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        DsSeparator dsSeparator = new DsSeparator(context, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dsSeparator.getResources().getDimensionPixelOffset(R.dimen.size_1));
        layoutParams.gravity = 80;
        layoutParams.setMargins(0, 0, 0, dimensionPixelOffset);
        dsSeparator.setLayoutParams(layoutParams);
        this.j = dsSeparator;
        FrameLayout frameLayout = new FrameLayout(context);
        this.k = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.viewBackground);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, dimensionPixelOffset);
        layoutParams2.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams2);
        this.l = frameLayout2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.N, 0, 0);
        setStatic(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        a();
        setClipChildren(false);
        setClipToPadding(false);
        setClipToOutline(false);
        setLayoutDirection(3);
        addView(dsSeparator);
        addView(frameLayout2);
        addView(frameLayout);
    }

    private final dvc getCentralTabHorizontalRange() {
        View view;
        Object next;
        Object obj = this.m;
        ViewGroup viewGroup = obj instanceof ViewGroup ? (ViewGroup) obj : null;
        if (viewGroup != null) {
            Iterator it = new ihu0(viewGroup).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((View) next) instanceof fxy));
            view = (View) next;
        } else {
            view = null;
        }
        if (view != null) {
            return new cvc(view.getLeft() + viewGroup.getLeft(), view.getRight() + viewGroup.getLeft());
        }
        return null;
    }

    public final void a() {
        boolean z = this.f47269a;
        FrameLayout frameLayout = this.l;
        FrameLayout frameLayout2 = this.k;
        DsSeparator dsSeparator = this.j;
        if (z) {
            dsSeparator.setBackground(new ColorDrawable(getContext().getColor(R.color.static_white_10)));
            frameLayout2.setBackground(new ColorDrawable(getContext().getColor(R.color.static_background_content)));
            frameLayout.setBackground(new ColorDrawable(getContext().getColor(R.color.static_background_content)));
            return;
        }
        Context context = getContext();
        Context context2 = getContext();
        context2.getClass();
        dsSeparator.setBackground(epv0.U(m5d.g(context2, R.attr.uikitSeparator60, 4), context));
        Context context3 = getContext();
        Context context4 = getContext();
        context4.getClass();
        frameLayout2.setBackground(epv0.U(m5d.g(context4, R.attr.uikitBackgroundContent, 4), context3));
        Context context5 = getContext();
        Context context6 = getContext();
        context6.getClass();
        frameLayout.setBackground(epv0.U(m5d.g(context6, R.attr.uikitBackgroundContent, 4), context5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [a.kao0, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    public final void b(lao0 lao0Var) {
        ?? r0;
        Object obj = this.m;
        ?? r1 = this.l;
        if (obj != null) {
            r1.removeView((View) obj);
        }
        pao0 pao0Var = lao0Var.b;
        List<oao0> list = lao0Var.f19715a;
        int iOrdinal = pao0Var.ordinal();
        int i = this.b;
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            k6 k6Var = new k6(context, this.f47269a);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.setMarginEnd(i);
            layoutParams.setMarginStart(i);
            k6Var.setLayoutParams(layoutParams);
            k6Var.setTabs(list);
            r0 = k6Var;
        } else if (iOrdinal == 1) {
            Context context2 = getContext();
            context2.getClass();
            a99 a99Var = new a99(context2, this.f47269a);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 80;
            int i2 = this.c;
            layoutParams2.setMarginEnd(i2);
            layoutParams2.setMarginStart(i2);
            a99Var.setLayoutParams(layoutParams2);
            a99Var.setTabs(list);
            r0 = a99Var;
        } else if (iOrdinal == 2) {
            Context context3 = getContext();
            context3.getClass();
            w4d w4dVar = new w4d(context3, this.f47269a);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 80;
            layoutParams3.setMarginEnd(i);
            layoutParams3.setMarginStart(i);
            w4dVar.setLayoutParams(layoutParams3);
            w4dVar.setTabs(list);
            r0 = w4dVar;
        } else if (iOrdinal == 3) {
            Context context4 = getContext();
            context4.getClass();
            gd5 gd5Var = new gd5(context4, this.f47269a);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams4.gravity = 80;
            layoutParams4.setMarginEnd(i);
            layoutParams4.setMarginStart(i);
            gd5Var.setLayoutParams(layoutParams4);
            gd5Var.setTabs(list);
            r0 = gd5Var;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return;
            }
            Context context5 = getContext();
            context5.getClass();
            gx00 gx00Var = new gx00(context5, this.f47269a);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams5.gravity = 80;
            layoutParams5.setMarginEnd(i);
            layoutParams5.setMarginStart(i);
            gx00Var.setLayoutParams(layoutParams5);
            gx00Var.setTabs(list);
            r0 = gx00Var;
        }
        this.m = r0;
        r0.setId(R.id.navigationTabContainer);
        r0.setLayoutDirection(getLayoutDirection());
        r1.addView(r0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int height = (getHeight() - this.d) - this.i;
            if (height > 0 && y < height) {
                dvc centralTabHorizontalRange = getCentralTabHorizontalRange();
                if (centralTabHorizontalRange == null) {
                    return false;
                }
                cvc cvcVar = (cvc) centralTabHorizontalRange;
                if (x < cvcVar.f5023a || x > cvcVar.b) {
                    return false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final FrameLayout getBackgroundView$uikit() {
        return this.l;
    }

    public final kao0 getContainer$uikit() {
        return this.m;
    }

    public final String getSelectedTabTag() {
        String selectedTabTag;
        kao0 kao0Var = this.m;
        return (kao0Var == null || (selectedTabTag = kao0Var.getSelectedTabTag()) == null) ? "" : selectedTabTag;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z9f z9fVar = new z9f(this, (byte) 16);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(this, z9fVar);
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(this, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight() - this.i;
        int measuredHeight2 = getMeasuredHeight();
        int i5 = measuredHeight - this.d;
        jmu0.f(0, i5 - this.j.getMeasuredHeight(), measuredWidth, i5, this.j, this);
        jmu0.f(0, i5, measuredWidth, measuredHeight, this.l, this);
        jmu0.f(0, measuredHeight, measuredWidth, measuredHeight2, this.k, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight == 0) {
            return;
        }
        this.k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.i, 1073741824));
        Object obj = this.m;
        View view = obj instanceof View ? (View) obj : null;
        int measuredHeight2 = (view != null ? view.getMeasuredHeight() : 0) + this.i;
        if (measuredHeight2 > measuredHeight) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight2);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        Object obj = this.m;
        FrameLayout frameLayout = obj instanceof FrameLayout ? (FrameLayout) obj : null;
        if (frameLayout != null) {
            frameLayout.setClickable(z);
        }
    }

    public final void setContainer$uikit(kao0 kao0Var) {
        this.m = kao0Var;
    }

    public final void setOnTabClickListener(Function1<? super String, Unit> function1) {
        function1.getClass();
        this.f = function1;
        kao0 kao0Var = this.m;
        if (kao0Var != null) {
            kao0Var.setOnTabClickListener(function1);
        }
    }

    public final void setSelectedTab(String str) {
        str.getClass();
        kao0 kao0Var = this.m;
        if (kao0Var != null) {
            kao0Var.setSelectedTab(str);
        }
    }

    public final void setStatic(boolean z) {
        kao0 kao0Var;
        kao0 kao0Var2;
        if (this.f47269a == z) {
            return;
        }
        this.f47269a = z;
        a();
        lao0 lao0Var = this.e;
        if (lao0Var != null) {
            kao0 kao0Var3 = this.m;
            String selectedTabTag = kao0Var3 != null ? kao0Var3.getSelectedTabTag() : null;
            if (selectedTabTag == null) {
                selectedTabTag = "";
            }
            b(lao0Var);
            Function1 function1 = this.f;
            if (function1 != null && (kao0Var2 = this.m) != null) {
                kao0Var2.setOnTabClickListener(function1);
            }
            for (Map.Entry entry : this.g.entrySet()) {
                String str = (String) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                kao0 kao0Var4 = this.m;
                if (kao0Var4 != null) {
                    kao0Var4.b(iIntValue, str);
                }
            }
            for (Map.Entry entry2 : this.h.entrySet()) {
                String str2 = (String) entry2.getKey();
                boolean zBooleanValue = ((Boolean) entry2.getValue()).booleanValue();
                kao0 kao0Var5 = this.m;
                if (kao0Var5 != null) {
                    kao0Var5.a(str2, zBooleanValue);
                }
            }
            if (selectedTabTag.length() > 0 && (kao0Var = this.m) != null) {
                kao0Var.setSelectedTab(selectedTabTag);
            }
            if (isClickable()) {
                Object obj = this.m;
                FrameLayout frameLayout = obj instanceof FrameLayout ? (FrameLayout) obj : null;
                if (frameLayout != null) {
                    frameLayout.setClickable(true);
                }
            }
        }
    }

    public final void setTabBarDSModel(lao0 lao0Var) {
        lao0Var.getClass();
        if (!Intrinsics.d(this.e, lao0Var) && lao0Var.f19715a.size() > 1 && lao0Var.f19715a.size() <= 5) {
            this.e = lao0Var;
            b(lao0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTabBar(Context context) {
        this(context, null);
        context.getClass();
    }
}
