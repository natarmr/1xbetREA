package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u72 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35163a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ wdr j;

    public /* synthetic */ u72(mm40 mm40Var, y72 y72Var, boolean z, boolean z2, boolean z3, vj50 vj50Var, Function0 function0, Function2 function2, int i) {
        this.b = mm40Var;
        this.g = y72Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.h = vj50Var;
        this.i = function0;
        this.j = function2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35163a;
        int i = this.f;
        wdr wdrVar = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                y0x0.c(this.b, (y72) obj5, this.c, this.d, this.e, (vj50) obj4, (Function0) obj3, (Function2) wdrVar, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                rsr0.B(this.b, (e2d) obj5, (qdz) obj4, (a4x) obj3, this.c, this.d, this.e, (Function1) wdrVar, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ u72(mm40 mm40Var, e2d e2dVar, qdz qdzVar, a4x a4xVar, boolean z, boolean z2, boolean z3, Function1 function1, int i) {
        this.b = mm40Var;
        this.g = e2dVar;
        this.h = qdzVar;
        this.i = a4xVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.j = function1;
        this.f = i;
    }
}
