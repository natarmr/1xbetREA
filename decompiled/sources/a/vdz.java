package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vdz implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37256a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ wdr l;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vdz(mm40 mm40Var, bbn bbnVar, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, Function0 function0, Function0 function1, Function0 function3, int i, int i2) {
        this.b = mm40Var;
        this.f = bbnVar;
        this.c = f;
        this.g = ezjVar;
        this.h = gy40Var;
        this.i = function2;
        this.j = function0;
        this.k = function1;
        this.l = function3;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37256a;
        int i = this.d;
        wdr wdrVar = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                ydx.e((y3m0) obj8, this.b, (mez) obj7, (lh80) obj6, (sw3) obj5, this.c, (qkq) obj4, this.e, (vf80) obj3, (Function1) wdrVar, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                q7x.n(this.b, (bbn) obj8, this.c, (ezj) obj7, (gy40) obj6, (Function2) obj5, (Function0) obj4, (Function0) obj3, (Function0) wdrVar, (fet) obj, iL2, this.e ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vdz(y3m0 y3m0Var, mm40 mm40Var, mez mezVar, lh80 lh80Var, sw3 sw3Var, float f, qkq qkqVar, boolean z, vf80 vf80Var, Function1 function1, int i) {
        this.f = y3m0Var;
        this.b = mm40Var;
        this.g = mezVar;
        this.h = lh80Var;
        this.i = sw3Var;
        this.c = f;
        this.j = qkqVar;
        this.e = z;
        this.k = vf80Var;
        this.l = function1;
        this.d = i;
    }
}
