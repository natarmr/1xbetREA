package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pe3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f26830a;
    public goq0 b;
    public goq0 c;
    public goq0 d;
    public goq0 e;
    public goq0 f;
    public goq0 g;
    public goq0 h;
    public final ve3 i;
    public Typeface l;
    public boolean n;
    public int j = 0;
    public int k = -1;
    public String m = null;

    public pe3(TextView textView) {
        this.f26830a = textView;
        this.i = new ve3(textView);
    }

    public static void d(TextView textView, Typeface typeface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        String str = null;
        if (i2 >= 26) {
            String strC = ne3.c(textView);
            if (!TextUtils.isEmpty(strC)) {
                ne3.f(textView, null);
            }
            str = strC;
        }
        textView.setTypeface(typeface, i);
        if (i2 < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        ne3.f(textView, str);
    }

    public static goq0 e(Context context, td3 td3Var, int i) {
        ColorStateList colorStateListG;
        synchronized (td3Var) {
            colorStateListG = td3Var.f33746a.g(i, context);
        }
        if (colorStateListG == null) {
            return null;
        }
        goq0 goq0Var = new goq0();
        goq0Var.d = true;
        goq0Var.f11644a = colorStateListG;
        return goq0Var;
    }

    public final void a(Drawable drawable, goq0 goq0Var) {
        if (drawable == null || goq0Var == null) {
            return;
        }
        int[] drawableState = this.f26830a.getDrawableState();
        PorterDuff.Mode mode = td3.b;
        dtf0.i(drawable, goq0Var, drawableState);
    }

    public final void b() {
        goq0 goq0Var = this.b;
        TextView textView = this.f26830a;
        if (goq0Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final void c(boolean z) {
        Typeface typeface = this.l;
        TextView textView = this.f26830a;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            textView.setTypeface(null);
        }
        String str = this.m;
        if (str == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        ne3.f(textView, str);
    }

    public final ColorStateList f() {
        goq0 goq0Var = this.h;
        if (goq0Var != null) {
            return goq0Var.f11644a;
        }
        return null;
    }

    public final PorterDuff.Mode g() {
        goq0 goq0Var = this.h;
        if (goq0Var != null) {
            return goq0Var.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:210:0x036b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0370  */
    /* JADX WARN: Code duplicated, block: B:215:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x0379  */
    /* JADX WARN: Code duplicated, block: B:218:0x037e  */
    /* JADX WARN: Code duplicated, block: B:220:0x0384  */
    /* JADX WARN: Code duplicated, block: B:222:0x0388  */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    public final void h(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        int i2;
        float dimensionPixelSize;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.f26830a;
        Context context = textView.getContext();
        td3 td3VarA = td3.a();
        int[] iArr = mqd0.h;
        ywu ywuVarY = ywu.y(i, 0, context, attributeSet, iArr);
        rgu0.n(textView, textView.getContext(), iArr, attributeSet, (TypedArray) ywuVarY.c, i, 0);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = e(context, td3VarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = e(context, td3VarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = e(context, td3VarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = e(context, td3VarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = e(context, td3VarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = e(context, td3VarA, typedArray.getResourceId(6, 0));
        }
        ywuVarY.A();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = mqd0.x;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            ywu ywuVar = new ywu(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            o(context, ywuVar);
            string = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            ywuVar.A();
        } else {
            z = false;
            z2 = false;
            string = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ywu ywuVar2 = new ywu(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        o(context, ywuVar2);
        ywuVar2.A();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        c(false);
        if (string != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(string));
        }
        ve3 ve3Var = this.i;
        Context context2 = ve3Var.j;
        int[] iArr3 = mqd0.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = ve3Var.i;
        rgu0.n(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            ve3Var.f37262a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                ve3Var.f = ve3.b(iArr4);
                ve3Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!ve3Var.j()) {
            ve3Var.f37262a = 0;
        } else if (ve3Var.f37262a == 1) {
            if (!ve3Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                ve3Var.k(dimension2, dimension3, dimension);
            }
            ve3Var.h();
        }
        if (cmu0.c && ve3Var.f37262a != 0) {
            int[] iArr5 = ve3Var.f;
            if (iArr5.length > 0) {
                if (ne3.b(textView) != -1.0f) {
                    ne3.d(textView, Math.round(ve3Var.d), Math.round(ve3Var.e), Math.round(ve3Var.c));
                } else {
                    ne3.e(textView, iArr5);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? td3VarA.b(resourceId4, context) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? td3VarA.b(resourceId5, context) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? td3VarA.b(resourceId6, context) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? td3VarA.b(resourceId7, context) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? td3VarA.b(resourceId8, context) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? td3VarA.b(resourceId9, context) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = jiq0.n0(resourceId, context)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(qhl.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i6 = typedValuePeekValue.data;
                int i7 = i6 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i6);
                i3 = i7;
                i2 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i2) {
                aem0.t(dimensionPixelSize2, textView);
            }
            if (dimensionPixelSize3 != i2) {
                aem0.u(dimensionPixelSize3, textView);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i3 == i2) {
                    aem0.v((int) dimensionPixelSize, textView);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    r6.q(textView, i3, dimensionPixelSize);
                } else {
                    aem0.v(Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())), textView);
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = -1.0f;
        i3 = i2;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i2) {
            aem0.t(dimensionPixelSize2, textView);
        }
        if (dimensionPixelSize3 != i2) {
            aem0.u(dimensionPixelSize3, textView);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                aem0.v((int) dimensionPixelSize, textView);
            } else if (Build.VERSION.SDK_INT >= 34) {
                r6.q(textView, i3, dimensionPixelSize);
            } else {
                aem0.v(Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())), textView);
            }
        }
    }

    public final void i(int i, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, mqd0.x);
        ywu ywuVar = new ywu(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f26830a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        boolean zO = o(context, ywuVar);
        ywuVar.A();
        c(zO);
    }

    public final void j(int i, int i2, int i3, int i4) {
        ve3 ve3Var = this.i;
        if (ve3Var.j()) {
            DisplayMetrics displayMetrics = ve3Var.j.getResources().getDisplayMetrics();
            ve3Var.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (ve3Var.h()) {
                ve3Var.a();
            }
        }
    }

    public final void k(int[] iArr, int i) {
        ve3 ve3Var = this.i;
        if (ve3Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = ve3Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                ve3Var.f = ve3.b(iArrCopyOf);
                if (!ve3Var.i()) {
                    ohq.k(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                ve3Var.g = false;
            }
            if (ve3Var.h()) {
                ve3Var.a();
            }
        }
    }

    public final void l(int i) {
        ve3 ve3Var = this.i;
        if (ve3Var.j()) {
            if (i == 0) {
                ve3Var.f37262a = 0;
                ve3Var.d = -1.0f;
                ve3Var.e = -1.0f;
                ve3Var.c = -1.0f;
                ve3Var.f = new int[0];
                ve3Var.b = false;
                return;
            }
            if (i != 1) {
                jf4.o(twn.m(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = ve3Var.j.getResources().getDisplayMetrics();
            ve3Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (ve3Var.h()) {
                ve3Var.a();
            }
        }
    }

    public final void m(ColorStateList colorStateList) {
        goq0 goq0Var = this.h;
        if (goq0Var == null) {
            goq0Var = new goq0();
            this.h = goq0Var;
        }
        goq0 goq0Var2 = goq0Var;
        goq0Var.f11644a = colorStateList;
        goq0Var.d = colorStateList != null;
        this.b = goq0Var2;
        this.c = goq0Var2;
        this.d = goq0Var2;
        this.e = goq0Var2;
        this.f = goq0Var2;
        this.g = goq0Var2;
    }

    public final void n(PorterDuff.Mode mode) {
        goq0 goq0Var = this.h;
        if (goq0Var == null) {
            goq0Var = new goq0();
            this.h = goq0Var;
        }
        goq0 goq0Var2 = goq0Var;
        goq0Var.b = mode;
        goq0Var.c = mode != null;
        this.b = goq0Var2;
        this.c = goq0Var2;
        this.d = goq0Var2;
        this.e = goq0Var2;
        this.f = goq0Var2;
        this.g = goq0Var2;
    }

    public final boolean o(Context context, ywu ywuVar) {
        String string;
        int i;
        Typeface typeface;
        int i2 = this.j;
        TypedArray typedArray = (TypedArray) ywuVar.c;
        this.j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.k = i4;
            if (i4 != -1) {
                this.j &= 2;
            }
        }
        if (i3 >= 26 && typedArray.hasValue(13)) {
            this.m = typedArray.getString(13);
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.l = null;
            int i5 = typedArray.hasValue(12) ? 12 : 10;
            int i6 = this.k;
            int i7 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceP = ywuVar.p(i5, this.j, new ke3(this, i6, i7, new WeakReference(this.f26830a)));
                    if (typefaceP != null) {
                        if (i3 < 28 || this.k == -1) {
                            this.l = typefaceP;
                        } else {
                            this.l = ia3.a(Typeface.create(typefaceP, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.n = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (string = typedArray.getString(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(string, this.j);
                } else {
                    this.l = ia3.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
                }
            }
        } else {
            if (!typedArray.hasValue(1)) {
                if (i3 < 28 || (i = this.k) == -1 || (typeface = this.l) == null) {
                    return false;
                }
                this.l = ia3.a(typeface, i, (this.j & 2) != 0);
                return true;
            }
            this.n = false;
            int i8 = typedArray.getInt(1, 1);
            if (i8 == 1) {
                this.l = Typeface.SANS_SERIF;
                return true;
            }
            if (i8 == 2) {
                this.l = Typeface.SERIF;
                return true;
            }
            if (i8 == 3) {
                this.l = Typeface.MONOSPACE;
                return true;
            }
        }
        return true;
    }
}
