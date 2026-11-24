package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class mq10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq10(vq10 vq10Var, List list, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.k = vq10Var;
        this.l = list;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new mq10((vq10) this.k, (List) obj2, this.j, yjeVar);
            case 1:
                return new mq10(this.k, obj2, yjeVar, (byte) 1);
            case 2:
                mq10 mq10Var = new mq10((diu0) obj2, yjeVar, (byte) 2);
                mq10Var.k = obj;
                return mq10Var;
            case 3:
                return new mq10(this.k, obj2, yjeVar, (byte) 3);
            case 4:
                return new mq10((diu0) obj2, yjeVar, (byte) 4);
            case 5:
                return new mq10(this.k, obj2, yjeVar, (byte) 5);
            case 6:
                return new mq10((diu0) obj2, yjeVar, (byte) 6);
            case 7:
                return new mq10(this.k, obj2, yjeVar, (byte) 7);
            case 8:
                mq10 mq10Var2 = new mq10((diu0) obj2, yjeVar, (byte) 8);
                mq10Var2.k = obj;
                return mq10Var2;
            case 9:
                mq10 mq10Var3 = new mq10((diu0) obj2, yjeVar, (byte) 9);
                mq10Var3.k = obj;
                return mq10Var3;
            case 10:
                return new mq10((diu0) obj2, yjeVar, (byte) 10);
            case 11:
                return new mq10((diu0) obj2, yjeVar, (byte) 11);
            case 12:
                return new mq10(this.k, obj2, yjeVar, (byte) 12);
            case 13:
                mq10 mq10Var4 = new mq10((diu0) obj2, yjeVar, (byte) 13);
                mq10Var4.k = obj;
                return mq10Var4;
            case 14:
                mq10 mq10Var5 = new mq10((o030) obj2, this.j, yjeVar);
                mq10Var5.k = obj;
                return mq10Var5;
            case 15:
                return new mq10(this.k, obj2, yjeVar, (byte) 15);
            case 16:
                return new mq10(this.k, obj2, yjeVar, (byte) 16);
            case 17:
                return new mq10(this.k, obj2, yjeVar, (byte) 17);
            case 18:
                return new mq10(this.k, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                mq10 mq10Var6 = new mq10((diu0) obj2, yjeVar, (byte) 19);
                mq10Var6.k = obj;
                return mq10Var6;
            case 20:
                return new mq10(this.k, obj2, yjeVar, (byte) 20);
            case 21:
                return new mq10(this.k, obj2, yjeVar, (byte) 21);
            case 22:
                return new mq10(this.k, obj2, yjeVar, (byte) 22);
            case 23:
                return new mq10(this.k, obj2, yjeVar, (byte) 23);
            case 24:
                return new mq10((diu0) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new mq10(this.k, obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new mq10(this.k, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new mq10((diu0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new mq10(this.k, obj2, yjeVar, (byte) 28);
            default:
                return new mq10(this.k, obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((mq10) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((mq10) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((mq10) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((mq10) create((l9s) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        jq10 jq10Var;
        Object g0g0Var;
        Object objK;
        Object objZ;
        Object value2;
        StepInputUiModel stepInputUiModel;
        p7m0 p7m0Var;
        Object objA;
        Object objK2;
        qg20 qg20Var;
        Object objA2;
        nn20 nn20Var;
        Object objA3;
        Object objP;
        on20 on20Var;
        Object objW0;
        String str;
        Object objW1;
        String str2;
        Object value3;
        Object value4;
        Object objX;
        ns30 ns30Var;
        Object objH;
        Object objC;
        String str3;
        Object value5;
        Object objE;
        Object objF;
        byte b = this.i;
        byte b2 = 2;
        byte b3 = 6;
        Object obj2 = this.l;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = ((vq10) this.k).v;
                List<Object> list = (List) obj2;
                boolean z = this.j;
                do {
                    value = p7m0Var2.getValue();
                    kq10 kq10Var = (kq10) value;
                    if (kq10Var instanceof jq10) {
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (Object objC2 : list) {
                            List list2 = ((jq10) kq10Var).f16928a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list2) {
                                if (obj3 instanceof cr10) {
                                    arrayList2.add(obj3);
                                }
                            }
                            int iA = wp20.a(r3d.q(arrayList2, 10));
                            if (iA < 16) {
                                iA = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                            for (Object obj4 : arrayList2) {
                                linkedHashMap.put(((cr10) obj4).f4821a, obj4);
                            }
                            if (objC2 instanceof cr10) {
                                cr10 cr10Var = (cr10) objC2;
                                Object obj5 = linkedHashMap.get(cr10Var.f4821a);
                                if (obj5 == null) {
                                    obj5 = cr10Var;
                                }
                                objC2 = cr10.c(cr10Var, ((cr10) obj5).d, 55);
                            }
                            arrayList.add(objC2);
                        }
                        jq10Var = new jq10(arrayList, ((jq10) kq10Var).b, z);
                    } else {
                        jq10Var = new jq10(list, false, z);
                    }
                } while (!p7m0Var2.m(value, jq10Var));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new a7s((xcz) obj2, (byte) 5)));
                    jz6 jz6Var = new jz6((ebo0) this.k, b3);
                    this.j = true;
                    if (gmqVarW.c(jz6Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                w220 w220Var = (w220) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                yje yjeVar2 = null;
                try {
                    if (!z3) {
                        z1x.P(obj);
                        e0g0 e0g0Var = j0g0.b;
                        qoj0 qoj0VarA = w220Var.m.a();
                        this.k = null;
                        this.j = true;
                        objK = ntb.K(qoj0VarA, this);
                        if (objK == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        if (!z3) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objK = obj;
                    }
                    g0g0Var = new Long(((Number) objK).longValue());
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (j0g0.a(g0g0Var) != null) {
                    g0g0Var = new Long(0L);
                }
                long jLongValue = ((Number) g0g0Var).longValue();
                gu90 gu90Var = w220Var.A0;
                sje sjeVar = gu90Var.g;
                if (sjeVar == null || !d5c.R(sjeVar)) {
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(jLongValue, bfn.SECONDS);
                    sje sjeVarA = d5c.a(kotlin.coroutines.e.c(qem0.e(), gu90Var.e.b));
                    gu90Var.g = sjeVarA;
                    sac.V(sjeVarA, new yi90(1, gu90Var, gu90.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, null, new fu90(gu90Var, jW0, yjeVar2, (byte) 1), 14);
                }
                return Unit.f46060a;
            case 3:
                h620 h620Var = (h620) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    long j = ((ql5) this.k).e;
                    a6u a6uVar = h620Var.h;
                    this.j = true;
                    objZ = a6uVar.z(j, this);
                    if (objZ == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objZ = obj;
                }
                vf7 vf7Var = (vf7) objZ;
                p7m0 p7m0Var3 = h620Var.i0;
                do {
                    value2 = p7m0Var3.getValue();
                    stepInputUiModel = (StepInputUiModel) value2;
                } while (!p7m0Var3.m(value2, stepInputUiModel.p ? StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, false, 229375) : StepInputUiModel.a(stepInputUiModel, -1.0d, 0.0d, 0.0d, 0.0d, 0.0d, vf7Var.f, false, false, null, false, false, false, false, false, false, false, 225246)));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    y920 y920Var = (y920) obj2;
                    p7m0Var = y920Var.n;
                    mrt mrtVar = y920Var.i;
                    this.k = p7m0Var;
                    this.j = true;
                    objA = mrtVar.a(this);
                    if (objA == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7m0 p7m0Var4 = (p7m0) this.k;
                    z1x.P(obj);
                    p7m0Var = p7m0Var4;
                    objA = obj;
                }
                p7m0Var.n(objA);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (z6) {
                    if (z6) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                w5z w5zVar = (w5z) this.k;
                abu abuVar = (abu) w5zVar.b;
                String strA = ((btt0) w5zVar.c).a();
                List<pxg0> listC = kotlin.collections.a.c((pxg0) obj2);
                this.j = true;
                Object objC3 = abuVar.m().c(strA, listC, this);
                return objC3 == wneVar6 ? wneVar6 : objC3;
            case 6:
                qg20 qg20Var2 = (qg20) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    this.k = qg20Var2;
                    this.j = true;
                    objK2 = ntb.K(qg20Var2.x.b(), this);
                    if (objK2 == wneVar7) {
                        return wneVar7;
                    }
                    qg20Var = qg20Var2;
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qg20 qg20Var3 = (qg20) this.k;
                    z1x.P(obj);
                    qg20Var = qg20Var3;
                    objK2 = obj;
                }
                qg20Var.Q(((Boolean) objK2).booleanValue());
                ol60 ol60Var = qg20Var2.c1;
                Unit unit = Unit.f46060a;
                ol60Var.f(unit);
                return unit;
            case 7:
                mn20 mn20Var = (mn20) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    e8u e8uVar = mn20Var.j;
                    ru6 ru6VarD0 = xia0.d0((m97) obj2, phu0.Y(mn20Var.h).f12022a);
                    this.j = true;
                    objA2 = e8uVar.a(ru6VarD0, this);
                    if (objA2 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                boolean zBooleanValue = ((Boolean) objA2).booleanValue();
                p7m0 p7m0Var5 = mn20Var.R;
                Object obj6 = zBooleanValue ? hi20.f13094a : ii20.f14809a;
                p7m0Var5.getClass();
                p7m0Var5.o(null, obj6);
                return Unit.f46060a;
            case 8:
                ln20 ln20Var = (ln20) obj2;
                ql5 ql5Var = (ql5) this.k;
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    int i = ln20.o0;
                    ln20Var.G(bb20.f2288a);
                    ln20Var.H(new fd20(b3));
                    this.k = null;
                    this.j = true;
                    if (ln20Var.S(ql5Var, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                nn20 nn20Var2 = (nn20) obj2;
                ql5 ql5Var2 = (ql5) this.k;
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    int i2 = nn20.c1;
                    nn20Var2.z0();
                    nn20Var2.G(cb20.f4042a);
                    nn20Var2.H(new fd20(b2));
                    this.k = null;
                    this.j = true;
                    if (nn20Var2.H0(ql5Var2, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = nn20.c1;
                sac.V(jiu0.a(nn20Var2), null, null, nn20Var2.T.b, new xj1((diu0) nn20Var2, yjeVar, (byte) 13), 11);
                nn20Var2.J0();
                nn20Var2.b1 = !nn20Var2.P.c();
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    nn20Var = (nn20) obj2;
                    f3c f3cVar = nn20Var.v;
                    this.k = nn20Var;
                    this.j = true;
                    objA3 = f3cVar.a(this);
                    if (objA3 == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nn20 nn20Var3 = (nn20) this.k;
                    z1x.P(obj);
                    nn20Var = nn20Var3;
                    objA3 = obj;
                }
                List listC2 = kotlin.collections.a.c(y860.g0((m97) objA3));
                q4f q4fVar = q4f.c;
                nc20 nc20Var = new nc20(new ngc0(listC2, q4fVar, q4fVar.a()));
                int i4 = nn20.c1;
                nn20Var.G(nc20Var);
                return Unit.f46060a;
            case 11:
                on20 on20Var2 = (on20) obj2;
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    znt zntVar = on20Var2.n0;
                    this.k = on20Var2;
                    this.j = true;
                    objP = zntVar.f44690a.p(this);
                    if (objP == wneVar12) {
                        return wneVar12;
                    }
                    on20Var = on20Var2;
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    on20 on20Var3 = (on20) this.k;
                    z1x.P(obj);
                    on20Var = on20Var3;
                    objP = obj;
                }
                on20Var.G(new oc20(new ngc0((List) objP, ((a820) on20Var2.D()).j, ((a820) on20Var2.D()).j.a())));
                return Unit.f46060a;
            case 12:
                nn20 nn20Var4 = (nn20) this.k;
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    sd60 sd60Var = nn20Var4.Q;
                    this.j = true;
                    if (sd60Var.h(this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                m97 m97Var = (m97) CollectionsKt.U(nn20Var4.w.g().e);
                nn20Var4.q0.a(m97Var);
                ((Function1) obj2).invoke(m97Var);
                return Unit.f46060a;
            case 13:
                List list3 = (List) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    this.k = null;
                    this.j = true;
                    if (((dy20) obj2).C(list3, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                vne vneVar = (vne) this.k;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                o030 o030Var = (o030) obj2;
                o030Var.T = qjj.W(vneVar, null, null, new a220((Object) o030Var, this.j, yjeVar, (byte) 3), 3);
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    nv20 nv20Var = ((p430) this.k).b;
                    long j2 = ((ut20) obj2).f36237a;
                    this.j = true;
                    objW0 = sj3.w0(this, ((qco) ((n0o0) nv20Var.f24171a).getValue()).f28493a, new hu6(j2, yjeVar, b3), true, false);
                    if (objW0 == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objW0 = obj;
                }
                rco rcoVar = (rco) objW0;
                return (rcoVar == null || (str = rcoVar.b) == null) ? "" : str;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    he1 he1Var = ((q430) this.k).b;
                    long j3 = ((ut20) obj2).f36237a;
                    this.j = true;
                    objW1 = sj3.w0(this, ((qco) he1Var.f12898a.getValue()).f28493a, new hu6(j3, yjeVar, b3), true, false);
                    if (objW1 == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objW1 = obj;
                }
                rco rcoVar2 = (rco) objW1;
                return (rcoVar2 == null || (str2 = rcoVar2.b) == null) ? "" : str2;
            case 17:
                String str4 = (String) obj2;
                e730 e730Var = (e730) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                e730Var.q.n(str4);
                e730Var.l.h(wgh0.MARKET_SET, str4, null);
                e730Var.m.D(null, "market_set", str4);
                return Unit.f46060a;
            case 18:
                String str5 = (String) obj2;
                f730 f730Var = (f730) this.k;
                wne wneVar19 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                f730Var.o.n(str5);
                f730Var.k.h(wgh0.MARKET_SET, str5, null);
                f730Var.l.D(null, "market_set", str5);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                l830 l830Var = (l830) obj2;
                l9s l9sVar = (l9s) this.k;
                wne wneVar20 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    int i5 = l830.A;
                    p7m0 p7m0Var6 = l830Var.i.f25029a;
                    while (true) {
                        Object value6 = p7m0Var6.getValue();
                        value6.getClass();
                        l9s l9sVar2 = l9sVar;
                        if (p7m0Var6.m(value6, m730.a((m730) value6, null, null, l9sVar, 0L, null, null, 251))) {
                            o030 o030Var2 = l830Var.r;
                            t030 t030Var = new t030(l9sVar2);
                            this.k = null;
                            this.j = true;
                            if (o030Var2.a(t030Var, this) == wneVar20) {
                                return wneVar20;
                            }
                        } else {
                            l9sVar = l9sVar2;
                        }
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    this.j = true;
                    if (((zj30) this.k).f44467a.c((Uri) obj2, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                String str6 = (String) obj2;
                zk30 zk30Var = (zk30) this.k;
                wne wneVar22 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    ymx ymxVar = ymx.INTERVAL_100;
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var7 = zk30Var.n;
                do {
                    value3 = p7m0Var7.getValue();
                } while (!p7m0Var7.m(value3, nk30.a((nk30) value3, null, null, str6, null, null, false, false, false, 251)));
                zk30Var.b.e("KEY_SEARCH_QUERY", str6);
                if (str6.length() > 0) {
                    dq00 dq00Var = zk30Var.k;
                    wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                    ((yo4) dq00Var.b).n("medal_table", str6);
                    ((zr1) dq00Var.c).r("medal_table", str6);
                }
                return Unit.f46060a;
            case 22:
                xk80 xk80Var = (xk80) this.k;
                wne wneVar23 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    int iK = xk80Var.k();
                    int i6 = ((vwh0) obj2).b;
                    if (iK != i6) {
                        this.j = true;
                        if (xk80Var.v(i6, 0.0f, this) == wneVar23) {
                            return wneVar23;
                        }
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    this.j = true;
                    if (((ns30) this.k).j.m((i16) obj2, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                ns30 ns30Var2 = (ns30) obj2;
                wne wneVar25 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    p7m0 p7m0Var8 = ns30Var2.q;
                    do {
                        value4 = p7m0Var8.getValue();
                    } while (!p7m0Var8.m(value4, ks30.a((ks30) value4, true, false, 2)));
                    j910 j910Var = ns30Var2.b;
                    this.k = ns30Var2;
                    this.j = true;
                    objX = ((nvu) ((b8u) j910Var.b).f2175a).x(((ort) j910Var.c).b(), this);
                    if (objX == wneVar25) {
                        return wneVar25;
                    }
                    ns30Var = ns30Var2;
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ns30 ns30Var3 = (ns30) this.k;
                    z1x.P(obj);
                    ns30Var = ns30Var3;
                    objX = obj;
                }
                ns30Var.l = (ys30) objX;
                ns30Var2.n.f(hs30.f13561a);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    p7m0 p7m0Var9 = ((ns30) this.k).o;
                    this.j = true;
                    p7m0Var9.getClass();
                    p7m0Var9.o(null, (fs30) obj2);
                    if (Unit.f46060a == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                j340 j340Var = (j340) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    xex xexVar = j340Var.q0;
                    this.j = true;
                    objH = xexVar.H(this);
                    if (objH == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH = obj;
                }
                if (((Boolean) objH).booleanValue()) {
                    j340Var.G(new y040(j340Var.J.b.a(R.string.access_denied_with_bonus_currency_message, Arrays.copyOf(new Object[0], 0))));
                } else {
                    ((q240) obj2).invoke();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                j340 j340Var2 = (j340) obj2;
                wne wneVar28 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    String strK = j340Var2.S.k();
                    r2u r2uVar = j340Var2.R;
                    this.k = strK;
                    this.j = true;
                    objC = r2uVar.c(this);
                    if (objC == wneVar28) {
                        return wneVar28;
                    }
                    str3 = strK;
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str7 = (String) this.k;
                    z1x.P(obj);
                    str3 = str7;
                    objC = obj;
                }
                List list4 = (List) objC;
                List listI = j340Var2.N.i();
                p7m0 p7m0Var10 = j340Var2.i.f25029a;
                do {
                    value5 = p7m0Var10.getValue();
                    value5.getClass();
                } while (!p7m0Var10.m(value5, d140.a((d140) value5, false, false, false, null, null, null, null, null, null, false, false, null, false, null, null, null, list4, listI, str3, 956301311)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                j340 j340Var3 = (j340) this.k;
                wne wneVar29 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    ouu ouuVar = j340Var3.O0;
                    this.j = true;
                    objE = ouuVar.E(this);
                    if (objE == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                if (((Boolean) objE).booleanValue()) {
                    int i7 = j340.i1;
                    j340Var3.G(v040.f36566a);
                } else {
                    i1w0 i1w0Var = j340Var3.q;
                    k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI.h(j340Var3.W.q((lr1) obj2));
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            default:
                pzu pzuVar = (pzu) this.k;
                wne wneVar30 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    gsj gsjVar = (gsj) pzuVar.b;
                    String strA2 = ((btt0) pzuVar.e).a();
                    d540 d540Var = new d540(CollectionsKt.b0((List) obj2, Separators.COMMA, null, null, null, 62));
                    this.j = true;
                    objF = gsjVar.a().f(strA2, d540Var, "application/vnd.xenvelop+json", this);
                    if (objF == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                Boolean bool = ((y340) ((dx5) objF).a()).f41934a;
                if (bool != null) {
                    return bool;
                }
                jf4.k(null);
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq10(o030 o030Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 14;
        this.l = o030Var;
        this.j = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mq10(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mq10(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}
