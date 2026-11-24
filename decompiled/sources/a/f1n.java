package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f1n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8772a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ lpm c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ f1n(mm40 mm40Var, lpm lpmVar, boolean z, int i, byte b) {
        this.f8772a = b;
        this.b = mm40Var;
        this.c = lpmVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8772a;
        boolean z = this.d;
        lpm lpmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                v3c.F(mm40Var, lpmVar, z, fetVar, x8x.L(1));
                break;
            default:
                gkb.D(mm40Var, lpmVar, z, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
