package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bsl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3135a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ py1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ bsl(mm40 mm40Var, py1 py1Var, Function0 function0, Function0 function1, Function0 function2, int i, byte b) {
        this.f3135a = b;
        this.b = mm40Var;
        this.c = py1Var;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3135a) {
            case 0:
                ((Integer) obj2).getClass();
                feb.l(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ieb.n(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ieb.c(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                jeb.p(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                bfb.n(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }
}
