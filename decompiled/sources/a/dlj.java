package a;

import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dlj implements iu5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iu5 f6284a;
    public final /* synthetic */ DecoratedBarcodeView b;

    public dlj(DecoratedBarcodeView decoratedBarcodeView, iu5 iu5Var) {
        this.b = decoratedBarcodeView;
        this.f6284a = iu5Var;
    }

    @Override // a.iu5
    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d3g0 d3g0Var = (d3g0) it.next();
            ViewfinderView viewfinderView = this.b.b;
            if (viewfinderView.g.size() < 20) {
                viewfinderView.g.add(d3g0Var);
            }
        }
        this.f6284a.a(list);
    }

    @Override // a.iu5
    public final void b(lu5 lu5Var) {
        this.f6284a.b(lu5Var);
    }
}
