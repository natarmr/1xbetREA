package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xns0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41184a;

    public /* synthetic */ xns0(byte b) {
        this.f41184a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41184a) {
            case 0:
                return new zw3(aos0.f1217a, (byte) 0);
            case 1:
                return new zw3(cos0.f4718a, (byte) 0);
            case 2:
                return new zw3(y5v0.f42066a, (byte) 0);
            case 3:
                return new zw3(moa.f22125a, (byte) 0);
            case 4:
                return new zw3(moa.f22125a, (byte) 0);
            case 5:
                return androidx.compose.runtime.e.a(0.0f);
            case 6:
                return androidx.compose.runtime.e.a(0.0f);
            case 7:
                return androidx.compose.runtime.e.a(0.0f);
            case 8:
                kin0 kin0VarE = qem0.e();
                rwj rwjVar = tvk.f34603a;
                return d5c.a(kotlin.coroutines.e.c(kin0VarE, dvj.c));
            case 9:
                return g1t0.f10533a;
            case 10:
                return new h1t0();
            case 11:
                std stdVar = new std();
                q7m0.a(null);
                return stdVar;
            case 12:
                pz40 pz40Var = s6t0.f31722a;
                return s6t0.b();
            case 13:
                return new zw3(o3t0.f24602a, (byte) 0);
            case 14:
                return new zw3(f6t0.f9030a, (byte) 0);
            case 15:
                return new aat0(null, true);
            case 16:
                return new wat0(null, true);
            case 17:
                return new zw3(oct0.f25045a, (byte) 0);
            case 18:
                return new zw3(ict0.f14552a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i = jdt0.N;
                return bid.f2654a;
            case 20:
                return new zw3(whp0.f39176a, (byte) 0);
            case 21:
                return new zw3(vft0.f37351a, (byte) 0);
            case 22:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 23:
                return new zw3(whp0.f39176a, (byte) 0);
            case 24:
                return new sgt0(iun.f15405a, true, false);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(ln7.f20330a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(okx.f25427a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(jq7.f16936a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ffc0.f9443a, (byte) 0);
            default:
                return new zw3(okx.f25427a, (byte) 0);
        }
    }
}
