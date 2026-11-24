package a;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class m7b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21312a;
    public final ShapeableImageView b;
    public final Button c;
    public final Button d;

    public m7b0(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, Button button, Button button2) {
        this.f21312a = constraintLayout;
        this.b = shapeableImageView;
        this.c = button;
        this.d = button2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21312a;
    }
}
