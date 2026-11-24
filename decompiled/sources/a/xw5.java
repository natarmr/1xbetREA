package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes5.dex */
public final class xw5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw5(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    private final Object l(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            gmq gmqVarW = i120.W(ydx.V(null, new md0((d9z) this.k, (byte) 4)));
            qt6 qt6Var = new qt6((uw8) this.l, (byte) 27);
            this.j = true;
            if (gmqVarW.c(qt6Var, this) == wneVar) {
                return wneVar;
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

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                xw5 xw5Var = new xw5((yw5) obj2, yjeVar, (byte) 0);
                xw5Var.k = obj;
                return xw5Var;
            case 1:
                return new xw5((jgb) this.k, (mk50) obj2, yjeVar, (byte) 1);
            case 2:
                xw5 xw5Var2 = new xw5((jgb) this.k, (hie0) obj2, yjeVar, (byte) 2);
                xw5Var2.j = ((Boolean) obj).booleanValue();
                return xw5Var2;
            case 3:
                return new xw5((jgb) this.k, (zz2) obj2, yjeVar, (byte) 3);
            case 4:
                return new xw5((Throwable) this.k, (p36) obj2, yjeVar, (byte) 4);
            case 5:
                return new xw5((Throwable) this.k, (p36) obj2, yjeVar, (byte) 5);
            case 6:
                return new xw5((iqq) this.k, (bxq0) obj2, yjeVar, (byte) 6);
            case 7:
                return new xw5((me6) obj2, yjeVar, (byte) 7);
            case 8:
                return new xw5((me6) this.k, (String) obj2, yjeVar, (byte) 8);
            case 9:
                return new xw5((i3t0) this.k, (pz40) obj2, yjeVar, (byte) 9);
            case 10:
                xw5 xw5Var3 = new xw5((dk6) obj2, yjeVar, (byte) 10);
                xw5Var3.k = obj;
                return xw5Var3;
            case 11:
                return new xw5((po6) this.k, (jg7) obj2, yjeVar, (byte) 11);
            case 12:
                return new xw5((vp6) this.k, (jg7) obj2, yjeVar, (byte) 12);
            case 13:
                return new xw5((dt6) this.k, (ql5) obj2, yjeVar, (byte) 13);
            case 14:
                return new xw5((f97) this.k, (am80) obj2, yjeVar, (byte) 14);
            case 15:
                return new xw5((f97) this.k, (o37) obj2, yjeVar, (byte) 15);
            case 16:
                return new xw5((f97) this.k, (String) obj2, yjeVar, (byte) 16);
            case 17:
                xw5 xw5Var4 = new xw5((kd7) obj2, yjeVar, (byte) 17);
                xw5Var4.k = obj;
                return xw5Var4;
            case 18:
                return new xw5((kd7) this.k, (HistoryMenuItem) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new xw5((kd7) this.k, (z0w) obj2, yjeVar, (byte) 19);
            case 20:
                xw5 xw5Var5 = new xw5((fm7) obj2, yjeVar, (byte) 20);
                xw5Var5.k = obj;
                return xw5Var5;
            case 21:
                return new xw5((fm7) this.k, (mj7) obj2, yjeVar, (byte) 21);
            case 22:
                return new xw5((String) this.k, (d48) obj2, yjeVar, (byte) 22);
            case 23:
                return new xw5((kwj) this.k, (Function1) obj2, yjeVar, (byte) 23);
            case 24:
                return new xw5((ld8) this.k, (rb8) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new xw5((yj8) this.k, (xj8) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new xw5((l7m0) this.k, (rv2) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new xw5((pw8) this.k, (AggregatorSortingOptionModel) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new xw5((d9z) this.k, (uw8) obj2, yjeVar, (byte) 28);
            default:
                return new xw5((ty8) this.k, (String) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xw5) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((xw5) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((xw5) create((xvm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((xw5) create((kx30) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((xw5) create((am80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xw5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        p7m0 p7m0Var;
        boolean zBooleanValue;
        Object objZ;
        boolean z;
        c4m0 c4m0Var;
        Object value;
        Object objV;
        Object value2;
        Object value3;
        Object objB;
        Object value4;
        Object objA;
        Object value5;
        Object value6;
        ul80 ul80Var;
        Object value7;
        Object value8;
        Object objP;
        Object value9;
        Object objF;
        byte b = 11;
        byte b2 = 2;
        byte b3 = 4;
        boolean z2 = false;
        z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    hzb0 hzb0Var = (hzb0) this.k;
                    yw5 yw5Var = (yw5) this.l;
                    ww5 ww5Var = new ww5(yw5Var, hzb0Var);
                    b4e b4eVar = yw5Var.f43354a;
                    b4eVar.getClass();
                    synchronized (b4eVar.d) {
                        try {
                            if (((LinkedHashSet) b4eVar.f).add(ww5Var)) {
                                if (((LinkedHashSet) b4eVar.f).size() == 1) {
                                    b4eVar.e = b4eVar.d();
                                    wv00.f().a(c4e.f3720a, b4eVar.getClass().getSimpleName() + ": initial state = " + b4eVar.e);
                                    b4eVar.g();
                                }
                                Object v4eVar = yw5Var.e(b4eVar.e) ? new v4e(yw5Var.d()) : u4e.f35042a;
                                hzb0Var.getClass();
                                hzb0Var.f(v4eVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    gj4 gj4Var = new gj4((yw5) this.l, ww5Var, b);
                    this.j = true;
                    if (q7x.t(hzb0Var, gj4Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    jgb jgbVar = (jgb) this.k;
                    kki kkiVar = jgbVar.d;
                    otc otcVarT = jeb.T((mk50) this.l, jgbVar.i);
                    this.j = true;
                    if (kkiVar.s(otcVarT, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                hie0 hie0Var = (hie0) this.l;
                boolean z5 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                jgb jgbVar2 = (jgb) this.k;
                if (z5) {
                    sac.V(jiu0.a(jgbVar2), new vra(1, jgbVar2, jgb.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, null, new igb((Object) jgbVar2, (yje) (objArr == true ? 1 : 0), z2 ? (byte) 1 : (byte) 0), 14);
                } else if (hie0Var.f13108a) {
                    r26 r26Var = new r26(g2v.d(jgbVar2.e, pb10.g, null, null, R.string.data_retrieval_error, 0, null, 478));
                    p7m0 p7m0Var2 = jgbVar2.j;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, r26Var);
                }
                hie0Var.f13108a = false;
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    qoj0 qoj0Var = ((jgb) this.k).l;
                    zz2 zz2Var = (zz2) this.l;
                    List list = (List) zz2Var.b;
                    String strA = ((jgb) zz2Var.c).g.b.a(R.string.search_result, Arrays.copyOf(new Object[]{Integer.valueOf(list.isEmpty() ? 0 : zz2Var.f45232a + 1), Integer.valueOf(list.size())}, 2));
                    lk50 lk50Var = (lk50) CollectionsKt.W(zz2Var.f45232a, list);
                    List list2 = (List) zz2Var.b;
                    int i = zz2Var.f45232a;
                    q26 q26Var = new q26(strA, lk50Var, list2, i > 0, i < list2.size() - 1);
                    this.j = true;
                    if (qoj0Var.a(q26Var, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                p36 p36Var = (p36) this.l;
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    boolean z8 = ((Throwable) this.k) instanceof oqt0;
                    qoj0 qoj0Var2 = p36Var.k;
                    if (z8) {
                        qoj0Var2.g(d56.f5489a);
                        this.j = true;
                        if (qcc.O(30000L, this) == wneVar5) {
                            return wneVar5;
                        }
                    } else {
                        qoj0Var2.g(c56.f3755a);
                    }
                    return Unit.f46060a;
                }
                if (!z7) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                p36Var.f();
                return Unit.f46060a;
            case 5:
                p36 p36Var2 = (p36) this.l;
                wne wneVar6 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    boolean z10 = ((Throwable) this.k) instanceof oqt0;
                    qoj0 qoj0Var3 = p36Var2.k;
                    if (z10) {
                        qoj0Var3.g(d56.f5489a);
                        this.j = true;
                        if (qcc.O(30000L, this) == wneVar6) {
                            return wneVar6;
                        }
                    } else {
                        qoj0Var3.g(c56.f3755a);
                    }
                    return Unit.f46060a;
                }
                if (!z9) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                p36Var2.g();
                return Unit.f46060a;
            case 6:
                iqq iqqVar = (iqq) this.k;
                bxq0 bxq0Var = (bxq0) this.l;
                wne wneVar7 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    if (iqqVar.b()) {
                        c050 c050Var = c050.c;
                        this.j = true;
                        if (bxq0Var.c(c050Var, this) == wneVar7) {
                            return wneVar7;
                        }
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (bxq0Var.b() && !iqqVar.b()) {
                    bxq0Var.a();
                }
                return Unit.f46060a;
            case 7:
                me6 me6Var = (me6) this.l;
                wne wneVar8 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    p7m0Var = me6Var.w;
                    if (me6Var.c.f15225a.a()) {
                        dgu dguVar = me6Var.i;
                        List listE = me6Var.p.e();
                        boolean z13 = ((zd6) me6Var.z.getValue()).c;
                        this.k = p7m0Var;
                        this.j = true;
                        int iOrdinal = ((j9c) dguVar.b).a().ordinal();
                        if (iOrdinal != 6) {
                            if (iOrdinal == 11 && (listE == null || !((ArrayList) listE).isEmpty())) {
                                Iterator it = ((ArrayList) listE).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        q88 q88Var = (q88) it.next();
                                        g0f g0fVarA = ((ni9) dguVar.d).a(q88Var.f28287a);
                                        double d = g0fVarA.c;
                                        double d2 = g0fVarA.e / (g0fVarA.t ? 2.0d : 1.0d);
                                        Double dI = kotlin.text.b.i(q88Var.g);
                                        double dDoubleValue = dI != null ? dI.doubleValue() : 0.0d;
                                        if (g0fVarA.i || z13) {
                                            if (dDoubleValue < d) {
                                                z = false;
                                            }
                                        } else if (d > dDoubleValue || dDoubleValue > d2) {
                                            z = false;
                                        }
                                    } else {
                                        z = true;
                                    }
                                }
                            } else {
                                z = true;
                            }
                            objZ = Boolean.valueOf(z);
                        } else {
                            objZ = dguVar.z(listE, this);
                        }
                        if (objZ == wneVar8) {
                            return wneVar8;
                        }
                    } else {
                        zBooleanValue = true;
                    }
                    c4m0Var = me6Var.E;
                    if (c4m0Var != null && c4m0Var.isActive()) {
                        z2 = true;
                    }
                    de6 de6Var = new de6(zBooleanValue, z2);
                    p7m0Var.getClass();
                    p7m0Var.o(null, de6Var);
                    return Unit.f46060a;
                }
                if (!z12) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7m0 p7m0Var3 = (p7m0) this.k;
                z1x.P(obj);
                p7m0Var = p7m0Var3;
                objZ = obj;
                zBooleanValue = ((Boolean) objZ).booleanValue();
                c4m0Var = me6Var.E;
                if (c4m0Var != null) {
                    z2 = true;
                }
                de6 de6Var2 = new de6(zBooleanValue, z2);
                p7m0Var.getClass();
                p7m0Var.o(null, de6Var2);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    me6 me6Var2 = (me6) this.k;
                    ipc ipcVar = me6Var2.d;
                    int i2 = me6Var2.b;
                    Double dI2 = kotlin.text.b.i((String) this.l);
                    double dDoubleValue2 = dI2 != null ? dI2.doubleValue() : 0.0d;
                    this.j = true;
                    if (ipcVar.a(dDoubleValue2, i2, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    gmq gmqVarC = ((i3t0) this.k).C();
                    yy0 yy0Var = new yy0((pz40) this.l, b2);
                    this.j = true;
                    if (((i89) gmqVarC).c(yy0Var, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                dk6 dk6Var = (dk6) this.l;
                xvm0 xvm0Var = (xvm0) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    cj6 cj6Var = cj6.f4444a;
                    int i3 = dk6.K;
                    dk6Var.G(cj6Var);
                    p7m0 p7m0Var4 = dk6Var.i.f25029a;
                    do {
                        value = p7m0Var4.getValue();
                        value.getClass();
                    } while (!p7m0Var4.m(value, hj6.a((hj6) value, false, null, null, null, Long.valueOf(xvm0Var.getId()), null, false, null, 8175)));
                    xpr xprVar = dk6Var.v;
                    hv20 hv20Var = new hv20(xvm0Var);
                    this.k = xvm0Var;
                    this.j = true;
                    if (xprVar.i(hv20Var, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                long id = xvm0Var.getId();
                int i4 = dk6.K;
                c4m0 c4m0Var2 = dk6Var.H;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                dk6Var.H = sac.T(new fnq(dk6Var.B.a(id), new qj6(dk6Var, objArr2 == true ? 1 : 0, b3), b3), jiu0.a(dk6Var), zj6.h);
                dk6Var.M(((hj6) dk6Var.D()).f13145a, xvm0Var.getId());
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    dsi0 dsi0Var = ((po6) this.k).m;
                    jg7 jg7Var = (jg7) this.l;
                    this.j = true;
                    if (dsi0Var.a(jg7Var, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    dsi0 dsi0Var2 = ((vp6) this.k).z;
                    jg7 jg7Var2 = (jg7) this.l;
                    this.j = true;
                    if (dsi0Var2.a(jg7Var2, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                dt6 dt6Var = (dt6) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    ql5 ql5Var = (ql5) this.l;
                    this.j = true;
                    int i5 = dt6.e0;
                    if (dt6Var.R(ql5Var, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i6 = dt6.e0;
                dt6Var.c0();
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z20 = this.j;
                if (z20) {
                    if (z20) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                z7u z7uVar = ((f97) this.k).M;
                List list3 = ((ul80) ((am80) this.l)).f35860a;
                this.j = true;
                Serializable serializableA = z7uVar.a(list3, this);
                return serializableA == wneVar15 ? wneVar15 : serializableA;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    f97 f97Var = (f97) this.k;
                    String str = ((b37) ((o37) this.l)).f1888a;
                    this.j = true;
                    int i7 = f97.R0;
                    if (f97Var.i0(str, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                String str2 = (String) this.l;
                f97 f97Var2 = (f97) this.k;
                wne wneVar17 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    jtj jtjVar = f97Var2.S;
                    this.j = true;
                    objV = ((nvu) jtjVar.b).v(((k7u) jtjVar.c).f17841a.b().getId(), this, str2);
                    if (objV == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV = obj;
                }
                g67 g67Var = new g67(str2, (byte[]) objV);
                int i8 = f97.R0;
                f97Var2.G(g67Var);
                return Unit.f46060a;
            case 17:
                kd7 kd7Var = (kd7) this.l;
                ocj ocjVar = kd7Var.i;
                kx30 kx30Var = (kx30) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    if (kx30Var != null) {
                        if (kx30Var instanceof zw30) {
                            yb7 yb7Var = new yb7(((zw30) kx30Var).f45088a);
                            List list4 = kd7.m0;
                            kd7Var.G(yb7Var);
                        } else if (kx30Var instanceof ex30) {
                            cc7 cc7Var = new cc7(((ex30) kx30Var).f8558a);
                            List list5 = kd7.m0;
                            kd7Var.G(cc7Var);
                        } else if (kx30Var instanceof ix30) {
                            ix30 ix30Var = (ix30) kx30Var;
                            hc7 hc7Var = new hc7(ix30Var.f15522a, ix30Var.b);
                            List list6 = kd7.m0;
                            kd7Var.G(hc7Var);
                        } else if (kx30Var instanceof ax30) {
                            List list7 = kd7.m0;
                            kd7Var.S();
                        } else if (kx30Var instanceof bx30) {
                            ac7 ac7Var = new ac7(((bx30) kx30Var).f3358a);
                            List list8 = kd7.m0;
                            kd7Var.G(ac7Var);
                        } else if (kx30Var instanceof gx30) {
                            zb7 zb7Var = zb7.f44100a;
                            List list9 = kd7.m0;
                            kd7Var.G(zb7Var);
                        } else if (kx30Var instanceof fx30) {
                            fc7 fc7Var = fc7.f9296a;
                            List list10 = kd7.m0;
                            kd7Var.G(fc7Var);
                        } else if (kx30Var instanceof yw30) {
                            xb7 xb7Var = xb7.f40587a;
                            List list11 = kd7.m0;
                            kd7Var.G(xb7Var);
                        } else if (kx30Var instanceof jx30) {
                            kc7 kc7Var = new kc7(((jx30) kx30Var).b);
                            List list12 = kd7.m0;
                            kd7Var.G(kc7Var);
                        } else if (kx30Var instanceof hx30) {
                            List list13 = kd7.m0;
                            p7m0 p7m0Var5 = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var5.getValue();
                                value2.getClass();
                            } while (!p7m0Var5.m(value2, rc7.a((rc7) value2, null, false, null, null, null, null, null, null, null, true, false, false, 0L, 0L, 267911167)));
                        } else if (kx30Var instanceof cx30) {
                            List list14 = kd7.m0;
                            kd7Var.T();
                        } else if (kx30Var instanceof dx30) {
                            List list15 = kd7.m0;
                            kd7Var.U();
                        }
                        p7m0 p7m0Var6 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var6.getValue();
                            value3.getClass();
                        } while (!p7m0Var6.m(value3, rc7.a((rc7) value3, null, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 267911167)));
                        xw30 xw30Var = kd7Var.d0;
                        ev30 ev30Var = ev30.f8450a;
                        this.k = null;
                        this.j = true;
                        xw30Var.getClass();
                        if (xw30Var.a(ev30Var, this) == wneVar18) {
                            return wneVar18;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (!z23) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    xw30 xw30Var2 = ((kd7) this.k).d0;
                    jv30 jv30Var = new jv30((HistoryMenuItem) this.l);
                    this.j = true;
                    xw30Var2.getClass();
                    if (xw30Var2.a(jv30Var, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kd7 kd7Var2 = (kd7) this.k;
                z0w z0wVar = (z0w) this.l;
                long j = z0wVar.h;
                wne wneVar20 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    h3c h3cVar = kd7Var2.R;
                    long j2 = z0wVar.t;
                    this.j = true;
                    objB = h3cVar.b(j2, this);
                    if (objB == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                boolean zBooleanValue2 = ((Boolean) objB).booleanValue();
                ((bn6) kd7Var2.x.b).e(z0wVar.t, z0wVar.I, z0wVar.f43588a, false, z0wVar.l, "bet_history", null, null);
                String strValueOf = String.valueOf(j);
                long j3 = z0wVar.t;
                long j4 = z0wVar.f43588a;
                if (j3 == 40) {
                    sac.V(jiu0.a(kd7Var2), null, null, kd7Var2.r.b, new j21((Object) kd7Var2, strValueOf, j3, j4, (yje) null, (byte) 1), 11);
                }
                Long l = new Long(j);
                long j5 = 0;
                Long l2 = l.longValue() > 0 ? l : null;
                long jLongValue = l2 != null ? l2.longValue() : z0wVar.i;
                if (z0wVar.k == w0w.f38369a && !z0wVar.E) {
                    j5 = z0wVar.i;
                }
                kd7Var2.g0.d(new hd7(kd7Var2, jLongValue, j5, z0wVar, zBooleanValue2, (byte) 0));
                return Unit.f46060a;
            case 20:
                fm7 fm7Var = (fm7) this.l;
                ocj ocjVar2 = fm7Var.i;
                am80 am80Var = (am80) this.k;
                wne wneVar21 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    if (am80Var != null) {
                        if (am80Var instanceof rl80) {
                            int i9 = fm7.p0;
                            p7m0 p7m0Var7 = ocjVar2.f25029a;
                            do {
                                value5 = p7m0Var7.getValue();
                                value5.getClass();
                            } while (!p7m0Var7.m(value5, jk7.a((jk7) value5, false, ((rl80) am80Var).f30684a.isEmpty(), 0L, false, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554348)));
                        } else if (am80Var instanceof ul80) {
                            z7u z7uVar2 = fm7Var.b0;
                            List list16 = ((ul80) am80Var).f35860a;
                            this.k = am80Var;
                            this.j = true;
                            objA = z7uVar2.a(list16, this);
                            if (objA == wneVar21) {
                                return wneVar21;
                            }
                        } else if (am80Var instanceof xl80) {
                            int i10 = fm7.p0;
                            p7m0 p7m0Var8 = ocjVar2.f25029a;
                            do {
                                value4 = p7m0Var8.getValue();
                                value4.getClass();
                            } while (!p7m0Var8.m(value4, jk7.a((jk7) value4, false, false, 0L, false, null, !((xl80) am80Var).b, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554239)));
                        }
                        return Unit.f46060a;
                    }
                    t9f.b();
                    return null;
                }
                if (!z26) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA = obj;
                List list17 = (List) objA;
                List list18 = ((ul80) am80Var).f35860a;
                int i11 = fm7.p0;
                HashMap mapS = fm7Var.S(list18);
                p7m0 p7m0Var9 = ocjVar2.f25029a;
                do {
                    value6 = p7m0Var9.getValue();
                    value6.getClass();
                    ul80Var = (ul80) am80Var;
                } while (!p7m0Var9.m(value6, jk7.a((jk7) value6, false, false, 0L, false, null, false, ul80Var.b, ul80Var.f35860a, null, false, null, false, false, list17, null, ul80Var.c, null, false, mapS, false, 28704044)));
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    fm7 fm7Var2 = (fm7) this.k;
                    String str3 = ((ij7) ((mj7) this.l)).f14859a;
                    this.j = true;
                    int i12 = fm7.p0;
                    if (fm7Var2.X(str3, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                d48 d48Var = (d48) this.l;
                String str4 = (String) this.k;
                wne wneVar23 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                boolean z29 = StringsKt.u0(str4).toString().length() >= 4;
                p7m0 p7m0Var10 = d48Var.B;
                do {
                    value7 = p7m0Var10.getValue();
                } while (!p7m0Var10.m(value7, v38.a((v38) value7, null, str4, false, z29, null, 245)));
                d48Var.b.e("SAVED_PHONE_NUMBER", str4);
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new w48((kwj) this.k, z2 ? (byte) 1 : (byte) 0));
                    bt btVar = new bt((Function1) this.l, (byte) 6);
                    this.j = true;
                    if (vsg0VarV.c(btVar, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                rb8 rb8Var = (rb8) this.l;
                ld8 ld8Var = (ld8) this.k;
                ocj ocjVar3 = ld8Var.i;
                wne wneVar25 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    int i13 = ld8.D;
                    p7m0 p7m0Var11 = ocjVar3.f25029a;
                    do {
                        value8 = p7m0Var11.getValue();
                        value8.getClass();
                    } while (!p7m0Var11.m(value8, hd8.a((hd8) value8, null, true, false, false, null, 25)));
                    yuu yuuVar = ld8Var.p;
                    int i14 = rb8Var.f30171a;
                    this.j = true;
                    objP = yuuVar.p(i14, this);
                    if (objP == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objP = obj;
                }
                if (((Boolean) objP).booleanValue()) {
                    ctf0 ctf0Var = ld8Var.w;
                    int i15 = rb8Var.f30171a;
                    ah8[] ah8VarArr = ah8.f860a;
                    String strA2 = ctf0Var.b.a(i15 == 0 ? R.string.refuse_bonus_was_activated : R.string.bonus_was_activated, Arrays.copyOf(new Object[0], 0));
                    hd8.a((hd8) ld8Var.D(), new ic8(iun.f15405a, "", ""), false, false, false, null, 30);
                    ld8Var.M(false, false);
                    ld8Var.G(new fd8(strA2));
                } else {
                    int i16 = ld8.D;
                    mdm mdmVarN = ld8Var.N();
                    p7m0 p7m0Var12 = ocjVar3.f25029a;
                    do {
                        value9 = p7m0Var12.getValue();
                        value9.getClass();
                    } while (!p7m0Var12.m(value9, hd8.a((hd8) value9, null, false, false, true, mdmVarN, 1)));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    p7m0 p7m0Var13 = ((yj8) this.k).i;
                    xj8 xj8Var = (xj8) this.l;
                    this.j = true;
                    p7m0Var13.getClass();
                    p7m0Var13.o(null, xj8Var);
                    if (Unit.f46060a == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(ydx.V(null, new kk7((l7m0) this.k, (byte) 24)));
                    dp8 dp8Var = new dp8((rv2) this.l, z2 ? (byte) 1 : (byte) 0);
                    this.j = true;
                    if (gmqVarW.c(dp8Var, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z33) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z34 = this.j;
                if (!z34) {
                    z1x.P(obj);
                    hut hutVar = ((pw8) this.k).t;
                    AggregatorSortingOptionModel aggregatorSortingOptionModel = (AggregatorSortingOptionModel) this.l;
                    this.j = true;
                    gw8 gw8Var = (gw8) hutVar.f13698a.f6397a;
                    if (aggregatorSortingOptionModel == null) {
                        objF = gw8Var.b(this);
                        if (objF != wneVar28) {
                            objF = Unit.f46060a;
                        }
                        if (objF != wneVar28) {
                            objF = Unit.f46060a;
                        }
                    } else {
                        objF = gw8Var.f(aggregatorSortingOptionModel, this);
                        if (objF != wneVar28) {
                            objF = Unit.f46060a;
                        }
                        if (objF != wneVar28) {
                            objF = Unit.f46060a;
                        }
                    }
                    if (objF == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z34) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return l(obj);
            default:
                wne wneVar29 = wne.f39444a;
                boolean z35 = this.j;
                if (!z35) {
                    z1x.P(obj);
                    qoj0 qoj0Var4 = ((ty8) this.k).W;
                    String str5 = (String) this.l;
                    this.j = true;
                    if (qoj0Var4.a(str5, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z35) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw5(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
