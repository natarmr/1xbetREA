package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class w8p0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38734a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ y8p0 c;

    public /* synthetic */ w8p0(Function1 function1, y8p0 y8p0Var, byte b) {
        this.f38734a = b;
        this.b = function1;
        this.c = y8p0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38734a;
        y8p0 y8p0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(Long.valueOf(y8p0Var.f42205a));
                break;
            default:
                function1.invoke(Long.valueOf(y8p0Var.f42205a));
                break;
        }
        return Unit.f46060a;
    }
}
