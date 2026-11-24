package a;

import android.view.View;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class n3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecoratedBarcodeView f22863a;
    public final DsNavigationBarBasic b;
    public final DecoratedBarcodeView c;

    public n3r(DecoratedBarcodeView decoratedBarcodeView, DsNavigationBarBasic dsNavigationBarBasic, DecoratedBarcodeView decoratedBarcodeView2) {
        this.f22863a = decoratedBarcodeView;
        this.b = dsNavigationBarBasic;
        this.c = decoratedBarcodeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22863a;
    }
}
