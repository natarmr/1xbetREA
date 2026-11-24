package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ja2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16167a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ja2(Function1 function1, byte b) {
        this.f16167a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16167a;
        ba2 ba2Var = ba2.f2237a;
        qd2 qd2Var = qd2.f28513a;
        ag2 ag2Var = ag2.f808a;
        sh2 sh2Var = sh2.f32189a;
        ti2 ti2Var = ti2.f33986a;
        ri2 ri2Var = ri2.f30518a;
        aj2 aj2Var = aj2.f953a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(r92.f30056a);
                break;
            case 1:
                function1.invoke(ba2Var);
                break;
            case 2:
                function1.invoke(ba2Var);
                break;
            case 3:
                function1.invoke(s92.f31831a);
                break;
            case 4:
                function1.invoke(t92.f33540a);
                break;
            case 5:
                function1.invoke(ca2.f3988a);
                break;
            case 6:
                function1.invoke(jd2.f16308a);
                break;
            case 7:
                function1.invoke(od2.f25057a);
                break;
            case 8:
                function1.invoke(qd2Var);
                break;
            case 9:
                function1.invoke(kd2.f18084a);
                break;
            case 10:
                function1.invoke(qd2Var);
                break;
            case 11:
                function1.invoke(ld2.f19828a);
                break;
            case 12:
                function1.invoke(rf2.f30365a);
                break;
            case 13:
                function1.invoke(pf2.f26879a);
                break;
            case 14:
                function1.invoke(ag2Var);
                break;
            case 15:
                function1.invoke(zf2.f44282a);
                break;
            case 16:
                function1.invoke(ag2Var);
                break;
            case 17:
                function1.invoke(lh2.f20034a);
                break;
            case 18:
                function1.invoke(jh2.f16506a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(sh2Var);
                break;
            case 20:
                function1.invoke(sh2Var);
                break;
            case 21:
                function1.invoke(ti2Var);
                break;
            case 22:
                function1.invoke(ri2Var);
                break;
            case 23:
                function1.invoke(aj2Var);
                break;
            case 24:
                function1.invoke(aj2Var);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(ti2Var);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(ri2Var);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(aj2Var);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(aj2Var);
                break;
            default:
                function1.invoke(ik2.f14904a);
                break;
        }
        return Unit.f46060a;
    }
}
