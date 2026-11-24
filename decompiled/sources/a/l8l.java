package a;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class l8l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7l f19610a;
    public final i8l b;
    public final a8z c;
    public final a8z d;
    public final RectF e;
    public final Rect f;
    public int g;
    public boolean h;
    public boolean i;

    public l8l(p7l p7lVar, i8l i8lVar) {
        this.f19610a = p7lVar;
        this.b = i8lVar;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.k8l
            public final /* synthetic */ l8l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                l8l l8lVar = this.b;
                switch (b2) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        Context context = l8lVar.b.getContext();
                        context.getClass();
                        paint.setColor(context.getColor(R.color.static_black_40));
                        paint.setStyle(Paint.Style.FILL);
                        return paint;
                    default:
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        Context context2 = l8lVar.b.getContext();
                        context2.getClass();
                        paint2.setColor(context2.getColor(R.color.dota_statistic_bg));
                        paint2.setStyle(Paint.Style.FILL);
                        return paint2;
                }
            }
        };
        wez wezVar = wez.b;
        this.c = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.d = maz.a(wezVar, new Function0(this) { // from class: a.k8l
            public final /* synthetic */ l8l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                l8l l8lVar = this.b;
                switch (b3) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        Context context = l8lVar.b.getContext();
                        context.getClass();
                        paint.setColor(context.getColor(R.color.static_black_40));
                        paint.setStyle(Paint.Style.FILL);
                        return paint;
                    default:
                        Paint paint2 = new Paint();
                        paint2.setAntiAlias(true);
                        Context context2 = l8lVar.b.getContext();
                        context2.getClass();
                        paint2.setColor(context2.getColor(R.color.dota_statistic_bg));
                        paint2.setStyle(Paint.Style.FILL);
                        return paint2;
                }
            }
        });
        this.e = new RectF();
        this.f = new Rect();
    }

    public static void a(RectF rectF, ViewGroup viewGroup, float f, float f2, float f3, float f4) {
        if (viewGroup.getLayoutDirection() == 0) {
            rectF.set(f, f2, f3, f4);
        } else {
            rectF.set(viewGroup.getMeasuredWidth() - f3, f2, viewGroup.getMeasuredWidth() - f, f4);
        }
    }
}
