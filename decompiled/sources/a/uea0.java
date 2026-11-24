package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uea0 implements hlp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f35516a;
    public final s1g b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final TextPaint m;
    public final TextPaint n;
    public final Rect o;
    public final Rect p;
    public final ImageView q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public uea0(FrameLayout frameLayout) {
        this.f35516a = frameLayout;
        s1g s1gVar = new s1g(frameLayout, R.color.static_black_40);
        s1gVar.c(frameLayout.getResources().getDimension(R.dimen.corner_radius_8));
        this.b = s1gVar;
        this.c = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.icon_size_42);
        this.d = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.icon_size_24);
        this.e = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.corner_radius_4);
        this.f = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.space_2);
        this.g = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.space_4);
        this.h = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.space_6);
        this.i = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.space_12);
        int dimensionPixelSize = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.text_12);
        this.j = dimensionPixelSize;
        int dimensionPixelSize2 = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.text_8);
        this.k = dimensionPixelSize2;
        this.l = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.size_14);
        TextPaint textPaint = new TextPaint();
        Context context = frameLayout.getContext();
        context.getClass();
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_L);
        textPaint.setAntiAlias(true);
        Context context2 = frameLayout.getContext();
        context2.getClass();
        textPaint.setColor(context2.getColor(R.color.static_white));
        textPaint.setTextSize(dimensionPixelSize);
        Paint.Style style = Paint.Style.FILL;
        textPaint.setStyle(style);
        this.m = textPaint;
        TextPaint textPaint2 = new TextPaint();
        Context context3 = frameLayout.getContext();
        context3.getClass();
        r7x.r(textPaint2, context3, R.style.TextStyle_Caption_Medium_S);
        textPaint2.setAntiAlias(true);
        Context context4 = frameLayout.getContext();
        context4.getClass();
        textPaint2.setColor(context4.getColor(R.color.static_white_60));
        textPaint2.setTextSize(dimensionPixelSize2);
        textPaint2.setStyle(style);
        this.n = textPaint2;
        this.o = new Rect();
        this.p = new Rect();
        this.q = new ImageView(frameLayout.getContext());
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
    }

    @Override // a.hlp0
    public final void a(int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - (this.j + this.k)) / 2;
        FrameLayout frameLayout = this.f35516a;
        int layoutDirection = frameLayout.getLayoutDirection();
        int i6 = this.h;
        int i7 = this.c;
        int i8 = this.g;
        int i9 = layoutDirection == 0 ? i + i8 : (i3 - i6) - i7;
        this.b.b(i, i2, i3, i4);
        int i10 = i2 + i8;
        this.q.layout(i9, i10, i9 + i7, this.d + i10);
        float f = this.z;
        String str = this.r;
        TextPaint textPaint = this.m;
        float fMeasureText = textPaint.measureText(str);
        String string = this.r;
        if (f < fMeasureText) {
            string = TextUtils.ellipsize(string, textPaint, this.z, TextUtils.TruncateAt.END).toString();
        }
        this.t = string;
        float f2 = this.z;
        String str2 = this.s;
        TextPaint textPaint2 = this.n;
        float fMeasureText2 = textPaint2.measureText(str2);
        String string2 = this.s;
        if (f2 < fMeasureText2) {
            string2 = TextUtils.ellipsize(string2, textPaint2, this.z, TextUtils.TruncateAt.END).toString();
        }
        this.u = string2;
        String str3 = this.r;
        int length = str3.length();
        Rect rect = this.o;
        textPaint.getTextBounds(str3, 0, length, rect);
        String str4 = this.s;
        int length2 = str4.length();
        Rect rect2 = this.p;
        textPaint2.getTextBounds(str4, 0, length2, rect2);
        int iHeight = (this.l - rect.height()) / 2;
        this.v = frameLayout.getLayoutDirection() == 1 ? ((((i3 - i8) - i7) - ((int) textPaint.measureText(this.t))) - i6) - i8 : hne.D(i, i8, i7, i6);
        this.w = (rect.height() / 2) + i2 + i5 + iHeight + this.f;
        this.x = frameLayout.getLayoutDirection() == 1 ? ((((i3 - i8) - i7) - rect2.width()) - i6) - i8 : hne.D(i, i8, i7, i6);
        this.y = i4 - i8;
    }

    @Override // a.hlp0
    public final void b(int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.c, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.d, 1073741824);
        ImageView imageView = this.q;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int i2 = this.g;
        this.z = (((i - i2) - imageView.getMeasuredWidth()) - this.i) - (i2 * 2);
    }

    @Override // a.hlp0
    public final void c(String str, String str2, String str3) {
        str3.getClass();
        ImageView imageView = this.q;
        ViewParent parent = imageView.getParent();
        FrameLayout frameLayout = this.f35516a;
        if (parent == null) {
            frameLayout.addView(imageView);
        }
        List list = u0d.f34849a;
        u0d.j(imageView, str, R.drawable.dota_statistic_hero_placeholder, 0, kotlin.collections.a.c(new j2x(this.e)), null, null, 492);
        this.r = str2;
        Context context = frameLayout.getContext();
        context.getClass();
        int color = context.getColor(R.color.static_white);
        TextPaint textPaint = this.m;
        textPaint.setColor(color);
        textPaint.setTextSize(this.j);
        this.s = str3;
    }

    @Override // a.hlp0
    public final void k(Canvas canvas) {
        canvas.getClass();
        this.b.a(canvas);
        canvas.drawText(this.t, this.v, this.w, this.m);
        canvas.drawText(this.u, this.x, this.y, this.n);
    }
}
