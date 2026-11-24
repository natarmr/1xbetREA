package a;

import android.gov.nist.core.Separators;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bw7 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3312a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ bw7(long j, String str, byte b) {
        this.f3312a = b;
        this.c = j;
        this.b = str;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        float f;
        float f2;
        float f3;
        float f4;
        byte b = this.f3312a;
        String str = this.b;
        jm40 jm40Var = jm40.b;
        zhg0 zhg0Var = zhg0.f44392a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        switch (b) {
            case 0:
                Pair pair = (Pair) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                pair.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= fetVar.g(pair) ? 32 : 16;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                    String str2 = (String) pair.f46059a;
                    String str3 = (String) pair.b;
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(new daq0(qmk.r));
                        fetVar.o0(objP);
                    }
                    pz40 pz40Var = (pz40) objP;
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar.o0(objP2);
                    }
                    pz40 pz40Var2 = (pz40) objP2;
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, x7zVar);
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
                    x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false);
                    if (((Boolean) pz40Var2.getValue()).booleanValue() || str2.length() == 0) {
                        zcl zclVar = qmk.f28987a;
                        f = 0.0f;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f = 2.0f;
                    }
                    mm40 mm40VarE0 = o2e.e0(s5x0.N(x7zVarI, 0.0f, 0.0f, f, 0.0f, 11), "ADVANCE_BET_SUM");
                    String strQ = w6x.q(str, Separators.SP, str2);
                    y9q0 y9q0VarM = g1t0.m();
                    n05 n05Var = new n05(qmk.o, qmk.r, qmk.n);
                    Object objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new cw7(pz40Var, pz40Var2, (byte) 0);
                        fetVar.o0(objP3);
                    }
                    long j = this.c;
                    v8q0.a(strQ, mm40VarE0, j, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP3, y9q0VarM, fetVar, 0, 1597824, 45040);
                    v8q0.a(str3, null, j, null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.m(), fetVar, 0, 24576, 114666);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                Pair pair2 = (Pair) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                pair2.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar2.g(pair2) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    String str4 = (String) pair2.f46059a;
                    String str5 = (String) pair2.b;
                    Object objP4 = fetVar2.P();
                    if (objP4 == cl5Var) {
                        objP4 = androidx.compose.runtime.e.e(new daq0(qmk.r));
                        fetVar2.o0(objP4);
                    }
                    pz40 pz40Var3 = (pz40) objP4;
                    Object objP5 = fetVar2.P();
                    if (objP5 == cl5Var) {
                        objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar2.o0(objP5);
                    }
                    pz40 pz40Var4 = (pz40) objP5;
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    x7z x7zVarI2 = ohs0.i(fetVar2, mm40VarC1, gqw0.v, 1.0f, false);
                    if (((Boolean) pz40Var4.getValue()).booleanValue() || str4.length() == 0) {
                        zcl zclVar3 = qmk.f28987a;
                        f2 = 0.0f;
                    } else {
                        zcl zclVar4 = qmk.f28987a;
                        f2 = 2.0f;
                    }
                    mm40 mm40VarN = s5x0.N(x7zVarI2, 0.0f, 0.0f, f2, 0.0f, 11);
                    String strQ2 = w6x.q(str, Separators.SP, str4);
                    y9q0 y9q0VarM2 = g1t0.m();
                    n05 n05Var2 = new n05(qmk.o, qmk.r, qmk.n);
                    Object objP6 = fetVar2.P();
                    if (objP6 == cl5Var) {
                        objP6 = new cw7(pz40Var3, pz40Var4, (byte) 3);
                        fetVar2.o0(objP6);
                    }
                    Function1 function1 = (Function1) objP6;
                    long j2 = this.c;
                    v8q0.a(strQ2, mm40VarN, j2, n05Var2, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, function1, y9q0VarM2, fetVar2, 0, 1597824, 45040);
                    v8q0.a(str5, null, j2, null, ((daq0) pz40Var3.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.m(), fetVar2, 0, 24576, 114666);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                Pair pair3 = (Pair) obj2;
                fet fetVar3 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                pair3.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar3.g(pair3) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    String str6 = (String) pair3.f46059a;
                    String str7 = (String) pair3.b;
                    Object objP7 = fetVar3.P();
                    if (objP7 == cl5Var) {
                        objP7 = androidx.compose.runtime.e.e(new daq0(qmk.r));
                        fetVar3.o0(objP7);
                    }
                    pz40 pz40Var5 = (pz40) objP7;
                    Object objP8 = fetVar3.P();
                    if (objP8 == cl5Var) {
                        objP8 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar3.o0(objP8);
                    }
                    pz40 pz40Var6 = (pz40) objP8;
                    mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, false);
                    thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarA);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                    mm40 mm40VarA2 = zhg0Var.a(1.0f, jm40Var, false);
                    if (((Boolean) pz40Var6.getValue()).booleanValue()) {
                        zcl zclVar5 = qmk.f28987a;
                        f3 = 0.0f;
                    } else {
                        zcl zclVar6 = qmk.f28987a;
                        f3 = 2.0f;
                    }
                    mm40 mm40VarN2 = s5x0.N(mm40VarA2, 0.0f, 0.0f, f3, 0.0f, 11);
                    y9q0 y9q0VarL = g1t0.l();
                    n05 n05Var3 = new n05(qmk.o, qmk.r, qmk.n);
                    Object objP9 = fetVar3.P();
                    if (objP9 == cl5Var) {
                        objP9 = new cw7(pz40Var5, pz40Var6, (byte) 2);
                        fetVar3.o0(objP9);
                    }
                    long j3 = this.c;
                    v8q0.a(str6, mm40VarN2, j3, n05Var3, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP9, y9q0VarL, fetVar3, 0, 1597824, 45040);
                    v8q0.a(str7, zhg0Var.a(1.0f, jm40Var, false), j3, null, ((daq0) pz40Var5.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.l(), fetVar3, 0, 24576, 114664);
                    v8q0.a(this.b, zhg0Var.a(1.0f, jm40Var, false), j3, null, ((daq0) pz40Var5.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.l(), fetVar3, 0, 24576, 114664);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                Pair pair4 = (Pair) obj2;
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                pair4.getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar4.g(pair4) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    String str8 = (String) pair4.f46059a;
                    String str9 = (String) pair4.b;
                    Object objP10 = fetVar4.P();
                    if (objP10 == cl5Var) {
                        objP10 = androidx.compose.runtime.e.e(new daq0(qmk.r));
                        fetVar4.o0(objP10);
                    }
                    pz40 pz40Var7 = (pz40) objP10;
                    Object objP11 = fetVar4.P();
                    if (objP11 == cl5Var) {
                        objP11 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar4.o0(objP11);
                    }
                    pz40 pz40Var8 = (pz40) objP11;
                    mm40 mm40VarA3 = zhg0Var.a(1.0f, jm40Var, false);
                    thg0 thg0VarA4 = shg0.a(uc9.f35418a, gqw0.k, fetVar4, 48);
                    int iHashCode4 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM4 = fetVar4.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarA3);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA4, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC3, gqw0.v);
                    mm40 mm40VarA4 = zhg0Var.a(1.0f, jm40Var, false);
                    if (((Boolean) pz40Var8.getValue()).booleanValue()) {
                        zcl zclVar7 = qmk.f28987a;
                        f4 = 0.0f;
                    } else {
                        zcl zclVar8 = qmk.f28987a;
                        f4 = 2.0f;
                    }
                    mm40 mm40VarN3 = s5x0.N(mm40VarA4, 0.0f, 0.0f, f4, 0.0f, 11);
                    y9q0 y9q0VarL2 = g1t0.l();
                    n05 n05Var4 = new n05(qmk.o, qmk.r, qmk.n);
                    Object objP12 = fetVar4.P();
                    if (objP12 == cl5Var) {
                        objP12 = new cw7(pz40Var7, pz40Var8, (byte) 1);
                        fetVar4.o0(objP12);
                    }
                    long j4 = this.c;
                    v8q0.a(str8, mm40VarN3, j4, n05Var4, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP12, y9q0VarL2, fetVar4, 0, 1597824, 45040);
                    v8q0.a(str9, zhg0Var.a(1.0f, jm40Var, false), j4, null, ((daq0) pz40Var7.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.l(), fetVar4, 0, 24576, 114664);
                    v8q0.a(this.b, zhg0Var.a(1.0f, jm40Var, false), j4, null, ((daq0) pz40Var7.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.l(), fetVar4, 0, 24576, 114664);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bw7(String str, long j, byte b) {
        this.f3312a = b;
        this.b = str;
        this.c = j;
    }
}
