package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class aam implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f533a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;

    public /* synthetic */ aam(float f, int i, byte b) {
        this.f533a = b;
        this.b = f;
        this.c = i;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        int iB;
        int iB2;
        List list2 = list;
        byte b = this.f533a;
        float f = this.b;
        String str = "width and height must be >= 0";
        int i = this.c;
        switch (b) {
            case 0:
                list2.getClass();
                zcl zclVar = qmk.f28987a;
                int iT = vj30Var.T(4.0f);
                int iT2 = vj30Var.T(8.0f);
                int iT3 = vj30Var.T(40.0f);
                int iT4 = vj30Var.T(24.0f);
                int iT5 = vj30Var.T(40.0f);
                int iT6 = vj30Var.T(4.0f);
                int iT7 = vj30Var.T(f);
                int i2 = (p4e.i(j) - iT3) - iT;
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (i2 - iT7) - iT6;
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = iT3 + iT;
                int i5 = i4 + iT7 + iT6;
                int i6 = 0;
                pj30 pj30Var = (pj30) list2.get(0);
                if (!((iT3 >= 0) & (iT4 >= 0))) {
                    zcx.a("width and height must be >= 0");
                }
                pu90 pu90VarS = pj30Var.S(r4e.h(iT3, iT3, iT4, iT4));
                pj30 pj30Var2 = (pj30) list2.get(1);
                if (!((i2 >= 0) & (iT4 >= 0))) {
                    zcx.a("width and height must be >= 0");
                }
                pu90 pu90VarS2 = pj30Var2.S(r4e.h(i2, i2, iT4, iT4));
                pu90[][] pu90VarArr = new pu90[i][];
                while (i6 < i) {
                    int i7 = i6 * 3;
                    pu90 pu90VarS3 = ((pj30) list2.get(i7 + 2)).S(lgb.P(iT3, iT5));
                    int i8 = iT4;
                    int i9 = iT3;
                    pu90 pu90VarS4 = ((pj30) list2.get(i7 + 3)).S(lgb.P(iT7, iT5));
                    pj30 pj30Var3 = (pj30) list2.get(i7 + 4);
                    int i10 = i6;
                    pu90VarArr[i10] = new pu90[]{pu90VarS3, pu90VarS4, pj30Var3.S(lgb.P(i3, iT5))};
                    i6 = i10 + 1;
                    list2 = list;
                    iT3 = i9;
                    iT4 = i8;
                }
                int i11 = iT4;
                if (i > 0) {
                    iB = twn.b(i, 1, iT2, (i * iT5) + i11 + iT2);
                } else {
                    iB = i11;
                }
                return vj30.x(vj30Var, p4e.i(j), iB, new jp2(pu90VarS, pu90VarS2, i4, this.c, i11, iT2, iT5, pu90VarArr, i5));
            default:
                list2.getClass();
                zcl zclVar2 = qmk.f28987a;
                final int iT8 = vj30Var.T(8.0f);
                final int iT9 = vj30Var.T(24.0f);
                final int iT10 = vj30Var.T(40.0f);
                int iT11 = vj30Var.T(4.0f);
                int iT12 = vj30Var.T(f);
                int i12 = p4e.i(j);
                if (i12 < 0) {
                    i12 = 0;
                }
                int i13 = (i12 - iT12) - iT11;
                if (i13 < 0) {
                    i13 = 0;
                }
                final int i14 = iT12 + iT11;
                pj30 pj30Var4 = (pj30) list2.get(0);
                if (!((i12 >= 0) & (iT9 >= 0))) {
                    zcx.a("width and height must be >= 0");
                }
                final pu90 pu90VarS5 = pj30Var4.S(r4e.h(i12, i12, iT9, iT9));
                pu90[][] pu90VarArr2 = new pu90[i][];
                int i15 = 0;
                while (i15 < i) {
                    int i16 = i15 * 2;
                    pj30 pj30Var5 = (pj30) list2.get(i16 + 1);
                    if (!((iT12 >= 0) & (iT10 >= 0))) {
                        zcx.a(str);
                    }
                    String str2 = str;
                    pu90 pu90VarS6 = pj30Var5.S(r4e.h(iT12, iT12, iT10, iT10));
                    pj30 pj30Var6 = (pj30) list2.get(i16 + 2);
                    if (!((i13 >= 0) & (iT10 >= 0))) {
                        zcx.a(str2);
                    }
                    pu90[][] pu90VarArr3 = pu90VarArr2;
                    pu90VarArr3[i15] = new pu90[]{pu90VarS6, pj30Var6.S(r4e.h(i13, i13, iT10, iT10))};
                    i15++;
                    iT12 = iT12;
                    str = str2;
                    pu90VarArr2 = pu90VarArr3;
                }
                final pu90[][] pu90VarArr4 = pu90VarArr2;
                if (i > 0) {
                    iB2 = twn.b(i, 1, iT8, (i * iT10) + iT9 + iT8);
                } else {
                    iB2 = iT9;
                }
                int i17 = p4e.i(j);
                final int i18 = this.c;
                return vj30.x(vj30Var, i17, iB2, new Function1() { // from class: a.bam
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ou90 ou90Var = (ou90) obj;
                        ou90Var.getClass();
                        ou90Var.m(pu90VarS5, 0, 0, 0.0f);
                        for (int i19 = 0; i19 < i18; i19++) {
                            int i20 = iT9;
                            int i21 = iT8;
                            int i22 = ((iT10 + i21) * i19) + i20 + i21;
                            pu90[][] pu90VarArr5 = pu90VarArr4;
                            ou90Var.m(pu90VarArr5[i19][0], 0, i22, 0.0f);
                            ou90Var.m(pu90VarArr5[i19][1], i14, i22, 0.0f);
                        }
                        return Unit.f46060a;
                    }
                });
        }
    }
}
