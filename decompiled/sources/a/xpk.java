package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xpk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41273a = 3;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ wdr k;

    public /* synthetic */ xpk(mm40 mm40Var, msk mskVar, l7m0 l7m0Var, float f, float f2, float f3, Function1 function1, Function0 function0, Function0 function2, int i) {
        this.b = mm40Var;
        this.j = mskVar;
        this.c = l7m0Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = function1;
        this.h = function0;
        this.k = function2;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41273a;
        int i = this.i;
        wdr wdrVar = this.k;
        Object obj3 = this.g;
        Object obj4 = this.h;
        Object obj5 = this.j;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                xf0.j(this.b, (msk) obj5, this.c, this.d, this.e, this.f, (Function1) obj3, (Function0) obj4, (Function0) wdrVar, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                uzb.n(this.b, (nsk) obj5, this.c, this.d, this.e, this.f, (Function1) obj3, (Function1) wdrVar, (Function0) obj4, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                mbc.l(this.b, (psk) obj5, this.c, (l7m0) obj3, this.d, this.e, this.f, (Function0) obj4, (Function0) wdrVar, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                s0x.j(this.b, this.c, this.d, this.e, this.f, (String) obj5, (String) obj4, (Function1) obj3, (ugd) wdrVar, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xpk(mm40 mm40Var, nsk nskVar, l7m0 l7m0Var, float f, float f2, float f3, Function1 function1, Function1 function2, Function0 function0, int i) {
        this.b = mm40Var;
        this.j = nskVar;
        this.c = l7m0Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = function1;
        this.k = function2;
        this.h = function0;
        this.i = i;
    }

    public /* synthetic */ xpk(mm40 mm40Var, psk pskVar, l7m0 l7m0Var, l7m0 l7m0Var2, float f, float f2, float f3, Function0 function0, Function0 function1, int i) {
        this.b = mm40Var;
        this.j = pskVar;
        this.c = l7m0Var;
        this.g = l7m0Var2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.h = function0;
        this.k = function1;
        this.i = i;
    }

    public /* synthetic */ xpk(mm40 mm40Var, l7m0 l7m0Var, float f, float f2, float f3, String str, String str2, Function1 function1, ugd ugdVar, int i) {
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.j = str;
        this.h = str2;
        this.g = function1;
        this.k = ugdVar;
        this.i = i;
    }
}
