package a;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ohd implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25260a;

    public /* synthetic */ ohd(byte b) {
        this.f25260a = b;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        mm40 mm40VarJ;
        fqj0 fqj0VarD0;
        mm40 mm40VarJ2;
        fqj0 fqj0VarD1;
        int i;
        switch (this.f25260a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    jm40 jm40Var = jm40.b;
                    if (iIntValue != 0) {
                        if (iIntValue == 1) {
                            fetVar.e0(1269946907);
                            zcl zclVar = qmk.f28987a;
                            mm40VarJ = lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var, xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 16.0f, 2), 288.0f), 1.0f), vgg0.a(16.0f));
                            fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
                        } else if (iIntValue != 2) {
                            fetVar.e0(1271225564);
                            zcl zclVar2 = qmk.f28987a;
                            mm40VarJ = lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var, xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 16.0f, 2), 48.0f), 1.0f), vgg0.a(16.0f));
                            fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
                        } else {
                            fetVar.e0(1270584763);
                            zcl zclVar3 = qmk.f28987a;
                            mm40VarJ = lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var, xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 16.0f, 2), 172.0f), 1.0f), vgg0.a(16.0f));
                            fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
                        }
                        dw9.x(mm40VarJ, fqj0VarD0, fetVar, 0, false);
                    } else {
                        fetVar.e0(1269072087);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var, xfn.a(fetVar).e, 8.0f, 0.0f, 8.0f, 4);
                        qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                        Object objP = fetVar.P();
                        if (objP == ukd.f35823a) {
                            objP = new y2d((byte) 10);
                            fetVar.o0(objP);
                        }
                        b8k0.f(mm40VarN, null, null, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 817889280, 366);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                fet fetVar2 = (fet) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    q0x.x(0, fetVar2, null);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                int iIntValue4 = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= fetVar3.e(iIntValue4) ? 32 : 16;
                }
                if (!fetVar3.U(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    fetVar3.X();
                } else if (iIntValue4 != 0) {
                    jm40 jm40Var2 = jm40.b;
                    if (iIntValue4 == 1) {
                        fetVar3.e0(15954270);
                        zcl zclVar5 = qmk.f28987a;
                        mm40VarJ2 = lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var2, xfn.a(fetVar3).e, 0.0f, xfn.a(fetVar3).e, 16.0f, 2), 288.0f), 1.0f), vgg0.a(16.0f));
                        fqj0VarD1 = vbc.d0(null, fetVar3, 0, 1);
                    } else if (iIntValue4 != 2) {
                        fetVar3.e0(17274591);
                        zcl zclVar6 = qmk.f28987a;
                        mm40VarJ2 = lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var2, xfn.a(fetVar3).e, 0.0f, xfn.a(fetVar3).e, 16.0f, 2), 48.0f), 1.0f), vgg0.a(16.0f));
                        fqj0VarD1 = vbc.d0(null, fetVar3, 0, 1);
                    } else {
                        fetVar3.e0(16612958);
                        zcl zclVar7 = qmk.f28987a;
                        mm40VarJ2 = lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var2, xfn.a(fetVar3).e, 0.0f, xfn.a(fetVar3).e, 16.0f, 2), 172.0f), 1.0f), vgg0.a(16.0f));
                        fqj0VarD1 = vbc.d0(null, fetVar3, 0, 1);
                    }
                    dw9.x(mm40VarJ2, fqj0VarD1, fetVar3, 0, false);
                } else {
                    fetVar3.e0(15860650);
                    s0x.v(0, fetVar3);
                    fetVar3.r(false);
                }
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar4.U(iIntValue6 & 1, (iIntValue6 & 129) != 128)) {
                    kc5.w0(0, fetVar4, null);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                fet fetVar5 = (fet) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar5.U(iIntValue7 & 1, (iIntValue7 & 129) != 128)) {
                    j47.j0(0, fetVar5, null);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                fet fetVar6 = (fet) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar6.U(iIntValue8 & 1, (iIntValue8 & 129) != 128)) {
                    jd8.P(0, fetVar6, null);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                fet fetVar7 = (fet) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar7.U(iIntValue9 & 1, (iIntValue9 & 129) != 128)) {
                    tke.K(0, fetVar7, null);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                fet fetVar8 = (fet) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar8.U(iIntValue10 & 1, (iIntValue10 & 129) != 128)) {
                    x8f.Q(0, fetVar8, null);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                fet fetVar9 = (fet) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar9.U(iIntValue11 & 1, (iIntValue11 & 129) != 128)) {
                    saj.O(0, fetVar9, null);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                fet fetVar10 = (fet) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar10.U(iIntValue12 & 1, (iIntValue12 & 129) != 128)) {
                    qjj.I(0, fetVar10, null);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                fet fetVar11 = (fet) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar11.U(iIntValue13 & 1, (iIntValue13 & 129) != 128)) {
                    eeq.K(0, fetVar11, null);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                fet fetVar12 = (fet) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue14 & 1, (iIntValue14 & 129) != 128)) {
                    gfx.q(0, fetVar12, null);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                fet fetVar13 = (fet) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar13.U(iIntValue15 & 1, (iIntValue15 & 129) != 128)) {
                    ntr.S(0, fetVar13, null);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                pwv0 pwv0Var = (pwv0) obj;
                d0m0 d0m0Var = (d0m0) obj2;
                fet fetVar14 = (fet) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                pwv0Var.getClass();
                d0m0Var.getClass();
                if ((iIntValue16 & 6) == 0) {
                    i = iIntValue16 | (fetVar14.g(pwv0Var) ? 4 : 2);
                } else {
                    i = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i |= fetVar14.g(d0m0Var) ? 32 : 16;
                }
                if (fetVar14.U(i & 1, (i & 147) != 146)) {
                    a8k0.o(pwv0Var, d0m0Var, fetVar14, i & 126);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                fet fetVar15 = (fet) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue17 & 1, (iIntValue17 & 129) != 128)) {
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 160.0f), 1.0f);
                    zcl zclVar9 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar15, xbc.c0(h97.e(zclVar9, zclVar9, zclVar9, zclVar9, mm40VarD), vbc.d0(null, fetVar15, 0, 1)));
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                ((Integer) obj).intValue();
                ((Double) obj2).doubleValue();
                List list = GamesManiaMapView.z1;
                ((String) obj3).getClass();
                ((i7t) obj4).getClass();
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                fet fetVar16 = (fet) obj3;
                int iIntValue18 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if (fetVar16.U(iIntValue18 & 1, (iIntValue18 & 129) != 128)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar16, 0);
                    int iHashCode = Long.hashCode(fetVar16.T);
                    bh90 bh90VarM = fetVar16.m();
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar16, jm40Var3);
                    mkd.c0.getClass();
                    fetVar16.i0();
                    if (fetVar16.S) {
                        fetVar16.l(e7z.u1);
                    } else {
                        fetVar16.r0();
                    }
                    jpm0.o(fetVar16, x5dVarA, gqw0.x);
                    jpm0.o(fetVar16, bh90VarM, gqw0.w);
                    jpm0.o(fetVar16, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar16);
                    jpm0.o(fetVar16, mm40VarC0, gqw0.v);
                    mm40 mm40VarS = o7k0.s(jm40Var3, 80.0f);
                    zcl zclVar10 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarS, 40.0f);
                    zcl zclVar11 = qmk.g;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    qxw.o(fetVar16, xbc.c0(h97.e(zclVar11, zclVar11, zclVar11, zclVar11, mm40VarE), vbc.d0(null, fetVar16, 0, 1)));
                    h97.s(h97.e(zclVar11, zclVar11, zclVar11, zclVar11, o7k0.e(o7k0.s(s5x0.N(jm40Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), 80.0f), 40.0f)), vbc.d0(null, fetVar16, 0, 1), fetVar16, true);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            default:
                return new lw90((CoroutineContext) obj, (Context) obj2, (r4i0) obj3, (rs00) obj4);
        }
    }
}
