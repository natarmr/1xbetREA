package com.google.android.material.button;

import a.afn0;
import a.akj0;
import a.blj0;
import a.dwi0;
import a.epv0;
import a.g7x;
import a.ggk;
import a.iw20;
import a.jf4;
import a.jiq0;
import a.k7x;
import a.ki30;
import a.kul0;
import a.llo;
import a.lul0;
import a.mrv;
import a.n23;
import a.ocg0;
import a.rpd0;
import a.rw2;
import a.u7m0;
import a.uh30;
import a.v7m0;
import a.vh30;
import a.viq;
import a.w7m0;
import a.wh30;
import a.wss;
import a.yh30;
import a.zh30;
import a.zjj0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, blj0 {
    public static final int[] r1 = {R.attr.state_checkable};
    public static final int[] s1 = {R.attr.state_checked};
    public static final ggk t1 = new ggk(1);
    public float A;
    public int B;
    public final zh30 e;
    public final LinkedHashSet f;
    public int f1;
    public vh30 g;
    public LinearLayout.LayoutParams g1;
    public PorterDuff.Mode h;
    public boolean h1;
    public ColorStateList i;
    public int i1;
    public Drawable j;
    public boolean j1;
    public PorterDuff.Mode k;
    public int k1;
    public ColorStateList l;
    public w7m0 l1;
    public Drawable m;
    public int m1;
    public boolean n;
    public wh30 n1;
    public String o;
    public float o1;
    public int p;
    public float p1;
    public int q;
    public kul0 q1;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(dwi0.U(i, org.xbet.client1.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{org.xbet.client1.R.attr.materialSizeOverlay}), attributeSet, i);
        this.f = new LinkedHashSet();
        this.v = false;
        this.w = false;
        this.z = Integer.MIN_VALUE;
        this.A = -2.1474836E9f;
        this.B = Integer.MIN_VALUE;
        this.f1 = Integer.MIN_VALUE;
        this.k1 = Integer.MIN_VALUE;
        this.n1 = wh30.d;
        Context context2 = getContext();
        TypedArray typedArrayL0 = mrv.l0(context2, attributeSet, rpd0.w, i, org.xbet.client1.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.s = typedArrayL0.getDimensionPixelSize(13, 0);
        int i2 = typedArrayL0.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.h = afn0.y(i2, mode);
        this.i = g7x.A(15, getContext(), typedArrayL0);
        this.j = g7x.D(11, getContext(), typedArrayL0);
        this.x = typedArrayL0.getInteger(12, 1);
        this.p = typedArrayL0.getDimensionPixelSize(14, 0);
        this.k = afn0.y(typedArrayL0.getInt(22, -1), mode);
        this.l = typedArrayL0.hasValue(21) ? g7x.A(21, getContext(), typedArrayL0) : this.i;
        this.y = typedArrayL0.getInteger(20, 3);
        Drawable drawableD = g7x.D(19, getContext(), typedArrayL0);
        this.m = drawableD;
        this.n = drawableD == null;
        zjj0 zjj0VarG = u7m0.g(23, context2, typedArrayL0);
        zjj0VarG = zjj0VarG == null ? akj0.h(context2, attributeSet, i, org.xbet.client1.R.style.Widget_MaterialComponents_Button).c() : zjj0VarG;
        boolean z = typedArrayL0.getBoolean(17, false);
        zh30 zh30Var = new zh30(this, zjj0VarG);
        this.e = zh30Var;
        zh30Var.e = typedArrayL0.getDimensionPixelOffset(2, 0);
        zh30Var.f = typedArrayL0.getDimensionPixelOffset(3, 0);
        zh30Var.g = typedArrayL0.getDimensionPixelOffset(4, 0);
        zh30Var.h = typedArrayL0.getDimensionPixelOffset(5, 0);
        if (typedArrayL0.hasValue(9)) {
            int dimensionPixelSize = typedArrayL0.getDimensionPixelSize(9, -1);
            zh30Var.i = dimensionPixelSize;
            zh30Var.b = zh30Var.b.a(dimensionPixelSize);
            zh30Var.d();
            zh30Var.r = true;
        }
        zh30Var.j = typedArrayL0.getDimensionPixelSize(26, 0);
        zh30Var.k = afn0.y(typedArrayL0.getInt(8, -1), mode);
        zh30Var.l = g7x.A(7, getContext(), typedArrayL0);
        zh30Var.m = g7x.A(25, getContext(), typedArrayL0);
        zh30Var.n = g7x.A(18, getContext(), typedArrayL0);
        zh30Var.s = typedArrayL0.getBoolean(6, false);
        zh30Var.v = typedArrayL0.getDimensionPixelSize(10, 0);
        zh30Var.t = typedArrayL0.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayL0.hasValue(0)) {
            zh30Var.q = true;
            setSupportBackgroundTintList(zh30Var.l);
            setSupportBackgroundTintMode(zh30Var.k);
        } else {
            zh30Var.c();
        }
        setPaddingRelative(paddingStart + zh30Var.e, paddingTop + zh30Var.g, paddingEnd + zh30Var.f, paddingBottom + zh30Var.h);
        setCheckedInternal(typedArrayL0.getBoolean(1, false));
        if (zjj0VarG instanceof u7m0) {
            zh30Var.c = g7x.X(getContext());
            if (zh30Var.b instanceof u7m0) {
                zh30Var.d();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayL0.recycle();
        setCompoundDrawablePadding(this.s);
        u(this.j != null);
        x(this.m != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.o1;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        ki30 ki30VarA;
        if (this.h1 && this.j1 && (ki30VarA = this.e.a(false)) != null) {
            return (int) (ki30VarA.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        if (!j() || this.v == z) {
            return;
        }
        this.v = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.v;
            if (!materialButtonToggleGroup.n) {
                materialButtonToggleGroup.l(getId(), z2);
            }
        }
        if (this.w) {
            return;
        }
        this.w = true;
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
        this.w = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.o1 != f) {
            this.o1 = f;
            w();
            invalidate();
            if (getParent() instanceof yh30) {
                yh30 yh30Var = (yh30) getParent();
                int i = (int) this.o1;
                int iIndexOfChild = yh30Var.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonH = yh30Var.h(iIndexOfChild);
                MaterialButton materialButtonG = yh30Var.g(iIndexOfChild);
                if (materialButtonH == null && materialButtonG == null) {
                    return;
                }
                if (materialButtonH == null) {
                    materialButtonG.setDisplayedWidthDecrease(i);
                }
                if (materialButtonG == null) {
                    materialButtonH.setDisplayedWidthDecrease(i);
                }
                if (materialButtonH == null || materialButtonG == null) {
                    return;
                }
                materialButtonH.setDisplayedWidthDecrease(i / 2);
                materialButtonG.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final boolean d() {
        if (l() && o()) {
            return true;
        }
        if (k() && n()) {
            return true;
        }
        return m() && p();
    }

    public final boolean e(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final int f(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.j;
        if (drawable != null) {
            intrinsicWidth = this.p;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            intrinsicWidth2 = this.p;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.s) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final int g(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.s) - getPaddingBottom()) / 2);
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.o)) {
            return (j() ? CompoundButton.class : Button.class).getName();
        }
        return this.o;
    }

    public int getAllowedWidthDecrease() {
        return this.k1;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (q()) {
            return this.e.i;
        }
        return 0;
    }

    public lul0 getCornerSpringForce() {
        return this.e.c;
    }

    public Drawable getIcon() {
        return this.j;
    }

    public int getIconGravity() {
        return this.x;
    }

    public int getIconPadding() {
        return this.s;
    }

    public int getIconSize() {
        return this.p;
    }

    public ColorStateList getIconTint() {
        return this.i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.h;
    }

    public int getInsetBottom() {
        return this.e.h;
    }

    public int getInsetLeft() {
        return this.e.e;
    }

    public int getInsetRight() {
        return this.e.f;
    }

    public int getInsetTop() {
        return this.e.g;
    }

    public ColorStateList getRippleColor() {
        if (q()) {
            return this.e.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.m;
    }

    public int getSecondaryIconGravity() {
        return this.y;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.l;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.k;
    }

    public zjj0 getShapeAppearance() {
        if (q()) {
            return this.e.b;
        }
        jf4.n("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public akj0 getShapeAppearanceModel() {
        if (q()) {
            return this.e.b.d();
        }
        jf4.n("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (q()) {
            return this.e.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (q()) {
            return this.e.j;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return q() ? this.e.l : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return q() ? this.e.k : super.getSupportBackgroundTintMode();
    }

    public final Drawable h(int i) {
        if (i == 0) {
            if (this.m == null || !o()) {
                return null;
            }
            return this.m;
        }
        if (i == 1) {
            if (this.m == null || !p()) {
                return null;
            }
            return this.m;
        }
        if (i == 2 && this.m != null && n()) {
            return this.m;
        }
        return null;
    }

    public final Drawable i(int i) {
        if (i == 0) {
            if (this.j == null || !l()) {
                return null;
            }
            return this.j;
        }
        if (i == 1) {
            if (this.j == null || !k()) {
                return null;
            }
            return this.j;
        }
        if (i == 2 && this.j != null && k()) {
            return this.j;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.v;
    }

    public final boolean j() {
        zh30 zh30Var = this.e;
        return zh30Var != null && zh30Var.s;
    }

    public final boolean k() {
        int i = this.x;
        return i == 3 || i == 4;
    }

    public final boolean l() {
        int i = this.x;
        return i == 1 || i == 2;
    }

    public final boolean m() {
        int i = this.x;
        return i == 16 || i == 32;
    }

    public final boolean n() {
        int i = this.y;
        return i == 3 || i == 4;
    }

    public final boolean o() {
        int i = this.y;
        return i == 1 || i == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (q()) {
            k7x.V(this, this.e.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (j()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r1);
        }
        if (this.v) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.v);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setChecked(this.v);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.z != i6) {
            this.z = i6;
            this.A = -2.1474836E9f;
        }
        if (this.A == -2.1474836E9f) {
            this.A = getMeasuredWidth();
            if (this.g1 == null && (getParent() instanceof yh30) && ((yh30) getParent()).getButtonSizeChange() != null) {
                this.g1 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.g1);
                layoutParams.width = (int) this.A;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.k1 == Integer.MIN_VALUE) {
            if (this.j == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.p;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.j.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.k1 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.B == Integer.MIN_VALUE) {
            this.B = getPaddingStart();
        }
        if (this.f1 == Integer.MIN_VALUE) {
            this.f1 = getPaddingEnd();
        }
        if ((getParent() instanceof yh30) && ((yh30) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.j1 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45367a);
        setChecked(savedState.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.v;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        int i = this.y;
        return i == 16 || i == 32;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.e.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    public final boolean q() {
        zh30 zh30Var = this.e;
        return (zh30Var == null || zh30Var.q) ? false : true;
    }

    public final /* synthetic */ void r() {
        this.i1 = getOpticalCenterShift();
        w();
        invalidate();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.j != null) {
            if (this.j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public final void s(boolean z) {
        int i;
        if (this.l1 == null) {
            return;
        }
        if (this.q1 == null) {
            kul0 kul0Var = new kul0(this, t1);
            this.q1 = kul0Var;
            kul0Var.m = g7x.X(getContext());
        }
        if (this.j1) {
            int iOrdinal = this.n1.ordinal();
            int i2 = 0;
            int i3 = (iOrdinal == 1 || iOrdinal == 2) ? this.m1 / 2 : iOrdinal != 3 ? 0 : this.m1;
            w7m0 w7m0Var = this.l1;
            int[] drawableState = getDrawableState();
            int[][] iArr = w7m0Var.c;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= w7m0Var.f38681a) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = w7m0Var.c;
                for (int i5 = 0; i5 < w7m0Var.f38681a; i5++) {
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                }
                i4 = i;
            }
            v7m0 v7m0Var = (v7m0) (i4 < 0 ? w7m0Var.b : w7m0Var.d[i4]).f30839a;
            int width = getWidth();
            float f = v7m0Var.b;
            int i6 = v7m0Var.f36934a;
            if (i6 != 1) {
                if (i6 == 2) {
                }
                this.q1.a(Math.min(i3, i2));
                if (z) {
                    this.q1.d();
                }
            }
            f *= width;
            i2 = (int) f;
            this.q1.a(Math.min(i3, i2));
            if (z) {
                this.q1.d();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.o = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!q()) {
            super.setBackgroundColor(i);
            return;
        }
        zh30 zh30Var = this.e;
        if (zh30Var.a(false) != null) {
            zh30Var.a(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!q()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        zh30 zh30Var = this.e;
        zh30Var.q = true;
        MaterialButton materialButton = zh30Var.f44374a;
        materialButton.setSupportBackgroundTintList(zh30Var.l);
        materialButton.setSupportBackgroundTintMode(zh30Var.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? epv0.U(i, getContext()) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (q()) {
            this.e.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.A = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (q()) {
            zh30 zh30Var = this.e;
            if (zh30Var.r && zh30Var.i == i) {
                return;
            }
            zh30Var.i = i;
            zh30Var.r = true;
            zh30Var.b = zh30Var.b.a(i);
            zh30Var.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (q()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(lul0 lul0Var) {
        zh30 zh30Var = this.e;
        zh30Var.c = lul0Var;
        if (zh30Var.b instanceof u7m0) {
            zh30Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.p1 = Math.min(i, this.k1);
        w();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (q()) {
            this.e.a(false).r(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.j == drawable || t(new uh30(this, drawable, (byte) 1))) {
            return;
        }
        this.A = -2.1474836E9f;
        this.j = drawable;
        u(true);
        v(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.x != i) {
            if (this.j != null && this.m != null && d()) {
                jf4.o("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.x = i;
                v(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.s != i) {
            this.s = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? epv0.U(i, getContext()) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            jf4.o("iconSize cannot be less than 0");
            return;
        }
        if (this.p == i || t(new n23((Object) this, i, (byte) 10))) {
            return;
        }
        this.A = -2.1474836E9f;
        this.p = i;
        u(true);
        x(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            u(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            u(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(jiq0.n0(i, getContext()));
    }

    public void setInsetBottom(int i) {
        zh30 zh30Var = this.e;
        zh30Var.b(zh30Var.e, zh30Var.g, zh30Var.f, i);
    }

    public void setInsetLeft(int i) {
        zh30 zh30Var = this.e;
        zh30Var.b(i, zh30Var.g, zh30Var.f, zh30Var.h);
    }

    public void setInsetRight(int i) {
        zh30 zh30Var = this.e;
        zh30Var.b(zh30Var.e, zh30Var.g, i, zh30Var.h);
    }

    public void setInsetTop(int i) {
        zh30 zh30Var = this.e;
        zh30Var.b(zh30Var.e, i, zh30Var.f, zh30Var.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(vh30 vh30Var) {
        this.g = vh30Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.h1 != z) {
            this.h1 = z;
            zh30 zh30Var = this.e;
            if (z) {
                viq viqVar = new viq(this, (byte) 19);
                zh30Var.d = viqVar;
                ki30 ki30VarA = zh30Var.a(false);
                if (ki30VarA != null) {
                    ki30VarA.f1 = viqVar;
                }
            } else {
                zh30Var.d = null;
                ki30 ki30VarA2 = zh30Var.a(false);
                if (ki30VarA2 != null) {
                    ki30VarA2.f1 = null;
                }
            }
            post(new wss(this, (byte) 10));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        vh30 vh30Var = this.g;
        if (vh30Var != null) {
            ((MaterialButtonToggleGroup) ((iw20) vh30Var).f15470a).invalidate();
        }
        super.setPressed(z);
        s(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (q()) {
            zh30 zh30Var = this.e;
            MaterialButton materialButton = zh30Var.f44374a;
            if (zh30Var.n != colorStateList) {
                zh30Var.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ocg0.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (q()) {
            setRippleColor(jiq0.n0(i, getContext()));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.m == drawable || t(new uh30(this, drawable, (byte) 0))) {
            return;
        }
        this.A = -2.1474836E9f;
        this.m = drawable;
        this.n = false;
        x(true);
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.y != i) {
            if (this.m != null && this.j != null && d()) {
                jf4.o("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.y = i;
                y(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? epv0.U(i, getContext()) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            x(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.k != mode) {
            this.k = mode;
            x(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(jiq0.n0(i, getContext()));
    }

    public void setShapeAppearance(zjj0 zjj0Var) {
        if (!q()) {
            jf4.n("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        zh30 zh30Var = this.e;
        if (zh30Var.c == null && zjj0Var.f()) {
            zh30Var.c = g7x.X(getContext());
            if (zh30Var.b instanceof u7m0) {
                zh30Var.d();
            }
        }
        zh30Var.b = zjj0Var;
        zh30Var.d();
    }

    @Override // a.blj0
    public void setShapeAppearanceModel(akj0 akj0Var) {
        if (!q()) {
            jf4.n("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        zh30 zh30Var = this.e;
        zh30Var.b = akj0Var;
        zh30Var.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (q()) {
            zh30 zh30Var = this.e;
            zh30Var.p = z;
            zh30Var.e();
        }
    }

    public void setSizeChange(w7m0 w7m0Var) {
        if (this.l1 != w7m0Var) {
            this.l1 = w7m0Var;
            s(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (q()) {
            zh30 zh30Var = this.e;
            if (zh30Var.m != colorStateList) {
                zh30Var.m = colorStateList;
                zh30Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (q()) {
            setStrokeColor(jiq0.n0(i, getContext()));
        }
    }

    public void setStrokeWidth(int i) {
        if (q()) {
            zh30 zh30Var = this.e;
            if (zh30Var.j != i) {
                zh30Var.j = i;
                zh30Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (q()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!q()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        zh30 zh30Var = this.e;
        if (zh30Var.l != colorStateList) {
            zh30Var.l = colorStateList;
            if (zh30Var.a(false) != null) {
                zh30Var.a(false).setTintList(zh30Var.l);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!q()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        zh30 zh30Var = this.e;
        if (zh30Var.k != mode) {
            zh30Var.k = mode;
            if (zh30Var.a(false) == null || zh30Var.k == null) {
                return;
            }
            zh30Var.a(false).setTintMode(zh30Var.k);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.A = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.A = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.A = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.e.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.A = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(wh30 wh30Var) {
        if (this.n1 != wh30Var) {
            this.n1 = wh30Var;
            s(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.m1 != i) {
            this.m1 = i;
            s(true);
        }
    }

    public final boolean t(Runnable runnable) {
        kul0 kul0Var = this.q1;
        if (kul0Var == null || !kul0Var.f) {
            return false;
        }
        post(new llo(this, runnable, (byte) 18));
        return true;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.v);
    }

    public final void u(boolean z) {
        Drawable drawable = this.j;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                this.j.setTintMode(mode);
            }
            int intrinsicWidth = this.p;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.p;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.j;
            int i = this.q;
            int i2 = this.r;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.j.setVisible(true, z);
        }
        if (this.j != null && this.m != null && d()) {
            jf4.o("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.j == null && this.m != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (l() && compoundDrawablesRelative[0] != this.j) || (k() && compoundDrawablesRelative[2] != this.j) || (m() && compoundDrawablesRelative[1] != this.j);
        if (z || z2) {
            if (l()) {
                setCompoundDrawablesRelative(this.j, h(1), h(2), null);
            } else if (k()) {
                setCompoundDrawablesRelative(h(0), h(1), this.j, null);
            } else if (m()) {
                setCompoundDrawablesRelative(h(0), this.j, h(2), null);
            }
        }
    }

    public final void v(int i, int i2) {
        if (this.j == null || getLayout() == null) {
            return;
        }
        if (l() || k()) {
            this.r = 0;
            if (e(this.x)) {
                this.q = 0;
                u(false);
                return;
            }
            int iF = f(i, this.x);
            if (this.q != iF) {
                this.q = iF;
                u(false);
                return;
            }
            return;
        }
        if (m()) {
            this.q = 0;
            if (this.x == 16) {
                this.r = 0;
                u(false);
                return;
            }
            int intrinsicHeight = this.p;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.j.getIntrinsicHeight();
            }
            int iG = g(i2, intrinsicHeight);
            if (this.r != iG) {
                this.r = iG;
                u(false);
            }
        }
    }

    public final void w() {
        int i = (int) (this.o1 - this.p1);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.i1;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.A + i);
        }
        setPaddingRelative(this.B + i3, getPaddingTop(), (this.f1 + i) - i3, getPaddingBottom());
    }

    public final void x(boolean z) {
        Drawable drawable = this.m;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.m = drawableMutate;
            drawableMutate.setTintList(this.l);
            PorterDuff.Mode mode = this.k;
            if (mode != null) {
                this.m.setTintMode(mode);
            }
            int intrinsicWidth = this.p;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.m.getIntrinsicWidth();
            }
            int intrinsicHeight = this.p;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.m;
            int i = this.t;
            int i2 = this.u;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.m.setVisible(true, z);
        }
        if (this.m != null && this.j != null && d()) {
            jf4.o("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.m == null) {
            if (this.n) {
                return;
            }
            if (this.j != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (o() && compoundDrawablesRelative[0] != this.m) || (n() && compoundDrawablesRelative[2] != this.m) || (p() && compoundDrawablesRelative[1] != this.m);
        if (z || z2) {
            if (o()) {
                setCompoundDrawablesRelative(this.m, i(1), i(2), null);
            } else if (n()) {
                setCompoundDrawablesRelative(i(0), i(1), this.m, null);
            } else if (p()) {
                setCompoundDrawablesRelative(i(0), this.m, i(2), null);
            }
        }
    }

    public final void y(int i, int i2) {
        if (this.m == null || getLayout() == null) {
            return;
        }
        if (o() || n()) {
            this.u = 0;
            if (e(this.y)) {
                this.t = 0;
                x(false);
                return;
            }
            int iF = f(i, this.y);
            if (this.t != iF) {
                this.t = iF;
                x(false);
                return;
            }
            return;
        }
        if (p()) {
            this.t = 0;
            if (this.y == 16) {
                this.u = 0;
                x(false);
                return;
            }
            int intrinsicHeight = this.p;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.m.getIntrinsicHeight();
            }
            int iG = g(i2, intrinsicHeight);
            if (this.u != iG) {
                this.u = iG;
                x(false);
            }
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.xbet.client1.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
