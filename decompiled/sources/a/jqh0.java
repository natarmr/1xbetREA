package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jqh0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jqh0 f16954a = new jqh0(3, rku0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/security/impl/databinding/ViewSecurityGiftSimpleItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.view_security_gift_simple_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.cell_middle;
        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewInflate, R.id.cell_middle);
        if (dsCellMiddleTitle != null) {
            i = R.id.crlLabel;
            DsCellRightLabel dsCellRightLabel = (DsCellRightLabel) yum0.f(viewInflate, R.id.crlLabel);
            if (dsCellRightLabel != null) {
                i = R.id.separator;
                DsSeparator dsSeparator = (DsSeparator) yum0.f(viewInflate, R.id.separator);
                if (dsSeparator != null) {
                    return new rku0((DsSettingsCell) viewInflate, dsCellMiddleTitle, dsCellRightLabel, dsSeparator);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
