package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class dzn extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oms0 f6948a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzn(oms0 oms0Var, Function0 function0, int i) {
        super(2);
        this.f6948a = oms0Var;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iL = x8x.L(this.c | 1);
        kzn.a(this.f6948a, this.b, (fet) obj, iL);
        return Unit.f46060a;
    }
}
