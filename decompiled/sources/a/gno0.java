package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gno0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11598a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ gno0(Function1 function1, byte b) {
        this.f11598a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11598a;
        x17 x17Var = x17.f40106a;
        dj7 dj7Var = dj7.f6169a;
        n37 n37Var = n37.f22835a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(x17Var);
                break;
            case 1:
                function1.invoke(n37Var);
                break;
            case 2:
                function1.invoke(t17.f33156a);
                break;
            case 3:
                function1.invoke(x27.f40153a);
                break;
            case 4:
                function1.invoke(i17.f13983a);
                break;
            case 5:
                function1.invoke(y17.f41841a);
                break;
            case 6:
                function1.invoke(j17.f15719a);
                break;
            case 7:
                function1.invoke(n37Var);
                break;
            case 8:
                function1.invoke(q27.f27987a);
                break;
            case 9:
                function1.invoke(x17Var);
                break;
            case 10:
                function1.invoke(n37Var);
                break;
            case 11:
                function1.invoke(dj7Var);
                break;
            case 12:
                function1.invoke(ii7.f14816a);
                break;
            case 13:
                function1.invoke(oi7.f25298a);
                break;
            case 14:
                function1.invoke(dj7Var);
                break;
            case 15:
                function1.invoke(hi7.f13100a);
                break;
            case 16:
                function1.invoke(xpw.f41286a);
                break;
            case 17:
                function1.invoke(du30.f6682a);
                break;
            case 18:
                function1.invoke(dyo0.f6904a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(byo0.f3428a);
                break;
            case 20:
                function1.invoke(tyo0.f34766a);
                break;
            case 21:
                function1.invoke(ryo0.f31323a);
                break;
            case 22:
                function1.invoke(yyo0.f43476a);
                break;
            case 23:
                function1.invoke(azo0.f1728a);
                break;
            case 24:
                function1.invoke(h2p0.f12346a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(g2p0.f10571a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(j2p0.f15793a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(l2p0.f19323a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(t3p0.f33280a);
                break;
            default:
                function1.invoke(w3p0.f38513a);
                break;
        }
        return Unit.f46060a;
    }
}
