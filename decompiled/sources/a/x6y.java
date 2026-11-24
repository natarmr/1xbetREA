package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x6y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40387a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ x6y(mm40 mm40Var, pz40 pz40Var, Function0 function0, Function0 function1, int i, byte b) {
        this.f40387a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = function0;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40387a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                t9x.e(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                w9x.b(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
