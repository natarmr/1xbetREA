package com.google.android.material.tabs;

import a.afn0;
import a.awa0;
import a.bwa0;
import a.bwf;
import a.dwi0;
import a.epv0;
import a.f140;
import a.g7x;
import a.g9m0;
import a.i7;
import a.jf4;
import a.jiq0;
import a.k7x;
import a.ki30;
import a.mo8;
import a.mqd0;
import a.mrv;
import a.n6x;
import a.n73;
import a.obo0;
import a.pbo0;
import a.pj80;
import a.plc;
import a.qbo0;
import a.rpd0;
import a.rrn;
import a.sbo0;
import a.tbo0;
import a.ubo0;
import a.vbo0;
import a.wbo0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    public static final bwa0 z1 = new bwa0(16);
    public final int A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45580a;
    public final ArrayList b;
    public tbo0 c;
    public final sbo0 d;
    public final int e;
    public final int f;
    public int f1;
    public final int g;
    public boolean g1;
    public final int h;
    public boolean h1;
    public final int i;
    public int i1;
    public final int j;
    public int j1;
    public final int k;
    public boolean k1;
    public ColorStateList l;
    public g9m0 l1;
    public ColorStateList m;
    public final TimeInterpolator m1;
    public ColorStateList n;
    public pbo0 n1;
    public Drawable o;
    public final ArrayList o1;
    public int p;
    public wbo0 p1;
    public final float q;
    public ValueAnimator q1;
    public final float r;
    public ViewPager r1;
    public final float s;
    public pj80 s1;
    public final int t;
    public bwf t1;
    public int u;
    public ubo0 u1;
    public final int v;
    public obo0 v1;
    public final int w;
    public boolean w1;
    public final int x;
    public int x1;
    public final int y;
    public final awa0 y1;
    public int z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(dwi0.V(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f45580a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.u = Integer.MAX_VALUE;
        this.i1 = -1;
        this.o1 = new ArrayList();
        this.y1 = new awa0(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        sbo0 sbo0Var = new sbo0(this, context2);
        this.d = sbo0Var;
        super.addView(sbo0Var, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayL0 = mrv.l0(context2, attributeSet, rpd0.U, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 25);
        ColorStateList colorStateListF = plc.F(getBackground());
        if (colorStateListF != null) {
            ki30 ki30Var = new ki30();
            ki30Var.s(colorStateListF);
            ki30Var.o(context2);
            ki30Var.r(getElevation());
            setBackground(ki30Var);
        }
        setSelectedTabIndicator(g7x.D(6, context2, typedArrayL0));
        setSelectedTabIndicatorColor(typedArrayL0.getColor(9, 0));
        sbo0Var.b(typedArrayL0.getDimensionPixelSize(12, -1));
        setSelectedTabIndicatorGravity(typedArrayL0.getInt(11, 0));
        setTabIndicatorAnimationMode(typedArrayL0.getInt(8, 0));
        setTabIndicatorFullWidth(typedArrayL0.getBoolean(10, true));
        int dimensionPixelSize = typedArrayL0.getDimensionPixelSize(17, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = typedArrayL0.getDimensionPixelSize(20, dimensionPixelSize);
        this.f = typedArrayL0.getDimensionPixelSize(21, dimensionPixelSize);
        this.g = typedArrayL0.getDimensionPixelSize(19, dimensionPixelSize);
        this.h = typedArrayL0.getDimensionPixelSize(18, dimensionPixelSize);
        if (n6x.S(context2.getTheme(), R.attr.isMaterial3Theme, false)) {
            this.i = R.attr.textAppearanceTitleSmall;
        } else {
            this.i = R.attr.textAppearanceButton;
        }
        int resourceId2 = typedArrayL0.getResourceId(25, R.style.TextAppearance_Design_Tab);
        this.j = resourceId2;
        int[] iArr = mqd0.x;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.q = dimensionPixelSize2;
            this.l = g7x.A(3, context2, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayL0.hasValue(23)) {
                resourceId = typedArrayL0.getResourceId(23, resourceId2);
                this.k = resourceId;
            } else {
                resourceId = -1;
            }
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(resourceId, iArr);
                try {
                    this.r = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListA = g7x.A(3, context2, typedArrayObtainStyledAttributes2);
                    if (colorStateListA != null) {
                        this.l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor()), this.l.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayL0.hasValue(26)) {
                this.l = g7x.A(26, context2, typedArrayL0);
            }
            if (typedArrayL0.hasValue(24)) {
                this.l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayL0.getColor(24, 0), this.l.getDefaultColor()});
            }
            this.m = g7x.A(4, context2, typedArrayL0);
            afn0.y(typedArrayL0.getInt(5, -1), null);
            this.n = g7x.A(22, context2, typedArrayL0);
            this.A = typedArrayL0.getInt(7, 300);
            this.m1 = g7x.W(context2, R.attr.motionEasingEmphasizedInterpolator, n73.b);
            this.v = typedArrayL0.getDimensionPixelSize(15, -1);
            this.w = typedArrayL0.getDimensionPixelSize(14, -1);
            this.t = typedArrayL0.getResourceId(1, 0);
            this.y = typedArrayL0.getDimensionPixelSize(2, 0);
            this.f1 = typedArrayL0.getInt(16, 1);
            this.z = typedArrayL0.getInt(3, 0);
            this.g1 = typedArrayL0.getBoolean(13, false);
            this.k1 = typedArrayL0.getBoolean(27, false);
            typedArrayL0.recycle();
            Resources resources = getResources();
            this.s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            c();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.v;
        if (i != -1) {
            return i;
        }
        int i2 = this.f1;
        if (i2 == 0 || i2 == 2) {
            return this.x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        sbo0 sbo0Var = this.d;
        int childCount = sbo0Var.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = sbo0Var.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof vbo0) {
                        ((vbo0) childAt).h();
                    }
                }
                i2++;
            }
        }
    }

    public void a(tbo0 tbo0Var, int i, boolean z) {
        if (tbo0Var.d != this) {
            jf4.o("Tab belongs to a different TabLayout.");
            return;
        }
        tbo0Var.b = i;
        ArrayList arrayList = this.b;
        arrayList.add(i, tbo0Var);
        int size = arrayList.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (((tbo0) arrayList.get(i3)).b == this.f45580a) {
                i2 = i3;
            }
            ((tbo0) arrayList.get(i3)).b = i3;
        }
        this.f45580a = i2;
        vbo0 vbo0Var = tbo0Var.e;
        vbo0Var.setSelected(false);
        vbo0Var.setActivated(false);
        int i4 = tbo0Var.b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f1 == 1 && this.z == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.d.addView(vbo0Var, i4, layoutParams);
        if (z) {
            TabLayout tabLayout = tbo0Var.d;
            if (tabLayout != null) {
                tabLayout.j(tbo0Var, true);
            } else {
                jf4.o("Tab not attached to a TabLayout");
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            sbo0 sbo0Var = this.d;
            int childCount = sbo0Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (sbo0Var.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iD = d(0.0f, i);
            if (scrollX != iD) {
                e();
                this.q1.setIntValues(scrollX, iD);
                this.q1.start();
            }
            ValueAnimator valueAnimator = sbo0Var.f31945a;
            if (valueAnimator != null && valueAnimator.isRunning() && sbo0Var.b.f45580a != i) {
                sbo0Var.f31945a.cancel();
            }
            sbo0Var.d(i, this.A, true);
            return;
        }
        l(i, 0.0f, true, true, true);
    }

    public final void c() {
        int i = this.f1;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.y - this.e) : 0;
        sbo0 sbo0Var = this.d;
        sbo0Var.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.f1;
        if (i2 == 0) {
            int i3 = this.z;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                sbo0Var.setGravity(1);
            } else if (i3 == 2) {
            }
            sbo0Var.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.z == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            sbo0Var.setGravity(1);
        }
        n(true);
    }

    public final int d(float f, int i) {
        sbo0 sbo0Var;
        View childAt;
        int i2 = this.f1;
        if ((i2 != 0 && i2 != 2) || (childAt = (sbo0Var = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < sbo0Var.getChildCount() ? sbo0Var.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void e() {
        if (this.q1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.q1 = valueAnimator;
            valueAnimator.setInterpolator(this.m1);
            this.q1.setDuration(this.A);
            this.q1.addUpdateListener(new mo8(this, (byte) 5));
        }
    }

    public final tbo0 f(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (tbo0) this.b.get(i);
    }

    public final tbo0 g() {
        tbo0 tbo0Var = (tbo0) z1.a();
        if (tbo0Var == null) {
            tbo0Var = new tbo0();
            tbo0Var.b = -1;
        }
        tbo0Var.d = this;
        awa0 awa0Var = this.y1;
        vbo0 vbo0Var = awa0Var != null ? (vbo0) awa0Var.a() : null;
        if (vbo0Var == null) {
            vbo0Var = new vbo0(this, getContext());
        }
        vbo0Var.setTab(tbo0Var);
        vbo0Var.setFocusable(true);
        vbo0Var.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            vbo0Var.setContentDescription(tbo0Var.f33675a);
        } else {
            vbo0Var.setContentDescription(null);
        }
        tbo0Var.e = vbo0Var;
        return tbo0Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        tbo0 tbo0Var = this.c;
        if (tbo0Var != null) {
            return tbo0Var.b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.z;
    }

    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.j1;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.u;
    }

    public int getTabMode() {
        return this.f1;
    }

    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final void h() {
        int currentItem;
        i();
        pj80 pj80Var = this.s1;
        if (pj80Var != null) {
            int iC = pj80Var.c();
            for (int i = 0; i < iC; i++) {
                tbo0 tbo0VarG = g();
                this.s1.getClass();
                if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
                    tbo0VarG.e.setContentDescription(null);
                }
                tbo0VarG.f33675a = null;
                vbo0 vbo0Var = tbo0VarG.e;
                if (vbo0Var != null) {
                    vbo0Var.f();
                }
                a(tbo0VarG, this.b.size(), false);
            }
            ViewPager viewPager = this.r1;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            j(f(currentItem), true);
        }
    }

    public final void i() {
        sbo0 sbo0Var = this.d;
        int childCount = sbo0Var.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            vbo0 vbo0Var = (vbo0) sbo0Var.getChildAt(childCount);
            sbo0Var.removeViewAt(childCount);
            if (vbo0Var != null) {
                vbo0Var.setTab(null);
                vbo0Var.setSelected(false);
                this.y1.c(vbo0Var);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            tbo0 tbo0Var = (tbo0) it.next();
            it.remove();
            tbo0Var.d = null;
            tbo0Var.e = null;
            tbo0Var.f33675a = null;
            tbo0Var.b = -1;
            tbo0Var.c = null;
            z1.c(tbo0Var);
        }
        this.c = null;
    }

    public final void j(tbo0 tbo0Var, boolean z) {
        TabLayout tabLayout;
        tbo0 tbo0Var2 = this.c;
        ArrayList arrayList = this.o1;
        if (tbo0Var2 == tbo0Var) {
            if (tbo0Var2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((pbo0) arrayList.get(size)).b(tbo0Var);
                }
                b(tbo0Var.b);
                return;
            }
            return;
        }
        int i = tbo0Var != null ? tbo0Var.b : -1;
        if (z) {
            if ((tbo0Var2 == null || tbo0Var2.b == -1) && i != -1) {
                tabLayout = this;
                tabLayout.l(i, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                tabLayout.b(i);
            }
            if (i != -1) {
                tabLayout.setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.c = tbo0Var;
        if (tbo0Var2 != null && tbo0Var2.d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((pbo0) arrayList.get(size2)).a(tbo0Var2);
            }
        }
        if (tbo0Var != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((pbo0) arrayList.get(size3)).c(tbo0Var);
            }
        }
    }

    public final void k(pj80 pj80Var, boolean z) {
        bwf bwfVar;
        pj80 pj80Var2 = this.s1;
        if (pj80Var2 != null && (bwfVar = this.t1) != null) {
            pj80Var2.f27076a.unregisterObserver(bwfVar);
        }
        this.s1 = pj80Var;
        if (z && pj80Var != null) {
            bwf bwfVar2 = this.t1;
            if (bwfVar2 == null) {
                bwfVar2 = new bwf(this, (byte) 2);
                this.t1 = bwfVar2;
            }
            pj80Var.f27076a.registerObserver(bwfVar2);
        }
        h();
    }

    public final void l(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            sbo0 sbo0Var = this.d;
            if (iRound >= sbo0Var.getChildCount()) {
                return;
            }
            if (z2) {
                sbo0Var.b.f45580a = Math.round(f2);
                ValueAnimator valueAnimator = sbo0Var.f31945a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    sbo0Var.f31945a.cancel();
                }
                sbo0Var.c(sbo0Var.getChildAt(i), sbo0Var.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.q1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.q1.cancel();
            }
            int iD = d(f, i);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iD >= scrollX) || (i > getSelectedTabPosition() && iD <= scrollX) || i == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && iD <= scrollX) || (i > getSelectedTabPosition() && iD >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.x1 == 1 || z3) {
                if (i < 0) {
                    iD = 0;
                }
                scrollTo(iD, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void m(ViewPager viewPager, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.r1;
        if (viewPager2 != null) {
            ubo0 ubo0Var = this.u1;
            if (ubo0Var != null && (arrayList2 = viewPager2.u1) != null) {
                arrayList2.remove(ubo0Var);
            }
            obo0 obo0Var = this.v1;
            if (obo0Var != null && (arrayList = this.r1.w1) != null) {
                arrayList.remove(obo0Var);
            }
        }
        wbo0 wbo0Var = this.p1;
        ArrayList arrayList3 = this.o1;
        if (wbo0Var != null) {
            arrayList3.remove(wbo0Var);
            this.p1 = null;
        }
        byte b = 0;
        if (viewPager != null) {
            this.r1 = viewPager;
            ubo0 ubo0Var2 = this.u1;
            if (ubo0Var2 == null) {
                ubo0Var2 = new ubo0(this);
                this.u1 = ubo0Var2;
            }
            ubo0Var2.c = 0;
            ubo0Var2.b = 0;
            ArrayList arrayList4 = viewPager.u1;
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                viewPager.u1 = arrayList4;
            }
            arrayList4.add(ubo0Var2);
            wbo0 wbo0Var2 = new wbo0(viewPager, b);
            this.p1 = wbo0Var2;
            if (!arrayList3.contains(wbo0Var2)) {
                arrayList3.add(wbo0Var2);
            }
            pj80 adapter = viewPager.getAdapter();
            if (adapter != null) {
                k(adapter, true);
            }
            obo0 obo0Var2 = this.v1;
            if (obo0Var2 == null) {
                obo0Var2 = new obo0(this);
                this.v1 = obo0Var2;
            }
            obo0Var2.f24992a = true;
            ArrayList arrayList5 = viewPager.w1;
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                viewPager.w1 = arrayList5;
            }
            arrayList5.add(obo0Var2);
            l(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.r1 = null;
            k(null, false);
        }
        this.w1 = z;
    }

    public final void n(boolean z) {
        int i = 0;
        while (true) {
            sbo0 sbo0Var = this.d;
            if (i >= sbo0Var.getChildCount()) {
                return;
            }
            View childAt = sbo0Var.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f1 == 1 && this.z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof ki30) {
            k7x.V(this, (ki30) background);
        }
        if (this.r1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.w1) {
            setupWithViewPager(null);
            this.w1 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = 0;
        while (true) {
            sbo0 sbo0Var = this.d;
            if (i >= sbo0Var.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = sbo0Var.getChildAt(i);
            if (childAt instanceof vbo0) {
                vbo0 vbo0Var = (vbo0) childAt;
                int i2 = vbo0.l;
                Drawable drawable = vbo0Var.i;
                if (drawable != null) {
                    drawable.setBounds(vbo0Var.getLeft(), vbo0Var.getTop(), vbo0Var.getRight(), vbo0Var.getBottom());
                    vbo0Var.i.draw(canvas);
                }
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i7.b(1, getTabCount(), 1).f14266a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(afn0.l(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iL = this.w;
            if (iL <= 0) {
                iL = (int) (size - afn0.l(56, getContext()));
            }
            this.u = iL;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f1;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof ki30) {
            ((ki30) background).r(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.g1 == z) {
            return;
        }
        this.g1 = z;
        int i = 0;
        while (true) {
            sbo0 sbo0Var = this.d;
            if (i >= sbo0Var.getChildCount()) {
                c();
                return;
            }
            View childAt = sbo0Var.getChildAt(i);
            if (childAt instanceof vbo0) {
                vbo0 vbo0Var = (vbo0) childAt;
                vbo0Var.setOrientation(!vbo0Var.k.g1 ? 1 : 0);
                TextView textView = vbo0Var.g;
                if (textView == null && vbo0Var.h == null) {
                    vbo0Var.i(vbo0Var.b, vbo0Var.c, true);
                } else {
                    vbo0Var.i(textView, vbo0Var.h, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(pbo0 pbo0Var) {
        pbo0 pbo0Var2 = this.n1;
        ArrayList arrayList = this.o1;
        if (pbo0Var2 != null) {
            arrayList.remove(pbo0Var2);
        }
        this.n1 = pbo0Var;
        if (pbo0Var == null || arrayList.contains(pbo0Var)) {
            return;
        }
        arrayList.add(pbo0Var);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.q1.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.o = drawableMutate;
        int i = this.p;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.i1;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.o.getIntrinsicHeight();
        }
        this.d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.p = i;
        Drawable drawable = this.o;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        n(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.B != i) {
            this.B = i;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.i1 = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.z != i) {
            this.z = i;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                vbo0 vbo0Var = ((tbo0) arrayList.get(i)).e;
                if (vbo0Var != null) {
                    vbo0Var.f();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(jiq0.n0(i, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.j1 = i;
        if (i == 0) {
            this.l1 = new g9m0();
            return;
        }
        if (i == 1) {
            this.l1 = new rrn((byte) 0);
        } else if (i == 2) {
            this.l1 = new rrn((byte) 1);
        } else {
            jf4.o(f140.i(i, " is not a valid TabIndicatorAnimationMode"));
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.h1 = z;
        int i = sbo0.c;
        sbo0 sbo0Var = this.d;
        sbo0Var.a(sbo0Var.b.getSelectedTabPosition());
        sbo0Var.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f1) {
            this.f1 = i;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        int i = 0;
        while (true) {
            sbo0 sbo0Var = this.d;
            if (i >= sbo0Var.getChildCount()) {
                return;
            }
            View childAt = sbo0Var.getChildAt(i);
            if (childAt instanceof vbo0) {
                Context context = getContext();
                int i2 = vbo0.l;
                ((vbo0) childAt).g(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(jiq0.n0(i, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                vbo0 vbo0Var = ((tbo0) arrayList.get(i)).e;
                if (vbo0Var != null) {
                    vbo0Var.f();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(pj80 pj80Var) {
        k(pj80Var, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.k1 == z) {
            return;
        }
        this.k1 = z;
        int i = 0;
        while (true) {
            sbo0 sbo0Var = this.d;
            if (i >= sbo0Var.getChildCount()) {
                return;
            }
            View childAt = sbo0Var.getChildAt(i);
            if (childAt instanceof vbo0) {
                Context context = getContext();
                int i2 = vbo0.l;
                ((vbo0) childAt).g(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Deprecated
    public void setOnTabSelectedListener(qbo0 qbo0Var) {
        setOnTabSelectedListener((pbo0) qbo0Var);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(epv0.U(i, getContext()));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
