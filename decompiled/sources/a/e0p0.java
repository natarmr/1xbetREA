package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e0p0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6999a;
    public final /* synthetic */ i0p0 b;
    public final /* synthetic */ e2d c;
    public final /* synthetic */ int d;

    public /* synthetic */ e0p0(i0p0 i0p0Var, e2d e2dVar, int i, byte b) {
        this.f6999a = b;
        this.b = i0p0Var;
        this.c = e2dVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6999a;
        int i = this.d;
        e2d e2dVar = this.c;
        i0p0 i0p0Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        j6m0 j6m0Var = i0p0.Z1;
        switch (b) {
            case 0:
                i0p0Var.H0(e2dVar, fetVar, x8x.L(i | 1));
                break;
            default:
                i0p0Var.G0(e2dVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
