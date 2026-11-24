package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eem0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7680a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ gem0 c;

    public /* synthetic */ eem0(mm40 mm40Var, gem0 gem0Var) {
        this.b = mm40Var;
        this.c = gem0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7680a;
        gem0 gem0Var = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xkb.r(this.b, gem0Var.f11163a, 0, 0, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fem0.a(this.b, gem0Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ eem0(mm40 mm40Var, gem0 gem0Var, int i) {
        this.b = mm40Var;
        this.c = gem0Var;
    }
}
