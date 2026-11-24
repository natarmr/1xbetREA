package androidx.appcompat.widget;

import a.fp;
import a.goq0;
import a.ybq0;
import a.zz2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp f45292a;
    public final zz2 b;
    public boolean c;

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        ybq0.a(this, getContext());
        fp fpVar = new fp(this);
        this.f45292a = fpVar;
        fpVar.A(attributeSet, i);
        zz2 zz2Var = new zz2(this);
        this.b = zz2Var;
        zz2Var.z(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fp fpVar = this.f45292a;
        if (fpVar != null) {
            fpVar.c();
        }
        zz2 zz2Var = this.b;
        if (zz2Var != null) {
            zz2Var.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fp fpVar = this.f45292a;
        if (fpVar != null) {
            return fpVar.x();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fp fpVar = this.f45292a;
        if (fpVar != null) {
            return fpVar.y();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        goq0 goq0Var;
        zz2 zz2Var = this.b;
        if (zz2Var == null || (goq0Var = (goq0) zz2Var.c) == null) {
            return null;
        }
        return goq0Var.f11644a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        goq0 goq0Var;
        zz2 zz2Var = this.b;
        if (zz2Var == null || (goq0Var = (goq0) zz2Var.c) == null) {
            return null;
        }
        return goq0Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fp fpVar = this.f45292a;
        if (fpVar != null) {
            fpVar.C();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fp fpVar = this.f45292a;
        if (fpVar != null) {
            fpVar.D(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        zz2 zz2Var = this.b;
        if (zz2Var != null) {
            zz2Var.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        zz2 zz2Var = this.b;
        if (zz2Var != null && drawable != null && !this.c) {
            zz2Var.f45232a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (zz2Var != null) {
            zz2Var.c();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) zz2Var.b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(zz2Var.f45232a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        zz2 zz2Var = this.b;
        if (zz2Var != null) {
            zz2Var.G(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        zz2 zz2Var = this.b;
        if (zz2Var != null) {
            zz2Var.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fp fpVar = this.f45292a;
        if (fpVar != null) {
            fpVar.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fp fpVar = this.f45292a;
        if (fpVar != null) {
            fpVar.Q(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        zz2 zz2Var = this.b;
        if (zz2Var != null) {
            goq0 goq0Var = (goq0) zz2Var.c;
            if (goq0Var == null) {
                goq0Var = new goq0();
                zz2Var.c = goq0Var;
            }
            goq0Var.f11644a = colorStateList;
            goq0Var.d = true;
            zz2Var.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        zz2 zz2Var = this.b;
        if (zz2Var != null) {
            goq0 goq0Var = (goq0) zz2Var.c;
            if (goq0Var == null) {
                goq0Var = new goq0();
                zz2Var.c = goq0Var;
            }
            goq0Var.b = mode;
            goq0Var.c = true;
            zz2Var.c();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
