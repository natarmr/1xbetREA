package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class bzp0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3482a;
    public final /* synthetic */ List b;

    public /* synthetic */ bzp0(List list, byte b) {
        this.f3482a = b;
        this.b = list;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b = this.f3482a;
        jm40 jm40Var = jm40.b;
        List list = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    gzp0 gzp0Var = (gzp0) list.get(iIntValue);
                    fetVar.e0(746313769);
                    String str = gzp0Var.f12191a;
                    String str2 = gzp0Var.b;
                    mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                    zcl zclVar = qmk.f28987a;
                    zgc.F(0, fetVar, s5x0.N(mm40VarL, 0.0f, 16.0f, 0.0f, 0.0f, 13), str, str2);
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
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    cxp0 cxp0Var = (cxp0) list.get(iIntValue3);
                    fetVar2.e0(-1261355338);
                    zcl zclVar2 = qmk.f28987a;
                    qsm0.i(i120.Q(o7k0.e(jm40Var, 50.0f), cxp0Var.b, jd8.n), cxp0Var.f5133a, fetVar2, 0);
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
                    m39 m39Var = (m39) list.get(iIntValue5);
                    fetVar3.e0(-2015240391);
                    tke.m(m39Var, fetVar3, 0);
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
                    d9r0 d9r0Var = (d9r0) list.get(iIntValue7);
                    fetVar4.e0(1450306636);
                    zcl zclVar3 = qmk.f28987a;
                    dnm0.d(o7k0.b(jm40Var, 22.0f, 0.0f, 2), d9r0Var, fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                g9zVar5.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar5.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar5.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar5.U(i5 & 1, (i5 & 147) != 146)) {
                    q5s0 q5s0Var = (q5s0) list.get(iIntValue9);
                    fetVar5.e0(-541370230);
                    acb.o(null, q5s0Var.b, q5s0Var.c, fetVar5, 0, 1);
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                break;
            case 5:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                g9zVar6.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar6.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar6.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar6.U(i6 & 1, (i6 & 147) != 146)) {
                    rss0 rss0Var = (rss0) list.get(iIntValue11);
                    fetVar6.e0(1218162512);
                    mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), rss0Var.f, jd8.n);
                    thg0 thg0VarA = shg0.a(uc9.h, gqw0.k, fetVar6, 54);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM = fetVar6.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(e7z.u1);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC0, gqw0.v);
                    vbw0.m(rss0Var.b, fetVar6, 0);
                    vbw0.A(rss0Var.c, fetVar6, 0);
                    vbw0.d(rss0Var.d, rss0Var.e, fetVar6, 0);
                    fetVar6.r(true);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                break;
            default:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar7.g(g9zVar7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar7.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar7.U(i7 & 1, (i7 & 147) != 146)) {
                    nmv0 nmv0Var = (nmv0) list.get(iIntValue13);
                    fetVar7.e0(1396045745);
                    gq80.K(nmv0Var, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
