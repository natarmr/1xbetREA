package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class jc40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16258a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ lc40 c;

    public /* synthetic */ jc40(Function1 function1, lc40 lc40Var, byte b) {
        this.f16258a = b;
        this.b = function1;
        this.c = lc40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16258a;
        lc40 lc40Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(lc40Var.f19783a);
                break;
            default:
                function1.invoke(lc40Var.f19783a);
                break;
        }
        return Unit.f46060a;
    }
}
