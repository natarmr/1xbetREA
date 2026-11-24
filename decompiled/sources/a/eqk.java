package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eqk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8241a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eqk(l7m0 l7m0Var, e2d e2dVar, Function0 function0, Function1 function1) {
        this.f8241a = (byte) 27;
        this.d = l7m0Var;
        this.c = e2dVar;
        this.e = function0;
        this.b = function1;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x03e7  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Integer numValueOf;
        byte b = this.f8241a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dyb.F((lpk) obj6, (l7m0) obj5, (xcz) obj4, (Function1) obj3, (fet) obj, x8x.L(3129));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ozb.q((gqk) obj6, (qdz) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                bfb.m((mm40) obj6, (cc0) obj5, (akl) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                sj3.k((mm40) obj6, (onl) obj5, (pnl) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                List list = (List) obj6;
                b0i b0iVar = (b0i) obj5;
                Function1 function1 = (Function1) obj3;
                Function2 function2 = (Function2) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        wvb.j(jm40.b, (gol) it.next(), b0iVar, function1, function2, fetVar, 6, 0);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ibc.l((mm40) obj6, (cw1) obj5, (fw1) obj4, (hh80) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                mbc.C((mm40) obj6, (o0x) obj5, (String) obj4, (String) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                lmc.j((mm40) obj6, (l5i) obj5, (nrl) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                nkb.q((String) obj6, (String) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                f7k.h((mm40) obj6, (ao60) obj5, (Function1) obj3, (Function0) obj4, (fet) obj, x8x.L(391));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                kpb.h((mm40) obj6, (ov60) obj5, (Function0) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                vfc.m((mm40) obj6, (wxl) obj5, (grq) obj4, (Function0) obj3, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                vdb.e((mm40) obj6, (String) obj5, (y3d) obj4, (y3d) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                vdb.g((mm40) obj6, (v6n) obj5, (y3d) obj4, (y3d) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                r5m r5mVar = (r5m) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function3 = (Function0) obj4;
                Function0 function4 = (Function0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jm40 jm40Var = jm40.b;
                    bkb.z(o7k0.d(jm40Var, 1.0f), r5mVar, function0, function3, function4, fetVar2, 6);
                    zcl zclVar = qmk.f28987a;
                    bkb.r(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), r5mVar, fetVar2, 0);
                    f5m f5mVar = r5mVar.h;
                    lgb.r(r5mVar, (f5mVar.f8968a == null && f5mVar.b == null) ? false : true, s5x0.b, fetVar2, 384);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 15:
                u5m u5mVar = (u5m) obj6;
                Function0 function5 = (Function0) obj5;
                Function0 function6 = (Function0) obj4;
                Function0 function7 = (Function0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    ahb.a(s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13), u5mVar.b, u5mVar.c, u5mVar.d, function5, function6, function7, fetVar3, 0);
                    ckb.H(0, fetVar3, s5x0.N(o7k0.d(jm40Var2, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), u5mVar.f35102a);
                    if (u5mVar.e == null) {
                        f5m f5mVar2 = u5mVar.f;
                        z = (f5mVar2.f8968a == null && f5mVar2.b == null) ? false : true;
                    }
                    lgb.r(u5mVar, z, cfx0.j, fetVar3, 384);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                nkb.r((mm40) obj6, (h6m) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                tlb.v((mm40) obj6, (e8n) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                unh0.y((mm40) obj6, (cmm) obj5, (Function1) obj3, (Function1) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                w6k w6kVar = (w6k) obj6;
                final omm ommVar = (omm) obj5;
                xk80 xk80Var = (xk80) obj4;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                List listK = c5n0Var.k(n9k0.b, new ugd(-800746046, true, new p5m(ommVar, (Function1) obj3, (byte) 14)));
                final ArrayList arrayList = new ArrayList(r3d.q(listK, 10));
                Iterator it2 = listK.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((pj30) it2.next()).S(p4e.b(p4eVar.f26347a, 0, 0, 0, 0, 11)));
                }
                List listK2 = c5n0Var.k(n9k0.c, new ugd(-1888423094, true, new p5m(ommVar, xk80Var, (byte) 15)));
                final ArrayList arrayList2 = new ArrayList(r3d.q(listK2, 10));
                Iterator it3 = listK2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((pj30) it3.next()).S(p4e.b(p4eVar.f26347a, 0, 0, 0, 0, 11)));
                }
                zcl zclVar3 = qmk.f28987a;
                final int iW0 = (int) c5n0Var.w0(320.0f);
                Iterator it4 = arrayList.iterator();
                Integer num = null;
                if (it4.hasNext()) {
                    numValueOf = Integer.valueOf(((pu90) it4.next()).b);
                    while (it4.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((pu90) it4.next()).b);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                } else {
                    numValueOf = null;
                }
                int iIntValue4 = numValueOf != null ? numValueOf.intValue() : 0;
                List listK3 = c5n0Var.k(n9k0.f23145a, new ugd(-901418096, true, new mmm(xk80Var, ommVar, w6kVar.r0(iIntValue4))));
                final ArrayList arrayList3 = new ArrayList(r3d.q(listK3, 10));
                Iterator it5 = listK3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((pj30) it5.next()).S(p4eVar.f26347a));
                }
                Iterator it6 = arrayList3.iterator();
                if (it6.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(((pu90) it6.next()).b);
                    while (true) {
                        num = numValueOf3;
                        while (true) {
                            if (it6.hasNext()) {
                                numValueOf3 = Integer.valueOf(((pu90) it6.next()).b);
                                if (num.compareTo(numValueOf3) < 0) {
                                }
                            }
                        }
                    }
                }
                final int iIntValue5 = num != null ? num.intValue() : 0;
                final int i = iIntValue5 - iIntValue4;
                return vj30.x(c5n0Var, p4e.i(p4eVar.f26347a), iIntValue5, new Function1() { // from class: a.nmm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        ou90 ou90Var = (ou90) obj7;
                        ou90Var.getClass();
                        Iterator it7 = arrayList3.iterator();
                        while (it7.hasNext()) {
                            ou90Var.g((pu90) it7.next(), 0, 0, 0.0f);
                        }
                        ommVar.getClass();
                        Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            ou90Var.g((pu90) it8.next(), 0, iIntValue5 - iW0, 0.0f);
                        }
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            ou90Var.g((pu90) it9.next(), 0, i, 0.0f);
                        }
                        return Unit.f46060a;
                    }
                });
            case 20:
                ((Integer) obj2).getClass();
                dub.z((mm40) obj6, (omm) obj5, (xk80) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                slb.q((mm40) obj6, (xgm) obj5, (xgm) obj4, (ugd) obj3, (fet) obj, x8x.L(3073));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                plc.n((mm40) obj6, (String) obj5, (y9q0) obj4, (ugd) obj3, (fet) obj, x8x.L(24577));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                vcc.m((mm40) obj6, (ArrayList) obj5, (xcz) obj4, (Function2) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                thb.l((mm40) obj6, (mfa) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                f7k.z((a4x) obj6, (dxh0) obj5, (Function0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                o2e.r((h8l0) obj6, (e2d) obj5, (a4x) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                l7m0 l7m0Var = (l7m0) obj5;
                e2d e2dVar = (e2d) obj6;
                Function0 function8 = (Function0) obj4;
                Function1 function9 = (Function1) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ysv ysvVar = ((qnp) l7m0Var.getValue()).f29041a;
                    if (ysvVar instanceof usv) {
                        fetVar4.e0(1703720418);
                        o2e.C(0, e2dVar, fetVar4, (usv) ysvVar, null, function8, function9);
                        fetVar4.r(false);
                    } else {
                        if (!ysvVar.equals(vsv.f37972a)) {
                            throw b1j.f(1703717528, fetVar4, false);
                        }
                        fetVar4.e0(1275966929);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                saj.w((mm40) obj6, (l7m0) obj5, (qdz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                vbc.C((mm40) obj6, (wui0) obj5, (e1w) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ eqk(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f8241a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    public /* synthetic */ eqk(Object obj, Object obj2, Function1 function1, wdr wdrVar, int i, byte b) {
        this.f8241a = b;
        this.c = obj;
        this.d = obj2;
        this.b = function1;
        this.e = wdrVar;
    }

    public /* synthetic */ eqk(Object obj, Object obj2, Function1 function1, Object obj3, byte b) {
        this.f8241a = b;
        this.c = obj;
        this.d = obj2;
        this.b = function1;
        this.e = obj3;
    }

    public /* synthetic */ eqk(Object obj, Function0 function0, Function0 function1, Function0 function2, byte b) {
        this.f8241a = b;
        this.c = obj;
        this.d = function0;
        this.e = function1;
        this.b = function2;
    }
}
