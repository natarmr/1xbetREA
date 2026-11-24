package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class v6w implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36895a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6w(Object obj, byte b) {
        this.f36895a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f36895a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((w6w) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((w6w) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                Object objInvoke3 = ((w6w) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 3:
                Object objInvoke4 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 4:
                Object objInvoke5 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 5:
                Object objInvoke6 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 6:
                Object objInvoke7 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 7:
                List list = (List) obj;
                ukw ukwVar = (ukw) obj2;
                if (((zjw) ukwVar.D()).b.c.o != g5h.DEFAULT) {
                    CyberGamesPage cyberGamesPage = ((zjw) ukwVar.D()).g.f7971a;
                    List listJ = Intrinsics.d(cyberGamesPage, CyberGamesPage.Real.INSTANCE) ? q3d.j(45, 46) : Intrinsics.d(cyberGamesPage, CyberGamesPage.Virtual.INSTANCE) ? kotlin.collections.a.c(86) : kotlin.collections.a.c(46);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        List list2 = ((uog) obj3).p;
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (listJ.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                                    arrayList.add(obj3);
                                }
                                break;
                            }
                        }
                    }
                    list = arrayList;
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(((uog) it2.next()).f36012a));
                }
                q7d0 q7d0Var = ((dih) ukwVar.D.f30901a).f6138a.f4414a;
                Set<String> set = xun.f41520a;
                q7d0Var.getClass();
                set.getClass();
                Set<String> stringSet = q7d0Var.a().getStringSet("CYBER_PROMO_IDS", set);
                if (stringSet != null) {
                    set = stringSet;
                }
                ukwVar.H(new jv1(!CollectionsKt.L0(set).containsAll(arrayList2), (Object) arrayList2, (byte) 27));
                return Unit.f46060a;
            case 8:
                Object objInvoke8 = ((u8x) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 9:
                Object objInvoke9 = ((u8x) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 10:
                Object objInvoke10 = ((u8x) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 11:
                Object objInvoke11 = ((kaw) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 12:
                Object objInvoke12 = ((pfl) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 13:
                Object objInvoke13 = ((khx) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 14:
                Object objInvoke14 = ((kaw) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 15:
                Object objInvoke15 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 16:
                Object objInvoke16 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 17:
                Object objInvoke17 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 18:
                Object objInvoke18 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke19 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 20:
                Object objInvoke20 = ((i6y) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 21:
                Object objInvoke21 = ((i6y) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 22:
                Object objInvoke22 = ((i6y) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case 23:
                Object objInvoke23 = ((i6y) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case 24:
                tly tlyVar = (tly) obj;
                ((nly) obj2).a1(tlyVar.b, tlyVar.f34169a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke24 = ((kaw) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke25 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke26 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((hgk0) ((hdz) obj2).e).setValue((h7d) obj);
                return Unit.f46060a;
            default:
                Object objInvoke27 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke27 == wne.f39444a ? objInvoke27 : Unit.f46060a;
        }
    }
}
