package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pw6 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27696a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ hh80 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ short j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Enum o;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pw6(mm40 mm40Var, mx6 mx6Var, oln0 oln0Var, xnb0 xnb0Var, jke jkeVar, fx6 fx6Var, String str, hh80 hh80Var, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function2 function4, int i, int i2) {
        this.b = mm40Var;
        this.k = mx6Var;
        this.l = oln0Var;
        this.m = xnb0Var;
        this.n = jkeVar;
        this.o = fx6Var;
        this.c = str;
        this.d = hh80Var;
        this.e = function0;
        this.f = function1;
        this.h = function2;
        this.g = function3;
        this.i = function4;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27696a;
        Enum r3 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                rsr0.f(this.b, (mx6) obj6, (oln0) obj5, (xnb0) obj4, (jke) obj3, (fx6) r3, this.c, this.d, this.e, this.f, this.h, this.g, this.i, (fet) obj, iL, this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                cwr0.h(this.b, (nx6) obj6, (pln0) obj5, (wnb0) obj4, (kke) obj3, (gx6) r3, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj, iL2, this.j);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pw6(mm40 mm40Var, nx6 nx6Var, pln0 pln0Var, wnb0 wnb0Var, kke kkeVar, gx6 gx6Var, String str, hh80 hh80Var, Function0 function0, Function0 function1, Function1 function2, Function0 function3, Function2 function4, int i, int i2) {
        this.b = mm40Var;
        this.k = nx6Var;
        this.l = pln0Var;
        this.m = wnb0Var;
        this.n = kkeVar;
        this.o = gx6Var;
        this.c = str;
        this.d = hh80Var;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = function3;
        this.i = function4;
        this.j = i2;
    }
}
