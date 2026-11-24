package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class phl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27003a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bhl0 c;
    public final /* synthetic */ ahl0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ byte f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ phl0(mm40 mm40Var, bhl0 bhl0Var, ahl0 ahl0Var, Function0 function0, int i, byte b) {
        this.f27003a = b;
        this.b = mm40Var;
        this.c = bhl0Var;
        this.d = ahl0Var;
        this.e = function0;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27003a;
        byte b2 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                l8x.c(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(b2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m8x.a(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(b2 | 1));
                break;
        }
        return Unit.f46060a;
    }
}
