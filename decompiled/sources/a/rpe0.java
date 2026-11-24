package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rpe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30884a;
    public final /* synthetic */ tpe0 b;

    public /* synthetic */ rpe0(tpe0 tpe0Var, byte b) {
        this.f30884a = b;
        this.b = tpe0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30884a;
        tpe0 tpe0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                if (th instanceof zhi0) {
                    qjj.W(jiu0.a(tpe0Var), null, null, new s9c0(tpe0Var, th, null, (byte) 29), 3);
                } else {
                    tpe0Var.g.a(th);
                }
                break;
            case 1:
                th.getClass();
                tpe0Var.x(th);
                break;
            default:
                th.getClass();
                tpe0Var.x(th);
                break;
        }
        return Unit.f46060a;
    }
}
