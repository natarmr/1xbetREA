package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class o0i implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24425a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ o0i(List list, Function2 function2, byte b) {
        this.f24425a = b;
        this.b = list;
        this.c = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b = this.f24425a;
        cl5 cl5Var = ukd.f35823a;
        Function2 function2 = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                g9zVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    vpl vplVar = (vpl) list.get(iIntValue);
                    fetVar.e0(1387143205);
                    x4d0.u(null, vplVar, function2, fetVar, 0);
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
                g9zVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    vpl vplVar2 = (vpl) list.get(iIntValue3);
                    fetVar2.e0(22472755);
                    fre0.u(null, vplVar2, function2, fetVar2, 0);
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
                    vpl vplVar3 = (vpl) list.get(iIntValue5);
                    fetVar3.e0(876030665);
                    ohq0.x(null, vplVar3, iIntValue5, this.c, fetVar3, ((i3 & 126) << 3) & 896);
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
                    r370 r370Var = (r370) list.get(iIntValue7);
                    fetVar4.e0(-896687763);
                    boolean zG = fetVar4.g(function2) | fetVar4.g(r370Var);
                    Object objP = fetVar4.P();
                    if (zG || objP == cl5Var) {
                        objP = new ygy(function2, r370Var, (byte) 23);
                        fetVar4.o0(objP);
                    }
                    epv0.d(null, r370Var, (Function1) objP, fetVar4, 0, 1);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                zdz zdzVar = (zdz) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar5.g(zdzVar) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    zx80 zx80Var = (zx80) list.get(iIntValue9);
                    fetVar5.e0(474891522);
                    boolean zG2 = fetVar5.g(function2);
                    Object objP2 = fetVar5.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new caz(function2, (byte) 10);
                        fetVar5.o0(objP2);
                    }
                    bdx.M(zx80Var, (Function1) objP2, fetVar5, 0);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar6.g(g9zVar5) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar6.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                    glg0 glg0Var = (glg0) list.get(iIntValue11);
                    fetVar6.e0(833981638);
                    fww.k(glg0Var, function2, o7k0.d(jm40.b, 1.0f), fetVar6, 384);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
