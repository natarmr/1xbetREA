package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pyj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27803a;
    public final /* synthetic */ wyj0 b;

    public /* synthetic */ pyj0(wyj0 wyj0Var, byte b) {
        this.f27803a = b;
        this.b = wyj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27803a;
        wyj0 wyj0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                wyj0Var.w(th);
                break;
            default:
                th.getClass();
                wyj0Var.w(th);
                break;
        }
        return Unit.f46060a;
    }
}
