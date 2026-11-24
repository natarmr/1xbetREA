package a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public final class wd3 extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp f38953a;
    public final pe3 b;
    public final chf0 c;

    public wd3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, org.xbet.client1.R.attr.autoCompleteTextViewStyle);
        ybq0.a(this, getContext());
        ywu ywuVarY = ywu.y(org.xbet.client1.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, d);
        if (((TypedArray) ywuVarY.c).hasValue(0)) {
            setDropDownBackgroundDrawable(ywuVarY.n(0));
        }
        ywuVarY.A();
        fp fpVar = new fp(this);
        this.f38953a = fpVar;
        fpVar.A(attributeSet, org.xbet.client1.R.attr.autoCompleteTextViewStyle);
        pe3 pe3Var = new pe3(this);
        this.b = pe3Var;
        pe3Var.h(attributeSet, org.xbet.client1.R.attr.autoCompleteTextViewStyle);
        pe3Var.b();
        chf0 chf0Var = new chf0(this);
        this.c = chf0Var;
        chf0Var.S(attributeSet, org.xbet.client1.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerH = chf0Var.H(keyListener);
        if (keyListenerH == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerH);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fp fpVar = this.f38953a;
        if (fpVar != null) {
            fpVar.c();
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        fp fpVar = this.f38953a;
        if (fpVar != null) {
            return fpVar.x();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fp fpVar = this.f38953a;
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        phu0.T(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.c.b0(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fp fpVar = this.f38953a;
        if (fpVar != null) {
            fpVar.C();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fp fpVar = this.f38953a;
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(epv0.U(i, getContext()));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.e0(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.H(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fp fpVar = this.f38953a;
        if (fpVar != null) {
            fpVar.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fp fpVar = this.f38953a;
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.i(i, context);
        }
    }
}
