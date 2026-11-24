package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wwi0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wwi0 f39887a = new wwi0(3, srx.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/settings/impl/databinding/ItemAccordionToggleItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.item_accordion_toggle_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.cliIcon;
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewInflate, R.id.cliIcon);
        if (dsCellLeftIcon != null) {
            i = R.id.cmtTitle;
            DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewInflate, R.id.cmtTitle);
            if (dsCellMiddleTitle != null) {
                i = R.id.crsToggle;
                DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewInflate, R.id.crsToggle);
                if (dsCellRightSwitch != null) {
                    DsSettingsCell dsSettingsCell = (DsSettingsCell) viewInflate;
                    return new srx(dsSettingsCell, dsCellLeftIcon, dsCellMiddleTitle, dsCellRightSwitch, dsSettingsCell);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
