package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wo4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39474a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ xo4 c;

    public /* synthetic */ wo4(Function1 function1, xo4 xo4Var, byte b) {
        this.f39474a = b;
        this.b = function1;
        this.c = xo4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39474a) {
            case 0:
                this.b.invoke(this.c);
                break;
            case 1:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c.c);
                break;
        }
        return Unit.f46060a;
    }
}
