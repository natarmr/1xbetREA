package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bu1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3209a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ fu1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ int g;

    public /* synthetic */ bu1(mm40 mm40Var, l7m0 l7m0Var, fu1 fu1Var, Function1 function1, ugd ugdVar, int i, byte b) {
        this.f3209a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = fu1Var;
        this.e = function1;
        this.f = ugdVar;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3209a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                nia0.e(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ffb0.a(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
