package a;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class m8q0 extends p6 {
    public final TextInputLayout d;

    public m8q0(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // a.p6
    public final void d(View view, k7 k7Var) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = k7Var.f17795a;
        this.f26429a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.W1;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            u6x u6xVar = textInputLayout.k;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (u6xVar.o == 2 && u6xVar.y != null && !TextUtils.isEmpty(u6xVar.w)) {
                if (TextUtils.isEmpty(string)) {
                    string = helperText.toString();
                } else {
                    string = string + ", " + ((Object) helperText);
                }
            }
        }
        y4m0 y4m0Var = textInputLayout.b;
        AppCompatTextView appCompatTextView = y4m0Var.b;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(y4m0Var.d);
        }
        if (!zIsEmpty) {
            k7Var.o(text);
        } else if (!TextUtils.isEmpty(string)) {
            k7Var.o(string);
            if (!z && placeholderText != null) {
                k7Var.o(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            k7Var.o(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                k7Var.m(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                k7Var.o(string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                k7Var.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            accessibilityNodeInfo.setError(!zIsEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.c.a().m(k7Var);
    }

    @Override // a.p6
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.c.a().n(accessibilityEvent);
    }
}
