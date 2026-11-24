package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fbk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9263a;
    public final /* synthetic */ hh80 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ fbk(hh80 hh80Var, l7m0 l7m0Var, int i, byte b) {
        this.f9263a = b;
        this.b = hh80Var;
        this.c = l7m0Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9263a;
        int i = this.d;
        l7m0 l7m0Var = this.c;
        hh80 hh80Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                nnw0.k(hh80Var, l7m0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                fre0.D(hh80Var, l7m0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
