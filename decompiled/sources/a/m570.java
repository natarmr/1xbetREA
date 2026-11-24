package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m570 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21208a;
    public final /* synthetic */ g670 b;

    public /* synthetic */ m570(g670 g670Var, byte b) {
        this.f21208a = b;
        this.b = g670Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21208a;
        g670 g670Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                g670Var.l.b(th, new cr60((byte) 19));
                break;
            case 1:
                th.getClass();
                g670Var.l.b(th, new cr60((byte) 17));
                break;
            default:
                th.getClass();
                g670Var.l.b(th, new cr60((byte) 18));
                break;
        }
        return Unit.f46060a;
    }
}
