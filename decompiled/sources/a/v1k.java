package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class v1k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f36635a;
    public final ShapeableImageView b;
    public final ImageView c;

    public v1k(ImageView imageView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView) {
        this.f36635a = constraintLayout;
        this.b = shapeableImageView;
        this.c = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36635a;
    }
}
