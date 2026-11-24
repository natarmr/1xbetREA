package a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class k63 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17748a = 1;
    public final Object b;

    public k63(ym8 ym8Var) {
        this.b = ym8Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f17748a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f17748a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f17748a) {
            case 0:
                l63 l63Var = new l63(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                l63Var.f7201a = drawableNewDrawable;
                drawableNewDrawable.setCallback(l63Var.f);
                return l63Var;
            default:
                return super.newDrawable(resources);
        }
    }

    public k63(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        byte b = this.f17748a;
        Object obj = this.b;
        switch (b) {
            case 0:
                l63 l63Var = new l63(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) obj).newDrawable();
                l63Var.f7201a = drawableNewDrawable;
                drawableNewDrawable.setCallback(l63Var.f);
                return l63Var;
            default:
                return (ym8) obj;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f17748a) {
            case 0:
                l63 l63Var = new l63(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                l63Var.f7201a = drawableNewDrawable;
                drawableNewDrawable.setCallback(l63Var.f);
                return l63Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
