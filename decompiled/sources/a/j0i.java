package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j0i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15683a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bql c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public /* synthetic */ j0i(mm40 mm40Var, bql bqlVar, Function0 function0, Function2 function2, int i, byte b) {
        this.f15683a = b;
        this.b = mm40Var;
        this.c = bqlVar;
        this.d = function0;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15683a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                x4d0.v(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                fre0.v(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                unh0.s(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ccq0.p(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ohq0.y(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
