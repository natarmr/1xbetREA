package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ccp0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4123a;

    public /* synthetic */ ccp0(byte b) {
        this.f4123a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4123a) {
            case 0:
                return new zw3(zbp0.f44127a, (byte) 0);
            case 1:
                zcl zclVar = qmk.f28987a;
                return new ycl(36.0f);
            case 2:
                zcl zclVar2 = qmk.f28987a;
                return new ycl(36.0f);
            case 3:
                zcl zclVar3 = qmk.f28987a;
                return new ycl(4.0f);
            case 4:
                zcl zclVar4 = qmk.f28987a;
                return new ycl(36.0f);
            case 5:
                zcl zclVar5 = qmk.f28987a;
                return new ycl(4.0f);
            case 6:
                return new zw3(wkr.f39321a, (byte) 0);
            case 7:
                return new zw3(wkr.f39321a, (byte) 0);
            case 8:
                return new zw3(wkr.f39321a, (byte) 0);
            case 9:
                return new zw3(wkr.f39321a, (byte) 0);
            case 10:
                return new zw3(wkr.f39321a, (byte) 0);
            case 11:
            case 12:
                return null;
            case 13:
                return new zw3(kfp0.f18206a, (byte) 0);
            case 14:
                return new zw3(xu40.f41493a, (byte) 0);
            case 15:
                return 2;
            case 16:
                return gqw0.e;
            case 17:
                return gqw0.e;
            case 18:
                return 2;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new f2q0(3);
            case 20:
                return new f2q0(3);
            case 21:
                return gqw0.e;
            case 22:
                return gqw0.e;
            case 23:
            case 24:
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new f2q0(3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new f2q0(3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return 5;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            default:
                return null;
        }
    }
}
