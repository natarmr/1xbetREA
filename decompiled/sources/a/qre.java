package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qre extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qre f29206a = new qre(1, sre.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/coupon/impl/databinding/CouponActionsDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.coupon_actions_dialog, (ViewGroup) null, false);
        int i = R.id.cellGenerate;
        DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(viewInflate, R.id.cellGenerate);
        if (dsSettingsCell != null) {
            i = R.id.cellRemove;
            DsSettingsCell dsSettingsCell2 = (DsSettingsCell) yum0.f(viewInflate, R.id.cellRemove);
            if (dsSettingsCell2 != null) {
                i = R.id.cellSave;
                DsSettingsCell dsSettingsCell3 = (DsSettingsCell) yum0.f(viewInflate, R.id.cellSave);
                if (dsSettingsCell3 != null) {
                    i = R.id.cellShare;
                    DsSettingsCell dsSettingsCell4 = (DsSettingsCell) yum0.f(viewInflate, R.id.cellShare);
                    if (dsSettingsCell4 != null) {
                        i = R.id.cellUpload;
                        DsSettingsCell dsSettingsCell5 = (DsSettingsCell) yum0.f(viewInflate, R.id.cellUpload);
                        if (dsSettingsCell5 != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            i = R.id.separatorGenerate;
                            DsSeparator dsSeparator = (DsSeparator) yum0.f(viewInflate, R.id.separatorGenerate);
                            if (dsSeparator != null) {
                                i = R.id.separatorRemove;
                                DsSeparator dsSeparator2 = (DsSeparator) yum0.f(viewInflate, R.id.separatorRemove);
                                if (dsSeparator2 != null) {
                                    i = R.id.separatorSave;
                                    DsSeparator dsSeparator3 = (DsSeparator) yum0.f(viewInflate, R.id.separatorSave);
                                    if (dsSeparator3 != null) {
                                        i = R.id.separatorUpload;
                                        DsSeparator dsSeparator4 = (DsSeparator) yum0.f(viewInflate, R.id.separatorUpload);
                                        if (dsSeparator4 != null) {
                                            return new sre(linearLayout, dsSettingsCell, dsSettingsCell2, dsSettingsCell3, dsSettingsCell4, dsSettingsCell5, dsSeparator, dsSeparator2, dsSeparator3, dsSeparator4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
