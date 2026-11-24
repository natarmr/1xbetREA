package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gw7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12012a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ gw7(mm40 mm40Var, pz40 pz40Var, Function0 function0, Function0 function1, int i, byte b) {
        this.f12012a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = function0;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12012a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                jiq0.H(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ohq0.F(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                piz.f(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
