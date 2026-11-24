package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fm60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9769a;
    public final /* synthetic */ ef8 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ fm60(ef8 ef8Var, Function1 function1, int i, byte b) {
        this.f9769a = b;
        this.b = ef8Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9769a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ohq0.D(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                ohq0.Q(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
