package a;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ayf implements yjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ene f1668a;
    public final ene b;
    public final ene c;
    public final ene d;

    public ayf() {
        zcl zclVar = qmk.i;
        zcl zclVar2 = qmk.f28987a;
        this.f1668a = zclVar;
        this.b = zclVar;
        this.c = zclVar2;
        this.d = zclVar2;
    }

    @Override // a.yjj0
    public final x1x a(long j, k6z k6zVar, w6k w6kVar) {
        k6zVar.getClass();
        w6kVar.getClass();
        k6z k6zVar2 = k6z.f17794a;
        ene eneVar = this.d;
        ene eneVar2 = this.c;
        ene eneVar3 = this.b;
        ene eneVar4 = this.f1668a;
        List listJ = k6zVar == k6zVar2 ? q3d.j(Float.valueOf(eneVar4.a(j, w6kVar)), Float.valueOf(eneVar3.a(j, w6kVar)), Float.valueOf(eneVar2.a(j, w6kVar)), Float.valueOf(eneVar.a(j, w6kVar))) : q3d.j(Float.valueOf(eneVar2.a(j, w6kVar)), Float.valueOf(eneVar.a(j, w6kVar)), Float.valueOf(eneVar4.a(j, w6kVar)), Float.valueOf(eneVar3.a(j, w6kVar)));
        float fFloatValue = ((Number) listJ.get(0)).floatValue();
        float fFloatValue2 = ((Number) listJ.get(1)).floatValue();
        float fFloatValue3 = ((Number) listJ.get(2)).floatValue();
        float fFloatValue4 = ((Number) listJ.get(3)).floatValue();
        w03 w03VarA = z03.a();
        Path path = w03VarA.f38329a;
        w03VarA.f(fFloatValue, 0.0f);
        int i = (int) (j >> 32);
        w03VarA.e(Float.intBitsToFloat(i) - fFloatValue3, 0.0f);
        float f = fFloatValue3 * 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat(i) - f;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        RectF rectF = w03VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            w03VarA.b = rectF;
        }
        rectF.set(fIntBitsToFloat, 0.0f, fIntBitsToFloat2, f);
        RectF rectF2 = w03VarA.b;
        rectF2.getClass();
        path.arcTo(rectF2, 270.0f, 90.0f, false);
        int i2 = (int) (j & 4294967295L);
        w03VarA.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - fFloatValue4);
        float f2 = fFloatValue4 * 2.0f;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - f2;
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2) - f2;
        float fIntBitsToFloat5 = Float.intBitsToFloat(i);
        float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
        RectF rectF3 = w03VarA.b;
        if (rectF3 == null) {
            rectF3 = new RectF();
            w03VarA.b = rectF3;
        }
        rectF3.set(fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6);
        RectF rectF4 = w03VarA.b;
        rectF4.getClass();
        path.arcTo(rectF4, 0.0f, 90.0f, false);
        w03VarA.e(fFloatValue2, Float.intBitsToFloat(i2));
        float f3 = fFloatValue2 * 2.0f;
        float fIntBitsToFloat7 = Float.intBitsToFloat(i2) - f3;
        float fIntBitsToFloat8 = Float.intBitsToFloat(i2);
        RectF rectF5 = w03VarA.b;
        if (rectF5 == null) {
            rectF5 = new RectF();
            w03VarA.b = rectF5;
        }
        rectF5.set(0.0f, fIntBitsToFloat7, f3, fIntBitsToFloat8);
        RectF rectF6 = w03VarA.b;
        rectF6.getClass();
        path.arcTo(rectF6, 90.0f, 90.0f, false);
        w03VarA.e(0.0f, fFloatValue);
        float f4 = 2.0f * fFloatValue;
        RectF rectF7 = w03VarA.b;
        if (rectF7 == null) {
            rectF7 = new RectF();
            w03VarA.b = rectF7;
        }
        rectF7.set(0.0f, 0.0f, f4, f4);
        RectF rectF8 = w03VarA.b;
        rectF8.getClass();
        path.arcTo(rectF8, 180.0f, 90.0f, false);
        w03VarA.c();
        return new ne80(w03VarA);
    }
}
