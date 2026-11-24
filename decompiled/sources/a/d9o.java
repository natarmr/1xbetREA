package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d9o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5711a;
    public final /* synthetic */ String b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ d9o(String str, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, int i, byte b) {
        this.f5711a = b;
        this.b = str;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5711a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                b34.E(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                rq8.r(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                aad.t(this.b, this.c, this.d, this.e, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
