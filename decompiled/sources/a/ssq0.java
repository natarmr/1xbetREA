package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ssq0 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32738a;
    public final int b;
    public final float c;
    public final float d;
    public String e;
    public final TextPaint f;
    public final Drawable g;
    public String h;
    public boolean i;
    public StaticLayout j;
    public int k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssq0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f32738a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_16);
        this.c = getResources().getDimensionPixelSize(R.dimen.text_12);
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.text_20);
        this.d = dimensionPixelSize;
        this.e = "";
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(dimensionPixelSize);
        this.f = textPaint;
        this.g = epv0.U(R.drawable.ic_glyph_chevron_down_small, context);
        this.h = this.e;
        this.i = true;
        this.k = 3;
        setTag("TitleWithChevronView");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        Typeface typefaceA = itf0.a(R.font.roboto_medium, context);
        appCompatTextView.setTextAppearance(context, R.style.TextStyle_Title_Medium_M);
        textPaint.setTextSize(appCompatTextView.getTextSize());
        textPaint.setColor(appCompatTextView.getCurrentTextColor());
        textPaint.setTypeface(typefaceA);
    }

    public static StaticLayout b(ssq0 ssq0Var, String str, TextPaint textPaint, int i) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if (i < 0) {
            i = 0;
        }
        return new StaticLayout(str, textPaint, i, alignment, 1.0f, 0.0f, false);
    }

    public final void a(int i) {
        boolean z = this.i;
        int i2 = this.f32738a;
        int i3 = (i - (z ? this.b + i2 : 0)) - i2;
        String str = this.e;
        float f = i3;
        TextPaint textPaint = this.f;
        float f2 = this.d;
        textPaint.setTextSize(f2);
        for (float fMeasureText = textPaint.measureText(str); fMeasureText > f && f2 > this.c; fMeasureText = textPaint.measureText(str)) {
            f2 -= 1.0f;
            textPaint.setTextSize(f2);
        }
        textPaint.getTextSize();
    }

    public final boolean getChevronVisibility() {
        return this.i;
    }

    public final int getCurrentTextColor() {
        return this.f.getColor();
    }

    public final int getDesiredTitleTextHeight() {
        Rect rect = new Rect();
        String str = this.e;
        this.f.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        canvas.getClass();
        super.onDraw(canvas);
        StaticLayout staticLayout = this.j;
        int i = this.b;
        if (staticLayout != null) {
            float height = (getHeight() - staticLayout.getHeight()) / 2.0f;
            float f = 0.0f;
            if (height < 0.0f) {
                height = 0.0f;
            }
            int layoutDirection = getLayoutDirection();
            int i2 = this.f32738a;
            try {
                if (layoutDirection == 1 && this.i) {
                    i2 += i;
                } else {
                    if (getLayoutDirection() != 1 && !this.i) {
                    }
                    iSave = canvas.save();
                    canvas.translate(f, height);
                    staticLayout.draw(canvas);
                    canvas.restoreToCount(iSave);
                }
                staticLayout.draw(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
            f = i2;
            iSave = canvas.save();
            canvas.translate(f, height);
        }
        if (this.i) {
            int width = getLayoutDirection() == 1 ? 0 : getWidth() - i;
            float height2 = (getHeight() - i) / 2.0f;
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.setBounds(width, (int) height2, width + i, (int) (height2 + i));
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.l = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        a(this.l);
        String str = this.h;
        TextPaint textPaint = this.f;
        int iMeasureText = (int) textPaint.measureText(str);
        boolean z = this.i;
        int i3 = this.b;
        int i4 = this.f32738a;
        int iMin = Math.min(iMeasureText + (z ? i3 + i4 : 0) + (z ? 0 : i4), this.l);
        String str2 = this.h;
        int i5 = this.k;
        boolean z2 = this.i;
        int i6 = z2 ? i3 + i4 : 0;
        if (z2) {
            i4 = 0;
        }
        int i7 = (iMin - i6) - i4;
        StaticLayout staticLayoutB = b(this, str2, textPaint, i7);
        if (staticLayoutB.getLineCount() > i5) {
            int length = str2.length();
            String string = TextUtils.ellipsize(str2, textPaint, i7 * i5, TextUtils.TruncateAt.END).toString();
            int i8 = 0;
            while (i8 <= length) {
                int i9 = (i8 + length) / 2;
                String strConcat = i9 < string.length() ? string.substring(0, i9).concat("…") : string.concat("…");
                if (b(this, strConcat, textPaint, i7).getLineCount() <= i5) {
                    i8 = i9 + 1;
                    str2 = strConcat;
                } else {
                    length = i9 - 1;
                }
            }
            staticLayoutB = b(this, str2, textPaint, i7);
        }
        this.j = staticLayoutB;
        setMeasuredDimension(iMin, Math.max(staticLayoutB.getHeight(), size));
        setContentDescription(this.e);
    }

    public final void setChevronColor(int i) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setTint(i);
        }
        requestLayout();
    }

    public final void setChevronVisibility(boolean z) {
        if (this.i != z) {
            this.i = z;
            requestLayout();
        }
    }

    public final void setMaxLines(int i) {
        if (this.k != i) {
            this.k = i;
            requestLayout();
        }
    }

    public final void setOnTitlesClickListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.b0(this, ymx.INTERVAL_400, new vpj0(function0, (byte) 10));
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.f;
        if (textPaint.getColor() != i) {
            textPaint.setColor(i);
            invalidate();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        if (Intrinsics.d(this.e, string)) {
            return;
        }
        this.e = string;
        this.h = string;
        a(this.l);
        requestLayout();
    }

    public final void setTitleAlpha(float f) {
        int i = (int) (f * 255.0f);
        this.f.setAlpha(i);
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        invalidate();
    }

    public final void setTitleScale(float f) {
        setScaleX(f);
        setScaleY(f);
    }

    public final void setTitleTranslationY(float f) {
        setTranslationY(f);
    }

    public final void setTitleVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public final void setChevronColor(ColorStateList colorStateList) {
        Drawable drawable;
        if (colorStateList == null || (drawable = this.g) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        setTextColor(colorStateList.getDefaultColor());
    }
}
