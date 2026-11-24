package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s84 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31785a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s84(int i, int i2, mm40 mm40Var, boolean z) {
        this.f31785a = (byte) 0;
        this.b = mm40Var;
        this.d = z;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31785a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                eeq.g(this.b, this.d, fetVar, x8x.L(1), this.c);
                break;
            case 1:
                int iL = x8x.L(this.c | 1);
                boolean z = this.d;
                bsr0.j(iL, z ? 1 : 0, fetVar, this.b);
                break;
            case 2:
                int iL2 = x8x.L(this.c | 1);
                boolean z2 = this.d;
                uzb.B(iL2, z2 ? 1 : 0, fetVar, this.b);
                break;
            case 3:
                int iL3 = x8x.L(this.c | 1);
                boolean z3 = this.d;
                nnw0.s(iL3, z3 ? 1 : 0, fetVar, this.b);
                break;
            case 4:
                bsr0.H(x8x.L(this.c | 1), fetVar, this.b, this.d);
                break;
            case 5:
                rsr0.I(x8x.L(this.c | 1), fetVar, this.b, this.d);
                break;
            case 6:
                bsr0.H(x8x.L(this.c | 1), fetVar, this.b, this.d);
                break;
            case 7:
                rsr0.I(x8x.L(this.c | 1), fetVar, this.b, this.d);
                break;
            default:
                int iL4 = x8x.L(this.c | 1);
                boolean z4 = this.d;
                v2n0.g(iL4, z4 ? 1 : 0, fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s84(mm40 mm40Var, int i, int i2, byte b) {
        this.f31785a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s84(boolean z, mm40 mm40Var, int i, byte b) {
        this.f31785a = b;
        this.d = z;
        this.b = mm40Var;
        this.c = i;
    }
}
