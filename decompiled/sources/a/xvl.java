package a;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class xvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41565a;
    public final wej b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final RectF g;
    public final RectF h;
    public final float i;
    public final Paint j;
    public final Paint k;
    public final n0o0 l;
    public final Rect m;
    public final Rect n;
    public final Drawable o;
    public final Drawable p;

    public xvl(Context context, wej wejVar) {
        context.getClass();
        this.f41565a = context;
        this.b = wejVar;
        this.c = m5d.b(R.attr.uikitPrimary, context);
        this.d = m5d.b(R.attr.uikitStaticTransparent, context);
        this.e = m5d.b(R.attr.uikitSecondary60, context);
        this.f = m5d.b(R.attr.uikitWarning, context);
        this.g = new RectF(d(R.dimen.space_10), d(R.dimen.space_10), d(R.dimen.space_30), d(R.dimen.space_30));
        this.h = new RectF(d(R.dimen.space_1) + d(R.dimen.space_10), d(R.dimen.space_1) + d(R.dimen.space_10), d(R.dimen.space_30) - d(R.dimen.space_1), d(R.dimen.space_30) - d(R.dimen.space_1));
        this.i = context.getResources().getDimensionPixelSize(R.dimen.radius_6);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.size_2));
        this.j = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        this.k = paint2;
        this.l = maz.b(wvl.f39842a);
        this.m = new Rect(e(R.dimen.space_8), e(R.dimen.space_8), e(R.dimen.space_32), e(R.dimen.space_32));
        this.n = new Rect(e(R.dimen.space_20), e(R.dimen.space_20), e(R.dimen.space_20), e(R.dimen.space_20));
        this.o = epv0.U(R.drawable.ic_glyph_check_ios, context);
        this.p = epv0.U(R.drawable.ic_glyph_indeterminate_ios, context);
    }

    public final AnimatorSet a(boolean z) {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = z ? new Pair(fValueOf2, fValueOf) : new Pair(fValueOf, fValueOf2);
        return ((zvl) this.l.getValue()).a(((Number) pair.f46059a).floatValue(), ((Number) pair.b).floatValue(), new vvl(this, (byte) 0));
    }

    public final AnimatorSet b(boolean z) {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = z ? new Pair(fValueOf2, fValueOf) : new Pair(fValueOf, fValueOf2);
        return ((zvl) this.l.getValue()).a(((Number) pair.f46059a).floatValue(), ((Number) pair.b).floatValue(), new vvl(this, (byte) 2));
    }

    public final AnimatorSet c(boolean z) {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = z ? new Pair(fValueOf2, fValueOf) : new Pair(fValueOf, fValueOf2);
        return ((zvl) this.l.getValue()).a(((Number) pair.f46059a).floatValue(), ((Number) pair.b).floatValue(), new vvl(this, (byte) 1));
    }

    public final float d(int i) {
        return this.f41565a.getResources().getDimensionPixelOffset(i);
    }

    public final int e(int i) {
        return this.f41565a.getResources().getDimensionPixelSize(i);
    }

    public final void f(Drawable drawable, float f) {
        Rect bounds = drawable.getBounds();
        Rect rect = this.n;
        int i = rect.left;
        Rect rect2 = this.m;
        bounds.left = (int) (((rect2.left - i) * f) + i);
        Rect bounds2 = drawable.getBounds();
        int i2 = rect.top;
        bounds2.top = (int) (((rect2.top - i2) * f) + i2);
        Rect bounds3 = drawable.getBounds();
        int i3 = rect.right;
        bounds3.right = (int) (((rect2.right - i3) * f) + i3);
        Rect bounds4 = drawable.getBounds();
        int i4 = rect.bottom;
        bounds4.bottom = (int) (((rect2.bottom - i4) * f) + i4);
    }

    public final void g(awl awlVar, boolean z, boolean z2) {
        int iE;
        awlVar.getClass();
        int i = this.f;
        int i2 = this.e;
        if (z2) {
            iE = z ? i : this.c;
        } else {
            iE = i2;
        }
        awl awlVar2 = awl.STATE_UNCHECKED;
        if (awlVar == awlVar2) {
            iE = k5d.e(iE, 0);
        }
        this.k.setColor(iE);
        if (!z2 && awlVar != awlVar2) {
            i = this.d;
        } else if (!z2 || !z) {
            i = i2;
        }
        this.j.setColor(i);
        Rect rect = this.n;
        Rect rect2 = this.m;
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setBounds(awlVar == awl.STATE_CHECKED ? rect2 : rect);
        }
        Drawable drawable2 = this.p;
        if (drawable2 != null) {
            if (awlVar == awl.STATE_INDETERMINATE) {
                rect = rect2;
            }
            drawable2.setBounds(rect);
        }
        this.b.invoke();
    }
}
