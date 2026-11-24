package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z05 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43548a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ z05(String str, boolean z, mm40 mm40Var, int i) {
        this.f43548a = (byte) 5;
        this.c = str;
        this.d = z;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43548a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                int iL = x8x.L(1);
                boolean z = this.d;
                j47.K(iL, z ? 1 : 0, fetVar, this.b, this.c);
                break;
            case 1:
                kkb.D(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 2:
                d5c.v(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 3:
                ckb.q(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            case 4:
                int iL2 = x8x.L(1);
                boolean z2 = this.d;
                d9x.b(iL2, z2 ? 1 : 0, fetVar, this.b, this.c);
                break;
            case 5:
                vdx.y(x8x.L(1), fetVar, this.b, this.c, this.d);
                break;
            default:
                int iL3 = x8x.L(1);
                boolean z3 = this.d;
                x2x.u(iL3, z3 ? 1 : 0, fetVar, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z05(mm40 mm40Var, String str, boolean z, int i, byte b) {
        this.f43548a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z05(mm40 mm40Var, String str, int i, int i2, byte b) {
        this.f43548a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = i2;
    }
}
