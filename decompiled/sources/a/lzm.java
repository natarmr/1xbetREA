package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lzm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20913a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ czm c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lzm(mm40 mm40Var, czm czmVar, int i, int i2, byte b) {
        this.f20913a = b;
        this.b = mm40Var;
        this.c = czmVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20913a;
        boolean z = this.d;
        czm czmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ntb.y(mm40Var, czmVar, fetVar, x8x.L(1), z ? 1 : 0);
                break;
            default:
                vtb.F(mm40Var, czmVar, fetVar, x8x.L(1), z ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }
}
