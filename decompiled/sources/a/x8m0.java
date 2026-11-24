package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class x8m0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40470a;
    public final y8m0 b;

    public /* synthetic */ x8m0(y8m0 y8m0Var, byte b) {
        this.f40470a = b;
        this.b = y8m0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40470a;
        y8m0 y8m0Var = this.b;
        switch (b) {
            case 0:
                ffk ffkVar = y8m0Var.b;
                return q3d.j(obb.Q(ffkVar), obb.R(ffkVar));
            default:
                return y8m0Var.c ? q3d.k(obb.P(y8m0Var.b)) : iun.f15405a;
        }
    }
}
