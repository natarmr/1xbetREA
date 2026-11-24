package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s8o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31812a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ s8o(Function1 function1, byte b) {
        this.f31812a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31812a;
        ogw ogwVar = ogw.f25238a;
        v3p v3pVar = v3p.f36740a;
        oa0 oa0Var = oa0.f24905a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(i7o.f14301a);
                break;
            case 1:
                function1.invoke(o7o.f24795a);
                break;
            case 2:
                function1.invoke(ogwVar);
                break;
            case 3:
                function1.invoke(ogwVar);
                break;
            case 4:
                function1.invoke(new ot30(jam0.h));
                break;
            case 5:
                function1.invoke(fqo.f9986a);
                break;
            case 6:
                fxb.D(ivb0.b, new s8o(function1, (byte) 7)).a();
                break;
            case 7:
                function1.invoke(dqo.f6526a);
                break;
            case 8:
                function1.invoke(gqo.f11743a);
                break;
            case 9:
                function1.invoke(cqo.f4805a);
                break;
            case 10:
                function1.invoke(cvo.f5040a);
                break;
            case 11:
                function1.invoke(dvo.f6754a);
                break;
            case 12:
                function1.invoke(oxo.f26022a);
                break;
            case 13:
                function1.invoke(uxo.f36450a);
                break;
            case 14:
                function1.invoke(ma0.f21436a);
                break;
            case 15:
                function1.invoke(oa0Var);
                break;
            case 16:
                function1.invoke(na0.f23165a);
                break;
            case 17:
                function1.invoke(oa0Var);
                break;
            case 18:
                function1.invoke(oa0Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(i2p.f14061a);
                break;
            case 20:
                function1.invoke(j2p.f15792a);
                break;
            case 21:
                function1.invoke(l2p.f19322a);
                break;
            case 22:
                function1.invoke(n2p.f22813a);
                break;
            case 23:
                function1.invoke(v3pVar);
                break;
            case 24:
                function1.invoke(s3p.f31569a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(r3p.f29799a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(t3p.f33279a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(v3pVar);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (function1 != null) {
                    function1.invoke(null);
                }
                break;
            default:
                function1.invoke(h2t.f12352a);
                break;
        }
        return Unit.f46060a;
    }
}
