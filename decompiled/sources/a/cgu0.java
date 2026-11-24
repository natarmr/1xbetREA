package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.DsShimmerCell;

/* JADX INFO: loaded from: classes5.dex */
public final class cgu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f4331a;
    public final DsShimmerCell b;

    public cgu0(DsSettingsCell dsSettingsCell, DsShimmerCell dsShimmerCell) {
        this.f4331a = dsSettingsCell;
        this.b = dsShimmerCell;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4331a;
    }
}
