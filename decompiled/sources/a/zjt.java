package a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class zjt implements cns0, qvj, uto0 {
    private boolean isStarted;

    @Override // a.cns0
    public abstract Drawable getDrawable();

    @Override // a.cns0
    public abstract View getView();

    @Override // a.uto0
    public void onError(dyw dywVar) {
        updateImage(dywVar);
    }

    @Override // a.qvj
    public void onStart(clz clzVar) {
        this.isStarted = true;
        updateAnimation();
    }

    @Override // a.qvj
    public void onStop(clz clzVar) {
        this.isStarted = false;
        updateAnimation();
    }

    @Override // a.uto0
    public void onSuccess(dyw dywVar) {
        updateImage(dywVar);
    }

    public abstract void setDrawable(Drawable drawable);

    public final void updateAnimation() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void updateImage(dyw dywVar) {
        Drawable drawableQ = dywVar != null ? c3x.q(dywVar, getView().getResources()) : null;
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(drawableQ);
        updateAnimation();
    }

    @Override // a.uto0
    public void onStart(dyw dywVar) {
        updateImage(dywVar);
    }
}
