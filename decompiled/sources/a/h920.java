package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class h920 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12657a;
    public final DsButton b;
    public final DsTextField c;
    public final TextView d;

    public h920(ConstraintLayout constraintLayout, DsButton dsButton, DsTextField dsTextField, TextView textView) {
        this.f12657a = constraintLayout;
        this.b = dsButton;
        this.c = dsTextField;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12657a;
    }
}
