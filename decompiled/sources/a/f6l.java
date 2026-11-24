package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f6l implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9017a;
    public final /* synthetic */ g6l b;

    public /* synthetic */ f6l(g6l g6lVar, byte b) {
        this.f9017a = b;
        this.b = g6lVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f9017a;
        byte b2 = 4;
        byte b3 = 3;
        jm40 jm40Var = jm40.b;
        g6l g6lVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    obc.h(null, u1c.M(-425303239, new f6l(g6lVar, b3), fetVar), fetVar, 384, 3);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    obc.h(yhg0Var.a(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), true), u1c.M(128045094, new f6l(g6lVar, b2), fetVar2), fetVar2, 384, 2);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(yhg0Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    obc.h(yhg0Var2.a(1.0f, jm40Var, true), u1c.M(1638066919, new f6l(g6lVar, (byte) 5), fetVar3), fetVar3, 384, 2);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(g6lVar.f10771a, s5x0.K(jm40Var, 8.0f, 6.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar4), fetVar4, 0, 24960, 110588);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar3 = qmk.f28987a;
                    v8q0.a(g6lVar.b, s5x0.K(jm40Var, 10.0f, 6.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar5), fetVar5, 0, 24960, 109564);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    v8q0.a(g6lVar.c, s5x0.J(jm40Var, 6.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar6), fetVar6, 0, 24960, 109564);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
