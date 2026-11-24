package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tan implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33620a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ wim c;
    public final /* synthetic */ w2v0 d;
    public final /* synthetic */ gy40 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ tan(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, gy40 gy40Var, Function0 function0, Function1 function1, int i, byte b) {
        this.f33620a = b;
        this.b = mm40Var;
        this.c = wimVar;
        this.d = w2v0Var;
        this.e = gy40Var;
        this.f = function0;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33620a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                phu0.l(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                epv0.l(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                i4w0.r(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(1);
                vbw0.o(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }
}
