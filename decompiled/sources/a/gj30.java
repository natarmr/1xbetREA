package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gj30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11377a;

    public /* synthetic */ gj30(byte b) {
        this.f11377a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11377a) {
            case 0:
                return new zw3(kj30.f18367a, (byte) 0);
            case 1:
                return new zw3(aas.f544a, (byte) 0);
            case 2:
                return new zw3(xxm0.f41666a, (byte) 0);
            case 3:
                return new zw3(fo2.f9861a, (byte) 0);
            case 4:
                atz atzVar = ik30.W1;
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return new zw3(okx.f25427a, (byte) 0);
            case 7:
                return new zw3(okx.f25427a, (byte) 0);
            case 8:
                q7r0.O1.getClass();
                return new q7r0();
            case 9:
                ysl0.O1.getClass();
                return new ysl0();
            case 10:
                q21.O1.getClass();
                return new q21();
            case 11:
                xru0.O1.getClass();
                return new xru0();
            case 12:
                cyv0.O1.getClass();
                return new cyv0();
            case 13:
                kc80.O1.getClass();
                return new kc80();
            case 14:
                return new zw3(r5i0.f29887a, (byte) 0);
            case 15:
                udr0.O1.getClass();
                return new udr0();
            case 16:
                mtl0.O1.getClass();
                return new mtl0();
            case 17:
                nfo0.O1.getClass();
                return new nfo0();
            case 18:
                hsu0.O1.getClass();
                return new hsu0();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wzv0.O1.getClass();
                return new wzv0();
            case 20:
                xc80.O1.getClass();
                return new xc80();
            case 21:
                return new zw3(il30.f14958a, (byte) 0);
            case 22:
                return new zw3(il30.f14958a, (byte) 0);
            case 23:
                return new zw3(j640.f15967a, (byte) 0);
            case 24:
                return new zw3(ist0.f15322a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new n940(c940.f3944a, false, xun.f41520a, iun.f15405a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new uz40(Boolean.FALSE);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(okx.f25427a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(gdo.f11112a, (byte) 0);
            default:
                return new zw3(co2.f4681a, (byte) 0);
        }
    }
}
