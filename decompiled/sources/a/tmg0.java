package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class tmg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tmg0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return new tmg0((umg0) obj2, yjeVar, (byte) 0);
            case 1:
                return new tmg0((w6h0) obj2, yjeVar, (byte) 1);
            case 2:
                return new tmg0((mjh0) obj2, yjeVar, (byte) 2);
            case 3:
                return new tmg0((goh0) obj2, yjeVar, (byte) 3);
            case 4:
                return new tmg0((iph0) obj2, yjeVar, (byte) 4);
            case 5:
                return new tmg0((c9i0) obj2, yjeVar, (byte) 5);
            case 6:
                return new tmg0((xii0) obj2, yjeVar, (byte) 6);
            case 7:
                return new tmg0((wli0) obj2, yjeVar, (byte) 7);
            case 8:
                return new tmg0((uri0) obj2, yjeVar, (byte) 8);
            case 9:
                return new tmg0((xxi0) obj2, yjeVar, (byte) 9);
            case 10:
                return new tmg0((dji0) obj2, yjeVar, (byte) 10);
            case 11:
                return new tmg0((ngj0) obj2, yjeVar, (byte) 11);
            case 12:
                return new tmg0((eoj0) obj2, yjeVar, (byte) 12);
            case 13:
                return new tmg0((ntj0) obj2, yjeVar, (byte) 13);
            case 14:
                return new tmg0((jvj0) obj2, yjeVar, (byte) 14);
            case 15:
                return new tmg0((kvj0) obj2, yjeVar, (byte) 15);
            case 16:
                return new tmg0((yxj0) obj2, yjeVar, (byte) 16);
            case 17:
                return new tmg0((fdk0) obj2, yjeVar, (byte) 17);
            case 18:
                return new tmg0((w6) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new tmg0((tpk0) obj2, yjeVar, (byte) 19);
            case 20:
                return new tmg0((ndl0) obj2, yjeVar, (byte) 20);
            case 21:
                return new tmg0((vsl0) obj2, yjeVar, (byte) 21);
            case 22:
                return new tmg0((w3m0) obj2, yjeVar, (byte) 22);
            case 23:
                return new tmg0((rqm0) obj2, yjeVar, (byte) 23);
            case 24:
                return new tmg0((a3n0) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new tmg0((mkn0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new tmg0((tpn0) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new tmg0((i3t0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new tmg0((umo0) obj2, yjeVar, (byte) 28);
            default:
                return new tmg0((urp0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((tmg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((tmg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((tmg0) create((dji0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((tmg0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((tmg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((tmg0) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((tmg0) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((tmg0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((tmg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((tmg0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((tmg0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((tmg0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((tmg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((tmg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((tmg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((tmg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((tmg0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tmg0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i;
        Object value2;
        Object value3;
        Object value4;
        vii0 vii0Var;
        Object value5;
        int i2;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        Object value11;
        byte b = this.i;
        byte b2 = 19;
        byte b3 = 3;
        byte b4 = 4;
        byte b5 = 2;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        byte b6 = 1;
        Integer num = 0;
        num = 0;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                umg0 umg0Var = (umg0) obj2;
                umg0Var.h.f(new qmg0(umg0Var.e.f15748a.b()));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                w6h0 w6h0Var = (w6h0) obj2;
                c7h0 c7h0Var = w6h0Var.f.f8783a.c.f2109a;
                if (c7h0Var.e != j7h0.c) {
                    sac.V(jiu0.a(w6h0Var), v6h0.f36878a, null, null, new z8b0(w6h0Var, num, (byte) 12), 14);
                    w6h0Var.x(new p6h0(c7h0Var));
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                mjh0 mjh0Var = (mjh0) obj2;
                zzp0 zzp0VarA = mjh0Var.p.a();
                zqt zqtVar = mjh0Var.o;
                lg30 lg30Var = zzp0VarA.b;
                zqtVar.getClass();
                ArrayList arrayList = (ArrayList) zqtVar.f44822a.f17481a.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((rgv0) obj3).f30457a == lg30Var) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Integer.valueOf(((rgv0) it.next()).b));
                }
                List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList3));
                p7m0 p7m0Var = mjh0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    i = zzp0VarA.f45266a;
                    listL0.getClass();
                } while (!p7m0Var.m(value, new pjh0(i, listL0)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                goh0 goh0Var = (goh0) obj2;
                zvh0 zvh0Var = goh0Var.p.a().g.x;
                p7m0 p7m0Var2 = goh0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, yph0.a((yph0) value2, zvh0Var, 0, 6)));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ((iph0) obj2).w();
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                c9i0 c9i0Var = (c9i0) obj2;
                ocj ocjVar = c9i0Var.i;
                Object objA = c9i0Var.r.a(h8i0.SELF_EXCLUSION);
                e0g0 e0g0Var = j0g0.b;
                if (!(objA instanceof g0g0)) {
                    niq0 niq0Var = (niq0) objA;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                    } while (!p7m0Var3.m(value4, z8i0.a((z8i0) value4, niq0Var.i.isEmpty(), niq0Var, 0, false, false, false, 60)));
                }
                if (j0g0.a(objA) != null) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                    } while (!p7m0Var4.m(value3, z8i0.a((z8i0) value3, true, null, 0, false, false, false, 62)));
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                xii0 xii0Var = (xii0) obj2;
                if (xii0Var != null && (vii0Var = xii0Var.f) != null) {
                    vii0Var.a(xii0Var);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                wli0 wli0Var = (wli0) obj2;
                ocj ocjVar2 = wli0Var.i;
                Object objA2 = wli0Var.r.a(((sli0) wli0Var.D()).h);
                e0g0 e0g0Var2 = j0g0.b;
                if (!(objA2 instanceof g0g0)) {
                    niq0 niq0Var2 = (niq0) objA2;
                    List list = niq0Var2.i;
                    boolean zIsEmpty = list.isEmpty();
                    sl slVar = niq0Var2.j;
                    Long l = slVar != null ? new Long(slVar.f32374a) : null;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                i3 = -1;
                            } else if (((v85) it2.next()).f36965a != jLongValue) {
                                i3++;
                            }
                        }
                        Integer num2 = new Integer(i3);
                        if (num2.intValue() >= 0) {
                            num = num2;
                        }
                    }
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    while (true) {
                        Object value12 = p7m0Var5.getValue();
                        value12.getClass();
                        sli0 sli0Var = (sli0) value12;
                        int iIntValue = num != 0 ? num.intValue() : -1;
                        int iIntValue2 = sli0Var.g;
                        if (iIntValue2 >= 0) {
                            i2 = iIntValue2;
                        } else if (num != 0) {
                            iIntValue2 = num.intValue();
                            i2 = iIntValue2;
                        } else {
                            i2 = -1;
                        }
                        niq0 niq0Var3 = niq0Var2;
                        if (!p7m0Var5.m(value12, sli0.a(sli0Var, false, false, false, zIsEmpty, niq0Var3, iIntValue, i2, 135))) {
                            niq0Var2 = niq0Var3;
                        }
                    }
                }
                if (j0g0.a(objA2) != null) {
                    p7m0 p7m0Var6 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var6.getValue();
                        value5.getClass();
                    } while (!p7m0Var6.m(value5, sli0.a((sli0) value5, false, false, false, true, null, 0, 0, 247)));
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                uri0 uri0Var = (uri0) obj2;
                mne mneVar = uri0Var.r;
                c4m0 c4m0Var = uri0Var.B;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    uri0Var.B = sac.T(new fnq(uri0Var.u.b(), new a220(uri0Var, num, (byte) 21), b4), d5c.S(jiu0.a(uri0Var), mneVar.f22085a), new tri0(b5, num, objArr == true ? 1 : 0));
                }
                sac.T(new fnq(uri0Var.z, new bai0(uri0Var, num, (byte) 8), b4), d5c.S(jiu0.a(uri0Var), mneVar.b), sri0.h);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                int i4 = xxi0.Y0;
                ((xxi0) obj2).H(new kui0((byte) 15));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                return (dji0) obj2;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                int i5 = ngj0.Y0;
                ((ngj0) obj2).H(new mej0(b2));
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                int i6 = eoj0.D;
                ((eoj0) obj2).M();
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ntj0 ntj0Var = (ntj0) obj2;
                String str = ntj0Var.f24103a;
                if (ntj0Var.c().isEmpty()) {
                    return Unit.f46060a;
                }
                Function0 function0 = ntj0Var.d;
                Boolean bool = function0 != null ? (Boolean) function0.invoke() : null;
                yum0.j(str, "getSideEffectStream", "⚠️ При подписке, доступен список необработанных эффектов " + ntj0Var.b() + "!");
                if (bool == null) {
                    ntj0Var.f();
                } else {
                    boolean zBooleanValue = bool.booleanValue();
                    p7m0 p7m0Var7 = ntj0Var.c;
                    if (p7m0Var7.getValue() == null) {
                        ktj0 ktj0Var = (ktj0) ntj0Var.c().pollLast();
                        if (zBooleanValue) {
                            yum0.j(str, "postOnReturnPending", "🚀 Отложенный эффект " + ntj0.a(ktj0Var != null ? ktj0Var.f18869a : null) + " отправлен!");
                            do {
                                value6 = p7m0Var7.getValue();
                            } while (!p7m0Var7.m(value6, ktj0Var));
                        }
                        yum0.j(str, "postOnReturnPending", "🗑️ Отложенный эффект " + ntj0.a(ktj0Var != null ? ktj0Var.f18869a : null) + " удален из очереди!");
                        ntj0Var.d = null;
                    }
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                jvj0 jvj0Var = (jvj0) obj2;
                zie0 zie0Var = jvj0.W1;
                jvj0Var.H0().c.u();
                jvj0Var.H0().c.setIsNeedClearText(true);
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                kvj0 kvj0Var = (kvj0) obj2;
                eke0 eke0Var = kvj0.S1;
                kvj0Var.L0().b.u();
                kvj0Var.L0().b.setIsNeedClearText(true);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                yxj0 yxj0Var = (yxj0) obj2;
                p7m0 p7m0Var8 = yxj0Var.W;
                Object obj4 = yxj0Var.J.c().f24244a ? yvo0.f43331a : vvo0.f38111a;
                p7m0Var8.getClass();
                p7m0Var8.o(null, obj4);
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                int i7 = fdk0.y;
                p7m0 p7m0Var9 = ((fdk0) obj2).i.f25029a;
                do {
                    value7 = p7m0Var9.getValue();
                    value7.getClass();
                } while (!p7m0Var9.m(value7, cdk0.a((cdk0) value7, null, "", null, true, false, null, false, 14327)));
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                tpk0 tpk0Var = (tpk0) obj2;
                IntRange intRange = tpk0.Z;
                bby bbyVar = tpk0Var.T;
                if (bbyVar == null || !bbyVar.isActive()) {
                    tpk0Var.T = i3t0.K(tpk0Var, null, null, new opk0(tpk0Var, num, objArr2 == true ? 1 : 0), 3);
                }
                tpk0Var.N();
                tpk0Var.P();
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                ndl0 ndl0Var = (ndl0) obj2;
                p7m0 p7m0Var10 = ndl0Var.n;
                do {
                    value8 = p7m0Var10.getValue();
                } while (!p7m0Var10.m(value8, odl0.a((odl0) value8, true, false, false, false, false, false, null, null, null, null, null, ndl0Var.x(), 4076)));
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                vsl0 vsl0Var = (vsl0) obj2;
                vzg0 vzg0Var = vsl0Var.o;
                int i8 = vsl0.F;
                long[] jArrM = vsl0Var.M();
                if (jArrM == null || jArrM.length == 0) {
                    vsl0Var.G(hsl0.f13591a);
                    return Unit.f46060a;
                }
                List list2 = ((lsl0) vsl0Var.D()).k;
                ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                int i9 = 0;
                for (Object obj5 : list2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        q3d.p();
                        throw null;
                    }
                    msl0 msl0Var = (msl0) obj5;
                    arrayList4.add(new zpl0(i9, msl0Var.f22327a, msl0Var.c));
                    i9 = i10;
                }
                if (!arrayList4.equals(((lsl0) vsl0Var.D()).f20586a)) {
                    vsl0Var.G(fsl0.f10070a);
                    return Unit.f46060a;
                }
                if (((lsl0) vsl0Var.D()).c) {
                    vsl0Var.N("");
                    vzg0Var.e("SAVED_STATE_SEARCH_EXPANDED", Boolean.FALSE);
                    vzg0Var.e("SAVED_STATE_SEARCH_QUERY", "");
                    p7m0 p7m0Var11 = vsl0Var.i.f25029a;
                    do {
                        value9 = p7m0Var11.getValue();
                        value9.getClass();
                    } while (!p7m0Var11.m(value9, lsl0.a((lsl0) value9, null, null, false, false, false, false, false, null, null, 8139)));
                    vsl0Var.G(esl0.f8335a);
                } else {
                    i1w0 i1w0Var = vsl0Var.s;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                w3m0 w3m0Var = (w3m0) obj2;
                nc5 nc5VarS = w3m0Var.y.s(org.xplatform.statistic.stage.api.domain.c.a(w3m0Var.o), w3m0Var.p, w3m0Var.A.a(), w3m0Var.r);
                p7m0 p7m0Var12 = w3m0Var.i.f25029a;
                do {
                    value10 = p7m0Var12.getValue();
                    value10.getClass();
                } while (!p7m0Var12.m(value10, l1m0.a((l1m0) value10, false, false, null, null, null, null, nc5VarS, 127)));
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                ((rqm0) obj2).w();
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                a3n0 a3n0Var = (a3n0) obj2;
                m1q0 m1q0Var = a3n0Var.F.f11725a.f15748a;
                p7m0 p7m0Var13 = m1q0Var.e;
                cre creVar = cre.d;
                p7m0Var13.n(creVar);
                q7d0 q7d0Var = m1q0Var.f21021a;
                q7d0Var.e(0, "FAKE_ID");
                q7d0Var.g("FAKE_NAME", "");
                q7d0Var.g("FAKE_CODE", "");
                ((ykt) ((pmi) a3n0Var.D.b).c).c = null;
                a3n0Var.L = creVar;
                a3n0Var.G(t0n0.f33127a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                mkn0 mkn0Var = (mkn0) obj2;
                mne mneVar2 = mkn0Var.c;
                c4m0 c4m0Var2 = mkn0Var.A;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    mkn0Var.A = sac.T(new p6d(mkn0Var.w, mkn0Var.y, new sgu(mkn0Var, num, b6), b6), d5c.S(jiu0.a(mkn0Var), mneVar2.f22085a), new tri0(b5, num, (byte) 18));
                }
                c4m0 c4m0Var3 = mkn0Var.D;
                if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                    mkn0Var.D = sac.T(new fnq(mkn0Var.p.b(), new lkn0(mkn0Var, num, objArr3 == true ? 1 : 0), b4), d5c.S(jiu0.a(mkn0Var), mneVar2.f22085a), new tri0(b5, num, b2));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                tpn0 tpn0Var = (tpn0) obj2;
                sac.V(jiu0.a(tpn0Var), new rgn0((byte) 7), null, tpn0Var.c.f22085a, new spn0(tpn0Var, num, objArr4 == true ? 1 : 0), 10);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                ((i3t0) obj2).x(jqk0.f16958a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                umo0 umo0Var = (umo0) obj2;
                nc5 nc5VarS2 = umo0Var.x.s(org.xplatform.statistic.stage.api.domain.c.a(umo0Var.o), umo0Var.p, umo0Var.y.a(), umo0Var.q);
                p7m0 p7m0Var14 = umo0Var.i.f25029a;
                do {
                    value11 = p7m0Var14.getValue();
                    value11.getClass();
                } while (!p7m0Var14.m(value11, x2m0.a((x2m0) value11, false, false, null, null, null, nc5VarS2, 95)));
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                urp0 urp0Var = (urp0) obj2;
                bby bbyVar2 = urp0Var.v;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    urp0Var.v = sac.V(jiu0.a(urp0Var), new brp0(urp0Var, b3), null, urp0Var.c.b, new rrp0(urp0Var, num, b5), 10);
                }
                return Unit.f46060a;
        }
    }
}
