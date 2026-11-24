package a;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public class asg0 extends x2x {
    public float b;
    public float c;
    public final /* synthetic */ esg0 d;

    public asg0(esg0 esg0Var, float f, float f2) {
        this.d = esg0Var;
        this.b = f;
        this.c = f2;
    }

    @Override // a.x2x
    public void k0(String str) {
        esg0 esg0Var = this.d;
        Canvas canvas = (Canvas) esg0Var.f8326a;
        if (esg0Var.J0()) {
            csg0 csg0Var = (csg0) esg0Var.c;
            if (csg0Var.b) {
                canvas.drawText(str, this.b, this.c, csg0Var.d);
            }
            csg0 csg0Var2 = (csg0) esg0Var.c;
            if (csg0Var2.c) {
                canvas.drawText(str, this.b, this.c, csg0Var2.e);
            }
        }
        this.b = ((csg0) esg0Var.c).d.measureText(str) + this.b;
    }
}
