package org.xplatform.uikit.components.bottom_sheet.presets;

import a.bqd0;
import a.ktt0;
import a.tje;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class DsPresetTextFieldBasic extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47227a;
    public final DsTextField b;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsPresetTextFieldBasic(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f47227a = getResources().getDimensionPixelSize(R.dimen.space_16);
        DsTextField dsTextField = new DsTextField(new tje(context, R.style.Widget_DSTextField_Basic), null, 14);
        this.b = dsTextField;
        addView(dsTextField);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.c0, 0, 0);
        dsTextField.setLabelText(ktt0.p(typedArrayObtainStyledAttributes, context, 1));
        dsTextField.setInputType(typedArrayObtainStyledAttributes.getInt(0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        DsTextField dsTextField = this.b;
        TextView textView = dsTextField.getTextView();
        if (textView != null) {
            textView.requestFocus();
        }
        CharSequence text = dsTextField.getText();
        dsTextField.setSelection(text != null ? text.length() : 0);
    }

    public final String getText() {
        return String.valueOf(this.b.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = this.f47227a;
        setPadding(i3, paddingTop, i3, paddingBottom);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    public final void setEndIcon(int i) {
        this.b.setEndIconDrawableRes(i);
    }

    public final void setEndIconDrawable(Drawable drawable) {
        this.b.setEndIconDrawable(drawable);
    }

    public final void setErrorText(CharSequence charSequence) {
        boolean z = charSequence == null || charSequence.length() == 0;
        DsTextField dsTextField = this.b;
        dsTextField.f(true ^ z);
        dsTextField.setErrorText(charSequence);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        inputFilterArr.getClass();
        this.b.setFilters(inputFilterArr);
    }

    public final void setHelperText(CharSequence charSequence) {
        this.b.setHelperText(charSequence);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.b.setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void setSelection(int i) {
        if (i == 0) {
            return;
        }
        this.b.setSelection(i);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTrailingText(CharSequence charSequence) {
        this.b.setTrailingText(charSequence);
    }

    public final void setHelperText(Spannable spannable) {
        this.b.setHelperText(spannable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPresetTextFieldBasic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPresetTextFieldBasic(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
