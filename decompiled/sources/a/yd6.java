package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yd6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42418a;
    public final /* synthetic */ me6 b;

    public /* synthetic */ yd6(me6 me6Var, byte b) {
        this.f42418a = b;
        this.b = me6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42418a;
        me6 me6Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                me6Var.h.b(th, new gh5((byte) 12));
                break;
            default:
                th.getClass();
                me6Var.h.b(th, new gh5((byte) 13));
                break;
        }
        return Unit.f46060a;
    }
}
