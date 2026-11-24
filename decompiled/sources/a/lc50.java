package a;

import android.view.View;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class lc50 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsNavigationBarBasic f19785a;
    public final DsNavigationBarBasic b;

    public lc50(DsNavigationBarBasic dsNavigationBarBasic, DsNavigationBarBasic dsNavigationBarBasic2) {
        this.f19785a = dsNavigationBarBasic;
        this.b = dsNavigationBarBasic2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19785a;
    }
}
