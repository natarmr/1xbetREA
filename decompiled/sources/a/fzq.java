package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class fzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10420a;
    public final DsBottomBar b;
    public final ConstraintLayout c;
    public final DSLottieEmptyContainer d;
    public final DsNavigationBarBasic e;
    public final ContentLoadingProgressBar f;
    public final DsTag g;
    public final DsTextField h;
    public final MaterialTextView i;

    public fzq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, ConstraintLayout constraintLayout2, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBarBasic dsNavigationBarBasic, ContentLoadingProgressBar contentLoadingProgressBar, DsTag dsTag, DsTextField dsTextField, MaterialTextView materialTextView) {
        this.f10420a = constraintLayout;
        this.b = dsBottomBar;
        this.c = constraintLayout2;
        this.d = dSLottieEmptyContainer;
        this.e = dsNavigationBarBasic;
        this.f = contentLoadingProgressBar;
        this.g = dsTag;
        this.h = dsTextField;
        this.i = materialTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10420a;
    }
}
