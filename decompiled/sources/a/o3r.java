package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class o3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24600a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final MaterialTextView d;

    public o3r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, MaterialTextView materialTextView) {
        this.f24600a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = materialTextView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24600a;
    }
}
