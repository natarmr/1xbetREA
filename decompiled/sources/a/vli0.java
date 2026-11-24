package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vli0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37625a;
    public final /* synthetic */ wli0 b;

    public /* synthetic */ vli0(wli0 wli0Var, byte b) {
        this.f37625a = b;
        this.b = wli0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37625a;
        wli0 wli0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                wli0Var.q.b(th, new kqh0(wli0Var, th, (byte) 6));
                break;
            case 1:
                th.getClass();
                wli0Var.q.b(th, new d1i0((byte) 27));
                break;
            default:
                th.getClass();
                wli0Var.q.b(th, new uph0(wli0Var, (byte) 15));
                break;
        }
        return Unit.f46060a;
    }
}
