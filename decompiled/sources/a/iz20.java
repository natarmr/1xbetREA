package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iz20 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15616a;
    public final /* synthetic */ kz20 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ iz20(kz20 kz20Var, Function1 function1, byte b) {
        this.f15616a = b;
        this.b = kz20Var;
        this.c = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        byte b = this.f15616a;
        kz20 kz20Var = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                qym0 qym0Var = (qym0) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                mm40Var.getClass();
                qym0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? fetVar.g(qym0Var) : fetVar.i(qym0Var) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    pz40 pz40Var = s6t0.f31722a;
                    int i4 = i;
                    iym0.b(mm40Var, qym0Var, StaticColors.INSTANCE.m130getWhite600d7_KjU(), kz20Var.k, kz20Var.l, kz20Var.h, this.c, fetVar, 64 | (i4 & 14) | (i4 & 112), 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var2 = (mm40) obj;
                qym0 qym0Var2 = (qym0) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                mm40Var2.getClass();
                qym0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = (fetVar2.g(mm40Var2) ? 4 : 2) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? fetVar2.g(qym0Var2) : fetVar2.i(qym0Var2) ? 32 : 16;
                }
                int i5 = i2;
                if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    pz40 pz40Var2 = s6t0.f31722a;
                    iym0.b(mm40VarN, qym0Var2, s6t0.b().f33626a.getSecondary(), kz20Var.k, false, false, this.c, fetVar2, 64 | (i5 & 112), 48);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                mm40 mm40Var3 = (mm40) obj;
                qym0 qym0Var3 = (qym0) obj2;
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                mm40Var3.getClass();
                qym0Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i3 = (fetVar3.g(mm40Var3) ? 4 : 2) | iIntValue3;
                } else {
                    i3 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i3 |= (iIntValue3 & 64) == 0 ? fetVar3.g(qym0Var3) : fetVar3.i(qym0Var3) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    pz40 pz40Var3 = s6t0.f31722a;
                    iym0.b(mm40VarN2, qym0Var3, s6t0.b().f33626a.getSecondary(), kz20Var.k, false, false, this.c, fetVar3, 64 | (i3 & 112), 48);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
