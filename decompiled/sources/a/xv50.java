package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xv50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41542a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ xv50(Function1 function1, byte b) {
        this.f41542a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41542a;
        jy50 jy50Var = jy50.f17344a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(fv50.f10199a);
                break;
            case 1:
                function1.invoke(jn50.f16797a);
                break;
            case 2:
                function1.invoke(kn50.f18567a);
                break;
            case 3:
                function1.invoke(vz50.f38284a);
                break;
            case 4:
                function1.invoke(xz50.f41740a);
                break;
            case 5:
                function1.invoke(zz50.f45236a);
                break;
            case 6:
                function1.invoke(wz50.f40007a);
                break;
            case 7:
                function1.invoke(hy50.f13845a);
                break;
            case 8:
                function1.invoke(ky50.f19092a);
                break;
            case 9:
                function1.invoke(jy50Var);
                break;
            case 10:
                function1.invoke(jy50Var);
                break;
            case 11:
                function1.invoke(n37.f22835a);
                break;
            case 12:
                function1.invoke(x17.f40106a);
                break;
            case 13:
                function1.invoke(k37.f17604a);
                break;
            case 14:
                function1.invoke(j17.f15719a);
                break;
            case 15:
                function1.invoke(q27.f27987a);
                break;
            case 16:
                function1.invoke(dj7.f6169a);
                break;
            case 17:
                function1.invoke(hi7.f13100a);
                break;
            case 18:
                function1.invoke(ii7.f14816a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new c560(false));
                break;
            case 20:
                function1.invoke(ve8.f37270a);
                break;
            case 21:
                function1.invoke(we8.f39006a);
                break;
            case 22:
                function1.invoke(ze8.f44238a);
                break;
            case 23:
                function1.invoke(kt60.f18848a);
                break;
            case 24:
                function1.invoke(mt60.f22357a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(rt60.f31064a);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(et60.f8362a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(lt60.f20616a);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(st60.f32758a);
                break;
            default:
                function1.invoke(qt60.f29285a);
                break;
        }
        return Unit.f46060a;
    }
}
