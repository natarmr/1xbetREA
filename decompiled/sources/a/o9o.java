package a;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public final class o9o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tpt0 f24888a;
    public final p7d b;
    public final Range c;
    public final boolean d;
    public final Rational e;
    public odd f;
    public n9o g;

    public o9o(l1a l1aVar, tpt0 tpt0Var, p7d p7dVar) {
        Integer num;
        Rational rational;
        l1aVar.getClass();
        tpt0Var.getClass();
        p7dVar.getClass();
        this.f24888a = tpt0Var;
        this.b = p7dVar;
        c1a c1aVar = l1aVar.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        key.getClass();
        Object obj = l9o.f19664a;
        ow9 ow9Var = (ow9) c1aVar;
        ow9Var.getClass();
        Object objC = ow9Var.c(key);
        obj = objC != null ? objC : obj;
        obj.getClass();
        Range range = (Range) obj;
        this.c = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.d = z;
        if (z) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            key2.getClass();
            Object objC2 = ((ow9) c1aVar).c(key2);
            objC2.getClass();
            rational = (Rational) objC2;
        } else {
            rational = Rational.ZERO;
            rational.getClass();
        }
        this.e = rational;
    }
}
