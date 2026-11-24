package a;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class w3b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38494a;
    public final ImageView b;
    public final ShapeableImageView c;
    public final Button d;
    public final Button e;

    public w3b0(ConstraintLayout constraintLayout, ImageView imageView, ShapeableImageView shapeableImageView, Button button, Button button2) {
        this.f38494a = constraintLayout;
        this.b = imageView;
        this.c = shapeableImageView;
        this.d = button;
        this.e = button2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38494a;
    }
}
