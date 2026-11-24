package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class buv implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3253a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fqj0 c;

    public /* synthetic */ buv(mm40 mm40Var, fqj0 fqj0Var, int i, byte b) {
        this.f3253a = b;
        this.b = mm40Var;
        this.c = fqj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3253a;
        fqj0 fqj0Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hew0.l(mm40Var, fqj0Var, fetVar, x8x.L(1));
                break;
            case 1:
                o050.H(mm40Var, fqj0Var, fetVar, x8x.L(1));
                break;
            case 2:
                xdx.l(mm40Var, fqj0Var, fetVar, x8x.L(1));
                break;
            case 3:
                tfx.j(mm40Var, fqj0Var, fetVar, x8x.L(1));
                break;
            default:
                k7n0.b(mm40Var, fqj0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
