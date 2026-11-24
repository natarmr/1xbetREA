package a;

import android.gov.nist.core.Separators;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweek.CyberCalendarDaysOfWeekParams;

/* JADX INFO: loaded from: classes5.dex */
public final class igb extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igb(boolean z, yog yogVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        this.j = z;
        this.k = yogVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new igb(obj2, yjeVar, (byte) 0);
            case 1:
                igb igbVar = new igb(obj2, yjeVar, (byte) 1);
                igbVar.j = ((Boolean) obj).booleanValue();
                return igbVar;
            case 2:
                return new igb(obj2, yjeVar, (byte) 2);
            case 3:
                return new igb(obj2, yjeVar, (byte) 3);
            case 4:
                igb igbVar2 = new igb(obj2, yjeVar, (byte) 4);
                igbVar2.j = ((Boolean) obj).booleanValue();
                return igbVar2;
            case 5:
                return new igb(obj2, yjeVar, (byte) 5);
            case 6:
                return new igb(obj2, yjeVar, (byte) 6);
            case 7:
                return new igb(obj2, yjeVar, (byte) 7);
            case 8:
                igb igbVar3 = new igb(obj2, yjeVar, (byte) 8);
                igbVar3.j = ((Boolean) obj).booleanValue();
                return igbVar3;
            case 9:
                return new igb(obj2, yjeVar, (byte) 9);
            case 10:
                return new igb(obj2, yjeVar, (byte) 10);
            case 11:
                igb igbVar4 = new igb(obj2, yjeVar, (byte) 11);
                igbVar4.j = ((Boolean) obj).booleanValue();
                return igbVar4;
            case 12:
                return new igb(obj2, yjeVar, (byte) 12);
            case 13:
                return new igb(obj2, yjeVar, (byte) 13);
            case 14:
                igb igbVar5 = new igb(obj2, yjeVar, (byte) 14);
                igbVar5.j = ((eg5) obj).f7745a;
                return igbVar5;
            case 15:
                return new igb(obj2, yjeVar, (byte) 15);
            case 16:
                return new igb(obj2, yjeVar, (byte) 16);
            case 17:
                return new igb(obj2, yjeVar, (byte) 17);
            case 18:
                return new igb(obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new igb(obj2, yjeVar, (byte) 19);
            case 20:
                return new igb(obj2, yjeVar, (byte) 20);
            case 21:
                return new igb(obj2, yjeVar, (byte) 21);
            case 22:
                return new igb(obj2, yjeVar, (byte) 22);
            case 23:
                igb igbVar6 = new igb(obj2, yjeVar, (byte) 23);
                igbVar6.j = ((Boolean) obj).booleanValue();
                return igbVar6;
            case 24:
                return new igb(this.j, (yog) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                igb igbVar7 = new igb(obj2, yjeVar, (byte) 25);
                igbVar7.j = ((Boolean) obj).booleanValue();
                return igbVar7;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                igb igbVar8 = new igb(obj2, yjeVar, (byte) 26);
                igbVar8.j = ((Boolean) obj).booleanValue();
                return igbVar8;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new igb(obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new igb(obj2, yjeVar, (byte) 28);
            default:
                return new igb(obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.i) {
            case 0:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((igb) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 3:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((igb) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((igb) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((igb) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((igb) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                boolean z = ((eg5) obj).f7745a;
                igb igbVar = new igb(this.k, (yje) obj2, (byte) 14);
                igbVar.j = z;
                return igbVar.invokeSuspend(Unit.f46060a);
            case 15:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((igb) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                return ((igb) create(bool6, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                return ((igb) create(bool7, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((igb) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((igb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:389:0x0799  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD0;
        List list;
        a1m0 a1m0Var;
        Object objA;
        Object value;
        Object objA2;
        Object value2;
        String str;
        String str2;
        Object value3;
        Object value4;
        Unit unit;
        p7m0 p7m0Var;
        Object value5;
        byte b = this.i;
        byte b2 = 6;
        byte b3 = 9;
        byte b4 = 27;
        byte b5 = 10;
        byte b6 = 3;
        h660 h660Var = h660.f12515a;
        boolean z = false;
        byte b7 = 1;
        Object obj2 = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                jgb jgbVar = (jgb) obj2;
                p7m0 p7m0Var2 = jgbVar.j;
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                byte b8 = 23;
                if (!z2) {
                    z1x.P(obj);
                    ivn ivnVar = jgbVar.r;
                    String strA = org.xplatform.statistic.stage.api.domain.c.a(jgbVar.u);
                    this.j = true;
                    phf0 phf0Var = (phf0) ivnVar.f15453a;
                    objD0 = qjj.d0(((mne) phf0Var.c).b, new d09(phf0Var, strA, yjeVar, b8), this);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                List<j1m0> listD0 = ((r1m0) objD0).b;
                if (listD0.isEmpty()) {
                    list = iun.f15405a;
                } else {
                    boolean z3 = CollectionsKt.U(listD0) instanceof i1m0;
                    List<j1m0> listR = listD0;
                    if (z3) {
                        if (listD0.size() == 2) {
                            Object obj3 = listD0.get(1);
                            i1m0 i1m0Var = obj3 instanceof i1m0 ? (i1m0) obj3 : null;
                            if (i1m0Var != null) {
                                a1m0Var = i1m0Var.f14006a;
                                if (a1m0Var.b.size() != 1) {
                                    a1m0Var = null;
                                }
                            } else {
                                a1m0Var = null;
                            }
                        } else {
                            a1m0Var = null;
                        }
                        if (a1m0Var != null) {
                            listD0 = CollectionsKt.D0(listD0, 1);
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        for (j1m0 j1m0Var : listD0) {
                            j1m0Var.getClass();
                            a1m0 a1m0Var2 = ((i1m0) j1m0Var).f14006a;
                            List list2 = a1m0Var2.f77a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                            int i = 0;
                            for (Object obj4 : list2) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                String str3 = (String) obj4;
                                byte b9 = b7;
                                str3.getClass();
                                arrayList2.add(new ifo0(str3, i == 0 ? b9 : 0));
                                i = i2;
                                b7 = b9;
                            }
                            h1m0 h1m0Var = new h1m0(arrayList2);
                            i1m0 i1m0Var2 = new i1m0(a1m0.a(a1m0Var2, null, a1m0Var, 0, 23));
                            j1m0[] j1m0VarArr = new j1m0[2];
                            j1m0VarArr[0] = h1m0Var;
                            j1m0VarArr[b7] = i1m0Var2;
                            arrayList.add(q3d.j(j1m0VarArr));
                        }
                        listR = r3d.r(arrayList);
                    }
                    ArrayList arrayList3 = new ArrayList(r3d.q(listR, 10));
                    for (j1m0 g1m0Var : listR) {
                        if (g1m0Var != null) {
                            if (g1m0Var instanceof i1m0) {
                                g1m0Var = new i1m0(jgbVar.x(((i1m0) g1m0Var).f14006a));
                            } else if (g1m0Var instanceof g1m0) {
                                g1m0 g1m0Var2 = (g1m0) g1m0Var;
                                g1m0Var = new g1m0(jgbVar.x(g1m0Var2.f10520a), jgbVar.x(g1m0Var2.b));
                            }
                        }
                        arrayList3.add(g1m0Var);
                    }
                    list = arrayList3;
                }
                if (list.isEmpty()) {
                    r26 r26Var = new r26(g2v.d(jgbVar.e, pb10.g, null, null, R.string.data_is_missing, 0, null, 478));
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, r26Var);
                } else {
                    r9u r9uVar = jgbVar.x;
                    ygp ygpVar = ygp.t;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    t26 t26Var = new t26(list, j1q0Var.f15748a.d(ygpVar));
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, t26Var);
                }
                return Unit.f46060a;
            case 1:
                boolean z4 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hrb hrbVar = (hrb) obj2;
                hrbVar.E = z4;
                if (z4 && hrbVar.A == 0) {
                    sac.R(jiu0.a(hrbVar), new zhb(1, hrbVar, hrb.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, hrbVar.c.f22085a, new kv(hrbVar, yjeVar, b2));
                } else if (!z4 && hrbVar.A == 0) {
                    p7m0 p7m0Var3 = hrbVar.y;
                    xqb xqbVar = new xqb(sa10.b(hrbVar.w, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, xqbVar);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                try {
                    if (!z5) {
                        z1x.P(obj);
                        this.j = true;
                        qcc.G(this);
                        return wneVar3;
                    }
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    throw new rsy();
                } catch (Throwable th) {
                    ((cub) obj2).f4980a.d(null);
                    throw th;
                }
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    eqx eqxVar = (eqx) ((c5k) obj2).b;
                    this.j = true;
                    objA = eqxVar.a(this);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                m2c0 m2c0Var = (m2c0) objA;
                return Boolean.valueOf(kotlin.text.c.r(m2c0Var.Z, Separators.DOT, "", false).length() == 0 || !q3d.j(jqt0.e, jqt0.d).contains(m2c0Var.k));
            case 4:
                boolean z7 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = ((s1c) obj2).x;
                do {
                    value = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value, f1c.a((f1c) value, null, false, z7, false, 247)));
                return Unit.f46060a;
            case 5:
                ywq0 ywq0Var = (ywq0) obj2;
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    if (((iqt) ywq0Var.d).f15225a.a()) {
                        biu biuVar = (biu) ywq0Var.f43384a;
                        ucq ucqVar = (ucq) ywq0Var.g;
                        boolean z9 = ucqVar.l;
                        boolean z10 = ucqVar.i;
                        boolean z11 = ucqVar.k;
                        boolean z12 = ucqVar.j;
                        this.j = true;
                        if (biuVar.a(true, z9, z10, z11, z12, this) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z13 = this.j;
                if (z13) {
                    if (z13) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                nhf0 nhf0Var = ((i9c) obj2).f;
                this.j = true;
                Object objF = nhf0Var.f(false, false, this);
                return objF == wneVar7 ? wneVar7 : objF;
            case 7:
                kkc kkcVar = (kkc) obj2;
                wne wneVar8 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    r7v r7vVar = kkcVar.f18429a;
                    knf0 knf0Var = kkcVar.c;
                    String strC = knf0Var.c();
                    knf0Var.getClass();
                    knf0Var.getClass();
                    this.j = true;
                    objA2 = ((hkc) ((sza) r7vVar.f29996a).invoke()).a(1, 1357, strC, this);
                    if (objA2 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                Iterable<nkc> iterable = (Iterable) ((dx5) objA2).a();
                ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                for (nkc nkcVar : iterable) {
                    nkcVar.getClass();
                    Integer num = nkcVar.f23675a;
                    int iIntValue = num != null ? num.intValue() : 0;
                    String str4 = nkcVar.b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList4.add(new jkc(iIntValue, str4));
                }
                ikc ikcVar = kkcVar.b;
                ikcVar.getClass();
                ikcVar.f14919a = arrayList4;
                return arrayList4;
            case 8:
                boolean z15 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var5 = ((kzd) obj2).s;
                do {
                    value2 = p7m0Var5.getValue();
                    ezd ezdVar = (ezd) value2;
                    str = ezdVar.f8667a;
                    str2 = ezdVar.c;
                    str.getClass();
                } while (!p7m0Var5.m(value2, new ezd(str, z15, str2)));
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    this.j = true;
                    Object objF2 = ((ConstraintTrackingWorker) obj2).f(this);
                    return objF2 == wneVar10 ? wneVar10 : objF2;
                }
                if (z16) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    qoj0 qoj0Var = ((ibe) obj2).c;
                    ebe ebeVar = ebe.b;
                    this.j = true;
                    if (qoj0Var.a(ebeVar, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                boolean z18 = this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                pce pceVar = (pce) obj2;
                p7m0 p7m0Var6 = pceVar.k;
                if (z18) {
                    bby bbyVar = pceVar.j;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        do {
                            value4 = p7m0Var6.getValue();
                        } while (!p7m0Var6.m(value4, gce.a((gce) value4, null, true, false, 11)));
                        pceVar.j = sac.V(jiu0.a(pceVar), new ejd(pceVar, (byte) 13), null, pceVar.b.b, new fj3((diu0) pceVar, yjeVar, (byte) 5), 10);
                    }
                } else {
                    do {
                        value3 = p7m0Var6.getValue();
                    } while (!p7m0Var6.m(value3, gce.a((gce) value3, null, false, true, 3)));
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    this.j = true;
                    Object objAwait = ((jzj) obj2).await(this);
                    return objAwait == wneVar13 ? wneVar13 : objAwait;
                }
                if (z19) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                vpe vpeVar = (vpe) obj2;
                wne wneVar14 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    vl00 vl00Var = vpeVar.d;
                    boolean z21 = vpeVar.e.a().v1;
                    this.j = true;
                    if (vl00Var.b(z21, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                vpeVar.i.o(null, i8d.c);
                return Unit.f46060a;
            case 14:
                boolean z22 = this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                nwd nwdVar = xye.U1;
                ((xye) obj2).G0().d.setVisibility(z22 ? 0 : 8);
                return Unit.f46060a;
            case 15:
                lbf lbfVar = (lbf) obj2;
                wne wneVar16 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    utb utbVarC = aoq.c(sj3.S(lbfVar.s, 1000L), new zo1(yjeVar, lbfVar, b5));
                    fob fobVar = new fob(lbfVar, yjeVar, (byte) 21);
                    this.j = true;
                    Object objC = utbVarC.c(new vnq(h660Var, fobVar, (byte) 2), this);
                    if (objC != wneVar16) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar16) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    i5m0 i5m0Var = ((wff) obj2).d;
                    this.j = true;
                    if (i5m0Var.b(this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                h6g h6gVar = (h6g) obj2;
                wne wneVar18 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(h6gVar.g.f41877a.e());
                    fob fobVar2 = new fob(h6gVar, yjeVar, b4);
                    this.j = true;
                    Object objC2 = gmqVarW.c(new vnq(h660Var, fobVar2, (byte) 2), this);
                    if (objC2 != wneVar18) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 != wneVar18) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                w6g w6gVar = (w6g) obj2;
                CyberCalendarDaysOfWeekParams cyberCalendarDaysOfWeekParams = w6gVar.c;
                wne wneVar19 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                    calendar.setTimeInMillis(cyberCalendarDaysOfWeekParams.b.f46479a);
                    if (cyberCalendarDaysOfWeekParams.f46486a == yag.c) {
                        calendar.set(7, calendar.getFirstDayOfWeek());
                    }
                    ArrayList arrayListL = q3d.l(fre0.Q(calendar));
                    b6 = cyberCalendarDaysOfWeekParams.f46486a != yag.b ? (byte) 7 : (byte) 3;
                    for (int i3 = 1; i3 < b6; i3++) {
                        calendar.add(6, 1);
                        arrayListL.add(fre0.Q(calendar));
                    }
                    gmq gmqVarW2 = i120.W(w6gVar.g.f41877a.e());
                    g6g g6gVar = new g6g(w6gVar, arrayListL, yjeVar, b7);
                    this.j = true;
                    Object objC3 = gmqVarW2.c(new vnq(h660Var, g6gVar, (byte) 2), this);
                    wne wneVar20 = wne.f39444a;
                    if (objC3 != wneVar20) {
                        objC3 = Unit.f46060a;
                    }
                    if (objC3 != wneVar20) {
                        objC3 = Unit.f46060a;
                    }
                    if (objC3 == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                j7g j7gVar = (j7g) obj2;
                ol60 ol60Var = j7gVar.n;
                p7m0 p7m0Var7 = j7gVar.l;
                wne wneVar21 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    if (((Set) p7m0Var7.getValue()).isEmpty()) {
                        ol60Var.f(h7g.b);
                    } else {
                        a2u a2uVar = j7gVar.d;
                        List listL0 = CollectionsKt.L0((Iterable) p7m0Var7.getValue());
                        this.j = true;
                        ul9 ul9Var = a2uVar.f142a;
                        switch (ul9Var.f35861a) {
                            case 0:
                                ((hl9) ul9Var.d).d.n(listL0);
                                unit = Unit.f46060a;
                                wne wneVar22 = wne.f39444a;
                                break;
                            default:
                                ((s3t0) ul9Var.d).d.n(listL0);
                                unit = Unit.f46060a;
                                wne wneVar23 = wne.f39444a;
                                break;
                        }
                        if (unit != wneVar21) {
                            unit = Unit.f46060a;
                        }
                        if (unit == wneVar21) {
                            return wneVar21;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z27) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ol60Var.f(h7g.f12572a);
                return Unit.f46060a;
            case 20:
                k8g k8gVar = (k8g) obj2;
                wne wneVar24 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    ul9 ul9Var2 = k8gVar.c.f36006a;
                    switch (ul9Var2.f35861a) {
                        case 0:
                            p7m0Var = ((hl9) ul9Var2.d).b;
                            break;
                        default:
                            p7m0Var = ((s3t0) ul9Var2.d).b;
                            break;
                    }
                    gmq gmqVarW3 = i120.W(k8gVar.d.f41877a.e());
                    wx4 wx4Var = new wx4(k8gVar, yjeVar, b6);
                    this.j = true;
                    Object objG = tdc.G(this, h660Var, new kh1((Object) wx4Var, yjeVar, b3), pul.j, new gmq[]{p7m0Var, gmqVarW3});
                    Object obj5 = objG;
                    if (objG != wne.f39444a) {
                        obj5 = Unit.f46060a;
                    }
                    Object obj6 = obj5;
                    if (obj5 != wne.f39444a) {
                        obj6 = Unit.f46060a;
                    }
                    if (obj6 == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                g9g g9gVar = (g9g) obj2;
                wne wneVar25 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    gmq gmqVarW4 = i120.W(g9gVar.d.f41877a.e());
                    e9g e9gVar = new e9g(g9gVar, yjeVar, z ? (byte) 1 : (byte) 0);
                    this.j = true;
                    Object objC4 = gmqVarW4.c(new vnq(h660Var, e9gVar, (byte) 2), this);
                    if (objC4 != wneVar25) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 != wneVar25) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                ecg ecgVar = (ecg) obj2;
                wne wneVar26 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    fvt fvtVar = ecgVar.b;
                    fvtVar.getClass();
                    vsg0 vsg0Var = new vsg0(new cbq(fvtVar, yjeVar, b4));
                    p7m0 p7m0Var8 = ecgVar.f;
                    e00 e00Var = new e00(ecgVar, yjeVar, (byte) 24);
                    this.j = true;
                    Object objG2 = tdc.G(this, h660Var, new kh1((Object) e00Var, yjeVar, b3), pul.j, new gmq[]{vsg0Var, p7m0Var8});
                    Object obj7 = objG2;
                    if (objG2 != wne.f39444a) {
                        obj7 = Unit.f46060a;
                    }
                    Object obj8 = obj7;
                    if (obj7 != wne.f39444a) {
                        obj8 = Unit.f46060a;
                    }
                    if (obj8 == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                xig xigVar = (xig) obj2;
                boolean z31 = this.j;
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                if (z31) {
                    int i4 = xig.J;
                    bby bbyVar2 = xigVar.F;
                    if (bbyVar2 != null) {
                        e3c.n(bbyVar2);
                    }
                    xigVar.F = i3t0.K(xigVar, null, null, new uig(xigVar, yjeVar, z ? (byte) 1 : (byte) 0), 3);
                }
                int i5 = xig.J;
                p7m0 p7m0Var9 = xigVar.i.f25029a;
                while (true) {
                    Object value6 = p7m0Var9.getValue();
                    value6.getClass();
                    boolean z32 = z31;
                    if (p7m0Var9.m(value6, sig.a((sig) value6, z32, null, null, null, null, false, null, 4063))) {
                        return Unit.f46060a;
                    }
                    z31 = z32;
                }
                break;
            case 24:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                if (!this.j) {
                    ((yog) obj2).b.m(0.0f);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                boolean z33 = this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                lmh lmhVar = (lmh) obj2;
                lmhVar.z = z33;
                lmhVar.M();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dvh dvhVar = (dvh) obj2;
                boolean z34 = this.j;
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                if (z34 && (((ruh) dvhVar.D()).d || ((ruh) dvhVar.D()).e || ((ruh) dvhVar.D()).f)) {
                    dvhVar.M();
                } else if (!z34 && ((ruh) dvhVar.D()).d) {
                    p7m0 p7m0Var10 = dvhVar.i.f25029a;
                    do {
                        value5 = p7m0Var10.getValue();
                        value5.getClass();
                        dvhVar.f.getClass();
                    } while (!p7m0Var10.m(value5, ruh.a((ruh) value5, null, false, true, false, null, null, null, null, null, iun.f15405a, 4039)));
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar31 = wne.f39444a;
                boolean z35 = this.j;
                if (!z35) {
                    z1x.P(obj);
                    cub cubVar = (cub) ((f3j) obj2).q;
                    h3j h3jVar = new h3j();
                    this.j = true;
                    if (cubVar.a(h3jVar, this) == wneVar31) {
                        return wneVar31;
                    }
                } else {
                    if (!z35) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar32 = wne.f39444a;
                boolean z36 = this.j;
                if (!z36) {
                    z1x.P(obj);
                    this.j = true;
                    if (((ncj) obj2).e(this) == wneVar32) {
                        return wneVar32;
                    }
                } else {
                    if (!z36) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar33 = wne.f39444a;
                boolean z37 = this.j;
                if (!z37) {
                    z1x.P(obj);
                    this.j = true;
                    if (((xgj) obj2).w(true, this) == wneVar33) {
                        return wneVar33;
                    }
                } else {
                    if (!z37) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ igb(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
