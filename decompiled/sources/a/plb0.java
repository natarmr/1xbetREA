package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class plb0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27175a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ mza0 c;

    public /* synthetic */ plb0(Function1 function1, mza0 mza0Var, byte b) {
        this.f27175a = b;
        this.b = function1;
        this.c = mza0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27175a;
        mza0 mza0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new plb0(function1, mza0Var, (byte) 1)).a();
                break;
            default:
                function1.invoke(new sya0(mza0Var.b, mza0Var.f22644a));
                break;
        }
        return Unit.f46060a;
    }
}
