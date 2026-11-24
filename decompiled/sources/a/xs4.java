package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xs4 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41397a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ xs4(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f41397a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        byte b = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.h(zBooleanValue) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            zsv zsvVar = ((rfj0) this.b.getValue()).b;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new e0(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new e0(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean zG3 = fetVar.g(function1);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == cl5Var) {
                objP3 = new e0(function1, (byte) 6);
                fetVar.o0(objP3);
            }
            qzb.J(zsvVar, function0, function2, (Function0) objP3, zBooleanValue, null, fetVar, (iIntValue << 12) & 57344);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            zsv zsvVar = ((rfj0) this.b.getValue()).b;
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new e0(function1, (byte) 7);
                fetVar.o0(objP);
            }
            qzb.w(zsvVar, (Function0) objP, mm40Var, fetVar, (iIntValue << 6) & 896);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (e860 e860Var : (Iterable) this.b.getValue()) {
                syl sylVar = syl.f33027a;
                jyl jylVar = new jyl(null, null, null, 127);
                lxl lxlVar = e860Var.b;
                Function1 function1 = this.c;
                boolean zG = fetVar.g(function1) | fetVar.g(e860Var);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new ys3(function1, e860Var, (byte) 20);
                    fetVar.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new ij4((byte) 8);
                    fetVar.o0(objP2);
                }
                zpm.a(lxlVar, sylVar, jylVar, function2, (Function1) objP2, fetVar, 25008);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (ydj ydjVar : (Iterable) this.b.getValue()) {
                syl sylVar = syl.f33027a;
                jyl jylVar = new jyl(null, null, null, 127);
                lxl lxlVar = ydjVar.b;
                Function1 function1 = this.c;
                boolean zG = fetVar.g(function1) | fetVar.g(ydjVar);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new ys3(function1, ydjVar, (byte) 21);
                    fetVar.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new ij4((byte) 7);
                    fetVar.o0(objP2);
                }
                zpm.a(lxlVar, sylVar, jylVar, function2, (Function1) objP2, fetVar, 25008);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            l7m0 l7m0Var = this.b;
            int iOrdinal = ((vuh) l7m0Var.getValue()).d().ordinal();
            Function1 function1 = this.c;
            if (iOrdinal == 0) {
                fetVar.e0(-1739403820);
                o050.o(ir8Var, l7m0Var, function1, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1913178756);
                kkb.i(ir8Var, l7m0Var, function1, fetVar, iIntValue & 14);
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-1739406213, fetVar, false);
                }
                fetVar.e0(1913354681);
                gkb.e(ir8Var, l7m0Var, function1, fetVar, iIntValue & 14);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            wvo wvoVar = (wvo) this.b.getValue();
            if (wvoVar != null) {
                if (wvoVar instanceof uvo) {
                    fetVar.e0(-1834961668);
                    xbc.A(0, fetVar);
                    fetVar.r(false);
                } else if (wvoVar instanceof tvo) {
                    fetVar.e0(-1834959039);
                    xbc.q(ir8Var.b(jm40.b, gqw0.e), ((tvo) wvoVar).b, this.c, fetVar, 0);
                    fetVar.r(false);
                } else if (wvoVar instanceof vvo) {
                    fetVar.e0(-1834950989);
                    xbc.C((vvo) wvoVar, fetVar, 8);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1834963685, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            l7m0 l7m0Var = this.b;
            ruq ruqVar = (ruq) l7m0Var.getValue();
            if (ruqVar != null) {
                if (ruqVar instanceof quq) {
                    fetVar.e0(-1556997490);
                    quq quqVar = (quq) ruqVar;
                    gq80.V(quqVar.d, quqVar.e, ((ruq) l7m0Var.getValue()).a(), fetVar, 0);
                    fetVar.r(false);
                } else if (ruqVar instanceof puq) {
                    fetVar.e0(-1556990018);
                    gq80.D(0, fetVar);
                    fetVar.r(false);
                } else if (ruqVar instanceof ouq) {
                    fetVar.e0(-1556987900);
                    gq80.w(ir8Var.b(jm40.b, gqw0.e), ((ouq) ruqVar).d, this.c, fetVar, 0);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1556999763, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            l7m0 l7m0Var = this.b;
            wbs wbsVar = (wbs) l7m0Var.getValue();
            if (wbsVar != null) {
                if (wbsVar instanceof ubs) {
                    fetVar.e0(-811379679);
                    jiq0.J(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = wbsVar instanceof tbs;
                    Function1 function1 = this.c;
                    if (z) {
                        fetVar.e0(-811377689);
                        jiq0.A(ir8Var.b(jm40.b, gqw0.e), ((tbs) wbsVar).d, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (wbsVar instanceof vbs) {
                        fetVar.e0(-811370288);
                        vbs vbsVar = (vbs) wbsVar;
                        boolean zA = ((wbs) l7m0Var.getValue()).a();
                        boolean zG = fetVar.g(function1);
                        Object objP = fetVar.P();
                        cl5 cl5Var = ukd.f35823a;
                        if (zG || objP == cl5Var) {
                            objP = new baq(function1, (byte) 12);
                            fetVar.o0(objP);
                        }
                        Function1 function2 = (Function1) objP;
                        boolean zG2 = fetVar.g(function1);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new baq(function1, (byte) 13);
                            fetVar.o0(objP2);
                        }
                        jiq0.c0(vbsVar, zA, function2, (Function1) objP2, fetVar, 0);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(-811381469, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            a4x a4xVar = (a4x) this.b.getValue();
            vxl vxlVar = vxl.f38204a;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(2.0f, 2.0f, 2.0f, 2.0f);
            tyl tylVar = tyl.c;
            syl sylVar = syl.b;
            pz40 pz40Var = s6t0.f31722a;
            jyl jylVar = new jyl(null, null, new y3d(s6t0.b().f33626a.getSecondary()));
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new dht(function1, (byte) 1);
                fetVar.o0(objP);
            }
            lcc.b(mm40VarD, a4xVar, vxlVar, tylVar, sylVar, jylVar, lh80Var, false, (Function1) objP, null, fetVar, 28038, 640);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            a4x a4xVar = (a4x) this.b.getValue();
            vxl vxlVar = vxl.f38204a;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(2.0f, 2.0f, 2.0f, 2.0f);
            tyl tylVar = tyl.c;
            syl sylVar = syl.b;
            jyl jylVar = new jyl(null, null, null);
            Function1 function1 = this.c;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new dht(function1, (byte) 0);
                fetVar.o0(objP);
            }
            lcc.b(mm40VarD, a4xVar, vxlVar, tylVar, sylVar, jylVar, lh80Var, false, (Function1) objP, null, fetVar, 28038, 640);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            l7m0 l7m0Var = this.b;
            ouv ouvVar = (ouv) l7m0Var.getValue();
            if (ouvVar != null) {
                if (ouvVar instanceof muv) {
                    fetVar.e0(1562915866);
                    hew0.t(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = ouvVar instanceof luv;
                    Function1 function1 = this.c;
                    if (z) {
                        fetVar.e0(1562917818);
                        hew0.k(((luv) ouvVar).b, function1, fetVar, 0);
                        fetVar.r(false);
                    } else if (ouvVar instanceof nuv) {
                        fetVar.e0(1562922901);
                        hew0.p((nuv) ouvVar, ((ouv) l7m0Var.getValue()).a(), function1, fetVar, 0);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(1562913770, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            gq80.B(hh80Var, this.b, this.c, fetVar, iIntValue & 14);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        float f;
        y5d y5dVar = (y5d) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        y5dVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            jje jjeVar = (jje) this.b.getValue();
            boolean z = jjeVar instanceof uie;
            jm40 jm40Var = jm40.b;
            Function1 function1 = this.c;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1644576925);
                Context context = (Context) fetVar.k(dy2.b);
                context.getClass();
                if (context.getResources().getBoolean(R.bool.isTablet)) {
                    zcl zclVar = qmk.f28987a;
                    f = 32.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 8.0f;
                }
                uie uieVar = (uie) jjeVar;
                t3r0 t3r0Var = uieVar.c;
                if (t3r0Var.f33284a.isEmpty()) {
                    fetVar.e0(1645232854);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1644688928);
                    pz40 pz40VarF = androidx.compose.runtime.e.f(t3r0Var, fetVar);
                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new dvd0(function1, (byte) 29);
                        fetVar.o0(objP);
                    }
                    idm0.f(mm40VarN, f, pz40VarF, (Function1) objP, fetVar, 0);
                    fetVar.r(false);
                }
                mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 4.0f, 5);
                cpm cpmVar = uieVar.b;
                boolean zG2 = fetVar.g(function1);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new a9g0(function1, (byte) 0);
                    fetVar.o0(objP2);
                }
                u1c.i(mm40VarN2, cpmVar, (Function1) objP2, fetVar, 0, 4);
                mm40 mm40VarN3 = s5x0.N(y5dVar.b(o7k0.d(jm40Var, 1.0f), true), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                bgx bgxVarW = v2n0.w(new j0w0[]{new yzv0(0.0f, 0.0f, ((ycl) ((hgk0) ((cwk) fetVar.k(jr00.b)).a()).getValue()).f42389a + 24.0f, 7), xzv0.f41773a}, fetVar);
                boolean zG3 = fetVar.g(jjeVar) | fetVar.g(function1);
                Object objP3 = fetVar.P();
                if (zG3 || objP3 == cl5Var) {
                    objP3 = new dff0(uieVar, function1, (byte) 15);
                    fetVar.o0(objP3);
                }
                b8k0.e(mm40VarN3, null, bgxVarW, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, 490);
                fetVar.r(false);
            } else if (Intrinsics.d(jjeVar, cje.f4456a)) {
                fetVar.e0(607364381);
                b5x.o(0, fetVar);
                fetVar.r(false);
            } else {
                if (!(jjeVar instanceof yie)) {
                    throw b1j.f(607238236, fetVar, false);
                }
                fetVar.e0(1648502889);
                n0q n0qVar = o7k0.c;
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                mdm mdmVar = ((yie) jjeVar).f42684a;
                boolean zG4 = fetVar.g(function1);
                Object objP4 = fetVar.P();
                if (zG4 || objP4 == cl5Var) {
                    objP4 = new pme0(function1, (byte) 20);
                    fetVar.o0(objP4);
                }
                jcb.l(jm40Var, mdmVar, false, (Function0) objP4, fetVar, 6, 4);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            l7m0 l7m0Var = this.b;
            if (((tli0) l7m0Var.getValue()).f34147a) {
                fetVar.e0(1774840653);
                i4w0.x(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(1774931328);
                mm40 mm40VarL = s5x0.L(s5x0.I(o7k0.c, hh80Var), xfn.a(fetVar).d, 0.0f, 2);
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                boolean zG = fetVar.g(l7m0Var);
                Function1 function1 = this.c;
                boolean zG2 = zG | fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG2 || objP == ukd.f35823a) {
                    objP = new ys4(l7m0Var, function1, (byte) 23);
                    fetVar.o0(objP);
                }
                b8k0.e(mm40VarL, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            l7m0 l7m0Var = this.b;
            sop0 sop0Var = (sop0) l7m0Var.getValue();
            if (sop0Var != null) {
                if (sop0Var instanceof rop0) {
                    fetVar.e0(-698518619);
                    ofm0.b(0, fetVar);
                    fetVar.r(false);
                } else if (sop0Var instanceof qop0) {
                    fetVar.e0(-698516351);
                    ofm0.a(((qop0) sop0Var).c, this.c, fetVar, 0);
                    fetVar.r(false);
                } else if (sop0Var instanceof pop0) {
                    fetVar.e0(-698513055);
                    ofm0.d((pop0) sop0Var, ((sop0) l7m0Var.getValue()).a(), fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-698521163, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2, Object obj3) {
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            l7m0 l7m0Var = this.b;
            if (((jkq0) l7m0Var.getValue()).f16683a) {
                fetVar.e0(1519808386);
                cjx.u(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(1519900084);
                mm40 mm40VarL = s5x0.L(s5x0.I(o7k0.c, hh80Var), xfn.a(fetVar).d, 0.0f, 2);
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                boolean zG = fetVar.g(l7m0Var);
                Function1 function1 = this.c;
                boolean zG2 = zG | fetVar.g(function1);
                Object objP = fetVar.P();
                if (zG2 || objP == ukd.f35823a) {
                    objP = new ys4(l7m0Var, function1, (byte) 25);
                    fetVar.o0(objP);
                }
                b8k0.e(mm40VarL, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            xbr0 xbr0Var = (xbr0) this.b.getValue();
            if (xbr0Var != null) {
                if (xbr0Var instanceof wbr0) {
                    fetVar.e0(-941104655);
                    dqm0.b(0, fetVar);
                    fetVar.r(false);
                } else if (xbr0Var instanceof vbr0) {
                    fetVar.e0(-941102163);
                    dqm0.a(((vbr0) xbr0Var).c, this.c, fetVar, 0);
                    fetVar.r(false);
                } else if (xbr0Var instanceof ubr0) {
                    fetVar.e0(-941098731);
                    dqm0.e((ubr0) xbr0Var, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-941107490, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object y(Object obj, Object obj2, Object obj3) {
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kcr0 kcr0Var = (kcr0) this.b.getValue();
            if (kcr0Var != null) {
                if (kcr0Var instanceof icr0) {
                    fetVar.e0(-389866660);
                    ju70.w(0, fetVar);
                    fetVar.r(false);
                } else if (kcr0Var instanceof hcr0) {
                    fetVar.e0(-389864174);
                    ju70.t(((hcr0) kcr0Var).b, this.c, fetVar, 0);
                    fetVar.r(false);
                } else if (kcr0Var instanceof jcr0) {
                    fetVar.e0(-389858006);
                    ju70.G((jcr0) kcr0Var, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-389869272, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    private final Object z(Object obj, Object obj2, Object obj3) {
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        final byte b = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        final byte b2 = 1;
        final byte b3 = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            l7m0 l7m0Var = this.b;
            f9v0 f9v0Var = (f9v0) l7m0Var.getValue();
            boolean z = f9v0Var.f9174a;
            th90 th90Var = f9v0Var.b;
            if (z) {
                fetVar.e0(1120136920);
                knx.C(0, fetVar);
            } else {
                fetVar.e0(364513842);
            }
            fetVar.r(false);
            if (th90Var.isEmpty()) {
                fetVar.e0(365836178);
                fetVar.r(false);
            } else {
                fetVar.e0(364608981);
                mm40 mm40VarL = s5x0.L(s5x0.I(wha0.a0(o7k0.c, wha0.T(fetVar), false, 14), hh80Var), xfn.a(fetVar).d, 0.0f, 2);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarL, 0.0f, 0.0f, 0.0f, 40.0f, 7);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
                hjm hjmVar = f9v0Var.c;
                kjm kjmVar = kjm.b;
                jm40 jm40Var = jm40.b;
                nkb.h(s5x0.L(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).e, 0.0f, 2), hjmVar, kjmVar, null, null, null, fetVar, 384, 56);
                fetVar.e0(152351930);
                for (final Map.Entry entry : th90Var.entrySet()) {
                    rqm rqmVar = (rqm) entry.getValue();
                    final Function1 function1 = this.c;
                    boolean zG = fetVar.g(function1) | fetVar.i(entry);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new Function0() { // from class: a.a9v0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b3;
                                Map.Entry entry2 = entry;
                                Function1 function2 = function1;
                                switch (b4) {
                                    case 0:
                                        function2.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                    case 1:
                                        function2.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                    default:
                                        function2.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean zG2 = fetVar.g(function1) | fetVar.i(entry);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new Function0() { // from class: a.a9v0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b2;
                                Map.Entry entry2 = entry;
                                Function1 function2 = function1;
                                switch (b4) {
                                    case 0:
                                        function2.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                    case 1:
                                        function2.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                    default:
                                        function2.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP2);
                    }
                    Function0 function2 = (Function0) objP2;
                    boolean zG3 = fetVar.g(function1) | fetVar.i(entry);
                    Object objP3 = fetVar.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new Function0() { // from class: a.a9v0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b;
                                Map.Entry entry2 = entry;
                                Function1 function3 = function1;
                                switch (b4) {
                                    case 0:
                                        function3.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                    case 1:
                                        function3.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                    default:
                                        function3.invoke(new n8v0(((Number) entry2.getKey()).intValue()));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP3);
                    }
                    Function0 function3 = (Function0) objP3;
                    fet fetVar2 = fetVar;
                    obc.q(jm40Var, rqmVar, false, null, function0, function2, function3, null, fetVar2, 6, 140);
                    fetVar = fetVar2;
                    l7m0Var = l7m0Var;
                    b = 2;
                }
                fetVar.r(false);
                knx.z(l7m0Var, fetVar, 0);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        yje yjeVar;
        l7m0 l7m0Var;
        l7m0 l7m0Var2;
        boolean z;
        l7m0 l7m0Var3;
        l7m0 l7m0Var4;
        fet fetVar2;
        byte b = this.f41397a;
        byte b2 = 22;
        pcy pcyVar = e7z.u1;
        Function1 function1 = this.c;
        l7m0 l7m0Var5 = this.b;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 4;
        byte b4 = 2;
        byte b5 = 1;
        switch (b) {
            case 0:
                fet fetVar3 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ahy.y(6, fetVar3, o7k0.c, l7m0Var5, function1);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar4 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (!fetVar4.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    fetVar4.X();
                } else if (((id8) l7m0Var5.getValue()).f14570a && !((id8) l7m0Var5.getValue()).b) {
                    fetVar4.e0(-370598060);
                    uc9.f(0, fetVar4, null);
                    fetVar4.r(false);
                } else if (!((id8) l7m0Var5.getValue()).c) {
                    fetVar4.e0(-370480043);
                    ohq0.l((id8) l7m0Var5.getValue(), function1, fetVar4, 0);
                    fetVar4.r(false);
                } else if (((id8) l7m0Var5.getValue()).c) {
                    fetVar4.e0(-370212885);
                    zx7 zx7Var = gqw0.e;
                    n0q n0qVar = o7k0.c;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, n0qVar);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                    id8 id8Var = (id8) l7m0Var5.getValue();
                    boolean zG = fetVar4.g(function1);
                    Object objP = fetVar4.P();
                    if (zG || objP == cl5Var) {
                        objP = new to6(function1, (byte) 26);
                        fetVar4.o0(objP);
                    }
                    jiq0.e(id8Var, (Function0) objP, fetVar4, 0);
                    fetVar4.r(true);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(-369799624);
                    fetVar4.r(false);
                }
                return Unit.f46060a;
            case 2:
                ljc ljcVar = jd8.n;
                hh80 hh80Var = (hh80) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar5.g(hh80Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l7m0 l7m0Var6 = this.b;
                    int i = ((wtz) l7m0Var6.getValue()).d;
                    boolean zG2 = fetVar5.g(l7m0Var6);
                    Object objP2 = fetVar5.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new ziw(l7m0Var6, (byte) 22);
                        fetVar5.o0(objP2);
                    }
                    kwj kwjVarB = zk80.b(i, (Function0) objP2, fetVar5, 0, 2);
                    Object objP3 = fetVar5.P();
                    if (objP3 == cl5Var) {
                        objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar5);
                        fetVar5.o0(objP3);
                    }
                    vne vneVar = (vne) objP3;
                    mm40 mm40VarI = s5x0.I(jm40Var, hh80Var);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarI);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                    int size = ((wtz) l7m0Var6.getValue()).g.size();
                    Function1 function2 = this.c;
                    if (size > 1) {
                        fetVar5.e0(1278549959);
                        mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar5.k(zaq0.b)).getBackgroundContent(), ljcVar);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarK = s5x0.K(mm40VarQ, xfn.a(fetVar5).d, 8.0f);
                        i4 i4Var = ((wtz) l7m0Var6.getValue()).g;
                        boolean zG3 = fetVar5.g(l7m0Var6);
                        Object objP4 = fetVar5.P();
                        if (zG3 || objP4 == cl5Var) {
                            objP4 = new ziw(l7m0Var6, (byte) 23);
                            fetVar5.o0(objP4);
                        }
                        Function0 function0 = (Function0) objP4;
                        boolean zG4 = fetVar5.g(l7m0Var6) | fetVar5.g(function2);
                        Object objP5 = fetVar5.P();
                        if (zG4 || objP5 == cl5Var) {
                            objP5 = new ys4(l7m0Var6, function2, (byte) 13);
                            fetVar5.o0(objP5);
                        }
                        ibc.o(mm40VarK, i4Var, gxh0.f12078a, false, function0, (Function1) objP5, fetVar5, 384, 8);
                        mbc.o(zfi0.f44303a, null, false, fetVar5, 6, 6);
                        fetVar = fetVar5;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar5;
                        fetVar.e0(1279330291);
                        fetVar.r(false);
                    }
                    q5x.e(kwjVarB, i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), null, null, 0, 0.0f, null, null, ((wtz) l7m0Var6.getValue()).e, null, null, null, null, u1c.M(-1003952784, new itz(l7m0Var6, function2, (byte) 0), fetVar), fetVar, 0, 24576, 16124);
                    fetVar.r(true);
                    if (((wtz) l7m0Var6.getValue()).j.e) {
                        fetVar.e0(974527063);
                        m2x.a(null, ((wtz) l7m0Var6.getValue()).j, function2, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(974677289);
                        fetVar.r(false);
                    }
                    Integer numValueOf = Integer.valueOf(((wtz) l7m0Var6.getValue()).d);
                    boolean zI = fetVar.i(vneVar) | fetVar.g(kwjVarB) | fetVar.g(l7m0Var6);
                    Object objP6 = fetVar.P();
                    if (zI || objP6 == cl5Var) {
                        yjeVar = null;
                        objP6 = new fyj(vneVar, kwjVarB, l7m0Var6, yjeVar, (byte) 1);
                        l7m0Var = l7m0Var6;
                        fetVar.o0(objP6);
                    } else {
                        yjeVar = null;
                        l7m0Var = l7m0Var6;
                    }
                    m0x0.t(fetVar, numValueOf, (Function2) objP6);
                    boolean zG5 = fetVar.g(kwjVarB) | fetVar.g(l7m0Var) | fetVar.g(function2);
                    Object objP7 = fetVar.P();
                    if (zG5 || objP7 == cl5Var) {
                        l7m0Var2 = l7m0Var;
                        objP7 = new ptz(kwjVarB, l7m0Var2, function2, yjeVar, (byte) 0);
                        fetVar.o0(objP7);
                    } else {
                        l7m0Var2 = l7m0Var;
                    }
                    m0x0.v(kwjVarB, function2, (Function2) objP7, fetVar);
                    if (((wtz) l7m0Var2.getValue()).c) {
                        fetVar.e0(-1908201983);
                        z = false;
                        oja0.E(0, fetVar);
                    } else {
                        z = false;
                        fetVar.e0(975288361);
                    }
                    fetVar.r(z);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 3:
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar6.g(hh80Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    l7m0 l7m0Var7 = this.b;
                    int i2 = ((jvz) l7m0Var7.getValue()).d;
                    boolean zG6 = fetVar6.g(l7m0Var7);
                    Object objP8 = fetVar6.P();
                    if (zG6 || objP8 == cl5Var) {
                        objP8 = new ziw(l7m0Var7, (byte) 24);
                        fetVar6.o0(objP8);
                    }
                    kwj kwjVarB2 = zk80.b(i2, (Function0) objP8, fetVar6, 0, 2);
                    Object objP9 = fetVar6.P();
                    if (objP9 == cl5Var) {
                        objP9 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar6);
                        fetVar6.o0(objP9);
                    }
                    vne vneVar2 = (vne) objP9;
                    if (((jvz) l7m0Var7.getValue()).c) {
                        fetVar6.e0(1046839873);
                        ffb0.x(0, fetVar6);
                    } else {
                        fetVar6.e0(-1907694615);
                    }
                    fetVar6.r(false);
                    mm40 mm40VarQ2 = i120.Q(s5x0.I(jm40Var, hh80Var2).e(o7k0.c), ((ThemeColors) fetVar6.k(zaq0.b)).getBackground(), jd8.n);
                    boolean z2 = ((jvz) l7m0Var7.getValue()).e;
                    Function1 function3 = this.c;
                    q5x.e(kwjVarB2, mm40VarQ2, null, null, 0, 0.0f, null, null, z2, null, null, null, null, u1c.M(609086266, new itz(l7m0Var7, function3, b5), fetVar6), fetVar6, 0, 24576, 16124);
                    Integer numValueOf2 = Integer.valueOf(((jvz) l7m0Var7.getValue()).d);
                    boolean zI2 = fetVar6.i(vneVar2) | fetVar6.g(kwjVarB2) | fetVar6.g(l7m0Var7);
                    Object objP10 = fetVar6.P();
                    yje yjeVar2 = null;
                    if (zI2 || objP10 == cl5Var) {
                        objP10 = new fyj(vneVar2, kwjVarB2, l7m0Var7, yjeVar2, (byte) 2);
                        fetVar6.o0(objP10);
                    }
                    m0x0.t(fetVar6, numValueOf2, (Function2) objP10);
                    boolean zG7 = fetVar6.g(kwjVarB2) | fetVar6.g(l7m0Var7) | fetVar6.g(function3);
                    Object objP11 = fetVar6.P();
                    if (zG7 || objP11 == cl5Var) {
                        objP11 = new ptz(kwjVarB2, l7m0Var7, function3, yjeVar2, (byte) 1);
                        fetVar6.o0(objP11);
                    }
                    m0x0.v(kwjVarB2, function3, (Function2) objP11, fetVar6);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 4:
                hh80 hh80Var3 = (hh80) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                hh80Var3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar7.g(hh80Var3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar7.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    l7m0 l7m0Var8 = this.b;
                    int i3 = ((xwz) l7m0Var8.getValue()).c;
                    boolean zG8 = fetVar7.g(l7m0Var8);
                    Object objP12 = fetVar7.P();
                    if (zG8 || objP12 == cl5Var) {
                        objP12 = new ziw(l7m0Var8, (byte) 26);
                        fetVar7.o0(objP12);
                    }
                    kwj kwjVarB3 = zk80.b(i3, (Function0) objP12, fetVar7, 0, 2);
                    Object objP13 = fetVar7.P();
                    if (objP13 == cl5Var) {
                        objP13 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar7);
                        fetVar7.o0(objP13);
                    }
                    vne vneVar3 = (vne) objP13;
                    if (((xwz) l7m0Var8.getValue()).d) {
                        fetVar7.e0(1739480573);
                        ro4.J(0, fetVar7);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(1739558011);
                        mm40 mm40VarQ3 = i120.Q(s5x0.I(jm40Var, hh80Var3).e(o7k0.c), ((ThemeColors) fetVar7.k(zaq0.b)).getBackground(), jd8.n);
                        boolean z3 = ((xwz) l7m0Var8.getValue()).e;
                        Function1 function4 = this.c;
                        yje yjeVar3 = null;
                        q5x.e(kwjVarB3, mm40VarQ3, null, null, 0, 0.0f, null, null, z3, null, null, null, null, u1c.M(-1339010048, new itz(l7m0Var8, function4, b4), fetVar7), fetVar7, 0, 24576, 16124);
                        Integer numValueOf3 = Integer.valueOf(((xwz) l7m0Var8.getValue()).c);
                        boolean zI3 = fetVar7.i(vneVar3) | fetVar7.g(kwjVarB3) | fetVar7.g(l7m0Var8);
                        Object objP14 = fetVar7.P();
                        if (zI3 || objP14 == cl5Var) {
                            fyj fyjVar = new fyj(vneVar3, kwjVarB3, l7m0Var8, yjeVar3, (byte) 3);
                            l7m0Var3 = l7m0Var8;
                            fetVar7.o0(fyjVar);
                            objP14 = fyjVar;
                        } else {
                            l7m0Var3 = l7m0Var8;
                        }
                        m0x0.t(fetVar7, numValueOf3, (Function2) objP14);
                        boolean zG9 = fetVar7.g(kwjVarB3) | fetVar7.g(l7m0Var3) | fetVar7.g(function4);
                        Object objP15 = fetVar7.P();
                        if (zG9 || objP15 == cl5Var) {
                            ptz ptzVar = new ptz(kwjVarB3, l7m0Var3, function4, yjeVar3, (byte) 2);
                            fetVar7.o0(ptzVar);
                            objP15 = ptzVar;
                        }
                        m0x0.v(kwjVarB3, function4, (Function2) objP15, fetVar7);
                        fetVar7.r(false);
                    }
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 5:
                ljc ljcVar2 = jd8.n;
                hh80 hh80Var4 = (hh80) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                hh80Var4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar8.g(hh80Var4) ? (byte) 4 : (byte) 2;
                }
                if (fetVar8.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    l7m0 l7m0Var9 = this.b;
                    int i4 = ((uyz) l7m0Var9.getValue()).d;
                    boolean zG10 = fetVar8.g(l7m0Var9);
                    Object objP16 = fetVar8.P();
                    if (zG10 || objP16 == cl5Var) {
                        objP16 = new ziw(l7m0Var9, (byte) 28);
                        fetVar8.o0(objP16);
                    }
                    kwj kwjVarB4 = zk80.b(i4, (Function0) objP16, fetVar8, 0, 2);
                    Object objP17 = fetVar8.P();
                    if (objP17 == cl5Var) {
                        objP17 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar8);
                        fetVar8.o0(objP17);
                    }
                    vne vneVar4 = (vne) objP17;
                    mm40 mm40VarI2 = s5x0.I(jm40Var, hh80Var4);
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar8, 0);
                    int iHashCode3 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM3 = fetVar8.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar8, mm40VarI2);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC2, gqw0.v);
                    int size2 = ((uyz) l7m0Var9.getValue()).g.size();
                    Function1 function5 = this.c;
                    if (size2 > 1) {
                        fetVar8.e0(-1318878770);
                        mm40 mm40VarQ4 = i120.Q(jm40Var, ((ThemeColors) fetVar8.k(zaq0.b)).getBackgroundContent(), ljcVar2);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarK2 = s5x0.K(mm40VarQ4, xfn.a(fetVar8).d, 8.0f);
                        i4 i4Var2 = ((uyz) l7m0Var9.getValue()).g;
                        l7m0Var4 = l7m0Var9;
                        boolean zG11 = fetVar8.g(l7m0Var4);
                        Object objP18 = fetVar8.P();
                        if (zG11 || objP18 == cl5Var) {
                            objP18 = new ziw(l7m0Var4, (byte) 29);
                            fetVar8.o0(objP18);
                        }
                        Function0 function6 = (Function0) objP18;
                        boolean zG12 = fetVar8.g(l7m0Var4) | fetVar8.g(function5);
                        Object objP19 = fetVar8.P();
                        if (zG12 || objP19 == cl5Var) {
                            objP19 = new ys4(l7m0Var4, function5, (byte) 16);
                            fetVar8.o0(objP19);
                        }
                        ibc.o(mm40VarK2, i4Var2, gxh0.f12078a, false, function6, (Function1) objP19, fetVar8, 384, 8);
                        mbc.o(zfi0.f44303a, null, false, fetVar8, 6, 6);
                        fetVar2 = fetVar8;
                        fetVar2.r(false);
                    } else {
                        l7m0Var4 = l7m0Var9;
                        fetVar2 = fetVar8;
                        fetVar2.e0(-1318099399);
                        fetVar2.r(false);
                    }
                    q5x.e(kwjVarB4, i120.Q(o7k0.c, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), ljcVar2), null, null, 0, 0.0f, null, null, ((uyz) l7m0Var4.getValue()).e, null, null, null, null, u1c.M(334250314, new itz(l7m0Var4, function5, (byte) 3), fetVar2), fetVar2, 0, 24576, 16124);
                    fetVar2.r(true);
                    Integer numValueOf4 = Integer.valueOf(((uyz) l7m0Var4.getValue()).d);
                    boolean zI4 = fetVar2.i(vneVar4) | fetVar2.g(kwjVarB4) | fetVar2.g(l7m0Var4);
                    Object objP20 = fetVar2.P();
                    yje yjeVar4 = null;
                    if (zI4 || objP20 == cl5Var) {
                        objP20 = new fyj(vneVar4, kwjVarB4, l7m0Var4, yjeVar4, (byte) 4);
                        fetVar2.o0(objP20);
                    }
                    m0x0.t(fetVar2, numValueOf4, (Function2) objP20);
                    boolean zG13 = fetVar2.g(kwjVarB4) | fetVar2.g(l7m0Var4) | fetVar2.g(function5);
                    Object objP21 = fetVar2.P();
                    if (zG13 || objP21 == cl5Var) {
                        objP21 = new ptz(kwjVarB4, l7m0Var4, function5, yjeVar4, (byte) 3);
                        fetVar2.o0(objP21);
                    }
                    m0x0.v(kwjVarB4, function5, (Function2) objP21, fetVar2);
                    if (((uyz) l7m0Var4.getValue()).c) {
                        fetVar2.e0(-1282484677);
                        x4d0.J(0, fetVar2);
                    } else {
                        fetVar2.e0(-1102311633);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 6:
                hh80 hh80Var5 = (hh80) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                hh80Var5.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar9.g(hh80Var5) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    l7m0 l7m0Var10 = this.b;
                    int i5 = ((h100) l7m0Var10.getValue()).d;
                    boolean zG14 = fetVar9.g(l7m0Var10);
                    Object objP22 = fetVar9.P();
                    if (zG14 || objP22 == cl5Var) {
                        objP22 = new x000(l7m0Var10, (byte) 1);
                        fetVar9.o0(objP22);
                    }
                    kwj kwjVarB5 = zk80.b(i5, (Function0) objP22, fetVar9, 0, 2);
                    Object objP23 = fetVar9.P();
                    if (objP23 == cl5Var) {
                        objP23 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar9);
                        fetVar9.o0(objP23);
                    }
                    vne vneVar5 = (vne) objP23;
                    if (((h100) l7m0Var10.getValue()).c) {
                        fetVar9.e0(308928417);
                        unh0.K(0, fetVar9);
                    } else {
                        fetVar9.e0(986854025);
                    }
                    fetVar9.r(false);
                    mm40 mm40VarQ5 = i120.Q(s5x0.I(jm40Var, hh80Var5).e(o7k0.c), ((ThemeColors) fetVar9.k(zaq0.b)).getBackground(), jd8.n);
                    boolean z4 = ((h100) l7m0Var10.getValue()).e;
                    Function1 function7 = this.c;
                    q5x.e(kwjVarB5, mm40VarQ5, null, null, 0, 0.0f, null, null, z4, null, null, null, null, u1c.M(-1769332582, new itz(l7m0Var10, function7, b3), fetVar9), fetVar9, 0, 24576, 16124);
                    Integer numValueOf5 = Integer.valueOf(((h100) l7m0Var10.getValue()).d);
                    boolean zI5 = fetVar9.i(vneVar5) | fetVar9.g(kwjVarB5) | fetVar9.g(l7m0Var10);
                    Object objP24 = fetVar9.P();
                    yje yjeVar5 = null;
                    if (zI5 || objP24 == cl5Var) {
                        objP24 = new fyj(vneVar5, kwjVarB5, l7m0Var10, yjeVar5, (byte) 5);
                        fetVar9.o0(objP24);
                    }
                    m0x0.t(fetVar9, numValueOf5, (Function2) objP24);
                    boolean zG15 = fetVar9.g(kwjVarB5) | fetVar9.g(l7m0Var10) | fetVar9.g(function7);
                    Object objP25 = fetVar9.P();
                    if (zG15 || objP25 == cl5Var) {
                        objP25 = new ptz(kwjVarB5, l7m0Var10, function7, yjeVar5, (byte) 4);
                        fetVar9.o0(objP25);
                    }
                    m0x0.v(kwjVarB5, function7, (Function2) objP25, fetVar9);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 7:
                hh80 hh80Var6 = (hh80) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                hh80Var6.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar10.g(hh80Var6) ? (byte) 4 : (byte) 2;
                }
                if (fetVar10.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    l7m0 l7m0Var11 = this.b;
                    int i6 = ((r400) l7m0Var11.getValue()).c;
                    boolean zG16 = fetVar10.g(l7m0Var11);
                    Object objP26 = fetVar10.P();
                    if (zG16 || objP26 == cl5Var) {
                        objP26 = new x000(l7m0Var11, (byte) 2);
                        fetVar10.o0(objP26);
                    }
                    kwj kwjVarB6 = zk80.b(i6, (Function0) objP26, fetVar10, 0, 2);
                    Object objP27 = fetVar10.P();
                    if (objP27 == cl5Var) {
                        objP27 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar10);
                        fetVar10.o0(objP27);
                    }
                    vne vneVar6 = (vne) objP27;
                    if (((r400) l7m0Var11.getValue()).d) {
                        fetVar10.e0(1712528839);
                        ccq0.C(0, fetVar10);
                        fetVar10.r(false);
                    } else {
                        fetVar10.e0(1712606246);
                        mm40 mm40VarQ6 = i120.Q(s5x0.I(jm40Var, hh80Var6).e(o7k0.c), ((ThemeColors) fetVar10.k(zaq0.b)).getBackground(), jd8.n);
                        boolean z5 = ((r400) l7m0Var11.getValue()).e;
                        Function1 function8 = this.c;
                        yje yjeVar6 = null;
                        q5x.e(kwjVarB6, mm40VarQ6, null, null, 0, 0.0f, null, null, z5, null, null, null, null, u1c.M(699840630, new itz(l7m0Var11, function8, (byte) 5), fetVar10), fetVar10, 0, 24576, 16124);
                        Integer numValueOf6 = Integer.valueOf(((r400) l7m0Var11.getValue()).c);
                        boolean zI6 = fetVar10.i(vneVar6) | fetVar10.g(kwjVarB6) | fetVar10.g(l7m0Var11);
                        Object objP28 = fetVar10.P();
                        if (zI6 || objP28 == cl5Var) {
                            fyj fyjVar2 = new fyj(vneVar6, kwjVarB6, l7m0Var11, yjeVar6, (byte) 6);
                            fetVar10.o0(fyjVar2);
                            objP28 = fyjVar2;
                        }
                        m0x0.t(fetVar10, numValueOf6, (Function2) objP28);
                        boolean zG17 = fetVar10.g(kwjVarB6) | fetVar10.g(l7m0Var11) | fetVar10.g(function8);
                        Object objP29 = fetVar10.P();
                        if (zG17 || objP29 == cl5Var) {
                            ptz ptzVar2 = new ptz(kwjVarB6, l7m0Var11, function8, yjeVar6, (byte) 5);
                            fetVar10.o0(ptzVar2);
                            objP29 = ptzVar2;
                        }
                        m0x0.v(kwjVarB6, function8, (Function2) objP29, fetVar10);
                        fetVar10.r(false);
                    }
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 8:
                fet fetVar11 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar11.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    n0q n0qVar2 = o7k0.c;
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ7 = i120.Q(n0qVar2, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM4 = fetVar11.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar11, mm40VarQ7);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC3, gqw0.v);
                    oc30 oc30Var = (oc30) l7m0Var5.getValue();
                    if (oc30Var != null) {
                        if (oc30Var instanceof mc30) {
                            fetVar11.e0(-213589930);
                            aad.p(0, fetVar11);
                            fetVar11.r(false);
                        } else if (oc30Var instanceof lc30) {
                            fetVar11.e0(-213587343);
                            aad.m(jr8.f16991a.b(jm40Var, gqw0.e), ((lc30) oc30Var).b, function1, fetVar11, 0);
                            fetVar11.r(false);
                        } else if (oc30Var instanceof nc30) {
                            fetVar11.e0(-213578961);
                            aad.r(l7m0Var5, function1, fetVar11, 0);
                            fetVar11.r(false);
                        }
                        fetVar11.r(true);
                    }
                    throw b1j.f(-213592459, fetVar11, false);
                }
                fetVar11.X();
                return Unit.f46060a;
            case 9:
                return t(obj, obj2, obj3);
            case 10:
                hh80 hh80Var7 = (hh80) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                hh80Var7.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar12.g(hh80Var7) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar12.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    fetVar12.X();
                } else if (((a9i0) l7m0Var5.getValue()).c) {
                    fetVar12.e0(1615624864);
                    f1t0.z(0, fetVar12);
                    fetVar12.r(false);
                } else {
                    fetVar12.e0(1615691359);
                    mm40 mm40VarL = s5x0.L(s5x0.I(o7k0.c, hh80Var7), xfn.a(fetVar12).d, 0.0f, 2);
                    zcl zclVar3 = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                    boolean zG18 = fetVar12.g(l7m0Var5) | fetVar12.g(function1);
                    Object objP30 = fetVar12.P();
                    if (zG18 || objP30 == cl5Var) {
                        objP30 = new ys4(l7m0Var5, function1, b2);
                        fetVar12.o0(objP30);
                    }
                    b8k0.e(mm40VarL, null, lh80VarU, null, null, null, false, null, (Function1) objP30, fetVar12, 0, 506);
                    fetVar12.r(false);
                }
                return Unit.f46060a;
            case 11:
                return u(obj, obj2, obj3);
            case 12:
                return v(obj, obj2, obj3);
            case 13:
                return w(obj, obj2, obj3);
            case 14:
                return x(obj, obj2, obj3);
            case 15:
                return y(obj, obj2, obj3);
            case 16:
                return z(obj, obj2, obj3);
            case 17:
                return a(obj, obj2, obj3);
            case 18:
                return b(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return c(obj, obj2, obj3);
            case 20:
                return g(obj, obj2, obj3);
            case 21:
                return h(obj, obj2, obj3);
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return l(obj, obj2, obj3);
            case 24:
                return m(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return o(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return p(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return r(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return s(obj, obj2, obj3);
            default:
                hh80 hh80Var8 = (hh80) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                hh80Var8.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar13.g(hh80Var8) ? (byte) 4 : (byte) 2;
                }
                if (fetVar13.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    wha0.v(hh80Var8, l7m0Var5, function1, fetVar13, iIntValue11 & 14);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
        }
    }
}
