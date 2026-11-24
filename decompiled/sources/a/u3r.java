package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes5.dex */
public final class u3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35012a;
    public final View b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final DsCheckbox e;
    public final ImageView f;
    public final nq8 g;
    public final TextView h;
    public final View i;

    public u3r(ConstraintLayout constraintLayout, View view, MaterialButton materialButton, MaterialButton materialButton2, DsCheckbox dsCheckbox, ImageView imageView, nq8 nq8Var, TextView textView, View view2) {
        this.f35012a = constraintLayout;
        this.b = view;
        this.c = materialButton;
        this.d = materialButton2;
        this.e = dsCheckbox;
        this.f = imageView;
        this.g = nq8Var;
        this.h = textView;
        this.i = view2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35012a;
    }
}
