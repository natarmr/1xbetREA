package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ntu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24119a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ntu0(Function1 function1, byte b) {
        this.f24119a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24119a;
        nzu0 nzu0Var = nzu0.f24389a;
        fbv0 fbv0Var = fbv0.f9281a;
        qlv0 qlv0Var = qlv0.f28953a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(lsu0.f20599a);
                break;
            case 1:
                function1.invoke(msu0.f22340a);
                break;
            case 2:
                function1.invoke(yvu0.f43338a);
                break;
            case 3:
                function1.invoke(nzu0Var);
                break;
            case 4:
                function1.invoke(nzu0Var);
                break;
            case 5:
                function1.invoke(jzu0.f17432a);
                break;
            case 6:
                function1.invoke(m7v0.f21338a);
                break;
            case 7:
                function1.invoke(k7v0.f17843a);
                break;
            case 8:
                function1.invoke(fbv0Var);
                break;
            case 9:
                function1.invoke(fbv0Var);
                break;
            case 10:
                function1.invoke(hbv0.f12791a);
                break;
            case 11:
                function1.invoke(oqk0.f25693a);
                break;
            case 12:
                function1.invoke(sfv0.f32134a);
                break;
            case 13:
                function1.invoke(ufv0.f35594a);
                break;
            case 14:
                function1.invoke(tfv0.f33884a);
                break;
            case 15:
                function1.invoke(vfv0.f37354a);
                break;
            case 16:
                function1.invoke(qlv0Var);
                break;
            case 17:
                function1.invoke(qlv0Var);
                break;
            case 18:
                function1.invoke(olv0.f25476a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(qlv0Var);
                break;
            case 20:
                function1.invoke(fmv0.f9804a);
                break;
            case 21:
                function1.invoke(gmv0.f11560a);
                break;
            case 22:
                function1.invoke(zmv0.f44644a);
                break;
            case 23:
                function1.invoke(bnv0.f2904a);
                break;
            default:
                function1.invoke(nyv0.f24348a);
                break;
        }
        return Unit.f46060a;
    }
}
