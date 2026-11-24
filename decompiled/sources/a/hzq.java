package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class hzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f13919a;
    public final DsBottomBar b;
    public final ConstraintLayout c;
    public final DSLottieEmptyContainer d;
    public final DsNavigationBarBasic e;
    public final FrameLayout f;
    public final DsTag g;
    public final DsTextField h;
    public final MaterialTextView i;

    public hzq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, ConstraintLayout constraintLayout2, DSLottieEmptyContainer dSLottieEmptyContainer, DsNavigationBarBasic dsNavigationBarBasic, FrameLayout frameLayout, DsTag dsTag, DsTextField dsTextField, MaterialTextView materialTextView) {
        this.f13919a = constraintLayout;
        this.b = dsBottomBar;
        this.c = constraintLayout2;
        this.d = dSLottieEmptyContainer;
        this.e = dsNavigationBarBasic;
        this.f = frameLayout;
        this.g = dsTag;
        this.h = dsTextField;
        this.i = materialTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13919a;
    }
}
