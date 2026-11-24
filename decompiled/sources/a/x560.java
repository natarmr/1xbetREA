package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x560 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40299a;
    public final /* synthetic */ y560 b;

    public /* synthetic */ x560(y560 y560Var, byte b) {
        this.f40299a = b;
        this.b = y560Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40299a;
        y560 y560Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                y560Var.q.b(th, new pi40(y560Var, (byte) 24));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.b(new z0w0(drm0.e(((es) y560Var.s.f14992a).k())));
                break;
        }
        return Unit.f46060a;
    }
}
