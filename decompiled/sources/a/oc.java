package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oc extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f25003a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25003a) {
            case 0:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                pv pvVar = (pv) this.receiver;
                pvVar.getClass();
                th.printStackTrace();
                pvVar.p.f(new ev(str));
                break;
            case 2:
                Throwable th2 = (Throwable) obj;
                String str2 = (String) obj2;
                th2.getClass();
                str2.getClass();
                pv pvVar2 = (pv) this.receiver;
                pvVar2.getClass();
                th2.printStackTrace();
                pvVar2.p.f(new ev(str2));
                break;
            case 3:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 4:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 5:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 6:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 7:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 8:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 9:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 10:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 11:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 12:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 13:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                n21 n21Var = (n21) this.receiver;
                n21Var.getClass();
                sac.V(jiu0.a(n21Var), f21.f8792a, null, n21Var.o.f22085a, new qa(n21Var, th3, null, (byte) 16), 10);
                break;
            case 14:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 15:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 16:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 17:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 18:
                ((Function1) this.receiver).invoke(obj);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 20:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 21:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 22:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 23:
                ((Function1) this.receiver).invoke(obj);
                break;
            case 24:
                ((Function1) this.receiver).invoke(obj);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) this.receiver).invoke(obj);
                break;
            default:
                ((Function1) this.receiver).invoke(obj);
                break;
        }
        return Unit.f46060a;
    }
}
