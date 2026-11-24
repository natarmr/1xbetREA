package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wvm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39844a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wvm(Object obj, Object obj2, byte b) {
        this.f39844a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        h3i d3iVar;
        h3i e3iVar;
        Object obj4;
        h3i d3iVar2;
        h3i e3iVar2;
        byte b = this.f39844a;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dyb.C((mm40) obj6, (vum) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                mm40 mm40Var = (mm40) obj6;
                awm awmVar = (awm) obj5;
                String str = awmVar.g;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
                    x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    ozb.G(0, fetVar, null, awmVar.f1581a, awmVar.b, awmVar.h);
                    ozb.C(null, awmVar.e, awmVar.f, awmVar.c, awmVar.d, awmVar.i, awmVar.j, fetVar, 0);
                    if (str.length() > 0) {
                        fetVar.e0(2131241698);
                        ozb.d(0, fetVar, null, str);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(2131378594);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                mm40 mm40Var2 = (mm40) obj6;
                dwm dwmVar = (dwm) obj5;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(mm40Var2, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD2, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    vzb.v(null, dwmVar.f6807a, dwmVar.b, dwmVar.c, dwmVar.d, dwmVar.e, dwmVar.f, dwmVar.h, dwmVar.i, fetVar2, 0);
                    if (dwmVar.g.length() > 0) {
                        fetVar2.e0(1413020296);
                        String str2 = dwmVar.g;
                        long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                        ((g1t0) fetVar2.k(j1t0.e)).getClass();
                        v8q0.a(str2, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110586);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1413301342);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                tfa tfaVar = (tfa) obj6;
                Function1 function1 = (Function1) obj5;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (tfaVar instanceof ofa) {
                        obj3 = ((ofa) tfaVar).b;
                    } else if (tfaVar instanceof pfa) {
                        obj3 = ((pfa) tfaVar).b;
                    } else if (tfaVar instanceof qfa) {
                        obj3 = ((qfa) tfaVar).b;
                    } else if (tfaVar instanceof rfa) {
                        obj3 = ((rfa) tfaVar).b;
                    } else {
                        if (!(tfaVar instanceof sfa)) {
                            t9f.b();
                            return null;
                        }
                        obj3 = ((sfa) tfaVar).b;
                    }
                    long jA = tfaVar.a();
                    function1.getClass();
                    pz40 pz40VarF = androidx.compose.runtime.e.f(Long.valueOf(jA), fetVar3);
                    Object objP = fetVar3.P();
                    if (objP == cl5Var) {
                        objP = new jg2(function1, pz40VarF, (byte) 5);
                        fetVar3.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    fetVar3.e0(-833547592);
                    boolean z = obj3 instanceof mga;
                    w3i w3iVar = w3i.f38503a;
                    if (z) {
                        mga mgaVar = (mga) obj3;
                        d3iVar = new c3i(w3iVar, mgaVar.f21732a, mgaVar.b, null);
                    } else if (obj3 instanceof nga) {
                        nga ngaVar = (nga) obj3;
                        d3iVar = new g3i(w3iVar, ngaVar.f23475a, ngaVar.b, "");
                    } else {
                        if (obj3 instanceof oga) {
                            oga ogaVar = (oga) obj3;
                            e3iVar = new f3i(w3iVar, ogaVar.b, ogaVar.c, new b4i(ogaVar.f25208a, 2), null);
                        } else if (obj3 instanceof pga) {
                            pga pgaVar = (pga) obj3;
                            e3iVar = new e3i(w3iVar, pgaVar.b, pgaVar.c, new b4i(pgaVar.f26943a, 2), "");
                        } else {
                            if (!(obj3 instanceof qga)) {
                                t9f.b();
                                return null;
                            }
                            qga qgaVar = (qga) obj3;
                            d3iVar = new d3i(qgaVar.f28673a, qgaVar.b, null);
                        }
                        d3iVar = e3iVar;
                    }
                    kbc.f(jm40Var, d3iVar, function2, fetVar3);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                zfa zfaVar = (zfa) obj6;
                Function1 function3 = (Function1) obj5;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (zfaVar instanceof ufa) {
                        obj4 = ((ufa) zfaVar).b;
                    } else if (zfaVar instanceof vfa) {
                        obj4 = ((vfa) zfaVar).b;
                    } else if (zfaVar instanceof wfa) {
                        obj4 = ((wfa) zfaVar).b;
                    } else if (zfaVar instanceof xfa) {
                        obj4 = ((xfa) zfaVar).b;
                    } else {
                        if (!(zfaVar instanceof yfa)) {
                            t9f.b();
                            return null;
                        }
                        obj4 = ((yfa) zfaVar).b;
                    }
                    long jA2 = zfaVar.a();
                    function3.getClass();
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f(Long.valueOf(jA2), fetVar4);
                    Object objP2 = fetVar4.P();
                    if (objP2 == cl5Var) {
                        objP2 = new jg2(function3, pz40VarF2, (byte) 6);
                        fetVar4.o0(objP2);
                    }
                    Function1 function4 = (Function1) objP2;
                    fetVar4.e0(-639862585);
                    if (obj4 instanceof wga) {
                        wga wgaVar = (wga) obj4;
                        d3iVar2 = new c3i(wgaVar.b, wgaVar.c, wgaVar.d, wgaVar.f39104a);
                    } else if (obj4 instanceof xga) {
                        xga xgaVar = (xga) obj4;
                        d3iVar2 = new g3i(xgaVar.b, xgaVar.c, xgaVar.d, xgaVar.f40827a);
                    } else {
                        if (obj4 instanceof yga) {
                            yga ygaVar = (yga) obj4;
                            e3iVar2 = new f3i(ygaVar.c, ygaVar.d, ygaVar.e, new b4i(ygaVar.b, 2), ygaVar.f42576a);
                        } else if (obj4 instanceof zga) {
                            zga zgaVar = (zga) obj4;
                            e3iVar2 = new e3i(zgaVar.c, zgaVar.d, zgaVar.e, new b4i(zgaVar.b, 2), zgaVar.f44334a);
                        } else {
                            if (!(obj4 instanceof aha)) {
                                t9f.b();
                                return null;
                            }
                            aha ahaVar = (aha) obj4;
                            d3iVar2 = new d3i(ahaVar.b, ahaVar.c, ahaVar.f863a);
                        }
                        d3iVar2 = e3iVar2;
                    }
                    kbc.f(o7k0.d(jm40Var, 1.0f), d3iVar2, function4, fetVar4);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                mm40 mm40Var3 = (mm40) obj6;
                mwm mwmVar = (mwm) obj5;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarJ2 = s5x0.J(mm40Var3, 8.0f);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar5, 0);
                    int iHashCode3 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM3 = fetVar5.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarJ2);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC2, gqw0.v);
                    zhg0 zhg0Var = zhg0.f44392a;
                    mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
                    String str3 = mwmVar.f22511a;
                    dlk dlkVar = mwmVar.f;
                    n4c.w(mm40VarA, str3, mwmVar.d, fetVar5, 0);
                    boolean zG = fetVar5.g(dlkVar);
                    Object objP3 = fetVar5.P();
                    if (zG || objP3 == cl5Var) {
                        objP3 = new kpm(opm.f25648a, new hpm(0L, 3), d5c.O(dlkVar.f6286a, dlkVar.b, dlkVar.c, dlkVar.d, new hpm(0L, 3)));
                        fetVar5.o0(objP3);
                    }
                    n4c.y(zhg0Var.a(1.0f, s5x0.L(jm40Var, 8.0f, 0.0f, 2), true), mwmVar.c, (mpm) objP3, mwmVar.g, fetVar5, 0);
                    n4c.A(zhg0Var.a(1.0f, jm40Var, true), mwmVar.b, mwmVar.e, fetVar5, 0);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 6:
                mm40 mm40Var4 = (mm40) obj6;
                pwm pwmVar = (pwm) obj5;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(s5x0.L(mm40Var4, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar6, 0);
                    int iHashCode4 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM4 = fetVar6.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar6, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC3, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    String str4 = pwmVar.f27717a;
                    dlk dlkVar2 = pwmVar.e;
                    sac.z(x7zVar, str4, pwmVar.c, fetVar6, 0);
                    boolean zG2 = fetVar6.g(dlkVar2);
                    Object objP4 = fetVar6.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new y1m(c2m.f3631a, new x1m(), dlkVar2.f6286a, dlkVar2.b, dlkVar2.c, dlkVar2.d);
                        fetVar6.o0(objP4);
                    }
                    sac.B(s5x0.L(jm40Var, 8.0f, 0.0f, 2), (a2m) objP4, pwmVar.f, fetVar6, 0);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    sac.E(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), pwmVar.b, pwmVar.d, fetVar6, 0);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                fbc.E((mm40) obj6, (vyp) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                kbc.y((mm40) obj6, (wyp) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                kbc.I((mm40) obj6, (oip0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                kbc.H((mm40) obj6, (tip0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                mbc.A((mm40) obj6, (xyp) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                qbc.x((mm40) obj6, (yyp) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                oxm oxmVar = (oxm) obj6;
                k6z k6zVar = (k6z) obj5;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ulb.m(null, vjm.b, oxmVar.c, oxmVar.d, k6zVar == k6z.b, 0L, fetVar7, 432, 65);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                jcb.n((mm40) obj6, (yxm) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                rcb.B((mm40) obj6, (zxm) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                vdb.z((mm40) obj6, (aym) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                feb.p((mm40) obj6, (bym) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                ieb.A((String) obj6, (uxm) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                b2o0 b2o0Var = (b2o0) obj6;
                Function1 function5 = (Function1) obj5;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    long jA3 = b2o0Var.a();
                    s5o0 s5o0VarD = b2o0Var.d();
                    function5.getClass();
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f(Long.valueOf(jA3), fetVar8);
                    Object objP5 = fetVar8.P();
                    if (objP5 == cl5Var) {
                        objP5 = new jg2(function5, pz40VarF3, (byte) 11);
                        fetVar8.o0(objP5);
                    }
                    Function1 function6 = (Function1) objP5;
                    boolean z2 = s5o0VarD instanceof n5o0;
                    jm40 jm40Var2 = jm40.b;
                    if (z2) {
                        fetVar8.e0(-399076753);
                        aac.i(jm40Var2, ((n5o0) s5o0VarD).f22954a, function6, fetVar8, 384, 0);
                        fetVar8.r(false);
                    } else if (s5o0VarD instanceof r5o0) {
                        fetVar8.e0(-398822801);
                        aac.i(jm40Var2, ((r5o0) s5o0VarD).f29898a, function6, fetVar8, 384, 0);
                        fetVar8.r(false);
                    } else if (s5o0VarD instanceof q5o0) {
                        fetVar8.e0(-398564881);
                        aac.i(jm40Var2, ((q5o0) s5o0VarD).f28162a, function6, fetVar8, 384, 0);
                        fetVar8.r(false);
                    } else if (s5o0VarD instanceof p5o0) {
                        fetVar8.e0(-398311921);
                        aac.i(jm40Var2, ((p5o0) s5o0VarD).f26415a, function6, fetVar8, 384, 0);
                        fetVar8.r(false);
                    } else {
                        if (!(s5o0VarD instanceof o5o0)) {
                            throw b1j.f(-1398348550, fetVar8, false);
                        }
                        fetVar8.e0(-398054993);
                        aac.i(jm40Var2, ((o5o0) s5o0VarD).f24697a, function6, fetVar8, 384, 0);
                        fetVar8.r(false);
                    }
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 20:
                v1o0 v1o0Var = (v1o0) obj6;
                Function1 function7 = (Function1) obj5;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    long jA4 = v1o0Var.a();
                    x3o0 x3o0VarD = v1o0Var.d();
                    function7.getClass();
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f(Long.valueOf(jA4), fetVar9);
                    Object objP6 = fetVar9.P();
                    if (objP6 == cl5Var) {
                        objP6 = new jg2(function7, pz40VarF4, (byte) 12);
                        fetVar9.o0(objP6);
                    }
                    Function1 function8 = (Function1) objP6;
                    boolean z3 = x3o0VarD instanceof s3o0;
                    jm40 jm40Var3 = jm40.b;
                    if (z3) {
                        fetVar9.e0(558985041);
                        aac.i(jm40Var3, ((s3o0) x3o0VarD).f31568a, function8, fetVar9, 384, 0);
                        fetVar9.r(false);
                    } else if (x3o0VarD instanceof w3o0) {
                        fetVar9.e0(559235025);
                        aac.i(jm40Var3, ((w3o0) x3o0VarD).f38511a, function8, fetVar9, 384, 0);
                        fetVar9.r(false);
                    } else if (x3o0VarD instanceof v3o0) {
                        fetVar9.e0(559488977);
                        aac.i(jm40Var3, ((v3o0) x3o0VarD).f36739a, function8, fetVar9, 384, 0);
                        fetVar9.r(false);
                    } else if (x3o0VarD instanceof u3o0) {
                        fetVar9.e0(559737969);
                        aac.i(jm40Var3, ((u3o0) x3o0VarD).f35007a, function8, fetVar9, 384, 0);
                        fetVar9.r(false);
                    } else {
                        if (!(x3o0VarD instanceof t3o0)) {
                            throw b1j.f(1680598084, fetVar9, false);
                        }
                        fetVar9.e0(559990929);
                        aac.i(jm40Var3, ((t3o0) x3o0VarD).f33278a, function8, fetVar9, 384, 0);
                        fetVar9.r(false);
                    }
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                slb.p((mm40) obj6, (q3o0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                tlb.n((mm40) obj6, (hzm) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                tlb.w((mm40) obj6, (czm) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                tlb.t((mm40) obj6, (rym) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                sj3.r((mm40) obj6, (uym) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ntb.r((mm40) obj6, (izm) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                vtb.x((mm40) obj6, (jzm) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                vtb.E((mm40) obj6, (sym) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ozb.v((mm40) obj6, (h0n) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ wvm(Object obj, Object obj2, int i, byte b) {
        this.f39844a = b;
        this.b = obj;
        this.c = obj2;
    }
}
