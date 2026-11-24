package a;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class z0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43583a;
    public final Button b;
    public final AppCompatEditText c;
    public final nq8 d;
    public final TextInputLayout e;
    public final MaterialToolbar f;

    public z0r(ConstraintLayout constraintLayout, Button button, AppCompatEditText appCompatEditText, nq8 nq8Var, TextInputLayout textInputLayout, MaterialToolbar materialToolbar) {
        this.f43583a = constraintLayout;
        this.b = button;
        this.c = appCompatEditText;
        this.d = nq8Var;
        this.e = textInputLayout;
        this.f = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43583a;
    }
}
