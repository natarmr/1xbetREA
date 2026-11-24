package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes4.dex */
public final class l6q implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f19519a;
    public final DsButton b;
    public final DsTextField c;
    public final TextView d;

    public l6q(ConstraintLayout constraintLayout, DsButton dsButton, DsTextField dsTextField, TextView textView) {
        this.f19519a = constraintLayout;
        this.b = dsButton;
        this.c = dsTextField;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19519a;
    }
}
