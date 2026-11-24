package org.xplatform.uikit.components.text_field;

import a.a5i;
import a.b5i;
import a.b7n;
import a.bqd0;
import a.btm;
import a.c5i;
import a.c7n;
import a.cem0;
import a.d5i;
import a.dpl;
import a.dyb;
import a.f5i;
import a.h5i;
import a.hie0;
import a.hne;
import a.i5i;
import a.igu0;
import a.iqi;
import a.j5i;
import a.jmu0;
import a.jrx;
import a.kud;
import a.m5d;
import a.q10;
import a.rgu0;
import a.std;
import a.t4i;
import a.t9f;
import a.u4i;
import a.x0x;
import a.z4i;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.text_field.end.c;
import org.xplatform.uikit.components.text_field.middle.b;

/* JADX INFO: loaded from: classes6.dex */
public final class DsTextField extends jrx {
    public static final /* synthetic */ int m1 = 0;
    public final h5i A;
    public final b B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47271a;
    public AnimatorSet b;
    public final LinearInterpolator c;
    public final int d;
    public final int e;
    public final int f;
    public final u4i f1;
    public final int g;
    public final j5i g1;
    public final int h;
    public final d5i h1;
    public final int i;
    public final View i1;
    public final int j;
    public final DsShimmerView j1;
    public final int k;
    public final f5i k1;
    public final int l;
    public final t4i l1;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsTextField(Context context, AttributeSet attributeSet, int i) {
        u4i z4iVar;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        byte b = 0;
        super(context, attributeSet, 0, R.style.Widget_DSTextField_Basic);
        this.f47271a = getResources().getConfiguration().getLayoutDirection() == 0;
        this.c = new LinearInterpolator();
        this.d = getResources().getDimensionPixelSize(R.dimen.size_14);
        this.e = getResources().getDimensionPixelSize(R.dimen.size_116);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_14);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.j = getResources().getDimensionPixelSize(R.dimen.size_12);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_8);
        kud kudVar = i5i.f14193a;
        t4i t4iVar = new t4i(context);
        this.l1 = t4iVar;
        setSaveEnabled(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.G, 0, R.style.Widget_DSTextField_Basic);
        i5i.f14193a.getClass();
        i5i i5iVarC = kud.c(typedArrayObtainStyledAttributes);
        boolean z = typedArrayObtainStyledAttributes.getResourceId(33, 0) != 0;
        this.x = typedArrayObtainStyledAttributes.getBoolean(14, this.x);
        if (i5iVarC == i5i.FILLED) {
            this.z = typedArrayObtainStyledAttributes.getBoolean(12, this.z);
        }
        this.l = z ? typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_4) : 0;
        int iOrdinal = i5iVarC.ordinal();
        if (iOrdinal == 0) {
            this.m = !z ? typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_4) : 0;
            this.n = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_8);
            this.o = 0;
            this.p = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_4);
            this.q = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_4);
            this.r = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_4);
            this.s = 0;
            this.t = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_4);
            this.u = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_2);
            this.v = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_10);
            this.w = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.size_18);
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                throw null;
            }
            this.m = z ? typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_8) : typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_12);
            this.n = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_12);
            this.o = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_8);
            this.p = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_12);
            this.q = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_12);
            typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_12);
            this.r = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_12);
            this.s = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_12);
            this.t = 0;
            this.u = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_16);
            this.v = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.space_16);
            this.w = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.size_14);
        }
        Context context2 = getContext();
        context2.getClass();
        d5i d5iVar = new d5i(context2, null, 0);
        d5iVar.j = m5d.b(R.attr.uikitWarning, context2);
        d5iVar.k = m5d.b(R.attr.uikitSecondary, context2);
        d5iVar.setSingleLine(false);
        d5iVar.setEnabled(false);
        this.h1 = d5iVar;
        d5iVar.e(typedArrayObtainStyledAttributes);
        addView(this.h1);
        View view = new View(getContext());
        this.i1 = view;
        Context context3 = getContext();
        context3.getClass();
        jmu0.j(view, ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context3)));
        View view2 = this.i1;
        if (view2 != null) {
            view2.setBackground(typedArrayObtainStyledAttributes.getDrawable(18));
        }
        View view3 = this.i1;
        if (view3 != null) {
            view3.setTag("VipBetTestTag");
        }
        addView(this.i1);
        byte b2 = 20;
        this.y = typedArrayObtainStyledAttributes.getBoolean(20, this.y);
        Context context4 = getContext();
        context4.getClass();
        byte b3 = 6;
        DsShimmerView dsShimmerView = new DsShimmerView(context4, null, 6);
        jmu0.i(dsShimmerView, R.dimen.radius_12);
        this.j1 = dsShimmerView;
        addView(dsShimmerView);
        g(this.y);
        t4iVar.e(typedArrayObtainStyledAttributes);
        addView(t4iVar);
        if (z) {
            Context context5 = getContext();
            context5.getClass();
            h5i h5iVar = new h5i(context5);
            this.A = h5iVar;
            h5iVar.e(typedArrayObtainStyledAttributes);
            View view4 = this.A;
            view4.getClass();
            addView(view4);
        }
        Context context6 = getContext();
        context6.getClass();
        b bVar = new b(context6);
        this.B = bVar;
        bVar.e(typedArrayObtainStyledAttributes);
        View view5 = this.B;
        view5.getClass();
        addView(view5);
        b5i.f2005a.getClass();
        int iOrdinal2 = std.f(typedArrayObtainStyledAttributes).ordinal();
        if (iOrdinal2 == 0) {
            Context context7 = getContext();
            context7.getClass();
            c5i c5iVar = new c5i(context7, null, 0);
            c5iVar.f3773a = context7.getDrawable(R.drawable.ic_glyph_circle_warning);
            c5iVar.b = new PorterDuffColorFilter(m5d.b(R.attr.uikitWarning, context7), PorterDuff.Mode.SRC_IN);
            c5iVar.setVisibility(8);
            z4iVar = c5iVar;
        } else if (iOrdinal2 == 1) {
            Context context8 = getContext();
            context8.getClass();
            z4iVar = new z4i(context8);
        } else if (iOrdinal2 == 2) {
            Context context9 = getContext();
            context9.getClass();
            z4iVar = new a5i(context9);
        } else if (iOrdinal2 == 3) {
            Context context10 = getContext();
            context10.getClass();
            z4iVar = new org.xplatform.uikit.components.text_field.end.b(context10);
        } else if (iOrdinal2 == 4) {
            Context context11 = getContext();
            context11.getClass();
            c cVar = new c(context11);
            b bVar2 = this.B;
            if (bVar2 != null) {
                bVar2.h(!cVar.f47276a);
            }
            cVar.setOnCheckedChangeListener(new c7n(this, b));
            z4iVar = cVar;
        } else {
            if (iOrdinal2 != 5) {
                t9f.b();
                throw null;
            }
            z4iVar = null;
        }
        this.f1 = z4iVar;
        if (z4iVar != null) {
            z4iVar.e(typedArrayObtainStyledAttributes);
        }
        Object obj = this.f1;
        View view6 = obj != null ? (View) obj : null;
        if (view6 != null) {
            addView(view6);
        }
        Context context12 = getContext();
        context12.getClass();
        j5i j5iVar = new j5i(context12, null, 0);
        j5iVar.setTag("DSTextFieldTrailingView");
        j5iVar.setGravity(16);
        j5iVar.setTextAlignment(6);
        j5iVar.setSingleLine(true);
        j5iVar.setHorizontallyScrolling(false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        j5iVar.setEllipsize(truncateAt);
        j5iVar.setMaxWidth(j5iVar.getResources().getDimensionPixelSize(R.dimen.size_64));
        j5iVar.setTextAppearance(R.style.TextAppearance_Text_Medium);
        j5iVar.setTextColor(m5d.b(R.attr.uikitCommerce, context12));
        this.g1 = j5iVar;
        j5iVar.e(typedArrayObtainStyledAttributes);
        j5i j5iVar2 = this.g1;
        if (j5iVar2 != null) {
            j5iVar2.setOnClickListener(new q10(this, b2));
        }
        addView(this.g1);
        Context context13 = getContext();
        context13.getClass();
        f5i f5iVar = new f5i(context13, null, 0);
        f5iVar.k = m5d.b(R.attr.uikitWarning, context13);
        f5iVar.l = m5d.b(R.attr.uikitSecondary, context13);
        f5iVar.m = m5d.b(R.attr.uikitPrimary, context13);
        f5iVar.setTag("DSTextFieldLabelView");
        f5iVar.setSingleLine(true);
        f5iVar.setEnabled(false);
        f5iVar.setEllipsize(truncateAt);
        this.k1 = f5iVar;
        f5iVar.e(typedArrayObtainStyledAttributes);
        e();
        addView(this.k1);
        typedArrayObtainStyledAttributes.recycle();
        iqi iqiVar = new iqi(this, new hie0(), b3);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(this, iqiVar);
        b bVar3 = this.B;
        b bVar4 = bVar3 != null ? bVar3 : null;
        if (bVar4 != null) {
            bVar4.setOnFocusChangeListener(new b7n(this, b));
        }
    }

    private final int getEndViewWidth() {
        u4i u4iVar = this.f1;
        if (u4iVar == null || u4iVar.getVisibility() != 0 || u4iVar == null) {
            return 0;
        }
        return u4iVar.getMeasuredWidth();
    }

    private final int getHelperHeight() {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.y) {
            return this.d;
        }
        d5i d5iVar = this.h1;
        if (d5iVar == null || (!d5iVar.i ? !((charSequence = d5iVar.m) == null || charSequence.length() == 0) : !((charSequence2 = d5iVar.l) == null || charSequence2.length() == 0))) {
            return getHelperMinHeight();
        }
        return d5iVar != null ? d5iVar.getMeasuredHeight() : getHelperMinHeight();
    }

    private final int getHelperMinHeight() {
        if (this.z) {
            return 0;
        }
        return this.f;
    }

    private final int getLabelHeight() {
        f5i f5iVar = this.k1;
        CharSequence text = f5iVar != null ? f5iVar.getText() : null;
        if (text == null || text.length() == 0) {
            return 0;
        }
        return f5iVar != null ? f5iVar.getMeasuredHeight() : this.w;
    }

    private final int getTrailingReservedWidth() {
        j5i j5iVar = this.g1;
        if (j5iVar != null) {
            if (j5iVar.getVisibility() != 0 || !j5iVar.j()) {
                j5iVar = null;
            }
            if (j5iVar != null) {
                boolean z = getEndViewWidth() > 0;
                return j5iVar.getMeasuredWidth() + (z ? this.k : this.o) + (z ? 0 : this.p);
            }
        }
        return 0;
    }

    public final void a(TextWatcher textWatcher) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.addTextChangedListener(textWatcher);
        }
    }

    public final void b() {
        b bVar = this.B;
        if (bVar == null) {
            bVar = null;
        }
        j5i j5iVar = this.g1;
        if (j5iVar != null && bVar != null && isEnabled() && j5iVar.getVisibility() == 0 && j5iVar.j() && bVar.isFocusable()) {
            bVar.requestFocus();
        }
    }

    public final void c(TextWatcher textWatcher) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.removeTextChangedListener(textWatcher);
        }
    }

    public final void d() {
        b bVar;
        CharSequence text;
        f5i f5iVar = this.k1;
        if (f5iVar == null || (bVar = this.B) == null) {
            return;
        }
        boolean zF = bVar.f();
        boolean z = (f5iVar.getVisibility() != 0 || (text = f5iVar.getText()) == null || text.length() == 0) ? false : true;
        boolean zIsFocused = bVar.isFocused();
        if (zF && z && !zIsFocused) {
            f5iVar.setTranslationX(0.0f);
            f5iVar.setTranslationY(0.0f);
            f5iVar.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0033  */
    public final void e() {
        b bVar = this.B;
        boolean zF = bVar != null ? bVar.f() : false;
        f5i f5iVar = this.k1;
        CharSequence text = f5iVar != null ? f5iVar.getText() : null;
        boolean z = true;
        boolean z2 = text == null || text.length() == 0;
        if (f5iVar != null) {
            if (z2) {
                z = false;
            } else if (!zF) {
                if (!(bVar != null ? bVar.isFocused() : false)) {
                    z = false;
                }
            }
            f5iVar.setVisibility(z ? 0 : 8);
        }
    }

    public final void f(boolean z) {
        int i;
        if (this.x == z) {
            return;
        }
        this.x = z;
        b bVar = this.B;
        if (bVar != null) {
            bVar.m = z;
            bVar.j();
        }
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            d5iVar.i = z;
            d5iVar.setTextColor(z ? d5iVar.j : d5iVar.k);
            d5iVar.j();
        }
        f5i f5iVar = this.k1;
        if (f5iVar != null) {
            f5iVar.i = z;
            if (z) {
                i = f5iVar.k;
            } else {
                i = f5iVar.j ? f5iVar.m : f5iVar.l;
            }
            f5iVar.setTextColor(i);
        }
        h();
        t4i t4iVar = this.l1;
        t4iVar.f33320a = z;
        t4iVar.invalidate();
    }

    public final void g(boolean z) {
        this.y = z;
        DsShimmerView dsShimmerView = this.j1;
        if (dsShimmerView != null) {
            dsShimmerView.setVisibility(z ? 0 : 8);
        }
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            d5iVar.setVisibility(z ? 8 : 0);
        }
        View view = this.i1;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
        if (z) {
            x0x.s(this);
        } else {
            x0x.O(this);
        }
    }

    public final boolean getEndPasswordChecked() {
        u4i u4iVar = this.f1;
        c cVar = u4iVar instanceof c ? (c) u4iVar : null;
        return cVar != null && cVar.f47276a;
    }

    public final InputFilter[] getFilters() {
        InputFilter[] filters;
        b bVar = this.B;
        return (bVar == null || (filters = bVar.getFilters()) == null) ? new InputFilter[0] : filters;
    }

    public final CharSequence getPlaceholderOrEmpty() {
        CharSequence placeHolderOrEmpty;
        b bVar = this.B;
        return (bVar == null || (placeHolderOrEmpty = bVar.getPlaceHolderOrEmpty()) == null) ? "" : placeHolderOrEmpty;
    }

    public final int getSelectionStart() {
        b bVar = this.B;
        if (bVar != null) {
            return bVar.getSelectionStart();
        }
        return 0;
    }

    public final CharSequence getText() {
        b bVar = this.B;
        if (bVar != null) {
            return bVar.getText();
        }
        return null;
    }

    public final TextView getTextView() {
        b bVar = this.B;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final void h() {
        j5i j5iVar;
        u4i u4iVar = this.f1;
        c5i c5iVar = u4iVar instanceof c5i ? (c5i) u4iVar : null;
        if (c5iVar != null) {
            c5iVar.a(this.x && !((j5iVar = this.g1) != null && j5iVar.getVisibility() == 0 && j5iVar.j()));
        } else if (u4iVar != null) {
            u4iVar.a(this.x);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMin;
        CharSequence text;
        jmu0.f(getPaddingStart() + this.t, getPaddingTop() + getLabelHeight() + this.g, getMeasuredWidth() + getPaddingEnd(), (getMeasuredHeight() - getHelperHeight()) - this.h, this.l1, this);
        f5i f5iVar = this.k1;
        if (f5iVar != null) {
            int paddingStart = getPaddingStart() + this.r;
            int paddingTop = getPaddingTop();
            jmu0.f(paddingStart, paddingTop, (getMeasuredWidth() - this.s) - getPaddingEnd(), f5iVar.getMeasuredHeight() + paddingTop, f5iVar, this);
        }
        int i5 = this.q;
        int i6 = this.v;
        int i7 = this.u;
        b bVar = this.B;
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            int labelHeight = getLabelHeight();
            int measuredHeight = bVar != null ? bVar.getMeasuredHeight() : 0;
            int paddingStart2 = getPaddingStart() + i5;
            int paddingTop2 = getPaddingTop() + labelHeight + measuredHeight + i7 + i6;
            jmu0.f(paddingStart2, paddingTop2, d5iVar.getMeasuredWidth() + getPaddingEnd() + paddingStart2, d5iVar.getMeasuredHeight() + paddingTop2, d5iVar, this);
        }
        View view = this.i1;
        if (view != null) {
            d5i d5iVar2 = this.h1;
            int measuredHeight2 = d5iVar2 != null ? d5iVar2.getMeasuredHeight() : getHelperMinHeight();
            if (d5iVar2 != null) {
                iMin = Integer.min((int) d5iVar2.getPaint().measureText((d5iVar2 == null || (text = d5iVar2.getText()) == null) ? null : text.toString()), d5iVar2.getMeasuredWidth());
            } else {
                iMin = 0;
            }
            int iD = hne.D(getLabelHeight(), bVar != null ? bVar.getMeasuredHeight() : 0, i7 + i6, measuredHeight2) - (measuredHeight2 / 2);
            int paddingStart3 = this.i + getPaddingStart() + i5 + iMin;
            int paddingTop3 = getPaddingTop() + iD;
            int i8 = this.j;
            int i9 = paddingTop3 - (i8 / 2);
            jmu0.f(paddingStart3, i9, getPaddingEnd() + paddingStart3 + i8, i8 + i9, view, this);
        }
        DsShimmerView dsShimmerView = this.j1;
        if (dsShimmerView != null) {
            int labelHeight2 = getLabelHeight();
            int measuredHeight3 = bVar != null ? bVar.getMeasuredHeight() : 0;
            int paddingStart4 = getPaddingStart() + i5;
            int paddingTop4 = getPaddingTop() + labelHeight2 + measuredHeight3 + i6 + i7;
            jmu0.f(paddingStart4, paddingTop4, getPaddingEnd() + paddingStart4 + this.e, dsShimmerView.getMeasuredHeight() + paddingTop4, dsShimmerView, this);
        }
        h5i h5iVar = this.A;
        h5i h5iVar2 = h5iVar != null ? h5iVar : null;
        int i10 = this.l;
        if (h5iVar2 != null) {
            int labelHeight3 = getLabelHeight() + i7;
            int measuredHeight4 = bVar != null ? bVar.getMeasuredHeight() : 0;
            int i11 = (labelHeight3 + measuredHeight4) - (measuredHeight4 / 2);
            int measuredHeight5 = h5iVar2.getMeasuredHeight();
            int paddingStart5 = getPaddingStart() + i10;
            int paddingTop5 = (getPaddingTop() + i11) - (measuredHeight5 / 2);
            jmu0.f(paddingStart5, paddingTop5, h5iVar2.getMeasuredWidth() + getPaddingEnd() + paddingStart5, measuredHeight5 + paddingTop5, h5iVar2, this);
        }
        b bVar2 = bVar != null ? bVar : null;
        if (bVar2 != null) {
            int labelHeight4 = getLabelHeight();
            int measuredHeight6 = bVar2.getMeasuredHeight();
            int measuredWidth = h5iVar != null ? h5iVar.getMeasuredWidth() : 0;
            int endViewWidth = getEndViewWidth();
            int trailingReservedWidth = getTrailingReservedWidth();
            int paddingStart6 = getPaddingStart() + measuredWidth + this.m + i10;
            int paddingTop6 = getPaddingTop() + labelHeight4 + i7;
            jmu0.f(paddingStart6, paddingTop6, (((getMeasuredWidth() + getPaddingEnd()) - endViewWidth) - trailingReservedWidth) - this.n, paddingTop6 + measuredHeight6, bVar2, this);
        }
        Object obj = this.f1;
        View view2 = obj != null ? (View) obj : null;
        if (view2 != null) {
            int labelHeight5 = getLabelHeight();
            int measuredHeight7 = bVar != null ? bVar.getMeasuredHeight() : 0;
            int i12 = ((labelHeight5 + i7) + measuredHeight7) - (measuredHeight7 / 2);
            int measuredWidth2 = (getMeasuredWidth() - view2.getMeasuredWidth()) - getPaddingEnd();
            int paddingTop7 = (getPaddingTop() + i12) - (view2.getMeasuredHeight() / 2);
            jmu0.f(measuredWidth2, paddingTop7, view2.getMeasuredWidth() + measuredWidth2, view2.getMeasuredHeight() + paddingTop7, view2, this);
        }
        j5i j5iVar = this.g1;
        if (j5iVar == null || getTrailingReservedWidth() == 0) {
            return;
        }
        int labelHeight6 = getLabelHeight();
        int measuredHeight8 = bVar != null ? bVar.getMeasuredHeight() : 0;
        int i13 = labelHeight6 + i7;
        int endViewWidth2 = getEndViewWidth();
        int i14 = (measuredHeight8 / 2) + i13;
        int measuredWidth3 = ((getMeasuredWidth() - getPaddingEnd()) - endViewWidth2) - (endViewWidth2 > 0 ? this.k : this.p);
        int measuredWidth4 = measuredWidth3 - j5iVar.getMeasuredWidth();
        int paddingTop8 = (getPaddingTop() + i14) - (j5iVar.getMeasuredHeight() / 2);
        jmu0.f(measuredWidth4, paddingTop8, measuredWidth3, j5iVar.getMeasuredHeight() + paddingTop8, j5iVar, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int size = View.MeasureSpec.getSize(i) - paddingEnd;
        f5i f5iVar = this.k1;
        if (f5iVar != null) {
            int i3 = (size - this.r) - this.s;
            f5iVar.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = f5iVar.getMeasuredHeight();
            int i4 = this.w;
            if (measuredHeight < i4) {
                f5iVar.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
        }
        h5i h5iVar = this.A;
        if (h5iVar != null) {
            h5iVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        u4i u4iVar = this.f1;
        if (u4iVar != null) {
            u4iVar.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        j5i j5iVar = this.g1;
        if (j5iVar != null) {
            j5iVar.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_64), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int measuredWidth = h5iVar != null ? h5iVar.getMeasuredWidth() : 0;
        int endViewWidth = getEndViewWidth();
        int trailingReservedWidth = getTrailingReservedWidth();
        int i5 = this.l;
        int i6 = this.m;
        int i7 = this.n;
        int i8 = (((size - measuredWidth) - endViewWidth) - trailingReservedWidth) - ((i5 + i6) + i7);
        b bVar = this.B;
        if (bVar != null) {
            bVar.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        View view = this.i1;
        if (view != null) {
            int i9 = this.j;
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            int measuredWidth2 = (size - this.q) - ((view == null || view.getBackground() == null) ? 0 : view.getMeasuredWidth() + this.i);
            TextPaint paint = d5iVar.getPaint();
            paint.getClass();
            StaticLayout staticLayoutT = cem0.t(d5iVar, paint, measuredWidth2);
            d5iVar.measure(View.MeasureSpec.makeMeasureSpec(staticLayoutT.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(staticLayoutT.getHeight(), getHelperMinHeight()), 1073741824));
        }
        DsShimmerView dsShimmerView = this.j1;
        if (dsShimmerView != null) {
            dsShimmerView.measure(View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.d, 1073741824));
        }
        int labelHeight = getLabelHeight();
        int measuredHeight2 = bVar != null ? bVar.getMeasuredHeight() : 0;
        int helperHeight = getHelperHeight();
        int i10 = this.u + this.v + paddingBottom;
        setMeasuredDimension(View.resolveSize((h5iVar != null ? h5iVar.getMeasuredWidth() : 0) + (bVar != null ? bVar.getMeasuredWidth() : 0) + getEndViewWidth() + getTrailingReservedWidth() + i5 + i6 + i7 + paddingEnd, i), View.resolveSize(labelHeight + measuredHeight2 + helperHeight + i10, i2));
        this.l1.measure(View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) - this.t, 1073741824), View.MeasureSpec.makeMeasureSpec(((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - getLabelHeight()) - getHelperHeight()) - (this.g + this.h), 1073741824));
    }

    @Override // a.jrx, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        e();
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int right;
        int left;
        motionEvent.getClass();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        View view = null;
        b bVar = this.B;
        if (bVar == null) {
            bVar = null;
        }
        j5i j5iVar = this.g1;
        if (j5iVar != null && bVar != null && j5iVar.getVisibility() == 0 && j5iVar.j() && y >= bVar.getTop() && y <= bVar.getBottom()) {
            Object obj = this.f1;
            View view2 = obj != null ? (View) obj : null;
            if (view2 != null && view2.getVisibility() == 0 && view2.getWidth() > 0) {
                view = view2;
            }
            if (this.f47271a) {
                right = bVar.getRight();
                left = view != null ? view.getLeft() : getWidth() - getPaddingEnd();
            } else {
                right = view != null ? view.getRight() : getPaddingStart();
                left = bVar.getLeft();
            }
            if (x >= right && x <= left) {
                if (motionEvent.getActionMasked() == 1) {
                    b();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCursorVisible(boolean z) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setCursorVisible(z);
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setCustomSelectionActionModeCallback(callback);
        }
    }

    public final void setDynamicHelperHeight(boolean z) {
        this.z = z;
        invalidate();
        requestLayout();
    }

    public final void setEditable(boolean z) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setEditable(z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
        f5i f5iVar = this.k1;
        if (f5iVar != null) {
            f5iVar.setAlpha(getAlpha());
        }
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            d5iVar.setAlpha(getAlpha());
        }
        j5i j5iVar = this.g1;
        if (j5iVar != null) {
            j5iVar.setAlpha(getAlpha());
        }
        h5i h5iVar = this.A;
        if (h5iVar != null) {
            h5iVar.setAlpha(getAlpha());
        }
        b bVar = this.B;
        if (bVar != null) {
            bVar.setAlpha(getAlpha());
        }
        u4i u4iVar = this.f1;
        if (u4iVar != null) {
            u4iVar.setAlpha(getAlpha());
        }
        float alpha = getAlpha();
        t4i t4iVar = this.l1;
        t4iVar.setAlpha(alpha);
        if (h5iVar != null) {
            h5iVar.setEnabled(z);
        }
        if (bVar != null) {
            bVar.setEnabled(z);
        }
        if (u4iVar != null) {
            u4iVar.setEnabled(z);
        }
        t4iVar.setEnabled(z);
    }

    public final void setEndChevronClickListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        u4i u4iVar = this.f1;
        org.xplatform.uikit.components.text_field.end.b bVar = u4iVar instanceof org.xplatform.uikit.components.text_field.end.b ? (org.xplatform.uikit.components.text_field.end.b) u4iVar : null;
        if (bVar != null) {
            bVar.setClickListener(function1);
        }
    }

    public final void setEndIconClickListener(Function0<Unit> function0) {
        u4i u4iVar = this.f1;
        z4i z4iVar = u4iVar instanceof z4i ? (z4i) u4iVar : null;
        if (z4iVar != null) {
            dyb.O(z4iVar, new dpl((Object) z4iVar, (Object) function0, (byte) 23));
        }
    }

    public final void setEndIconDrawable(Drawable drawable) {
        u4i u4iVar = this.f1;
        z4i z4iVar = u4iVar instanceof z4i ? (z4i) u4iVar : null;
        if (z4iVar != null) {
            z4iVar.setEndIconDrawable(drawable);
        }
    }

    public final void setEndIconDrawableRes(int i) {
        u4i u4iVar = this.f1;
        z4i z4iVar = u4iVar instanceof z4i ? (z4i) u4iVar : null;
        if (z4iVar != null) {
            z4iVar.setEndIconDrawableRes(i);
        }
    }

    public final void setEndPasswordChecked(boolean z) {
        u4i u4iVar = this.f1;
        c cVar = u4iVar instanceof c ? (c) u4iVar : null;
        if (cVar != null) {
            cVar.setChecked(z);
        }
        b bVar = this.B;
        if (bVar != null) {
            bVar.h(!z);
        }
    }

    public final void setEndStepperMinusClickListener(Function0<Unit> function0) {
        u4i u4iVar = this.f1;
        a5i a5iVar = u4iVar instanceof a5i ? (a5i) u4iVar : null;
        if (a5iVar != null) {
            a5iVar.setMinusButtonClickListener(function0);
        }
    }

    public final void setEndStepperPlusClickListener(Function0<Unit> function0) {
        u4i u4iVar = this.f1;
        a5i a5iVar = u4iVar instanceof a5i ? (a5i) u4iVar : null;
        if (a5iVar != null) {
            a5iVar.setPlusButtonClickListener(function0);
        }
    }

    public final void setEndViewVisible(boolean z) {
        u4i u4iVar = this.f1;
        if (u4iVar != null) {
            u4iVar.setVisibility(z ? 0 : 8);
        }
    }

    public final void setErrorIconDrawable(Drawable drawable) {
        u4i u4iVar = this.f1;
        c5i c5iVar = u4iVar instanceof c5i ? (c5i) u4iVar : null;
        if (c5iVar != null) {
            c5iVar.setErrorDrawable(drawable);
        }
    }

    public final void setErrorIconDrawableRes(int i) {
        u4i u4iVar = this.f1;
        c5i c5iVar = u4iVar instanceof c5i ? (c5i) u4iVar : null;
        if (c5iVar != null) {
            c5iVar.setErrorDrawableRes(i);
        }
    }

    public final void setErrorText(CharSequence charSequence) {
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            d5iVar.setErrorText(charSequence);
        }
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        inputFilterArr.getClass();
        b bVar = this.B;
        if (bVar != null) {
            bVar.setFilters(inputFilterArr);
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setFocusable(z);
        }
    }

    public final void setHelperIconDrawable(Drawable drawable) {
        View view = this.i1;
        if (view != null) {
            view.setBackground(drawable);
        }
    }

    public final void setHelperIconRes(Integer num) {
        View view = this.i1;
        if (num == null) {
            if (view != null) {
                view.setBackground(null);
            }
        } else {
            int iIntValue = num.intValue();
            if (view != null) {
                view.setBackground(getContext().getDrawable(iIntValue));
            }
        }
    }

    public final void setHelperText(CharSequence charSequence) {
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            d5iVar.setValue(charSequence);
        }
        invalidate();
        requestLayout();
    }

    public final void setIgnoreTextSpaces(boolean z) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setIgnoreTextSpaces(z);
        }
    }

    public final void setImeOptions(int i) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setImeOptions(i);
        }
    }

    public final void setInputType(int i) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setInputType(i);
        }
    }

    public final void setKeyListener(KeyListener keyListener) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setKeyListener(keyListener);
        }
    }

    public final void setLabelText(CharSequence charSequence) {
        f5i f5iVar = this.k1;
        if (f5iVar != null) {
            f5iVar.setText(charSequence);
        }
        b bVar = this.B;
        if (bVar != null) {
            bVar.setLabelText(charSequence);
        }
        e();
    }

    public final void setLabelVisible(boolean z) {
        f5i f5iVar = this.k1;
        if (f5iVar != null) {
            f5iVar.setVisibility(z ? 0 : 8);
        }
    }

    public final void setMinusButtonEnabled(boolean z) {
        u4i u4iVar = this.f1;
        a5i a5iVar = u4iVar instanceof a5i ? (a5i) u4iVar : null;
        if (a5iVar != null) {
            a5iVar.setMinusButtonEnabled(z);
        }
    }

    public final void setMinusButtonVisible(boolean z) {
        u4i u4iVar = this.f1;
        a5i a5iVar = u4iVar instanceof a5i ? (a5i) u4iVar : null;
        if (a5iVar != null) {
            a5iVar.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        b bVar = this.B;
        if (bVar != null) {
            bVar.setOnClickListener(onClickListener);
        }
        h5i h5iVar = this.A;
        if (h5iVar != null) {
            h5iVar.setOnClickListener(onClickListener);
        }
        u4i u4iVar = this.f1;
        if (u4iVar != null) {
            u4iVar.setOnClickListener(onClickListener);
        }
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setOnEditorActionListener(onEditorActionListener);
        }
    }

    public final void setOnTextCopy(Function0<Unit> function0) {
        function0.getClass();
        b bVar = this.B;
        if (bVar != null) {
            bVar.setOnTextCopy(function0);
        }
    }

    public final void setOnTextCut(Function0<Unit> function0) {
        function0.getClass();
        b bVar = this.B;
        if (bVar != null) {
            bVar.setOnTextCut(function0);
        }
    }

    public final void setOnTextPaste(Function0<Unit> function0) {
        function0.getClass();
        b bVar = this.B;
        if (bVar != null) {
            bVar.setOnTextPaste(function0);
        }
    }

    public final void setPasswordVisibleListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        u4i u4iVar = this.f1;
        c cVar = u4iVar instanceof c ? (c) u4iVar : null;
        if (cVar != null) {
            cVar.setOnCheckedChangeListener(new btm(function1, (byte) 6));
        }
    }

    public final void setPlaceholderText(CharSequence charSequence) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setPlaceholderText(charSequence);
        }
    }

    public final void setPlusButtonEnabled(boolean z) {
        u4i u4iVar = this.f1;
        a5i a5iVar = u4iVar instanceof a5i ? (a5i) u4iVar : null;
        if (a5iVar != null) {
            a5iVar.setPlusButtonEnabled(z);
        }
    }

    public final void setPlusButtonVisible(boolean z) {
        u4i u4iVar = this.f1;
        a5i a5iVar = u4iVar instanceof a5i ? (a5i) u4iVar : null;
        if (a5iVar != null) {
            a5iVar.setVisibility(z ? 0 : 8);
        }
    }

    public final void setRawInputType(int i) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setRawInputType(i);
        }
    }

    public final void setSelection(int i) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setSelection(i);
        }
    }

    public final void setSingleLine(boolean z) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setSingleLine(z);
        }
    }

    public final void setStartIconDrawable(Drawable drawable) {
        h5i h5iVar = this.A;
        if (h5iVar != null) {
            h5iVar.setDrawable(drawable);
        }
    }

    public final void setStartIconDrawableRes(int i) {
        h5i h5iVar = this.A;
        if (h5iVar != null) {
            h5iVar.setDrawable(i);
        }
    }

    public final void setStartIconTint(int i) {
        h5i h5iVar = this.A;
        if (h5iVar != null) {
            h5iVar.setTint(i);
        }
    }

    public final void setStartIconTintList(ColorStateList colorStateList) {
        h5i h5iVar = this.A;
        if (h5iVar != null) {
            h5iVar.setTintList(colorStateList);
        }
    }

    public final void setStartIconVisibility(boolean z) {
        h5i h5iVar = this.A;
        if (h5iVar != null) {
            h5iVar.setVisibility(z ? 0 : 8);
        }
    }

    public final void setText(CharSequence charSequence) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setValue(charSequence);
        }
        e();
        d();
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setTextAlignment(i);
        }
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            d5iVar.setTextAlignment(i);
        }
        f5i f5iVar = this.k1;
        if (f5iVar != null) {
            f5iVar.setTextAlignment(i);
        }
    }

    @Override // android.view.View
    public void setTextDirection(int i) {
        b bVar = this.B;
        if (bVar != null) {
            bVar.setTextDirection(i);
        }
        d5i d5iVar = this.h1;
        if (d5iVar != null) {
            d5iVar.setTextDirection(i);
        }
        f5i f5iVar = this.k1;
        if (f5iVar != null) {
            f5iVar.setTextDirection(i);
        }
    }

    public final void setTrailingText(CharSequence charSequence) {
        j5i j5iVar = this.g1;
        if (j5iVar != null) {
            j5iVar.setValue(charSequence);
        }
        h();
        requestLayout();
    }

    public final void setTrailingTextVisible(boolean z) {
        j5i j5iVar = this.g1;
        if (j5iVar != null) {
            j5iVar.setVisibility(z ? 0 : 8);
        }
        h();
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTextField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTextField(Context context) {
        this(context, null, 14);
        context.getClass();
    }
}
