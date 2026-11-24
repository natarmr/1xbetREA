package androidx.appcompat.widget;

import a.ad3;
import a.aem0;
import a.atm0;
import a.bsb0;
import a.cmu0;
import a.csb0;
import a.ehf0;
import a.epv0;
import a.fp;
import a.ga3;
import a.jf4;
import a.m0t0;
import a.nnw0;
import a.oe3;
import a.ok50;
import a.pe3;
import a.phu0;
import a.qe3;
import a.r6;
import a.re3;
import a.se3;
import a.v05;
import a.vd3;
import a.ve3;
import a.ybq0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements v05 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp f45294a;
    public final pe3 b;
    public final ehf0 c;
    public vd3 d;
    public boolean e;
    public ok50 f;
    public Future g;
    public oe3 h;

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        this.f = null;
        ybq0.a(this, getContext());
        fp fpVar = new fp(this);
        this.f45294a = fpVar;
        fpVar.A(attributeSet, i);
        pe3 pe3Var = new pe3(this);
        this.b = pe3Var;
        pe3Var.h(attributeSet, i);
        pe3Var.b();
        ehf0 ehf0Var = new ehf0((byte) 7, false);
        ehf0Var.b = this;
        this.c = ehf0Var;
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

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fp fpVar = this.f45294a;
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
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public oe3 getFontVariationSettingsManager() {
        oe3 oe3Var = this.h;
        if (oe3Var != null) {
            return oe3Var;
        }
        oe3 oe3Var2 = new oe3(this, new ad3(this, (byte) 2));
        this.h = oe3Var2;
        return oe3Var2;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public qe3 getSuperCaller() {
        ok50 ok50Var = this.f;
        if (ok50Var != null) {
            return ok50Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            se3 se3Var = new se3(this);
            this.f = se3Var;
            return se3Var;
        }
        if (i >= 28) {
            re3 re3Var = new re3(this);
            this.f = re3Var;
            return re3Var;
        }
        if (i < 26) {
            return ok50Var;
        }
        ok50 ok50Var2 = new ok50(this);
        this.f = ok50Var2;
        return ok50Var2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        fp fpVar = this.f45294a;
        if (fpVar != null) {
            return fpVar.x();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fp fpVar = this.f45294a;
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
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                aem0.p(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        ehf0 ehf0Var;
        if (Build.VERSION.SDK_INT >= 28 || (ehf0Var = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) ehf0Var.c;
        return textClassifier == null ? ga3.k((TextView) ehf0Var.b) : textClassifier;
    }

    public bsb0 getTextMetricsParamsCompat() {
        return aem0.p(this);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            nnw0.H(editorInfo, getText());
        }
        phu0.T(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                aem0.p(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
        fp fpVar = this.f45294a;
        if (fpVar != null) {
            fpVar.C();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fp fpVar = this.f45294a;
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? epv0.U(i, context) : null, i2 != 0 ? epv0.U(i2, context) : null, i3 != 0 ? epv0.U(i3, context) : null, i4 != 0 ? epv0.U(i4, context) : null);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? epv0.U(i, context) : null, i2 != 0 ? epv0.U(i2, context) : null, i3 != 0 ? epv0.U(i3, context) : null, i4 != 0 ? epv0.U(i4, context) : null);
        pe3 pe3Var = this.b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            aem0.t(i, this);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            aem0.u(i, this);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().b(i, f);
        } else if (i2 >= 34) {
            r6.q(this, i, f);
        } else {
            aem0.v(Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())), this);
        }
    }

    public void setPrecomputedText(csb0 csb0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        aem0.p(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fp fpVar = this.f45294a;
        if (fpVar != null) {
            fpVar.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fp fpVar = this.f45294a;
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
    public void setTextClassifier(TextClassifier textClassifier) {
        ehf0 ehf0Var;
        if (Build.VERSION.SDK_INT >= 28 || (ehf0Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            ehf0Var.c = textClassifier;
        }
    }

    public void setTextFuture(Future<csb0> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(bsb0 bsb0Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bsb0Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(bsb0Var.f3122a);
        setBreakStrategy(bsb0Var.c);
        setHyphenationFrequency(bsb0Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
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
    public final void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            atm0 atm0Var = m0t0.f20972a;
            if (context == null) {
                jf4.o("Context cannot be null");
                return;
            }
            typeface = Typeface.create(typeface, i);
        }
        this.e = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        aem0.v(i, this);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 26) {
            oe3 fontVariationSettingsManager = getFontVariationSettingsManager();
            fontVariationSettingsManager.c = typeface;
            fontVariationSettingsManager.d = typeface;
            fontVariationSettingsManager.b.accept(typeface);
            return;
        }
        super.setTypeface(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }
}
