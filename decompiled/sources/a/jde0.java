package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jde0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16326a;
    public final /* synthetic */ nde0 b;

    public /* synthetic */ jde0(nde0 nde0Var, byte b) {
        this.f16326a = b;
        this.b = nde0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16326a;
        nde0 nde0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                nde0Var.f.b(th, new nrc0(nde0Var, (byte) 24));
                break;
            default:
                th.getClass();
                nde0Var.f.b(th, new nrc0(nde0Var, (byte) 24));
                break;
        }
        return Unit.f46060a;
    }
}
