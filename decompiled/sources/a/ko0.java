package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ko0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(pv2 pv2Var, ic1 ic1Var, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 1;
        this.k = pv2Var;
        this.l = ic1Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ko0 ko0Var = new ko0(this.l, (yje) obj3, (byte) 0);
                ko0Var.j = zBooleanValue;
                ko0Var.k = (sw00) obj2;
                return ko0Var.invokeSuspend(Unit.f46060a);
            case 1:
                return new ko0((pv2) this.k, (ic1) this.l, (yje) obj3).invokeSuspend(Unit.f46060a);
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ko0 ko0Var2 = new ko0(this.l, (yje) obj3, (byte) 2);
                ko0Var2.k = (cit0) obj;
                ko0Var2.j = zBooleanValue2;
                return ko0Var2.invokeSuspend(Unit.f46060a);
            case 3:
                ko0 ko0Var3 = new ko0(3, (yje) obj3);
                ko0Var3.k = (jx40) obj;
                ko0Var3.l = (jx40) obj2;
                return ko0Var3.invokeSuspend(Unit.f46060a);
            case 4:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                ko0 ko0Var4 = new ko0(this.l, (yje) obj3, (byte) 4);
                ko0Var4.k = (ql5) obj;
                ko0Var4.j = zBooleanValue3;
                return ko0Var4.invokeSuspend(Unit.f46060a);
            case 5:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                ko0 ko0Var5 = new ko0(this.l, (yje) obj3, (byte) 5);
                ko0Var5.k = (ql5) obj;
                ko0Var5.j = zBooleanValue4;
                return ko0Var5.invokeSuspend(Unit.f46060a);
            case 6:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                ko0 ko0Var6 = new ko0(this.l, (yje) obj3, (byte) 6);
                ko0Var6.k = (ql5) obj;
                ko0Var6.j = zBooleanValue5;
                return ko0Var6.invokeSuspend(Unit.f46060a);
            case 7:
                ko0 ko0Var7 = new ko0(this.l, (yje) obj3, (byte) 7);
                ko0Var7.k = (Throwable) obj2;
                return ko0Var7.invokeSuspend(Unit.f46060a);
            case 8:
                ko0 ko0Var8 = new ko0(this.l, (yje) obj3, (byte) 8);
                ko0Var8.k = (Throwable) obj2;
                return ko0Var8.invokeSuspend(Unit.f46060a);
            case 9:
                Object obj4 = ((j0g0) obj).f15681a;
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                ko0 ko0Var9 = new ko0(this.l, (yje) obj3, (byte) 9);
                ko0Var9.k = obj4;
                ko0Var9.j = zBooleanValue6;
                return ko0Var9.invokeSuspend(Unit.f46060a);
            case 10:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                ko0 ko0Var10 = new ko0(this.l, (yje) obj3, (byte) 10);
                ko0Var10.j = zBooleanValue7;
                ko0Var10.k = (n4j) obj2;
                return ko0Var10.invokeSuspend(Unit.f46060a);
            case 11:
                boolean zBooleanValue8 = ((Boolean) obj2).booleanValue();
                ko0 ko0Var11 = new ko0(this.l, (yje) obj3, (byte) 11);
                ko0Var11.k = (y6j) obj;
                ko0Var11.j = zBooleanValue8;
                return ko0Var11.invokeSuspend(Unit.f46060a);
            case 12:
                ko0 ko0Var12 = new ko0(this.l, (yje) obj3, (byte) 12);
                ko0Var12.k = (Throwable) obj2;
                return ko0Var12.invokeSuspend(Unit.f46060a);
            case 13:
                ko0 ko0Var13 = new ko0(this.l, (yje) obj3, (byte) 13);
                ko0Var13.k = (Throwable) obj2;
                return ko0Var13.invokeSuspend(Unit.f46060a);
            case 14:
                ko0 ko0Var14 = new ko0(this.l, (yje) obj3, (byte) 14);
                ko0Var14.k = (Throwable) obj2;
                ko0Var14.invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 15:
                ko0 ko0Var15 = new ko0(this.l, (yje) obj3, (byte) 15);
                ko0Var15.k = (Throwable) obj2;
                return ko0Var15.invokeSuspend(Unit.f46060a);
            case 16:
                ko0 ko0Var16 = new ko0(this.l, (yje) obj3, (byte) 16);
                ko0Var16.k = (Throwable) obj2;
                return ko0Var16.invokeSuspend(Unit.f46060a);
            case 17:
                ko0 ko0Var17 = new ko0(this.l, (yje) obj3, (byte) 17);
                ko0Var17.k = (Throwable) obj2;
                return ko0Var17.invokeSuspend(Unit.f46060a);
            case 18:
                ko0 ko0Var18 = new ko0(this.l, (yje) obj3, (byte) 18);
                ko0Var18.k = (sw00) obj;
                return ko0Var18.invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ko0 ko0Var19 = new ko0(this.l, (yje) obj3, (byte) 19);
                ko0Var19.k = (kmq) obj;
                return ko0Var19.invokeSuspend(Unit.f46060a);
            case 20:
                ko0 ko0Var20 = new ko0(this.l, (yje) obj3, (byte) 20);
                ko0Var20.k = (kmq) obj;
                return ko0Var20.invokeSuspend(Unit.f46060a);
            case 21:
                ko0 ko0Var21 = new ko0(this.l, (yje) obj3, (byte) 21);
                ko0Var21.k = (Throwable) obj2;
                return ko0Var21.invokeSuspend(Unit.f46060a);
            case 22:
                ko0 ko0Var22 = new ko0(this.l, (yje) obj3, (byte) 22);
                ko0Var22.k = (kmq) obj;
                return ko0Var22.invokeSuspend(Unit.f46060a);
            case 23:
                ko0 ko0Var23 = new ko0(this.l, (yje) obj3, (byte) 23);
                ko0Var23.k = (kmq) obj;
                return ko0Var23.invokeSuspend(Unit.f46060a);
            case 24:
                ko0 ko0Var24 = new ko0(this.l, (yje) obj3, (byte) 24);
                ko0Var24.k = (kmq) obj;
                return ko0Var24.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ko0 ko0Var25 = new ko0(this.l, (yje) obj3, (byte) 25);
                ko0Var25.k = (Throwable) obj2;
                return ko0Var25.invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                boolean zBooleanValue9 = ((Boolean) obj2).booleanValue();
                ko0 ko0Var26 = new ko0(this.l, (yje) obj3, (byte) 26);
                ko0Var26.k = (StepInputUiModel) obj;
                ko0Var26.j = zBooleanValue9;
                return ko0Var26.invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ko0 ko0Var27 = new ko0(this.l, (yje) obj3, (byte) 27);
                ko0Var27.k = (Throwable) obj2;
                return ko0Var27.invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ko0 ko0Var28 = new ko0(this.l, (yje) obj3, (byte) 28);
                ko0Var28.k = (kmq) obj;
                return ko0Var28.invokeSuspend(Unit.f46060a);
            default:
                ko0 ko0Var29 = new ko0(this.l, (yje) obj3, (byte) 29);
                ko0Var29.k = (kmq) obj;
                return ko0Var29.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x023f  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        org.xplatform.make_bet.impl.presentation.model.StepInputUiModel stepInputUiModel;
        double d;
        double d2;
        boolean z;
        String str;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object objB;
        boolean z2;
        boolean z3;
        ctf0 ctf0Var;
        ank0 ank0Var;
        byte b = this.i;
        Object dm5Var = hm5.f13289a;
        String strC = "";
        switch (b) {
            case 0:
                boolean z4 = this.j;
                sw00 sw00Var = (sw00) this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                qo0 qo0Var = (qo0) this.l;
                int i = qo0.V;
                p7m0 p7m0Var = qo0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ln0.a((ln0) value, null, sw00Var.f32897a, null, null, null, null, null, null, 0L, false, 65533)));
                if (z4) {
                    qo0Var.T(false, false);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ov2 ov2Var = ((pv2) this.k).f27642a;
                    ic1 ic1Var = (ic1) this.l;
                    this.j = true;
                    if (ic1Var.invoke(ov2Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                cit0 cit0Var = (cit0) this.k;
                boolean z6 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z6) {
                    p7m0 p7m0Var2 = ((fy4) this.l).c0;
                    do {
                        value2 = p7m0Var2.getValue();
                        stepInputUiModel = (org.xplatform.make_bet.impl.presentation.model.StepInputUiModel) value2;
                        d = cit0Var.E;
                        d2 = cit0Var.F;
                        z = cit0Var.M;
                    } while (!p7m0Var2.m(value2, org.xplatform.make_bet.impl.presentation.model.StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, d, z ? 9.99999999999999E12d : d2, null, z, false, AutoMaxUiModel.a(stepInputUiModel.i, false, d2, 1), false, false, false, false, false, false, 97959)));
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                if (z7) {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jx40 jx40Var = (jx40) this.k;
                    z1x.P(obj);
                    return jx40Var;
                }
                z1x.P(obj);
                jx40 jx40Var2 = (jx40) this.k;
                jx40 jx40Var3 = (jx40) this.l;
                this.k = jx40Var3;
                this.j = true;
                ((c4m0) jx40Var2.b.d).cancel(null);
                return Unit.f46060a == wneVar4 ? wneVar4 : jx40Var3;
            case 4:
                ql5 ql5Var = (ql5) this.k;
                boolean z8 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                wsa wsaVar = (wsa) this.l;
                pru pruVar = wsaVar.r;
                int i2 = wsa.Q;
                p7m0 p7m0Var3 = wsaVar.i.f25029a;
                while (true) {
                    Object value10 = p7m0Var3.getValue();
                    value10.getClass();
                    p7m0 p7m0Var4 = p7m0Var3;
                    pru pruVar2 = pruVar;
                    Object obj2 = dm5Var;
                    if (p7m0Var4.m(value10, gsa.a((gsa) value10, null, null, false, null, 0, 0, null, z8, false, null, 3583))) {
                        rra rraVar = ((gsa) wsaVar.D()).f11820a;
                        if ((rraVar != null ? rraVar.i : wsaVar.t.j()) || !z8 || !pruVar2.a().L.f30534a) {
                            return obj2;
                        }
                        String str2 = ql5Var.f;
                        rra rraVar2 = ((gsa) wsaVar.D()).f11820a;
                        if (rraVar2 == null || (str = rraVar2.f) == null) {
                            str = pruVar2.a().g.i.f12896a;
                        }
                        return new dm5(ql5Var, str2, str);
                    }
                    p7m0Var3 = p7m0Var4;
                    pruVar = pruVar2;
                    dm5Var = obj2;
                }
                break;
            case 5:
                ql5 ql5Var2 = (ql5) this.k;
                boolean z9 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                w5b w5bVar = (w5b) this.l;
                pru pruVar3 = w5bVar.r;
                int i3 = w5b.H;
                p7m0 p7m0Var5 = w5bVar.i.f25029a;
                do {
                    value3 = p7m0Var5.getValue();
                    value3.getClass();
                } while (!p7m0Var5.m(value3, p5b.a((p5b) value3, null, null, null, null, z9, false, null, false, 239)));
                z4b z4bVar = ((p5b) w5bVar.D()).f26397a;
                if (!(z4bVar != null ? z4bVar.f43762a : w5bVar.s.j()) && z9 && pruVar3.a().L.f30534a) {
                    String str3 = ql5Var2.f;
                    z4b z4bVar2 = ((p5b) w5bVar.D()).f26397a;
                    dm5Var = new dm5(ql5Var2, str3, z4bVar2 != null ? z4bVar2.f : pruVar3.a().g.i.f12896a);
                }
                return dm5Var;
            case 6:
                ql5 ql5Var3 = (ql5) this.k;
                boolean z10 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                boc bocVar = (boc) this.l;
                pru pruVar4 = bocVar.q;
                int i4 = boc.D;
                p7m0 p7m0Var6 = bocVar.i.f25029a;
                do {
                    value4 = p7m0Var6.getValue();
                    value4.getClass();
                } while (!p7m0Var6.m(value4, onc.a((onc) value4, null, null, null, 0, null, z10, false, null, false, 479)));
                ymc ymcVar = ((onc) bocVar.D()).f25540a;
                if ((ymcVar != null ? ymcVar.f42880a : bocVar.r.j()) || !z10 || !pruVar4.a().L.f30534a) {
                    return jmc.f16757a;
                }
                String str4 = ql5Var3.f;
                ymc ymcVar2 = ((onc) bocVar.D()).f25540a;
                return new imc(ql5Var3, str4, ymcVar2 != null ? ymcVar2.c : pruVar4.a().g.i.f12896a);
            case 7:
                Throwable th = (Throwable) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    Function2 function2 = (Function2) this.l;
                    this.k = null;
                    this.j = true;
                    if (function2.invoke(th, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                Throwable th2 = (Throwable) this.k;
                wne wneVar9 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    xcc xccVar = ((wff) this.l).k;
                    this.k = null;
                    this.j = true;
                    if (xccVar.a(th2, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                Object obj3 = this.k;
                boolean z13 = this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                jfg jfgVar = (jfg) this.l;
                int i5 = jfg.B;
                p7m0 p7m0Var7 = jfgVar.i.f25029a;
                do {
                    value5 = p7m0Var7.getValue();
                    value5.getClass();
                } while (!p7m0Var7.m(value5, dfg.a((dfg) value5, new j0g0(obj3), false, z13, 187)));
                return Unit.f46060a;
            case 10:
                boolean z14 = this.j;
                n4j n4jVar = (n4j) this.k;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                e6j e6jVar = (e6j) this.l;
                oyg0 oyg0Var = e6jVar.f;
                ocj ocjVar = e6jVar.i;
                i6j i6jVar = ((w5j) e6jVar.D()).f;
                f6j f6jVar = f6j.f9013a;
                if (z14) {
                    if (n4jVar != null) {
                        if (n4jVar instanceof m4j) {
                            p7m0 p7m0Var8 = ocjVar.f25029a;
                            do {
                                value8 = p7m0Var8.getValue();
                                value8.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var8.m(value8, w5j.a((w5j) value8, new g6j(null, (m4j) n4jVar), null, 95)));
                            lc00 lc00VarJ0 = feb.j0((m4j) n4jVar, e6jVar.r);
                            ArrayList arrayList = new ArrayList(r3d.q(lc00VarJ0, 10));
                            ListIterator listIterator = lc00VarJ0.listIterator(0);
                            while (true) {
                                paw pawVar = (paw) listIterator;
                                if (pawVar.hasNext()) {
                                    hll hllVar = (hll) pawVar.next();
                                    arrayList.add(new d4j(hllVar.f13267a, hllVar.f));
                                } else {
                                    p7m0 p7m0Var9 = ocjVar.f25029a;
                                    do {
                                        value9 = p7m0Var9.getValue();
                                        value9.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var9.m(value9, w5j.a((w5j) value9, null, arrayList, 63)));
                                }
                            }
                        } else if ((n4jVar instanceof k4j) && !(((w5j) e6jVar.D()).f instanceof f6j)) {
                            p7m0 p7m0Var10 = ocjVar.f25029a;
                            do {
                                value7 = p7m0Var10.getValue();
                                value7.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var10.m(value7, w5j.a((w5j) value7, f6jVar, null, 95)));
                        }
                    }
                } else if (i6jVar instanceof h6j) {
                    p7m0 p7m0Var11 = ocjVar.f25029a;
                    do {
                        value6 = p7m0Var11.getValue();
                        value6.getClass();
                    } while (!p7m0Var11.m(value6, w5j.a((w5j) value6, f6jVar, null, 95)));
                }
                return Unit.f46060a;
            case 11:
                y6j y6jVar = (y6j) this.k;
                boolean z15 = this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                if (!z15) {
                    y6jVar = new y6j(0.0f, 0L, "");
                }
                o6j o6jVar = (o6j) this.l;
                sac.V(jiu0.a(o6jVar), new x2i((byte) 6), null, o6jVar.e.c, new b1f((Object) o6jVar, (Object) new l6j(y6jVar, z15), (yje) null, (byte) 14), 10);
                return Unit.f46060a;
            case 12:
                Throwable th3 = (Throwable) this.k;
                wne wneVar13 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    xcc xccVar2 = ((l0l) this.l).b;
                    this.k = null;
                    this.j = true;
                    if (xccVar2.a(th3, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                Throwable th4 = (Throwable) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    if (th4 == null) {
                        rwj rwjVar = tvk.f34603a;
                        vs10 vs10Var = ys10.f43147a;
                        wib wibVar = new wib((w6l) this.l, null, (byte) 26);
                        this.k = null;
                        this.j = true;
                        if (qjj.d0(vs10Var, wibVar, this) == wneVar14) {
                            return wneVar14;
                        }
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                Throwable th5 = (Throwable) this.k;
                wne wneVar15 = wne.f39444a;
                boolean z18 = this.j;
                if (z18) {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    throw th5;
                }
                z1x.P(obj);
                long jCurrentTimeMillis = System.currentTimeMillis() - ((lie0) this.l).f20100a;
                if (jCurrentTimeMillis >= 1000) {
                    throw th5;
                }
                this.k = th5;
                this.j = true;
                if (qcc.O(1000 - jCurrentTimeMillis, this) == wneVar15) {
                    return wneVar15;
                }
                throw th5;
            case 15:
                bep bepVar = (bep) this.l;
                Throwable th6 = (Throwable) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    int i6 = bep.I;
                    if (th6 != null && ((th6 instanceof SocketTimeoutException) || (th6 instanceof ConnectException) || (th6 instanceof UnknownHostException))) {
                        throw th6;
                    }
                    this.k = null;
                    this.j = true;
                    if (bepVar.O(true, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                Throwable th7 = (Throwable) this.k;
                wne wneVar17 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    th7.printStackTrace();
                    org.xplatform.favorites.impl.presentation.category.f fVar = (org.xplatform.favorites.impl.presentation.category.f) this.l;
                    p7m0 p7m0Var12 = fVar.x;
                    oep oepVar = new oep((jkm) fVar.w.getValue());
                    this.k = null;
                    this.j = true;
                    p7m0Var12.getClass();
                    p7m0Var12.o(null, oepVar);
                    if (Unit.f46060a == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                Throwable th8 = (Throwable) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    xcc xccVar3 = ((a9t) this.l).d;
                    this.k = null;
                    this.j = true;
                    if (xccVar3.a(th8, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                sw00 sw00Var2 = (sw00) this.k;
                wne wneVar19 = wne.f39444a;
                boolean z22 = this.j;
                if (z22) {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                    return (ql5) objB;
                }
                z1x.P(obj);
                if (sw00Var2.f32897a) {
                    ahu ahuVar = (ahu) ((phf0) this.l).c;
                    this.k = null;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar19) {
                        return wneVar19;
                    }
                    return (ql5) objB;
                }
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kmq kmqVar = (kmq) this.k;
                wne wneVar20 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    List listS = ((kvt) ((rrd) this.l).e).f18970a.s(y9s.c);
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(listS, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                kmq kmqVar2 = (kmq) this.k;
                wne wneVar21 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    List listS2 = ((kvt) ((xzp) this.l).d).f18970a.s(y9s.d);
                    this.k = null;
                    this.j = true;
                    if (kmqVar2.a(listS2, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                Throwable th9 = (Throwable) this.k;
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    ani0 ani0Var = (ani0) ((pwi) this.l).f;
                    bqk0 bqk0Var = new bqk0(th9);
                    this.k = null;
                    this.j = true;
                    if (ani0Var.a(bqk0Var, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                kmq kmqVar3 = (kmq) this.k;
                wne wneVar23 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    List listL = ((n660) ((ywq0) this.l).d).l(false);
                    if (listL == null || listL.isEmpty()) {
                        iun iunVar = iun.f15405a;
                        this.k = null;
                        this.j = true;
                        if (kmqVar3.a(iunVar, this) == wneVar23) {
                            return wneVar23;
                        }
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                kmq kmqVar4 = (kmq) this.k;
                wne wneVar24 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    List listL2 = ((n660) ((qgd) this.l).e).l(true);
                    if (listL2 == null || listL2.isEmpty()) {
                        iun iunVar2 = iun.f15405a;
                        this.k = null;
                        this.j = true;
                        if (kmqVar4.a(iunVar2, this) == wneVar24) {
                            return wneVar24;
                        }
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                kmq kmqVar5 = (kmq) this.k;
                wne wneVar25 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    gu1 gu1Var = (gu1) this.l;
                    this.k = null;
                    this.j = true;
                    if (kmqVar5.a(gu1Var, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th10 = (Throwable) this.k;
                wne wneVar26 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    xcc xccVar4 = ((uj10) this.l).e;
                    this.k = null;
                    this.j = true;
                    if (xccVar4.a(th10, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                StepInputUiModel stepInputUiModel2 = (StepInputUiModel) this.k;
                boolean z30 = this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                qg20 qg20Var = (qg20) this.l;
                ctf0 ctf0Var2 = qg20Var.g;
                boolean z31 = qg20Var.b;
                boolean z32 = qg20Var.i.a() == q4f.m;
                stepInputUiModel2.getClass();
                boolean z33 = stepInputUiModel2.r;
                double d3 = stepInputUiModel2.d;
                boolean z34 = stepInputUiModel2.g;
                double d4 = stepInputUiModel2.f46474a;
                ctf0Var2.getClass();
                boolean z35 = stepInputUiModel2.l;
                boolean z36 = stepInputUiModel2.k;
                if (d4 == -1.0d) {
                    z2 = true;
                    z3 = z36;
                } else {
                    z2 = true;
                    z3 = z36;
                    if (stepInputUiModel2.b != 0.0d) {
                        pn40 pn40Var = pn40.f27267a;
                        strC = pn40.c(d4, p3u0.g);
                    }
                }
                double d5 = stepInputUiModel2.d;
                double d6 = stepInputUiModel2.e;
                double dB = stepInputUiModel2.b();
                boolean z37 = z32;
                String str5 = stepInputUiModel2.f;
                if ((d5 > d4 || d4 > dB) && d4 != -1.0d && (d4 <= dB || !z30)) {
                    z30 = z30;
                    ctf0Var = ctf0Var2;
                    strC = strC;
                    if (d4 < d5) {
                        ank0Var = h8x.u(ctf0Var, d5, str5);
                    } else {
                        ank0Var = (d4 <= dB || z30) ? new ank0(iun.f15405a) : h8x.s(ctf0Var, d6, str5);
                    }
                } else if (z31) {
                    ank0Var = h8x.r(stepInputUiModel2.g, d5, str5, d6);
                    z30 = z30;
                    ctf0Var = ctf0Var2;
                    strC = strC;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    bnk0 bnk0Var = new bnk0();
                    if (z34) {
                        pn40 pn40Var2 = pn40.f27267a;
                        pzw.E(bnk0Var, ctf0Var2.f(R.string.unlimited_max_bet_value_v2, pn40.d(d5, str5, p3u0.c)), 0, 0, 0, R.attr.uikitSecondary, 30);
                        ctf0Var = ctf0Var2;
                    } else {
                        ctf0Var = ctf0Var2;
                        pn40 pn40Var3 = pn40.f27267a;
                        p3u0 p3u0Var = p3u0.c;
                        pzw.E(bnk0Var, ctf0Var.f(R.string.min_max_bet_input, pn40.d(d5, str5, p3u0Var), pn40.d(d6, str5, p3u0Var)), 0, 0, 0, R.attr.uikitSecondary, 30);
                    }
                    ank0Var = w6x.l(arrayList2, bnk0Var.f2888a, arrayList2);
                }
                boolean z38 = stepInputUiModel2.n;
                boolean z39 = (d4 >= stepInputUiModel2.b() || !z3) ? false : z2;
                boolean z40 = (d4 <= d3 || !z3) ? false : z2;
                if (!z37 && z3) {
                    if (d4 == -1.0d) {
                        z35 = false;
                    } else {
                        double dB2 = stepInputUiModel2.b();
                        if ((d3 > d4 || d4 > dB2) && (!z30 || d4 <= stepInputUiModel2.b())) {
                            z35 = false;
                        } else {
                            z35 = z2;
                        }
                    }
                }
                boolean z41 = stepInputUiModel2.k;
                boolean z42 = stepInputUiModel2.m;
                org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel autoMaxUiModel = stepInputUiModel2.i;
                ank0 ank0Var2 = ank0Var;
                org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel autoMaxUiModel2 = new org.xplatform.coupon.impl.make_bet.presentation.model.AutoMaxUiModel(autoMaxUiModel.b / (z33 ? 2.0d : 1.0d), (!autoMaxUiModel.f46472a || z34) ? false : z2);
                double dB3 = stepInputUiModel2.b();
                return new czj0(strC, z42, ank0Var2, z38, z39, z40, z35, z41, z30, autoMaxUiModel2, !(((d3 > d4 || d4 > dB3) && d4 != -1.0d && (d4 <= dB3 || !z30)) ? false : z2), stepInputUiModel2.q, z33 ? ctf0Var.b.a(R.string.factor_2x, Arrays.copyOf(new Object[0], 0)) : null);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                uw50 uw50Var = (uw50) this.l;
                Throwable th11 = (Throwable) this.k;
                wne wneVar28 = wne.f39444a;
                boolean z43 = this.j;
                if (!z43) {
                    z1x.P(obj);
                    uw50Var.b.b(th11, new rj50((byte) 9));
                    p7m0 p7m0Var13 = uw50Var.c;
                    sw50 sw50Var = new sw50(sa10.b((sa10) uw50Var.h, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                    this.k = null;
                    this.j = true;
                    p7m0Var13.getClass();
                    p7m0Var13.o(null, sw50Var);
                    if (Unit.f46060a == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z43) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                kmq kmqVar6 = (kmq) this.k;
                wne wneVar29 = wne.f39444a;
                boolean z44 = this.j;
                if (!z44) {
                    z1x.P(obj);
                    List listL3 = ((rpt) ((nc0) this.l).i).l(false);
                    if (listL3 == null || listL3.isEmpty()) {
                        iun iunVar3 = iun.f15405a;
                        this.k = null;
                        this.j = true;
                        if (kmqVar6.a(iunVar3, this) == wneVar29) {
                            return wneVar29;
                        }
                    }
                } else {
                    if (!z44) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar7 = (kmq) this.k;
                wne wneVar30 = wne.f39444a;
                boolean z45 = this.j;
                if (!z45) {
                    z1x.P(obj);
                    List listL4 = ((rpt) ((qv2) this.l).h).l(true);
                    if (listL4 == null || listL4.isEmpty()) {
                        iun iunVar4 = iun.f15405a;
                        this.k = null;
                        this.j = true;
                        if (kmqVar7.a(iunVar4, this) == wneVar30) {
                            return wneVar30;
                        }
                    }
                } else {
                    if (!z45) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko0(int i, yje yjeVar) {
        super(i, yjeVar);
        this.i = (byte) 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko0(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
