package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class le9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19890a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ short f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ wdr k;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ le9(mm40 mm40Var, rqm rqmVar, boolean z, gy40 gy40Var, Function0 function0, Function0 function1, Function0 function2, Function1 function3, int i, int i2) {
        this.b = mm40Var;
        this.g = rqmVar;
        this.c = z;
        this.h = gy40Var;
        this.d = function0;
        this.i = function1;
        this.j = function2;
        this.k = function3;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19890a;
        int i = this.e;
        wdr wdrVar = this.k;
        Object obj3 = this.i;
        Object obj4 = this.j;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                o050.g((Function0) obj7, this.b, this.c, (yjj0) obj6, (be9) obj5, (je9) obj3, (hh80) obj4, (ugd) wdrVar, (fet) obj, iL, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                obc.q(this.b, (rqm) obj6, this.c, (gy40) obj5, (Function0) obj7, (Function0) obj3, (Function0) obj4, (Function1) wdrVar, (fet) obj, iL2, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                b8k0.d(this.b, (xcz) obj7, (l7m0) obj6, (sw3) obj5, (hh80) obj4, this.c, (Function1) obj3, (ugd) wdrVar, (fet) obj, iL3, this.f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ le9(mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, sw3 sw3Var, hh80 hh80Var, boolean z, Function1 function1, ugd ugdVar, int i, int i2) {
        this.b = mm40Var;
        this.d = xczVar;
        this.g = l7m0Var;
        this.h = sw3Var;
        this.j = hh80Var;
        this.c = z;
        this.i = function1;
        this.k = ugdVar;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ le9(Function0 function0, mm40 mm40Var, boolean z, yjj0 yjj0Var, be9 be9Var, je9 je9Var, hh80 hh80Var, ugd ugdVar, int i, int i2) {
        this.d = function0;
        this.b = mm40Var;
        this.c = z;
        this.g = yjj0Var;
        this.h = be9Var;
        this.i = je9Var;
        this.j = hh80Var;
        this.k = ugdVar;
        this.e = i;
        this.f = i2;
    }
}
