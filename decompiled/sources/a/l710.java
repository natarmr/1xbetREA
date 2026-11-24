package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l710 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19536a;
    public final /* synthetic */ p5q0 b;

    public /* synthetic */ l710(p5q0 p5q0Var, byte b) {
        this.f19536a = b;
        this.b = p5q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19536a;
        p5q0 p5q0Var = this.b;
        switch (b) {
            case 0:
                p5q0Var.a(((ne60) obj).f23370a, m2a.g1);
                break;
            case 1:
                dpa0 dpa0Var = (dpa0) obj;
                p5q0Var.e(x2x.j0(dpa0Var, false));
                dpa0Var.a();
                break;
            default:
                dpa0 dpa0Var2 = (dpa0) obj;
                p5q0Var.e(x2x.j0(dpa0Var2, false));
                dpa0Var2.a();
                break;
        }
        return Unit.f46060a;
    }
}
