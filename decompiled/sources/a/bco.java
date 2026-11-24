package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bco implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2363a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ bch0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ bco(mm40 mm40Var, String str, d9z d9zVar, e2d e2dVar, boolean z, boolean z2, a4x a4xVar, Function1 function1, int i) {
        this.f = mm40Var;
        this.g = str;
        this.h = d9zVar;
        this.i = e2dVar;
        this.b = z;
        this.c = z2;
        this.j = a4xVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2363a;
        int i = this.e;
        Object obj3 = this.j;
        Object obj4 = this.i;
        bch0 bch0Var = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                hp4.k((pz40) obj6, (l7m0) obj5, (xcz) bch0Var, (qdz) obj4, this.b, this.c, this.d, (Function1) obj3, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                epv0.K((mm40) obj6, (String) obj5, (d9z) bch0Var, (e2d) obj4, this.b, this.c, (a4x) obj3, this.d, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ bco(pz40 pz40Var, l7m0 l7m0Var, xcz xczVar, qdz qdzVar, boolean z, boolean z2, Function1 function1, Function1 function2, int i) {
        this.f = pz40Var;
        this.g = l7m0Var;
        this.h = xczVar;
        this.i = qdzVar;
        this.b = z;
        this.c = z2;
        this.d = function1;
        this.j = function2;
        this.e = i;
    }
}
