package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class m3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21131a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final ContentLoadingProgressBar d;
    public final DsTextField e;
    public final MaterialTextView f;

    public m3r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, ContentLoadingProgressBar contentLoadingProgressBar, DsTextField dsTextField, MaterialTextView materialTextView) {
        this.f21131a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = contentLoadingProgressBar;
        this.e = dsTextField;
        this.f = materialTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21131a;
    }
}
