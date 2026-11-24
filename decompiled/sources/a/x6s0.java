package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class x6s0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40380a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x6s0(Object obj, byte b) {
        this.f40380a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        Date date;
        Object value3;
        switch (this.f40380a) {
            case 0:
                Object objInvoke = ((fup0) this.b).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                gqt0 gqt0Var = (gqt0) obj;
                l7s0 l7s0Var = (l7s0) this.b;
                int i = l7s0.z;
                p7m0 p7m0Var = l7s0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    l7s0Var.f.getClass();
                } while (!p7m0Var.m(value, e7s0.a((e7s0) value, null, false, gqt0Var, false, 447)));
                return Unit.f46060a;
            case 2:
                Object objInvoke2 = ((rtq0) this.b).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 3:
                Object objInvoke3 = ((fup0) this.b).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 4:
                Object objInvoke4 = ((rtq0) this.b).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 5:
                Object objInvoke5 = ((fup0) this.b).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 6:
                Object objInvoke6 = ((rtq0) this.b).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 7:
                Object objInvoke7 = ((k6s0) this.b).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 8:
                Object objInvoke8 = ((bvs0) this.b).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 9:
                Object objInvoke9 = ((bvs0) this.b).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 10:
                Object objInvoke10 = ((k5r0) this.b).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 11:
                float fFloatValue = ((Number) obj).floatValue();
                if (fFloatValue > 0.0f) {
                    ((agk0) this.b).m(fFloatValue);
                }
                return Unit.f46060a;
            case 12:
                Object objInvoke11 = ((fup0) this.b).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 13:
                Object objInvoke12 = ((fup0) this.b).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 14:
                Object objInvoke13 = ((fup0) this.b).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 15:
                qbt0 qbt0Var = (qbt0) obj;
                wbt0 wbt0Var = (wbt0) this.b;
                int i2 = wbt0.E;
                p7m0 p7m0Var2 = wbt0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    wbt0Var.f.getClass();
                } while (!p7m0Var2.m(value2, ubt0.a((ubt0) value2, false, null, null, qbt0Var, 111)));
                return Unit.f46060a;
            case 16:
                xbt0 xbt0Var = (xbt0) obj;
                jdt0 jdt0Var = (jdt0) this.b;
                Date date2 = ((cdt0) jdt0Var.D()).j;
                Date date3 = null;
                if (date2 == null) {
                    date2 = null;
                }
                if (date2 == null) {
                    Object obj2 = xbt0Var.i;
                    e0g0 e0g0Var = j0g0.b;
                    if (obj2 instanceof g0g0) {
                        obj2 = null;
                    }
                    List list = (List) obj2;
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            date3 = (Date) CollectionsKt.U(list);
                        }
                    }
                    date = date3;
                } else {
                    date = date2;
                }
                p7m0 p7m0Var3 = jdt0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    jdt0Var.f.getClass();
                } while (!p7m0Var3.m(value3, cdt0.a((cdt0) value3, false, xbt0Var, 0, date, new j0g0(xbt0Var.i), 2555)));
                return Unit.f46060a;
            case 17:
                Object objInvoke14 = ((fup0) this.b).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 18:
                Object objInvoke15 = ((rtq0) this.b).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke16 = ((k5r0) this.b).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 20:
                Object objInvoke17 = ((fup0) this.b).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 21:
                Object objInvoke18 = ((z8u0) this.b).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 22:
                Object objInvoke19 = ((z8u0) this.b).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 23:
                Object objInvoke20 = ((fau0) this.b).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 24:
                Object objInvoke21 = ((k5r0) this.b).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke22 = ((k5r0) this.b).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                p2a p2aVar = (p2a) obj;
                jnu0 jnu0Var = (jnu0) this.b;
                synchronized (jnu0Var.e) {
                    try {
                        if (p2aVar instanceof u2a) {
                            dnu0 dnu0Var = new dnu0((nw2) ((u2a) p2aVar).f34935a);
                            jnu0Var.g = dnu0Var;
                            jnu0Var.b(new u2a(dnu0Var));
                        } else {
                            jnu0Var.b(p2aVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke23 = ((fau0) this.b).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke24 = ((k5r0) this.b).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            default:
                Object objInvoke25 = ((k5r0) this.b).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
        }
    }
}
