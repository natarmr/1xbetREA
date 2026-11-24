package a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class bsg0 extends x2x {
    public final /* synthetic */ byte b;
    public float c;
    public final float d;
    public final /* synthetic */ esg0 e;
    public final Object f;

    public bsg0(esg0 esg0Var, float f, float f2) {
        this.b = (byte) 1;
        this.e = esg0Var;
        this.f = new RectF();
        this.c = f;
        this.d = f2;
    }

    @Override // a.x2x
    public final boolean Q(qrg0 qrg0Var) {
        switch (this.b) {
            case 0:
                if (!(qrg0Var instanceof rrg0)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(qrg0Var instanceof rrg0)) {
                    return true;
                }
                rrg0 rrg0Var = (rrg0) qrg0Var;
                drg0 drg0VarL = qrg0Var.f10017a.L(rrg0Var.n);
                if (drg0VarL == null) {
                    esg0.E("TextPath path reference '%s' not found", rrg0Var.n);
                    return false;
                }
                pqg0 pqg0Var = (pqg0) drg0VarL;
                yrg0 yrg0Var = new yrg0(pqg0Var.o);
                Matrix matrix = pqg0Var.n;
                Path path = yrg0Var.f43120a;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.f).union(rectF);
                return false;
        }
    }

    @Override // a.x2x
    public final void k0(String str) {
        String str2;
        byte b = this.b;
        Object obj = this.f;
        esg0 esg0Var = this.e;
        switch (b) {
            case 0:
                if (esg0Var.J0()) {
                    Path path = new Path();
                    str2 = str;
                    ((csg0) esg0Var.c).d.getTextPath(str2, 0, str.length(), this.c, this.d, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.c = ((csg0) esg0Var.c).d.measureText(str2) + this.c;
                break;
            default:
                if (esg0Var.J0()) {
                    Rect rect = new Rect();
                    ((csg0) esg0Var.c).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.c, this.d);
                    ((RectF) obj).union(rectF);
                }
                this.c = ((csg0) esg0Var.c).d.measureText(str) + this.c;
                break;
        }
    }

    public bsg0(esg0 esg0Var, float f, float f2, Path path) {
        this.b = (byte) 0;
        this.e = esg0Var;
        this.c = f;
        this.d = f2;
        this.f = path;
    }
}
