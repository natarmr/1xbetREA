package a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class m4u0 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f21192a;

    public m4u0(Drawable.ConstantState constantState) {
        this.f21192a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f21192a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f21192a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        n4u0 n4u0Var = new n4u0();
        n4u0Var.f7201a = (VectorDrawable) this.f21192a.newDrawable();
        return n4u0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        n4u0 n4u0Var = new n4u0();
        n4u0Var.f7201a = (VectorDrawable) this.f21192a.newDrawable(resources);
        return n4u0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        n4u0 n4u0Var = new n4u0();
        n4u0Var.f7201a = (VectorDrawable) this.f21192a.newDrawable(resources, theme);
        return n4u0Var;
    }
}
