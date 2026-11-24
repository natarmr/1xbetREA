package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class tuc0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f34544a;
    public final DsNavigationBar b;

    public tuc0(LinearLayout linearLayout, DsNavigationBar dsNavigationBar) {
        this.f34544a = linearLayout;
        this.b = dsNavigationBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34544a;
    }
}
