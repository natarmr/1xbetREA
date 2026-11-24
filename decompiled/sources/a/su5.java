package a;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class su5 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final su5 f32805a = new su5(1, iyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/barcode_scanner/impl/databinding/FragmentBarcodeScannerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        DecoratedBarcodeView decoratedBarcodeView = (DecoratedBarcodeView) view;
        int i = R.id.barcodeScannerMask;
        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.barcodeScannerMask);
        if (frameLayout != null) {
            i = R.id.barcodeScannerToolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.barcodeScannerToolbar);
            if (materialToolbar != null) {
                return new iyq(decoratedBarcodeView, decoratedBarcodeView, frameLayout, materialToolbar);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
