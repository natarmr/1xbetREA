package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e54 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7213a;
    public final /* synthetic */ pkk0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ e54(pkk0 pkk0Var, Function1 function1, byte b) {
        this.f7213a = b;
        this.b = pkk0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7213a;
        Function1 function1 = this.c;
        pkk0 pkk0Var = this.b;
        switch (b) {
            case 0:
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                function1.invoke(z44.f43751a);
                break;
            case 1:
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                fxb.D(ivb0.b, new opm0(function1, (byte) 4)).a();
                break;
            case 2:
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                function1.invoke(new j6s(false));
                break;
            case 3:
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                function1.invoke(new his(false));
                break;
            default:
                if (pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                function1.invoke(new jmr(false));
                break;
        }
        return Unit.f46060a;
    }
}
