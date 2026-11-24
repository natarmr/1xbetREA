package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fnm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9844a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kly d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ short h;
    public final /* synthetic */ jnm i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fnm(mm40 mm40Var, jnm jnmVar, int i, kly klyVar, Function0 function0, Function1 function1, Function1 function2, int i2, byte b) {
        this.f9844a = b;
        this.b = mm40Var;
        this.i = jnmVar;
        this.c = i;
        this.d = klyVar;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9844a) {
            case 0:
                ((Integer) obj2).getClass();
                wvb.q(this.b, (hnm) this.i, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                jwb.l(this.b, (inm) this.i, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
        }
        return Unit.f46060a;
    }
}
