package androidx.appcompat.widget;

import a.aj;
import a.bj;
import a.cmu0;
import a.drm0;
import a.hfk0;
import a.hne;
import a.hz30;
import a.i900;
import a.n240;
import a.nx30;
import a.ox30;
import a.peg0;
import a.ui;
import a.wi;
import a.xi;
import a.zi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements nx30, n240 {
    public ox30 p;
    public Context q;
    public int r;
    public boolean s;
    public xi t;
    public drm0 u;
    public boolean v;
    public int w;
    public final int x;
    public final int y;
    public bj z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.x = (int) (56.0f * f);
        this.y = (int) (f * 4.0f);
        this.q = context;
        this.r = 0;
    }

    public static aj j() {
        aj ajVar = new aj(-2, -2);
        ajVar.f950a = false;
        ((LinearLayout.LayoutParams) ajVar).gravity = 16;
        return ajVar;
    }

    public static aj k(ViewGroup.LayoutParams layoutParams) {
        aj ajVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof aj) {
            aj ajVar2 = (aj) layoutParams;
            ajVar = new aj(ajVar2);
            ajVar.f950a = ajVar2.f950a;
        } else {
            ajVar = new aj(layoutParams);
        }
        if (((LinearLayout.LayoutParams) ajVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) ajVar).gravity = 16;
        }
        return ajVar;
    }

    @Override // a.nx30
    public final boolean a(hz30 hz30Var) {
        return this.p.q(hz30Var, null, 0);
    }

    @Override // a.n240
    public final void c(ox30 ox30Var) {
        this.p = ox30Var;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aj;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ i900 generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: g */
    public final i900 generateLayoutParams(AttributeSet attributeSet) {
        return new aj(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aj(getContext(), attributeSet);
    }

    public Menu getMenu() {
        ox30 ox30Var = this.p;
        if (ox30Var != null) {
            return ox30Var;
        }
        Context context = getContext();
        ox30 ox30Var2 = new ox30(context);
        this.p = ox30Var2;
        ox30Var2.e = new peg0((Object) this, (byte) 4);
        xi xiVar = new xi(context);
        this.t = xiVar;
        xiVar.l = true;
        xiVar.m = true;
        xiVar.e = new hfk0((byte) 10);
        this.p.b(xiVar, this.q);
        xi xiVar2 = this.t;
        xiVar2.h = this;
        ox30 ox30Var3 = xiVar2.c;
        this.p = ox30Var3;
        return ox30Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        xi xiVar = this.t;
        wi wiVar = xiVar.i;
        if (wiVar != null) {
            return wiVar.getDrawable();
        }
        if (xiVar.k) {
            return xiVar.j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ i900 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof zi)) {
            zB = ((zi) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof zi)) ? zB : ((zi) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xi xiVar = this.t;
        if (xiVar != null) {
            xiVar.e();
            if (this.t.k()) {
                this.t.j();
                this.t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xi xiVar = this.t;
        if (xiVar != null) {
            xiVar.j();
            ui uiVar = xiVar.t;
            if (uiVar == null || !uiVar.b()) {
                return;
            }
            uiVar.j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.v) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = cmu0.f4626a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                aj ajVar = (aj) childAt.getLayoutParams();
                if (ajVar.f950a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) ajVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) ajVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) ajVar).leftMargin) + ((LinearLayout.LayoutParams) ajVar).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                aj ajVar2 = (aj) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !ajVar2.f950a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) ajVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) ajVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            aj ajVar3 = (aj) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !ajVar3.f950a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) ajVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = hne.D(measuredWidth4, ((LinearLayout.LayoutParams) ajVar3).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        ox30 ox30Var;
        boolean z = this.v;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.v = z2;
        if (z != z2) {
            this.w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.v && (ox30Var = this.p) != null && size != this.w) {
            this.w = size;
            ox30Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.v || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                aj ajVar = (aj) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) ajVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) ajVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.x;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.y;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                aj ajVar2 = (aj) childAt.getLayoutParams();
                ajVar2.f = false;
                ajVar2.c = 0;
                ajVar2.b = 0;
                ajVar2.d = false;
                ((LinearLayout.LayoutParams) ajVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) ajVar2).rightMargin = 0;
                ajVar2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = ajVar2.f950a ? 1 : i10;
                aj ajVar3 = (aj) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                ajVar3.d = !ajVar3.f950a && z6;
                ajVar3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (ajVar2.d) {
                    i15++;
                }
                if (ajVar2.f950a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                aj ajVar4 = (aj) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (ajVar4.d) {
                    int i28 = ajVar4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                aj ajVar5 = (aj) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && ajVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    ajVar5.b += r11;
                    ajVar5.f = r11;
                    i23--;
                } else if (ajVar5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((aj) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((aj) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    aj ajVar6 = (aj) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        ajVar6.c = i32;
                        ajVar6.f = true;
                        if (i33 == 0 && !ajVar6.e) {
                            ((LinearLayout.LayoutParams) ajVar6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (ajVar6.f950a) {
                        ajVar6.c = i32;
                        ajVar6.f = true;
                        ((LinearLayout.LayoutParams) ajVar6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) ajVar6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) ajVar6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                aj ajVar7 = (aj) childAt4.getLayoutParams();
                if (ajVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((ajVar7.b * i22) + ajVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.t.q = z;
    }

    public void setOnMenuItemClickListener(bj bjVar) {
        this.z = bjVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        xi xiVar = this.t;
        wi wiVar = xiVar.i;
        if (wiVar != null) {
            wiVar.setImageDrawable(drawable);
        } else {
            xiVar.k = true;
            xiVar.j = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.s = z;
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(xi xiVar) {
        this.t = xiVar;
        xiVar.h = this;
        this.p = xiVar.c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
