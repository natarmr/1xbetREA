package a;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ohv0 extends dku0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25284a;
    public final /* synthetic */ qhv0 b;

    public /* synthetic */ ohv0(qhv0 qhv0Var, byte b) {
        this.f25284a = b;
        this.b = qhv0Var;
    }

    @Override // a.cku0
    public final void onAnimationEnd() {
        View view;
        byte b = this.f25284a;
        qhv0 qhv0Var = this.b;
        switch (b) {
            case 0:
                if (qhv0Var.o && (view = qhv0Var.g) != null) {
                    view.setTranslationY(0.0f);
                    qhv0Var.d.setTranslationY(0.0f);
                }
                qhv0Var.d.setVisibility(8);
                qhv0Var.d.setTransitioning(false);
                qhv0Var.s = null;
                xex xexVar = qhv0Var.k;
                if (xexVar != null) {
                    xexVar.K(qhv0Var.j);
                    qhv0Var.j = null;
                    qhv0Var.k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = qhv0Var.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                qhv0Var.s = null;
                qhv0Var.d.requestLayout();
                break;
        }
    }
}
