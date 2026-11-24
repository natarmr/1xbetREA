package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.consultantchat.presentation.workers.UploadWorker;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodView;

/* JADX INFO: loaded from: classes3.dex */
public final class g6g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6g(k3t0 k3t0Var, vbn vbnVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = vbnVar;
        this.l = pz40Var;
    }

    private final Object l(Object obj) {
        Object value;
        lhv0 lhv0Var = (lhv0) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        x1t x1tVar = (x1t) this.k;
        x1tVar.h.b(true);
        p7m0 p7m0Var = x1tVar.m;
        kmq kmqVar = (kmq) this.l;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, j1t.a((j1t) value, lhv0Var.f20076a, lhv0Var.b, lhv0Var.c, lhv0Var.d, lhv0Var.e, false, false, false, null, false, kmqVar.getClass().getSimpleName() + BundleUtil.UNDERLINE_TAG + lhv0Var.f20076a, 16352)));
        sac.T(new fnq(i120.W(x1tVar.f.b()), new r1t(x1tVar, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(x1tVar), x1tVar.g.f22085a), s1t.h);
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        z4w z4wVar = (z4w) this.j;
        z4wVar.C(false);
        z4wVar.u.f(new j4w(((n3w) this.l).f22868a, (byte[]) this.k));
        return Unit.f46060a;
    }

    private final Object o(Object obj) throws Exception {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        gmq gmqVarC = ((i3t0) ((k3t0) this.j)).C();
        r7w r7wVar = (r7w) this.k;
        lkz lkzVar = lkz.f20223a;
        ens ensVar = new ens(2, (Function1) ((pz40) this.l).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 9);
        clz clzVarW = aac.W(r7wVar);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r1w((i89) gmqVarC, clzVarW, ensVar, (yje) null), 3);
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (b) {
            case 0:
                g6g g6gVar = new g6g(obj3, obj2, yjeVar, (byte) 0);
                g6gVar.j = obj;
                return g6gVar;
            case 1:
                g6g g6gVar2 = new g6g(obj3, obj2, yjeVar, (byte) 1);
                g6gVar2.j = obj;
                return g6gVar2;
            case 2:
                return new g6g((u8g) this.j, (ArrayList) obj3, (CyberCalendarPeriodUiModel) obj2, yjeVar, (byte) 2);
            case 3:
                return new g6g((CyberCalendarPeriodView) this.j, (List) obj3, (i9g) obj2, yjeVar, (byte) 3);
            case 4:
                g6g g6gVar3 = new g6g(obj3, obj2, yjeVar, (byte) 4);
                g6gVar3.j = obj;
                return g6gVar3;
            case 5:
                g6g g6gVar4 = new g6g(obj3, obj2, yjeVar, (byte) 5);
                g6gVar4.j = obj;
                return g6gVar4;
            case 6:
                lkz lkzVar = lkz.f20223a;
                return new g6g((k3t0) this.j, (v0j) obj3, (pz40) obj2, yjeVar);
            case 7:
                lkz lkzVar2 = lkz.f20223a;
                return new g6g((k3t0) this.j, (q1j) obj3, (pz40) obj2, yjeVar);
            case 8:
                return new g6g((wuk) this.j, (zuk) obj3, (cvk) obj2, yjeVar, (byte) 8);
            case 9:
                return new g6g((gcl) this.j, (String) obj3, (String) obj2, yjeVar, (byte) 9);
            case 10:
                lkz lkzVar3 = lkz.f20223a;
                return new g6g((k3t0) this.j, (vbn) obj3, (pz40) obj2, yjeVar);
            case 11:
                g6g g6gVar5 = new g6g(obj3, obj2, yjeVar, (byte) 11);
                g6gVar5.j = obj;
                return g6gVar5;
            case 12:
                lkz lkzVar4 = lkz.f20223a;
                return new g6g((k3t0) this.j, (s6p) obj3, (pz40) obj2, yjeVar);
            case 13:
                return new g6g((bep) this.j, (st0) obj3, (mlr) obj2, yjeVar, (byte) 13);
            case 14:
                g6g g6gVar6 = new g6g(obj3, obj2, yjeVar, (byte) 14);
                g6gVar6.j = obj;
                return g6gVar6;
            case 15:
                g6g g6gVar7 = new g6g(obj3, obj2, yjeVar, (byte) 15);
                g6gVar7.j = obj;
                return g6gVar7;
            case 16:
                g6g g6gVar8 = new g6g(obj3, obj2, yjeVar, (byte) 16);
                g6gVar8.j = obj;
                return g6gVar8;
            case 17:
                g6g g6gVar9 = new g6g(obj3, obj2, yjeVar, (byte) 17);
                g6gVar9.j = obj;
                return g6gVar9;
            case 18:
                lkz lkzVar5 = lkz.f20223a;
                return new g6g((k3t0) this.j, (q9q) obj3, (pz40) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                g6g g6gVar10 = new g6g(obj3, obj2, yjeVar, (byte) 19);
                g6gVar10.j = obj;
                return g6gVar10;
            case 20:
                return new g6g((wul) this.j, (Function1) obj3, (cgk0) obj2, yjeVar, (byte) 20);
            case 21:
                g6g g6gVar11 = new g6g(obj3, obj2, yjeVar, (byte) 21);
                g6gVar11.j = obj;
                return g6gVar11;
            case 22:
                g6g g6gVar12 = new g6g(obj3, obj2, yjeVar, (byte) 22);
                g6gVar12.j = obj;
                return g6gVar12;
            case 23:
                return new g6g((a4x) this.j, (pz40) obj3, (pz40) obj2, yjeVar, (byte) 23);
            case 24:
                g6g g6gVar13 = new g6g(obj3, obj2, yjeVar, (byte) 24);
                g6gVar13.j = obj;
                return g6gVar13;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                g6g g6gVar14 = new g6g(obj3, obj2, yjeVar, (byte) 25);
                g6gVar14.j = obj;
                return g6gVar14;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar6 = lkz.f20223a;
                return new g6g((k3t0) this.j, (vzv) obj3, (pz40) obj2, yjeVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new g6g((z4w) this.j, (byte[]) obj3, (n3w) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar7 = lkz.f20223a;
                return new g6g((k3t0) this.j, (r7w) obj3, (pz40) obj2, yjeVar);
            default:
                return new g6g((y3v) this.j, (File) obj3, (gc5) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g6g) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g6g) create((c5g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((g6g) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((g6g) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((g6g) create((k4h) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((g6g) create((vvd0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((g6g) create((vxt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((g6g) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((g6g) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((g6g) create((d1k0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((g6g) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((g6g) create((khv0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((g6g) create((lhv0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g6g) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x04d1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
        lel0 lel0Var;
        long j;
        byte b;
        Object next;
        Object value;
        Integer numValueOf;
        Integer num;
        int i;
        Object value2;
        Object value3;
        Object value4;
        byte b2 = this.i;
        String str2 = "";
        byte b3 = 6;
        long j2 = 0;
        byte b4 = 2;
        int i2 = 10;
        byte b5 = 3;
        byte b6 = 1;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (b2) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ril0 ril0Var = (ril0) obj3;
                h6g h6gVar = (h6g) obj2;
                ctf0 ctf0Var = h6gVar.l;
                CyberCalendarParams cyberCalendarParams = h6gVar.c;
                boolean z = cyberCalendarParams.d;
                list.getClass();
                ril0Var.getClass();
                ctf0Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : list) {
                    uag uagVar = (uag) obj4;
                    Iterator it = ril0Var.f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            b = b6;
                            j = j2;
                            if (((f3n0) next).f8872a != uagVar.b) {
                                b6 = b;
                                j2 = j;
                            }
                        } else {
                            j = j2;
                            b = b6;
                            next = null;
                        }
                    }
                    f3n0 f3n0Var = (f3n0) next;
                    Object arrayList = linkedHashMap.get(f3n0Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(f3n0Var, arrayList);
                    }
                    ((List) arrayList).add(obj4);
                    b6 = b;
                    j2 = j;
                }
                long j3 = j2;
                byte b7 = b6;
                ArrayList arrayList2 = new ArrayList();
                List listA0 = CollectionsKt.A0(linkedHashMap.entrySet(), new vt5((byte) 15));
                ArrayList arrayList3 = new ArrayList(r3d.q(listA0, 10));
                Iterator it2 = listA0.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    List list2 = (List) entry.getValue();
                    f3n0 f3n0Var2 = (f3n0) entry.getKey();
                    String str3 = (f3n0Var2 == null || (lel0Var = f3n0Var2.c) == null) ? null : lel0Var.f19909a;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : list2) {
                        uag uagVar2 = (uag) obj5;
                        String str4 = str2;
                        Iterator it3 = it2;
                        if (uagVar2.k > j3 && uagVar2.l > j3) {
                            arrayList4.add(obj5);
                        }
                        it2 = it3;
                        str2 = str4;
                    }
                    String str5 = str2;
                    Iterator it4 = it2;
                    List listA1 = CollectionsKt.A0(arrayList4, new vt5((byte) 16));
                    ArrayList arrayList5 = new ArrayList(r3d.q(listA1, 10));
                    Iterator it5 = listA1.iterator();
                    int i3 = 0;
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            q3d.p();
                            throw null;
                        }
                        uag uagVar3 = (uag) next2;
                        List list3 = uagVar3.i;
                        List list4 = listA1;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj6 : list3) {
                            boolean z2 = z;
                            Iterator it6 = it5;
                            if (((hag) obj6).b.length() > 0) {
                                arrayList6.add(obj6);
                            }
                            z = z2;
                            it5 = it6;
                        }
                        boolean z3 = z;
                        Iterator it7 = it5;
                        List listD0 = CollectionsKt.D0(arrayList6, 6);
                        String str6 = uagVar3.d;
                        l7g l7gVarS0 = ibc.s0(uagVar3, ril0Var);
                        r5g r5gVar = new r5g(str3, z3 ? R.drawable.ic_sport_boxing_champs_228_placeholder : R.drawable.ic_glyph_cyber_gamepad_placeholder, i3 == 0 ? b7 : 0);
                        long j4 = uagVar3.k;
                        long j5 = uagVar3.l;
                        String str7 = str3;
                        ril0 ril0Var2 = ril0Var;
                        String str8 = str5;
                        Date date = new Date(ynq0.e(j4));
                        ArrayList arrayList7 = arrayList5;
                        ArrayList arrayList8 = arrayList3;
                        Date date2 = new Date(ynq0.e(j5));
                        rdj rdjVar = rdj.f30294a;
                        ynq0 ynq0Var = new ynq0(j4);
                        sdj sdjVar = sdj.UNIQUE_2;
                        String strF = rdj.f(ynq0Var, sdjVar, null, 60);
                        String strF2 = rdj.f(new ynq0(j5), sdjVar, null, 60);
                        if (strF.length() <= 0 || !ntb.V(date, date2)) {
                            strF = kng0.l(strF, " - ", strF2);
                        }
                        String str9 = strF;
                        ArrayList arrayList9 = new ArrayList(r3d.q(listD0, 10));
                        Iterator it8 = listD0.iterator();
                        while (it8.hasNext()) {
                            arrayList9.add(((hag) it8.next()).b);
                        }
                        int size = listD0.size();
                        if (size <= 0 || list3.size() <= size) {
                            str = str8;
                        } else {
                            str = "+ " + (list3.size() - size) + Separators.SP + ctf0Var.b.a(z3 ? R.string.ufc_fighters : R.string.cyber_teams, Arrays.copyOf(new Object[0], 0));
                        }
                        arrayList7.add(new w5g(uagVar3.m, l7gVarS0, str6, r5gVar, str9, arrayList9, str, i3 == list4.size() + (-1) ? ctf0Var.d(R.dimen.space_8) : ctf0Var.d(R.dimen.space_0)));
                        arrayList5 = arrayList7;
                        listA1 = list4;
                        i3 = i4;
                        z = z3;
                        it5 = it7;
                        str3 = str7;
                        ril0Var = ril0Var2;
                        str5 = str8;
                        arrayList3 = arrayList8;
                    }
                    ArrayList arrayList10 = arrayList3;
                    arrayList10.add(Boolean.valueOf(arrayList2.addAll(arrayList5)));
                    it2 = it4;
                    arrayList3 = arrayList10;
                    z = z;
                    str2 = str5;
                }
                p7m0 p7m0Var = h6gVar.o;
                Object mchVar = arrayList2.isEmpty() ? new mch(g2v.d(h6gVar.i, cyberCalendarParams.d ? pb10.r : ozb.J(-1L, pb10.v), null, null, R.string.calendar_no_events, 0, null, 478), j3) : new lch(arrayList2);
                p7m0Var.getClass();
                p7m0Var.o(null, mchVar);
                return Unit.f46060a;
            case 1:
                ArrayList arrayList11 = (ArrayList) obj2;
                c5g c5gVar = (c5g) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                w6g w6gVar = (w6g) obj3;
                if (Intrinsics.d(w6gVar.q, c5gVar)) {
                    return Unit.f46060a;
                }
                w6gVar.q = c5gVar;
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                calendar.set(c5gVar.f3770a, c5gVar.b, c5gVar.c);
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModelO = fre0.O(calendar.getTimeInMillis());
                boolean Z = fre0.Z(cyberCalendarPeriodUiModelO.f46479a, cyberCalendarPeriodUiModelO.b, ((CyberCalendarPeriodUiModel) CollectionsKt.U(arrayList11)).f46479a, ((CyberCalendarPeriodUiModel) CollectionsKt.d0(arrayList11)).b);
                p7m0 p7m0Var2 = w6gVar.o;
                r8g r8gVar = new r8g(new x5g(arrayList11, !Z ? new CyberCalendarPeriodUiModel(((CyberCalendarPeriodUiModel) CollectionsKt.U(arrayList11)).f46479a, ((CyberCalendarPeriodUiModel) CollectionsKt.d0(arrayList11)).b) : cyberCalendarPeriodUiModelO, y5g.f42044a), kotlin.collections.a.c(new x5g(arrayList11, cyberCalendarPeriodUiModelO, y5g.b)));
                p7m0Var2.getClass();
                p7m0Var2.o(null, r8gVar);
                p7m0 p7m0Var3 = w6gVar.n;
                if (Intrinsics.d(p7m0Var3.getValue(), o6g.f24734a) || (p7m0Var3.getValue() instanceof n6g)) {
                    long j6 = !Z ? ((CyberCalendarPeriodUiModel) CollectionsKt.U(arrayList11)).f46479a : cyberCalendarPeriodUiModelO.f46479a;
                    bby bbyVar = w6gVar.t;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    w6gVar.t = sac.V(jiu0.a(w6gVar), new s6g(w6gVar, b4), null, w6gVar.j.f22085a, new v6g(j6, w6gVar, arrayList11, cyberCalendarPeriodUiModelO, null), 10);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                u8g u8gVar = (u8g) this.j;
                calendar2.setTimeInMillis(u8gVar.c.f46479a);
                c5g c5gVar2 = new c5g(calendar2.get(1), calendar2.get(2), calendar2.get(5), calendar2.get(5), yag.d, false);
                ArrayList arrayList12 = (ArrayList) obj3;
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = (CyberCalendarPeriodUiModel) obj2;
                bby bbyVar2 = u8gVar.q;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                u8gVar.q = sac.V(jiu0.a(u8gVar), new p8g(u8gVar, b5), null, u8gVar.j.f22085a, new kv(u8gVar, arrayList12, c5gVar2, cyberCalendarPeriodUiModel, null, (byte) 8), 10);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                CyberCalendarPeriodView cyberCalendarPeriodView = (CyberCalendarPeriodView) this.j;
                i9g i9gVar = (i9g) obj2;
                int i5 = CyberCalendarPeriodView.p;
                cyberCalendarPeriodView.getClass();
                ArrayList arrayList13 = new ArrayList();
                for (CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel2 : (List) obj3) {
                    long j7 = cyberCalendarPeriodUiModel2.f46479a;
                    long j8 = cyberCalendarPeriodUiModel2.b;
                    CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel3 = i9gVar.e;
                    if (fre0.Z(j7, j8, cyberCalendarPeriodUiModel3.f46479a, cyberCalendarPeriodUiModel3.b)) {
                        arrayList13.add(cyberCalendarPeriodUiModel2);
                    }
                }
                return arrayList13;
            case 4:
                Pair pair = (Pair) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                a8h a8hVar = (a8h) obj3;
                i3t0.A(a8hVar, a8hVar.y, new j230(((xum0) obj2).b, (dx7) pair.b, ((Number) pair.f46059a).longValue()), null, null, 6);
                return Unit.f46060a;
            case 5:
                vne vneVar = (vne) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                lwh lwhVar = (lwh) obj2;
                sac.T(new fnq(((m1e) obj3).b(), new u88(lwhVar, null, (byte) 10), (byte) 4), vneVar, new d7e(2, lwhVar, lwh.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 21));
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar = lkz.f20223a;
                mhc mhcVar = new mhc(2, (Function1) ((pz40) obj2).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 25);
                clz clzVarW = aac.W((v0j) obj3);
                qjj.W(x0x.Q(clzVarW.x()), null, null, new g8g((i89) gmqVarC, clzVarW, mhcVar, (yje) null, (byte) 0, false), 3);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC2 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar2 = lkz.f20223a;
                mhc mhcVar2 = new mhc(2, (Function1) ((pz40) obj2).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 26);
                clz clzVarW2 = aac.W((q1j) obj3);
                qjj.W(x0x.Q(clzVarW2.x()), null, null, new g8g((i89) gmqVarC2, clzVarW2, mhcVar2, (yje) null, (byte) 0, (byte) 0), 3);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                wuk wukVar = (wuk) this.j;
                zuk zukVar = (zuk) obj3;
                String str10 = zukVar.f45014a;
                String str11 = str10 == null ? "" : str10;
                String str12 = zukVar.b;
                String str13 = str12 == null ? "" : str12;
                cvk cvkVar = (cvk) obj2;
                String str14 = cvkVar.f5033a;
                String str15 = str14 == null ? "" : str14;
                String str16 = cvkVar.b;
                ghk0 ghk0Var = new ghk0(31, str11, str13, str15, null, null, str16 == null ? "" : str16, null, 176);
                nek nekVar = wuk.j2;
                wukVar.getClass();
                if (!ghk0Var.equals(new ghk0(0, null, null, null, null, null, null, null, 255))) {
                    wukVar.F().t0(i120.V(new Pair("SUCCESS_SOCIAL", ghk0Var)), "SUCCESS_SOCIAL");
                    wukVar.y0();
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                Context applicationContext = ((gcl) this.j).f11068a.getApplicationContext();
                applicationContext.getClass();
                cpv0 cpv0VarD = cpv0.d(applicationContext);
                cpv0VarD.getClass();
                String str17 = (String) obj3;
                String str18 = (String) obj2;
                str17.getClass();
                str18.getClass();
                sl50 sl50Var = sl50.f32381a;
                o4e o4eVar = new o4e(new hl50(null), sl50.b, false, false, false, false, -1L, -1L, CollectionsKt.P0(new LinkedHashSet()));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("BUNDLE_LOCAL_MESSAGE_ID", str17);
                linkedHashMap2.put("BUNDLE_FILE_PATH", str18);
                maj majVar = new maj(linkedHashMap2);
                nkb.I(majVar);
                String strConcat = str17.concat(str18);
                zko zkoVar = zko.b;
                xl60 xl60Var = (xl60) new xl60(UploadWorker.class).g(strConcat);
                ((ppv0) xl60Var.c).j = o4eVar;
                ((ppv0) xl60Var.c).e = majVar;
                cpv0VarD.c(strConcat, zkoVar, (yl60) xl60Var.k());
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC3 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar3 = lkz.f20223a;
                brk brkVar = new brk(2, (Function1) ((pz40) obj2).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3);
                clz clzVarW3 = aac.W((vbn) obj3);
                qjj.W(x0x.Q(clzVarW3.x()), null, null, new ofl((i89) gmqVarC3, clzVarW3, brkVar, (yje) null), 3);
                return Unit.f46060a;
            case 11:
                cwo cwoVar = (cwo) obj3;
                hdm0 hdm0Var = (hdm0) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                boolean z4 = hdm0Var instanceof gdm0;
                if (z4 && !(((gdm0) hdm0Var).b.a() instanceof znm0)) {
                    sac.f0(jiu0.a(cwoVar), 30L, TimeUnit.SECONDS, null, null, new yvo(cwoVar, null, b4), 44);
                }
                if (z4) {
                    zdm0 zdm0VarX = aem0.x(hdm0Var, (eme) obj2, cwoVar.r);
                    nc5 nc5VarS = cwoVar.w.s(cwoVar.o, cwoVar.p, cwoVar.x.a(), 0L);
                    p7m0 p7m0Var4 = cwoVar.i.f25029a;
                    do {
                        value = p7m0Var4.getValue();
                        value.getClass();
                    } while (!p7m0Var4.m(value, mvo.a((mvo) value, ((gdm0) hdm0Var).b.a() instanceof znm0, false, false, null, zdm0VarX, nc5VarS, 14)));
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC4 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar4 = lkz.f20223a;
                brk brkVar2 = new brk(2, (Function1) ((pz40) obj2).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 16);
                clz clzVarW4 = aac.W((s6p) obj3);
                qjj.W(x0x.Q(clzVarW4.x()), null, null, new ofl((i89) gmqVarC4, clzVarW4, brkVar2, (yje) null, (char) 0, (char) 0), 3);
                return Unit.f46060a;
            case 13:
                mlr mlrVar = (mlr) obj2;
                long j9 = mlrVar.f22006a;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                bep bepVar = (bep) this.j;
                st0 st0Var = (st0) obj3;
                int i6 = bep.I;
                Integer num2 = st0Var.g;
                long j10 = st0Var.f32750a;
                if (num2 == null) {
                    Iterator it9 = ((e2p) bepVar.D()).j.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it9.hasNext()) {
                            i = -1;
                        } else if (((mlr) it9.next()).f22006a == j10) {
                            i = i7;
                        } else {
                            i7++;
                        }
                    }
                    Integer numValueOf2 = Integer.valueOf(i);
                    if (i < 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        numValueOf = kng0.e(1, numValueOf2);
                        num = numValueOf;
                    } else {
                        num = null;
                    }
                } else {
                    ArrayList arrayList14 = new ArrayList();
                    for (j8b j8bVar : ((e2p) bepVar.D()).i) {
                        ArrayList arrayList15 = new ArrayList(r3d.q(j8bVar.c, i2));
                        for (Iterator it10 = r14.iterator(); it10.hasNext(); it10 = it10) {
                            arrayList15.add(new Pair((mlr) it10.next(), Integer.valueOf((int) j8bVar.f16074a)));
                        }
                        w3d.u(arrayList14, arrayList15);
                        i2 = 10;
                    }
                    Iterator it11 = arrayList14.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it11.hasNext()) {
                            Pair pair2 = (Pair) it11.next();
                            mlr mlrVar2 = (mlr) pair2.f46059a;
                            int iIntValue = ((Number) pair2.b).intValue();
                            if (mlrVar2.f22006a != j10 || num2 == null || iIntValue != num2.intValue()) {
                                i8++;
                            }
                        } else {
                            i8 = -1;
                        }
                    }
                    Integer numValueOf3 = Integer.valueOf(i8);
                    if (i8 < 0) {
                        numValueOf3 = null;
                    }
                    if (numValueOf3 != null) {
                        numValueOf = Integer.valueOf(((e2p) bepVar.D()).j.size() + numValueOf3.intValue() + 1);
                        num = numValueOf;
                    } else {
                        num = null;
                    }
                }
                bepVar.r.a((int) j9, 8201, num, "favorite", null);
                bepVar.s.n(j9, num);
                bepVar.E.d(new f5p(bepVar, mlrVar, b3));
                return Unit.f46060a;
            case 14:
                k4h k4hVar = (k4h) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ((iw20) ((ali) obj3).c).i(thb.Y(k4hVar, (m9s) obj2));
                return Unit.f46060a;
            case 15:
                vvd0 vvd0Var = (vvd0) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                ((iw20) ((kki) obj3).b).i(lgb.q0(vvd0Var, (m9s) obj2));
                return Unit.f46060a;
            case 16:
                vxt0 vxt0Var = (vxt0) this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                ((iw20) ((ali) obj3).b).i(ahb.b0(vxt0Var, (m9s) obj2));
                return Unit.f46060a;
            case 17:
                pup pupVar = (pup) obj3;
                hdm0 hdm0Var2 = (hdm0) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                boolean z5 = hdm0Var2 instanceof gdm0;
                if (z5 && !(((gdm0) hdm0Var2).b.a() instanceof znm0)) {
                    sac.f0(jiu0.a(pupVar), 30L, TimeUnit.SECONDS, null, null, new lup(pupVar, null, b6), 44);
                }
                if (z5) {
                    zdm0 zdm0VarX2 = aem0.x(hdm0Var2, (eme) obj2, pupVar.s);
                    p7m0 p7m0Var5 = pupVar.i.f25029a;
                    do {
                        value2 = p7m0Var5.getValue();
                        value2.getClass();
                    } while (!p7m0Var5.m(value2, hup.a((hup) value2, zdm0VarX2, null, null, 14)));
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC5 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar5 = lkz.f20223a;
                brk brkVar3 = new brk(2, (Function1) ((pz40) obj2).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 21);
                clz clzVarW5 = aac.W((q9q) obj3);
                qjj.W(x0x.Q(clzVarW5.x()), null, null, new g6q((i89) gmqVarC5, clzVarW5, brkVar3, (yje) null, (byte) 0), 3);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ivq ivqVar = (ivq) obj3;
                hdm0 hdm0Var3 = (hdm0) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                boolean z6 = hdm0Var3 instanceof gdm0;
                if (z6 && !(((gdm0) hdm0Var3).b.a() instanceof znm0)) {
                    sac.f0(jiu0.a(ivqVar), 30L, TimeUnit.SECONDS, null, null, new cvq(ivqVar, null, (byte) 4), 44);
                }
                if (z6) {
                    zdm0 zdm0VarX3 = aem0.x(hdm0Var3, (eme) obj2, ivqVar.w);
                    nc5 nc5VarS2 = ivqVar.t.s(ivqVar.p, ivqVar.q, ivqVar.u.a(), 0L);
                    p7m0 p7m0Var6 = ivqVar.i.f25029a;
                    do {
                        value3 = p7m0Var6.getValue();
                        value3.getClass();
                    } while (!p7m0Var6.m(value3, suq.a((suq) value3, false, false, false, false, null, null, zdm0VarX3, nc5VarS2, ((gdm0) hdm0Var3).b.a() instanceof znm0, 63)));
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                if (((wul) this.j) != null) {
                    ((Function1) obj3).invoke(new Integer(((cgk0) obj2).l()));
                }
                return Unit.f46060a;
            case 21:
                yx5 yx5Var = (yx5) obj2;
                tzi tziVar = (tzi) obj3;
                d1k0 d1k0Var = (d1k0) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                if (d1k0Var != null) {
                    if (d1k0Var instanceof b1k0) {
                        wdk0 wdk0Var = (wdk0) tziVar.c;
                        rek0 rek0Var = rek0.b;
                        String strH = yx5Var.H(((b1k0) d1k0Var).f1810a);
                        strH.getClass();
                        wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), yx5Var, null, null, false, null, 1020);
                    } else if (d1k0Var instanceof c1k0) {
                        wdk0 wdk0Var2 = (wdk0) tziVar.c;
                        qek0 qek0Var = qek0.f28589a;
                        String strH2 = yx5Var.H(R.string.favorites_subscribe_snackbar);
                        strH2.getClass();
                        wdk0.k(wdk0Var2, new xdk0(qek0Var, strH2, null, null, null, new Integer(R.drawable.ic_glyph_favourite_active), 92), yx5Var, null, null, false, null, 1020);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 22:
                sbs sbsVar = (sbs) obj3;
                hdm0 hdm0Var4 = (hdm0) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                boolean z7 = hdm0Var4 instanceof gdm0;
                if (z7 && !(((gdm0) hdm0Var4).b.a() instanceof znm0)) {
                    sac.f0(jiu0.a(sbsVar), 30L, TimeUnit.SECONDS, null, null, new obs(sbsVar, null, b6), 44);
                }
                if (z7) {
                    zdm0 zdm0VarX4 = aem0.x(hdm0Var4, (eme) obj2, sbsVar.u);
                    nc5 nc5VarS3 = sbsVar.w.s(sbsVar.s, sbsVar.r, sbsVar.x.a(), 0L);
                    p7m0 p7m0Var7 = sbsVar.i.f25029a;
                    do {
                        value4 = p7m0Var7.getValue();
                        value4.getClass();
                    } while (!p7m0Var7.m(value4, uas.a((uas) value4, ((gdm0) hdm0Var4).b.a() instanceof znm0, false, false, null, null, false, zdm0VarX4, nc5VarS3, 509)));
                }
                return Unit.f46060a;
            case 23:
                pz40 pz40Var = (pz40) obj2;
                a4x a4xVar = (a4x) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                if (((Boolean) ((pz40) obj3).getValue()).booleanValue() && !Intrinsics.d(a4xVar, (a4x) pz40Var.getValue())) {
                    pz40Var.setValue(a4xVar);
                }
                return Unit.f46060a;
            case 24:
                khv0 khv0Var = (khv0) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                wzs wzsVar = (wzs) obj3;
                mpx mpxVar = wzsVar.e;
                mne mneVar = wzsVar.m;
                mpxVar.b(true);
                p7m0 p7m0Var8 = wzsVar.u;
                kmq kmqVar = (kmq) obj2;
                while (true) {
                    Object value5 = p7m0Var8.getValue();
                    kmq kmqVar2 = kmqVar;
                    if (p7m0Var8.m(value5, czs.a((czs) value5, khv0Var.f18308a, khv0Var.b, khv0Var.c, khv0Var.d, khv0Var.e, false, false, false, false, false, false, false, kmqVar.getClass().getSimpleName() + BundleUtil.UNDERLINE_TAG + khv0Var.f18308a, 32736))) {
                        c4m0 c4m0Var = wzsVar.w;
                        if (c4m0Var == null || !c4m0Var.isActive()) {
                            wzsVar.w = sac.T(new fnq(wzsVar.l.b(), new mzs(wzsVar, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(wzsVar), mneVar.f22085a), nzs.h);
                        }
                        c4m0 c4m0Var2 = wzsVar.y;
                        if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                            wzsVar.y = sac.T(new fnq(new i89(i120.W(new h2c(((neu0) wzsVar.h.f43005a).f23405a.c, (byte) 25)), (byte) 29), new cin(wzsVar, null, (byte) 12), (byte) 4), d5c.S(jiu0.a(wzsVar), mneVar.f22085a), rzs.h);
                        }
                        c4m0 c4m0Var3 = wzsVar.z;
                        if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                            wzsVar.z = sac.T(new fnq(new i89(((b3c0) wzsVar.o.f10580a).b.f40159a, (byte) 22), new lzs(wzsVar, null, b6), (byte) 4), d5c.S(jiu0.a(wzsVar), mneVar.f22085a), ozs.h);
                        }
                        return Unit.f46060a;
                    }
                    kmqVar = kmqVar2;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return l(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC6 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar6 = lkz.f20223a;
                ens ensVar = new ens(2, (Function1) ((pz40) obj2).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 7);
                clz clzVarW6 = aac.W((vzv) obj3);
                qjj.W(x0x.Q(clzVarW6.x()), null, null, new hgv((i89) gmqVarC6, clzVarW6, ensVar, (yje) null), 3);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return o(obj);
            default:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                nqd nqdVar = (nqd) ((y3v) this.j).c;
                File file = (File) obj3;
                gc5 gc5Var = (gc5) obj2;
                file.getClass();
                byte[] bArr = new byte[8192];
                long jV = aac.V(file);
                if (jV > 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        randomAccessFile.seek(jV);
                        randomAccessFile.read(bArr, 0, 8192);
                        randomAccessFile.close();
                        nqdVar.b = true;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            bkb.E(randomAccessFile, th);
                            throw th2;
                        }
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(gc5Var.f11042a, 8192);
                try {
                    nqdVar.e(file, bufferedInputStream, bArr);
                    bufferedInputStream.close();
                    return Unit.f46060a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        bkb.E(bufferedInputStream, th3);
                        throw th4;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6g(k3t0 k3t0Var, q1j q1jVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = q1jVar;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6g(k3t0 k3t0Var, v0j v0jVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = v0jVar;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6g(k3t0 k3t0Var, s6p s6pVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = s6pVar;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6g(k3t0 k3t0Var, q9q q9qVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = q9qVar;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6g(k3t0 k3t0Var, vzv vzvVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = vzvVar;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6g(k3t0 k3t0Var, r7w r7wVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.k = r7wVar;
        this.l = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6g(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6g(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }
}
