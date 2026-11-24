package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pi60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27029a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ pi60(pz40 pz40Var, int i, int i2, byte b) {
        this.f27029a = b;
        this.b = pz40Var;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27029a;
        int i = this.d;
        int i2 = this.c;
        pz40 pz40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wdx.b(pz40Var, i2, fetVar, x8x.L(i | 1));
                break;
            default:
                wdx.o(pz40Var, i2, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
