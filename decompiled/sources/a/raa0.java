package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class raa0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30126a;

    public /* synthetic */ raa0(byte b) {
        this.f30126a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30126a) {
            case 0:
                return new zw3(d6u0.f5568a, (byte) 0);
            case 1:
                return new zw3(qfm0.f28642a, (byte) 0);
            case 2:
                return new zw3(wdb.f38965a, (byte) 0);
            case 3:
                return new zw3(yba0.f42334a, (byte) 0);
            case 4:
                return new zw3(whp0.f39176a, (byte) 0);
            case 5:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 6:
                return new zw3(whp0.f39176a, (byte) 0);
            case 7:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 8:
                return new zw3(nca0.f23283a, (byte) 0);
            case 9:
                return new zw3(gea0.f11144a, (byte) 0);
            case 10:
                iun iunVar = iun.f15405a;
                return new smg("", "", iunVar, "", "", iunVar);
            case 11:
                iun iunVar2 = iun.f15405a;
                return new qrh(new vrh(iunVar2, iunVar2, "", ""), new vrh(iunVar2, iunVar2, "", ""));
            case 12:
                tre0 tre0Var = sre0.f32672a;
                return new leh0("org.xplatform.onexuser.domain.betting.PlayersDuelModel", tre0Var.b(zfa0.class), new sgy[]{tre0Var.b(xfa0.class), tre0Var.b(yfa0.class)}, new jiy[]{vfa0.f37321a, new g0o("org.xplatform.onexuser.domain.betting.PlayersDuelModel.GameWithoutDuel", yfa0.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 13:
                return new zw3(s710.f31729a, (byte) 0);
            case 14:
                return new zw3(s710.f31729a, (byte) 0);
            case 15:
                return new g0o("org.xplatform.onexuser.domain.betting.PlayersDuelModel.GameWithoutDuel", yfa0.INSTANCE, new Annotation[0]);
            case 16:
                return new zw3(s710.f31729a, (byte) 0);
            case 17:
                return new zw3(s710.f31729a, (byte) 0);
            case 18:
                return new dha0(null, true, false, false);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new uha0(iun.f15405a);
            case 20:
                return new zw3(a6i0.f319a, (byte) 0);
            case 21:
                return new zw3(whp0.f39176a, (byte) 0);
            case 22:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 23:
                return new via0(iun.f15405a);
            case 24:
                return new zw3(bdo0.f2408a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(b6i0.f2056a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(o9a0.f24870a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ooa0.f25587a, (byte) 0);
            default:
                return new zw3(udq0.f35492a, (byte) 0);
        }
    }
}
