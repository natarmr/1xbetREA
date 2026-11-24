package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class o4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24654a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final FrameLayout d;
    public final DsTextField e;
    public final DsButton f;
    public final MaterialTextView g;
    public final MaterialTextView h;
    public final View i;

    public o4r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, FrameLayout frameLayout, DsTextField dsTextField, DsButton dsButton, MaterialTextView materialTextView, MaterialTextView materialTextView2, View view) {
        this.f24654a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = frameLayout;
        this.e = dsTextField;
        this.f = dsButton;
        this.g = materialTextView;
        this.h = materialTextView2;
        this.i = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24654a;
    }
}
