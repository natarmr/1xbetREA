package org.xplatform.uikit.components.text_field.end;

import a.i5i;
import a.kud;
import a.m5d;
import a.q10;
import a.u4i;
import a.x2i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.widget.Checkable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends View implements u4i, Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47276a;
    public int b;
    public int c;
    public final int d;
    public Function1 e;
    public final Drawable f;
    public final Drawable g;
    public final PorterDuffColorFilter h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f47276a = true;
        this.e = new x2i((byte) 1);
        Drawable drawable = context.getDrawable(R.drawable.ic_glyph_show);
        this.f = drawable;
        this.g = context.getDrawable(R.drawable.ic_glyph_hide);
        this.h = new PorterDuffColorFilter(m5d.b(R.attr.uikitSecondary, context), PorterDuff.Mode.SRC_IN);
        setChecked(true);
        setSaveEnabled(true);
        setId(R.id.dsTextFieldEndPassword);
        if (drawable != null) {
            drawable.getIntrinsicWidth();
        }
        this.d = drawable != null ? drawable.getIntrinsicHeight() : 0;
        setOnClickListener(new q10(this, (byte) 13));
        setTag("DSTextFieldEndPassword");
    }

    @Override // a.u4i
    public final void a(boolean z) {
    }

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        i5i.f14193a.getClass();
        if (kud.c(typedArray) == i5i.FILLED) {
            this.b = getResources().getDimensionPixelSize(R.dimen.size_40);
            this.c = getResources().getDimensionPixelSize(R.dimen.size_44);
            setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.space_8), getPaddingTop(), getResources().getDimensionPixelSize(R.dimen.space_8), getPaddingBottom());
            return;
        }
        this.b = getResources().getDimensionPixelSize(R.dimen.size_44);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_42);
        setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.space_20), getResources().getDimensionPixelSize(R.dimen.space_14), getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.space_4));
    }

    public final int getIconStateTest() {
        return this.f47276a ? R.drawable.ic_glyph_show : R.drawable.ic_glyph_hide;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f47276a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int i = this.d;
        int i2 = height - (i / 2);
        int i3 = i + i2;
        Drawable drawable = this.f47276a ? this.f : this.g;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), i2, getWidth() - getPaddingRight(), i3);
        }
        if (drawable != null) {
            drawable.setColorFilter(this.h);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.b, this.c);
        getPaddingLeft();
        getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DSTextFieldEndPassword$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DSTextFieldEndPassword$SavedState dSTextFieldEndPassword$SavedState = (DSTextFieldEndPassword$SavedState) parcelable;
        boolean z = dSTextFieldEndPassword$SavedState.b;
        this.f47276a = z;
        setChecked(z);
        this.e.invoke(Boolean.valueOf(this.f47276a));
        super.onRestoreInstanceState(dSTextFieldEndPassword$SavedState.f47273a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DSTextFieldEndPassword$SavedState(super.onSaveInstanceState(), this.f47276a);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f47276a = z;
        invalidate();
    }

    public final void setOnCheckedChangeListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.e = function1;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f47276a = !this.f47276a;
        invalidate();
    }
}
