package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final class wnb implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39438a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ xnb c;
    public final /* synthetic */ cob d;
    public final /* synthetic */ Function1 e;

    public wnb(List list, xnb xnbVar, cob cobVar, Function1 function1) {
        this.b = list;
        this.c = xnbVar;
        this.d = cobVar;
        this.e = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        fet fetVar;
        byte b = this.f39438a;
        Function1 function1 = this.e;
        cl5 cl5Var = ukd.f35823a;
        List list = this.b;
        xnb xnbVar = this.c;
        cob cobVar = this.d;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    ql5 ql5Var = (ql5) list.get(iIntValue);
                    fetVar2.e0(-206038755);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    boolean z = ql5Var.f28916a == cobVar.f4691a;
                    boolean z2 = q3d.i(cobVar.b) != iIntValue;
                    boolean zI = fetVar2.i(xnbVar);
                    Object objP = fetVar2.P();
                    if (zI || objP == cl5Var) {
                        objP = new vnb(xnbVar, function1, (byte) 0);
                        fetVar2.o0(objP);
                    }
                    oja0.d(mm40VarD, ql5Var, z2, z, (Function1) objP, fetVar2, 6);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    ql5 ql5Var2 = (ql5) list.get(iIntValue3);
                    fetVar3.e0(700222283);
                    if (iIntValue3 == 0) {
                        fetVar3.e0(700240014);
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarD2, 16.0f, 16.0f, 0.0f, 0.0f, 12);
                        kjm kjmVar = kjm.b;
                        String strH = xnbVar.H(R.string.bonus_accounts);
                        strH.getClass();
                        nkb.h(mm40VarN, new hjm(strH, null, new y3d(((ThemeColors) fetVar3.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjmVar, null, null, null, fetVar3, 384, 56);
                        fetVar = fetVar3;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar3;
                        fetVar.e0(700707618);
                        fetVar.r(false);
                    }
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    boolean z3 = q3d.i(cobVar.c) != iIntValue3;
                    boolean z4 = ql5Var2.f28916a == cobVar.f4691a;
                    boolean zI2 = fetVar.i(xnbVar);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new vnb(xnbVar, function1, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    oja0.d(mm40VarD3, ql5Var2, z3, z4, (Function1) objP2, fetVar, 6);
                    fetVar.r(false);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public wnb(List list, cob cobVar, xnb xnbVar, Function1 function1) {
        this.b = list;
        this.d = cobVar;
        this.c = xnbVar;
        this.e = function1;
    }
}
