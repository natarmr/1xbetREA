package a;

/* JADX INFO: loaded from: classes.dex */
public final class hlq extends emy {
    @Override // a.sz5
    public final Object f(cmy cmyVar, float f) {
        return Float.valueOf(m(cmyVar, f));
    }

    public final float l() {
        return m(this.c.b(), c());
    }

    public final float m(cmy cmyVar, float f) {
        float f2;
        Object obj = cmyVar.b;
        Object obj2 = cmyVar.b;
        if (obj == null || cmyVar.c == null) {
            jf4.n("Missing values for keyframe.");
            return 0.0f;
        }
        zn00 zn00Var = this.e;
        if (zn00Var != null) {
            f2 = f;
            Float f3 = (Float) zn00Var.L0(cmyVar.g, cmyVar.h.floatValue(), (Float) obj2, (Float) cmyVar.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = cmyVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj2).floatValue();
            cmyVar.i = fFloatValue;
        }
        float fFloatValue2 = cmyVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) cmyVar.c).floatValue();
            cmyVar.j = fFloatValue2;
        }
        return ah40.f(fFloatValue, fFloatValue2, f2);
    }
}
