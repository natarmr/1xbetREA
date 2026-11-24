package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class dt00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6640a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ rk90 c;

    public /* synthetic */ dt00(Function1 function1, rk90 rk90Var, byte b) {
        this.f6640a = b;
        this.b = function1;
        this.c = rk90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6640a) {
            case 0:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
        return Unit.f46060a;
    }
}
