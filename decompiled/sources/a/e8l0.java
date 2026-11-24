package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e8l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7379a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ v2n c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ e8l0(mm40 mm40Var, v2n v2nVar, Function1 function1, int i, byte b) {
        this.f7379a = b;
        this.b = mm40Var;
        this.c = v2nVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7379a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gfx.a(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                mrv.t(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
