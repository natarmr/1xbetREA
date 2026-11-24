package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class f6o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f9023a;
    public final ImageView b;
    public final ShapeableImageView c;
    public final SyntheticTimerView d;
    public final TextView e;
    public final KillerJokerView f;
    public final View g;

    public f6o0(ConstraintLayout constraintLayout, ImageView imageView, ShapeableImageView shapeableImageView, SyntheticTimerView syntheticTimerView, TextView textView, KillerJokerView killerJokerView, View view) {
        this.f9023a = constraintLayout;
        this.b = imageView;
        this.c = shapeableImageView;
        this.d = syntheticTimerView;
        this.e = textView;
        this.f = killerJokerView;
        this.g = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f9023a;
    }
}
