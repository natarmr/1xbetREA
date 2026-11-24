package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class u52 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(tam0 tam0Var, int i, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 25;
        this.l = tam0Var;
        this.k = i;
        this.j = z;
    }

    private final Object G(Object obj) {
        Object objO;
        int i;
        Object value;
        x8e0 x8e0Var = (x8e0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            int i2 = ((l8e0) x8e0Var.D()).i + 1;
            edu eduVar = x8e0Var.u;
            RatingStatisticScreenParams ratingStatisticScreenParams = x8e0Var.o;
            j6i0 j6i0Var = ((l8e0) x8e0Var.D()).h;
            this.k = i2;
            this.j = true;
            objO = eduVar.o(ratingStatisticScreenParams, i2, j6i0Var, 30, this);
            if (objO == wneVar) {
                return wneVar;
            }
            i = i2;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.k;
            z1x.P(obj);
            i = i3;
            objO = obj;
        }
        h8e0 h8e0Var = (h8e0) objO;
        h8e0 h8e0Var2 = ((l8e0) x8e0Var.D()).g;
        List list = h8e0Var2.c;
        List list2 = h8e0Var.c;
        List list3 = h8e0Var.d;
        h8e0 h8e0VarA = h8e0.a(h8e0Var2, CollectionsKt.q0(list, list2), CollectionsKt.q0(h8e0Var2.d, list3));
        p7m0 p7m0Var = x8e0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, l8e0.a((l8e0) value, false, false, null, null, h8e0VarA, null, i, list3.size() < 30, false, 191)));
        return Unit.f46060a;
    }

    private final Object H(Object obj) {
        u52 u52Var;
        yse0 yse0Var = (yse0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        RandomAccess randomAccess = null;
        if (!z) {
            z1x.P(obj);
            onv onvVar = yse0Var.f43163a;
            String strC = yse0Var.c.c();
            int i = this.k;
            this.j = true;
            u52Var = this;
            obj = ((ose0) ((rta0) onvVar.f25567a).invoke()).a(strC, 0L, i, "application/vnd.xenvelop+json", u52Var);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            u52Var = this;
        }
        List<vse0> list = ((wse0) ((dx5) obj).a()).c;
        if (list != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (vse0 vse0Var : list) {
                vse0Var.getClass();
                Integer num = vse0Var.f37946a;
                if (num == null) {
                    jf4.k(null);
                    return null;
                }
                int iIntValue = num.intValue();
                String str = vse0Var.b;
                if (str == null) {
                    jf4.k(null);
                    return null;
                }
                arrayList.add(new qse0(iIntValue, str));
            }
            randomAccess = arrayList;
        }
        int i2 = u52Var.k;
        xse0 xse0Var = yse0Var.b;
        RandomAccess randomAccess2 = randomAccess == null ? iun.f15405a : randomAccess;
        xse0Var.getClass();
        randomAccess2.getClass();
        xse0Var.f41413a.put(Integer.valueOf(i2), randomAccess2);
        return randomAccess == null ? iun.f15405a : randomAccess;
    }

    private final Object I(Object obj) {
        dxe0 dxe0Var = (dxe0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        byte b = 1;
        if (!z) {
            z1x.P(obj);
            kd30 kd30Var = dxe0Var.R1;
            if (kd30Var == null) {
                Intrinsics.h("socialManager");
                throw null;
            }
            int i = this.k;
            Object objN = dxe0Var.U1.n(dxe0.Z1[0], dxe0Var);
            objN.getClass();
            ComposeView composeView = ((a4r) objN).b;
            bxe0 bxe0Var = new bxe0(dxe0Var, b);
            this.j = true;
            if (kd30Var.O(dxe0Var, i, composeView, bxe0Var, new pdk0((byte) 5), new pdk0((byte) 6), this) == wneVar) {
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

    private final Object J(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            cch0 cch0Var = (cch0) this.l;
            rah0 rah0Var = cch0Var.f4111a;
            int i = this.k;
            nul0 nul0Var = cch0Var.c;
            this.j = true;
            if (rah0Var.f(i, nul0Var, this) == wneVar) {
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

    private final Object K(Object obj) {
        int i = this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            ldi0 ldi0Var = (ldi0) this.l;
            qfi0 qfi0Var = new qfi0(new swp0("", "", false), i);
            obk0 obk0Var = obk0.SMS;
            this.k = i;
            this.j = true;
            if (ldi0Var.F(qfi0Var, obk0Var, this) == wneVar) {
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

    private final Object L(Object obj) {
        tik0 tik0Var = (tik0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            kd30 kd30Var = tik0Var.N1;
            if (kd30Var == null) {
                Intrinsics.h("socialManager");
                throw null;
            }
            int i = this.k;
            FrameLayout frameLayout = tik0Var.H0().f36793a;
            gvj0 gvj0Var = new gvj0(1, tik0Var, tik0.class, "login", "login(Lorg/xplatform/social/api/core/SocialData;)V", 0, (byte) 16);
            this.j = true;
            if (kd30Var.O(tik0Var, i, frameLayout, gvj0Var, new pdk0((byte) 5), new pdk0((byte) 6), this) == wneVar) {
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

    private final Object M(Object obj) {
        Object value;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        tam0 tam0Var = (tam0) this.l;
        int i = this.k;
        boolean z = this.j;
        LinkedHashSet linkedHashSet = tam0Var.p;
        p7m0 p7m0Var = tam0Var.j;
        StatisticBlocksParams statisticBlocksParams = tam0Var.c;
        Iterator it = tam0Var.n.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((iam0) it.next()).f14445a.f33572a == i) {
                break;
            }
            i2++;
        }
        iam0 iam0Var = (iam0) CollectionsKt.W(i2, tam0Var.n);
        iam0 iam0VarC = iam0Var != null ? iam0.c(iam0Var, z) : null;
        if (iam0VarC != null) {
            tam0Var.n.remove(i2);
            tam0Var.n.add(i2, iam0VarC);
        }
        if (z && !linkedHashSet.contains(Integer.valueOf(i))) {
            linkedHashSet.add(Integer.valueOf(i));
        } else if (!z) {
            linkedHashSet.remove(Integer.valueOf(i));
        }
        Object objY = gfx.y(statisticBlocksParams.f.size(), tam0Var.p.size(), statisticBlocksParams.e, statisticBlocksParams.b, tam0Var.g);
        Object value2 = p7m0Var.getValue();
        aam0 aam0Var = value2 instanceof aam0 ? (aam0) value2 : null;
        if (aam0Var == null) {
            return Unit.f46060a;
        }
        List<Object> list = aam0Var.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object objC : list) {
            if (objC instanceof bsv) {
                objC = objY;
            } else if (objC instanceof iam0) {
                iam0 iam0Var2 = (iam0) objC;
                if (iam0Var2.f14445a.f33572a == i) {
                    objC = iam0.c(iam0Var2, !z);
                }
            }
            arrayList.add(objC);
        }
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new aam0(arrayList, !Intrinsics.d(tam0Var.n, tam0Var.o), false)));
        tam0Var.A();
        return Unit.f46060a;
    }

    private final Object Q(Object obj) {
        z220 z220Var = (z220) this.l;
        knf0 knf0Var = (knf0) z220Var.e;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            g090 g090Var = (g090) z220Var.c;
            int i = this.k;
            String strC = knf0Var.c();
            knf0Var.getClass();
            int iB = knf0Var.b();
            this.j = true;
            obj = ((xgm0) ((jfm0) g090Var.b).invoke()).c(i, strC, 1, iB, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return lgb.m0((ogb) ((dx5) obj).a());
    }

    private final Object R(Object obj) {
        Object next;
        a3n0 a3n0Var = (a3n0) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            bot botVar = a3n0Var.B;
            this.j = true;
            obj = botVar.f2951a.d(this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        int i = this.k;
        Iterator it = ((Iterable) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((qkt) next).f28902a != i);
        qkt qktVar = (qkt) next;
        if (qktVar != null) {
            ((ykt) ((pmi) a3n0Var.D.b).c).c = null;
            ou9 ou9Var = a3n0Var.E;
            cre creVar = new cre(qktVar.f28902a, qktVar.b, qktVar.d);
            ou9Var.getClass();
            ou9Var.f25866a.c(creVar);
            a3n0Var.G(t0n0.f33127a);
        }
        return Unit.f46060a;
    }

    private final Object S(Object obj) {
        Object value;
        rpn0 rpn0Var;
        int iIntValue;
        Integer num;
        Object value2;
        rpn0 rpn0Var2;
        int iIntValue2;
        Integer num2;
        int i = this.k;
        tpn0 tpn0Var = (tpn0) this.l;
        List list = tpn0Var.m;
        List list2 = tpn0Var.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (i > q3d.i(tpn0Var.p)) {
                ((yvn0) tpn0Var.d.f18971a.d).f43330a.d("KEY_PREF_SWIPE_ONBOARDING_STATE", true);
                this.j = true;
                tpn0Var.o.f(qpn0.f29129a);
                i1w0 i1w0Var = tpn0Var.e;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI.b(t0w0.f33140a);
                k0w0VarI.h(m6m0.i(tpn0Var.f));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        break;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                if (Unit.f46060a == wneVar) {
                    return wneVar;
                }
            } else {
                int i2 = q3d.i(tpn0Var.p);
                p7m0 p7m0Var = tpn0Var.n;
                if (i == i2) {
                    int i3 = this.k;
                    do {
                        value2 = p7m0Var.getValue();
                        rpn0Var2 = (rpn0) value2;
                        Integer num3 = (Integer) CollectionsKt.W(i3, list2);
                        iIntValue2 = num3 != null ? num3.intValue() : ((Number) CollectionsKt.U(list2)).intValue();
                        num2 = (Integer) CollectionsKt.W(i3, list);
                    } while (!p7m0Var.m(value2, rpn0.a(rpn0Var2, R.string.understand_action, null, i3, iIntValue2, num2 != null ? num2.intValue() : ((Number) CollectionsKt.U(list)).intValue(), 0.0f, 66)));
                } else {
                    int i4 = this.k;
                    do {
                        value = p7m0Var.getValue();
                        rpn0Var = (rpn0) value;
                        Integer num4 = (Integer) CollectionsKt.W(i4, list2);
                        iIntValue = num4 != null ? num4.intValue() : ((Number) CollectionsKt.U(list2)).intValue();
                        num = (Integer) CollectionsKt.W(i4, list);
                    } while (!p7m0Var.m(value, rpn0.a(rpn0Var, R.string.next, null, i4, iIntValue, num != null ? num.intValue() : ((Number) CollectionsKt.U(list)).intValue(), 0.0f, 66)));
                }
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

    private final Object l(Object obj) {
        nr nrVar = (nr) this.l;
        knf0 knf0Var = (knf0) nrVar.c;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            a1d a1dVar = (a1d) nrVar.d;
            int i = this.k;
            knf0Var.getClass();
            knf0Var.getClass();
            String strC = knf0Var.c();
            this.j = true;
            obj = ((wgt) ((wgn) a1dVar.b).invoke()).a(i, strC, 1357, 1, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        jdq jdqVar = (jdq) ((q16) obj).a();
        List list = jdqVar.f16341a;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(jcb.i0((fdq) it.next()));
        }
        if (arrayList.isEmpty()) {
            jf4.k(null);
            return null;
        }
        List list2 = jdqVar.b;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(jcb.i0((fdq) it2.next()));
        }
        if (arrayList2.isEmpty()) {
            jf4.k(null);
            return null;
        }
        List list3 = jdqVar.c;
        if (list3 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(jcb.i0((fdq) it3.next()));
        }
        if (arrayList3.isEmpty()) {
            jf4.k(null);
            return null;
        }
        List list4 = jdqVar.d;
        if (list4 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(jcb.i0((fdq) it4.next()));
        }
        if (!arrayList4.isEmpty()) {
            return new bdq(arrayList, arrayList2, arrayList3, arrayList4);
        }
        jf4.k(null);
        return null;
    }

    private final Object m(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            rah0 rah0Var = ((zrx) this.l).f44880a;
            int i = this.k;
            uts0 uts0VarM0 = ro4.m0(Response.OK, 0, ihn.b, 2);
            this.j = true;
            if (rah0Var.f(i, uts0VarM0, this) == wneVar) {
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

    private final Object o(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            xbz xbzVar = ((dcz) this.l).p;
            int i = this.k;
            this.j = true;
            if (xbzVar.d(i, this) == wneVar) {
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

    /* JADX WARN: Code duplicated, block: B:116:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f1 A[LOOP:2: B:120:0x01eb->B:122:0x01f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x0203  */
    /* JADX WARN: Code duplicated, block: B:128:0x0209  */
    /* JADX WARN: Code duplicated, block: B:131:0x021e  */
    /* JADX WARN: Code duplicated, block: B:133:0x022d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0234  */
    /* JADX WARN: Code duplicated, block: B:137:0x023a  */
    /* JADX WARN: Code duplicated, block: B:138:0x023f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0245  */
    /* JADX WARN: Code duplicated, block: B:142:0x024c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0259  */
    /* JADX WARN: Code duplicated, block: B:148:0x0264  */
    /* JADX WARN: Code duplicated, block: B:149:0x0268  */
    /* JADX WARN: Code duplicated, block: B:162:0x029f  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:172:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:241:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:243:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:246:0x0404  */
    /* JADX WARN: Code duplicated, block: B:249:0x0413  */
    /* JADX WARN: Code duplicated, block: B:253:0x0426  */
    /* JADX WARN: Code duplicated, block: B:314:0x0533  */
    /* JADX WARN: Code duplicated, block: B:317:0x053f  */
    /* JADX WARN: Code duplicated, block: B:319:0x0544  */
    /* JADX WARN: Code duplicated, block: B:338:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v29, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    private final Object r(Object obj) {
        Object objG;
        String strK;
        o0 n0Var;
        List list;
        List listD0;
        List list2;
        ?? arrayList;
        List<m610> list3;
        ?? arrayList2;
        List list4;
        List list5;
        List list6;
        List list7;
        ?? arrayList3;
        ?? r2;
        Iterator it;
        List list8;
        Iterator it2;
        ?? r21;
        Object h0hVar;
        int i;
        char c;
        ?? r22;
        Double d;
        Integer num;
        Integer num2;
        List<f610> listD1;
        List list9;
        char c2;
        int i2;
        char c3;
        Long l;
        long jLongValue;
        Long l2;
        long jLongValue2;
        Boolean bool;
        ?? BooleanValue;
        ?? sb;
        String str;
        String strConcat;
        char c4;
        String str2;
        String str3;
        Integer num3;
        int iIntValue;
        Iterator it3;
        Object string;
        i110 i110Var;
        f310 f310Var = (f310) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        List list10 = null;
        if (!z) {
            z1x.P(obj);
            svu svuVar = f310Var.b;
            int i3 = this.k;
            String strC = f310Var.c.c();
            this.j = true;
            objG = svuVar.g(i3, this, strC);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objG = obj;
        }
        w010 w010Var = (w010) objG;
        w010Var.getClass();
        Long l3 = w010Var.f38326a;
        Long l4 = w010Var.f;
        String str4 = w010Var.e;
        String str5 = w010Var.d;
        String str6 = w010Var.c;
        if (l3 == null && w010Var.b == null && str6 == null && str5 == null && str4 == null && l4 == null) {
            n0Var = m0.f20928a;
        } else {
            String str7 = str5;
            String str8 = str6;
            Long l5 = w010Var.b;
            if (str8 == null) {
                str8 = "";
            }
            if (str7 == null) {
                str7 = "";
            }
            String str9 = str4 == null ? "" : str4;
            if (l4 != null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setGroupingSeparator(' ');
                strK = kng0.k("$ ", new DecimalFormat("#,###", decimalFormatSymbols).format(l4.longValue()));
            } else {
                strK = "";
            }
            n0Var = new n0(l3, l5, str8, str7, str9, strK, false);
        }
        List<jz00> list11 = w010Var.g;
        ?? r3 = 0;
        if (list11 != null) {
            ArrayList arrayList4 = new ArrayList(r3d.q(list11, 10));
            for (jz00 jz00Var : list11) {
                jz00Var.getClass();
                String str10 = jz00Var.f17385a;
                List list12 = list10;
                String str11 = jz00Var.b;
                String strConcat2 = (str10 == null ? "" : str10).concat(str11 == null ? "" : str11);
                String str12 = str10 == null ? "" : str10;
                if (str11 != null) {
                    StringBuilder sb2 = new StringBuilder(ujn.h);
                    String strConcat3 = "cyberstatistic/v1/image/".concat(str11);
                    if (strConcat3.length() == 0) {
                        sb2.setLength(0);
                    } else if (StringsKt.O(strConcat3, ujn.h, false) || kotlin.text.c.x(strConcat3, "https://", false)) {
                        sb2.setLength(0);
                        sb2.append(strConcat3);
                    } else {
                        if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                            sb2.append('/');
                        }
                        sb2.append(StringsKt.y0(strConcat3, '/'));
                    }
                    string = sb2.toString();
                } else {
                    string = list12;
                }
                ?? r20 = string == null ? "" : string;
                Integer num4 = jz00Var.e;
                int iIntValue2 = num4 != null ? num4.intValue() : 0;
                lz00 lz00Var = jz00Var.f;
                if (lz00Var != null) {
                    int iOrdinal = lz00Var.ordinal();
                    if (iOrdinal == 0) {
                        i110Var = i110.b;
                    } else if (iOrdinal == 1) {
                        i110Var = i110.c;
                    } else if (iOrdinal == 2) {
                        i110Var = i110.f13973a;
                    } else if (iOrdinal == 3) {
                        i110Var = i110.d;
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return list12;
                        }
                        i110Var = i110.e;
                    }
                } else {
                    i110Var = i110.f;
                }
                i110 i110Var2 = i110Var;
                Integer num5 = jz00Var.d;
                int iIntValue3 = num5 != null ? num5.intValue() : 0;
                Float f = jz00Var.c;
                arrayList4.add(new h110(strConcat2, str12, r20, iIntValue2, i110Var2, iIntValue3, f != null ? f.floatValue() : 0.0f));
                list10 = list12;
            }
            list = list10;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (((h110) obj2).b.length() > 0) {
                    arrayList5.add(obj2);
                }
            }
            List listA0 = CollectionsKt.A0(arrayList5, new wpv((byte) 26));
            if (listA0 != null) {
                listD0 = CollectionsKt.D0(listA0, 10);
            }
            if (listD0 == null) {
                listD0 = iun.f15405a;
            }
            list2 = w010Var.h;
            if (list2 != null) {
                arrayList = new ArrayList(r3d.q(list2, 10));
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(g7x.d0((hxb0) it3.next()));
                }
            } else {
                arrayList = list;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            list3 = w010Var.i;
            if (list3 != null) {
                arrayList2 = new ArrayList(r3d.q(list3, 10));
                for (m610 m610Var : list3) {
                    m610Var.getClass();
                    l = m610Var.f21245a;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    l2 = m610Var.b;
                    if (l2 != null) {
                        jLongValue2 = l2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    bool = m610Var.c;
                    if (bool != null) {
                        BooleanValue = bool.booleanValue();
                    } else {
                        BooleanValue = r3;
                    }
                    sb = new StringBuilder(ujn.h);
                    str = m610Var.d;
                    if (str == null) {
                        str = "";
                    }
                    strConcat = "cyberstatistic/v1/image/".concat(str);
                    if (strConcat.length() == 0) {
                        sb.setLength(r3);
                    } else if (!StringsKt.O(strConcat, ujn.h, r3) || kotlin.text.c.x(strConcat, "https://", r3)) {
                        sb.setLength(r3);
                        sb.append(strConcat);
                    } else {
                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                            c4 = '/';
                        } else {
                            sb.append('/');
                            c4 = '/';
                        }
                        char[] cArr = new char[1];
                        cArr[r3] = c4;
                        sb.append(StringsKt.y0(strConcat, cArr));
                    }
                    String string2 = sb.toString();
                    str2 = m610Var.e;
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    num3 = m610Var.f;
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    arrayList2.add(new ghh(iIntValue, jLongValue, jLongValue2, string2, str3, BooleanValue));
                    r3 = 0;
                }
            } else {
                arrayList2 = list;
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            ?? r11 = arrayList2;
            list4 = w010Var.j;
            if (list4 != null || (listD1 = CollectionsKt.D0(list4, 10)) == null) {
                list5 = listD0;
                list6 = list;
            } else {
                ArrayList arrayList6 = new ArrayList(r3d.q(listD1, 10));
                for (f610 f610Var : listD1) {
                    f610Var.getClass();
                    String str13 = f610Var.f8988a;
                    String str14 = str13 == null ? "" : str13;
                    StringBuilder sb3 = new StringBuilder(ujn.h);
                    String str15 = f610Var.b;
                    if (str15 == null) {
                        str15 = "";
                    }
                    String strConcat4 = "cyberstatistic/v1/image/".concat(str15);
                    if (strConcat4.length() == 0) {
                        sb3.setLength(0);
                        list9 = listD0;
                    } else {
                        list9 = listD0;
                        int i4 = 0;
                        if (StringsKt.O(strConcat4, ujn.h, false)) {
                            sb3.setLength(i4);
                            sb3.append(strConcat4);
                        } else if (kotlin.text.c.x(strConcat4, "https://", false)) {
                            i4 = 0;
                            sb3.setLength(i4);
                            sb3.append(strConcat4);
                        } else {
                            if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                c2 = '/';
                            } else {
                                sb3.append('/');
                                c2 = '/';
                            }
                            sb3.append(StringsKt.y0(strConcat4, c2));
                        }
                    }
                    String string3 = sb3.toString();
                    StringBuilder sb4 = new StringBuilder(ujn.h);
                    String str16 = f610Var.d;
                    if (str16 == null) {
                        str16 = "";
                    }
                    String strConcat5 = "cyberstatistic/v1/image/".concat(str16);
                    if (strConcat5.length() == 0) {
                        sb4.setLength(0);
                    } else {
                        if (StringsKt.O(strConcat5, ujn.h, false)) {
                            i2 = 0;
                        } else if (kotlin.text.c.x(strConcat5, "https://", false)) {
                            i2 = 0;
                        } else {
                            if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                c3 = '/';
                            } else {
                                sb4.append('/');
                                c3 = '/';
                            }
                            sb4.append(StringsKt.y0(strConcat5, c3));
                        }
                        sb4.setLength(i2);
                        sb4.append(strConcat5);
                    }
                    String string4 = sb4.toString();
                    Integer num6 = f610Var.e;
                    int iIntValue4 = num6 != null ? num6.intValue() : 0;
                    Integer num7 = f610Var.f;
                    int iIntValue5 = num7 != null ? num7.intValue() : 0;
                    Double d2 = f610Var.c;
                    arrayList6.add(new hih(str14, string3, string4, iIntValue4, iIntValue5, d2 != null ? d2.doubleValue() : 0.0d));
                    listD0 = list9;
                }
                list5 = listD0;
                list6 = arrayList6;
            }
            if (list6 == null) {
                list6 = iun.f15405a;
            }
            List list13 = list6;
            list7 = w010Var.k;
            if (list7 != null) {
                arrayList3 = new ArrayList();
                it = list7.iterator();
                arrayList = arrayList;
                while (it.hasNext()) {
                    f010 f010Var = (f010) it.next();
                    f010Var.getClass();
                    list8 = f010Var.b;
                    if (list8 != null || list8.isEmpty()) {
                        it2 = it;
                        r21 = arrayList;
                        h0hVar = list;
                    } else {
                        String str17 = f010Var.f8697a;
                        if (str17 == null) {
                            str17 = "";
                        }
                        ArrayList arrayList7 = new ArrayList(r3d.q(list8, 10));
                        Iterator it4 = list8.iterator();
                        ?? r5 = arrayList;
                        while (it4.hasNext()) {
                            l010 l010Var = (l010) it4.next();
                            l010Var.getClass();
                            Long l6 = l010Var.f19177a;
                            Iterator it5 = it;
                            k010 k010Var = l010Var.e;
                            long jLongValue3 = l6 != null ? l6.longValue() : 0L;
                            Long l7 = l010Var.b;
                            long jLongValue4 = l7 != null ? l7.longValue() : 0L;
                            String str18 = l010Var.c;
                            String str19 = str18 == null ? "" : str18;
                            Iterator it6 = it4;
                            StringBuilder sb5 = new StringBuilder(ujn.h);
                            String str20 = l010Var.d;
                            if (str20 == null) {
                                str20 = "";
                            }
                            String strConcat6 = "cyberstatistic/v1/image/".concat(str20);
                            if (strConcat6.length() == 0) {
                                sb5.setLength(0);
                                r22 = r5;
                                i = 0;
                            } else {
                                ?? r23 = r5;
                                if (StringsKt.O(strConcat6, ujn.h, false)) {
                                    i = 0;
                                } else if (kotlin.text.c.x(strConcat6, "https://", false)) {
                                    i = 0;
                                } else {
                                    if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                        c = '/';
                                    } else {
                                        sb5.append('/');
                                        c = '/';
                                    }
                                    i = 0;
                                    sb5.append(StringsKt.y0(strConcat6, c));
                                    r22 = r23;
                                }
                                sb5.setLength(i);
                                sb5.append(strConcat6);
                                r22 = r23;
                            }
                            arrayList7.add(new m0h(jLongValue3, jLongValue4, str19, sb5.toString(), (k010Var == null || (num2 = k010Var.f17442a) == null) ? i : num2.intValue(), (k010Var == null || (num = k010Var.b) == null) ? i : num.intValue(), (k010Var == null || (d = k010Var.c) == null) ? 0.0d : d.doubleValue()));
                            it = it5;
                            it4 = it6;
                            r5 = r22;
                        }
                        it2 = it;
                        r21 = r5;
                        h0hVar = new h0h(str17, arrayList7);
                    }
                    if (h0hVar != null) {
                        arrayList3.add(h0hVar);
                    }
                    it = it2;
                    arrayList = r21;
                }
            } else {
                arrayList3 = list;
            }
            ?? r24 = arrayList;
            r2 = arrayList3;
            if (arrayList3 == 0) {
                r2 = iun.f15405a;
            }
            f310Var.f8839a.f40047a.o(list, new cqk0(new s010(n0Var, list5, r24, r11, list13, r2)));
            return Unit.f46060a;
        }
        list = null;
        listD0 = list;
        if (listD0 == null) {
            listD0 = iun.f15405a;
        }
        list2 = w010Var.h;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(g7x.d0((hxb0) it3.next()));
            }
        } else {
            arrayList = list;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        list3 = w010Var.i;
        if (list3 != null) {
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            while (r4.hasNext()) {
                m610Var.getClass();
                l = m610Var.f21245a;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                l2 = m610Var.b;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                bool = m610Var.c;
                if (bool != null) {
                    BooleanValue = bool.booleanValue();
                } else {
                    BooleanValue = r3;
                }
                sb = new StringBuilder(ujn.h);
                str = m610Var.d;
                if (str == null) {
                    str = "";
                }
                strConcat = "cyberstatistic/v1/image/".concat(str);
                if (strConcat.length() == 0) {
                    sb.setLength(r3);
                } else if (StringsKt.O(strConcat, ujn.h, r3)) {
                    sb.setLength(r3);
                    sb.append(strConcat);
                } else {
                    sb.setLength(r3);
                    sb.append(strConcat);
                }
                String string5 = sb.toString();
                str2 = m610Var.e;
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                num3 = m610Var.f;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                arrayList2.add(new ghh(iIntValue, jLongValue, jLongValue2, string5, str3, BooleanValue));
                r3 = 0;
            }
        } else {
            arrayList2 = list;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ?? r12 = arrayList2;
        list4 = w010Var.j;
        if (list4 != null) {
            list5 = listD0;
            list6 = list;
        } else {
            list5 = listD0;
            list6 = list;
        }
        if (list6 == null) {
            list6 = iun.f15405a;
        }
        List list14 = list6;
        list7 = w010Var.k;
        if (list7 != null) {
            arrayList3 = new ArrayList();
            it = list7.iterator();
            arrayList = arrayList;
            while (it.hasNext()) {
                f010 f010Var2 = (f010) it.next();
                f010Var2.getClass();
                list8 = f010Var2.b;
                if (list8 != null) {
                    it2 = it;
                    r21 = arrayList;
                    h0hVar = list;
                } else {
                    it2 = it;
                    r21 = arrayList;
                    h0hVar = list;
                }
                if (h0hVar != null) {
                    arrayList3.add(h0hVar);
                }
                it = it2;
                arrayList = r21;
            }
        } else {
            arrayList3 = list;
        }
        ?? r25 = arrayList;
        r2 = arrayList3;
        if (arrayList3 == 0) {
            r2 = iun.f15405a;
        }
        f310Var.f8839a.f40047a.o(list, new cqk0(new s010(n0Var, list5, r25, r12, list14, r2)));
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            pzu pzuVar = (pzu) this.l;
            gsj gsjVar = (gsj) pzuVar.b;
            String strA = ((btt0) pzuVar.e).a();
            long j = this.k;
            this.j = true;
            obj = gsjVar.a().c(strA, j, "application/vnd.xenvelop+json", this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        Iterable iterable = (Iterable) ((dx5) obj).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(q0x.Q((m640) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((z540) obj2).h) {
                arrayList2.add(obj2);
            }
        }
        return CollectionsKt.A0(arrayList2, new lk30((byte) 2));
    }

    private final Object t(Object obj) {
        Object value;
        kw50 kw50Var = (kw50) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            twc twcVar = kw50Var.r;
            int i = this.k;
            this.j = true;
            obj = twcVar.a(i, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = kw50.N;
        p7m0 p7m0Var = kw50Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, zv50.a((zv50) value, null, null, null, false, null, 0, zBooleanValue, !zBooleanValue, false, false, 59391)));
        return Unit.f46060a;
    }

    private final Object x(Object obj) {
        int i;
        Object next;
        xd70 xd70Var = (xd70) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            int i2 = ((xb70) xd70Var.D()).n.f ? 2 : 1;
            this.k = i2;
            this.j = true;
            Object objA = ((ddu) xd70Var.y.get()).a(new int[]{i2}, this);
            if (objA == wneVar) {
                return wneVar;
            }
            int i3 = i2;
            obj = objA;
            i = i3;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.k;
            z1x.P(obj);
        }
        Iterator it = ((Iterable) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((uq60) next).f36104a != i);
        uq60 uq60Var = (uq60) next;
        vpv0 vpv0Var = uq60Var != null ? uq60Var.b : null;
        int i4 = vpv0Var == null ? -1 : kd70.f18092a[vpv0Var.ordinal()];
        if (i4 == 1) {
            xd70Var.G(new mb70(((xb70) xd70Var.D()).n.e));
        } else if (i4 == 2) {
            if (((xb70) xd70Var.D()).n.f) {
                xd70Var.G(lb70.f19741a);
            } else {
                xd70Var.G(nb70.f23226a);
            }
        }
        return Unit.f46060a;
    }

    private final Object y(Object obj) {
        Object next;
        int i = this.k;
        xcz xczVar = (xcz) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        Object obj2 = null;
        if (!z) {
            z1x.P(obj);
            mcz mczVarJ = xczVar.j();
            int i2 = mczVarJ.n - mczVarJ.m;
            Iterator it = xczVar.j().l.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ncz) next).f23317a != i);
            ncz nczVar = (ncz) next;
            int i3 = nczVar != null ? nczVar.p : 0;
            for (Object obj3 : xczVar.j().l) {
                if (((ncz) obj3).f23317a == i) {
                    obj2 = obj3;
                    break;
                }
            }
            ncz nczVar2 = (ncz) obj2;
            int i4 = nczVar2 != null ? nczVar2.q : 0;
            this.j = true;
            if (bww.x(xczVar, i3 - ((i2 - i4) / 2), ro4.g0(0.0f, 0.0f, null, 7), this) == wneVar) {
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
                return new u52(obj2, this.k, yjeVar, (byte) 0);
            case 1:
                return new u52(obj2, this.k, yjeVar, (byte) 1);
            case 2:
                return new u52(obj2, this.k, yjeVar, (byte) 2);
            case 3:
                return new u52(obj2, this.k, yjeVar, (byte) 3);
            case 4:
                return new u52(obj2, this.k, yjeVar, (byte) 4);
            case 5:
                return new u52((rzj) obj2, yjeVar, this.k);
            case 6:
                return new u52(obj2, this.k, yjeVar, (byte) 6);
            case 7:
                return new u52(obj2, this.k, yjeVar, (byte) 7);
            case 8:
                return new u52(obj2, this.k, yjeVar, (byte) 8);
            case 9:
                return new u52(obj2, this.k, yjeVar, (byte) 9);
            case 10:
                u52 u52Var = new u52((diu0) obj2, yjeVar, (byte) 10);
                u52Var.k = ((Number) obj).intValue();
                return u52Var;
            case 11:
                return new u52(obj2, this.k, yjeVar, (byte) 11);
            case 12:
                return new u52(obj2, this.k, yjeVar, (byte) 12);
            case 13:
                return new u52(obj2, this.k, yjeVar, (byte) 13);
            case 14:
                return new u52(obj2, this.k, yjeVar, (byte) 14);
            case 15:
                return new u52((pzu) obj2, this.k, yjeVar);
            case 16:
                return new u52(obj2, this.k, yjeVar, (byte) 16);
            case 17:
                return new u52((diu0) obj2, yjeVar, (byte) 17);
            case 18:
                return new u52(obj2, this.k, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new u52((diu0) obj2, yjeVar, (byte) 19);
            case 20:
                return new u52(obj2, this.k, yjeVar, (byte) 20);
            case 21:
                return new u52(obj2, this.k, yjeVar, (byte) 21);
            case 22:
                return new u52(obj2, this.k, yjeVar, (byte) 22);
            case 23:
                u52 u52Var2 = new u52((diu0) obj2, yjeVar, (byte) 23);
                u52Var2.k = ((Number) obj).intValue();
                return u52Var2;
            case 24:
                return new u52(obj2, this.k, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new u52((tam0) obj2, this.k, this.j, yjeVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new u52(obj2, this.k, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new u52(obj2, this.k, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new u52(this.k, (tpn0) obj2, yjeVar);
            default:
                return new u52(obj2, this.k, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((u52) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((u52) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((u52) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u52) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x02ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v82, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v25, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v27, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v29, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v31, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v61, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v63, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v65, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        String strK;
        o0 n0Var;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        h0h h0hVar;
        int i;
        char c;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        List<ji9> listD0;
        char c2;
        Double d;
        Integer num6;
        char c3;
        Object objA3;
        RandomAccess randomAccess;
        Object objA4;
        Object objA5;
        Object objZ;
        String strK2;
        o0 n0Var2;
        List listD1;
        ?? arrayList6;
        ?? arrayList7;
        ?? arrayList8;
        ?? arrayList9;
        h0h h0hVar2;
        char c4;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        List<qal> listD2;
        char c5;
        Integer num12;
        Integer num13;
        char c6;
        int i2;
        int i3;
        char c7;
        Object value;
        Object value2;
        uvr0 uvr0Var;
        vvr0 vvr0Var;
        u52 u52Var = this;
        byte b = u52Var.i;
        m0 m0Var = m0.f20928a;
        Object obj2 = u52Var.l;
        byte b2 = 0;
        yje yjeVar = null;
        switch (b) {
            case 0:
                esg0 esg0Var = (esg0) obj2;
                knf0 knf0Var = (knf0) esg0Var.c;
                wne wneVar = wne.f39444a;
                boolean z = u52Var.j;
                if (!z) {
                    z1x.P(obj);
                    ok50 ok50Var = (ok50) esg0Var.f8326a;
                    knf0Var.getClass();
                    knf0Var.getClass();
                    int i4 = u52Var.k;
                    u52Var.j = true;
                    objA = ((z52) ((zm) ok50Var.f25390a).invoke()).a(1, 1357, i4, u52Var);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                dx5 dx5Var = (dx5) objA;
                dx5Var.getClass();
                List list = (List) dx5Var.b;
                return list == null ? iun.f15405a : list;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = u52Var.j;
                if (!z2) {
                    z1x.P(obj);
                    float f = u52Var.k;
                    u52Var.j = true;
                    Object objK = ((es8) obj2).f8317a.k(f, true, true, true, true, this);
                    if (objK != wneVar2) {
                        objK = Unit.f46060a;
                    }
                    if (objK == wneVar2) {
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
                oh9 oh9Var = (oh9) obj2;
                wne wneVar3 = wne.f39444a;
                boolean z3 = u52Var.j;
                if (!z3) {
                    z1x.P(obj);
                    peg0 peg0Var = oh9Var.b;
                    int i5 = u52Var.k;
                    String strC = oh9Var.c.c();
                    u52Var.j = true;
                    objA2 = ((fh9) ((zm) peg0Var.b).invoke()).a(i5, strC, u52Var);
                    if (objA2 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                mh9 mh9Var = (mh9) ((dx5) objA2).a();
                Long l = mh9Var.f21779a;
                Long l2 = mh9Var.f;
                String str = mh9Var.e;
                String str2 = mh9Var.d;
                String str3 = mh9Var.c;
                if (l == null && mh9Var.b == null && str3 == null && str2 == null && str == null && l2 == null) {
                    n0Var = m0Var;
                } else {
                    Long l3 = mh9Var.b;
                    String str4 = str3 == null ? "" : str3;
                    String str5 = str2 == null ? "" : str2;
                    String str6 = str == null ? "" : str;
                    if (l2 != null) {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setGroupingSeparator(' ');
                        strK = kng0.k("$ ", new DecimalFormat("#,###", decimalFormatSymbols).format(l2.longValue()));
                    } else {
                        strK = "";
                    }
                    n0Var = new n0(l, l3, str4, str5, str6, strK, false);
                }
                List list2 = mh9Var.h;
                if (list2 != null) {
                    arrayList = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(g7x.d0((hxb0) it.next()));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                ?? r26 = arrayList;
                List<np20> list3 = mh9Var.j;
                if (list3 != null) {
                    arrayList2 = new ArrayList(r3d.q(list3, 10));
                    for (np20 np20Var : list3) {
                        np20Var.getClass();
                        String str7 = np20Var.f23892a;
                        if (str7 == null) {
                            str7 = "";
                        }
                        arrayList2.add(new kp20(str7, np20Var.b, np20Var.c, np20Var.d));
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                ?? r27 = arrayList2;
                List<ysf> list4 = mh9Var.i;
                if (list4 != null) {
                    arrayList3 = new ArrayList(r3d.q(list4, 10));
                    for (ysf ysfVar : list4) {
                        ysfVar.getClass();
                        Long l4 = ysfVar.f43164a;
                        long jLongValue = l4 != null ? l4.longValue() : 0L;
                        Long l5 = ysfVar.b;
                        long jLongValue2 = l5 != null ? l5.longValue() : 0L;
                        Boolean bool = ysfVar.c;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str8 = ysfVar.e;
                        if (str8 == null && (str8 = ysfVar.d) == null) {
                            str8 = "";
                        }
                        String strConcat = "cyberstatistic/v1/image/".concat(str8);
                        if (strConcat.length() == 0) {
                            sb.setLength(0);
                        } else {
                            int i6 = 0;
                            if (StringsKt.O(strConcat, ujn.h, false)) {
                                sb.setLength(i6);
                                sb.append(strConcat);
                            } else if (kotlin.text.c.x(strConcat, "https://", false)) {
                                i6 = 0;
                                sb.setLength(i6);
                                sb.append(strConcat);
                            } else {
                                if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                    c3 = '/';
                                } else {
                                    c3 = '/';
                                    sb.append('/');
                                }
                                sb.append(StringsKt.y0(strConcat, c3));
                            }
                        }
                        String string = sb.toString();
                        String str9 = ysfVar.f;
                        String str10 = str9 == null ? "" : str9;
                        Integer num14 = ysfVar.g;
                        arrayList3.add(new ghh(num14 != null ? num14.intValue() : 0, jLongValue, jLongValue2, string, str10, zBooleanValue));
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                ?? r28 = arrayList3;
                List list5 = mh9Var.g;
                if (list5 == null || (listD0 = CollectionsKt.D0(list5, 10)) == null) {
                    arrayList4 = 0;
                } else {
                    arrayList4 = new ArrayList(r3d.q(listD0, 10));
                    for (ji9 ji9Var : listD0) {
                        ji9Var.getClass();
                        String str11 = ji9Var.f16563a;
                        gi9 gi9Var = ji9Var.d;
                        String str12 = str11 == null ? "" : str11;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String str13 = ji9Var.c;
                        if (str13 == null && (str13 = ji9Var.b) == null) {
                            str13 = "";
                        }
                        String strConcat2 = "cyberstatistic/v1/image/".concat(str13);
                        if (strConcat2.length() == 0) {
                            sb2.setLength(0);
                        } else {
                            int i7 = 0;
                            if (StringsKt.O(strConcat2, ujn.h, false)) {
                                sb2.setLength(i7);
                                sb2.append(strConcat2);
                            } else if (kotlin.text.c.x(strConcat2, "https://", false)) {
                                i7 = 0;
                                sb2.setLength(i7);
                                sb2.append(strConcat2);
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c2 = '/';
                                } else {
                                    c2 = '/';
                                    sb2.append('/');
                                }
                                sb2.append(StringsKt.y0(strConcat2, c2));
                            }
                        }
                        arrayList4.add(new fih((gi9Var == null || (d = gi9Var.f11334a) == null) ? 0.0d : d.doubleValue(), (gi9Var == null || (num6 = gi9Var.b) == null) ? 0 : num6.intValue(), str12, sb2.toString()));
                    }
                }
                if (arrayList4 == 0) {
                    arrayList4 = iun.f15405a;
                }
                ?? r29 = arrayList4;
                List<psf> list6 = mh9Var.k;
                if (list6 != null) {
                    arrayList5 = new ArrayList();
                    for (psf psfVar : list6) {
                        psfVar.getClass();
                        List<vsf> list7 = psfVar.b;
                        if (list7 == null || list7.isEmpty()) {
                            h0hVar = null;
                        } else {
                            String str14 = psfVar.f27513a;
                            if (str14 == null) {
                                str14 = "";
                            }
                            ArrayList arrayList10 = new ArrayList(r3d.q(list7, 10));
                            for (vsf vsfVar : list7) {
                                vsfVar.getClass();
                                Long l6 = vsfVar.f37947a;
                                usf usfVar = vsfVar.f;
                                long jLongValue3 = l6 != null ? l6.longValue() : 0L;
                                Long l7 = vsfVar.b;
                                long jLongValue4 = l7 != null ? l7.longValue() : 0L;
                                String str15 = vsfVar.c;
                                String str16 = str15 == null ? "" : str15;
                                StringBuilder sb3 = new StringBuilder(ujn.h);
                                String str17 = vsfVar.e;
                                if (str17 == null && (str17 = vsfVar.d) == null) {
                                    str17 = "";
                                }
                                String strConcat3 = "cyberstatistic/v1/image/".concat(str17);
                                if (strConcat3.length() == 0) {
                                    i = 0;
                                    sb3.setLength(0);
                                } else {
                                    i = 0;
                                    if (StringsKt.O(strConcat3, ujn.h, false)) {
                                        sb3.setLength(i);
                                        sb3.append(strConcat3);
                                    } else if (kotlin.text.c.x(strConcat3, "https://", false)) {
                                        i = 0;
                                        sb3.setLength(i);
                                        sb3.append(strConcat3);
                                    } else {
                                        if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                            c = '/';
                                        } else {
                                            c = '/';
                                            sb3.append('/');
                                        }
                                        i = 0;
                                        sb3.append(StringsKt.y0(strConcat3, c));
                                    }
                                }
                                arrayList10.add(new k0h((usfVar == null || (num5 = usfVar.f36207a) == null) ? i : num5.intValue(), (usfVar == null || (num4 = usfVar.b) == null) ? i : num4.intValue(), (usfVar == null || (num3 = usfVar.c) == null) ? i : num3.intValue(), (usfVar == null || (num2 = usfVar.d) == null) ? i : num2.intValue(), (usfVar == null || (num = usfVar.e) == null) ? i : num.intValue(), jLongValue3, jLongValue4, str16, sb3.toString()));
                            }
                            h0hVar = new h0h(str14, arrayList10);
                        }
                        if (h0hVar != null) {
                            arrayList5.add(h0hVar);
                        }
                    }
                } else {
                    arrayList5 = 0;
                }
                if (arrayList5 == 0) {
                    arrayList5 = iun.f15405a;
                }
                oh9Var.f25256a.f23522a.o(null, new cqk0(new jh9(n0Var, r26, r27, r28, r29, arrayList5)));
                return Unit.f46060a;
            case 3:
                gkc gkcVar = (gkc) obj2;
                wne wneVar4 = wne.f39444a;
                boolean z4 = u52Var.j;
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        objA3 = obj;
                    } else {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                z1x.P(obj);
                wsf0 wsf0Var = gkcVar.f11438a;
                String strC2 = gkcVar.c.c();
                int i8 = u52Var.k;
                u52Var.j = true;
                objA3 = ((pkc) ((sza) wsf0Var.b).invoke()).a(strC2, 0L, i8, "application/vnd.xenvelop+json", this);
                u52Var = this;
                if (objA3 == wneVar4) {
                    return wneVar4;
                }
                List<wkc> list8 = ((ykc) ((dx5) objA3).a()).c;
                if (list8 != null) {
                    ArrayList arrayList11 = new ArrayList(r3d.q(list8, 10));
                    for (wkc wkcVar : list8) {
                        wkcVar.getClass();
                        Integer num15 = wkcVar.f39301a;
                        if (num15 == null) {
                            jf4.k(null);
                            return null;
                        }
                        int iIntValue = num15.intValue();
                        String str18 = wkcVar.b;
                        if (str18 == null) {
                            jf4.k(null);
                            return null;
                        }
                        arrayList11.add(new skc(iIntValue, str18));
                    }
                    randomAccess = arrayList11;
                } else {
                    randomAccess = null;
                }
                int i9 = u52Var.k;
                fkc fkcVar = gkcVar.b;
                RandomAccess randomAccess2 = randomAccess == null ? iun.f15405a : randomAccess;
                fkcVar.getClass();
                randomAccess2.getClass();
                fkcVar.f9684a.put(Integer.valueOf(i9), randomAccess2);
                return randomAccess == null ? iun.f15405a : randomAccess;
            case 4:
                k8g k8gVar = (k8g) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z5 = u52Var.j;
                if (!z5) {
                    z1x.P(obj);
                    Object value3 = k8gVar.i.getValue();
                    ll9 ll9Var = value3 instanceof ll9 ? (ll9) value3 : null;
                    if (ll9Var != null) {
                        Date date = (Date) CollectionsKt.W(u52Var.k, ll9Var.f20236a.c);
                        if (date == null) {
                            return Unit.f46060a;
                        }
                        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
                        calendar.setTimeInMillis(date.getTime());
                        z1u z1uVar = k8gVar.e;
                        c5g c5gVar = new c5g(calendar.get(1), calendar.get(2), calendar.getActualMinimum(5), calendar.getActualMinimum(5), yag.d, true);
                        u52Var.j = true;
                        if (z1uVar.a(c5gVar, u52Var) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = u52Var.j;
                if (z6) {
                    if (z6) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                jzj jzjVarI = ((rzj) obj2).n().i(u52Var.k);
                u52Var.j = true;
                Object objQ = ((odd) jzjVarI).q(u52Var);
                return objQ == wneVar6 ? wneVar6 : objQ;
            case 6:
                jyk jykVar = (jyk) obj2;
                wne wneVar7 = wne.f39444a;
                boolean z7 = u52Var.j;
                if (z7) {
                    if (z7) {
                        z1x.P(obj);
                        objA4 = obj;
                    } else {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                z1x.P(obj);
                yqc yqcVar = jykVar.f17363a;
                knf0 knf0Var2 = jykVar.c;
                int i10 = u52Var.k;
                String strC3 = knf0Var2.c();
                knf0Var2.getClass();
                u52Var.j = true;
                objA4 = ((fyk) ((sza) yqcVar.b).invoke()).a(i10, strC3, 1, "application/vnd.xenvelop+json", u52Var);
                if (objA4 == wneVar7) {
                    return wneVar7;
                }
                Iterable<eyk> iterable = (Iterable) ((q16) objA4).a();
                ArrayList arrayList12 = new ArrayList(r3d.q(iterable, 10));
                for (eyk eykVar : iterable) {
                    eykVar.getClass();
                    Integer num16 = eykVar.f8632a;
                    if (num16 == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue2 = num16.intValue();
                    String str19 = eykVar.b;
                    if (str19 == null) {
                        str19 = "";
                    }
                    Integer num17 = eykVar.c;
                    arrayList12.add(new wxk(iIntValue2, num17 != null ? num17.intValue() : 0, str19));
                }
                int i11 = u52Var.k;
                gyk gykVar = jykVar.b;
                gykVar.getClass();
                gykVar.f12133a.put(Integer.valueOf(i11), arrayList12);
                return arrayList12;
            case 7:
                pmi pmiVar = (pmi) obj2;
                knf0 knf0Var3 = (knf0) pmiVar.d;
                wne wneVar8 = wne.f39444a;
                boolean z8 = u52Var.j;
                if (z8) {
                    if (z8) {
                        z1x.P(obj);
                        objA5 = obj;
                    } else {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                z1x.P(obj);
                lrc lrcVar = (lrc) pmiVar.b;
                int i12 = u52Var.k;
                String strC4 = knf0Var3.c();
                knf0Var3.getClass();
                u52Var.j = true;
                objA5 = ((hyk) ((sza) lrcVar.b).invoke()).a(i12, strC4, 1, "application/vnd.xenvelop+json", u52Var);
                if (objA5 == wneVar8) {
                    return wneVar8;
                }
                Iterable<byk> iterable2 = (Iterable) ((q16) objA5).a();
                ArrayList arrayList13 = new ArrayList(r3d.q(iterable2, 10));
                for (byk bykVar : iterable2) {
                    bykVar.getClass();
                    Integer num18 = bykVar.f3423a;
                    if (num18 == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue3 = num18.intValue();
                    String str20 = bykVar.b;
                    if (str20 == null) {
                        str20 = "";
                    }
                    Integer num19 = bykVar.c;
                    arrayList13.add(new xxk(iIntValue3, num19 != null ? num19.intValue() : 0, str20));
                }
                ((iyk) pmiVar.c).f15593a.put(Integer.valueOf(u52Var.k), arrayList13);
                return arrayList13;
            case 8:
                l6l l6lVar = (l6l) obj2;
                wne wneVar9 = wne.f39444a;
                boolean z9 = u52Var.j;
                if (!z9) {
                    z1x.P(obj);
                    rrc rrcVar = l6lVar.b;
                    int i13 = u52Var.k;
                    String strC5 = l6lVar.c.c();
                    u52Var.j = true;
                    objZ = rrcVar.z(i13, u52Var, strC5);
                    if (objZ == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objZ = obj;
                }
                f5l f5lVar = (f5l) objZ;
                f5lVar.getClass();
                Long l8 = f5lVar.f8966a;
                Long l9 = f5lVar.f;
                String str21 = f5lVar.e;
                String str22 = f5lVar.d;
                String str23 = f5lVar.c;
                if (l8 == null && f5lVar.b == null && str23 == null && str22 == null && str21 == null && l9 == null) {
                    n0Var2 = m0Var;
                } else {
                    Long l10 = f5lVar.b;
                    String str24 = str23 == null ? "" : str23;
                    String str25 = str22 == null ? "" : str22;
                    String str26 = str21 == null ? "" : str21;
                    if (l9 != null) {
                        DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols2.setGroupingSeparator(' ');
                        strK2 = kng0.k("$ ", new DecimalFormat("#,###", decimalFormatSymbols2).format(l9.longValue()));
                    } else {
                        strK2 = "";
                    }
                    n0Var2 = new n0(l8, l10, str24, str25, str26, strK2, false);
                }
                List<d6l> list9 = f5lVar.g;
                if (list9 != null) {
                    ArrayList arrayList14 = new ArrayList(r3d.q(list9, 10));
                    for (d6l d6lVar : list9) {
                        d6lVar.getClass();
                        String str27 = d6lVar.f5554a;
                        if (str27 == null) {
                            str27 = "";
                        }
                        Integer num20 = d6lVar.b;
                        int iIntValue4 = num20 != null ? num20.intValue() : 0;
                        Integer num21 = d6lVar.c;
                        int iIntValue5 = num21 != null ? num21.intValue() : 0;
                        StringBuilder sb4 = new StringBuilder(ujn.h);
                        String str28 = d6lVar.e;
                        if (str28 == null && (str28 = d6lVar.f) == null) {
                            str28 = "";
                        }
                        String strConcat4 = "cyberstatistic/v1/image/".concat(str28);
                        if (strConcat4.length() == 0) {
                            sb4.setLength(0);
                        } else {
                            if (StringsKt.O(strConcat4, ujn.h, false)) {
                                i2 = 0;
                            } else if (kotlin.text.c.x(strConcat4, "https://", false)) {
                                i2 = 0;
                            } else {
                                if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                    i3 = 1;
                                    c7 = '/';
                                } else {
                                    sb4.append('/');
                                    c7 = '/';
                                    i3 = 1;
                                }
                                char[] cArr = new char[i3];
                                cArr[0] = c7;
                                sb4.append(StringsKt.y0(strConcat4, cArr));
                            }
                            sb4.setLength(i2);
                            sb4.append(strConcat4);
                        }
                        arrayList14.add(new a6l(str27, iIntValue4, iIntValue5, sb4.toString()));
                    }
                    ArrayList arrayList15 = new ArrayList();
                    for (Object obj3 : arrayList14) {
                        if (((a6l) obj3).f322a.length() > 0) {
                            arrayList15.add(obj3);
                        }
                    }
                    List listA0 = CollectionsKt.A0(arrayList15, new e3l((byte) 8));
                    if (listA0 != null) {
                        listD1 = CollectionsKt.D0(listA0, 10);
                    } else {
                        listD1 = null;
                    }
                } else {
                    listD1 = null;
                }
                if (listD1 == null) {
                    listD1 = iun.f15405a;
                }
                List list10 = listD1;
                List list11 = f5lVar.k;
                if (list11 != null) {
                    arrayList6 = new ArrayList(r3d.q(list11, 10));
                    Iterator it2 = list11.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(g7x.d0((hxb0) it2.next()));
                    }
                } else {
                    arrayList6 = 0;
                }
                if (arrayList6 == 0) {
                    arrayList6 = iun.f15405a;
                }
                ?? r210 = arrayList6;
                List<tal> list12 = f5lVar.j;
                if (list12 != null) {
                    arrayList7 = new ArrayList(r3d.q(list12, 10));
                    for (tal talVar : list12) {
                        talVar.getClass();
                        Long l11 = talVar.f33617a;
                        long jLongValue5 = l11 != null ? l11.longValue() : 0L;
                        Long l12 = talVar.b;
                        long jLongValue6 = l12 != null ? l12.longValue() : 0L;
                        Boolean bool2 = talVar.c;
                        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        StringBuilder sb5 = new StringBuilder(ujn.h);
                        String str29 = talVar.e;
                        if (str29 == null && (str29 = talVar.d) == null) {
                            str29 = "";
                        }
                        String strConcat5 = "cyberstatistic/v1/image/".concat(str29);
                        if (strConcat5.length() == 0) {
                            sb5.setLength(0);
                        } else {
                            int i14 = 0;
                            if (StringsKt.O(strConcat5, ujn.h, false)) {
                                sb5.setLength(i14);
                                sb5.append(strConcat5);
                            } else if (kotlin.text.c.x(strConcat5, "https://", false)) {
                                i14 = 0;
                                sb5.setLength(i14);
                                sb5.append(strConcat5);
                            } else {
                                if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                    c6 = '/';
                                } else {
                                    c6 = '/';
                                    sb5.append('/');
                                }
                                sb5.append(StringsKt.y0(strConcat5, c6));
                            }
                        }
                        String string2 = sb5.toString();
                        String str30 = talVar.f;
                        String str31 = str30 == null ? "" : str30;
                        Integer num22 = talVar.g;
                        arrayList7.add(new ghh(num22 != null ? num22.intValue() : 0, jLongValue5, jLongValue6, string2, str31, zBooleanValue2));
                    }
                } else {
                    arrayList7 = 0;
                }
                if (arrayList7 == 0) {
                    arrayList7 = iun.f15405a;
                }
                ?? r211 = arrayList7;
                List list13 = f5lVar.i;
                if (list13 == null || (listD2 = CollectionsKt.D0(list13, 10)) == null) {
                    arrayList8 = 0;
                } else {
                    arrayList8 = new ArrayList(r3d.q(listD2, 10));
                    for (qal qalVar : listD2) {
                        qalVar.getClass();
                        String str32 = qalVar.d;
                        r5l r5lVar = qalVar.c;
                        String str33 = str32 == null ? "" : str32;
                        StringBuilder sb6 = new StringBuilder(ujn.h);
                        String str34 = qalVar.f;
                        if (str34 == null && (str34 = qalVar.e) == null) {
                            str34 = "";
                        }
                        String strConcat6 = "cyberstatistic/v1/image/".concat(str34);
                        if (strConcat6.length() == 0) {
                            sb6.setLength(0);
                        } else {
                            int i15 = 0;
                            if (StringsKt.O(strConcat6, ujn.h, false)) {
                                sb6.setLength(i15);
                                sb6.append(strConcat6);
                            } else if (kotlin.text.c.x(strConcat6, "https://", false)) {
                                i15 = 0;
                                sb6.setLength(i15);
                                sb6.append(strConcat6);
                            } else {
                                if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                                    c5 = '/';
                                } else {
                                    c5 = '/';
                                    sb6.append('/');
                                }
                                sb6.append(StringsKt.y0(strConcat6, c5));
                            }
                        }
                        String string3 = sb6.toString();
                        int iIntValue6 = (r5lVar == null || (num13 = r5lVar.c) == null) ? 0 : num13.intValue();
                        int iIntValue7 = (r5lVar == null || (num12 = r5lVar.f29891a) == null) ? 0 : num12.intValue();
                        Double d2 = qalVar.b;
                        arrayList8.add(new gih(str33, string3, iIntValue6, iIntValue7, d2 != null ? d2.doubleValue() : 0.0d));
                    }
                }
                if (arrayList8 == 0) {
                    arrayList8 = iun.f15405a;
                }
                ?? r30 = arrayList8;
                List<s3l> list14 = f5lVar.h;
                if (list14 != null) {
                    arrayList9 = new ArrayList();
                    for (s3l s3lVar : list14) {
                        s3lVar.getClass();
                        List<y3l> list15 = s3lVar.b;
                        if (list15 == null || list15.isEmpty()) {
                            h0hVar2 = null;
                        } else {
                            String str35 = s3lVar.f31563a;
                            if (str35 == null) {
                                str35 = "";
                            }
                            ArrayList arrayList16 = new ArrayList(r3d.q(list15, 10));
                            for (y3l y3lVar : list15) {
                                y3lVar.getClass();
                                Long l13 = y3lVar.f41956a;
                                x3l x3lVar = y3lVar.f;
                                long jLongValue7 = l13 != null ? l13.longValue() : 0L;
                                Long l14 = y3lVar.b;
                                long jLongValue8 = l14 != null ? l14.longValue() : 0L;
                                String str36 = y3lVar.e;
                                String str37 = str36 == null ? "" : str36;
                                StringBuilder sb7 = new StringBuilder(ujn.h);
                                String str38 = y3lVar.d;
                                if (str38 == null && (str38 = y3lVar.c) == null) {
                                    str38 = "";
                                }
                                String strConcat7 = "cyberstatistic/v1/image/".concat(str38);
                                if (strConcat7.length() == 0) {
                                    sb7.setLength(0);
                                } else {
                                    int i16 = 0;
                                    if (StringsKt.O(strConcat7, ujn.h, false)) {
                                        sb7.setLength(i16);
                                        sb7.append(strConcat7);
                                    } else if (kotlin.text.c.x(strConcat7, "https://", false)) {
                                        i16 = 0;
                                        sb7.setLength(i16);
                                        sb7.append(strConcat7);
                                    } else {
                                        if (sb7.length() <= 0 || StringsKt.S(sb7, Separators.SLASH)) {
                                            c4 = '/';
                                        } else {
                                            c4 = '/';
                                            sb7.append('/');
                                        }
                                        sb7.append(StringsKt.y0(strConcat7, c4));
                                    }
                                }
                                arrayList16.add(new l0h((x3lVar == null || (num11 = x3lVar.f40225a) == null) ? 0 : num11.intValue(), (x3lVar == null || (num10 = x3lVar.b) == null) ? 0 : num10.intValue(), (x3lVar == null || (num9 = x3lVar.d) == null) ? 0 : num9.intValue(), (x3lVar == null || (num8 = x3lVar.e) == null) ? 0 : num8.intValue(), (x3lVar == null || (num7 = x3lVar.c) == null) ? 0 : num7.intValue(), jLongValue7, jLongValue8, str37, sb7.toString()));
                            }
                            h0hVar2 = new h0h(str35, CollectionsKt.A0(arrayList16, new e3l((byte) 0)));
                        }
                        if (h0hVar2 != null) {
                            arrayList9.add(h0hVar2);
                        }
                    }
                } else {
                    arrayList9 = 0;
                }
                if (arrayList9 == 0) {
                    arrayList9 = iun.f15405a;
                }
                l6lVar.f19511a.f22948a.o(null, new cqk0(new b5l(n0Var2, list10, r210, r211, r30, arrayList9)));
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z10 = u52Var.j;
                if (z10) {
                    if (z10) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                esg0 esg0Var2 = ((ccl) obj2).f4117a;
                int i17 = u52Var.k;
                u52Var.j = true;
                Object objD0 = qjj.d0(((mne) esg0Var2.d).b, new u52(esg0Var2, i17, yjeVar, b2), u52Var);
                return objD0 == wneVar10 ? wneVar10 : objD0;
            case 10:
                ebq ebqVar = (ebq) obj2;
                int i18 = u52Var.k;
                wne wneVar11 = wne.f39444a;
                boolean z11 = u52Var.j;
                if (!z11) {
                    z1x.P(obj);
                    bby bbyVar = ebqVar.d0;
                    if (bbyVar != null) {
                        u52Var.k = i18;
                        u52Var.j = true;
                        if (zvw.H(bbyVar, u52Var) == wneVar11) {
                            return wneVar11;
                        }
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i19 = ebq.f0;
                p7m0 p7m0Var = ebqVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, oaq.a((oaq) value, null, false, Integer.valueOf(i18), null, null, null, null, false, false, 0, null, false, 4091)));
                ebqVar.o.e("INSTRUMENT_ID_KEY", new Integer(i18));
                ebqVar.Q();
                return Unit.f46060a;
            case 11:
                return l(obj);
            case 12:
                return m(obj);
            case 13:
                return o(obj);
            case 14:
                return r(obj);
            case 15:
                return s(obj);
            case 16:
                return t(obj);
            case 17:
                return x(obj);
            case 18:
                return y(obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return G(obj);
            case 20:
                return H(obj);
            case 21:
                return I(obj);
            case 22:
                return J(obj);
            case 23:
                return K(obj);
            case 24:
                return L(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return M(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Q(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return R(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return S(obj);
            default:
                zvr0 zvr0Var = (zvr0) obj2;
                wne wneVar12 = wne.f39444a;
                boolean z12 = u52Var.j;
                if (!z12) {
                    z1x.P(obj);
                    ctu ctuVar = zvr0Var.u;
                    int i20 = u52Var.k;
                    u52Var.j = true;
                    if (ctuVar.a(i20, u52Var) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                lmr0 lmr0VarR = zvr0Var.s.f4960a.r();
                String strN = zvr0Var.N();
                p7m0 p7m0Var2 = zvr0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    uvr0Var = (uvr0) value2;
                    vvr0Var = uvr0Var.f36362a;
                } while (!p7m0Var2.m(value2, uvr0.a(uvr0Var, vvr0.a(vvr0Var, strN, mtr0.a(vvr0Var.b, null, lmr0VarR.b, false, 13), null, 4), null, false, 0, 0L, null, null, null, 478)));
                zvr0Var.P(true);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(rzj rzjVar, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.l = rzjVar;
        this.k = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(pzu pzuVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        this.l = pzuVar;
        this.k = (int) j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(int i, tpn0 tpn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        this.k = i;
        this.l = tpn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u52(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u52(Object obj, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = i;
    }
}
