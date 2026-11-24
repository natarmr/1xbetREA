package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gwy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12050a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ gwy(mm40 mm40Var, a4x a4xVar, Function0 function0, Function1 function1, int i, byte b) {
        this.f12050a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = function0;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12050a) {
            case 0:
                ((Integer) obj2).getClass();
                xvw.b(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xvw.t(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                g7x.f(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                hp4.w(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1));
                break;
        }
        return Unit.f46060a;
    }
}
