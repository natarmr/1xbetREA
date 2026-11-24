package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kdo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18116a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ kdo0(int i, mm40 mm40Var, long j, long j2, float f, ugd ugdVar, Function2 function2, ugd ugdVar2, int i2) {
        this.g = i;
        this.b = mm40Var;
        this.d = j;
        this.e = j2;
        this.c = f;
        this.f = ugdVar;
        this.i = function2;
        this.h = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18116a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(12779905);
                hxm0.c(this.g, this.b, this.d, this.e, this.c, this.f, (Function2) obj3, (ugd) obj4, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(this.g | 1);
                xwq0.a((axq0) obj4, this.b, this.c, (yjj0) obj3, this.d, this.e, this.f, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ kdo0(axq0 axq0Var, mm40 mm40Var, float f, yjj0 yjj0Var, long j, long j2, ugd ugdVar, int i) {
        this.h = axq0Var;
        this.b = mm40Var;
        this.c = f;
        this.i = yjj0Var;
        this.d = j;
        this.e = j2;
        this.f = ugdVar;
        this.g = i;
    }
}
