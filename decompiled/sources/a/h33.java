package a;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h33 extends oyc {
    public final /* synthetic */ byte c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h33(ViewGroup viewGroup, byte b) {
        super(1);
        this.c = b;
        this.d = viewGroup;
    }

    @Override // a.oyc
    public final xiv0 h(xiv0 xiv0Var, List list) {
        byte b = this.c;
        ViewGroup viewGroup = this.d;
        switch (b) {
            case 0:
                return ((bhu0) viewGroup).k(xiv0Var);
            default:
                xik xikVar = (xik) viewGroup;
                if (xikVar.m) {
                    return xiv0Var;
                }
                View childAt = xikVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, xikVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, xikVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? xiv0Var : xiv0Var.f40966a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // a.oyc
    public final hcp0 i(div0 div0Var, hcp0 hcp0Var) {
        byte b = this.c;
        ViewGroup viewGroup = this.d;
        switch (b) {
            case 0:
                rdx rdxVar = (rdx) ((bhu0) viewGroup).z.h1.d;
                if (!rdxVar.D1.n) {
                    return hcp0Var;
                }
                long J = x1x.J(rdxVar.Y(0L));
                int i = (int) (J >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (J & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jG = k7x.C(rdxVar).g();
                int i3 = (int) (jG >> 32);
                int i4 = (int) (jG & 4294967295L);
                long j = rdxVar.c;
                long J2 = x1x.J(rdxVar.Y((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (J2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (J2 & 4294967295L));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? hcp0Var : new hcp0(k33.j((pfx) hcp0Var.b, i, i2, i5, i7), k33.j((pfx) hcp0Var.c, i, i2, i5, i7), (byte) 13);
            default:
                xik xikVar = (xik) viewGroup;
                if (xikVar.m) {
                    return hcp0Var;
                }
                View childAt = xikVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, xikVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, xikVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return hcp0Var;
                }
                pfx pfxVarC = pfx.c(iMax, iMax2, iMax3, iMax4);
                int i8 = pfxVarC.f26926a;
                pfx pfxVar = (pfx) hcp0Var.b;
                int i9 = pfxVarC.b;
                int i10 = pfxVarC.c;
                int i11 = pfxVarC.d;
                return new hcp0(xiv0.e(pfxVar, i8, i9, i10, i11), xiv0.e((pfx) hcp0Var.c, i8, i9, i10, i11), (byte) 13);
        }
    }
}
