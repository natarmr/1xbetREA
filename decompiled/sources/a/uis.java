package a;

import kotlin.Unit;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uis implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35748a;
    public final /* synthetic */ ugd b;

    public /* synthetic */ uis(ugd ugdVar, byte b) {
        this.f35748a = b;
        this.b = ugdVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f35748a;
        pcy pcyVar = e7z.u1;
        y5d y5dVar = y5d.f42040a;
        ugd ugdVar = this.b;
        switch (b) {
            case 0:
                RelatedParams relatedParams = (RelatedParams) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                relatedParams.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(relatedParams) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ugdVar.j(o7k0.c, relatedParams, fetVar, Integer.valueOf(((iIntValue << 3) & 112) | 6));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                marketsCategoriesParams.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? fetVar2.g(marketsCategoriesParams) : fetVar2.i(marketsCategoriesParams) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ugdVar.j(o7k0.c, marketsCategoriesParams, fetVar2, Integer.valueOf(((iIntValue2 << 3) & 112) | 6));
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                mm40 mm40Var = (mm40) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(mm40Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    ugdVar.F(mm40Var, fetVar3, Integer.valueOf(iIntValue3 & 14));
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ugdVar.F(y5dVar, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, jm40.b);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, gqw0.v);
                    vqd.t(6, ugdVar, y5dVar, fetVar5, true);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? fetVar6.g(obj) : fetVar6.i(obj) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    ugdVar.F(obj, fetVar6, Integer.valueOf(iIntValue6 & 14));
                } else {
                    fetVar6.X();
                }
                break;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    ugdVar.invoke(fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                break;
            case 7:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.h(zBooleanValue) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    ugdVar.F(bool, fetVar8, Integer.valueOf(iIntValue8 & 14));
                } else {
                    fetVar8.X();
                }
                break;
            case 8:
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 8.0f, 0.0f, 8.0f, 6.0f, 2);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar9, 0);
                    int iHashCode2 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM2 = fetVar9.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar9, mm40VarN);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar9);
                    jpm0.o(fetVar9, mm40VarC1, gqw0.v);
                    twn.v(0, ugdVar, fetVar9, true);
                } else {
                    fetVar9.X();
                }
                break;
            default:
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    ugdVar.F(y5dVar, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
