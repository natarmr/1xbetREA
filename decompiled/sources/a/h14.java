package a;

import android.view.View;
import android.view.ViewTreeObserver;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h14 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12263a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h14(Object obj, byte b) {
        this.f12263a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.f12263a;
        Object obj = this.b;
        switch (b) {
            case 0:
                k14 k14Var = (k14) obj;
                View view = (View) k14Var.i.get();
                if (view != null) {
                    gq80.l0(k14Var.f17500a, view, (View) k14Var.h.get(), k14Var.b, k14Var.c, k14Var.d);
                }
                break;
            default:
                DsShimmerView dsShimmerView = (DsShimmerView) obj;
                boolean globalVisibleRect = dsShimmerView.getGlobalVisibleRect(dsShimmerView.c);
                if (globalVisibleRect != dsShimmerView.b) {
                    dsShimmerView.b = globalVisibleRect;
                    if (!globalVisibleRect) {
                        dsShimmerView.f47261a.c.cancel();
                    } else {
                        dsShimmerView.a();
                    }
                }
                break;
        }
        return true;
    }
}
