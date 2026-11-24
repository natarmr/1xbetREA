package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class i6k0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14244a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i6k0(Object obj, byte b) {
        this.f14244a = b;
        this.b = obj;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        Object value;
        byte b = this.f14244a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                k6k0 k6k0Var = (k6k0) obj2;
                AtomicBoolean atomicBoolean = k6k0Var.t;
                if (atomicBoolean.compareAndSet(false, true)) {
                    t5k0 t5k0Var = k6k0Var.s;
                    if (t5k0Var == null) {
                        atomicBoolean.set(false);
                    } else {
                        k6k0Var.o = qjj.W(k6k0Var.l, null, null, new kbh0(k6k0Var, t5k0Var, null, (byte) 16), 3);
                    }
                }
                return Unit.f46060a;
            case 1:
                Object objInvoke = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke == wne.f39444a ? objInvoke : Unit.f46060a;
            case 2:
                Object objInvoke2 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke2 == wne.f39444a ? objInvoke2 : Unit.f46060a;
            case 3:
                Object objInvoke3 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke3 == wne.f39444a ? objInvoke3 : Unit.f46060a;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                cjk0 cjk0Var = (cjk0) obj2;
                p7m0 p7m0Var = cjk0Var.m;
                if (zBooleanValue) {
                    cjk0Var.x();
                } else if (!zBooleanValue && !(p7m0Var.getValue() instanceof oik0)) {
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, new mik0(sa10.b(cjk0Var.i, pb10.g, R.string.data_retrieval_error, 0, null, 28))));
                }
                return Unit.f46060a;
            case 5:
                Object objInvoke4 = ((eyk0) obj2).invoke(obj, yjeVar);
                return objInvoke4 == wne.f39444a ? objInvoke4 : Unit.f46060a;
            case 6:
                Object objInvoke5 = ((eyk0) obj2).invoke(obj, yjeVar);
                return objInvoke5 == wne.f39444a ? objInvoke5 : Unit.f46060a;
            case 7:
                Object objInvoke6 = ((eyk0) obj2).invoke(obj, yjeVar);
                return objInvoke6 == wne.f39444a ? objInvoke6 : Unit.f46060a;
            case 8:
                Object objInvoke7 = ((eyk0) obj2).invoke(obj, yjeVar);
                return objInvoke7 == wne.f39444a ? objInvoke7 : Unit.f46060a;
            case 9:
                Object objInvoke8 = ((eyk0) obj2).invoke(obj, yjeVar);
                return objInvoke8 == wne.f39444a ? objInvoke8 : Unit.f46060a;
            case 10:
                Object objInvoke9 = ((eyk0) obj2).invoke(obj, yjeVar);
                return objInvoke9 == wne.f39444a ? objInvoke9 : Unit.f46060a;
            case 11:
                Object objInvoke10 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke10 == wne.f39444a ? objInvoke10 : Unit.f46060a;
            case 12:
                Object objInvoke11 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke11 == wne.f39444a ? objInvoke11 : Unit.f46060a;
            case 13:
                Object objInvoke12 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke12 == wne.f39444a ? objInvoke12 : Unit.f46060a;
            case 14:
                Object objInvoke13 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke13 == wne.f39444a ? objInvoke13 : Unit.f46060a;
            case 15:
                Object objInvoke14 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke14 == wne.f39444a ? objInvoke14 : Unit.f46060a;
            case 16:
                Object objInvoke15 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke15 == wne.f39444a ? objInvoke15 : Unit.f46060a;
            case 17:
                Object objInvoke16 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke16 == wne.f39444a ? objInvoke16 : Unit.f46060a;
            case 18:
                Object objInvoke17 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke17 == wne.f39444a ? objInvoke17 : Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objInvoke18 = ((jbh0) obj2).invoke(obj, yjeVar);
                return objInvoke18 == wne.f39444a ? objInvoke18 : Unit.f46060a;
            case 20:
                Object objInvoke19 = ((bdl0) obj2).invoke(obj, yjeVar);
                return objInvoke19 == wne.f39444a ? objInvoke19 : Unit.f46060a;
            case 21:
                Object objInvoke20 = ((bdl0) obj2).invoke(obj, yjeVar);
                return objInvoke20 == wne.f39444a ? objInvoke20 : Unit.f46060a;
            case 22:
                Object objInvoke21 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke21 == wne.f39444a ? objInvoke21 : Unit.f46060a;
            case 23:
                if (((Boolean) obj).booleanValue()) {
                    xpl0 xpl0Var = (xpl0) obj2;
                    int i = xpl0.P;
                    xpl0Var.P();
                    xpl0Var.Q();
                }
                return Unit.f46060a;
            case 24:
                Object objInvoke22 = ((nfj0) obj2).invoke(obj, yjeVar);
                return objInvoke22 == wne.f39444a ? objInvoke22 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Object objInvoke23 = ((bdl0) obj2).invoke(obj, yjeVar);
                return objInvoke23 == wne.f39444a ? objInvoke23 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object objInvoke24 = ((bdl0) obj2).invoke(obj, yjeVar);
                return objInvoke24 == wne.f39444a ? objInvoke24 : Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object objInvoke25 = ((ssl0) obj2).invoke(obj, yjeVar);
                return objInvoke25 == wne.f39444a ? objInvoke25 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Object objInvoke26 = ((ssl0) obj2).invoke(obj, yjeVar);
                return objInvoke26 == wne.f39444a ? objInvoke26 : Unit.f46060a;
            default:
                Object objInvoke27 = ((ssl0) obj2).invoke(obj, yjeVar);
                return objInvoke27 == wne.f39444a ? objInvoke27 : Unit.f46060a;
        }
    }
}
