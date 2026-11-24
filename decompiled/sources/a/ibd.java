package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ibd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14481a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ibd(ra00 ra00Var, float f, float f2, Function1 function1) {
        this.d = ra00Var;
        this.b = f;
        this.c = f2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14481a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ra00 ra00Var = (ra00) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g8x.s((qa00) ra00Var, this.b, this.c, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jeb.B((mm40) obj4, (l7m0) obj3, this.b, this.c, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ibd(mm40 mm40Var, l7m0 l7m0Var, float f, float f2, int i) {
        this.d = mm40Var;
        this.e = l7m0Var;
        this.b = f;
        this.c = f2;
    }
}
