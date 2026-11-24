package a;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class bxn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cxn f3382a;

    public bxn(cxn cxnVar) {
        this.f3382a = cxnVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        cxn cxnVar = this.f3382a;
        rbc rbcVar = cxnVar.v;
        if (cxnVar.s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = cxnVar.s;
        if (editText != null) {
            editText.removeTextChangedListener(rbcVar);
            if (cxnVar.s.getOnFocusChangeListener() == cxnVar.a().e()) {
                cxnVar.s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        cxnVar.s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(rbcVar);
        }
        cxnVar.a().l(cxnVar.s);
        cxnVar.j(cxnVar.a());
    }
}
