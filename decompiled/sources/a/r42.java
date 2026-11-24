package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r42 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29814a;
    public final /* synthetic */ t42 b;

    public /* synthetic */ r42(t42 t42Var, byte b) {
        this.f29814a = b;
        this.b = t42Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29814a;
        t42 t42Var = this.b;
        switch (b) {
            case 0:
                jdk0 jdk0Var = t42.p2;
                fiu0 fiu0Var = t42Var.n2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                jdk0 jdk0Var2 = t42.p2;
                t42Var.Q0().x(n42.f22878a);
                return Unit.f46060a;
            default:
                jdk0 jdk0Var3 = t42.p2;
                t42Var.Q0().x(g42.f10641a);
                return Unit.f46060a;
        }
    }
}
