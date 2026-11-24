package a;

import android.view.View;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class yc50 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsNavigationBarBasic f42370a;
    public final DsNavigationBarBasic b;

    public yc50(DsNavigationBarBasic dsNavigationBarBasic, DsNavigationBarBasic dsNavigationBarBasic2) {
        this.f42370a = dsNavigationBarBasic;
        this.b = dsNavigationBarBasic2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42370a;
    }
}
