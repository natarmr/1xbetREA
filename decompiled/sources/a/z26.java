package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z26 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43655a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ z26(mm40 mm40Var, zdo0 zdo0Var, boolean z, boolean z2, boolean z3, int i, e2d e2dVar, Function1 function1, int i2) {
        this.b = mm40Var;
        this.g = zdo0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
        this.h = e2dVar;
        this.i = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43655a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                h36.b(this.b, (String) this.g, (String) this.h, this.c, this.d, this.e, (q7q0) this.i, this.f, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                epv0.I(this.b, (zdo0) this.g, this.c, this.d, this.e, this.f, (e2d) this.h, (Function1) this.i, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z26(mm40 mm40Var, String str, String str2, boolean z, boolean z2, boolean z3, q7q0 q7q0Var, int i, int i2) {
        this.b = mm40Var;
        this.g = str;
        this.h = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.i = q7q0Var;
        this.f = i;
    }
}
