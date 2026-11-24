package a;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vb3 implements ub3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37121a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vb3(Object obj, byte b) {
        this.f37121a = b;
        this.b = obj;
    }

    @Override // a.ub3
    public final void a(AppBarLayout appBarLayout, int i) {
        byte b = this.f37121a;
        Object obj = this.b;
        switch (b) {
            case 0:
                View[] viewArr = (View[]) obj;
                for (View view : viewArr) {
                    view.setAlpha(i != 0 ? ((appBarLayout.getTotalScrollRange() / 8) / i) * (-1.0f) : 1.0f);
                }
                if (Math.abs(i) >= appBarLayout.getTotalScrollRange() - 20) {
                    for (View view2 : viewArr) {
                        view2.setAlpha(0.0f);
                    }
                }
                break;
            case 1:
                ej5 ej5Var = (ej5) obj;
                bj5 bj5Var = ej5.V1;
                ej5Var.G0().d.setAlpha(1.0f - ((appBarLayout.getY() / ej5Var.G0().b.getTotalScrollRange()) * (-1.0f)));
                break;
            case 2:
                int i2 = LottieView.o1;
                ((LottieView) obj).F();
                break;
            default:
                u2s0 u2s0Var = (u2s0) obj;
                s2m0 s2m0Var = u2s0.X1;
                u2s0Var.G0().d.setAlpha(i != 0 ? (((appBarLayout.getTotalScrollRange() - u2s0Var.G0().i.getHeight()) / 8) / i) * (-1.0f) : 1.0f);
                if (Math.abs(i) >= appBarLayout.getTotalScrollRange() - 20) {
                    u2s0Var.G0().d.setAlpha(0.0f);
                }
                break;
        }
    }
}
