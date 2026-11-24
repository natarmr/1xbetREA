package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23872a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ y9q0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ nol(mm40 mm40Var, y9q0 y9q0Var, long j, int i, byte b) {
        this.f23872a = b;
        this.b = mm40Var;
        this.c = y9q0Var;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23872a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                wwb.x(this.b, this.c, this.d, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                dyb.H(this.b, this.c, this.d, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                v7n.e(this.b, this.c, this.d, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
