package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wmd0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wmd0 f39402a = new wmd0(1, r3r.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/quickbet/impl/databinding/FragmentQuickBetDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_quick_bet_dialog, (ViewGroup) null, false);
        int i = R.id.applyButton;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.applyButton);
        if (dsButton != null) {
            i = R.id.editSum;
            DsPresetTextFieldBasic dsPresetTextFieldBasic = (DsPresetTextFieldBasic) yum0.f(viewInflate, R.id.editSum);
            if (dsPresetTextFieldBasic != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i = R.id.toggle;
                DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewInflate, R.id.toggle);
                if (dsCellRightSwitch != null) {
                    i = R.id.toggleCell;
                    if (((DsSettingsCell) yum0.f(viewInflate, R.id.toggleCell)) != null) {
                        i = R.id.toggleCellTitle;
                        if (((DsCellMiddleTitle) yum0.f(viewInflate, R.id.toggleCellTitle)) != null) {
                            i = R.id.tvDescription;
                            if (((TextView) yum0.f(viewInflate, R.id.tvDescription)) != null) {
                                return new r3r(linearLayout, dsButton, dsPresetTextFieldBasic, linearLayout, dsCellRightSwitch);
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
