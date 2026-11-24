package a;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes6.dex */
public final class pao extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f26663a;
    public final int b;
    public final a8z c;
    public final int d;
    public final int e;
    public String f;
    public float g;
    public float h;
    public String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pao(Context context) {
        super(context, null);
        context.getClass();
        TextPaint textPaint = new TextPaint(1);
        r7x.r(textPaint, context, R.style.TextStyle_Text_Medium_TextPrimary);
        this.f26663a = textPaint;
        this.b = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.c = maz.a(wez.b, new gnm(context, this, (byte) 26));
        this.d = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = "";
        this.i = "";
        setWillNotDraw(false);
    }

    private final DsAccordion getAccordionView() {
        return (DsAccordion) this.c.getValue();
    }

    public final boolean a() {
        return getAccordionView().getExpanded();
    }

    public final void b(String str) {
        str.getClass();
        this.f = str;
        getAccordionView().setExpanded(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.i.length() > 0) {
            canvas.drawText(this.i, this.h, this.g, this.f26663a);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int length = this.f.length();
        int i3 = this.b;
        int i4 = this.d;
        if (length > 0) {
            String str = this.f;
            float f = ((size - (i4 * 2)) - this.e) - i3;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            TextPaint textPaint = this.f26663a;
            this.i = TextUtils.ellipsize(str, textPaint, f, truncateAt).toString();
            int i5 = size2 / 2;
            this.h = getLayoutDirection() == 1 ? (size - textPaint.measureText(this.i)) - i4 : i4;
            this.g = i5 - ((textPaint.ascent() + textPaint.descent()) / 2.0f);
        }
        DsAccordion accordionView = getAccordionView();
        ViewGroup.LayoutParams layoutParams = accordionView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart((size - i4) - i3);
        accordionView.setLayoutParams(layoutParams2);
    }
}
