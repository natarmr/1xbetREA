package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pid0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pid0 f27038a = new pid0(1, n3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/authqr/impl/databinding/FragmentQrScannerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.navigationBar;
        DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBarBasic != null) {
            DecoratedBarcodeView decoratedBarcodeView = (DecoratedBarcodeView) view;
            if (((AppCompatImageView) yum0.f(view, R.id.qrScannerMask)) != null) {
                return new n3r(decoratedBarcodeView, dsNavigationBarBasic, decoratedBarcodeView);
            }
            i = R.id.qrScannerMask;
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
