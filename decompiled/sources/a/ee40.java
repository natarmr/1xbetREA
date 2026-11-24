package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ee40 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7652a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ y9q0 d;
    public final /* synthetic */ y9q0 e;
    public final /* synthetic */ mm40 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ee40(Object obj, long j, long j2, y9q0 y9q0Var, y9q0 y9q0Var2, mm40 mm40Var, byte b) {
        this.f7652a = b;
        this.g = obj;
        this.b = j;
        this.c = j2;
        this.d = y9q0Var;
        this.e = y9q0Var2;
        this.f = mm40Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        mm40 mm40VarN;
        mm40 mm40VarL;
        byte b = this.f7652a;
        cl5 cl5Var = ukd.f35823a;
        y9q0 y9q0Var = this.e;
        y9q0 y9q0Var2 = this.d;
        long j = this.c;
        long j2 = this.b;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                rs20 rs20Var = (rs20) obj4;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zG = fetVar.g(sre0.f32672a.b(yhg0Var.getClass()));
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        boolean z = rs20Var instanceof os20;
                        mm40 mm40Var = this.f;
                        if (z) {
                            zcl zclVar = qmk.f28987a;
                            mm40VarN = s5x0.L(mm40Var, 16.0f, 0.0f, 2);
                        } else {
                            zcl zclVar2 = qmk.f28987a;
                            mm40VarN = s5x0.N(mm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                        }
                        objP = mm40VarN;
                        fetVar.o0(objP);
                    }
                    mm40 mm40Var2 = (mm40) objP;
                    l7m0 l7m0VarB = m5k0.b(rs20Var.isSelected() ? j2 : j, ro4.m0(Response.OK, 0, ihn.f14788a, 2), fetVar, 0, 12);
                    String name = rs20Var.getName();
                    y9q0 y9q0Var3 = rs20Var.isSelected() ? y9q0Var2 : y9q0Var;
                    boolean zG2 = fetVar.g(l7m0VarB);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new oad(l7m0VarB, (byte) 4);
                        fetVar.o0(objP2);
                    }
                    aad.e(name, mm40Var2, y9q0Var3, null, 0, false, 0, 0, (n4d) objP2, null, fetVar, 0, 760);
                } else {
                    fetVar.X();
                }
                break;
            default:
                rwm0 rwm0Var = (rwm0) obj4;
                boolean z2 = rwm0Var.d;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z3 = rwm0Var.e;
                    boolean zH = fetVar2.h(z2);
                    Object objP3 = fetVar2.P();
                    if (zH || objP3 == cl5Var) {
                        mm40 mm40Var3 = this.f;
                        if (z2) {
                            zcl zclVar3 = qmk.f28987a;
                            mm40VarL = s5x0.N(mm40Var3, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            mm40VarL = s5x0.L(mm40Var3, 16.0f, 0.0f, 2);
                        }
                        objP3 = mm40VarL;
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40Var4 = (mm40) objP3;
                    l7m0 l7m0VarB2 = m5k0.b(z3 ? j2 : j, ro4.m0(Response.OK, 0, ihn.b, 2), fetVar2, 0, 12);
                    mm40 mm40VarE0 = o2e.e0(mm40Var4, "GAME_ROW_STAGE");
                    boolean zI = fetVar2.i(rwm0Var);
                    Object objP4 = fetVar2.P();
                    if (zI || objP4 == cl5Var) {
                        objP4 = new b530((Object) rwm0Var, (byte) 11);
                        fetVar2.o0(objP4);
                    }
                    mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP4);
                    String str = rwm0Var.c;
                    y9q0 y9q0Var4 = z3 ? y9q0Var2 : y9q0Var;
                    boolean zG3 = fetVar2.g(l7m0VarB2);
                    Object objP5 = fetVar2.P();
                    if (zG3 || objP5 == cl5Var) {
                        objP5 = new oad(l7m0VarB2, (byte) 5);
                        fetVar2.o0(objP5);
                    }
                    aad.e(str, mm40VarA, y9q0Var4, null, 0, false, 0, 0, (n4d) objP5, null, fetVar2, 0, 760);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
