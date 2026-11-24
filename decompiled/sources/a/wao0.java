package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wao0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38840a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ivk0 c;
    public final /* synthetic */ ebo0 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ wao0(mm40 mm40Var, ivk0 ivk0Var, ebo0 ebo0Var, Function1 function1, int i, byte b) {
        this.f38840a = b;
        this.b = mm40Var;
        this.c = ivk0Var;
        this.d = ebo0Var;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38840a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                cvm0.c(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                lvm0.c(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
