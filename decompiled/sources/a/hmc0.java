package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class hmc0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13298a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hmc0(Object obj, byte b) {
        this.f13298a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object objPrevious;
        byte b = this.f13298a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((imc0) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((imc0) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                Object objInvoke3 = ((gnc0) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 3:
                Object objInvoke4 = ((gnc0) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 4:
                Object objInvoke5 = ((gnc0) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 5:
                Object objInvoke6 = ((xnc0) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 6:
                Object objInvoke7 = ((xnc0) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 7:
                ((Boolean) obj).getClass();
                aqc0 aqc0Var = (aqc0) obj2;
                int i = aqc0.A;
                v3c.N(aqc0Var.y);
                aqc0Var.M(false);
                return Unit.f46060a;
            case 8:
                Object objInvoke8 = ((yn90) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 9:
                Object objInvoke9 = ((yn90) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 10:
                Object objInvoke10 = ((yn90) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 11:
                Object objInvoke11 = ((s9c0) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 12:
                Object objInvoke12 = ((jjc0) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 13:
                Object objInvoke13 = ((jjc0) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 14:
                Object objInvoke14 = ((jjc0) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 15:
                Object objInvoke15 = ((coc0) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 16:
                Object objInvoke16 = ((ffd0) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 17:
                Object objInvoke17 = ((ffd0) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 18:
                Object objInvoke18 = ((ffd0) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke19 = ((igd0) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 20:
                Object objInvoke20 = ((igd0) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 21:
                ((shd0) obj2).u.f(new bhd0((String) obj));
                return Unit.f46060a;
            case 22:
                Object objInvoke21 = ((whd0) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 23:
                Object objInvoke22 = ((whd0) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case 24:
                Object objInvoke23 = ((vid0) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke24 = ((vid0) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke25 = ((mjd0) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke26 = ((mjd0) obj2).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mcz mczVar = (mcz) obj;
                cgk0 cgk0Var = (cgk0) obj2;
                List list = mczVar.l;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        ncz nczVar = (ncz) objPrevious;
                        int i2 = nczVar.p;
                        if (i2 < 0 || i2 + nczVar.q > ((int) (mczVar.h() >> 32))) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                ncz nczVar2 = (ncz) objPrevious;
                cgk0Var.m(nczVar2 != null ? nczVar2.f23317a : 0);
                return Unit.f46060a;
            default:
                Object objInvoke27 = ((jjc0) obj2).invoke(obj, yjeVar);
                return objInvoke27 == wne.f39444a ? objInvoke27 : Unit.f46060a;
        }
    }
}
