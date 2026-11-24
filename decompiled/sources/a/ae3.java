package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class ae3 extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be3 f707a;

    public ae3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        ybq0.a(this, getContext());
        be3 be3Var = new be3(this);
        this.f707a = be3Var;
        be3Var.p(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        be3 be3Var = this.f707a;
        ae3 ae3Var = be3Var.e;
        Drawable drawable = be3Var.f;
        if (drawable != null && drawable.isStateful() && drawable.setState(ae3Var.getDrawableState())) {
            ae3Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f707a.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f707a.x(canvas);
    }
}
