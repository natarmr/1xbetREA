package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTab;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public abstract class bbo0 {
    public static final void a(mm40 mm40Var, final yx5 yx5Var, SpecialEventTabScreenParams specialEventTabScreenParams, ebo0 ebo0Var, final Function1 function1, final Function0 function0, final xdr xdrVar, fet fetVar, int i) {
        mm40 mm40Var2;
        SpecialEventTabScreenParams specialEventTabScreenParams2;
        Object obj;
        final ujd ujdVar;
        boolean z;
        boolean z2;
        mm40 mm40VarY;
        boolean z3;
        specialEventTabScreenParams.getClass();
        function1.getClass();
        function0.getClass();
        xdrVar.getClass();
        fetVar.g0(-38500555);
        int i2 = i | (fetVar.i(yx5Var) ? 32 : 16) | (fetVar.g(specialEventTabScreenParams) ? 256 : 128) | (fetVar.g(ebo0Var) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536) | (fetVar.i(xdrVar) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            Object[] objArr = new Object[0];
            boolean z4 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z4 || objP == obj2) {
                objP = new jfm0(specialEventTabScreenParams, (byte) 23);
                fetVar.o0(objP);
            }
            SpecialEventTabScreenParams specialEventTabScreenParams3 = (SpecialEventTabScreenParams) e9x.Q(objArr, (Function0) objP, fetVar, 0);
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                kxq kxqVarN0 = yx5Var.n0();
                ComponentCallbacks2 application = yx5Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(urk0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof urk0)) {
                        ze3Var = null;
                    }
                    urk0 urk0Var = (urk0) ze3Var;
                    if (urk0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(yx5Var);
                        LinkedHashMap linkedHashMap = xnk0.f41174a;
                        int i3 = specialEventTabScreenParams3.f46974a;
                        String strB = xnk0.b(i3, efx.v(yx5Var).f4046a);
                        Application application2 = kxqVarN0.getApplication();
                        application2.getClass();
                        cui cuiVarC = xnk0.c(application2, strB);
                        LinkedHashMap linkedHashMap2 = xbv0.f40619a;
                        String strB2 = xbv0.b(i3, efx.v(yx5Var).f4046a);
                        Application application3 = kxqVarN0.getApplication();
                        application3.getClass();
                        ozi oziVarC = xbv0.c(application3, strB2);
                        LinkedHashMap linkedHashMap3 = h3l.f12390a;
                        f3l f3lVar = (f3l) h3l.f12390a.get(h3l.a(i3, efx.v(yx5Var).f4046a));
                        if (f3lVar == null) {
                            jf4.n("Can't find feature provider!");
                            return;
                        }
                        LinkedHashMap linkedHashMap4 = tz00.f34782a;
                        rz00 rz00Var = (rz00) tz00.f34782a.get(tz00.a(i3, efx.v(yx5Var).f4046a));
                        if (rz00Var == null) {
                            jf4.n("Can't find feature provider!");
                            return;
                        }
                        LinkedHashMap linkedHashMap5 = ih9.f14769a;
                        gh9 gh9Var = (gh9) ih9.f14769a.get(ih9.a(i3, efx.v(yx5Var).f4046a));
                        if (gh9Var == null) {
                            jf4.n("Can't find feature provider!");
                            return;
                        }
                        LinkedHashMap linkedHashMap6 = xpk0.f41274a;
                        vpk0 vpk0Var = (vpk0) xpk0.f41274a.get(xpk0.a(i3, efx.v(yx5Var).f4046a));
                        if (vpk0Var == null) {
                            jf4.n("Can't find feature provider!");
                            return;
                        }
                        LinkedHashMap linkedHashMap7 = n8l0.f23096a;
                        Application application4 = kxqVarN0.getApplication();
                        application4.getClass();
                        lui luiVarC = n8l0.c(application4, n8l0.b(i3, efx.v(yx5Var).f4046a, specialEventTabScreenParams3.c.f46973a), "SPORT_FILTER_IDS_KEY_V2", i3);
                        i1w0VarF.getClass();
                        oar0 oar0Var = urk0Var.N;
                        m6m0 m6m0Var = urk0Var.M;
                        cad cadVar = urk0Var.f36168a;
                        iw20 iw20Var = urk0Var.g;
                        ctf0 ctf0Var = urk0Var.b;
                        m1e m1eVar = urk0Var.c;
                        duj dujVar = urk0Var.d;
                        iip iipVar = urk0Var.e;
                        itr itrVar = urk0Var.f;
                        gii0 gii0Var = urk0Var.h;
                        knf0 knf0Var = urk0Var.i;
                        j1q0 j1q0Var = urk0Var.j;
                        xr xrVar = urk0Var.m;
                        gst0 gst0Var = urk0Var.k;
                        aqp0 aqp0Var = urk0Var.l;
                        nv20 nv20Var = urk0Var.n;
                        uzc0 uzc0Var = urk0Var.o;
                        y78 y78Var = urk0Var.p;
                        zfo zfoVar = urk0Var.q;
                        zx10 zx10Var = urk0Var.r;
                        edo edoVar = urk0Var.s;
                        yo4 yo4Var = urk0Var.t;
                        d1p d1pVar = urk0Var.u;
                        sjl0 sjl0Var = urk0Var.v;
                        roi0 roi0Var = urk0Var.w;
                        igm0 igm0Var = urk0Var.x;
                        ugf0 ugf0Var = urk0Var.y;
                        ygm0 ygm0Var = urk0Var.z;
                        wdk0 wdk0Var = urk0Var.A;
                        xri xriVar = urk0Var.B;
                        pyg pygVar = urk0Var.C;
                        iuu iuuVar = urk0Var.D;
                        grj grjVar = urk0Var.E;
                        jlx jlxVar = urk0Var.F;
                        pyg0 pyg0Var = urk0Var.G;
                        qyg0 qyg0Var = urk0Var.H;
                        g9m0 g9m0Var = urk0Var.I;
                        wiu wiuVar = urk0Var.J;
                        bzt bztVar = urk0Var.K;
                        r9u r9uVar = urk0Var.L;
                        iipVar.getClass();
                        itrVar.getClass();
                        d1pVar.getClass();
                        xriVar.getClass();
                        pygVar.getClass();
                        oar0Var.getClass();
                        ctf0Var.getClass();
                        m1eVar.getClass();
                        gii0Var.getClass();
                        knf0Var.getClass();
                        j1q0Var.getClass();
                        gst0Var.getClass();
                        aqp0Var.getClass();
                        zfoVar.getClass();
                        edoVar.getClass();
                        sjl0Var.getClass();
                        igm0Var.getClass();
                        ygm0Var.getClass();
                        wdk0Var.getClass();
                        r9uVar.getClass();
                        objP2 = new iui(cadVar, itrVar, iipVar, iw20Var, nv20Var, zx10Var, d1pVar, roi0Var, cuiVarC, ugf0Var, oziVarC, f3lVar, rz00Var, gh9Var, xriVar, pygVar, vpk0Var, luiVarC, oar0Var, m6m0Var, specialEventTabScreenParams3, xrVar, ctf0Var, i1w0VarF, m1eVar, dujVar, gii0Var, knf0Var, aqp0Var, uzc0Var, y78Var, yo4Var, igm0Var, ygm0Var, iuuVar, grjVar, jlxVar, pyg0Var, qyg0Var, g9m0Var, wiuVar, bztVar, r9uVar);
                        specialEventTabScreenParams2 = specialEventTabScreenParams3;
                        fetVar.o0(objP2);
                    }
                }
                jf4.n(b1j.i(urk0.class, "Cannot create dependency "));
                return;
            }
            specialEventTabScreenParams2 = specialEventTabScreenParams3;
            iui iuiVar = (iui) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj2) {
                objP3 = iuiVar.K.d();
                x1x.x(objP3);
                fetVar.o0(objP3);
            }
            ujd ujdVar2 = (ujd) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj2) {
                ozi oziVar = iuiVar.y;
                e720 e720VarZ = ((ali) oziVar.p.f25567a).z();
                vq vqVarW = oziVar.i.w();
                x1x.x(vqVarW);
                Object dcv0Var = new dcv0(e720VarZ, vqVarW, oziVar.q);
                fetVar.o0(dcv0Var);
                objP4 = dcv0Var;
            }
            final dcv0 dcv0Var2 = (dcv0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj2) {
                objP5 = ((g45) iuiVar.L.f45137a).K();
                fetVar.o0(objP5);
            }
            final oll0 oll0Var = (oll0) objP5;
            sgy sgyVarB = sre0.f32672a.b(iwk0.class);
            String str = specialEventTabScreenParams2.c.f46973a;
            q0h0 q0h0Var = new q0h0((hui) iuiVar.d0.get());
            int i4 = iwk0.X0;
            final i3t0 i3t0Var = (i3t0) n4c.X(sgyVarB, str, q0h0Var, fetVar, 12);
            pz40 pz40VarY = i3t0Var.y(fetVar);
            Object objP6 = fetVar.P();
            if (objP6 == obj2) {
                objP6 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP6);
            }
            vne vneVar = (vne) objP6;
            int i5 = i2 & 112;
            boolean zI = ((i2 & 458752) == 131072) | (i5 == 32 || fetVar.i(yx5Var)) | fetVar.i(ujdVar2) | fetVar.i(oll0Var) | fetVar.i(dcv0Var2) | ((i2 & 3670016) == 1048576) | ((i2 & 57344) == 16384) | fetVar.i(i3t0Var);
            Object objP7 = fetVar.P();
            if (zI || objP7 == obj2) {
                ujdVar = ujdVar2;
                obj = new Function1() { // from class: a.xao0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        zuk0 zuk0Var = (zuk0) obj3;
                        zuk0Var.getClass();
                        boolean z5 = zuk0Var instanceof wuk0;
                        yx5 yx5Var2 = yx5Var;
                        if (z5) {
                            ujdVar.b(yx5Var2, ((wuk0) zuk0Var).f39795a);
                        } else if (zuk0Var instanceof xuk0) {
                            oll0Var.a(yx5Var2, ((xuk0) zuk0Var).f41515a);
                        } else if (zuk0Var instanceof yuk0) {
                            dcv0Var2.a(yx5Var2, ((yuk0) zuk0Var).f43272a);
                        } else if (zuk0Var.equals(tuk0.f34555a)) {
                            function0.invoke();
                        } else if (zuk0Var instanceof uuk0) {
                            lik0 lik0Var = ((uuk0) zuk0Var).f36305a;
                            xdrVar.F(lik0Var.f20112a, lik0Var.d, lik0Var.c);
                        } else {
                            if (!zuk0Var.equals(vuk0.f38052a)) {
                                t9f.b();
                                return null;
                            }
                            function1.invoke(Boolean.TRUE);
                        }
                        i3t0Var.x(iqk0.f15214a);
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj);
            } else {
                obj = objP7;
                ujdVar = ujdVar2;
            }
            Function1 function2 = (Function1) obj;
            Unit unit = Unit.f46060a;
            boolean zI2 = fetVar.i(vneVar) | fetVar.i(i3t0Var) | fetVar.g(function2) | fetVar.g(null);
            Object objP8 = fetVar.P();
            if (zI2 || objP8 == obj2) {
                objP8 = new abo0(vneVar, i3t0Var, function2, (byte) 0);
                fetVar.o0(objP8);
            }
            m0x0.o(unit, (Function1) objP8, fetVar);
            boolean zI3 = fetVar.i(i3t0Var);
            Object objP9 = fetVar.P();
            if (zI3 || objP9 == obj2) {
                objP9 = new tmg0(i3t0Var, null, (byte) 27);
                fetVar.o0(objP9);
            }
            m0x0.t(fetVar, unit, (Function2) objP9);
            boolean zG = (i5 == 32 || fetVar.i(yx5Var)) | fetVar.g(specialEventTabScreenParams2) | fetVar.i(ujdVar) | fetVar.i(dcv0Var2) | fetVar.i(i3t0Var);
            Object objP10 = fetVar.P();
            if (zG || objP10 == obj2) {
                Object dgVar = new dg(yx5Var, specialEventTabScreenParams2, ujdVar, dcv0Var2, i3t0Var, (byte) 28);
                fetVar.o0(dgVar);
                objP10 = dgVar;
            }
            m0x0.o(unit, (Function1) objP10, fetVar);
            boolean zI4 = fetVar.i(i3t0Var);
            Object objP11 = fetVar.P();
            if (zI4 || objP11 == obj2) {
                objP11 = new ui6(i3t0Var, (byte) 13);
                fetVar.o0(objP11);
            }
            Function0 function3 = (Function0) objP11;
            boolean zI5 = fetVar.i(i3t0Var);
            Object objP12 = fetVar.P();
            if (zI5 || objP12 == obj2) {
                objP12 = new ui6(i3t0Var, (byte) 14);
                fetVar.o0(objP12);
            }
            v3c.z(function3, (Function0) objP12, null, fetVar, 0, 4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = mm40Var;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarB = jr8Var.b(mm40VarA, zx7Var);
            lvk0 lvk0Var = (lvk0) pz40VarY.getValue();
            if (lvk0Var != null) {
                if (lvk0Var instanceof kvk0) {
                    fetVar.e0(-264131363);
                    SpecialEventTab specialEventTab = specialEventTabScreenParams.c;
                    if (Intrinsics.d(specialEventTab, SpecialEventTab.Schedule.c)) {
                        fetVar.e0(-424160456);
                        d7x.p(mm40VarB, ((kvk0) lvk0Var).f18959a == i9h0.f14386a, fetVar, 0, 0);
                        fetVar.r(false);
                        z3 = false;
                    } else {
                        if (!Intrinsics.d(specialEventTab, SpecialEventTab.MyGames.c) && !Intrinsics.d(specialEventTab, SpecialEventTab.Statistic.c) && !Intrinsics.d(specialEventTab, SpecialEventTab.Tournament.c)) {
                            throw b1j.f(-424162363, fetVar, false);
                        }
                        z3 = false;
                        fetVar.e0(-424149981);
                        n2x.m(0, fetVar, mm40VarB);
                        fetVar.r(false);
                    }
                    fetVar.r(z3);
                } else {
                    if (lvk0Var instanceof ivk0) {
                        fetVar.e0(-263593854);
                        obc.d(kr00.f18743a.a(Boolean.valueOf(((ivk0) lvk0Var).f)), u1c.M(2120921820, new stl0((Object) lvk0Var, (Object) mm40VarB, (Object) ebo0Var, (Object) i3t0Var, (byte) 10), fetVar), fetVar, 56);
                        fetVar.r(false);
                    } else {
                        z = false;
                        if (lvk0Var instanceof jvk0) {
                            fetVar.e0(-262475157);
                            jvk0 jvk0Var = (jvk0) lvk0Var;
                            int iOrdinal = jvk0Var.b.ordinal();
                            if (iOrdinal != 0) {
                                z2 = true;
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return;
                                }
                                mm40VarY = jr8Var.b(jm40Var, zx7Var);
                            } else {
                                z2 = true;
                                mm40VarY = o7k0.y(jr8Var.a(jm40Var), zx7Var, 2);
                            }
                            mdm mdmVar = jvk0Var.f17207a;
                            boolean zI6 = fetVar.i(i3t0Var);
                            Object objP13 = fetVar.P();
                            if (zI6 || objP13 == obj2) {
                                objP13 = new ui6(i3t0Var, (byte) 15);
                                fetVar.o0(objP13);
                            }
                            jcb.l(mm40VarY, mdmVar, false, (Function0) objP13, fetVar, 0, 4);
                            fetVar.r(false);
                        }
                    }
                    fetVar.r(z2);
                }
                z2 = true;
                fetVar.r(z2);
            } else {
                z = false;
            }
            throw b1j.f(-424164603, fetVar, z);
        }
        mm40Var2 = mm40Var;
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) mm40Var2, (Object) yx5Var, (Object) specialEventTabScreenParams, (Object) ebo0Var, function1, (wdr) function0, (wdr) xdrVar, i, (byte) 17);
        }
    }
}
