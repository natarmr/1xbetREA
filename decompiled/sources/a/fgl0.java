package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fgl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9497a;
    public final /* synthetic */ kfl0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ j700 d;
    public final /* synthetic */ zcz e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ fgl0(kfl0 kfl0Var, boolean z, j700 j700Var, zcz zczVar, Function1 function1, int i, byte b) {
        this.f9497a = b;
        this.b = kfl0Var;
        this.c = z;
        this.d = j700Var;
        this.e = zczVar;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9497a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ahy.D(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ahy.w(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ahy.M(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ahy.B(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
