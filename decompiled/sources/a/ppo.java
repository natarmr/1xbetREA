package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class ppo extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadableImageView f27382a;
    public final TextView b;
    public int c;
    public n6l0 d;
    public final Paint e;
    public final Paint f;
    public int g;
    public int h;
    public int i;
    public final RectF j;
    public final float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppo(Context context, n6l0 n6l0Var) {
        super(context);
        context.getClass();
        this.c = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.d = n6l0.f23002a;
        Paint paint = new Paint(1);
        paint.setColor(m5d.b(R.attr.uikitBackground, context));
        this.e = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(m5d.b(R.attr.uikitBackgroundGroupSecondary, context));
        this.f = paint2;
        this.g = getResources().getDimensionPixelSize(R.dimen.size_58);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.k = getResources().getDimensionPixelSize(R.dimen.size_10);
        LoadableImageView loadableImageView = new LoadableImageView(context, null, 6, 0);
        loadableImageView.setTag("sportIconTestTag");
        loadableImageView.setLayoutDirection(3);
        loadableImageView.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
        this.f27382a = loadableImageView;
        TextView textView = new TextView(context);
        textView.setTag("eventCoefTestTag");
        textView.setGravity(17);
        textView.setTextAlignment(4);
        cem0.n(R.style.TextStyle_Caption_Bold_L_TextPrimary, textView);
        textView.setIncludeFontPadding(false);
        textView.setMaxLines(1);
        textView.setLayoutDirection(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.b = textView;
        addView(loadableImageView);
        addView(textView);
        setWillNotDraw(false);
        setStyle(n6l0Var);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 2) {
            canvas.drawCircle(getWidth() / 2.0f, this.h + (this.c / 2), getResources().getDimensionPixelSize(R.dimen.size_18), this.e);
        } else if (iOrdinal == 3) {
            float f = this.k;
            canvas.drawRoundRect(this.j, f, f, this.f);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth() / 2;
        int i5 = this.c;
        int i6 = width - (i5 / 2);
        int i7 = this.h;
        this.f27382a.layout(i6, i7, i6 + i5, i5 + i7);
        int i8 = this.h + this.c + this.i;
        int width2 = getWidth();
        TextView textView = this.b;
        textView.layout(0, i8, width2, textView.getMeasuredHeight() + i8);
        this.j.set(0.0f, getResources().getDimensionPixelSize(R.dimen.space_4), getWidth(), getResources().getDimensionPixelSize(R.dimen.size_36));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        this.f27382a.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_20), 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.size_20), 1073741824));
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(size, this.g);
    }

    public void setCoef(String str) {
        str.getClass();
        this.b.setText(str);
    }

    public void setSportIcon(int i) {
        this.f27382a.setImageResource(i);
    }

    public final void setStyle(n6l0 n6l0Var) {
        n6l0Var.getClass();
        this.d = n6l0Var;
        int iOrdinal = n6l0Var.ordinal();
        TextView textView = this.b;
        if (iOrdinal == 0) {
            this.g = getResources().getDimensionPixelSize(R.dimen.size_58);
            this.c = getResources().getDimensionPixelSize(R.dimen.size_24);
            this.h = getResources().getDimensionPixelSize(R.dimen.space_8);
            this.i = getResources().getDimensionPixelSize(R.dimen.space_4);
            cem0.n(R.style.TextStyle_Caption_Bold_L_TextPrimary, textView);
            aem0.r(textView, 8, 12, 2, 2);
            return;
        }
        if (iOrdinal == 1) {
            this.g = getResources().getDimensionPixelSize(R.dimen.space_46);
            this.c = getResources().getDimensionPixelSize(R.dimen.size_20);
            this.h = getResources().getDimensionPixelSize(R.dimen.space_4);
            this.i = getResources().getDimensionPixelSize(R.dimen.space_4);
            cem0.n(R.style.TextStyle_Caption_Medium_L_TextPrimary, textView);
            aem0.r(textView, 8, 12, 2, 2);
            return;
        }
        if (iOrdinal == 2) {
            this.g = getResources().getDimensionPixelSize(R.dimen.size_60);
            this.c = getResources().getDimensionPixelSize(R.dimen.size_20);
            this.h = getResources().getDimensionPixelSize(R.dimen.space_12);
            this.i = getResources().getDimensionPixelSize(R.dimen.space_10);
            cem0.n(R.style.TextStyle_Caption_Medium_M_TextPrimary, textView);
            aem0.r(textView, 8, 10, 2, 2);
            return;
        }
        if (iOrdinal != 3) {
            t9f.b();
            return;
        }
        this.g = getResources().getDimensionPixelSize(R.dimen.size_58);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_20);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_10);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_10);
        cem0.n(R.style.TextStyle_Caption_Medium_L_TextPrimary, textView);
        aem0.r(textView, 8, 12, 2, 2);
    }
}
