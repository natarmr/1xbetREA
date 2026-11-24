package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dd6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5882a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dd6(mm40 mm40Var, bvl bvlVar, xcz xczVar, float f, Function1 function1, int i, int i2) {
        this.f5882a = (byte) 2;
        this.b = mm40Var;
        this.c = bvlVar;
        this.f = xczVar;
        this.d = f;
        this.e = function1;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5882a;
        int i = this.g;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                y860.i(mm40Var, (jd6) obj4, this.d, this.e, (Function1) obj3, (fet) obj, iL, this.h);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                y860.i(mm40Var2, (jd6) obj4, this.d, this.e, (Function1) obj3, (fet) obj, iL2, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                mm40 mm40Var3 = this.b;
                ju70.p(mm40Var3, (bvl) obj4, (xcz) obj3, this.d, this.e, (fet) obj, iL3, this.h);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dd6(mm40 mm40Var, jd6 jd6Var, float f, Function1 function1, Function1 function2, int i, int i2, byte b) {
        this.f5882a = b;
        this.b = mm40Var;
        this.c = jd6Var;
        this.d = f;
        this.e = function1;
        this.f = function2;
        this.g = i;
        this.h = i2;
    }
}
