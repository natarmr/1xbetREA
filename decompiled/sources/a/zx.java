package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45134a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ l7m0 e;

    public /* synthetic */ zx(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, byte b) {
        this.f45134a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = l7m0Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        jm40 jm40Var;
        jm40 jm40Var2;
        byte b = this.f45134a;
        pcy pcyVar = e7z.u1;
        l7m0 l7m0Var = this.c;
        byte b2 = 6;
        l7m0 l7m0Var2 = this.e;
        l7m0 l7m0Var3 = this.d;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40Var, 14.0f);
                    thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    Integer num = (Integer) l7m0Var.getValue();
                    jm40 jm40Var3 = jm40.b;
                    if (num == null) {
                        fetVar.e0(1598553657);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1598553658);
                        int iIntValue2 = num.intValue();
                        j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_red_card, 6, fetVar), fetVar), null, o7k0.n(jm40Var3, 12.0f), null, null, 0.0f, null, fetVar, 56, 120);
                        String strValueOf = String.valueOf(iIntValue2);
                        mm40 mm40VarN = s5x0.N(o7k0.A(jm40Var3, null, 3), 2.0f, 0.0f, 0.0f, 0.0f, 14);
                        y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                        pz40 pz40Var = s6t0.f31722a;
                        v8q0.a(strValueOf, mm40VarN, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
                        fetVar = fetVar;
                        fetVar.r(false);
                    }
                    Integer num2 = (Integer) l7m0Var3.getValue();
                    if (num2 == null) {
                        fetVar.e0(1599260767);
                        fetVar.r(false);
                        jm40Var = jm40Var3;
                    } else {
                        fetVar.e0(1599260768);
                        int iIntValue3 = num2.intValue();
                        jm40Var = jm40Var3;
                        fet fetVar2 = fetVar;
                        j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_yellow_card, 6, fetVar), fetVar), null, o7k0.n(s5x0.N(jm40Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, 0.0f, null, fetVar2, 56, 120);
                        String strValueOf2 = String.valueOf(iIntValue3);
                        mm40 mm40VarN2 = s5x0.N(o7k0.A(jm40Var, null, 3), 2.0f, 0.0f, 0.0f, 0.0f, 14);
                        y9q0 y9q0Var2 = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                        pz40 pz40Var2 = s6t0.f31722a;
                        v8q0.a(strValueOf2, mm40VarN2, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var2, fetVar2, 0, 0, 131064);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    }
                    Integer num3 = (Integer) l7m0Var2.getValue();
                    if (num3 == null) {
                        fetVar.e0(1600050120);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1600050121);
                        int iIntValue4 = num3.intValue();
                        fet fetVar3 = fetVar;
                        j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_cornerkick, 6, fetVar), fetVar), null, o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, 0.0f, null, fetVar3, 56, 120);
                        String strValueOf3 = String.valueOf(iIntValue4);
                        mm40 mm40VarN3 = s5x0.N(o7k0.A(jm40Var, null, 3), 2.0f, 0.0f, 0.0f, 0.0f, 14);
                        y9q0 y9q0Var3 = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                        pz40 pz40Var3 = s6t0.f31722a;
                        v8q0.a(strValueOf3, mm40VarN3, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var3, fetVar3, 0, 0, 131064);
                        fetVar = fetVar3;
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar4 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 14.0f), 1.0f);
                    thg0 thg0VarA2 = shg0.a(uc9.e, gqw0.k, fetVar4, 54);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarD);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    Integer num4 = (Integer) l7m0Var.getValue();
                    jm40 jm40Var4 = jm40.b;
                    if (num4 == null) {
                        fetVar4.e0(1585968363);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1585968364);
                        int iIntValue6 = num4.intValue();
                        j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_red_card, 6, fetVar4), fetVar4), null, o7k0.n(jm40Var4, 12.0f), null, null, 0.0f, null, fetVar4, 56, 120);
                        String strValueOf4 = String.valueOf(iIntValue6);
                        mm40 mm40VarN4 = s5x0.N(o7k0.A(jm40Var4, null, 3), 4.0f, 0.0f, 0.0f, 0.0f, 14);
                        y9q0 y9q0Var4 = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                        pz40 pz40Var4 = s6t0.f31722a;
                        v8q0.a(strValueOf4, mm40VarN4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var4, fetVar4, 0, 0, 131064);
                        fetVar4 = fetVar4;
                        fetVar4.r(false);
                    }
                    Integer num5 = (Integer) l7m0Var3.getValue();
                    if (num5 == null) {
                        fetVar4.e0(1586675473);
                        fetVar4.r(false);
                        jm40Var2 = jm40Var4;
                    } else {
                        fetVar4.e0(1586675474);
                        int iIntValue7 = num5.intValue();
                        jm40Var2 = jm40Var4;
                        fet fetVar5 = fetVar4;
                        j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_yellow_card, 6, fetVar4), fetVar4), null, o7k0.n(s5x0.N(jm40Var4, 4.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, 0.0f, null, fetVar5, 56, 120);
                        String strValueOf5 = String.valueOf(iIntValue7);
                        mm40 mm40VarN5 = s5x0.N(o7k0.A(jm40Var2, null, 3), 4.0f, 0.0f, 0.0f, 0.0f, 14);
                        y9q0 y9q0Var5 = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                        pz40 pz40Var5 = s6t0.f31722a;
                        v8q0.a(strValueOf5, mm40VarN5, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var5, fetVar5, 0, 0, 131064);
                        fetVar4 = fetVar5;
                        fetVar4.r(false);
                    }
                    Integer num6 = (Integer) l7m0Var2.getValue();
                    if (num6 == null) {
                        fetVar4.e0(1587464826);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1587464827);
                        int iIntValue8 = num6.intValue();
                        fet fetVar6 = fetVar4;
                        j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_cornerkick, 6, fetVar4), fetVar4), null, o7k0.n(s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, 0.0f, null, fetVar6, 56, 120);
                        String strValueOf6 = String.valueOf(iIntValue8);
                        mm40 mm40VarN6 = s5x0.N(o7k0.A(jm40Var2, null, 3), 4.0f, 0.0f, 0.0f, 0.0f, 14);
                        y9q0 y9q0Var6 = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                        pz40 pz40Var6 = s6t0.f31722a;
                        v8q0.a(strValueOf6, mm40VarN6, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var6, fetVar6, 0, 0, 131064);
                        fetVar4 = fetVar6;
                        fetVar4.r(false);
                    }
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                fet fetVar7 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                xuz xuzVar = v330.Q1;
                if (fetVar7.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar7.k(zaq0.b)).getBackground(), jd8.n);
                    udl0 udl0Var = (udl0) l7m0Var3.getValue();
                    boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
                    Object objP = fetVar7.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = new tr20((byte) 4);
                        fetVar7.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    Object objP2 = fetVar7.P();
                    if (objP2 == cl5Var) {
                        objP2 = new tr20((byte) 5);
                        fetVar7.o0(objP2);
                    }
                    Function1 function2 = (Function1) objP2;
                    Object objP3 = fetVar7.P();
                    if (objP3 == cl5Var) {
                        objP3 = new t330((byte) 0);
                        fetVar7.o0(objP3);
                    }
                    xdr xdrVar = (xdr) objP3;
                    Object objP4 = fetVar7.P();
                    if (objP4 == cl5Var) {
                        objP4 = new t330((byte) 1);
                        fetVar7.o0(objP4);
                    }
                    xdr xdrVar2 = (xdr) objP4;
                    Object objP5 = fetVar7.P();
                    if (objP5 == cl5Var) {
                        objP5 = new t330((byte) 2);
                        fetVar7.o0(objP5);
                    }
                    xdr xdrVar3 = (xdr) objP5;
                    Object objP6 = fetVar7.P();
                    if (objP6 == cl5Var) {
                        objP6 = new tr20(b2);
                        fetVar7.o0(objP6);
                    }
                    idx.d(mm40VarQ, this.c, udl0Var, zBooleanValue, null, function1, function2, xdrVar, xdrVar2, xdrVar3, (Function1) objP6, fetVar7, 920322048, 6, 16);
                } else {
                    fetVar7.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
