package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xhn0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40902a;
    public final /* synthetic */ fin0 b;

    public /* synthetic */ xhn0(fin0 fin0Var, byte b) {
        this.f40902a = b;
        this.b = fin0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40902a;
        fin0 fin0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.b(new z0w0(drm0.e(((es) fin0Var.e.f14992a).k())));
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                fin0Var.c.b(th, new abn0(fin0Var, (byte) 8));
                break;
        }
        return Unit.f46060a;
    }
}
