package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class q43 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28078a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ ydr i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q43(uz40 uz40Var, mm40 mm40Var, pzn pznVar, alo aloVar, String str, ugd ugdVar, int i, int i2) {
        super(2);
        this.e = uz40Var;
        this.b = mm40Var;
        this.f = pznVar;
        this.g = aloVar;
        this.h = str;
        this.i = ugdVar;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28078a;
        int i = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iL = x8x.L(i | 1);
                byte b2 = this.d;
                mm40 mm40Var = this.b;
                ay3.e((oms0) obj6, mm40Var, (Function1) obj5, (u12) obj3, (Function1) obj4, this.i, (fet) obj, iL, b2);
                break;
            default:
                ((Number) obj2).intValue();
                ugd ugdVar = (ugd) this.i;
                int iL2 = x8x.L(i | 1);
                byte b3 = this.d;
                mm40 mm40Var2 = this.b;
                b34.g((uz40) obj6, mm40Var2, (pzn) obj5, (alo) obj4, (String) obj3, ugdVar, (fet) obj, iL2, b3);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q43(oms0 oms0Var, mm40 mm40Var, Function1 function1, u12 u12Var, Function1 function2, ydr ydrVar, int i, int i2) {
        super(2);
        this.e = oms0Var;
        this.b = mm40Var;
        this.f = function1;
        this.h = u12Var;
        this.g = function2;
        this.i = ydrVar;
        this.c = i;
        this.d = i2;
    }
}
