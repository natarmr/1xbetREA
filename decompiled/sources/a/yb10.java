package a;

import android.view.View;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class yb10 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42321a;
    public final /* synthetic */ LottieView b;

    public /* synthetic */ yb10(LottieView lottieView, byte b) {
        this.f42321a = b;
        this.b = lottieView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.f42321a;
        LottieView lottieView = this.b;
        view.getClass();
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                int i9 = LottieView.o1;
                lottieView.E();
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                int i10 = LottieView.o1;
                lottieView.C(true);
                int maxLottieHeight = lottieView.getMaxLottieHeight();
                int i11 = lottieView.v;
                if (maxLottieHeight < i11) {
                    maxLottieHeight = i11;
                }
                lottieView.D(maxLottieHeight, false);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                int i12 = LottieView.o1;
                lottieView.E();
                break;
        }
    }
}
