package a;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f13 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8745a;
    public final /* synthetic */ rmb0 b;

    public /* synthetic */ f13(rmb0 rmb0Var, byte b) {
        this.f8745a = b;
        this.b = rmb0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8745a;
        rmb0 rmb0Var = this.b;
        switch (b) {
            case 0:
                j6z j6zVarU = ((j6z) obj).U();
                j6zVarU.getClass();
                rmb0Var.q(j6zVarU);
                break;
            case 1:
                rmb0Var.m10setPopupContentSizefhxjrPA((qkx) obj);
                rmb0Var.r();
                break;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = rmb0Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = rmb0Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new fx2(function0, (byte) 6));
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
