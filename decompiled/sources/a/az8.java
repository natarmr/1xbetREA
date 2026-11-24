package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class az8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1704a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ az8(mm40 mm40Var, l7m0 l7m0Var, boolean z, Function1 function1, int i, byte b) {
        this.f1704a = b;
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = z;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1704a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                m0x0.h(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(7);
                q8a.A(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(7);
                i4w0.M(this.b, this.c, this.d, this.e, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
