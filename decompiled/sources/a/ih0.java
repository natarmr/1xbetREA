package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ih0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14756a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ph0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ ih0(mm40 mm40Var, ph0 ph0Var, Function1 function1, int i, byte b) {
        this.f14756a = b;
        this.b = mm40Var;
        this.c = ph0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14756a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                mh0.a(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 1:
                zgc.a(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 2:
                j2e.a(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            case 3:
                o2e.a(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
            default:
                tke.a(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
