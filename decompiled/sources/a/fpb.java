package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class fpb extends AnimatorListenerAdapter implements dms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f9920a;
    public final Matrix b;
    public final Matrix c;
    public boolean d = true;

    public fpb(ImageView imageView, Matrix matrix, Matrix matrix2) {
        this.f9920a = imageView;
        this.b = matrix;
        this.c = matrix2;
    }

    @Override // a.dms0
    public final void a() {
        if (this.d) {
            ImageView imageView = this.f9920a;
            imageView.setTag(R.id.transition_image_transform, this.b);
            x2x.z(imageView, this.c);
        }
    }

    @Override // a.dms0
    public final void d() {
        ImageView imageView = this.f9920a;
        Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
        if (matrix != null) {
            x2x.z(imageView, matrix);
            imageView.setTag(R.id.transition_image_transform, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
        ImageView imageView = this.f9920a;
        imageView.setTag(R.id.transition_image_transform, matrix);
        x2x.z(imageView, this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        ImageView imageView = this.f9920a;
        Matrix matrix = (Matrix) imageView.getTag(R.id.transition_image_transform);
        if (matrix != null) {
            x2x.z(imageView, matrix);
            imageView.setTag(R.id.transition_image_transform, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        this.d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = false;
    }

    @Override // a.dms0
    public final void b(gms0 gms0Var) {
    }

    @Override // a.dms0
    public final void c(gms0 gms0Var) {
    }

    @Override // a.dms0
    public final void g(gms0 gms0Var) {
    }
}
