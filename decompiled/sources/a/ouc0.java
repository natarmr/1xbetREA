package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final class ouc0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f25870a;
    public final DsButton b;
    public final DsTextField c;
    public final CoordinatorLayout d;
    public final TextView e;

    public ouc0(ConstraintLayout constraintLayout, DsButton dsButton, DsTextField dsTextField, CoordinatorLayout coordinatorLayout, TextView textView) {
        this.f25870a = constraintLayout;
        this.b = dsButton;
        this.c = dsTextField;
        this.d = coordinatorLayout;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25870a;
    }
}
