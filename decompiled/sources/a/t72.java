package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t72 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33446a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ wdr h;

    public /* synthetic */ t72(mm40 mm40Var, float f, Function0 function0, boolean z, vj50 vj50Var, y72 y72Var, Function2 function2) {
        this.b = mm40Var;
        this.d = f;
        this.e = function0;
        this.c = z;
        this.f = vj50Var;
        this.g = y72Var;
        this.h = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33446a;
        wdr wdrVar = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj5;
                vj50 vj50Var = (vj50) obj4;
                y72 y72Var = (y72) obj3;
                Function2 function2 = (Function2) wdrVar;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(s5x0.N(this.b, 0.0f, 0.0f, 0.0f, this.d, 7), 1.0f);
                    zcl zclVar = qmk.f28987a;
                    rsr0.r(fww.z(y860.W(o7k0.e(mm40VarD, 210.0f), null, null, false, null, function0, 28), this.c, vj50Var), ((x72) y72Var).f40391a, function2, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nnw0.p(this.b, (nhe) obj5, this.c, (bdz) obj4, this.d, (bzl) obj3, (Function1) wdrVar, (fet) obj, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ t72(mm40 mm40Var, nhe nheVar, boolean z, bdz bdzVar, float f, bzl bzlVar, Function1 function1, int i) {
        this.b = mm40Var;
        this.e = nheVar;
        this.c = z;
        this.f = bdzVar;
        this.d = f;
        this.g = bzlVar;
        this.h = function1;
    }
}
