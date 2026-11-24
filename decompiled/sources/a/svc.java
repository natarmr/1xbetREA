package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class svc implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32859a;
    public final Object b;

    public /* synthetic */ svc(Object obj, byte b) {
        this.f32859a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32859a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((h79) obj).invoke();
            case 1:
                return (ywc) obj;
            case 2:
                return (riu0) ((svc) obj).invoke();
            case 3:
                y3d y3dVar = (y3d) ((t33) obj).d();
                long j = y3dVar.f41946a;
                return y3dVar;
            case 4:
                return new q0h0((p0h0) ((jud) obj).invoke());
            case 5:
                return (nud) obj;
            case 6:
                return (riu0) ((svc) obj).invoke();
            case 7:
                return new q0h0((p0h0) ((axd) obj).invoke());
            case 8:
                return (exd) obj;
            case 9:
                return (riu0) ((svc) obj).invoke();
            case 10:
                return (oyd) obj;
            case 11:
                return (riu0) ((svc) obj).invoke();
            case 12:
                return new q0h0((p0h0) ((uyd) obj).invoke());
            case 13:
                return (xyd) obj;
            case 14:
                return (riu0) ((svc) obj).invoke();
            case 15:
                return new q0h0((p0h0) ((rzd) obj).invoke());
            case 16:
                return (uzd) obj;
            case 17:
                return (riu0) ((svc) obj).invoke();
            case 18:
                return (i5e) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((svc) obj).invoke();
            case 20:
                return (e7e) obj;
            case 21:
                return (riu0) ((svc) obj).invoke();
            case 22:
                return (dbe) obj;
            case 23:
                return (riu0) ((svc) obj).invoke();
            case 24:
                return (dce) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((svc) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (Class) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Object obj2 = ((mie0) obj).f21842a;
                if (obj2 != null) {
                    return (iyj0) obj2;
                }
                Intrinsics.h("result");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                mre0 mre0Var = ((v2) obj).f36658a;
                Type type = mre0Var != null ? (Type) mre0Var.invoke() : null;
                type.getClass();
                return bqe0.c(type);
            default:
                return new q0h0((p0h0) ((ype) obj).invoke());
        }
    }
}
