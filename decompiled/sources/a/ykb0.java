package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ykb0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42781a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ npo c;

    public /* synthetic */ ykb0(mm40 mm40Var, npo npoVar, int i, byte b) {
        this.f42781a = b;
        this.b = mm40Var;
        this.c = npoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42781a;
        npo npoVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ucx.g(mm40Var, npoVar, fetVar, x8x.L(1));
                break;
            default:
                efx.o(mm40Var, npoVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
