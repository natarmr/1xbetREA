package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes3.dex */
public final class kty implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f18887a;
    public final DsBottomBar b;
    public final ShapeableImageView c;

    public kty(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, ShapeableImageView shapeableImageView) {
        this.f18887a = constraintLayout;
        this.b = dsBottomBar;
        this.c = shapeableImageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18887a;
    }
}
