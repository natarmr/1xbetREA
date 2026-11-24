package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wzh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40020a;
    public final /* synthetic */ zzh0 b;

    public /* synthetic */ wzh0(zzh0 zzh0Var, byte b) {
        this.f40020a = b;
        this.b = zzh0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40020a;
        zzh0 zzh0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                zzh0Var.q.b(th, new x0h0((byte) 26));
                break;
            case 1:
                th.getClass();
                zzh0Var.q.b(th, new x0h0((byte) 29));
                break;
            case 2:
                th.getClass();
                zzh0Var.q.b(th, new x0h0((byte) 27));
                break;
            default:
                th.getClass();
                zzh0Var.q.b(th, new x0h0((byte) 28));
                break;
        }
        return Unit.f46060a;
    }
}
