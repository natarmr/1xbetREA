package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zis implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44453a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zis(long j, haj hajVar, byte b) {
        this.f44453a = b;
        this.b = j;
        this.c = hajVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        byte b = this.f44453a;
        cl5 cl5Var = ukd.f35823a;
        long j = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                cjs cjsVar = (cjs) obj5;
                mm40 mm40Var = (mm40) obj;
                MarketsCategoriesParams marketsCategoriesParams = (MarketsCategoriesParams) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                nek nekVar = cjs.a2;
                mm40Var.getClass();
                marketsCategoriesParams.getClass();
                if ((iIntValue & 6) == 0) {
                    i = (fetVar.g(mm40Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? fetVar.g(marketsCategoriesParams) : fetVar.i(marketsCategoriesParams) ? 32 : 16;
                }
                if (!fetVar.U(i & 1, (i & 147) != 146)) {
                    fetVar.X();
                } else {
                    if (cjsVar.Q1 == null) {
                        Intrinsics.h("marketsCategoriesFactory");
                        throw null;
                    }
                    zcl zclVar = qmk.l;
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar2, zclVar2, i120.Q(mm40Var, j, new ugg0(zclVar, zclVar, zclVar2, zclVar2)));
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new dcr((byte) 27);
                        fetVar.o0(objP);
                    }
                    uuz.c(mm40VarE, jm40.b, cjsVar, marketsCategoriesParams, (Function1) objP, fetVar, 24624 | ((i << 6) & 7168));
                }
                return Unit.f46060a;
            case 1:
                z9j z9jVar = (z9j) obj5;
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar2 = (fet) obj3;
                int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                if ((iD & 48) == 0) {
                    iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                    kr00.a(u1c.M(-950351662, new my2(mm40Var2, j, z9jVar), fetVar2), fetVar2, 6);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                pz40 pz40Var = (pz40) obj5;
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar3 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, (y5d) obj, mm40Var3);
                if ((iD2 & 48) == 0) {
                    iD2 |= fetVar3.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar3.U(iD2 & 1, (iD2 & 145) != 144)) {
                    obc.d(vko0.f37583a.a(fetVar3.k(bmd.n)), u1c.M(1399773582, new fsw(mm40Var3, pz40Var, this.b, (byte) 0), fetVar3), fetVar3, 56);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            default:
                aaj aajVar = (aaj) obj5;
                mm40 mm40Var4 = (mm40) obj2;
                fet fetVar4 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, (y5d) obj, mm40Var4);
                if ((iD3 & 48) == 0) {
                    iD3 |= fetVar4.g(mm40Var4) ? 32 : 16;
                }
                if (fetVar4.U(iD3 & 1, (iD3 & 145) != 144)) {
                    boolean zF = fetVar4.f(j);
                    Object objP2 = fetVar4.P();
                    if (zF || objP2 == cl5Var) {
                        objP2 = new dls((byte) 13, j);
                        fetVar4.o0(objP2);
                    }
                    mm40 mm40VarK = rq8.K(mm40Var4, (Function1) objP2);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarK2 = s5x0.K(mm40VarK, 12.0f, 8.0f);
                    String str = aajVar.b;
                    y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                    pz40 pz40Var2 = s6t0.f31722a;
                    v8q0.a(str, mm40VarK2, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar4, 0, 24960, 109560);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ zis(Object obj, long j, byte b) {
        this.f44453a = b;
        this.c = obj;
        this.b = j;
    }
}
