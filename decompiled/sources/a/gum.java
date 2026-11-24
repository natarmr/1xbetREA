package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gum implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11936a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ d280 c;

    public /* synthetic */ gum(mm40 mm40Var, d280 d280Var, int i, byte b) {
        this.f11936a = b;
        this.b = mm40Var;
        this.c = d280Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11936a;
        d280 d280Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                f7k.u(mm40Var, d280Var, fetVar, x8x.L(7));
                break;
            default:
                dub.Q(mm40Var, d280Var, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
