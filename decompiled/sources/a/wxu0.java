package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wxu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39947a;
    public final /* synthetic */ dyu0 b;

    public /* synthetic */ wxu0(dyu0 dyu0Var, byte b) {
        this.f39947a = b;
        this.b = dyu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39947a;
        dyu0 dyu0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                dyu0Var.y.a(th);
                String message = th.getMessage();
                dyu0Var.G(new oxu0(message != null ? message : ""));
                break;
            case 1:
                th.getClass();
                dyu0Var.y.a(th);
                String message2 = th.getMessage();
                dyu0Var.G(new oxu0(message2 != null ? message2 : ""));
                break;
            default:
                th.getClass();
                dyu0Var.y.b(th, new ggt0(dyu0Var, (byte) 13));
                break;
        }
        return Unit.f46060a;
    }
}
