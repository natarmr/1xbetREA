package org.xplatform.uikit.components.text_field.middle;

import a.b5i;
import a.bmh;
import a.cem0;
import a.e0g0;
import a.e5i;
import a.g0g0;
import a.g5i;
import a.i5i;
import a.j0g0;
import a.jt6;
import a.ktt0;
import a.kud;
import a.m5d;
import a.n4u0;
import a.std;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AppCompatEditText implements e5i {
    public Function0 A;
    public boolean h;
    public final int i;
    public final int j;
    public float k;
    public i5i l;
    public boolean m;
    public boolean n;
    public CharSequence o;
    public CharSequence p;
    public boolean q;
    public boolean r;
    public CharSequence s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int x;
    public Function0 y;
    public Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null, 0);
        context.getClass();
        this.i = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.j = getResources().getDimensionPixelSize(R.dimen.size_8);
        this.k = getResources().getDimension(R.dimen.text_16);
        this.l = i5i.BASIC;
        this.q = true;
        this.u = true;
        this.v = m5d.b(R.attr.uikitSecondary, context);
        this.w = m5d.b(R.attr.uikitWarning, context);
        this.x = m5d.b(R.attr.uikitTextPrimary, context);
        this.y = new bmh((byte) 13);
        this.z = new bmh((byte) 14);
        this.A = new bmh((byte) 15);
        setTag("DsEditTextField");
        setSaveEnabled(true);
        setId(R.id.dsTextFieldMiddleEditDSText);
        setFocusableInTouchMode(true);
        setInputType(getInputType() | 524288);
        setTextDirection(5);
        setTextAlignment(5);
        if (Build.VERSION.SDK_INT >= 35) {
            setLocalePreferredLineHeightForMinimumUsed(false);
        }
    }

    private final void setupColors(TypedArray typedArray) {
        int iB;
        Object g0g0Var;
        Object obj;
        this.v = typedArray.getColor(2, this.v);
        int type = typedArray.getType(15);
        if (type != 1) {
            iB = (type == 28 || type == 29) ? typedArray.getColor(15, this.w) : this.w;
        } else {
            Context context = getContext();
            context.getClass();
            iB = m5d.b(typedArray.getResourceId(15, this.w), context);
        }
        this.w = iB;
        int type2 = typedArray.getType(1);
        int iB2 = this.x;
        if (type2 == 1) {
            Context context2 = getContext();
            context2.getClass();
            iB2 = m5d.b(typedArray.getResourceId(1, iB2), context2);
        } else if (type2 == 28 || type2 == 29) {
            iB2 = typedArray.getColor(1, iB2);
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iB2, iB2});
                gradientDrawable.setSize((int) Math.ceil(getResources().getDisplayMetrics().density * 1.0f), (int) getTextSize());
                setTextCursorDrawable(gradientDrawable);
            } else {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    declaredField.setAccessible(true);
                    g0g0Var = declaredField;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                boolean z = g0g0Var instanceof g0g0;
                Object obj2 = g0g0Var;
                if (z) {
                    obj2 = null;
                }
                Field field = (Field) obj2;
                if (field == null || (obj = field.get(this)) == null) {
                    obj = this;
                }
                Class<?> cls = field != null ? field.getClass() : TextView.class;
                Field declaredField2 = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField2.setAccessible(true);
                Drawable drawable = getContext().getDrawable(declaredField2.getInt(this));
                if (drawable != null) {
                    n4u0 n4u0Var = drawable instanceof n4u0 ? (n4u0) drawable : null;
                    if (n4u0Var != null) {
                        n4u0Var.setTintList(ColorStateList.valueOf(iB2));
                        drawable = n4u0Var;
                    } else {
                        drawable.setTint(iB2);
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        Field declaredField3 = cls.getDeclaredField("mDrawableForCursor");
                        declaredField3.setAccessible(true);
                        declaredField3.set(obj, drawable);
                    } else {
                        Field declaredField4 = cls.getDeclaredField("mCursorDrawable");
                        declaredField4.setAccessible(true);
                        declaredField4.set(obj, new Drawable[]{drawable, drawable});
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        setTextColor(iB2);
        j();
    }

    private final void setupEditTextConfig(TypedArray typedArray) {
        setGravity(16);
        b5i.f2005a.getClass();
        byte b = 4;
        if (std.f(typedArray) == b5i.PASSWORD) {
            if (Build.VERSION.SDK_INT >= 26) {
                setAutofillHints(new String[]{ParameterNames.PASSWORD});
                setImportantForAutofill(1);
            }
            if (typedArray.getBoolean(29, false)) {
                setInputType(getInputType() | 2);
                setFilters(new InputFilter[]{g5i.f10719a, new InputFilter.LengthFilter(4)});
            } else {
                setInputType(getInputType() | 128);
            }
            setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        setInputType(getInputType() | typedArray.getInt(9, 1));
        setTypeface(Typeface.SANS_SERIF);
        setImeOptions(typedArray.getInt(10, 0));
        setClickable(typedArray.getBoolean(5, true));
        setFocusable(typedArray.getBoolean(4, true));
        setLongClickable(typedArray.getBoolean(6, true));
        setCursorVisible(typedArray.getBoolean(7, true));
        boolean z = typedArray.getBoolean(32, this.u);
        this.u = z;
        if (z) {
            setSingleLine(true);
        } else {
            setInputType(getInputType() | 131072);
        }
        int integer = typedArray.getInteger(29, -1);
        if (integer != -1) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
        }
        String string = typedArray.getString(8);
        if (string != null) {
            int inputType = getInputType();
            setKeyListener(DigitsKeyListener.getInstance(string));
            setRawInputType(inputType);
        }
        addTextChangedListener(new jt6(this, b));
        if (isFocusable()) {
            return;
        }
        setKeyListener(null);
        setFocusable(false);
    }

    private final void setupError(TypedArray typedArray) {
        this.m = typedArray.getBoolean(14, this.m);
        j();
    }

    private final void setupSizes(TypedArray typedArray) {
        TextUtils.TruncateAt truncateAt;
        float dimension = typedArray.getDimension(0, this.k);
        this.k = dimension;
        setTextSize(0, dimension);
        this.h = typedArray.getBoolean(11, this.h) && this.l == i5i.FILLED && this.u;
        int i = typedArray.getInt(3, 0);
        if (i == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (i != 3) {
            truncateAt = i != 4 ? null : TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        setEllipsize(truncateAt);
    }

    private final void setupValues(TypedArray typedArray) {
        Context context = getContext();
        context.getClass();
        this.o = ktt0.p(typedArray, context, 30);
        Context context2 = getContext();
        context2.getClass();
        this.p = ktt0.p(typedArray, context2, 24);
        boolean z = true;
        this.q = !isFocused();
        CharSequence charSequence = this.p;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        }
        this.r = z;
        i();
    }

    public final void d() {
        CharSequence charSequence;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (!this.h) {
            setTextSize(2, this.k / getResources().getDisplayMetrics().scaledDensity);
            return;
        }
        String strValueOf = String.valueOf(getText());
        if (strValueOf.length() == 0) {
            CharSequence charSequence2 = "";
            if (!isFocused() || !this.r ? !(!this.q || ((charSequence = this.p) == null && (charSequence = this.o) == null)) : (charSequence = this.o) != null) {
                charSequence2 = charSequence;
            }
            strValueOf = charSequence2.toString();
        }
        if (width <= 0 || TextUtils.isEmpty(strValueOf) || this.t) {
            return;
        }
        float textSize = getTextSize() / getResources().getDisplayMetrics().scaledDensity;
        float f = this.j / getResources().getDisplayMetrics().scaledDensity;
        float f2 = this.k / getResources().getDisplayMetrics().scaledDensity;
        while (textSize < f2 && getPaint().measureText(strValueOf) < width) {
            textSize += 1.0f;
            setTextSize(2, textSize);
        }
        while (textSize > f && getPaint().measureText(strValueOf) > width) {
            textSize -= 1.0f;
            setTextSize(2, textSize);
        }
    }

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        i5i.f14193a.getClass();
        this.l = kud.c(typedArray);
        setupEditTextConfig(typedArray);
        setupError(typedArray);
        setupColors(typedArray);
        setupSizes(typedArray);
        setupValues(typedArray);
    }

    public final boolean f() {
        Editable text = getText();
        return !(text == null || text.length() == 0);
    }

    public final boolean g(int i, CharSequence charSequence) {
        float f = i;
        return getPaint().measureText(charSequence.toString()) > f && f > getPaint().measureText("...");
    }

    public CharSequence getPlaceHolderOrEmpty() {
        CharSequence charSequence = this.o;
        return charSequence == null ? "" : charSequence;
    }

    public final void h(boolean z) {
        setTransformationMethod(z ? null : PasswordTransformationMethod.getInstance());
        Editable text = getText();
        setSelection(text != null ? text.length() : 0);
    }

    public final void i() {
        CharSequence charSequence;
        CharSequence charSequence2 = "";
        if (!isFocused() || !this.r ? !(!this.q || ((charSequence = this.p) == null && (charSequence = this.o) == null)) : (charSequence = this.o) != null) {
            charSequence2 = charSequence;
        }
        String string = charSequence2.toString();
        float fMeasureText = getPaint().measureText(string);
        CharSequence charSequence3 = string;
        if (fMeasureText > getMeasuredWidth()) {
            boolean zG = g(getMeasuredWidth(), string);
            charSequence3 = string;
            if (zG) {
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(string, getPaint(), getWidth(), TextUtils.TruncateAt.END);
                charSequenceEllipsize.getClass();
                charSequence3 = charSequenceEllipsize;
            }
        }
        setHint(charSequence3);
    }

    public final void j() {
        int i = ((isFocused() && this.m) || isFocused() || !this.m) ? this.v : this.w;
        setHintTextColor(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.q = !z;
        this.r = z;
        i();
        j();
        if (z) {
            Object systemService = getContext().getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            inputMethodManager.restartInput(this);
            inputMethodManager.showSoftInput(this, 1);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int height;
        String string;
        String string2;
        String string3;
        super.onMeasure(i, i2);
        if (this.u) {
            TextPaint paint = getPaint();
            CharSequence charSequence = this.o;
            String str = "";
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            float fMeasureText = paint.measureText(string);
            TextPaint paint2 = getPaint();
            CharSequence charSequence2 = this.p;
            if (charSequence2 == null || (string2 = charSequence2.toString()) == null) {
                string2 = "";
            }
            float fMeasureText2 = paint2.measureText(string2);
            TextPaint paint3 = getPaint();
            Editable text = getText();
            if (text != null && (string3 = text.toString()) != null) {
                str = string3;
            }
            size = (int) Math.max(fMeasureText, Math.max(fMeasureText2, paint3.measureText(str)));
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        if (this.u) {
            height = Math.max(View.MeasureSpec.getSize(i2), this.i);
        } else {
            TextPaint paint4 = getPaint();
            paint4.getClass();
            height = cem0.t(this, paint4, size).getHeight();
        }
        setMeasuredDimension(size, height);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DSTextFieldMiddleEditDSText$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DSTextFieldMiddleEditDSText$SavedState dSTextFieldMiddleEditDSText$SavedState = (DSTextFieldMiddleEditDSText$SavedState) parcelable;
        String str = dSTextFieldMiddleEditDSText$SavedState.b;
        this.s = str;
        setText(str);
        super.onRestoreInstanceState(dSTextFieldMiddleEditDSText$SavedState.f47277a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DSTextFieldMiddleEditDSText$SavedState(super.onSaveInstanceState(), String.valueOf(this.s));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0) {
            d();
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.s = charSequence;
        super.onTextChanged(charSequence, i, i2, i3);
        d();
        requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        switch (i) {
            case android.R.id.cut:
                this.y.invoke();
                break;
            case android.R.id.copy:
                this.z.invoke();
                break;
            case android.R.id.paste:
                this.A.invoke();
                break;
        }
        requestLayout();
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && isFocused()) {
            Object systemService = getContext().getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            inputMethodManager.restartInput(this);
            inputMethodManager.showSoftInput(this, 1);
        }
    }

    public void setEditable(boolean z) {
        setFocusable(z);
        setClickable(true);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(i | 16);
    }

    public void setIgnoreTextSpaces(boolean z) {
        this.n = z;
    }

    public void setLabelText(CharSequence charSequence) {
        this.p = charSequence;
        i();
        d();
    }

    public void setOnTextCopy(Function0<Unit> function0) {
        function0.getClass();
        this.z = function0;
    }

    public void setOnTextCut(Function0<Unit> function0) {
        function0.getClass();
        this.y = function0;
    }

    public void setOnTextPaste(Function0<Unit> function0) {
        function0.getClass();
        this.A = function0;
    }

    public void setPlaceholderText(CharSequence charSequence) {
        this.o = charSequence;
        i();
        d();
    }

    @Override // android.widget.EditText
    public void setSelection(int i) {
        Editable text = getText();
        int length = text != null ? text.length() : 0;
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        super.setSelection(i);
    }

    public void setValue(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = null;
        }
        CharSequence charSequence2 = this.s;
        if (Intrinsics.d(charSequence2 != null ? charSequence2.toString() : null, charSequence != null ? charSequence.toString() : null)) {
            return;
        }
        this.s = charSequence;
        setText(charSequence);
        if (isFocused()) {
            Editable text = getText();
            setSelection(text != null ? text.length() : 0);
        }
        setContentDescription(charSequence);
    }
}
