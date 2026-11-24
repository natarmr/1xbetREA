package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class lea0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19893a = 2;
    public final g2v b;
    public final ctf0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    public lea0(zda0 zda0Var, g2v g2vVar, ctf0 ctf0Var) {
        kda0 kda0Var;
        Object obj;
        final byte b = 0;
        ctf0Var.getClass();
        this.b = g2vVar;
        this.c = ctf0Var;
        this.d = maz.b(new yw9(null, new caz(this, (byte) 11), (byte) 20));
        j0g0 j0g0Var = zda0Var.b;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            jda0 jda0Var = (jda0) (obj2 instanceof g0g0 ? null : obj2);
            if (jda0Var != null) {
                kda0Var = jda0Var.f16319a;
            } else {
                kda0Var = null;
            }
        } else {
            kda0Var = null;
        }
        this.e = maz.b(new yw9(kda0Var, new Function1(this) { // from class: a.kea0
            public final /* synthetic */ lea0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                byte b2 = b;
                int i = 1;
                lea0 lea0Var = this.b;
                switch (b2) {
                    case 0:
                        kda0 kda0Var2 = (kda0) obj3;
                        if (kda0Var2 == null) {
                            return null;
                        }
                        ctf0 ctf0Var2 = lea0Var.c;
                        ctf0Var2.getClass();
                        n0x n0xVar = new n0x(lmc.E(kda0Var2.d));
                        n0x n0xVar2 = new n0x(lmc.E(kda0Var2.e));
                        String str = kda0Var2.f18096a;
                        String str2 = kda0Var2.b;
                        int i2 = kda0Var2.f;
                        return new rhs0(n0xVar, n0xVar2, str, str2, i2 != -1 ? kng0.l(ctf0Var2.b.a(R.string.prizes_money_statistic, Arrays.copyOf(new Object[0], 0)), ": ", kotlin.text.c.r(String.format(Locale.US, kda0Var2.g ? "$%,d" : "%,d$", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)), Separators.COMMA, Separators.SP, false)) : "");
                    default:
                        List list = (List) obj3;
                        list.getClass();
                        ctf0 ctf0Var3 = lea0Var.c;
                        ctf0Var3.getClass();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            fea0 fea0Var = (fea0) obj4;
                            if (fea0Var.c.f18096a.length() > 0 && fea0Var.b > 0) {
                                aea0 aea0Var = fea0Var.d;
                                String str3 = aea0Var.b;
                                fks0 fks0Var = aea0Var.e;
                                if (str3.length() > 0 || fks0Var.a() || fks0Var == fks0.Retirement) {
                                    aea0 aea0Var2 = fea0Var.e;
                                    String str4 = aea0Var2.b;
                                    fks0 fks0Var2 = aea0Var2.e;
                                    if (str4.length() > 0 || fks0Var2.a() || fks0Var2 == fks0.Retirement) {
                                        arrayList.add(obj4);
                                    }
                                }
                            }
                        }
                        List listA0 = CollectionsKt.A0(arrayList, new lk30((byte) 18));
                        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
                        int i3 = 0;
                        for (Object obj5 : listA0) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            fea0 fea0Var2 = (fea0) obj5;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i3);
                            sb.append(ica0.class);
                            String string = sb.toString();
                            long j = fea0Var2.b;
                            aea0 aea0Var3 = fea0Var2.d;
                            Calendar calendar = Calendar.getInstance();
                            rdj rdjVar = rdj.f30294a;
                            calendar.setTime(rdj.k(j));
                            jcm jcmVar = new jcm(new SimpleDate(calendar.get(i), calendar.get(2) + i, calendar.get(5)));
                            ucm ucmVarT = w9x.T(aea0Var3, ctf0Var3, w9x.S(aea0Var3, true));
                            aea0 aea0Var4 = fea0Var2.e;
                            arrayList2.add(new ica0(string, new ycm(new icm(jcmVar, new xcm(ucmVarT, w9x.T(aea0Var4, ctf0Var3, w9x.S(aea0Var4, aea0Var3.b.length() > 0)))))));
                            i3 = i4;
                            i = 1;
                        }
                        return arrayList2;
                }
            }
        }, (byte) 20));
        if (j0g0Var != null) {
            Object obj3 = j0g0Var.f15681a;
            jda0 jda0Var2 = (jda0) (obj3 instanceof g0g0 ? null : obj3);
            obj = (jda0Var2 == null || (obj = jda0Var2.b) == null) ? iun.f15405a : obj;
        }
        final byte b2 = 1;
        this.f = maz.b(new yw9(obj, new Function1(this) { // from class: a.kea0
            public final /* synthetic */ lea0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                byte b3 = b2;
                int i = 1;
                lea0 lea0Var = this.b;
                switch (b3) {
                    case 0:
                        kda0 kda0Var2 = (kda0) obj4;
                        if (kda0Var2 == null) {
                            return null;
                        }
                        ctf0 ctf0Var2 = lea0Var.c;
                        ctf0Var2.getClass();
                        n0x n0xVar = new n0x(lmc.E(kda0Var2.d));
                        n0x n0xVar2 = new n0x(lmc.E(kda0Var2.e));
                        String str = kda0Var2.f18096a;
                        String str2 = kda0Var2.b;
                        int i2 = kda0Var2.f;
                        return new rhs0(n0xVar, n0xVar2, str, str2, i2 != -1 ? kng0.l(ctf0Var2.b.a(R.string.prizes_money_statistic, Arrays.copyOf(new Object[0], 0)), ": ", kotlin.text.c.r(String.format(Locale.US, kda0Var2.g ? "$%,d" : "%,d$", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)), Separators.COMMA, Separators.SP, false)) : "");
                    default:
                        List list = (List) obj4;
                        list.getClass();
                        ctf0 ctf0Var3 = lea0Var.c;
                        ctf0Var3.getClass();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list) {
                            fea0 fea0Var = (fea0) obj5;
                            if (fea0Var.c.f18096a.length() > 0 && fea0Var.b > 0) {
                                aea0 aea0Var = fea0Var.d;
                                String str3 = aea0Var.b;
                                fks0 fks0Var = aea0Var.e;
                                if (str3.length() > 0 || fks0Var.a() || fks0Var == fks0.Retirement) {
                                    aea0 aea0Var2 = fea0Var.e;
                                    String str4 = aea0Var2.b;
                                    fks0 fks0Var2 = aea0Var2.e;
                                    if (str4.length() > 0 || fks0Var2.a() || fks0Var2 == fks0.Retirement) {
                                        arrayList.add(obj5);
                                    }
                                }
                            }
                        }
                        List listA0 = CollectionsKt.A0(arrayList, new lk30((byte) 18));
                        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
                        int i3 = 0;
                        for (Object obj6 : listA0) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            fea0 fea0Var2 = (fea0) obj6;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i3);
                            sb.append(ica0.class);
                            String string = sb.toString();
                            long j = fea0Var2.b;
                            aea0 aea0Var3 = fea0Var2.d;
                            Calendar calendar = Calendar.getInstance();
                            rdj rdjVar = rdj.f30294a;
                            calendar.setTime(rdj.k(j));
                            jcm jcmVar = new jcm(new SimpleDate(calendar.get(i), calendar.get(2) + i, calendar.get(5)));
                            ucm ucmVarT = w9x.T(aea0Var3, ctf0Var3, w9x.S(aea0Var3, true));
                            aea0 aea0Var4 = fea0Var2.e;
                            arrayList2.add(new ica0(string, new ycm(new icm(jcmVar, new xcm(ucmVarT, w9x.T(aea0Var4, ctf0Var3, w9x.S(aea0Var4, aea0Var3.b.length() > 0)))))));
                            i3 = i4;
                            i = 1;
                        }
                        return arrayList2;
                }
            }
        }, (byte) 20));
    }

    private final Object a(Object obj) {
        xda0 xda0Var;
        zda0 zda0Var = (zda0) obj;
        zda0Var.getClass();
        zbk zbkVar = ((fee) this.d.getValue()).e;
        j0g0 j0g0Var = zda0Var.b;
        long j = zda0Var.f44203a.f46566a;
        qw80 qw80Var = new qw80(this, zda0Var, (byte) 17);
        tda0 tda0Var = tda0.f33759a;
        if (j0g0Var != null) {
            Object g0g0Var = j0g0Var.f15681a;
            boolean z = g0g0Var instanceof g0g0;
            g2v g2vVar = this.b;
            if (!z) {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    a4x a4xVar = (a4x) qw80Var.invoke();
                    List list = ((jda0) g0g0Var).b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        fea0 fea0Var = (fea0) obj2;
                        if (fea0Var.d.b.length() > 0 || fea0Var.e.b.length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    g0g0Var = (arrayList.isEmpty() || a4xVar.isEmpty()) ? new xda0(new uda0(g2v.b(g2vVar, ozb.N(40L, j), null, null, 0, 0, R.string.currently_no_events, 0, 0, 0L, 0L, 990))) : new xda0(tda0Var, a4xVar, false);
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
            }
            if (j0g0.a(g0g0Var) != null) {
                g0g0Var = new xda0(new uda0(g2v.b(g2vVar, ozb.N(40L, j), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)));
            }
            xda0Var = (xda0) g0g0Var;
        } else {
            zcm zcmVar = zcm.f44174a;
            xda0Var = new xda0(tda0Var, dyb.g0(shs0.f32229a, new ica0("PLAYER_TRANSFER_CARD_SKELETON_KEY_1", zcmVar), new ica0("PLAYER_TRANSFER_CARD_SKELETON_KEY_2", zcmVar), new ica0("PLAYER_TRANSFER_CARD_SKELETON_KEY_3", zcmVar), new ica0("PLAYER_TRANSFER_CARD_SKELETON_KEY_4", zcmVar), new ica0("PLAYER_TRANSFER_CARD_SKELETON_KEY_5", zcmVar), new ica0("PLAYER_TRANSFER_CARD_SKELETON_KEY_6", zcmVar)), true);
        }
        return new jea0(zbkVar, xda0Var);
    }

    private final Object b(Object obj) {
        e7e0 e7e0Var;
        o7e0 o7e0Var = (o7e0) obj;
        o7e0Var.getClass();
        n0o0 n0o0Var = this.e;
        fee feeVar = (fee) n0o0Var.getValue();
        feeVar.getClass();
        pz40 pz40VarA = feeVar.a();
        ((o7e0) feeVar.a().getValue()).getClass();
        pz40VarA.setValue(o7e0Var);
        zbk zbkVar = ((fee) this.d.getValue()).e;
        zbk zbkVar2 = ((fee) n0o0Var.getValue()).e;
        j0g0 j0g0Var = o7e0Var.d;
        g2v g2vVar = this.b;
        if (j0g0Var != null || o7e0Var.e) {
            b7e0 b7e0Var = b7e0.f2105a;
            if (j0g0Var == null) {
                ArrayList arrayList = new ArrayList(10);
                for (int i = 0; i < 10; i++) {
                    arrayList.add(new c6e0(String.valueOf(i), hoh.f13393a));
                }
                e7e0Var = new e7e0(b7e0Var, dyb.o0(arrayList));
            } else {
                Object obj2 = j0g0Var.f15681a;
                if (obj2 instanceof g0g0) {
                    e7e0Var = new e7e0(new c7e0(yyw.N(g2vVar, ldm.f19857a)));
                } else {
                    n0o0 n0o0Var2 = this.f;
                    fee feeVar2 = (fee) n0o0Var2.getValue();
                    feeVar2.getClass();
                    pz40 pz40VarA2 = feeVar2.a();
                    ((List) feeVar2.a().getValue()).getClass();
                    if (obj2 instanceof g0g0) {
                        obj2 = null;
                    }
                    Object obj3 = (List) obj2;
                    if (obj3 == null) {
                        obj3 = iun.f15405a;
                    }
                    pz40VarA2.setValue(obj3);
                    e7e0Var = ((a4x) ((fee) n0o0Var2.getValue()).b()).isEmpty() ? new e7e0(new c7e0(yyw.M(g2vVar))) : new e7e0(b7e0Var, (a4x) ((fee) n0o0Var2.getValue()).b());
                }
            }
        } else {
            e7e0Var = new e7e0(new c7e0(yyw.N(g2vVar, ldm.f19857a)));
        }
        return new j9e0(zbkVar, zbkVar2, e7e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:102:0x0203  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:106:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0223  */
    /* JADX WARN: Code duplicated, block: B:109:0x0231  */
    /* JADX WARN: Code duplicated, block: B:113:0x0246  */
    /* JADX WARN: Code duplicated, block: B:118:0x0275  */
    /* JADX WARN: Code duplicated, block: B:123:0x0290  */
    /* JADX WARN: Code duplicated, block: B:124:0x0293  */
    /* JADX WARN: Code duplicated, block: B:127:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:141:0x030f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0313 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x0315  */
    /* JADX WARN: Code duplicated, block: B:145:0x0318  */
    /* JADX WARN: Code duplicated, block: B:147:0x031c  */
    /* JADX WARN: Code duplicated, block: B:148:0x031f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0323  */
    /* JADX WARN: Code duplicated, block: B:152:0x0327  */
    /* JADX WARN: Code duplicated, block: B:153:0x032a  */
    /* JADX WARN: Code duplicated, block: B:155:0x032e  */
    /* JADX WARN: Code duplicated, block: B:158:0x034b  */
    /* JADX WARN: Code duplicated, block: B:161:0x035b  */
    /* JADX WARN: Code duplicated, block: B:164:0x036b  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:301:0x08de  */
    /* JADX WARN: Code duplicated, block: B:305:0x08f3 A[LOOP:13: B:303:0x08ed->B:305:0x08f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:308:0x0909 A[LOOP:14: B:307:0x0907->B:308:0x0909, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:476:0x0e77  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:555:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[LOOP:4: B:92:0x01d8->B:559:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0132  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x0169  */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[LOOP:3: B:69:0x0172->B:74:0x018c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    /* JADX WARN: Code duplicated, block: B:81:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v60, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v62, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v97, types: [a.lc00, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.nsm0] */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v73, types: [a.zjh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r9v19, types: [a.ycl] */
    /* JADX WARN: Type inference failed for: r9v20, types: [a.ycl] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [a.ycl] */
    /* JADX WARN: Type inference failed for: r9v27 */
    @Override // a.v6t0
    public final Object invoke(Object obj) throws Throwable {
        List list;
        Integer num;
        int i;
        boolean z;
        Throwable th;
        ?? nxr0Var;
        jjh gjhVar;
        ?? r1;
        List list2;
        List list3;
        i4 i4VarR0;
        String str;
        String str2;
        String str3;
        String str4;
        List listJ;
        float f;
        Object objB;
        ycl yclVar;
        float f2;
        ArrayList arrayList;
        Pair pair;
        Map map;
        float f3;
        float f4;
        float fIntValue;
        int i2;
        String str5;
        String str6;
        Integer num2;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        HashMap map2;
        Iterable iterable;
        lc00 lc00Var;
        Iterator it;
        int i3;
        List list4;
        ojh ojhVar;
        List list5;
        List list6;
        a4x a4xVar;
        yih yihVar;
        a4x a4xVar2;
        r5s0 r5s0Var;
        List list7;
        Iterator it2;
        ycl yclVar2;
        ycl yclVar3;
        float f5;
        float f6;
        int iB;
        int i4;
        ListIterator listIterator;
        float f7;
        int iNextIndex;
        ?? ValueOf;
        float f8;
        ?? r6;
        int iIntValue;
        ListIterator listIterator2;
        int iNextIndex2;
        ?? r5;
        Map mapB;
        yih yihVar2;
        r5s0 r5s0Var2;
        a4x a4xVar3;
        ArrayList arrayListA;
        a4x a4xVar4;
        ArrayList arrayList2;
        Iterator it3;
        ?? yclVar4;
        ycl yclVar5;
        float f9;
        ycl yclVar6;
        ycl yclVar7;
        ArrayList arrayList3;
        Iterator it4;
        int iB2;
        int i5;
        rwr0 rwr0Var;
        rwr0 rwr0Var2;
        pr8 pr8Var;
        ?? r14;
        ?? r10;
        ycl yclVar8;
        ycl yclVar9;
        ?? B;
        float f10;
        float f11;
        Map mapB2;
        int iIntValue2;
        zjh zjhVar;
        Map map3;
        lea0 lea0Var = this;
        switch (lea0Var.f19893a) {
            case 0:
                return a(obj);
            case 1:
                return b(obj);
            default:
                fmh fmhVar = (fmh) obj;
                fmhVar.getClass();
                fee feeVar = (fee) lea0Var.d.getValue();
                qlh qlhVar = fmhVar.c;
                feeVar.d(qlhVar);
                ((fee) lea0Var.e.getValue()).d(fmhVar.f9781a);
                j0g0 j0g0Var = fmhVar.b;
                Integer num3 = fmhVar.d;
                float f12 = kxr0.f19071a;
                ctf0 ctf0Var = lea0Var.c;
                ctf0Var.getClass();
                if (j0g0Var != null) {
                    Object obj2 = j0g0Var.f15681a;
                    if (obj2 instanceof g0g0) {
                        obj2 = null;
                    }
                    list = (List) obj2;
                } else {
                    list = null;
                }
                if (list == null) {
                    list = iun.f15405a;
                }
                rkh rkhVar = (rkh) CollectionsKt.firstOrNull(list);
                boolean z2 = true;
                if (rkhVar == null || (list3 = rkhVar.r) == null) {
                    num = num3;
                    i = 0;
                    z = true;
                    th = null;
                    lea0Var = this;
                    nxr0Var = th;
                } else {
                    ArrayList arrayListI = hkb.I(list3);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayListI) {
                        if (vsm0.m((xlh) obj3)) {
                            arrayList4.add(obj3);
                        }
                    }
                    xlh xlhVar = (xlh) CollectionsKt.W(num3 != null ? num3.intValue() : 0, arrayList4);
                    if (xlhVar != null) {
                        char c = 2;
                        if (xlhVar instanceof vlh) {
                            if (((vlh) xlhVar).b.isEmpty()) {
                                xlhVar = null;
                            }
                            vlh vlhVar = (vlh) xlhVar;
                            if (vlhVar != null) {
                                List list8 = vlhVar.b;
                                yih yihVar3 = (yih) CollectionsKt.W(0, list8);
                                if (yihVar3 != null) {
                                    lun lunVar = lun.f20680a;
                                    lunVar.getClass();
                                    list6 = list8;
                                    a4xVar = dqm0.m(yihVar3, qlhVar, lunVar, lunVar, ctf0Var, false).c;
                                    if (a4xVar == null) {
                                    }
                                    if (list6.size() < 2) {
                                        num = num3;
                                        j0g0Var = j0g0Var;
                                        i = 0;
                                        z = true;
                                        th = null;
                                        nxr0Var = new mxr0(a4xVar, lak0.c);
                                    } else {
                                        a4xVar.getClass();
                                        List list9 = list6;
                                        yihVar = (yih) CollectionsKt.W(1, list9);
                                        if (yihVar != null) {
                                            lun lunVar2 = lun.f20680a;
                                            lunVar2.getClass();
                                            a4xVar2 = a4xVar;
                                            r5s0Var = dqm0.m(yihVar, qlhVar, lunVar2, lunVar2, ctf0Var, true);
                                        } else {
                                            a4xVar2 = a4xVar;
                                            iun iunVar = iun.f15405a;
                                            r5s0Var = new r5s0(iunVar, iunVar, lak0.c);
                                        }
                                        list7 = r5s0Var.f29904a;
                                        it2 = kxr0.a(a4xVar2).iterator();
                                        if (it2.hasNext()) {
                                            th = null;
                                            yclVar2 = new ycl(ipm0.s(((rwr0) it2.next()).b));
                                            while (it2.hasNext()) {
                                                boolean z3 = z2;
                                                yclVar3 = new ycl(ipm0.s(((rwr0) it2.next()).b));
                                                if (yclVar2.compareTo(yclVar3) < 0) {
                                                    yclVar2 = yclVar3;
                                                }
                                                z2 = z3;
                                            }
                                        } else {
                                            th = null;
                                            yclVar2 = null;
                                        }
                                        z = z2;
                                        if (yclVar2 != null) {
                                            f5 = yclVar2.f42389a;
                                        } else {
                                            zcl zclVar = qmk.f28987a;
                                            f5 = 0.0f;
                                        }
                                        zcl zclVar2 = qmk.f28987a;
                                        f6 = 34.0f;
                                        float f13 = f5 + 34.0f;
                                        iB = si30.b(f13 / kxr0.f19071a);
                                        if (iB < 0) {
                                            i4 = 0;
                                        } else {
                                            i4 = iB;
                                        }
                                        listIterator = list7.listIterator(list7.size());
                                        while (true) {
                                            f7 = f6;
                                            if (listIterator.hasPrevious()) {
                                                iNextIndex = -1;
                                            } else if (((List) listIterator.previous()).isEmpty()) {
                                                f6 = f7;
                                            } else {
                                                iNextIndex = listIterator.nextIndex();
                                            }
                                        }
                                        ValueOf = Integer.valueOf(iNextIndex);
                                        if (iNextIndex < 0) {
                                            ValueOf = th;
                                        }
                                        if (ValueOf != 0) {
                                            iIntValue2 = ValueOf.intValue();
                                            zjhVar = (zjh) CollectionsKt.firstOrNull((List) list7.get(iIntValue2));
                                            if (zjhVar != null) {
                                                f8 = 2.0f;
                                                map3 = (Map) CollectionsKt.W(iIntValue2, r5s0Var.b);
                                                if (map3 != null) {
                                                    r6 = (Integer) map3.get(zjhVar.f44481a);
                                                }
                                            } else {
                                                f8 = 2.0f;
                                            }
                                            r6 = th;
                                        } else {
                                            f8 = 2.0f;
                                            r6 = th;
                                        }
                                        if (r6 != 0) {
                                            iIntValue = r6.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        listIterator2 = list7.listIterator(list7.size());
                                        while (true) {
                                            if (listIterator2.hasPrevious()) {
                                                iNextIndex2 = -1;
                                            } else if (!((List) listIterator2.previous()).isEmpty()) {
                                                iNextIndex2 = listIterator2.nextIndex();
                                            }
                                        }
                                        if (iNextIndex2 == -1) {
                                            r5 = th;
                                        } else {
                                            r5 = (zjh) CollectionsKt.firstOrNull((List) list7.get(iNextIndex2));
                                        }
                                        if (r5 != 0) {
                                            mapB = wp20.b(new Pair(r5.f44481a, Integer.valueOf(iIntValue + i4)));
                                        } else {
                                            mapB = lun.f20680a;
                                            mapB.getClass();
                                        }
                                        yihVar2 = (yih) CollectionsKt.W(0, list9);
                                        if (yihVar2 != null) {
                                            if (r5 != 0) {
                                                mapB2 = wp20.b(new Pair(r5.f44481a, r5));
                                            } else {
                                                mapB2 = lun.f20680a;
                                                mapB2.getClass();
                                            }
                                            r5s0Var2 = r5s0Var;
                                            a4xVar3 = dqm0.m(yihVar2, qlhVar, mapB, mapB2, ctf0Var, false).c;
                                            if (a4xVar3 == null) {
                                            }
                                            float f14 = f13 - (i4 * kxr0.f19071a);
                                            arrayListA = kxr0.a(a4xVar3);
                                            a4xVar4 = r5s0Var2.c;
                                            float f15 = f14 / f8;
                                            a4xVar4.getClass();
                                            int iMax = Math.max(arrayListA.size(), a4xVar4.size());
                                            arrayList2 = new ArrayList();
                                            for (Object obj4 : arrayListA) {
                                                if (((rwr0) obj4).f31230a == pr8.b) {
                                                    arrayList2.add(obj4);
                                                }
                                            }
                                            it3 = arrayList2.iterator();
                                            if (it3.hasNext()) {
                                                yclVar4 = new ycl(ipm0.s(((rwr0) it3.next()).b));
                                                while (it3.hasNext()) {
                                                    yclVar5 = new ycl(ipm0.s(((rwr0) it3.next()).b));
                                                    if (yclVar4.compareTo(yclVar5) < 0) {
                                                        yclVar4 = yclVar5;
                                                    }
                                                }
                                            } else {
                                                yclVar4 = th;
                                            }
                                            if (yclVar4 != 0) {
                                                f9 = yclVar4.f42389a;
                                            } else {
                                                zcl zclVar3 = qmk.f28987a;
                                                f9 = 0.0f;
                                            }
                                            yclVar6 = new ycl((f13 - f9) + f15);
                                            zcl zclVar4 = qmk.f28987a;
                                            yclVar7 = new ycl(0.0f);
                                            if (yclVar6.compareTo(yclVar7) < 0) {
                                                yclVar6 = yclVar7;
                                            }
                                            IntRange intRangeO = l1e0.o(0, iMax);
                                            arrayList3 = new ArrayList(r3d.q(intRangeO, 10));
                                            it4 = intRangeO.iterator();
                                            while (((kkx) it4).c) {
                                                int iNextInt = ((bkx) it4).nextInt();
                                                rwr0Var = (rwr0) CollectionsKt.W(iNextInt, arrayListA);
                                                rwr0Var2 = (rwr0) CollectionsKt.W(iNextInt, a4xVar4);
                                                if (rwr0Var != null || (pr8Var = rwr0Var.f31230a) == null) {
                                                    if (rwr0Var2 != null) {
                                                        pr8Var = rwr0Var2.f31230a;
                                                    } else {
                                                        pr8Var = pr8.b;
                                                    }
                                                }
                                                if (rwr0Var != null) {
                                                    r14 = rwr0Var.b;
                                                } else {
                                                    r14 = th;
                                                }
                                                if (r14 == 0) {
                                                    r14 = iun.f15405a;
                                                }
                                                if (rwr0Var2 != null) {
                                                    r10 = rwr0Var2.b;
                                                } else {
                                                    r10 = th;
                                                }
                                                if (r10 == 0) {
                                                    r10 = iun.f15405a;
                                                }
                                                yclVar8 = new ycl(f9 - ipm0.s(r14));
                                                zcl zclVar5 = qmk.f28987a;
                                                Integer num4 = num3;
                                                yclVar9 = new ycl(0.0f);
                                                if (yclVar8.compareTo(yclVar9) < 0) {
                                                    yclVar8 = yclVar9;
                                                }
                                                B = kotlin.collections.a.b();
                                                B.addAll(r14);
                                                f10 = yclVar8.f42389a;
                                                if (ycl.a(f10, 0.0f) > 0) {
                                                    B.add(new fxr0(f10));
                                                }
                                                f11 = yclVar6.f42389a;
                                                if (ycl.a(f11, 0.0f) > 0) {
                                                    B.add(new fxr0(f11));
                                                }
                                                B.addAll(r10);
                                                arrayList3.add(new rwr0(pr8Var, dyb.r0(kotlin.collections.a.a(B))));
                                                num3 = num4;
                                            }
                                            num = num3;
                                            i4 i4VarR1 = dyb.r0(arrayList3);
                                            zcl zclVar6 = qmk.f28987a;
                                            iB2 = si30.b(f7 / kxr0.f19071a);
                                            if (iB2 < 0) {
                                                i5 = 0;
                                            } else {
                                                i5 = iB2;
                                            }
                                            jt8 jt8Var = jt8.f17087a;
                                            lsm0 lsm0Var = ctf0Var.b;
                                            j0g0Var = j0g0Var;
                                            i = 0;
                                            nxr0Var = new mxr0(i4VarR1, dyb.g0(new kt8(jt8Var, lsm0Var.a(R.string.upper_bracket, Arrays.copyOf(new Object[0], 0)), 0, 0.0f, i5, 0.0f), new kt8(jt8.b, lsm0Var.a(R.string.lower_bracket, Arrays.copyOf(new Object[0], 0)), i4, f13, i5, f15)));
                                        } else {
                                            r5s0Var2 = r5s0Var;
                                        }
                                        a4xVar3 = lak0.c;
                                        float f16 = f13 - (i4 * kxr0.f19071a);
                                        arrayListA = kxr0.a(a4xVar3);
                                        a4xVar4 = r5s0Var2.c;
                                        float f17 = f16 / f8;
                                        a4xVar4.getClass();
                                        int iMax2 = Math.max(arrayListA.size(), a4xVar4.size());
                                        arrayList2 = new ArrayList();
                                        while (r8.hasNext()) {
                                            if (((rwr0) obj4).f31230a == pr8.b) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                        it3 = arrayList2.iterator();
                                        if (it3.hasNext()) {
                                            yclVar4 = th;
                                        } else {
                                            yclVar4 = new ycl(ipm0.s(((rwr0) it3.next()).b));
                                            while (it3.hasNext()) {
                                                yclVar5 = new ycl(ipm0.s(((rwr0) it3.next()).b));
                                                if (yclVar4.compareTo(yclVar5) < 0) {
                                                    yclVar4 = yclVar5;
                                                }
                                            }
                                        }
                                        if (yclVar4 != 0) {
                                            f9 = yclVar4.f42389a;
                                        } else {
                                            zcl zclVar7 = qmk.f28987a;
                                            f9 = 0.0f;
                                        }
                                        yclVar6 = new ycl((f13 - f9) + f17);
                                        zcl zclVar8 = qmk.f28987a;
                                        yclVar7 = new ycl(0.0f);
                                        if (yclVar6.compareTo(yclVar7) < 0) {
                                            yclVar6 = yclVar7;
                                        }
                                        IntRange intRangeO2 = l1e0.o(0, iMax2);
                                        arrayList3 = new ArrayList(r3d.q(intRangeO2, 10));
                                        it4 = intRangeO2.iterator();
                                        while (((kkx) it4).c) {
                                            int iNextInt2 = ((bkx) it4).nextInt();
                                            rwr0Var = (rwr0) CollectionsKt.W(iNextInt2, arrayListA);
                                            rwr0Var2 = (rwr0) CollectionsKt.W(iNextInt2, a4xVar4);
                                            if (rwr0Var != null) {
                                                if (rwr0Var2 != null) {
                                                    pr8Var = rwr0Var2.f31230a;
                                                } else {
                                                    pr8Var = pr8.b;
                                                }
                                            } else if (rwr0Var2 != null) {
                                                pr8Var = rwr0Var2.f31230a;
                                            } else {
                                                pr8Var = pr8.b;
                                            }
                                            if (rwr0Var != null) {
                                                r14 = rwr0Var.b;
                                            } else {
                                                r14 = th;
                                            }
                                            if (r14 == 0) {
                                                r14 = iun.f15405a;
                                            }
                                            if (rwr0Var2 != null) {
                                                r10 = rwr0Var2.b;
                                            } else {
                                                r10 = th;
                                            }
                                            if (r10 == 0) {
                                                r10 = iun.f15405a;
                                            }
                                            yclVar8 = new ycl(f9 - ipm0.s(r14));
                                            zcl zclVar9 = qmk.f28987a;
                                            Integer num5 = num3;
                                            yclVar9 = new ycl(0.0f);
                                            if (yclVar8.compareTo(yclVar9) < 0) {
                                                yclVar8 = yclVar9;
                                            }
                                            B = kotlin.collections.a.b();
                                            B.addAll(r14);
                                            f10 = yclVar8.f42389a;
                                            if (ycl.a(f10, 0.0f) > 0) {
                                                B.add(new fxr0(f10));
                                            }
                                            f11 = yclVar6.f42389a;
                                            if (ycl.a(f11, 0.0f) > 0) {
                                                B.add(new fxr0(f11));
                                            }
                                            B.addAll(r10);
                                            arrayList3.add(new rwr0(pr8Var, dyb.r0(kotlin.collections.a.a(B))));
                                            num3 = num5;
                                        }
                                        num = num3;
                                        i4 i4VarR2 = dyb.r0(arrayList3);
                                        zcl zclVar10 = qmk.f28987a;
                                        iB2 = si30.b(f7 / kxr0.f19071a);
                                        if (iB2 < 0) {
                                            i5 = 0;
                                        } else {
                                            i5 = iB2;
                                        }
                                        jt8 jt8Var2 = jt8.f17087a;
                                        lsm0 lsm0Var2 = ctf0Var.b;
                                        j0g0Var = j0g0Var;
                                        i = 0;
                                        nxr0Var = new mxr0(i4VarR2, dyb.g0(new kt8(jt8Var2, lsm0Var2.a(R.string.upper_bracket, Arrays.copyOf(new Object[0], 0)), 0, 0.0f, i5, 0.0f), new kt8(jt8.b, lsm0Var2.a(R.string.lower_bracket, Arrays.copyOf(new Object[0], 0)), i4, f13, i5, f17)));
                                    }
                                } else {
                                    list6 = list8;
                                }
                                a4xVar = lak0.c;
                                if (list6.size() < 2) {
                                    num = num3;
                                    j0g0Var = j0g0Var;
                                    i = 0;
                                    z = true;
                                    th = null;
                                    nxr0Var = new mxr0(a4xVar, lak0.c);
                                } else {
                                    a4xVar.getClass();
                                    List list10 = list6;
                                    yihVar = (yih) CollectionsKt.W(1, list10);
                                    if (yihVar != null) {
                                        lun lunVar3 = lun.f20680a;
                                        lunVar3.getClass();
                                        a4xVar2 = a4xVar;
                                        r5s0Var = dqm0.m(yihVar, qlhVar, lunVar3, lunVar3, ctf0Var, true);
                                    } else {
                                        a4xVar2 = a4xVar;
                                        iun iunVar2 = iun.f15405a;
                                        r5s0Var = new r5s0(iunVar2, iunVar2, lak0.c);
                                    }
                                    list7 = r5s0Var.f29904a;
                                    it2 = kxr0.a(a4xVar2).iterator();
                                    if (it2.hasNext()) {
                                        th = null;
                                        yclVar2 = null;
                                    } else {
                                        th = null;
                                        yclVar2 = new ycl(ipm0.s(((rwr0) it2.next()).b));
                                        while (it2.hasNext()) {
                                            boolean z4 = z2;
                                            yclVar3 = new ycl(ipm0.s(((rwr0) it2.next()).b));
                                            if (yclVar2.compareTo(yclVar3) < 0) {
                                                yclVar2 = yclVar3;
                                            }
                                            z2 = z4;
                                        }
                                    }
                                    z = z2;
                                    if (yclVar2 != null) {
                                        f5 = yclVar2.f42389a;
                                    } else {
                                        zcl zclVar11 = qmk.f28987a;
                                        f5 = 0.0f;
                                    }
                                    zcl zclVar12 = qmk.f28987a;
                                    f6 = 34.0f;
                                    float f18 = f5 + 34.0f;
                                    iB = si30.b(f18 / kxr0.f19071a);
                                    if (iB < 0) {
                                        i4 = 0;
                                    } else {
                                        i4 = iB;
                                    }
                                    listIterator = list7.listIterator(list7.size());
                                    while (true) {
                                        f7 = f6;
                                        if (listIterator.hasPrevious()) {
                                            iNextIndex = -1;
                                        } else if (((List) listIterator.previous()).isEmpty()) {
                                            iNextIndex = listIterator.nextIndex();
                                        } else {
                                            f6 = f7;
                                        }
                                    }
                                    ValueOf = Integer.valueOf(iNextIndex);
                                    if (iNextIndex < 0) {
                                        ValueOf = th;
                                    }
                                    if (ValueOf != 0) {
                                        iIntValue2 = ValueOf.intValue();
                                        zjhVar = (zjh) CollectionsKt.firstOrNull((List) list7.get(iIntValue2));
                                        if (zjhVar != null) {
                                            f8 = 2.0f;
                                            map3 = (Map) CollectionsKt.W(iIntValue2, r5s0Var.b);
                                            if (map3 != null) {
                                                r6 = (Integer) map3.get(zjhVar.f44481a);
                                            }
                                        } else {
                                            f8 = 2.0f;
                                        }
                                        r6 = th;
                                    } else {
                                        f8 = 2.0f;
                                        r6 = th;
                                    }
                                    if (r6 != 0) {
                                        iIntValue = r6.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    listIterator2 = list7.listIterator(list7.size());
                                    while (true) {
                                        if (listIterator2.hasPrevious()) {
                                            iNextIndex2 = -1;
                                        } else if (!((List) listIterator2.previous()).isEmpty()) {
                                            iNextIndex2 = listIterator2.nextIndex();
                                        }
                                    }
                                    if (iNextIndex2 == -1) {
                                        r5 = th;
                                    } else {
                                        r5 = (zjh) CollectionsKt.firstOrNull((List) list7.get(iNextIndex2));
                                    }
                                    if (r5 != 0) {
                                        mapB = wp20.b(new Pair(r5.f44481a, Integer.valueOf(iIntValue + i4)));
                                    } else {
                                        mapB = lun.f20680a;
                                        mapB.getClass();
                                    }
                                    yihVar2 = (yih) CollectionsKt.W(0, list10);
                                    if (yihVar2 != null) {
                                        if (r5 != 0) {
                                            mapB2 = wp20.b(new Pair(r5.f44481a, r5));
                                        } else {
                                            mapB2 = lun.f20680a;
                                            mapB2.getClass();
                                        }
                                        r5s0Var2 = r5s0Var;
                                        a4xVar3 = dqm0.m(yihVar2, qlhVar, mapB, mapB2, ctf0Var, false).c;
                                        if (a4xVar3 == null) {
                                        }
                                        float f19 = f18 - (i4 * kxr0.f19071a);
                                        arrayListA = kxr0.a(a4xVar3);
                                        a4xVar4 = r5s0Var2.c;
                                        float f110 = f19 / f8;
                                        a4xVar4.getClass();
                                        int iMax3 = Math.max(arrayListA.size(), a4xVar4.size());
                                        arrayList2 = new ArrayList();
                                        while (r8.hasNext()) {
                                            if (((rwr0) obj4).f31230a == pr8.b) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                        it3 = arrayList2.iterator();
                                        if (it3.hasNext()) {
                                            yclVar4 = th;
                                        } else {
                                            yclVar4 = new ycl(ipm0.s(((rwr0) it3.next()).b));
                                            while (it3.hasNext()) {
                                                yclVar5 = new ycl(ipm0.s(((rwr0) it3.next()).b));
                                                if (yclVar4.compareTo(yclVar5) < 0) {
                                                    yclVar4 = yclVar5;
                                                }
                                            }
                                        }
                                        if (yclVar4 != 0) {
                                            f9 = yclVar4.f42389a;
                                        } else {
                                            zcl zclVar13 = qmk.f28987a;
                                            f9 = 0.0f;
                                        }
                                        yclVar6 = new ycl((f18 - f9) + f110);
                                        zcl zclVar14 = qmk.f28987a;
                                        yclVar7 = new ycl(0.0f);
                                        if (yclVar6.compareTo(yclVar7) < 0) {
                                            yclVar6 = yclVar7;
                                        }
                                        IntRange intRangeO3 = l1e0.o(0, iMax3);
                                        arrayList3 = new ArrayList(r3d.q(intRangeO3, 10));
                                        it4 = intRangeO3.iterator();
                                        while (((kkx) it4).c) {
                                            int iNextInt3 = ((bkx) it4).nextInt();
                                            rwr0Var = (rwr0) CollectionsKt.W(iNextInt3, arrayListA);
                                            rwr0Var2 = (rwr0) CollectionsKt.W(iNextInt3, a4xVar4);
                                            if (rwr0Var != null) {
                                                if (rwr0Var2 != null) {
                                                    pr8Var = rwr0Var2.f31230a;
                                                } else {
                                                    pr8Var = pr8.b;
                                                }
                                            } else if (rwr0Var2 != null) {
                                                pr8Var = rwr0Var2.f31230a;
                                            } else {
                                                pr8Var = pr8.b;
                                            }
                                            if (rwr0Var != null) {
                                                r14 = rwr0Var.b;
                                            } else {
                                                r14 = th;
                                            }
                                            if (r14 == 0) {
                                                r14 = iun.f15405a;
                                            }
                                            if (rwr0Var2 != null) {
                                                r10 = rwr0Var2.b;
                                            } else {
                                                r10 = th;
                                            }
                                            if (r10 == 0) {
                                                r10 = iun.f15405a;
                                            }
                                            yclVar8 = new ycl(f9 - ipm0.s(r14));
                                            zcl zclVar15 = qmk.f28987a;
                                            Integer num6 = num3;
                                            yclVar9 = new ycl(0.0f);
                                            if (yclVar8.compareTo(yclVar9) < 0) {
                                                yclVar8 = yclVar9;
                                            }
                                            B = kotlin.collections.a.b();
                                            B.addAll(r14);
                                            f10 = yclVar8.f42389a;
                                            if (ycl.a(f10, 0.0f) > 0) {
                                                B.add(new fxr0(f10));
                                            }
                                            f11 = yclVar6.f42389a;
                                            if (ycl.a(f11, 0.0f) > 0) {
                                                B.add(new fxr0(f11));
                                            }
                                            B.addAll(r10);
                                            arrayList3.add(new rwr0(pr8Var, dyb.r0(kotlin.collections.a.a(B))));
                                            num3 = num6;
                                        }
                                        num = num3;
                                        i4 i4VarR3 = dyb.r0(arrayList3);
                                        zcl zclVar16 = qmk.f28987a;
                                        iB2 = si30.b(f7 / kxr0.f19071a);
                                        if (iB2 < 0) {
                                            i5 = 0;
                                        } else {
                                            i5 = iB2;
                                        }
                                        jt8 jt8Var3 = jt8.f17087a;
                                        lsm0 lsm0Var3 = ctf0Var.b;
                                        j0g0Var = j0g0Var;
                                        i = 0;
                                        nxr0Var = new mxr0(i4VarR3, dyb.g0(new kt8(jt8Var3, lsm0Var3.a(R.string.upper_bracket, Arrays.copyOf(new Object[0], 0)), 0, 0.0f, i5, 0.0f), new kt8(jt8.b, lsm0Var3.a(R.string.lower_bracket, Arrays.copyOf(new Object[0], 0)), i4, f18, i5, f110)));
                                    } else {
                                        r5s0Var2 = r5s0Var;
                                    }
                                    a4xVar3 = lak0.c;
                                    float f111 = f18 - (i4 * kxr0.f19071a);
                                    arrayListA = kxr0.a(a4xVar3);
                                    a4xVar4 = r5s0Var2.c;
                                    float f112 = f111 / f8;
                                    a4xVar4.getClass();
                                    int iMax4 = Math.max(arrayListA.size(), a4xVar4.size());
                                    arrayList2 = new ArrayList();
                                    while (r8.hasNext()) {
                                        if (((rwr0) obj4).f31230a == pr8.b) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    it3 = arrayList2.iterator();
                                    if (it3.hasNext()) {
                                        yclVar4 = th;
                                    } else {
                                        yclVar4 = new ycl(ipm0.s(((rwr0) it3.next()).b));
                                        while (it3.hasNext()) {
                                            yclVar5 = new ycl(ipm0.s(((rwr0) it3.next()).b));
                                            if (yclVar4.compareTo(yclVar5) < 0) {
                                                yclVar4 = yclVar5;
                                            }
                                        }
                                    }
                                    if (yclVar4 != 0) {
                                        f9 = yclVar4.f42389a;
                                    } else {
                                        zcl zclVar17 = qmk.f28987a;
                                        f9 = 0.0f;
                                    }
                                    yclVar6 = new ycl((f18 - f9) + f112);
                                    zcl zclVar18 = qmk.f28987a;
                                    yclVar7 = new ycl(0.0f);
                                    if (yclVar6.compareTo(yclVar7) < 0) {
                                        yclVar6 = yclVar7;
                                    }
                                    IntRange intRangeO4 = l1e0.o(0, iMax4);
                                    arrayList3 = new ArrayList(r3d.q(intRangeO4, 10));
                                    it4 = intRangeO4.iterator();
                                    while (((kkx) it4).c) {
                                        int iNextInt4 = ((bkx) it4).nextInt();
                                        rwr0Var = (rwr0) CollectionsKt.W(iNextInt4, arrayListA);
                                        rwr0Var2 = (rwr0) CollectionsKt.W(iNextInt4, a4xVar4);
                                        if (rwr0Var != null) {
                                            if (rwr0Var2 != null) {
                                                pr8Var = rwr0Var2.f31230a;
                                            } else {
                                                pr8Var = pr8.b;
                                            }
                                        } else if (rwr0Var2 != null) {
                                            pr8Var = rwr0Var2.f31230a;
                                        } else {
                                            pr8Var = pr8.b;
                                        }
                                        if (rwr0Var != null) {
                                            r14 = rwr0Var.b;
                                        } else {
                                            r14 = th;
                                        }
                                        if (r14 == 0) {
                                            r14 = iun.f15405a;
                                        }
                                        if (rwr0Var2 != null) {
                                            r10 = rwr0Var2.b;
                                        } else {
                                            r10 = th;
                                        }
                                        if (r10 == 0) {
                                            r10 = iun.f15405a;
                                        }
                                        yclVar8 = new ycl(f9 - ipm0.s(r14));
                                        zcl zclVar19 = qmk.f28987a;
                                        Integer num7 = num3;
                                        yclVar9 = new ycl(0.0f);
                                        if (yclVar8.compareTo(yclVar9) < 0) {
                                            yclVar8 = yclVar9;
                                        }
                                        B = kotlin.collections.a.b();
                                        B.addAll(r14);
                                        f10 = yclVar8.f42389a;
                                        if (ycl.a(f10, 0.0f) > 0) {
                                            B.add(new fxr0(f10));
                                        }
                                        f11 = yclVar6.f42389a;
                                        if (ycl.a(f11, 0.0f) > 0) {
                                            B.add(new fxr0(f11));
                                        }
                                        B.addAll(r10);
                                        arrayList3.add(new rwr0(pr8Var, dyb.r0(kotlin.collections.a.a(B))));
                                        num3 = num7;
                                    }
                                    num = num3;
                                    i4 i4VarR4 = dyb.r0(arrayList3);
                                    zcl zclVar110 = qmk.f28987a;
                                    iB2 = si30.b(f7 / kxr0.f19071a);
                                    if (iB2 < 0) {
                                        i5 = 0;
                                    } else {
                                        i5 = iB2;
                                    }
                                    jt8 jt8Var4 = jt8.f17087a;
                                    lsm0 lsm0Var4 = ctf0Var.b;
                                    j0g0Var = j0g0Var;
                                    i = 0;
                                    nxr0Var = new mxr0(i4VarR4, dyb.g0(new kt8(jt8Var4, lsm0Var4.a(R.string.upper_bracket, Arrays.copyOf(new Object[0], 0)), 0, 0.0f, i5, 0.0f), new kt8(jt8.b, lsm0Var4.a(R.string.lower_bracket, Arrays.copyOf(new Object[0], 0)), i4, f18, i5, f112)));
                                }
                            } else {
                                num = num3;
                                z = true;
                                th = null;
                                nxr0Var = 0;
                                j0g0Var = j0g0Var;
                                i = 0;
                            }
                        } else {
                            num = num3;
                            z = true;
                            th = null;
                            if (xlhVar instanceof wlh) {
                                if (((wlh) xlhVar).b.isEmpty()) {
                                    xlhVar = null;
                                }
                                wlh wlhVar = (wlh) xlhVar;
                                if (wlhVar != null) {
                                    cjh cjhVar = (cjh) CollectionsKt.firstOrNull(wlhVar.b);
                                    if (cjhVar != null) {
                                        List list11 = cjhVar.b;
                                        if (list11.isEmpty()) {
                                            i4VarR0 = lak0.c;
                                            i = 0;
                                        } else {
                                            float f20 = lxr0.f20830a;
                                            klh klhVar = (klh) CollectionsKt.firstOrNull(list11);
                                            Integer numValueOf = (klhVar == null || (list4 = klhVar.c) == null || (ojhVar = (ojh) CollectionsKt.firstOrNull(list4)) == null || (list5 = ojhVar.f) == null) ? null : Integer.valueOf(list5.size());
                                            int i6 = (numValueOf == null || numValueOf.intValue() > 4) ? 16 : 8;
                                            Integer num8 = 4;
                                            char c2 = 3;
                                            HashMap map4 = new HashMap();
                                            int i7 = 0;
                                            for (Object obj5 : list11) {
                                                int i8 = i7 + 1;
                                                if (i7 < 0) {
                                                    q3d.p();
                                                    throw null;
                                                }
                                                char c3 = c;
                                                for (ojh ojhVar2 : ((klh) obj5).c) {
                                                    char c4 = c2;
                                                    map4.put(new Pair(Integer.valueOf(i7), ojhVar2.b), ojhVar2.f);
                                                    c2 = c4;
                                                }
                                                i7 = i8;
                                                c = c3;
                                            }
                                            char c5 = c;
                                            char c6 = c2;
                                            String str7 = "0-3";
                                            String str8 = "0-1";
                                            String str9 = "2-0";
                                            HashMap map5 = map4;
                                            String str10 = "2-2";
                                            if (i6 == 8) {
                                                List listC = kotlin.collections.a.c(new Pair("0-0", num8));
                                                List listJ2 = q3d.j(new Pair("1-0", 2), new Pair("0-1", 2));
                                                List listJ3 = q3d.j(new Pair("2-0", 1), new Pair("1-1", 2), new Pair("0-2", 1));
                                                List listJ4 = q3d.j(new Pair("2-1", 1), new Pair("1-2", 1));
                                                List[] listArr = new List[4];
                                                listArr[0] = listC;
                                                listArr[1] = listJ2;
                                                listArr[c5] = listJ3;
                                                listArr[c6] = listJ4;
                                                listJ = q3d.j(listArr);
                                                str4 = "2-3";
                                                str2 = "1-3";
                                                str = "3-1";
                                                str3 = "3-2";
                                            } else {
                                                List listC2 = kotlin.collections.a.c(new Pair("0-0", 8));
                                                List listJ5 = q3d.j(new Pair("1-0", num8), new Pair("0-1", num8));
                                                List listJ6 = q3d.j(new Pair("2-0", 2), new Pair("1-1", num8), new Pair("0-2", 2));
                                                List listJ7 = q3d.j(new Pair("3-0", 1), new Pair("2-1", 3), new Pair("1-2", 3), new Pair("0-3", 1));
                                                str = "3-1";
                                                str2 = "1-3";
                                                List listJ8 = q3d.j(new Pair("3-1", 1), new Pair(str10, 3), new Pair(str2, 1));
                                                str3 = "3-2";
                                                str4 = "2-3";
                                                List listJ9 = q3d.j(new Pair("3-2", 1), new Pair(str4, 1));
                                                List[] listArr2 = new List[6];
                                                listArr2[0] = listC2;
                                                listArr2[1] = listJ5;
                                                listArr2[c5] = listJ6;
                                                listArr2[c6] = listJ7;
                                                listArr2[4] = listJ8;
                                                listArr2[5] = listJ9;
                                                listJ = q3d.j(listArr2);
                                            }
                                            String str11 = str2;
                                            String str12 = str4;
                                            ArrayList arrayList5 = new ArrayList(r3d.q(listJ, 10));
                                            Iterator it5 = listJ.iterator();
                                            int i9 = 0;
                                            while (it5.hasNext()) {
                                                Object next = it5.next();
                                                int i10 = i9 + 1;
                                                if (i9 < 0) {
                                                    q3d.p();
                                                    throw null;
                                                }
                                                List list12 = (List) next;
                                                Iterator it6 = it5;
                                                String strValueOf = String.valueOf(i10);
                                                ArrayList arrayList6 = arrayList5;
                                                String str13 = str7;
                                                ArrayList arrayList7 = new ArrayList(r3d.q(list12, 10));
                                                Iterator it7 = list12.iterator();
                                                int i11 = 0;
                                                while (it7.hasNext()) {
                                                    Object next2 = it7.next();
                                                    int i12 = i11 + 1;
                                                    if (i11 < 0) {
                                                        q3d.p();
                                                        throw null;
                                                    }
                                                    Pair pair5 = (Pair) next2;
                                                    Iterator it8 = it7;
                                                    String str14 = (String) pair5.f46059a;
                                                    int iIntValue3 = ((Number) pair5.b).intValue();
                                                    String strM = dw9.m(i9, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, str14);
                                                    int i13 = i9;
                                                    str14.getClass();
                                                    ArrayList arrayList8 = arrayList7;
                                                    String str15 = strM;
                                                    int i14 = i6;
                                                    if (i14 == 8) {
                                                        Pair pair6 = new Pair(Integer.valueOf(i13), str14);
                                                        if (brm0.D(1, "1-0", pair6)) {
                                                            i2 = i14;
                                                            num2 = num8;
                                                            pair2 = new Pair(kotlin.collections.a.c("0|0-0"), iun.f15405a);
                                                        } else {
                                                            i2 = i14;
                                                            if (brm0.D(1, str8, pair6)) {
                                                                pair2 = new Pair(iun.f15405a, kotlin.collections.a.c("0|0-0"));
                                                            } else if (brm0.D(2, str9, pair6)) {
                                                                pair2 = new Pair(kotlin.collections.a.c("1|1-0"), iun.f15405a);
                                                            } else if (brm0.D(2, "0-2", pair6)) {
                                                                pair2 = new Pair(iun.f15405a, kotlin.collections.a.c("1|0-1"));
                                                            } else if (brm0.D(2, "1-1", pair6)) {
                                                                pair2 = new Pair(kotlin.collections.a.c("1|0-1"), kotlin.collections.a.c("1|1-0"));
                                                            } else if (brm0.D(3, "2-1", pair6)) {
                                                                pair2 = new Pair(kotlin.collections.a.c("2|1-1"), iun.f15405a);
                                                            } else if (brm0.D(3, "1-2", pair6)) {
                                                                pair2 = new Pair(iun.f15405a, kotlin.collections.a.c("2|1-1"));
                                                            } else {
                                                                iun iunVar3 = iun.f15405a;
                                                                num2 = num8;
                                                                pair2 = new Pair(iunVar3, iunVar3);
                                                            }
                                                        }
                                                        str5 = str13;
                                                        str6 = str9;
                                                        List list13 = (List) pair2.f46059a;
                                                        List list14 = (List) pair2.b;
                                                        map2 = map5;
                                                        iterable = (List) map2.get(new Pair(Integer.valueOf(i13), str14));
                                                        if (iterable == null) {
                                                            iterable = iun.f15405a;
                                                        }
                                                        lc00Var = new lc00(iIntValue3);
                                                        it = CollectionsKt.D0(iterable, iIntValue3).iterator();
                                                        while (it.hasNext()) {
                                                            lc00Var.add((zjh) it.next());
                                                            map2 = map2;
                                                        }
                                                        HashMap map6 = map2;
                                                        i3 = lc00Var.b;
                                                        while (i3 < iIntValue3) {
                                                            String str16 = str15;
                                                            lc00Var.add(new zjh(twn.m(i3, str16), 0L, 0L, new mkh(0, 0L, "", "", false), new mkh(0, 0L, "", "", false), "", "", CyberTournamentBracketMatchStatusModel.b, "", 0L));
                                                            i3++;
                                                            str15 = str16;
                                                        }
                                                        arrayList8.add(new ojh(i11, str15, str14, list13, list14, kotlin.collections.a.a(lc00Var)));
                                                        String str17 = str5;
                                                        arrayList7 = arrayList8;
                                                        str9 = str6;
                                                        str13 = str17;
                                                        Integer num9 = num2;
                                                        str10 = str10;
                                                        str8 = str8;
                                                        num8 = num9;
                                                        it7 = it8;
                                                        i11 = i12;
                                                        i9 = i13;
                                                        i6 = i2;
                                                        map5 = map6;
                                                    } else {
                                                        i2 = i14;
                                                        Pair pair7 = new Pair(Integer.valueOf(i13), str14);
                                                        if (brm0.D(1, "1-0", pair7)) {
                                                            pair2 = new Pair(kotlin.collections.a.c("0|0-0"), iun.f15405a);
                                                        } else if (brm0.D(1, str8, pair7)) {
                                                            pair2 = new Pair(iun.f15405a, kotlin.collections.a.c("0|0-0"));
                                                        } else if (brm0.D(2, str9, pair7)) {
                                                            pair2 = new Pair(kotlin.collections.a.c("1|1-0"), iun.f15405a);
                                                        } else if (brm0.D(2, "0-2", pair7)) {
                                                            pair2 = new Pair(iun.f15405a, kotlin.collections.a.c("1|0-1"));
                                                        } else if (brm0.D(2, "1-1", pair7)) {
                                                            pair2 = new Pair(kotlin.collections.a.c("1|0-1"), kotlin.collections.a.c("1|1-0"));
                                                        } else {
                                                            if (brm0.D(3, "3-0", pair7)) {
                                                                pair2 = new Pair(kotlin.collections.a.c("2|2-0"), iun.f15405a);
                                                            } else {
                                                                str5 = str13;
                                                                if (brm0.D(3, str5, pair7)) {
                                                                    str6 = str9;
                                                                    pair3 = new Pair(iun.f15405a, kotlin.collections.a.c("2|0-2"));
                                                                    Integer num10 = num8;
                                                                    str8 = str8;
                                                                    str10 = str10;
                                                                    num2 = num10;
                                                                } else {
                                                                    str6 = str9;
                                                                    if (brm0.D(3, "2-1", pair7)) {
                                                                        pair2 = new Pair(kotlin.collections.a.c("2|1-1"), kotlin.collections.a.c("2|2-0"));
                                                                    } else if (brm0.D(3, "1-2", pair7)) {
                                                                        pair2 = new Pair(kotlin.collections.a.c("2|0-2"), kotlin.collections.a.c("2|1-1"));
                                                                    } else {
                                                                        Integer num11 = num8;
                                                                        str8 = str8;
                                                                        String str18 = str;
                                                                        if (brm0.D(num11, str18, pair7)) {
                                                                            str = str18;
                                                                            pair4 = new Pair(kotlin.collections.a.c("3|2-1"), iun.f15405a);
                                                                        } else {
                                                                            str = str18;
                                                                            String str19 = str11;
                                                                            if (brm0.D(num11, str19, pair7)) {
                                                                                str11 = str19;
                                                                                pair4 = new Pair(iun.f15405a, kotlin.collections.a.c("3|1-2"));
                                                                            } else {
                                                                                str11 = str19;
                                                                                str10 = str10;
                                                                                if (brm0.D(num11, str10, pair7)) {
                                                                                    num2 = num11;
                                                                                    pair3 = new Pair(kotlin.collections.a.c("3|1-2"), kotlin.collections.a.c("3|2-1"));
                                                                                } else {
                                                                                    num2 = num11;
                                                                                    String str20 = str3;
                                                                                    if (brm0.D(5, str20, pair7)) {
                                                                                        str3 = str20;
                                                                                        pair3 = new Pair(kotlin.collections.a.c("4|2-2"), iun.f15405a);
                                                                                    } else {
                                                                                        str3 = str20;
                                                                                        String str21 = str12;
                                                                                        if (brm0.D(5, str21, pair7)) {
                                                                                            str12 = str21;
                                                                                            pair3 = new Pair(iun.f15405a, kotlin.collections.a.c("4|2-2"));
                                                                                        } else {
                                                                                            str12 = str21;
                                                                                            iun iunVar4 = iun.f15405a;
                                                                                            pair2 = new Pair(iunVar4, iunVar4);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        pair2 = pair4;
                                                                        str10 = str10;
                                                                        num2 = num11;
                                                                    }
                                                                    Integer num12 = num8;
                                                                    str8 = str8;
                                                                    str10 = str10;
                                                                    num2 = num12;
                                                                }
                                                                pair2 = pair3;
                                                            }
                                                            List list15 = (List) pair2.f46059a;
                                                            List list16 = (List) pair2.b;
                                                            map2 = map5;
                                                            iterable = (List) map2.get(new Pair(Integer.valueOf(i13), str14));
                                                            if (iterable == null) {
                                                                iterable = iun.f15405a;
                                                            }
                                                            lc00Var = new lc00(iIntValue3);
                                                            it = CollectionsKt.D0(iterable, iIntValue3).iterator();
                                                            while (it.hasNext()) {
                                                                lc00Var.add((zjh) it.next());
                                                                map2 = map2;
                                                            }
                                                            HashMap map7 = map2;
                                                            i3 = lc00Var.b;
                                                            while (i3 < iIntValue3) {
                                                                String str110 = str15;
                                                                lc00Var.add(new zjh(twn.m(i3, str110), 0L, 0L, new mkh(0, 0L, "", "", false), new mkh(0, 0L, "", "", false), "", "", CyberTournamentBracketMatchStatusModel.b, "", 0L));
                                                                i3++;
                                                                str15 = str110;
                                                            }
                                                            arrayList8.add(new ojh(i11, str15, str14, list15, list16, kotlin.collections.a.a(lc00Var)));
                                                            String str111 = str5;
                                                            arrayList7 = arrayList8;
                                                            str9 = str6;
                                                            str13 = str111;
                                                            Integer num13 = num2;
                                                            str10 = str10;
                                                            str8 = str8;
                                                            num8 = num13;
                                                            it7 = it8;
                                                            i11 = i12;
                                                            i9 = i13;
                                                            i6 = i2;
                                                            map5 = map7;
                                                        }
                                                    }
                                                    num2 = num8;
                                                    str5 = str13;
                                                    str6 = str9;
                                                    List list17 = (List) pair2.f46059a;
                                                    List list18 = (List) pair2.b;
                                                    map2 = map5;
                                                    iterable = (List) map2.get(new Pair(Integer.valueOf(i13), str14));
                                                    if (iterable == null) {
                                                        iterable = iun.f15405a;
                                                    }
                                                    lc00Var = new lc00(iIntValue3);
                                                    it = CollectionsKt.D0(iterable, iIntValue3).iterator();
                                                    while (it.hasNext()) {
                                                        lc00Var.add((zjh) it.next());
                                                        map2 = map2;
                                                    }
                                                    HashMap map8 = map2;
                                                    i3 = lc00Var.b;
                                                    while (i3 < iIntValue3) {
                                                        String str112 = str15;
                                                        lc00Var.add(new zjh(twn.m(i3, str112), 0L, 0L, new mkh(0, 0L, "", "", false), new mkh(0, 0L, "", "", false), "", "", CyberTournamentBracketMatchStatusModel.b, "", 0L));
                                                        i3++;
                                                        str15 = str112;
                                                    }
                                                    arrayList8.add(new ojh(i11, str15, str14, list17, list18, kotlin.collections.a.a(lc00Var)));
                                                    String str113 = str5;
                                                    arrayList7 = arrayList8;
                                                    str9 = str6;
                                                    str13 = str113;
                                                    Integer num14 = num2;
                                                    str10 = str10;
                                                    str8 = str8;
                                                    num8 = num14;
                                                    it7 = it8;
                                                    i11 = i12;
                                                    i9 = i13;
                                                    i6 = i2;
                                                    map5 = map8;
                                                }
                                                arrayList6.add(new klh(strValueOf, arrayList7, i9));
                                                str10 = str10;
                                                str8 = str8;
                                                num8 = num8;
                                                str7 = str13;
                                                i9 = i10;
                                                it5 = it6;
                                                arrayList5 = arrayList6;
                                                str9 = str9;
                                            }
                                            ArrayList arrayList9 = arrayList5;
                                            int i15 = i6;
                                            ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                                            Iterator it9 = arrayList9.iterator();
                                            while (it9.hasNext()) {
                                                arrayList10.add(((klh) it9.next()).c);
                                            }
                                            if (arrayList10.isEmpty()) {
                                                zcl zclVar20 = qmk.f28987a;
                                                f = 0.0f;
                                            } else {
                                                Iterator it10 = arrayList10.iterator();
                                                if (!it10.hasNext()) {
                                                    itt0.a();
                                                    return null;
                                                }
                                                List list19 = (List) it10.next();
                                                ArrayList arrayList11 = new ArrayList(r3d.q(list19, 10));
                                                Iterator it11 = list19.iterator();
                                                while (it11.hasNext()) {
                                                    arrayList11.add(new ycl(lxr0.b(((ojh) it11.next()).f.size())));
                                                }
                                                float fA = lxr0.a(arrayList11);
                                                float f21 = lxr0.f20830a;
                                                int size = arrayList11.size() - 1;
                                                if (size < 0) {
                                                    size = 0;
                                                }
                                                ycl yclVar10 = new ycl((f21 * size) + fA);
                                                while (it10.hasNext()) {
                                                    List list20 = (List) it10.next();
                                                    ArrayList arrayList12 = new ArrayList(r3d.q(list20, 10));
                                                    Iterator it12 = list20.iterator();
                                                    while (it12.hasNext()) {
                                                        arrayList12.add(new ycl(lxr0.b(((ojh) it12.next()).f.size())));
                                                    }
                                                    float fA2 = lxr0.a(arrayList12);
                                                    float f22 = lxr0.f20830a;
                                                    int size2 = arrayList12.size() - 1;
                                                    if (size2 < 0) {
                                                        size2 = 0;
                                                    }
                                                    ycl yclVar11 = new ycl((f22 * size2) + fA2);
                                                    if (yclVar10.compareTo(yclVar11) < 0) {
                                                        yclVar10 = yclVar11;
                                                    }
                                                }
                                                f = yclVar10.f42389a;
                                            }
                                            float f23 = lxr0.f20830a;
                                            ArrayList arrayList13 = new ArrayList(arrayList10.size());
                                            ArrayList arrayList14 = new ArrayList(arrayList10.size());
                                            List list21 = (List) CollectionsKt.firstOrNull(arrayList10);
                                            if (list21 == null) {
                                                list21 = iun.f15405a;
                                            }
                                            if (list21.isEmpty()) {
                                                pair = new Pair(arrayList13, arrayList14);
                                                arrayList = arrayList10;
                                                i = 0;
                                            } else {
                                                LinkedHashMap linkedHashMapJ = yqm0.j(list21);
                                                ojh ojhVar3 = (ojh) CollectionsKt.firstOrNull(list21);
                                                if (ojhVar3 == null) {
                                                    objB = lun.f20680a;
                                                    objB.getClass();
                                                } else {
                                                    ycl yclVar12 = new ycl((f - lxr0.b(ojhVar3.f.size())) / 2.0f);
                                                    zcl zclVar21 = qmk.f28987a;
                                                    ycl yclVar13 = new ycl(0.0f);
                                                    if (yclVar12.compareTo(yclVar13) < 0) {
                                                        yclVar12 = yclVar13;
                                                    }
                                                    objB = wp20.b(new Pair(ojhVar3.f25359a, yclVar12));
                                                }
                                                arrayList13.add(objB);
                                                arrayList14.add(linkedHashMapJ);
                                                Iterator it13 = r3d.r(arrayList10).iterator();
                                                if (it13.hasNext()) {
                                                    yclVar = new ycl(lxr0.b(((ojh) it13.next()).f.size()));
                                                    while (it13.hasNext()) {
                                                        ycl yclVar14 = new ycl(lxr0.b(((ojh) it13.next()).f.size()));
                                                        if (yclVar.compareTo(yclVar14) > 0) {
                                                            yclVar = yclVar14;
                                                        }
                                                    }
                                                } else {
                                                    yclVar = null;
                                                }
                                                if (yclVar != null) {
                                                    f2 = yclVar.f42389a;
                                                } else {
                                                    zcl zclVar22 = qmk.f28987a;
                                                    f2 = 0.0f;
                                                }
                                                float f24 = (f2 + f23) / 2.0f;
                                                int size3 = arrayList10.size();
                                                int i16 = 1;
                                                while (i16 < size3) {
                                                    List<ojh> list22 = (List) arrayList10.get(i16);
                                                    LinkedHashMap linkedHashMapJ2 = yqm0.j(list22);
                                                    int i17 = i16 - 1;
                                                    Map map9 = (Map) arrayList13.get(i17);
                                                    Map map10 = (Map) arrayList14.get(i17);
                                                    int iA = wp20.a(r3d.q(list22, 10));
                                                    if (iA < 16) {
                                                        iA = 16;
                                                    }
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                                                    for (ojh ojhVar4 : list22) {
                                                        String str22 = ojhVar4.f25359a;
                                                        float f25 = f23;
                                                        float f26 = ((ycl) xp20.d(linkedHashMapJ2, str22)).f42389a;
                                                        map9.getClass();
                                                        map10.getClass();
                                                        lc00 lc00VarB = kotlin.collections.a.b();
                                                        ArrayList arrayList15 = arrayList10;
                                                        Iterator it14 = ojhVar4.d.iterator();
                                                        while (it14.hasNext()) {
                                                            Iterator it15 = it14;
                                                            String str23 = (String) it14.next();
                                                            float f27 = f24;
                                                            ycl yclVar15 = (ycl) map9.get(str23);
                                                            if (yclVar15 != null) {
                                                                float f28 = yclVar15.f42389a;
                                                                ycl yclVar16 = (ycl) map10.get(str23);
                                                                if (yclVar16 != null) {
                                                                    float f29 = yclVar16.f42389a;
                                                                    sxr0[] sxr0VarArr = sxr0.f32993a;
                                                                    lc00VarB.add(new ycl((f29 * 0.25f) + f28));
                                                                }
                                                            }
                                                            it14 = it15;
                                                            f24 = f27;
                                                        }
                                                        float f30 = f24;
                                                        Iterator it16 = ojhVar4.e.iterator();
                                                        while (it16.hasNext()) {
                                                            String str24 = (String) it16.next();
                                                            Iterator it17 = it16;
                                                            ycl yclVar17 = (ycl) map9.get(str24);
                                                            if (yclVar17 != null) {
                                                                float f31 = yclVar17.f42389a;
                                                                ycl yclVar18 = (ycl) map10.get(str24);
                                                                if (yclVar18 != null) {
                                                                    float f32 = yclVar18.f42389a;
                                                                    sxr0[] sxr0VarArr2 = sxr0.f32993a;
                                                                    lc00VarB.add(new ycl((f32 * 0.75f) + f31));
                                                                }
                                                            }
                                                            it16 = it17;
                                                        }
                                                        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                                                        if (lc00VarA.isEmpty()) {
                                                            List listSplit$default = StringsKt__StringsKt.split$default(StringsKt.u0(ojhVar4.b).toString(), new String[]{"-"}, false, 0, 6, null);
                                                            String str25 = (String) CollectionsKt.firstOrNull(listSplit$default);
                                                            Integer intOrNull = str25 != null ? StringsKt.toIntOrNull(str25) : null;
                                                            String str26 = (String) CollectionsKt.f0(listSplit$default);
                                                            Integer intOrNull2 = str26 != null ? StringsKt.toIntOrNull(str26) : null;
                                                            fIntValue = ((f / 2.0f) - (f30 * ((intOrNull == null || intOrNull2 == null) ? 0 : intOrNull.intValue() - intOrNull2.intValue()))) - (f26 / 2.0f);
                                                        } else {
                                                            zcl zclVar23 = qmk.f28987a;
                                                            ListIterator listIterator3 = lc00VarA.listIterator(0);
                                                            float f33 = 0.0f;
                                                            while (true) {
                                                                paw pawVar = (paw) listIterator3;
                                                                if (pawVar.hasNext()) {
                                                                    f33 += ((ycl) pawVar.next()).f42389a;
                                                                } else {
                                                                    fIntValue = (f33 / lc00VarA.b) - (f26 / 2.0f);
                                                                }
                                                            }
                                                        }
                                                        linkedHashMap.put(str22, new ycl(fIntValue));
                                                        f23 = f25;
                                                        arrayList10 = arrayList15;
                                                        f24 = f30;
                                                    }
                                                    float f34 = f23;
                                                    ArrayList arrayList16 = arrayList10;
                                                    float f35 = f24;
                                                    if (list22.isEmpty()) {
                                                        map = lun.f20680a;
                                                        map.getClass();
                                                    } else {
                                                        List listA0 = CollectionsKt.A0(list22, new b0c(linkedHashMap, (byte) 6));
                                                        ArrayList arrayList17 = new ArrayList(r3d.q(listA0, 10));
                                                        Iterator it18 = listA0.iterator();
                                                        while (it18.hasNext()) {
                                                            arrayList17.add(((ojh) it18.next()).f25359a);
                                                        }
                                                        ArrayList arrayList18 = new ArrayList(r3d.q(arrayList17, 10));
                                                        Iterator it19 = arrayList17.iterator();
                                                        while (it19.hasNext()) {
                                                            ycl yclVar19 = (ycl) linkedHashMapJ2.get((String) it19.next());
                                                            if (yclVar19 != null) {
                                                                f4 = yclVar19.f42389a;
                                                            } else {
                                                                zcl zclVar24 = qmk.f28987a;
                                                                f4 = 0.0f;
                                                            }
                                                            arrayList18.add(new ycl(f4));
                                                        }
                                                        float fA3 = lxr0.a(arrayList18);
                                                        int size4 = arrayList18.size() - 1;
                                                        if (size4 < 0) {
                                                            size4 = 0;
                                                        }
                                                        float f36 = (size4 * f34) + fA3;
                                                        ArrayList arrayList19 = new ArrayList(arrayList17.size());
                                                        zcl zclVar25 = qmk.f28987a;
                                                        int size5 = arrayList17.size();
                                                        float f37 = 0.0f;
                                                        for (int i18 = 0; i18 < size5; i18++) {
                                                            arrayList19.add(new ycl(f37));
                                                            f37 += ((ycl) arrayList18.get(i18)).f42389a;
                                                            if (i18 != arrayList17.size() - 1) {
                                                                f37 += f34;
                                                            }
                                                        }
                                                        int i19 = 0;
                                                        float f38 = 0.0f;
                                                        for (Object obj6 : arrayList17) {
                                                            int i20 = i19 + 1;
                                                            if (i19 < 0) {
                                                                q3d.p();
                                                                throw null;
                                                            }
                                                            ycl yclVar20 = (ycl) linkedHashMap.get((String) obj6);
                                                            if (yclVar20 != null) {
                                                                f3 = yclVar20.f42389a;
                                                            } else {
                                                                zcl zclVar26 = qmk.f28987a;
                                                                f3 = 0.0f;
                                                            }
                                                            Object obj7 = arrayList19.get(i19);
                                                            obj7.getClass();
                                                            f38 += f3 - ((ycl) obj7).f42389a;
                                                            i19 = i20;
                                                        }
                                                        float size6 = f38 / arrayList17.size();
                                                        ycl yclVar21 = new ycl(f - f36);
                                                        zcl zclVar27 = qmk.f28987a;
                                                        ycl yclVar22 = new ycl(0.0f);
                                                        if (yclVar21.compareTo(yclVar22) < 0) {
                                                            yclVar21 = yclVar22;
                                                        }
                                                        float f39 = ((ycl) l1e0.h(new ycl(size6), new ycl(0.0f), yclVar21)).f42389a;
                                                        Map linkedHashMap2 = new LinkedHashMap(arrayList17.size());
                                                        int i21 = 0;
                                                        for (Object obj8 : arrayList17) {
                                                            int i22 = i21 + 1;
                                                            if (i21 < 0) {
                                                                q3d.p();
                                                                throw null;
                                                            }
                                                            Object obj9 = arrayList19.get(i21);
                                                            obj9.getClass();
                                                            linkedHashMap2.put((String) obj8, new ycl(((ycl) obj9).f42389a + f39));
                                                            i21 = i22;
                                                        }
                                                        map = linkedHashMap2;
                                                    }
                                                    arrayList13.add(map);
                                                    arrayList14.add(linkedHashMapJ2);
                                                    i16++;
                                                    f23 = f34;
                                                    arrayList10 = arrayList16;
                                                    f24 = f35;
                                                }
                                                arrayList = arrayList10;
                                                i = 0;
                                                pair = new Pair(arrayList13, arrayList14);
                                            }
                                            i4VarR0 = dyb.r0(msm0.i(arrayList, (List) pair.f46059a, (List) pair.b, f, qlhVar, i15, ctf0Var));
                                        }
                                        if (i4VarR0 == null) {
                                        }
                                        lea0Var = this;
                                        nxr0Var = new nxr0(i4VarR0);
                                    } else {
                                        j0g0Var = j0g0Var;
                                        i = 0;
                                    }
                                    i4VarR0 = lak0.c;
                                    lea0Var = this;
                                    nxr0Var = new nxr0(i4VarR0);
                                }
                            }
                            i = 0;
                        }
                    } else {
                        num = num3;
                        i = 0;
                        z = true;
                        th = null;
                    }
                    lea0Var = this;
                    nxr0Var = th;
                }
                g2v g2vVar = lea0Var.b;
                if (j0g0Var == null) {
                    gjhVar = new ijh(g2v.b(g2vVar, ozb.K(46L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018));
                } else if (nxr0Var == 0) {
                    gjhVar = new hjh(g2v.b(g2vVar, ozb.J(46L, pb10.v), null, ldm.b, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602));
                } else {
                    int iIntValue4 = num != null ? num.intValue() : i;
                    if (j0g0Var != null) {
                        Object obj10 = j0g0Var.f15681a;
                        if (obj10 instanceof g0g0) {
                            obj10 = th;
                        }
                        r1 = (List) obj10;
                    } else {
                        r1 = th;
                    }
                    if (r1 == 0) {
                        r1 = iun.f15405a;
                    }
                    rkh rkhVar2 = (rkh) CollectionsKt.firstOrNull(r1);
                    ?? I = (rkhVar2 == null || (list2 = rkhVar2.r) == null) ? th : hkb.I(list2);
                    if (I == 0) {
                        I = iun.f15405a;
                    }
                    ArrayList arrayList20 = new ArrayList();
                    for (Object obj11 : I) {
                        if (vsm0.m((xlh) obj11)) {
                            arrayList20.add(obj11);
                        }
                    }
                    ArrayList arrayList21 = new ArrayList(r3d.q(arrayList20, 10));
                    int i23 = i;
                    for (Object obj12 : arrayList20) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            q3d.p();
                            throw th;
                        }
                        arrayList21.add(new qwr0(((xlh) obj12).a(), i23, i23 == iIntValue4 ? z : i));
                        i23 = i24;
                    }
                    a4x a4xVarO0 = dyb.o0(arrayList21);
                    Object obj13 = rkhVar2 != null ? rkhVar2.e : th;
                    ?? r7 = obj13;
                    if (obj13 == null) {
                        r7 = "";
                    }
                    Object obj14 = rkhVar2 != null ? rkhVar2.m : th;
                    gjhVar = new gjh(nxr0Var, new pwr0(iIntValue4, a4xVarO0, r7, obj14 != null ? obj14 : ""));
                }
                StaticColors staticColors = StaticColors.INSTANCE;
                return new kmh(new imm(new ilm(staticColors.m123getWhite0d7_KjU()), mlm.f21997a, fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null), ((fee) lea0Var.f.getValue()).e, gjhVar);
        }
    }

    public lea0(o7e0 o7e0Var, g2v g2vVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = g2vVar;
        this.c = ctf0Var;
        Object obj = null;
        this.d = maz.b(new yw9(null, new caz(this, (byte) 13), (byte) 20));
        this.e = maz.b(new yw9(o7e0Var, new bod0((byte) 16), (byte) 20));
        j0g0 j0g0Var = o7e0Var.d;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            obj = (List) (obj2 instanceof g0g0 ? null : obj2);
        }
        this.f = maz.b(new yw9(obj == null ? iun.f15405a : obj, new v6d0(this, (byte) 19), (byte) 20));
    }

    public lea0(fmh fmhVar, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.c = ctf0Var;
        this.b = g2vVar;
        this.d = bkb.H(fmhVar.c);
        n0o0 n0o0VarH = bkb.H(fmhVar.f9781a);
        this.e = n0o0VarH;
        this.f = maz.b(new yw9((fee) n0o0VarH.getValue(), new t9r0((byte) 26), (byte) 20));
    }
}
