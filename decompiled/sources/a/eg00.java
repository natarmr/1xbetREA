package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eg00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7739a;
    public final /* synthetic */ ir8 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ lqw d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ eg00(ir8 ir8Var, mm40 mm40Var, lqw lqwVar, Function1 function1, int i, byte b) {
        this.f7739a = b;
        this.b = ir8Var;
        this.c = mm40Var;
        this.d = lqwVar;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7739a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                azw.f(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bdx.s(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ofm0.c(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
