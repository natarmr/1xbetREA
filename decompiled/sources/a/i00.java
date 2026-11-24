package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13927a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i00(mm40 mm40Var, int i, int i2, byte b) {
        this.f13927a = b;
        this.b = mm40Var;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13927a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                int iL = x8x.L(1);
                boolean z = this.c;
                hp4.b(iL, z ? 1 : 0, fetVar, this.b);
                break;
            case 1:
                jar0.d(x8x.L(1), fetVar, this.b, this.c);
                break;
            case 2:
                int iL2 = x8x.L(1);
                boolean z2 = this.c;
                oy2.b(iL2, z2 ? 1 : 0, fetVar, this.b);
                break;
            case 3:
                int iL3 = x8x.L(1);
                boolean z3 = this.c;
                rsr0.c(iL3, z3 ? 1 : 0, fetVar, this.b);
                break;
            case 4:
                int iL4 = x8x.L(1);
                boolean z4 = this.c;
                ffb0.m(iL4, z4 ? 1 : 0, fetVar, this.b);
                break;
            case 5:
                int iL5 = x8x.L(1);
                boolean z5 = this.c;
                ntb.e(iL5, z5 ? 1 : 0, fetVar, this.b);
                break;
            case 6:
                jwb.f(x8x.L(1), fetVar, this.b, this.c);
                break;
            case 7:
                int iL6 = x8x.L(1);
                boolean z6 = this.c;
                jcb.k(iL6, z6 ? 1 : 0, fetVar, this.b);
                break;
            case 8:
                int iL7 = x8x.L(1);
                boolean z7 = this.c;
                ozb.t(iL7, z7 ? 1 : 0, fetVar, this.b);
                break;
            case 9:
                int iL8 = x8x.L(1);
                boolean z8 = this.c;
                zgc.w(iL8, z8 ? 1 : 0, fetVar, this.b);
                break;
            case 10:
                km10.b(x8x.L(7), fetVar, this.b, this.c);
                break;
            case 11:
                int iL9 = x8x.L(1);
                boolean z9 = this.c;
                nnw0.A(iL9, z9 ? 1 : 0, fetVar, this.b);
                break;
            case 12:
                int iL10 = x8x.L(1);
                boolean z10 = this.c;
                efx.h(iL10, z10 ? 1 : 0, fetVar, this.b);
                break;
            case 13:
                int iL11 = x8x.L(1);
                boolean z11 = this.c;
                efx.q(iL11, z11 ? 1 : 0, fetVar, this.b);
                break;
            case 14:
                x8x.h(x8x.L(1), fetVar, this.b, this.c);
                break;
            case 15:
                int iL12 = x8x.L(1);
                boolean z12 = this.c;
                e9x.z(iL12, z12 ? 1 : 0, fetVar, this.b);
                break;
            case 16:
                idx.p(x8x.L(1), fetVar, this.b, this.c);
                break;
            case 17:
                int iL13 = x8x.L(1);
                boolean z13 = this.c;
                z1x.j(iL13, z13 ? 1 : 0, fetVar, this.b);
                break;
            case 18:
                fen0.c(x8x.L(1), fetVar, this.b, this.c);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iL14 = x8x.L(1);
                boolean z14 = this.c;
                aem0.i(iL14, z14 ? 1 : 0, fetVar, this.b);
                break;
            case 20:
                int iL15 = x8x.L(1);
                boolean z15 = this.c;
                hfm0.o(iL15, z15 ? 1 : 0, fetVar, this.b);
                break;
            default:
                int iL16 = x8x.L(1);
                boolean z16 = this.c;
                k7n0.l(iL16, z16 ? 1 : 0, fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ i00(mm40 mm40Var, boolean z, int i, byte b) {
        this.f13927a = b;
        this.b = mm40Var;
        this.c = z;
    }

    public /* synthetic */ i00(boolean z, mm40 mm40Var, int i, byte b) {
        this.f13927a = b;
        this.c = z;
        this.b = mm40Var;
    }
}
