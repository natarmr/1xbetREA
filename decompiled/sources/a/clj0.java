package a;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class clj0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f4563a = new Rect();
    public final /* synthetic */ ShapeableImageView b;

    public clj0(ShapeableImageView shapeableImageView) {
        this.b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.b;
        if (shapeableImageView.l == null) {
            return;
        }
        if (shapeableImageView.k == null) {
            shapeableImageView.k = new ki30(shapeableImageView.l);
        }
        RectF rectF = shapeableImageView.e;
        Rect rect = this.f4563a;
        rectF.round(rect);
        shapeableImageView.k.setBounds(rect);
        shapeableImageView.k.getOutline(outline);
    }
}
