package a;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d33 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5382a;
    public final /* synthetic */ bhu0 b;
    public final /* synthetic */ e7z c;

    public /* synthetic */ d33(bhu0 bhu0Var, e7z e7zVar, byte b) {
        this.f5382a = b;
        this.b = bhu0Var;
        this.c = e7zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsG;
        byte b = this.f5382a;
        e7z e7zVar = this.c;
        bhu0 bhu0Var = this.b;
        switch (b) {
            case 0:
                aad.U(bhu0Var, e7zVar);
                ((AndroidComposeView) bhu0Var.c).g1 = true;
                int[] iArr = bhu0Var.n;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = bhu0Var.b;
                view.getLocationOnScreen(iArr);
                long j = bhu0Var.o;
                long jG = ((j6z) obj).g();
                bhu0Var.o = jG;
                xiv0 xiv0Var = bhu0Var.p;
                if (xiv0Var != null && ((i != iArr[0] || i2 != iArr[1] || !qkx.a(j, jG)) && (windowInsetsG = bhu0Var.k(xiv0Var).g()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsG);
                }
                break;
            case 1:
                View view2 = bhu0Var.b;
                cg80 cg80Var = (cg80) obj;
                AndroidComposeView androidComposeView = cg80Var instanceof AndroidComposeView ? (AndroidComposeView) cg80Var : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(bhu0Var, e7zVar);
                    androidComposeView.getAndroidViewsHandler$ui().addView(bhu0Var);
                    androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(e7zVar, bhu0Var);
                    bhu0Var.setImportantForAccessibility(1);
                    rgu0.o(bhu0Var, new jx2(androidComposeView, e7zVar, androidComposeView));
                }
                if (view2.getParent() != bhu0Var) {
                    bhu0Var.addView(view2);
                }
                break;
            default:
                aad.U(bhu0Var, e7zVar);
                break;
        }
        return Unit.f46060a;
    }
}
