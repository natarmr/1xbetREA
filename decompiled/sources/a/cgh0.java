package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cgh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4314a = 2;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wdr d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cgh0(mm40 mm40Var, hfh0 hfh0Var, l7m0 l7m0Var, boolean z, xcz xczVar, Function1 function1, int i) {
        this.b = mm40Var;
        this.f = hfh0Var;
        this.g = l7m0Var;
        this.c = z;
        this.h = xczVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4314a;
        int i = this.e;
        Object obj3 = this.h;
        wdr wdrVar = this.d;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                c3x.l(this.b, (hfh0) obj5, (l7m0) obj4, this.c, (xcz) obj3, (Function1) wdrVar, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                ahy.o(this.b, (kfl0) obj5, this.c, (j700) obj4, (zcz) obj3, (Function1) wdrVar, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                ltt0.b(this.b, (awr0) obj5, this.c, (Function1) wdrVar, (Function1) obj4, (xdr) obj3, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                xwq0.b((vmb0) obj5, (ugd) obj4, (bxq0) obj3, this.b, this.c, (ugd) wdrVar, (fet) obj, iL4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(i | 1);
                u4n0.j(this.b, (cev0) obj5, this.c, (Function0) obj4, (Function1) wdrVar, (Function1) obj3, (fet) obj, iL5);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cgh0(mm40 mm40Var, kfl0 kfl0Var, boolean z, j700 j700Var, zcz zczVar, Function1 function1, int i) {
        this.b = mm40Var;
        this.f = kfl0Var;
        this.c = z;
        this.g = j700Var;
        this.h = zczVar;
        this.d = function1;
        this.e = i;
    }

    public /* synthetic */ cgh0(mm40 mm40Var, awr0 awr0Var, boolean z, Function1 function1, Function1 function2, xdr xdrVar, int i) {
        this.b = mm40Var;
        this.f = awr0Var;
        this.c = z;
        this.d = function1;
        this.g = function2;
        this.h = xdrVar;
        this.e = i;
    }

    public /* synthetic */ cgh0(mm40 mm40Var, cev0 cev0Var, boolean z, Function0 function0, Function1 function1, Function1 function2, int i) {
        this.b = mm40Var;
        this.f = cev0Var;
        this.c = z;
        this.g = function0;
        this.d = function1;
        this.h = function2;
        this.e = i;
    }

    public /* synthetic */ cgh0(vmb0 vmb0Var, ugd ugdVar, bxq0 bxq0Var, mm40 mm40Var, boolean z, ugd ugdVar2, int i) {
        this.f = vmb0Var;
        this.g = ugdVar;
        this.h = bxq0Var;
        this.b = mm40Var;
        this.c = z;
        this.d = ugdVar2;
        this.e = i;
    }
}
