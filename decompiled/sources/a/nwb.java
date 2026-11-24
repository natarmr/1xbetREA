package a;

import android.content.Context;
import android.graphics.Paint;
import android.util.TypedValue;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class nwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24227a;
    public final byte b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final byte t;
    public String[] u;
    public String[] v;

    public nwb(Context context) {
        context.getClass();
        TypedValue typedValue = j5d.f15927a;
        int iA = j5d.a(context, R.attr.uikitSecondary, false);
        this.f24227a = (byte) 14;
        this.b = (byte) 12;
        this.c = true;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        Paint paint = new Paint();
        paint.setColor(j5d.a(context, R.attr.uikitSeparator, false));
        paint.setStrokeWidth(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        this.i = paint;
        Paint paint2 = new Paint();
        paint2.setColor(j5d.a(context, R.attr.uikitSeparator, false));
        paint2.setStrokeWidth(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        this.j = paint2;
        this.k = new Paint();
        this.l = new Paint();
        Paint paint3 = new Paint();
        paint3.setColor(iA);
        paint3.setAntiAlias(true);
        paint3.setTextSize(context.getResources().getDimension(R.dimen.text_12));
        this.m = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(iA);
        paint4.setAntiAlias(true);
        paint4.setTextSize(context.getResources().getDimension(R.dimen.text_12));
        this.n = paint4;
        this.o = b8k0.z(context, 5.0f);
        this.p = b8k0.z(context, 8.0f);
        this.q = b8k0.z(context, 20.0f);
        this.r = b8k0.z(context, 6.0f);
        this.s = b8k0.z(context, 6.0f);
        this.t = (byte) 24;
    }
}
