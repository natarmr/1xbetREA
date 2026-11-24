package a;

import android.javax.sip.message.Response;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ws1 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39672a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;

    public ws1(a4x a4xVar, Function1 function1, int i) {
        this.f39672a = (byte) 18;
        this.b = a4xVar;
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
            or70 or70Var = (or70) this.b.get(iIntValue);
            fetVar.e0(1184075600);
            int i2 = or70Var.c ? R.attr.uikitPrimary : R.attr.uikitTextPrimary;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 4.0f, 0.0f, 2);
            rqm rqmVar = new rqm((vui0) new tui0(or70Var.b, new y3d(qcc.S(i2, fetVar))), (pui0) null, (pvi0) new nvi0(or70Var.c), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(or70Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ufc(function1, or70Var, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1) | fetVar.g(or70Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ufc(function1, or70Var, (byte) 1);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarL, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 0, 172);
            vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
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
            pi90 pi90Var = (pi90) this.b.get(iIntValue);
            fetVar.e0(-1104960504);
            if (pi90Var != null) {
                if (pi90Var instanceof ni90) {
                    fetVar.e0(-1104935798);
                    sjm[] sjmVarArr = sjm.f32310a;
                    slb.l(null, xsm0.s(((ni90) pi90Var).f23573a, fetVar), null, 0L, null, fetVar, 48);
                    fetVar.r(false);
                } else if (pi90Var instanceof oi90) {
                    fetVar.e0(-1104575826);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40.b, 16.0f, 0.0f, 2);
                    oi90 oi90Var = (oi90) pi90Var;
                    rqm rqmVar = new rqm((vui0) new tui0(oi90Var.b, new y3d(ibc.Y(oi90Var.c, fetVar))), (pui0) new oui0(Integer.valueOf(R.drawable.ic_glyph_color_flag_placeholder), (y3d) null, new n0x(oi90Var.e), (y3d) null, 26), (pvi0) new nvi0(oi90Var.d), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT);
                    Function1 function1 = this.c;
                    boolean zG = fetVar.g(function1) | fetVar.g(pi90Var);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new h5((Object) function1, (Object) pi90Var, (byte) 26);
                        fetVar.o0(objP);
                    }
                    obc.q(mm40VarL, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
                    if (oi90Var.f) {
                        fetVar.e0(-1103397516);
                        wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1103273516);
                        vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(-1836759205, fetVar, false);
        }
        fetVar.X();
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
            smh smhVar = (smh) this.b.get(iIntValue);
            fetVar.e0(-1114695253);
            ulb.f(smhVar, this.c, fetVar, 0);
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
            smh smhVar = (smh) this.b.get(iIntValue);
            fetVar.e0(736514551);
            kpb.d(smhVar, this.c, fetVar, 0);
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
            ybm ybmVar = (ybm) this.b.get(iIntValue);
            fetVar.e0(-1759156256);
            vbc.w(ybmVar, this.c, fetVar, 0);
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
            zgp zgpVar = (zgp) this.b.get(iIntValue);
            fetVar.e0(-1504198029);
            rqm rqmVar = zgpVar.b;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(zgpVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new lhf(function1, zgpVar, (byte) 26);
                fetVar.o0(objP);
            }
            obc.q(null, rqmVar, false, null, null, null, (Function0) objP, null, fetVar, 0, 189);
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
            uew uewVar = (uew) this.b.get(iIntValue);
            fetVar.e0(728365310);
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
            boolean zG = fetVar.g(function1) | fetVar.i(uewVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new nsr((Object) function1, (Object) uewVar, (byte) 9);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarI, gy40Var, ncg0VarA, false, null, (Function0) objP2, 28);
            wxl wxlVar = wxl.OVERLAY;
            boolean zI = fetVar.i(uewVar);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new w0((Object) uewVar, (byte) 23);
                fetVar.o0(objP3);
            }
            v3c.n(mm40VarW, wxlVar, (Function1) objP3, fetVar, 48, 0);
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
            rk90 rk90Var = (rk90) this.b.get(iIntValue);
            fetVar.e0(736014146);
            if (rk90Var != null) {
                if (rk90Var instanceof pk90) {
                    fetVar.e0(736049640);
                    zcl zclVar = qmk.f28987a;
                    wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
                    sjm[] sjmVarArr = sjm.f32310a;
                    slb.l(null, xsm0.s(((pk90) rk90Var).f27126a, fetVar), null, 0L, null, fetVar, 48);
                    fetVar.r(false);
                } else if (rk90Var instanceof qk90) {
                    fetVar.e0(736416339);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(jm40.b, 4.0f, 0.0f, 2);
                    qk90 qk90Var = (qk90) rk90Var;
                    rqm rqmVar = new rqm((vui0) new tui0(f1t0.L(qk90Var.b).toString(), new y3d(ibc.Y(qk90Var.c, fetVar))), (pui0) null, (pvi0) new nvi0(qk90Var.d), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506);
                    Function1 function1 = this.c;
                    boolean zG = fetVar.g(function1) | fetVar.g(rk90Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new dt00(function1, rk90Var, (byte) 0);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1) | fetVar.g(rk90Var);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new dt00(function1, rk90Var, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    obc.q(mm40VarL, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 0, 172);
                    if (qk90Var.e) {
                        fetVar.e0(737460388);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(737235514);
                        vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(1409215713, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
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
            ff10 ff10Var = (ff10) this.b.get(iIntValue);
            fetVar.e0(-908075275);
            if (ff10Var == null) {
                fetVar.e0(-906425239);
                fetVar.r(false);
            } else if (ff10Var instanceof df10) {
                fetVar.e0(-908021305);
                ohq0.p(((df10) ff10Var).f5978a, fetVar, 6);
                fetVar.r(false);
            } else if (ff10Var instanceof bf10) {
                fetVar.e0(-907699184);
                mwa mwaVar = ((bf10) ff10Var).f2479a;
                Function1 function1 = this.c;
                boolean zG = fetVar.g(function1);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new cnn(function1, (byte) 11);
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean zG2 = fetVar.g(function1);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new cnn(function1, (byte) 12);
                    fetVar.o0(objP2);
                }
                y9a.k(mwaVar, function0, (Function0) objP2, fetVar, 6);
                fetVar.r(false);
            } else if (ff10Var instanceof ef10) {
                fetVar.e0(-907034358);
                nkb.h(jm40.b, ((ef10) ff10Var).f7702a, kjm.f18392a, null, null, null, fetVar, 390, 56);
                fetVar.r(false);
            } else if (ff10Var instanceof cf10) {
                fetVar.e0(-906666295);
                ro4.p(((cf10) ff10Var).f4237a, fetVar, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(-906425239);
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
            wg10 wg10Var = (wg10) this.b.get(iIntValue);
            fetVar.e0(-1355760073);
            if (wg10Var != null) {
                if (wg10Var instanceof tg10) {
                    fetVar.e0(-43732159);
                    mwa mwaVar = ((tg10) wg10Var).f33888a;
                    Function1 function1 = this.c;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new cnn(function1, (byte) 13);
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new cnn(function1, (byte) 14);
                        fetVar.o0(objP2);
                    }
                    y9a.k(mwaVar, function0, (Function0) objP2, fetVar, 6);
                    fetVar.r(false);
                } else if (wg10Var instanceof ug10) {
                    fetVar.e0(-43681617);
                    fre0.o(((ug10) wg10Var).f35601a, fetVar, 6);
                    fetVar.r(false);
                } else if (wg10Var instanceof vg10) {
                    fetVar.e0(-43672052);
                    ccq0.h(((vg10) wg10Var).f37361a, fetVar, 6);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(-43734196, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
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
            k250 k250Var = (k250) this.b.get(iIntValue);
            fetVar.e0(-1972401293);
            if (k250Var != null) {
                boolean z = k250Var instanceof z150;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                Function1 function1 = this.c;
                if (z) {
                    fetVar.e0(-1972673939);
                    mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).e, 0.0f, 2);
                    jjm jjmVar = ((z150) k250Var).b;
                    kjm kjmVar = kjm.f18392a;
                    boolean zG = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new u150(function1, k250Var, (byte) 0);
                        fetVar.o0(objP);
                    }
                    nkb.h(mm40VarL, jjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (k250Var instanceof c250) {
                    fetVar.e0(-1972032859);
                    mm40 mm40VarL2 = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).c, 0.0f, 2);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarL2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    vf10 vf10Var = ((c250) k250Var).b;
                    boolean zG2 = fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new cnn(function1, (byte) 18);
                        fetVar.o0(objP2);
                    }
                    q0x.h(mm40VarN, vf10Var, (Function0) objP2, fetVar, 0);
                    fetVar.r(false);
                } else if (k250Var instanceof d250) {
                    fetVar.e0(-1971279032);
                    x0x.h((d250) k250Var, function1, fetVar, 6);
                    fetVar.r(false);
                } else if (k250Var instanceof b250) {
                    fetVar.e0(-1970894043);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(jm40Var, xfn.a(fetVar).c, 4.0f, xfn.a(fetVar).c, 16.0f);
                    hkl hklVar = ((b250) k250Var).b;
                    boolean zG3 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new u150(function1, k250Var, (byte) 2);
                        fetVar.o0(objP3);
                    }
                    y9a.s(mm40VarM, hklVar, null, (Function0) objP3, fetVar, 0, 4);
                    fetVar.r(false);
                } else if (k250Var instanceof y150) {
                    fetVar.e0(-1970040334);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarL3 = s5x0.L(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), xfn.a(fetVar).c, 0.0f, 2);
                    ozh ozhVar = ((y150) k250Var).b;
                    boolean zG4 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP4 = fetVar.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new u150(function1, k250Var, (byte) 3);
                        fetVar.o0(objP4);
                    }
                    Function0 function0 = (Function0) objP4;
                    boolean zG5 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP5 = fetVar.P();
                    if (zG5 || objP5 == cl5Var) {
                        objP5 = new u150(function1, k250Var, (byte) 4);
                        fetVar.o0(objP5);
                    }
                    jwb.i(mm40VarL3, ozhVar, function0, (Function0) objP5, fetVar, 0);
                    fetVar.r(false);
                } else if (k250Var instanceof x150) {
                    fetVar.e0(-1969133088);
                    mm40 mm40VarL4 = s5x0.L(jm40Var, xfn.a(fetVar).c, 0.0f, 2);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarL4, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    boolean zG6 = fetVar.g(function1);
                    Object objP6 = fetVar.P();
                    if (zG6 || objP6 == cl5Var) {
                        objP6 = new cnn(function1, (byte) 19);
                        fetVar.o0(objP6);
                    }
                    Function0 function2 = (Function0) objP6;
                    boolean zG7 = fetVar.g(function1);
                    Object objP7 = fetVar.P();
                    if (zG7 || objP7 == cl5Var) {
                        objP7 = new cnn(function1, (byte) 20);
                        fetVar.o0(objP7);
                    }
                    vtb.i(mm40VarN2, vyh.f38247a, function2, (Function0) objP7, fetVar);
                    fetVar.r(false);
                } else if (k250Var instanceof f250) {
                    fetVar.e0(-1968181357);
                    mm40 mm40VarL5 = s5x0.L(jm40Var, xfn.a(fetVar).c, 0.0f, 2);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40VarL5, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    hkl hklVar2 = ((f250) k250Var).b;
                    boolean zG8 = fetVar.g(function1);
                    Object objP8 = fetVar.P();
                    if (zG8 || objP8 == cl5Var) {
                        objP8 = new cnn(function1, (byte) 21);
                        fetVar.o0(objP8);
                    }
                    y9a.s(mm40VarN3, hklVar2, null, (Function0) objP8, fetVar, 0, 4);
                    fetVar.r(false);
                } else if (k250Var instanceof j250) {
                    fetVar.e0(-1967459398);
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarN4 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    a4x a4xVar = ((j250) k250Var).b;
                    float f = xfn.a(fetVar).c;
                    boolean zG9 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP9 = fetVar.P();
                    if (zG9 || objP9 == cl5Var) {
                        objP9 = new v150(function1, k250Var, (byte) 4);
                        fetVar.o0(objP9);
                    }
                    dub.l(mm40VarN4, a4xVar, f, (Function1) objP9, fetVar, 0);
                    fetVar.r(false);
                } else if (k250Var instanceof a250) {
                    fetVar.e0(-1966509961);
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarN5 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    bml bmlVar = ((a250) k250Var).b;
                    lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
                    boolean zG10 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP10 = fetVar.P();
                    if (zG10 || objP10 == cl5Var) {
                        objP10 = new v150(function1, k250Var, (byte) 0);
                        fetVar.o0(objP10);
                    }
                    Function1 function3 = (Function1) objP10;
                    boolean zG11 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP11 = fetVar.P();
                    if (zG11 || objP11 == cl5Var) {
                        objP11 = new v150(function1, k250Var, (byte) 1);
                        fetVar.o0(objP11);
                    }
                    ckb.f(mm40VarN5, bmlVar, null, lh80VarT, null, null, function3, (Function1) objP11, fetVar, 0, 52);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (k250Var instanceof g250) {
                    fetVar.e0(-1965113132);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    float f2 = xfn.a(fetVar).c;
                    zcl zclVar8 = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarD, f2, 8.0f);
                    szh szhVar = ((g250) k250Var).b;
                    boolean zG12 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP12 = fetVar.P();
                    if (zG12 || objP12 == cl5Var) {
                        objP12 = new v150(function1, k250Var, (byte) 2);
                        fetVar.o0(objP12);
                    }
                    Function1 function4 = (Function1) objP12;
                    boolean zG13 = fetVar.g(function1);
                    Object objP13 = fetVar.P();
                    if (zG13 || objP13 == cl5Var) {
                        objP13 = new cnn(function1, (byte) 17);
                        fetVar.o0(objP13);
                    }
                    hkb.f(mm40VarK, szhVar, function4, (Function0) objP13, fetVar);
                    fetVar.r(false);
                } else if (k250Var instanceof h250) {
                    fetVar.e0(-1963866250);
                    zcl zclVar9 = qmk.f28987a;
                    mm40 mm40VarN6 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    h0i h0iVar = ((h250) k250Var).b;
                    float f3 = xfn.a(fetVar).c;
                    boolean zG14 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP14 = fetVar.P();
                    if (zG14 || objP14 == cl5Var) {
                        objP14 = new v150(function1, k250Var, (byte) 3);
                        fetVar.o0(objP14);
                    }
                    ro4.u(mm40VarN6, h0iVar, f3, (Function1) objP14, fetVar);
                    fetVar.r(false);
                } else if (k250Var instanceof i250) {
                    fetVar.e0(-1962923912);
                    zcl zclVar10 = qmk.f28987a;
                    mm40 mm40VarN7 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    i250 i250Var = (i250) k250Var;
                    ypl yplVar = i250Var.b;
                    bql bqlVar = i250Var.c;
                    boolean zG15 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP15 = fetVar.P();
                    if (zG15 || objP15 == cl5Var) {
                        objP15 = new u150(function1, k250Var, (byte) 1);
                        fetVar.o0(objP15);
                    }
                    Function0 function5 = (Function0) objP15;
                    boolean zG16 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP16 = fetVar.P();
                    if (zG16 || objP16 == cl5Var) {
                        objP16 = new w150(function1, k250Var, (byte) 0);
                        fetVar.o0(objP16);
                    }
                    dyb.k(mm40VarN7, yplVar, bqlVar, function5, (Function2) objP16, fetVar, 0);
                    fetVar = fetVar;
                    fetVar.r(false);
                } else if (k250Var instanceof e250) {
                    fetVar.e0(-1961835905);
                    zcl zclVar11 = qmk.f28987a;
                    mm40 mm40VarN8 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    tzc0 tzc0Var = ((e250) k250Var).b;
                    a4x a4xVar2 = tzc0Var instanceof rzc0 ? ((rzc0) tzc0Var).b : lak0.c;
                    lq5 lq5VarA = tzc0Var.a();
                    boolean z2 = tzc0Var instanceof szc0;
                    boolean zG17 = fetVar.g(function1) | fetVar.g(k250Var);
                    Object objP17 = fetVar.P();
                    if (zG17 || objP17 == cl5Var) {
                        objP17 = new w150(function1, k250Var, (byte) 1);
                        fetVar.o0(objP17);
                    }
                    etl.e(mm40VarN8, a4xVar2, lq5VarA, z2, null, 0.0f, 0, null, (Function2) objP17, fetVar, 0, 240);
                    fetVar = fetVar;
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            throw b1j.f(213468816, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

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
        byte b = 1;
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            g8a0 g8a0Var = (g8a0) this.b.get(iIntValue);
            fetVar.e0(324629962);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new v6a0(function1, b);
                fetVar.o0(objP);
            }
            ntr.L(g8a0Var, (Function1) objP, fetVar, 0);
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
            ome0 ome0Var = (ome0) this.b.get(iIntValue);
            fetVar.e0(-198358504);
            ny9.A(ome0Var, this.c, fetVar, 0);
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
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            tsd tsdVar = (tsd) this.b.get(iIntValue);
            fetVar.e0(-198856966);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            rqm rqmVar = tsdVar.b;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.i(tsdVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new sue0(function1, tsdVar, (byte) 2);
                fetVar.o0(objP);
            }
            obc.q(mm40VarD, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 6, 236);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

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
            s8l0 s8l0Var = (s8l0) this.b.get(iIntValue);
            fetVar.e0(1391522278);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.i(s8l0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ywm0(function1, s8l0Var, (byte) 15);
                fetVar.o0(objP);
            }
            cjx.G(null, s8l0Var, (Function0) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mim0 lim0Var;
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
            agt0 agt0Var = (agt0) this.b.get(iIntValue);
            fetVar.e0(-513857549);
            if (agt0Var instanceof yft0) {
                lim0Var = ((yft0) agt0Var).f42557a;
            } else {
                aql0 aql0Var = aql0.f1302a;
                lim0Var = new lim0();
            }
            mim0 mim0Var = lim0Var;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1) | fetVar.g(agt0Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new xlr0(function1, agt0Var, (byte) 10);
                fetVar.o0(objP);
            }
            lgb.n(mm40VarN, mim0Var, true, (Function1) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x028f  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        fet fetVar;
        fet fetVar2;
        int i3;
        fet fetVar3;
        int i4;
        fet fetVar4;
        int i5;
        fet fetVar5;
        int i6;
        fet fetVar6;
        int i7;
        int i8;
        int i9;
        mim0 lim0Var;
        int i10;
        byte b = this.f39672a;
        cl5 cl5Var = ukd.f35823a;
        a4x a4xVar = this.b;
        Function1 function1 = this.c;
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
                    nw1 nw1Var = (nw1) a4xVar.get(iIntValue);
                    fetVar7.e0(1141649642);
                    if (nw1Var != null) {
                        boolean z = nw1Var instanceof mw1;
                        jm40 jm40Var = jm40.b;
                        if (z) {
                            fetVar7.e0(1141702682);
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, qmk.a(fetVar7).c, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            vw1 vw1Var = ((mw1) nw1Var).f22481a;
                            boolean zG = fetVar7.g(function1);
                            Object objP = fetVar7.P();
                            if (zG || objP == cl5Var) {
                                objP = new qr0(function1, (byte) 1);
                                fetVar7.o0(objP);
                            }
                            lv00.f(mm40VarN, vw1Var, (Function1) objP, fetVar7, 0);
                            fetVar7.r(false);
                        } else if (nw1Var instanceof lw1) {
                            fetVar7.e0(1142918316);
                            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarN2 = s5x0.N(s5x0.L(mm40VarD2, qmk.a(fetVar7).c, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            tw1 tw1Var = ((lw1) nw1Var).b;
                            boolean zG2 = fetVar7.g(function1) | fetVar7.g(nw1Var);
                            Object objP2 = fetVar7.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new g5(function1, nw1Var, (byte) 18);
                                fetVar7.o0(objP2);
                            }
                            lv00.f(mm40VarN2, tw1Var, (Function1) objP2, fetVar7, 0);
                            fetVar7.r(false);
                        }
                        fetVar7.r(false);
                    }
                    throw b1j.f(1422300729, fetVar7, false);
                }
                fetVar7.X();
                return Unit.f46060a;
            case 1:
                k8z k8zVar = (k8z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar8 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar8.g(k8zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar8.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar8.U(i2 & 1, (i2 & 147) != 146)) {
                    p6t0 p6t0Var = (p6t0) a4xVar.get(iIntValue3);
                    fetVar8.e0(422303772);
                    if (p6t0Var == null) {
                        fetVar = fetVar8;
                    } else {
                        boolean z2 = p6t0Var instanceof bws;
                        jm40 jm40Var2 = jm40.b;
                        if (z2) {
                            fetVar8.e0(422352751);
                            bws bwsVar = (bws) p6t0Var;
                            a2n a2nVar = bwsVar.f3341a;
                            if (a2nVar instanceof y56) {
                                fetVar8.e0(422376838);
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                y56 y56Var = (y56) a2nVar;
                                boolean z3 = bwsVar.b;
                                boolean zG3 = fetVar8.g(function1);
                                Object objP3 = fetVar8.P();
                                if (zG3 || objP3 == cl5Var) {
                                    objP3 = new qr0(function1, (byte) 7);
                                    fetVar8.o0(objP3);
                                }
                                vcc.i(mm40VarN3, y56Var, z3, (Function1) objP3, null, fetVar8, 0, 16);
                                fetVar2 = fetVar8;
                                fetVar2.r(false);
                            } else {
                                fetVar2 = fetVar8;
                                if (a2nVar instanceof c2o0) {
                                    fetVar2.e0(423031682);
                                    zcl zclVar4 = qmk.f28987a;
                                    mm40 mm40VarN4 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                    c2o0 c2o0Var = (c2o0) a2nVar;
                                    boolean z4 = bwsVar.b;
                                    boolean zG4 = fetVar2.g(function1);
                                    Object objP4 = fetVar2.P();
                                    if (zG4 || objP4 == cl5Var) {
                                        objP4 = new qr0(function1, (byte) 8);
                                        fetVar2.o0(objP4);
                                    }
                                    hkb.n(mm40VarN4, c2o0Var, z4, (Function1) objP4, null, fetVar2, 0, 16);
                                    fetVar2.r(false);
                                } else if (a2nVar instanceof nla) {
                                    fetVar2.e0(423689657);
                                    zcl zclVar5 = qmk.f28987a;
                                    mm40 mm40VarN5 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                    nla nlaVar = (nla) a2nVar;
                                    boolean z5 = bwsVar.b;
                                    boolean zG5 = fetVar2.g(function1);
                                    Object objP5 = fetVar2.P();
                                    if (zG5 || objP5 == cl5Var) {
                                        objP5 = new qr0(function1, (byte) 9);
                                        fetVar2.o0(objP5);
                                    }
                                    rcb.C(mm40VarN5, nlaVar, z5, (Function1) objP5, fetVar2, 0);
                                    fetVar = fetVar2;
                                    fetVar.r(false);
                                } else {
                                    fetVar = fetVar2;
                                    fetVar.e0(424310308);
                                    fetVar.r(false);
                                }
                                fetVar.r(false);
                            }
                            fetVar = fetVar2;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar8;
                            if (p6t0Var instanceof hsv) {
                                fetVar.e0(424384460);
                                nkb.h(s5x0.L(jm40Var2, xfn.a(fetVar).e - xfn.a(fetVar).d, 0.0f, 2), ((hsv) p6t0Var).b, kjm.f18392a, null, null, null, fetVar, 384, 56);
                                fetVar.r(false);
                            } else if (p6t0Var instanceof xfe0) {
                                fetVar.e0(424834487);
                                zcl zclVar6 = qmk.f28987a;
                                jcb.l(s5x0.L(jm40Var2, 0.0f, 8.0f, 1), ((xfe0) p6t0Var).f40787a, true, null, fetVar, 384, 8);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(425110852);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 2:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar9 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar9.g(g9zVar2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar9.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar9.U(i3 & 1, (i3 & 147) != 146)) {
                    p6t0 p6t0Var2 = (p6t0) a4xVar.get(iIntValue5);
                    fetVar9.e0(939245385);
                    if (p6t0Var2 == null) {
                        fetVar3 = fetVar9;
                    } else {
                        boolean z6 = p6t0Var2 instanceof vnp0;
                        jm40 jm40Var3 = jm40.b;
                        if (z6) {
                            fetVar9.e0(939260357);
                            zcl zclVar7 = qmk.f28987a;
                            mm40 mm40VarN6 = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            zrm zrmVar = ((vnp0) p6t0Var2).b;
                            boolean zG6 = fetVar9.g(function1) | fetVar9.g(p6t0Var2);
                            Object objP6 = fetVar9.P();
                            if (zG6 || objP6 == cl5Var) {
                                objP6 = new z7(function1, p6t0Var2, (byte) 2);
                                fetVar9.o0(objP6);
                            }
                            Function0 function0 = (Function0) objP6;
                            boolean zG7 = fetVar9.g(function1) | fetVar9.g(p6t0Var2);
                            Object objP7 = fetVar9.P();
                            if (zG7 || objP7 == cl5Var) {
                                objP7 = new bi2(function1, p6t0Var2, (byte) 0);
                                fetVar9.o0(objP7);
                            }
                            agc.r(mm40VarN6, zrmVar, function0, null, null, (Function1) objP7, null, fetVar9, 0, 88);
                            fetVar3 = fetVar9;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar9;
                            if (p6t0Var2 instanceof kep0) {
                                fetVar3.e0(940154273);
                                kep0 kep0Var = (kep0) p6t0Var2;
                                nkb.h(s5x0.L(jm40Var3, xfn.a(fetVar3).e - xfn.a(fetVar3).d, 0.0f, 2), kep0Var.c, kep0Var.b, null, null, null, fetVar3, 0, 56);
                                fetVar3.r(false);
                            } else if (p6t0Var2 instanceof wjp0) {
                                fetVar3.e0(940571316);
                                zcl zclVar8 = qmk.f28987a;
                                mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 66.0f);
                                zcl zclVar9 = qmk.i;
                                ugg0 ugg0Var = vgg0.f37379a;
                                h97.s(h97.e(zclVar9, zclVar9, zclVar9, zclVar9, mm40VarE), vbc.d0(null, fetVar3, 0, 1), fetVar3, false);
                            } else if (p6t0Var2 instanceof du) {
                                fetVar3.e0(941126030);
                                zcl zclVar10 = qmk.f28987a;
                                mm40 mm40VarN7 = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                kjl kjlVar = ((du) p6t0Var2).f6676a;
                                boolean zG8 = fetVar3.g(function1);
                                Object objP8 = fetVar3.P();
                                if (zG8 || objP8 == cl5Var) {
                                    objP8 = new rr0(function1, (byte) 8);
                                    fetVar3.o0(objP8);
                                }
                                ieb.m(mm40VarN7, kjlVar, (Function0) objP8, fetVar3, 0, 0);
                                fetVar3.r(false);
                            } else if (p6t0Var2 instanceof thp0) {
                                fetVar3.e0(941604081);
                                zcl zclVar11 = qmk.f28987a;
                                jcb.l(s5x0.L(jm40Var3, 0.0f, 8.0f, 1), ((thp0) p6t0Var2).f33973a, true, null, fetVar3, 384, 8);
                                fetVar3.r(false);
                            }
                        }
                        fetVar3.r(false);
                    }
                    fetVar3.e0(941940989);
                    fetVar3.r(false);
                    fetVar3.r(false);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 3:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                fet fetVar10 = (fet) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (fetVar10.g(g9zVar3) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= fetVar10.e(iIntValue7) ? 32 : 16;
                }
                if (fetVar10.U(i4 & 1, (i4 & 147) != 146)) {
                    p6t0 p6t0Var3 = (p6t0) a4xVar.get(iIntValue7);
                    fetVar10.e0(2075656555);
                    if (p6t0Var3 == null) {
                        fetVar4 = fetVar10;
                    } else {
                        boolean z7 = p6t0Var3 instanceof o8s0;
                        jm40 jm40Var4 = jm40.b;
                        if (z7) {
                            fetVar10.e0(2075687182);
                            zcl zclVar12 = qmk.f28987a;
                            mm40 mm40VarN8 = s5x0.N(jm40Var4, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            zrm zrmVar2 = ((o8s0) p6t0Var3).b;
                            boolean zG9 = fetVar10.g(function1) | fetVar10.g(p6t0Var3);
                            Object objP9 = fetVar10.P();
                            if (zG9 || objP9 == cl5Var) {
                                objP9 = new z7(function1, p6t0Var3, (byte) 3);
                                fetVar10.o0(objP9);
                            }
                            Function0 function2 = (Function0) objP9;
                            boolean zG10 = fetVar10.g(function1) | fetVar10.g(p6t0Var3);
                            Object objP10 = fetVar10.P();
                            if (zG10 || objP10 == cl5Var) {
                                objP10 = new bi2(function1, p6t0Var3, (byte) 1);
                                fetVar10.o0(objP10);
                            }
                            agc.r(mm40VarN8, zrmVar2, function2, null, null, (Function1) objP10, null, fetVar10, 0, 88);
                            fetVar4 = fetVar10;
                            fetVar4.r(false);
                        } else {
                            fetVar4 = fetVar10;
                            if (p6t0Var3 instanceof q1s0) {
                                fetVar4.e0(2076695271);
                                nkb.h(jm40Var4, ((q1s0) p6t0Var3).f27970a, kjm.f18392a, null, null, null, fetVar4, 390, 56);
                                fetVar4.r(false);
                            } else if (p6t0Var3 instanceof n5s0) {
                                fetVar4.e0(2076988531);
                                zcl zclVar13 = qmk.f28987a;
                                mm40 mm40VarE2 = o7k0.e(o7k0.d(s5x0.N(jm40Var4, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 66.0f);
                                zcl zclVar14 = qmk.i;
                                ugg0 ugg0Var2 = vgg0.f37379a;
                                h97.s(h97.e(zclVar14, zclVar14, zclVar14, zclVar14, mm40VarE2), vbc.d0(null, fetVar4, 0, 1), fetVar4, false);
                            } else if (p6t0Var3 instanceof ou) {
                                fetVar4.e0(2077479385);
                                zcl zclVar15 = qmk.f28987a;
                                mm40 mm40VarN9 = s5x0.N(jm40Var4, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                kjl kjlVar2 = ((ou) p6t0Var3).f25852a;
                                boolean zG11 = fetVar4.g(function1);
                                Object objP11 = fetVar4.P();
                                if (zG11 || objP11 == cl5Var) {
                                    objP11 = new rr0(function1, (byte) 9);
                                    fetVar4.o0(objP11);
                                }
                                ieb.m(mm40VarN9, kjlVar2, (Function0) objP11, fetVar4, 0, 0);
                                fetVar4.r(false);
                            } else if (p6t0Var3 instanceof m4s0) {
                                fetVar4.e0(2077912424);
                                zcl zclVar16 = qmk.f28987a;
                                jcb.l(s5x0.L(jm40Var4, 0.0f, 8.0f, 1), ((m4s0) p6t0Var3).f21188a, true, null, fetVar4, 384, 8);
                                fetVar4.r(false);
                            }
                        }
                        fetVar4.r(false);
                    }
                    fetVar4.e0(2078188789);
                    fetVar4.r(false);
                    fetVar4.r(false);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 4:
                g9z g9zVar4 = (g9z) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                fet fetVar11 = (fet) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = (fetVar11.g(g9zVar4) ? 4 : 2) | iIntValue10;
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= fetVar11.e(iIntValue9) ? 32 : 16;
                }
                if (fetVar11.U(i5 & 1, (i5 & 147) != 146)) {
                    p6t0 p6t0Var4 = (p6t0) a4xVar.get(iIntValue9);
                    fetVar11.e0(1825333874);
                    if (p6t0Var4 == null) {
                        fetVar5 = fetVar11;
                    } else {
                        boolean z8 = p6t0Var4 instanceof o8s0;
                        jm40 jm40Var5 = jm40.b;
                        if (z8) {
                            fetVar11.e0(1825360254);
                            zcl zclVar17 = qmk.f28987a;
                            mm40 mm40VarN10 = s5x0.N(jm40Var5, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            zrm zrmVar3 = ((o8s0) p6t0Var4).b;
                            boolean zG12 = fetVar11.g(function1) | fetVar11.g(p6t0Var4);
                            Object objP12 = fetVar11.P();
                            if (zG12 || objP12 == cl5Var) {
                                objP12 = new z7(function1, p6t0Var4, (byte) 4);
                                fetVar11.o0(objP12);
                            }
                            Function0 function3 = (Function0) objP12;
                            boolean zG13 = fetVar11.g(function1) | fetVar11.g(p6t0Var4);
                            Object objP13 = fetVar11.P();
                            if (zG13 || objP13 == cl5Var) {
                                objP13 = new bi2(function1, p6t0Var4, (byte) 2);
                                fetVar11.o0(objP13);
                            }
                            agc.r(mm40VarN10, zrmVar3, function3, null, null, (Function1) objP13, null, fetVar11, 0, 88);
                            fetVar5 = fetVar11;
                            fetVar5.r(false);
                        } else {
                            fetVar5 = fetVar11;
                            if (p6t0Var4 instanceof q1s0) {
                                fetVar5.e0(1826373613);
                                nkb.h(s5x0.L(jm40Var5, xfn.a(fetVar5).e - xfn.a(fetVar5).d, 0.0f, 2), ((q1s0) p6t0Var4).f27970a, kjm.f18392a, null, null, null, fetVar5, 384, 56);
                                fetVar5.r(false);
                            } else if (p6t0Var4 instanceof n5s0) {
                                fetVar5.e0(1826829220);
                                zcl zclVar18 = qmk.f28987a;
                                mm40 mm40VarE3 = o7k0.e(o7k0.d(s5x0.N(jm40Var5, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 66.0f);
                                zcl zclVar19 = qmk.i;
                                ugg0 ugg0Var3 = vgg0.f37379a;
                                h97.s(h97.e(zclVar19, zclVar19, zclVar19, zclVar19, mm40VarE3), vbc.d0(null, fetVar5, 0, 1), fetVar5, false);
                            } else if (p6t0Var4 instanceof ou) {
                                fetVar5.e0(1827288361);
                                zcl zclVar20 = qmk.f28987a;
                                mm40 mm40VarN11 = s5x0.N(jm40Var5, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                kjl kjlVar3 = ((ou) p6t0Var4).f25852a;
                                boolean zG14 = fetVar5.g(function1);
                                Object objP14 = fetVar5.P();
                                if (zG14 || objP14 == cl5Var) {
                                    objP14 = new rr0(function1, (byte) 10);
                                    fetVar5.o0(objP14);
                                }
                                ieb.m(mm40VarN11, kjlVar3, (Function0) objP14, fetVar5, 0, 0);
                                fetVar5.r(false);
                            } else if (p6t0Var4 instanceof m4s0) {
                                fetVar5.e0(1827721400);
                                zcl zclVar21 = qmk.f28987a;
                                jcb.l(s5x0.L(jm40Var5, 0.0f, 8.0f, 1), ((m4s0) p6t0Var4).f21188a, true, null, fetVar5, 384, 8);
                                fetVar5.r(false);
                            }
                        }
                        fetVar5.r(false);
                    }
                    fetVar5.e0(1827997765);
                    fetVar5.r(false);
                    fetVar5.r(false);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 5:
                g9z g9zVar5 = (g9z) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                fet fetVar12 = (fet) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = iIntValue12 | (fetVar12.g(g9zVar5) ? 4 : 2);
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= fetVar12.e(iIntValue11) ? 32 : 16;
                }
                if (fetVar12.U(i6 & 1, (i6 & 147) != 146)) {
                    p6t0 p6t0Var5 = (p6t0) a4xVar.get(iIntValue11);
                    fetVar12.e0(-1535437389);
                    if (p6t0Var5 == null) {
                        fetVar6 = fetVar12;
                    } else {
                        boolean z9 = p6t0Var5 instanceof vnp0;
                        jm40 jm40Var6 = jm40.b;
                        if (z9) {
                            fetVar12.e0(-1535411412);
                            zcl zclVar22 = qmk.f28987a;
                            mm40 mm40VarN12 = s5x0.N(jm40Var6, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                            zrm zrmVar4 = ((vnp0) p6t0Var5).b;
                            boolean zG15 = fetVar12.g(function1) | fetVar12.g(p6t0Var5);
                            Object objP15 = fetVar12.P();
                            if (zG15 || objP15 == cl5Var) {
                                objP15 = new z7(function1, p6t0Var5, (byte) 8);
                                fetVar12.o0(objP15);
                            }
                            Function0 function4 = (Function0) objP15;
                            boolean zG16 = fetVar12.g(function1) | fetVar12.g(p6t0Var5);
                            Object objP16 = fetVar12.P();
                            if (zG16 || objP16 == cl5Var) {
                                objP16 = new bi2(function1, p6t0Var5, (byte) 4);
                                fetVar12.o0(objP16);
                            }
                            agc.r(mm40VarN12, zrmVar4, function4, null, null, (Function1) objP16, null, fetVar12, 0, 88);
                            fetVar6 = fetVar12;
                            fetVar6.r(false);
                        } else {
                            fetVar6 = fetVar12;
                            if (p6t0Var5 instanceof kep0) {
                                fetVar6.e0(-1534607241);
                                nkb.h(jm40Var6, ((kep0) p6t0Var5).c, kjm.f18392a, null, null, null, fetVar6, 390, 56);
                                fetVar6.r(false);
                            } else if (p6t0Var5 instanceof wjp0) {
                                fetVar6.e0(-1534319933);
                                zcl zclVar23 = qmk.f28987a;
                                mm40 mm40VarE4 = o7k0.e(o7k0.d(s5x0.N(jm40Var6, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 66.0f);
                                zcl zclVar24 = qmk.i;
                                ugg0 ugg0Var4 = vgg0.f37379a;
                                h97.s(h97.e(zclVar24, zclVar24, zclVar24, zclVar24, mm40VarE4), vbc.d0(null, fetVar6, 0, 1), fetVar6, false);
                            } else if (p6t0Var5 instanceof du) {
                                fetVar6.e0(-1533835403);
                                zcl zclVar25 = qmk.f28987a;
                                mm40 mm40VarN13 = s5x0.N(jm40Var6, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                                kjl kjlVar4 = ((du) p6t0Var5).f6676a;
                                boolean zG17 = fetVar6.g(function1);
                                Object objP17 = fetVar6.P();
                                if (zG17 || objP17 == cl5Var) {
                                    objP17 = new rr0(function1, (byte) 11);
                                    fetVar6.o0(objP17);
                                }
                                ieb.m(mm40VarN13, kjlVar4, (Function0) objP17, fetVar6, 0, 0);
                                fetVar6.r(false);
                            } else if (p6t0Var5 instanceof thp0) {
                                fetVar6.e0(-1533419848);
                                zcl zclVar26 = qmk.f28987a;
                                jcb.l(s5x0.L(jm40Var6, 0.0f, 8.0f, 1), ((thp0) p6t0Var5).f33973a, true, null, fetVar6, 384, 8);
                                fetVar6.r(false);
                            }
                        }
                        fetVar6.r(false);
                    }
                    fetVar6.e0(-1533143483);
                    fetVar6.r(false);
                    fetVar6.r(false);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 6:
                g9z g9zVar6 = (g9z) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                fet fetVar13 = (fet) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i7 = iIntValue14 | (fetVar13.g(g9zVar6) ? 4 : 2);
                } else {
                    i7 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i7 |= fetVar13.e(iIntValue13) ? 32 : 16;
                }
                if (fetVar13.U(i7 & 1, (i7 & 147) != 146)) {
                    p6t0 p6t0Var6 = (p6t0) a4xVar.get(iIntValue13);
                    fetVar13.e0(-595571771);
                    if (p6t0Var6 == null) {
                        fetVar13.e0(-595017275);
                        fetVar13.r(false);
                    } else if (p6t0Var6 instanceof t84) {
                        fetVar13.e0(-1404683627);
                        qjj.d(0, fetVar13);
                        fetVar13.r(false);
                    } else if (p6t0Var6 instanceof ao4) {
                        fetVar13.e0(-1404680926);
                        vbw0.e(null, (ao4) p6t0Var6, function1, fetVar13, 0);
                        fetVar13.r(false);
                    } else if (p6t0Var6 instanceof s44) {
                        fetVar13.e0(-1404674699);
                        zcl zclVar27 = qmk.f28987a;
                        unh0.d(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), (s44) p6t0Var6, function1, fetVar13, 0);
                        fetVar13.r(false);
                    } else {
                        fetVar13.e0(-595017275);
                        fetVar13.r(false);
                    }
                    fetVar13.r(false);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 7:
                g9z g9zVar7 = (g9z) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                fet fetVar14 = (fet) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i8 = iIntValue16 | (fetVar14.g(g9zVar7) ? 4 : 2);
                } else {
                    i8 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i8 |= fetVar14.e(iIntValue15) ? 32 : 16;
                }
                if (fetVar14.U(i8 & 1, (i8 & 147) != 146)) {
                    fxf fxfVar = (fxf) a4xVar.get(iIntValue15);
                    fetVar14.e0(-1707769311);
                    ay3.n(fxfVar, function1, fetVar14, 8);
                    fetVar14.r(false);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 8:
                return a(obj, obj2, obj3, obj4);
            case 9:
                g9z g9zVar8 = (g9z) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                fet fetVar15 = (fet) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i9 = iIntValue18 | (fetVar15.g(g9zVar8) ? 4 : 2);
                } else {
                    i9 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i9 |= fetVar15.e(iIntValue17) ? 32 : 16;
                }
                if (fetVar15.U(i9 & 1, (i9 & 147) != 146)) {
                    aed aedVar = (aed) a4xVar.get(iIntValue17);
                    fetVar15.e0(-1327274306);
                    if (aedVar instanceof ydd) {
                        lim0Var = ((ydd) aedVar).f42429a;
                    } else {
                        aql0 aql0Var = aql0.f1302a;
                        lim0Var = new lim0();
                    }
                    mim0 mim0Var = lim0Var;
                    zcl zclVar28 = qmk.f28987a;
                    mm40 mm40VarN14 = s5x0.N(jm40.b, xfn.a(fetVar15).d, 12.0f, xfn.a(fetVar15).d, 0.0f, 8);
                    boolean zG18 = fetVar15.g(function1) | fetVar15.g(aedVar);
                    Object objP18 = fetVar15.P();
                    if (zG18 || objP18 == cl5Var) {
                        objP18 = new at7(function1, aedVar, (byte) 23);
                        fetVar15.o0(objP18);
                    }
                    lgb.n(mm40VarN14, mim0Var, true, (Function1) objP18, fetVar15, 0);
                    fetVar15.r(false);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 10:
                return b(obj, obj2, obj3, obj4);
            case 11:
                return c(obj, obj2, obj3, obj4);
            case 12:
                return g(obj, obj2, obj3, obj4);
            case 13:
                return h(obj, obj2, obj3, obj4);
            case 14:
                return i(obj, obj2, obj3, obj4);
            case 15:
                return l(obj, obj2, obj3, obj4);
            case 16:
                return m(obj, obj2, obj3, obj4);
            case 17:
                return o(obj, obj2, obj3, obj4);
            case 18:
                return p(obj, obj2, obj3, obj4);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return r(obj, obj2, obj3, obj4);
            case 20:
                return s(obj, obj2, obj3, obj4);
            case 21:
                return t(obj, obj2, obj3, obj4);
            case 22:
                return u(obj, obj2, obj3, obj4);
            case 23:
                return v(obj, obj2, obj3, obj4);
            case 24:
                return w(obj, obj2, obj3, obj4);
            default:
                g9z g9zVar9 = (g9z) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                fet fetVar16 = (fet) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i10 = iIntValue20 | (fetVar16.g(g9zVar9) ? 4 : 2);
                } else {
                    i10 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i10 |= fetVar16.e(iIntValue19) ? 32 : 16;
                }
                if (fetVar16.U(i10 & 1, (i10 & 147) != 146)) {
                    s7u0 s7u0Var = (s7u0) a4xVar.get(iIntValue19);
                    fetVar16.e0(-1247645296);
                    boolean zG19 = fetVar16.g(function1);
                    Object objP19 = fetVar16.P();
                    if (zG19 || objP19 == cl5Var) {
                        objP19 = new dpl0(function1, (byte) 14);
                        fetVar16.o0(objP19);
                    }
                    qsm0.o(s7u0Var, (Function1) objP19, fetVar16, 0);
                    fetVar16.r(false);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ws1(a4x a4xVar, Function1 function1, byte b) {
        this.f39672a = b;
        this.b = a4xVar;
        this.c = function1;
    }
}
