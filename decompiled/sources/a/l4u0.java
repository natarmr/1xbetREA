package a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class l4u0 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19427a;
    public k4u0 b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f19427a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new n4u0(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new n4u0(this);
    }
}
