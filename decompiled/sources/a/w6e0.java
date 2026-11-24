package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w6e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38622a;
    public final /* synthetic */ j2m0 b;
    public final /* synthetic */ c3m0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ w6e0(j2m0 j2m0Var, c3m0 c3m0Var, Function1 function1, int i, byte b) {
        this.f38622a = b;
        this.b = j2m0Var;
        this.c = c3m0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38622a;
        Function1 function1 = this.d;
        c3m0 c3m0Var = this.c;
        j2m0 j2m0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                b34.G(j2m0Var, c3m0Var, function1, fetVar, x8x.L(9));
                break;
            default:
                wha0.C(j2m0Var, c3m0Var, function1, fetVar, x8x.L(9));
                break;
        }
        return Unit.f46060a;
    }
}
