package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f5n0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8971a;
    public final /* synthetic */ String b;

    public /* synthetic */ f5n0(byte b, int i, String str) {
        this.f8971a = b;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8971a;
        String str = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v8q0.a(this.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), StaticColors.INSTANCE.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110590);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v8q0.a(this.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 24960, 110590);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                k7n0.i(str, (fet) obj, x8x.L(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hfm0.c(str, (fet) obj, x8x.L(1));
                break;
            case 4:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v8q0.a(this.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar3), fetVar3, 0, 24960, 110590);
                } else {
                    fetVar3.X();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                cvm0.d(str, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                bcm0.e(str, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                o5n0.h(str, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ofm0.g(str, (fet) obj, x8x.L(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                vbw0.m(str, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                vbw0.A(str, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                hew0.n(str, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                q8a.H(str, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ f5n0(String str, byte b) {
        this.f8971a = b;
        this.b = str;
    }
}
