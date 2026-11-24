package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e160 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7024a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ bdz e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ e160(mm40 mm40Var, a4x a4xVar, bdz bdzVar, boolean z, Function1 function1, int i) {
        this.f7024a = (byte) 2;
        this.b = mm40Var;
        this.c = a4xVar;
        this.e = bdzVar;
        this.d = z;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7024a) {
            case 0:
                ((Integer) obj2).getClass();
                nia0.y(x8x.L(1), (fet) obj, this.c, this.e, this.b, this.f, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                nia0.C(x8x.L(1), (fet) obj, this.c, this.e, this.b, this.f, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                nia0.F(x8x.L(1), (fet) obj, this.c, this.e, this.b, this.f, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                nia0.q(x8x.L(1), (fet) obj, this.c, this.e, this.b, this.f, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ e160(mm40 mm40Var, a4x a4xVar, boolean z, bdz bdzVar, Function1 function1, int i) {
        this.f7024a = (byte) 1;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = z;
        this.e = bdzVar;
        this.f = function1;
    }

    public /* synthetic */ e160(mm40 mm40Var, bdz bdzVar, a4x a4xVar, boolean z, Function1 function1, int i, byte b) {
        this.f7024a = b;
        this.b = mm40Var;
        this.e = bdzVar;
        this.c = a4xVar;
        this.d = z;
        this.f = function1;
    }
}
