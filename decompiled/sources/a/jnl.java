package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jnl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16819a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ uzh c;
    public final /* synthetic */ int d;

    public /* synthetic */ jnl(mm40 mm40Var, uzh uzhVar, int i, byte b) {
        this.f16819a = b;
        this.b = mm40Var;
        this.c = uzhVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16819a;
        int i = this.d;
        uzh uzhVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xkb.G(mm40Var, uzhVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                ntr.z(mm40Var, uzhVar, fetVar, x8x.L(i | 1));
                break;
            default:
                mrv.I(mm40Var, uzhVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
