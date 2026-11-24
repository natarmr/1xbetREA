package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class o57 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24673a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ z77 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ o57(ArrayList arrayList, z77 z77Var, Function1 function1, byte b) {
        this.f24673a = b;
        this.b = arrayList;
        this.c = z77Var;
        this.d = function1;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0318  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x020c  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        int i2;
        fet fetVar2;
        int i3;
        fet fetVar3;
        byte b = this.f24673a;
        cl5 cl5Var = ukd.f35823a;
        ArrayList arrayList = this.b;
        z77 z77Var = this.c;
        Function1 function1 = this.d;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar4.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar4.e(iIntValue) ? 32 : 16;
                }
                if (fetVar4.U(i & 1, (i & 147) != 146)) {
                    o8w o8wVar = (o8w) arrayList.get(iIntValue);
                    fetVar4.e0(2131369463);
                    if (iIntValue == 1) {
                        x77 x77Var = (x77) z77Var;
                        if (x77Var.i != null) {
                            fetVar4.e0(2131418442);
                            qgv0 qgv0Var = x77Var.i;
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            String str = qgv0Var.b;
                            pz40 pz40Var = s6t0.f31722a;
                            StaticColors staticColors = StaticColors.INSTANCE;
                            gy30 gy30Var = new gy30(new ux30(staticColors.m123getWhite0d7_KjU(), staticColors.m131getWhite800d7_KjU(), str, qgv0Var.c), null, new zx30(new n0x(qgv0Var.d), 3), qgv0Var.e, null, null, 242);
                            boolean zG = fetVar4.g(function1) | fetVar4.g(qgv0Var);
                            Object objP = fetVar4.P();
                            if (zG || objP == cl5Var) {
                                objP = new n57(function1, qgv0Var, (byte) 0);
                                fetVar4.o0(objP);
                            }
                            jiq0.y(mm40VarN, gy30Var, (Function0) objP, null, null, fetVar4, 0, 24);
                            fetVar = fetVar4;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar4;
                            fetVar.e0(2133017546);
                            fetVar.r(false);
                        }
                    } else {
                        fetVar = fetVar4;
                        fetVar.e0(2133017546);
                        fetVar.r(false);
                    }
                    if (o8wVar instanceof p3w) {
                        fetVar.e0(2133107911);
                        zvw.h(null, (p3w) o8wVar, ((x77) z77Var).b.c, this.d, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(2133479818);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar5.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar5.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar5.U(i2 & 1, (i2 & 147) != 146)) {
                    o8w o8wVar2 = (o8w) arrayList.get(iIntValue3);
                    fetVar5.e0(-1357592063);
                    if (iIntValue3 == 1) {
                        x77 x77Var2 = (x77) z77Var;
                        if (x77Var2.i != null) {
                            fetVar5.e0(-1357539953);
                            qgv0 qgv0Var2 = x77Var2.i;
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN2 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            String str2 = qgv0Var2.b;
                            pz40 pz40Var2 = s6t0.f31722a;
                            StaticColors staticColors2 = StaticColors.INSTANCE;
                            gy30 gy30Var2 = new gy30(new ux30(staticColors2.m123getWhite0d7_KjU(), staticColors2.m131getWhite800d7_KjU(), str2, qgv0Var2.c), null, new zx30(new n0x(qgv0Var2.d), 3), qgv0Var2.e, null, null, 242);
                            boolean zG2 = fetVar5.g(function1) | fetVar5.g(qgv0Var2);
                            Object objP2 = fetVar5.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new n57(function1, qgv0Var2, (byte) 1);
                                fetVar5.o0(objP2);
                            }
                            jiq0.y(mm40VarN2, gy30Var2, (Function0) objP2, null, null, fetVar5, 0, 24);
                            fetVar2 = fetVar5;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar5;
                            fetVar2.e0(-1355933161);
                            fetVar2.r(false);
                        }
                    } else {
                        fetVar2 = fetVar5;
                        fetVar2.e0(-1355933161);
                        fetVar2.r(false);
                    }
                    if (o8wVar2 instanceof cuo) {
                        fetVar2.e0(-1355836317);
                        ebc.x(null, (cuo) o8wVar2, function1, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1355571081);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar6.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar6.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar6.U(i3 & 1, (i3 & 147) != 146)) {
                    o8w o8wVar3 = (o8w) arrayList.get(iIntValue5);
                    fetVar6.e0(-1208669792);
                    if (iIntValue5 == 1) {
                        x77 x77Var3 = (x77) z77Var;
                        if (x77Var3.i != null) {
                            fetVar6.e0(-1208620813);
                            qgv0 qgv0Var3 = x77Var3.i;
                            zcl zclVar3 = qmk.f28987a;
                            mm40 mm40VarN3 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            String str3 = qgv0Var3.b;
                            pz40 pz40Var3 = s6t0.f31722a;
                            StaticColors staticColors3 = StaticColors.INSTANCE;
                            gy30 gy30Var3 = new gy30(new ux30(staticColors3.m123getWhite0d7_KjU(), staticColors3.m131getWhite800d7_KjU(), str3, qgv0Var3.c), null, new zx30(new n0x(qgv0Var3.d), 3), qgv0Var3.e, null, null, 242);
                            boolean zG3 = fetVar6.g(function1) | fetVar6.g(qgv0Var3);
                            Object objP3 = fetVar6.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new n57(function1, qgv0Var3, (byte) 3);
                                fetVar6.o0(objP3);
                            }
                            jiq0.y(mm40VarN3, gy30Var3, (Function0) objP3, null, null, fetVar6, 0, 24);
                            fetVar3 = fetVar6;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar6;
                            fetVar3.e0(-1207020748);
                            fetVar3.r(false);
                        }
                    } else {
                        fetVar3 = fetVar6;
                        fetVar3.e0(-1207020748);
                        fetVar3.r(false);
                    }
                    if (o8wVar3 instanceof p3w) {
                        fetVar3.e0(-1206930383);
                        zvw.h(null, (p3w) o8wVar3, ((x77) z77Var).b.c, this.d, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-1206558476);
                        fetVar3.r(false);
                    }
                    fetVar3.r(false);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
