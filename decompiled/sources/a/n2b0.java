package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class n2b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22790a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ j2b0 c;

    public /* synthetic */ n2b0(Function1 function1, j2b0 j2b0Var, byte b) {
        this.f22790a = b;
        this.b = function1;
        this.c = j2b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22790a;
        j2b0 j2b0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                function1.invoke(new x1b0(st0Var.f32750a, ((g2b0) j2b0Var).f10552a, st0Var.g));
                break;
            default:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                fxb.D(ivb0.b, new kch(function1, st0Var2, j2b0Var, (byte) 5)).a();
                break;
        }
        return Unit.f46060a;
    }
}
