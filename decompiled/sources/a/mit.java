package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mit implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21862a;
    public final /* synthetic */ sit b;

    public /* synthetic */ mit(sit sitVar, byte b) {
        this.f21862a = b;
        this.b = sitVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f21862a;
        sit sitVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                p7m0 p7m0Var = sitVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    sitVar.f.getClass();
                } while (!p7m0Var.m(value, zht.a((zht) value, null, null, false, null, null, false, false, null, null, 991)));
                qu quVar = sitVar.y;
                quVar.getClass();
                i8i.D(CommonConstant.KEY_STATUS, "decline", quVar.f29324a, "generate_coupon_done");
                b1j.v("decline", sitVar.C.f40143a, 3212L);
                sitVar.w.b(th, new sjs(th, sitVar, (byte) 5));
                break;
            default:
                th.getClass();
                sitVar.F.l(th, jiu0.a(sitVar).f3272a);
                break;
        }
        return Unit.f46060a;
    }
}
