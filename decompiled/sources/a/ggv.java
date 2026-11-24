package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ggv implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11270a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ggv(Object obj, byte b) {
        this.f11270a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        ArrayList arrayList;
        byte b = this.f11270a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((pfl) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((j0s) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                List list = (List) obj;
                p7m0 p7m0Var = ((ghv) obj2).d;
                do {
                    value = p7m0Var.getValue();
                    arrayList = new ArrayList(r3d.q(list, 10));
                    int i = 0;
                    for (Object obj3 : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        tyl0 tyl0Var = (tyl0) obj3;
                        tyl0Var.getClass();
                        arrayList.add(new phv(tyl0Var.f34761a, i, tyl0Var.b));
                        i = i2;
                    }
                } while (!p7m0Var.m(value, new fhv(arrayList)));
                return Unit.f46060a;
            case 3:
                Object objInvoke3 = ((j0s) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 4:
                Object objInvoke4 = ((j0s) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 5:
                Object objInvoke5 = ((iyv) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 6:
                Object objInvoke6 = ((iyv) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 7:
                Object objInvoke7 = ((iyv) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 8:
                Object objInvoke8 = ((iyv) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 9:
                Object objInvoke9 = ((iyv) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 10:
                Object objInvoke10 = ((iyv) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 11:
                Object objInvoke11 = ((hzv) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 12:
                Object objInvoke12 = ((gkr) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 13:
                Object objInvoke13 = ((hzv) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 14:
                Object objInvoke14 = ((hzv) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 15:
                Object objInvoke15 = ((hzv) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 16:
                Object objInvoke16 = ((hzv) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 17:
                Object objInvoke17 = ((ens) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 18:
                Object objInvoke18 = ((j0s) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke19 = ((q1w) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 20:
                Object objInvoke20 = ((q1w) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 21:
                Object objInvoke21 = ((u5u) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 22:
                Object objInvoke22 = ((q1w) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case 23:
                Object objInvoke23 = ((pfl) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case 24:
                Object objInvoke24 = ((q1w) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke25 = ((q1w) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke26 = ((j0s) obj2).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke27 = ((q1w) obj2).invoke(obj, yjeVar);
                return objInvoke27 == wne.f39444a ? objInvoke27 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke28 = ((x3w) obj2).invoke(obj, yjeVar);
                return objInvoke28 == wne.f39444a ? objInvoke28 : Unit.f46060a;
            default:
                Object objInvoke29 = ((x3w) obj2).invoke(obj, yjeVar);
                return objInvoke29 == wne.f39444a ? objInvoke29 : Unit.f46060a;
        }
    }
}
