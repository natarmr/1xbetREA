package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class zd3 extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f44193a;

    public zd3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        ybq0.a(this, getContext());
        xr xrVar = new xr(this);
        this.f44193a = xrVar;
        xrVar.p(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f44193a.b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
