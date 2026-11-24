package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f0l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8722a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ ugd g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f0l0(mm40 mm40Var, float f, long j, Function2 function2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, int i, int i2) {
        this.b = mm40Var;
        this.d = f;
        this.c = j;
        this.f = function2;
        this.e = ugdVar;
        this.g = ugdVar2;
        this.j = ugdVar3;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8722a;
        int i = this.h;
        Object obj3 = this.j;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                a8k0.n(this.b, this.d, this.c, this.f, this.e, this.g, (ugd) obj3, (fet) obj, iL, this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                v2n0.c(this.b, (w2d) obj3, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2, this.i);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f0l0(mm40 mm40Var, w2d w2dVar, long j, float f, ugd ugdVar, Function2 function2, ugd ugdVar2, int i, int i2) {
        this.b = mm40Var;
        this.j = w2dVar;
        this.c = j;
        this.d = f;
        this.e = ugdVar;
        this.f = function2;
        this.g = ugdVar2;
        this.h = i;
        this.i = i2;
    }
}
