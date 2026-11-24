package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class qa9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28383a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ la9 c;

    public /* synthetic */ qa9(Function1 function1, la9 la9Var, byte b) {
        this.f28383a = b;
        this.b = function1;
        this.c = la9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28383a;
        la9 la9Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new ea9(la9Var.f19695a));
                break;
            default:
                function1.invoke(new ea9(la9Var.f19695a));
                break;
        }
        return Unit.f46060a;
    }
}
