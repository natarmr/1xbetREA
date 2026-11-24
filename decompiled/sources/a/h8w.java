package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final class h8w implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12649a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h8w(List list, Object obj, Object obj2, byte b) {
        this.f12649a = b;
        this.b = list;
        this.c = obj;
        this.d = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            vo5 vo5Var = (vo5) this.b.get(iIntValue);
            fetVar.e0(1788622579);
            i120.h(null, vo5Var, (Function1) this.c, (xdr) this.d, fetVar, 64);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Object obj5 = this.c;
        ekf0 ekf0Var = (ekf0) obj5;
        vne vneVar = (vne) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            d160 d160Var = (d160) this.b.get(iIntValue);
            fetVar.e0(-1727160046);
            mm40 mm40VarQ = ydx.Q(g9zVar, (ekf0) obj5, d160Var.c, false, fetVar, (i & 14) | 3072, 8);
            zrm zrmVar = d160Var.b;
            boolean zI = fetVar.i(vneVar) | fetVar.g(ekf0Var) | fetVar.g(d160Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new xg(vneVar, ekf0Var, d160Var, (byte) 9);
                fetVar.o0(objP);
            }
            agc.r(mm40VarQ, zrmVar, null, null, null, null, (Function1) objP, fetVar, 0, 60);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            ka00 ka00Var = (ka00) ((a4x) this.b).get(iIntValue);
            fetVar.e0(-2147086421);
            if (ka00Var != null) {
                if (ka00Var instanceof ja00) {
                    fetVar.e0(346383082);
                    b8k0.o(((ja00) ka00Var).f16165a, fetVar, 0);
                    fetVar.r(false);
                } else if (ka00Var instanceof ia00) {
                    fetVar.e0(346386268);
                    ia00 ia00Var = (ia00) ka00Var;
                    boolean z = ((bb00) this.d).g;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new w8v(function1, (byte) 19);
                        fetVar.o0(objP);
                    }
                    g1x.i(ia00Var, z, (Function1) objP, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(346381144, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0271  */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Object obj5 = this.c;
        Function1 function1 = (Function1) obj5;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(-1994097752);
            if (p6t0Var == null) {
                fetVar.e0(-1989281221);
                fetVar.r(false);
            } else {
                boolean z = p6t0Var instanceof gdp;
                Object obj6 = this.d;
                if (z) {
                    fetVar.e0(1044050089);
                    epv0.v(0, fetVar, ((gdp) p6t0Var).c, (bdz) obj6, null, (Function1) obj5);
                    fetVar.r(false);
                } else if (p6t0Var instanceof rt0) {
                    fetVar.e0(1044058926);
                    ckb.f(null, ((rt0) p6t0Var).b, null, s5x0.t(xfn.a(fetVar).d, 0.0f, 2), null, null, null, null, fetVar, 0, 245);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (p6t0Var instanceof sfp) {
                    fetVar.e0(1044069226);
                    uzb.x(null, ((sfp) p6t0Var).b, s5x0.t(xfn.a(fetVar).c, 0.0f, 2), null, null, null, fetVar, 0, 121);
                    fetVar.r(false);
                } else if (p6t0Var instanceof n5p) {
                    fetVar.e0(-1993267728);
                    epv0.k(0, fetVar, ((n5p) p6t0Var).c, (bdz) obj6, null, (Function1) obj5);
                    fetVar.r(false);
                } else {
                    boolean z2 = p6t0Var instanceof nt0;
                    cl5 cl5Var = ukd.f35823a;
                    if (z2) {
                        fetVar.e0(-1992975212);
                        zll zllVar = ((nt0) p6t0Var).c;
                        lh80 lh80VarT = s5x0.t(xfn.a(fetVar).d, 0.0f, 2);
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new w8v(function1, (byte) 20);
                            fetVar.o0(objP);
                        }
                        Function1 function2 = (Function1) objP;
                        boolean zG2 = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new w8v(function1, (byte) 21);
                            fetVar.o0(objP2);
                        }
                        Function1 function3 = (Function1) objP2;
                        boolean zG3 = fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new w8v(function1, (byte) 22);
                            fetVar.o0(objP3);
                        }
                        ckb.f(null, zllVar, null, lh80VarT, null, function2, function3, (Function1) objP3, fetVar, 0, 21);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else if (p6t0Var instanceof wde0) {
                        fetVar.e0(1044115556);
                        fyl fylVar = new fyl(((wde0) p6t0Var).f38969a, null, syl.b, null, null, 26);
                        boolean zG4 = fetVar.g(function1);
                        Object objP4 = fetVar.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new w8v(function1, (byte) 23);
                            fetVar.o0(objP4);
                        }
                        ebc.r(null, fylVar, null, null, (Function1) objP4, fetVar, 0, 29);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else if (p6t0Var instanceof rfp) {
                        fetVar.e0(-1991680838);
                        xcz xczVarB = ((bdz) obj6).b("FAVORITES_OTHER_GAMES_STATE", fetVar);
                        lh80 lh80VarT2 = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
                        ftr ftrVar = ((rfp) p6t0Var).c;
                        boolean zG5 = fetVar.g(function1);
                        Object objP5 = fetVar.P();
                        if (zG5 || objP5 == cl5Var) {
                            objP5 = new hrk(function1, (byte) 8);
                            fetVar.o0(objP5);
                        }
                        Function2 function4 = (Function2) objP5;
                        boolean zG6 = fetVar.g(function1);
                        Object objP6 = fetVar.P();
                        if (zG6 || objP6 == cl5Var) {
                            objP6 = new w8v(function1, (byte) 24);
                            fetVar.o0(objP6);
                        }
                        uzb.x(null, ftrVar, lh80VarT2, xczVarB, function4, (Function1) objP6, fetVar, 0, 65);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof rc80) {
                        fetVar.e0(1044191293);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar).e, 8.0f, xfn.a(fetVar).e, 0.0f, 8);
                        jjm jjmVar = ((rc80) p6t0Var).f30225a;
                        kjm kjmVar = kjm.f18392a;
                        boolean zG7 = fetVar.g(function1) | fetVar.g(p6t0Var);
                        Object objP7 = fetVar.P();
                        if (zG7 || objP7 == cl5Var) {
                            objP7 = new z7(function1, p6t0Var, (byte) 16);
                            fetVar.o0(objP7);
                        }
                        nkb.h(mm40VarN, jjmVar, kjmVar, null, (Function0) objP7, null, fetVar, 384, 40);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1989281221);
                        fetVar.r(false);
                    }
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
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
            ud80 ud80Var = (ud80) this.b.get(iIntValue);
            fetVar.e0(-1927469532);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = jgk0.b(new i5(iIntValue, (a4x) this.d, ud80Var));
                fetVar.o0(objP);
            }
            if (((Boolean) ((l7m0) objP).getValue()).booleanValue()) {
                zcl zclVar = qmk.f28987a;
                f = 4.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 0.0f;
            }
            hmw0.n(s5x0.N(jm40.b, 0.0f, f, 0.0f, 0.0f, 13), ud80Var, (Function2) this.c, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        dn90 dn90Var = (dn90) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            hn90 hn90Var = (hn90) ((a4x) this.b).get(iIntValue);
            fetVar.e0(111341653);
            rqm rqmVar = hn90Var.b;
            boolean zI = fetVar.i(dn90Var) | fetVar.g(hn90Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new cn90(dn90Var, hn90Var, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(dn90Var) | fetVar.g(hn90Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new cn90(dn90Var, hn90Var, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(null, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 384, 169);
            if (iIntValue != q3d.i(((in90) ((l7m0) this.d).getValue()).f15063a)) {
                fetVar.e0(111809814);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(jm40.b, 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(112036455);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        wui0 wui0Var;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        z5a0 z5a0Var = (z5a0) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            j240 j240Var = (j240) ((a4x) this.b).get(iIntValue);
            fetVar.e0(646801637);
            zcl zclVar = qmk.f28987a;
            float f = iIntValue == 0 ? 12.0f : 0.0f;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            w5a0 w5a0Var = (w5a0) z5a0Var;
            a4x a4xVar = w5a0Var.d;
            a4x a4xVar2 = w5a0Var.d;
            mm40 mm40VarM = s5x0.M(jm40.b, f2, f, f3, iIntValue == q3d.i(a4xVar) ? 24.0f : 0.0f);
            nui0 nui0Var = new nui0(Integer.valueOf(j240Var.f15765a.getF47018a()), null, new m0x(j240Var.f15765a.getF47018a(), null, 6), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), null, null, 0.0f, 242);
            tui0 tui0Var = new tui0(j240Var.b, null);
            if (iIntValue == 0 && a4xVar2.size() == 1) {
                wui0Var = wui0.f39793a;
            } else if (iIntValue == 0) {
                wui0Var = wui0.b;
            } else {
                wui0Var = iIntValue == q3d.i(a4xVar2) ? wui0.d : wui0.c;
            }
            rqm rqmVar = new rqm((vui0) tui0Var, (pui0) nui0Var, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 444);
            boolean zG = fetVar.g(function1) | fetVar.g(j240Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new puh(function1, j240Var, (byte) 3);
                fetVar.o0(objP);
            }
            obc.q(mm40VarM, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(231727936);
            if (p6t0Var == null) {
                fetVar.e0(232422738);
                fetVar.r(false);
            } else {
                boolean z = p6t0Var instanceof ssc0;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar.e0(423118456);
                    String str = ((ssc0) p6t0Var).b;
                    String str2 = ((tsc0) this.d).i;
                    boolean zG = fetVar.g(function1) | fetVar.g(p6t0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new z7(function1, p6t0Var, (byte) 18);
                        fetVar.o0(objP);
                    }
                    hmw0.m(str, str2, (Function0) objP, fetVar, 0);
                    fetVar.r(false);
                } else if (p6t0Var instanceof ytc0) {
                    fetVar.e0(423127896);
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 6.0f, 7);
                    luc0 luc0Var = new luc0(((ytc0) p6t0Var).b, guc0.f11922a, null);
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new v6a0(function1, (byte) 11);
                        fetVar.o0(objP2);
                    }
                    x2x.k(mm40VarN, luc0Var, false, (Function1) objP2, fetVar, 0, 4);
                    fetVar.r(false);
                } else {
                    fetVar.e0(232422738);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k8z k8zVar = (k8z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        bef0 bef0Var = (bef0) this.d;
        Function1 function1 = (Function1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(k8zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            a2n a2nVar = (a2n) this.b.get(iIntValue);
            fetVar.e0(194184406);
            if (a2nVar == null) {
                fetVar.e0(194844612);
                fetVar.r(false);
            } else {
                boolean z = a2nVar instanceof y56;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar.e0(194222628);
                    y56 y56Var = (y56) a2nVar;
                    boolean z2 = bef0Var.c;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new v6a0(function1, (byte) 14);
                        fetVar.o0(objP);
                    }
                    vcc.i(null, y56Var, z2, (Function1) objP, null, fetVar, 0, 17);
                    fetVar.r(false);
                } else if (a2nVar instanceof c2o0) {
                    fetVar.e0(194550112);
                    c2o0 c2o0Var = (c2o0) a2nVar;
                    boolean z3 = bef0Var.c;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new v6a0(function1, (byte) 15);
                        fetVar.o0(objP2);
                    }
                    hkb.n(null, c2o0Var, z3, (Function1) objP2, null, fetVar, 0, 17);
                    fetVar.r(false);
                } else {
                    fetVar.e0(194844612);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        n7g0 n7g0Var = (n7g0) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            dyl0 dyl0Var = (dyl0) this.b.get(iIntValue);
            fetVar.e0(682800284);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(jm40.b, xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, iIntValue == ((b5g0) this.c).f2002a.size() - 1 ? 24.0f : 0.0f);
            mim0 mim0Var = dyl0Var.d;
            boolean zI = fetVar.i(n7g0Var) | fetVar.i(dyl0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new pwe0(n7g0Var, dyl0Var, (byte) 7);
                fetVar.o0(objP);
            }
            lgb.n(mm40VarM, mim0Var, true, (Function1) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            nla nlaVar = (nla) ((a4x) this.b).get(iIntValue);
            fetVar.e0(966074192);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, qmk.a(fetVar).c, 0.0f, 2);
            boolean z = ((uie) this.d).d;
            boolean zG = fetVar.g(nlaVar) | fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new v22(nlaVar, function1, (byte) 1);
                fetVar.o0(objP);
            }
            rcb.C(mm40VarL, nlaVar, z, (Function1) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Object obj5 = this.c;
        Function1 function1 = (Function1) obj5;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            pkh0 pkh0Var = (pkh0) this.b.get(iIntValue);
            fetVar.e0(1096332912);
            xx30 xx30Var = pkh0Var.c;
            x6q0 x6q0Var = pkh0Var.b;
            bmh0 bmh0Var = pkh0Var.f27134a;
            cqq cqqVar = (cqq) ((Map) this.d).get(bmh0Var.toString());
            boolean zI = fetVar.i(pkh0Var) | fetVar.g(function1);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new pwe0(pkh0Var, function1, (byte) 15);
                fetVar.o0(objP);
            }
            x4d0.N(j120.b0(jm40.b, (Function1) objP), xx30Var, bmh0Var, x6q0Var, cqqVar, (Function1) obj5, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        d3i0 d3i0Var = (d3i0) this.d;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            khq0 khq0Var = (khq0) this.b.get(iIntValue);
            fetVar.e0(649909528);
            if (khq0Var == null) {
                fetVar.e0(650266058);
                fetVar.r(false);
            } else {
                boolean z = khq0Var instanceof phq0;
                Object obj5 = this.c;
                if (z) {
                    fetVar.e0(-394675567);
                    Function1 function1 = (Function1) obj5;
                    gle0 gle0Var = d3i0.n2;
                    d3i0Var.Q0(null, (phq0) khq0Var, function1, fetVar, 0);
                    fetVar.r(false);
                } else if (khq0Var instanceof sgq0) {
                    fetVar.e0(-394670061);
                    Function1 function2 = (Function1) obj5;
                    gle0 gle0Var2 = d3i0.n2;
                    d3i0Var.P0(null, (sgq0) khq0Var, function2, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(650266058);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long backgroundContent;
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
            v2n v2nVar = (v2n) this.b.get(iIntValue);
            fetVar.e0(131590401);
            y3d y3dVar = ((z2n) this.d).b;
            if (y3dVar == null) {
                fetVar.e0(-1658319556);
                backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                fetVar.r(false);
            } else {
                fetVar.e0(-1658320889);
                fetVar.r(false);
                backgroundContent = y3dVar.f41946a;
            }
            ntr.n(null, backgroundContent, v2nVar, (Function1) this.c, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        yjj0 yjj0VarC;
        boolean z;
        ljc ljcVar = jd8.n;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        a4x a4xVar = ((kfl0) this.d).b;
        Function1 function1 = (Function1) this.c;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(-765993463);
            if (p6t0Var == null) {
                z = false;
                fetVar.e0(-762100453);
                fetVar.r(false);
            } else {
                boolean z2 = p6t0Var instanceof rfl0;
                jm40 jm40Var = jm40.b;
                if (z2) {
                    fetVar.e0(-766050008);
                    nkb.h(s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2), ((rfl0) p6t0Var).f30394a, kjm.b, null, null, null, fetVar, 384, 56);
                    fetVar.r(false);
                } else {
                    boolean z3 = p6t0Var instanceof rer0;
                    cl5 cl5Var = ukd.f35823a;
                    if (z3) {
                        fetVar.e0(-765732103);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                        f3n f3nVar = ((rer0) p6t0Var).f30350a;
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new v6a0(function1, (byte) 27);
                            fetVar.o0(objP);
                        }
                        qcc.m(mm40VarN, f3nVar, (Function1) objP, fetVar, 4);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof gpp) {
                        fetVar.e0(-765160711);
                        p6t0 p6t0Var2 = (p6t0) CollectionsKt.W(iIntValue - 1, a4xVar);
                        boolean z4 = ((p6t0) CollectionsKt.W(iIntValue + 1, a4xVar)) instanceof gpp;
                        boolean z5 = p6t0Var2 instanceof gpp;
                        if (z5 && z4) {
                            yjj0VarC = ljcVar;
                        } else if (!z5 && !z4) {
                            zcl zclVar2 = qmk.f28987a;
                            yjj0VarC = vgg0.a(16.0f);
                        } else if (z4) {
                            zcl zclVar3 = qmk.f28987a;
                            yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                        }
                        mm40 mm40VarQ = i120.Q(lgb.J(s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2), yjj0VarC), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar);
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, x5dVarA, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, !z5 ? 8.0f : 0.0f, 4.0f, z4 ? 0.0f : 8.0f);
                        b8l0 b8l0Var = ((gpp) p6t0Var).d;
                        boolean zG2 = fetVar.g(function1) | fetVar.g(p6t0Var);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new z7(function1, p6t0Var, (byte) 22);
                            fetVar.o0(objP2);
                        }
                        Function0 function0 = (Function0) objP2;
                        boolean zG3 = fetVar.g(function1) | fetVar.g(p6t0Var);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new z7(function1, p6t0Var, (byte) 23);
                            fetVar.o0(objP3);
                        }
                        Function0 function2 = (Function0) objP3;
                        boolean zG4 = fetVar.g(function1) | fetVar.g(p6t0Var);
                        Object objP4 = fetVar.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new bi2(function1, p6t0Var, (byte) 7);
                            fetVar.o0(objP4);
                        }
                        xbc.o(mm40VarM, b8l0Var, null, null, false, function0, function2, null, (Function1) objP4, fetVar, 0, 156);
                        if (z4) {
                            fetVar.e0(70149864);
                            mbc.o(zfi0.f44303a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                            z = false;
                            fetVar.r(false);
                        } else {
                            z = false;
                            fetVar.e0(70461073);
                            fetVar.r(false);
                        }
                        fetVar.r(true);
                        fetVar.r(z);
                    } else {
                        z = false;
                        fetVar.e0(-762100453);
                        fetVar.r(false);
                    }
                }
                z = false;
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        i3t0 i3t0Var = (i3t0) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            dyl0 dyl0Var = (dyl0) ((a4x) this.b).get(iIntValue);
            fetVar.e0(1328922824);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8);
            mim0 mim0Var = dyl0Var.d;
            boolean z = ((h0m0) ((l7m0) this.c).getValue()).b;
            boolean zI = fetVar.i(i3t0Var) | fetVar.i(dyl0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new o3l0(i3t0Var, dyl0Var, (byte) 24);
                fetVar.o0(objP);
            }
            lgb.n(mm40VarN, mim0Var, z, (Function1) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        wui0 wui0Var;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            tdb tdbVar = (tdb) ((ArrayList) this.b).get(iIntValue);
            fetVar.e0(-131892159);
            String str = tdbVar.b;
            zfn zfnVar = zaq0.b;
            tui0 tui0Var = new tui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()));
            nui0 nui0Var = new nui0(Integer.valueOf(R.drawable.ic_star_filled), null, new m0x(tdbVar.f33760a.f47018a, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackground())), 0.0f, 210);
            if (arrayList.size() == 1) {
                wui0Var = wui0.f39793a;
            } else if (iIntValue == 0) {
                wui0Var = wui0.b;
            } else {
                wui0Var = iIntValue == arrayList.size() - 1 ? wui0.d : wui0.c;
            }
            rqm rqmVar = new rqm((vui0) tui0Var, (pui0) nui0Var, (pvi0) null, (d4d) null, (tvi0) qvi0.f29388a, wui0Var, false, (e900) null, Response.CONDITIONAL_REQUEST_FAILED);
            boolean zG = fetVar.g(function1) | fetVar.i(tdbVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new sue0(function1, tdbVar, (byte) 28);
                fetVar.o0(objP);
            }
            obc.q(null, rqmVar, true, null, (Function0) objP, null, null, null, fetVar, 384, 233);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object y(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        snn0 snn0Var = (snn0) this.c;
        byte b = 2;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            wnn0 wnn0Var = (wnn0) ((a4x) this.b).get(iIntValue);
            fetVar.e0(180727791);
            rqm rqmVar = wnn0Var.b;
            boolean zI = fetVar.i(snn0Var) | fetVar.g(wnn0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new ywm0(snn0Var, wnn0Var, b);
                fetVar.o0(objP);
            }
            obc.q(null, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 233);
            if (iIntValue != q3d.i(((xnn0) ((l7m0) this.d).getValue()).f41178a)) {
                fetVar.e0(181039309);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(jm40.b, 16.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(181265950);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object z(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            o8w o8wVar = (o8w) ((ArrayList) this.b).get(iIntValue);
            fetVar.e0(-952948763);
            nnw0.e(iIntValue, o8wVar, (x77) this.d, (Function1) this.c, fetVar, ((i & 126) >> 3) & 14);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:389:0x0979  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long secondary;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        mm40 mm40VarL;
        int i8;
        mm40 mm40VarL2;
        int i9;
        fet fetVar;
        float f;
        int i10;
        int i11;
        byte b = this.f12649a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.d;
        List list = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj6;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    e8w e8wVar = (e8w) list.get(iIntValue);
                    fetVar2.e0(-1394542241);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL3 = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
                    String str = e8wVar.b;
                    int i12 = e8wVar.f7393a;
                    boolean z = e8wVar.c;
                    tui0 tui0Var = new tui0(str, null);
                    Integer numValueOf = Integer.valueOf(i12);
                    m0x m0xVar = new m0x(i12, null, 6);
                    if (z) {
                        pz40 pz40Var = s6t0.f31722a;
                        secondary = s6t0.b().f33626a.getPrimary();
                    } else {
                        pz40 pz40Var2 = s6t0.f31722a;
                        secondary = s6t0.b().f33626a.getSecondary();
                    }
                    rqm rqmVar = new rqm((vui0) tui0Var, (pui0) new oui0(numValueOf, (y3d) null, m0xVar, new y3d(secondary), 18), (pvi0) new nvi0(z), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT);
                    boolean zG = fetVar2.g(function1) | fetVar2.g(e8wVar);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new g8w(function1, e8wVar, (byte) 0);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar2.g(function1) | fetVar2.g(e8wVar);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new g8w(function1, e8wVar, (byte) 1);
                        fetVar2.o0(objP2);
                    }
                    obc.q(mm40VarL3, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar2, 384, 168);
                    if (iIntValue != q3d.i(((b8w) obj5).f2179a)) {
                        fetVar2.e0(-1392983934);
                        mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 16.0f, 0.0f, 2), false, fetVar2, 6, 4);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1392811481);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
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
                    hdw hdwVar = (hdw) list.get(iIntValue3);
                    fetVar3.e0(-1541777408);
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarA0 = saj.a0(jm40Var2, hdwVar.d, (Function1) obj6, (Function1) obj5, fetVar3, 6);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarA0);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(e7z.u1);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    m0x0.z(null, hdwVar, fetVar3, 64);
                    zcl zclVar2 = qmk.f28987a;
                    y860.i(s5x0.N(jm40Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), hdwVar.d, 38.0f, null, null, fetVar3, 0, 24);
                    fetVar3.r(true);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar4.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar4.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
                    fpw fpwVar = (fpw) list.get(iIntValue5);
                    fetVar4.e0(-1819476173);
                    mm40 mm40VarN = jm40.b;
                    if (iIntValue5 == 0) {
                        zcl zclVar3 = qmk.f28987a;
                        mm40VarN = s5x0.N(mm40VarN, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    } else if (iIntValue5 == ((drw) obj5).b.size() - 1) {
                        zcl zclVar4 = qmk.f28987a;
                        mm40VarN = s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 24.0f, 7);
                    }
                    obc.A(mm40VarN, fpwVar, (Function1) obj6, u1c.M(-595647786, new bkh(fpwVar, (byte) 2), fetVar4), fetVar4, 3072);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                Function1 function2 = (Function1) obj6;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar5.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar5.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
                    zdo zdoVar = (zdo) list.get(iIntValue7);
                    fetVar5.e0(-271937421);
                    if (zdoVar == null) {
                        fetVar5.e0(-269317736);
                        fetVar5.r(false);
                    } else {
                        boolean z2 = zdoVar instanceof beo;
                        jm40 jm40Var3 = jm40.b;
                        if (z2) {
                            fetVar5.e0(-271884877);
                            boolean zG3 = fetVar5.g(function2) | fetVar5.i(zdoVar);
                            Object objP3 = fetVar5.P();
                            if (zG3 || objP3 == cl5Var) {
                                objP3 = new nsr((Object) function2, (Object) zdoVar, (byte) 12);
                                fetVar5.o0(objP3);
                            }
                            mm40 mm40VarW = y860.W(jm40Var3, null, null, false, null, (Function0) objP3, 28);
                            Object objP4 = fetVar5.P();
                            if (objP4 == cl5Var) {
                                objP4 = j9x.b;
                                fetVar5.o0(objP4);
                            }
                            mm40 mm40VarK = rq8.K(mm40VarW, (Function1) objP4);
                            zcl zclVar5 = qmk.f28987a;
                            q8x.f(s5x0.M(mm40VarK, 8.0f, 4.0f, 8.0f, 8.0f), (beo) zdoVar, ((Boolean) ((l7m0) ((l7m0) obj5).getValue()).getValue()).booleanValue(), fetVar5, 0);
                            fetVar5.r(false);
                        } else if (zdoVar instanceof thd0) {
                            fetVar5.e0(-269962474);
                            qbc.p(null, ((thd0) zdoVar).f33956a, fetVar5, 0);
                            fetVar5.r(false);
                        } else if (zdoVar instanceof mao) {
                            fetVar5.e0(-269670516);
                            zcl zclVar6 = qmk.f28987a;
                            sj3.s(s5x0.N(jm40Var3, 8.0f, 8.0f, 8.0f, 0.0f, 8), (mao) zdoVar, fetVar5, 0);
                            fetVar5.r(false);
                        } else {
                            fetVar5.e0(-269317736);
                            fetVar5.r(false);
                        }
                    }
                    fetVar5.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                xdr xdrVar = (xdr) obj5;
                g9zVar5.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar6.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar6.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar6.U(i5 & 1, (i5 & 147) != 146)) {
                    jvy jvyVar = (jvy) ((ArrayList) list).get(iIntValue9);
                    fetVar6.e0(1618715718);
                    int iIndexOf = ((kvy) obj6).f18977a.indexOf(jvyVar) + 1;
                    boolean zG4 = fetVar6.g(xdrVar) | fetVar6.e(iIndexOf);
                    Object objP5 = fetVar6.P();
                    if (zG4 || objP5 == cl5Var) {
                        objP5 = new dvy(xdrVar, iIndexOf);
                        fetVar6.o0(objP5);
                    }
                    gfx.b(jm40Var, jvyVar, (Function2) objP5, fetVar6, 6);
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                k8z k8zVar = (k8z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                k8zVar.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar7.g(k8zVar) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar7.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                    oea0 oea0Var = (oea0) list.get(iIntValue11);
                    fetVar7.e0(-2096310193);
                    boolean zG5 = fetVar7.g(oea0Var.f25114a);
                    Object objP6 = fetVar7.P();
                    if (zG5 || objP6 == cl5Var) {
                        objP6 = jgk0.b(new nsr((Object) oea0Var, obj5, (byte) 25));
                        fetVar7.o0(objP6);
                    }
                    fww.d(null, oea0Var, (l7m0) objP6, (Function1) obj6, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                a4x a4xVar = ((hk00) obj5).f13186a;
                Function1 function3 = (Function1) obj6;
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar8.g(g9zVar6) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar8.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar8.U(i7 & 1, (i7 & 147) != 146)) {
                    ek00 ek00Var = (ek00) list.get(iIntValue13);
                    fetVar8.e0(-1233124896);
                    if (iIntValue13 == 0 && a4xVar.size() == 1) {
                        fetVar8.e0(-1232857646);
                        long backgroundContent = ((ThemeColors) fetVar8.k(zaq0.b)).getBackgroundContent();
                        zcl zclVar7 = qmk.f28987a;
                        mm40VarL = s5x0.K(i120.Q(jm40Var, backgroundContent, vgg0.a(16.0f)), 4.0f, 8.0f);
                        fetVar8.r(false);
                    } else if (iIntValue13 == 0) {
                        fetVar8.e0(-1232318649);
                        long backgroundContent2 = ((ThemeColors) fetVar8.k(zaq0.b)).getBackgroundContent();
                        zcl zclVar8 = qmk.f28987a;
                        mm40VarL = s5x0.N(i120.Q(jm40Var, backgroundContent2, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 4.0f, 8.0f, 4.0f, 0.0f, 8);
                        fetVar8.r(false);
                    } else if (iIntValue13 == q3d.i(a4xVar)) {
                        fetVar8.e0(-1231739290);
                        long backgroundContent3 = ((ThemeColors) fetVar8.k(zaq0.b)).getBackgroundContent();
                        zcl zclVar9 = qmk.f28987a;
                        mm40VarL = s5x0.N(i120.Q(jm40Var, backgroundContent3, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3)), 4.0f, 0.0f, 4.0f, 8.0f, 2);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(-1231489151);
                        mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar8.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        zcl zclVar10 = qmk.f28987a;
                        mm40VarL = s5x0.L(mm40VarQ, 4.0f, 0.0f, 2);
                        fetVar8.r(false);
                    }
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar8, 0);
                    int iHashCode2 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM2 = fetVar8.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar8, mm40VarL);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(e7z.u1);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC1, gqw0.v);
                    b8l0 b8l0Var = ek00Var.b;
                    n3l0 n3l0Var = ek00Var.c;
                    boolean zG6 = fetVar8.g(ek00Var) | fetVar8.g(function3);
                    Object objP7 = fetVar8.P();
                    if (zG6 || objP7 == cl5Var) {
                        objP7 = new bxy(ek00Var, function3, (byte) 2);
                        fetVar8.o0(objP7);
                    }
                    Function0 function4 = (Function0) objP7;
                    boolean zG7 = fetVar8.g(ek00Var) | fetVar8.g(function3);
                    Object objP8 = fetVar8.P();
                    if (zG7 || objP8 == cl5Var) {
                        objP8 = new bxy(ek00Var, function3, (byte) 3);
                        fetVar8.o0(objP8);
                    }
                    Function0 function5 = (Function0) objP8;
                    boolean zG8 = fetVar8.g(ek00Var) | fetVar8.g(function3);
                    Object objP9 = fetVar8.P();
                    if (zG8 || objP9 == cl5Var) {
                        objP9 = new dxy(ek00Var, function3, (byte) 1);
                        fetVar8.o0(objP9);
                    }
                    xbc.o(null, b8l0Var, n3l0Var, null, false, function4, function5, null, (Function1) objP9, fetVar8, 0, 153);
                    if (iIntValue13 != q3d.i(a4xVar)) {
                        fetVar8.e0(-153206987);
                        mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 12.0f, 0.0f, 2), false, fetVar8, 6, 4);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(-152996807);
                        fetVar8.r(false);
                    }
                    fetVar8.r(true);
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                a4x a4xVar2 = ((o6w) obj5).f24758a;
                Function1 function6 = (Function1) obj6;
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar9.g(g9zVar7) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar9.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar9.U(i8 & 1, (i8 & 147) != 146)) {
                    l6w l6wVar = (l6w) list.get(iIntValue15);
                    fetVar9.e0(947903100);
                    if (iIntValue15 == 0 && a4xVar2.size() == 1) {
                        fetVar9.e0(948129616);
                        long backgroundContent4 = ((ThemeColors) fetVar9.k(zaq0.b)).getBackgroundContent();
                        zcl zclVar11 = qmk.f28987a;
                        mm40VarL2 = s5x0.K(i120.Q(jm40Var, backgroundContent4, vgg0.a(16.0f)), 4.0f, 8.0f);
                        fetVar9.r(false);
                    } else if (iIntValue15 == 0) {
                        fetVar9.e0(948505925);
                        long backgroundContent5 = ((ThemeColors) fetVar9.k(zaq0.b)).getBackgroundContent();
                        zcl zclVar12 = qmk.f28987a;
                        mm40VarL2 = s5x0.N(i120.Q(jm40Var, backgroundContent5, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 4.0f, 8.0f, 4.0f, 0.0f, 8);
                        fetVar9.r(false);
                    } else if (iIntValue15 == q3d.i(a4xVar2)) {
                        fetVar9.e0(948907778);
                        long backgroundContent6 = ((ThemeColors) fetVar9.k(zaq0.b)).getBackgroundContent();
                        zcl zclVar13 = qmk.f28987a;
                        mm40VarL2 = s5x0.N(i120.Q(jm40Var, backgroundContent6, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3)), 4.0f, 0.0f, 4.0f, 8.0f, 2);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(949036924);
                        mm40 mm40VarQ2 = i120.Q(jm40Var, ((ThemeColors) fetVar9.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        zcl zclVar14 = qmk.f28987a;
                        mm40VarL2 = s5x0.L(mm40VarQ2, 4.0f, 0.0f, 2);
                        fetVar9.r(false);
                    }
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar9, 0);
                    int iHashCode3 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM3 = fetVar9.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar9, mm40VarL2);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(e7z.u1);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar9);
                    jpm0.o(fetVar9, mm40VarC2, gqw0.v);
                    b8l0 b8l0Var2 = l6wVar.b;
                    n3l0 n3l0Var2 = l6wVar.c;
                    boolean zG9 = fetVar9.g(l6wVar) | fetVar9.g(function6);
                    Object objP10 = fetVar9.P();
                    if (zG9 || objP10 == cl5Var) {
                        objP10 = new cxy(l6wVar, function6, (byte) 2);
                        fetVar9.o0(objP10);
                    }
                    Function0 function7 = (Function0) objP10;
                    boolean zG10 = fetVar9.g(l6wVar) | fetVar9.g(function6);
                    Object objP11 = fetVar9.P();
                    if (zG10 || objP11 == cl5Var) {
                        objP11 = new cxy(l6wVar, function6, (byte) 3);
                        fetVar9.o0(objP11);
                    }
                    Function0 function8 = (Function0) objP11;
                    boolean zG11 = fetVar9.g(l6wVar) | fetVar9.g(function6);
                    Object objP12 = fetVar9.P();
                    if (zG11 || objP12 == cl5Var) {
                        objP12 = new exy(l6wVar, function6, (byte) 1);
                        fetVar9.o0(objP12);
                    }
                    xbc.o(null, b8l0Var2, n3l0Var2, null, false, function7, function8, null, (Function1) objP12, fetVar9, 0, 153);
                    if (iIntValue15 != q3d.i(a4xVar2)) {
                        fetVar9.e0(1594358995);
                        mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 12.0f, 0.0f, 2), false, fetVar9, 6, 4);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(1594569175);
                        fetVar9.r(false);
                    }
                    fetVar9.r(true);
                    fetVar9.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 8:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                a4x a4xVar3 = ((slp) obj5).b;
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar10.g(g9zVar8) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar10.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar10.U(i9 & 1, (i9 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue17);
                    fetVar10.e0(60353810);
                    p6t0 p6t0Var2 = (p6t0) CollectionsKt.W(iIntValue17 - 1, a4xVar3);
                    p6t0 p6t0Var3 = (p6t0) CollectionsKt.W(iIntValue17 + 1, a4xVar3);
                    boolean z3 = p6t0Var2 instanceof plp;
                    boolean z4 = p6t0Var3 == null || (p6t0Var3 instanceof plp);
                    boolean z5 = ((p6t0Var instanceof olp) || (p6t0Var instanceof clp)) && !((p6t0Var3 instanceof olp) || (p6t0Var3 instanceof clp));
                    if (p6t0Var == null) {
                        fetVar = fetVar10;
                    } else {
                        if (p6t0Var instanceof plp) {
                            fetVar10.e0(1963424);
                            if (iIntValue17 > 0) {
                                zcl zclVar15 = qmk.f28987a;
                                f = 12.0f;
                            } else {
                                zcl zclVar16 = qmk.f28987a;
                                f = 0.0f;
                            }
                            acb.d(s5x0.N(jm40.b, 0.0f, f, 0.0f, 0.0f, 13), (plp) p6t0Var, fetVar10, 0);
                            fetVar10.r(false);
                            fetVar = fetVar10;
                        } else if (p6t0Var instanceof ilp) {
                            fetVar10.e0(1971636);
                            uc9.K((ilp) p6t0Var, z3, z4, (Function1) obj6, fetVar10, 0);
                            fetVar = fetVar10;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar10;
                            if (p6t0Var instanceof xkp) {
                                fetVar.e0(1979443);
                                uc9.z((xkp) p6t0Var, z3, z4, (Function1) obj6, fetVar, 0);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof alp) {
                                fetVar.e0(1987582);
                                uc9.A((alp) p6t0Var, z3, z4, (Function1) obj6, fetVar, 0);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof olp) {
                                fetVar.e0(61864656);
                                uc9.M((olp) p6t0Var, z4, z5, (Function1) obj6, fetVar, 0);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof clp) {
                                fetVar.e0(62113989);
                                uc9.N((clp) p6t0Var, z4, z5, (Function1) obj6, fetVar, 0);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(2010991);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 9:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar11.g(g9zVar9) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar11.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar11.U(i10 & 1, (i10 & 147) != 146)) {
                    yo5 yo5Var = (yo5) ((ArrayList) list).get(iIntValue19);
                    fetVar11.e0(-1918464257);
                    lv00.n(null, yo5Var, (Function1) obj6, (xdr) obj5, fetVar11, 64);
                    fetVar11.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 10:
                return a(obj, obj2, obj3, obj4);
            case 11:
                return b(obj, obj2, obj3, obj4);
            case 12:
                return c(obj, obj2, obj3, obj4);
            case 13:
                return g(obj, obj2, obj3, obj4);
            case 14:
                return h(obj, obj2, obj3, obj4);
            case 15:
                return i(obj, obj2, obj3, obj4);
            case 16:
                return l(obj, obj2, obj3, obj4);
            case 17:
                return m(obj, obj2, obj3, obj4);
            case 18:
                return o(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return p(obj, obj2, obj3, obj4);
            case 20:
                return r(obj, obj2, obj3, obj4);
            case 21:
                return s(obj, obj2, obj3, obj4);
            case 22:
                return t(obj, obj2, obj3, obj4);
            case 23:
                return u(obj, obj2, obj3, obj4);
            case 24:
                return v(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return w(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return x(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return y(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return z(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar10 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                Function1 function9 = (Function1) obj6;
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar12.g(g9zVar10) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar12.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar12.U(i11 & 1, (i11 & 147) != 146)) {
                    y8p0 y8p0Var = (y8p0) list.get(iIntValue21);
                    fetVar12.e0(491492923);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    rqm rqmVar2 = y8p0Var.b;
                    boolean zG12 = fetVar12.g(y8p0Var);
                    Object objP13 = fetVar12.P();
                    if (zG12 || objP13 == cl5Var) {
                        objP13 = new w8p0(function9, y8p0Var, (byte) 0);
                        fetVar12.o0(objP13);
                    }
                    Function0 function10 = (Function0) objP13;
                    boolean zG13 = fetVar12.g(y8p0Var);
                    Object objP14 = fetVar12.P();
                    if (zG13 || objP14 == cl5Var) {
                        objP14 = new w8p0(function9, y8p0Var, (byte) 1);
                        fetVar12.o0(objP14);
                    }
                    obc.q(mm40VarD, rqmVar2, false, null, function10, null, (Function0) objP14, null, fetVar12, 6, 172);
                    if (iIntValue21 != q3d.i(((v8p0) obj5).f36998a)) {
                        fetVar12.e0(492014900);
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        zcl zclVar17 = qmk.f28987a;
                        mbc.o(zfi0.f44303a, s5x0.L(mm40VarD2, 12.0f, 0.0f, 2), false, fetVar12, 6, 4);
                        fetVar12.r(false);
                    } else {
                        fetVar12.e0(492327070);
                        fetVar12.r(false);
                    }
                    fetVar12.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ h8w(List list, Object obj, Function1 function1, byte b) {
        this.f12649a = b;
        this.b = list;
        this.d = obj;
        this.c = function1;
    }
}
