package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wq40 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39573a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ wq40(l7m0 l7m0Var, byte b) {
        this.f39573a = b;
        this.b = l7m0Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f39573a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                fet fetVar = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((b53) obj).getClass();
                str.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= fetVar.g(str) ? 32 : 16;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 145) != 144)) {
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    v8q0.a(str, o2e.e0(jm40.b, "MONTH_YEAR_TITLE"), ((y3d) l7m0Var.getValue()).f41946a, new n05(qmk.q, qmk.s, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.i(), fetVar, ((iIntValue >> 3) & 14) | 48, 24960, 110576);
                } else {
                    fetVar.X();
                }
                break;
            default:
                mm40 mm40Var = (mm40) obj2;
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((ir8) obj).getClass();
                mm40Var.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    hxm0.i((iIntValue2 >> 3) & 14, fetVar2, mm40Var, (String) ((snr) l7m0Var.getValue()).f.getValue());
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
