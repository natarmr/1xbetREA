package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes3.dex */
public final class z6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f43881a;
    public final s1g b;
    public final int c;
    public final TextPaint d;
    public final int e;
    public final int f;
    public final Paint g;
    public final Path h;
    public final RectF i;
    public final int j;
    public final int k;
    public final int l;
    public final ImageView m;
    public final DsTag n;
    public final int o;
    public boolean p;
    public final int q;
    public float r;
    public float s;
    public String t;
    public boolean u;
    public StaticLayout v;

    public z6p0(FrameLayout frameLayout, int i) {
        this.f43881a = frameLayout;
        s1g s1gVar = new s1g(frameLayout, i);
        s1gVar.c(frameLayout.getResources().getDimension(R.dimen.corner_radius_8));
        this.b = s1gVar;
        this.c = frameLayout.getResources().getDimensionPixelSize(R.dimen.space_8);
        TextPaint textPaint = new TextPaint(1);
        Context context = frameLayout.getContext();
        context.getClass();
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_M);
        textPaint.setColor(-1);
        textPaint.setTextSize(frameLayout.getResources().getDimension(R.dimen.text_10));
        this.d = textPaint;
        Context context2 = frameLayout.getContext();
        context2.getClass();
        this.e = context2.getColor(R.color.dota_radiant_color);
        Context context3 = frameLayout.getContext();
        context3.getClass();
        this.f = context3.getColor(R.color.dota_dire_color);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.g = paint;
        this.h = new Path();
        this.i = new RectF();
        this.j = frameLayout.getResources().getDimensionPixelSize(R.dimen.size_8);
        this.k = frameLayout.getResources().getDimensionPixelSize(R.dimen.radius_full);
        int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(R.dimen.size_16);
        this.l = dimensionPixelSize;
        ImageView imageView = new ImageView(frameLayout.getContext());
        frameLayout.addView(imageView, new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        this.m = imageView;
        Context context4 = frameLayout.getContext();
        context4.getClass();
        DsTag dsTag = new DsTag(context4, null, 6, 0);
        dsTag.setGravity(17);
        dsTag.setStyle(R.style.Widget_DSTag_RectangularS_WhiteTransparent);
        dsTag.setText(R.string.cyber_win);
        this.n = dsTag;
        this.o = frameLayout.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.q = frameLayout.getResources().getDimensionPixelSize(R.dimen.size_32);
        this.t = "";
        this.u = true;
    }

    public final void a(Canvas canvas) {
        canvas.getClass();
        this.b.a(canvas);
        if (this.u) {
            canvas.drawPath(this.h, this.g);
        }
        float f = this.r;
        float f2 = this.s;
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            StaticLayout staticLayout = this.v;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
            canvas.restoreToCount(iSave);
            ImageView imageView = this.m;
            float left = imageView.getLeft();
            float top = imageView.getTop();
            int iSave2 = canvas.save();
            canvas.translate(left, top);
            try {
                imageView.draw(canvas);
                canvas.restoreToCount(iSave2);
                if (this.p) {
                    DsTag dsTag = this.n;
                    float left2 = dsTag.getLeft();
                    float top2 = dsTag.getTop();
                    int iSave3 = canvas.save();
                    canvas.translate(left2, top2);
                    try {
                        dsTag.draw(canvas);
                    } finally {
                        canvas.restoreToCount(iSave3);
                    }
                }
            } catch (Throwable th) {
                canvas.restoreToCount(iSave2);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.b.b(i, i2, i3, i4);
        StaticLayout staticLayout = this.v;
        int width = staticLayout != null ? staticLayout.getWidth() : 0;
        FrameLayout frameLayout = this.f43881a;
        int layoutDirection = frameLayout.getLayoutDirection();
        int i5 = this.l;
        int i6 = this.c;
        int i7 = layoutDirection == 0 ? i + i6 : (i3 - i6) - i5;
        int i8 = i2 + i6;
        this.m.layout(i7, i8, i7 + i5, i2 + i5 + i6);
        int i9 = (i6 * 2) + i5;
        this.r = frameLayout.getLayoutDirection() == 0 ? i + i9 : (i3 - i9) - width;
        StaticLayout staticLayout2 = this.v;
        int height = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        int i10 = this.q;
        this.s = hne.d(i10, height, 2, i2);
        int layoutDirection2 = frameLayout.getLayoutDirection();
        int i11 = this.j;
        int i12 = layoutDirection2 == 0 ? (i3 - i11) - i6 : i + i6;
        int i13 = ((i10 / 2) + i2) - (i11 / 2);
        if (this.u) {
            RectF rectF = this.i;
            rectF.set(i12, i13, i12 + i11, i13 + i11);
            float f = this.k;
            this.h.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
        if (this.p) {
            int layoutDirection3 = frameLayout.getLayoutDirection();
            DsTag dsTag = this.n;
            int i14 = this.o;
            bcm0.s(dsTag, layoutDirection3 == 0 ? hne.D(i, i9, width, i14) : (((i3 - i9) - width) - i14) - dsTag.getMeasuredWidth(), i8);
        }
    }

    public final void c(int i) {
        boolean z = this.p;
        DsTag dsTag = this.n;
        if (z) {
            bcm0.u(dsTag);
        }
        int i2 = this.l;
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        int measuredWidth = (((i - (this.c * 4)) - this.j) - i2) - (this.p ? dsTag.getMeasuredWidth() + this.o : 0);
        String str = this.t;
        TextPaint textPaint = this.d;
        this.v = xdx.I(this.t, textPaint, Math.min(measuredWidth, (int) textPaint.measureText(str)), 2, TextUtils.TruncateAt.END, 0, this.f43881a.getLayoutDirection() == 0 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1520);
    }

    public final void d(String str, String str2, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        List list = u0d.f34849a;
        u0d.n(this.m, str, R.drawable.icon_globe_empty, 3);
        Paint paint = this.g;
        if (z) {
            paint.setColor(this.e);
        } else {
            paint.setColor(this.f);
        }
        this.t = str2;
        this.u = z2;
        this.p = z3;
    }
}
