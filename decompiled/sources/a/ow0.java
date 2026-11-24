package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ow0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25948a;
    public final /* synthetic */ tw0 b;

    public /* synthetic */ ow0(tw0 tw0Var, byte b) {
        this.f25948a = b;
        this.b = tw0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f25948a;
        tw0 tw0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                tw0Var.N();
                break;
            default:
                ax0 ax0Var = (ax0) obj;
                int i = tw0.x;
                p7m0 p7m0Var = tw0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, jw0.a((jw0) value, false, false, false, ax0Var, 2047)));
                break;
        }
        return Unit.f46060a;
    }
}
