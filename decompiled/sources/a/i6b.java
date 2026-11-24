package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i6b implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14231a;
    public final /* synthetic */ long b;

    public /* synthetic */ i6b(byte b, long j) {
        this.f14231a = b;
        this.b = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f14231a;
        jm40 jm40Var = jm40.b;
        long j = this.b;
        switch (b) {
            case 0:
                x5b x5bVar = (x5b) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                x5bVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(x5bVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarQ = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar = qmk.f28987a;
                    phu0.h(s5x0.L(mm40VarQ, 8.0f, 0.0f, 2), x5bVar, ntr.f24113a, ntr.b, fetVar, ((iIntValue << 3) & 112) | 3456);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                x5b x5bVar2 = (x5b) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                x5bVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(x5bVar2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarQ2 = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar2 = qmk.f28987a;
                    phu0.h(s5x0.L(mm40VarQ2, 16.0f, 0.0f, 2), x5bVar2, mrv.f22291a, mrv.b, fetVar2, ((iIntValue2 << 3) & 112) | 3456);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                vwv vwvVar = (vwv) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                vwvVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(vwvVar) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    mm40 mm40VarQ3 = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar3 = qmk.f28987a;
                    qbc.v(s5x0.M(mm40VarQ3, qmk.a(fetVar3).c, 8.0f, qmk.a(fetVar3).c, 8.0f), vwvVar, fetVar3, (iIntValue3 << 3) & 112);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
