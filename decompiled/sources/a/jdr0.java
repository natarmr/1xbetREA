package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class jdr0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16342a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ skb0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ boolean e;

    public jdr0(ArrayList arrayList, mm40 mm40Var, skb0 skb0Var, Function1 function1, boolean z) {
        this.f16342a = arrayList;
        this.b = mm40Var;
        this.c = skb0Var;
        this.d = function1;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Function1 function1;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            a2n a2nVar = (a2n) this.f16342a.get(iIntValue);
            fetVar.e0(-886072084);
            fetVar.e0(1633983967);
            skb0 skb0Var = skb0.ShowGameCard;
            skb0 skb0Var2 = this.c;
            cl5 cl5Var = ukd.f35823a;
            Function1 function2 = this.d;
            mm40 mm40VarD0 = this.b;
            if (skb0Var2 == skb0Var && iIntValue == 0) {
                fetVar.e0(900333256);
                boolean zG = fetVar.g(function2);
                Object objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new dpl0(function2, (byte) 13);
                    fetVar.o0(objP);
                }
                mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(900699149);
                fetVar.r(false);
            }
            fetVar.r(false);
            if (skb0Var2 == skb0.ShowGameCardMarkets && iIntValue == 0) {
                fetVar.e0(-885385900);
                boolean zG2 = fetVar.g(a2nVar) | fetVar.g(function2);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new zcn0(a2nVar, function2, (byte) 24);
                    fetVar.o0(objP2);
                }
                function1 = (Function1) objP2;
                fetVar.r(false);
            } else {
                fetVar.e0(-884370743);
                fetVar.r(false);
                function1 = null;
            }
            Function1 function3 = function1;
            if (a2nVar == null) {
                fetVar.e0(-883548499);
                fetVar.r(false);
            } else if (a2nVar instanceof y56) {
                fetVar.e0(-884262274);
                y56 y56Var = (y56) a2nVar;
                boolean zG3 = fetVar.g(function2);
                Object objP3 = fetVar.P();
                if (zG3 || objP3 == cl5Var) {
                    objP3 = new dpl0(function2, (byte) 11);
                    fetVar.o0(objP3);
                }
                vcc.i(mm40VarD0, y56Var, this.e, (Function1) objP3, function3, fetVar, 0, 0);
                fetVar.r(false);
            } else {
                mm40 mm40Var = mm40VarD0;
                if (a2nVar instanceof c2o0) {
                    fetVar.e0(-883888166);
                    c2o0 c2o0Var = (c2o0) a2nVar;
                    boolean zG4 = fetVar.g(function2);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new dpl0(function2, (byte) 12);
                        fetVar.o0(objP4);
                    }
                    hkb.n(mm40Var, c2o0Var, this.e, (Function1) objP4, function3, fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-883548499);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
