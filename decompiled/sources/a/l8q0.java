package a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class l8q0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19618a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ TextInputLayout c;

    public l8q0(TextInputLayout textInputLayout, EditText editText) {
        this.c = textInputLayout;
        this.b = editText;
        this.f19618a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.c;
        textInputLayout.w(!textInputLayout.c2, false);
        if (textInputLayout.l) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.t) {
            textInputLayout.x(editable);
        }
        EditText editText = this.b;
        int lineCount = editText.getLineCount();
        int i = this.f19618a;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.V1;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f19618a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
