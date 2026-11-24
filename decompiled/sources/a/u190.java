package a;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class u190 extends dxn {
    public final int e;
    public EditText f;
    public final l910 g;

    public u190(cxn cxnVar, int i) {
        super(cxnVar);
        this.e = R.drawable.design_password_eye;
        this.g = new l910(this, (byte) 13);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // a.dxn
    public final void b() {
        p();
    }

    @Override // a.dxn
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // a.dxn
    public final int d() {
        return this.e;
    }

    @Override // a.dxn
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // a.dxn
    public final boolean j() {
        return true;
    }

    @Override // a.dxn
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // a.dxn
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // a.dxn
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // a.dxn
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
