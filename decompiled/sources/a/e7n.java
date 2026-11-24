package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e7n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7334a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kly d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e7n(mm40 mm40Var, Object obj, int i, kly klyVar, Function1 function1, int i2, int i3, byte b) {
        this.f7334a = b;
        this.b = mm40Var;
        this.h = obj;
        this.c = i;
        this.d = klyVar;
        this.e = function1;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7334a) {
            case 0:
                ((Integer) obj2).getClass();
                wvb.t(this.b, (c6q0) this.h, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                jwb.o(this.b, (s6q0) this.h, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
        }
        return Unit.f46060a;
    }
}
