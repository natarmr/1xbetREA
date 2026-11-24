package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qzc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29572a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ mzc0 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ qzc0(Function2 function2, mzc0 mzc0Var, pz40 pz40Var, byte b) {
        this.f29572a = b;
        this.b = function2;
        this.c = mzc0Var;
        this.d = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29572a;
        pz40 pz40Var = this.d;
        mzc0 mzc0Var = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                function2.invoke(Integer.valueOf(mzc0Var.f22648a), pz40Var.getValue());
                break;
            default:
                function2.invoke(Integer.valueOf(mzc0Var.f22648a), pz40Var.getValue());
                break;
        }
        return Unit.f46060a;
    }
}
