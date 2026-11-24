package a;

import android.util.Log;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feature.office.payment.impl.di.navigation.PaymentScreenFactoryImpl$getPaymentScreen$1;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class qv3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv3(rrd rrdVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        tl5 tl5Var = tl5.f34128a;
        this.k = rrdVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new qv3((rv3) obj2, yjeVar, (byte) 0);
            case 1:
                return new qv3((nhf0) obj2, yjeVar, (byte) 1);
            case 2:
                qv3 qv3Var = new qv3((kc4) obj2, yjeVar, (byte) 2);
                qv3Var.j = ((Boolean) obj).booleanValue();
                return qv3Var;
            case 3:
                qv3 qv3Var2 = new qv3((mg4) obj2, yjeVar, (byte) 3);
                qv3Var2.j = ((Boolean) obj).booleanValue();
                return qv3Var2;
            case 4:
                return new qv3((zr4) obj2, yjeVar, (byte) 4);
            case 5:
                qv3 qv3Var3 = new qv3((rw4) obj2, yjeVar, (byte) 5);
                qv3Var3.j = ((Boolean) obj).booleanValue();
                return qv3Var3;
            case 6:
                qv3 qv3Var4 = new qv3((g85) obj2, yjeVar, (byte) 6);
                qv3Var4.j = ((Boolean) obj).booleanValue();
                return qv3Var4;
            case 7:
                return new qv3((cg5) obj2, yjeVar, (byte) 7);
            case 8:
                qv3 qv3Var5 = new qv3((ej5) obj2, yjeVar, (byte) 8);
                qv3Var5.j = ((Boolean) obj).booleanValue();
                return qv3Var5;
            case 9:
                tl5 tl5Var = tl5.f34128a;
                return new qv3((rrd) obj2, yjeVar);
            case 10:
                return new qv3((a56) obj2, yjeVar, (byte) 10);
            case 11:
                qv3 qv3Var6 = new qv3((kt6) obj2, yjeVar, (byte) 11);
                qv3Var6.j = ((Boolean) obj).booleanValue();
                return qv3Var6;
            case 12:
                return new qv3((yy7) obj2, yjeVar, (byte) 12);
            case 13:
                qv3 qv3Var7 = new qv3((z28) obj2, yjeVar, (byte) 13);
                qv3Var7.j = ((Boolean) obj).booleanValue();
                return qv3Var7;
            case 14:
                qv3 qv3Var8 = new qv3((d48) obj2, yjeVar, (byte) 14);
                qv3Var8.j = ((Boolean) obj).booleanValue();
                return qv3Var8;
            case 15:
                return new qv3((v88) obj2, yjeVar, (byte) 15);
            case 16:
                qv3 qv3Var9 = new qv3((ld8) obj2, yjeVar, (byte) 16);
                qv3Var9.j = ((Boolean) obj).booleanValue();
                return qv3Var9;
            case 17:
                qv3 qv3Var10 = new qv3((lf8) obj2, yjeVar, (byte) 17);
                qv3Var10.j = ((Boolean) obj).booleanValue();
                return qv3Var10;
            case 18:
                return new qv3((tj8) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new qv3((yj8) obj2, yjeVar, (byte) 19);
            case 20:
                return new qv3((e09) obj2, yjeVar, (byte) 20);
            case 21:
                qv3 qv3Var11 = new qv3((s79) obj2, yjeVar, (byte) 21);
                qv3Var11.j = ((Boolean) obj).booleanValue();
                return qv3Var11;
            case 22:
                return new qv3((or9) obj2, yjeVar, (byte) 22);
            case 23:
                return new qv3((gu9) obj2, yjeVar, (byte) 23);
            case 24:
                return new qv3((qw9) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new qv3((nx9) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new qv3((tw2) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new qv3((q7a) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new qv3((u2g0) obj2, yjeVar, (byte) 28);
            default:
                qv3 qv3Var12 = new qv3((yya) obj2, yjeVar, (byte) 29);
                qv3Var12.j = ((Boolean) obj).booleanValue();
                return qv3Var12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qv3) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((qv3) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((qv3) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((qv3) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((qv3) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((qv3) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((qv3) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((qv3) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((qv3) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                return ((qv3) create(bool10, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                return ((qv3) create(bool11, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((qv3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                return ((qv3) create(bool12, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        ?? arrayList;
        Object objI;
        Object objJ;
        Object value;
        Object objW;
        Object value2;
        Object value3;
        Object objK;
        Object value4;
        Object objK2;
        Object value5;
        Object objL;
        byte b = this.i;
        p0w0 p0w0Var = p0w0.f26173a;
        byte b2 = 25;
        byte b3 = 13;
        int i = 2;
        int i2 = 3;
        byte b4 = 0;
        Object obj2 = this.k;
        ?? arrayList2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        switch (b) {
            case 0:
                rv3 rv3Var = (rv3) obj2;
                wne wneVar = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(new eu4(Boolean.TRUE, (byte) 12));
                    bm3 bm3Var = new bm3(rv3Var, b3);
                    this.j = true;
                    if (gmqVarW.c(bm3Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                nhf0 nhf0Var = (nhf0) obj2;
                knf0 knf0Var = (knf0) nhf0Var.b;
                wne wneVar2 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    h03 h03Var = (h03) nhf0Var.f23530a;
                    String strA = ((btt0) nhf0Var.c).a();
                    String strA2 = knf0Var.a();
                    String strC = knf0Var.c();
                    this.j = true;
                    objA = ((p84) ((zm) h03Var.b).invoke()).a(strA, strA2, 1, strC, this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                m84 m84Var = (m84) ((q16) objA).a();
                List list = m84Var.f21352a;
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(x8f.e0((j84) it.next()));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                List list2 = m84Var.b;
                if (list2 != null) {
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(x8f.e0((j84) it2.next()));
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                return new d84(arrayList, arrayList2);
            case 2:
                boolean z10 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                kc4 kc4Var = (kc4) obj2;
                if (((mb4) kc4Var.D()).g.c.length() == 0 && z10) {
                    kc4Var.Q();
                }
                return Unit.f46060a;
            case 3:
                boolean z11 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (z11) {
                    i1w0 i1w0Var = ((mg4) obj2).o;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                zr4 zr4Var = (zr4) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    if (zr4Var.b) {
                        rou rouVar = zr4Var.c;
                        this.j = true;
                        if (rouVar.a(true, this) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var2 = zr4Var.d;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 5:
                boolean z13 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (z13) {
                    gfk0 gfk0Var = rw4.W1;
                    fy4 fy4VarI0 = ((rw4) obj2).I0();
                    fy4VarI0.I();
                    fy4VarI0.D();
                }
                return Unit.f46060a;
            case 6:
                g85 g85Var = (g85) obj2;
                boolean z14 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (z14 && (((s75) g85Var.D()).f31733a.f21251a || ((s75) g85Var.D()).f31733a.b)) {
                    g85Var.O();
                }
                return Unit.f46060a;
            case 7:
                cg5 cg5Var = (cg5) obj2;
                p7m0 p7m0Var = cg5Var.j;
                wne wneVar8 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    if (cg5Var.e.f15225a.a()) {
                        pn pnVar = new pn(cg5Var, z ? 1 : 0, (byte) 9);
                        this.j = true;
                        objI = j0x.I("updateUserBalancesUseCase", 5L, 0L, pnVar, this, 12);
                        if (objI == wneVar8) {
                            return wneVar8;
                        }
                    } else {
                        p7m0Var.o(null, i8d.c);
                    }
                    return Unit.f46060a;
                }
                if (!z15) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objI = ((j0g0) obj).f15681a;
                z1x.P(objI);
                p7m0Var.o(null, i8d.c);
                return Unit.f46060a;
            case 8:
                ej5 ej5Var = (ej5) obj2;
                boolean z16 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (z16) {
                    ii iiVar = ej5Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH = ej5Var.H(R.string.caution);
                    String strH2 = ej5Var.H(R.string.payment_balance_error);
                    String strH3 = ej5Var.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, ej5Var.H(R.string.cancel), (String) null, "PAYMENT_ERROR_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC = ej5Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                    p7m0 p7m0Var2 = ej5Var.H0().Z;
                    Boolean bool = Boolean.FALSE;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, bool);
                }
                return Unit.f46060a;
            case 9:
                rrd rrdVar = (rrd) obj2;
                wne wneVar10 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    String strA3 = ((btt0) rrdVar.g).a();
                    tl5 tl5Var = tl5.f34128a;
                    this.j = true;
                    objJ = rrdVar.j(strA3, tl5Var, this);
                    if (objJ == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objJ = obj;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : (Iterable) objJ) {
                    if (((ql5) obj3).i != txs0.b) {
                        arrayList3.add(obj3);
                    }
                }
                rrdVar.D(arrayList3);
                return arrayList3;
            case 10:
                a56 a56Var = (a56) obj2;
                wne wneVar11 = wne.f39444a;
                boolean z18 = this.j;
                if (z18) {
                    if (z18) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                s6n0 s6n0VarB = a56Var.e().b();
                cm3 cm3Var = new cm3(a56Var, z2 ? 1 : 0, (byte) 23);
                this.j = true;
                s6n0VarB.c(new vnq(h660.f12515a, cm3Var, (byte) 2), this);
                return wneVar11;
            case 11:
                boolean z19 = this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                bj5 bj5Var = kt6.Q1;
                ((kt6) obj2).G0().e.setVisibility(z19 ? (byte) 0 : (byte) 8);
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    this.j = true;
                    if (((yy7) obj2).i(this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                boolean z21 = this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = ((z28) obj2).i;
                do {
                    value = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value, v28.a((v28) value, null, false, z21, 7)));
                return Unit.f46060a;
            case 14:
                boolean z22 = this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                d48 d48Var = (d48) obj2;
                d48Var.J = z22;
                if (z22 && d48Var.E == 0) {
                    sac.V(jiu0.a(d48Var), new ye7(1, d48Var, d48.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, d48Var.d.f22085a, new oa((Object) d48Var, (yje) (z3 ? 1 : 0), b2), 10);
                }
                return Unit.f46060a;
            case 15:
                v88 v88Var = (v88) obj2;
                wne wneVar16 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    abu abuVar = v88Var.d;
                    this.j = true;
                    objW = abuVar.w(this);
                    if (objW == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objW = obj;
                }
                if (((Boolean) objW).booleanValue()) {
                    i1w0 i1w0Var3 = v88Var.f;
                    if (i1w0Var3 == null) {
                        Intrinsics.h("internalRouter");
                        throw null;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new f1w0(drm0.e(v88Var.e))), i1w0Var3, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorP3;
                        if (pawVar3.hasNext()) {
                            i1w0Var3.a((oe50) pawVar3.next());
                        }
                    }
                } else {
                    long j = v88Var.i;
                    boolean z24 = v88Var.h;
                    i1w0 i1w0Var4 = v88Var.f;
                    if (i1w0Var4 == null) {
                        Intrinsics.h("internalRouter");
                        throw null;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    FragmentScreen paymentScreenFactoryImpl$getPaymentScreen$1 = new PaymentScreenFactoryImpl$getPaymentScreen$1(v88Var.f36969a, z24, j);
                    if (paymentScreenFactoryImpl$getPaymentScreen$1 instanceof DialogScreen) {
                        copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentScreenFactoryImpl$getPaymentScreen$1)));
                    } else {
                        copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(paymentScreenFactoryImpl$getPaymentScreen$1)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var4, copyOnWriteArrayList2, 0);
                    while (true) {
                        paw pawVar4 = (paw) listIteratorO;
                        if (pawVar4.hasNext()) {
                            i1w0Var4.a((oe50) pawVar4.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 16:
                boolean z25 = this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                ld8 ld8Var = (ld8) obj2;
                if (!ld8Var.C && z25) {
                    ld8Var.M(false, false);
                }
                ld8Var.C = z25;
                return Unit.f46060a;
            case 17:
                boolean z26 = this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                lf8 lf8Var = (lf8) obj2;
                int i3 = lf8.J;
                p7m0 p7m0Var4 = lf8Var.i.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                } while (!p7m0Var4.m(value2, df8.a((df8) value2, false, z26, false, null, null, null, 125)));
                if (!z26 && ((df8) lf8Var.D()).e.isEmpty()) {
                    lf8Var.Q();
                }
                return Unit.f46060a;
            case 18:
                tj8 tj8Var = (tj8) obj2;
                ocj ocjVar = tj8Var.i;
                wne wneVar19 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    int i4 = tj8.u;
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var5.getValue();
                        value3.getClass();
                    } while (!p7m0Var5.m(value3, pj8.a((pj8) value3, null, false, false, null, 29)));
                    jtj jtjVar = tj8Var.o;
                    this.j = true;
                    objK = jtjVar.k(this);
                    if (objK == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                of8 of8Var = (of8) objK;
                String str = tj8Var.p.a().d.f27973a.b;
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var6.getValue();
                    value4.getClass();
                } while (!p7m0Var6.m(value4, pj8.a((pj8) value4, str, false, of8Var.f25152a, of8Var.b, 18)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                yj8 yj8Var = (yj8) obj2;
                wne wneVar20 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    jtj jtjVar2 = yj8Var.b;
                    this.j = true;
                    objK2 = jtjVar2.k(this);
                    if (objK2 == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK2 = obj;
                }
                of8 of8Var2 = (of8) objK2;
                String str2 = yj8Var.c.a().d.f27973a.b;
                boolean z29 = of8Var2.f25152a;
                ArrayList arrayList4 = of8Var2.b;
                ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new nf8((mf8) it3.next(), str2));
                }
                sac.V(jiu0.a(yj8Var), new nk7((byte) 19), null, yj8Var.d.c, new xw5(yj8Var, new wj8(arrayList5, z29), z4 ? 1 : 0, b2), 10);
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    gut gutVar = ((e09) obj2).s;
                    iun iunVar = iun.f15405a;
                    this.j = true;
                    Object objE = ((gw8) gutVar.f11947a.f6397a).e(iunVar, this);
                    if (objE != wneVar21) {
                        objE = Unit.f46060a;
                    }
                    if (objE != wneVar21) {
                        objE = Unit.f46060a;
                    }
                    if (objE == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                boolean z31 = this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                s79 s79Var = (s79) obj2;
                if (z31) {
                    int i5 = s79.A;
                    p7m0 p7m0Var7 = s79Var.i.f25029a;
                    do {
                        value5 = p7m0Var7.getValue();
                        value5.getClass();
                        s79Var.f.getClass();
                    } while (!p7m0Var7.m(value5, o79.a((o79) value5, true, false, false, false, null, null, false, null, 32191)));
                } else {
                    int i6 = s79.A;
                    s79Var.v.o(((o79) s79Var.D()).o);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z32 = this.j;
                if (z32) {
                    if (z32) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                or9 or9Var = (or9) obj2;
                ok50 ok50Var = or9Var.f25725a;
                String strA4 = or9Var.c.a();
                this.j = true;
                Object objB = ((qu9) ((zm) ok50Var.f25390a).invoke()).b(strA4, this);
                return objB == wneVar23 ? wneVar23 : objB;
            case 23:
                gu9 gu9Var = (gu9) obj2;
                wne wneVar24 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    lef0 lef0Var = gu9Var.p;
                    long j2 = gu9Var.q;
                    int i7 = ((eu9) gu9Var.D()).f8409a;
                    String str3 = ((eu9) gu9Var.D()).b;
                    this.j = true;
                    if (((yzn0) lef0Var.f19899a).r(i7, j2, this, str3) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i8 = gu9.s;
                gu9Var.G(bu9.f3221a);
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z34 = this.j;
                if (!z34) {
                    z1x.P(obj);
                    qw9 qw9Var = (qw9) obj2;
                    bq9 bq9Var = qw9Var.j;
                    k19 k19Var = new k19(qw9Var, b3);
                    this.j = true;
                    if (bq9Var.c(k19Var, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z34) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z35 = this.j;
                if (!z35) {
                    z1x.P(obj);
                    this.j = true;
                    Log.d("CXCP", "CameraBackends#shutdown");
                    LinkedHashMap linkedHashMap = ((nx9) obj2).c;
                    ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
                    Iterator it4 = linkedHashMap.entrySet().iterator();
                    while (it4.hasNext()) {
                        wv9 wv9Var = (wv9) ((Map.Entry) it4.next()).getValue();
                        wv9Var.getClass();
                        Log.d("CXCP", "Camera2Backend#shutdownAsync");
                        d5c.G(wv9Var.b.e, null);
                        arrayList6.add(qjj.M(wv9Var.f39829a.f28496a, null, new ex1((Object) wv9Var, (yje) (z5 ? 1 : 0), (byte) 20), 3));
                    }
                    Object objT = qjj.T(arrayList6, this);
                    Object obj4 = objT;
                    if (objT != wne.f39444a) {
                        obj4 = Unit.f46060a;
                    }
                    if (obj4 == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z35) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                tw2 tw2Var = (tw2) obj2;
                Object hw70Var = wne.f39444a;
                boolean z36 = this.j;
                if (!z36) {
                    z1x.P(obj);
                    p7m0 p7m0Var8 = tw2Var.u;
                    pd pdVar = new pd(i, z6 ? 1 : 0, (byte) 24);
                    this.j = true;
                    objL = ntb.L(p7m0Var8, pdVar, this);
                    if (objL != hw70Var) {
                    }
                    return hw70Var;
                }
                if (!z36) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objL = obj;
                p2a p2aVar = (p2a) objL;
                if (p2aVar instanceof u2a) {
                    hw70Var = new hw70(tw2Var, null, 2);
                } else if (p2aVar instanceof t2a) {
                    tw2Var.a();
                    hw70Var = new hw70(null, ((t2a) p2aVar).f33205a, 1);
                } else {
                    if (!(p2aVar instanceof s2a)) {
                        if (!(p2aVar instanceof y2a)) {
                            t9f.b();
                            return null;
                        }
                        tw2Var.a();
                        e9d0.v(p2aVar, "Unexpected CameraState: ");
                        return null;
                    }
                    tw2Var.a();
                    hw70Var = new hw70(null, ((s2a) p2aVar).i, 1);
                }
                return hw70Var;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar27 = wne.f39444a;
                boolean z37 = this.j;
                if (!z37) {
                    z1x.P(obj);
                    q7a q7aVar = (q7a) obj2;
                    this.j = true;
                    Object objC = aoq.c(q7aVar.o, new o7a(i2, z7 ? 1 : 0, b4)).c(new k19(q7aVar, (byte) 21), this);
                    if (objC != wneVar27) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z37) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar28 = wne.f39444a;
                boolean z38 = this.j;
                if (z38) {
                    if (z38) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                odd oddVar = ((u2g0) obj2).c;
                this.j = true;
                Object objQ = oddVar.q(this);
                return objQ == wneVar28 ? wneVar28 : objQ;
            default:
                boolean z39 = this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                yya yyaVar = (yya) obj2;
                p7m0 p7m0Var9 = yyaVar.v;
                p7m0 p7m0Var10 = yyaVar.u;
                String str4 = ((wya) p7m0Var10.getValue()).c;
                if (yyaVar.s && !((wya) p7m0Var10.getValue()).f39964a.isEmpty()) {
                    b4 = 1;
                }
                if (z39) {
                    if (z39 && !yyaVar.r && !yyaVar.s) {
                        yyaVar.w(yyaVar.t);
                    } else if (z39 && !yyaVar.r && yyaVar.s && str4 != null) {
                        yyaVar.y(yyaVar.t, str4);
                    } else if (z39 && !yyaVar.r && yyaVar.s && str4 == null) {
                        p7m0Var9.n(null);
                    }
                } else if (b4 == 0) {
                    ra10 ra10VarB = sa10.b(yyaVar.h, pb10.g, R.string.data_retrieval_error, 0, null, 28);
                    p7m0Var9.getClass();
                    p7m0Var9.o(null, ra10VarB);
                }
                yyaVar.r = z39;
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv3(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
