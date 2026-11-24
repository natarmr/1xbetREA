package a;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class zrg0 extends asg0 {
    public final Path e;
    public final /* synthetic */ esg0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrg0(esg0 esg0Var, Path path, float f) {
        super(esg0Var, f, 0.0f);
        this.f = esg0Var;
        this.e = path;
    }

    @Override // a.asg0, a.x2x
    public final void k0(String str) {
        esg0 esg0Var = this.f;
        if (esg0Var.J0()) {
            csg0 csg0Var = (csg0) esg0Var.c;
            if (csg0Var.b) {
                ((Canvas) esg0Var.f8326a).drawTextOnPath(str, this.e, this.b, this.c, csg0Var.d);
            }
            csg0 csg0Var2 = (csg0) esg0Var.c;
            if (csg0Var2.c) {
                ((Canvas) esg0Var.f8326a).drawTextOnPath(str, this.e, this.b, this.c, csg0Var2.e);
            }
        }
        this.b = ((csg0) esg0Var.c).d.measureText(str) + this.b;
    }
}
