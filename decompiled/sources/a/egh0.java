package a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.ui_core.viewcomponents.views.search.SearchMaterialViewNew;

/* JADX INFO: loaded from: classes6.dex */
public final class egh0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hie0 f7766a;
    public final /* synthetic */ mie0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kie0 d;
    public final /* synthetic */ mie0 e;
    public final /* synthetic */ SearchMaterialViewNew f;

    public egh0(hie0 hie0Var, mie0 mie0Var, int i, kie0 kie0Var, mie0 mie0Var2, SearchMaterialViewNew searchMaterialViewNew) {
        this.f7766a = hie0Var;
        this.b = mie0Var;
        this.c = i;
        this.d = kie0Var;
        this.e = mie0Var2;
        this.f = searchMaterialViewNew;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.f.J1;
        editable.getClass();
        mie0 mie0Var = this.e;
        if (Intrinsics.d(mie0Var.f21842a, editable.toString())) {
            return;
        }
        hie0 hie0Var = this.f7766a;
        if (hie0Var.f13108a) {
            return;
        }
        hie0Var.f13108a = true;
        editText.setText((CharSequence) mie0Var.f21842a);
        if (((CharSequence) mie0Var.f21842a).length() > 0) {
            int length = editText.length();
            int i = this.d.f18333a;
            if (i >= 0 && i <= length) {
                length = i;
            }
            editText.setSelection(length);
        }
        hie0Var.f13108a = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        if (this.f7766a.f13108a) {
            return;
        }
        this.b.f21842a = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        if (this.f7766a.f13108a) {
            return;
        }
        String string = StringsKt.x0(charSequence.toString()).toString();
        int length = string.length();
        mie0 mie0Var = this.e;
        int i4 = this.c;
        if (length <= i4) {
            mie0Var.f21842a = string;
            return;
        }
        int length2 = string.length() - i4;
        StringBuilder sb = new StringBuilder();
        mie0 mie0Var2 = this.b;
        sb.append(((String) mie0Var2.f21842a).substring(0, i).concat(string.substring(i, (i3 + i) - length2)));
        this.d.f18333a = sb.length();
        String str = (String) mie0Var2.f21842a;
        sb.append(str.substring(sb.length() + (str.length() - i4), ((String) mie0Var2.f21842a).length()));
        mie0Var.f21842a = sb.toString();
    }
}
