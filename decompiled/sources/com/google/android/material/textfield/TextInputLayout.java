package com.google.android.material.textfield;

import a.ack;
import a.akj0;
import a.apj0;
import a.b0g;
import a.b0l0;
import a.bi30;
import a.bxn;
import a.by7;
import a.cww;
import a.cxn;
import a.d0g;
import a.d7x;
import a.daf;
import a.dne;
import a.dwi0;
import a.epv0;
import a.ewo;
import a.f2d;
import a.g7x;
import a.ii30;
import a.jf4;
import a.jiq0;
import a.k5d;
import a.k7x;
import a.ki30;
import a.l8q0;
import a.m8q0;
import a.mo8;
import a.mrv;
import a.mx2;
import a.n6x;
import a.n73;
import a.n8q0;
import a.nh30;
import a.q0;
import a.qhl;
import a.qzb;
import a.rgu0;
import a.rpd0;
import a.rz4;
import a.t8m0;
import a.td3;
import a.til;
import a.tms0;
import a.u6x;
import a.ujn;
import a.v4i0;
import a.wgg0;
import a.y4m0;
import a.ywu;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] e2 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public final Rect A1;
    public ColorStateList B;
    public final RectF B1;
    public Typeface C1;
    public ColorDrawable D1;
    public int E1;
    public final LinkedHashSet F1;
    public ColorDrawable G1;
    public int H1;
    public Drawable I1;
    public ColorStateList J1;
    public ColorStateList K1;
    public int L1;
    public int M1;
    public int N1;
    public ColorStateList O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public int U1;
    public int V1;
    public boolean W1;
    public final f2d X1;
    public boolean Y1;
    public boolean Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f45581a;
    public ValueAnimator a2;
    public final y4m0 b;
    public boolean b2;
    public final cxn c;
    public boolean c2;
    public final int d;
    public boolean d2;
    public EditText e;
    public CharSequence f;
    public ColorStateList f1;
    public int g;
    public boolean g1;
    public int h;
    public CharSequence h1;
    public int i;
    public boolean i1;
    public int j;
    public ki30 j1;
    public final u6x k;
    public ki30 k1;
    public boolean l;
    public StateListDrawable l1;
    public int m;
    public boolean m1;
    public boolean n;
    public ki30 n1;
    public n8q0 o;
    public ki30 o1;
    public AppCompatTextView p;
    public akj0 p1;
    public int q;
    public boolean q1;
    public int r;
    public final int r1;
    public CharSequence s;
    public int s1;
    public boolean t;
    public int t1;
    public AppCompatTextView u;
    public int u1;
    public ColorStateList v;
    public int v1;
    public int w;
    public int w1;
    public ewo x;
    public int x1;
    public ewo y;
    public int y1;
    public ColorStateList z;
    public final Rect z1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(dwi0.V(context, attributeSet, i, org.xbet.client1.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = new u6x(this);
        this.o = new v4i0((byte) 13);
        this.z1 = new Rect();
        this.A1 = new Rect();
        this.B1 = new RectF();
        this.F1 = new LinkedHashSet();
        f2d f2dVar = new f2d(this);
        this.X1 = f2dVar;
        this.d2 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f45581a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = n73.f23021a;
        f2dVar.X = linearInterpolator;
        f2dVar.l(false);
        f2dVar.W = linearInterpolator;
        f2dVar.l(false);
        f2dVar.s(8388659);
        mrv.c0(context2, attributeSet, i, org.xbet.client1.R.style.Widget_Design_TextInputLayout);
        int[] iArr = rpd0.W;
        mrv.d0(context2, attributeSet, iArr, i, org.xbet.client1.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 46, 51);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, org.xbet.client1.R.style.Widget_Design_TextInputLayout);
        ywu ywuVar = new ywu(context2, typedArrayObtainStyledAttributes);
        y4m0 y4m0Var = new y4m0(this, ywuVar);
        this.b = y4m0Var;
        this.g1 = typedArrayObtainStyledAttributes.getBoolean(49, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.Z1 = typedArrayObtainStyledAttributes.getBoolean(48, true);
        this.Y1 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.p1 = akj0.h(context2, attributeSet, i, org.xbet.client1.R.style.Widget_Design_TextInputLayout).c();
        this.r1 = context2.getResources().getDimensionPixelOffset(org.xbet.client1.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.t1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.d = getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.v1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.w1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.u1 = this.v1;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        daf dafVarL = this.p1.l();
        if (dimension >= 0.0f) {
            dafVarL.f = new q0(dimension);
        }
        if (dimension2 >= 0.0f) {
            dafVarL.g = new q0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            dafVarL.U(dimension3);
        }
        if (dimension4 >= 0.0f) {
            dafVarL.T(dimension4);
        }
        this.p1 = dafVarL.c();
        ColorStateList colorStateListB = g7x.B(context2, ywuVar, 7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.P1 = defaultColor;
            this.y1 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.Q1 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.R1 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.S1 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.R1 = this.P1;
                ColorStateList colorStateListN0 = jiq0.n0(org.xbet.client1.R.color.mtrl_filled_background_color, context2);
                this.Q1 = colorStateListN0.getColorForState(new int[]{-16842910}, -1);
                this.S1 = colorStateListN0.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.y1 = 0;
            this.P1 = 0;
            this.Q1 = 0;
            this.R1 = 0;
            this.S1 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM = ywuVar.m(1);
            this.K1 = colorStateListM;
            this.J1 = colorStateListM;
        }
        ColorStateList colorStateListB2 = g7x.B(context2, ywuVar, 14);
        this.N1 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.L1 = context2.getColor(org.xbet.client1.R.color.mtrl_textinput_default_box_stroke_color);
        this.U1 = context2.getColor(org.xbet.client1.R.color.mtrl_textinput_disabled_color);
        this.M1 = context2.getColor(org.xbet.client1.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(g7x.B(context2, ywuVar, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(51, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(51, 0));
        }
        this.B = ywuVar.m(24);
        this.f1 = ywuVar.m(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(46, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(45, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(44);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(59, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(58);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.r = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.q = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(ywuVar.m(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(47)) {
            setHelperTextColor(ywuVar.m(47));
        }
        if (typedArrayObtainStyledAttributes.hasValue(52)) {
            setHintTextColor(ywuVar.m(52));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(ywuVar.m(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(ywuVar.m(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(60)) {
            setPlaceholderTextColor(ywuVar.m(60));
        }
        cxn cxnVar = new cxn(this, ywuVar);
        this.c = cxnVar;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(50, 1));
        ywuVar.A();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(y4m0Var);
        frameLayout.addView(cxnVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.j1;
        }
        EditText editText2 = this.e;
        int iH = d7x.H(editText2.getContext(), n6x.V(editText2, org.xbet.client1.R.attr.colorControlHighlight));
        int i = this.s1;
        int[][] iArr = e2;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            ki30 ki30Var = this.j1;
            int i2 = this.y1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{d7x.F(iH, 0.1f, i2), i2}), ki30Var, ki30Var);
        }
        Context context = getContext();
        ki30 ki30Var2 = this.j1;
        int iH2 = d7x.H(context, n6x.U(context, org.xbet.client1.R.attr.colorSurface, "TextInputLayout"));
        ki30 ki30Var3 = new ki30(ki30Var2.j());
        int iF = d7x.F(iH, 0.1f, iH2);
        ki30Var3.s(new ColorStateList(iArr, new int[]{iF, 0}));
        ki30Var3.setTint(iH2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF, iH2});
        ki30 ki30Var4 = new ki30(ki30Var2.j());
        ki30Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ki30Var3, ki30Var4), ki30Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.l1 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.l1 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.l1.addState(new int[0], h(false));
        }
        return this.l1;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        ki30 ki30Var = this.k1;
        if (ki30Var != null) {
            return ki30Var;
        }
        ki30 ki30VarH = h(true);
        this.k1 = ki30VarH;
        return ki30VarH;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            jf4.o("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.e = editText;
        int i = this.g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i2 = this.h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.j);
        }
        this.m1 = false;
        k();
        setTextInputAccessibilityDelegate(new m8q0(this));
        Typeface typeface = this.e.getTypeface();
        f2d f2dVar = this.X1;
        boolean zT = f2dVar.t(typeface);
        boolean z = f2dVar.z(typeface);
        if (zT || z) {
            f2dVar.l(false);
        }
        f2dVar.y(this.e.getTextSize());
        float letterSpacing = this.e.getLetterSpacing();
        if (f2dVar.h0 != letterSpacing) {
            f2dVar.h0 = letterSpacing;
            f2dVar.l(false);
        }
        int gravity = this.e.getGravity();
        f2dVar.s((gravity & (-113)) | 48);
        f2dVar.x(gravity);
        this.V1 = editText.getMinimumHeight();
        this.e.addTextChangedListener(new l8q0(this, editText));
        if (this.J1 == null) {
            this.J1 = this.e.getHintTextColors();
        }
        if (this.g1) {
            if (TextUtils.isEmpty(this.h1)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.i1 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.p != null) {
            p(this.e.getText());
        }
        t();
        this.k.b();
        this.b.bringToFront();
        cxn cxnVar = this.c;
        cxnVar.bringToFront();
        Iterator it = this.F1.iterator();
        while (it.hasNext()) {
            ((bxn) it.next()).a(this);
        }
        cxnVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.h1)) {
            return;
        }
        this.h1 = charSequence;
        this.X1.B(charSequence);
        if (this.W1) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.t == z) {
            return;
        }
        AppCompatTextView appCompatTextView = this.u;
        if (!z) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.u = null;
        } else if (appCompatTextView != null) {
            this.f45581a.addView(appCompatTextView);
            this.u.setVisibility(0);
        }
        this.t = z;
    }

    public final void a() {
        if (this.e == null || this.s1 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.X1.g() + this.d), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.material_filled_edittext_font_2_0_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (g7x.S(getContext())) {
            EditText editText3 = this.e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.material_filled_edittext_font_1_3_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f45581a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        f2d f2dVar = this.X1;
        if (f2dVar.b == f) {
            return;
        }
        if (this.a2 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a2 = valueAnimator;
            valueAnimator.setInterpolator(g7x.W(getContext(), org.xbet.client1.R.attr.motionEasingEmphasizedInterpolator, n73.b));
            this.a2.setDuration(n6x.T(getContext(), org.xbet.client1.R.attr.motionDurationMedium4, 167));
            this.a2.addUpdateListener(new mo8(this, (byte) 6));
        }
        this.a2.setFloatValues(f2dVar.b, f);
        this.a2.start();
    }

    public final void c() {
        int i;
        int i2;
        ki30 ki30Var = this.j1;
        if (ki30Var == null) {
            return;
        }
        akj0 akj0VarJ = ki30Var.j();
        akj0 akj0Var = this.p1;
        if (akj0VarJ != akj0Var) {
            this.j1.setShapeAppearanceModel(akj0Var);
        }
        if (this.s1 == 2 && (i = this.u1) > -1 && (i2 = this.x1) != 0) {
            ki30 ki30Var2 = this.j1;
            ki30Var2.b.j = i;
            ki30Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            ii30 ii30Var = ki30Var2.b;
            if (ii30Var.d != colorStateListValueOf) {
                ii30Var.d = colorStateListValueOf;
                ki30Var2.onStateChange(ki30Var2.getState());
            }
        }
        int iC = this.y1;
        if (this.s1 == 1) {
            Integer numY = d7x.y(org.xbet.client1.R.attr.colorSurface, getContext());
            iC = k5d.c(this.y1, numY != null ? numY.intValue() : 0);
        }
        this.y1 = iC;
        this.j1.s(ColorStateList.valueOf(iC));
        ki30 ki30Var3 = this.n1;
        if (ki30Var3 != null && this.o1 != null) {
            if (this.u1 > -1 && this.x1 != 0) {
                ki30Var3.s(this.e.isFocused() ? ColorStateList.valueOf(this.L1) : ColorStateList.valueOf(this.x1));
                this.o1.s(ColorStateList.valueOf(this.x1));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.e == null) {
            v4i0.e();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.A1;
        rect2.bottom = i;
        int i2 = this.s1;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.t1;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.e.getPaddingLeft() + i3;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.i1;
            this.i1 = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.i1 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f45581a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.c2 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.c2 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ki30 ki30Var;
        super.draw(canvas);
        boolean z = this.g1;
        f2d f2dVar = this.X1;
        if (z) {
            f2dVar.f(canvas);
        }
        if (this.o1 == null || (ki30Var = this.n1) == null) {
            return;
        }
        ki30Var.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.o1.getBounds();
            Rect bounds2 = this.n1.getBounds();
            float f = f2dVar.b;
            int iCenterX = bounds2.centerX();
            bounds.left = n73.c(iCenterX, f, bounds2.left);
            bounds.right = n73.c(iCenterX, f, bounds2.right);
            this.o1.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.b2) {
            return;
        }
        this.b2 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        f2d f2dVar = this.X1;
        if (f2dVar != null) {
            f2dVar.S = drawableState;
            ColorStateList colorStateList2 = f2dVar.p;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = f2dVar.o) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                f2dVar.l(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.e != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z) {
            invalidate();
        }
        this.b2 = false;
    }

    public final int e() {
        if (this.g1) {
            int i = this.s1;
            f2d f2dVar = this.X1;
            if (i == 0) {
                return (int) f2dVar.g();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (f2dVar.g() / 2.0f);
                }
                float fG = f2dVar.g();
                TextPaint textPaint = f2dVar.V;
                textPaint.setTextSize(f2dVar.n);
                textPaint.setTypeface(f2dVar.x);
                textPaint.setLetterSpacing(f2dVar.g0);
                return Math.max(0, (int) (fG - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final ewo f() {
        ewo ewoVar = new ewo();
        ewoVar.c = n6x.T(getContext(), org.xbet.client1.R.attr.motionDurationShort2, 87);
        ewoVar.d = g7x.W(getContext(), org.xbet.client1.R.attr.motionEasingLinearInterpolator, n73.f23021a);
        return ewoVar;
    }

    public final boolean g() {
        return this.g1 && !TextUtils.isEmpty(this.h1) && (this.j1 instanceof d0g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public ki30 getBoxBackground() {
        int i = this.s1;
        if (i == 1 || i == 2) {
            return this.j1;
        }
        v4i0.e();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.y1;
    }

    public int getBoxBackgroundMode() {
        return this.s1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.t1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        akj0 akj0Var = this.p1;
        RectF rectF = this.B1;
        return layoutDirection == 1 ? akj0Var.h.a(rectF) : akj0Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        akj0 akj0Var = this.p1;
        RectF rectF = this.B1;
        return layoutDirection == 1 ? akj0Var.g.a(rectF) : akj0Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        akj0 akj0Var = this.p1;
        RectF rectF = this.B1;
        return layoutDirection == 1 ? akj0Var.e.a(rectF) : akj0Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        akj0 akj0Var = this.p1;
        RectF rectF = this.B1;
        return layoutDirection == 1 ? akj0Var.f.a(rectF) : akj0Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.N1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.O1;
    }

    public int getBoxStrokeWidth() {
        return this.v1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.w1;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.l && this.n && (appCompatTextView = this.p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.J1;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.m;
    }

    public int getEndIconMode() {
        return this.c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.n;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.g;
    }

    public CharSequence getError() {
        u6x u6xVar = this.k;
        if (u6xVar.q) {
            return u6xVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.k.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.k.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.k.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        u6x u6xVar = this.k;
        if (u6xVar.x) {
            return u6xVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.k.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.g1) {
            return this.h1;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.X1.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        f2d f2dVar = this.X1;
        return f2dVar.h(f2dVar.p);
    }

    public int getHintMaxLines() {
        return this.X1.o0;
    }

    public ColorStateList getHintTextColor() {
        return this.K1;
    }

    public n8q0 getLengthCounter() {
        return this.o;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.t) {
            return this.s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.v;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public akj0 getShapeAppearanceModel() {
        return this.p1;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h;
    }

    public CharSequence getSuffixText() {
        return this.c.p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.q;
    }

    public Typeface getTypeface() {
        return this.C1;
    }

    public final ki30 h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(org.xbet.client1.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.e;
        float popupElevation = editText instanceof nh30 ? ((nh30) editText).getPopupElevation() : getResources().getDimensionPixelOffset(org.xbet.client1.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(org.xbet.client1.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        wgg0 wgg0Var = new wgg0();
        wgg0 wgg0Var2 = new wgg0();
        wgg0 wgg0Var3 = new wgg0();
        wgg0 wgg0Var4 = new wgg0();
        byte b = 0;
        ujn ujnVar = new ujn(b);
        ujn ujnVar2 = new ujn(b);
        ujn ujnVar3 = new ujn(b);
        ujn ujnVar4 = new ujn(b);
        q0 q0Var = new q0(f);
        q0 q0Var2 = new q0(f);
        q0 q0Var3 = new q0(dimensionPixelOffset);
        q0 q0Var4 = new q0(dimensionPixelOffset);
        akj0 akj0Var = new akj0();
        akj0Var.f1025a = wgg0Var;
        akj0Var.b = wgg0Var2;
        akj0Var.c = wgg0Var3;
        akj0Var.d = wgg0Var4;
        akj0Var.e = q0Var;
        akj0Var.f = q0Var2;
        akj0Var.g = q0Var4;
        akj0Var.h = q0Var3;
        akj0Var.i = ujnVar;
        akj0Var.j = ujnVar2;
        akj0Var.k = ujnVar3;
        akj0Var.l = ujnVar4;
        EditText editText2 = this.e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof nh30 ? ((nh30) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = ki30.g1;
            dropDownBackgroundTintList = ColorStateList.valueOf(d7x.H(context, n6x.U(context, org.xbet.client1.R.attr.colorSurface, ki30.class.getSimpleName())));
        }
        ki30 ki30Var = new ki30();
        ki30Var.o(context);
        ki30Var.s(dropDownBackgroundTintList);
        ki30Var.r(popupElevation);
        ki30Var.setShapeAppearanceModel(akj0Var);
        ii30 ii30Var = ki30Var.b;
        if (ii30Var.g == null) {
            ii30Var.g = new Rect();
        }
        ki30Var.b.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        ki30Var.invalidateSelf();
        return ki30Var;
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.e.getCompoundPaddingLeft() : this.c.b();
        } else {
            compoundPaddingLeft = this.b.a();
        }
        return compoundPaddingLeft + i;
    }

    public final int j(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.e.getCompoundPaddingRight() : this.b.a();
        } else {
            compoundPaddingRight = this.c.b();
        }
        return i - compoundPaddingRight;
    }

    public final void k() {
        int i = this.s1;
        if (i == 0) {
            this.j1 = null;
            this.n1 = null;
            this.o1 = null;
        } else if (i == 1) {
            this.j1 = new ki30(this.p1);
            this.n1 = new ki30();
            this.o1 = new ki30();
        } else {
            if (i != 2) {
                jf4.o(rz4.j(this.s1, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                return;
            }
            if (!this.g1 || (this.j1 instanceof d0g)) {
                this.j1 = new ki30(this.p1);
            } else {
                akj0 akj0Var = this.p1;
                int i2 = d0g.j1;
                if (akj0Var == null) {
                    akj0Var = new akj0();
                }
                b0g b0gVar = new b0g(akj0Var, new RectF());
                d0g d0gVar = new d0g(b0gVar);
                d0gVar.i1 = b0gVar;
                this.j1 = d0gVar;
            }
            this.n1 = null;
            this.o1 = null;
        }
        u();
        z();
        if (this.s1 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.t1 = getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (g7x.S(getContext())) {
                this.t1 = getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.s1 != 0) {
            v();
        }
        EditText editText = this.e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.s1;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        float lineWidth;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.e.getWidth();
            int gravity = this.e.getGravity();
            f2d f2dVar = this.X1;
            boolean zC = f2dVar.c(f2dVar.H);
            f2dVar.J = zC;
            Rect rect = f2dVar.h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = f2dVar.k0;
                    }
                } else if (zC) {
                    f = rect.right;
                    f2 = f2dVar.k0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.B1;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (f2dVar.k0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (f2dVar.J) {
                        f5 = f2dVar.k0;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (f2dVar.J) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = f2dVar.k0;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = f2dVar.g() + rect.top;
                if (f2dVar.j0 != null && !f2dVar.C()) {
                    StaticLayout staticLayout = f2dVar.j0;
                    lineWidth = (f2dVar.n / f2dVar.m) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (f2dVar.J) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.r1;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.u1);
                rectF.top = 0.0f;
                d0g d0gVar = (d0g) this.j1;
                d0gVar.getClass();
                d0gVar.A(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = f2dVar.k0 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.B1;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (f2dVar.k0 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (f2dVar.k0 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = f2dVar.g() + rect.top;
            if (f2dVar.j0 != null) {
                StaticLayout staticLayout2 = f2dVar.j0;
                lineWidth = (f2dVar.n / f2dVar.m) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (f2dVar.J) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(org.xbet.client1.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(org.xbet.client1.R.color.design_error));
    }

    public final boolean o() {
        u6x u6xVar = this.k;
        return (u6xVar.o != 1 || u6xVar.r == null || TextUtils.isEmpty(u6xVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.X1.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        cxn cxnVar = this.c;
        cxnVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.d2 = false;
        if (this.e != null && this.e.getMeasuredHeight() < (iMax = Math.max(cxnVar.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.e.post(new apj0((Object) this, (byte) 13));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fI;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.z1;
            ack.a(this, editText, rect);
            ki30 ki30Var = this.n1;
            if (ki30Var != null) {
                int i6 = rect.bottom;
                ki30Var.setBounds(rect.left, i6 - this.v1, rect.right, i6);
            }
            ki30 ki30Var2 = this.o1;
            if (ki30Var2 != null) {
                int i7 = rect.bottom;
                ki30Var2.setBounds(rect.left, i7 - this.w1, rect.right, i7);
            }
            if (this.g1) {
                float textSize = this.e.getTextSize();
                f2d f2dVar = this.X1;
                f2dVar.y(textSize);
                TextPaint textPaint = f2dVar.V;
                int gravity = this.e.getGravity();
                f2dVar.s((gravity & (-113)) | 48);
                f2dVar.x(gravity);
                Rect rectD = d(rect);
                f2dVar.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
                if (this.e == null) {
                    v4i0.e();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(f2dVar.m);
                    textPaint.setTypeface(f2dVar.A);
                    textPaint.setLetterSpacing(f2dVar.h0);
                    fI = -textPaint.ascent();
                } else {
                    fI = f2dVar.i() * f2dVar.q;
                }
                int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.A1;
                rect2.left = compoundPaddingLeft;
                if (this.s1 != 1 || this.e.getMinLines() > 1) {
                    if (this.s1 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(f2dVar.m);
                        textPaint.setTypeface(f2dVar.A);
                        textPaint.setLetterSpacing(f2dVar.h0);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.e.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fI / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.s1 != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect2.top + fI);
                rect2.bottom = compoundPaddingBottom;
                f2dVar.u(true, rect2.left, rect2.top, rect2.right, compoundPaddingBottom);
                f2dVar.l(false);
                if (!g() || this.W1) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.d2;
        cxn cxnVar = this.c;
        if (!z) {
            cxnVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.d2 = true;
        }
        if (this.u != null && (editText = this.e) != null) {
            this.u.setGravity(editText.getGravity());
            this.u.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        cxnVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft()) - this.e.getCompoundPaddingRight();
        f2d f2dVar = this.X1;
        TextPaint textPaint = f2dVar.V;
        textPaint.setTextSize(f2dVar.n);
        textPaint.setTypeface(f2dVar.x);
        textPaint.setLetterSpacing(f2dVar.g0);
        float f2 = measuredWidth;
        f2dVar.t0 = f2dVar.e(f2dVar.p0, textPaint, f2dVar.H, (f2dVar.n / f2dVar.m) * f2, f2dVar.J).getHeight();
        textPaint.setTextSize(f2dVar.m);
        textPaint.setTypeface(f2dVar.A);
        textPaint.setLetterSpacing(f2dVar.h0);
        f2dVar.u0 = f2dVar.e(f2dVar.o0, textPaint, f2dVar.H, f2, f2dVar.J).getHeight();
        EditText editText2 = this.e;
        Rect rect = this.z1;
        ack.a(this, editText2, rect);
        Rect rectD = d(rect);
        f2dVar.o(rectD.left, rectD.top, rectD.right, rectD.bottom);
        v();
        a();
        if (this.e == null) {
            return;
        }
        int i3 = f2dVar.u0;
        if (i3 != -1) {
            f = i3;
        } else {
            TextPaint textPaint2 = f2dVar.V;
            textPaint2.setTextSize(f2dVar.m);
            textPaint2.setTypeface(f2dVar.A);
            textPaint2.setLetterSpacing(f2dVar.h0);
            f = -textPaint2.ascent();
        }
        float fG = 0.0f;
        if (this.s != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.u.getPaint());
            textPaint3.setTextSize(this.u.getTextSize());
            textPaint3.setTypeface(this.u.getTypeface());
            textPaint3.setLetterSpacing(this.u.getLetterSpacing());
            t8m0 t8m0Var = new t8m0(this.s, textPaint3, measuredWidth);
            t8m0Var.k = getLayoutDirection() == 1;
            t8m0Var.j = true;
            float lineSpacingExtra = this.u.getLineSpacingExtra();
            float lineSpacingMultiplier = this.u.getLineSpacingMultiplier();
            t8m0Var.g = lineSpacingExtra;
            t8m0Var.h = lineSpacingMultiplier;
            t8m0Var.m = new b0l0(this, (byte) 17);
            fG = (this.s1 == 1 ? f2dVar.g() + this.t1 + this.d : 0.0f) + t8m0Var.a().getHeight();
        }
        float fMax = Math.max(f, fG);
        if (this.e.getMeasuredHeight() < fMax) {
            this.e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45367a);
        setError(savedState.c);
        if (savedState.d) {
            post(new mx2(this, (byte) 27));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.q1) {
            dne dneVar = this.p1.e;
            RectF rectF = this.B1;
            float fA = dneVar.a(rectF);
            float fA2 = this.p1.f.a(rectF);
            float fA3 = this.p1.h.a(rectF);
            float fA4 = this.p1.g.a(rectF);
            akj0 akj0Var = this.p1;
            qzb qzbVar = akj0Var.f1025a;
            qzb qzbVar2 = akj0Var.b;
            qzb qzbVar3 = akj0Var.d;
            qzb qzbVar4 = akj0Var.c;
            ujn ujnVar = new ujn((byte) 0);
            ujn ujnVar2 = new ujn((byte) 0);
            ujn ujnVar3 = new ujn((byte) 0);
            ujn ujnVar4 = new ujn((byte) 0);
            q0 q0Var = new q0(fA2);
            q0 q0Var2 = new q0(fA);
            q0 q0Var3 = new q0(fA4);
            q0 q0Var4 = new q0(fA3);
            akj0 akj0Var2 = new akj0();
            akj0Var2.f1025a = qzbVar2;
            akj0Var2.b = qzbVar;
            akj0Var2.c = qzbVar3;
            akj0Var2.d = qzbVar4;
            akj0Var2.e = q0Var;
            akj0Var2.f = q0Var2;
            akj0Var2.g = q0Var4;
            akj0Var2.h = q0Var3;
            akj0Var2.i = ujnVar;
            akj0Var2.j = ujnVar2;
            akj0Var2.k = ujnVar3;
            akj0Var2.l = ujnVar4;
            this.q1 = z;
            setShapeAppearanceModel(akj0Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (o()) {
            savedState.c = getError();
        }
        cxn cxnVar = this.c;
        savedState.d = cxnVar.i != 0 && cxnVar.g.d;
        return savedState;
    }

    public final void p(Editable editable) {
        ((v4i0) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.n;
        int i = this.m;
        if (i == -1) {
            this.p.setText(String.valueOf(length));
            this.p.setContentDescription(null);
            this.n = false;
        } else {
            this.n = length > i;
            Context context = getContext();
            this.p.setContentDescription(context.getString(this.n ? org.xbet.client1.R.string.character_counter_overflowed_content_description : org.xbet.client1.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.m)));
            if (z != this.n) {
                q();
            }
            this.p.setText(by7.c().e(getContext().getString(org.xbet.client1.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.m))));
        }
        if (this.e == null || z == this.n) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.p;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.n ? this.q : this.r);
            if (!this.n && (colorStateList2 = this.z) != null) {
                this.p.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.A) == null) {
                return;
            }
            this.p.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.B;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueQ = n6x.Q(context.getTheme(), org.xbet.client1.R.attr.colorControlActivated);
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
        }
        EditText editText = this.e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.e.getTextCursorDrawable().mutate();
        if ((o() || (this.p != null && this.n)) && (colorStateList = this.f1) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    public final boolean s() {
        boolean z;
        if (this.e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            y4m0 y4m0Var = this.b;
            if (y4m0Var.getMeasuredWidth() > 0) {
                int iMax = Math.max(0, y4m0Var.getMeasuredWidth() - this.e.getPaddingLeft());
                if (this.D1 == null || this.E1 != iMax) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.D1 = colorDrawable;
                    this.E1 = iMax;
                    colorDrawable.setBounds(0, 0, iMax, 1);
                }
                Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.D1;
                if (drawable != colorDrawable2) {
                    this.e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.D1 != null) {
                Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
                this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.D1 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.D1 != null) {
            Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
            this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.D1 = null;
            z = true;
        } else {
            z = false;
        }
        cxn cxnVar = this.c;
        if ((cxnVar.d() || ((cxnVar.i != 0 && cxnVar.c()) || cxnVar.p != null)) && cxnVar.getMeasuredWidth() > 0) {
            int measuredWidth = cxnVar.q.getMeasuredWidth() - this.e.getPaddingRight();
            if (cxnVar.d()) {
                checkableImageButton = cxnVar.c;
            } else if (cxnVar.i != 0 && cxnVar.c()) {
                checkableImageButton = cxnVar.g;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.G1;
            if (colorDrawable3 != null && this.H1 != iMax2) {
                this.H1 = iMax2;
                colorDrawable3.setBounds(0, 0, iMax2, 1);
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.G1, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.G1 = colorDrawable4;
                this.H1 = iMax2;
                colorDrawable4.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.G1;
            if (drawable2 != colorDrawable5) {
                this.I1 = drawable2;
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.G1 != null) {
            Drawable[] compoundDrawablesRelative5 = this.e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.G1) {
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.I1, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.G1 = null;
            return z2;
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.y1 != i) {
            this.y1 = i;
            this.P1 = i;
            this.R1 = i;
            this.S1 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.P1 = defaultColor;
        this.y1 = defaultColor;
        this.Q1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.R1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.S1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.s1) {
            return;
        }
        this.s1 = i;
        if (this.e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.t1 = i;
    }

    public void setBoxCornerFamily(int i) {
        daf dafVarL = this.p1.l();
        dne dneVar = this.p1.e;
        dafVarL.b = k7x.A(i);
        dafVarL.f = dneVar;
        dne dneVar2 = this.p1.f;
        dafVarL.c = k7x.A(i);
        dafVarL.g = dneVar2;
        dne dneVar3 = this.p1.h;
        dafVarL.e = k7x.A(i);
        dafVarL.i = dneVar3;
        dne dneVar4 = this.p1.g;
        dafVarL.d = k7x.A(i);
        dafVarL.h = dneVar4;
        this.p1 = dafVarL.c();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.N1 != i) {
            this.N1 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.L1 = colorStateList.getDefaultColor();
            this.U1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.M1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.N1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.N1 != colorStateList.getDefaultColor()) {
            this.N1 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.O1 != colorStateList) {
            this.O1 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.v1 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.w1 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            u6x u6xVar = this.k;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.p = appCompatTextView;
                appCompatTextView.setId(org.xbet.client1.R.id.textinput_counter);
                Typeface typeface = this.C1;
                if (typeface != null) {
                    this.p.setTypeface(typeface);
                }
                this.p.setMaxLines(1);
                u6xVar.a(this.p, 2);
                ((ViewGroup.MarginLayoutParams) this.p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(org.xbet.client1.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.p != null) {
                    EditText editText = this.e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                u6xVar.g(this.p, 2);
                this.p = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i > 0) {
                this.m = i;
            } else {
                this.m = -1;
            }
            if (!this.l || this.p == null) {
                return;
            }
            EditText editText = this.e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.r != i) {
            this.r = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1 != colorStateList) {
            this.f1 = colorStateList;
            if (o() || (this.p != null && this.n)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.J1 = colorStateList;
        this.K1 = colorStateList;
        if (this.e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        cxn cxnVar = this.c;
        cxnVar.f(i != 0 ? cxnVar.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        cxn cxnVar = this.c;
        Drawable drawableU = i != 0 ? epv0.U(i, cxnVar.getContext()) : null;
        TextInputLayout textInputLayout = cxnVar.f5129a;
        CheckableImageButton checkableImageButton = cxnVar.g;
        checkableImageButton.setImageDrawable(drawableU);
        if (drawableU != null) {
            cww.o(textInputLayout, checkableImageButton, cxnVar.k, cxnVar.l);
            cww.H(textInputLayout, checkableImageButton, cxnVar.k);
        }
    }

    public void setEndIconMinSize(int i) {
        cxn cxnVar = this.c;
        if (i < 0) {
            cxnVar.getClass();
            jf4.o("endIconSize cannot be less than 0");
        } else if (i != cxnVar.m) {
            cxnVar.m = i;
            CheckableImageButton checkableImageButton = cxnVar.g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = cxnVar.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        cxn cxnVar = this.c;
        CheckableImageButton checkableImageButton = cxnVar.g;
        View.OnLongClickListener onLongClickListener = cxnVar.o;
        checkableImageButton.setOnClickListener(onClickListener);
        cww.J(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        cxn cxnVar = this.c;
        cxnVar.o = onLongClickListener;
        CheckableImageButton checkableImageButton = cxnVar.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        cww.J(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        cxn cxnVar = this.c;
        cxnVar.n = scaleType;
        cxnVar.g.setScaleType(scaleType);
        cxnVar.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        cxn cxnVar = this.c;
        if (cxnVar.k != colorStateList) {
            cxnVar.k = colorStateList;
            cww.o(cxnVar.f5129a, cxnVar.g, colorStateList, cxnVar.l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        cxn cxnVar = this.c;
        if (cxnVar.l != mode) {
            cxnVar.l = mode;
            cww.o(cxnVar.f5129a, cxnVar.g, cxnVar.k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) {
        u6x u6xVar = this.k;
        if (!u6xVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            u6xVar.f();
            return;
        }
        u6xVar.c();
        u6xVar.p = charSequence;
        u6xVar.r.setText(charSequence);
        byte b = u6xVar.n;
        if (b != 1) {
            u6xVar.o = (byte) 1;
        }
        u6xVar.i(b, u6xVar.o, u6xVar.h(u6xVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u6x u6xVar = this.k;
        u6xVar.t = i;
        AppCompatTextView appCompatTextView = u6xVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u6x u6xVar = this.k;
        u6xVar.s = charSequence;
        AppCompatTextView appCompatTextView = u6xVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        u6x u6xVar = this.k;
        TextInputLayout textInputLayout = u6xVar.h;
        if (u6xVar.q == z) {
            return;
        }
        u6xVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(u6xVar.g);
            u6xVar.r = appCompatTextView;
            appCompatTextView.setId(org.xbet.client1.R.id.textinput_error);
            u6xVar.r.setTextAlignment(5);
            Typeface typeface = u6xVar.B;
            if (typeface != null) {
                u6xVar.r.setTypeface(typeface);
            }
            int i = u6xVar.u;
            u6xVar.u = i;
            AppCompatTextView appCompatTextView2 = u6xVar.r;
            if (appCompatTextView2 != null) {
                u6xVar.h.n(appCompatTextView2, i);
            }
            ColorStateList colorStateList = u6xVar.v;
            u6xVar.v = colorStateList;
            AppCompatTextView appCompatTextView3 = u6xVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = u6xVar.s;
            u6xVar.s = charSequence;
            AppCompatTextView appCompatTextView4 = u6xVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = u6xVar.t;
            u6xVar.t = i2;
            AppCompatTextView appCompatTextView5 = u6xVar.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            u6xVar.r.setVisibility(4);
            u6xVar.a(u6xVar.r, 0);
        } else {
            u6xVar.f();
            u6xVar.g(u6xVar.r, 0);
            u6xVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        u6xVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        cxn cxnVar = this.c;
        cxnVar.i(i != 0 ? epv0.U(i, cxnVar.getContext()) : null);
        cww.H(cxnVar.f5129a, cxnVar.c, cxnVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        cxn cxnVar = this.c;
        CheckableImageButton checkableImageButton = cxnVar.c;
        View.OnLongClickListener onLongClickListener = cxnVar.f;
        checkableImageButton.setOnClickListener(onClickListener);
        cww.J(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        cxn cxnVar = this.c;
        cxnVar.f = onLongClickListener;
        CheckableImageButton checkableImageButton = cxnVar.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        cww.J(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        cxn cxnVar = this.c;
        if (cxnVar.d != colorStateList) {
            cxnVar.d = colorStateList;
            cww.o(cxnVar.f5129a, cxnVar.c, colorStateList, cxnVar.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        cxn cxnVar = this.c;
        if (cxnVar.e != mode) {
            cxnVar.e = mode;
            cww.o(cxnVar.f5129a, cxnVar.c, cxnVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u6x u6xVar = this.k;
        u6xVar.u = i;
        AppCompatTextView appCompatTextView = u6xVar.r;
        if (appCompatTextView != null) {
            u6xVar.h.n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u6x u6xVar = this.k;
        u6xVar.v = colorStateList;
        AppCompatTextView appCompatTextView = u6xVar.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.Y1 != z) {
            this.Y1 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        u6x u6xVar = this.k;
        if (zIsEmpty) {
            if (u6xVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!u6xVar.x) {
            setHelperTextEnabled(true);
        }
        u6xVar.c();
        u6xVar.w = charSequence;
        u6xVar.y.setText(charSequence);
        byte b = u6xVar.n;
        if (b != 2) {
            u6xVar.o = (byte) 2;
        }
        u6xVar.i(b, u6xVar.o, u6xVar.h(u6xVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u6x u6xVar = this.k;
        u6xVar.A = colorStateList;
        AppCompatTextView appCompatTextView = u6xVar.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        u6x u6xVar = this.k;
        TextInputLayout textInputLayout = u6xVar.h;
        if (u6xVar.x == z) {
            return;
        }
        u6xVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(u6xVar.g);
            u6xVar.y = appCompatTextView;
            appCompatTextView.setId(org.xbet.client1.R.id.textinput_helper_text);
            u6xVar.y.setTextAlignment(5);
            Typeface typeface = u6xVar.B;
            if (typeface != null) {
                u6xVar.y.setTypeface(typeface);
            }
            u6xVar.y.setVisibility(4);
            u6xVar.y.setImportantForAccessibility(2);
            int i = u6xVar.z;
            u6xVar.z = i;
            AppCompatTextView appCompatTextView2 = u6xVar.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = u6xVar.A;
            u6xVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = u6xVar.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            u6xVar.a(u6xVar.y, 1);
        } else {
            u6xVar.c();
            byte b = u6xVar.n;
            if (b == 2) {
                u6xVar.o = (byte) 0;
            }
            u6xVar.i(b, u6xVar.o, u6xVar.h(u6xVar.y, ""));
            u6xVar.g(u6xVar.y, 1);
            u6xVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        u6xVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        u6x u6xVar = this.k;
        u6xVar.z = i;
        AppCompatTextView appCompatTextView = u6xVar.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.Z1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.g1) {
            this.g1 = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.h1)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.i1 = true;
            } else {
                this.i1 = false;
                if (!TextUtils.isEmpty(this.h1) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.h1);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        f2d f2dVar = this.X1;
        if (i != f2dVar.p0) {
            f2dVar.p0 = i;
            f2dVar.l(false);
        }
        f2dVar.v(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        f2d f2dVar = this.X1;
        f2dVar.q(i);
        this.K1 = f2dVar.p;
        if (this.e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.K1 != colorStateList) {
            if (this.J1 == null) {
                this.X1.r(colorStateList);
            }
            this.K1 = colorStateList;
            if (this.e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(n8q0 n8q0Var) {
        this.o = n8q0Var;
    }

    public void setMaxEms(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        cxn cxnVar = this.c;
        cxnVar.g.setContentDescription(i != 0 ? cxnVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        cxn cxnVar = this.c;
        cxnVar.g.setImageDrawable(i != 0 ? epv0.U(i, cxnVar.getContext()) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        cxn cxnVar = this.c;
        if (z && cxnVar.i != 1) {
            cxnVar.g(1);
        } else if (z) {
            cxnVar.getClass();
        } else {
            cxnVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        cxn cxnVar = this.c;
        cxnVar.k = colorStateList;
        cww.o(cxnVar.f5129a, cxnVar.g, colorStateList, cxnVar.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        cxn cxnVar = this.c;
        cxnVar.l = mode;
        cww.o(cxnVar.f5129a, cxnVar.g, cxnVar.k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.u = appCompatTextView;
            appCompatTextView.setId(org.xbet.client1.R.id.textinput_placeholder);
            this.u.setImportantForAccessibility(1);
            this.u.setAccessibilityLiveRegion(1);
            ewo ewoVarF = f();
            this.x = ewoVarF;
            ewoVarF.b = 67L;
            this.y = f();
            setPlaceholderTextAppearance(this.w);
            setPlaceholderTextColor(this.v);
            rgu0.o(this.u, new bi30((byte) 4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.t) {
                setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        EditText editText = this.e;
        x(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i) {
        this.w = i;
        AppCompatTextView appCompatTextView = this.u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y4m0 y4m0Var = this.b;
        y4m0Var.getClass();
        y4m0Var.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        y4m0Var.b.setText(charSequence);
        y4m0Var.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(akj0 akj0Var) {
        ki30 ki30Var = this.j1;
        if (ki30Var == null || ki30Var.j() == akj0Var) {
            return;
        }
        this.p1 = akj0Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? epv0.U(i, getContext()) : null);
    }

    public void setStartIconMinSize(int i) {
        y4m0 y4m0Var = this.b;
        if (i < 0) {
            y4m0Var.getClass();
            jf4.o("startIconSize cannot be less than 0");
        } else if (i != y4m0Var.g) {
            y4m0Var.g = i;
            CheckableImageButton checkableImageButton = y4m0Var.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y4m0 y4m0Var = this.b;
        CheckableImageButton checkableImageButton = y4m0Var.d;
        View.OnLongClickListener onLongClickListener = y4m0Var.i;
        checkableImageButton.setOnClickListener(onClickListener);
        cww.J(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y4m0 y4m0Var = this.b;
        y4m0Var.i = onLongClickListener;
        CheckableImageButton checkableImageButton = y4m0Var.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        cww.J(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y4m0 y4m0Var = this.b;
        y4m0Var.h = scaleType;
        y4m0Var.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y4m0 y4m0Var = this.b;
        if (y4m0Var.e != colorStateList) {
            y4m0Var.e = colorStateList;
            cww.o(y4m0Var.f42009a, y4m0Var.d, colorStateList, y4m0Var.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y4m0 y4m0Var = this.b;
        if (y4m0Var.f != mode) {
            y4m0Var.f = mode;
            cww.o(y4m0Var.f42009a, y4m0Var.d, y4m0Var.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        cxn cxnVar = this.c;
        cxnVar.getClass();
        cxnVar.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        cxnVar.q.setText(charSequence);
        cxnVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(m8q0 m8q0Var) {
        EditText editText = this.e;
        if (editText != null) {
            rgu0.o(editText, m8q0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.C1) {
            this.C1 = typeface;
            f2d f2dVar = this.X1;
            boolean zT = f2dVar.t(typeface);
            boolean z = f2dVar.z(typeface);
            if (zT || z) {
                f2dVar.l(false);
            }
            u6x u6xVar = this.k;
            if (typeface != u6xVar.B) {
                u6xVar.B = typeface;
                AppCompatTextView appCompatTextView = u6xVar.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = u6xVar.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.e;
        if (editText == null || this.s1 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = qhl.f28744a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(td3.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.n && (appCompatTextView = this.p) != null) {
            drawableMutate.setColorFilter(td3.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.e;
        if (editText == null || this.j1 == null) {
            return;
        }
        if ((this.m1 || editText.getBackground() == null) && this.s1 != 0) {
            this.e.setBackground(getEditTextBoxBackground());
            this.m1 = true;
        }
    }

    public final void v() {
        if (this.s1 != 1) {
            FrameLayout frameLayout = this.f45581a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.J1;
        f2d f2dVar = this.X1;
        if (colorStateList2 != null) {
            f2dVar.n(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.J1;
            int colorForState = this.U1;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            f2dVar.n(ColorStateList.valueOf(colorForState));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.k.r;
            f2dVar.n(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.n && (appCompatTextView = this.p) != null) {
            f2dVar.n(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.K1) != null) {
            f2dVar.r(colorStateList);
        }
        cxn cxnVar = this.c;
        y4m0 y4m0Var = this.b;
        if (z3 || !this.Y1 || (isEnabled() && z4)) {
            if (z2 || this.W1) {
                ValueAnimator valueAnimator = this.a2;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.a2.cancel();
                }
                if (z && this.Z1) {
                    b(1.0f);
                } else {
                    f2dVar.A(1.0f);
                }
                this.W1 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.e;
                x(editText3 != null ? editText3.getText() : null);
                y4m0Var.j = false;
                y4m0Var.f();
                cxnVar.r = false;
                cxnVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.W1) {
            ValueAnimator valueAnimator2 = this.a2;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.a2.cancel();
            }
            if (z && this.Z1) {
                b(0.0f);
            } else {
                f2dVar.A(0.0f);
            }
            if (g() && !((d0g) this.j1).i1.q.isEmpty() && g()) {
                ((d0g) this.j1).A(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.W1 = true;
            AppCompatTextView appCompatTextView3 = this.u;
            if (appCompatTextView3 != null && this.t) {
                appCompatTextView3.setText((CharSequence) null);
                tms0.a(this.f45581a, this.y);
                this.u.setVisibility(4);
            }
            y4m0Var.j = true;
            y4m0Var.f();
            cxnVar.r = true;
            cxnVar.n();
        }
    }

    public final void x(Editable editable) {
        ((v4i0) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f45581a;
        if (length != 0 || this.W1) {
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || !this.t) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            tms0.a(frameLayout, this.y);
            this.u.setVisibility(4);
            return;
        }
        if (this.u == null || !this.t || TextUtils.isEmpty(this.s)) {
            return;
        }
        this.u.setText(this.s);
        tms0.a(frameLayout, this.x);
        this.u.setVisibility(0);
        this.u.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.O1.getDefaultColor();
        int colorForState = this.O1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.O1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.x1 = colorForState2;
        } else if (z2) {
            this.x1 = colorForState;
        } else {
            this.x1 = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.j1 == null || this.s1 == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.e) != null && editText.isHovered());
        if (!isEnabled()) {
            this.x1 = this.U1;
        } else if (o()) {
            if (this.O1 != null) {
                y(z, z2);
            } else {
                this.x1 = getErrorCurrentTextColors();
            }
        } else if (!this.n || (appCompatTextView = this.p) == null) {
            if (z) {
                this.x1 = this.N1;
            } else if (z2) {
                this.x1 = this.M1;
            } else {
                this.x1 = this.L1;
            }
        } else if (this.O1 != null) {
            y(z, z2);
        } else {
            this.x1 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        cxn cxnVar = this.c;
        TextInputLayout textInputLayout = cxnVar.f5129a;
        CheckableImageButton checkableImageButton = cxnVar.g;
        TextInputLayout textInputLayout2 = cxnVar.f5129a;
        cxnVar.l();
        cww.H(textInputLayout2, cxnVar.c, cxnVar.d);
        cww.H(textInputLayout2, checkableImageButton, cxnVar.k);
        if (cxnVar.a() instanceof til) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                cww.o(textInputLayout, checkableImageButton, cxnVar.k, cxnVar.l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        y4m0 y4m0Var = this.b;
        cww.H(y4m0Var.f42009a, y4m0Var.d, y4m0Var.e);
        if (this.s1 == 2) {
            int i2 = this.u1;
            if (z && isEnabled()) {
                i = this.w1;
                this.u1 = i;
            } else {
                i = this.v1;
                this.u1 = i;
            }
            if (i != i2 && g() && !this.W1) {
                if (g()) {
                    ((d0g) this.j1).A(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.s1 == 1) {
            if (!isEnabled()) {
                this.y1 = this.Q1;
            } else if (z2 && !z) {
                this.y1 = this.S1;
            } else if (z) {
                this.y1 = this.R1;
            } else {
                this.y1 = this.P1;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.e;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.g1) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.c(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.c.f(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        cxn cxnVar = this.c;
        TextInputLayout textInputLayout = cxnVar.f5129a;
        CheckableImageButton checkableImageButton = cxnVar.g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            cww.o(textInputLayout, checkableImageButton, cxnVar.k, cxnVar.l);
            cww.H(textInputLayout, checkableImageButton, cxnVar.k);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.xbet.client1.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
