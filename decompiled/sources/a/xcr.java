package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xcr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40660a;
    public final /* synthetic */ k3t0 b;

    public /* synthetic */ xcr(k3t0 k3t0Var, int i, byte b) {
        this.f40660a = b;
        this.b = k3t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40660a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ffb0.s(this.b, fetVar, x8x.L(1));
                break;
            case 1:
                pzw.i(this.b, fetVar, x8x.L(1));
                break;
            case 2:
                unh0.T(this.b, fetVar, x8x.L(1));
                break;
            case 3:
                vdx.p(this.b, fetVar, x8x.L(1));
                break;
            case 4:
                aad.y(this.b, fetVar, x8x.L(9));
                break;
            case 5:
                m0x0.C(this.b, fetVar, x8x.L(1));
                break;
            case 6:
                egm0.a(this.b, fetVar, x8x.L(1));
                break;
            default:
                knx.O(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
