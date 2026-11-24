package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c8l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3919a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ short e;
    public final /* synthetic */ f3n f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c8l0(mm40 mm40Var, f3n f3nVar, float f, Function1 function1, int i, byte b) {
        this.f3919a = b;
        this.b = mm40Var;
        this.f = f3nVar;
        this.c = f;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3919a;
        short s = this.e;
        f3n f3nVar = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(s | 1);
                mm40 mm40Var = this.b;
                gfx.c(mm40Var, (w2n) f3nVar, this.c, this.d, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(s | 1);
                mm40 mm40Var2 = this.b;
                ntr.v(mm40Var2, (z2n) f3nVar, this.c, this.d, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
