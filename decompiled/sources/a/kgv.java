package a;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class kgv implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f18258a;
    public final ShapeableImageView b;
    public final Button c;
    public final Button d;

    public kgv(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, Button button, Button button2) {
        this.f18258a = constraintLayout;
        this.b = shapeableImageView;
        this.c = button;
        this.d = button2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18258a;
    }
}
