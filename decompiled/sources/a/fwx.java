package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final class fwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f10282a;

    public fwx(DsSettingsCell dsSettingsCell) {
        this.f10282a = dsSettingsCell;
    }

    public static fwx a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_logout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        DsSettingsCell dsSettingsCell = (DsSettingsCell) viewInflate;
        if (((DsCellMiddleTitle) yum0.f(viewInflate, R.id.mcLogOut)) != null) {
            return new fwx(dsSettingsCell);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.mcLogOut)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10282a;
    }
}
