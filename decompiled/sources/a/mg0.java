package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21718a;

    public /* synthetic */ mg0(byte b) {
        this.f21718a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21718a;
        ab0 ab0Var = ab0.f555a;
        switch (b) {
            case 0:
                String str = eh0.e0;
                return ab0Var;
            case 1:
                return hi0.f13089a;
            case 2:
                y1p y1pVar = y1p.MAIN;
                iun iunVar = iun.f15405a;
                return new uk0(y1pVar, new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iunVar, false, 131200), false, iunVar, 0L, iunVar, iunVar, null, iunVar, false);
            case 3:
                return Integer.valueOf(yk0.e.b());
            case 4:
                int i = qo0.V;
                return ab0Var;
            case 5:
                return new zw3(mrv.j0(d3q.f5415a), (byte) 0);
            case 6:
                return new zw3(mrv.j0(vo0.f37742a), (byte) 0);
            case 7:
                return UUID.randomUUID().toString();
            case 8:
                return androidx.compose.runtime.e.e(Boolean.FALSE);
            case 9:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 10:
                return new zw3(s710.f31729a, (byte) 0);
            case 11:
                return new zw3(ws0.f39670a, (byte) 0);
            case 12:
                return new zw3(s710.f31729a, (byte) 0);
            case 13:
                return new zw3(h3z.f12409a, (byte) 0);
            case 14:
                return new mv0("", false, false, new Regex("^[a-zA-Z0-9]+$"));
            case 15:
                return new zw3(s710.f31729a, (byte) 0);
            case 16:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 17:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 18:
                return new zw3(s710.f31729a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return new zw3(qv0.f29366a, (byte) 0);
            case 21:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 22:
                return new zw3(xt0.f41441a, (byte) 0);
            case 23:
                return new zw3(tt0.f34487a, (byte) 0);
            case 24:
                return new zw3(zv0.f45032a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str2 = n21.a0;
                return ab0Var;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(e31.f7112a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(ld7.f19836a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(p31.f26276a, (byte) 0);
            default:
                return new zw3(l41.f19382a, (byte) 0);
        }
    }
}
