package a;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes5.dex */
public final class td7 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33752a;
    public final /* synthetic */ ry2 b;

    public td7(ry2 ry2Var) {
        this.b = ry2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.invoke(editable, Boolean.valueOf(this.f33752a > (editable != null ? editable.length() : 0)));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f33752a = charSequence != null ? charSequence.length() : 0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
