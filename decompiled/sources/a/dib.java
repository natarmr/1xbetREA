package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dib implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6129a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ dib(Function1 function1, dkb dkbVar) {
        this.f6129a = (byte) 1;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6129a;
        n37 n37Var = n37.f22835a;
        dj7 dj7Var = dj7.f6169a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(qhb.f28728a);
                return Unit.f46060a;
            case 1:
                function1.invoke(new jjb("LEADERBOARD"));
                return Unit.f46060a;
            case 2:
                function1.invoke(djb.f6176a);
                return Unit.f46060a;
            case 3:
                function1.invoke(cjb.f4452a);
                return Unit.f46060a;
            case 4:
                function1.invoke(ljb.f20140a);
                return Unit.f46060a;
            case 5:
                function1.invoke(fjb.f9631a);
                return Unit.f46060a;
            case 6:
                function1.invoke(jrb.f16995a);
                return Unit.f46060a;
            case 7:
                function1.invoke(zcc.f44158a);
                return Unit.f46060a;
            case 8:
                dyb.Q(new dib(function1, (byte) 9));
                return Unit.f46060a;
            case 9:
                function1.invoke(bdc.f2392a);
                return Boolean.TRUE;
            case 10:
                function1.invoke(xec.f40738a);
                return Unit.f46060a;
            case 11:
                function1.invoke(bhc.f2598a);
                return Unit.f46060a;
            case 12:
                function1.invoke(a74.f346a);
                return Unit.f46060a;
            case 13:
                function1.invoke(u64.f35120a);
                return Unit.f46060a;
            case 14:
                function1.invoke(b74.f2084a);
                return Unit.f46060a;
            case 15:
                function1.invoke(n37Var);
                return Unit.f46060a;
            case 16:
                function1.invoke(x17.f40106a);
                return Unit.f46060a;
            case 17:
                function1.invoke(n37Var);
                return Unit.f46060a;
            case 18:
                function1.invoke(ii7.f14816a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(hi7.f13100a);
                return Unit.f46060a;
            case 20:
                function1.invoke(ji7.f16561a);
                return Unit.f46060a;
            case 21:
                function1.invoke(oi7.f25298a);
                return Unit.f46060a;
            case 22:
                function1.invoke(dj7Var);
                return Unit.f46060a;
            case 23:
                function1.invoke(dj7Var);
                return Unit.f46060a;
            case 24:
                function1.invoke(y17.f41841a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(i17.f13983a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(a27.f110a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(bed.f2444a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(ded.f5945a);
                return Unit.f46060a;
            default:
                function1.invoke(ted.f33815a);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dib(Function1 function1, byte b) {
        this.f6129a = b;
        this.b = function1;
    }
}
