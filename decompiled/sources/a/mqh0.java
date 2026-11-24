package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class mqh0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f22225a;
    public final DsNavigationBarBasic b;
    public final ComposeView c;

    public mqh0(LinearLayout linearLayout, DsNavigationBarBasic dsNavigationBarBasic, ComposeView composeView) {
        this.f22225a = linearLayout;
        this.b = dsNavigationBarBasic;
        this.c = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22225a;
    }
}
