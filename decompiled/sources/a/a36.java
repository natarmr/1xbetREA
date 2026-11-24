package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a36 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f158a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ q7q0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ a36(mm40 mm40Var, p6q0 p6q0Var, q7q0 q7q0Var, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, int i) {
        this.b = mm40Var;
        this.i = p6q0Var;
        this.c = q7q0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.j = function1;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f158a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                h36.c(this.b, (String) this.i, (String) this.j, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                g7x.l(this.b, (p6q0) this.i, this.c, this.d, this.e, this.f, this.g, (Function1) this.j, (fet) obj, x8x.L(this.h | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ a36(mm40 mm40Var, String str, String str2, q7q0 q7q0Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this.b = mm40Var;
        this.i = str;
        this.j = str2;
        this.c = q7q0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = i;
    }
}
