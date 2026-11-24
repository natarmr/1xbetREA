package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final class cux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f5007a;

    public cux(DsSettingsCell dsSettingsCell) {
        this.f5007a = dsSettingsCell;
    }

    public static cux a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_delete_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        DsSettingsCell dsSettingsCell = (DsSettingsCell) viewInflate;
        if (((DsCellMiddleTitle) yum0.f(viewInflate, R.id.mcLogOut)) != null) {
            return new cux(dsSettingsCell);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.mcLogOut)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5007a;
    }
}
