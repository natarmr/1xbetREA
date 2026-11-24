package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bx40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3359a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ lpm c;

    public /* synthetic */ bx40(mm40 mm40Var, lpm lpmVar, int i, byte b) {
        this.f3359a = b;
        this.b = mm40Var;
        this.c = lpmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3359a;
        lpm lpmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                g8x.n(mm40Var, lpmVar, fetVar, x8x.L(1));
                break;
            case 1:
                xvw.q(mm40Var, lpmVar, fetVar, x8x.L(1));
                break;
            default:
                qim0.c(mm40Var, lpmVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
