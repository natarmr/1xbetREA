package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class k3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17633a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final ContentLoadingProgressBar d;
    public final DsTextField e;
    public final DsButton f;
    public final MaterialTextView g;
    public final MaterialTextView h;

    public k3r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, ContentLoadingProgressBar contentLoadingProgressBar, DsTextField dsTextField, DsButton dsButton, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f17633a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = contentLoadingProgressBar;
        this.e = dsTextField;
        this.f = dsButton;
        this.g = materialTextView;
        this.h = materialTextView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17633a;
    }
}
