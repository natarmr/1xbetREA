package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ku20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18894a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ f07 c;
    public final /* synthetic */ long d;

    public /* synthetic */ ku20(Function1 function1, f07 f07Var, long j, byte b) {
        this.f18894a = b;
        this.b = function1;
        this.c = f07Var;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18894a) {
            case 0:
                fxb.D(ivb0.b, new ku20(this.b, this.c, this.d, (byte) 1)).a();
                break;
            default:
                this.b.invoke(new jy20(new c130(this.c, this.d)));
                break;
        }
        return Unit.f46060a;
    }
}
