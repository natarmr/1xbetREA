package androidx.appcompat.widget;

import a.ce3;
import a.de3;
import a.ee3;
import a.epv0;
import a.fe3;
import a.fp;
import a.ie3;
import a.je3;
import a.mqd0;
import a.tje;
import a.ybq0;
import a.ywu;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp f45301a;
    public final Context b;
    public final ce3 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final je3 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public b(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, org.xbet.client1.R.attr.spinnerStyle);
        this.h = new Rect();
        ybq0.a(this, getContext());
        int[] iArr = mqd0.v;
        ywu ywuVarY = ywu.y(org.xbet.client1.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        this.f45301a = new fp(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.b = new tje(context, resourceId);
        } else {
            this.b = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i, org.xbet.client1.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i2 != 0) {
                        ee3 ee3Var = new ee3(this);
                        this.f = ee3Var;
                        ee3Var.c = typedArray.getString(2);
                    } else if (i2 == 1) {
                        ie3 ie3Var = new ie3(this, this.b, attributeSet);
                        ywu ywuVarY2 = ywu.y(org.xbet.client1.R.attr.spinnerStyle, 0, this.b, attributeSet, iArr);
                        this.g = ((TypedArray) ywuVarY2.c).getLayoutDimension(3, -2);
                        ie3Var.s(ywuVarY2.n(1));
                        ie3Var.Y = typedArray.getString(2);
                        ywuVarY2.A();
                        this.f = ie3Var;
                        this.c = new ce3(this, this, ie3Var);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(org.xbet.client1.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    ywuVarY.A();
                    this.e = true;
                    spinnerAdapter = this.d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.d = null;
                    }
                    this.f45301a.A(attributeSet, org.xbet.client1.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            ee3 ee3Var2 = new ee3(this);
            this.f = ee3Var2;
            ee3Var2.c = typedArray.getString(2);
        } else if (i2 == 1) {
            ie3 ie3Var2 = new ie3(this, this.b, attributeSet);
            ywu ywuVarY3 = ywu.y(org.xbet.client1.R.attr.spinnerStyle, 0, this.b, attributeSet, iArr);
            this.g = ((TypedArray) ywuVarY3.c).getLayoutDimension(3, -2);
            ie3Var2.s(ywuVarY3.n(1));
            ie3Var2.Y = typedArray.getString(2);
            ywuVarY3.A();
            this.f = ie3Var2;
            this.c = new ce3(this, this, ie3Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(org.xbet.client1.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        ywuVarY.A();
        this.e = true;
        spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f45301a.A(attributeSet, org.xbet.client1.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fp fpVar = this.f45301a;
        if (fpVar != null) {
            fpVar.c();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        je3 je3Var = this.f;
        return je3Var != null ? je3Var.g() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        je3 je3Var = this.f;
        return je3Var != null ? je3Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final je3 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        je3 je3Var = this.f;
        return je3Var != null ? je3Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        je3 je3Var = this.f;
        return je3Var != null ? je3Var.i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        fp fpVar = this.f45301a;
        if (fpVar != null) {
            return fpVar.x();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fp fpVar = this.f45301a;
        if (fpVar != null) {
            return fpVar.y();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        je3 je3Var = this.f;
        if (je3Var == null || !je3Var.f()) {
            return;
        }
        je3Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.f45293a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new de3(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        je3 je3Var = this.f;
        appCompatSpinner$SavedState.f45293a = je3Var != null && je3Var.f();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ce3 ce3Var = this.c;
        if (ce3Var == null || !ce3Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        je3 je3Var = this.f;
        if (je3Var == null) {
            return super.performClick();
        }
        if (je3Var.f()) {
            return true;
        }
        je3Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        je3 je3Var = this.f;
        if (je3Var != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            fe3 fe3Var = new fe3();
            fe3Var.f9385a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                fe3Var.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            je3Var.o(fe3Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fp fpVar = this.f45301a;
        if (fpVar != null) {
            fpVar.C();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        fp fpVar = this.f45301a;
        if (fpVar != null) {
            fpVar.D(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        je3 je3Var = this.f;
        if (je3Var == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            je3Var.l(i2);
            je3Var.h(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        je3 je3Var = this.f;
        if (je3Var != null) {
            je3Var.k(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        je3 je3Var = this.f;
        if (je3Var != null) {
            je3Var.s(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(epv0.U(i2, getPopupContext()));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        je3 je3Var = this.f;
        if (je3Var != null) {
            je3Var.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fp fpVar = this.f45301a;
        if (fpVar != null) {
            fpVar.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fp fpVar = this.f45301a;
        if (fpVar != null) {
            fpVar.Q(mode);
        }
    }
}
