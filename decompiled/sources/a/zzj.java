package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes.dex */
public final class zzj implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f45256a;
    public final ImageView b;
    public final ShapeableImageView c;

    public zzj(ImageView imageView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView) {
        this.f45256a = constraintLayout;
        this.b = imageView;
        this.c = shapeableImageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f45256a;
    }
}
