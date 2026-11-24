package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p0i implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26151a;
    public final /* synthetic */ List b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ p0i(List list, float f, Function2 function2, byte b) {
        this.f26151a = b;
        this.b = list;
        this.c = f;
        this.d = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        fet fetVar;
        int i4;
        byte b = this.f26151a;
        cl5 cl5Var = ukd.f35823a;
        float f = this.c;
        jm40 jm40Var = jm40.b;
        Function2 function2 = this.d;
        List list = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                g9zVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    vpl vplVar = (vpl) list.get(iIntValue);
                    fetVar2.e0(-1297810576);
                    unh0.r(null, vplVar, this.c, this.d, fetVar2, 384);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                k8z k8zVar = (k8z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(k8zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    xjw xjwVar = (xjw) list.get(iIntValue3);
                    fetVar3.e0(1378686437);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(o7k0.u(jm40Var, 0.0f, 400.0f, 1), f * 0.9f);
                    gy30 gy30Var = xjwVar.c;
                    boolean zG = fetVar3.g(function2) | fetVar3.i(xjwVar);
                    Object objP = fetVar3.P();
                    if (zG || objP == cl5Var) {
                        objP = new nsr(function2, xjwVar, (byte) 10);
                        fetVar3.o0(objP);
                    }
                    jiq0.y(mm40VarS, gy30Var, (Function0) objP, null, null, fetVar3, 0, 24);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar4.g(g9zVar2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar4.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
                    a4x a4xVar = (a4x) list.get(iIntValue5);
                    fetVar4.e0(-855707664);
                    mm40 mm40VarD = g9zVar2.d(0.9f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarU = o7k0.u(mm40VarD, 0.0f, 400.0f, 1);
                    x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar4, 0);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarU);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(e7z.u1);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, x5dVarA, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    Iterator itO = h97.o(fetVar4, mm40VarC0, gqw0.v, 530393230, a4xVar);
                    while (itO.hasNext()) {
                        a4r0 a4r0Var = (a4r0) itO.next();
                        if (a4r0Var instanceof y3r0) {
                            fetVar4.e0(-267498266);
                            y3r0 y3r0Var = (y3r0) a4r0Var;
                            fetVar4.b0(407081366, Integer.valueOf(y3r0Var.f41967a));
                            mm40 mm40VarE = o7k0.e(jm40Var, f);
                            gy30 gy30Var2 = y3r0Var.c;
                            boolean zG2 = fetVar4.g(a4r0Var) | fetVar4.g(function2);
                            Object objP2 = fetVar4.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new ha30(function2, y3r0Var, (byte) 7);
                                fetVar4.o0(objP2);
                            }
                            fet fetVar5 = fetVar4;
                            jiq0.y(mm40VarE, gy30Var2, (Function0) objP2, null, null, fetVar5, 6, 24);
                            fetVar = fetVar5;
                            fetVar.r(false);
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar4;
                            if (!Intrinsics.d(a4r0Var, z3r0.f43736a)) {
                                throw b1j.f(407079375, fetVar, false);
                            }
                            fetVar.e0(407092714);
                            qxw.o(fetVar, o7k0.e(jm40Var, f));
                            fetVar.r(false);
                        }
                        fetVar4 = fetVar;
                    }
                    ohs0.x(fetVar4, false, true, false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            default:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                g9zVar3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar6.g(g9zVar3) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar6.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar6.U(i4 & 1, (i4 & 147) != 146)) {
                    kvl0 kvl0Var = (kvl0) list.get(iIntValue7);
                    fetVar6.e0(-15724555);
                    mm40 mm40VarS2 = o7k0.s(o2e.e0(jm40Var, "STADIUMS_CELL"), f * 0.9f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(o7k0.u(mm40VarS2, 0.0f, 400.0f, 1), 168.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ = i120.Q(mm40VarE2, s6t0.b().f33626a.getBackgroundContent(), vgg0.a(16.0f));
                    boolean zG3 = fetVar6.g(function2) | fetVar6.i(kvl0Var);
                    Object objP3 = fetVar6.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new sue0(function2, kvl0Var, (byte) 26);
                        fetVar6.o0(objP3);
                    }
                    x0x.p(y860.W(mm40VarQ, null, null, false, null, (Function0) objP3, 28), kvl0Var, fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
        }
    }
}
