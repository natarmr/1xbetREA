package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pdk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26811a;

    public /* synthetic */ pdk0(byte b) {
        this.f26811a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26811a) {
            case 0:
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return Unit.f46060a;
            case 7:
                gik0[] gik0VarArrValues = gik0.values();
                gik0VarArrValues.getClass();
                return new g0o("org.xplatform.special_event.api.main.domain.eventinfo.model.SocialNetModel.SocialNetType", (Enum[]) gik0VarArrValues);
            case 8:
                return new zw3(ylk0.f42848a, (byte) 0);
            case 9:
                return new zw3(okx.f25427a, (byte) 0);
            case 10:
                oho[] ohoVarArrValues = oho.values();
                ohoVarArrValues.getClass();
                return new g0o("org.xplatform.special_event.api.main.domain.eventinfo.model.EventStyle", (Enum[]) ohoVarArrValues);
            case 11:
                return new zw3(okx.f25427a, (byte) 0);
            case 12:
                return new zw3(okx.f25427a, (byte) 0);
            case 13:
                return new zw3(okx.f25427a, (byte) 0);
            case 14:
                return new zw3(okx.f25427a, (byte) 0);
            case 15:
                return new zw3(eik0.f7865a, (byte) 0);
            case 16:
                return new zw3(okx.f25427a, (byte) 0);
            case 17:
                return new zw3(ypk0.f43035a, (byte) 0);
            case 18:
                return new zw3(okx.f25427a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(okx.f25427a, (byte) 0);
            case 20:
                return new zw3(okx.f25427a, (byte) 0);
            case 21:
                return new zw3(okx.f25427a, (byte) 0);
            case 22:
                return new zw3(iik0.f14832a, (byte) 0);
            case 23:
                return new zw3(okx.f25427a, (byte) 0);
            case 24:
                int i = iwk0.X0;
                return bid.f2654a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i2 = iwk0.X0;
                return cbv0.f4079a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i3 = iwk0.X0;
                return dll0.f6288a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(yxb0.f43413a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(mo7.f22121a, (byte) 0);
            default:
                return new zw3(zzc.f45246a, (byte) 0);
        }
    }
}
