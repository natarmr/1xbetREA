package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class cgn0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4321a;
    public final DsButton b;
    public final DsButton c;
    public final AppCompatImageView d;
    public final FrameLayout e;
    public final LottieAnimationView f;
    public final FrameLayout g;
    public final DsPresetTitle h;
    public final TextView i;

    public cgn0(ConstraintLayout constraintLayout, DsButton dsButton, DsButton dsButton2, AppCompatImageView appCompatImageView, FrameLayout frameLayout, LottieAnimationView lottieAnimationView, FrameLayout frameLayout2, DsPresetTitle dsPresetTitle, TextView textView) {
        this.f4321a = constraintLayout;
        this.b = dsButton;
        this.c = dsButton2;
        this.d = appCompatImageView;
        this.e = frameLayout;
        this.f = lottieAnimationView;
        this.g = frameLayout2;
        this.h = dsPresetTitle;
        this.i = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4321a;
    }
}
