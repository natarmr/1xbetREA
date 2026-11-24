package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m3a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21105a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fqj0 c;

    public /* synthetic */ m3a0(byte b, int i, fqj0 fqj0Var) {
        this.f21105a = b;
        this.b = i;
        this.c = fqj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21105a;
        byte b2 = 4;
        byte b3 = 3;
        final fqj0 fqj0Var = this.c;
        byte b4 = 1;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, null, null, new ugd(242917904, true, new t57(fqj0Var, b4)), 3);
                hcz.g(hczVar, this.b - 1, null, null, new ugd(1863224473, true, new aha0(fqj0Var, (byte) 4)), 6);
                break;
            case 1:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.e(hczVar2, null, null, new ugd(-1421849310, true, new t57(fqj0Var, (byte) 2)), 3);
                hcz.g(hczVar2, this.b, null, null, new ugd(-1471047751, true, new aha0(fqj0Var, (byte) 5)), 6);
                break;
            case 2:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, new ugd(-316696714, true, new t57(fqj0Var, b3)), 3);
                hcz.g(hczVar3, this.b, null, null, new ugd(31911245, true, new aha0(fqj0Var, (byte) 6)), 6);
                break;
            case 3:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hcz.g(hczVar4, this.b, null, null, new ugd(663611216, true, new aha0(fqj0Var, (byte) 8)), 6);
                break;
            default:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hcz.e(hczVar5, null, null, new ugd(-1697498858, true, new t57(fqj0Var, b2)), 3);
                hcz.e(hczVar5, null, null, x4d0.e, 3);
                final int i = this.b;
                hcz.g(hczVar5, i, null, null, new ugd(-2029334497, true, new ydr() { // from class: a.pkp0
                    @Override // a.ydr
                    public final Object j(Object obj2, Object obj3, Object obj4, Object obj5) {
                        ((Integer) obj3).intValue();
                        fet fetVar = (fet) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        ((g9z) obj2).getClass();
                        if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                            for (int i2 = 0; i2 < i; i2++) {
                                k7n0.e(fqj0Var, fetVar, 0);
                            }
                        } else {
                            fetVar.X();
                        }
                        return Unit.f46060a;
                    }
                }), 6);
                break;
        }
        return Unit.f46060a;
    }
}
