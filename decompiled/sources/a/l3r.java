package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class l3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f19372a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final ContentLoadingProgressBar d;
    public final DsTextField e;
    public final MaterialTextView f;
    public final MaterialTextView g;
    public final MaterialTextView h;

    public l3r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, ContentLoadingProgressBar contentLoadingProgressBar, DsTextField dsTextField, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f19372a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = contentLoadingProgressBar;
        this.e = dsTextField;
        this.f = materialTextView;
        this.g = materialTextView2;
        this.h = materialTextView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19372a;
    }
}
