package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class dd3 extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ed3 f5876a;
    public final fp b;
    public final pe3 c;
    public vd3 d;

    public dd3(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        ybq0.a(this, getContext());
        pe3 pe3Var = new pe3(this);
        this.c = pe3Var;
        pe3Var.h(attributeSet, R.attr.checkedTextViewStyle);
        pe3Var.b();
        fp fpVar = new fp(this);
        this.b = fpVar;
        fpVar.A(attributeSet, R.attr.checkedTextViewStyle);
        this.f5876a = new ed3(this);
        Context context2 = getContext();
        int[] iArr = mqd0.l;
        ywu ywuVarY = ywu.y(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        rgu0.n(this, getContext(), iArr, attributeSet, (TypedArray) ywuVarY.c, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(epv0.U(resourceId2, getContext()));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(epv0.U(resourceId, getContext()));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(epv0.U(resourceId, getContext()));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(ywuVarY.m(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(qhl.c(typedArray.getInt(3, -1), null));
            }
            ywuVarY.A();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            ywuVarY.A();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        pe3 pe3Var = this.c;
        if (pe3Var != null) {
            pe3Var.b();
        }
        fp fpVar = this.b;
        if (fpVar != null) {
            fpVar.c();
        }
        ed3 ed3Var = this.f5876a;
        if (ed3Var != null) {
            ed3Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return aem0.z(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        ed3 ed3Var = this.f5876a;
        if (ed3Var != null) {
            return ed3Var.f7598a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        ed3 ed3Var = this.f5876a;
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        phu0.T(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        ed3 ed3Var = this.f5876a;
        if (ed3Var != null) {
            if (ed3Var.e) {
                ed3Var.e = false;
            } else {
                ed3Var.e = true;
                ed3Var.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aem0.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        ed3 ed3Var = this.f5876a;
        if (ed3Var != null) {
            ed3Var.f7598a = colorStateList;
            ed3Var.c = true;
            ed3Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        ed3 ed3Var = this.f5876a;
        if (ed3Var != null) {
            ed3Var.b = mode;
            ed3Var.d = true;
            ed3Var.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pe3 pe3Var = this.c;
        if (pe3Var != null) {
            pe3Var.i(i, context);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(epv0.U(i, getContext()));
    }
}
