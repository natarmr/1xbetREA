package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ej8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7895a;

    public /* synthetic */ ej8(byte b) {
        this.f7895a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7895a;
        ab0 ab0Var = ab0.f555a;
        switch (b) {
            case 0:
                return new zi8(iun.f15405a, true);
            case 1:
                iiy[] iiyVarArr = jj8.i2;
                return new ls60();
            case 2:
                return iun.f15405a;
            case 3:
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                String str = ty8.X;
                return ab0Var;
            case 7:
                return new zz8(iun.f15405a, xun.f41520a);
            case 8:
                String str2 = s29.Y;
                return ab0Var;
            case 9:
                return Unit.f46060a;
            case 10:
                return Unit.f46060a;
            case 11:
                return 0;
            case 12:
                iun iunVar = iun.f15405a;
                return new pa9(null, iunVar, null, false, iunVar, iunVar, wdn.c, null, true);
            case 13:
                return new zw3(hb9.f12760a, (byte) 0);
            case 14:
                return new zw3(fc9.f9300a, (byte) 0);
            case 15:
                return new zw3(jq7.f16936a, (byte) 0);
            case 16:
                return new zw3(sb9.f31920a, (byte) 0);
            case 17:
                return new zw3(cc9.f4099a, (byte) 0);
            case 18:
                return new zw3(hi9.f13102a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(cxb0.f5116a, (byte) 0);
            case 20:
                return new zw3(wsf.f39688a, (byte) 0);
            case 21:
                return new zw3(lp20.f20420a, (byte) 0);
            case 22:
                return new zw3(nsf.f24049a, (byte) 0);
            case 23:
                return new zw3(rn9.f30777a, (byte) 0);
            case 24:
                return new zw3(vn9.f37709a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(zn9.f44664a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(ysm0.f43175a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ym9.f42877a, (byte) 0);
            default:
                return new zw3(qo9.f29062a, (byte) 0);
        }
    }
}
