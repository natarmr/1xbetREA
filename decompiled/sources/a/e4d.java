package a;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e4d extends emy {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4d(List list, byte b) {
        super(list);
        this.i = b;
    }

    @Override // a.sz5
    public final Object f(cmy cmyVar, float f) {
        int iIntValue;
        int iIntValue2;
        Integer num;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(cmyVar, f));
            case 1:
                Object obj2 = cmyVar.b;
                if (obj2 == null) {
                    jf4.n("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = cmyVar.c;
                if (obj3 == null) {
                    iIntValue = cmyVar.k;
                    if (iIntValue == 784923401) {
                        iIntValue = ((Integer) obj2).intValue();
                        cmyVar.k = iIntValue;
                    }
                } else {
                    int i = cmyVar.l;
                    if (i == 784923401) {
                        iIntValue = ((Integer) obj3).intValue();
                        cmyVar.l = iIntValue;
                    } else {
                        iIntValue = i;
                    }
                }
                int i2 = iIntValue;
                zn00 zn00Var = this.e;
                if (zn00Var == null || (num = (Integer) zn00Var.L0(cmyVar.g, cmyVar.h.floatValue(), (Integer) obj2, Integer.valueOf(i2), f, d(), this.d)) == null) {
                    int iIntValue3 = cmyVar.k;
                    if (iIntValue3 == 784923401) {
                        iIntValue3 = ((Integer) obj2).intValue();
                        cmyVar.k = iIntValue3;
                    }
                    PointF pointF = ah40.f855a;
                    iIntValue2 = (int) ((f * (i2 - iIntValue3)) + iIntValue3);
                } else {
                    iIntValue2 = num.intValue();
                }
                return Integer.valueOf(iIntValue2);
            default:
                Object obj4 = cmyVar.b;
                zn00 zn00Var2 = this.e;
                if (zn00Var2 == null) {
                    return (f != 1.0f || (obj = cmyVar.c) == null) ? (uxk) obj4 : (uxk) obj;
                }
                float f2 = cmyVar.g;
                Float f3 = cmyVar.h;
                float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
                uxk uxkVar = (uxk) obj4;
                Object obj5 = cmyVar.c;
                return (uxk) zn00Var2.L0(f2, fFloatValue, uxkVar, obj5 == null ? uxkVar : (uxk) obj5, f, c(), this.d);
        }
    }

    public int l(cmy cmyVar, float f) {
        float f2;
        Float f3;
        Object obj = cmyVar.b;
        Object obj2 = cmyVar.b;
        if (obj == null || cmyVar.c == null) {
            jf4.n("Missing values for keyframe.");
            return 0;
        }
        zn00 zn00Var = this.e;
        if (zn00Var == null || (f3 = cmyVar.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) zn00Var.L0(cmyVar.g, f3.floatValue(), (Integer) obj2, (Integer) cmyVar.c, f2, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return mbc.S(((Integer) obj2).intValue(), ah40.b(f2, 0.0f, 1.0f), ((Integer) cmyVar.c).intValue());
    }
}
