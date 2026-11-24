package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m0g implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20952a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0g(Object obj, byte b) {
        this.f20952a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        cnb cnbVar;
        Object value;
        whg whgVar;
        byte b = this.f20952a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((n0g) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                ((upj0) obj2).f36068a = (f3g) obj;
                return Unit.f46060a;
            case 2:
                Object objInvoke2 = ((fob) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 3:
                Object objInvoke3 = ((ee0) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 4:
                Object objInvoke4 = ((m5g) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 5:
                Object objInvoke5 = ((m5g) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 6:
                Object objInvoke6 = ((k6g) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 7:
                Object objInvoke7 = ((k6g) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 8:
                Object objInvoke8 = ((e7g) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 9:
                Object objInvoke9 = ((e7g) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 10:
                Object objInvoke10 = ((p7g) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 11:
                Object objInvoke11 = ((p7g) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 12:
                Object objInvoke12 = ((w7g) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 13:
                Object objInvoke13 = ((w7g) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 14:
                Object objInvoke14 = ((fob) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 15:
                Object objInvoke15 = ((fob) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 16:
                ((e9g) obj2).invoke(obj, yjeVar);
                throw null;
            case 17:
                Object objInvoke16 = ((d7e) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 18:
                Object objInvoke17 = ((e9g) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke18 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 20:
                Object objInvoke19 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 21:
                Object objInvoke20 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 22:
                whg whgVar2 = (whg) obj;
                aig aigVar = (aig) obj2;
                int i = aig.x;
                if (!aigVar.w && whgVar2.g && Intrinsics.d(((whg) aigVar.D()).b, bnb.f2874a)) {
                    aigVar.w = true;
                    cnbVar = anb.f1141a;
                } else {
                    cnbVar = ((whg) aigVar.D()).b;
                }
                cnb cnbVar2 = cnbVar;
                p7m0 p7m0Var = aigVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    whgVar = (whg) value;
                    aigVar.f.getClass();
                } while (!p7m0Var.m(value, whg.a(whgVar2, cnbVar2, whgVar.d, null, whgVar.h, 117)));
                return Unit.f46060a;
            case 23:
                Object objInvoke21 = ((mhc) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 24:
                Object objInvoke22 = ((tpg) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke23 = ((tpg) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke24 = ((tpg) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke25 = ((w4h) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke26 = ((w4h) obj2).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
            default:
                Object objInvoke27 = ((w4h) obj2).invoke(obj, yjeVar);
                return objInvoke27 == wne.f39444a ? objInvoke27 : Unit.f46060a;
        }
    }
}
