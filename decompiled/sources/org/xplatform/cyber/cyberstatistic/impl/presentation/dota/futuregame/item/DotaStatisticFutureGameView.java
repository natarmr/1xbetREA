package org.xplatform.cyber.cyberstatistic.impl.presentation.dota.futuregame.item;

import a.lrk;
import a.maz;
import a.n0o0;
import a.r7x;
import a.sj3;
import a.u0d;
import a.xdx;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DotaStatisticFutureGameView extends FrameLayout {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46493a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final n0o0 f;
    public final TextPaint g;
    public StaticLayout h;
    public String i;
    public float j;
    public float k;
    public final TextPaint l;
    public StaticLayout m;
    public String n;
    public float o;
    public float p;
    public final TextPaint q;
    public StaticLayout r;
    public String s;
    public float t;
    public float u;
    public final TextPaint v;
    public StaticLayout w;
    public String x;
    public float y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotaStatisticFutureGameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setWillNotDraw(false);
        setBackground(context.getDrawable(R.drawable.dota_statistic_future_game_item_bg));
        this.f46493a = context.getResources().getDimensionPixelSize(R.dimen.size_62);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.size_24);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.space_6);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = maz.b(new lrk(context, this, (byte) 6));
        TextPaint textPaint = new TextPaint(1);
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_M);
        textPaint.setColor(context.getColor(R.color.static_white_80));
        textPaint.setTextSize(getResources().getDimension(R.dimen.text_12));
        this.g = textPaint;
        this.i = "";
        TextPaint textPaint2 = new TextPaint(1);
        r7x.r(textPaint2, context, R.style.TextStyle_Caption_Medium_M);
        textPaint2.setColor(context.getColor(R.color.static_white));
        textPaint2.setTextSize(getResources().getDimension(R.dimen.text_12));
        this.l = textPaint2;
        this.n = "";
        TextPaint textPaint3 = new TextPaint(1);
        r7x.r(textPaint3, context, R.style.TextStyle_Caption_Medium_M);
        textPaint3.setColor(context.getColor(R.color.static_white));
        textPaint3.setTextSize(getResources().getDimension(R.dimen.text_16));
        this.q = textPaint3;
        this.s = "";
        TextPaint textPaint4 = new TextPaint(1);
        r7x.r(textPaint4, context, R.style.TextStyle_Caption_Medium_M);
        textPaint4.setColor(context.getColor(R.color.static_white));
        textPaint4.setTextSize(getResources().getDimension(R.dimen.text_16));
        this.v = textPaint4;
        this.x = "";
    }

    private final ImageView getTeamImage() {
        return (ImageView) this.f.getValue();
    }

    public final void a(String str, String str2) {
        str.getClass();
        List list = u0d.f34849a;
        u0d.n(getTeamImage(), str2, R.drawable.icon_globe_empty, 3);
        this.n = str;
    }

    public final String getChampNameForTest() {
        return this.i;
    }

    public final String getDateForTest() {
        return this.x;
    }

    public final String getTeamNameForTest() {
        return this.n;
    }

    public final String getTimeForTest() {
        return this.s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.j, this.k);
        StaticLayout staticLayout = this.h;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.translate(this.o, this.p);
        StaticLayout staticLayout2 = this.m;
        if (staticLayout2 != null) {
            staticLayout2.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.translate(this.y, this.z);
        StaticLayout staticLayout3 = this.w;
        if (staticLayout3 != null) {
            staticLayout3.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        canvas.translate(this.t, this.u);
        StaticLayout staticLayout4 = this.r;
        if (staticLayout4 != null) {
            staticLayout4.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float height;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f46493a;
        ImageView teamImage = getTeamImage();
        int i4 = this.b;
        measureChild(teamImage, View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        setMeasuredDimension(size, size2 + i3);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.e;
        int i6 = measuredWidth - (i5 * 2);
        String str = this.i;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayoutI = xdx.I(str, this.g, i6, 1, truncateAt, i6, alignment, 496);
        this.h = staticLayoutI;
        this.j = (getMeasuredWidth() - staticLayoutI.getWidth()) / 2.0f;
        int i7 = this.c;
        this.k = i7;
        String str2 = this.x;
        TextPaint textPaint = this.v;
        int iMeasureText = (int) textPaint.measureText(str2);
        this.w = xdx.I(this.x, textPaint, iMeasureText, 1, truncateAt, getMeasuredWidth(), alignment, 496);
        this.y = (getMeasuredWidth() / 2.0f) - (iMeasureText / 2.0f);
        float fAscent = ((textPaint.ascent() + textPaint.descent()) / 2.0f) + (getMeasuredHeight() / 2);
        float f = this.d;
        this.z = fAscent + f;
        String str3 = this.s;
        TextPaint textPaint2 = this.q;
        int iMeasureText2 = (int) textPaint2.measureText(str3);
        this.r = xdx.I(this.s, textPaint2, iMeasureText2, 1, truncateAt, getMeasuredWidth(), alignment, 496);
        this.t = (getMeasuredWidth() - i5) - iMeasureText2;
        this.u = ((textPaint2.ascent() + textPaint2.descent()) / 2.0f) + (getMeasuredHeight() / 2) + f;
        int i8 = (size / 3) - i4;
        StaticLayout staticLayoutI2 = xdx.I(this.n, this.l, i8, 2, truncateAt, i8, Layout.Alignment.ALIGN_NORMAL, 496);
        this.m = staticLayoutI2;
        this.o = (i5 * 2.0f) + i4;
        if (staticLayoutI2.getLineCount() == 2) {
            float measuredHeight = getMeasuredHeight();
            StaticLayout staticLayout = this.h;
            height = measuredHeight - (staticLayout != null ? staticLayout.getHeight() : 0.0f);
        } else {
            height = i3;
        }
        this.p = height / 2.0f;
        StaticLayout staticLayout2 = this.h;
        if (staticLayout2 != null) {
            sj3.L0(getTeamImage(), this.e, staticLayout2.getHeight() + (i7 * 2), 0, 0, 12);
        }
    }

    public final void setChampName(String str) {
        str.getClass();
        this.i = str;
    }

    public final void setDate(String str) {
        str.getClass();
        this.x = str;
    }

    public final void setTime(String str) {
        str.getClass();
        this.s = str;
    }
}
