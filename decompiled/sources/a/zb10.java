package a;

import android.view.View;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class zb10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieView f44093a;
    public final LottieView b;

    public zb10(LottieView lottieView, LottieView lottieView2) {
        this.f44093a = lottieView;
        this.b = lottieView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44093a;
    }
}
