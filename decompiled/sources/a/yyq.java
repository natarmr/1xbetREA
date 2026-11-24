package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class yyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43479a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final FrameLayout d;
    public final DsTextField e;
    public final TextView f;

    public yyq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, FrameLayout frameLayout, DsTextField dsTextField, TextView textView) {
        this.f43479a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = frameLayout;
        this.e = dsTextField;
        this.f = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43479a;
    }
}
