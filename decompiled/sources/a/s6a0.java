package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s6a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31693a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ s6a0(mm40 mm40Var, pz40 pz40Var, Function1 function1, Function1 function2) {
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = function1;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31693a) {
            case 0:
                ((Integer) obj2).getClass();
                a8k0.h(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a8k0.h(this.b, this.c, this.d, this.e, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ s6a0(mm40 mm40Var, pz40 pz40Var, Function1 function1, Function1 function2, int i) {
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = function1;
        this.e = function2;
    }
}
