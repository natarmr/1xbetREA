package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o3m0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24593a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o3m0(kbm0 kbm0Var, jbm0 jbm0Var) {
        this.f24593a = (byte) 5;
        this.c = kbm0Var;
        this.b = jbm0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long secondary60;
        Object value;
        Object value2;
        dcm0 dcm0Var;
        byte b = this.f24593a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                r3m0.b((az00) obj4, (dp20) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                r3m0.c((a4x) obj4, (dp20) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                t9x.b((wa00) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                t9x.c((ya00) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                tam0 tam0Var = (tam0) obj4;
                nam0 nam0Var = (nam0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarQ = gkb.Q(tam0Var.k, nam0Var, fetVar, nam0.W1 << 3, 6);
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zfn zfnVar = zaq0.b;
                    ilm ilmVar = new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary());
                    plm plmVar = new plm(rsm0.w(R.string.information_block_settings, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a);
                    if (((Boolean) pz40VarQ.getValue()).booleanValue()) {
                        fetVar.e0(-571783893);
                        secondary60 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-571679671);
                        secondary60 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary60();
                        fetVar.r(false);
                    }
                    imm immVar = new imm(ilmVar, plmVar, new dmm(new ta50(new wkm(1, R.drawable.ic_refresh_new, true, ra50.f30118a, secondary60))), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
                    boolean zI = fetVar.i(tam0Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        lph0 lph0Var = new lph0(0, tam0Var, tam0.class, "tryExit", "tryExit()V", 0, (byte) 23);
                        fetVar.o0(lph0Var);
                        objP = lph0Var;
                    }
                    Function0 function0 = (Function0) ((jhy) objP);
                    boolean zI2 = fetVar.i(tam0Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new q9m0(tam0Var, (byte) 0);
                        fetVar.o0(objP2);
                    }
                    hlm.c(mm40VarD, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 6, 0, 4052);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 5:
                kbm0 kbm0Var = (kbm0) obj4;
                jbm0 jbm0Var = (jbm0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                    zcl zclVar = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD2, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 4.0f);
                    mw3 mw3Var = uc9.c;
                    xx7 xx7Var = gqw0.m;
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    boolean z = fetVar2.S;
                    pcy pcyVar = e7z.u1;
                    if (z) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar2, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf, shdVar3);
                    jpm0.n(fetVar2);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC0, shdVar4);
                    nsm0.h(null, kbm0Var.f18021a, fetVar2, 64);
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD3);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    fetVar2.e0(-692845945);
                    for (hbm0 hbm0Var : kbm0Var.b) {
                        if (hbm0Var != null) {
                            if (hbm0Var instanceof fbm0) {
                                fetVar2.e0(928938838);
                                zcl zclVar2 = qmk.f28987a;
                                nia0.U(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), (fbm0) hbm0Var, jbm0Var, fetVar2, 384);
                                fetVar2.r(false);
                            } else if (hbm0Var instanceof gbm0) {
                                fetVar2.e0(928948628);
                                zcl zclVar3 = qmk.f28987a;
                                xia0.W(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), (gbm0) hbm0Var, jbm0Var, fetVar2, 384);
                                fetVar2.r(false);
                            }
                        }
                        throw b1j.f(928936622, fetVar2, false);
                    }
                    ohs0.x(fetVar2, false, true, true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 6:
                ybm0 ybm0Var = (ybm0) obj3;
                oyg0 oyg0Var = ybm0Var.f;
                ocj ocjVar = ybm0Var.i;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (((Throwable) obj4) instanceof ff5) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        dcm0Var = (dcm0) value2;
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, dcm0.a(dcm0Var, false, false, new sfb(dcm0Var.f5852a, new ofb(iun.f15405a, "", "", "")), null, null, 233)));
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, dcm0.a((dcm0) value, false, true, null, null, null, 249)));
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                qem0.d((mm40) obj4, (bmp0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                wgm0.f((mm40) obj4, (ear0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                String str = (String) obj4;
                ux3 ux3Var = (ux3) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j5n0.d(null, str, ux3Var, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109).f42262a.b, fetVar3, 0, 1);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 10:
                String str2 = (String) obj4;
                vx3 vx3Var = (vx3) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    k5n0.a(null, str2, vx3Var, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109).f42262a.b, fetVar4, 0, 1);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 11:
                Throwable th = (Throwable) obj4;
                rdn0 rdn0Var = (rdn0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.SelfExclusionChangesProhibited) {
                    rdn0Var.G(fdn0.f9366a);
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                fen0.e((oen0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                fen0.b((men0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                Throwable th2 = (Throwable) obj4;
                ren0 ren0Var = (ren0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.SelfExclusionChangesProhibited) {
                    ren0Var.G(hen0.f12931a);
                }
                return Unit.f46060a;
            case 15:
                Throwable th3 = (Throwable) obj4;
                ven0 ven0Var = (ven0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if ((th3 instanceof zhi0) && ((zhi0) th3).c == i2o.SelfExclusionChangesProhibited) {
                    ven0Var.G(xbn0.f40609a);
                }
                return Unit.f46060a;
            case 16:
                epn0 epn0Var = (epn0) obj4;
                b3q b3qVar = (b3q) obj3;
                gvn0 gvn0Var = (gvn0) obj2;
                List<epn0> list = gvn0Var.e;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (epn0 epn0VarA : list) {
                    if (Intrinsics.d(epn0VarA, epn0Var)) {
                        epn0VarA = epn0.a(epn0Var, !b3qVar.e);
                    }
                    arrayList.add(epn0VarA);
                }
                return gvn0.a(gvn0Var, false, false, false, false, arrayList, null, null, 239);
            case 17:
                hpn0 hpn0Var = (hpn0) obj4;
                t3q t3qVar = (t3q) obj3;
                gvn0 gvn0Var2 = (gvn0) obj2;
                List<hpn0> list2 = gvn0Var2.f;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (hpn0 hpn0VarA : list2) {
                    if (Intrinsics.d(hpn0VarA, hpn0Var)) {
                        hpn0VarA = hpn0.a(hpn0Var, !t3qVar.i);
                    }
                    arrayList2.add(hpn0VarA);
                }
                return gvn0.a(gvn0Var2, false, false, false, false, null, arrayList2, null, 223);
            case 18:
                ((Integer) obj2).getClass();
                iym0.d((mm40) obj4, (weo0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                tcr0 tcr0Var = (tcr0) obj4;
                sar0 sar0Var = (sar0) obj3;
                keo0 keo0Var = (keo0) obj2;
                int i = tcr0Var != null ? tcr0Var.b : keo0Var.f18163a;
                List list3 = tcr0Var != null ? tcr0Var.c : null;
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                List list4 = list3;
                List list5 = tcr0Var != null ? tcr0Var.d : null;
                if (list5 == null) {
                    list5 = iun.f15405a;
                }
                List list6 = list5;
                String str3 = sar0Var.b;
                return keo0.a(keo0Var, i, list4, list6, str3, str3.equals(keo0Var.d) ? keo0Var.f : 0, 960);
            case 20:
                ((Integer) obj2).getClass();
                y0x0.z((dk5) obj4, (Function0) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                xsm0.e((mm40) obj4, (axo0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                tnq0.b((mm40) obj4, (bxo0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                jtm0.f((mm40) obj4, (gxo0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                aad.D((mm40) obj4, (j1p0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                pym0.d((mm40) obj4, (m1p0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                xf0.z((mm40) obj4, (vhe) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                u4n0.f((mm40) obj4, (r6p0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                b34.P((mm40) obj4, (b6p0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                s7n0.d((mm40) obj4, (q5p0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ o3m0(Object obj, Object obj2, byte b) {
        this.f24593a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ o3m0(Object obj, Object obj2, int i, byte b) {
        this.f24593a = b;
        this.c = obj;
        this.b = obj2;
    }
}
