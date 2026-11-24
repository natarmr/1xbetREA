package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dai0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5749a;
    public final /* synthetic */ jai0 b;

    public /* synthetic */ dai0(jai0 jai0Var, byte b) {
        this.f5749a = b;
        this.b = jai0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5749a;
        jai0 jai0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                jai0Var.g.b(th, new uph0(jai0Var, (byte) 12));
                break;
            default:
                th.getClass();
                jai0Var.g.b(th, new d1i0((byte) 5));
                break;
        }
        return Unit.f46060a;
    }
}
