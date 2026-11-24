package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.feature.office.payment.impl.di.navigation.PaymentScreenFactoryImpl$getPaymentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class d7a0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7a0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return new d7a0((g7a0) obj2, yjeVar, (byte) 0);
            case 1:
                return new d7a0((r4b0) obj2, yjeVar, (byte) 1);
            case 2:
                return new d7a0((j5b0) obj2, yjeVar, (byte) 2);
            case 3:
                return new d7a0((l7b0) obj2, yjeVar, (byte) 3);
            case 4:
                return new d7a0((g9b0) obj2, yjeVar, (byte) 4);
            case 5:
                return new d7a0((jhc0) obj2, yjeVar, (byte) 5);
            case 6:
                return new d7a0((hjc0) obj2, yjeVar, (byte) 6);
            case 7:
                return new d7a0((dtc0) obj2, yjeVar, (byte) 7);
            case 8:
                return new d7a0((gxc0) obj2, yjeVar, (byte) 8);
            case 9:
                return new d7a0((ayc0) obj2, yjeVar, (byte) 9);
            case 10:
                return new d7a0((qyc0) obj2, yjeVar, (byte) 10);
            case 11:
                return new d7a0((mie0) obj2, yjeVar, (byte) 11);
            case 12:
                return new d7a0((fgd0) obj2, yjeVar, (byte) 12);
            case 13:
                return new d7a0((shd0) obj2, yjeVar, (byte) 13);
            case 14:
                return new d7a0((jid0) obj2, yjeVar, (byte) 14);
            case 15:
                return new d7a0((fkd0) obj2, yjeVar, (byte) 15);
            case 16:
                return new d7a0((nld0) obj2, yjeVar, (byte) 16);
            case 17:
                return new d7a0((tod0) obj2, yjeVar, (byte) 17);
            case 18:
                return new d7a0((hxd0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new d7a0((t4e0) obj2, yjeVar, (byte) 19);
            case 20:
                return new d7a0((mce0) obj2, yjeVar, (byte) 20);
            case 21:
                return new d7a0((zoe0) obj2, yjeVar, (byte) 21);
            case 22:
                return new d7a0((tpe0) obj2, yjeVar, (byte) 22);
            case 23:
                return new d7a0((eze0) obj2, yjeVar, (byte) 23);
            case 24:
                return new d7a0((x5f0) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new d7a0((ocf0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new d7a0((ye50) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new d7a0((rnf0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new d7a0((sxf0) obj2, yjeVar, (byte) 28);
            default:
                return new d7a0((pbg0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((d7a0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((d7a0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((d7a0) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((d7a0) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((d7a0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((d7a0) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((d7a0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((d7a0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        byte b2 = 14;
        byte b3 = 18;
        int i = 2;
        byte b4 = 16;
        byte b5 = 4;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        byte b6 = 1;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((uga0) ((g7a0) obj2).u.b).f35616a.b.clear();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                r4b0 r4b0Var = (r4b0) obj2;
                r4b0Var.w(r4b0Var.y ? i4b0.f14140a : i4b0.b);
                r4b0Var.y = false;
                bby bbyVar = r4b0Var.w;
                if (bbyVar == null || !bbyVar.isActive()) {
                    r4b0Var.w = sac.V(jiu0.a(r4b0Var), new kma0(b2), null, r4b0Var.n.b, new q4b0(r4b0Var, objArr == true ? 1 : 0, b6), 10);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                j5b0 j5b0Var = (j5b0) obj2;
                j5b0Var.x(j5b0Var.q ? y4b0.f41994a : y4b0.b);
                j5b0Var.q = false;
                bby bbyVar2 = j5b0Var.o;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    j5b0Var.o = sac.V(jiu0.a(j5b0Var), new kma0(b4), null, j5b0Var.k.b, new i5b0(j5b0Var, objArr2 == true ? 1 : 0, b6), 10);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                l7b0 l7b0Var = (l7b0) obj2;
                l7b0Var.w(l7b0Var.w ? d7b0.f5587a : d7b0.b);
                l7b0Var.w = false;
                bby bbyVar3 = l7b0Var.u;
                if (bbyVar3 == null || !bbyVar3.isActive()) {
                    l7b0Var.u = sac.V(jiu0.a(l7b0Var), new kma0((byte) 22), null, l7b0Var.n.b, new k7b0(l7b0Var, objArr3 == true ? 1 : 0, b6), 10);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                g9b0 g9b0Var = (g9b0) obj2;
                p7m0 p7m0Var = g9b0Var.F;
                s8b0 s8b0Var = !g9b0Var.J ? s8b0.f31793a : s8b0.b;
                g9b0Var.J = true;
                g9b0Var.A(s8b0Var);
                c4m0 c4m0Var = g9b0Var.K;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    g9b0Var.K = sac.T(new fnq(dtb.z(g9b0Var.e.b(), 1), new c670(g9b0Var, objArr5 == true ? 1 : 0, b3), (byte) 4), d5c.S(jiu0.a(g9b0Var), g9b0Var.h.b), new o690((w46) g9b0Var, (yje) (objArr4 == true ? 1 : 0), b2));
                }
                if (((x8b0) p7m0Var.getValue()) instanceof t8b0) {
                    Object value5 = p7m0Var.getValue();
                    value5.getClass();
                    g9b0Var.G(((t8b0) value5).b || Intrinsics.d(g9b0Var.S.getValue(), m8b0.f21362a));
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = ((jhc0) obj2).n;
                p7m0Var2.getClass();
                p7m0Var2.o(null, ahc0.f868a);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                hjc0 hjc0Var = (hjc0) obj2;
                if (!hjc0Var.g.f34357a.b.b) {
                    hjc0Var.z();
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                int i2 = dtc0.D;
                ((dtc0) obj2).M();
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                gxc0 gxc0Var = (gxc0) obj2;
                gxc0Var.G(new swc0(gxc0Var.v.f15748a.b()));
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ayc0 ayc0Var = (ayc0) obj2;
                ayc0Var.G(new lxc0(ayc0Var.u.f15748a.b()));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                qyc0 qyc0Var = (qyc0) obj2;
                p7m0 p7m0Var3 = qyc0Var.A;
                p7m0Var3.getClass();
                p7m0Var3.o(null, dfe.f5996a);
                if (qyc0Var.e.a() && qyc0Var.u == zuc0.CARDS_WITH_GAMES) {
                    z = true;
                }
                Object afeVar = z ? new afe(Boolean.TRUE) : yee.f42482a;
                p7m0Var3.getClass();
                p7m0Var3.o(null, afeVar);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((mie0) obj2).f21842a = null;
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                fgd0 fgd0Var = (fgd0) obj2;
                c4m0 c4m0Var2 = fgd0Var.v;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    fgd0Var.v = sac.T(new fnq(fgd0Var.n.b(), new fj3((diu0) fgd0Var, (yje) (objArr7 == true ? 1 : 0), b4), (byte) 4), d5c.S(jiu0.a(fgd0Var), fgd0Var.k.f22085a), new st20(i, objArr6 == true ? 1 : 0, b4));
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                shd0 shd0Var = (shd0) obj2;
                mne mneVar = shd0Var.j;
                c4m0 c4m0Var3 = shd0Var.x;
                if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                    shd0Var.x = sac.T(new fnq(shd0Var.m.b(), new fj3((diu0) shd0Var, (yje) (objArr9 == true ? 1 : 0), (byte) 17), (byte) 4), d5c.S(jiu0.a(shd0Var), mneVar.f22085a), new st20(i, objArr8 == true ? 1 : 0, b3));
                }
                v3c.N(shd0Var.y);
                shd0Var.y = sac.V(jiu0.a(shd0Var), new prc0(1, shd0Var, shd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, mneVar.f22085a, new qhd0(shd0Var, objArr10 == true ? 1 : 0, b6), 10);
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                jid0 jid0Var = (jid0) obj2;
                v3c.N(jid0Var.m);
                jid0Var.m = sac.T(new fnq(jid0Var.j.b(), new coc0(jid0Var, objArr12 == true ? 1 : 0, b5), (byte) 4), d5c.S(jiu0.a(jid0Var), jid0Var.e.f22085a), new st20(i, objArr11 == true ? 1 : 0, (byte) 19));
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                fkd0 fkd0Var = (fkd0) obj2;
                c4m0 c4m0Var4 = fkd0Var.m;
                if (c4m0Var4 == null || !c4m0Var4.isActive()) {
                    fkd0Var.m = sac.T(new fnq(fkd0Var.h.b(), new a220(fkd0Var, objArr14 == true ? 1 : 0, b4), (byte) 4), d5c.S(jiu0.a(fkd0Var), fkd0Var.f.f22085a), new st20(i, objArr13 == true ? 1 : 0, (byte) 21));
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                nld0 nld0Var = (nld0) obj2;
                wdk0 wdk0Var = nld0Var.M1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = nld0Var.H(R.string.data_load_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), nld0Var, null, null, false, null, 1020);
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                ((tod0) obj2).n.f(iod0.f15112a);
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ((hxd0) obj2).w();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                t4e0 t4e0Var = (t4e0) obj2;
                j6i0 j6i0Var = ((r7e0) ((y4u) t4e0Var.t.b).f42022a.c).b;
                j6i0 j6i0VarR = j6i0Var != null ? sek.r(j6i0Var) : null;
                p7m0 p7m0Var4 = t4e0Var.i.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                } while (!p7m0Var4.m(value, n4e0.a((n4e0) value, j6i0VarR, false, false, 8)));
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                Context contextD = ((mce0) obj2).D();
                if (contextD != null) {
                    j120.g0(contextD, i120.U());
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                zoe0 zoe0Var = (zoe0) obj2;
                i8i.D("action", "fill", zoe0Var.j.f42966a, "promo_referal_deposit_error");
                pzu pzuVar = zoe0Var.e;
                PaymentScreenFactoryImpl$getPaymentScreen$1 paymentScreenFactoryImpl$getPaymentScreen$1 = new PaymentScreenFactoryImpl$getPaymentScreen$1((r990) pzuVar.d, true, zoe0Var.d.f25751a.f11847a.a().f18785a);
                i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                if (paymentScreenFactoryImpl$getPaymentScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentScreenFactoryImpl$getPaymentScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(paymentScreenFactoryImpl$getPaymentScreen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        b1j.v("fill", zoe0Var.n.f40143a, 3327L);
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                ((tpe0) obj2).w();
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                int i3 = eze0.y0;
                p7m0 p7m0Var5 = ((eze0) obj2).i.f25029a;
                do {
                    value2 = p7m0Var5.getValue();
                    value2.getClass();
                } while (!p7m0Var5.m(value2, aye0.a((aye0) value2, true, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483646)));
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                int i4 = x5f0.z0;
                p7m0 p7m0Var6 = ((x5f0) obj2).i.f25029a;
                do {
                    value3 = p7m0Var6.getValue();
                    value3.getClass();
                } while (!p7m0Var6.m(value3, u4f0.a((u4f0) value3, true, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741822)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                int i5 = ocf0.z0;
                p7m0 p7m0Var7 = ((ocf0) obj2).i.f25029a;
                do {
                    value4 = p7m0Var7.getValue();
                    value4.getClass();
                } while (!p7m0Var7.m(value4, mbf0.a((mbf0) value4, true, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741822)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                ye50 ye50Var = (ye50) obj2;
                ye50Var.d();
                if (!ye50Var.d) {
                    ye50Var.d = true;
                    ye50Var.e.b();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                Function0 function0 = ((rnf0) obj2).h;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                sxf0 sxf0Var = (sxf0) obj2;
                String str = (String) sxf0Var.b.a("email_key");
                if (str == null) {
                    str = sxf0Var.d;
                }
                if (str.length() > 0) {
                    sxf0Var.t.f(new lxf0(str));
                }
                sxf0Var.f.l(sxf0.w.matcher(str).matches() || sxf0Var.u.length() > 0);
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                pbg0 pbg0Var = (pbg0) obj2;
                pbg0Var.h.f(new lbg0(pbg0Var.e.f15748a.b()));
                return Unit.f46060a;
        }
    }
}
