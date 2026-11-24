package a;

import com.huawei.hms.adapter.internal.CommonCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ocg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25025a;
    public final /* synthetic */ aig b;

    public /* synthetic */ ocg(aig aigVar, byte b) {
        this.f25025a = b;
        this.b = aigVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f25025a;
        aig aigVar = this.b;
        switch (b) {
            case 0:
                ((lwk) obj).getClass();
                aigVar.x(ghg.f11296a);
                return new ty2(aigVar, (byte) 9);
            case 1:
                switch (((Integer) obj).intValue()) {
                    case 1001:
                        aigVar.x(mhg.f21791a);
                        break;
                    case CommonCode.BusInterceptor.PRIVACY_CANCEL /* 1002 */:
                        aigVar.x(ohg.f25263a);
                        break;
                    case 1003:
                        aigVar.x(phg.f26995a);
                        break;
                }
                return Unit.f46060a;
            default:
                String str = (String) obj;
                str.getClass();
                aigVar.x(new lhg(str));
                return Unit.f46060a;
        }
    }
}
