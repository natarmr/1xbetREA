package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.search.navigation.SearchScreenFactory$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class npk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23918a;
    public final /* synthetic */ tpk0 b;

    public /* synthetic */ npk0(tpk0 tpk0Var, byte b) {
        this.f23918a = b;
        this.b = tpk0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23918a;
        tpk0 tpk0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                tpk0Var.N.b(th, new edk0(tpk0Var, (byte) 3));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                zie0 zie0Var = tpk0Var.A;
                int i = ((jpk0) tpk0Var.D()).f16907a;
                ifh0 ifh0Var = ifh0.f14687a;
                zie0Var.getClass();
                k0w0Var.h(new SearchScreenFactory$getScreen$1(i, ifh0Var));
                break;
        }
        return Unit.f46060a;
    }
}
