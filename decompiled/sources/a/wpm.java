package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wpm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39551a = 2;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ short f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wpm(mm40 mm40Var, xcz xczVar, hh80 hh80Var, sw3 sw3Var, xx7 xx7Var, qkq qkqVar, boolean z, vf80 vf80Var, Function1 function1, int i, int i2) {
        this.b = mm40Var;
        this.g = xczVar;
        this.h = hh80Var;
        this.i = sw3Var;
        this.j = xx7Var;
        this.k = qkqVar;
        this.c = z;
        this.l = vf80Var;
        this.d = function1;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39551a;
        int i = this.e;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.l;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                aac.n(this.b, this.c, (String) obj8, (sfh0) obj6, (String) obj7, (gy40) obj4, this.d, (Function1) obj3, (Function0) obj5, (fet) obj, iL, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                b8k0.e(this.b, (xcz) obj8, (hh80) obj7, (sw3) obj6, (xx7) obj4, (qkq) obj3, this.c, (vf80) obj5, this.d, (fet) obj, iL2, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                ffb0.D(this.b, (f9m0) obj8, (zdm0) obj7, (j9m0) obj6, this.c, (Function0) obj5, this.d, (Function0) obj4, (ugd) obj3, (fet) obj, iL3, this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wpm(mm40 mm40Var, f9m0 f9m0Var, zdm0 zdm0Var, j9m0 j9m0Var, boolean z, Function0 function0, Function1 function1, Function0 function2, ugd ugdVar, int i, int i2) {
        this.b = mm40Var;
        this.g = f9m0Var;
        this.h = zdm0Var;
        this.i = j9m0Var;
        this.c = z;
        this.l = function0;
        this.d = function1;
        this.j = function2;
        this.k = ugdVar;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wpm(mm40 mm40Var, boolean z, String str, sfh0 sfh0Var, String str2, gy40 gy40Var, Function1 function1, Function1 function2, Function0 function0, int i, int i2) {
        this.b = mm40Var;
        this.c = z;
        this.g = str;
        this.i = sfh0Var;
        this.h = str2;
        this.j = gy40Var;
        this.d = function1;
        this.k = function2;
        this.l = function0;
        this.e = i;
        this.f = i2;
    }
}
