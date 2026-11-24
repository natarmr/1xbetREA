package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mzm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22660a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ tym c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ mzm(mm40 mm40Var, tym tymVar, boolean z, int i, byte b) {
        this.f22660a = b;
        this.b = mm40Var;
        this.c = tymVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22660a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ntb.z(this.b, this.c, this.d, fetVar, x8x.L(385));
                break;
            default:
                vtb.I(this.b, this.c, this.d, fetVar, x8x.L(385));
                break;
        }
        return Unit.f46060a;
    }
}
