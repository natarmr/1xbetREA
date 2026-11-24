package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wmr implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39417a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ cgk0 c;

    public /* synthetic */ wmr(a4x a4xVar, cgk0 cgk0Var, byte b) {
        this.f39417a = b;
        this.b = a4xVar;
        this.c = cgk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39417a;
        cgk0 cgk0Var = this.c;
        a4x a4xVar = this.b;
        ((iz3) obj).getClass();
        switch (b) {
            case 0:
                if (cgk0Var.l() < q3d.i(a4xVar)) {
                    cgk0Var.m(cgk0Var.l() + 1);
                }
                break;
            case 1:
                if (cgk0Var.l() < q3d.i(a4xVar)) {
                    cgk0Var.m(cgk0Var.l() + 1);
                }
                break;
            default:
                if (cgk0Var.l() < q3d.i(a4xVar)) {
                    cgk0Var.m(cgk0Var.l() + 1);
                }
                break;
        }
        return Unit.f46060a;
    }
}
