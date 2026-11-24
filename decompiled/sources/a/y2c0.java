package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class y2c0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41897a;
    public final int b;
    public final l2c0 c;

    public y2c0(Context context) {
        super(context, null, 0);
        this.f41897a = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_56);
        l2c0 l2c0Var = new l2c0(context);
        this.c = l2c0Var;
        addView(l2c0Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + this.f41897a;
        l2c0 l2c0Var = this.c;
        int measuredWidth = l2c0Var.getMeasuredWidth() + paddingLeft;
        int paddingTop = getPaddingTop();
        int measuredHeight = l2c0Var.getMeasuredHeight();
        int i5 = this.b;
        jmu0.f(paddingLeft, ((i5 - measuredHeight) / 2) + paddingTop, measuredWidth, ((l2c0Var.getMeasuredHeight() + i5) / 2) + getPaddingTop(), this.c, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        l2c0 l2c0Var = this.c;
        l2c0Var.measure(0, 0);
        setMeasuredDimension(l2c0Var.getMeasuredWidth() + this.f41897a, View.resolveSize(this.b, i2));
    }

    public final void setProfileIcon(Drawable drawable) {
        this.c.setImageDrawable(drawable);
    }
}
