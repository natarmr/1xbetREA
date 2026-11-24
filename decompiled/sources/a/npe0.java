package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class npe0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23910a;
    public final /* synthetic */ Object b;

    public /* synthetic */ npe0(Object obj, byte b) {
        this.f23910a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        byte b = this.f23910a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objInvoke = ((coc0) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 1:
                Object objInvoke2 = ((due0) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 2:
                Object objInvoke3 = ((due0) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 3:
                Object objInvoke4 = ((due0) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 4:
                Object objInvoke5 = ((due0) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 5:
                Object objInvoke6 = ((due0) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 6:
                Object objInvoke7 = ((due0) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 7:
                Object objInvoke8 = ((due0) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 8:
                List list = (List) obj;
                hef0 hef0Var = (hef0) obj2;
                if (list.isEmpty()) {
                    bby bbyVar = hef0Var.z;
                    if (bbyVar != null) {
                        e3c.n(bbyVar);
                    }
                    hef0Var.N();
                } else {
                    int i = hef0.C;
                    i3t0.K(hef0Var, null, null, new gv60(hef0Var, list, null, (byte) 6), 3);
                }
                return Unit.f46060a;
            case 9:
                Object objInvoke9 = ((due0) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 10:
                Object objInvoke10 = ((uif0) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 11:
                Object objInvoke11 = ((uif0) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    p7m0 p7m0Var = ((rnf0) obj2).g;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, i8d.c));
                }
                return Unit.f46060a;
            case 13:
                Object objInvoke12 = ((sof0) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 14:
                Object objInvoke13 = ((tof0) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 15:
                Object objInvoke14 = ((sof0) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 16:
                Object objInvoke15 = ((sof0) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 17:
                Object objInvoke16 = ((tof0) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 18:
                return b((zy5) obj, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke17 = ((jjc0) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case 20:
                Object objInvoke18 = ((jjc0) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 21:
                Object objInvoke19 = ((jjc0) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 22:
                Object objInvoke20 = ((jjc0) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 23:
                Object objInvoke21 = ((tye0) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 24:
                Object objInvoke22 = ((exf0) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke23 = ((coc0) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke24 = ((exf0) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke25 = ((xxf0) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke26 = ((coc0) obj2).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
            default:
                Object objInvoke27 = ((xxf0) obj2).invoke(obj, yjeVar);
                return objInvoke27 == wne.f39444a ? objInvoke27 : Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
    
        if (r0.f(a.ny5.f24313a, r4) == r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
    
        if (r0.a(r4) == r2) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.zy5 r30, a.yje r31) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.npe0.b(a.zy5, a.yje):java.lang.Object");
    }
}
