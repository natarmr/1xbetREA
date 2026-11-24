package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd6 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sd6 f32017a = new sd6(1, xo8.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/coupon/impl/databinding/BottomSheetDialogBetAmountBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_dialog_bet_amount, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        DsPresetTextFieldBasic dsPresetTextFieldBasic = (DsPresetTextFieldBasic) yum0.f(viewInflate, R.id.tfAmount);
        if (dsPresetTextFieldBasic != null) {
            return new xo8(constraintLayout, dsPresetTextFieldBasic);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tfAmount)));
        return null;
    }
}
