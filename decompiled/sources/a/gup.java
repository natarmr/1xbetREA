package a;

import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gup implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11941a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gup(Object obj, mm40 mm40Var, byte b) {
        this.f11941a = b;
        this.c = obj;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        Object value3;
        final dnr dnrVar;
        Object bioVar;
        Long lValueOf;
        dja djaVar;
        byte b = this.f11941a;
        byte b2 = 11;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 8;
        byte b4 = 7;
        int i = 0;
        Long lValueOf2 = null;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wvb.w((mm40) obj4, (ytp) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                pup pupVar = (pup) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (((Throwable) obj4) instanceof ff5) {
                    pupVar.getClass();
                    p7m0 p7m0Var = pupVar.i.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        pupVar.f.getClass();
                    } while (!p7m0Var.m(value2, hup.a((hup) value2, null, null, new ptp(ocl.b(pupVar.y, pb10.g, null, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 990)), 11)));
                } else {
                    pupVar.getClass();
                    p7m0 p7m0Var2 = pupVar.i.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        pupVar.f.getClass();
                    } while (!p7m0Var2.m(value, hup.a((hup) value, null, null, new qtp(ocl.b(pupVar.y, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)), 11)));
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                dyb.w((mm40) obj4, (ewp) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                mbc.w((mm40) obj4, (q6p0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                qcc.r((mm40) obj4, (igs) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                odq.a((mm40) obj4, (pdq) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                feb.G((mm40) obj4, (kiq) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 7:
                ehm0 ehm0Var = (ehm0) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bvq bvqVar = (bvq) ((xam0) ehm0Var.d).f40564a;
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new z9q(function1, (byte) 9);
                        fetVar.o0(objP);
                    }
                    ibc.N(bvqVar, (Function0) objP, fetVar, 48);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ibc.N((bvq) obj4, (Function0) obj3, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            case 9:
                clz clzVar = (clz) obj;
                clzVar.getClass();
                ((blz) obj2).getClass();
                ((Fragment) obj4).n0().k().a(clzVar, (v62) obj3);
                return Unit.f46060a;
            case 10:
                s0r s0rVar = (s0r) obj3;
                blz blzVar = (blz) obj2;
                ((clz) obj).getClass();
                blzVar.getClass();
                ((glz) obj4).f(blzVar);
                s0rVar.e.post(new ccf(s0rVar, (byte) 27));
                return Unit.f46060a;
            case 11:
                s0r s0rVar2 = (s0r) obj3;
                blz blzVar2 = (blz) obj2;
                ((clz) obj).getClass();
                blzVar2.getClass();
                ((glz) obj4).f(blzVar2);
                s0rVar2.e.post(new ccf(s0rVar2, (byte) 29));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                vic.l((mm40) obj4, (k3w) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                abr abrVar = (abr) obj3;
                oyg0 oyg0Var = abrVar.f;
                ocj ocjVar = abrVar.i;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (((Throwable) obj4) instanceof ff5) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value3, rar.a((rar) value3, false, false, true, 8)));
                } else {
                    boolean z = true;
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    while (true) {
                        Object value4 = p7m0Var4.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                        if (!p7m0Var4.m(value4, rar.a((rar) value4, false, z, false, 8))) {
                            z = true;
                        }
                    }
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                rcb.c((gf6) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                zjb.o((ffr) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                dnr dnrVar2 = (dnr) obj3;
                mm40 mm40Var = (mm40) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ddk ddkVar = dnr.c2;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k3t0 k3t0VarI0 = dnrVar2.I0();
                    boolean zI = fetVar2.i(dnrVar2);
                    Object objP2 = fetVar2.P();
                    if (zI || objP2 == cl5Var) {
                        pop popVar = new pop(1, dnrVar2, dnr.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/sportgame/advanced/impl/presentation/GameAdvancedSideEffect;)V", 0, (byte) 26);
                        dnrVar = dnrVar2;
                        fetVar2.o0(popVar);
                        objP2 = popVar;
                    } else {
                        dnrVar = dnrVar2;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP2), fetVar2);
                    byte b5 = 3;
                    boolean zI2 = fetVar2.i(k3t0VarI0) | fetVar2.i(dnrVar) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP3 = fetVar2.P();
                    if (zI2 || objP3 == cl5Var) {
                        bioVar = new bio(k3t0VarI0, dnrVar, pz40VarF, null, (byte) 7);
                        fetVar2.o0(bioVar);
                    } else {
                        bioVar = objP3;
                    }
                    m0x0.t(fetVar2, dnrVar, (Function2) bioVar);
                    pz40 pz40VarY = ((i3t0) dnrVar.I0()).y(fetVar2);
                    Object[] objArr = new Object[0];
                    boolean zG = fetVar2.g(pz40VarY);
                    Object objP4 = fetVar2.P();
                    if (zG || objP4 == cl5Var) {
                        objP4 = new zwp(pz40VarY, b2);
                        fetVar2.o0(objP4);
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP4, fetVar2);
                    Object[] objArr2 = new Object[0];
                    boolean zG2 = fetVar2.g(pz40VarY);
                    Object objP5 = fetVar2.P();
                    if (zG2 || objP5 == cl5Var) {
                        objP5 = new zwp(pz40VarY, b5);
                        fetVar2.o0(objP5);
                    }
                    final l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP5, fetVar2);
                    Object[] objArr3 = new Object[0];
                    boolean zG3 = fetVar2.g(pz40VarY);
                    Object objP6 = fetVar2.P();
                    if (zG3 || objP6 == cl5Var) {
                        objP6 = new zwp((l7m0) pz40VarY, (byte) 4);
                        fetVar2.o0(objP6);
                    }
                    final l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP6, fetVar2);
                    Object[] objArr4 = new Object[0];
                    boolean zG4 = fetVar2.g(pz40VarY);
                    Object objP7 = fetVar2.P();
                    byte b6 = 5;
                    if (zG4 || objP7 == cl5Var) {
                        objP7 = new zwp(pz40VarY, b6);
                        fetVar2.o0(objP7);
                    }
                    l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP7, fetVar2);
                    Object[] objArr5 = new Object[0];
                    boolean zG5 = fetVar2.g(pz40VarY);
                    Object objP8 = fetVar2.P();
                    if (zG5 || objP8 == cl5Var) {
                        objP8 = new zwp((l7m0) pz40VarY, (byte) 6);
                        fetVar2.o0(objP8);
                    }
                    l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP8, fetVar2);
                    Object[] objArr6 = new Object[0];
                    boolean zG6 = fetVar2.g(pz40VarY);
                    Object objP9 = fetVar2.P();
                    if (zG6 || objP9 == cl5Var) {
                        objP9 = new zwp(pz40VarY, b4);
                        fetVar2.o0(objP9);
                    }
                    l7m0 l7m0VarY6 = v3c.Y(objArr6, (Function0) objP9, fetVar2);
                    Object[] objArr7 = new Object[0];
                    boolean zG7 = fetVar2.g(pz40VarY);
                    Object objP10 = fetVar2.P();
                    if (zG7 || objP10 == cl5Var) {
                        objP10 = new zwp(pz40VarY, b3);
                        fetVar2.o0(objP10);
                    }
                    l7m0 l7m0VarY7 = v3c.Y(objArr7, (Function0) objP10, fetVar2);
                    Object[] objArr8 = new Object[0];
                    boolean zG8 = fetVar2.g(pz40VarY);
                    Object objP11 = fetVar2.P();
                    if (zG8 || objP11 == cl5Var) {
                        objP11 = new zwp((l7m0) pz40VarY, (byte) 9);
                        fetVar2.o0(objP11);
                    }
                    l7m0 l7m0VarY8 = v3c.Y(objArr8, (Function0) objP11, fetVar2);
                    Object value5 = l7m0VarY8.getValue();
                    boolean zI3 = fetVar2.i(dnrVar) | fetVar2.g(l7m0VarY8);
                    Object objP12 = fetVar2.P();
                    if (zI3 || objP12 == cl5Var) {
                        objP12 = new sxk(dnrVar, l7m0VarY8, null, (byte) 29);
                        fetVar2.o0(objP12);
                    }
                    m0x0.t(fetVar2, value5, (Function2) objP12);
                    boolean zI4 = fetVar2.i(dnrVar) | fetVar2.g(pz40VarY);
                    Object objP13 = fetVar2.P();
                    if (zI4 || objP13 == cl5Var) {
                        objP13 = new zwp(dnrVar, pz40VarY);
                        fetVar2.o0(objP13);
                    }
                    ugd ugdVarM = u1c.M(-1235743883, new ah10(l7m0VarY7, dnrVar, pz40VarY, (byte) 2), fetVar2);
                    ugd ugdVarM2 = u1c.M(2062493333, new eyn(l7m0VarY7, l7m0VarY4, dnrVar, (byte) 8), fetVar2);
                    ugd ugdVarM3 = u1c.M(2126468800, new z1s(l7m0VarY, dnrVar, (byte) 5), fetVar2);
                    ugd ugdVarM4 = u1c.M(1092602835, new v7i0(l7m0VarY5, (byte) 27), fetVar2);
                    final byte b7 = 0;
                    ugd ugdVarM5 = u1c.M(607657586, new xdr() { // from class: a.bnr
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            byte b8 = b7;
                            cl5 cl5Var2 = ukd.f35823a;
                            dnr dnrVar3 = dnrVar;
                            l7m0 l7m0Var = l7m0VarY2;
                            byte b9 = 4;
                            byte b10 = 1;
                            switch (b8) {
                                case 0:
                                    mm40 mm40Var2 = (mm40) obj5;
                                    fet fetVar3 = (fet) obj6;
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    ddk ddkVar2 = dnr.c2;
                                    mm40Var2.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar3.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        k3t0 k3t0VarI1 = dnrVar3.I0();
                                        boolean zI5 = fetVar3.i(k3t0VarI1);
                                        Object objP14 = fetVar3.P();
                                        if (zI5 || objP14 == cl5Var2) {
                                            pop popVar2 = new pop(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                                            fetVar3.o0(popVar2);
                                            objP14 = popVar2;
                                        }
                                        Function1 function2 = (Function1) ((jhy) objP14);
                                        l7m0Var.getClass();
                                        function2.getClass();
                                        pkk0 pkk0Var = (pkk0) fetVar3.k(bmd.q);
                                        boolean zG9 = fetVar3.g(pkk0Var) | fetVar3.g(function2);
                                        Object objP15 = fetVar3.P();
                                        if (zG9 || objP15 == cl5Var2) {
                                            objP15 = new e54(pkk0Var, function2, b9);
                                            fetVar3.o0(objP15);
                                        }
                                        fre0.C(mm40Var2, (Function0) objP15, u1c.M(318817120, new itz(l7m0Var, function2, (byte) 9), fetVar3), u1c.M(1368686335, new itz(l7m0Var, function2, (byte) 13), fetVar3), u1c.M(44346959, new wq40(l7m0Var, b10), fetVar3), fetVar3, (iIntValue3 & 14) | 28032);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var3 = (mm40) obj5;
                                    fet fetVar4 = (fet) obj6;
                                    int iIntValue4 = ((Integer) obj7).intValue();
                                    ddk ddkVar3 = dnr.c2;
                                    mm40Var3.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= fetVar4.g(mm40Var3) ? (byte) 4 : (byte) 2;
                                    }
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var3, qmk.a(fetVar4).d, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                                        f0k0 f0k0Var = (f0k0) l7m0Var.getValue();
                                        boolean zI6 = fetVar4.i(dnrVar3);
                                        Object objP16 = fetVar4.P();
                                        if (zI6 || objP16 == cl5Var2) {
                                            objP16 = new zmr(dnrVar3, (byte) 0);
                                            fetVar4.o0(objP16);
                                        }
                                        xww.o(mm40VarN, f0k0Var, (Function1) objP16, fetVar4, 0);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2);
                    final byte b8 = 1;
                    sj3.t(mm40Var, l7m0VarY6, (Function0) objP13, ugdVarM, ugdVarM2, ugdVarM3, ugdVarM4, ugdVarM5, u1c.M(-362232912, new xdr() { // from class: a.bnr
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            byte b9 = b8;
                            cl5 cl5Var2 = ukd.f35823a;
                            dnr dnrVar3 = dnrVar;
                            l7m0 l7m0Var = l7m0VarY3;
                            byte b10 = 4;
                            byte b11 = 1;
                            switch (b9) {
                                case 0:
                                    mm40 mm40Var2 = (mm40) obj5;
                                    fet fetVar3 = (fet) obj6;
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    ddk ddkVar2 = dnr.c2;
                                    mm40Var2.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= fetVar3.g(mm40Var2) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        k3t0 k3t0VarI1 = dnrVar3.I0();
                                        boolean zI5 = fetVar3.i(k3t0VarI1);
                                        Object objP14 = fetVar3.P();
                                        if (zI5 || objP14 == cl5Var2) {
                                            pop popVar2 = new pop(1, k3t0VarI1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                                            fetVar3.o0(popVar2);
                                            objP14 = popVar2;
                                        }
                                        Function1 function2 = (Function1) ((jhy) objP14);
                                        l7m0Var.getClass();
                                        function2.getClass();
                                        pkk0 pkk0Var = (pkk0) fetVar3.k(bmd.q);
                                        boolean zG9 = fetVar3.g(pkk0Var) | fetVar3.g(function2);
                                        Object objP15 = fetVar3.P();
                                        if (zG9 || objP15 == cl5Var2) {
                                            objP15 = new e54(pkk0Var, function2, b10);
                                            fetVar3.o0(objP15);
                                        }
                                        fre0.C(mm40Var2, (Function0) objP15, u1c.M(318817120, new itz(l7m0Var, function2, (byte) 9), fetVar3), u1c.M(1368686335, new itz(l7m0Var, function2, (byte) 13), fetVar3), u1c.M(44346959, new wq40(l7m0Var, b11), fetVar3), fetVar3, (iIntValue3 & 14) | 28032);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    mm40 mm40Var3 = (mm40) obj5;
                                    fet fetVar4 = (fet) obj6;
                                    int iIntValue4 = ((Integer) obj7).intValue();
                                    ddk ddkVar3 = dnr.c2;
                                    mm40Var3.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= fetVar4.g(mm40Var3) ? (byte) 4 : (byte) 2;
                                    }
                                    if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var3, qmk.a(fetVar4).d, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13);
                                        f0k0 f0k0Var = (f0k0) l7m0Var.getValue();
                                        boolean zI6 = fetVar4.i(dnrVar3);
                                        Object objP16 = fetVar4.P();
                                        if (zI6 || objP16 == cl5Var2) {
                                            objP16 = new zmr(dnrVar3, (byte) 0);
                                            fetVar4.o0(objP16);
                                        }
                                        xww.o(mm40VarN, f0k0Var, (Function1) objP16, fetVar4, 0);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), fetVar2, 920349702);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 17:
                js20 js20Var = (js20) obj4;
                spr sprVar = (spr) obj3;
                qnr qnrVar = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar.getClass();
                if (js20Var != null) {
                    if ((js20Var instanceof gs20) || (js20Var instanceof hs20)) {
                        lValueOf = null;
                    } else if (js20Var instanceof is20) {
                        lValueOf = Long.valueOf(((is20) js20Var).f15285a);
                    }
                    qnr qnrVarA = qnr.a(qnrVar, 0L, null, null, false, 0L, 0L, lValueOf, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, js20Var, null, null, null, null, null, null, false, null, false, -65, 524031);
                    sprVar.o.e("KEY_CATEGORY_ID", qnrVarA.g);
                    return qnrVarA;
                }
                t9f.b();
                return null;
            case 18:
                xsr xsrVar = (xsr) obj4;
                spr sprVar2 = (spr) obj3;
                qnr qnrVar2 = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar2.getClass();
                boolean z2 = xsrVar instanceof ssr;
                boolean z3 = xsrVar instanceof tsr;
                usr usrVar = (usr) xsrVar;
                if (usrVar != null) {
                    if (usrVar instanceof ssr) {
                        djaVar = dja.BROADCASTING_VIDEO;
                    } else if (usrVar instanceof tsr) {
                        djaVar = dja.BROADCASTING_ZONE;
                    }
                    qnr qnrVarA2 = qnr.a(qnrVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, z2, z3, false, false, false, null, null, false, false, null, null, null, djaVar, null, null, null, null, null, false, null, false, -402653185, 523775);
                    sprVar2.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA2.P);
                    return qnrVarA2;
                }
                t9f.b();
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                nqr nqrVar = (nqr) obj3;
                mm40 mm40Var2 = (mm40) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fetVar3.X();
                } else if (nqrVar instanceof jqr) {
                    fetVar3.e0(1202299266);
                    ntb.u(mm40Var2, (jqr) nqrVar, fetVar3, 0);
                    fetVar3.r(false);
                } else {
                    if (!(nqrVar instanceof lqr)) {
                        throw b1j.f(1202297269, fetVar3, false);
                    }
                    fetVar3.e0(1202304544);
                    dub.D(mm40Var2, (lqr) nqrVar, fetVar3, 0);
                    fetVar3.r(false);
                }
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                dtb.r((mm40) obj4, (iqr) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                ntb.u((mm40) obj4, (jqr) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                vtb.y((mm40) obj4, (kqr) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                dub.D((mm40) obj4, (lqr) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                qbc.t((mm40) obj4, (ltr) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xvm0 xvm0Var = (xvm0) obj4;
                js20 js20Var2 = (js20) obj3;
                oyg0 oyg0Var2 = (oyg0) obj;
                z2s z2sVar = (z2s) obj2;
                Long lValueOf3 = null;
                long id = xvm0Var.getId();
                q7x.F(oyg0Var2, Long.valueOf(id), "KEY_SUB_GAME_ID");
                if (js20Var2 != null) {
                    if (!(js20Var2 instanceof gs20) && !(js20Var2 instanceof hs20)) {
                        if (js20Var2 instanceof is20) {
                            lValueOf3 = Long.valueOf(((is20) js20Var2).f15285a);
                        }
                    }
                    q7x.F(oyg0Var2, lValueOf3, "KEY_CATEGORY_ID");
                    return z2s.a(z2sVar, 0L, null, null, false, 0L, id, lValueOf3, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, xvm0Var, js20Var2, null, null, null, null, null, null, null, null, false, null, -97, 65511);
                }
                t9f.b();
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                r7s r7sVar = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar.getClass();
                r7s r7sVarA = r7s.a(r7sVar, 0L, null, null, false, 0L, 0L, null, null, (py20) obj4, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -1025, 1048575);
                ((g9s) obj3).o.e("KEY_MARKETS_ANCHOR_STATE", r7sVarA.k);
                return r7sVarA;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                xsr xsrVar2 = (xsr) obj4;
                g9s g9sVar = (g9s) obj3;
                r7s r7sVar2 = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar2.getClass();
                boolean z4 = xsrVar2 instanceof ssr;
                boolean z5 = xsrVar2 instanceof tsr;
                usr usrVar2 = (usr) xsrVar2;
                if (usrVar2 != null) {
                    if (!(usrVar2 instanceof ssr)) {
                        if (usrVar2 instanceof tsr) {
                            fsr fsrVar = r7sVar2.y;
                            if (fsrVar != null && fsrVar.b) {
                                i = 1;
                            }
                        }
                    }
                    r7s r7sVarA2 = r7s.a(r7sVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, z4, z5, Integer.valueOf(i), false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, 536870911, 1048575);
                    g9sVar.o.e("KEY_BROADCASTING_INDEX", r7sVarA2.F);
                    return r7sVarA2;
                }
                t9f.b();
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                js20 js20Var3 = (js20) obj4;
                g9s g9sVar2 = (g9s) obj3;
                r7s r7sVar3 = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar3.getClass();
                if (js20Var3 != null) {
                    if (!(js20Var3 instanceof gs20) && !(js20Var3 instanceof hs20)) {
                        if (js20Var3 instanceof is20) {
                            lValueOf2 = Long.valueOf(((is20) js20Var3).f15285a);
                        }
                    }
                    r7s r7sVarA3 = r7s.a(r7sVar3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, js20Var3, lValueOf2, null, null, null, null, null, null, false, -1, 1045503);
                    g9sVar2.o.e("KEY_CATEGORY_ID", r7sVarA3.R);
                    return r7sVarA3;
                }
                t9f.b();
                return null;
            default:
                ((Integer) obj2).getClass();
                kbc.t((mm40) obj4, (gad) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gup(Object obj, Object obj2, byte b) {
        this.f11941a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ gup(Object obj, Object obj2, int i, byte b) {
        this.f11941a = b;
        this.b = obj;
        this.c = obj2;
    }
}
