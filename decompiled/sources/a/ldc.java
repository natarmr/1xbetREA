package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ldc implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19844a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ldc(boolean z, Function1 function1, byte b) {
        this.f19844a = b;
        this.b = z;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f19844a;
        pcy pcyVar = e7z.u1;
        byte b2 = 18;
        Function1 function1 = this.c;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        boolean z = false;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    float f = xfn.a(fetVar).d;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarD, f, 12.0f);
                    wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.confirm, fetVar)), this.b, false, false);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new dib(function1, (byte) 8);
                        fetVar.o0(objP);
                    }
                    qzb.n(mm40VarK, wulVar, (Function0) objP, fetVar, 0, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                lr8 lr8Var = (lr8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                byte b3 = 4;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(lr8Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    w6k w6kVar = (w6k) fetVar2.k(bmd.h);
                    long jT = (((long) w6kVar.T(lr8Var.d())) << 32) | (((long) w6kVar.T(lr8Var.c())) & 4294967295L);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.e(new qkx(0L));
                        fetVar2.o0(objP2);
                    }
                    pz40 pz40Var = (pz40) objP2;
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = androidx.compose.runtime.e.e(null);
                        fetVar2.o0(objP3);
                    }
                    pz40 pz40Var2 = (pz40) objP3;
                    yx7 yx7Var = gqw0.k;
                    boolean zF = fetVar2.f(jT);
                    Object objP4 = fetVar2.P();
                    if (zF || objP4 == cl5Var) {
                        objP4 = new gjj(jT, pz40Var2, pz40Var, (byte) 1);
                        fetVar2.o0(objP4);
                    }
                    mm40 mm40VarP = ffb0.P(jm40Var, (Function1) objP4);
                    Object objP5 = fetVar2.P();
                    if (objP5 == cl5Var) {
                        objP5 = new y9v(pz40Var, b3);
                        fetVar2.o0(objP5);
                    }
                    mm40 mm40VarY = fre0.Y(mm40VarP, (Function1) objP5);
                    qkx qkxVar = new qkx(jT);
                    boolean zF2 = fetVar2.f(jT);
                    Object objP6 = fetVar2.P();
                    if (zF2 || objP6 == cl5Var) {
                        objP6 = new tmx(jT, pz40Var2, pz40Var);
                        fetVar2.o0(objP6);
                    }
                    mm40 mm40VarA = fnn0.a(mm40VarY, qkxVar, (PointerInputEventHandler) objP6);
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarK2 = s5x0.K(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarA), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), 16.0f, 8.0f);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    String strW = rsm0.w(R.string.internet_emulation_floating_title, 0, fetVar2);
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    y9q0 y9q0VarD = g1t0.d();
                    Object objP7 = fetVar2.P();
                    if (objP7 == cl5Var) {
                        objP7 = m6m.d;
                        fetVar2.o0(objP7);
                    }
                    aad.e(strW, null, y9q0VarD, null, 0, false, 0, 0, (n4d) objP7, null, fetVar2, 0, 762);
                    qxw.o(fetVar2, o7k0.s(jm40Var, 12.0f));
                    n5n.b(null, this.b, false, null, this.c, fetVar2, 0, 13);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    float f2 = xfn.a(fetVar3).d;
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarK3 = s5x0.K(mm40VarD2, f2, 12.0f);
                    wul wulVar2 = new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.next, fetVar3)), this.b, false, false);
                    boolean zG2 = fetVar3.g(function1);
                    Object objP8 = fetVar3.P();
                    if (zG2 || objP8 == cl5Var) {
                        objP8 = new xwy(function1, b2);
                        fetVar3.o0(objP8);
                    }
                    qzb.n(mm40VarK3, wulVar2, (Function0) objP8, fetVar3, 0, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    float f3 = xfn.a(fetVar4).d;
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarK4 = s5x0.K(mm40VarD3, f3, 12.0f);
                    wul wulVar3 = new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.save_changes, fetVar4)), this.b, false, false);
                    boolean zG3 = fetVar4.g(function1);
                    Object objP9 = fetVar4.P();
                    if (zG3 || objP9 == cl5Var) {
                        objP9 = new xwy(function1, (byte) 21);
                        fetVar4.o0(objP9);
                    }
                    qzb.n(mm40VarK4, wulVar3, (Function0) objP9, fetVar4, 0, 0);
                } else {
                    fetVar4.X();
                }
                break;
            case 4:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    float f4 = xfn.a(fetVar5).d;
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarK5 = s5x0.K(mm40VarD4, f4, 12.0f);
                    wul wulVar4 = new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.save_changes, fetVar5)), this.b, false, false);
                    boolean zG4 = fetVar5.g(function1);
                    Object objP10 = fetVar5.P();
                    if (zG4 || objP10 == cl5Var) {
                        objP10 = new xwy(function1, (byte) 24);
                        fetVar5.o0(objP10);
                    }
                    qzb.n(mm40VarK5, wulVar4, (Function0) objP10, fetVar5, 0, 0);
                } else {
                    fetVar5.X();
                }
                break;
            default:
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
                    float f5 = xfn.a(fetVar6).d;
                    zcl zclVar6 = qmk.f28987a;
                    mm40 mm40VarK6 = s5x0.K(mm40VarD5, f5, 12.0f);
                    wul wulVar5 = new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.confirm, fetVar6)), this.b, false, false);
                    boolean zG5 = fetVar6.g(function1);
                    Object objP11 = fetVar6.P();
                    if (zG5 || objP11 == cl5Var) {
                        objP11 = new yqz(function1, z ? (byte) 1 : (byte) 0);
                        fetVar6.o0(objP11);
                    }
                    qzb.n(mm40VarK6, wulVar5, (Function0) objP11, fetVar6, 0, 0);
                } else {
                    fetVar6.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
