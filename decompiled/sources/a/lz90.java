package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lz90 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20895a;
    public final /* synthetic */ nz90 b;

    public /* synthetic */ lz90(nz90 nz90Var, byte b) {
        this.f20895a = b;
        this.b = nz90Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f20895a;
        nz90 nz90Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                p7m0 p7m0Var = nz90Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    nz90Var.f.getClass();
                } while (!p7m0Var.m(value, x48.a((x48) value, false, true, false, 0, 60)));
                break;
            default:
                th.getClass();
                p7m0 p7m0Var2 = nz90Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    nz90Var.f.getClass();
                } while (!p7m0Var2.m(value2, x48.a((x48) value2, false, true, false, 0, 60)));
                break;
        }
        return Unit.f46060a;
    }
}
