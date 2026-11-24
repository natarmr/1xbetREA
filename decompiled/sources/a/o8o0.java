package a;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class o8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f24841a;
    public final ShapeableImageView b;

    public o8o0(FrameLayout frameLayout, ShapeableImageView shapeableImageView) {
        this.f24841a = frameLayout;
        this.b = shapeableImageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24841a;
    }
}
