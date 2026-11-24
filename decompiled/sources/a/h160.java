package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h160 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12268a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ bdz d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ h160(mm40 mm40Var, bdz bdzVar, a4x a4xVar, Function1 function1, int i) {
        this.f12268a = (byte) 2;
        this.b = mm40Var;
        this.d = bdzVar;
        this.c = a4xVar;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12268a) {
            case 0:
                ((Integer) obj2).getClass();
                nia0.D(x8x.L(1), (fet) obj, this.c, this.d, this.b, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                epv0.v(x8x.L(1), (fet) obj, this.c, this.d, this.b, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                epv0.k(x8x.L(1), (fet) obj, this.c, this.d, this.b, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ h160(mm40 mm40Var, a4x a4xVar, bdz bdzVar, Function1 function1, int i, byte b) {
        this.f12268a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = bdzVar;
        this.e = function1;
    }
}
