package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ztn0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ztn0 f44969a = new ztn0(1, cun0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/swipex/impl/databinding/SwipexChangeBetValueDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.swipex_change_bet_value_dialog, (ViewGroup) null, false);
        int i = R.id.apply;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.apply);
        if (dsButton != null) {
            i = R.id.balanceView;
            DsAccountSelection dsAccountSelection = (DsAccountSelection) yum0.f(viewInflate, R.id.balanceView);
            if (dsAccountSelection != null) {
                i = R.id.fixedBetButton1;
                DsButton dsButton2 = (DsButton) yum0.f(viewInflate, R.id.fixedBetButton1);
                if (dsButton2 != null) {
                    i = R.id.fixedBetButton2;
                    DsButton dsButton3 = (DsButton) yum0.f(viewInflate, R.id.fixedBetButton2);
                    if (dsButton3 != null) {
                        i = R.id.fixedBetButton3;
                        DsButton dsButton4 = (DsButton) yum0.f(viewInflate, R.id.fixedBetButton3);
                        if (dsButton4 != null) {
                            i = R.id.fixedBetButton4;
                            DsButton dsButton5 = (DsButton) yum0.f(viewInflate, R.id.fixedBetButton4);
                            if (dsButton5 != null) {
                                i = R.id.fixedBetLabel;
                                if (((TextView) yum0.f(viewInflate, R.id.fixedBetLabel)) != null) {
                                    i = R.id.parent;
                                    if (((ConstraintLayout) yum0.f(viewInflate, R.id.parent)) != null) {
                                        i = R.id.sumStepperField;
                                        DsTextField dsTextField = (DsTextField) yum0.f(viewInflate, R.id.sumStepperField);
                                        if (dsTextField != null) {
                                            return new cun0((NestedScrollView) viewInflate, dsButton, dsAccountSelection, dsButton2, dsButton3, dsButton4, dsButton5, dsTextField);
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
