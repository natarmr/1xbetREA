package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ng implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23460a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ ng(mm40 mm40Var, boolean z, boolean z2, Function1 function1, int i) {
        this.b = mm40Var;
        this.c = z;
        this.d = z2;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23460a) {
            case 0:
                ((Integer) obj2).getClass();
                ro4.a(x8x.L(this.f | 1), (fet) obj, this.b, this.e, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                l8x.y(x8x.L(this.f | 1), (fet) obj, this.b, this.e, this.c, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ng(boolean z, boolean z2, Function1 function1, mm40 mm40Var, int i) {
        this.c = z;
        this.d = z2;
        this.e = function1;
        this.b = mm40Var;
        this.f = i;
    }
}
