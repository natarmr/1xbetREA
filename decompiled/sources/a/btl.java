package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class btl implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3187a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ btl(List list, int i, Integer num, Function2 function2, byte b) {
        this.f3187a = b;
        this.b = list;
        this.c = i;
        this.d = num;
        this.e = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b = this.f3187a;
        List list = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    fr5 fr5Var = (fr5) list.get(iIntValue);
                    fetVar.e0(-1229421827);
                    j0x.p(null, fr5Var, this.c, this.d, this.e, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    fr5 fr5Var2 = (fr5) list.get(iIntValue3);
                    fetVar2.e0(-993251911);
                    w9x.o(null, fr5Var2, this.c, this.d, this.e, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar3.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    fr5 fr5Var3 = (fr5) list.get(iIntValue5);
                    fetVar3.e0(-757081871);
                    w9x.p(null, fr5Var3, this.c, this.d, this.e, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar4.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar4.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar4.U(i4 & 1, (i4 & 147) != 146)) {
                    fr5 fr5Var4 = (fr5) list.get(iIntValue7);
                    fetVar4.e0(-520912203);
                    t9x.q(null, fr5Var4, this.c, this.d, this.e, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar5.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    fr5 fr5Var5 = (fr5) list.get(iIntValue9);
                    fetVar5.e0(-284742163);
                    t9x.r(null, fr5Var5, this.c, this.d, this.e, fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar6.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar6.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                    fr5 fr5Var6 = (fr5) list.get(iIntValue11);
                    fetVar6.e0(-48572712);
                    i4w0.l(null, fr5Var6, this.c, this.d, this.e, fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar7.g(g9zVar7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar7.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar7.U(i7 & 1, (i7 & 147) != 146)) {
                    fr5 fr5Var7 = (fr5) list.get(iIntValue13);
                    fetVar7.e0(-1701761473);
                    q0x.A(null, fr5Var7, this.c, this.d, this.e, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                break;
            default:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar8.g(g9zVar8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar8.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar8.U(i8 & 1, (i8 & 147) != 146)) {
                    fr5 fr5Var8 = (fr5) list.get(iIntValue15);
                    fetVar8.e0(-1465591867);
                    j0x.o(null, fr5Var8, this.c, this.d, this.e, fetVar8, 0);
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
