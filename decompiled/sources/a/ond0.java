package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ond0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25541a;
    public final /* synthetic */ qnd0 b;

    public /* synthetic */ ond0(qnd0 qnd0Var, byte b) {
        this.f25541a = b;
        this.b = qnd0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f25541a;
        qnd0 qnd0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                qnd0Var.g.b(th, new ksc0((byte) 14));
                break;
            default:
                th.getClass();
                qnd0Var.g.b(th, new nrc0(qnd0Var, (byte) 8));
                break;
        }
        return Unit.f46060a;
    }
}
