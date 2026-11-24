package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l7l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9l f19564a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final a8z t;
    public final a8z u;
    public boolean m = true;
    public boolean n = true;
    public final RectF s = new RectF();

    public l7l(d9l d9lVar) {
        this.f19564a = d9lVar;
        this.b = d9lVar.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.c = d9lVar.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = d9lVar.getContext().getResources().getDimension(R.dimen.corner_radius_8);
        this.e = d9lVar.getContext().getResources().getDimension(R.dimen.corner_radius_16);
        this.f = d9lVar.getResources().getDimensionPixelSize(R.dimen.size_216);
        this.g = d9lVar.getResources().getDimensionPixelSize(R.dimen.size_28);
        this.h = d9lVar.getResources().getDimensionPixelSize(R.dimen.space_108);
        final byte b = 1;
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.k7l
            public final /* synthetic */ l7l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                l7l l7lVar = this.b;
                switch (b3) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        Context context = l7lVar.f19564a.getContext();
                        context.getClass();
                        paint.setColor(context.getColor(R.color.static_black_40));
                        paint.setStyle(Paint.Style.FILL);
                        return paint;
                    default:
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        Context context2 = l7lVar.f19564a.getContext();
                        context2.getClass();
                        paint2.setColor(context2.getColor(R.color.dota_statistic_bg));
                        paint2.setStyle(Paint.Style.FILL);
                        return paint2;
                }
            }
        };
        wez wezVar = wez.b;
        this.t = maz.a(wezVar, function0);
        this.u = maz.a(wezVar, new Function0(this) { // from class: a.k7l
            public final /* synthetic */ l7l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                l7l l7lVar = this.b;
                switch (b3) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        Context context = l7lVar.f19564a.getContext();
                        context.getClass();
                        paint.setColor(context.getColor(R.color.static_black_40));
                        paint.setStyle(Paint.Style.FILL);
                        return paint;
                    default:
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        Context context2 = l7lVar.f19564a.getContext();
                        context2.getClass();
                        paint2.setColor(context2.getColor(R.color.dota_statistic_bg));
                        paint2.setStyle(Paint.Style.FILL);
                        return paint2;
                }
            }
        });
    }

    public final void a(int i, Canvas canvas) {
        float f = i + 0.0f;
        float f2 = this.f + this.b;
        float f3 = this.l + i;
        float measuredHeight = this.f19564a.getMeasuredHeight();
        RectF rectF = this.s;
        rectF.set(f, f2, f3, measuredHeight);
        float f4 = this.d;
        canvas.drawRoundRect(rectF, f4, f4, b());
    }

    public final Paint b() {
        return (Paint) this.t.getValue();
    }
}
