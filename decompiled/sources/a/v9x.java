package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v9x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37055a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ v9x(mm40 mm40Var, l7m0 l7m0Var, String str, Function1 function1, int i) {
        this.b = mm40Var;
        this.d = l7m0Var;
        this.c = str;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37055a) {
            case 0:
                ((Integer) obj2).getClass();
                w9x.a(x8x.L(7), (fet) obj, this.b, this.d, this.c, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                p7x.j(x8x.L(7), (fet) obj, this.b, this.d, this.c, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ v9x(mm40 mm40Var, String str, l7m0 l7m0Var, Function1 function1, int i) {
        this.b = mm40Var;
        this.c = str;
        this.d = l7m0Var;
        this.e = function1;
    }
}
