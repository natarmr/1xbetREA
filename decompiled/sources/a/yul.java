package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final class yul implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43273a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ yul(List list, Function1 function1, byte b) {
        this.f43273a = b;
        this.b = list;
        this.c = function1;
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
            ok90 ok90Var = (ok90) this.b.get(iIntValue);
            fetVar.e0(-310389991);
            rqm rqmVar = new rqm((vui0) new tui0(ok90Var.b, new y3d(ok90Var.c)), (pui0) null, (pvi0) new nvi0(ok90Var.d), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(ok90Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new nsr(function1, ok90Var, (byte) 4);
                fetVar.o0(objP);
            }
            obc.q(null, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 237);
            if (ok90Var.e) {
                fetVar.e0(-309566415);
                fetVar.r(false);
            } else {
                fetVar.e0(-309752849);
                vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
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
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(-2020096088);
            if (p6t0Var == null) {
                fetVar.e0(-2019541592);
                fetVar.r(false);
            } else if (p6t0Var instanceof gsv) {
                fetVar.e0(-2020049310);
                nkb.h(jm40.b, ((gsv) p6t0Var).b, kjm.b, null, null, null, fetVar, 390, 56);
                fetVar.r(false);
            } else if (p6t0Var instanceof fql0) {
                fetVar.e0(-2019748889);
                saj.R(null, (fql0) p6t0Var, this.c, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-2019541592);
                fetVar.r(false);
            }
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
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            l6w l6wVar = (l6w) this.b.get(iIntValue);
            fetVar.e0(-714756096);
            b8l0 b8l0Var = l6wVar.b;
            n3l0 n3l0Var = l6wVar.c;
            boolean zG = fetVar.g(l6wVar);
            Function1 function1 = this.c;
            boolean zG2 = zG | fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG2 || objP == cl5Var) {
                objP = new cxy(l6wVar, function1, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG3 = fetVar.g(l6wVar) | fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == cl5Var) {
                objP2 = new cxy(l6wVar, function1, (byte) 1);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean zG4 = fetVar.g(l6wVar) | fetVar.g(function1);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == cl5Var) {
                objP3 = new exy(l6wVar, function1, (byte) 0);
                fetVar.o0(objP3);
            }
            xbc.o(null, b8l0Var, n3l0Var, null, false, function0, function2, null, (Function1) objP3, fetVar, 0, 153);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
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
            ek00 ek00Var = (ek00) this.b.get(iIntValue);
            fetVar.e0(648936973);
            b8l0 b8l0Var = ek00Var.b;
            n3l0 n3l0Var = ek00Var.c;
            boolean zG = fetVar.g(ek00Var);
            Function1 function1 = this.c;
            boolean zG2 = zG | fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG2 || objP == cl5Var) {
                objP = new bxy(ek00Var, function1, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG3 = fetVar.g(ek00Var) | fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == cl5Var) {
                objP2 = new bxy(ek00Var, function1, (byte) 1);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean zG4 = fetVar.g(ek00Var) | fetVar.g(function1);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == cl5Var) {
                objP3 = new dxy(ek00Var, function1, (byte) 0);
                fetVar.o0(objP3);
            }
            xbc.o(null, b8l0Var, n3l0Var, null, false, function0, function2, null, (Function1) objP3, fetVar, 0, 153);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
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
            xyy xyyVar = (xyy) this.b.get(iIntValue);
            fetVar.e0(695414274);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            mim0 mim0Var = xyyVar.f41728a;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(xyyVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ygy(function1, xyyVar, (byte) 5);
                fetVar.o0(objP);
            }
            lgb.n(mm40VarD, mim0Var, true, (Function1) objP, fetVar, 0);
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
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            fgz fgzVar = (fgz) this.b.get(iIntValue);
            fetVar.e0(-51814806);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            rqm rqmVar = fgzVar.b;
            boolean zI = fetVar.i(fgzVar);
            Object objP = fetVar.P();
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new agz(function1, fgzVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(fgzVar);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new agz(function1, fgzVar, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarD, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 6, 172);
            if (fgzVar.c) {
                fetVar.e0(-50866300);
                fetVar.r(false);
            } else {
                fetVar.e0(-51223885);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(mm40VarD2, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
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
            sgz sgzVar = (sgz) this.b.get(iIntValue);
            fetVar.e0(-1623450725);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            rqm rqmVar = sgzVar.b;
            boolean zI = fetVar.i(sgzVar);
            Object objP = fetVar.P();
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new ogz(function1, sgzVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(sgzVar);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new ogz(function1, sgzVar, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarD, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 6, 172);
            if (sgzVar.c) {
                fetVar.e0(-1622644447);
                fetVar.r(false);
            } else {
                fetVar.e0(-1622955656);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(mm40VarD2, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
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
            nhz nhzVar = (nhz) this.b.get(iIntValue);
            fetVar.e0(-915150404);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            rqm rqmVar = nhzVar.b;
            boolean zI = fetVar.i(nhzVar);
            Object objP = fetVar.P();
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new lhz(function1, nhzVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(nhzVar);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new lhz(function1, nhzVar, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarD, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 6, 172);
            if (nhzVar.c) {
                fetVar.e0(-914344126);
                fetVar.r(false);
            } else {
                fetVar.e0(-914655335);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(mm40VarD2, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
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
            rhz rhzVar = (rhz) this.b.get(iIntValue);
            fetVar.e0(-1287306556);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            rqm rqmVar = rhzVar.b;
            boolean zI = fetVar.i(rhzVar);
            Object objP = fetVar.P();
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new phz(function1, rhzVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(rhzVar);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new phz(function1, rhzVar, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarD, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 6, 172);
            if (rhzVar.c) {
                fetVar.e0(-1286504122);
                fetVar.r(false);
            } else {
                fetVar.e0(-1286815331);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(mm40VarD2, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
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
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            whz whzVar = (whz) this.b.get(iIntValue);
            fetVar.e0(-208501179);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            rqm rqmVar = whzVar.b;
            boolean zI = fetVar.i(whzVar);
            Object objP = fetVar.P();
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new uhz(function1, whzVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(whzVar);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new uhz(function1, whzVar, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarD, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 6, 172);
            if (whzVar.c) {
                fetVar.e0(-207694901);
                fetVar.r(false);
            } else {
                fetVar.e0(-208006110);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0.f44303a, s5x0.L(mm40VarD2, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
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
            vtz vtzVar = (vtz) this.b.get(iIntValue);
            fetVar.e0(1024948685);
            if (vtzVar == null) {
                fetVar.e0(1025319630);
                fetVar.r(false);
            } else if (vtzVar instanceof etz) {
                fetVar.e0(1418538380);
                etz etzVar = (etz) vtzVar;
                oja0.z(etzVar.f8393a, etzVar.b, fetVar, 0);
                fetVar.r(false);
            } else if (vtzVar instanceof ftz) {
                fetVar.e0(1418543841);
                oja0.G((ftz) vtzVar, this.c, fetVar, 0);
                fetVar.r(false);
            } else if (vtzVar instanceof xsz) {
                fetVar.e0(1418546832);
                oja0.w(0, fetVar, null, ((xsz) vtzVar).f41439a);
                fetVar.r(false);
            } else {
                fetVar.e0(1025319630);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
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
            vtz vtzVar = (vtz) this.b.get(iIntValue);
            fetVar.e0(-1057892558);
            if (vtzVar == null) {
                fetVar.e0(-1057531223);
                fetVar.r(false);
            } else if (vtzVar instanceof etz) {
                fetVar.e0(-588312687);
                etz etzVar = (etz) vtzVar;
                oja0.z(etzVar.f8393a, etzVar.b, fetVar, 0);
                fetVar.r(false);
            } else if (vtzVar instanceof utz) {
                fetVar.e0(-588307190);
                oja0.P(null, (utz) vtzVar, this.c, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1057531223);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    private final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
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
            ivz ivzVar = (ivz) this.b.get(iIntValue);
            fetVar.e0(1087375480);
            if (ivzVar == null) {
                fetVar.e0(1087649364);
                fetVar.r(false);
            } else if (ivzVar instanceof bvz) {
                fetVar.e0(-1350394611);
                ffb0.t(((bvz) ivzVar).f3299a, fetVar, 0);
                fetVar.r(false);
            } else if (ivzVar instanceof cvz) {
                fetVar.e0(-1350392037);
                ffb0.y((cvz) ivzVar, this.c, fetVar, 0);
                fetVar.r(false);
            } else if (ivzVar instanceof vuz) {
                fetVar.e0(-1350389174);
                ffb0.r(0, fetVar, null, ((vuz) ivzVar).f38072a);
                fetVar.r(false);
            } else {
                fetVar.e0(1087649364);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
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
            ivz ivzVar = (ivz) this.b.get(iIntValue);
            fetVar.e0(-206637272);
            if (ivzVar == null) {
                fetVar.e0(-206425853);
                fetVar.r(false);
            } else if (ivzVar instanceof bvz) {
                fetVar.e0(1655904413);
                ffb0.t(((bvz) ivzVar).f3299a, fetVar, 0);
                fetVar.r(false);
            } else if (ivzVar instanceof hvz) {
                fetVar.e0(1655906934);
                ffb0.G(null, (hvz) ivzVar, this.c, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-206425853);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
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
            wwz wwzVar = (wwz) this.b.get(iIntValue);
            fetVar.e0(360497699);
            if (wwzVar == null) {
                fetVar.e0(360824438);
                fetVar.r(false);
            } else if (wwzVar instanceof jwz) {
                fetVar.e0(-2066578946);
                jwz jwzVar = (jwz) wwzVar;
                ro4.E(jwzVar.f17276a, jwzVar.b, jwzVar.c, fetVar, 0);
                fetVar.r(false);
            } else if (wwzVar instanceof dwz) {
                fetVar.e0(-2066574663);
                ro4.L((dwz) wwzVar, this.c, fetVar, 0);
                fetVar.r(false);
            } else if (wwzVar instanceof ewz) {
                fetVar.e0(-2066571800);
                ro4.D(0, fetVar, null, ((ewz) wwzVar).f8550a);
                fetVar.r(false);
            } else {
                fetVar.e0(360824438);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    private final Object w(Object obj, Object obj2, Object obj3, Object obj4) {
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
            wwz wwzVar = (wwz) this.b.get(iIntValue);
            fetVar.e0(2053161813);
            if (wwzVar == null) {
                fetVar.e0(2053356895);
                fetVar.r(false);
            } else if (wwzVar instanceof vwz) {
                fetVar.e0(-72314502);
                ro4.T(null, (vwz) wwzVar, this.c, fetVar, 0);
                fetVar.r(false);
            } else if (wwzVar instanceof ewz) {
                fetVar.e0(-72311329);
                ro4.D(0, fetVar, null, ((ewz) wwzVar).f8550a);
                fetVar.r(false);
            } else {
                fetVar.e0(2053356895);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    private final Object x(Object obj, Object obj2, Object obj3, Object obj4) {
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
            tyz tyzVar = (tyz) this.b.get(iIntValue);
            fetVar.e0(-664422838);
            if (tyzVar == null) {
                fetVar.e0(-664110514);
                fetVar.r(false);
            } else if (tyzVar instanceof gyz) {
                fetVar.e0(-159978158);
                gyz gyzVar = (gyz) tyzVar;
                x4d0.F(gyzVar.f12154a, gyzVar.b, fetVar, 0);
                fetVar.r(false);
            } else if (tyzVar instanceof iyz) {
                fetVar.e0(-159974527);
                x4d0.O((iyz) tyzVar, this.c, fetVar, 0);
                fetVar.r(false);
            } else if (tyzVar instanceof ayz) {
                fetVar.e0(-159971568);
                x4d0.D(0, fetVar, null, ((ayz) tyzVar).f1693a);
                fetVar.r(false);
            } else {
                fetVar.e0(-664110514);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    private final Object y(Object obj, Object obj2, Object obj3, Object obj4) {
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
            tyz tyzVar = (tyz) this.b.get(iIntValue);
            fetVar.e0(222339668);
            if (tyzVar == null) {
                fetVar.e0(222587605);
                fetVar.r(false);
            } else if (tyzVar instanceof gyz) {
                fetVar.e0(-269920181);
                gyz gyzVar = (gyz) tyzVar;
                x4d0.F(gyzVar.f12154a, gyzVar.b, fetVar, 0);
                fetVar.r(false);
            } else if (tyzVar instanceof syz) {
                fetVar.e0(-269916572);
                x4d0.U(null, (syz) tyzVar, this.c, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(222587605);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        fet fetVar;
        int i3;
        int i4;
        fet fetVar2;
        int i5;
        fet fetVar3;
        int i6;
        int i7;
        fet fetVar4;
        boolean z;
        float f;
        int i8;
        fet fetVar5;
        boolean z2;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        fet fetVar6;
        byte b = this.f43273a;
        byte b2 = 25;
        jm40 jm40Var = jm40.b;
        float f3 = 0.0f;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        List list = this.b;
        boolean zD = true;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar7.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar7.e(iIntValue) ? 32 : 16;
                }
                if (fetVar7.U(i & 1, (i & 147) != 146)) {
                    cvl cvlVar = (cvl) list.get(iIntValue);
                    fetVar7.e0(367072901);
                    ju70.j(null, cvlVar, function1, fetVar7, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar8.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar8.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar8.U(i2 & 1, (i2 & 147) != 146)) {
                    lxl lxlVar = (lxl) list.get(iIntValue3);
                    fetVar8.e0(419690721);
                    boolean zF = fetVar8.f(lxlVar.f20819a);
                    Object objP = fetVar8.P();
                    if (zF || objP == cl5Var) {
                        objP = new jp0(function1, lxlVar, (byte) 2);
                        fetVar8.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    dyl dylVar = lxlVar.b;
                    if (dylVar instanceof ayl) {
                        fetVar8.e0(419885493);
                        ayl aylVar = (ayl) dylVar;
                        n4c.v(aylVar.f1673a, aylVar.b, lxlVar.b(), function0, fetVar8, 0);
                        fetVar = fetVar8;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar8;
                        fetVar.e0(420175591);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar9.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar9.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar9.U(i3 & 1, (i3 & 147) != 146)) {
                    ghm ghmVar = (ghm) list.get(iIntValue5);
                    fetVar9.e0(-760291068);
                    zcl zclVar = qmk.f28987a;
                    bfb.q(o7k0.s(jm40Var, 256.0f), ghmVar, function1, fetVar9);
                    fetVar9.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                g9zVar4.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar10.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar10.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar10.U(i4 & 1, (i4 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue7);
                    fetVar10.e0(2002538947);
                    if (p6t0Var == null) {
                        fetVar2 = fetVar10;
                    } else {
                        boolean z3 = p6t0Var instanceof tmo;
                        mm40 mm40VarN = jm40.b;
                        if (z3) {
                            fetVar10.e0(2002559282);
                            pwe pweVar = ((tmo) p6t0Var).b;
                            if (!pweVar.e) {
                                zcl zclVar2 = qmk.f28987a;
                                mm40VarN = s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            }
                            boolean zG = fetVar10.g(function1) | fetVar10.g(p6t0Var);
                            Object objP2 = fetVar10.P();
                            if (zG || objP2 == cl5Var) {
                                objP2 = new z7(function1, p6t0Var, (byte) 11);
                                fetVar10.o0(objP2);
                            }
                            hic.c(mm40VarN, pweVar, (Function0) objP2, fetVar10, 0);
                            fetVar10.r(false);
                            fetVar2 = fetVar10;
                        } else {
                            boolean z4 = p6t0Var instanceof fja;
                            zfi0 zfi0Var = zfi0.f44303a;
                            if (z4) {
                                fetVar10.e0(2003182816);
                                mbc.o(zfi0Var, null, false, fetVar10, 6, 6);
                                fetVar2 = fetVar10;
                                nfa nfaVar = ((fja) p6t0Var).c;
                                boolean zG2 = fetVar2.g(function1) | fetVar2.g(p6t0Var);
                                Object objP3 = fetVar2.P();
                                if (zG2 || objP3 == cl5Var) {
                                    objP3 = new z7(function1, p6t0Var, (byte) 12);
                                    fetVar2.o0(objP3);
                                }
                                bkb.n(null, nfaVar, (Function0) objP3, fetVar2, 0);
                                fetVar2.r(false);
                            } else {
                                fetVar2 = fetVar10;
                                if (p6t0Var instanceof hia) {
                                    fetVar2.e0(2003618490);
                                    mbc.o(zfi0Var, null, false, fetVar2, 6, 6);
                                    zcl zclVar3 = qmk.f28987a;
                                    mm40 mm40VarN2 = s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                    mfa mfaVar = ((hia) p6t0Var).c;
                                    boolean zG3 = fetVar2.g(function1) | fetVar2.g(p6t0Var);
                                    Object objP4 = fetVar2.P();
                                    if (zG3 || objP4 == cl5Var) {
                                        objP4 = new z7(function1, p6t0Var, (byte) 13);
                                        fetVar2.o0(objP4);
                                    }
                                    Function0 function2 = (Function0) objP4;
                                    boolean zG4 = fetVar2.g(function1) | fetVar2.g(p6t0Var);
                                    Object objP5 = fetVar2.P();
                                    if (zG4 || objP5 == cl5Var) {
                                        objP5 = new z7(function1, p6t0Var, (byte) 14);
                                        fetVar2.o0(objP5);
                                    }
                                    thb.l(mm40VarN2, mfaVar, function2, (Function0) objP5, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (p6t0Var instanceof umo) {
                                    fetVar2.e0(2004303745);
                                    zcl zclVar4 = qmk.f28987a;
                                    hic.c(s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 8.0f, 7), qwe.f29431a, null, fetVar2, 4);
                                    fetVar2.r(false);
                                }
                            }
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(2004538787);
                    fetVar2.r(false);
                    fetVar2.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = iIntValue10 | (fetVar11.g(g9zVar5) ? 4 : 2);
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar11.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar11.U(i5 & 1, (i5 & 147) != 146)) {
                    a2p a2pVar = (a2p) list.get(iIntValue9);
                    fetVar11.e0(110485857);
                    if (a2pVar != null) {
                        if (a2pVar instanceof th0) {
                            fetVar11.e0(-1936097174);
                            zll zllVar = ((th0) a2pVar).f33939a;
                            lh80 lh80VarT = s5x0.t(xfn.a(fetVar11).d, 0.0f, 2);
                            boolean zG5 = fetVar11.g(function1);
                            Object objP6 = fetVar11.P();
                            if (zG5 || objP6 == cl5Var) {
                                objP6 = new fzg(function1, (byte) 24);
                                fetVar11.o0(objP6);
                            }
                            Function1 function3 = (Function1) objP6;
                            boolean zG6 = fetVar11.g(function1);
                            Object objP7 = fetVar11.P();
                            if (zG6 || objP7 == cl5Var) {
                                objP7 = new fzg(function1, b2);
                                fetVar11.o0(objP7);
                            }
                            ckb.f(null, zllVar, null, lh80VarT, null, null, function3, (Function1) objP7, fetVar11, 0, 53);
                            fetVar3 = fetVar11;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar11;
                            boolean z5 = a2pVar instanceof uh0;
                            jm40 jm40Var2 = jm40.b;
                            if (z5) {
                                fetVar3.e0(-1936076216);
                                zcl zclVar5 = qmk.f28987a;
                                nkb.h(s5x0.N(jm40Var2, xfn.a(fetVar3).e, 8.0f, xfn.a(fetVar3).e, 0.0f, 8), new hjm(((uh0) a2pVar).f35651a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar3, 384, 56);
                                fetVar3.r(false);
                            } else if (a2pVar instanceof jun) {
                                fetVar3.e0(-1936060664);
                                jcb.l(s5x0.L(jm40Var2, xfn.a(fetVar3).d, 0.0f, 2), ((jun) a2pVar).f17163a, true, null, fetVar3, 384, 8);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    } else {
                        fetVar3 = fetVar11;
                    }
                    throw b1j.f(-1936098590, fetVar3, false);
                }
                fetVar11.X();
                return Unit.f46060a;
            case 5:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar12.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar12.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar12.U(i6 & 1, (i6 & 147) != 146)) {
                    x2p x2pVar = (x2p) list.get(iIntValue11);
                    fetVar12.e0(584246072);
                    zrm zrmVar = x2pVar.f40179a;
                    boolean zG7 = fetVar12.g(function1) | fetVar12.g(x2pVar);
                    Object objP8 = fetVar12.P();
                    if (zG7 || objP8 == cl5Var) {
                        objP8 = new lhf(function1, x2pVar, (byte) 25);
                        fetVar12.o0(objP8);
                    }
                    Function0 function4 = (Function0) objP8;
                    boolean zG8 = fetVar12.g(function1) | fetVar12.g(x2pVar);
                    Object objP9 = fetVar12.P();
                    if (zG8 || objP9 == cl5Var) {
                        objP9 = new d2p(function1, x2pVar, (byte) 1);
                        fetVar12.o0(objP9);
                    }
                    agc.r(null, zrmVar, function4, null, null, (Function1) objP9, null, fetVar12, 0, 89);
                    fetVar12.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 6:
                zcl zclVar6 = qmk.f28987a;
                k8z k8zVar = (k8z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar13.g(k8zVar) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar13.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar13.U(i7 & 1, (i7 & 147) != 146)) {
                    e5p e5pVar = (e5p) list.get(iIntValue13);
                    fetVar13.e0(-914197157);
                    if (e5pVar != null) {
                        boolean z6 = e5pVar instanceof g4p;
                        jm40 jm40Var3 = jm40.b;
                        if (z6) {
                            fetVar13.e0(-1137867594);
                            g4p g4pVar = (g4p) e5pVar;
                            if (g4pVar.b) {
                                fetVar13.e0(-914071898);
                                fetVar13.r(false);
                                z = true;
                            } else {
                                fetVar13.e0(-1137864407);
                                z = !pkd.d(fetVar13);
                                fetVar13.r(false);
                            }
                            if (z) {
                                fetVar13.e0(-1137863500);
                                float f4 = qmk.a(fetVar13).c;
                                fetVar13.r(false);
                                f = f4;
                            } else {
                                fetVar13.e0(-1137862396);
                                fetVar13.r(false);
                                f = 0.0f;
                            }
                            if (g4pVar.c) {
                                fetVar13.e0(-913947960);
                            } else {
                                fetVar13.e0(-1137860471);
                                zD = true ^ pkd.d(fetVar13);
                            }
                            fetVar13.r(false);
                            if (zD) {
                                fetVar13.e0(-1137859564);
                                f3 = qmk.a(fetVar13).c;
                            } else {
                                fetVar13.e0(-1137858460);
                            }
                            fetVar13.r(false);
                            p8a.t(s5x0.N(jm40Var3, f, 0.0f, f3, 8.0f, 2), g4pVar.f10678a, g4pVar.d, this.c, fetVar13, 0);
                            fetVar4 = fetVar13;
                            fetVar4.r(false);
                        } else {
                            fetVar4 = fetVar13;
                            if (e5pVar instanceof h4p) {
                                fetVar4.e0(-1137848905);
                                nkb.h(s5x0.N(jm40Var3, xfn.a(fetVar4).d, 8.0f, xfn.a(fetVar4).d, 0.0f, 8), ((h4p) e5pVar).f12444a, kjm.f18392a, null, null, null, fetVar4, 384, 56);
                                fetVar4.r(false);
                            } else if (e5pVar instanceof w4p) {
                                fetVar4.e0(-1137835068);
                                jcb.l(s5x0.L(jm40Var3, xfn.a(fetVar4).d, 0.0f, 2), ((w4p) e5pVar).f38551a, true, null, fetVar4, 384, 8);
                                fetVar4.r(false);
                            } else if (e5pVar instanceof z4p) {
                                fetVar4.e0(-1137825161);
                                acb.v(0, fetVar4);
                                fetVar4.r(false);
                            }
                        }
                        fetVar4.r(false);
                    } else {
                        fetVar4 = fetVar13;
                    }
                    throw b1j.f(-1137868888, fetVar4, false);
                }
                fetVar13.X();
                return Unit.f46060a;
            case 7:
                k8z k8zVar2 = (k8z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar14.g(k8zVar2) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar14.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar14.U(i8 & 1, (i8 & 147) != 146)) {
                    e5p e5pVar2 = (e5p) list.get(iIntValue15);
                    fetVar14.e0(-692721793);
                    if (e5pVar2 != null) {
                        boolean z7 = e5pVar2 instanceof g4p;
                        jm40 jm40Var4 = jm40.b;
                        if (z7) {
                            fetVar14.e0(393297416);
                            zcl zclVar7 = qmk.f28987a;
                            g4p g4pVar2 = (g4p) e5pVar2;
                            if (g4pVar2.b) {
                                fetVar14.e0(-692549197);
                                fetVar14.r(false);
                                z2 = true;
                            } else {
                                fetVar14.e0(393302140);
                                z2 = !pkd.d(fetVar14);
                                fetVar14.r(false);
                            }
                            if (z2) {
                                fetVar14.e0(393303047);
                                float f5 = qmk.a(fetVar14).c;
                                fetVar14.r(false);
                                f2 = f5;
                            } else {
                                fetVar14.e0(393304151);
                                fetVar14.r(false);
                                f2 = 0.0f;
                            }
                            if (g4pVar2.c) {
                                fetVar14.e0(-692425259);
                            } else {
                                fetVar14.e0(393306076);
                                zD = true ^ pkd.d(fetVar14);
                            }
                            fetVar14.r(false);
                            if (zD) {
                                fetVar14.e0(393306983);
                                f3 = qmk.a(fetVar14).c;
                            } else {
                                fetVar14.e0(393308087);
                            }
                            fetVar14.r(false);
                            p8a.t(s5x0.N(jm40Var4, f2, 0.0f, f3, 8.0f, 2), g4pVar2.f10678a, g4pVar2.d, this.c, fetVar14, 0);
                            fetVar5 = fetVar14;
                            fetVar5.r(false);
                        } else {
                            fetVar5 = fetVar14;
                            if (e5pVar2 instanceof h4p) {
                                fetVar5.e0(393316084);
                                zcl zclVar8 = qmk.f28987a;
                                nkb.h(s5x0.N(jm40Var4, xfn.a(fetVar5).e, 8.0f, xfn.a(fetVar5).e, 0.0f, 8), ((h4p) e5pVar2).f12444a, kjm.f18392a, null, null, null, fetVar5, 384, 56);
                                fetVar5.r(false);
                            } else if (e5pVar2 instanceof w4p) {
                                fetVar5.e0(393330231);
                                jcb.l(s5x0.L(jm40Var4, xfn.a(fetVar5).d, 0.0f, 2), ((w4p) e5pVar2).f38551a, true, null, fetVar5, 384, 8);
                                fetVar5.r(false);
                            } else if (e5pVar2 instanceof z4p) {
                                fetVar5.e0(393340138);
                                acb.v(0, fetVar5);
                                fetVar5.r(false);
                            }
                        }
                        fetVar5.r(false);
                    } else {
                        fetVar5 = fetVar14;
                    }
                    throw b1j.f(393296132, fetVar5, false);
                }
                fetVar14.X();
                return Unit.f46060a;
            case 8:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar15.g(g9zVar7) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar15.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar15.U(i9 & 1, (i9 & 147) != 146)) {
                    grq grqVar = (grq) list.get(iIntValue17);
                    fetVar15.e0(-1016740192);
                    wxl wxlVar = wxl.SECONDARY;
                    boolean zG9 = fetVar15.g(function1) | fetVar15.g(grqVar);
                    Object objP10 = fetVar15.P();
                    if (zG9 || objP10 == cl5Var) {
                        objP10 = new xjp(function1, grqVar, (byte) 0);
                        fetVar15.o0(objP10);
                    }
                    vfc.m(null, wxlVar, grqVar, (Function0) objP10, fetVar15, 48);
                    fetVar15.r(false);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 9:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar16 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar16.g(g9zVar8) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar16.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar16.U(i10 & 1, (i10 & 147) != 146)) {
                    grq grqVar2 = (grq) list.get(iIntValue19);
                    fetVar16.e0(446486605);
                    wxl wxlVar2 = wxl.OVERLAY;
                    boolean zG10 = fetVar16.g(function1) | fetVar16.g(grqVar2);
                    Object objP11 = fetVar16.P();
                    if (zG10 || objP11 == cl5Var) {
                        objP11 = new xjp(function1, grqVar2, (byte) 1);
                        fetVar16.o0(objP11);
                    }
                    vfc.m(null, wxlVar2, grqVar2, (Function0) objP11, fetVar16, 48);
                    fetVar16.r(false);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 10:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar17 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar17.g(g9zVar9) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar17.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar17.U(i11 & 1, (i11 & 147) != 146)) {
                    okr okrVar = (okr) list.get(iIntValue21);
                    fetVar17.e0(1423264652);
                    zcl zclVar9 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    boolean zG11 = fetVar17.g(function1) | fetVar17.g(okrVar);
                    Object objP12 = fetVar17.P();
                    if (zG11 || objP12 == cl5Var) {
                        objP12 = new d2p(function1, okrVar, (byte) 9);
                        fetVar17.o0(objP12);
                    }
                    x4d0.R(mm40VarN3, okrVar, (Function1) objP12, fetVar17, 0);
                    fetVar17.r(false);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 11:
                return a(obj, obj2, obj3, obj4);
            case 12:
                return b(obj, obj2, obj3, obj4);
            case 13:
                return g(obj, obj2, obj3, obj4);
            case 14:
                return c(obj, obj2, obj3, obj4);
            case 15:
                return h(obj, obj2, obj3, obj4);
            case 16:
                return i(obj, obj2, obj3, obj4);
            case 17:
                return l(obj, obj2, obj3, obj4);
            case 18:
                return m(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return o(obj, obj2, obj3, obj4);
            case 20:
                return p(obj, obj2, obj3, obj4);
            case 21:
                return r(obj, obj2, obj3, obj4);
            case 22:
                return s(obj, obj2, obj3, obj4);
            case 23:
                return t(obj, obj2, obj3, obj4);
            case 24:
                return u(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return v(obj, obj2, obj3, obj4);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return w(obj, obj2, obj3, obj4);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return x(obj, obj2, obj3, obj4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return y(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar10 = (g9z) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                fet fetVar18 = (fet) obj3;
                int iIntValue24 = ((Number) obj4).intValue();
                if ((iIntValue24 & 6) == 0) {
                    i12 = iIntValue24 | (fetVar18.g(g9zVar10) ? 4 : 2);
                } else {
                    i12 = iIntValue24;
                }
                if ((iIntValue24 & 48) == 0) {
                    i12 |= fetVar18.e(iIntValue23) ? 32 : 16;
                }
                if (fetVar18.U(i12 & 1, (i12 & 147) != 146)) {
                    g100 g100Var = (g100) list.get(iIntValue23);
                    fetVar18.e0(153850818);
                    if (g100Var == null) {
                        fetVar6 = fetVar18;
                    } else {
                        if (g100Var instanceof i000) {
                            fetVar18.e0(-549226161);
                            i000 i000Var = (i000) g100Var;
                            unh0.G(i000Var.f13928a, i000Var.b, fetVar18, 0);
                            fetVar18.r(false);
                        } else if (g100Var instanceof h000) {
                            fetVar18.e0(-549220859);
                            unh0.D((h000) g100Var, function1, fetVar18, 0);
                            fetVar18.r(false);
                        } else {
                            if (g100Var instanceof a000) {
                                fetVar18.e0(-549217965);
                                unh0.C(0, fetVar18, null, ((a000) g100Var).f3a);
                                fetVar18.r(false);
                            } else if (g100Var instanceof nzz) {
                                fetVar18.e0(154213393);
                                zcl zclVar10 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
                                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar18, 0);
                                int iHashCode = Long.hashCode(fetVar18.T);
                                bh90 bh90VarM = fetVar18.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar18, mm40VarL);
                                mkd.c0.getClass();
                                fetVar18.i0();
                                if (fetVar18.S) {
                                    fetVar18.l(e7z.u1);
                                } else {
                                    fetVar18.r0();
                                }
                                jpm0.o(fetVar18, thg0VarA, gqw0.x);
                                jpm0.o(fetVar18, bh90VarM, gqw0.w);
                                jpm0.o(fetVar18, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar18);
                                jpm0.o(fetVar18, mm40VarC0, gqw0.v);
                                unh0.H(i120.Q(s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar18).d, 0.0f, 2), ((ThemeColors) fetVar18.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f)), ((nzz) g100Var).f24395a, d4d.STATIC_YELLOW, d4d.BACKGROUND_CONTENT, fetVar18, 0);
                                fetVar6 = fetVar18;
                                fetVar6.r(true);
                                fetVar6.r(false);
                            } else {
                                fetVar6 = fetVar18;
                                if (g100Var instanceof mzz) {
                                    fetVar6.e0(155086229);
                                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                    float f6 = xfn.a(fetVar6).d;
                                    zcl zclVar11 = qmk.f28987a;
                                    mm40 mm40VarK = s5x0.K(mm40VarD, f6, 12.0f);
                                    mzz mzzVar = (mzz) g100Var;
                                    wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(mzzVar.c), mzzVar.b, false, false);
                                    boolean zG12 = fetVar6.g(function1) | fetVar6.g(g100Var);
                                    Object objP13 = fetVar6.P();
                                    if (zG12 || objP13 == cl5Var) {
                                        objP13 = new z000(function1, g100Var, (byte) 0);
                                        fetVar6.o0(objP13);
                                    }
                                    qzb.n(mm40VarK, wulVar, (Function0) objP13, fetVar6, 0, 0);
                                    fetVar6.r(false);
                                }
                            }
                            fetVar6.r(false);
                        }
                        fetVar6 = fetVar18;
                        fetVar6.r(false);
                    }
                    fetVar6.e0(155982315);
                    fetVar6.r(false);
                    fetVar6.r(false);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
        }
    }
}
