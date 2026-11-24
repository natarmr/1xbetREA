package a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class gpb extends gms0 {
    public static final String[] j1 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final dpb k1 = new dpb();
    public static final uob l1 = new uob(Matrix.class, "animatedTransform", (byte) 5);

    public static void U(mns0 mns0Var, boolean z) {
        Matrix matrix;
        View view = mns0Var.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = mns0Var.f22105a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z ? (Matrix) imageView.getTag(R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = epb.f8177a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f2 = intrinsicHeight;
                        float fMax = Math.max(width / f, height / f2);
                        int iRound = Math.round((width - (f * fMax)) / 2.0f);
                        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        matrix.postTranslate(iRound, iRound2);
                    }
                    matrix2 = matrix;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // a.gms0
    public final void f(mns0 mns0Var) {
        U(mns0Var, false);
    }

    @Override // a.gms0
    public final void i(mns0 mns0Var) {
        U(mns0Var, true);
    }

    @Override // a.gms0
    public final Animator o(ViewGroup viewGroup, mns0 mns0Var, mns0 mns0Var2) {
        if (mns0Var == null) {
            return null;
        }
        HashMap map = mns0Var.f22105a;
        if (mns0Var2 == null) {
            return null;
        }
        HashMap map2 = mns0Var2.f22105a;
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) mns0Var2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        uob uobVar = l1;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            wi30 wi30Var = xi30.f40924a;
            return ObjectAnimator.ofObject(imageView, uobVar, k1, wi30Var, wi30Var);
        }
        if (matrix == null) {
            matrix = xi30.f40924a;
        }
        if (matrix2 == null) {
            matrix2 = xi30.f40924a;
        }
        uobVar.getClass();
        x2x.z(imageView, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, uobVar, new kns0(), matrix, matrix2);
        fpb fpbVar = new fpb(imageView, matrix, matrix2);
        objectAnimatorOfObject.addListener(fpbVar);
        objectAnimatorOfObject.addPauseListener(fpbVar);
        a(fpbVar);
        return objectAnimatorOfObject;
    }

    @Override // a.gms0
    public final String[] z() {
        return j1;
    }
}
