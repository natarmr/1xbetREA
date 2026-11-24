package a;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

/* JADX INFO: loaded from: classes3.dex */
public final class iyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecoratedBarcodeView f15600a;
    public final DecoratedBarcodeView b;
    public final FrameLayout c;
    public final MaterialToolbar d;

    public iyq(DecoratedBarcodeView decoratedBarcodeView, DecoratedBarcodeView decoratedBarcodeView2, FrameLayout frameLayout, MaterialToolbar materialToolbar) {
        this.f15600a = decoratedBarcodeView;
        this.b = decoratedBarcodeView2;
        this.c = frameLayout;
        this.d = materialToolbar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15600a;
    }
}
