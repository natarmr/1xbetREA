package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class e8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f7384a;
    public final FrameLayout b;
    public final ShapeableImageView c;
    public final FrameLayout d;
    public final SyntheticTimerView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final View i;

    public e8o0(ConstraintLayout constraintLayout, FrameLayout frameLayout, ShapeableImageView shapeableImageView, FrameLayout frameLayout2, SyntheticTimerView syntheticTimerView, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f7384a = constraintLayout;
        this.b = frameLayout;
        this.c = shapeableImageView;
        this.d = frameLayout2;
        this.e = syntheticTimerView;
        this.f = textView;
        this.g = textView2;
        this.h = textView3;
        this.i = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7384a;
    }
}
