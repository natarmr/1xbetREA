package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wfw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39087a;
    public final /* synthetic */ pa00 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ wfw(pa00 pa00Var, float f, float f2, Function1 function1, Function1 function2, int i, byte b) {
        this.f39087a = b;
        this.b = pa00Var;
        this.c = f;
        this.d = f2;
        this.e = function1;
        this.f = function2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39087a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ozb.A(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                pzb.u(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
