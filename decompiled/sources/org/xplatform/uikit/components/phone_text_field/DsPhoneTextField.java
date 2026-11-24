package org.xplatform.uikit.components.phone_text_field;

import a.a8z;
import a.bnm;
import a.bqd0;
import a.cnm;
import a.dnm;
import a.dwi0;
import a.epv0;
import a.gbe0;
import a.iwk;
import a.jiq0;
import a.jrx;
import a.k1x;
import a.ktt0;
import a.lrc;
import a.maz;
import a.n78;
import a.o5k0;
import a.t9f;
import a.tje;
import a.vex;
import a.wez;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final class DsPhoneTextField extends jrx {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsTextField f47256a;
    public final DsTextField b;
    public final int c;
    public final a8z d;
    public iwk e;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsPhoneTextField(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        int i2 = R.style.Widget_DSTextField_Basic_Chevron_PhoneTextFieldCode;
        DsTextField dsTextField = new DsTextField(new tje(context, R.style.Widget_DSTextField_Basic_Chevron_PhoneTextFieldCode), null, 14);
        dsTextField.setId(R.id.dsPhoneCodeTextField);
        this.f47256a = dsTextField;
        DsTextField dsTextField2 = new DsTextField(new tje(context, R.style.Widget_DSTextField_Basic_PhoneTextFieldPhone), null, 14);
        dsTextField2.setId(R.id.dsPhonePhoneTextField);
        this.b = dsTextField2;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = maz.a(wez.b, dnm.f6377a);
        setSaveEnabled(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.X, 0, 0);
        DsTextField dsTextField3 = new DsTextField(new tje(getContext(), typedArrayObtainStyledAttributes.getBoolean(0, false) ? i2 : R.style.Widget_DSTextField_Basic_PhoneTextFieldCode), null, 14);
        dsTextField3.setId(R.id.dsPhoneCodeTextField);
        this.f47256a = dsTextField3;
        setCodeStartIcon(typedArrayObtainStyledAttributes.getDrawable(4));
        Context context2 = getContext();
        context2.getClass();
        setCodeLabel(ktt0.p(typedArrayObtainStyledAttributes, context2, 2));
        Context context3 = getContext();
        context3.getClass();
        setCodeText(ktt0.p(typedArrayObtainStyledAttributes, context3, 5));
        Context context4 = getContext();
        context4.getClass();
        setCodeHelperText(ktt0.p(typedArrayObtainStyledAttributes, context4, 1));
        Context context5 = getContext();
        context5.getClass();
        setCodePlaceholder(ktt0.p(typedArrayObtainStyledAttributes, context5, 3));
        this.f47256a.setFocusable(false);
        this.f47256a.setTextDirection(3);
        this.f47256a.setTag("DsPhoneTextField.TAG_CODE");
        DsTextField dsTextField4 = this.f47256a;
        dsTextField4.setPadding(dsTextField4.getPaddingLeft(), dsTextField4.getPaddingTop(), dsTextField4.getPaddingRight(), getResources().getDimensionPixelSize(R.dimen.space_4));
        addView(this.f47256a);
        a();
        Context context6 = getContext();
        context6.getClass();
        setPhoneLabel(ktt0.p(typedArrayObtainStyledAttributes, context6, 8));
        Context context7 = getContext();
        context7.getClass();
        setPhoneText(ktt0.p(typedArrayObtainStyledAttributes, context7, 10));
        Context context8 = getContext();
        context8.getClass();
        setPhoneHelperText(ktt0.p(typedArrayObtainStyledAttributes, context8, 7));
        Context context9 = getContext();
        context9.getClass();
        setPhonePlaceholder(ktt0.p(typedArrayObtainStyledAttributes, context9, 9));
        Context context10 = getContext();
        context10.getClass();
        setPhoneErrorText(ktt0.p(typedArrayObtainStyledAttributes, context10, 6));
        Context context11 = getContext();
        context11.getClass();
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context11, 5);
        setPhoneEnabled(!(strP == null || strP.length() == 0));
        dsTextField2.setTag("DsPhoneTextField.TAG_PHONE");
        dsTextField2.setPadding(dsTextField2.getPaddingLeft(), dsTextField2.getPaddingTop(), dsTextField2.getPaddingRight(), getResources().getDimensionPixelSize(R.dimen.space_4));
        addView(dsTextField2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final Drawable getCodeStartIconPlaceHolder() {
        Drawable drawableU = epv0.U(R.drawable.ic_glyph_language, getContext());
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.uikitSecondary60, typedValue, true);
        if (drawableU != null) {
            drawableU.setColorFilter(dwi0.J(typedValue.data, n78.SRC_IN));
        }
        return drawableU;
    }

    private final vex getPhoneHelper() {
        return (vex) this.d.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a() {
        cnm cnmVar = cnm.f4663a;
        if (!cnmVar.equals(cnmVar)) {
            t9f.b();
        } else {
            this.b.a((TextWatcher) getPhoneHelper().k.getValue());
        }
    }

    public final void b() {
        this.b.setFilters(new InputFilter[]{(InputFilter) getPhoneHelper().j.getValue()});
    }

    public final void c() {
        getPhoneHelper().i = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        super.clearFocus();
        this.b.clearFocus();
        this.f47256a.clearFocus();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d() {
        cnm cnmVar = cnm.f4663a;
        if (!cnmVar.equals(cnmVar)) {
            t9f.b();
        } else {
            this.b.c((TextWatcher) getPhoneHelper().k.getValue());
        }
    }

    public final void e() {
        setCodeStartIcon(getCodeStartIconPlaceHolder());
    }

    public final CharSequence getCode() {
        return this.f47256a.getText();
    }

    public final CharSequence getPhone() {
        return this.b.getText();
    }

    public final TextView getPhoneTextView() {
        return this.b.getTextView();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = this.f47256a.getTextView();
        if (textView != null) {
            textView.setIncludeFontPadding(false);
            textView.setOnScrollChangeListener(new bnm());
        }
        TextView textView2 = this.b.getTextView();
        if (textView2 != null) {
            textView2.setIncludeFontPadding(false);
            textView2.setOnScrollChangeListener(new bnm());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        DsTextField dsTextField = this.f47256a;
        dsTextField.layout(0, 0, dsTextField.getMeasuredWidth(), getMeasuredHeight());
        int measuredWidth = dsTextField.getMeasuredWidth() + this.c;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        DsTextField dsTextField2 = this.b;
        dsTextField2.layout(measuredWidth, 0, measuredWidth2, measuredHeight);
        TextView textView = dsTextField.getTextView();
        if (textView != null) {
            textView.setScrollY(0);
        }
        TextView textView2 = dsTextField2.getTextView();
        if (textView2 != null) {
            textView2.setScrollY(0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f47256a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = this.f47256a.getMeasuredWidth();
        int i3 = this.c;
        int i4 = (size - measuredWidth) - i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        DsTextField dsTextField = this.b;
        dsTextField.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(measuredWidth + i3 + i4, dsTextField.getMeasuredHeight());
    }

    public final void setAfterTextFormattingCallback(Function1<? super String, Unit> function1) {
        function1.getClass();
        vex phoneHelper = getPhoneHelper();
        phoneHelper.getClass();
        function1.getClass();
        phoneHelper.i = function1;
    }

    public final void setCodeChevronVisible(boolean z) {
        this.f47256a.setEndViewVisible(z);
    }

    public final void setCodeClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        this.f47256a.setOnClickListener(onClickListener);
    }

    public final void setCodeEditable(boolean z) {
        this.f47256a.setEditable(z);
    }

    public final void setCodeEnabled(boolean z) {
        this.f47256a.setEnabled(z);
    }

    public final void setCodeErrorText(CharSequence charSequence) {
        this.f47256a.setErrorText(charSequence);
    }

    public final void setCodeFocusable(boolean z) {
        this.f47256a.setFocusable(z);
    }

    public final void setCodeHelperText(CharSequence charSequence) {
        this.f47256a.setHelperText(charSequence);
    }

    public final void setCodeLabel(CharSequence charSequence) {
        this.f47256a.setLabelText(charSequence);
    }

    public final void setCodePlaceholder(CharSequence charSequence) {
        this.f47256a.setPlaceholderText(charSequence);
    }

    public final void setCodeStartIcon(String str) {
        str.getClass();
        iwk iwkVar = this.e;
        if (iwkVar != null) {
            iwkVar.a();
        }
        this.e = null;
        setCodeStartIcon(getCodeStartIconPlaceHolder());
        Context context = getContext();
        context.getClass();
        gbe0 gbe0VarA = o5k0.a(context);
        Context context2 = getContext();
        context2.getClass();
        k1x k1xVar = new k1x(context2);
        k1xVar.c = str;
        k1xVar.e = new lrc((Object) this, (byte) 27);
        this.e = gbe0VarA.a(k1xVar.a());
    }

    public final void setCodeStartIconTint(int i) {
        setCodeStartIconTintList(jiq0.n0(i, getContext()));
    }

    public final void setCodeStartIconTintList(ColorStateList colorStateList) {
        this.f47256a.setStartIconTintList(colorStateList);
    }

    public final void setCodeText(CharSequence charSequence) {
        this.f47256a.setText(charSequence);
        setPhoneEnabled(!(charSequence == null || charSequence.length() == 0));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        CharSequence text;
        super.setEnabled(z);
        DsTextField dsTextField = this.f47256a;
        this.b.setEnabled((!z || (text = dsTextField.getText()) == null || text.length() == 0) ? false : true);
        dsTextField.setEnabled(z);
    }

    public final void setImeOptions(int i) {
        this.b.setImeOptions(i);
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        onEditorActionListener.getClass();
        this.b.setOnEditorActionListener(onEditorActionListener);
    }

    public final void setPhoneEditable(boolean z) {
        this.b.setEditable(z);
    }

    public final void setPhoneEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    public final void setPhoneErrorText(CharSequence charSequence) {
        this.b.setErrorText(charSequence);
    }

    public final void setPhoneHelperText(CharSequence charSequence) {
        this.b.setHelperText(charSequence);
    }

    public final void setPhoneLabel(CharSequence charSequence) {
        this.b.setLabelText(charSequence);
    }

    public final void setPhoneMask(String str) {
        str.getClass();
        DsTextField dsTextField = this.b;
        CharSequence text = dsTextField.getText();
        vex phoneHelper = getPhoneHelper();
        phoneHelper.getClass();
        if (!Intrinsics.d(phoneHelper.b, phoneHelper.g.replace(str, Separators.POUND))) {
            vex phoneHelper2 = getPhoneHelper();
            phoneHelper2.getClass();
            if (!phoneHelper2.f37306a.equals(str)) {
                phoneHelper2.f37306a = str;
                if (str.length() > 0) {
                    String strReplace = phoneHelper2.g.replace(str, Separators.POUND);
                    phoneHelper2.b = strReplace;
                    StringBuilder sb = new StringBuilder();
                    int length = strReplace.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = strReplace.charAt(i);
                        if (cCharAt == '#') {
                            sb.append(cCharAt);
                        }
                    }
                    phoneHelper2.f = sb.length();
                    phoneHelper2.d = "";
                    phoneHelper2.c = 0;
                } else {
                    phoneHelper2.b = "";
                    phoneHelper2.f = 255;
                }
            }
            if (text == null || text.length() != 0) {
                dsTextField.setText(null);
                dsTextField.setText(text);
            } else {
                dsTextField.setText(null);
            }
        }
        if (str.equals(dsTextField.getPlaceholderOrEmpty())) {
            return;
        }
        setPhonePlaceholder(str);
    }

    public final void setPhonePlaceholder(CharSequence charSequence) {
        this.b.setPlaceholderText(charSequence);
    }

    public final void setPhoneText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setCodeStartIcon(int i) {
        this.f47256a.setStartIconDrawableRes(i);
    }

    public final void setCodeStartIcon(Drawable drawable) {
        this.f47256a.setStartIconDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPhoneTextField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPhoneTextField(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
