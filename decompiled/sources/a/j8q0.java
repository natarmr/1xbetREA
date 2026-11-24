package a;

import android.text.Editable;
import android.text.TextWatcher;
import org.xplatform.ui_core.viewcomponents.layouts.linear.TextInputEditTextNew;

/* JADX INFO: loaded from: classes6.dex */
public final class j8q0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16098a;
    public final /* synthetic */ TextInputEditTextNew b;

    public /* synthetic */ j8q0(TextInputEditTextNew textInputEditTextNew, byte b) {
        this.f16098a = b;
        this.b = textInputEditTextNew;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.f16098a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f16098a) {
            case 0:
                this.b.setErrorEnabled(false);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f16098a) {
            case 0:
                break;
            default:
                this.b.getOnTextChanged().invoke(String.valueOf(charSequence));
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
