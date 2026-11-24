package a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.javax.sip.header.WarningHeader;
import android.media.MediaFormat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c9x {
    public static void A(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(lm40 lm40Var, Function0 function0) {
        ge60 ge60Var = lm40Var.g;
        if (ge60Var == null) {
            ge60Var = new ge60((fe60) lm40Var);
            lm40Var.g = ge60Var;
        }
        eg80 snapshotObserver = vcc.a0(lm40Var).getSnapshotObserver();
        snapshotObserver.f7752a.d(ge60Var, ge60.b, function0);
    }

    public static final List C(xpg0 xpg0Var) {
        int iZ = x1x.z(xpg0Var, ParameterNames.ID);
        int iZ2 = x1x.z(xpg0Var, "seq");
        int iZ3 = x1x.z(xpg0Var, RemoteMessageConst.FROM);
        int iZ4 = x1x.z(xpg0Var, RemoteMessageConst.TO);
        lc00 lc00VarB = kotlin.collections.a.b();
        while (xpg0Var.W0()) {
            lc00VarB.add(new nvq((int) xpg0Var.getLong(iZ), xpg0Var.J0(iZ3), (int) xpg0Var.getLong(iZ2), xpg0Var.J0(iZ4)));
        }
        return CollectionsKt.z0(kotlin.collections.a.a(lc00VarB));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Serializable D(qpg0 qpg0Var, String str, zje zjeVar) {
        r2h0 r2h0Var;
        xpg0 xpg0VarZ0;
        int iZ;
        int iZ2;
        int iZ3;
        int i;
        xpg0 xpg0Var;
        int i2;
        Throwable th;
        if (zjeVar instanceof r2h0) {
            r2h0Var = (r2h0) zjeVar;
            int i3 = r2h0Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r2h0Var.q = i3 - Integer.MIN_VALUE;
            } else {
                r2h0Var = new r2h0(zjeVar);
            }
        } else {
            r2h0Var = new r2h0(zjeVar);
        }
        Object obj = r2h0Var.p;
        wne wneVar = wne.f39444a;
        int i4 = r2h0Var.q;
        if (i4 == 0) {
            z1x.P(obj);
            xpg0VarZ0 = qpg0Var.Z0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                iZ = x1x.z(xpg0VarZ0, ParameterNames.ID);
                iZ2 = x1x.z(xpg0VarZ0, "seq");
                int iZ4 = x1x.z(xpg0VarZ0, "table");
                iZ3 = x1x.z(xpg0VarZ0, "on_delete");
                int iZ5 = x1x.z(xpg0VarZ0, "on_update");
                r2h0Var.i = xpg0VarZ0;
                r2h0Var.j = xpg0VarZ0;
                r2h0Var.k = iZ;
                r2h0Var.l = iZ2;
                r2h0Var.m = iZ4;
                r2h0Var.n = iZ3;
                r2h0Var.o = iZ5;
                r2h0Var.q = 1;
                List listC = C(xpg0VarZ0);
                if (listC == wneVar) {
                    return wneVar;
                }
                i = iZ4;
                obj = listC;
                xpg0Var = xpg0VarZ0;
                i2 = iZ5;
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = r2h0Var.o;
            iZ3 = r2h0Var.n;
            i = r2h0Var.m;
            iZ2 = r2h0Var.l;
            iZ = r2h0Var.k;
            xpg0VarZ0 = r2h0Var.j;
            xpg0Var = r2h0Var.i;
            try {
                z1x.P(obj);
            } catch (Throwable th3) {
                th = th3;
                xpg0VarZ0 = xpg0Var;
                th = th;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ay3.L(xpg0VarZ0, th);
                    throw th4;
                }
            }
        }
        List list = (List) obj;
        xpg0VarZ0.reset();
        yni0 yni0Var = new yni0();
        while (xpg0VarZ0.W0()) {
            if (xpg0VarZ0.getLong(iZ2) == 0) {
                int i5 = (int) xpg0VarZ0.getLong(iZ);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<nvq> arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (((nvq) obj2).f24199a == i5) {
                        arrayList3.add(obj2);
                    }
                }
                for (nvq nvqVar : arrayList3) {
                    arrayList.add(nvqVar.c);
                    arrayList2.add(nvqVar.d);
                }
                yni0Var.add(new vjo0(xpg0VarZ0.J0(i), xpg0VarZ0.J0(iZ3), xpg0VarZ0.J0(i2), arrayList, arrayList2));
            }
        }
        yni0 yni0VarA = cui0.a(yni0Var);
        ay3.L(xpg0Var, null);
        return yni0VarA;
    }

    public static final xjo0 E(qpg0 qpg0Var, String str, boolean z) {
        xpg0 xpg0VarZ0 = qpg0Var.Z0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iZ = x1x.z(xpg0VarZ0, "seqno");
            int iZ2 = x1x.z(xpg0VarZ0, "cid");
            int iZ3 = x1x.z(xpg0VarZ0, "name");
            int iZ4 = x1x.z(xpg0VarZ0, "desc");
            if (iZ != -1 && iZ2 != -1 && iZ3 != -1 && iZ4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (xpg0VarZ0.W0()) {
                    if (((int) xpg0VarZ0.getLong(iZ2)) >= 0) {
                        int i = (int) xpg0VarZ0.getLong(iZ);
                        String strJ0 = xpg0VarZ0.J0(iZ3);
                        String str2 = xpg0VarZ0.getLong(iZ4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(new Integer(i), strJ0);
                        linkedHashMap2.put(new Integer(i), str2);
                    }
                }
                List listA0 = CollectionsKt.A0(linkedHashMap.entrySet(), new mjf0((byte) 3));
                ArrayList arrayList = new ArrayList(r3d.q(listA0, 10));
                Iterator it = listA0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listL0 = CollectionsKt.L0(arrayList);
                List listA1 = CollectionsKt.A0(linkedHashMap2.entrySet(), new mjf0((byte) 4));
                ArrayList arrayList2 = new ArrayList(r3d.q(listA1, 10));
                Iterator it2 = listA1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                xjo0 xjo0Var = new xjo0(str, z, listL0, CollectionsKt.L0(arrayList2));
                ay3.L(xpg0VarZ0, null);
                return xjo0Var;
            }
            ay3.L(xpg0VarZ0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:12:0x003a, B:25:0x0092, B:27:0x0098, B:30:0x00a5, B:34:0x00b6, B:46:0x00f5, B:19:0x0070, B:24:0x008b), top: B:59:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: all -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:38:0x00df, B:42:0x00e7), top: B:55:0x00df }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d5 -> B:55:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.io.Serializable F(a.qpg0 r18, java.lang.String r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c9x.F(a.qpg0, java.lang.String, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object G(qpg0 qpg0Var, String str, zje zjeVar) {
        t2h0 t2h0Var;
        Object objB;
        qpg0 qpg0Var2;
        String str2;
        Map map;
        Set set;
        Serializable serializableF;
        String str3;
        Set set2;
        qpg0 qpg0Var3 = qpg0Var;
        String str4 = str;
        if (zjeVar instanceof t2h0) {
            t2h0Var = (t2h0) zjeVar;
            int i = t2h0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2h0Var.m = i - Integer.MIN_VALUE;
            } else {
                t2h0Var = new t2h0(zjeVar);
            }
        } else {
            t2h0Var = new t2h0(zjeVar);
        }
        Object obj = t2h0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = t2h0Var.m;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                String str5 = (String) t2h0Var.j;
                qpg0 qpg0Var4 = (qpg0) t2h0Var.i;
                z1x.P(obj);
                str4 = str5;
                qpg0Var3 = qpg0Var4;
            } else {
                if (i2 == 2) {
                    Map map2 = (Map) t2h0Var.k;
                    String str6 = (String) t2h0Var.j;
                    qpg0Var2 = (qpg0) t2h0Var.i;
                    z1x.P(obj);
                    map = map2;
                    str2 = str6;
                    set = (Set) obj;
                    t2h0Var.i = str2;
                    t2h0Var.j = map;
                    t2h0Var.k = set;
                    t2h0Var.m = 3;
                    serializableF = F(qpg0Var2, str2, t2h0Var);
                    if (serializableF != wneVar) {
                        str3 = str2;
                        set2 = set;
                        obj = serializableF;
                    }
                    return wneVar;
                }
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set2 = (Set) t2h0Var.k;
                map = (Map) t2h0Var.j;
                str3 = (String) t2h0Var.i;
                z1x.P(obj);
            }
            return new zjo0(str3, map, set2, (Set) obj);
        }
        z1x.P(obj);
        t2h0Var.i = qpg0Var3;
        t2h0Var.j = str4;
        t2h0Var.m = 1;
        xpg0 xpg0VarZ0 = qpg0Var3.Z0("PRAGMA table_info(`" + str4 + "`)");
        try {
            if (xpg0VarZ0.W0()) {
                int iZ = x1x.z(xpg0VarZ0, "name");
                int iZ2 = x1x.z(xpg0VarZ0, Payload.TYPE);
                int iZ3 = x1x.z(xpg0VarZ0, "notnull");
                int iZ4 = x1x.z(xpg0VarZ0, "pk");
                int iZ5 = x1x.z(xpg0VarZ0, "dflt_value");
                jo20 jo20Var = new jo20();
                while (true) {
                    String strJ0 = xpg0VarZ0.J0(iZ);
                    int i3 = iZ2;
                    jo20Var.put(strJ0, new tjo0((int) xpg0VarZ0.getLong(iZ4), 2, strJ0, xpg0VarZ0.J0(iZ2), xpg0VarZ0.isNull(iZ5) ? null : xpg0VarZ0.J0(iZ5), xpg0VarZ0.getLong(iZ3) != 0 ? z : false));
                    if (!xpg0VarZ0.W0()) {
                        break;
                    }
                    iZ2 = i3;
                    z = true;
                }
                objB = jo20Var.b();
            } else {
                objB = lun.f20680a;
                objB.getClass();
            }
            ay3.L(xpg0VarZ0, null);
            obj = objB;
            if (obj != wneVar) {
            }
            return wneVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
        Map map3 = (Map) obj;
        t2h0Var.i = qpg0Var3;
        t2h0Var.j = str4;
        t2h0Var.k = map3;
        t2h0Var.m = 2;
        Serializable serializableD = D(qpg0Var3, str4, t2h0Var);
        if (serializableD != wneVar) {
            qpg0Var2 = qpg0Var3;
            str2 = str4;
            map = map3;
            obj = serializableD;
            set = (Set) obj;
            t2h0Var.i = str2;
            t2h0Var.j = map;
            t2h0Var.k = set;
            t2h0Var.m = 3;
            serializableF = F(qpg0Var2, str2, t2h0Var);
            if (serializableF != wneVar) {
                str3 = str2;
                set2 = set;
                obj = serializableF;
                return new zjo0(str3, map, set2, (Set) obj);
            }
        }
        return wneVar;
    }

    public static final u950 H(rzg0 rzg0Var, rb50[] rb50VarArr, fet fetVar) {
        if (Intrinsics.d(rzg0Var.f31359a, rzg0.b.f31359a)) {
            jf4.o("You must pass a `SavedStateConfiguration.serializersModule` configured to handle `NavKey` open polymorphism. Define it with: `polymorphic(NavKey::class) { ... }`");
            return null;
        }
        v950 v950Var = new v950(new uua0(sre0.f32672a.b(rb50.class)), (byte) 0);
        Object[] objArr = new Object[0];
        boolean zI = fetVar.i(rb50VarArr);
        Object objP = fetVar.P();
        if (zI || objP == ukd.f35823a) {
            objP = new tie0(rb50VarArr, (byte) 15);
            fetVar.o0(objP);
        }
        v0h0 v0h0Var = new v0h0(new huh0(v950Var, rzg0Var, (byte) 2), new kqh0(v950Var, rzg0Var, (byte) 5));
        return (u950) e9x.P(Arrays.copyOf(objArr, 0), v0h0Var, (Function0) objP, fetVar, 384);
    }

    public static void I(cge0 cge0Var) {
        p7m0 p7m0Var;
        ci90 ci90Var;
        ci90 ci90Var2;
        do {
            p7m0Var = fge0.z;
            ci90Var = (ci90) p7m0Var.getValue();
            eh90 eh90VarH = ci90Var.d;
            zb00 zb00Var = (zb00) eh90VarH.get(cge0Var);
            if (zb00Var == null) {
                ci90Var2 = ci90Var;
            } else {
                Object obj = zb00Var.f44091a;
                Object obj2 = zb00Var.b;
                oqs0 oqs0Var = eh90VarH.d;
                oqs0 oqs0VarV = oqs0Var.v(cge0Var != null ? cge0Var.hashCode() : 0, 0, cge0Var);
                if (oqs0Var != oqs0VarV) {
                    eh90VarH = oqs0VarV == null ? eh90.f : new eh90(oqs0VarV, eh90VarH.e - 1);
                }
                jtv jtvVar = jtv.h;
                if (obj != jtvVar) {
                    Object obj3 = eh90VarH.get(obj);
                    obj3.getClass();
                    eh90VarH = eh90VarH.h(obj, new zb00(((zb00) obj3).f44091a, obj2));
                }
                if (obj2 != jtvVar) {
                    Object obj4 = eh90VarH.get(obj2);
                    obj4.getClass();
                    eh90VarH = eh90VarH.h(obj2, new zb00(obj, ((zb00) obj4).b));
                }
                Object obj5 = obj != jtvVar ? ci90Var.b : obj2;
                if (obj2 != jtvVar) {
                    obj = ci90Var.c;
                }
                ci90Var2 = new ci90(obj5, obj, eh90VarH);
            }
            if (ci90Var == ci90Var2) {
                return;
            }
        } while (!p7m0Var.m(ci90Var, ci90Var2));
    }

    public static final idb0 J(idb0 idb0Var, hdb0 hdb0Var, boolean z) {
        if (hdb0Var.equals(gdb0.f11097a)) {
            return idb0.a(idb0Var, z, false, false, false, false, false, 126);
        }
        if (hdb0Var.equals(cdb0.f4154a)) {
            return idb0.a(idb0Var, false, z, false, false, false, false, 125);
        }
        if (hdb0Var.equals(bdb0.f2391a)) {
            return idb0.a(idb0Var, false, false, z, false, false, false, 123);
        }
        if (hdb0Var.equals(edb0.f7608a)) {
            return idb0.a(idb0Var, false, false, false, z, false, false, 111);
        }
        if (hdb0Var.equals(fdb0.f9352a)) {
            return idb0.a(idb0Var, false, false, false, false, z, false, 95);
        }
        if (hdb0Var.equals(ddb0.f5888a)) {
            return idb0.a(idb0Var, false, false, false, false, false, z, 63);
        }
        t9f.b();
        return null;
    }

    public static void K(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(twn.m(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static final void L(a180 a180Var, int i, Object obj) {
        a180Var.e[(a180Var.f - a180Var.f60a[a180Var.b - 1].c) + i] = obj;
    }

    public static final void M(a180 a180Var, int i, Object obj, int i2, Object obj2) {
        int i3 = a180Var.f - a180Var.f60a[a180Var.b - 1].c;
        Object[] objArr = a180Var.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void N(a180 a180Var, Object obj, Object obj2, Object obj3) {
        int i = a180Var.f - a180Var.f60a[a180Var.b - 1].c;
        Object[] objArr = a180Var.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public static final mvc O(long j) {
        if (j == nw80.f24223a.getId()) {
            return mvc.CMS_CODE_LIVE_CASINO;
        }
        if (j == nw80.b.getId()) {
            return mvc.CMS_CODE_SLOTS;
        }
        if (j == nw80.c.getId()) {
            return mvc.CMS_CODE_BINGO;
        }
        if (j == nw80.d.getId()) {
            return mvc.CMS_CODE_BINGO;
        }
        if (j == nw80.e.getId()) {
            return mvc.CMS_CODE_SPORT;
        }
        if (j == nw80.f.getId()) {
            return mvc.CMS_CODE_HUNTING;
        }
        if (j == nw80.g.getId()) {
            return mvc.CMS_CODE_SCRATCH_CARD;
        }
        if (j == nw80.h.getId()) {
            return mvc.CMS_CODE_TV_GAMES;
        }
        if (j == nw80.k.getId()) {
            return mvc.CMS_CODE_CRASH_GAMES;
        }
        if (j == nw80.l.getId()) {
            return mvc.CMS_CODE_KENO;
        }
        if (j == nw80.m.getId()) {
            return mvc.CMS_CODE_ASIAN_GAMES;
        }
        if (j == nw80.n.getId()) {
            return mvc.CMS_CODE_BOARD_GAMES;
        }
        if (j == nw80.o.getId()) {
            return mvc.CMS_CODE_SKILL_GAMES;
        }
        if (j == nw80.p.getId()) {
            return mvc.CMS_CODE_CARD_GAMES;
        }
        if (j == nw80.q.getId()) {
            return mvc.CMS_CODE_LOTTO;
        }
        if (j == nw80.r.getId()) {
            return mvc.CMS_CODE_POKER;
        }
        if (j == nw80.u.getId()) {
            return mvc.CMS_CODE_OFFERS_CASINO;
        }
        if (j == nw80.v.getId()) {
            return mvc.CMS_CODE_CASINO_BRAND;
        }
        return j == nw80.w.getId() ? mvc.CMS_CODE_OFFERS_MY_CASINO : mvc.UNDEFINED;
    }

    public static final zxj0 P(m97 m97Var) {
        m97Var.getClass();
        long j = m97Var.f21398a;
        long j2 = m97Var.f;
        String str = m97Var.o;
        String str2 = m97Var.g;
        String str3 = m97Var.p;
        double d = m97Var.l;
        double d2 = m97Var.k;
        tqt tqtVar = uoy.b;
        int i = m97Var.b;
        tqtVar.getClass();
        return new zxj0(j, j2, str, str2, str3, d, d2, m97Var.n, tqt.j(i), m97Var.h, m97Var.i, m97Var.q, m97Var.w);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x031d  */
    /* JADX WARN: Code duplicated, block: B:252:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:255:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:258:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:261:0x0607  */
    /* JADX WARN: Code duplicated, block: B:277:0x0625  */
    /* JADX WARN: Code duplicated, block: B:282:0x0631  */
    /* JADX WARN: Code duplicated, block: B:283:0x063a  */
    /* JADX WARN: Code duplicated, block: B:288:0x0651  */
    /* JADX WARN: Code duplicated, block: B:290:0x0655  */
    /* JADX WARN: Code duplicated, block: B:291:0x0658  */
    /* JADX WARN: Code duplicated, block: B:293:0x065c  */
    /* JADX WARN: Code duplicated, block: B:295:0x0660  */
    /* JADX WARN: Code duplicated, block: B:299:0x0675  */
    /* JADX WARN: Code duplicated, block: B:300:0x0679  */
    /* JADX WARN: Code duplicated, block: B:310:0x0697  */
    /* JADX WARN: Code duplicated, block: B:315:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:317:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:322:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:326:0x0702  */
    /* JADX WARN: Code duplicated, block: B:328:0x0706  */
    /* JADX WARN: Code duplicated, block: B:331:0x070e  */
    /* JADX WARN: Code duplicated, block: B:332:0x071d  */
    /* JADX WARN: Code duplicated, block: B:335:0x0724  */
    /* JADX WARN: Code duplicated, block: B:337:0x072c  */
    /* JADX WARN: Code duplicated, block: B:338:0x072f  */
    /* JADX WARN: Code duplicated, block: B:340:0x0733  */
    /* JADX WARN: Code duplicated, block: B:342:0x0742  */
    /* JADX WARN: Code duplicated, block: B:346:0x0750  */
    /* JADX WARN: Code duplicated, block: B:348:0x0754  */
    /* JADX WARN: Code duplicated, block: B:350:0x076b  */
    /* JADX WARN: Code duplicated, block: B:353:0x0774  */
    /* JADX WARN: Code duplicated, block: B:355:0x0778  */
    /* JADX WARN: Code duplicated, block: B:464:0x0bf3  */
    /* JADX WARN: Code duplicated, block: B:467:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:469:0x0c00  */
    /* JADX WARN: Code duplicated, block: B:471:0x0c05  */
    /* JADX WARN: Code duplicated, block: B:472:0x0c09  */
    /* JADX WARN: Code duplicated, block: B:475:0x0c1e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:476:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:477:0x0c2d  */
    /* JADX WARN: Code duplicated, block: B:478:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:481:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:482:0x0c4d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final fak0 Q(a5w a5wVar, ctf0 ctf0Var, List list, List list2, String str, List list3, boolean z, List list4, HistoryTypeModel historyTypeModel, Map map, boolean z2, List list5, boolean z3, BetHistoryScreenModel betHistoryScreenModel, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        int i2;
        g3w g3wVar;
        f3w f3wVar;
        Object obj;
        int iOrdinal;
        int i3;
        int i4;
        int iOrdinal2;
        long jM113getRed0d7_KjU;
        int i5;
        long jM113getRed0d7_KjU2;
        String str2;
        int i6;
        int i7;
        int i8;
        long jM113getRed0d7_KjU3;
        boolean z9;
        Object next;
        kzv kzvVar;
        String str3;
        hxu hxuVar;
        Object next2;
        String str4;
        g3w g3wVar2;
        boolean z10;
        h3w h3wVarI;
        f3w f3wVarM;
        f3w f3wVarJ;
        f3w f3wVarG;
        f3w f3wVarH;
        i4 i4VarE;
        ivo0 ivo0Var;
        e3w e3wVar;
        int i9;
        String strA;
        int iOrdinal3;
        double d;
        f3w f3wVar2;
        xww xwwVar;
        kzv kzvVar2;
        lsm0 lsm0Var;
        ctf0 ctf0Var2;
        z0w z0wVar;
        long j;
        ril0 ril0Var;
        String str5;
        String strConcat;
        String str6;
        String str7;
        String strR;
        i0w i0wVar;
        String str8;
        e3w e3wVar2;
        boolean z11;
        String str9;
        String strA2;
        String str10;
        boolean z12;
        h3w h3wVarI2;
        f3w f3wVarM2;
        double d2;
        f3w f3wVar3;
        e3w e3wVar3;
        String strA3;
        double d3;
        f3w f3wVar4;
        ctf0Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        if (a5wVar instanceof vw4) {
            return m8x.l0((vw4) a5wVar, ctf0Var, list, str, map, z2, list5, z3, betHistoryScreenModel, list2, z6, list3, z7, z8);
        }
        boolean z13 = a5wVar instanceof kzv;
        p180 p180Var = p180.f26188a;
        Object objT = null;
        if (!z13) {
            if (a5wVar instanceof for0) {
                for0 for0Var = (for0) a5wVar;
                a6w a6wVar = for0Var.o;
                q4f q4fVar = for0Var.b;
                long j2 = for0Var.d;
                i0w i0wVar2 = for0Var.g;
                int iOrdinal4 = a6wVar.ordinal();
                if (iOrdinal4 == 0) {
                    List listU = xkb.U(list3);
                    String str11 = for0Var.f9896a;
                    lsm0 lsm0Var2 = ctf0Var.b;
                    String strA4 = lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str11}, 1));
                    i4 i4VarR0 = dyb.r0(q3d.k(for0Var.k ? new qoo0(lsm0Var2.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), "TagPromo", tqo0.f34390a) : null));
                    lc00 lc00VarB = kotlin.collections.a.b();
                    int iOrdinal5 = i0wVar2.ordinal();
                    g3w g3wVar3 = (iOrdinal5 == 3 || iOrdinal5 == 4) ? new g3w(lsm0Var2.a(R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0)), for0Var.h) : null;
                    if (g3wVar3 != null) {
                        lc00VarB.add(g3wVar3);
                    }
                    String strA5 = lsm0Var2.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var = pn40.f27267a;
                    lc00VarB.add(new f3w("", strA5, pn40.c(for0Var.f, p3u0.c), str, e3w.f7156a));
                    i4 i4VarE2 = fxb.E(for0Var.l, str, i0wVar2, true);
                    if (i4VarE2 != null) {
                        lc00VarB.addAll(i4VarE2);
                    }
                    f3w f3wVarN = e9x.N(for0Var, ctf0Var, str);
                    if (f3wVarN != null) {
                        lc00VarB.add(f3wVarN);
                    }
                    int iOrdinal6 = i0wVar2.ordinal();
                    String strA6 = lsm0Var2.a(iOrdinal6 != 2 ? iOrdinal6 != 4 ? R.string.accepted : R.string.paid : R.string.loosed, Arrays.copyOf(new Object[0], 0));
                    int iOrdinal7 = i0wVar2.ordinal();
                    if (iOrdinal7 == 2) {
                        pz40 pz40Var = s6t0.f31722a;
                        jM113getRed0d7_KjU2 = StaticColors.INSTANCE.m113getRed0d7_KjU();
                    } else if (iOrdinal7 != 4) {
                        pz40 pz40Var2 = s6t0.f31722a;
                        jM113getRed0d7_KjU2 = s6t0.b().f33626a.getPrimary();
                    } else {
                        pz40 pz40Var3 = s6t0.f31722a;
                        jM113getRed0d7_KjU2 = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                    }
                    lc00VarB.add(new bfj(zak0.f44074a[i0wVar2.ordinal()] == 2 ? R.drawable.ic_glyph_status_outline_minus : R.drawable.ic_glyph_status_outline_check, jM113getRed0d7_KjU2, bfb.R(j2, ctf0Var), strA6));
                    return new fak0(for0Var.f9896a, i4VarR0, str11, strA4, for0Var.i, true, new svw(lgb.Y(q4fVar)), vtb.W(listU, false), vtb.Y(listU, false), dyb.r0(kotlin.collections.a.a(lc00VarB)), p180Var, "", "", "", "", "", false);
                }
                if (iOrdinal4 != 1) {
                    t9f.b();
                    return null;
                }
                String str12 = for0Var.f9896a;
                lsm0 lsm0Var3 = ctf0Var.b;
                String strA7 = lsm0Var3.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str12}, 1));
                i4 i4VarG0 = dyb.g0(new noo0(lsm0Var3.a(R.string.toto_free_tag, Arrays.copyOf(new Object[0], 0)), "TagFree", dqo0.f6527a));
                lc00 lc00VarB2 = kotlin.collections.a.b();
                boolean z14 = for0Var.j;
                if (z14) {
                    str2 = strA7;
                    long j3 = for0Var.n;
                    if (j3 != 0) {
                        lc00VarB2.add(new k3w(kotlin.text.c.r(lsm0Var3.a(R.string.bet_info_approved_by_bet_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)), "№ ", "№", false)));
                    }
                } else {
                    str2 = strA7;
                }
                f3w f3wVarN2 = e9x.N(for0Var, ctf0Var, str);
                if (f3wVarN2 != null) {
                    lc00VarB2.add(f3wVarN2);
                }
                int iOrdinal8 = i0wVar2.ordinal();
                if (iOrdinal8 != 2) {
                    i6 = 4;
                    if (iOrdinal8 != 4) {
                        i7 = 0;
                        i8 = R.string.accepted;
                    } else {
                        i7 = 0;
                        i8 = R.string.paid;
                    }
                } else {
                    i6 = 4;
                    i7 = 0;
                    i8 = R.string.loosed;
                }
                String strA8 = lsm0Var3.a(i8, Arrays.copyOf(new Object[i7], i7));
                int iOrdinal9 = i0wVar2.ordinal();
                if (iOrdinal9 == 2) {
                    pz40 pz40Var4 = s6t0.f31722a;
                    jM113getRed0d7_KjU3 = StaticColors.INSTANCE.m113getRed0d7_KjU();
                } else if (iOrdinal9 != i6) {
                    pz40 pz40Var5 = s6t0.f31722a;
                    jM113getRed0d7_KjU3 = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var6 = s6t0.f31722a;
                    jM113getRed0d7_KjU3 = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                }
                int i10 = zak0.f44074a[i0wVar2.ordinal()] == 2 ? R.drawable.ic_glyph_status_outline_minus : R.drawable.ic_glyph_status_outline_check;
                String strA9 = z14 ? lsm0Var3.a(R.string.confirmed, Arrays.copyOf(new Object[0], 0)) : lsm0Var3.a(R.string.not_confirmed, Arrays.copyOf(new Object[0], 0));
                rdj rdjVar = rdj.f30294a;
                lc00VarB2.add(new bfj(i10, jM113getRed0d7_KjU3, rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56), ua80.i(strA8, " (", strA9, Separators.RPAREN)));
                return new fak0(str12, i4VarG0, str12, str2, for0Var.i, true, new svw(lgb.Y(q4fVar)), new oww(), new oww(), dyb.r0(kotlin.collections.a.a(lc00VarB2)), p180Var, "", "", "", "", "", false);
            }
            if (!(a5wVar instanceof z7y)) {
                if (!(a5wVar instanceof nc10)) {
                    lak0 lak0Var = lak0.c;
                    return new fak0("", lak0Var, "", "", "", false, qvw.f29409a, new oww(), new oww(), lak0Var, p180Var, "", "", "", "", "", false);
                }
                nc10 nc10Var = (nc10) a5wVar;
                String str13 = nc10Var.d;
                String strH = rz4.h(i, str13);
                lak0 lak0Var2 = lak0.c;
                Object[] objArr = {nc10Var.d};
                lsm0 lsm0Var4 = ctf0Var.b;
                String strA10 = lsm0Var4.a(R.string.history_coupon_number, Arrays.copyOf(objArr, 1));
                String str14 = nc10Var.b;
                oww owwVar = new oww();
                oww owwVar2 = new oww();
                lc00 lc00VarB3 = kotlin.collections.a.b();
                lc00VarB3.add(pzw.S(nc10Var, ctf0Var, str, false));
                String strR2 = bfb.R(nc10Var.e, ctf0Var);
                rc10 rc10Var = nc10Var.c;
                String strA11 = lsm0Var4.a(pzw.e0(rc10Var), Arrays.copyOf(new Object[0], 0));
                int iOrdinal10 = rc10Var.ordinal();
                if (iOrdinal10 == 0 || iOrdinal10 == 1) {
                    i2 = R.drawable.ic_glyph_status_outline_check;
                } else {
                    if (iOrdinal10 != 2) {
                        t9f.b();
                        return null;
                    }
                    i2 = R.drawable.ic_glyph_status_outline_return;
                }
                lc00VarB3.add(new bfj(i2, pzw.d0(rc10Var), strR2, strA11));
                return new fak0(strH, lak0Var2, str13, strA10, str14, true, new svw(R.drawable.glyph_loto), owwVar, owwVar2, dyb.r0(kotlin.collections.a.a(lc00VarB3)), p180Var, "", "", "", "", "", false);
            }
            z7y z7yVar = (z7y) a5wVar;
            List listU2 = xkb.U(list3);
            String str15 = z7yVar.f43943a;
            hxu hxuVar2 = z7yVar.k;
            lak0 lak0Var3 = lak0.c;
            lsm0 lsm0Var5 = ctf0Var.b;
            String strA12 = lsm0Var5.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str15}, 1));
            String strA13 = lsm0Var5.a(R.string.jackpot_word, Arrays.copyOf(new Object[0], 0));
            xww xwwVarW = vtb.W(listU2, false);
            xww xwwVarY = vtb.Y(listU2, false);
            lc00 lc00VarB4 = kotlin.collections.a.b();
            i0w i0wVar3 = z7yVar.e;
            int iOrdinal11 = i0wVar3.ordinal();
            if (iOrdinal11 == 3 || iOrdinal11 == 4) {
                String strA14 = lsm0Var5.a(R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var2 = pn40.f27267a;
                g3wVar = new g3w(strA14, pn40.c(z7yVar.f, p3u0.c));
            } else {
                g3wVar = null;
            }
            if (g3wVar != null) {
                lc00VarB4.add(g3wVar);
            }
            String strA15 = lsm0Var5.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var3 = pn40.f27267a;
            double d4 = z7yVar.g;
            p3u0 p3u0Var = p3u0.c;
            lc00VarB4.add(new f3w("", strA15, pn40.c(d4, p3u0Var), str, e3w.f7156a));
            i4 i4VarE3 = fxb.E(hxuVar2, str, i0wVar3, true);
            ivo0 ivo0Var2 = hxuVar2.f;
            if (i4VarE3 != null) {
                lc00VarB4.addAll(i4VarE3);
            }
            if (ivo0Var2.b == 0.0d || ivo0Var2.f15455a.length() <= 0) {
                if (i0wVar3 == i0w.d || i0wVar3 == i0w.e) {
                    f3wVar = new f3w("", lsm0Var5.a(R.string.history_your_win, Arrays.copyOf(new Object[0], 0)), pn40.c(z7yVar.c, p3u0Var), str, e3w.b);
                }
                obj = objT;
                if (obj != null) {
                    lc00VarB4.add(obj);
                }
                iOrdinal = i0wVar3.ordinal();
                if (iOrdinal != 2) {
                    i3 = 4;
                    if (iOrdinal != 4) {
                        i4 = R.string.accepted;
                    } else {
                        i4 = R.string.paid;
                    }
                } else {
                    i3 = 4;
                    i4 = R.string.loosed;
                }
                String strA16 = lsm0Var5.a(i4, Arrays.copyOf(new Object[0], 0));
                iOrdinal2 = i0wVar3.ordinal();
                if (iOrdinal2 != 2) {
                    pz40 pz40Var7 = s6t0.f31722a;
                    jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
                } else if (iOrdinal2 != i3) {
                    pz40 pz40Var8 = s6t0.f31722a;
                    jM113getRed0d7_KjU = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var9 = s6t0.f31722a;
                    jM113getRed0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
                }
                if (kak0.f17968a[i0wVar3.ordinal()] == 2) {
                    i5 = R.drawable.ic_glyph_status_outline_minus;
                } else {
                    i5 = R.drawable.ic_glyph_status_outline_check;
                }
                lc00VarB4.add(new bfj(i5, jM113getRed0d7_KjU, bfb.R(z7yVar.d, ctf0Var), strA16));
                return new fak0(str15, lak0Var3, str15, strA12, strA13, true, new svw(R.drawable.ic_football), xwwVarW, xwwVarY, dyb.r0(kotlin.collections.a.a(lc00VarB4)), p180Var, "", "", "", "", "", false);
            }
            f3wVar = new f3w("", ivo0Var2.f15455a, pn40.c(ivo0Var2.b, p3u0Var), str, e3w.b);
            objT = f3wVar;
            obj = objT;
            if (obj != null) {
                lc00VarB4.add(obj);
            }
            iOrdinal = i0wVar3.ordinal();
            if (iOrdinal != 2) {
                i3 = 4;
                if (iOrdinal != 4) {
                    i4 = R.string.accepted;
                } else {
                    i4 = R.string.paid;
                }
            } else {
                i3 = 4;
                i4 = R.string.loosed;
            }
            String strA17 = lsm0Var5.a(i4, Arrays.copyOf(new Object[0], 0));
            iOrdinal2 = i0wVar3.ordinal();
            if (iOrdinal2 != 2) {
                pz40 pz40Var10 = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
            } else if (iOrdinal2 != i3) {
                pz40 pz40Var11 = s6t0.f31722a;
                jM113getRed0d7_KjU = s6t0.b().f33626a.getPrimary();
            } else {
                pz40 pz40Var12 = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
            }
            if (kak0.f17968a[i0wVar3.ordinal()] == 2) {
                i5 = R.drawable.ic_glyph_status_outline_minus;
            } else {
                i5 = R.drawable.ic_glyph_status_outline_check;
            }
            lc00VarB4.add(new bfj(i5, jM113getRed0d7_KjU, bfb.R(z7yVar.d, ctf0Var), strA17));
            return new fak0(str15, lak0Var3, str15, strA12, strA13, true, new svw(R.drawable.ic_football), xwwVarW, xwwVarY, dyb.r0(kotlin.collections.a.a(lc00VarB4)), p180Var, "", "", "", "", "", false);
        }
        kzv kzvVar3 = (kzv) a5wVar;
        double d5 = kzvVar3.c;
        double d6 = kzvVar3.o;
        double d7 = kzvVar3.e;
        String str16 = kzvVar3.i;
        i0w i0wVar4 = kzvVar3.g;
        String str17 = kzvVar3.B;
        double d8 = kzvVar3.r;
        String str18 = kzvVar3.f19169a;
        Long lT0 = StringsKt.t0(str18);
        boolean zContains = list4.contains(Long.valueOf(lT0 != null ? lT0.longValue() : 0L));
        i7u i7uVar = i7u.b;
        i7u i7uVar2 = i7u.c;
        hxu hxuVar3 = kzvVar3.O;
        List list6 = kzvVar3.Y;
        boolean zY = u1c.y(kzvVar3);
        String str19 = Separators.COLON;
        String str20 = "";
        if (zY) {
            int i11 = kzvVar3.v;
            ArrayList arrayList = new ArrayList(r3d.q(list6, 10));
            Iterator it = list6.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((z0w) it.next()).F));
                it = it;
                str20 = str20;
            }
            String str21 = str20;
            HashSet hashSetJ0 = CollectionsKt.J0(arrayList);
            List listR = xkb.R(kzvVar3, historyTypeModel, list3);
            boolean zA = i7uVar2.a(list6, list5);
            boolean zA2 = i7uVar.a(list6, list5);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((xco) obj2).e) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                z11 = false;
                break;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
                if (hashSetJ0.contains(Long.valueOf(((xco) it2.next()).f40655a))) {
                    z11 = true;
                    break;
                }
            }
            i4 i4VarN = jwb.N(kzvVar3, ctf0Var, list2, z11, zA, zA2, "");
            lsm0 lsm0Var6 = ctf0Var.b;
            String strA18 = lsm0Var6.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str18}, 1));
            tvw tvwVarA0 = lmc.a0(kzvVar3);
            xww xwwVarW2 = vtb.W(listR, zContains);
            xww xwwVarY2 = vtb.Y(listR, zContains);
            lc00 lc00VarB5 = kotlin.collections.a.b();
            String strA19 = lsm0Var6.a(R.string.events_completed, Arrays.copyOf(new Object[0], 0));
            q4f q4fVar2 = kzvVar3.b;
            Integer numValueOf = Integer.valueOf(i11);
            int i12 = kzvVar3.t;
            lc00VarB5.add(new szv(i11 > 0 ? i11 / i12 : 0.0f, strA19, lsm0Var6.a(R.string.search_result, Arrays.copyOf(new Object[]{numValueOf, Integer.valueOf(i12)}, 2))));
            if (eak0.f7470a[i0wVar4.ordinal()] == 1) {
                str9 = str21;
                strA2 = kotlin.text.c.r(lsm0Var6.a(R.string.sell_coefficient_with_dots, Arrays.copyOf(new Object[0], 0)), Separators.COLON, str9, false);
            } else {
                str9 = str21;
                strA2 = lsm0Var6.a(R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0));
            }
            g3w g3wVar4 = new g3w(strA2, kng0.k("\u200e", str16));
            if (str16.length() <= 0) {
                g3wVar4 = null;
            }
            if (g3wVar4 != null) {
                lc00VarB5.add(g3wVar4);
            }
            q4f q4fVar3 = q4f.h;
            if (q4fVar2 == q4fVar3) {
                str10 = str;
                z12 = z4;
                h3wVarI2 = null;
            } else {
                i0w i0wVar5 = i0w.b;
                if (i0wVar4 == i0wVar5 && q3d.j(q4f.g, q4f.e).contains(q4fVar2)) {
                    String strA20 = lsm0Var6.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
                    pn40 pn40Var4 = pn40.f27267a;
                    f3wVarM2 = new f3w("", strA20, pn40.c(kzvVar3.f, p3u0.c), str, e3w.f7156a);
                    str10 = str;
                } else {
                    str10 = str;
                    if (z6) {
                        f3wVarM2 = r8x.M(kzvVar3, ctf0Var, str10);
                    } else if (i0wVar4 == i0w.f13966a || i0wVar4 == i0w.e || i0wVar4 == i0wVar5 || i0wVar4 == i0w.g || i0wVar4 == i0w.d) {
                        z12 = z4;
                        h3wVarI2 = r8x.I(kzvVar3, ctf0Var, str10, z, z12);
                    } else {
                        f3wVarM2 = r8x.M(kzvVar3, ctf0Var, str10);
                    }
                }
                h3wVarI2 = f3wVarM2;
                z12 = z4;
            }
            if (h3wVarI2 != null) {
                lc00VarB5.add(h3wVarI2);
            }
            f3w f3wVarJ2 = r8x.J(kzvVar3, ctf0Var, str10);
            if (f3wVarJ2 != null) {
                lc00VarB5.add(f3wVarJ2);
            }
            i0w i0wVar6 = i0w.b;
            if (i0wVar4 == i0wVar6 && q3d.j(q4f.e, q4f.g).contains(q4fVar2) && d8 != 0.0d && z12) {
                String strA21 = lsm0Var6.a(R.string.history_min_payout_no_colon, Arrays.copyOf(new Object[0], 0));
                pn40 pn40Var5 = pn40.f27267a;
                d2 = d8;
                f3wVar3 = new f3w("", strA21, pn40.c(d2, p3u0.c), str10, e3w.f7156a);
            } else {
                d2 = d8;
                f3wVar3 = null;
            }
            if (f3wVar3 != null) {
                lc00VarB5.add(f3wVar3);
            }
            f3w f3wVarG2 = r8x.G(kzvVar3, ctf0Var, str10, z6);
            if (f3wVarG2 != null) {
                lc00VarB5.add(f3wVarG2);
            }
            f3w f3wVarH2 = r8x.H(kzvVar3, ctf0Var, str10, z6);
            if (f3wVarH2 != null) {
                lc00VarB5.add(f3wVarH2);
            }
            i4 i4VarE4 = fxb.E(hxuVar3, str10, i0wVar4, z6);
            ivo0 ivo0Var3 = hxuVar3.f;
            if (i4VarE4 != null) {
                lc00VarB5.addAll(i4VarE4);
            }
            if (!z12) {
                e3wVar3 = null;
            } else if (q4fVar2 == q4fVar3) {
                e3wVar3 = e3w.f7156a;
            } else if ((q4fVar2 == q4f.e || q4fVar2 == q4f.g) && i0wVar4 != i0w.d && i0wVar4 != i0w.e) {
                e3wVar3 = e3w.f7156a;
            } else if (!z6) {
                e3wVar3 = null;
            } else if (i0wVar4 == i0w.f13966a || i0wVar4 == i0wVar6) {
                e3wVar3 = e3w.f7156a;
            } else if (i0wVar4 == i0w.d || i0wVar4 == i0w.e) {
                e3wVar3 = e3w.b;
            } else {
                e3wVar3 = null;
            }
            if (e3wVar3 != null) {
                if (ivo0Var3.f15455a.length() > 0 && kotlin.collections.a.c(i0wVar6).contains(i0wVar4)) {
                    strA3 = ivo0Var3.f15455a;
                } else if (d7 == 0.0d) {
                    strA3 = str9;
                } else {
                    strA3 = (i0wVar4 == i0w.f13966a || i0wVar4 == i0wVar6) ? lsm0Var6.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)) : lsm0Var6.a(R.string.history_your_win, Arrays.copyOf(new Object[0], 0));
                }
                double d9 = ivo0Var3.b;
                if (d9 != 0.0d) {
                    d3 = d9;
                } else if (i0wVar4 == i0w.f13966a || i0wVar4 == i0wVar6) {
                    d3 = d2;
                } else {
                    d3 = (i0wVar4 == i0w.d || i0wVar4 == i0w.e) ? d5 : d6;
                }
                pn40 pn40Var6 = pn40.f27267a;
                f3wVar4 = new f3w("", strA3, pn40.c(d3, p3u0.c), str10, e3wVar3);
                if (strA3.length() <= 0 || d3 == 0.0d) {
                    f3wVar4 = null;
                }
            } else {
                f3wVar4 = null;
            }
            if (f3wVar4 != null) {
                lc00VarB5.add(f3wVar4);
            }
            lc00VarB5.add(r8x.O(kzvVar3, ctf0Var));
            return new fak0(str18, i4VarN, str18, strA18, str17, true, tvwVarA0, xwwVarW2, xwwVarY2, dyb.r0(kotlin.collections.a.a(lc00VarB5)), p180Var, "", "", "", "", "", false);
        }
        hxu hxuVar4 = hxuVar3;
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z9 = zContains;
                next = null;
                break;
            }
            next = it3.next();
            z9 = zContains;
            if (((xco) next).f40655a == kzvVar3.T) {
                break;
            }
            zContains = z9;
        }
        xco xcoVar = (xco) next;
        List listR2 = xkb.R(kzvVar3, historyTypeModel, list3);
        String str22 = kzvVar3.l;
        Iterator it4 = list5.iterator();
        while (true) {
            if (!it4.hasNext()) {
                kzvVar = kzvVar3;
                str3 = str19;
                hxuVar = hxuVar4;
                next2 = null;
                break;
            }
            next2 = it4.next();
            kzvVar = kzvVar3;
            ueo ueoVar = (ueo) next2;
            Iterator it5 = it4;
            z0w z0wVar2 = (z0w) CollectionsKt.firstOrNull(list6);
            if (z0wVar2 != null) {
                str3 = str19;
                hxuVar = hxuVar4;
                if (ueoVar.f35538a == z0wVar2.v) {
                    break;
                }
            } else {
                str3 = str19;
                hxuVar = hxuVar4;
            }
            it4 = it5;
            kzvVar3 = kzvVar;
            str19 = str3;
            hxuVar4 = hxuVar;
        }
        ueo ueoVar2 = (ueo) next2;
        boolean zA3 = i7uVar2.a(list6, list5);
        boolean zA4 = i7uVar.a(list6, list5);
        boolean z15 = zA3;
        boolean z16 = z9;
        kzv kzvVar4 = kzvVar;
        i4 i4VarN2 = jwb.N(kzvVar4, ctf0Var, list2, xcoVar != null ? xcoVar.e : false, z15, zA4, "");
        lsm0 lsm0Var7 = ctf0Var.b;
        String strA22 = lsm0Var7.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str18}, 1));
        tvw tvwVarA1 = lmc.a0(kzvVar4);
        xww xwwVarW3 = vtb.W(listR2, z16);
        xww xwwVarY3 = vtb.Y(listR2, z16);
        lc00 lc00VarB6 = kotlin.collections.a.b();
        if (z6) {
            z15 = z15;
            i4VarN2 = i4VarN2;
        } else {
            String str23 = kzvVar4.k;
            g3w g3wVar5 = (!z15 || str23.length() == 0) ? null : new g3w(lsm0Var7.a(R.string.maximum_coef, Arrays.copyOf(new Object[0], 0)), "\u200e".concat(str23));
            if (g3wVar5 != null) {
                lc00VarB6.add(g3wVar5);
            }
        }
        if (!z6) {
            String strA23 = (!z15 || str22.length() <= 0) ? i0wVar4 == i0w.i ? lsm0Var7.a(R.string.sell_coefficient_no_dots, Arrays.copyOf(new Object[0], 0)) : lsm0Var7.a(R.string.coefficient, Arrays.copyOf(new Object[0], 0)) : lsm0Var7.a(R.string.optional_coef, Arrays.copyOf(new Object[0], 0));
            String str24 = (!z15 || str22.length() <= 0) ? str16 : str22;
            g3w g3wVar6 = new g3w(strA23, kng0.k("\u200e", str24));
            if (str24.length() <= 0) {
                g3wVar6 = null;
            }
            if (g3wVar6 != null) {
                lc00VarB6.add(g3wVar6);
            }
        }
        if (z6) {
            g3w g3wVar7 = (!z15 || str22.length() == 0) ? null : new g3w(lsm0Var7.a(R.string.optional_coef, Arrays.copyOf(new Object[0], 0)), "\u200e".concat(str22));
            if (g3wVar7 != null) {
                lc00VarB6.add(g3wVar7);
            }
        }
        if (e3c.r(kzvVar4, z5)) {
            str4 = str3;
            g3wVar2 = new g3w(w6x.r(new Object[0], 0, lsm0Var7, R.string.coefficient_type_title, str4), lsm0Var7.a(R.string.coef_view_ind, Arrays.copyOf(new Object[0], 0)));
        } else {
            str4 = str3;
            g3wVar2 = null;
        }
        if (g3wVar2 != null) {
            lc00VarB6.add(g3wVar2);
        }
        if (!z6) {
            if (i0wVar4 == i0w.f13966a || i0wVar4 == i0w.e || i0wVar4 == i0w.b || i0wVar4 == i0w.g || i0wVar4 == i0w.d) {
                z10 = z4;
                h3wVarI = r8x.I(kzvVar4, ctf0Var, str, z, z10);
            } else {
                f3wVarM = r8x.M(kzvVar4, ctf0Var, str);
            }
            lc00VarB6.add(h3wVarI);
            f3wVarJ = r8x.J(kzvVar4, ctf0Var, str);
            if (f3wVarJ != null) {
                lc00VarB6.add(f3wVarJ);
            }
            f3wVarG = r8x.G(kzvVar4, ctf0Var, str, z6);
            if (f3wVarG != null) {
                lc00VarB6.add(f3wVarG);
            }
            f3wVarH = r8x.H(kzvVar4, ctf0Var, str, z6);
            if (f3wVarH != null) {
                lc00VarB6.add(f3wVarH);
            }
            hxu hxuVar5 = hxuVar;
            i4VarE = fxb.E(hxuVar5, str, i0wVar4, z6);
            ivo0Var = hxuVar5.f;
            if (i4VarE != null) {
                lc00VarB6.addAll(i4VarE);
            }
            if (z6 || !z10) {
                e3wVar = null;
            } else {
                if (i0wVar4 == i0w.f13966a || i0wVar4 == i0w.b) {
                    e3wVar2 = e3w.f7156a;
                } else if (i0wVar4 == i0w.d || i0wVar4 == i0w.e || i0wVar4 == i0w.g) {
                    e3wVar2 = e3w.b;
                } else {
                    e3wVar = null;
                }
                e3wVar = e3wVar2;
            }
            if (e3wVar == null) {
                ctf0Var2 = ctf0Var;
                lsm0Var = lsm0Var7;
                xwwVar = xwwVarY3;
                f3wVar2 = null;
                kzvVar2 = kzvVar4;
            } else {
                if (ivo0Var.f15455a.length() <= 0 && kotlin.collections.a.c(i0w.b).contains(i0wVar4)) {
                    strA = ivo0Var.f15455a;
                } else if (d7 == 0.0d) {
                    strA = "";
                } else if (i0wVar4 != i0w.f13966a || i0wVar4 == i0w.b) {
                    if (kzvVar4.s) {
                        i9 = R.string.max_win_possible;
                    } else {
                        i9 = R.string.bet_possible_win;
                    }
                    strA = lsm0Var7.a(i9, Arrays.copyOf(new Object[0], 0));
                } else {
                    strA = lsm0Var7.a(R.string.history_your_win, Arrays.copyOf(new Object[0], 0));
                }
                iOrdinal3 = i0wVar4.ordinal();
                if (iOrdinal3 != 0 || iOrdinal3 == 1) {
                    d = d8;
                } else {
                    d = iOrdinal3 != 3 ? d6 : d5;
                }
                pn40 pn40Var7 = pn40.f27267a;
                String strC = pn40.c(d, p3u0.c);
                xwwVar = xwwVarY3;
                kzvVar2 = kzvVar4;
                double d10 = d;
                lsm0Var = lsm0Var7;
                ctf0Var2 = ctf0Var;
                f3wVar2 = new f3w("", strA, strC, str, e3wVar);
                if (strA.length() > 0 || d10 == 0.0d) {
                    f3wVar2 = null;
                }
            }
            if (f3wVar2 != null) {
                lc00VarB6.add(f3wVar2);
            }
            lc00VarB6.add(r8x.O(kzvVar2, ctf0Var2));
            i4 i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB6));
            u180 u180VarT0 = kpb.t0(kzvVar2);
            z0wVar = (z0w) CollectionsKt.U(list6);
            j = kzvVar2.h;
            ril0Var = (ril0) map.get(Long.valueOf(j));
            if (ril0Var != null || (str5 = ril0Var.b) == null) {
                str5 = z0wVar.u;
            }
            strConcat = str5.concat(". ");
            if (str5.length() <= 0) {
                strConcat = null;
            }
            if (strConcat == null) {
                strConcat = "";
            }
            if (j == 95) {
                strConcat = lsm0Var.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0));
            } else if (kzvVar2.S != uoy.FINANCE_365) {
                strConcat = strConcat.concat(kzvVar2.A);
            }
            if (xcoVar != null) {
                str6 = xcoVar.b;
            } else {
                str6 = null;
            }
            if (str6 == null) {
                str7 = "";
            } else {
                str7 = str6;
            }
            kzv kzvVar5 = kzvVar2;
            strR = f7k.R(kzvVar5, z2, z3, ueoVar2, str7, z7, z8);
            i0wVar = i0w.i;
            if (i0wVar4 == i0wVar) {
                strR = null;
            }
            if (strR == null) {
                str8 = "";
                strR = kotlin.text.c.r(lsm0Var.a(R.string.sell_coefficient_with_dots, Arrays.copyOf(new Object[0], 0)), str4, str8, false);
            } else {
                str8 = "";
            }
            objT = i0wVar4 != i0wVar ? wvb.T(kzvVar5, betHistoryScreenModel) : null;
            if (objT == null) {
                objT = str8;
            }
            return new fak0(str18, i4VarN2, str18, strA22, str17, true, tvwVarA1, xwwVarW3, xwwVar, i4VarR1, u180VarT0, strConcat, strR, objT, kng0.k("\u200e", sj3.b0(kzvVar5)), "", true);
        }
        f3wVarM = r8x.M(kzvVar4, ctf0Var, str);
        h3wVarI = f3wVarM;
        z10 = z4;
        lc00VarB6.add(h3wVarI);
        f3wVarJ = r8x.J(kzvVar4, ctf0Var, str);
        if (f3wVarJ != null) {
            lc00VarB6.add(f3wVarJ);
        }
        f3wVarG = r8x.G(kzvVar4, ctf0Var, str, z6);
        if (f3wVarG != null) {
            lc00VarB6.add(f3wVarG);
        }
        f3wVarH = r8x.H(kzvVar4, ctf0Var, str, z6);
        if (f3wVarH != null) {
            lc00VarB6.add(f3wVarH);
        }
        hxu hxuVar6 = hxuVar;
        i4VarE = fxb.E(hxuVar6, str, i0wVar4, z6);
        ivo0Var = hxuVar6.f;
        if (i4VarE != null) {
            lc00VarB6.addAll(i4VarE);
        }
        if (z6) {
            e3wVar = null;
        } else {
            e3wVar = null;
        }
        if (e3wVar == null) {
            ctf0Var2 = ctf0Var;
            lsm0Var = lsm0Var7;
            xwwVar = xwwVarY3;
            f3wVar2 = null;
            kzvVar2 = kzvVar4;
        } else {
            if (ivo0Var.f15455a.length() <= 0) {
                if (d7 == 0.0d) {
                    strA = "";
                } else if (i0wVar4 != i0w.f13966a) {
                    if (kzvVar4.s) {
                        i9 = R.string.max_win_possible;
                    } else {
                        i9 = R.string.bet_possible_win;
                    }
                    strA = lsm0Var7.a(i9, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (kzvVar4.s) {
                        i9 = R.string.max_win_possible;
                    } else {
                        i9 = R.string.bet_possible_win;
                    }
                    strA = lsm0Var7.a(i9, Arrays.copyOf(new Object[0], 0));
                }
            } else if (d7 == 0.0d) {
                strA = "";
            } else if (i0wVar4 != i0w.f13966a) {
                if (kzvVar4.s) {
                    i9 = R.string.max_win_possible;
                } else {
                    i9 = R.string.bet_possible_win;
                }
                strA = lsm0Var7.a(i9, Arrays.copyOf(new Object[0], 0));
            } else {
                if (kzvVar4.s) {
                    i9 = R.string.max_win_possible;
                } else {
                    i9 = R.string.bet_possible_win;
                }
                strA = lsm0Var7.a(i9, Arrays.copyOf(new Object[0], 0));
            }
            iOrdinal3 = i0wVar4.ordinal();
            if (iOrdinal3 != 0) {
                d = d8;
            } else {
                d = d8;
            }
            pn40 pn40Var8 = pn40.f27267a;
            String strC2 = pn40.c(d, p3u0.c);
            xwwVar = xwwVarY3;
            kzvVar2 = kzvVar4;
            double d11 = d;
            lsm0Var = lsm0Var7;
            ctf0Var2 = ctf0Var;
            f3wVar2 = new f3w("", strA, strC2, str, e3wVar);
            if (strA.length() > 0) {
                f3wVar2 = null;
            } else {
                f3wVar2 = null;
            }
        }
        if (f3wVar2 != null) {
            lc00VarB6.add(f3wVar2);
        }
        lc00VarB6.add(r8x.O(kzvVar2, ctf0Var2));
        i4 i4VarR2 = dyb.r0(kotlin.collections.a.a(lc00VarB6));
        u180 u180VarT1 = kpb.t0(kzvVar2);
        z0wVar = (z0w) CollectionsKt.U(list6);
        j = kzvVar2.h;
        ril0Var = (ril0) map.get(Long.valueOf(j));
        if (ril0Var != null) {
            str5 = z0wVar.u;
        } else {
            str5 = z0wVar.u;
        }
        strConcat = str5.concat(". ");
        if (str5.length() <= 0) {
            strConcat = null;
        }
        if (strConcat == null) {
            strConcat = "";
        }
        if (j == 95) {
            strConcat = lsm0Var.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0));
        } else if (kzvVar2.S != uoy.FINANCE_365) {
            strConcat = strConcat.concat(kzvVar2.A);
        }
        if (xcoVar != null) {
            str6 = xcoVar.b;
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        kzv kzvVar6 = kzvVar2;
        strR = f7k.R(kzvVar6, z2, z3, ueoVar2, str7, z7, z8);
        i0wVar = i0w.i;
        if (i0wVar4 == i0wVar) {
            strR = null;
        }
        if (strR == null) {
            str8 = "";
            strR = kotlin.text.c.r(lsm0Var.a(R.string.sell_coefficient_with_dots, Arrays.copyOf(new Object[0], 0)), str4, str8, false);
        } else {
            str8 = "";
        }
        if (i0wVar4 != i0wVar) {
        }
        if (objT == null) {
            objT = str8;
        }
        return new fak0(str18, i4VarN2, str18, strA22, str17, true, tvwVarA1, xwwVarW3, xwwVar, i4VarR2, u180VarT1, strConcat, strR, objT, kng0.k("\u200e", sj3.b0(kzvVar6)), "", true);
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(1316842024);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            y3y y3yVar = (y3y) l7m0Var.getValue();
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40Var, background, ljcVar);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            ucx.j(null, y3yVar.f41974a, fetVar2, 0);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            byte b = 12;
            mm40 mm40VarQ2 = i120.Q(lgb.J(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarJ = lgb.J(mm40Var, vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12));
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            qxw.o(fetVar2, lgb.J(o7k0.e(mm40Var, 12.0f), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)));
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            pz40 pz40VarF = androidx.compose.runtime.e.f(y3yVar.b, fetVar2);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                function2 = function1;
                objP = new u9x(function2, b);
                fetVar2.o0(objP);
            } else {
                function2 = function1;
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new u9x(function2, (byte) 13);
                fetVar2.o0(objP2);
            }
            w9x.b(mm40VarL, pz40VarF, function0, (Function0) objP2, fetVar2, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            px6 px6Var = y3yVar.c;
            boolean z4 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new i1y(function2, (byte) 2);
                fetVar.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            boolean z5 = i3 == 256;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new u9x(function2, (byte) 14);
                fetVar.o0(objP4);
            }
            Function0 function4 = (Function0) objP4;
            boolean z6 = i3 == 256;
            Object objP5 = fetVar.P();
            if (z6 || objP5 == cl5Var) {
                objP5 = new u9x(function2, (byte) 15);
                fetVar.o0(objP5);
            }
            kcx.e(null, px6Var, function3, function4, (Function0) objP5, fetVar, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 16.0f, 8.0f);
            wul wulVar = y3yVar.d;
            boolean z7 = i3 == 256;
            Object objP6 = fetVar.P();
            if (z7 || objP6 == cl5Var) {
                objP6 = new u9x(function2, (byte) 16);
                fetVar.o0(objP6);
            }
            qzb.n(mm40VarK, wulVar, phu0.G(0, 1, fetVar, (Function0) objP6), fetVar, 0, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            String str = y3yVar.e;
            mm40 mm40VarL2 = s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2);
            long secondary80 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary80();
            f2q0 f2q0Var = new f2q0(3);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL2, secondary80, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 0, 0, null, g1t0.g(), fetVar, 0, 384, 125944);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            wvb.o(i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ljcVar), 8.0f, 0L, fetVar2, 0, 4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 22);
        }
    }

    public static final void b(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        float f3;
        long j;
        fetVar.g0(-1527562400);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.d(f) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f4 = f + f2;
            float f5 = 0.0f;
            if (f4 == 0.0f) {
                f3 = 0.0f;
            } else {
                f3 = f == f2 ? 1.0f : f / f4;
            }
            if (f4 != 0.0f) {
                f5 = f == f2 ? 1.0f : f2 / f4;
            }
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
            long jM126getWhite200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarC = o7k0.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            boolean zF = fetVar.f(jM126getWhite200d7_KjU) | fetVar.d(f3) | fetVar.f(primary);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                u9c u9cVar = new u9c(jM126getWhite200d7_KjU, f3, primary, (byte) 2);
                j = primary;
                fetVar.o0(u9cVar);
                objP = u9cVar;
            } else {
                j = primary;
            }
            zq8.a(0, fetVar, rq8.K(mm40VarC, (Function1) objP));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarC2 = o7k0.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            boolean zF2 = fetVar.f(jM126getWhite200d7_KjU) | fetVar.d(f5) | fetVar.f(j);
            Object objP2 = fetVar.P();
            if (zF2 || objP2 == cl5Var) {
                u9c u9cVar2 = new u9c(jM126getWhite200d7_KjU, f5, j, (byte) 4);
                fetVar.o0(u9cVar2);
                objP2 = u9cVar2;
            }
            zq8.a(0, fetVar, rq8.K(mm40VarC2, (Function1) objP2));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vil(mm40Var, f, f2, i, (byte) 2);
        }
    }

    public static final void c(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(742842011);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(24.0f, true, new jf4((byte) 14));
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).d, 0.0f, 2);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new tr20((byte) 3);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE, null, lh80VarT, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, 818085888, WarningHeader.MULTICAST_NOT_AVAILABLE);
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gn8(mm40Var, ugdVar, i, (byte) 5);
        }
    }

    public static final void d(mm40 mm40Var, mpm mpmVar, c8n c8nVar, boolean z, fet fetVar, int i) {
        boolean z2;
        fetVar.g0(1722354336);
        byte b = 2;
        byte b2 = 16;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(mpmVar) ? 32 : 16) | (fetVar.g(c8nVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            yje yjeVar = null;
            Long lValueOf = c8nVar != null ? Long.valueOf(c8nVar.b.b) : null;
            boolean z3 = (i2 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == obj) {
                objP3 = new xr10(c8nVar, pz40Var, yjeVar, b2);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, lValueOf, (Function2) objP3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            n4c.l(null, mpmVar, z, fetVar, 1);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar.e0(-880648926);
                if (c8nVar == null) {
                    fetVar.e0(-1530312929);
                    fetVar.r(false);
                    z2 = false;
                } else {
                    fetVar.e0(-1530312928);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    boolean zI = fetVar.i(vneVar);
                    Object objP4 = fetVar.P();
                    if (zI || objP4 == obj) {
                        objP4 = new s5m(vneVar, pz40Var, b);
                        fetVar.o0(objP4);
                    }
                    z2 = false;
                    v7n.c(mm40VarN, c8nVar, (Function0) objP4, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(z2);
            } else {
                fetVar.e0(-1529891700);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n(mm40Var, mpmVar, c8nVar, z, i);
        }
    }

    public static final void e(c280 c280Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1406692427);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(c280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(jm40.b, 32.0f), "NAME_AND_LOGO_ROW_TAG");
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.E, 2, false, 2, 0, null, g1t0.m(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5l0(c280Var, str, i, (byte) 0);
        }
    }

    public static final void f(c280 c280Var, String str, c280 c280Var2, String str2, String str3, long j, String str4, long j2, fet fetVar, int i) {
        c280 c280Var3;
        String str5 = str3;
        long j3 = j;
        String str6 = str4;
        long j4 = j2;
        fetVar.g0(-1658840251);
        int i2 = i | (fetVar.g(c280Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(c280Var2) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str5) ? 16384 : 8192) | (fetVar.f(j3) ? 131072 : 65536) | (fetVar.g(str6) ? 1048576 : 524288) | (fetVar.f(j4) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 64.0f), true);
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            e(c280Var, str, fetVar, i2 & 126);
            c280Var3 = c280Var2;
            e(c280Var3, str2, fetVar, (i2 >> 6) & 126);
            fetVar.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 64.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.o, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            str5 = str3;
            j3 = j;
            k(str5, j3, fetVar, (i2 >> 12) & 126);
            str6 = str4;
            j4 = j2;
            k(str6, j4, fetVar, (i2 >> 18) & 126);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            c280Var3 = c280Var2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o5l0(c280Var, str, c280Var3, str2, str5, j3, str6, j4, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.mm40] */
    /* JADX WARN: Type inference failed for: r14v2, types: [a.jm40] */
    /* JADX WARN: Type inference failed for: r47v1 */
    /* JADX WARN: Type inference failed for: r47v2 */
    /* JADX WARN: Type inference failed for: r57v0, types: [a.fet] */
    public static final void g(mm40 mm40Var, final float f, String str, ar90 ar90Var, final xcz xczVar, final int i, final float f2, gy40 gy40Var, final float f3, final Function0 function0, fet fetVar, final int i2) {
        final gy40 gy40Var2;
        ?? r47;
        zfn zfnVar;
        zfn zfnVar2;
        y9q0 y9q0VarA;
        int i3;
        final String str2 = str;
        final ar90 ar90Var2 = ar90Var;
        str2.getClass();
        xczVar.getClass();
        function0.getClass();
        fetVar.g0(-364605244);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & 4096) == 0 ? fetVar.g(ar90Var2) : fetVar.i(ar90Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar.g(xczVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= fetVar.e(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= fetVar.d(f2) ? 1048576 : 524288;
        }
        int i5 = i4 | 12582912;
        if ((100663296 & i2) == 0) {
            i5 |= fetVar.d(f3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= fetVar.i(function0) ? 536870912 : 268435456;
        }
        boolean z = true;
        if (fetVar.U(i5 & 1, (i5 & 306783379) != 306783378)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var3 = (gy40) objP;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            final g9q0 g9q0VarN = pym0.n(fetVar);
            if (ar90Var2 instanceof yq90) {
                fetVar.e0(1801695093);
                float f4 = tq90.f34370a;
                zfnVar = j1t0.e;
                ((g1t0) fetVar.k(zfnVar)).getClass();
                y9q0 y9q0VarK = g1t0.k();
                zfnVar2 = zaq0.b;
                y9q0VarA = y9q0.a(y9q0VarK, ((ThemeColors) fetVar.k(zfnVar2)).getSecondary20(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                fetVar.r(false);
            } else {
                fetVar.e0(1801696758);
                float f5 = tq90.f34370a;
                zfnVar = j1t0.e;
                ((g1t0) fetVar.k(zfnVar)).getClass();
                y9q0 y9q0VarK2 = g1t0.k();
                zfnVar2 = zaq0.b;
                y9q0VarA = y9q0.a(y9q0VarK2, ((ThemeColors) fetVar.k(zfnVar2)).getSecondary60(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                fetVar.r(false);
            }
            final y9q0 y9q0Var = y9q0VarA;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            final y9q0 y9q0VarA2 = y9q0.a(g1t0.k(), ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
            float f6 = tq90.f34370a;
            final float fW0 = w6kVar.w0(f6);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.d(o7k0.e(jm40Var, f), 1.0f), f6, 0.0f, 2);
            boolean z2 = (1879048192 & i5) == 536870912;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new a2z(function0, (byte) 27);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarL, gy40Var3, null, false, null, (Function0) objP2, 28), y3d.f, jd8.n);
            int i6 = i5 & 896;
            int i7 = i5 & 7168;
            boolean zD = fetVar.d(fW0) | fetVar.g(g9q0VarN) | (i6 == 256) | fetVar.g(y9q0Var) | fetVar.g(y9q0VarA2) | ((57344 & i5) == 16384) | ((458752 & i5) == 131072) | ((234881024 & i5) == 67108864) | ((3670016 & i5) == 1048576) | (i7 == 2048 || ((i5 & 4096) != 0 && fetVar.i(ar90Var2)));
            Object objP3 = fetVar.P();
            if (zD || objP3 == obj) {
                i3 = i5;
                str2 = str;
                Function1 function1 = new Function1() { // from class: a.uq90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        pi9 pi9Var = (pi9) obj2;
                        pi9Var.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                        float f7 = fW0;
                        float f8 = fIntBitsToFloat - (f7 * 2.0f);
                        if (f8 < 0.0f) {
                            f8 = 0.0f;
                        }
                        long jB = r4e.b(0, si30.b(f8), 0, 0, 13);
                        g9q0 g9q0Var = g9q0VarN;
                        String str3 = str2;
                        final a9q0 a9q0VarA = g9q0.a(g9q0Var, str3, y9q0Var, 2, 1, jB, null, 968);
                        long j = a9q0VarA.c;
                        final a9q0 a9q0VarA2 = g9q0.a(g9q0Var, str3, y9q0VarA2, 2, 1, r4e.b(0, si30.b(f8), 0, 0, 13), null, 968);
                        long j2 = a9q0VarA2.c;
                        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(rw2.z(f8, (int) (j >> 32), 2.0f, f7))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
                        final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(rw2.z(f8, (int) (j2 >> 32), 2.0f, f7))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f)) & 4294967295L);
                        final xcz xczVar2 = xczVar;
                        final float f9 = f3;
                        final float f10 = f2;
                        final ar90 ar90Var3 = ar90Var2;
                        final int i8 = i;
                        return pi9Var.b(new Function1() { // from class: a.wq90
                            /* JADX WARN: Failed to calculate best type for var: r2v0 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v0 ??, new type: a.a6a
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r2v0 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v0 ??, new type: a.a6a
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r7v3 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: long
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r7v4 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: long
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r7v5 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: long
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r7v6 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v6 ??, new type: long
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r8v10 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: long
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r8v9 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: long
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r8v9 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: long
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: long
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r28) {
                                /*
                                    Method dump skipped, instruction units count: 375
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: a.wq90.invoke(java.lang.Object):java.lang.Object");
                            }
                        });
                    }
                };
                ar90Var2 = ar90Var2;
                fetVar.o0(function1);
                objP3 = function1;
            } else {
                str2 = str;
                i3 = i5;
            }
            mm40 mm40VarE0 = o2e.e0(rq8.L(mm40VarQ, (Function1) objP3), "PICKER_ROW");
            boolean z3 = i6 == 256;
            if (i7 != 2048 && ((i3 & 4096) == 0 || !fetVar.i(ar90Var2))) {
                z = false;
            }
            boolean z4 = z3 | z;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == obj) {
                objP4 = new ka70(str2, ar90Var2, (byte) 17);
                fetVar.o0(objP4);
            }
            zq8.a(0, fetVar, pai0.a(mm40VarE0, false, (Function1) objP4));
            gy40Var2 = gy40Var3;
            r47 = jm40Var;
        } else {
            fetVar.X();
            gy40Var2 = gy40Var;
            r47 = mm40Var;
        }
        final ?? r0 = r47;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final String str3 = str2;
            yfe0VarU.d = new Function2() { // from class: a.vq90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    c9x.g(r0, f, str3, ar90Var2, xczVar, i, f2, gy40Var2, f3, function0, (fet) obj2, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void h(ff6 ff6Var, a7c0 a7c0Var, Function1 function1, fet fetVar, int i) {
        float f;
        fet fetVar2 = fetVar;
        ff6Var.getClass();
        a7c0Var.getClass();
        function1.getClass();
        fetVar2.g0(-897785732);
        int i2 = i | (fetVar2.g(ff6Var) ? 32 : 16) | (fetVar2.g(a7c0Var) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1169) != 1168)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            pz40 pz40VarF = androidx.compose.runtime.e.f(ff6Var.f9436a, fetVar2);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(ff6Var.b, fetVar2);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new wta0(function1, (byte) 22);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new wta0(function1, (byte) 23);
                fetVar2.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new wta0(function1, (byte) 25);
                fetVar2.o0(objP3);
            }
            jiq0.d(mm40VarL, pz40VarF, pz40VarF2, function0, function2, (Function0) objP3, fetVar2, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            azc0 azc0Var = a7c0Var.f361a;
            slc0 slc0Var = a7c0Var.c;
            wyc0 wyc0Var = a7c0Var.b;
            boolean z4 = i3 == 2048;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new rpa0(function1, (byte) 20);
                fetVar.o0(objP4);
            }
            Function1 function3 = (Function1) objP4;
            boolean z5 = i3 == 2048;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new wta0(function1, (byte) 26);
                fetVar.o0(objP5);
            }
            g7x.j(null, azc0Var, wyc0Var, function3, (Function0) objP5, null, null, fetVar, 0, 97);
            if (slc0Var.b) {
                fetVar.e0(-1172303454);
                wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
                f = 16.0f;
                yyw.r(0, fetVar, slc0Var.f32393a, s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2));
                fetVar.r(false);
            } else {
                f = 16.0f;
                fetVar.e0(-1172022842);
                fetVar.r(false);
            }
            wvb.o(null, 4.0f, 0L, fetVar, 0, 5);
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), f, 8.0f);
            wul wulVar = a7c0Var.e;
            boolean z6 = i3 == 2048;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var) {
                objP6 = new wta0(function1, (byte) 27);
                fetVar.o0(objP6);
            }
            qzb.n(mm40VarK, wulVar, phu0.G(0, 1, fetVar, (Function0) objP6), fetVar, 0, 0);
            fetVar2 = fetVar;
            wvb.o(null, 4.0f, 0L, fetVar2, 0, 5);
            d9x.b(0, 1, fetVar2, null, a7c0Var.d);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(ff6Var, a7c0Var, function1, i, (byte) 24);
        }
    }

    public static final void i(ugd ugdVar, fet fetVar, int i) {
        Object obj;
        fetVar.g0(-265606077);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            Object baseContext = (Context) fetVar.k(dy2.b);
            boolean zG = fetVar.g(baseContext);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP == obj2) {
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        obj = null;
                        break;
                    } else {
                        if (baseContext instanceof Activity) {
                            obj = (Activity) baseContext;
                            break;
                        }
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                objP = obj instanceof ze50 ? (ze50) obj : null;
                fetVar.o0(objP);
            }
            Object obj3 = (ze50) objP;
            ze50 ze50VarA = qr00.a(fetVar);
            if (obj3 == null) {
                fetVar.e0(-1844359169);
                boolean zG2 = fetVar.g(ze50VarA);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj2) {
                    if (ze50VarA != null) {
                        ye50 ye50VarB = ze50VarA.b();
                        ye50VarB.getClass();
                        objP2 = new ye50(ye50VarB, null);
                    } else {
                        objP2 = new ye50(null, null);
                    }
                    fetVar.o0(objP2);
                }
                ye50 ye50Var = (ye50) objP2;
                Boolean bool = Boolean.TRUE;
                boolean zI = fetVar.i(ye50Var) | fetVar.h(true);
                Object objP3 = fetVar.P();
                if (zI || objP3 == obj2) {
                    objP3 = new d7a0(ye50Var, yjeVar, (byte) 26);
                    fetVar.o0(objP3);
                }
                m0x0.t(fetVar, bool, (Function2) objP3);
                boolean zI2 = fetVar.i(ye50Var);
                Object objP4 = fetVar.P();
                if (zI2 || objP4 == obj2) {
                    objP4 = new eme0(ye50Var, (byte) 9);
                    fetVar.o0(objP4);
                }
                m0x0.o(ye50Var, (Function1) objP4, fetVar);
                boolean zG3 = fetVar.g(ye50Var);
                Object objP5 = fetVar.P();
                if (zG3 || objP5 == obj2) {
                    objP5 = new xjd(ye50Var);
                    fetVar.o0(objP5);
                }
                obj3 = (xjd) objP5;
            } else {
                fetVar.e0(-1844359696);
            }
            fetVar.r(false);
            obc.d(qr00.f29187a.a(obj3), ugdVar, fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w(ugdVar, i, (byte) 27);
        }
    }

    public static final void j(mm40 mm40Var, a4x a4xVar, xcz xczVar, fet fetVar, int i) {
        a4xVar.getClass();
        xczVar.getClass();
        fetVar.g0(1201913183);
        int i2 = i | 6 | (fetVar.i(a4xVar) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            obc.d(xf80.f40779a.a(null), u1c.M(1550807583, new j5d0(xczVar, a4xVar), fetVar), fetVar, 48);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, a4xVar, xczVar, i, (byte) 22);
        }
    }

    public static final void k(String str, long j, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1591991460);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 32.0f);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 144.0f, 1), j, new n05(qmk.o, g1t0.i().f42262a.b, qmk.n), 0L, null, g1t0.i().f42262a.c, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.i(), fetVar2, (i2 & 14) | ((i2 << 3) & 896), 24960, 109488);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w9m(str, j, i, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, boolean z, boolean z2, Function1 function1, gqh0 gqh0Var, fet fetVar, int i) {
        int i2;
        boolean z3;
        fet fetVar2;
        Object bt8Var;
        int i3;
        function1.getClass();
        gqh0Var.getClass();
        fetVar.g0(390861480);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= fetVar.h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(gqh0Var) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i4 = i2 & 7168;
            int i5 = i2 & 57344;
            boolean z4 = (i4 == 2048) | (i5 == 16384);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            byte b = 6;
            if (z4 || objP == cl5Var) {
                objP = new x6h0(function1, gqh0Var, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40Var, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = lqh0.f20488a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean z5 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | (i5 == 16384) | (i4 == 2048);
            Object objP3 = fetVar.P();
            if (z5 || objP3 == cl5Var) {
                i3 = i2;
                bt8Var = new bt8(z3, z2, (hqh0) gqh0Var, function1, (byte) 4);
                fetVar.o0(bt8Var);
            } else {
                i3 = i2;
                bt8Var = objP3;
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, mm40Var, (Function1) bt8Var, fetVar2, ((i3 << 3) & 112) | 6, 0);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ue(mm40Var, z, z2, function1, gqh0Var, i, (byte) 5);
        }
    }

    public static final void m(mm40 mm40Var, aum aumVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1585435002);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(aumVar) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 0.0f, 8.0f, 8.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            n(aumVar.j, aumVar.f1486a, fetVar, 0);
            f(aumVar.e, aumVar.b, aumVar.f, aumVar.g, aumVar.c, aumVar.d, aumVar.h, aumVar.i, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0(mm40Var, aumVar, i, b);
        }
    }

    public static final void n(stm stmVar, String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-590823364);
        int i2 = i | (fetVar2.g(stmVar) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            mm40 mm40VarE = o7k0.e(jm40.b, 22.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (stmVar instanceof ptm) {
                fetVar2.e0(-1373441828);
                fetVar2.r(false);
            } else if (stmVar instanceof qtm) {
                fetVar2.e0(373065140);
                qtm qtmVar = (qtm) stmVar;
                fgm fgmVar = fgm.b;
                boolean zE = fetVar2.e(2) | fetVar2.f(qtmVar.f29305a);
                Object objP = fetVar2.P();
                if (zE || objP == ukd.f35823a) {
                    objP = new c8n(nsm0.y(fgmVar), new w7n(new a8n(), ulb.b0(qtmVar), true, 0, false, null, 56));
                    fetVar2.o0(objP);
                }
                v7n.c(null, (c8n) objP, null, fetVar2, 5);
                fetVar2.r(false);
            } else {
                if (!(stmVar instanceof rtm)) {
                    throw b1j.f(-1373443521, fetVar2, false);
                }
                fetVar2.e0(373707677);
                j6n.h("VAR", oro0.f25744a, null, 0, 0, fetVar2, 54, 28);
                fetVar2.r(false);
            }
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(stmVar, str, i, (byte) 15);
        }
    }

    public static final String o(ehs ehsVar) {
        ehsVar.getClass();
        List list = ehsVar.e;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                tf90 tf90Var = ((df90) obj).b;
                sb.append(tf90Var.b + "-" + tf90Var.c);
                if (i != list.size() - 1) {
                    sb.append(", ");
                }
                i = i2;
            }
        }
        String string = sb.toString();
        int i3 = ehsVar.c;
        int i4 = gql0.f11739a;
        return i3 > 0 ? gql0.c(i3, string) : string;
    }

    public static final void p(cp cpVar, j3j0 j3j0Var) {
        yfu0 yfu0Var = cpVar.u;
        b3j0 b3j0Var = (b3j0) yfu0Var;
        boolean z = ((h3j0) cpVar.u()).b;
        b3j0 b3j0Var2 = (b3j0) yfu0Var;
        ((DsCellRightSwitch) b3j0Var2.c.e).setOnCheckedChangeListener(null);
        ((DsCellRightSwitch) b3j0Var2.c.e).setChecked(z);
        ((DsCellRightSwitch) b3j0Var2.c.e).setOnCheckedChangeListener(j3j0Var);
        ((DsSettingsCell) b3j0Var.c.d).setFirst(true);
        dc3 dc3Var = b3j0Var.c;
        ((DsSettingsCell) dc3Var.d).setLast(false);
        ((DsCellMiddleTitle) dc3Var.c).setTitle(R.string.set_default_bet_sum);
        ((DsSettingsCell) b3j0Var.b.e).setEnabled(z);
    }

    public static final void q(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((DsCellRightLabel) ((b3j0) yfu0Var).b.d).setText(((h3j0) cpVar.u()).f12387a);
        b3j0 b3j0Var = (b3j0) yfu0Var;
        ((DsCellMiddleTitle) b3j0Var.b.c).setTitle(R.string.default_bet_sum_editor_hint);
        ((DsSettingsCell) b3j0Var.b.e).setFirst(false);
        ((DsSettingsCell) b3j0Var.b.e).setLast(true);
    }

    public static final List r(List list, k4h k4hVar, m9s m9sVar) {
        if (k4hVar == null) {
            return iun.f15405a;
        }
        y3h y3hVar = k4hVar.c;
        p310 p310Var = k4hVar.f17669a;
        o310 o310Var = p310Var.f26277a;
        lc00 lc00VarB = kotlin.collections.a.b();
        ArrayList<n310> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            t9m0 t9m0Var = (t9m0) it.next();
            c0o c0oVar = n310.g;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            while (y2VarH.hasNext()) {
                Object next = y2VarH.next();
                if (((n310) next).f22827a == t9m0Var) {
                    obj = next;
                    break;
                }
            }
            n310 n310Var = (n310) obj;
            if (n310Var != null) {
                arrayList.add(n310Var);
            }
        }
        for (n310 n310Var2 : arrayList) {
            int iOrdinal = n310Var2.ordinal();
            t9m0 t9m0Var2 = n310Var2.f22827a;
            switch (iOrdinal) {
                case 0:
                    if (idx.J(o310Var)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 1:
                    if (idx.J(o310Var)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 2:
                    if (idx.I(o310Var)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 3:
                    if (idx.J(o310Var)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 4:
                    if (idx.I(o310Var)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 5:
                    if (idx.H(o310Var)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 6:
                    if (idx.F(o310Var)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 7:
                    if (idx.G(o310Var)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 8:
                    if (p310Var.b.isEmpty()) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 9:
                    if (idx.E(y3hVar)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 10:
                    if (rq8.R(k4hVar.d)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 11:
                    if (x2x.Y(y3hVar.d, y3hVar.h)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                case 12:
                    if (x2x.b0(k4hVar.e, m9sVar)) {
                        lc00VarB.add(Integer.valueOf(t9m0Var2.f33572a));
                    }
                    break;
                default:
                    t9f.b();
                    return null;
            }
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    public static final zlp0 s(e8h e8hVar, boolean z, List list, ctf0 ctf0Var) {
        ctf0Var.getClass();
        String str = e8hVar.f7371a + Separators.SP + z;
        String strL = tnq0.l(e8hVar, list);
        int i = 0;
        if (!kotlin.text.c.x(strL, ujn.h, false)) {
            if (strL.length() == 0) {
                strL = "";
            } else {
                List list2 = u0d.f34849a;
                if (u0d.c(strL)) {
                    strL = "";
                } else {
                    strL = String.format(Locale.ENGLISH, StringsKt.O(strL, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, strL}, 2));
                }
            }
        }
        xnp0 xnp0Var = new xnp0(strL, e8hVar.b, z, e8hVar.d);
        lsm0 lsm0Var = ctf0Var.b;
        List listJ = q3d.j(new w9b(lsm0Var.a(R.string.dota_kills, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var.a(R.string.dota_dead, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var.a(R.string.dota_assists, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var.a(R.string.dota_gpm, Arrays.copyOf(new Object[0], 0)), new d9b()), new w9b(lsm0Var.a(R.string.dota_epm, Arrays.copyOf(new Object[0], 0)), new d9b()));
        listJ.getClass();
        List list3 = e8hVar.e;
        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            f8h f8hVar = (f8h) next;
            f8hVar.getClass();
            long j = i;
            String str2 = f8hVar.b;
            vvv vvvVar = f8hVar.d;
            String str3 = vvvVar.c;
            String str4 = vvvVar.b;
            List listJ2 = q3d.j(new w9b(String.valueOf(f8hVar.g), new d9b()), new w9b(String.valueOf(f8hVar.h), new d9b()), new w9b(String.valueOf(f8hVar.i), new d9b()), new w9b(String.valueOf(f8hVar.e), new d9b()), new w9b(String.valueOf(f8hVar.f), new d9b()));
            listJ2.getClass();
            arrayList.add(new fba0(j, str2, str3, str4, listJ2));
            it = it;
            i = i2;
        }
        return new zlp0(str, xnp0Var, listJ, arrayList);
    }

    public static final MutableIntList t(hbz hbzVar, qbz qbzVar, hru hruVar) {
        int iMin;
        j4 j4Var = p8a.V(qbzVar.f28462a).c;
        xz40 xz40Var = (xz40) hruVar.f13549a;
        int i = 1;
        if (!(xz40Var.c != 0) && j4Var.isEmpty()) {
            return IntListKt.f45341a;
        }
        MutableIntList mutableIntList = new MutableIntList();
        if (((xz40) hruVar.f13549a).c != 0) {
            int i2 = xz40Var.c;
            if (i2 == 0) {
                v4i0.o("MutableVector is empty.");
                return null;
            }
            Object[] objArr = xz40Var.f41739a;
            int i3 = ((paz) objArr[0]).f26678a;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = ((paz) objArr[i4]).f26678a;
                if (i5 < i3) {
                    i3 = i5;
                }
            }
            if (i3 < 0) {
                adx.a("negative minIndex");
            }
            int i6 = xz40Var.c;
            if (i6 == 0) {
                v4i0.o("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = xz40Var.f41739a;
            int i7 = ((paz) objArr2[0]).b;
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = ((paz) objArr2[i8]).b;
                if (i9 > i7) {
                    i7 = i9;
                }
            }
            iMin = Math.min(i7, hbzVar.b() - 1);
            i = i3;
        } else {
            iMin = 0;
        }
        int size = j4Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            pbz pbzVar = (pbz) j4Var.get(i10);
            int iJ = k9x.J(pbzVar.c, hbzVar, pbzVar.f26733a);
            if ((i > iJ || iJ > iMin) && iJ >= 0 && iJ < hbzVar.b()) {
                mutableIntList.a(iJ);
            }
        }
        if (i <= iMin) {
            while (true) {
                mutableIntList.a(i);
                if (i == iMin) {
                    break;
                }
                i++;
            }
        }
        int i11 = mutableIntList.b;
        if (i11 == 0) {
            return mutableIntList;
        }
        int[] iArr = mutableIntList.f45342a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i11);
        return mutableIntList;
    }

    public static final jre0 u(yox yoxVar, qlc qlcVar, vd40 vd40Var) {
        qlcVar.getClass();
        vd40Var.getClass();
        String strS = kotlin.text.c.s(qlcVar.b.f32934a.f34663a, '.', '$');
        swq swqVar = qlcVar.f28927a;
        if (!swqVar.f32934a.c()) {
            strS = swqVar + '.' + strS;
        }
        g2v g2vVarG = yoxVar.g(strS);
        if (g2vVarG != null) {
            return (jre0) g2vVarG.f10580a;
        }
        return null;
    }

    public static long v(k0d k0dVar, long j, fet fetVar) {
        k0dVar.getClass();
        int iOrdinal = k0dVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            fetVar.e0(273073967);
            fetVar.r(false);
            return j;
        }
        if (iOrdinal == 2) {
            fetVar.e0(273076525);
            long coefHigher = ((IndividualColors) fetVar.k(j7x.f16059a)).getCoefHigher();
            fetVar.r(false);
            return coefHigher;
        }
        if (iOrdinal != 3) {
            throw b1j.f(273070907, fetVar, false);
        }
        fetVar.e0(273078988);
        long coefLower = ((IndividualColors) fetVar.k(j7x.f16059a)).getCoefLower();
        fetVar.r(false);
        return coefLower;
    }

    public static final String w(ygs ygsVar, ctf0 ctf0Var) {
        ygsVar.getClass();
        ctf0Var.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long j = ygsVar.z;
        return StringsKt.x0(ctf0Var.b.a(R.string.placeholder_variant_3, Arrays.copyOf(new Object[]{ygsVar.h, rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56)}, 2))).toString();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0195  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00ed, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v29, types: [android.text.SpannableStringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    public static String x(ygs ygsVar, ctf0 ctf0Var) {
        boolean z;
        String str;
        Object next;
        CharSequence charSequenceU0;
        ?? P;
        CharSequence charSequenceAppend;
        String str2;
        String string;
        ygsVar.getClass();
        ctf0Var.getClass();
        ehs ehsVar = ygsVar.i;
        boolean z2 = ygsVar.w;
        long j = ygsVar.z;
        String strU = ehsVar != null ? kotlin.text.c.u(ehsVar.d, "-", " : ", false) : null;
        if (strU == null) {
            strU = "";
        }
        if (ygsVar.g) {
            charSequenceU0 = new SpannableString(ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
        } else {
            ?? spannableStringBuilder = new SpannableStringBuilder("");
            String string2 = StringsKt.u0(ygsVar.h).toString();
            String string3 = (ehsVar == null || (str2 = ehsVar.f7822a) == null) ? null : StringsKt.u0(str2).toString();
            int length = string2.length();
            String str3 = Separators.SP;
            if (length > 0 && !kotlin.text.c.l(string3, string2)) {
                spannableStringBuilder.append(Separators.SP.concat(string2));
            }
            if (string3 != null && string3.length() != 0 && !z2) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append(Separators.COMMA);
                }
                spannableStringBuilder.append(Separators.SP.concat(string3));
            }
            if (ehsVar == null) {
                z = z2;
            } else {
                String str4 = ehsVar.B;
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append(Separators.COMMA);
                }
                if (str4 != null && str4.length() != 0) {
                    spannableStringBuilder.append(Separators.SP.concat(str4));
                }
                List list = ehsVar.o;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = z2;
                            next = null;
                            break;
                        }
                        next = it.next();
                        z = z2;
                        if (((cmr) next).f4620a == dmr.b) {
                            break;
                        }
                        z2 = z;
                    }
                    cmr cmrVar = (cmr) next;
                    str = cmrVar != null ? cmrVar.b : null;
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() > 0) {
                        spannableStringBuilder.append(" (" + str + Separators.RPAREN);
                    }
                } else {
                    z = z2;
                }
                if (str == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    spannableStringBuilder.append(" (" + str + Separators.RPAREN);
                }
            }
            if (!z) {
                String str5 = ehsVar != null ? ehsVar.i : null;
                if (str5 == null) {
                    str5 = "";
                }
                if (str5.length() > 0) {
                    if (!Intrinsics.d(ehsVar != null ? ehsVar.i : null, strU)) {
                        spannableStringBuilder.append(" (");
                        if (ehsVar != null) {
                            String strO = o(ehsVar);
                            P = strO;
                            if (cy7.c()) {
                                P = "\u200f" + ((Object) strO);
                            }
                        } else {
                            P = 0;
                        }
                        long j2 = ygsVar.d;
                        if (j2 == 4) {
                            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(P).append((CharSequence) Separators.COLON);
                            vas vasVar = ehsVar != null ? ehsVar.h : null;
                            String str6 = vasVar != null ? vasVar.f37106a : null;
                            if (str6 == null || str6.length() == 0) {
                                charSequenceAppend = "";
                            } else {
                                String str7 = vasVar != null ? vasVar.b : null;
                                if (str7 == null || str7.length() == 0) {
                                    charSequenceAppend = "";
                                } else {
                                    charSequenceAppend = new SpannableStringBuilder().append((CharSequence) new SpannableString(vasVar.f37106a)).append((CharSequence) "-").append((CharSequence) new SpannableString(vasVar.b));
                                    charSequenceAppend.getClass();
                                }
                            }
                            P = spannableStringBuilderAppend.append(charSequenceAppend);
                            P.getClass();
                        } else if (j2 == 40) {
                            P = P != 0 ? twn.p("\\*", P, "") : 0;
                            if (P == 0) {
                                P = "";
                            }
                        } else if (P == 0) {
                            P = "";
                        }
                        spannableStringBuilder.append(P);
                        spannableStringBuilder.append(Separators.RPAREN);
                    }
                }
            }
            if (ygsVar.c) {
                String strG = ehsVar != null ? ehsVar.j : null;
                if (strG == null) {
                    strG = "";
                }
                if (StringsKt.W(strG)) {
                    if (StringsKt.W(spannableStringBuilder)) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                    } else {
                        strG = "";
                    }
                }
                if (StringsKt.W(spannableStringBuilder)) {
                    str3 = "";
                } else if (ttm0.J(spannableStringBuilder) != ',') {
                    str3 = ", ";
                }
                if (strG != null && !StringsKt.W(strG)) {
                    spannableStringBuilder.append(str3.concat(strG));
                }
            } else if (j != 0) {
                rdj rdjVar2 = rdj.f30294a;
                spannableStringBuilder.append(Separators.SP + rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56));
            }
            charSequenceU0 = StringsKt.u0(spannableStringBuilder);
            if (charSequenceU0.length() > 0 && ttm0.J(charSequenceU0) == ',') {
                charSequenceU0 = new SpannableStringBuilder(charSequenceU0.subSequence(0, charSequenceU0.length() - 1));
            }
        }
        CharSequence charSequence = charSequenceU0.length() > 0 ? charSequenceU0 : null;
        return (charSequence == null || (string = charSequence.toString()) == null) ? "" : string;
    }

    public static final s480 y(long j, String str) {
        String value;
        str.getClass();
        if (j == 66) {
            value = kotlin.text.c.r(str, "-", Separators.COLON, false);
        } else {
            bh30 bh30VarB = new Regex("(\\d+\\s*[:-]\\s*\\d+)").b(str);
            if (bh30VarB == null || (value = bh30VarB.getValue()) == null) {
                value = Separators.COLON;
            }
        }
        List listSplit$default = StringsKt__StringsKt.split$default(value, new String[]{Separators.COLON}, false, 0, 6, null);
        String str2 = (String) CollectionsKt.W(0, listSplit$default);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = "0";
        }
        String string = StringsKt.u0(str2).toString();
        String str3 = (String) CollectionsKt.W(1, listSplit$default);
        String str4 = str3 != null ? str3 : "";
        return new s480(string, StringsKt.u0(str4.length() != 0 ? str4 : "0").toString());
    }

    public static final boolean z(suk0 suk0Var) {
        return ((suk0Var instanceof muk0) || (suk0Var instanceof ouk0)) ? false : true;
    }
}
