package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class t63 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oms0 f33395a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ pzn d;
    public final /* synthetic */ alo e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t63(oms0 oms0Var, Function1 function1, mm40 mm40Var, pzn pznVar, alo aloVar, ugd ugdVar, int i) {
        super(2);
        this.f33395a = oms0Var;
        this.b = function1;
        this.c = mm40Var;
        this.d = pznVar;
        this.e = aloVar;
        this.f = ugdVar;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        b34.i(this.f33395a, this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
        return Unit.f46060a;
    }
}
