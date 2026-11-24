package org.xplatform.uikit.components.text_field.end;

import a.i5i;
import a.kud;
import a.m5d;
import a.u4i;
import a.w4i;
import a.wg;
import a.y4i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends View implements u4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47275a;
    public int b;
    public final int c;
    public float d;
    public float e;
    public int f;
    public final LinearInterpolator g;
    public float h;
    public final Drawable i;
    public final PorterDuffColorFilter j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f = 1;
        this.g = new LinearInterpolator();
        Drawable drawable = context.getDrawable(R.drawable.ic_glyph_chevron_down_small);
        this.i = drawable;
        this.j = new PorterDuffColorFilter(m5d.b(R.attr.uikitSecondary, context), PorterDuff.Mode.SRC_IN);
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        this.c = intrinsicHeight;
        this.d = intrinsicWidth / 2.0f;
        this.e = intrinsicHeight / 2.0f;
        setTag("DSTextFieldEndChevron");
    }

    @Override // a.u4i
    public final void a(boolean z) {
    }

    public final void b(Function0 function0) {
        this.f = 1;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(180.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(this.g);
        valueAnimatorOfFloat.addUpdateListener(new w4i(this, (byte) 1));
        valueAnimatorOfFloat.addListener(new y4i(this, function0, (byte) 0));
        valueAnimatorOfFloat.start();
    }

    public final void c(Function0 function0) {
        this.f = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 180.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(this.g);
        valueAnimatorOfFloat.addUpdateListener(new w4i(this, (byte) 0));
        valueAnimatorOfFloat.addListener(new y4i(this, function0, (byte) 1));
        valueAnimatorOfFloat.start();
    }

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        int dimensionPixelSize;
        i5i.f14193a.getClass();
        if (kud.c(typedArray) == i5i.FILLED) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
            this.f47275a = getResources().getDimensionPixelSize(R.dimen.size_40);
            this.b = getResources().getDimensionPixelSize(R.dimen.size_44);
        } else {
            this.f47275a = getResources().getDimensionPixelSize(R.dimen.size_24);
            this.b = getResources().getDimensionPixelSize(R.dimen.size_20);
            dimensionPixelSize = 0;
        }
        setPaddingRelative(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
    }

    public final boolean getExpanded() {
        return this.f == 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int i = this.c;
        int i2 = height - (i / 2);
        int i3 = i + i2;
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(getPaddingLeft(), i2, getWidth() - getPaddingRight(), i3);
        }
        canvas.rotate(this.h, this.d, this.e);
        if (drawable != null) {
            drawable.setColorFilter(this.j);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f47275a, this.b);
        this.d += getPaddingLeft();
        this.e = getMeasuredHeight() / 2.0f;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        DSTextFieldEndChevron$SavedState dSTextFieldEndChevron$SavedState = parcelable instanceof DSTextFieldEndChevron$SavedState ? (DSTextFieldEndChevron$SavedState) parcelable : null;
        if (dSTextFieldEndChevron$SavedState == null) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(dSTextFieldEndChevron$SavedState.f47272a);
        int i = ((DSTextFieldEndChevron$SavedState) parcelable).b;
        this.f = i;
        this.h = i == 0 ? 180.0f : 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DSTextFieldEndChevron$SavedState(super.onSaveInstanceState(), this.f);
    }

    public final void setClickListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        setOnClickListener(new wg((Object) this, (Object) function1, (byte) 14));
    }

    public final void setExpanded(boolean z) {
        if (z) {
            final byte b = 0;
            c(new Function0(this) { // from class: a.v4i
                public final /* synthetic */ org.xplatform.uikit.components.text_field.end.b b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b2 = b;
                    org.xplatform.uikit.components.text_field.end.b bVar = this.b;
                    switch (b2) {
                        case 0:
                            bVar.f = 0;
                            break;
                        default:
                            bVar.f = 1;
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else {
            final byte b2 = 1;
            b(new Function0(this) { // from class: a.v4i
                public final /* synthetic */ org.xplatform.uikit.components.text_field.end.b b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b2;
                    org.xplatform.uikit.components.text_field.end.b bVar = this.b;
                    switch (b3) {
                        case 0:
                            bVar.f = 0;
                            break;
                        default:
                            bVar.f = 1;
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        }
    }
}
