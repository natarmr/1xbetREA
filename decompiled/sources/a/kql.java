package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18729a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ xql c;
    public final /* synthetic */ int d;

    public /* synthetic */ kql(mm40 mm40Var, xql xqlVar, int i, byte b) {
        this.f18729a = b;
        this.b = mm40Var;
        this.c = xqlVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18729a;
        int i = this.d;
        xql xqlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ahy.q(mm40Var, xqlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                i120.t(mm40Var, xqlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                j120.p(mm40Var, xqlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
