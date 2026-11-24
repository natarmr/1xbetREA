package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vxc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38193a;
    public final /* synthetic */ ayc0 b;

    public /* synthetic */ vxc0(ayc0 ayc0Var, byte b) {
        this.f38193a = b;
        this.b = ayc0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38193a;
        ayc0 ayc0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                ayc0Var.P(th);
                break;
            case 1:
                th.getClass();
                ayc0Var.t.b(th, new ksc0((byte) 10));
                break;
            case 2:
                th.getClass();
                ayc0Var.t.b(th, new ksc0((byte) 11));
                break;
            default:
                th.getClass();
                ayc0Var.P(th);
                break;
        }
        return Unit.f46060a;
    }
}
