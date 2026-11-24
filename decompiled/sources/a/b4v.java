package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class b4v implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1977a;
    public final /* synthetic */ kmq b;

    public /* synthetic */ b4v(kmq kmqVar, byte b) {
        this.f1977a = b;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x019a  */
    /* JADX WARN: Code duplicated, block: B:122:0x01db  */
    /* JADX WARN: Code duplicated, block: B:141:0x0221  */
    /* JADX WARN: Code duplicated, block: B:160:0x0264  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:214:0x0330  */
    /* JADX WARN: Code duplicated, block: B:232:0x036f  */
    /* JADX WARN: Code duplicated, block: B:250:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:284:0x0426  */
    /* JADX WARN: Code duplicated, block: B:300:0x0474  */
    /* JADX WARN: Code duplicated, block: B:316:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:334:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:354:0x0563  */
    /* JADX WARN: Code duplicated, block: B:394:0x060a  */
    /* JADX WARN: Code duplicated, block: B:410:0x064a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:429:0x0691  */
    /* JADX WARN: Code duplicated, block: B:452:0x06da  */
    /* JADX WARN: Code duplicated, block: B:470:0x0716  */
    /* JADX WARN: Code duplicated, block: B:488:0x075b  */
    /* JADX WARN: Code duplicated, block: B:526:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:542:0x0837  */
    /* JADX WARN: Code duplicated, block: B:558:0x0877  */
    /* JADX WARN: Code duplicated, block: B:578:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:598:0x0973  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        a4v a4vVar;
        j4v j4vVar;
        e5v e5vVar;
        v5v v5vVar;
        t6v t6vVar;
        civ civVar;
        Object obj2;
        x9w x9wVar;
        faw fawVar;
        ilx ilxVar;
        wqx wqxVar;
        yqx yqxVar;
        nty ntyVar;
        sxy sxyVar;
        bf00 bf00Var;
        il00 il00Var;
        pl00 pl00Var;
        bt00 bt00Var;
        y210 y210Var;
        sq10 sq10Var;
        kt10 kt10Var;
        mt10 mt10Var;
        k020 k020Var;
        d220 d220Var;
        l220 l220Var;
        r220 r220Var;
        ag20 ag20Var;
        eg20 eg20Var;
        vl20 vl20Var;
        dm20 dm20Var;
        vk30 vk30Var;
        Object pk30Var;
        byte b = this.f1977a;
        int i = 0;
        kmq kmqVar = this.b;
        int i2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof a4v) {
                    a4vVar = (a4v) yjeVar;
                    int i3 = a4vVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a4vVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        a4vVar = new a4v(this, yjeVar);
                    }
                } else {
                    a4vVar = new a4v(this, yjeVar);
                }
                Object obj3 = a4vVar.i;
                Object obj4 = wne.f39444a;
                int i4 = a4vVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    aki0 aki0Var = (aki0) obj;
                    if (aki0Var instanceof yji0) {
                        i = ((yji0) aki0Var).f42742a;
                    } else if (!Intrinsics.d(aki0Var, zji0.f44483a)) {
                        t9f.b();
                        return null;
                    }
                    Object num = new Integer(i);
                    a4vVar.j = 1;
                    if (kmqVar.a(num, a4vVar) == obj4) {
                        return obj4;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof j4v) {
                    j4vVar = (j4v) yjeVar;
                    int i5 = j4vVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        j4vVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        j4vVar = new j4v(this, yjeVar);
                    }
                } else {
                    j4vVar = new j4v(this, yjeVar);
                }
                Object obj5 = j4vVar.i;
                Object obj6 = wne.f39444a;
                int i6 = j4vVar.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    List<pbs0> list = (List) obj;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (pbs0 pbs0Var : list) {
                        pbs0Var.getClass();
                        m97 m97Var = pbs0Var.b;
                        String strValueOf = String.valueOf(m97Var.l);
                        double d = m97Var.l;
                        long j = m97Var.f21398a;
                        tqt tqtVar = uoy.b;
                        int i7 = m97Var.b;
                        tqtVar.getClass();
                        uoy uoyVarJ = tqt.j(i7);
                        double d2 = m97Var.k;
                        long j2 = m97Var.f;
                        long j3 = m97Var.h;
                        std stdVar = gwe.b;
                        arrayList.add(new ru6(-1L, strValueOf, d, j, uoyVarJ, d2, j2, j3, 0, (Double) null, (String) null, 3328));
                        i2 = 1;
                    }
                    j4vVar.j = i2;
                    if (kmqVar.a(arrayList, j4vVar) == obj6) {
                        return obj6;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof e5v) {
                    e5vVar = (e5v) yjeVar;
                    int i8 = e5vVar.j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        e5vVar.j = i8 - Integer.MIN_VALUE;
                    } else {
                        e5vVar = new e5v(this, yjeVar);
                    }
                } else {
                    e5vVar = new e5v(this, yjeVar);
                }
                Object obj7 = e5vVar.i;
                Object obj8 = wne.f39444a;
                int i9 = e5vVar.j;
                if (i9 == 0) {
                    z1x.P(obj7);
                    List<pxy> list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    for (pxy pxyVar : list2) {
                        arrayList2.add(new gxy(pxyVar.f27779a, pxyVar.c));
                    }
                    e5vVar.j = 1;
                    if (kmqVar.a(arrayList2, e5vVar) == obj8) {
                        return obj8;
                    }
                } else {
                    if (i9 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof v5v) {
                    v5vVar = (v5v) yjeVar;
                    int i10 = v5vVar.j;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        v5vVar.j = i10 - Integer.MIN_VALUE;
                    } else {
                        v5vVar = new v5v(this, yjeVar);
                    }
                } else {
                    v5vVar = new v5v(this, yjeVar);
                }
                Object obj9 = v5vVar.i;
                Object obj10 = wne.f39444a;
                int i11 = v5vVar.j;
                if (i11 == 0) {
                    z1x.P(obj9);
                    Object j0g0Var = new j0g0((List) obj);
                    v5vVar.j = 1;
                    if (kmqVar.a(j0g0Var, v5vVar) == obj10) {
                        return obj10;
                    }
                } else {
                    if (i11 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof t6v) {
                    t6vVar = (t6v) yjeVar;
                    int i12 = t6vVar.j;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        t6vVar.j = i12 - Integer.MIN_VALUE;
                    } else {
                        t6vVar = new t6v(this, yjeVar);
                    }
                } else {
                    t6vVar = new t6v(this, yjeVar);
                }
                Object obj11 = t6vVar.i;
                Object obj12 = wne.f39444a;
                int i13 = t6vVar.j;
                if (i13 == 0) {
                    z1x.P(obj11);
                    Object obj13 = ((j0g0) obj).f15681a;
                    z1x.P(obj13);
                    t6vVar.j = 1;
                    if (kmqVar.a(obj13, t6vVar) == obj12) {
                        return obj12;
                    }
                } else {
                    if (i13 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof civ) {
                    civVar = (civ) yjeVar;
                    int i14 = civVar.j;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        civVar.j = i14 - Integer.MIN_VALUE;
                    } else {
                        civVar = new civ(this, yjeVar);
                    }
                } else {
                    civVar = new civ(this, yjeVar);
                }
                Object obj14 = civVar.i;
                Object obj15 = wne.f39444a;
                int i15 = civVar.j;
                if (i15 == 0) {
                    z1x.P(obj14);
                    dqk0 dqk0Var = (dqk0) obj;
                    if (dqk0Var != null) {
                        if (dqk0Var instanceof bqk0) {
                            obj2 = iun.f15405a;
                        } else if (dqk0Var instanceof cqk0) {
                            Iterable iterable = (Iterable) ((cqk0) dqk0Var).f4798a;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj16 : iterable) {
                                if (obj16 instanceof efb) {
                                    arrayList3.add(obj16);
                                }
                            }
                            efb efbVar = (efb) CollectionsKt.firstOrNull(arrayList3);
                            if (efbVar != null) {
                                List list3 = efbVar.f7714a;
                                ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList4.add(((dfb) it.next()).f5992a);
                                }
                                obj2 = arrayList4;
                            } else {
                                obj2 = iun.f15405a;
                            }
                        }
                        civVar.j = 1;
                        if (kmqVar.a(obj2, civVar) == obj15) {
                            return obj15;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i15 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj14);
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof x9w) {
                    x9wVar = (x9w) yjeVar;
                    int i16 = x9wVar.j;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        x9wVar.j = i16 - Integer.MIN_VALUE;
                    } else {
                        x9wVar = new x9w(this, yjeVar);
                    }
                } else {
                    x9wVar = new x9w(this, yjeVar);
                }
                Object obj17 = x9wVar.i;
                Object obj18 = wne.f39444a;
                int i17 = x9wVar.j;
                if (i17 == 0) {
                    z1x.P(obj17);
                    if (((Number) obj).longValue() != 0) {
                        x9wVar.j = 1;
                        if (kmqVar.a(obj, x9wVar) == obj18) {
                            return obj18;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof faw) {
                    fawVar = (faw) yjeVar;
                    int i18 = fawVar.j;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        fawVar.j = i18 - Integer.MIN_VALUE;
                    } else {
                        fawVar = new faw(this, yjeVar);
                    }
                } else {
                    fawVar = new faw(this, yjeVar);
                }
                Object obj19 = fawVar.i;
                Object obj20 = wne.f39444a;
                int i19 = fawVar.j;
                if (i19 == 0) {
                    z1x.P(obj19);
                    if (obj instanceof za50) {
                        fawVar.j = 1;
                        if (kmqVar.a(obj, fawVar) == obj20) {
                            return obj20;
                        }
                    }
                } else {
                    if (i19 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof ilx) {
                    ilxVar = (ilx) yjeVar;
                    int i20 = ilxVar.j;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        ilxVar.j = i20 - Integer.MIN_VALUE;
                    } else {
                        ilxVar = new ilx(this, yjeVar);
                    }
                } else {
                    ilxVar = new ilx(this, yjeVar);
                }
                Object obj21 = ilxVar.i;
                Object obj22 = wne.f39444a;
                int i21 = ilxVar.j;
                if (i21 == 0) {
                    z1x.P(obj21);
                    glx glxVar = (glx) obj;
                    flx flxVar = glxVar instanceof flx ? (flx) glxVar : null;
                    Object obj23 = flxVar != null ? flxVar.f9758a : null;
                    if (obj23 != null) {
                        ilxVar.j = 1;
                        if (kmqVar.a(obj23, ilxVar) == obj22) {
                            return obj22;
                        }
                    }
                } else {
                    if (i21 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof wqx) {
                    wqxVar = (wqx) yjeVar;
                    int i22 = wqxVar.j;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        wqxVar.j = i22 - Integer.MIN_VALUE;
                    } else {
                        wqxVar = new wqx(this, yjeVar);
                    }
                } else {
                    wqxVar = new wqx(this, yjeVar);
                }
                Object obj24 = wqxVar.i;
                Object obj25 = wne.f39444a;
                int i23 = wqxVar.j;
                if (i23 == 0) {
                    z1x.P(obj24);
                    Object obj26 = (nas) CollectionsKt.firstOrNull((List) obj);
                    if (obj26 == null) {
                        jf4.k(null);
                        return null;
                    }
                    wqxVar.j = 1;
                    if (kmqVar.a(obj26, wqxVar) == obj25) {
                        return obj25;
                    }
                } else {
                    if (i23 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof yqx) {
                    yqxVar = (yqx) yjeVar;
                    int i24 = yqxVar.j;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        yqxVar.j = i24 - Integer.MIN_VALUE;
                    } else {
                        yqxVar = new yqx(this, yjeVar);
                    }
                } else {
                    yqxVar = new yqx(this, yjeVar);
                }
                Object obj27 = yqxVar.i;
                Object obj28 = wne.f39444a;
                int i25 = yqxVar.j;
                if (i25 == 0) {
                    z1x.P(obj27);
                    Object x5r0Var = new x5r0(true, (nas) obj);
                    yqxVar.j = 1;
                    if (kmqVar.a(x5r0Var, yqxVar) == obj28) {
                        return obj28;
                    }
                } else {
                    if (i25 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj27);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof nty) {
                    ntyVar = (nty) yjeVar;
                    int i26 = ntyVar.j;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        ntyVar.j = i26 - Integer.MIN_VALUE;
                    } else {
                        ntyVar = new nty(this, yjeVar);
                    }
                } else {
                    ntyVar = new nty(this, yjeVar);
                }
                Object obj29 = ntyVar.i;
                Object obj30 = wne.f39444a;
                int i27 = ntyVar.j;
                if (i27 == 0) {
                    z1x.P(obj29);
                    uaq0 uaq0Var = (uaq0) obj;
                    uaq0.f35345a.getClass();
                    String str = "static/img/android/actions/register_bonus/200LT.png";
                    if (!s9m0.j(uaq0Var)) {
                        if (s9m0.i(uaq0Var)) {
                            str = "static/img/android/actions/register_bonus/200DT.png";
                        } else if (s9m0.k(uaq0Var)) {
                            str = "static/img/android/actions/register_bonus/200NT.png";
                        }
                    }
                    StringBuilder sb = new StringBuilder(ujn.h);
                    if (str.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                        sb.setLength(0);
                        sb.append(str);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(str, '/'));
                    }
                    Object string = sb.toString();
                    ntyVar.j = 1;
                    if (kmqVar.a(string, ntyVar) == obj30) {
                        return obj30;
                    }
                } else {
                    if (i27 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj29);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof sxy) {
                    sxyVar = (sxy) yjeVar;
                    int i28 = sxyVar.j;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        sxyVar.j = i28 - Integer.MIN_VALUE;
                    } else {
                        sxyVar = new sxy(this, yjeVar);
                    }
                } else {
                    sxyVar = new sxy(this, yjeVar);
                }
                Object obj31 = sxyVar.i;
                Object obj32 = wne.f39444a;
                int i29 = sxyVar.j;
                if (i29 == 0) {
                    z1x.P(obj31);
                    List<hxy> list4 = (List) obj;
                    ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
                    for (hxy hxyVar : list4) {
                        arrayList5.add(new pxy(hxyVar.b, hxyVar.f13835a, hxyVar.c));
                    }
                    sxyVar.j = 1;
                    if (kmqVar.a(arrayList5, sxyVar) == obj32) {
                        return obj32;
                    }
                } else {
                    if (i29 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj31);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof bf00) {
                    bf00Var = (bf00) yjeVar;
                    int i30 = bf00Var.j;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        bf00Var.j = i30 - Integer.MIN_VALUE;
                    } else {
                        bf00Var = new bf00(this, yjeVar);
                    }
                } else {
                    bf00Var = new bf00(this, yjeVar);
                }
                Object obj33 = bf00Var.i;
                Object obj34 = wne.f39444a;
                int i31 = bf00Var.j;
                if (i31 == 0) {
                    z1x.P(obj33);
                    if (obj instanceof ab50) {
                        bf00Var.j = 1;
                        if (kmqVar.a(obj, bf00Var) == obj34) {
                            return obj34;
                        }
                    }
                } else {
                    if (i31 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj33);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof il00) {
                    il00Var = (il00) yjeVar;
                    int i32 = il00Var.j;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        il00Var.j = i32 - Integer.MIN_VALUE;
                    } else {
                        il00Var = new il00(this, yjeVar);
                    }
                } else {
                    il00Var = new il00(this, yjeVar);
                }
                Object obj35 = il00Var.i;
                Object obj36 = wne.f39444a;
                int i33 = il00Var.j;
                if (i33 == 0) {
                    z1x.P(obj35);
                    xgq0 xgq0Var = (xgq0) obj;
                    Object pair = new Pair(new Long(xgq0Var.f40852a), new Long(xgq0Var.b));
                    il00Var.j = 1;
                    if (kmqVar.a(pair, il00Var) == obj36) {
                        return obj36;
                    }
                } else {
                    if (i33 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj35);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof pl00) {
                    pl00Var = (pl00) yjeVar;
                    int i34 = pl00Var.j;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        pl00Var.j = i34 - Integer.MIN_VALUE;
                    } else {
                        pl00Var = new pl00(this, yjeVar);
                    }
                } else {
                    pl00Var = new pl00(this, yjeVar);
                }
                Object obj37 = pl00Var.i;
                Object obj38 = wne.f39444a;
                int i35 = pl00Var.j;
                if (i35 == 0) {
                    z1x.P(obj37);
                    xgq0 xgq0Var2 = (xgq0) obj;
                    Object pair2 = new Pair(new Long(xgq0Var2.f40852a), new Long(xgq0Var2.b));
                    pl00Var.j = 1;
                    if (kmqVar.a(pair2, pl00Var) == obj38) {
                        return obj38;
                    }
                } else {
                    if (i35 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj37);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof bt00) {
                    bt00Var = (bt00) yjeVar;
                    int i36 = bt00Var.j;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        bt00Var.j = i36 - Integer.MIN_VALUE;
                    } else {
                        bt00Var = new bt00(this, yjeVar);
                    }
                } else {
                    bt00Var = new bt00(this, yjeVar);
                }
                Object obj39 = bt00Var.i;
                Object obj40 = wne.f39444a;
                int i37 = bt00Var.j;
                if (i37 == 0) {
                    z1x.P(obj39);
                    if (obj instanceof gt00) {
                        bt00Var.j = 1;
                        if (kmqVar.a(obj, bt00Var) == obj40) {
                            return obj40;
                        }
                    }
                } else {
                    if (i37 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj39);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof y210) {
                    y210Var = (y210) yjeVar;
                    int i38 = y210Var.j;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        y210Var.j = i38 - Integer.MIN_VALUE;
                    } else {
                        y210Var = new y210(this, yjeVar);
                    }
                } else {
                    y210Var = new y210(this, yjeVar);
                }
                Object obj41 = y210Var.i;
                Object obj42 = wne.f39444a;
                int i39 = y210Var.j;
                if (i39 == 0) {
                    z1x.P(obj41);
                    Object objO0 = kpb.o0((bqr) obj, false);
                    y210Var.j = 1;
                    if (kmqVar.a(objO0, y210Var) == obj42) {
                        return obj42;
                    }
                } else {
                    if (i39 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj41);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof sq10) {
                    sq10Var = (sq10) yjeVar;
                    int i40 = sq10Var.j;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        sq10Var.j = i40 - Integer.MIN_VALUE;
                    } else {
                        sq10Var = new sq10(this, yjeVar);
                    }
                } else {
                    sq10Var = new sq10(this, yjeVar);
                }
                Object obj43 = sq10Var.i;
                Object obj44 = wne.f39444a;
                int i41 = sq10Var.j;
                if (i41 == 0) {
                    z1x.P(obj43);
                    if (obj instanceof c7a) {
                        sq10Var.j = 1;
                        if (kmqVar.a(obj, sq10Var) == obj44) {
                            return obj44;
                        }
                    }
                } else {
                    if (i41 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj43);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof kt10) {
                    kt10Var = (kt10) yjeVar;
                    int i42 = kt10Var.j;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        kt10Var.j = i42 - Integer.MIN_VALUE;
                    } else {
                        kt10Var = new kt10(this, yjeVar);
                    }
                } else {
                    kt10Var = new kt10(this, yjeVar);
                }
                Object obj45 = kt10Var.i;
                Object obj46 = wne.f39444a;
                int i43 = kt10Var.j;
                if (i43 == 0) {
                    z1x.P(obj45);
                    if (((dzk) obj) instanceof czk) {
                        kt10Var.j = 1;
                        if (kmqVar.a(obj, kt10Var) == obj46) {
                            return obj46;
                        }
                    }
                } else {
                    if (i43 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj45);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof mt10) {
                    mt10Var = (mt10) yjeVar;
                    int i44 = mt10Var.j;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        mt10Var.j = i44 - Integer.MIN_VALUE;
                    } else {
                        mt10Var = new mt10(this, yjeVar);
                    }
                } else {
                    mt10Var = new mt10(this, yjeVar);
                }
                Object obj47 = mt10Var.i;
                Object obj48 = wne.f39444a;
                int i45 = mt10Var.j;
                if (i45 == 0) {
                    z1x.P(obj47);
                    dzk dzkVar = (dzk) obj;
                    dzkVar.getClass();
                    Object checkedDomain = ((czk) dzkVar).getCheckedDomain();
                    mt10Var.j = 1;
                    if (kmqVar.a(checkedDomain, mt10Var) == obj48) {
                        return obj48;
                    }
                } else {
                    if (i45 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj47);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof k020) {
                    k020Var = (k020) yjeVar;
                    int i46 = k020Var.j;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        k020Var.j = i46 - Integer.MIN_VALUE;
                    } else {
                        k020Var = new k020(this, yjeVar);
                    }
                } else {
                    k020Var = new k020(this, yjeVar);
                }
                Object obj49 = k020Var.i;
                Object obj50 = wne.f39444a;
                int i47 = k020Var.j;
                if (i47 == 0) {
                    z1x.P(obj49);
                    d020 d020Var = (d020) obj;
                    d020Var.getClass();
                    Object e020Var = d020Var.f5250a ? new e020(d020Var.b) : f020.f8699a;
                    k020Var.j = 1;
                    if (kmqVar.a(e020Var, k020Var) == obj50) {
                        return obj50;
                    }
                } else {
                    if (i47 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj49);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof d220) {
                    d220Var = (d220) yjeVar;
                    int i48 = d220Var.j;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        d220Var.j = i48 - Integer.MIN_VALUE;
                    } else {
                        d220Var = new d220(this, yjeVar);
                    }
                } else {
                    d220Var = new d220(this, yjeVar);
                }
                Object obj51 = d220Var.i;
                Object obj52 = wne.f39444a;
                int i49 = d220Var.j;
                if (i49 == 0) {
                    z1x.P(obj51);
                    if (obj instanceof usr) {
                        d220Var.j = 1;
                        if (kmqVar.a(obj, d220Var) == obj52) {
                            return obj52;
                        }
                    }
                } else {
                    if (i49 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj51);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof l220) {
                    l220Var = (l220) yjeVar;
                    int i50 = l220Var.j;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        l220Var.j = i50 - Integer.MIN_VALUE;
                    } else {
                        l220Var = new l220(this, yjeVar);
                    }
                } else {
                    l220Var = new l220(this, yjeVar);
                }
                Object obj53 = l220Var.i;
                Object obj54 = wne.f39444a;
                int i51 = l220Var.j;
                if (i51 == 0) {
                    z1x.P(obj53);
                    sw00 sw00Var = (sw00) obj;
                    boolean z = sw00Var.f32897a;
                    boolean z2 = sw00Var.b;
                    if (z && !z2) {
                        l220Var.j = 1;
                        if (kmqVar.a(obj, l220Var) == obj54) {
                            return obj54;
                        }
                    }
                } else {
                    if (i51 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj53);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof r220) {
                    r220Var = (r220) yjeVar;
                    int i52 = r220Var.j;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        r220Var.j = i52 - Integer.MIN_VALUE;
                    } else {
                        r220Var = new r220(this, yjeVar);
                    }
                } else {
                    r220Var = new r220(this, yjeVar);
                }
                Object obj55 = r220Var.i;
                Object obj56 = wne.f39444a;
                int i53 = r220Var.j;
                if (i53 == 0) {
                    z1x.P(obj55);
                    Object objValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    r220Var.j = 1;
                    if (kmqVar.a(objValueOf, r220Var) == obj56) {
                        return obj56;
                    }
                } else {
                    if (i53 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj55);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof ag20) {
                    ag20Var = (ag20) yjeVar;
                    int i54 = ag20Var.j;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        ag20Var.j = i54 - Integer.MIN_VALUE;
                    } else {
                        ag20Var = new ag20(this, yjeVar);
                    }
                } else {
                    ag20Var = new ag20(this, yjeVar);
                }
                Object obj57 = ag20Var.i;
                Object obj58 = wne.f39444a;
                int i55 = ag20Var.j;
                if (i55 == 0) {
                    z1x.P(obj57);
                    Object objValueOf2 = Boolean.valueOf(((StepInputUiModel) obj).q);
                    ag20Var.j = 1;
                    if (kmqVar.a(objValueOf2, ag20Var) == obj58) {
                        return obj58;
                    }
                } else {
                    if (i55 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj57);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof eg20) {
                    eg20Var = (eg20) yjeVar;
                    int i56 = eg20Var.j;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        eg20Var.j = i56 - Integer.MIN_VALUE;
                    } else {
                        eg20Var = new eg20(this, yjeVar);
                    }
                } else {
                    eg20Var = new eg20(this, yjeVar);
                }
                Object obj59 = eg20Var.i;
                Object obj60 = wne.f39444a;
                int i57 = eg20Var.j;
                if (i57 == 0) {
                    z1x.P(obj59);
                    StepInputUiModel stepInputUiModel = (StepInputUiModel) obj;
                    if (stepInputUiModel.b != 0.0d && stepInputUiModel.d != 0.0d && stepInputUiModel.e != 0.0d && !stepInputUiModel.q) {
                        eg20Var.j = 1;
                        if (kmqVar.a(obj, eg20Var) == obj60) {
                            return obj60;
                        }
                    }
                } else {
                    if (i57 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj59);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof vl20) {
                    vl20Var = (vl20) yjeVar;
                    int i58 = vl20Var.j;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        vl20Var.j = i58 - Integer.MIN_VALUE;
                    } else {
                        vl20Var = new vl20(this, yjeVar);
                    }
                } else {
                    vl20Var = new vl20(this, yjeVar);
                }
                Object obj61 = vl20Var.i;
                Object obj62 = wne.f39444a;
                int i59 = vl20Var.j;
                if (i59 == 0) {
                    z1x.P(obj61);
                    vf7 vf7Var = (vf7) obj;
                    if (vf7Var.b > 0.0d || vf7Var.h) {
                        vl20Var.j = 1;
                        if (kmqVar.a(obj, vl20Var) == obj62) {
                            return obj62;
                        }
                    }
                } else {
                    if (i59 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj61);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof dm20) {
                    dm20Var = (dm20) yjeVar;
                    int i60 = dm20Var.j;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        dm20Var.j = i60 - Integer.MIN_VALUE;
                    } else {
                        dm20Var = new dm20(this, yjeVar);
                    }
                } else {
                    dm20Var = new dm20(this, yjeVar);
                }
                Object obj63 = dm20Var.i;
                Object obj64 = wne.f39444a;
                int i61 = dm20Var.j;
                if (i61 == 0) {
                    z1x.P(obj63);
                    if (((Boolean) obj).booleanValue()) {
                        dm20Var.j = 1;
                        if (kmqVar.a(obj, dm20Var) == obj64) {
                            return obj64;
                        }
                    }
                } else {
                    if (i61 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj63);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof vk30) {
                    vk30Var = (vk30) yjeVar;
                    int i62 = vk30Var.j;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        vk30Var.j = i62 - Integer.MIN_VALUE;
                    } else {
                        vk30Var = new vk30(this, yjeVar);
                    }
                } else {
                    vk30Var = new vk30(this, yjeVar);
                }
                Object obj65 = vk30Var.i;
                Object obj66 = wne.f39444a;
                int i63 = vk30Var.j;
                if (i63 == 0) {
                    z1x.P(obj65);
                    nk30 nk30Var = (nk30) obj;
                    nk30Var.getClass();
                    List list5 = nk30Var.d;
                    jkm jkmVar = nk30Var.e;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj67 : list5) {
                        if (StringsKt.O(((hl30) obj67).c, nk30Var.c, true)) {
                            arrayList6.add(obj67);
                        }
                    }
                    if (nk30Var.f) {
                        pk30Var = new qk30(jkmVar);
                    } else if (nk30Var.h) {
                        pk30Var = rk30.f30628a;
                    } else {
                        pk30Var = arrayList6.isEmpty() ? new pk30(jkmVar) : new ok30(arrayList6, !nk30Var.f23664a.equals(nk30Var.b), !nk30Var.g);
                    }
                    vk30Var.j = 1;
                    if (kmqVar.a(pk30Var, vk30Var) == obj66) {
                        return obj66;
                    }
                } else {
                    if (i63 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj65);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ b4v(kmq kmqVar, Object obj, byte b) {
        this.f1977a = b;
        this.b = kmqVar;
    }
}
