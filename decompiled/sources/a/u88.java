package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feature.office.payment.impl.di.navigation.PaymentScreenFactoryImpl$getPaymentScreen$1;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes4.dex */
public final class u88 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u88(Object obj, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = z;
    }

    private final Object l(Object obj) {
        v000 v000Var = (v000) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            bei0 bei0Var = v000Var.p;
            boolean z2 = this.k;
            LimitNeGroupEnum limitNeGroupEnum = v000Var.o;
            this.j = true;
            r200 r200Var = bei0Var.f2453a;
            d200 d200Var = r200Var.f29707a;
            Object objC = d200Var.f5334a.c(r200Var.c.a(), new wmz(limitNeGroupEnum.f46750a, z2 ? 1 : 0), this);
            if (objC != wneVar) {
                objC = Unit.f46060a;
            }
            if (objC != wneVar) {
                objC = Unit.f46060a;
            }
            if (objC != wneVar) {
                objC = Unit.f46060a;
            }
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        i1w0 i1w0Var = v000Var.q;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return Unit.f46060a;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    private final Object m(Object obj) {
        Object objB;
        wne wneVar;
        Object next;
        j400 j400Var = (j400) this.l;
        wne wneVar2 = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            wen.b.getClass();
            j400Var.j = 0L;
            qlq0.f28947a.getClass();
            rq40.f30914a.getClass();
            j400Var.l = new plq0(rq40.b());
            boolean z2 = this.k;
            this.j = true;
            if (z2) {
                Iterator it = j400Var.c.f7160a.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((niq0) next).b != pki0.SESSION_TIME_LIMIT_1_DAY);
                niq0 niq0Var = (niq0) next;
                if ((niq0Var != null ? niq0Var.h : null) == krz.b) {
                    objB = ((y300) j400Var.f15861a.f8888a.invoke()).b(j400Var.b.a(), this);
                    wneVar = wne.f39444a;
                    if (objB != wneVar) {
                        objB = Unit.f46060a;
                    }
                    if (objB != wneVar) {
                        objB = Unit.f46060a;
                    }
                    if (objB != wneVar) {
                        objB = Unit.f46060a;
                    }
                } else {
                    objB = Unit.f46060a;
                }
            } else {
                objB = ((y300) j400Var.f15861a.f8888a.invoke()).b(j400Var.b.a(), this);
                wneVar = wne.f39444a;
                if (objB != wneVar) {
                    objB = Unit.f46060a;
                }
                if (objB != wneVar) {
                    objB = Unit.f46060a;
                }
                if (objB != wneVar) {
                    objB = Unit.f46060a;
                }
            }
            if (objB == wneVar2) {
                return wneVar2;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        Object value;
        g500 g500Var = (g500) this.l;
        boolean z = this.k;
        wne wneVar = wne.f39444a;
        boolean z2 = this.j;
        if (!z2) {
            z1x.P(obj);
            p7m0 p7m0Var = g500Var.m;
            if (z) {
                this.k = z;
                this.j = true;
                p7m0Var.getClass();
                p7m0Var.o(null, b500.f1979a);
                if (Unit.f46060a == wneVar) {
                    return wneVar;
                }
            } else {
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new c500(sa10.b(g500Var.c, pb10.g, R.string.data_retrieval_error, 0, null, 28))));
            }
            return Unit.f46060a;
        }
        if (!z2) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        bby bbyVar = g500Var.r;
        if (bbyVar == null || !bbyVar.isActive()) {
            g500Var.y();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        Object objD0;
        Object value;
        Object value2;
        gb00 gb00Var = (gb00) this.l;
        ocj ocjVar = gb00Var.i;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (this.k) {
                int i = gb00.x;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ma00.a((ma00) value, true, false, 0, 0, 0, null, null, 252)));
            }
            e1u e1uVar = gb00Var.s;
            String str = gb00Var.o;
            this.j = true;
            ywu ywuVar = (ywu) e1uVar.b;
            objD0 = qjj.d0(((mne) ywuVar.b).b, new bfm0(ywuVar, str, true, null), this);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objD0 = obj;
        }
        l800 l800Var = (l800) objD0;
        int i2 = gb00.x;
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
        } while (!p7m0Var2.m(value2, ma00.a((ma00) value2, false, false, 0, 0, 0, l800Var, null, 220)));
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new u88(obj2, this.k, yjeVar, (byte) 0);
            case 1:
                return new u88(obj2, this.k, yjeVar, (byte) 1);
            case 2:
                return new u88(this.k, obj2, yjeVar, (byte) 2);
            case 3:
                u88 u88Var = new u88(obj2, this.k, yjeVar, (byte) 3);
                u88Var.j = ((Boolean) obj).booleanValue();
                return u88Var;
            case 4:
                return new u88(obj2, this.k, yjeVar, (byte) 4);
            case 5:
                return new u88(this.k, obj2, yjeVar, (byte) 5);
            case 6:
                u88 u88Var2 = new u88((r7f) obj2, yjeVar, (byte) 6);
                u88Var2.k = ((Boolean) obj).booleanValue();
                return u88Var2;
            case 7:
                u88 u88Var3 = new u88((lbf) obj2, yjeVar, (byte) 7);
                u88Var3.k = ((Boolean) obj).booleanValue();
                return u88Var3;
            case 8:
                u88 u88Var4 = new u88((jfg) obj2, yjeVar, (byte) 8);
                u88Var4.k = ((Boolean) obj).booleanValue();
                return u88Var4;
            case 9:
                u88 u88Var5 = new u88((igg) obj2, yjeVar, (byte) 9);
                u88Var5.k = ((Boolean) obj).booleanValue();
                return u88Var5;
            case 10:
                u88 u88Var6 = new u88((lwh) obj2, yjeVar, (byte) 10);
                u88Var6.k = ((Boolean) obj).booleanValue();
                return u88Var6;
            case 11:
                return new u88(obj2, this.k, yjeVar, (byte) 11);
            case 12:
                return new u88(obj2, this.k, yjeVar, (byte) 12);
            case 13:
                return new u88(obj2, this.k, yjeVar, (byte) 13);
            case 14:
                return new u88(obj2, this.k, yjeVar, (byte) 14);
            case 15:
                return new u88(obj2, this.k, yjeVar, (byte) 15);
            case 16:
                return new u88(this.k, obj2, yjeVar, (byte) 16);
            case 17:
                return new u88(obj2, this.k, yjeVar, (byte) 17);
            case 18:
                u88 u88Var7 = new u88((yys) obj2, yjeVar, (byte) 18);
                u88Var7.k = ((Boolean) obj).booleanValue();
                return u88Var7;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new u88(obj2, this.k, yjeVar, (byte) 19);
            case 20:
                return new u88(obj2, this.k, yjeVar, (byte) 20);
            case 21:
                u88 u88Var8 = new u88((ibx) obj2, yjeVar, (byte) 21);
                u88Var8.k = ((Boolean) obj).booleanValue();
                return u88Var8;
            case 22:
                return new u88(obj2, this.k, yjeVar, (byte) 22);
            case 23:
                u88 u88Var9 = new u88((t6y) obj2, yjeVar, (byte) 23);
                u88Var9.k = ((Boolean) obj).booleanValue();
                return u88Var9;
            case 24:
                return new u88(this.k, obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new u88(obj2, this.k, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new u88(obj2, this.k, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                u88 u88Var10 = new u88((g500) obj2, yjeVar, (byte) 27);
                u88Var10.k = ((Boolean) obj).booleanValue();
                return u88Var10;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new u88(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new u88(obj2, this.k, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((u88) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Object obj3 = (Boolean) obj;
                obj3.getClass();
                return ((u88) create(obj3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((u88) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((u88) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((u88) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((u88) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((u88) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((u88) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((u88) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((u88) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                return ((u88) create(bool8, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                return ((u88) create(bool9, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u88) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:308:0x062c  */
    /* JADX WARN: Code duplicated, block: B:311:0x0641  */
    /* JADX WARN: Code duplicated, block: B:314:0x0646  */
    /* JADX WARN: Code duplicated, block: B:317:0x064b  */
    /* JADX WARN: Code duplicated, block: B:319:0x064f  */
    /* JADX WARN: Code duplicated, block: B:354:0x0727  */
    /* JADX WARN: Code duplicated, block: B:365:0x0746  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objK;
        Object objB;
        Object value;
        Object value2;
        Object objA;
        Object objD;
        Object objA2;
        boolean z;
        boolean z2;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        p7m0 p7m0Var;
        Object value3;
        Object value4;
        Object objA3;
        p7m0 p7m0Var2;
        Object value5;
        Object value6;
        Object objA4;
        gmq vsg0Var;
        Object value7;
        Object objC;
        Object objD0;
        Object value8;
        Object value9;
        Object objN;
        Object value10;
        Object value11;
        Object obj2;
        byte b = this.i;
        byte b2 = 27;
        byte b3 = 10;
        byte b4 = 4;
        byte b5 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.l;
        byte b6 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                v88 v88Var = (v88) obj3;
                r990 r990Var = v88Var.f36969a;
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    ieu ieuVar = v88Var.c;
                    this.j = true;
                    objK = ieuVar.k(this);
                    if (objK == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                if (((Boolean) objK).booleanValue()) {
                    i1w0 i1w0Var = v88Var.f;
                    if (i1w0Var == null) {
                        Intrinsics.h("internalRouter");
                        throw null;
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new f1w0(drm0.e(v88Var.e))), i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    boolean z4 = this.k;
                    long j = v88Var.i;
                    if (z4) {
                        boolean z5 = v88Var.h;
                        i1w0 i1w0Var2 = v88Var.f;
                        if (i1w0Var2 == null) {
                            Intrinsics.h("internalRouter");
                            throw null;
                        }
                        k0w0 k0w0Var = new k0w0(i1w0Var2);
                        k0w0Var.e(new PaymentScreenFactoryImpl$getPaymentScreen$1(r990Var, z5, j));
                        ListIterator listIteratorO = b1j.o(i1w0Var2, k0w0Var.f17489a, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO;
                            if (pawVar2.hasNext()) {
                                i1w0Var2.a((oe50) pawVar2.next());
                            }
                        }
                    } else {
                        boolean z6 = v88Var.h;
                        i1w0 i1w0Var3 = v88Var.f;
                        if (i1w0Var3 == null) {
                            Intrinsics.h("internalRouter");
                            throw null;
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                        PaymentScreenFactoryImpl$getPaymentScreen$1 paymentScreenFactoryImpl$getPaymentScreen$1 = new PaymentScreenFactoryImpl$getPaymentScreen$1(r990Var, z6, j);
                        if (paymentScreenFactoryImpl$getPaymentScreen$1 instanceof DialogScreen) {
                            copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentScreenFactoryImpl$getPaymentScreen$1)));
                        } else {
                            copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(paymentScreenFactoryImpl$getPaymentScreen$1)));
                        }
                        ListIterator listIteratorO2 = b1j.o(i1w0Var3, copyOnWriteArrayList2, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorO2;
                            if (pawVar3.hasNext()) {
                                i1w0Var3.a((oe50) pawVar3.next());
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                jm8 jm8Var = (jm8) obj3;
                ocj ocjVar = jm8Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    boolean z8 = this.k;
                    int i = jm8.V;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    while (true) {
                        Object value12 = p7m0Var3.getValue();
                        value12.getClass();
                        boolean z9 = z8;
                        if (p7m0Var3.m(value12, kl8.a((kl8) value12, false, null, null, null, false, false, null, null, false, null, null, z9, false, 61439))) {
                            ahu ahuVar = jm8Var.s;
                            bm5 bm5Var = bm5.d;
                            this.j = true;
                            objB = ahuVar.b(bm5Var, this);
                            if (objB == wneVar2) {
                                return wneVar2;
                            }
                        } else {
                            z8 = z9;
                        }
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ql5 ql5Var = (ql5) objB;
                jm8Var.C.l(bm5.d, ql5Var);
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                } while (!p7m0Var4.m(value, kl8.a((kl8) value, false, null, null, null, false, false, null, null, false, null, ql5Var, false, false, 63487)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    if (this.k) {
                        p7m0 p7m0Var5 = ((h2b) obj3).X;
                        Boolean bool = Boolean.TRUE;
                        this.j = true;
                        p7m0Var5.getClass();
                        p7m0Var5.o(null, bool);
                        if (Unit.f46060a == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                boolean z11 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                plb plbVar = (plb) obj3;
                int i2 = plb.I;
                p7m0 p7m0Var6 = plbVar.i.f25029a;
                do {
                    value2 = p7m0Var6.getValue();
                    value2.getClass();
                } while (!p7m0Var6.m(value2, alb.a((alb) value2, z11, null, null, null, null, 15871)));
                if (z11) {
                    boolean z12 = this.k;
                    bby bbyVar = plbVar.E;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    plbVar.E = i3t0.K(plbVar, null, null, new olb((byte) (objArr == true ? 1 : 0), yjeVar, (i3t0) plbVar, z12), 3);
                }
                return Unit.f46060a;
            case 4:
                kyd kydVar = (kyd) obj3;
                wne wneVar5 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    rou rouVar = kydVar.e;
                    this.j = true;
                    objA = rouVar.a(false, this);
                    if (objA == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                kydVar.j.d(new r91((Object) kydVar, (Object) ((m2c0) objA).Z, this.k, (byte) 6));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    if (this.k) {
                        this.j = true;
                        if (qcc.O(4500L, this) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var7 = ((fae) obj3).F;
                p7m0Var7.getClass();
                p7m0Var7.o(null, u9e.f35280a);
                return Unit.f46060a;
            case 6:
                r7f r7fVar = (r7f) obj3;
                boolean z15 = this.k;
                wne wneVar7 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    w4f w4fVar = r7fVar.C1;
                    w4f w4fVar2 = w4f.f38539a;
                    if (w4fVar == w4fVar2 && !z15) {
                        r7fVar.B();
                    }
                    w4f w4fVar3 = w4f.c;
                    boolean zContains = q3d.j(w4fVar2, w4fVar3).contains(r7fVar.C1);
                    if (z15) {
                        r7fVar.y(new x9(zContains, r7fVar, b3));
                        w4fVar3 = w4f.b;
                    }
                    r7fVar.C1 = w4fVar3;
                    if (!z15) {
                        v3c.N(r7fVar.O1);
                        v3c.N(r7fVar.P1);
                        v3c.N(r7fVar.Q1);
                        lye lyeVar = (lye) r7fVar.g1.f22172a.f10647a;
                        lyeVar.e.clear();
                        lyeVar.f.clear();
                        if (r7fVar.N().g) {
                            h9c h9cVar = r7fVar.f;
                            this.k = z15;
                            this.j = true;
                            objD = h9cVar.f12667a.D(this);
                            if (objD == wneVar7) {
                                return wneVar7;
                            }
                        }
                        r7fVar.B();
                        r7fVar.W();
                    }
                    return Unit.f46060a;
                }
                if (!z16) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objD = obj;
                if (((Number) objD).longValue() <= 1) {
                    r7fVar.o0(false, m2a.m);
                }
                r7fVar.B();
                r7fVar.W();
                return Unit.f46060a;
            case 7:
                lbf lbfVar = (lbf) obj3;
                p7m0 p7m0Var8 = lbfVar.q;
                boolean z17 = this.k;
                wne wneVar8 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    lbfVar.v = z17;
                    if (z17) {
                        ebf ebfVar = (ebf) p7m0Var8.getValue();
                        if ((ebfVar instanceof dbf) || ((ebfVar instanceof cbf) && ((cbf) ebfVar).b.isEmpty())) {
                            e0c e0cVar = lbfVar.k;
                            this.k = z17;
                            this.j = true;
                            objA2 = e0cVar.a(this);
                            if (objA2 == wneVar8) {
                                return wneVar8;
                            }
                        }
                        return Unit.f46060a;
                    }
                    if (p7m0Var8.getValue() instanceof dbf) {
                        cbf cbfVar = new cbf(iun.f15405a, false);
                        p7m0Var8.getClass();
                        p7m0Var8.o(null, cbfVar);
                    }
                    return Unit.f46060a;
                }
                if (!z18) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA2 = obj;
                List list = (List) objA2;
                cbf cbfVar2 = new cbf(list, !list.isEmpty());
                p7m0Var8.getClass();
                p7m0Var8.o(null, cbfVar2);
                return Unit.f46060a;
            case 8:
                jfg jfgVar = (jfg) obj3;
                boolean z19 = this.k;
                wne wneVar9 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    j0g0 j0g0Var3 = ((dfg) jfgVar.D()).c;
                    if (j0g0Var3 != null) {
                        Object obj4 = j0g0Var3.f15681a;
                        if (obj4 instanceof g0g0) {
                            obj4 = null;
                        }
                        bfg bfgVar = (bfg) obj4;
                        if (bfgVar == null || (j0g0Var2 = bfgVar.c) == null) {
                            z = true;
                        } else {
                            z = j0g0Var2.f15681a instanceof g0g0;
                        }
                    } else {
                        z = true;
                    }
                    j0g0 j0g0Var4 = ((dfg) jfgVar.D()).c;
                    if (j0g0Var4 != null) {
                        Object obj5 = j0g0Var4.f15681a;
                        if (obj5 instanceof g0g0) {
                            obj5 = null;
                        }
                        bfg bfgVar2 = (bfg) obj5;
                        if (bfgVar2 == null || (j0g0Var = bfgVar2.b) == null) {
                            z2 = true;
                        } else {
                            z2 = j0g0Var.f15681a instanceof g0g0;
                        }
                    } else {
                        z2 = true;
                    }
                    if (z19) {
                        if (((dfg) jfgVar.D()).c == null || (z && z2)) {
                            arc arcVar = jfgVar.u;
                            this.k = z19;
                            this.j = true;
                            Object objA5 = arcVar.f1338a.b.i.a(Boolean.TRUE, this);
                            if (objA5 != wneVar9) {
                                objA5 = Unit.f46060a;
                            }
                            if (objA5 != wneVar9) {
                                objA5 = Unit.f46060a;
                            }
                            if (objA5 != wneVar9) {
                                objA5 = Unit.f46060a;
                            }
                            if (objA5 == wneVar9) {
                                return wneVar9;
                            }
                        }
                    }
                    int i3 = jfg.B;
                    p7m0Var = jfgVar.i.f25029a;
                    do {
                        value3 = p7m0Var.getValue();
                        value3.getClass();
                    } while (!p7m0Var.m(value3, dfg.a((dfg) value3, null, z19, false, 223)));
                    return Unit.f46060a;
                }
                if (!z20) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int i4 = jfg.B;
                bby bbyVar2 = jfgVar.w;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                jfgVar.w = i3t0.K(jfgVar, null, null, new ifg(jfgVar, yjeVar, b6), 3);
                int i5 = jfg.B;
                p7m0Var = jfgVar.i.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                } while (!p7m0Var.m(value3, dfg.a((dfg) value3, null, z19, false, 223)));
                return Unit.f46060a;
            case 9:
                igg iggVar = (igg) obj3;
                ocj ocjVar2 = iggVar.i;
                boolean z21 = this.k;
                wne wneVar10 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    List list2 = ((egg) iggVar.D()).e;
                    if (!z21) {
                        p7m0 p7m0Var9 = ocjVar2.f25029a;
                        do {
                            value4 = p7m0Var9.getValue();
                            value4.getClass();
                        } while (!p7m0Var9.m(value4, egg.a((egg) value4, false, null, null, null, false, 223)));
                    } else if (!list2.isEmpty()) {
                        Integer num = ((egg) iggVar.D()).b;
                        int iIntValue = num != null ? num.intValue() : 0;
                        bby bbyVar3 = iggVar.G;
                        if (bbyVar3 != null) {
                            e3c.n(bbyVar3);
                        }
                        iggVar.G = i3t0.K(iggVar, null, new hfg(iggVar, b5), new hgg(iggVar, iIntValue, null), 1);
                    } else if (((egg) iggVar.D()).d == null) {
                        cxt cxtVar = iggVar.B;
                        this.k = z21;
                        this.j = true;
                        objA3 = cxtVar.f5139a.b.j.a(Boolean.TRUE, this);
                        if (objA3 != wneVar10) {
                            objA3 = Unit.f46060a;
                        }
                        if (objA3 != wneVar10) {
                            objA3 = Unit.f46060a;
                        }
                        if (objA3 != wneVar10) {
                            objA3 = Unit.f46060a;
                        }
                        if (objA3 == wneVar10) {
                            return wneVar10;
                        }
                    } else {
                        vdg vdgVar = ((egg) iggVar.D()).d;
                        if (vdgVar != null ? vdgVar.b.isEmpty() : true) {
                            cxt cxtVar2 = iggVar.B;
                            this.k = z21;
                            this.j = true;
                            objA3 = cxtVar2.f5139a.b.j.a(Boolean.TRUE, this);
                            if (objA3 != wneVar10) {
                                objA3 = Unit.f46060a;
                            }
                            if (objA3 != wneVar10) {
                                objA3 = Unit.f46060a;
                            }
                            if (objA3 != wneVar10) {
                                objA3 = Unit.f46060a;
                            }
                            if (objA3 == wneVar10) {
                                return wneVar10;
                            }
                        }
                    }
                    int i6 = igg.I;
                    p7m0Var2 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var2.getValue();
                        value5.getClass();
                    } while (!p7m0Var2.m(value5, egg.a((egg) value5, z21, null, null, null, false, 254)));
                    return Unit.f46060a;
                }
                if (!z22) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int i7 = igg.I;
                bby bbyVar4 = iggVar.G;
                if (bbyVar4 != null) {
                    e3c.n(bbyVar4);
                }
                iggVar.G = sac.T(new fnq(vtb.M(iggVar.w.f5139a.b.h), new e9g(iggVar, yjeVar, b4), b4), d5c.S(jiu0.a(iggVar), iggVar.A.f22085a), new wib(iggVar, yjeVar, (byte) 19));
                int i8 = igg.I;
                p7m0Var2 = ocjVar2.f25029a;
                do {
                    value5 = p7m0Var2.getValue();
                    value5.getClass();
                } while (!p7m0Var2.m(value5, egg.a((egg) value5, z21, null, null, null, false, 254)));
                return Unit.f46060a;
            case 10:
                lwh lwhVar = (lwh) obj3;
                boolean z23 = this.k;
                wne wneVar11 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    if (z23 && (((dwh) lwhVar.D()).b || ((dwh) lwhVar.D()).c || ((dwh) lwhVar.D()).d)) {
                        this.k = z23;
                        this.j = true;
                        if (lwhVar.M(this) == wneVar11) {
                            return wneVar11;
                        }
                    } else if (!z23 && (((dwh) lwhVar.D()).b || ((dwh) lwhVar.D()).c || ((dwh) lwhVar.D()).d)) {
                        p7m0 p7m0Var10 = lwhVar.i.f25029a;
                        do {
                            value6 = p7m0Var10.getValue();
                            value6.getClass();
                            lwhVar.f.getClass();
                        } while (!p7m0Var10.m(value6, dwh.a((dwh) value6, false, false, true, false, 0L, null, 49)));
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                e6j e6jVar = (e6j) obj3;
                wne wneVar12 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    khf0 khf0Var = e6jVar.s;
                    bm5 bm5Var2 = ((w5j) e6jVar.D()).b;
                    tl5 tl5Var = this.k ? tl5.f34128a : tl5.c;
                    this.j = true;
                    objA4 = khf0Var.A(bm5Var2, tl5Var, this);
                    if (objA4 == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA4 = obj;
                }
                e6jVar.D.l(((w5j) e6jVar.D()).b, (ql5) objA4);
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    ali aliVar = ((etj) obj3).f8378a;
                    boolean z27 = this.k;
                    this.j = true;
                    ((vwb0) aliVar.f1068a).e("HAS_DEFAULT_BET_SUM_ENABLED_PREF_KEY", z27);
                    twn.A(z27, (p7m0) aliVar.d, null);
                    if (Unit.f46060a == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                kbk kbkVar = (kbk) obj3;
                wne wneVar14 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    cei0 cei0Var = kbkVar.o;
                    boolean z29 = this.k;
                    cnz cnzVar = cnz.DEPOSIT_LIMITS;
                    this.j = true;
                    Object objC2 = cei0Var.f4214a.c(z29, cnzVar, this);
                    if (objC2 != wneVar14) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var4 = kbkVar.p;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var4);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var4, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorP2;
                    if (!pawVar4.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var4.a((oe50) pawVar4.next());
                }
                break;
            case 14:
                x3m x3mVar = (x3m) obj3;
                wne wneVar15 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    if (!((Boolean) ((hgk0) x3mVar.f40227a).getValue()).booleanValue()) {
                        return Unit.f46060a;
                    }
                    if (!this.k && x3mVar.c() == y3m.b) {
                        this.j = true;
                        if (x3mVar.a(this) == wneVar15) {
                            return wneVar15;
                        }
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                sdn sdnVar = (sdn) obj3;
                wne wneVar16 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    boolean z32 = !this.k;
                    this.j = true;
                    int i9 = sdn.B;
                    if (sdnVar.N(z32, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i10 = sdn.B;
                bby bbyVar5 = sdnVar.A;
                if (bbyVar5 != null) {
                    bbyVar5.cancel(null);
                }
                sdnVar.A = null;
                return Unit.f46060a;
            case 16:
                cb8 cb8Var = (cb8) obj3;
                wne wneVar17 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    if (this.k && cb8Var.h.l() >= 9 && cb8Var.a()) {
                        this.j = true;
                        if (ieb.T(cb8Var, this) == wneVar17) {
                            return wneVar17;
                        }
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                fpp fppVar = (fpp) obj3;
                wne wneVar18 = wne.f39444a;
                boolean z34 = this.j;
                if (!z34) {
                    z1x.P(obj);
                    int iOrdinal = fppVar.p.ordinal();
                    if (iOrdinal == 0) {
                        dgu dguVar = fppVar.t;
                        j700 j700Var = fppVar.z;
                        xun xunVar = xun.f41520a;
                        dguVar.getClass();
                        j700Var.getClass();
                        xunVar.getClass();
                        vsg0Var = new vsg0(new mcj(dguVar, j700Var, xunVar, null));
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        vsg0Var = aoq.c(i120.W(((jh7) ((es) fppVar.y.f32888a).b).f16514a), new zo1(yjeVar, (Object) fppVar, (byte) 18));
                    }
                    dnq dnqVar = new dnq(new fnq(new yop(new fnq(vsg0Var, new uop(fppVar, this.k, (yje) null)), (byte) 0), new vop(fppVar, yjeVar, objArr2 == true ? 1 : 0), b4), new rj(fppVar, yjeVar, b2), b6);
                    this.j = true;
                    if (slb.N(dnqVar, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z34) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                boolean z35 = this.k;
                wne wneVar19 = wne.f39444a;
                boolean z36 = this.j;
                if (!z36) {
                    z1x.P(obj);
                    yys yysVar = (yys) obj3;
                    if (z35) {
                        this.k = z35;
                        this.j = true;
                        p7m0 p7m0Var11 = yysVar.B;
                        do {
                            value7 = p7m0Var11.getValue();
                        } while (!p7m0Var11.m(value7, ixs.a((ixs) value7, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 520191)));
                        if (((ixs) p7m0Var11.getValue()).e.length() == 0 || yysVar.D) {
                            yysVar.D = false;
                            bby bbyVar6 = yysVar.F;
                            if (bbyVar6 == null || !bbyVar6.isActive()) {
                                yysVar.F = sac.V(jiu0.a(yysVar), new g7p(yysVar, b2), null, yysVar.p.c, new fhq(yysVar, yjeVar, (byte) 5), 10);
                            }
                            objC = Unit.f46060a;
                        } else {
                            objC = yysVar.C(this);
                            if (objC != wne.f39444a) {
                                objC = Unit.f46060a;
                            }
                        }
                        if (objC == wneVar19) {
                            return wneVar19;
                        }
                    } else {
                        yysVar.D = true;
                        yysVar.B();
                        yysVar.A();
                    }
                } else {
                    if (!z36) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z37 = this.j;
                if (z37) {
                    if (z37) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                rou rouVar2 = (rou) ((kki) obj3).f;
                boolean z38 = this.k;
                this.j = true;
                Object objA6 = rouVar2.a(z38, this);
                return objA6 == wneVar20 ? wneVar20 : objA6;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z39 = this.j;
                if (z39) {
                    if (z39) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                b3c0 b3c0Var = ((rou) obj3).f30857a;
                boolean z40 = this.k;
                this.j = true;
                Object objA7 = b3c0Var.a(z40, this);
                return objA7 == wneVar21 ? wneVar21 : objA7;
            case 21:
                boolean z41 = this.k;
                wne wneVar22 = wne.f39444a;
                boolean z42 = this.j;
                if (!z42) {
                    z1x.P(obj);
                    ibx ibxVar = (ibx) obj3;
                    if (!z41) {
                        ibxVar.x(cbx.f4081a);
                        return Unit.f46060a;
                    }
                    this.k = z41;
                    this.j = true;
                    if (ibxVar.w(this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z42) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                hcx hcxVar = (hcx) obj3;
                oyg0 oyg0Var = hcxVar.f;
                ocj ocjVar3 = hcxVar.i;
                wne wneVar23 = wne.f39444a;
                boolean z43 = this.j;
                if (!z43) {
                    z1x.P(obj);
                    boolean z44 = this.k;
                    int i11 = hcx.v;
                    hcxVar.t = z44 ? qjj.W(jiu0.a(hcxVar), null, null, new gcx(hcxVar, yjeVar, b6), 3) : null;
                    e1u e1uVar = hcxVar.o;
                    String str = hcxVar.p;
                    this.j = true;
                    yuu yuuVar = (yuu) e1uVar.b;
                    objD0 = qjj.d0(((mne) yuuVar.d).b, new oed(yuuVar, str, yjeVar, (byte) 7), this);
                    if (objD0 == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z43) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                List<jcx> list3 = (List) objD0;
                if (list3.isEmpty()) {
                    int i12 = hcx.v;
                    p7m0 p7m0Var12 = ocjVar3.f25029a;
                    do {
                        value9 = p7m0Var12.getValue();
                        value9.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var12.m(value9, acx.a((acx) value9, false, false, 8)));
                } else {
                    String strA = hcxVar.r.b.a(R.string.injury_default_title, Arrays.copyOf(new Object[0], 0));
                    ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                    for (jcx jcxVar : list3) {
                        if (jcxVar.b.length() == 0) {
                            jcxVar = new jcx(jcxVar.f16301a, strA);
                        }
                        arrayList.add(jcxVar);
                    }
                    p7m0 p7m0Var13 = ocjVar3.f25029a;
                    do {
                        value8 = p7m0Var13.getValue();
                        value8.getClass();
                    } while (!p7m0Var13.m(value8, new acx(arrayList, false, false, false)));
                }
                c4m0 c4m0Var = hcxVar.t;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                return Unit.f46060a;
            case 23:
                boolean z45 = this.k;
                wne wneVar24 = wne.f39444a;
                boolean z46 = this.j;
                if (!z46) {
                    z1x.P(obj);
                    t6y t6yVar = (t6y) obj3;
                    vs10 vs10Var = t6yVar.h.c;
                    s6y s6yVar = new s6y(t6yVar, z45, null);
                    this.k = z45;
                    this.j = true;
                    if (qjj.d0(vs10Var, s6yVar, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z46) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                u1z u1zVar = (u1z) obj3;
                ocj ocjVar4 = u1zVar.i;
                wne wneVar25 = wne.f39444a;
                boolean z47 = this.j;
                if (!z47) {
                    z1x.P(obj);
                    if (this.k) {
                        List list4 = u1z.C;
                        p7m0 p7m0Var14 = ocjVar4.f25029a;
                        do {
                            value10 = p7m0Var14.getValue();
                            value10.getClass();
                        } while (!p7m0Var14.m(value10, d1z.a((d1z) value10, true, false, 0, null, null, null, null, null, false, 510)));
                    }
                    bzu bzuVar = u1zVar.w;
                    String str2 = u1zVar.o;
                    n3q n3qVar = ((d1z) u1zVar.D()).f;
                    this.j = true;
                    objN = ((dgu) bzuVar.b).n(str2, n3qVar, this);
                    if (objN == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z47) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN = obj;
                }
                hxs0 hxs0Var = (hxs0) objN;
                List list5 = u1z.C;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list5) {
                    hxs0 hxs0VarC = u1zVar.x.c((n3q) obj6);
                    if (!hxs0VarC.f13827a.f32862a.isEmpty() || !hxs0VarC.b.f32862a.isEmpty()) {
                        arrayList2.add(obj6);
                    }
                }
                p7m0 p7m0Var15 = ocjVar4.f25029a;
                while (true) {
                    Object value13 = p7m0Var15.getValue();
                    value13.getClass();
                    ArrayList arrayList3 = arrayList2;
                    if (p7m0Var15.m(value13, d1z.a((d1z) value13, false, false, 0, null, null, null, arrayList3, hxs0Var, false, 316))) {
                        return Unit.f46060a;
                    }
                    arrayList2 = arrayList3;
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return l(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return m(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return o(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return r(obj);
            default:
                boolean z48 = this.k;
                vq10 vq10Var = (vq10) obj3;
                wne wneVar26 = wne.f39444a;
                boolean z49 = this.j;
                if (!z49) {
                    z1x.P(obj);
                    p7m0 p7m0Var16 = vq10Var.v;
                    do {
                        value11 = p7m0Var16.getValue();
                        obj2 = (kq10) value11;
                        if (!(obj2 instanceof jq10) || z48) {
                            obj2 = iq10.f15187a;
                        }
                    } while (!p7m0Var16.m(value11, obj2));
                    this.j = true;
                    if (vq10Var.w(z48, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z49) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u88(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u88(boolean z, Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = obj;
    }
}
