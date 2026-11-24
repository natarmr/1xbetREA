package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class d4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f5468a;
    public final DsBottomBar b;
    public final TextView c;
    public final DsTextField d;
    public final DsNavigationBar e;
    public final FrameLayout f;
    public final View g;

    public d4r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, TextView textView, DsTextField dsTextField, DsNavigationBar dsNavigationBar, FrameLayout frameLayout, View view) {
        this.f5468a = constraintLayout;
        this.b = dsBottomBar;
        this.c = textView;
        this.d = dsTextField;
        this.e = dsNavigationBar;
        this.f = frameLayout;
        this.g = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5468a;
    }
}
