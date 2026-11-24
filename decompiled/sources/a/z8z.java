package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z8z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43992a;

    public /* synthetic */ z8z(byte b) {
        this.f43992a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        List list;
        wui0 wui0Var;
        List list2;
        wui0 wui0Var2;
        List list3;
        wui0 wui0Var3;
        Throwable th = null;
        switch (this.f43992a) {
            case 0:
                List list4 = (List) obj;
                return new d9z(((Number) list4.get(0)).intValue(), ((Number) list4.get(1)).intValue());
            case 1:
                ((Integer) obj).getClass();
                return iun.f15405a;
            case 2:
                ((Integer) obj).getClass();
                return -1;
            case 3:
                return Unit.f46060a;
            case 4:
                List list5 = (List) obj;
                return new xcz(((Number) list5.get(0)).intValue(), ((Number) list5.get(1)).intValue());
            case 5:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 6:
                List list6 = (List) obj;
                list6.getClass();
                ArrayList<List> arrayListQ0 = CollectionsKt.Q0(list6, 3, 3);
                ArrayList arrayList = new ArrayList(r3d.q(arrayListQ0, 10));
                for (List list7 : arrayListQ0) {
                    Object obj2 = list7.get(0);
                    obj2.getClass();
                    Object obj3 = list7.get(1);
                    obj3.getClass();
                    int iIntValue = ((Integer) obj3).intValue();
                    Object obj4 = list7.get(2);
                    obj4.getClass();
                    arrayList.add(new kzg0(iIntValue, ((Integer) obj4).intValue(), obj2));
                }
                return new pdz(arrayList);
            case 7:
                return Unit.f46060a;
            case 8:
                List list8 = (List) obj;
                return new mez((int[]) list8.get(0), (int[]) list8.get(1));
            case 9:
                ((m8m) obj).getClass();
                return Unit.f46060a;
            case 10:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if (th2 instanceof CancellationException) {
                    th2.printStackTrace();
                }
                return Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new b1w(cpVar, (byte) 14));
                return Unit.f46060a;
            case 15:
                uoz uozVar = (uoz) obj;
                uozVar.getClass();
                oiq0 oiq0Var = uozVar.f36035a;
                w85 w85Var = uozVar.b;
                if (oiq0Var == null || (list = oiq0Var.j) == null) {
                    list = iun.f15405a;
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                int i = 0;
                for (Object obj5 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    w85 w85Var2 = (w85) obj5;
                    int i3 = w85Var2.f38705a;
                    String str = w85Var2.b;
                    String str2 = w85Var2.c;
                    if (list.size() == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (i == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = i == list.size() - 1 ? wui0.d : wui0.c;
                    }
                    arrayList2.add(new y95(i3, str, str2, wui0Var, w85Var != null && w85Var.equals(w85Var2)));
                    i = i2;
                }
                return new voz(dyb.o0(arrayList2), w85Var != null);
            case 16:
                opz opzVar = (opz) obj;
                opzVar.getClass();
                piq0 piq0Var = opzVar.f25663a;
                x85 x85Var = opzVar.b;
                if (piq0Var == null || (list2 = piq0Var.j) == null) {
                    list2 = iun.f15405a;
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                int i4 = 0;
                for (Object obj6 : list2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        Throwable th3 = th;
                        q3d.p();
                        throw th3;
                    }
                    x85 x85Var2 = (x85) obj6;
                    long j = x85Var2.f40447a;
                    String str3 = x85Var2.b;
                    String str4 = x85Var2.c;
                    Throwable th4 = th;
                    if (list2.size() == 1) {
                        wui0Var2 = wui0.f39793a;
                    } else if (i4 == 0) {
                        wui0Var2 = wui0.b;
                    } else {
                        wui0Var2 = i4 == list2.size() - 1 ? wui0.d : wui0.c;
                    }
                    arrayList3.add(new v95(j, str3, str4, wui0Var2, x85Var != null && x85Var.equals(x85Var2)));
                    th = th4;
                    i4 = i5;
                }
                return new ppz(dyb.o0(arrayList3), x85Var != null, opzVar.c);
            case 17:
                jqz jqzVar = (jqz) obj;
                jqzVar.getClass();
                qiq0 qiq0Var = jqzVar.f16978a;
                y85 y85Var = jqzVar.b;
                if (qiq0Var == null || (list3 = qiq0Var.j) == null) {
                    list3 = iun.f15405a;
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                int i6 = 0;
                for (Object obj7 : list3) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        q3d.p();
                        throw null;
                    }
                    y85 y85Var2 = (y85) obj7;
                    int i8 = y85Var2.f42179a;
                    String str5 = y85Var2.b;
                    String str6 = y85Var2.c;
                    if (list3.size() == 1) {
                        wui0Var3 = wui0.f39793a;
                    } else if (i6 == 0) {
                        wui0Var3 = wui0.b;
                    } else {
                        wui0Var3 = i6 == list3.size() - 1 ? wui0.d : wui0.c;
                    }
                    arrayList4.add(new w95(i8, str5, str6, wui0Var3, y85Var != null && y85Var.equals(y85Var2)));
                    i6 = i7;
                }
                return new kqz(dyb.o0(arrayList4), y85Var != null, jqzVar.c);
            case 18:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new b1w(cpVar2, (byte) 15));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.t(new b1w(cpVar3, (byte) 16));
                return Unit.f46060a;
            case 20:
                u000 u000Var = (u000) obj;
                u000Var.getClass();
                return u000Var;
            case 21:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                throw th5;
            case 22:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                throw th6;
            case 23:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 24:
                int i9 = LineChartView.k1;
                ((List) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new b1w(cpVar4, (byte) 22));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Boolean.valueOf(obj instanceof y700);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                w700 w700Var = obj instanceof w700 ? (w700) obj : null;
                return Boolean.valueOf(w700Var != null && w700Var.j);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                v700 v700Var = obj instanceof v700 ? (v700) obj : null;
                return Boolean.valueOf(v700Var != null && v700Var.j);
            default:
                lu90 lu90Var = (lu90) obj;
                lu90Var.getClass();
                return Integer.valueOf(lu90Var.d);
        }
    }
}
