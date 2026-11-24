package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class wu40 extends y960 implements Runnable {
    public static final z960 h;
    public final float[] b = new float[2];
    public xju0 c;
    public float d;
    public float e;
    public ywq0 f;
    public View g;

    static {
        z960 z960VarA = z960.a(2, new wu40(null, 0.0f, 0.0f, null, null));
        h = z960VarA;
        z960VarA.f = 0.5f;
    }

    public wu40(xju0 xju0Var, float f, float f2, ywq0 ywq0Var, View view) {
        this.c = xju0Var;
        this.d = f;
        this.e = f2;
        this.f = ywq0Var;
        this.g = view;
    }

    @Override // a.y960
    public final y960 a() {
        return new wu40(this.c, this.d, this.e, this.f, this.g);
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.d;
        float[] fArr = this.b;
        fArr[0] = f;
        fArr[1] = this.e;
        this.f.x(fArr);
        this.c.a(this.g, fArr);
        h.c(this);
    }
}
