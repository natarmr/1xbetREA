package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class bzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3483a;
    public final DsBottomBar b;
    public final DsNavigationBar c;
    public final FrameLayout d;
    public final MaterialTextView e;
    public final DsTextField f;
    public final MaterialTextView g;
    public final MaterialTextView h;
    public final MaterialTextView i;

    public bzq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBar dsNavigationBar, FrameLayout frameLayout, MaterialTextView materialTextView, DsTextField dsTextField, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f3483a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBar;
        this.d = frameLayout;
        this.e = materialTextView;
        this.f = dsTextField;
        this.g = materialTextView2;
        this.h = materialTextView3;
        this.i = materialTextView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3483a;
    }
}
