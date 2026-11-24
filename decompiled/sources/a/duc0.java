package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class duc0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6693a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ duc0(mm40 mm40Var, a4x a4xVar, int i, float f, Function1 function1, int i2, byte b) {
        this.f6693a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = i;
        this.e = f;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6693a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                n2x.r(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                n2x.q(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
