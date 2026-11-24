package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y31 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41929a;
    public final /* synthetic */ z31 b;

    public /* synthetic */ y31(z31 z31Var, byte b) {
        this.f41929a = b;
        this.b = z31Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41929a;
        z31 z31Var = this.b;
        switch (b) {
            case 0:
                jdk0 jdk0Var = z31.n2;
                fiu0 fiu0Var = z31Var.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                jdk0 jdk0Var2 = z31.n2;
                ((k3t0) z31Var.m2.getValue()).x(w31.f38476a);
                return Unit.f46060a;
            default:
                jdk0 jdk0Var3 = z31.n2;
                if (!z31Var.R()) {
                    jdk0 jdk0Var4 = z31.n2;
                    ((k3t0) z31Var.m2.getValue()).x(v31.f36712a);
                    z31Var.y0();
                }
                return Unit.f46060a;
        }
    }
}
