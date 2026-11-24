package com.google.android.material.appbar;

import a.ack;
import a.clc;
import a.csn;
import a.dwi0;
import a.f2d;
import a.g7x;
import a.igu0;
import a.jiq0;
import a.mo8;
import a.mrv;
import a.n6x;
import a.n73;
import a.r2d;
import a.rgu0;
import a.rpd0;
import a.s2d;
import a.t2d;
import a.xiv0;
import a.ziu0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public s2d A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45556a;
    public final int b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int f1;
    public int g;
    public int g1;
    public int h;
    public xiv0 h1;
    public int i;
    public int i1;
    public int j;
    public boolean j1;
    public final Rect k;
    public int k1;
    public final f2d l;
    public int l1;
    public final f2d m;
    public boolean m1;
    public final csn n;
    public int n1;
    public boolean o;
    public boolean p;
    public final int q;
    public Drawable r;
    public Drawable s;
    public int t;
    public boolean u;
    public ValueAnimator v;
    public long w;
    public final TimeInterpolator x;
    public final TimeInterpolator y;
    public int z;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListA;
        ColorStateList colorStateListA2;
        super(dwi0.V(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        this.f45556a = true;
        this.k = new Rect();
        this.z = -1;
        this.i1 = 0;
        this.k1 = 0;
        this.l1 = 0;
        this.n1 = 0;
        Context context2 = getContext();
        this.f1 = getResources().getConfiguration().orientation;
        f2d f2dVar = new f2d(this);
        this.l = f2dVar;
        DecelerateInterpolator decelerateInterpolator = n73.e;
        f2dVar.X = decelerateInterpolator;
        f2dVar.l(false);
        f2dVar.K = false;
        this.n = new csn(context2);
        mrv.c0(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = rpd0.l;
        mrv.d0(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int i = typedArrayObtainStyledAttributes.getInt(9, 8388691);
        int i2 = typedArrayObtainStyledAttributes.getInt(2, 8388627);
        this.q = typedArrayObtainStyledAttributes.getInt(3, 1);
        f2dVar.x(i);
        f2dVar.s(i2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.o = typedArrayObtainStyledAttributes.getBoolean(28, true);
        setTitle(typedArrayObtainStyledAttributes.getText(26));
        f2dVar.w(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        f2dVar.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            f2dVar.w(typedArrayObtainStyledAttributes.getResourceId(16, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            f2dVar.q(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(31)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(31, -1);
            setTitleEllipsize(i3 != 0 ? i3 != 1 ? i3 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17) && f2dVar.o != (colorStateListA2 = g7x.A(17, context2, typedArrayObtainStyledAttributes))) {
            f2dVar.o = colorStateListA2;
            f2dVar.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            f2dVar.r(g7x.A(5, context2, typedArrayObtainStyledAttributes));
        }
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (typedArrayObtainStyledAttributes.hasValue(29)) {
            f2dVar.v(typedArrayObtainStyledAttributes.getInt(29, 1));
        } else if (typedArrayObtainStyledAttributes.hasValue(20)) {
            f2dVar.v(typedArrayObtainStyledAttributes.getInt(20, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            f2dVar.W = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0));
            f2dVar.l(false);
        }
        f2d f2dVar2 = new f2d(this);
        this.m = f2dVar2;
        f2dVar2.X = decelerateInterpolator;
        f2dVar2.l(false);
        f2dVar2.K = false;
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            setSubtitle(typedArrayObtainStyledAttributes.getText(24));
        }
        f2dVar2.x(i);
        f2dVar2.s(i2);
        f2dVar2.w(R.style.TextAppearance_AppCompat_Headline);
        f2dVar2.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            f2dVar2.w(typedArrayObtainStyledAttributes.getResourceId(7, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            f2dVar2.q(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8) && f2dVar2.o != (colorStateListA = g7x.A(8, context2, typedArrayObtainStyledAttributes))) {
            f2dVar2.o = colorStateListA;
            f2dVar2.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            f2dVar2.r(g7x.A(1, context2, typedArrayObtainStyledAttributes));
        }
        if (typedArrayObtainStyledAttributes.hasValue(25)) {
            f2dVar2.v(typedArrayObtainStyledAttributes.getInt(25, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(30)) {
            f2dVar2.W = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(30, 0));
            f2dVar2.l(false);
        }
        this.w = typedArrayObtainStyledAttributes.getInt(21, Response.BUSY_EVERYWHERE);
        this.x = g7x.W(context2, R.attr.motionEasingStandardInterpolator, n73.c);
        this.y = g7x.W(context2, R.attr.motionEasingStandardInterpolator, n73.d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(6));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(23));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(27, 0));
        this.b = typedArrayObtainStyledAttributes.getResourceId(32, -1);
        this.j1 = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.m1 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        clc clcVar = new clc(this, (byte) 11);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(this, clcVar);
    }

    public static ziu0 b(View view) {
        ziu0 ziu0Var = (ziu0) view.getTag(R.id.view_offset_helper);
        if (ziu0Var != null) {
            return ziu0Var;
        }
        ziu0 ziu0Var2 = new ziu0(view);
        view.setTag(R.id.view_offset_helper, ziu0Var2);
        return ziu0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListValueOf;
        Context context = getContext();
        TypedValue typedValueQ = n6x.Q(context.getTheme(), R.attr.colorSurfaceContainer);
        if (typedValueQ != null) {
            int i = typedValueQ.resourceId;
            if (i != 0) {
                colorStateListValueOf = jiq0.n0(i, context);
            } else {
                int i2 = typedValueQ.data;
                if (i2 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i2);
                } else {
                    colorStateListValueOf = null;
                }
            }
        } else {
            colorStateListValueOf = null;
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        csn csnVar = this.n;
        return csnVar.a(dimension, csnVar.d);
    }

    public final void a() {
        if (this.f45556a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.f45556a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.o && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.o || this.c == null) {
            return;
        }
        View view2 = this.e;
        if (view2 == null) {
            view2 = new View(getContext());
            this.e = view2;
        }
        if (view2.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r2d;
    }

    public final void d() {
        if (this.r == null && this.s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.r) != null && this.t > 0) {
            drawable.mutate().setAlpha(this.t);
            this.r.draw(canvas);
        }
        if (this.o && this.p) {
            ViewGroup viewGroup = this.c;
            f2d f2dVar = this.m;
            f2d f2dVar2 = this.l;
            if (viewGroup == null || this.r == null || this.t <= 0 || this.g1 != 1 || f2dVar2.b >= f2dVar2.e) {
                f2dVar2.f(canvas);
                f2dVar.f(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                f2dVar2.f(canvas);
                f2dVar.f(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.s == null || this.t <= 0) {
            return;
        }
        xiv0 xiv0Var = this.h1;
        int iD = xiv0Var != null ? xiv0Var.d() : 0;
        if (iD > 0) {
            this.s.setBounds(0, -this.B, getWidth(), iD - this.B);
            this.s.mutate().setAlpha(this.t);
            this.s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.r;
        if (drawable == null || this.t <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.g1 == 1 && view != null && this.o) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.r.mutate().setAlpha(this.t);
            this.r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        f2d f2dVar = this.l;
        if (f2dVar != null) {
            f2dVar.S = drawableState;
            ColorStateList colorStateList2 = f2dVar.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = f2dVar.o) != null && colorStateList.isStateful())) {
                f2dVar.l(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.o || (view = this.e) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.e.getVisibility() == 0;
        this.p = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((r2d) view2.getLayoutParams())).bottomMargin;
            View view3 = this.e;
            Rect rect = this.k;
            ack.a(this, view3, rect);
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.right - (z3 ? titleMarginStart : titleMarginEnd);
            int i7 = rect.top + height + titleMarginTop;
            int i8 = (rect.bottom + height) - titleMarginBottom;
            f2d f2dVar = this.m;
            TextPaint textPaint = f2dVar.V;
            textPaint.setTextSize(f2dVar.n);
            textPaint.setTypeface(f2dVar.x);
            textPaint.setLetterSpacing(f2dVar.g0);
            int iDescent = (int) (i8 - (textPaint.descent() + (-textPaint.ascent())));
            f2d f2dVar2 = this.l;
            TextPaint textPaint2 = f2dVar2.V;
            textPaint2.setTextSize(f2dVar2.n);
            textPaint2.setTypeface(f2dVar2.x);
            textPaint2.setLetterSpacing(f2dVar2.g0);
            int iDescent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i7);
            if (TextUtils.isEmpty(f2dVar.H)) {
                f2dVar2.o(i5, i7, i6, i8);
            } else {
                f2dVar2.o(i5, i7, i6, iDescent);
                f2dVar.o(i5, iDescent2, i6, i8);
            }
            if (this.q == 0) {
                ack.a(this, this, rect);
                int i9 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
                int i10 = rect.right;
                if (!z3) {
                    titleMarginStart = titleMarginEnd;
                }
                int i11 = i10 - titleMarginStart;
                if (TextUtils.isEmpty(f2dVar.H)) {
                    f2dVar2.p(i9, i7, i11, i8);
                } else {
                    f2dVar2.p(i9, i7, i11, iDescent);
                    f2dVar.p(i9, iDescent2, i11, i8);
                }
            }
            int i12 = z3 ? this.h : this.f;
            int i13 = rect.top + this.g;
            int i14 = (i3 - i) - (z3 ? this.f : this.h);
            int i15 = (i4 - i2) - this.i;
            boolean zIsEmpty = TextUtils.isEmpty(f2dVar.H);
            f2d f2dVar3 = this.l;
            if (zIsEmpty) {
                f2dVar3.u(true, i12, i13, i14, i15);
                f2dVar2.l(z);
            } else {
                f2dVar3.u(false, i12, i13, i14, (int) ((i15 - (f2dVar.i() + this.l1)) - this.j));
                this.m.u(false, i12, (int) (f2dVar2.i() + this.k1 + i13 + this.j), i14, i15);
                f2dVar2.l(z);
                f2dVar.l(z);
            }
        }
    }

    public final void f() {
        CharSequence title;
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || !this.o) {
            return;
        }
        CharSequence subtitle = null;
        if (viewGroup instanceof Toolbar) {
            title = ((Toolbar) viewGroup).getTitle();
        } else {
            title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        }
        if (TextUtils.isEmpty(this.l.H) && !TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 instanceof Toolbar) {
            subtitle = ((Toolbar) viewGroup2).getSubtitle();
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            subtitle = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.m.H) || TextUtils.isEmpty(subtitle)) {
            return;
        }
        setSubtitle(subtitle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        r2d r2dVar = new r2d(-1, -1);
        r2dVar.f29726a = 0;
        r2dVar.b = 0.5f;
        return r2dVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        r2d r2dVar = new r2d(context, attributeSet);
        r2dVar.f29726a = 0;
        r2dVar.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.m);
        r2dVar.f29726a = typedArrayObtainStyledAttributes.getInt(0, 0);
        r2dVar.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return r2dVar;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.m.n;
    }

    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.m.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.l.l;
    }

    public float getCollapsedTitleTextSize() {
        return this.l.n;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.l.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.r;
    }

    public float getExpandedSubtitleTextSize() {
        return this.m.m;
    }

    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.m.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.l.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public int getExpandedTitleSpacing() {
        return this.j;
    }

    public float getExpandedTitleTextSize() {
        return this.l.m;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.l.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.l.s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.l.j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.l.j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.l.j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.l.o0;
    }

    public int getScrimAlpha() {
        return this.t;
    }

    public long getScrimAnimationDuration() {
        return this.w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.z;
        if (i >= 0) {
            return i + this.i1 + this.k1 + this.l1 + this.n1;
        }
        xiv0 xiv0Var = this.h1;
        int iD = xiv0Var != null ? xiv0Var.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.s;
    }

    public CharSequence getSubtitle() {
        if (this.o) {
            return this.m.H;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.o) {
            return this.l.H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.g1;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.l.W;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.l.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.g1 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            s2d s2dVar = this.A;
            if (s2dVar == null) {
                s2dVar = new s2d(this);
                this.A = s2dVar;
            }
            appBarLayout.a(s2dVar);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f2d f2dVar = this.l;
        f2dVar.k(configuration);
        if (this.f1 != configuration.orientation && this.m1 && f2dVar.b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.f1 = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        s2d s2dVar = this.A;
        if (s2dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).f(s2dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        xiv0 xiv0Var = this.h1;
        if (xiv0Var != null) {
            int iD = xiv0Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            ziu0 ziu0VarB = b(getChildAt(i6));
            View view = ziu0VarB.f44455a;
            ziu0VarB.b = view.getTop();
            ziu0VarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        xiv0 xiv0Var = this.h1;
        int iD = xiv0Var != null ? xiv0Var.d() : 0;
        if ((mode == 0 || this.j1) && iD > 0) {
            this.i1 = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        f();
        boolean z = this.o;
        f2d f2dVar = this.l;
        if (!z || TextUtils.isEmpty(f2dVar.H)) {
            collapsingToolbarLayout = this;
        } else {
            int measuredHeight3 = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.e(true, 0, 0, getMeasuredWidth(), measuredHeight3);
            float fI = f2dVar.i() + collapsingToolbarLayout.i1 + collapsingToolbarLayout.g;
            f2d f2dVar2 = collapsingToolbarLayout.m;
            int i3 = (int) (fI + (TextUtils.isEmpty(f2dVar2.H) ? 0.0f : collapsingToolbarLayout.j + f2dVar2.i()) + collapsingToolbarLayout.i);
            if (i3 > measuredHeight3) {
                collapsingToolbarLayout.n1 = i3 - measuredHeight3;
            } else {
                collapsingToolbarLayout.n1 = 0;
            }
            if (collapsingToolbarLayout.m1) {
                if (f2dVar.o0 > 1) {
                    int i4 = f2dVar.q;
                    if (i4 > 1) {
                        collapsingToolbarLayout.k1 = (i4 - 1) * Math.round(f2dVar.i());
                    } else {
                        collapsingToolbarLayout.k1 = 0;
                    }
                }
                if (f2dVar2.o0 > 1) {
                    int i5 = f2dVar2.q;
                    if (i5 > 1) {
                        collapsingToolbarLayout.l1 = (i5 - 1) * Math.round(f2dVar2.i());
                    } else {
                        collapsingToolbarLayout.l1 = 0;
                    }
                }
            }
            int i6 = collapsingToolbarLayout.n1;
            int i7 = collapsingToolbarLayout.k1;
            int i8 = collapsingToolbarLayout.l1;
            if (i6 + i7 + i8 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight3 + i6 + i7 + i8, 1073741824));
            }
        }
        ViewGroup viewGroup = collapsingToolbarLayout.c;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.d;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight);
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                } else {
                    measuredHeight2 = view.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight2);
            }
        }
        if (collapsingToolbarLayout.m1 && f2dVar.o0 > 1 && f2dVar.b == 1.0f) {
            ViewParent parent = collapsingToolbarLayout.getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.g1 == 1 && viewGroup != null && this.o) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.m.q(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f) {
        f2d f2dVar = this.m;
        if (f2dVar.n != f) {
            f2dVar.n = f;
            f2dVar.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        f2d f2dVar = this.m;
        if (f2dVar.t(typeface)) {
            f2dVar.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.l.s(i);
        this.m.s(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.l.q(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        f2d f2dVar = this.l;
        if (f2dVar.n != f) {
            f2dVar.n = f;
            f2dVar.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        f2d f2dVar = this.l;
        if (f2dVar.t(typeface)) {
            f2dVar.l(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.r = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.g1 == 1 && viewGroup != null && this.o) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.r.setCallback(this);
                this.r.setAlpha(this.t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.m.w(i);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        f2d f2dVar = this.m;
        if (f2dVar.o != colorStateList) {
            f2dVar.o = colorStateList;
            f2dVar.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f) {
        this.m.y(f);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        f2d f2dVar = this.m;
        if (f2dVar.z(typeface)) {
            f2dVar.l(false);
        }
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.l.x(i);
        this.m.x(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.j = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.l.w(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        f2d f2dVar = this.l;
        if (f2dVar.o != colorStateList) {
            f2dVar.o = colorStateList;
            f2dVar.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        this.l.y(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        f2d f2dVar = this.l;
        if (f2dVar.z(typeface)) {
            f2dVar.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.m1 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.j1 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.l.s0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.l.q0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.l.r0 = f;
    }

    public void setMaxLines(int i) {
        this.l.v(i);
        this.m.v(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.l.K = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.t) {
            if (this.r != null && (viewGroup = this.c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.t = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.w = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.z != i) {
            this.z = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.u != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.v = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.t ? this.x : this.y);
                    this.v.addUpdateListener(new mo8(this, (byte) 1));
                } else if (valueAnimator.isRunning()) {
                    this.v.cancel();
                }
                this.v.setDuration(this.w);
                this.v.setIntValues(this.t, i);
                this.v.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.u = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(t2d t2dVar) {
        f2d f2dVar = this.l;
        f2dVar.getClass();
        if (t2dVar != null) {
            f2dVar.l(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                this.s.setLayoutDirection(getLayoutDirection());
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
                this.s.setAlpha(this.t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.m.B(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.l.B(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.g1 = i;
        boolean z = i == 1;
        this.l.c = z;
        this.m.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.g1 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.r == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        f2d f2dVar = this.l;
        f2dVar.G = truncateAt;
        f2dVar.l(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        f2d f2dVar = this.l;
        f2dVar.W = timeInterpolator;
        f2dVar.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.s;
        if (drawable != null && drawable.isVisible() != z) {
            this.s.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.r.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.s;
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.m.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.l.r(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        r2d r2dVar = new r2d(-1, -1);
        r2dVar.f29726a = 0;
        r2dVar.b = 0.5f;
        return r2dVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        r2d r2dVar = new r2d(layoutParams);
        r2dVar.f29726a = 0;
        r2dVar.b = 0.5f;
        return r2dVar;
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
