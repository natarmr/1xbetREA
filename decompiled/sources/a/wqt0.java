package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wqt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39609a;
    public final /* synthetic */ xqt0 b;
    public final /* synthetic */ vne c;

    public /* synthetic */ wqt0(xqt0 xqt0Var, vne vneVar, byte b) {
        this.f39609a = b;
        this.b = xqt0Var;
        this.c = vneVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39609a;
        vne vneVar = this.c;
        xqt0 xqt0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                xqt0Var.f(th, vneVar);
                break;
            default:
                th.getClass();
                th.getLocalizedMessage();
                xqt0Var.r.o(null, i8d.e);
                xqt0Var.f(th, vneVar);
                break;
        }
        return Unit.f46060a;
    }
}
