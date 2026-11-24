package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes.dex */
public final class w0f implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38345a;
    public final DsButton b;
    public final DsTextField c;
    public final TextView d;

    public w0f(ConstraintLayout constraintLayout, DsButton dsButton, DsTextField dsTextField, TextView textView) {
        this.f38345a = constraintLayout;
        this.b = dsButton;
        this.c = dsTextField;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38345a;
    }
}
