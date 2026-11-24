package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hcd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12817a;
    public final /* synthetic */ fak0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ int d;

    public /* synthetic */ hcd(fak0 fak0Var, Function1 function1, int i, byte b) {
        this.f12817a = b;
        this.b = fak0Var;
        this.c = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12817a;
        int i = this.d;
        Function1 function1 = this.c;
        fak0 fak0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                slb.h(fak0Var, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                vdb.G(fak0Var, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
