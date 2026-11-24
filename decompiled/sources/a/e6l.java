package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e6l implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7290a;
    public final /* synthetic */ z5l b;

    public /* synthetic */ e6l(z5l z5lVar, byte b) {
        this.f7290a = b;
        this.b = z5lVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f7290a;
        byte b2 = 4;
        byte b3 = 6;
        jm40 jm40Var = jm40.b;
        z5l z5lVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    obc.h(o7k0.p(jm40Var, 68.0f, 40.0f), u1c.M(2028514049, new e6l(z5lVar, (byte) 7), fetVar), fetVar, 384, 2);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    obc.h(s5x0.L(jm40Var, 4.0f, 0.0f, 2), u1c.M(1460541826, new e6l(z5lVar, b2), fetVar2), fetVar2, 384, 2);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(yhg0Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    zcl zclVar3 = qmk.f28987a;
                    obc.h(yhg0Var.a(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), true), u1c.M(1220317358, new e6l(z5lVar, b3), fetVar3), fetVar3, 384, 2);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(yhg0Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    obc.h(yhg0Var2.a(1.0f, jm40Var, true), u1c.M(652345135, new e6l(z5lVar, (byte) 5), fetVar4), fetVar4, 384, 2);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zcl zclVar4 = qmk.f28987a;
                    v8q0.a(z5lVar.b, s5x0.K(jm40Var, 8.0f, 12.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar5), fetVar5, 0, 24960, 109564);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zcl zclVar5 = qmk.f28987a;
                    v8q0.a(z5lVar.d, s5x0.K(jm40Var, 14.0f, 12.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar6), fetVar6, 0, 24960, 109564);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    zcl zclVar6 = qmk.f28987a;
                    v8q0.a(z5lVar.c, s5x0.K(jm40Var, 14.0f, 12.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar7), fetVar7, 0, 24960, 109564);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    mz3 mz3VarX = l7x.X(z5lVar.f43822a, null, null, fetVar8, 0, 30);
                    lz3 lz3Var = (lz3) ydx.F(mz3VarX.u, fetVar8).getValue();
                    if (Intrinsics.d(lz3Var, hz3.f13888a) || (lz3Var instanceof iz3) || (lz3Var instanceof jz3)) {
                        fetVar8.e0(1272512880);
                        s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.ic_dota2_placeholder, 6, fetVar8), fetVar8);
                        zcl zclVar7 = qmk.f28987a;
                        j0x.b(s4u0VarR, null, o7k0.p(jm40Var, 56.0f, 28.0f), null, null, 0.0f, null, fetVar8, 56, 120);
                        fetVar8.r(false);
                    } else {
                        if (!(lz3Var instanceof kz3)) {
                            throw b1j.f(-513145507, fetVar8, false);
                        }
                        fetVar8.e0(1272995333);
                        zcl zclVar8 = qmk.f28987a;
                        mm40 mm40VarP = o7k0.p(jm40Var, 56.0f, 28.0f);
                        zcl zclVar9 = qmk.c;
                        ugg0 ugg0Var = vgg0.f37379a;
                        j0x.b(mz3VarX, null, h97.e(zclVar9, zclVar9, zclVar9, zclVar9, mm40VarP), null, gqw0.A, 0.0f, null, fetVar8, 24624, 104);
                        fetVar8.r(false);
                    }
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
        }
    }
}
