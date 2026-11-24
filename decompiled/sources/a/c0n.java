package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c0n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3533a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ows0 d;

    public /* synthetic */ c0n(mm40 mm40Var, boolean z, ows0 ows0Var, int i, byte b) {
        this.f3533a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = ows0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3533a;
        ows0 ows0Var = this.d;
        boolean z = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ozb.D(mm40Var, z, ows0Var, fetVar, x8x.L(49));
                break;
            case 1:
                qzb.F(mm40Var, z, ows0Var, fetVar, x8x.L(49));
                break;
            case 2:
                uzb.F(mm40Var, z, ows0Var, fetVar, x8x.L(49));
                break;
            case 3:
                vzb.r(mm40Var, z, ows0Var, fetVar, x8x.L(49));
                break;
            default:
                wzb.D(mm40Var, z, ows0Var, fetVar, x8x.L(49));
                break;
        }
        return Unit.f46060a;
    }
}
