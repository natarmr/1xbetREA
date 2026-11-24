package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class m2b0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21048a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ j2b0 c;

    public /* synthetic */ m2b0(Function1 function1, j2b0 j2b0Var, byte b) {
        this.f21048a = b;
        this.b = function1;
        this.c = j2b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21048a;
        j2b0 j2b0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new t1b0(((e2b0) j2b0Var).f7076a));
                break;
            case 1:
                fxb.D(ivb0.b, new m2b0(function1, j2b0Var, (byte) 0)).a();
                break;
            case 2:
                function1.invoke(new s1b0(((h2b0) j2b0Var).f12322a));
                break;
            default:
                fxb.D(ivb0.b, new m2b0(function1, j2b0Var, (byte) 2)).a();
                break;
        }
        return Unit.f46060a;
    }
}
