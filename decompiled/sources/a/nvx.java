package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class nvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24209a;
    public final RoundCornerImageView b;
    public final RoundCornerImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public nvx(ConstraintLayout constraintLayout, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f24209a = constraintLayout;
        this.b = roundCornerImageView;
        this.c = roundCornerImageView2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24209a;
    }
}
