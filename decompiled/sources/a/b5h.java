package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.section.api.presentation.CyberMainDisciplinesParams;

/* JADX INFO: loaded from: classes4.dex */
public final class b5h implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2003a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b5h(Object obj, byte b) {
        this.f2003a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        List list;
        Object value4;
        byte b = this.f2003a;
        boolean zIsEmpty = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                List list2 = (List) obj;
                c5h c5hVar = (c5h) obj2;
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((uog) it.next()).f36012a));
                }
                q7d0 q7d0Var = ((dih) c5hVar.l.f30901a).f6138a.f4414a;
                Set<String> set = xun.f41520a;
                q7d0Var.getClass();
                set.getClass();
                Set<String> stringSet = q7d0Var.a().getStringSet("CYBER_PROMO_IDS", set);
                if (stringSet != null) {
                    set = stringSet;
                }
                boolean z = !CollectionsKt.L0(set).containsAll(arrayList);
                p7m0 p7m0Var = c5hVar.q;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, l120.a((l120) value, null, (arrayList.isEmpty() || c5hVar.c.j() || (c5hVar.b instanceof CyberMainDisciplinesParams.Disciplines)) ? false : true, z, false, false, 231)));
                return Unit.f46060a;
            case 1:
                List list3 = (List) obj;
                dch dchVar = (dch) obj2;
                if (list3.isEmpty()) {
                    dchVar.x(new hbh(new NoSuchElementException()));
                } else {
                    dchVar.x(new ibh(list3));
                }
                return Unit.f46060a;
            case 2:
                Object objInvoke = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 3:
                List list4 = (List) obj;
                lmh lmhVar = (lmh) obj2;
                oyg0 oyg0Var = lmhVar.f;
                ocj ocjVar = lmhVar.i;
                rkh rkhVar = (rkh) CollectionsKt.firstOrNull(list4);
                if (rkhVar != null && (list = rkhVar.r) != null) {
                    zIsEmpty = hkb.I(list).isEmpty();
                }
                if (zIsEmpty && lmhVar.o.e) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                        e0g0 e0g0Var = j0g0.b;
                    } while (!p7m0Var2.m(value3, fmh.a((fmh) value3, null, new j0g0(new g0g0(new Throwable())), null, null, 27)));
                } else {
                    if (zIsEmpty) {
                        int i = lmh.A;
                        lmhVar.N();
                        return Unit.f46060a;
                    }
                    int i2 = lmh.A;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, fmh.a((fmh) value2, null, new j0g0(list4), null, null, 27)));
                }
                return Unit.f46060a;
            case 4:
                Object objInvoke2 = ((csh) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 5:
                Object objInvoke3 = ((csh) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                wxh wxhVar = (wxh) obj2;
                if (zBooleanValue && (((oxh) wxhVar.D()).f26011a || ((oxh) wxhVar.D()).b || ((oxh) wxhVar.D()).c)) {
                    wxhVar.M();
                } else if (!zBooleanValue && (((oxh) wxhVar.D()).f26011a || ((oxh) wxhVar.D()).b || ((oxh) wxhVar.D()).c)) {
                    p7m0 p7m0Var4 = wxhVar.i.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                        wxhVar.f.getClass();
                    } while (!p7m0Var4.m(value4, oxh.a((oxh) value4, false, true, false, null, 0L, 24)));
                }
                return Unit.f46060a;
            case 7:
                Object objInvoke4 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 8:
                Object objInvoke5 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 9:
                Object objInvoke6 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 10:
                Object objInvoke7 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 11:
                p6j p6jVar = (p6j) obj;
                v6j v6jVar = (v6j) obj2;
                if (p6jVar.f26457a.isEmpty()) {
                    v6jVar.x(new r6j(v6jVar.w()));
                } else {
                    v6jVar.g = true;
                    v6jVar.x(new s6j(p6jVar.f26457a));
                }
                return Unit.f46060a;
            case 12:
                ncj ncjVar = (ncj) obj2;
                if (ncjVar.h.a() instanceof hbq) {
                    return Unit.f46060a;
                }
                Object objG = ncjVar.g(true, yjeVar);
                return objG == wne.f39444a ? objG : Unit.f46060a;
            case 13:
                Object objInvoke8 = ((mgj) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 14:
                Object objInvoke9 = ((mgj) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 15:
                Object objInvoke10 = ((mgj) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 16:
                Object objInvoke11 = ((jv0) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 17:
                Object objInvoke12 = ((d7e) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 18:
                Object objInvoke13 = ((d7e) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke14 = ((e9g) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 20:
                Object objInvoke15 = ((e9g) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 21:
                Object objInvoke16 = ((hij) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 22:
                Object objInvoke17 = ((a9k) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 23:
                Object objInvoke18 = ((a9k) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 24:
                Object objInvoke19 = ((a9k) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke20 = ((u9k) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke21 = ((u9k) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke22 = ((u9k) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke23 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            default:
                Object objInvoke24 = ((e9g) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
        }
    }
}
