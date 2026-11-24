package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl00 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xl00 f41051a = new xl00(1, zl00.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/coupon/impl/databinding/LoadCouponBottomSheetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.load_coupon_bottom_sheet, (ViewGroup) null, false);
        int i = R.id.btnLoadCoupon;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.btnLoadCoupon);
        if (dsButton != null) {
            i = R.id.textFiledCoupon;
            DsTextField dsTextField = (DsTextField) yum0.f(viewInflate, R.id.textFiledCoupon);
            if (dsTextField != null) {
                return new zl00((LinearLayout) viewInflate, dsButton, dsTextField);
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
