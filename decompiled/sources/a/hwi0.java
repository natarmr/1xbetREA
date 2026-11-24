package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hwi0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13771a;

    public /* synthetic */ hwi0(byte b) {
        this.f13771a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13771a) {
            case 0:
                return new zw3(okx.f25427a, (byte) 0);
            case 1:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 2:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 3:
                return new zw3(okx.f25427a, (byte) 0);
            case 4:
                return new zw3(okx.f25427a, (byte) 0);
            case 5:
                return new s6j0(false, false, false);
            case 6:
                lme0 lme0Var = qbj0.Z1;
                return new adz();
            case 7:
                return new zw3(moa.f22125a, (byte) 0);
            case 8:
                return new zw3(moa.f22125a, (byte) 0);
            case 9:
                return new dlj0();
            case 10:
                return Unit.f46060a;
            case 11:
                return new rnj0(null, true, false, false);
            case 12:
                return null;
            case 13:
                return Unit.f46060a;
            case 14:
                return new zw3(fss.f10079a, (byte) 0);
            case 15:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 16:
                return new zw3(me90.f21634a, (byte) 0);
            case 17:
                return new zw3(irj0.f15259a, (byte) 0);
            case 18:
                return new zw3(whp0.f39176a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 20:
                return new zw3(ctj0.f4940a, (byte) 0);
            case 21:
                return new LinkedBlockingDeque();
            case 22:
                int i = l2k0.J;
                return nh5.f23517a;
            case 23:
                return new z3k0(false);
            case 24:
                return ro4.m0(500, 0, dak0.f5752a, 2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return dck0.Companion.serializer();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new g0o("org.xplatform.onexuser.data.models.accountchange.sms.SmsCodeRequest.DataRequest.EmptyDataRequest", sbk0.INSTANCE, new Annotation[0]);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new g0o("org.xplatform.onexuser.data.models.accountchange.sms.SmsCodeRequest.DataRequest.SmsDataRequestRequest", wbk0.INSTANCE, new Annotation[0]);
            default:
                throw null;
        }
    }
}
