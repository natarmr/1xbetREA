package org.xplatform.uikit.components.search_field;

import a.a8z;
import a.bqd0;
import a.jt6;
import a.k0l;
import a.ktt0;
import a.maz;
import a.q10;
import a.upm;
import a.vpm;
import a.wez;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.search_field.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class DsSearchField extends FrameLayout {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47258a;
    public final a8z b;
    public final a8z c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/search_field/DsSearchField$SavedState;", "Landroid/view/View$BaseSavedState;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47259a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f47259a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DsSearchField(Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.searchFieldStyle);
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.spm
            public final /* synthetic */ DsSearchField b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                DsSearchField dsSearchField = this.b;
                switch (b3) {
                    case 0:
                        int i2 = DsSearchField.d;
                        return (TextInputEditText) dsSearchField.findViewById(R.id.textInputEditText);
                    case 1:
                        int i3 = DsSearchField.d;
                        return (CheckableImageButton) dsSearchField.findViewById(R.id.text_input_end_icon);
                    default:
                        int i4 = DsSearchField.d;
                        return (TextInputLayout) dsSearchField.findViewById(R.id.textInputLayout);
                }
            }
        };
        wez wezVar = wez.b;
        this.f47258a = maz.a(wezVar, function0);
        final byte b3 = 1;
        this.b = maz.a(wezVar, new Function0(this) { // from class: a.spm
            public final /* synthetic */ DsSearchField b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                DsSearchField dsSearchField = this.b;
                switch (b4) {
                    case 0:
                        int i2 = DsSearchField.d;
                        return (TextInputEditText) dsSearchField.findViewById(R.id.textInputEditText);
                    case 1:
                        int i3 = DsSearchField.d;
                        return (CheckableImageButton) dsSearchField.findViewById(R.id.text_input_end_icon);
                    default:
                        int i4 = DsSearchField.d;
                        return (TextInputLayout) dsSearchField.findViewById(R.id.textInputLayout);
                }
            }
        });
        this.c = maz.a(wezVar, new Function0(this) { // from class: a.spm
            public final /* synthetic */ DsSearchField b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                DsSearchField dsSearchField = this.b;
                switch (b4) {
                    case 0:
                        int i2 = DsSearchField.d;
                        return (TextInputEditText) dsSearchField.findViewById(R.id.textInputEditText);
                    case 1:
                        int i3 = DsSearchField.d;
                        return (CheckableImageButton) dsSearchField.findViewById(R.id.text_input_end_icon);
                    default:
                        int i4 = DsSearchField.d;
                        return (TextInputLayout) dsSearchField.findViewById(R.id.textInputLayout);
                }
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.h0, R.attr.searchFieldStyle, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getInt(2, 0) == 0 ? R.layout.search_field_layout : R.layout.search_field_overlay_layout, (ViewGroup) this, true);
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a.tpm
            public final /* synthetic */ DsSearchField b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                byte b4 = b2;
                DsSearchField dsSearchField = this.b;
                switch (b4) {
                    case 0:
                        DsSearchField.d(dsSearchField);
                        break;
                    default:
                        DsSearchField.e(dsSearchField);
                        break;
                }
            }
        });
        CheckableImageButton endIcon$uikit = getEndIcon$uikit();
        if (endIcon$uikit != null) {
            endIcon$uikit.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a.tpm
                public final /* synthetic */ DsSearchField b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    byte b4 = b3;
                    DsSearchField dsSearchField = this.b;
                    switch (b4) {
                        case 0:
                            DsSearchField.d(dsSearchField);
                            break;
                        default:
                            DsSearchField.e(dsSearchField);
                            break;
                    }
                }
            });
        }
        getEditText().addTextChangedListener(new jt6(this, (byte) 8));
        setText(ktt0.p(typedArrayObtainStyledAttributes, context, 0));
        setHint(ktt0.p(typedArrayObtainStyledAttributes, context, 1));
        getTextInputLayout().setEndIconOnClickListener(new q10(this, (byte) 18));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void d(DsSearchField dsSearchField) {
        TextInputLayout textInputLayout = dsSearchField.getTextInputLayout();
        Editable text = dsSearchField.getEditText().getText();
        textInputLayout.setEndIconVisible(!(text == null || text.length() == 0));
    }

    public static final void e(DsSearchField dsSearchField) {
        TextInputLayout textInputLayout = dsSearchField.getTextInputLayout();
        Editable text = dsSearchField.getEditText().getText();
        textInputLayout.setEndIconVisible(!(text == null || text.length() == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputLayout getTextInputLayout() {
        Object value = this.c.getValue();
        value.getClass();
        return (TextInputLayout) value;
    }

    public final void b(TextWatcher textWatcher) {
        textWatcher.getClass();
        getEditText().addTextChangedListener(new upm(new k0l(1, textWatcher, TextWatcher.class, "afterTextChanged", "afterTextChanged(Landroid/text/Editable;)V", 0, (byte) 23), new vpm(4, textWatcher, TextWatcher.class, "beforeTextChanged", "beforeTextChanged(Ljava/lang/CharSequence;III)V", 0), this, textWatcher));
    }

    public final void c() {
        com.google.android.material.textfield.TextInputEditText editText = getEditText();
        editText.getClass();
        Object systemService = editText.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        super.clearFocus();
        getEditText().clearFocus();
        c();
    }

    public final void f() {
        requestFocus();
        com.google.android.material.textfield.TextInputEditText editText = getEditText();
        editText.getClass();
        Object systemService = editText.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).showSoftInput(editText, 0);
    }

    public final com.google.android.material.textfield.TextInputEditText getEditText() {
        Object value = this.f47258a.getValue();
        value.getClass();
        return (com.google.android.material.textfield.TextInputEditText) value;
    }

    public final CheckableImageButton getEndIcon$uikit() {
        return (CheckableImageButton) this.b.getValue();
    }

    public final CharSequence getHint() {
        return getEditText().getHint();
    }

    public final CharSequence getText() {
        Editable text = getEditText().getText();
        if (text != null) {
            return StringsKt.u0(text);
        }
        return null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f47259a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        SavedState savedState = parcelableOnSaveInstanceState != null ? new SavedState(parcelableOnSaveInstanceState) : null;
        if (savedState != null) {
            savedState.f47259a = String.valueOf(getText());
        }
        return savedState;
    }

    public final void setCursorVisible(boolean z) {
        getEditText().setCursorVisible(z);
        if (z) {
            return;
        }
        getEditText().setShowSoftInputOnFocus(false);
        getEditText().requestFocus();
        getEditText().setShowSoftInputOnFocus(true);
    }

    public final void setHint(CharSequence charSequence) {
        getEditText().setHint(charSequence);
    }

    public final void setMaxWidth(int i) {
        getEditText().setWidth(i);
    }

    public final void setText(CharSequence charSequence) {
        if (charSequence != null) {
            Character chValueOf = charSequence.length() == 0 ? null : Character.valueOf(charSequence.charAt(0));
            if (chValueOf != null && CharsKt.d(chValueOf.charValue())) {
                charSequence = StringsKt.c0(charSequence);
            }
        }
        getEditText().setText(charSequence);
        if (charSequence != null) {
            getEditText().setSelection(charSequence.length());
        }
        TextInputLayout textInputLayout = getTextInputLayout();
        Editable text = getEditText().getText();
        textInputLayout.setEndIconVisible(!(text == null || text.length() == 0));
    }

    public final void setType(boolean z) {
        LayoutInflater.from(getContext()).inflate(z ? R.layout.search_field_overlay_layout : R.layout.search_field_layout, (ViewGroup) this, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSearchField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsSearchField(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
