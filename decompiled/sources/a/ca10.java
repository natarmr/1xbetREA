package a;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ca10 implements kb10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3987a;
    public final WeakReference b;

    public ca10(LottieAnimationView lottieAnimationView, byte b) {
        this.f3987a = b;
        switch (b) {
            case 1:
                this.b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // a.kb10
    public final void onResult(Object obj) {
        byte b = this.f3987a;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView != null) {
                    int i = lottieAnimationView.g;
                    if (i != 0) {
                        lottieAnimationView.setImageResource(i);
                    }
                    kb10 kb10Var = lottieAnimationView.f;
                    if (kb10Var == null) {
                        kb10Var = LottieAnimationView.q;
                    }
                    kb10Var.onResult(th);
                    break;
                }
                break;
            default:
                fa10 fa10Var = (fa10) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) weakReference.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(fa10Var);
                    break;
                }
                break;
        }
    }
}
