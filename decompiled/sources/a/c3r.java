package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final class c3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3692a;
    public final ConstraintLayout b;
    public final DsButton c;
    public final TextView d;
    public final DsTextField e;

    public c3r(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DsButton dsButton, TextView textView, DsTextField dsTextField) {
        this.f3692a = constraintLayout;
        this.b = constraintLayout2;
        this.c = dsButton;
        this.d = textView;
        this.e = dsTextField;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3692a;
    }
}
