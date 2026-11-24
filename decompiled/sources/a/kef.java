package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class kef extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oms0 f18152a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ cfq c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kef(oms0 oms0Var, mm40 mm40Var, cfq cfqVar, Function1 function1, ugd ugdVar, int i) {
        super(2);
        this.f18152a = oms0Var;
        this.b = mm40Var;
        this.c = cfqVar;
        this.d = function1;
        this.e = ugdVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        jwb.d(this.f18152a, this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
        return Unit.f46060a;
    }
}
