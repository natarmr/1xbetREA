package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u2p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34957a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ bdz d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ u2p(mm40 mm40Var, l7m0 l7m0Var, bdz bdzVar, Function1 function1, int i, byte b) {
        this.f34957a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = bdzVar;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34957a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ny9.q(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                nia0.P(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
