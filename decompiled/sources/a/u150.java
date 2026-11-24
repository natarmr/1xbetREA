package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class u150 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34887a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ k250 c;

    public /* synthetic */ u150(Function1 function1, k250 k250Var, byte b) {
        this.f34887a = b;
        this.b = function1;
        this.c = k250Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34887a;
        k250 k250Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new a150(((z150) k250Var).f43602a));
                break;
            case 1:
                function1.invoke(new a150(((i250) k250Var).f14033a));
                break;
            case 2:
                function1.invoke(new h150(((b250) k250Var).f1840a));
                break;
            case 3:
                function1.invoke(new x050(((y150) k250Var).f41839a));
                break;
            default:
                function1.invoke(new d150(((y150) k250Var).f41839a));
                break;
        }
        return Unit.f46060a;
    }
}
