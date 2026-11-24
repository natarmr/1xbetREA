package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dco0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5856a;

    public /* synthetic */ dco0(byte b) {
        this.f5856a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5856a) {
            case 0:
                int i = zco0.r0;
                return qfj.f28637a;
            case 1:
                int i2 = zco0.r0;
                return n4l0.f22904a;
            case 2:
                return null;
            case 3:
                return new g0o("org.xplatform.feed.navigation.TabSportRoute", vdo0.INSTANCE, new Annotation[0]);
            case 4:
                return new g0o("org.xplatform.top.api.navigation.TabTopRoute", afo0.INSTANCE, new Annotation[0]);
            case 5:
                return new zw3(n2u0.f22821a, (byte) 0);
            case 6:
                return new zw3(o2u0.f24549a, (byte) 0);
            case 7:
                return new zw3(b6d.f2047a, (byte) 0);
            case 8:
                return new zw3(tde.f33765a, (byte) 0);
            case 9:
                return new zw3(okx.f25427a, (byte) 0);
            case 10:
                return new zw3(okx.f25427a, (byte) 0);
            case 11:
                return new zw3(a6d.f313a, (byte) 0);
            case 12:
                return new zw3(okx.f25427a, (byte) 0);
            case 13:
                return new zw3(fmo0.f9794a, (byte) 0);
            case 14:
                return new zw3(djo0.f6198a, (byte) 0);
            case 15:
                return new zw3(new zw3(xko0.f41038a, (byte) 0), (byte) 0);
            case 16:
                return new zw3(emo0.f8058a, (byte) 0);
            case 17:
                return new zw3(new zw3(wio0.f39226a, (byte) 0), (byte) 0);
            case 18:
                return new zw3(new zw3(yko0.f42801a, (byte) 0), (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(ktq.f18879a, (byte) 0);
            case 20:
                return new zw3(new zw3(xio0.f40955a, (byte) 0), (byte) 0);
            case 21:
                return new zw3(okx.f25427a, (byte) 0);
            case 22:
                return new zw3(u8g0.f35230a, (byte) 0);
            case 23:
                return new zw3(ltq.f20639a, (byte) 0);
            case 24:
                return k6z.f17794a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(bab.f2249a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(cab.f4001a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(w2u0.f38469a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(v2u0.f36705a, (byte) 0);
            default:
                return new zw3(srq0.f32692a, (byte) 0);
        }
    }
}
