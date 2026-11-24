package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class q4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f28113a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final MaterialTextView d;
    public final View e;

    public q4r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, MaterialTextView materialTextView, View view) {
        this.f28113a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = materialTextView;
        this.e = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28113a;
    }
}
