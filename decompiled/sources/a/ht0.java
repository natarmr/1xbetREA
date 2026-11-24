package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ht0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13607a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pe0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ ht0(mm40 mm40Var, pe0 pe0Var, float f, Function1 function1, Function1 function2, Function1 function3, int i, byte b) {
        this.f13607a = b;
        this.b = mm40Var;
        this.c = pe0Var;
        this.d = f;
        this.e = function1;
        this.f = function2;
        this.g = function3;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13607a) {
            case 0:
                ((Integer) obj2).getClass();
                lt0.a(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ro4.d(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                o2e.c(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ohq0.b(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(this.h | 1));
                break;
        }
        return Unit.f46060a;
    }
}
