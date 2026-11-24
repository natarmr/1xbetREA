package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final class njh0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23637a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ njh0(List list, Function1 function1, byte b) {
        this.f23637a = b;
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
            v2n v2nVar = (v2n) this.b.get(iIntValue);
            fetVar.e0(-755916256);
            gfx.a(null, v2nVar, this.c, fetVar, 0);
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
            fetVar.e0(1855915763);
            mrv.t(null, v2nVar, this.c, fetVar, 0);
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
            ojc ojcVar = (ojc) this.b.get(iIntValue);
            fetVar.e0(-175009941);
            z1x.a(ojcVar, this.c, fetVar, 8);
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
            t2n0 t2n0Var = (t2n0) this.b.get(iIntValue);
            fetVar.e0(896799634);
            if (t2n0Var != null) {
                if (t2n0Var instanceof p2n0) {
                    fetVar.e0(721666324);
                    unh0.F(null, ((p2n0) t2n0Var).f26259a, fetVar, 0);
                    fetVar.r(false);
                } else if (t2n0Var instanceof q2n0) {
                    fetVar.e0(896930639);
                    q2n0 q2n0Var = (q2n0) t2n0Var;
                    unh0.O(null, q2n0Var.b, q2n0Var.f28009a, this.c, fetVar, 0);
                    fetVar.r(false);
                } else if (t2n0Var instanceof r2n0) {
                    fetVar.e0(897278676);
                    r2n0 r2n0Var = (r2n0) t2n0Var;
                    e1n0 e1n0Var = r2n0Var.b;
                    c6q0 c6q0Var = r2n0Var.f29745a;
                    tvi0 tvi0Var = r2n0Var.d;
                    wui0 wui0Var = r2n0Var.c;
                    zcl zclVar = qmk.f28987a;
                    unh0.Q(null, e1n0Var, c6q0Var, tvi0Var, wui0Var, new lh80(16.0f, 16.0f, 16.0f, 8.0f), this.c, fetVar, 0, 1);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (t2n0Var instanceof s2n0) {
                    fetVar.e0(898074849);
                    s2n0 s2n0Var = (s2n0) t2n0Var;
                    unh0.R(null, s2n0Var.d, s2n0Var.b, s2n0Var.f31510a, s2n0Var.c, this.c, fetVar, 0);
                    fetVar = fetVar;
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(721665681, fetVar, false);
        }
        fetVar.X();
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
        byte b = 1;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            aan0 aan0Var = (aan0) this.b.get(iIntValue);
            fetVar.e0(-2110883567);
            zrm zrmVar = aan0Var.b;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(aan0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ywm0(function1, aan0Var, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1) | fetVar.g(aan0Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new zcn0(function1, aan0Var, b);
                fetVar.o0(objP2);
            }
            agc.r(null, zrmVar, function0, null, null, (Function1) objP2, null, fetVar, 0, 89);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k8z k8zVar = (k8z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        byte b = 4;
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(k8zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(-1067441087);
            if (p6t0Var == null) {
                fetVar.e0(-1066771271);
                fetVar.r(false);
            } else {
                boolean z = p6t0Var instanceof pqv;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(-1067392108);
                    pqv pqvVar = (pqv) p6t0Var;
                    boolean zG = fetVar.g(function1) | fetVar.g(p6t0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new z7(function1, p6t0Var, (byte) 28);
                        fetVar.o0(objP);
                    }
                    zvw.c(null, pqvVar, (Function0) objP, fetVar, 0, 1);
                    fetVar.r(false);
                } else if (p6t0Var instanceof my30) {
                    fetVar.e0(-1067025657);
                    my30 my30Var = (my30) p6t0Var;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new dpl0(function1, b);
                        fetVar.o0(objP2);
                    }
                    zvw.i(null, my30Var, (Function1) objP2, fetVar, 0, 1);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1066771271);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
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
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar.e0(-1655550883);
            if (p6t0Var == null) {
                fetVar.e0(-1654882028);
                fetVar.r(false);
            } else {
                boolean z = p6t0Var instanceof pqv;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(-1655501873);
                    pqv pqvVar = (pqv) p6t0Var;
                    boolean zG = fetVar.g(function1) | fetVar.g(p6t0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new z7(function1, p6t0Var, (byte) 29);
                        fetVar.o0(objP);
                    }
                    zvw.c(null, pqvVar, (Function0) objP, fetVar, 0, 1);
                    fetVar.r(false);
                } else if (p6t0Var instanceof my30) {
                    fetVar.e0(-1655136414);
                    my30 my30Var = (my30) p6t0Var;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new dpl0(function1, (byte) 6);
                        fetVar.o0(objP2);
                    }
                    zvw.i(null, my30Var, (Function1) objP2, fetVar, 0, 1);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1654882028);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar2 = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar2.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar2.e(iIntValue) ? 32 : 16;
        }
        if (fetVar2.U(i & 1, (i & 147) != 146)) {
            p6t0 p6t0Var = (p6t0) this.b.get(iIntValue);
            fetVar2.e0(-1344085614);
            if (p6t0Var == null) {
                fetVar = fetVar2;
            } else {
                boolean z = p6t0Var instanceof l0p0;
                byte b = 8;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar2.e0(1619210999);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    jjm jjmVar = ((l0p0) p6t0Var).b;
                    kjm kjmVar = kjm.f18392a;
                    boolean zG = fetVar2.g(function1);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new t450(function1, (byte) 8);
                        fetVar2.o0(objP);
                    }
                    fetVar = fetVar2;
                    nkb.h(mm40VarN, jjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
                    fetVar.r(false);
                } else {
                    fetVar = fetVar2;
                    if (p6t0Var instanceof b1p0) {
                        fetVar.e0(1619225402);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f);
                        b1p0 b1p0Var = (b1p0) p6t0Var;
                        gga ggaVar = b1p0Var.f1819a;
                        boolean z2 = b1p0Var.b;
                        boolean zG2 = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new dpl0(function1, (byte) 7);
                            fetVar.o0(objP2);
                        }
                        u1c.j(mm40VarD, ggaVar, z2, (Function1) objP2, fetVar);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof qyo0) {
                        fetVar.e0(1619239791);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarD2 = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f);
                        qyo0 qyo0Var = (qyo0) p6t0Var;
                        a2n a2nVar = qyo0Var.f29544a;
                        boolean z3 = qyo0Var.b;
                        boolean zG3 = fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new dpl0(function1, b);
                            fetVar.o0(objP3);
                        }
                        p8a.t(mm40VarD2, a2nVar, z3, (Function1) objP3, fetVar, 0);
                        fetVar.r(false);
                    } else if (p6t0Var instanceof c0p0) {
                        fetVar.e0(1619253674);
                        mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                        c0p0 c0p0Var = (c0p0) p6t0Var;
                        boolean zG4 = fetVar.g(function1);
                        Object objP4 = fetVar.P();
                        if (zG4 || objP4 == cl5Var) {
                            objP4 = new t450(function1, (byte) 9);
                            fetVar.o0(objP4);
                        }
                        cy2.h(mm40VarD3, c0p0Var, (Function0) objP4, fetVar, 6);
                        fetVar.r(false);
                    }
                }
                fetVar.r(false);
            }
            fetVar.e0(-1342449032);
            fetVar.r(false);
            fetVar.r(false);
        } else {
            fetVar2.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar2 = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar2.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar2.e(iIntValue) ? 32 : 16;
        }
        if (fetVar2.U(i & 1, (i & 147) != 146)) {
            n3p0 n3p0Var = (n3p0) this.b.get(iIntValue);
            fetVar2.e0(-966981319);
            if (n3p0Var != null) {
                if (n3p0Var instanceof l3p0) {
                    fetVar2.e0(-169738920);
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    fetVar = fetVar2;
                    nkb.h(s5x0.L(mm40VarD, 0.0f, 0.0f, 2), ((l3p0) n3p0Var).f19370a, kjm.b, null, null, null, fetVar, 384, 56);
                    fetVar.r(false);
                } else {
                    fetVar = fetVar2;
                    boolean z = n3p0Var instanceof m3p0;
                    cl5 cl5Var = ukd.f35823a;
                    Function1 function1 = this.c;
                    if (z) {
                        fetVar.e0(-169729064);
                        zrm zrmVar = ((m3p0) n3p0Var).f21128a;
                        boolean zG = fetVar.g(function1) | fetVar.g(n3p0Var);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new ywm0(function1, n3p0Var, (byte) 8);
                            fetVar.o0(objP);
                        }
                        Function0 function0 = (Function0) objP;
                        boolean zG2 = fetVar.g(function1) | fetVar.g(n3p0Var);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new zcn0(function1, n3p0Var, (byte) 13);
                            fetVar.o0(objP2);
                        }
                        agc.r(null, zrmVar, function0, null, null, (Function1) objP2, null, fetVar, 0, 89);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else if (n3p0Var instanceof k3p0) {
                        fetVar.e0(-169718251);
                        kjl kjlVar = ((k3p0) n3p0Var).f17630a;
                        boolean zG3 = fetVar.g(function1);
                        Object objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new t450(function1, (byte) 10);
                            fetVar.o0(objP3);
                        }
                        ieb.m(null, kjlVar, (Function0) objP3, fetVar, 0, 1);
                        fetVar.r(false);
                    }
                }
                fetVar.r(false);
            } else {
                fetVar = fetVar2;
            }
            throw b1j.f(-169740278, fetVar, false);
        }
        fetVar2.X();
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            y4p0 y4p0Var = (y4p0) this.b.get(iIntValue);
            fetVar.e0(1258172345);
            j5n0.i(null, y4p0Var, this.c, fetVar, 0);
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
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            mjq0 mjq0Var = (mjq0) this.b.get(iIntValue);
            fetVar.e0(-1162786650);
            rqm rqmVar = new rqm((vui0) new tui0(mjq0Var.f21909a, null), (pui0) null, (pvi0) new nvi0(mjq0Var.c), (d4d) null, (tvi0) null, mjq0Var.d, false, (e900) null, 442);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1);
            if ((((i & 112) ^ 48) <= 32 || !fetVar.e(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = zG | z;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new bp40(function1, iIntValue, (byte) 5);
                fetVar.o0(objP);
            }
            obc.q(null, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 237);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k8z k8zVar = (k8z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(k8zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            h1b0 h1b0Var = (h1b0) this.b.get(iIntValue);
            fetVar.e0(529415774);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(jm40.b, 324.0f, 66.0f);
            zrm zrmVar = h1b0Var.b;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(h1b0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ywm0(function1, h1b0Var, (byte) 18);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1) | fetVar.g(h1b0Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new zcn0(function1, h1b0Var, (byte) 21);
                fetVar.o0(objP2);
            }
            agc.r(mm40VarP, zrmVar, function0, null, null, (Function1) objP2, null, fetVar, 0, 88);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

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
            qwr0 qwr0Var = (qwr0) this.b.get(iIntValue);
            fetVar.e0(-922226460);
            zcl zclVar = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar, zclVar, jm40.b);
            ncg0 ncg0VarA = lcg0.a(0.0f, 7);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.i(qwr0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ywm0(function1, qwr0Var, (byte) 21);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarI, gy40Var, ncg0VarA, false, null, (Function0) objP2, 28);
            wxl wxlVar = wxl.OVERLAY;
            boolean zI = fetVar.i(qwr0Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new caz(qwr0Var, (byte) 22);
                fetVar.o0(objP3);
            }
            v3c.n(mm40VarW, wxlVar, (Function1) objP3, fetVar, 48, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            f3s0 f3s0Var = (f3s0) this.b.get(iIntValue);
            fetVar.e0(1817544311);
            if (f3s0Var != null) {
                boolean z = f3s0Var instanceof d3s0;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(-1603935588);
                    mm40 mm40VarH = phu0.H(jm40Var, null, 1);
                    vr1 vr1Var = ((d3s0) f3s0Var).f5420a;
                    Function1 function1 = this.c;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new hrk(function1, (byte) 13);
                        fetVar.o0(objP);
                    }
                    jd8.d(mm40VarH, vr1Var, (Function2) objP, fetVar, 0, 0);
                    fetVar.r(false);
                } else if (f3s0Var instanceof e3s0) {
                    fetVar.e0(-1603918535);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    hrl hrlVar = hrl.f13536a;
                    krl krlVar = ((e3s0) f3s0Var).f7153a;
                    zcl zclVar = qmk.f28987a;
                    vic.d(mm40VarD, hrlVar, krlVar, 0.0f, fetVar, 6, 16);
                    fetVar = fetVar;
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(-1603937524, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            f3s0 f3s0Var = (f3s0) this.b.get(iIntValue);
            fetVar.e0(-1013048600);
            if (f3s0Var != null) {
                boolean z = f3s0Var instanceof d3s0;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(-1972339701);
                    mm40 mm40VarH = phu0.H(jm40Var, null, 1);
                    vr1 vr1Var = ((d3s0) f3s0Var).f5420a;
                    Function1 function1 = this.c;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new hrk(function1, (byte) 14);
                        fetVar.o0(objP);
                    }
                    jd8.d(mm40VarH, vr1Var, (Function2) objP, fetVar, 0, 0);
                    fetVar.r(false);
                } else if (f3s0Var instanceof e3s0) {
                    fetVar.e0(-1972322493);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    hrl hrlVar = hrl.f13536a;
                    krl krlVar = ((e3s0) f3s0Var).f7153a;
                    zcl zclVar = qmk.f28987a;
                    vic.d(mm40VarD, hrlVar, krlVar, 0.0f, fetVar, 6, 16);
                    fetVar = fetVar;
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(-1972341637, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

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
            cjs0 cjs0Var = (cjs0) this.b.get(iIntValue);
            fetVar.e0(-207766744);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            rqm rqmVar = cjs0Var.b;
            boolean zI = fetVar.i(cjs0Var);
            Object objP = fetVar.P();
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new yis0(function1, cjs0Var, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(cjs0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new yis0(function1, cjs0Var, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarD, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 6, 172);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mbc.o(zfi0.f44303a, s5x0.L(mm40VarD2, 12.0f, 0.0f, 2), false, fetVar, 6, 4);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    private final Object x(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fet fetVar;
        yzu0 yzu0Var;
        Function1 function1;
        boolean zI;
        Object objP;
        float f;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar2 = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        g9zVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar2.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar2.e(iIntValue) ? 32 : 16;
        }
        if (fetVar2.U(i & 1, (i & 147) != 146)) {
            a0v0 a0v0Var = (a0v0) this.b.get(iIntValue);
            fetVar2.e0(-623586255);
            if (a0v0Var instanceof zzu0) {
                zzu0 zzu0Var = (zzu0) a0v0Var;
                if (zzu0Var.c != null) {
                    fetVar2.e0(-623507485);
                    if (zzu0Var.b == pg.f26929a) {
                        zcl zclVar = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f = 16.0f;
                    }
                    fetVar = fetVar2;
                    nkb.h(s5x0.L(s5x0.N(jm40.b, 0.0f, f, 0.0f, 0.0f, 13), xfn.a(fetVar2).e, 0.0f, 2), zzu0Var.c, kjm.b, null, null, null, fetVar, 384, 56);
                    fetVar.r(false);
                } else {
                    fetVar = fetVar2;
                    if (a0v0Var instanceof yzu0) {
                        yzu0Var = (yzu0) a0v0Var;
                        if (yzu0Var.j != null) {
                            fetVar.e0(-622597077);
                            rqm rqmVar = yzu0Var.j;
                            boolean z = yzu0Var.i;
                            function1 = this.c;
                            zI = fetVar.i(a0v0Var) | fetVar.g(function1);
                            objP = fetVar.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new ywm0(function1, yzu0Var, (byte) 27);
                                fetVar.o0(objP);
                            }
                            obc.q(null, rqmVar, z, null, (Function0) objP, null, null, null, fetVar, 0, 233);
                            fetVar = fetVar;
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-297162179);
                            fetVar.r(false);
                        }
                    } else {
                        fetVar.e0(-297162179);
                        fetVar.r(false);
                    }
                }
            } else {
                fetVar = fetVar2;
                if (a0v0Var instanceof yzu0) {
                    yzu0Var = (yzu0) a0v0Var;
                    if (yzu0Var.j != null) {
                        fetVar.e0(-622597077);
                        rqm rqmVar2 = yzu0Var.j;
                        boolean z2 = yzu0Var.i;
                        function1 = this.c;
                        zI = fetVar.i(a0v0Var) | fetVar.g(function1);
                        objP = fetVar.P();
                        if (zI) {
                            objP = new ywm0(function1, yzu0Var, (byte) 27);
                            fetVar.o0(objP);
                        } else {
                            objP = new ywm0(function1, yzu0Var, (byte) 27);
                            fetVar.o0(objP);
                        }
                        obc.q(null, rqmVar2, z2, null, (Function0) objP, null, null, null, fetVar, 0, 233);
                        fetVar = fetVar;
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-297162179);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.e0(-297162179);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
        } else {
            fetVar2.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0410  */
    /* JADX WARN: Code duplicated, block: B:239:0x0547  */
    /* JADX WARN: Code duplicated, block: B:367:0x088f  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        long textPrimary;
        int i3;
        int i4;
        fet fetVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        byte b = this.f23637a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        List list = this.b;
        Function1 function1 = this.c;
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
                    ejh0 ejh0Var = (ejh0) list.get(iIntValue);
                    fetVar2.e0(-878850603);
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar2);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean zG = fetVar2.g(function1) | fetVar2.g(ejh0Var);
                    Object objP2 = fetVar2.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new sue0(function1, ejh0Var, (byte) 14);
                        fetVar2.o0(objP2);
                    }
                    k7x.r(y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP2, 28), ejh0Var, fetVar2, 0);
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
                    zkh0 zkh0Var = (zkh0) list.get(iIntValue3);
                    fetVar3.e0(1076600696);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
                    String str = zkh0Var.b;
                    boolean z = zkh0Var.c;
                    if (z) {
                        fetVar3.e0(450380521);
                        textPrimary = ((ThemeColors) fetVar3.k(zaq0.b)).getPrimary();
                    } else {
                        fetVar3.e0(450381517);
                        textPrimary = ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary();
                    }
                    fetVar3.r(false);
                    rqm rqmVar = new rqm((vui0) new tui0(str, new y3d(textPrimary)), (pui0) null, (pvi0) new nvi0(z), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
                    boolean zG2 = fetVar3.g(function1) | fetVar3.i(zkh0Var);
                    Object objP3 = fetVar3.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new vkh0(function1, zkh0Var, (byte) 0);
                        fetVar3.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zG3 = fetVar3.g(function1) | fetVar3.i(zkh0Var);
                    Object objP4 = fetVar3.P();
                    if (zG3 || objP4 == cl5Var) {
                        objP4 = new vkh0(function1, zkh0Var, (byte) 1);
                        fetVar3.o0(objP4);
                    }
                    obc.q(mm40VarL, rqmVar, false, null, function0, null, (Function0) objP4, null, fetVar3, 0, 172);
                    vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar3, 432, 9);
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
                    axa axaVar = (axa) list.get(iIntValue5);
                    fetVar4.e0(505809062);
                    zcl zclVar2 = qmk.f28987a;
                    ffb0.j(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), axaVar, function1, fetVar4, 384);
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
                g9zVar4.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar5.g(g9zVar4) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar5.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar5.U(i4 & 1, (i4 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) list.get(iIntValue7);
                    fetVar5.e0(169651810);
                    if (p6t0Var instanceof dre) {
                        fetVar5.e0(-2072735501);
                        dre dreVar = (dre) p6t0Var;
                        zrm zrmVar = dreVar.b;
                        boolean zG4 = fetVar5.g(function1) | fetVar5.g(p6t0Var);
                        Object objP5 = fetVar5.P();
                        if (zG4 || objP5 == cl5Var) {
                            objP5 = new sue0(function1, dreVar, (byte) 15);
                            fetVar5.o0(objP5);
                        }
                        Function0 function2 = (Function0) objP5;
                        boolean zG5 = fetVar5.g(p6t0Var) | fetVar5.g(function1);
                        Object objP6 = fetVar5.P();
                        if (zG5 || objP6 == cl5Var) {
                            objP6 = new pwe0(function1, dreVar, (byte) 21);
                            fetVar5.o0(objP6);
                        }
                        agc.r(null, zrmVar, function2, null, null, (Function1) objP6, null, fetVar5, 0, 89);
                        fetVar = fetVar5;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar5;
                        fetVar.e0(170212072);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar6 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = (fetVar6.g(g9zVar5) ? 4 : 2) | iIntValue10;
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar6.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar6.U(i5 & 1, (i5 & 147) != 146)) {
                    hej0 hej0Var = (hej0) list.get(iIntValue9);
                    fetVar6.e0(-2079204801);
                    if (hej0Var == null) {
                        fetVar6.e0(-2076171886);
                        fetVar6.r(false);
                    } else {
                        boolean z2 = hej0Var instanceof wev0;
                        jm40 jm40Var2 = jm40.b;
                        if (z2) {
                            fetVar6.e0(-1452545557);
                            zcl zclVar3 = qmk.f28987a;
                            k7n0.l(0, 0, fetVar6, s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13));
                            fetVar6.r(false);
                        } else if (hej0Var instanceof aaj0) {
                            fetVar6.e0(-2079110500);
                            aaj0 aaj0Var = (aaj0) hej0Var;
                            boolean z3 = aaj0Var.b;
                            xdx.s(0, fetVar6, dwi0.H(((ThemeColors) fetVar6.k(zaq0.b)).getBackgroundContent(), aaj0Var.f528a, z3), !z3, aaj0Var.c);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof nzi0) {
                            fetVar6.e0(-1452526722);
                            boolean zG6 = fetVar6.g(function1) | fetVar6.g(hej0Var);
                            Object objP7 = fetVar6.P();
                            if (zG6 || objP7 == cl5Var) {
                                objP7 = new ub(function1, hej0Var, (byte) 2);
                                fetVar6.o0(objP7);
                            }
                            dwi0.d(0, fetVar6, (nzi0) hej0Var, (Function1) objP7);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof qfj0) {
                            fetVar6.e0(-1452519679);
                            dwi0.A((qfj0) hej0Var, function1, fetVar6, 0);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof hzi0) {
                            fetVar6.e0(-1452516372);
                            boolean zG7 = fetVar6.g(function1) | fetVar6.g(hej0Var);
                            Object objP8 = fetVar6.P();
                            if (zG7 || objP8 == cl5Var) {
                                objP8 = new ub(function1, hej0Var, (byte) 3);
                                fetVar6.o0(objP8);
                            }
                            zcl zclVar4 = qmk.f28987a;
                            q7x.p((Function1) objP8, (hzi0) hej0Var, s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13), fetVar6, 0);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof g4k) {
                            fetVar6.e0(-1452506847);
                            boolean zG8 = fetVar6.g(function1) | fetVar6.g(hej0Var);
                            Object objP9 = fetVar6.P();
                            if (zG8 || objP9 == cl5Var) {
                                objP9 = new ub(function1, hej0Var, (byte) 4);
                                fetVar6.o0(objP9);
                            }
                            dwi0.l(0, (g4k) hej0Var, fetVar6, (Function1) objP9);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof mv00) {
                            fetVar6.e0(-1452499878);
                            boolean zG9 = fetVar6.g(function1) | fetVar6.g(hej0Var);
                            Object objP10 = fetVar6.P();
                            if (zG9 || objP10 == cl5Var) {
                                objP10 = new ub(function1, hej0Var, (byte) 5);
                                fetVar6.o0(objP10);
                            }
                            dwi0.t(0, fetVar6, (mv00) hej0Var, (Function1) objP10);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof b8j0) {
                            fetVar6.e0(-1452492514);
                            boolean zG10 = fetVar6.g(function1) | fetVar6.g(hej0Var);
                            Object objP11 = fetVar6.P();
                            if (zG10 || objP11 == cl5Var) {
                                objP11 = new ub(function1, hej0Var, (byte) 6);
                                fetVar6.o0(objP11);
                            }
                            dwi0.B(0, fetVar6, (b8j0) hej0Var, (Function1) objP11);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof wgj0) {
                            fetVar6.e0(-1452484597);
                            boolean zG11 = fetVar6.g(function1) | fetVar6.g(hej0Var);
                            Object objP12 = fetVar6.P();
                            if (zG11 || objP12 == cl5Var) {
                                objP12 = new ub(function1, hej0Var, (byte) 7);
                                fetVar6.o0(objP12);
                            }
                            wgj0 wgj0Var = (wgj0) hej0Var;
                            gfx.o((Function1) objP12, wgj0Var, dwi0.H(((ThemeColors) fetVar6.k(zaq0.b)).getBackgroundContent(), wgj0Var.getFirst(), wgj0Var.getLast()), fetVar6, 0);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof vhj0) {
                            fetVar6.e0(-1452468700);
                            boolean zG12 = fetVar6.g(function1) | fetVar6.g(hej0Var);
                            Object objP13 = fetVar6.P();
                            if (zG12 || objP13 == cl5Var) {
                                objP13 = new ub(function1, hej0Var, (byte) 8);
                                fetVar6.o0(objP13);
                            }
                            dwi0.i(0, fetVar6, (vhj0) hej0Var, (Function1) objP13);
                            fetVar6.r(false);
                        } else if (hej0Var instanceof vdj0) {
                            fetVar6.e0(-1452460886);
                            boolean zG13 = fetVar6.g(function1) | fetVar6.g(hej0Var);
                            Object objP14 = fetVar6.P();
                            if (zG13 || objP14 == cl5Var) {
                                objP14 = new ub(function1, hej0Var, (byte) 9);
                                fetVar6.o0(objP14);
                            }
                            vdj0 vdj0Var = (vdj0) hej0Var;
                            wdx.D((Function1) objP14, vdj0Var, dwi0.H(((ThemeColors) fetVar6.k(zaq0.b)).getBackgroundContent(), vdj0Var.getFirst(), vdj0Var.getLast()), fetVar6, 0);
                            fetVar6.r(false);
                        } else {
                            fetVar6.e0(-2076171886);
                            fetVar6.r(false);
                        }
                    }
                    fetVar6.r(false);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar7 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar7.g(g9zVar6) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar7.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar7.U(i6 & 1, (i6 & 147) != 146)) {
                    tjz tjzVar = (tjz) list.get(iIntValue11);
                    fetVar7.e0(-1192534536);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    boolean zG14 = fetVar7.g(tjzVar);
                    Object objP15 = fetVar7.P();
                    if (zG14 || objP15 == cl5Var) {
                        objP15 = new agk(tjzVar, (byte) 1);
                        fetVar7.o0(objP15);
                    }
                    Function1 function3 = (Function1) objP15;
                    boolean zG15 = fetVar7.g(tjzVar) | fetVar7.g(function1);
                    Object objP16 = fetVar7.P();
                    if (zG15 || objP16 == cl5Var) {
                        objP16 = new bgk(tjzVar, function1, (byte) 5);
                        fetVar7.o0(objP16);
                    }
                    dwi0.b(function3, mm40VarN, (Function1) objP16, fetVar7, 0, 0);
                    fetVar7.r(false);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar8.g(g9zVar7) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar8.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar8.U(i7 & 1, (i7 & 147) != 146)) {
                    hej0 hej0Var2 = (hej0) list.get(iIntValue13);
                    fetVar8.e0(-1941696939);
                    if (hej0Var2 == null) {
                        fetVar8.e0(-1940169911);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof aaj0) {
                        fetVar8.e0(-893917819);
                        idx.p(0, fetVar8, null, ((aaj0) hej0Var2).c);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof hzi0) {
                        fetVar8.e0(-1941555332);
                        r7x.l(function1, (hzi0) hej0Var2, fetVar8, 0);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof z8j0) {
                        fetVar8.e0(-1941390412);
                        ucx.I((z8j0) hej0Var2, function1, fetVar8, 0);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof zdj0) {
                        fetVar8.e0(-1941221989);
                        xdx.r((zdj0) hej0Var2, function1, fetVar8, 0);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof ehj0) {
                        fetVar8.e0(-1941050993);
                        zdx.p((ehj0) hej0Var2, function1, fetVar8, 0);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof xhj0) {
                        fetVar8.e0(-1940871627);
                        tfx.m((xhj0) hej0Var2, function1, fetVar8, 0);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof pzi0) {
                        fetVar8.e0(-1940700073);
                        b8k0.p((pzi0) hej0Var2, function1, fetVar8, 0);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof f4k) {
                        fetVar8.e0(-1940532394);
                        f4k f4kVar = (f4k) hej0Var2;
                        boolean zG16 = fetVar8.g(function1);
                        Object objP17 = fetVar8.P();
                        if (zG16 || objP17 == cl5Var) {
                            objP17 = new v6a0(function1, (byte) 21);
                            fetVar8.o0(objP17);
                        }
                        agc.k(f4kVar, (Function1) objP17, fetVar8, 0);
                        fetVar8.r(false);
                    } else if (hej0Var2 instanceof dy00) {
                        fetVar8.e0(-1940257641);
                        h8x.i((dy00) hej0Var2, function1, fetVar8, 0);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(-1940169911);
                        fetVar8.r(false);
                    }
                    fetVar8.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar9.g(g9zVar8) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar9.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar9.U(i8 & 1, (i8 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) list.get(iIntValue15);
                    fetVar9.e0(1136948253);
                    if (p6t0Var2 == null) {
                        fetVar9.e0(1137392234);
                        fetVar9.r(false);
                    } else if (p6t0Var2 instanceof gsv) {
                        fetVar9.e0(1136995031);
                        jd8.E(null, ((gsv) p6t0Var2).b, fetVar9, 0);
                        fetVar9.r(false);
                    } else if (p6t0Var2 instanceof fql0) {
                        fetVar9.e0(1137184937);
                        jd8.T(null, (fql0) p6t0Var2, function1, fetVar9, 0);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(1137392234);
                        fetVar9.r(false);
                    }
                    fetVar9.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 8:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar10.g(g9zVar9) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar10.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar10.U(i9 & 1, (i9 & 147) != 146)) {
                    ek00 ek00Var = (ek00) list.get(iIntValue17);
                    fetVar10.e0(-578048415);
                    mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar10.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar10, 0);
                    int iHashCode = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM = fetVar10.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar10, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(pcyVar);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, x5dVarA, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC0, gqw0.v);
                    mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar10).b, 0.0f, 2);
                    b8l0 b8l0Var = ek00Var.b;
                    n3l0 n3l0Var = ek00Var.c;
                    boolean zG17 = fetVar10.g(ek00Var) | fetVar10.g(function1);
                    Object objP18 = fetVar10.P();
                    if (zG17 || objP18 == cl5Var) {
                        objP18 = new bxy(ek00Var, function1, (byte) 6);
                        fetVar10.o0(objP18);
                    }
                    Function0 function4 = (Function0) objP18;
                    boolean zG18 = fetVar10.g(ek00Var) | fetVar10.g(function1);
                    Object objP19 = fetVar10.P();
                    if (zG18 || objP19 == cl5Var) {
                        objP19 = new bxy(ek00Var, function1, (byte) 7);
                        fetVar10.o0(objP19);
                    }
                    Function0 function5 = (Function0) objP19;
                    boolean zG19 = fetVar10.g(ek00Var) | fetVar10.g(function1);
                    Object objP20 = fetVar10.P();
                    if (zG19 || objP20 == cl5Var) {
                        objP20 = new dxy(ek00Var, function1, (byte) 3);
                        fetVar10.o0(objP20);
                    }
                    xbc.o(mm40VarL2, b8l0Var, n3l0Var, null, false, function4, function5, null, (Function1) objP20, fetVar10, 0, 152);
                    mbc.o(zfi0.f44303a, null, false, fetVar10, 6, 6);
                    fetVar10.r(true);
                    fetVar10.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 9:
                g9z g9zVar10 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar11.g(g9zVar10) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar11.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar11.U(i10 & 1, (i10 & 147) != 146)) {
                    l6w l6wVar = (l6w) list.get(iIntValue19);
                    fetVar11.e0(-622038244);
                    mm40 mm40VarQ2 = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar11.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar11, 0);
                    int iHashCode2 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM2 = fetVar11.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar11, mm40VarQ2);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC1, gqw0.v);
                    mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar11).b, 0.0f, 2);
                    b8l0 b8l0Var2 = l6wVar.b;
                    n3l0 n3l0Var2 = l6wVar.c;
                    boolean zG20 = fetVar11.g(l6wVar) | fetVar11.g(function1);
                    Object objP21 = fetVar11.P();
                    if (zG20 || objP21 == cl5Var) {
                        objP21 = new cxy(l6wVar, function1, (byte) 6);
                        fetVar11.o0(objP21);
                    }
                    Function0 function6 = (Function0) objP21;
                    boolean zG21 = fetVar11.g(l6wVar) | fetVar11.g(function1);
                    Object objP22 = fetVar11.P();
                    if (zG21 || objP22 == cl5Var) {
                        objP22 = new cxy(l6wVar, function1, (byte) 7);
                        fetVar11.o0(objP22);
                    }
                    Function0 function7 = (Function0) objP22;
                    boolean zG22 = fetVar11.g(l6wVar) | fetVar11.g(function1);
                    Object objP23 = fetVar11.P();
                    if (zG22 || objP23 == cl5Var) {
                        objP23 = new exy(l6wVar, function1, (byte) 3);
                        fetVar11.o0(objP23);
                    }
                    xbc.o(mm40VarL3, b8l0Var2, n3l0Var2, null, false, function6, function7, null, (Function1) objP23, fetVar11, 0, 152);
                    mbc.o(zfi0.f44303a, null, false, fetVar11, 6, 6);
                    fetVar11.r(true);
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
            default:
                g9z g9zVar11 = (g9z) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i11 = iIntValue22 | (fetVar12.g(g9zVar11) ? 4 : 2);
                } else {
                    i11 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i11 |= fetVar12.e(iIntValue21) ? 32 : 16;
                }
                if (fetVar12.U(i11 & 1, (i11 & 147) != 146)) {
                    rdv0 rdv0Var = (rdv0) list.get(iIntValue21);
                    fetVar12.e0(-1440182401);
                    boolean zG23 = fetVar12.g(function1) | fetVar12.g(rdv0Var);
                    Object objP24 = fetVar12.P();
                    if (zG23 || objP24 == cl5Var) {
                        objP24 = new ywm0(function1, rdv0Var, (byte) 28);
                        fetVar12.o0(objP24);
                    }
                    iym0.k(null, rdv0Var, (Function0) objP24, fetVar12, 0, 1);
                    fetVar12.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
        }
    }
}
