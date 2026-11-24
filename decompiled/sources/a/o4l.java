package a;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o4l extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24642a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public int j;
    public final ImageView k;
    public final m4l l;
    public final s1g m;
    public String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4l(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f24642a = getResources().getDimensionPixelSize(R.dimen.size_62);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_6);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_4);
        this.f = context.getResources().getBoolean(R.bool.isTablet);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.h = getResources().getDimensionPixelSize(R.dimen.size_2);
        this.i = getResources().getDimensionPixelSize(R.dimen.size_4);
        ImageView imageView = new ImageView(context);
        addView(imageView);
        this.k = imageView;
        m4l m4lVar = new m4l(context);
        addView(m4lVar);
        this.l = m4lVar;
        s1g s1gVar = new s1g(this, R.color.static_black_40);
        s1gVar.c(context.getResources().getDimension(R.dimen.corner_radius_8));
        this.m = s1gVar;
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final int getImageStartPadding() {
        return this.g;
    }

    public final int getTotal() {
        return this.j;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        this.m.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5 = i4 - i2;
        this.m.b(0, 0, getMeasuredWidth(), i5);
        int i6 = this.g;
        int i7 = this.c;
        int i8 = i6 + i7;
        cww.z(i6, i6, i8, i6 + i7, this.k, this);
        m4l m4lVar = this.l;
        boolean z2 = this.f;
        int i9 = this.g;
        if (z2) {
            int i10 = i8 + i9;
            measuredWidth = ((((getMeasuredWidth() - i9) - i10) - m4lVar.getMeasuredWidth()) / 2) + i10;
        } else {
            measuredWidth = (i9 * 2) + i7;
        }
        int measuredHeight = (i5 - m4lVar.getMeasuredHeight()) / 2;
        m4l m4lVar2 = this.l;
        cww.z(measuredWidth, measuredHeight, m4lVar2.getMeasuredWidth() + measuredWidth, m4lVar.getMeasuredHeight() + measuredHeight, m4lVar2, this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.c;
        this.k.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        boolean z = this.f;
        m4l m4lVar = this.l;
        int i4 = this.b;
        if (z) {
            int i5 = this.f24642a;
            m4lVar.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            setMeasuredDimension(i5, i4);
        } else {
            int iCeil = (int) Math.ceil(((double) this.j) / 4.0d);
            if (iCeil < 1) {
                iCeil = 1;
            }
            int i6 = ((iCeil - 1) * this.h) + (this.i * iCeil);
            m4lVar.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            int i7 = this.g;
            setMeasuredDimension(hne.D(i3 + i7, this.d, i6, i7), i4);
        }
        setTag("DotaHeroSkillView");
    }

    public final void setTotal(int i) {
        this.j = i;
    }
}
