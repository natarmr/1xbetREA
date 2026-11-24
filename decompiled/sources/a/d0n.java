package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d0n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5276a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0n(vtn vtnVar, Function0 function0, int i) {
        this.f5276a = (byte) 29;
        this.c = vtnVar;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        m4i j4iVar;
        m4i j4iVar2;
        byte b = this.f5276a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 0;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                m0n m0nVar = (m0n) obj5;
                mm40 mm40Var = (mm40) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (m0nVar instanceof h0n) {
                    fetVar.e0(1538226765);
                    ozb.v(mm40Var, (h0n) m0nVar, fetVar, 0);
                    fetVar.r(false);
                } else if (m0nVar instanceof i0n) {
                    fetVar.e0(1538232424);
                    qzb.r(mm40Var, (i0n) m0nVar, fetVar, 0);
                    fetVar.r(false);
                } else if (m0nVar instanceof j0n) {
                    fetVar.e0(1538237928);
                    uzb.w(mm40Var, (j0n) m0nVar, fetVar, 0);
                    fetVar.r(false);
                } else if (m0nVar instanceof k0n) {
                    fetVar.e0(1538243432);
                    vzb.j(mm40Var, (k0n) m0nVar, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (!(m0nVar instanceof l0n)) {
                        throw b1j.f(1538224797, fetVar, false);
                    }
                    fetVar.e0(1538248936);
                    wzb.t(mm40Var, (l0n) m0nVar, fetVar, 0);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                qzb.r((mm40) obj4, (i0n) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                uzb.w((mm40) obj4, (j0n) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                vzb.j((mm40) obj4, (k0n) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                wzb.t((mm40) obj4, (l0n) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                v3c.q((mm40) obj4, (g1n) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                vcc.k((mm40) obj4, (h9l0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                bjl0 bjl0Var = (bjl0) obj5;
                Function1 function1 = (Function1) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (bjl0Var instanceof wil0) {
                        obj3 = ((wil0) bjl0Var).b;
                    } else if (bjl0Var instanceof xil0) {
                        obj3 = ((xil0) bjl0Var).b;
                    } else if (bjl0Var instanceof yil0) {
                        obj3 = ((yil0) bjl0Var).c;
                    } else if (bjl0Var instanceof zil0) {
                        obj3 = ((zil0) bjl0Var).b;
                    } else {
                        if (!(bjl0Var instanceof ajl0)) {
                            t9f.b();
                            return null;
                        }
                        obj3 = ((ajl0) bjl0Var).b;
                    }
                    pz40 pz40VarF = androidx.compose.runtime.e.f(Long.valueOf(bjl0Var.a()), fetVar2);
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = new jg2(function1, pz40VarF, (byte) 9);
                        fetVar2.o0(objP);
                    }
                    Function1 function2 = (Function1) objP;
                    fetVar2.e0(418362472);
                    boolean z = obj3 instanceof m4n;
                    y3i y3iVar = y3i.f41954a;
                    w3i w3iVar = w3i.f38503a;
                    if (z) {
                        m4n m4nVar = (m4n) obj3;
                        j4iVar = new i4i(false, m4nVar.f21179a, null, w3iVar, m4nVar.b, y3iVar, null, 68);
                    } else if (obj3 instanceof n4n) {
                        n4n n4nVar = (n4n) obj3;
                        j4iVar = new k4i(n4nVar.f22906a, null, w3iVar, n4nVar.b, y3iVar, null, 68);
                    } else if (obj3 instanceof o4n) {
                        o4n o4nVar = (o4n) obj3;
                        j4iVar = new l4i("", o4nVar.f24646a, new b4i(o4nVar.b, 2), w3iVar, o4nVar.c, y3iVar, null, 64);
                    } else if (obj3 instanceof p4n) {
                        p4n p4nVar = (p4n) obj3;
                        j4iVar = new k4i(p4nVar.f26361a, null, w3iVar, p4nVar.b, y3iVar, null, 68);
                    } else {
                        if (!(obj3 instanceof q4n)) {
                            t9f.b();
                            return null;
                        }
                        q4n q4nVar = (q4n) obj3;
                        j4iVar = new j4i(q4nVar.f28106a, null, q4nVar.b, y3iVar, null, 68);
                    }
                    aac.i(jm40.b, j4iVar, function2, fetVar2, 384, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 8:
                v0v0 v0v0Var = (v0v0) obj5;
                cml0 cml0Var = (cml0) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    k7x.a(((zll0) cml0Var).b.a(), null, jpm0.u(o7k0.n(jm40Var, 120.0f), v0v0Var), gqw0.A, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundGroupSecondary(), 5), fetVar3, 1572912, 1720);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 9:
                cml0 cml0Var2 = (cml0) obj5;
                Function1 function3 = (Function1) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kol0 kol0VarD = cml0Var2.d();
                    long jA = cml0Var2.a();
                    kol0VarD.getClass();
                    function3.getClass();
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f(Long.valueOf(jA), fetVar4);
                    Object objP2 = fetVar4.P();
                    if (objP2 == cl5Var) {
                        objP2 = new jg2(function3, pz40VarF2, (byte) 10);
                        fetVar4.o0(objP2);
                    }
                    Function1 function4 = (Function1) objP2;
                    fetVar4.e0(-1258569470);
                    if (kol0VarD instanceof fol0) {
                        fol0 fol0Var = (fol0) kol0VarD;
                        j4iVar2 = new i4i(false, fol0Var.f9887a, null, fol0Var.d, fol0Var.c, fol0Var.b, null, 68);
                    } else if (kol0VarD instanceof gol0) {
                        gol0 gol0Var = (gol0) kol0VarD;
                        j4iVar2 = new k4i(gol0Var.f11636a, null, gol0Var.d, gol0Var.c, gol0Var.b, null, 68);
                    } else if (kol0VarD instanceof hol0) {
                        hol0 hol0Var = (hol0) kol0VarD;
                        j4iVar2 = new l4i(hol0Var.f13399a, hol0Var.b, hol0Var.c, hol0Var.f, hol0Var.e, hol0Var.d, null, 64);
                    } else if (kol0VarD instanceof iol0) {
                        iol0 iol0Var = (iol0) kol0VarD;
                        j4iVar2 = new k4i(iol0Var.f15123a, null, iol0Var.d, iol0Var.c, iol0Var.b, null, 68);
                    } else {
                        if (!(kol0VarD instanceof jol0)) {
                            t9f.b();
                            return null;
                        }
                        jol0 jol0Var = (jol0) kol0VarD;
                        j4iVar2 = new j4i(jol0Var.f16864a, null, jol0Var.c, jol0Var.b, null, 68);
                    }
                    aac.i(jm40.b, j4iVar2, function4, fetVar4, 384, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                feb.q((mm40) obj4, (eol0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                ieb.s((mm40) obj4, (ull0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                zjb.l((mm40) obj4, (ejm0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                bkb.k((mm40) obj4, (sjm0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                nkb.k((mm40) obj4, (u6n) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                List list = (List) obj5;
                sso0 sso0Var = (sso0) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        j6n.h((String) it.next(), sso0Var, null, 0, 0, fetVar5, 0, 28);
                    }
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 16:
                String str = (String) obj5;
                sso0 sso0Var2 = (sso0) obj4;
                boolean z2 = false;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if ((iIntValue6 & 3) != 2) {
                    z2 = true;
                }
                if (fetVar6.U(iIntValue6 & 1, z2)) {
                    j6n.h(str, sso0Var2, null, 0, 0, fetVar6, 0, 28);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                dtb.q((mm40) obj4, (ny1) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                ntb.A((mm40) obj4, (q6n) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                e2d e2dVar = (e2d) obj5;
                q6n q6nVar = (q6n) obj4;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 92.0f);
                    boolean zG = fetVar7.g(e2dVar);
                    Object objP3 = fetVar7.P();
                    if (zG || objP3 == cl5Var) {
                        objP3 = new o6n(e2dVar, b2);
                        fetVar7.o0(objP3);
                    }
                    ntb.A(i4w0.T(mm40VarE, (Function1) objP3), q6nVar, fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 20:
                gan ganVar = (gan) obj5;
                mm40 mm40Var2 = (mm40) obj4;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j0x.b(a8k0.F(ganVar.c.f20977a, 0, fetVar8), "", mm40Var2, null, null, 0.0f, null, fetVar8, 56, 120);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 21:
                jan janVar = (jan) obj5;
                mm40 mm40Var3 = (mm40) obj4;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    j0x.b(a8k0.F(janVar.c.f20977a, 0, fetVar9), "", mm40Var3, null, null, 0.0f, null, fetVar9, 56, 120);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                tdc.n((mm40) obj4, (rse) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                onn onnVar = (onn) obj5;
                Function1 function5 = (Function1) obj4;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    hmw0.u(null, onnVar.f25555a, function5, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 24:
                inn innVar = (inn) obj2;
                ((oyg0) obj).getClass();
                innVar.getClass();
                ocl oclVar = ((wnn) obj5).E;
                return inn.a(innVar, null, false, null, null, ((vqc) oclVar.f25032a).d(), new mnn((hxu) obj4, ((vqc) oclVar.f25032a).d().c), false, false, null, 0L, false, 32383);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                vfc.w((mm40) obj4, (vfs) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                obb.v((mm40) obj4, (isn) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                acb.t((mm40) obj4, (jsn) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                jcb.p((mm40) obj4, (ksn) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ieb.t((vtn) obj5, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ d0n(byte b, int i, mm40 mm40Var, Object obj) {
        this.f5276a = b;
        this.b = mm40Var;
        this.c = obj;
    }

    public /* synthetic */ d0n(Object obj, Object obj2, byte b) {
        this.f5276a = b;
        this.c = obj;
        this.b = obj2;
    }
}
