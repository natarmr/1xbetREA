package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7789a;
    public final /* synthetic */ ln20 b;

    public /* synthetic */ eh20(ln20 ln20Var, byte b) {
        this.f7789a = b;
        this.b = ln20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        sg20 sg20Var;
        qvj0 qvj0Var;
        byte b = this.f7789a;
        ln20 ln20Var = this.b;
        switch (b) {
            case 0:
                sg20 sg20Var2 = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var2.getClass();
                qvj0 qvj0Var2 = sg20Var2.e;
                return sg20.a(sg20Var2, null, null, null, qvj0.a(qvj0Var2, null, null, jwo0.a(qvj0Var2.c, ln20Var.M(), false, 0.0d, null, 62), null, 27), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 1:
                sg20 sg20Var3 = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var3.getClass();
                qvj0 qvj0Var3 = sg20Var3.e;
                return sg20.a(sg20Var3, null, null, null, qvj0.a(qvj0Var3, null, null, jwo0.a(qvj0Var3.c, ln20Var.M(), false, 0.0d, iun.f15405a, 6), null, 27), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (th instanceof CancellationException) {
                    return Unit.f46060a;
                }
                th.printStackTrace();
                ln20Var.H(new fd20((byte) 10));
                return Unit.f46060a;
            case 3:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                if (th2 instanceof CancellationException) {
                    return Unit.f46060a;
                }
                th2.printStackTrace();
                p7m0 p7m0Var = ln20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    sg20Var = (sg20) value;
                    ln20Var.f.getClass();
                    qvj0Var = sg20Var.e;
                } while (!p7m0Var.m(value, sg20.a(sg20Var, null, null, null, qvj0.a(qvj0Var, null, lnb0.a(qvj0Var.b, false, null, "", 2), null, null, 29), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                return Unit.f46060a;
            case 4:
                sg20 sg20Var4 = (sg20) obj2;
                ((oyg0) obj).getClass();
                sg20Var4.getClass();
                qvj0 qvj0Var4 = sg20Var4.e;
                return sg20.a(sg20Var4, null, null, null, qvj0.a(qvj0Var4, null, lnb0.a(qvj0Var4.b, false, ln20Var.P(), "", 1), null, null, 29), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
            default:
                sg20 sg20Var5 = (sg20) obj2;
                qvj0 qvj0Var5 = sg20Var5.e;
                return sg20.a(sg20Var5, null, null, null, qvj0.a(qvj0Var5, null, null, jwo0.a(qvj0Var5.c, ln20Var.M.c().f24244a, false, 0.0d, null, 62), null, 27), null, false, false, false, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
        }
    }
}
