package a;

import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.betting.core.zip.model.zip.game.StatInfo;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s7n0 {
    /* JADX WARN: Code duplicated, block: B:188:0x0427  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r58v0, types: [java.util.List] */
    public static final nas A(r7n0 r7n0Var, sip sipVar, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        k9n0 k9n0Var;
        d9n0 d9n0Var;
        tas tasVar;
        String str2;
        Long l;
        Long l2;
        ArrayList arrayList3;
        vas vasVar;
        ?? arrayList4;
        ArrayList arrayList5;
        Integer num;
        Integer num2;
        Map map;
        Boolean bool;
        Long l3;
        ArrayList arrayList6;
        Long l4;
        ArrayList arrayList7;
        long j2;
        Long l5;
        ArrayList arrayList8;
        r7n0Var.getClass();
        Long l6 = r7n0Var.h;
        Long l7 = r7n0Var.z;
        k9n0 k9n0Var2 = r7n0Var.t;
        Long l8 = r7n0Var.r;
        Boolean bool2 = r7n0Var.u;
        Boolean bool3 = r7n0Var.s;
        j8n0 j8n0Var = r7n0Var.g;
        m8n0 m8n0Var = r7n0Var.f;
        m8n0 m8n0Var2 = r7n0Var.e;
        Long l9 = r7n0Var.x;
        gan0 gan0Var = r7n0Var.v;
        d9n0 d9n0Var2 = r7n0Var.f29986a;
        a8n0 a8n0Var = r7n0Var.c;
        d9n0 d9n0Var3 = r7n0Var.b;
        if (l6 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l6.longValue();
        List list = r7n0Var.i;
        long jLongValue2 = 0;
        if (list != null) {
            ArrayList arrayList9 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z6n0 z6n0Var = (z6n0) it.next();
                Long l10 = z6n0Var.f43879a;
                long jLongValue3 = l10 != null ? l10.longValue() : 0L;
                List list2 = z6n0Var.b;
                Iterator it2 = it;
                if (list2 != null) {
                    int i = 10;
                    arrayList8 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List list3 = (List) it3.next();
                        Iterator it4 = it3;
                        m8n0 m8n0Var3 = m8n0Var2;
                        ArrayList arrayList10 = new ArrayList(r3d.q(list3, i));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            j7n0 j7n0Var = (j7n0) it5.next();
                            Long l11 = z6n0Var.f43879a;
                            Iterator it6 = it5;
                            arrayList10.add(k7n0.C(j7n0Var, l11 != null ? l11.longValue() : 0L, r7n0Var.C, l6.longValue(), r7n0Var.k, d9n0Var3 != null ? d9n0Var3.f5710a : null));
                            it5 = it6;
                        }
                        arrayList8.add(arrayList10);
                        it3 = it4;
                        m8n0Var2 = m8n0Var3;
                        i = 10;
                    }
                } else {
                    arrayList8 = null;
                }
                m8n0 m8n0Var4 = m8n0Var2;
                arrayList9.add(new u9s(arrayList8, Long.valueOf(jLongValue3), z6n0Var.c));
                it = it2;
                bool3 = bool3;
                m8n0Var = m8n0Var;
                m8n0Var2 = m8n0Var4;
            }
            arrayList = arrayList9;
        } else {
            arrayList = null;
        }
        Boolean bool4 = bool3;
        m8n0 m8n0Var5 = m8n0Var;
        m8n0 m8n0Var6 = m8n0Var2;
        List list4 = r7n0Var.F;
        if (list4 != null) {
            ArrayList arrayList11 = new ArrayList();
            for (Object obj : list4) {
                Long l12 = ((n9n0) obj).f23150a;
                if (l12 != null && l12.longValue() > 0) {
                    arrayList11.add(obj);
                }
            }
            ArrayList arrayList12 = new ArrayList(r3d.q(arrayList11, 10));
            Iterator it7 = arrayList11.iterator();
            while (it7.hasNext()) {
                n9n0 n9n0Var = (n9n0) it7.next();
                n9n0Var.getClass();
                Long l13 = n9n0Var.f23150a;
                if (l13 == null) {
                    jf4.k(null);
                    return null;
                }
                long jLongValue4 = l13.longValue();
                List list5 = n9n0Var.d;
                if (list5 != null) {
                    ArrayList arrayList13 = new ArrayList(r3d.q(list5, 10));
                    Iterator it8 = list5.iterator();
                    while (it8.hasNext()) {
                        z6n0 z6n0Var2 = (z6n0) it8.next();
                        Long l14 = z6n0Var2.f43879a;
                        long jLongValue5 = l14 != null ? l14.longValue() : 0L;
                        List list6 = z6n0Var2.b;
                        Iterator it9 = it8;
                        if (list6 != null) {
                            int i2 = 10;
                            arrayList7 = new ArrayList(r3d.q(list6, 10));
                            Iterator it10 = list6.iterator();
                            while (it10.hasNext()) {
                                List list7 = (List) it10.next();
                                Iterator it11 = it10;
                                ArrayList arrayList14 = arrayList12;
                                ArrayList arrayList15 = new ArrayList(r3d.q(list7, i2));
                                Iterator it12 = list7.iterator();
                                while (it12.hasNext()) {
                                    j7n0 j7n0Var2 = (j7n0) it12.next();
                                    Long l15 = z6n0Var2.f43879a;
                                    long jLongValue6 = l15 != null ? l15.longValue() : 0L;
                                    Integer num3 = r7n0Var.C;
                                    Boolean bool5 = r7n0Var.k;
                                    Iterator it13 = it12;
                                    if (d9n0Var3 != null) {
                                        j2 = jLongValue6;
                                        l5 = d9n0Var3.f5710a;
                                    } else {
                                        j2 = jLongValue6;
                                        l5 = null;
                                    }
                                    v9s v9sVarC = k7n0.C(j7n0Var2, j2, num3, jLongValue4, bool5, l5);
                                    jLongValue4 = jLongValue4;
                                    arrayList15.add(v9sVarC);
                                    it12 = it13;
                                }
                                arrayList7.add(arrayList15);
                                it10 = it11;
                                arrayList12 = arrayList14;
                                i2 = 10;
                            }
                        } else {
                            arrayList7 = null;
                        }
                        ArrayList arrayList16 = arrayList12;
                        arrayList13.add(new u9s(arrayList7, Long.valueOf(jLongValue5), z6n0Var2.c));
                        it8 = it9;
                        it7 = it7;
                        l9 = l9;
                        arrayList12 = arrayList16;
                    }
                    arrayList6 = arrayList13;
                } else {
                    arrayList6 = null;
                }
                ArrayList arrayList17 = arrayList12;
                Iterator it14 = it7;
                Long l16 = l9;
                long jLongValue7 = l16 != null ? l16.longValue() : jLongValue4;
                Long l17 = r7n0Var.y;
                String str3 = r7n0Var.l;
                String str4 = r7n0Var.p;
                String str5 = r7n0Var.o;
                String str6 = gan0Var != null ? gan0Var.b : null;
                Integer num4 = r7n0Var.E;
                String str7 = r7n0Var.A;
                Integer num5 = r7n0Var.n;
                Boolean bool6 = r7n0Var.k;
                String str8 = n9n0Var.b;
                Long l18 = a8n0Var != null ? a8n0Var.f435a : null;
                String str9 = a8n0Var != null ? a8n0Var.b : null;
                oas oasVarL = n8n0.l(m8n0Var6);
                oas oasVarL2 = n8n0.l(m8n0Var5);
                Long l19 = r7n0Var.d;
                Long lValueOf = l19 != null ? Long.valueOf(l19.longValue() - j) : null;
                Long l20 = d9n0Var3 != null ? d9n0Var3.f5710a : null;
                long jLongValue8 = (d9n0Var2 == null || (l4 = d9n0Var2.f5710a) == null) ? 0L : l4.longValue();
                ufs ufsVar = j8n0Var != null ? new ufs(j8n0Var.b, j8n0Var.e, j8n0Var.f16093a, j8n0Var.c, j8n0Var.d, j8n0Var.h, j8n0Var.g) : null;
                boolean zBooleanValue = bool4 != null ? bool4.booleanValue() : false;
                boolean zD = Intrinsics.d(bool2, Boolean.TRUE);
                Boolean bool7 = r7n0Var.w;
                Integer numValueOf = l8 != 0 ? Integer.valueOf((int) l8.longValue()) : null;
                String str10 = k9n0Var2 != null ? k9n0Var2.f17923a : null;
                Boolean bool8 = gan0Var != null ? gan0Var.f10977a : null;
                qud qudVar = boh.b;
                Integer num6 = a8n0Var != null ? a8n0Var.c : null;
                Boolean bool9 = d9n0Var2 != null ? d9n0Var2.c : null;
                qudVar.getClass();
                nas nasVar = new nas(jLongValue4, jLongValue7, l17, str3, str4, str5, str6, bool8, num4, str7, num5, bool6, str8, null, null, arrayList6, l18, sipVar, str9, null, l19, lValueOf, l20, jLongValue8, oasVarL, oasVarL2, zD, null, ufsVar, Boolean.valueOf(zBooleanValue), null, null, bool7, numValueOf, str10, null, qud.d(num6, bool9), l7 != null ? Integer.valueOf((int) l7.longValue()) : null);
                arrayList12 = arrayList17;
                arrayList12.add(nasVar);
                it7 = it14;
                l9 = l16;
            }
            arrayList2 = arrayList12;
        } else {
            arrayList2 = null;
        }
        Long l21 = l9;
        long jLongValue9 = (d9n0Var2 == null || (l3 = d9n0Var2.f5710a) == null) ? 0L : l3.longValue();
        u8n0 u8n0Var = r7n0Var.m;
        if (u8n0Var != null) {
            String str11 = u8n0Var.d;
            o7n0 o7n0Var = u8n0Var.l;
            Integer num7 = u8n0Var.c;
            String str12 = u8n0Var.f35239a;
            List list8 = u8n0Var.b;
            if (list8 != null) {
                str = "";
                ArrayList arrayList18 = new ArrayList(r3d.q(list8, 10));
                Iterator it15 = list8.iterator();
                while (it15.hasNext()) {
                    r8n0 r8n0Var = (r8n0) it15.next();
                    Iterator it16 = it15;
                    Integer num8 = r8n0Var.f30036a;
                    int iIntValue = num8 != null ? num8.intValue() : 0;
                    Integer num9 = num7;
                    String str13 = str12;
                    Integer num10 = r8n0Var.f30036a;
                    String strValueOf = num10 != null ? String.valueOf(num10.intValue()) : null;
                    if (strValueOf == null) {
                        strValueOf = str;
                    }
                    d9n0 d9n0Var4 = d9n0Var2;
                    Integer num11 = r8n0Var.b;
                    int iIntValue2 = num11 != null ? num11.intValue() : 0;
                    Integer num12 = r8n0Var.c;
                    arrayList18.add(new df90(iIntValue, new tf90(strValueOf, iIntValue2, num12 != null ? num12.intValue() : 0)));
                    it15 = it16;
                    d9n0Var2 = d9n0Var4;
                    num7 = num9;
                    str12 = str13;
                }
                arrayList3 = arrayList18;
            } else {
                str = "";
                arrayList3 = null;
            }
            Integer num13 = num7;
            String str14 = str12;
            d9n0Var = d9n0Var2;
            Integer num14 = u8n0Var.e;
            Integer num15 = u8n0Var.f;
            Integer num16 = u8n0Var.g;
            if (jLongValue9 == 66) {
                iso isoVar = u8n0Var.h;
                if (isoVar != null) {
                    vasVar = qbc.Z(isoVar);
                } else {
                    vasVar = null;
                }
            } else {
                q9n0 q9n0Var = u8n0Var.i;
                if (q9n0Var != null) {
                    vasVar = new vas(q9n0Var.f28358a, q9n0Var.b);
                } else {
                    vasVar = null;
                }
            }
            String str15 = u8n0Var.j;
            dan0 dan0Var = u8n0Var.k;
            Long l22 = dan0Var != null ? dan0Var.f5758a : null;
            Integer num17 = dan0Var != null ? dan0Var.b : null;
            Integer numValueOf2 = Integer.valueOf((int) ((dan0Var == null || (bool = dan0Var.c) == null) ? 0 : bool.booleanValue()));
            String str16 = u8n0Var.m;
            l5h0 l5h0Var = u8n0Var.q;
            if (l5h0Var == null || (map = l5h0Var.f19456a) == null) {
                arrayList4 = iun.f15405a;
            } else {
                arrayList4 = new ArrayList(map.size());
                Iterator it17 = map.entrySet().iterator();
                while (it17.hasNext()) {
                    arrayList4.add(nkb.x((Map.Entry) it17.next()));
                }
            }
            ?? r58 = arrayList4;
            Map map2 = u8n0Var.r;
            if (map2 != null) {
                ArrayList arrayList19 = new ArrayList(map2.size());
                Iterator it18 = map2.entrySet().iterator();
                while (it18.hasNext()) {
                    Map.Entry entry = (Map.Entry) it18.next();
                    Integer intOrNull = StringsKt.toIntOrNull((String) entry.getKey());
                    Iterator it19 = it18;
                    Integer numValueOf3 = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0);
                    Iterable iterable = (Iterable) entry.getValue();
                    Integer num18 = num15;
                    Integer num19 = num16;
                    String str17 = str15;
                    ArrayList arrayList20 = new ArrayList(r3d.q(iterable, 10));
                    Iterator it20 = iterable.iterator();
                    while (it20.hasNext()) {
                        t9n0 t9n0Var = (t9n0) it20.next();
                        Iterator it21 = it20;
                        b7m0 b7m0Var = t9n0Var.f33574a;
                        z6m0 z6m0VarP0 = b7m0Var != null ? ucx.p0(b7m0Var) : z6m0.c;
                        String str18 = str16;
                        String str19 = t9n0Var.b;
                        if (str19 == null) {
                            str19 = str;
                        }
                        k9n0 k9n0Var3 = k9n0Var2;
                        String str20 = t9n0Var.c;
                        if (str20 == null) {
                            str20 = str;
                        }
                        String str21 = t9n0Var.d;
                        if (str21 == null) {
                            str21 = str;
                        }
                        arrayList20.add(new GameStatistic(z6m0VarP0, str19, str20, str21));
                        it20 = it21;
                        k9n0Var2 = k9n0Var3;
                        str16 = str18;
                    }
                    arrayList19.add(new StatInfo(numValueOf3, arrayList20));
                    it18 = it19;
                    k9n0Var2 = k9n0Var2;
                    num15 = num18;
                    num16 = num19;
                    str15 = str17;
                }
                arrayList5 = arrayList19;
            } else {
                arrayList5 = null;
            }
            k9n0Var = k9n0Var2;
            Integer num20 = num15;
            Integer num21 = num16;
            String str22 = str15;
            String str23 = str16;
            Boolean bool10 = u8n0Var.n;
            tasVar = new tas(str11, num13, str14, arrayList3, num14, num20, num21, vasVar, str22, l22, num17, numValueOf2, str23, r58, arrayList5, Integer.valueOf((int) (bool10 != null ? bool10.booleanValue() : 0)), u8n0Var.p, u8n0Var.t, new ubr((o7n0Var == null || (num2 = o7n0Var.f24794a) == null) ? 0 : num2.intValue(), (o7n0Var == null || (num = o7n0Var.b) == null) ? 0 : num.intValue()));
        } else {
            str = "";
            k9n0Var = k9n0Var2;
            d9n0Var = d9n0Var2;
            tasVar = null;
        }
        long jLongValue10 = l21 != null ? l21.longValue() : jLongValue;
        Long l23 = r7n0Var.B;
        String str24 = r7n0Var.l;
        String str25 = r7n0Var.p;
        String str26 = r7n0Var.o;
        String str27 = gan0Var != null ? gan0Var.b : null;
        Integer num22 = r7n0Var.E;
        String str28 = r7n0Var.A;
        Integer num23 = r7n0Var.n;
        long j3 = jLongValue10;
        Boolean bool11 = r7n0Var.k;
        String str29 = r7n0Var.j;
        long jLongValue11 = (a8n0Var == null || (l2 = a8n0Var.f435a) == null) ? 0L : l2.longValue();
        if (a8n0Var == null || (str2 = a8n0Var.b) == null) {
            str2 = str;
        }
        oas oasVarL3 = n8n0.l(m8n0Var6);
        oas oasVarL4 = n8n0.l(m8n0Var5);
        String str30 = str2;
        Long l24 = r7n0Var.d;
        Long lValueOf2 = l24 != null ? Long.valueOf(l24.longValue() - j) : null;
        if (d9n0Var3 != null && (l = d9n0Var3.f5710a) != null) {
            jLongValue2 = l.longValue();
        }
        ufs ufsVar2 = j8n0Var != null ? new ufs(j8n0Var.b, j8n0Var.e, j8n0Var.f16093a, j8n0Var.c, j8n0Var.d, j8n0Var.h, j8n0Var.g) : null;
        boolean zBooleanValue2 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool12 = r7n0Var.q;
        Boolean bool13 = r7n0Var.w;
        boolean zD2 = Intrinsics.d(bool2, Boolean.TRUE);
        boolean z = zBooleanValue2;
        Integer numValueOf4 = l8 != 0 ? Integer.valueOf((int) l8.longValue()) : null;
        String str31 = k9n0Var != null ? k9n0Var.f17923a : null;
        Boolean bool14 = gan0Var != null ? gan0Var.f10977a : null;
        qud qudVar2 = boh.b;
        Integer num24 = a8n0Var != null ? a8n0Var.c : null;
        Boolean bool15 = d9n0Var != null ? d9n0Var.c : null;
        qudVar2.getClass();
        return new nas(jLongValue, j3, l23, str24, str25, str26, str27, bool14, num22, str28, num23, bool11, str29, null, arrayList2, arrayList, Long.valueOf(jLongValue11), sipVar, str30, tasVar, l24, lValueOf2, Long.valueOf(jLongValue2), jLongValue9, oasVarL3, oasVarL4, zD2, null, ufsVar2, Boolean.valueOf(z), bool12, null, bool13, numValueOf4, str31, null, qud.d(num24, bool15), l7 != null ? Integer.valueOf((int) l7.longValue()) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    public static final n3w B(kor0 kor0Var, String str) {
        Double d;
        q4f q4fVar;
        ?? arrayList;
        Iterator it;
        mvn mvnVar;
        mvn mvnVar2;
        lvo0 lvo0Var;
        kor0Var.getClass();
        str.getClass();
        String str2 = kor0Var.d;
        pxu pxuVar = kor0Var.s;
        Double d2 = kor0Var.l;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        s77 s77Var = s77.TOTO;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        String strValueOf = kor0Var.m;
        if (strValueOf == null) {
            strValueOf = d2 != null ? String.valueOf(d2.doubleValue()) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
        }
        Long l = kor0Var.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        qud qudVar = e4f.f7178a;
        List list = null;
        Integer num = kor0Var.k;
        int iIntValue = num != null ? num.intValue() : 0;
        qudVar.getClass();
        e4f e4fVarE = qud.e(iIntValue);
        Double d3 = kor0Var.h;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
        double dDoubleValue3 = ((pxuVar == null || (lvo0Var = pxuVar.f) == null || (d = lvo0Var.b) == null) && (d = kor0Var.i) == null) ? 0.0d : d.doubleValue();
        String strS = s(kor0Var);
        Boolean bool = kor0Var.n;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num2 = kor0Var.g;
        switch (num2 != null ? num2.intValue() : 0) {
            case 1:
                q4fVar = q4f.q;
                break;
            case 2:
                q4fVar = q4f.o;
                break;
            case 3:
                q4fVar = q4f.n;
                break;
            case 4:
                q4fVar = q4f.p;
                break;
            case 5:
            case 12:
                q4fVar = q4f.t;
                break;
            case 6:
                q4fVar = q4f.r;
                break;
            case 7:
                q4fVar = q4f.u;
                break;
            case 8:
            case 10:
            default:
                q4fVar = q4f.b;
                break;
            case 9:
                q4fVar = q4f.s;
                break;
            case 11:
                q4fVar = q4f.v;
                break;
        }
        q4f q4fVar2 = q4fVar;
        v21 v21Var = v21.NONE;
        r21 r21Var = r21.NONE;
        String strS2 = s(kor0Var);
        Boolean bool2 = kor0Var.o;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        hxu hxuVarN0 = pxuVar != null ? dyb.n0(pxuVar) : hxu.h;
        mob0 mob0Var = mob0.f;
        uoy uoyVar = uoy.UNKNOWN;
        List list2 = kor0Var.r;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                hnb hnbVar = (hnb) it2.next();
                List<nnr0> list3 = hnbVar.f;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    for (nnr0 nnr0Var : list3) {
                        nnr0Var.getClass();
                        String str3 = str2;
                        Long l2 = hnbVar.f13343a;
                        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                        String str4 = hnbVar.b;
                        String str5 = str4 == null ? "" : str4;
                        Long l3 = nnr0Var.b;
                        Long l4 = nnr0Var.f23837a;
                        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                        long jLongValue5 = l4 != null ? l4.longValue() : 0L;
                        Integer num3 = nnr0Var.p;
                        if (num3 != null && num3.intValue() == 0) {
                            mvnVar2 = mvn.b;
                            it = it2;
                        } else {
                            if (num3 == null) {
                                it = it2;
                            } else {
                                it = it2;
                                if (num3.intValue() == 1) {
                                    mvnVar = mvn.c;
                                }
                                mvnVar2 = mvnVar;
                            }
                            mvnVar = (num3 != null && num3.intValue() == -1) ? mvn.e : mvn.f22465a;
                            mvnVar2 = mvnVar;
                        }
                        String str6 = nnr0Var.h;
                        String str7 = str6 == null ? "" : str6;
                        Long l5 = nnr0Var.q;
                        long jLongValue6 = l5 != null ? l5.longValue() : 0L;
                        String str8 = nnr0Var.s;
                        if (str8 == null) {
                            str8 = "";
                        }
                        List listC = kotlin.collections.a.c(str8);
                        String str9 = nnr0Var.i;
                        String str10 = str9 == null ? "" : str9;
                        Long l6 = nnr0Var.r;
                        long jLongValue7 = l6 != null ? l6.longValue() : 0L;
                        String str11 = nnr0Var.t;
                        if (str11 == null) {
                            str11 = "";
                        }
                        List listC2 = kotlin.collections.a.c(str11);
                        String str12 = nnr0Var.e;
                        String str13 = str12 == null ? "" : str12;
                        Long l7 = nnr0Var.f;
                        long jLongValue8 = l7 != null ? l7.longValue() : 0L;
                        List list4 = nnr0Var.n;
                        String strB0 = list4 != null ? CollectionsKt.b0(list4, null, null, null, null, 63) : null;
                        String str14 = strB0 == null ? "" : strB0;
                        Integer num4 = nnr0Var.y;
                        int iIntValue2 = num4 != null ? num4.intValue() : 0;
                        String str15 = nnr0Var.c;
                        String str16 = str15 == null ? "" : str15;
                        String str17 = nnr0Var.d;
                        String str18 = str17 == null ? "" : str17;
                        Double d4 = nnr0Var.l;
                        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
                        lnr0 lnr0Var = nnr0Var.z;
                        List list5 = lnr0Var != null ? lnr0Var.f20361a : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        List list6 = list5;
                        List list7 = lnr0Var != null ? lnr0Var.b : null;
                        if (list7 == null) {
                            list7 = iun.f15405a;
                        }
                        arrayList.add(new su6(jLongValue2, str5, 0, 0.0d, "", jLongValue3, false, jLongValue4, jLongValue5, "", mvnVar2, false, str7, jLongValue6, listC, str10, jLongValue7, listC2, str13, jLongValue8, str14, iIntValue2, 0, str16, 0L, false, "", "", str18, false, 0.0d, 0L, 0L, "", 0, -1, -1, 0.0d, dDoubleValue4, "", false, "", "", false, list6, list7));
                        str2 = str3;
                        it2 = it;
                    }
                } else {
                    arrayList = 0;
                }
                String str19 = str2;
                Iterator it3 = it2;
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                w3d.u(arrayList2, arrayList);
                str2 = str19;
                it2 = it3;
            }
            list = arrayList2;
        }
        String str20 = str2;
        if (list == null) {
            list = iun.f15405a;
        }
        List list8 = list;
        an6.f1135a.getClass();
        an6 an6VarD = kl5.d(0);
        ozc ozcVar = ozc.POSSIBLE_PAYOUT;
        Long l8 = kor0Var.t;
        return new n3w(str20, "", s77Var, 0L, dDoubleValue, strValueOf, str, "", "", jLongValue, 0.0d, e4fVarE, 0.0d, 0.0d, dDoubleValue2, dDoubleValue3, lb90.f19744a, 0.0d, 0.0d, false, "", 0.0d, false, strS, 1, 1, 0, 0.0d, false, 0.0d, zBooleanValue, q4fVar2, v21Var, r21Var, false, false, "", strS2, 0.0d, false, 0.0d, "", false, zBooleanValue2, false, false, false, false, false, 0.0d, hxuVarN0, mob0Var, 0L, "", uoyVar, 0L, 0.0d, 0.0d, false, false, list8, an6VarD, ozcVar, "", l8 != null ? l8.longValue() : 0L, "");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    public static final kkp0 C(bkp0 bkp0Var) {
        ekb ekbVar;
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<glp0> list = bkp0Var.c;
        if (list != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (glp0 glp0Var : list) {
                String str = glp0Var.f11505a;
                List<zaa0> list2 = glp0Var.b;
                ArrayList arrayList2 = null;
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (zaa0 zaa0Var : list2) {
                        List list3 = bkp0Var.f2760a;
                        if (list3 != null) {
                            Iterator it = list3.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.d(((iaa0) next).f14428a, zaa0Var.f44058a));
                            iaa0 iaa0Var = (iaa0) next;
                            if (iaa0Var != null) {
                                String str2 = iaa0Var.f14428a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                String str3 = iaa0Var.b;
                                String str4 = str3 == null ? "" : str3;
                                Integer num = zaa0Var.b;
                                int iIntValue = num != null ? num.intValue() : 0;
                                Integer num2 = zaa0Var.c;
                                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                                Integer num3 = zaa0Var.d;
                                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                                Integer num4 = zaa0Var.e;
                                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                                Integer num5 = zaa0Var.f;
                                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                                Integer num6 = zaa0Var.g;
                                ekbVar = new ekb(str2, str4, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, num6 != null ? num6.intValue() : 0);
                            } else {
                                ekbVar = null;
                            }
                        } else {
                            ekbVar = null;
                        }
                        if (ekbVar != null) {
                            arrayList3.add(ekbVar);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                if (str != null && arrayList2 != null) {
                    linkedHashMap.put(str, arrayList2);
                }
                arrayList.add(Unit.f46060a);
            }
        }
        Long l = bkp0Var.b;
        return new kkp0(l != null ? l.longValue() : 0L, linkedHashMap);
    }

    public static zzajg D(AuthCredential authCredential, String str) {
        s0x.H(authCredential);
        if (authCredential instanceof GoogleAuthCredential) {
            GoogleAuthCredential googleAuthCredential = (GoogleAuthCredential) authCredential;
            return new zzajg(googleAuthCredential.f45646a, googleAuthCredential.b, "google.com", null, null, str, null, null);
        }
        if (authCredential instanceof FacebookAuthCredential) {
            return new zzajg(null, ((FacebookAuthCredential) authCredential).f45643a, "facebook.com", null, null, str, null, null);
        }
        if (authCredential instanceof TwitterAuthCredential) {
            TwitterAuthCredential twitterAuthCredential = (TwitterAuthCredential) authCredential;
            return new zzajg(null, twitterAuthCredential.f45651a, "twitter.com", twitterAuthCredential.b, null, str, null, null);
        }
        if (authCredential instanceof GithubAuthCredential) {
            return new zzajg(null, ((GithubAuthCredential) authCredential).f45645a, "github.com", null, null, str, null, null);
        }
        if (authCredential instanceof PlayGamesAuthCredential) {
            return new zzajg(null, null, "playgames.google.com", null, ((PlayGamesAuthCredential) authCredential).f45649a, str, null, null);
        }
        if (!(authCredential instanceof com.google.firebase.auth.zzc)) {
            jf4.o("Unsupported credential type.");
            return null;
        }
        com.google.firebase.auth.zzc zzcVar = (com.google.firebase.auth.zzc) authCredential;
        zzajg zzajgVar = zzcVar.d;
        return zzajgVar != null ? zzajgVar : new zzajg(zzcVar.b, zzcVar.c, zzcVar.f45661a, zzcVar.f, null, str, zzcVar.e, zzcVar.g);
    }

    public static final void a(llo0 llo0Var, fet fetVar, int i) {
        zcl zclVar;
        zcl zclVar2;
        fetVar.g0(-105911214);
        int i2 = (fetVar.g(llo0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            slo0 slo0Var = llo0Var.b;
            boolean zG = fetVar.g(slo0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if ((slo0Var instanceof olo0) || (slo0Var instanceof plo0) || (slo0Var instanceof rlo0)) {
                    zclVar = qmk.e;
                } else {
                    if (!(slo0Var instanceof qlo0)) {
                        t9f.b();
                        return;
                    }
                    zclVar = qmk.m;
                }
                objP = zclVar;
                fetVar.o0(objP);
            }
            ene eneVar = (ene) objP;
            boolean zG2 = fetVar.g(slo0Var);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                if ((slo0Var instanceof olo0) || (slo0Var instanceof plo0) || (slo0Var instanceof rlo0)) {
                    zclVar2 = qmk.c;
                } else {
                    if (!(slo0Var instanceof qlo0)) {
                        t9f.b();
                        return;
                    }
                    zclVar2 = qmk.m;
                }
                objP2 = zclVar2;
                fetVar.o0(objP2);
            }
            ene eneVar2 = (ene) objP2;
            String str = llo0Var.f20258a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            pge pgeVar = gqw0.A;
            zcl zclVar3 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            long jM73getBlack400d7_KjU = staticColors.m73getBlack400d7_KjU();
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(lgb.J(s5x0.J(i120.Q(mm40VarN, jM73getBlack400d7_KjU, new ugg0(eneVar, eneVar, eneVar, eneVar)), 4.0f), new ugg0(eneVar2, eneVar2, eneVar2, eneVar2)), "STATISTIC_HERO_INFO_IMAGE");
            boolean z = (i2 & 14) == 4;
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new ttn0(llo0Var, (byte) 12);
                fetVar.o0(objP3);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP3);
            mm40 mm40VarE1 = o2e.e0(s5x0.J(i120.Q(s5x0.J(i120.Q(o7k0.n(jm40Var, 32.0f), staticColors.m73getBlack400d7_KjU(), new ugg0(eneVar, eneVar, eneVar, eneVar)), 4.0f), kkg.f, new ugg0(eneVar2, eneVar2, eneVar2, eneVar2)), 4.0f), "STATISTIC_HERO_INFO_IMAGE");
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new meo0((byte) 7);
                fetVar.o0(objP4);
            }
            lgb.v(mm40VarA, pai0.a(mm40VarE1, false, (Function1) objP4), str, R.drawable.ic_sport_league_of_legends_106, jM126getWhite200d7_KjU, pgeVar, fetVar, 196608, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(llo0Var, i, (byte) 16);
        }
    }

    public static final void b(mlo0 mlo0Var, fet fetVar, int i) {
        zcl zclVar;
        float f;
        long jM73getBlack400d7_KjU;
        fet fetVar2 = fetVar;
        fetVar2.g0(637226968);
        int i2 = i | (fetVar2.g(mlo0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            slo0 slo0Var = mlo0Var.c;
            boolean zG = fetVar2.g(slo0Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if ((slo0Var instanceof olo0) || (slo0Var instanceof plo0) || (slo0Var instanceof rlo0)) {
                    zclVar = qmk.e;
                } else {
                    if (!(slo0Var instanceof qlo0)) {
                        t9f.b();
                        return;
                    }
                    zclVar = qmk.m;
                }
                objP = zclVar;
                fetVar2.o0(objP);
            }
            ene eneVar = (ene) objP;
            boolean zG2 = fetVar2.g(slo0Var);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                if (slo0Var instanceof olo0) {
                    zcl zclVar2 = qmk.f28987a;
                    f = 46.0f;
                } else if (slo0Var instanceof plo0) {
                    zcl zclVar3 = qmk.f28987a;
                    f = 36.0f;
                } else if (!(slo0Var instanceof qlo0) && !(slo0Var instanceof rlo0)) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar4 = qmk.f28987a;
                    f = 32.0f;
                }
                objP2 = twn.j(f, fetVar2);
            }
            float f2 = ((ycl) objP2).f42389a;
            boolean z = (i2 & 14) == 4;
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                fko0 fko0Var = mlo0Var.b;
                if (fko0Var.equals(qek0.c)) {
                    jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                } else {
                    if (!(fko0Var instanceof eko0)) {
                        t9f.b();
                        return;
                    }
                    jM73getBlack400d7_KjU = ((eko0) fko0Var).f7963a;
                }
                objP3 = dw9.e(jM73getBlack400d7_KjU, fetVar2);
            }
            long j = ((y3d) objP3).f41946a;
            zcl zclVar5 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 32.0f), f2);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarS, j, new ugg0(eneVar, eneVar, eneVar, eneVar));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(mlo0Var.f22002a, o2e.e0(jm40Var, "STATISTIC_HERO_INFO_TEXT"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(mlo0Var, i, (byte) 17);
        }
    }

    public static final void c(nlo0 nlo0Var, fet fetVar, int i) {
        nlo0Var.getClass();
        fetVar.g0(210013970);
        int i2 = (fetVar.g(nlo0Var) ? 4 : 2) | i;
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if (nlo0Var instanceof mlo0) {
            fetVar.e0(-1241041412);
            b((mlo0) nlo0Var, fetVar, i2 & 14);
            fetVar.r(false);
        } else {
            if (!(nlo0Var instanceof llo0)) {
                throw b1j.f(-40035352, fetVar, false);
            }
            fetVar.e0(-1240946180);
            a((llo0) nlo0Var, fetVar, i2 & 14);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new abn0(nlo0Var, i, (byte) 15);
        }
    }

    public static final void d(mm40 mm40Var, q5p0 q5p0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        q5p0Var.getClass();
        String str = q5p0Var.d;
        fetVar2.g0(-1196634532);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(q5p0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            Integer num = q5p0Var.f28164a;
            if (num == null) {
                fetVar2.e0(2033565378);
                fetVar2.r(false);
            } else {
                fetVar2.e0(2033565379);
                dww.c(a8k0.F(num.intValue(), 0, fetVar2), null, o7k0.s(o7k0.e(jm40Var, 16.0f), 16.0f), s6t0.b().f33626a.getPrimary(), fetVar2, 56, 0);
                fetVar2.r(false);
            }
            v8q0.a(q5p0Var.c, s5x0.N(jm40Var, num != null ? 8.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 0, 0, null, g1t0.n(), fetVar, 0, 384, 125944);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (str.length() > 0) {
                fetVar2.e0(-349058134);
                v8q0.a(str, s5x0.N(jm40Var, num != null ? 24.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14), q5p0Var.b, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 0, 0, null, g1t0.n(), fetVar, 0, 384, 125944);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-348704176);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, q5p0Var, i, (byte) 29);
        }
    }

    public static final long e(int i, int i2) {
        if (i < 0 || i2 < 0) {
            ycx.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = o9q0.c;
        return j;
    }

    public static final void f(mm40 mm40Var, final s180 s180Var, boolean z, k6z k6zVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        final byte b;
        k6zVar.getClass();
        fetVar.g0(-1518872133);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(s180Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(k6zVar.ordinal()) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new kp2((byte) 11, z);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(s180Var.f31443a, null, 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(qzb.y0(6, k6zVar, z)), 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 109558);
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                b = 0;
                objP2 = new Function0() { // from class: a.gws0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        s180 s180Var2 = s180Var;
                        switch (b2) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.h, s180Var2.b);
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.h, s180Var2.d);
                        }
                    }
                };
                fetVar.o0(objP2);
            } else {
                b = 0;
            }
            final byte b2 = 1;
            kkb.p(1, fetVar, null, (Function0) objP2);
            n4c.l(null, s180Var.e, z, fetVar, 1);
            if (i3 == 32) {
                b = 1;
            }
            Object objP3 = fetVar.P();
            if (b != 0 || objP3 == cl5Var) {
                objP3 = new Function0() { // from class: a.gws0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        s180 s180Var2 = s180Var;
                        switch (b3) {
                            case 0:
                                return new u6n(d4d.SECONDARY60, w6n.h, s180Var2.b);
                            default:
                                return new u6n(d4d.SECONDARY60, w6n.h, s180Var2.d);
                        }
                    }
                };
                fetVar.o0(objP3);
            }
            kkb.p(1, fetVar, null, (Function0) objP3);
            v8q0.a(s180Var.c, null, 0L, new n05(idm0.t(12), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, new f2q0(qzb.y0(5, k6zVar, z)), 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 109558);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 17, i, (Object) mm40Var, (Object) s180Var, (Object) k6zVar, z);
        }
    }

    public static final void g(l6t0 l6t0Var, Function2 function2, fet fetVar, int i) {
        function2.getClass();
        jm40 jm40Var = jm40.b;
        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
        mkd.c0.getClass();
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(e7z.u1);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, x5dVarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
        zcl zclVar = qmk.f28987a;
        nkb.h(s5x0.L(mm40VarD2, 8.0f, 0.0f, 2), l6t0Var.b, kjm.b, null, null, null, fetVar, 384, 56);
        hyl hylVar = l6t0Var.c;
        if (hylVar == null) {
            fetVar.e0(-1988823709);
            fetVar.r(false);
        } else {
            fetVar.e0(-1988823708);
            mm40 mm40VarD3 = o7k0.d(knx.Q(jm40Var, new k82(xfn.a(fetVar).c, (byte) 9)), 1.0f);
            vxl vxlVar = vxl.c;
            boolean z = ((((i & 896) ^ 384) > 256 && fetVar.g(function2)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && fetVar.g(l6t0Var)) || (i & 48) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xis0((Object) function2, (Object) l6t0Var, (byte) 11);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarD3, hylVar, vxlVar, (Function1) objP, null, fetVar, 3456, 32);
            fetVar.r(false);
        }
        obc.i(jm40Var, l6t0Var.d, fetVar, 6);
        fetVar.r(true);
    }

    public static final void h(mm40 mm40Var, egv0 egv0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(404404756);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(egv0Var) : fetVar.i(egv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            d9z d9zVarA = f9z.a(fetVar);
            boolean zG = fetVar.g(d9zVarA) | fetVar.g(pkk0Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new s3o(d9zVarA, pkk0Var, null, b);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, d9zVarA, (Function2) objP);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            ymx ymxVar = ymx.INTERVAL_100;
            mm40 mm40VarH = phu0.H(mm40VarD, new jtc(), 0);
            htr htrVar = egv0Var.c;
            float f = xfn.a(fetVar).c;
            float f2 = xfn.a(fetVar).c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(f, 12.0f, f2, 24.0f);
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new ru80(function1, (byte) 24);
                fetVar.o0(objP2);
            }
            uzb.y(mm40VarH, htrVar, lh80Var, d9zVarA, (Function2) objP2, null, fetVar, 0, 96);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, egv0Var, function1, i, (byte) 29);
        }
    }

    public static final void i(cp cpVar) {
        List list = u0d.f34849a;
        u0d.j(((is10) cpVar.u).e, ((l8s0) cpVar.u()).f19620a, R.drawable.empty_team_ic, 0, null, null, null, 508);
    }

    public static final LinkedHashMap j(ArrayList arrayList) {
        String str = y190.b;
        y190 y190VarB = rl70.b(Separators.SLASH);
        LinkedHashMap linkedHashMapH = xp20.h(new Pair(y190VarB, new d3w0(y190VarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (d3w0 d3w0Var : CollectionsKt.A0(arrayList, new jzt0((byte) 6))) {
            if (((d3w0) linkedHashMapH.put(d3w0Var.f5425a, d3w0Var)) == null) {
                while (true) {
                    y190 y190Var = d3w0Var.f5425a;
                    y190 y190VarC = y190Var.c();
                    if (y190VarC == null) {
                        break;
                    }
                    d3w0 d3w0Var2 = (d3w0) linkedHashMapH.get(y190VarC);
                    if (d3w0Var2 != null) {
                        d3w0Var2.q.add(y190Var);
                        break;
                    }
                    d3w0 d3w0Var3 = new d3w0(y190VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapH.put(y190VarC, d3w0Var3);
                    d3w0Var3.q.add(y190Var);
                    d3w0Var = d3w0Var3;
                }
            }
        }
        return linkedHashMapH;
    }

    public static final long k(int i, long j) {
        int i2 = o9q0.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : e(i4, i);
    }

    public static final clz l(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            clz clzVar = tag instanceof clz ? (clz) tag : null;
            if (clzVar != null) {
                return clzVar;
            }
            Object objV = k7n0.v(view);
            view = objV instanceof View ? (View) objV : null;
        }
        return null;
    }

    public static final String m(int i) {
        String string = Integer.toString(i, CharsKt.checkRadix(16));
        string.getClass();
        return "0x".concat(string);
    }

    public static final i4i n(d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z4) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z5) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new i4i(false, c4iVar, null, (d0tVar.S && z3) ? new v3i(new d2i()) : w3i.f38503a, z3iVar, x3iVar, null, 68);
    }

    public static k4i o(d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z4) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z5) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new k4i(c4iVar, null, (d0tVar.S && z3) ? new v3i(new d2i()) : w3i.f38503a, z3iVar, x3iVar, t3i.f33268a, 4);
    }

    public static l4i p(d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, String str3, boolean z5, boolean z6) {
        h4i e4iVar;
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str3, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z4) {
            long jU0 = kpb.j0(d0tVar) ? kpb.u0(d0tVar) : kpb.q0(d0tVar);
            fgm fgmVar = fgm.f9498a;
            e4iVar = new e4i(8, jU0, d0tVar.P.getTime(), kpb.j0(d0tVar));
        } else {
            e4iVar = f4i.f8914a;
        }
        b4i b4iVar = new b4i(str2, e4iVar);
        if (z5) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z6) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new l4i("", c4iVar, b4iVar, (d0tVar.S && z3) ? new v3i(new d2i()) : w3i.f38503a, z3iVar, x3iVar, t3i.f33268a);
    }

    public static k4i q(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new k4i(c4iVar, null, null, z3iVar, x3iVar, t3i.f33268a, 12);
    }

    public static j4i r(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new j4i(c4iVar, null, z3iVar, x3iVar, t3i.f33268a, 12);
    }

    public static final String s(kor0 kor0Var) {
        String strI = kor0Var.e;
        if (strI == null) {
            strI = "";
        }
        String str = kor0Var.f;
        String str2 = str != null ? str : "";
        if (str2.length() > 0) {
            strI = ua80.i(strI, " «", str2, "»");
        }
        return StringsKt.u0(strI).toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6 A[Catch: all -> 0x014a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    public static final e3w0 t(y190 y190Var, yzp yzpVar, Function1 function1) {
        zae0 zae0Var;
        Throwable th;
        Throwable th2;
        Throwable th3;
        yzpVar.getClass();
        uey ueyVarW = yzpVar.w(y190Var);
        try {
            long size = ueyVarW.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + ueyVarW.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                zae0 zae0Var2 = new zae0(ueyVarW.a(j));
                try {
                    if (zae0Var2.e() == 101010256) {
                        int iL = zae0Var2.l() & 65535;
                        int iL2 = zae0Var2.l() & 65535;
                        long jL = zae0Var2.l() & 65535;
                        if (jL != (zae0Var2.l() & 65535) || iL != 0 || iL2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        zae0Var2.skip(4L);
                        long jE = ((long) zae0Var2.e()) & 4294967295L;
                        int iL3 = zae0Var2.l() & 65535;
                        br8 br8Var = new br8(iL3, jL, jE);
                        zae0Var2.n(iL3);
                        zae0Var2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            zae0 zae0Var3 = new zae0(ueyVarW.a(j3));
                            try {
                                if (zae0Var3.e() == 117853008) {
                                    int iE = zae0Var3.e();
                                    long jK = zae0Var3.k();
                                    if (zae0Var3.e() != 1 || iE != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    zae0 zae0Var4 = new zae0(ueyVarW.a(jK));
                                    try {
                                        int iE2 = zae0Var4.e();
                                        if (iE2 != 101075792) {
                                            throw new IOException("bad zip: expected " + m(101075792) + " but was " + m(iE2));
                                        }
                                        zae0Var4.skip(12L);
                                        int iE3 = zae0Var4.e();
                                        int iE4 = zae0Var4.e();
                                        long jK2 = zae0Var4.k();
                                        if (jK2 != zae0Var4.k() || iE3 != 0 || iE4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        zae0Var4.skip(8L);
                                        br8 br8Var2 = new br8(iL3, jK2, zae0Var4.k());
                                        try {
                                            zae0Var4.close();
                                            th3 = null;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                        }
                                        br8Var = br8Var2;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            zae0Var4.close();
                                        } catch (Throwable th6) {
                                            tjo.a(th5, th6);
                                        }
                                        th3 = th5;
                                    }
                                }
                                try {
                                    zae0Var3.close();
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    zae0Var3.close();
                                } catch (Throwable th9) {
                                    tjo.a(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        zae0 zae0Var5 = new zae0(ueyVarW.a(br8Var.c));
                        try {
                            long j4 = br8Var.b;
                            while (j2 < j4) {
                                d3w0 d3w0VarU = u(zae0Var5);
                                zae0Var = zae0Var5;
                                try {
                                    if (d3w0VarU.h >= br8Var.c) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) function1.invoke(d3w0VarU)).booleanValue()) {
                                        arrayList.add(d3w0VarU);
                                    }
                                    j2++;
                                    zae0Var5 = zae0Var;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    try {
                                        zae0Var.close();
                                    } catch (Throwable th11) {
                                        tjo.a(th, th11);
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    e3w0 e3w0Var = new e3w0(y190Var, yzpVar, j(arrayList));
                                    try {
                                        ueyVarW.close();
                                    } catch (Throwable unused) {
                                    }
                                    return e3w0Var;
                                }
                            }
                            try {
                                zae0Var5.close();
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            zae0Var = zae0Var5;
                        }
                        if (th == null) {
                            throw th;
                        }
                        e3w0 e3w0Var2 = new e3w0(y190Var, yzpVar, j(arrayList));
                        ueyVarW.close();
                        return e3w0Var2;
                    }
                    zae0Var2.close();
                    j--;
                } catch (Throwable th14) {
                    zae0Var2.close();
                    throw th14;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th15) {
            if (ueyVarW == null) {
                throw th15;
            }
            try {
                ueyVarW.close();
                throw th15;
            } catch (Throwable th16) {
                tjo.a(th15, th16);
                throw th15;
            }
        }
    }

    public static final d3w0 u(zae0 zae0Var) throws IOException {
        int iE = zae0Var.e();
        if (iE != 33639248) {
            throw new IOException("bad zip: expected " + m(33639248) + " but was " + m(iE));
        }
        zae0Var.skip(4L);
        short sL = zae0Var.l();
        int i = sL & 65535;
        if ((sL & 1) != 0) {
            ohq.l("unsupported zip: general purpose bit flag=".concat(m(i)));
            return null;
        }
        int iL = zae0Var.l() & 65535;
        int iL2 = zae0Var.l() & 65535;
        int iL3 = zae0Var.l() & 65535;
        long jE = ((long) zae0Var.e()) & 4294967295L;
        lie0 lie0Var = new lie0();
        lie0Var.f20100a = ((long) zae0Var.e()) & 4294967295L;
        lie0 lie0Var2 = new lie0();
        lie0Var2.f20100a = ((long) zae0Var.e()) & 4294967295L;
        int iL4 = zae0Var.l() & 65535;
        int iL5 = zae0Var.l() & 65535;
        int iL6 = zae0Var.l() & 65535;
        zae0Var.skip(8L);
        lie0 lie0Var3 = new lie0();
        lie0Var3.f20100a = ((long) zae0Var.e()) & 4294967295L;
        String strN = zae0Var.n(iL4);
        if (StringsKt.P(strN, (char) 0)) {
            ohq.l("bad zip: filename contains 0x00");
            return null;
        }
        long j = lie0Var2.f20100a == 4294967295L ? 8L : 0L;
        if (lie0Var.f20100a == 4294967295L) {
            j += 8;
        }
        if (lie0Var3.f20100a == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        mie0 mie0Var = new mie0();
        mie0 mie0Var2 = new mie0();
        mie0 mie0Var3 = new mie0();
        hie0 hie0Var = new hie0();
        v(zae0Var, iL5, new kur0(hie0Var, j2, lie0Var2, zae0Var, lie0Var, lie0Var3, mie0Var, mie0Var2, mie0Var3));
        if (j2 > 0 && !hie0Var.f13108a) {
            ohq.l("bad zip: zip64 extra required but absent");
            return null;
        }
        String strN2 = zae0Var.n(iL6);
        String str = y190.b;
        return new d3w0(rl70.b(Separators.SLASH).e(strN), kotlin.text.c.n(strN, Separators.SLASH, false), strN2, jE, lie0Var.f20100a, lie0Var2.f20100a, iL, lie0Var3.f20100a, iL3, iL2, (Long) mie0Var.f21842a, (Long) mie0Var2.f21842a, (Long) mie0Var3.f21842a, 57344);
    }

    public static final void v(zae0 zae0Var, int i, Function2 function2) throws IOException {
        f99 f99Var = zae0Var.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                ohq.l("bad zip: truncated header in extra field");
                return;
            }
            int iL = zae0Var.l() & 65535;
            long jL = ((long) zae0Var.l()) & 65535;
            long j2 = j - 4;
            if (j2 < jL) {
                ohq.l("bad zip: truncated value in extra field");
                return;
            }
            zae0Var.h0(jL);
            long j3 = f99Var.b;
            function2.invoke(Integer.valueOf(iL), Long.valueOf(jL));
            long j4 = (f99Var.b + jL) - j3;
            if (j4 < 0) {
                ohq.l(twn.m(iL, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    f99Var.skip(j4);
                }
                j = j2 - jL;
            }
        }
    }

    public static final d3w0 w(zae0 zae0Var, d3w0 d3w0Var) throws IOException {
        int iE = zae0Var.e();
        if (iE != 67324752) {
            throw new IOException("bad zip: expected " + m(67324752) + " but was " + m(iE));
        }
        zae0Var.skip(2L);
        short sL = zae0Var.l();
        int i = sL & 65535;
        if ((sL & 1) != 0) {
            ohq.l("unsupported zip: general purpose bit flag=".concat(m(i)));
            return null;
        }
        zae0Var.skip(18L);
        long jL = ((long) zae0Var.l()) & 65535;
        int iL = zae0Var.l() & 65535;
        zae0Var.skip(jL);
        if (d3w0Var == null) {
            zae0Var.skip(iL);
            return null;
        }
        mie0 mie0Var = new mie0();
        mie0 mie0Var2 = new mie0();
        mie0 mie0Var3 = new mie0();
        v(zae0Var, iL, new f3w0(zae0Var, mie0Var, mie0Var2, mie0Var3));
        return new d3w0(d3w0Var.f5425a, d3w0Var.b, d3w0Var.c, d3w0Var.d, d3w0Var.e, d3w0Var.f, d3w0Var.g, d3w0Var.h, d3w0Var.i, d3w0Var.j, d3w0Var.k, d3w0Var.l, d3w0Var.m, (Integer) mie0Var.f21842a, (Integer) mie0Var2.f21842a, (Integer) mie0Var3.f21842a);
    }

    public static final void x(View view, clz clzVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, clzVar);
    }

    public static final void y(ImageView imageView, int i) {
        Drawable drawable = imageView.getDrawable();
        ckc ckcVar = drawable instanceof ckc ? (ckc) drawable : null;
        if (ckcVar != null) {
            if (ckcVar.d.isRunning()) {
                return;
            }
            ckcVar.start();
            return;
        }
        ckc ckcVar2 = new ckc(imageView.getContext());
        float fX = sj3.X(3);
        bkc bkcVar = ckcVar2.f4499a;
        bkcVar.h = fX;
        bkcVar.b.setStrokeWidth(fX);
        ckcVar2.invalidateSelf();
        bkcVar.b.setStrokeCap(Paint.Cap.ROUND);
        ckcVar2.invalidateSelf();
        bkcVar.i = new int[]{i};
        bkcVar.a(0);
        bkcVar.a(0);
        ckcVar2.invalidateSelf();
        ckcVar2.start();
        imageView.setImageDrawable(ckcVar2);
    }

    public static final void z(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        ckc ckcVar = drawable instanceof ckc ? (ckc) drawable : null;
        if (ckcVar != null) {
            ckcVar.stop();
        }
        imageView.setImageDrawable(null);
    }
}
