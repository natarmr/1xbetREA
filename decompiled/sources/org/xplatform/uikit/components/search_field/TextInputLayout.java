package org.xplatform.uikit.components.search_field;

import a.a8z;
import a.bqd0;
import a.eb30;
import a.hny;
import a.maz;
import a.wez;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.search_field.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class TextInputLayout extends com.google.android.material.textfield.TextInputLayout {
    public static final /* synthetic */ int l2 = 0;
    public final a8z f2;
    public final a8z g2;
    public final a8z h2;
    public final a8z i2;
    public final eb30 j2;
    public final float k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        CheckableImageButton startIcon;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.k8q0
            public final /* synthetic */ TextInputLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                TextInputLayout textInputLayout = this.b;
                switch (b2) {
                    case 0:
                        int i = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_start_icon);
                    case 1:
                        int i2 = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_end_icon);
                    case 2:
                        int i3 = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_error_icon);
                    default:
                        int i4 = TextInputLayout.l2;
                        return (AppCompatTextView) textInputLayout.findViewById(R.id.textinput_helper_text);
                }
            }
        };
        wez wezVar = wez.b;
        this.f2 = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.g2 = maz.a(wezVar, new Function0(this) { // from class: a.k8q0
            public final /* synthetic */ TextInputLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                TextInputLayout textInputLayout = this.b;
                switch (b3) {
                    case 0:
                        int i = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_start_icon);
                    case 1:
                        int i2 = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_end_icon);
                    case 2:
                        int i3 = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_error_icon);
                    default:
                        int i4 = TextInputLayout.l2;
                        return (AppCompatTextView) textInputLayout.findViewById(R.id.textinput_helper_text);
                }
            }
        });
        final byte b3 = 2;
        this.h2 = maz.a(wezVar, new Function0(this) { // from class: a.k8q0
            public final /* synthetic */ TextInputLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                TextInputLayout textInputLayout = this.b;
                switch (b4) {
                    case 0:
                        int i = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_start_icon);
                    case 1:
                        int i2 = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_end_icon);
                    case 2:
                        int i3 = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_error_icon);
                    default:
                        int i4 = TextInputLayout.l2;
                        return (AppCompatTextView) textInputLayout.findViewById(R.id.textinput_helper_text);
                }
            }
        });
        final byte b4 = 3;
        this.i2 = maz.a(wezVar, new Function0(this) { // from class: a.k8q0
            public final /* synthetic */ TextInputLayout b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                TextInputLayout textInputLayout = this.b;
                switch (b5) {
                    case 0:
                        int i = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_start_icon);
                    case 1:
                        int i2 = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_end_icon);
                    case 2:
                        int i3 = TextInputLayout.l2;
                        return (CheckableImageButton) textInputLayout.findViewById(R.id.text_input_error_icon);
                    default:
                        int i4 = TextInputLayout.l2;
                        return (AppCompatTextView) textInputLayout.findViewById(R.id.textinput_helper_text);
                }
            }
        });
        this.j2 = new eb30(this);
        this.k2 = getResources().getDimensionPixelOffset(R.dimen.space_6);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.r0, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(43, 0);
        if (i == 0) {
            CheckableImageButton startIcon2 = getStartIcon();
            if (startIcon2 != null) {
                ViewGroup.LayoutParams layoutParams = startIcon2.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    throw null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.size_20);
                marginLayoutParams.width = dimensionPixelSize;
                marginLayoutParams.height = dimensionPixelSize;
                marginLayoutParams.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.space_4));
                marginLayoutParams.topMargin = 0;
                startIcon2.setLayoutParams(marginLayoutParams);
            }
            CheckableImageButton endIcon$uikit = getEndIcon$uikit();
            if (endIcon$uikit != null) {
                ViewGroup.LayoutParams layoutParams2 = endIcon$uikit.getLayoutParams();
                if (layoutParams2 == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    throw null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.space_4));
                marginLayoutParams2.topMargin = 0;
                endIcon$uikit.setLayoutParams(marginLayoutParams2);
            }
            CheckableImageButton errorIcon = getErrorIcon();
            if (errorIcon != null) {
                errorIcon.setScaleType(ImageView.ScaleType.FIT_XY);
                ViewGroup.LayoutParams layoutParams3 = errorIcon.getLayoutParams();
                if (layoutParams3 == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    throw null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                int dimensionPixelSize2 = errorIcon.getResources().getDimensionPixelSize(R.dimen.size_16);
                marginLayoutParams3.width = dimensionPixelSize2;
                marginLayoutParams3.height = dimensionPixelSize2;
                marginLayoutParams3.setMarginEnd(errorIcon.getResources().getDimensionPixelOffset(R.dimen.space_8));
                marginLayoutParams3.topMargin = 0;
                errorIcon.setLayoutParams(marginLayoutParams3);
            }
            AppCompatTextView helperTextView$uikit = getHelperTextView$uikit();
            if (helperTextView$uikit != null) {
                ViewParent parent = helperTextView$uikit.getParent().getParent();
                parent.getClass();
                LinearLayout linearLayout = (LinearLayout) parent;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
                linearLayout.setTranslationY(-getResources().getDimensionPixelOffset(R.dimen.space_8));
            }
        } else if (i == 1) {
            CheckableImageButton startIcon3 = getStartIcon();
            if (startIcon3 != null) {
                ViewGroup.LayoutParams layoutParams4 = startIcon3.getLayoutParams();
                if (layoutParams4 == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    throw null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.size_20);
                marginLayoutParams4.width = dimensionPixelSize3;
                marginLayoutParams4.height = dimensionPixelSize3;
                marginLayoutParams4.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.space_12));
                marginLayoutParams4.topMargin = getResources().getDimensionPixelOffset(R.dimen.space_8);
                startIcon3.setLayoutParams(marginLayoutParams4);
            }
            CheckableImageButton endIcon$uikit2 = getEndIcon$uikit();
            if (endIcon$uikit2 != null) {
                ViewGroup.LayoutParams layoutParams5 = endIcon$uikit2.getLayoutParams();
                if (layoutParams5 == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    throw null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                marginLayoutParams5.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.space_8));
                marginLayoutParams5.topMargin = getResources().getDimensionPixelOffset(R.dimen.space_8);
                endIcon$uikit2.setLayoutParams(marginLayoutParams5);
            }
            CheckableImageButton errorIcon2 = getErrorIcon();
            if (errorIcon2 != null) {
                errorIcon2.setScaleType(ImageView.ScaleType.FIT_XY);
                ViewGroup.LayoutParams layoutParams6 = errorIcon2.getLayoutParams();
                if (layoutParams6 == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    throw null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                int dimensionPixelSize4 = errorIcon2.getResources().getDimensionPixelSize(R.dimen.size_16);
                marginLayoutParams6.width = dimensionPixelSize4;
                marginLayoutParams6.height = dimensionPixelSize4;
                marginLayoutParams6.setMarginEnd(errorIcon2.getResources().getDimensionPixelOffset(R.dimen.space_12));
                marginLayoutParams6.topMargin = errorIcon2.getResources().getDimensionPixelOffset(R.dimen.space_8);
                errorIcon2.setLayoutParams(marginLayoutParams6);
            }
        } else if (i == 2 && (startIcon = getStartIcon()) != null) {
            ViewGroup.LayoutParams layoutParams7 = startIcon.getLayoutParams();
            if (layoutParams7 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                throw null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
            marginLayoutParams7.setMarginStart(getResources().getDimensionPixelOffset(R.dimen.space_4));
            startIcon.setLayoutParams(marginLayoutParams7);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final CheckableImageButton getErrorIcon() {
        return (CheckableImageButton) this.h2.getValue();
    }

    private final CheckableImageButton getStartIcon() {
        return (CheckableImageButton) this.f2.getValue();
    }

    public final CheckableImageButton getEndIcon$uikit() {
        return (CheckableImageButton) this.g2.getValue();
    }

    public final AppCompatTextView getErrorText$uikit() {
        return (AppCompatTextView) findViewById(R.id.textinput_error);
    }

    public final AppCompatTextView getHelperTextView$uikit() {
        return (AppCompatTextView) this.i2.getValue();
    }

    public final void setEnabledEndIcon(boolean z) {
        CheckableImageButton endIcon$uikit = getEndIcon$uikit();
        if (endIcon$uikit != null) {
            endIcon$uikit.setEnabled(z);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(CharSequence charSequence) {
        ViewParent parent;
        EditText editText = getEditText();
        TextInputEditText textInputEditText = editText instanceof TextInputEditText ? (TextInputEditText) editText : null;
        if (textInputEditText != null) {
            textInputEditText.setError(true ^ (charSequence == null || charSequence.length() == 0));
        }
        super.setError(charSequence);
        eb30 eb30Var = this.j2;
        eb30Var.cancel();
        AppCompatTextView errorText$uikit = getErrorText$uikit();
        ViewParent parent2 = (errorText$uikit == null || (parent = errorText$uikit.getParent()) == null) ? null : parent.getParent();
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null) {
            if (charSequence == null || charSequence.length() == 0) {
                eb30Var.start();
            } else {
                viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, viewGroup.getPaddingRight(), viewGroup.getPaddingTop());
                viewGroup.setTranslationY(-this.k2);
            }
        }
    }
}
