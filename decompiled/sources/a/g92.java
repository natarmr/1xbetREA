package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.search.navigation.SearchScreenFactory$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g92 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10891a;
    public final /* synthetic */ n92 b;

    public /* synthetic */ g92(n92 n92Var, byte b) {
        this.f10891a = b;
        this.b = n92Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10891a;
        n92 n92Var = this.b;
        switch (b) {
            case 0:
                n92Var.G(new c92(((Integer) obj).intValue()));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                zie0 zie0Var = n92Var.y;
                int i = n92Var.q.f13447a;
                ifh0 ifh0Var = ifh0.f14687a;
                zie0Var.getClass();
                k0w0Var.h(new SearchScreenFactory$getScreen$1(i, ifh0Var));
                break;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                n92Var.J.b(th, new o00(n92Var, (byte) 28));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                n92Var.J.b(th2, new xg1((byte) 27));
                break;
        }
        return Unit.f46060a;
    }
}
