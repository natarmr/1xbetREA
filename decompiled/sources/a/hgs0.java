package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hgs0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13028a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hgs0(f3d f3dVar, fpk0 fpk0Var, l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        this.f13028a = (byte) 12;
        this.b = f3dVar;
        this.c = fpk0Var;
        this.f = l7m0Var;
        this.d = l7m0Var2;
        this.e = l7m0Var3;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        f3d f3dVar = (f3d) this.b;
        fpk0 fpk0Var = (fpk0) this.c;
        l7m0 l7m0Var = (l7m0) this.f;
        l7m0 l7m0Var2 = (l7m0) this.d;
        l7m0 l7m0Var3 = (l7m0) this.e;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        zie0 zie0Var = fpk0.V1;
        mm40Var.getClass();
        byte b = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        byte b2 = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            fxb.c(mm40VarD, true, f3dVar, null, null, 16.0f, u1c.M(604545066, new sqc0((Object) f3dVar, (Object) fpk0Var, (Object) l7m0Var, (byte) 13), fetVar), u1c.M(-1207022135, new o82(f3dVar, l7m0Var2, b2), fetVar), u1c.M(1276377960, new o82(f3dVar, l7m0Var3, b), fetVar), fetVar, 114819120);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kwj kwjVar;
        fet fetVar;
        float fA;
        boolean z;
        byte b = this.f13028a;
        pcy pcyVar = e7z.u1;
        byte b2 = 12;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                hh80 hh80Var = (hh80) obj8;
                mm40 mm40Var = (mm40) obj7;
                Function1 function1 = (Function1) obj6;
                xcz xczVar = (xcz) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarE = s5x0.I(o7k0.c, hh80Var).e(mm40Var);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    sgs0 sgs0Var = (sgs0) ((l7m0) l7m0Var.getValue()).getValue();
                    if (sgs0Var instanceof pgs0) {
                        fetVar2.e0(-737288206);
                        mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 32.0f, 7);
                        mdm mdmVar = ((pgs0) sgs0Var).f26966a;
                        boolean zG = fetVar2.g(function1);
                        Object objP = fetVar2.P();
                        if (zG || objP == cl5Var) {
                            objP = new nas0(function1, (byte) 2);
                            fetVar2.o0(objP);
                        }
                        jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar2, 0, 4);
                        fetVar2.r(false);
                    } else if (Intrinsics.d(sgs0Var, qgs0.f28701a)) {
                        fetVar2.e0(-736732562);
                        qim0.g(0, fetVar2, s5x0.L(jm40Var, xfn.a(fetVar2).d, 0.0f, 2));
                        fetVar2.r(false);
                    } else {
                        if (!(sgs0Var instanceof rgs0)) {
                            throw b1j.f(-1547804524, fetVar2, false);
                        }
                        fetVar2.e0(-736323176);
                        mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "TRANSACTIONS_LAZY_COLUMN_TAG");
                        zcl zclVar2 = qmk.f28987a;
                        lh80 lh80Var = new lh80(xfn.a(fetVar2).d, 8.0f, xfn.a(fetVar2).d, 32.0f);
                        boolean zI = fetVar2.i(sgs0Var);
                        Object objP2 = fetVar2.P();
                        if (zI || objP2 == cl5Var) {
                            objP2 = new lcr0((rgs0) sgs0Var, (byte) 14);
                            fetVar2.o0(objP2);
                        }
                        b8k0.e(mm40VarE0, xczVar, lh80Var, null, null, null, false, null, (Function1) objP2, fetVar2, 6, Response.SERVER_TIMEOUT);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                b41 b41Var = (b41) obj8;
                vne vneVar = (vne) obj7;
                pz40 pz40Var = (pz40) obj6;
                cgk0 cgk0Var = (cgk0) obj5;
                pz40 pz40Var2 = (pz40) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jdk0 jdk0Var = z31.n2;
                ((y5d) obj).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    wwb.i(null, b41Var.f1935a, 0L, 0, 0L, fetVar3, 0, 29);
                    zcl zclVar3 = qmk.f28987a;
                    wvb.o(null, 12.0f, 0L, fetVar3, 0, 5);
                    mm40 mm40VarE1 = o2e.e0(s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), "BOTTOM_SHEET_BASIC_TEXT");
                    Object objP3 = fetVar3.P();
                    if (objP3 == cl5Var) {
                        objP3 = new on((Object) pz40Var, (Object) cgk0Var, (Object) pz40Var2, (byte) 6);
                        fetVar3.o0(objP3);
                    }
                    mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP3);
                    String str = b41Var.b;
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    y9q0 y9q0VarA = y9q0.a(g1t0.s(), ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 3, 1, 0L, null, null, 16678910);
                    n05 n05Var = new n05(qmk.r, qmk.y, qmk.n);
                    boolean zI2 = fetVar3.i(vneVar);
                    Object objP4 = fetVar3.P();
                    if (zI2 || objP4 == cl5Var) {
                        objP4 = new dc0(vneVar, pz40Var, cgk0Var, pz40Var2);
                        fetVar3.o0(objP4);
                    }
                    aad.e(str, mm40VarA, y9q0VarA, (Function1) objP4, 2, false, 1, 0, null, n05Var, fetVar3, 1794048, 384);
                    wvb.o(null, 12.0f, 0L, fetVar3, 0, 5);
                    kkb.m(null, b41Var.c, ro8.b, 3, 0L, 0L, fetVar3, 384, 49);
                    wvb.o(null, 12.0f, 0L, fetVar3, 0, 5);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                vj50 vj50Var = (vj50) obj8;
                bee beeVar = (bee) obj7;
                rv2 rv2Var = (rv2) obj6;
                afk0 afk0Var = (afk0) obj5;
                ugd ugdVar = (ugd) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarV = cjx.V(o050.W(o7k0.d(jm40Var, 1.0f)), vj50Var, null);
                    Object objP5 = fetVar4.P();
                    if (objP5 == cl5Var) {
                        objP5 = new mf4(rv2Var, (byte) 1);
                        fetVar4.o0(objP5);
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarV, (Function1) objP5);
                    beeVar.getClass();
                    ma80 ma80Var = ma80.f21447a;
                    mm40 mm40VarA2 = dv2.a(mm40VarT, rv2Var, true, null, afk0Var, 24);
                    zfn zfnVar = zaq0.b;
                    long separator = ((ThemeColors) fetVar4.k(zfnVar)).getSeparator();
                    long backgroundContent = ((ThemeColors) fetVar4.k(zfnVar)).getBackgroundContent();
                    zcl zclVar4 = qmk.f28987a;
                    mm40VarA2.getClass();
                    mm40 mm40VarN2 = s5x0.N(mm40VarA2.e(rq8.L(jm40Var, new lf4((byte) 5, backgroundContent, separator))), 0.0f, 28.0f, 0.0f, 0.0f, 13);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, gqw0.v);
                    ua80.p(6, ugdVar, jr8.f16991a, fetVar4, true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                Function0 function0 = (Function0) obj8;
                k7h k7hVar = (k7h) obj7;
                Function1 function2 = (Function1) obj6;
                Function0 function3 = (Function0) obj5;
                pz40 pz40Var3 = (pz40) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    boolean zG2 = fetVar5.g(function0);
                    Object objP6 = fetVar5.P();
                    if (zG2 || objP6 == cl5Var) {
                        objP6 = new y(function0, (byte) 19);
                        fetVar5.o0(objP6);
                    }
                    mm40 mm40VarT2 = i4w0.T(mm40VarD, (Function1) objP6);
                    if (!k7hVar.f) {
                        k7hVar = (k7h) pz40Var3.getValue();
                    }
                    k7h k7hVar2 = k7hVar;
                    boolean zG3 = fetVar5.g(function2);
                    Object objP7 = fetVar5.P();
                    if (zG3 || objP7 == cl5Var) {
                        objP7 = new omf(function2, (byte) 27);
                        fetVar5.o0(objP7);
                    }
                    obb.k(mm40VarT2, k7hVar2, (Function1) objP7, function3, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                pz40 pz40Var4 = (pz40) obj8;
                kwj kwjVar2 = (kwj) obj7;
                vne vneVar2 = (vne) obj6;
                q1j q1jVar = (q1j) obj5;
                l7m0 l7m0Var2 = (l7m0) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i = q1j.n2;
                ((y5d) obj).getClass();
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar6), null), wha0.T(fetVar6), false, 14);
                    omm ommVar = ((e2j) pz40Var4.getValue()).f7089a;
                    boolean zI3 = fetVar6.i(vneVar2) | fetVar6.g(kwjVar2) | fetVar6.i(q1jVar);
                    Object objP8 = fetVar6.P();
                    if (zI3 || objP8 == cl5Var) {
                        objP8 = new dc0((Object) vneVar2, (Object) q1jVar, (Object) kwjVar2, (Object) l7m0Var2, (byte) 25);
                        kwjVar = kwjVar2;
                        fetVar6.o0(objP8);
                    } else {
                        kwjVar = kwjVar2;
                    }
                    dub.z(mm40VarA0, ommVar, kwjVar, (Function1) objP8, fetVar6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                wul wulVar = (wul) obj8;
                wul wulVar2 = (wul) obj7;
                xej xejVar = (xej) obj6;
                c2 c2Var = (c2) obj5;
                Calendar calendar = (Calendar) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                nwd nwdVar = xej.l2;
                ((ir8) obj).getClass();
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    vtb.t(null, qqm.b, null, 0L, fetVar7, 48, 13);
                    vul vulVar = vul.f38053a;
                    boolean zI4 = fetVar7.i(xejVar);
                    Object objP9 = fetVar7.P();
                    if (zI4 || objP9 == cl5Var) {
                        objP9 = new wej(0, xejVar, xej.class, "dismiss", "dismiss()V", 0, (byte) 0);
                        fetVar7.o0(objP9);
                    }
                    Function0 function4 = (Function0) ((jhy) objP9);
                    boolean zI5 = fetVar7.i(xejVar) | fetVar7.g(c2Var) | fetVar7.i(calendar);
                    Object objP10 = fetVar7.P();
                    if (zI5 || objP10 == cl5Var) {
                        objP10 = new kk0(xejVar, c2Var, calendar, (byte) 27);
                        fetVar7.o0(objP10);
                    }
                    gkb.i(null, vulVar, wulVar, wulVar2, 0L, function4, (Function0) objP10, fetVar7, 48, 17);
                    zcl zclVar5 = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar7, 0, 5);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                xk80 xk80Var = (xk80) obj8;
                rll rllVar = (rll) obj7;
                Function1 function5 = (Function1) obj6;
                Function1 function6 = (Function1) obj5;
                l7m0 l7m0Var3 = (l7m0) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar8.g(lr8Var) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    float fD = lr8Var.d();
                    zcl zclVar6 = qmk.f28987a;
                    float f = (fD - 304.0f) / 2.0f;
                    Object objP11 = fetVar8.P();
                    if (objP11 == cl5Var) {
                        objP11 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar8);
                        fetVar8.o0(objP11);
                    }
                    vne vneVar3 = (vne) objP11;
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
                    xi80 xi80Var = new xi80();
                    gfk0 gfk0Var = gfk0.b;
                    boolean zG4 = fetVar8.g(rllVar);
                    Object objP12 = fetVar8.P();
                    if (zG4 || objP12 == cl5Var) {
                        objP12 = new edl(rllVar, (byte) 9);
                        fetVar8.o0(objP12);
                    }
                    q5x.e(xk80Var, mm40VarD2, lh80VarT, xi80Var, 0, 12.0f, null, null, false, (Function1) objP12, null, gfk0Var, null, u1c.M(2027145117, new en0(rllVar, vneVar3, xk80Var, function5, function6, l7m0Var3), fetVar8), fetVar8, 48, 24960, 11216);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                pz40 pz40Var5 = (pz40) obj8;
                sfh0 sfh0Var = (sfh0) obj7;
                String str2 = (String) obj5;
                Function1 function7 = (Function1) obj6;
                cqq cqqVar = (cqq) obj4;
                Function2 function8 = (Function2) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                function8.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar9.i(function8) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    k6z k6zVarG = pkd.g(((a8q0) pz40Var5.getValue()).f440a.b, fetVar9);
                    boolean z2 = ((a8q0) pz40Var5.getValue()).f440a.b.length() == 0;
                    boolean zG5 = fetVar9.g(function7);
                    Object objP13 = fetVar9.P();
                    if (zG5 || objP13 == cl5Var) {
                        objP13 = new g8l(cqqVar, pz40Var5, function7, (byte) 5);
                        fetVar9.o0(objP13);
                    }
                    aac.I(null, k6zVarG, sfh0Var, z2, str2, (Function0) objP13, function8, fetVar9, (iIntValue8 << 18) & 3670016);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 8:
                wy6 wy6Var = (wy6) obj8;
                Function0 function9 = (Function0) obj7;
                Function0 function10 = (Function0) obj6;
                Function0 function11 = (Function0) obj5;
                Function0 function12 = (Function0) obj4;
                fet fetVar10 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    hmw0.h(null, wy6Var, function9, function10, function11, function12, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 9:
                kr50 kr50Var = (kr50) obj8;
                w2d w2dVar = (w2d) obj7;
                x2d x2dVar = w2dVar.f38442a;
                Function1 function13 = (Function1) obj6;
                String str3 = (String) obj5;
                fqj0 fqj0Var = (fqj0) obj4;
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar11.g(hh80Var2) ? 4 : 2;
                }
                if (fetVar11.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    if (kr50Var != null) {
                        boolean z3 = kr50Var instanceof hr50;
                        jm40 jm40Var2 = jm40.b;
                        if (z3) {
                            fetVar11.e0(-1113352930);
                            float fA2 = x2dVar.a();
                            hr50 hr50Var = (hr50) kr50Var;
                            ArrayList arrayList = hr50Var.f13514a;
                            boolean zD = fetVar11.d(fA2) | fetVar11.h(arrayList.isEmpty());
                            Object objP14 = fetVar11.P();
                            if (zD || objP14 == cl5Var) {
                                if (arrayList.isEmpty()) {
                                    zcl zclVar7 = qmk.f28987a;
                                    fA = 0.0f;
                                } else {
                                    zcl zclVar8 = qmk.f28987a;
                                    fA = (1.0f - x2dVar.a()) * 24.0f;
                                }
                                objP14 = vgg0.c(fA, fA, 0.0f, 0.0f, 12);
                                fetVar11.o0(objP14);
                            }
                            ugg0 ugg0Var = (ugg0) objP14;
                            hh80 hh80VarU = !arrayList.isEmpty() ? hh80Var2 : null;
                            if (hh80VarU == null) {
                                zcl zclVar9 = qmk.f28987a;
                                hh80VarU = s5x0.u(0.0f, 56.0f, 0.0f, 0.0f, 13);
                            }
                            mm40 mm40VarJ = lgb.J(i120.Q(s5x0.I(jm40Var2, hh80VarU), ((ThemeColors) fetVar11.k(zaq0.b)).getBackground(), ugg0Var), ugg0Var);
                            boolean z4 = !arrayList.isEmpty();
                            ArrayList arrayList2 = hr50Var.c;
                            boolean zG6 = fetVar11.g(function13) | fetVar11.g(str3);
                            Object objP15 = fetVar11.P();
                            if (zG6 || objP15 == cl5Var) {
                                objP15 = new fr50((byte) 0, str3, function13);
                                fetVar11.o0(objP15);
                            }
                            xdr xdrVar = (xdr) objP15;
                            boolean zG7 = fetVar11.g(function13);
                            Object objP16 = fetVar11.P();
                            if (zG7 || objP16 == cl5Var) {
                                objP16 = new rp30(function13, (byte) 23);
                                fetVar11.o0(objP16);
                            }
                            o050.l(mm40VarJ, w2dVar, z4, arrayList2, xdrVar, (Function1) objP16, fetVar11, 64);
                            fetVar11.r(false);
                        } else {
                            fetVar = fetVar11;
                            if (kr50Var instanceof ir50) {
                                fetVar.e0(-1421317406);
                                zcl zclVar10 = qmk.f28987a;
                                mm40 mm40VarQ = i120.Q(s5x0.N(jm40Var2, 0.0f, 56.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
                                mdm mdmVar2 = ((ir50) kr50Var).f15240a;
                                boolean zG8 = fetVar.g(function13);
                                Object objP17 = fetVar.P();
                                if (zG8 || objP17 == cl5Var) {
                                    objP17 = new w250(function13, (byte) 19);
                                    fetVar.o0(objP17);
                                }
                                o050.m(mm40VarQ, mdmVar2, (Function0) objP17, fetVar, 0);
                                fetVar.r(false);
                            } else if (kr50Var instanceof jr50) {
                                fetVar.e0(-1421305072);
                                mm40 mm40VarI = s5x0.I(jm40Var2, hh80Var2);
                                long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                                zcl zclVar11 = qmk.f28987a;
                                o050.n(i120.Q(mm40VarI, background, vgg0.c((1.0f - x2dVar.a()) * 24.0f, (1.0f - x2dVar.a()) * 24.0f, 0.0f, 0.0f, 12)), w2dVar, fqj0Var, fetVar, 64);
                                fetVar.r(false);
                            }
                        }
                    } else {
                        fetVar = fetVar11;
                    }
                    throw b1j.f(-1421389285, fetVar, false);
                }
                fetVar11.X();
                return Unit.f46060a;
            case 10:
                pz40 pz40Var6 = (pz40) obj8;
                w6k w6kVar = (w6k) obj7;
                Function0 function14 = (Function0) obj6;
                Function0 function15 = (Function0) obj5;
                pz40 pz40Var7 = (pz40) obj4;
                fet fetVar12 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar12.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    rv50 rv50Var = (rv50) pz40Var6.getValue();
                    boolean zG9 = fetVar12.g(w6kVar);
                    Object objP18 = fetVar12.P();
                    if (zG9 || objP18 == cl5Var) {
                        objP18 = new a1i(w6kVar, pz40Var7, (byte) 1);
                        fetVar12.o0(objP18);
                    }
                    jcb.b(ro4.d0(jm40Var, (Function1) objP18), rv50Var, function14, function15, fetVar12, 0);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 11:
                ujv0 ujv0Var = (ujv0) obj8;
                l7m0 l7m0Var4 = (l7m0) obj4;
                final vne vneVar4 = (vne) obj7;
                final pz40 pz40Var8 = (pz40) obj5;
                final Function1 function16 = (Function1) obj6;
                fet fetVar13 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar13.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    float fO = qem0.o(ujv0Var);
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarD3 = o7k0.d(jm40Var3, fO);
                    pz40 pz40Var9 = s6t0.f31722a;
                    long backgroundContent2 = s6t0.b().f33626a.getBackgroundContent();
                    zcl zclVar12 = qmk.f28987a;
                    mm40 mm40VarQ2 = i120.Q(mm40VarD3, backgroundContent2, vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12));
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar13, 48);
                    int iHashCode3 = Long.hashCode(fetVar13.T);
                    bh90 bh90VarM3 = fetVar13.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar13, mm40VarQ2);
                    mkd.c0.getClass();
                    fetVar13.i0();
                    if (fetVar13.S) {
                        fetVar13.l(pcyVar);
                    } else {
                        fetVar13.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar13, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar13, bh90VarM3, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar13, numValueOf, shdVar3);
                    jpm0.n(fetVar13);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar13, mm40VarC2, shdVar4);
                    mm40 mm40VarJ2 = lgb.J(o7k0.n(s5x0.N(jm40Var3, 0.0f, 28.0f, 0.0f, 0.0f, 13), 72.0f), vgg0.f37379a);
                    Object objP19 = fetVar13.P();
                    if (objP19 == cl5Var) {
                        objP19 = new bue0(b2);
                        fetVar13.o0(objP19);
                    }
                    fem0.b(0, fetVar13, rq8.K(mm40VarJ2, (Function1) objP19));
                    v8q0.a(rsm0.w(R.string.successful_registraration, 0, fetVar13), o2e.e0(o7k0.d(s5x0.J(jm40Var3, 16.0f), 1.0f), "SUCCESS_TITLE_TAG"), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar13, 0, 24960, 109560);
                    qw3 qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
                    mm40 mm40VarJ3 = s5x0.J(i120.Q(o7k0.d(s5x0.L(jm40Var3, 16.0f, 0.0f, 2), 1.0f), s6t0.b().f33626a.getBackground(), vgg0.a(16.0f)), 16.0f);
                    x5d x5dVarA2 = w5d.a(qw3Var, gqw0.m, fetVar13, 0);
                    int iHashCode4 = Long.hashCode(fetVar13.T);
                    bh90 bh90VarM4 = fetVar13.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar13, mm40VarJ3);
                    fetVar13.i0();
                    if (fetVar13.S) {
                        fetVar13.l(pcyVar);
                    } else {
                        fetVar13.r0();
                    }
                    jpm0.o(fetVar13, x5dVarA2, shdVar);
                    jpm0.o(fetVar13, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar13, shdVar3, fetVar13);
                    jpm0.o(fetVar13, mm40VarC3, shdVar4);
                    kkb.g(6, fetVar13, o2e.e0(o7k0.d(jm40Var3, 1.0f), "LOGIN_TAG"), rsm0.w(R.string.login_title_with_colon, 0, fetVar13), ((p7f0) l7m0Var4.getValue()).f26503a);
                    kkb.g(6, fetVar13, o2e.e0(o7k0.d(jm40Var3, 1.0f), "PASSWORD_TAG"), rsm0.w(R.string.password_title_with_colon, 0, fetVar13), ((p7f0) l7m0Var4.getValue()).b);
                    fetVar13.r(true);
                    qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
                    mm40 mm40VarL = s5x0.L(o7k0.d(s5x0.L(jm40Var3, 0.0f, 8.0f, 1), 1.0f), 16.0f, 0.0f, 2);
                    thg0 thg0VarA = shg0.a(qw3Var2, gqw0.j, fetVar13, 0);
                    int iHashCode5 = Long.hashCode(fetVar13.T);
                    bh90 bh90VarM5 = fetVar13.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar13, mm40VarL);
                    fetVar13.i0();
                    if (fetVar13.S) {
                        fetVar13.l(pcyVar);
                    } else {
                        fetVar13.r0();
                    }
                    jpm0.o(fetVar13, thg0VarA, shdVar);
                    jpm0.o(fetVar13, bh90VarM5, shdVar2);
                    vqd.u(iHashCode5, fetVar13, shdVar3, fetVar13);
                    mm40 mm40VarE2 = o7k0.e(o7k0.g(o7k0.u(ohs0.i(fetVar13, mm40VarC4, shdVar4, 1.0f, true), 80.0f, 0.0f, 2), 36.0f, 0.0f, 2), 48.0f);
                    wul wulVar3 = ((p7f0) l7m0Var4.getValue()).e;
                    boolean zG10 = fetVar13.g(function16);
                    Object objP20 = fetVar13.P();
                    if (zG10 || objP20 == cl5Var) {
                        objP20 = new pme0(function16, (byte) 4);
                        fetVar13.o0(objP20);
                    }
                    qzb.n(mm40VarE2, wulVar3, (Function0) objP20, fetVar13, 0, 0);
                    wul wulVar4 = ((p7f0) l7m0Var4.getValue()).f;
                    boolean zI6 = fetVar13.i(vneVar4) | fetVar13.g(pz40Var8) | fetVar13.g(function16);
                    Object objP21 = fetVar13.P();
                    if (zI6 || objP21 == cl5Var) {
                        final byte b3 = 0;
                        objP21 = new Function0() { // from class: a.e7f0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b3;
                                pz40 pz40Var10 = pz40Var8;
                                Function1 function17 = function16;
                                vne vneVar5 = vneVar4;
                                switch (b4) {
                                    case 0:
                                        qjj.W(vneVar5, null, null, new g7f0(function17, pz40Var10, null, (byte) 0), 3);
                                        break;
                                    default:
                                        qjj.W(vneVar5, null, null, new g7f0(function17, pz40Var10, null, (byte) 1), 3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar13.o0(objP21);
                    }
                    qzb.n(mm40VarE2, wulVar4, (Function0) objP21, fetVar13, 0, 0);
                    fetVar13.r(true);
                    mm40 mm40VarE3 = o2e.e0(s5x0.L(o7k0.d(s5x0.L(jm40Var3, 0.0f, 16.0f, 1), 1.0f), 16.0f, 0.0f, 2), "NEXT_BUTTON_TAG");
                    wul wulVar5 = ((p7f0) l7m0Var4.getValue()).g;
                    boolean zI7 = fetVar13.i(vneVar4) | fetVar13.g(pz40Var8) | fetVar13.g(function16);
                    Object objP22 = fetVar13.P();
                    if (zI7 || objP22 == cl5Var) {
                        z = true;
                        final char c = 1 == true ? 1 : 0;
                        objP22 = new Function0() { // from class: a.e7f0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = c;
                                pz40 pz40Var10 = pz40Var8;
                                Function1 function17 = function16;
                                vne vneVar5 = vneVar4;
                                switch (b4) {
                                    case 0:
                                        qjj.W(vneVar5, null, null, new g7f0(function17, pz40Var10, null, (byte) 0), 3);
                                        break;
                                    default:
                                        qjj.W(vneVar5, null, null, new g7f0(function17, pz40Var10, null, (byte) 1), 3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar13.o0(objP22);
                    } else {
                        z = true;
                    }
                    qzb.n(mm40VarE3, wulVar5, (Function0) objP22, fetVar13, 0, 0);
                    fetVar13.r(z);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 12:
                return a(obj, obj2, obj3);
            default:
                s7k0 s7k0Var = (s7k0) obj8;
                ugd ugdVar2 = (ugd) obj7;
                mz3 mz3Var = (mz3) obj6;
                u12 u12Var = (u12) obj5;
                qge qgeVar = (qge) obj4;
                lr8 lr8Var2 = (lr8) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar14.g(lr8Var2) ? 4 : 2;
                }
                if (fetVar14.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    ((t4e) s7k0Var).h(lr8Var2.b);
                    ugdVar2.F(new pbe0(lr8Var2, mz3Var, u12Var, qgeVar), fetVar14, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ hgs0(pz40 pz40Var, sfh0 sfh0Var, String str, Function1 function1, cqq cqqVar) {
        this.f13028a = (byte) 7;
        this.b = pz40Var;
        this.c = sfh0Var;
        this.e = str;
        this.d = function1;
        this.f = cqqVar;
    }

    public /* synthetic */ hgs0(ujv0 ujv0Var, l7m0 l7m0Var, vne vneVar, pz40 pz40Var, Function1 function1) {
        this.f13028a = (byte) 11;
        this.b = ujv0Var;
        this.f = l7m0Var;
        this.c = vneVar;
        this.e = pz40Var;
        this.d = function1;
    }

    public /* synthetic */ hgs0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f13028a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
