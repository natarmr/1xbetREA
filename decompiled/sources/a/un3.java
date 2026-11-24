package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes3.dex */
public final class un3 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35941a;
    public final DsButton b;
    public final MaterialTextView c;
    public final MaterialTextView d;
    public final ConstraintLayout e;

    public un3(ConstraintLayout constraintLayout, DsButton dsButton, MaterialTextView materialTextView, MaterialTextView materialTextView2, ConstraintLayout constraintLayout2) {
        this.f35941a = constraintLayout;
        this.b = dsButton;
        this.c = materialTextView;
        this.d = materialTextView2;
        this.e = constraintLayout2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35941a;
    }
}
