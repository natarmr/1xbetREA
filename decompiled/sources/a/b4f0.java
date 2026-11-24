package a;

import android.graphics.Paint;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.resident.presentation.views.ResidentDoorLineView;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;
import org.xplatform.resident.presentation.views.ResidentSmokeView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b4f0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1956a;

    public /* synthetic */ b4f0(vff0 vff0Var) {
        this.f1956a = (byte) 7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1956a) {
            case 0:
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                int i = hef0.C;
                return bid.f2654a;
            case 5:
                return new nef0(null);
            case 6:
                return Unit.f46060a;
            case 7:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                vff0.j(sff0.class, linkedHashMap, new LinkedHashSet());
                return linkedHashMap;
            case 8:
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new pgf0(lunVar, "", nmy.ALL, cny.CHANGED_FIRST_A_Z);
            case 9:
                return null;
            case 10:
                return new zw3(alf0.f1066a, (byte) 0);
            case 11:
                return new zw3(elf0.f7994a, (byte) 0);
            case 12:
                int i2 = ResidentDoorLineView.e;
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                iiy[] iiyVarArr = vof0.O1;
                return Unit.f46060a;
            case 15:
                return new zw3(csf0.f4886a, (byte) 0);
            case 16:
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                return new zw3(s710.f31729a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i3 = ResidentSafeLineView.m;
                return new Paint();
            case 20:
                int i4 = ResidentSafeLineView.m;
                return Float.valueOf(0.0f);
            case 21:
                int i5 = ResidentSmokeView.f;
                return Unit.f46060a;
            case 22:
                int i6 = ResidentSmokeView.f;
                return Unit.f46060a;
            case 23:
                int i7 = ResidentSmokeView.f;
                return Unit.f46060a;
            case 24:
                return new zw3(jvf0.f17202a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(mvf0.f22454a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new k2g0("", new ls2(), iun.f15405a, xun.f41520a);
            default:
                int i8 = k4g0.F;
                return u1g0.f34901a;
        }
    }

    public /* synthetic */ b4f0(byte b) {
        this.f1956a = b;
    }
}
