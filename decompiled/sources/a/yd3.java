package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: loaded from: classes.dex */
public class yd3 extends RadioButton implements hoq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ed3 f42414a;
    public final fp b;
    public final pe3 c;
    public vd3 d;

    public yd3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ybq0.a(this, getContext());
        ed3 ed3Var = new ed3(this);
        this.f42414a = ed3Var;
        ed3Var.c(attributeSet, i);
        fp fpVar = new fp(this);
        this.b = fpVar;
        fpVar.A(attributeSet, i);
        pe3 pe3Var = new pe3(this);
        this.c = pe3Var;
        pe3Var.h(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private vd3 getEmojiTextViewHelper() {
        vd3 vd3Var = this.d;
        if (vd3Var != null) {
            return vd3Var;
        }
        vd3 vd3Var2 = new vd3(this);
        this.d = vd3Var2;
        return vd3Var2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fp fpVar = this.b;
        if (fpVar != null) {
            fpVar.c();
        }
        pe3 pe3Var = this.c;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fp fpVar = this.b;
        if (fpVar != null) {
            return fpVar.x();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fp fpVar = this.b;
        if (fpVar != null) {
            return fpVar.y();
        }
        return null;
    }

    @Override // a.hoq0
    public ColorStateList getSupportButtonTintList() {
        ed3 ed3Var = this.f42414a;
        if (ed3Var != null) {
            return ed3Var.f7598a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        ed3 ed3Var = this.f42414a;
        if (ed3Var != null) {
            return ed3Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fp fpVar = this.b;
        if (fpVar != null) {
            fpVar.C();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fp fpVar = this.b;
        if (fpVar != null) {
            fpVar.D(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ed3 ed3Var = this.f42414a;
        if (ed3Var != null) {
            if (ed3Var.e) {
                ed3Var.e = false;
            } else {
                ed3Var.e = true;
                ed3Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pe3 pe3Var = this.c;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pe3 pe3Var = this.c;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fp fpVar = this.b;
        if (fpVar != null) {
            fpVar.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fp fpVar = this.b;
        if (fpVar != null) {
            fpVar.Q(mode);
        }
    }

    @Override // a.hoq0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        ed3 ed3Var = this.f42414a;
        if (ed3Var != null) {
            ed3Var.f7598a = colorStateList;
            ed3Var.c = true;
            ed3Var.a();
        }
    }

    @Override // a.hoq0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        ed3 ed3Var = this.f42414a;
        if (ed3Var != null) {
            ed3Var.b = mode;
            ed3Var.d = true;
            ed3Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pe3 pe3Var = this.c;
        pe3Var.m(colorStateList);
        pe3Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pe3 pe3Var = this.c;
        pe3Var.n(mode);
        pe3Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(epv0.U(i, getContext()));
    }
}
