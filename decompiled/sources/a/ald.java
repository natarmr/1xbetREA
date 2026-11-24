package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ald implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1063a;
    public final swq b;

    public /* synthetic */ ald(swq swqVar, byte b) {
        this.f1063a = b;
        this.b = swqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1063a;
        swq swqVar = this.b;
        switch (b) {
            case 0:
                g93 g93Var = (g93) obj;
                g93Var.getClass();
                return g93Var.O0(swqVar);
            default:
                swq swqVar2 = (swq) obj;
                swqVar2.getClass();
                return Boolean.valueOf(!swqVar2.f32934a.c() && swqVar2.b().equals(swqVar));
        }
    }
}
