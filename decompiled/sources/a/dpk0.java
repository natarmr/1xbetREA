package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dpk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6472a;
    public final /* synthetic */ fpk0 b;

    public /* synthetic */ dpk0(fpk0 fpk0Var, byte b) {
        this.f6472a = b;
        this.b = fpk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6472a;
        fpk0 fpk0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                zie0 zie0Var = fpk0.V1;
                fpk0Var.I0().x(new yok0(iIntValue));
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zie0 zie0Var2 = fpk0.V1;
                if (zBooleanValue) {
                    fpk0Var.I0().x(vok0.f37772a);
                }
                break;
        }
        return Unit.f46060a;
    }
}
