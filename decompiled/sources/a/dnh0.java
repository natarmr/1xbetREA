package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dnh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6369a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ i4 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ezj e;
    public final /* synthetic */ gy40 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;

    public /* synthetic */ dnh0(mm40 mm40Var, i4 i4Var, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, int i, byte b) {
        this.f6369a = b;
        this.b = mm40Var;
        this.c = i4Var;
        this.d = f;
        this.e = ezjVar;
        this.f = gy40Var;
        this.g = function2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6369a) {
            case 0:
                ((Integer) obj2).getClass();
                r7x.a(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                a8k0.k(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
        }
        return Unit.f46060a;
    }
}
