package a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public final class we3 extends ToggleButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp f38999a;
    public final pe3 b;
    public vd3 c;

    public we3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        ybq0.a(this, getContext());
        fp fpVar = new fp(this);
        this.f38999a = fpVar;
        fpVar.A(attributeSet, R.attr.buttonStyleToggle);
        pe3 pe3Var = new pe3(this);
        this.b = pe3Var;
        pe3Var.h(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private vd3 getEmojiTextViewHelper() {
        vd3 vd3Var = this.c;
        if (vd3Var != null) {
            return vd3Var;
        }
        vd3 vd3Var2 = new vd3(this);
        this.c = vd3Var2;
        return vd3Var2;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fp fpVar = this.f38999a;
        if (fpVar != null) {
            fpVar.c();
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fp fpVar = this.f38999a;
        if (fpVar != null) {
            return fpVar.x();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fp fpVar = this.f38999a;
        if (fpVar != null) {
            return fpVar.y();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fp fpVar = this.f38999a;
        if (fpVar != null) {
            fpVar.C();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fp fpVar = this.f38999a;
        if (fpVar != null) {
            fpVar.D(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pe3 pe3Var = this.b;
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
        fp fpVar = this.f38999a;
        if (fpVar != null) {
            fpVar.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fp fpVar = this.f38999a;
        if (fpVar != null) {
            fpVar.Q(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pe3 pe3Var = this.b;
        pe3Var.m(colorStateList);
        pe3Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pe3 pe3Var = this.b;
        pe3Var.n(mode);
        pe3Var.b();
    }
}
