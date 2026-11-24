package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v8o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36995a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p6t0 c;

    public /* synthetic */ v8o(Function1 function1, p6t0 p6t0Var, byte b) {
        this.f36995a = b;
        this.b = function1;
        this.c = p6t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36995a;
        p6t0 p6t0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((o5s0) obj).getClass();
                function1.invoke(new p7o((o5s0) p6t0Var));
                break;
            default:
                ((m8m) obj).getClass();
                jhz jhzVar = (jhz) p6t0Var;
                function1.invoke(new ifz(jhzVar.c, jhzVar.b, jhzVar.d));
                break;
        }
        return Unit.f46060a;
    }
}
