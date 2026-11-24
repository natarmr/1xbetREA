package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ljd0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ljd0 f20145a = new ljd0(1, p3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/authqr/impl/databinding/FragmentQrSendConfirmationSmsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.cellCallCode;
        DsSettingsCell dsSettingsCell = (DsSettingsCell) yum0.f(view, R.id.cellCallCode);
        if (dsSettingsCell != null) {
            i = R.id.cellCodeSms;
            DsSettingsCell dsSettingsCell2 = (DsSettingsCell) yum0.f(view, R.id.cellCodeSms);
            if (dsSettingsCell2 != null) {
                i = R.id.cellTelegram;
                DsSettingsCell dsSettingsCell3 = (DsSettingsCell) yum0.f(view, R.id.cellTelegram);
                if (dsSettingsCell3 != null) {
                    i = R.id.cellVoiceSms;
                    DsSettingsCell dsSettingsCell4 = (DsSettingsCell) yum0.f(view, R.id.cellVoiceSms);
                    if (dsSettingsCell4 != null) {
                        i = R.id.header;
                        if (((DsHeader) yum0.f(view, R.id.header)) != null) {
                            i = R.id.navigationBar;
                            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                            if (dsNavigationBarBasic != null) {
                                i = R.id.textViewDescription;
                                MaterialTextView materialTextView = (MaterialTextView) yum0.f(view, R.id.textViewDescription);
                                if (materialTextView != null) {
                                    return new p3r((ConstraintLayout) view, dsSettingsCell, dsSettingsCell2, dsSettingsCell3, dsSettingsCell4, dsNavigationBarBasic, materialTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
