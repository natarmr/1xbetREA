package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class r43 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29816a = 0;
    public final /* synthetic */ oms0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ mm40 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ ydr i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r43(oms0 oms0Var, mm40 mm40Var, Function1 function1, u12 u12Var, Function1 function2, Function1 function3, ydr ydrVar, int i) {
        super(2);
        this.b = oms0Var;
        this.d = mm40Var;
        this.c = function1;
        this.h = u12Var;
        this.f = function2;
        this.g = function3;
        this.i = ydrVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29816a;
        int i = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iL = x8x.L(i | 1);
                oms0 oms0Var = this.b;
                mm40 mm40Var = this.d;
                Function1 function1 = this.c;
                ay3.g(oms0Var, mm40Var, function1, (u12) obj3, (Function1) obj5, (Function1) obj4, this.i, (fet) obj, iL);
                break;
            default:
                ((Number) obj2).intValue();
                ugd ugdVar = (ugd) this.i;
                int iL2 = x8x.L(i | 1);
                oms0 oms0Var2 = this.b;
                Function1 function2 = this.c;
                mm40 mm40Var2 = this.d;
                b34.d(oms0Var2, function2, mm40Var2, (pzn) obj5, (alo) obj4, (Function2) obj3, ugdVar, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r43(oms0 oms0Var, Function1 function1, mm40 mm40Var, pzn pznVar, alo aloVar, Function2 function2, ugd ugdVar, int i) {
        super(2);
        this.b = oms0Var;
        this.c = function1;
        this.d = mm40Var;
        this.f = pznVar;
        this.g = aloVar;
        this.h = function2;
        this.i = ugdVar;
        this.e = i;
    }
}
