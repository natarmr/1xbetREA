package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o4p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24650a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ o4p(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, Function1 function2, int i, byte b) {
        this.f24650a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = l7m0Var2;
        this.e = function1;
        this.f = function2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24650a) {
            case 0:
                ((Integer) obj2).getClass();
                p8a.F(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                vbc.Q(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x2x.m(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(this.g | 1));
                break;
        }
        return Unit.f46060a;
    }
}
