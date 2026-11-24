package a;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class csg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xqg0 f4887a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public gz40 f;
    public gz40 g;
    public boolean h;

    public csg0(csg0 csg0Var) {
        this.b = csg0Var.b;
        this.c = csg0Var.c;
        this.d = new Paint(csg0Var.d);
        this.e = new Paint(csg0Var.e);
        gz40 gz40Var = csg0Var.f;
        if (gz40Var != null) {
            this.f = new gz40(gz40Var);
        }
        gz40 gz40Var2 = csg0Var.g;
        if (gz40Var2 != null) {
            this.g = new gz40(gz40Var2);
        }
        this.h = csg0Var.h;
        try {
            this.f4887a = (xqg0) csg0Var.f4887a.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.f4887a = xqg0.a();
        }
    }

    public csg0() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f4887a = xqg0.a();
    }
}
