package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class brp0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3089a;
    public final /* synthetic */ urp0 b;

    public /* synthetic */ brp0(urp0 urp0Var, byte b) {
        this.f3089a = b;
        this.b = urp0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3089a;
        urp0 urp0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                urp0Var.C(th);
                break;
            case 1:
                th.getClass();
                urp0Var.g.b(th, new zgp0((byte) 13));
                break;
            case 2:
                th.getClass();
                urp0Var.g.b(th, new zgp0((byte) 13));
                break;
            case 3:
                th.getClass();
                urp0Var.C(th);
                break;
            default:
                th.getClass();
                urp0Var.C(th);
                break;
        }
        return Unit.f46060a;
    }
}
