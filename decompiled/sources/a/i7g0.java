package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i7g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14289a;
    public final /* synthetic */ r9u b;

    public /* synthetic */ i7g0(r9u r9uVar, byte b) {
        this.f14289a = b;
        this.b = r9uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14289a;
        r9u r9uVar = this.b;
        switch (b) {
            case 0:
                e7g0 e7g0Var = (e7g0) obj;
                e7g0Var.getClass();
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                ArrayList arrayList = e7g0Var.f7326a;
                return arrayList.isEmpty() ? new g7g0(zD) : new f7g0(dyb.o0(arrayList), zD);
            default:
                g0m0 g0m0Var = (g0m0) obj;
                g0m0Var.getClass();
                a4x a4xVarO0 = dyb.o0(g0m0Var.f10467a);
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new h0m0(a4xVarO0, j1q0Var2.f15748a.d(ygpVar2));
        }
    }
}
