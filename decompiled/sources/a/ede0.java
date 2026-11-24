package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ede0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7613a;
    public final /* synthetic */ hde0 b;

    public /* synthetic */ ede0(hde0 hde0Var, byte b) {
        this.f7613a = b;
        this.b = hde0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7613a;
        hde0 hde0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                hde0Var.g.b(th, new k8e0((byte) 2));
                break;
            case 1:
                th.getClass();
                hde0Var.g.b(th, new k8e0((byte) 3));
                break;
            case 2:
                th.getClass();
                hde0Var.g.b(th, new k8e0((byte) 4));
                break;
            default:
                th.getClass();
                hde0Var.g.b(th, new k8e0((byte) 5));
                break;
        }
        return Unit.f46060a;
    }
}
