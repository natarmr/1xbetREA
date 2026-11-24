package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kkq0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18454a;
    public final /* synthetic */ lkq0 b;

    public /* synthetic */ kkq0(lkq0 lkq0Var, byte b) {
        this.f18454a = b;
        this.b = lkq0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18454a;
        lkq0 lkq0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                lkq0Var.q.b(th, new a6p0(lkq0Var, th, (byte) 15));
                break;
            case 1:
                th.getClass();
                lkq0Var.q.b(th, new shq0((byte) 3));
                break;
            default:
                th.getClass();
                lkq0Var.q.b(th, new l7p0(lkq0Var, (byte) 25));
                break;
        }
        return Unit.f46060a;
    }
}
