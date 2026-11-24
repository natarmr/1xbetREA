package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w8h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38721a;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;
    public final /* synthetic */ pu90 d;
    public final /* synthetic */ pu90 e;
    public final /* synthetic */ pu90 f;
    public final /* synthetic */ pu90 g;
    public final /* synthetic */ pu90 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ pu90 m;
    public final /* synthetic */ pu90 n;
    public final /* synthetic */ pu90 o;

    public /* synthetic */ w8h(tj30 tj30Var, pu90 pu90Var, pu90 pu90Var2, pu90 pu90Var3, pu90 pu90Var4, pu90 pu90Var5, pu90 pu90Var6, pu90 pu90Var7, int i, int i2, int i3, long j, pu90 pu90Var8, pu90 pu90Var9, pu90 pu90Var10, byte b) {
        this.f38721a = b;
        this.b = pu90Var;
        this.c = pu90Var2;
        this.d = pu90Var3;
        this.e = pu90Var4;
        this.f = pu90Var5;
        this.g = pu90Var6;
        this.h = pu90Var7;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = j;
        this.m = pu90Var8;
        this.n = pu90Var9;
        this.o = pu90Var10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        boolean z;
        float f2;
        byte b = this.f38721a;
        pu90 pu90Var = this.o;
        pu90 pu90Var2 = this.n;
        pu90 pu90Var3 = this.m;
        long j = this.l;
        int i = this.k;
        int i2 = this.j;
        int i3 = this.i;
        pu90 pu90Var4 = this.h;
        pu90 pu90Var5 = this.g;
        pu90 pu90Var6 = this.f;
        pu90 pu90Var7 = this.e;
        pu90 pu90Var8 = this.d;
        pu90 pu90Var9 = this.c;
        pu90 pu90Var10 = this.b;
        switch (b) {
            case 0:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int i4 = pu90Var10 != null ? pu90Var10.f27604a : 0;
                int i5 = i2 - (i4 / 2);
                if (pu90Var10 != null) {
                    ou90Var.m(pu90Var10, i5, i3 - (pu90Var10.b / 2), 0.0f);
                }
                int i6 = ((i2 - ((pu90Var10 != null ? pu90Var10.f27604a : 0) / 2)) - (pu90Var9 != null ? pu90Var9.f27604a : 0)) - i;
                if (pu90Var9 != null) {
                    ou90Var.m(pu90Var9, i6, i3 - (pu90Var9.b / 2), 0.0f);
                }
                int i7 = ((pu90Var10 != null ? pu90Var10.f27604a : 0) / 2) + i2 + i;
                if (pu90Var8 != null) {
                    ou90Var.m(pu90Var8, i7, i3 - (pu90Var8.b / 2), 0.0f);
                }
                zcl zclVar = qmk.f28987a;
                int iT = (i5 - ou90Var.T(26.0f)) - (pu90Var7 != null ? pu90Var7.f27604a : 0);
                if (pu90Var7 != null) {
                    f = 0.0f;
                    ou90Var.m(pu90Var7, iT, i3 - (pu90Var7.b / 2), 0.0f);
                } else {
                    f = 0.0f;
                }
                int iT2 = ou90Var.T(26.0f) + i5 + i4;
                if (pu90Var6 != null) {
                    ou90Var.m(pu90Var6, iT2, i3 - (pu90Var6.b / 2), f);
                }
                if (pu90Var5 != null) {
                    z = false;
                    ou90Var.m(pu90Var5, 0, i3 - (pu90Var5.b / 2), f);
                } else {
                    z = false;
                }
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, p4e.i(j) - pu90Var4.f27604a, i3 - (pu90Var4.b / 2), f);
                }
                int iT3 = ou90Var.T(54.0f) + ou90Var.T(4.0f);
                pu90 pu90Var11 = pu90Var3 == null ? pu90Var2 : pu90Var3;
                boolean z2 = pu90Var11 != null ? true : z;
                boolean z3 = pu90Var != null ? true : z;
                if (z3 && z2) {
                    ou90Var.m(pu90Var11, i2 - (pu90Var11.f27604a / 2), iT3, 0.0f);
                    ou90Var.m(pu90Var, i2 - (pu90Var.f27604a / 2), iT3 + pu90Var11.b + i, 0.0f);
                } else if (z3) {
                    ou90Var.m(pu90Var, i2 - (pu90Var.f27604a / 2), (p4e.h(j) - ou90Var.T(20.0f)) - (pu90Var.b / 2), 0.0f);
                } else if (z2) {
                    ou90Var.m(pu90Var11, i2 - (pu90Var11.f27604a / 2), (pu90Var11.b / 2) + iT3, 0.0f);
                }
                break;
            default:
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                int i8 = pu90Var10 != null ? pu90Var10.f27604a : 0;
                int i9 = i8;
                int i10 = i2 - (i8 / 2);
                if (pu90Var10 != null) {
                    ou90Var2.m(pu90Var10, i10, i3 - (pu90Var10.b / 2), 0.0f);
                }
                int i11 = pu90Var9 != null ? pu90Var9.f27604a : 0;
                int i12 = i11 > 0 ? (i10 - i) - i11 : i10 - i;
                if (pu90Var9 != null) {
                    ou90Var2.m(pu90Var9, i12, i3 - (pu90Var9.b / 2), 0.0f);
                }
                if (pu90Var8 == null || pu90Var9 == null) {
                    f2 = 0.0f;
                } else {
                    int i13 = pu90Var9.f27604a + i12;
                    zcl zclVar2 = qmk.f28987a;
                    f2 = 0.0f;
                    ou90Var2.m(pu90Var8, (ou90Var2.T(6.0f) + i13) - pu90Var8.f27604a, (ou90Var2.T(4.0f) + ((pu90Var9.b / 2) + i3)) - pu90Var8.b, 0.0f);
                }
                int i14 = i10 + i9 + i;
                if (pu90Var6 != null) {
                    ou90Var2.m(pu90Var6, i14, i3 - (pu90Var6.b / 2), f2);
                }
                if (pu90Var7 != null && pu90Var6 != null) {
                    zcl zclVar3 = qmk.f28987a;
                    ou90Var2.m(pu90Var7, i14 - ou90Var2.T(6.0f), (ou90Var2.T(4.0f) + ((pu90Var6.b / 2) + i3)) - pu90Var7.b, 0.0f);
                }
                if (pu90Var5 != null) {
                    int i15 = (i12 - i) - pu90Var5.f27604a;
                    if (i15 < 0) {
                        i15 = 0;
                    }
                    ou90Var2.m(pu90Var5, i15, i3 - (pu90Var5.b / 2), 0.0f);
                }
                if (pu90Var4 != null) {
                    int i16 = i14 + (pu90Var6 != null ? pu90Var6.f27604a : 0) + i;
                    int i17 = p4e.i(j) - pu90Var4.f27604a;
                    if (i16 > i17) {
                        i16 = i17;
                    }
                    ou90Var2.m(pu90Var4, i16, i3 - (pu90Var4.b / 2), 0.0f);
                }
                zcl zclVar4 = qmk.f28987a;
                int iT4 = ou90Var2.T(4.0f);
                int iT5 = ou90Var2.T(54.0f) + ou90Var2.T(4.0f);
                pu90 pu90Var12 = pu90Var3 == null ? pu90Var2 : pu90Var3;
                boolean z4 = pu90Var12 != null;
                boolean z5 = pu90Var != null;
                if (z5 && z4) {
                    ou90Var2.m(pu90Var12, i2 - (pu90Var12.f27604a / 2), iT5, 0.0f);
                    ou90Var2.m(pu90Var, i2 - (pu90Var.f27604a / 2), iT5 + pu90Var12.b + iT4, 0.0f);
                } else if (z5) {
                    ou90Var2.m(pu90Var, i2 - (pu90Var.f27604a / 2), (p4e.h(j) - ou90Var2.T(20.0f)) - (pu90Var.b / 2), 0.0f);
                } else if (z4) {
                    ou90Var2.m(pu90Var12, i2 - (pu90Var12.f27604a / 2), (pu90Var12.b / 2) + iT5, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }
}
