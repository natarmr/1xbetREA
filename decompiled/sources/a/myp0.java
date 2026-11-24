package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class myp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22613a;
    public final /* synthetic */ oyp0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ myp0(oyp0 oyp0Var, Function1 function1, int i, byte b) {
        this.f22613a = b;
        this.b = oyp0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22613a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                y9a.L(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                y9a.p(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
