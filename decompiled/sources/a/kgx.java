package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kgx implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18261a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ kgx(long j, Function1 function1, Function1 function2, byte b) {
        this.f18261a = b;
        this.b = j;
        this.c = function1;
        this.d = function2;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.f18261a;
        jm40 jm40Var = jm40.b;
        long j = this.b;
        switch (b) {
            case 0:
                zgx zgxVar = (zgx) obj;
                d4n d4nVar = (d4n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fet fetVar = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                zgxVar.getClass();
                a4x a4xVar = zgxVar.b;
                d4nVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(zgxVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.g(d4nVar) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar.e(iIntValue) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1171) != 1170)) {
                    mm40 mm40VarI = jm40Var;
                    if (iIntValue == q3d.i(a4xVar)) {
                        zcl zclVar = qmk.f28987a;
                        zcl zclVar2 = qmk.i;
                        mm40VarI = dw9.i(zclVar, zclVar, zclVar2, zclVar2, jm40Var);
                    }
                    mm40 mm40VarQ = i120.Q(mm40VarI, j, jd8.n);
                    zcl zclVar3 = qmk.f28987a;
                    agc.t(s5x0.M(mm40VarQ, 8.0f, iIntValue == 0 ? 6.0f : 0.0f, 8.0f, iIntValue == a4xVar.size() + (-1) ? 2.0f : 0.0f), d4nVar, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), this.c, this.d, fetVar, i & 112, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                zgx zgxVar2 = (zgx) obj;
                d4n d4nVar2 = (d4n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fet fetVar2 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                zgxVar2.getClass();
                d4nVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(zgxVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.g(d4nVar2) ? 32 : 16;
                }
                if ((iIntValue4 & 384) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 256 : 128;
                }
                if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
                    mm40 mm40VarQ2 = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar4 = qmk.f28987a;
                    agc.t(s5x0.M(mm40VarQ2, 8.0f, iIntValue3 == 0 ? 6.0f : 0.0f, 8.0f, iIntValue3 == q3d.i(zgxVar2.b) ? 2.0f : 0.0f), d4nVar2, ((Boolean) fetVar2.k(kr00.f18743a)).booleanValue(), this.c, this.d, fetVar2, i2 & 112, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                d4n d4nVar3 = (d4n) obj2;
                ((Integer) obj3).getClass();
                fet fetVar3 = (fet) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                ((zgx) obj).getClass();
                d4nVar3.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= fetVar3.g(d4nVar3) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue5 & 1, (iIntValue5 & 1041) != 1040)) {
                    mm40 mm40VarQ3 = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar5 = qmk.f28987a;
                    agc.t(s5x0.N(mm40VarQ3, 8.0f, 0.0f, 8.0f, 0.0f, 10), d4nVar3, ((Boolean) fetVar3.k(kr00.f18743a)).booleanValue(), this.c, this.d, fetVar3, iIntValue5 & 112, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fv20 fv20Var = (fv20) obj;
                d4n d4nVar4 = (d4n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                fet fetVar4 = (fet) obj4;
                int iIntValue7 = ((Integer) obj5).intValue();
                fv20Var.getClass();
                a4x a4xVar2 = fv20Var.b;
                d4nVar4.getClass();
                if ((iIntValue7 & 6) == 0) {
                    i3 = iIntValue7 | (fetVar4.g(fv20Var) ? 4 : 2);
                } else {
                    i3 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i3 |= fetVar4.g(d4nVar4) ? 32 : 16;
                }
                if ((iIntValue7 & 384) == 0) {
                    i3 |= fetVar4.e(iIntValue6) ? 256 : 128;
                }
                if (fetVar4.U(i3 & 1, (i3 & 1171) != 1170)) {
                    mm40 mm40VarI2 = jm40Var;
                    if (iIntValue6 == q3d.i(a4xVar2)) {
                        zcl zclVar6 = qmk.f28987a;
                        zcl zclVar7 = qmk.i;
                        mm40VarI2 = dw9.i(zclVar6, zclVar6, zclVar7, zclVar7, jm40Var);
                    }
                    mm40 mm40VarQ4 = i120.Q(mm40VarI2, j, jd8.n);
                    zcl zclVar8 = qmk.f28987a;
                    agc.t(s5x0.M(mm40VarQ4, 8.0f, 0.0f, 8.0f, iIntValue6 == a4xVar2.size() + (-1) ? 2.0f : 0.0f), d4nVar4, ((Boolean) fetVar4.k(kr00.f18743a)).booleanValue(), this.c, this.d, fetVar4, i3 & 112, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fv20 fv20Var2 = (fv20) obj;
                d4n d4nVar5 = (d4n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                fet fetVar5 = (fet) obj4;
                int iIntValue9 = ((Integer) obj5).intValue();
                fv20Var2.getClass();
                d4nVar5.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i4 = iIntValue9 | (fetVar5.g(fv20Var2) ? 4 : 2);
                } else {
                    i4 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i4 |= fetVar5.g(d4nVar5) ? 32 : 16;
                }
                if ((iIntValue9 & 384) == 0) {
                    i4 |= fetVar5.e(iIntValue8) ? 256 : 128;
                }
                if (fetVar5.U(i4 & 1, (i4 & 1171) != 1170)) {
                    mm40 mm40VarQ5 = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar9 = qmk.f28987a;
                    agc.t(s5x0.M(mm40VarQ5, 8.0f, iIntValue8 == 0 ? 6.0f : 0.0f, 8.0f, iIntValue8 == q3d.i(fv20Var2.b) ? 2.0f : 0.0f), d4nVar5, ((Boolean) fetVar5.k(kr00.f18743a)).booleanValue(), this.c, this.d, fetVar5, i4 & 112, 0);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                d4n d4nVar6 = (d4n) obj2;
                ((Integer) obj3).getClass();
                fet fetVar6 = (fet) obj4;
                int iIntValue10 = ((Integer) obj5).intValue();
                ((fv20) obj).getClass();
                d4nVar6.getClass();
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= fetVar6.g(d4nVar6) ? 32 : 16;
                }
                if (fetVar6.U(iIntValue10 & 1, (iIntValue10 & 1041) != 1040)) {
                    mm40 mm40VarQ6 = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar10 = qmk.f28987a;
                    agc.t(s5x0.N(mm40VarQ6, 8.0f, 0.0f, 8.0f, 0.0f, 10), d4nVar6, ((Boolean) fetVar6.k(kr00.f18743a)).booleanValue(), this.c, this.d, fetVar6, iIntValue10 & 112, 0);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
