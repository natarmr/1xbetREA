package androidx.appcompat.widget;

import a.ad3;
import a.aem0;
import a.cmu0;
import a.fp;
import a.oe3;
import a.pe3;
import a.v05;
import a.vd3;
import a.ve3;
import a.ybq0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements v05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp f45289a;
    public final pe3 b;
    public vd3 c;
    public oe3 d;

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ybq0.a(this, getContext());
        fp fpVar = new fp(this);
        this.f45289a = fpVar;
        fpVar.A(attributeSet, i);
        pe3 pe3Var = new pe3(this);
        this.b = pe3Var;
        pe3Var.h(attributeSet, i);
        pe3Var.b();
        getEmojiTextViewHelper().b(attributeSet, i);
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

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fp fpVar = this.f45289a;
        if (fpVar != null) {
            fpVar.c();
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (cmu0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            return Math.round(pe3Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (cmu0.c) {
            return super.getAutoSizeMinTextSize();
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            return Math.round(pe3Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (cmu0.c) {
            return super.getAutoSizeStepGranularity();
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            return Math.round(pe3Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (cmu0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        pe3 pe3Var = this.b;
        return pe3Var != null ? pe3Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (cmu0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            return pe3Var.i.f37262a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return aem0.z(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public oe3 getFontVariationSettingsManager() {
        oe3 oe3Var = this.d;
        if (oe3Var != null) {
            return oe3Var;
        }
        oe3 oe3Var2 = new oe3(this, new ad3(this, (byte) 0));
        this.d = oe3Var2;
        return oe3Var2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        fp fpVar = this.f45289a;
        if (fpVar != null) {
            return fpVar.x();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fp fpVar = this.f45289a;
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
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pe3 pe3Var = this.b;
        if (pe3Var == null || cmu0.c) {
            return;
        }
        pe3Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            ve3 ve3Var = pe3Var.i;
            if (cmu0.c || !ve3Var.f()) {
                return;
            }
            ve3Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, a.v05
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (cmu0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.j(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (cmu0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.k(iArr, i);
        }
    }

    @Override // android.widget.TextView, a.v05
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (cmu0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.l(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fp fpVar = this.f45289a;
        if (fpVar != null) {
            fpVar.C();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fp fpVar = this.f45289a;
        if (fpVar != null) {
            fpVar.D(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aem0.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    public void setSupportAllCaps(boolean z) {
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.f26830a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fp fpVar = this.f45289a;
        if (fpVar != null) {
            fpVar.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fp fpVar = this.f45289a;
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.i(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = cmu0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            ve3 ve3Var = pe3Var.i;
            if (z || ve3Var.f()) {
                return;
            }
            ve3Var.g(f, i);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        oe3 fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }
}
