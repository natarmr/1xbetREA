package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xd1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40675a;
    public final /* synthetic */ ae1 b;

    public /* synthetic */ xd1(ae1 ae1Var, byte b) {
        this.f40675a = b;
        this.b = ae1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40675a;
        ae1 ae1Var = this.b;
        switch (b) {
            case 0:
                gfk0 gfk0Var = ae1.n2;
                fiu0 fiu0Var = ae1Var.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gfk0 gfk0Var2 = ae1.n2;
                ((k3t0) ae1Var.m2.getValue()).x(vec0.f37279a);
                return Unit.f46060a;
            default:
                gfk0 gfk0Var3 = ae1.n2;
                ((k3t0) ae1Var.m2.getValue()).x(uec0.f35520a);
                return Unit.f46060a;
        }
    }
}
