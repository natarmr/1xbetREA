package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m0j0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0j0 f20957a = new m0j0(3, bux.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/settings/impl/databinding/ItemDeleteAccountAccordionBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.item_delete_account_accordion, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        DsSettingsCell dsSettingsCell = (DsSettingsCell) viewInflate;
        if (((DsCellMiddleTitle) yum0.f(viewInflate, R.id.mcLogOut)) != null) {
            return new bux(dsSettingsCell);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.mcLogOut)));
        return null;
    }
}
