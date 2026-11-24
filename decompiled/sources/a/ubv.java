package a;

import android.gov.nist.core.Separators;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ubv extends emy {
    public final /* synthetic */ byte i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubv(List list, byte b) {
        super(list);
        this.i = b;
        switch (b) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new m1h0();
                break;
            default:
                int iMax = 0;
                for (int i = 0; i < list.size(); i++) {
                    tbv tbvVar = (tbv) ((cmy) list.get(i)).b;
                    if (tbvVar != null) {
                        iMax = Math.max(iMax, tbvVar.b.length);
                    }
                }
                this.j = new tbv(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // a.sz5
    public final Object f(cmy cmyVar, float f) {
        Object obj;
        float f2;
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                tbv tbvVar = (tbv) obj2;
                tbv tbvVar2 = (tbv) cmyVar.b;
                tbv tbvVar3 = (tbv) cmyVar.c;
                int[] iArr = tbvVar.b;
                float[] fArr = tbvVar.f33687a;
                boolean zEquals = tbvVar2.equals(tbvVar3);
                int[] iArr2 = tbvVar2.b;
                if (zEquals || f <= 0.0f) {
                    tbvVar.a(tbvVar2);
                } else if (f >= 1.0f) {
                    tbvVar.a(tbvVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = tbvVar3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        jf4.o(rz4.j(iArr3.length, Separators.RPAREN, sb));
                        return null;
                    }
                    for (int i = 0; i < iArr2.length; i++) {
                        fArr[i] = ah40.f(tbvVar2.f33687a[i], tbvVar3.f33687a[i], f);
                        iArr[i] = mbc.S(iArr2[i], f, iArr3[i]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return tbvVar;
            case 1:
                return l(cmyVar, f, f, f);
            default:
                m1h0 m1h0Var = (m1h0) obj2;
                Object obj3 = cmyVar.b;
                if (obj3 == null || (obj = cmyVar.c) == null) {
                    jf4.n("Missing values for keyframe.");
                    return null;
                }
                m1h0 m1h0Var2 = (m1h0) obj3;
                m1h0 m1h0Var3 = (m1h0) obj;
                zn00 zn00Var = this.e;
                if (zn00Var != null) {
                    f2 = f;
                    m1h0 m1h0Var4 = (m1h0) zn00Var.L0(cmyVar.g, cmyVar.h.floatValue(), m1h0Var2, m1h0Var3, f2, d(), this.d);
                    if (m1h0Var4 != null) {
                        return m1h0Var4;
                    }
                } else {
                    f2 = f;
                }
                float f3 = ah40.f(m1h0Var2.f21008a, m1h0Var3.f21008a, f2);
                float f4 = ah40.f(m1h0Var2.b, m1h0Var3.b, f2);
                m1h0Var.f21008a = f3;
                m1h0Var.b = f4;
                return m1h0Var;
        }
    }

    @Override // a.sz5
    public /* bridge */ /* synthetic */ Object g(cmy cmyVar, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return l(cmyVar, f, f2, f3);
            default:
                return super.g(cmyVar, f, f2, f3);
        }
    }

    public PointF l(cmy cmyVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = cmyVar.b;
        if (obj2 == null || (obj = cmyVar.c) == null) {
            jf4.n("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        zn00 zn00Var = this.e;
        if (zn00Var != null && (pointF = (PointF) zn00Var.L0(cmyVar.g, cmyVar.h.floatValue(), pointF3, pointF4, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float fA = rw2.a(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF2.set(fA, rw2.a(pointF4.y, f5, f3, f5));
        return pointF2;
    }
}
