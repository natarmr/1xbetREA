package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoh;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class r6x0 extends u5x0 {
    public long e;
    public long f;

    public static final void B1(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void C1(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String D1(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable E1(yww0 yww0Var) {
        if (yww0Var.t()) {
            return yww0Var.u();
        }
        if (yww0Var.v()) {
            return Long.valueOf(yww0Var.w());
        }
        if (yww0Var.z()) {
            return Double.valueOf(yww0Var.A());
        }
        if (yww0Var.C() > 0) {
            return Z1(yww0Var.B());
        }
        return null;
    }

    public static final void F1(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(Separators.COMMA);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                C1(builder, str3, string, hashSet);
            }
        }
    }

    public static final void G1(StringBuilder sb, String str, txw0 txw0Var) {
        if (txw0Var == null) {
            return;
        }
        B1(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (txw0Var.u() != 0) {
            B1(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : txw0Var.t()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (txw0Var.s() != 0) {
            B1(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : txw0Var.r()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (txw0Var.w() != 0) {
            B1(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (pww0 pww0Var : txw0Var.v()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(pww0Var.r() ? Integer.valueOf(pww0Var.s()) : null);
                sb.append(Separators.COLON);
                sb.append(pww0Var.t() ? Long.valueOf(pww0Var.u()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (txw0Var.y() != 0) {
            B1(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (wxw0 wxw0Var : txw0Var.x()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(wxw0Var.r() ? Integer.valueOf(wxw0Var.s()) : null);
                sb.append(": [");
                Iterator it = wxw0Var.t().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        B1(3, sb);
        sb.append("}\n");
    }

    public static final void H1(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        B1(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void I1(StringBuilder sb, int i, String str, qsw0 qsw0Var) {
        String str2;
        if (qsw0Var == null) {
            return;
        }
        B1(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (qsw0Var.r()) {
            int iB = qsw0Var.B();
            if (iB == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iB == 2) {
                str2 = "LESS_THAN";
            } else if (iB != 3) {
                str2 = iB != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            H1(sb, i, "comparison_type", str2);
        }
        if (qsw0Var.s()) {
            H1(sb, i, "match_as_float", Boolean.valueOf(qsw0Var.t()));
        }
        if (qsw0Var.u()) {
            H1(sb, i, "comparison_value", qsw0Var.v());
        }
        if (qsw0Var.w()) {
            H1(sb, i, "min_comparison_value", qsw0Var.x());
        }
        if (qsw0Var.y()) {
            H1(sb, i, "max_comparison_value", qsw0Var.z());
        }
        B1(i, sb);
        sb.append("}\n");
    }

    public static boolean Q1(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean R1(wew0 wew0Var, int i) {
        if (i < ((dfw0) wew0Var).c * 64) {
            return ((1 << (i % 64)) & ((Long) ((dfw0) wew0Var).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList S1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static iew0 X1(iew0 iew0Var, byte[] bArr) throws zew0 {
        bew0 bew0VarA = bew0.a();
        if (bew0VarA != null) {
            iew0Var.getClass();
            iew0Var.g(bArr, bArr.length, bew0VarA);
            return iew0Var;
        }
        iew0Var.getClass();
        int length = bArr.length;
        int i = ldw0.f19874a;
        iew0Var.g(bArr, length, bew0.c);
        return iew0Var;
    }

    public static int Y1(jxw0 jxw0Var, String str) {
        for (int i = 0; i < ((mxw0) jxw0Var.b).Y1(); i++) {
            if (str.equals(((mxw0) jxw0Var.b).Z1(i).t())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] Z1(xew0 xew0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = xew0Var.iterator();
        while (it.hasNext()) {
            yww0 yww0Var = (yww0) it.next();
            if (yww0Var != null) {
                Bundle bundle = new Bundle();
                for (yww0 yww0Var2 : yww0Var.B()) {
                    if (yww0Var2.t()) {
                        bundle.putString(yww0Var2.s(), yww0Var2.u());
                    } else if (yww0Var2.v()) {
                        bundle.putLong(yww0Var2.s(), yww0Var2.w());
                    } else if (yww0Var2.z()) {
                        bundle.putDouble(yww0Var2.s(), yww0Var2.A());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap a2(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(a2((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(a2((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(a2((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static zzbh q1(nbw0 nbw0Var) {
        Object obj;
        Bundle bundleR1 = r1(nbw0Var.c, true);
        String string = (!bundleR1.containsKey("_o") || (obj = bundleR1.get("_o")) == null) ? Payload.TYPE_APP : obj.toString();
        String strX = o5n0.x(nbw0Var.f23263a, cwr0.j, cwr0.o);
        if (strX == null) {
            strX = nbw0Var.f23263a;
        }
        return new zzbh(strX, new zzbf(bundleR1), string, nbw0Var.b, 0L);
    }

    public static Bundle r1(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(r1((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void u1(qww0 qww0Var, String str, Long l) {
        List listH = qww0Var.h();
        int i = 0;
        while (true) {
            if (i >= listH.size()) {
                i = -1;
                break;
            } else if (str.equals(((yww0) listH.get(i)).s())) {
                break;
            } else {
                i++;
            }
        }
        www0 www0VarD = yww0.D();
        www0VarD.h(str);
        www0VarD.j(l.longValue());
        if (i < 0) {
            qww0Var.n(www0VarD);
        } else {
            qww0Var.c();
            ((sww0) qww0Var.b).I(i, (yww0) www0VarD.e());
        }
    }

    public static final Bundle v1(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yww0 yww0Var = (yww0) it.next();
            String strS = yww0Var.s();
            if (yww0Var.z()) {
                bundle.putDouble(strS, yww0Var.A());
            } else if (yww0Var.x()) {
                bundle.putFloat(strS, yww0Var.y());
            } else if (yww0Var.t()) {
                bundle.putString(strS, yww0Var.u());
            } else if (yww0Var.v()) {
                bundle.putLong(strS, yww0Var.w());
            }
        }
        return bundle;
    }

    public static final yww0 w1(sww0 sww0Var, String str) {
        for (yww0 yww0Var : sww0Var.t()) {
            if (yww0Var.s().equals(str)) {
                return yww0Var;
            }
        }
        return null;
    }

    public static final String x1(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Serializable y1(sww0 sww0Var, String str) {
        yww0 yww0VarW1 = w1(sww0Var, str);
        if (yww0VarW1 == null) {
            return null;
        }
        return E1(yww0VarW1);
    }

    public final void A1(StringBuilder sb, int i, lsw0 lsw0Var) {
        String str;
        if (lsw0Var == null) {
            return;
        }
        B1(i, sb);
        sb.append("filter {\n");
        if (lsw0Var.v()) {
            H1(sb, i, "complement", Boolean.valueOf(lsw0Var.w()));
        }
        if (lsw0Var.x()) {
            H1(sb, i, "param_name", ((kxw0) this.b).j.b(lsw0Var.y()));
        }
        if (lsw0Var.r()) {
            int i2 = i + 1;
            vsw0 vsw0VarS = lsw0Var.s();
            if (vsw0VarS != null) {
                B1(i2, sb);
                sb.append("string_filter {\n");
                if (vsw0VarS.r()) {
                    switch (vsw0VarS.z()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    H1(sb, i2, "match_type", str);
                }
                if (vsw0VarS.s()) {
                    H1(sb, i2, "expression", vsw0VarS.t());
                }
                if (vsw0VarS.u()) {
                    H1(sb, i2, "case_sensitive", Boolean.valueOf(vsw0VarS.v()));
                }
                if (vsw0VarS.x() > 0) {
                    B1(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : vsw0VarS.w()) {
                        B1(i + 3, sb);
                        sb.append(str2);
                        sb.append(Separators.RETURN);
                    }
                    sb.append("}\n");
                }
                B1(i2, sb);
                sb.append("}\n");
            }
        }
        if (lsw0Var.t()) {
            I1(sb, i + 1, "number_filter", lsw0Var.u());
        }
        B1(i, sb);
        sb.append("}\n");
    }

    public final void J1(dyw0 dyw0Var, Object obj) {
        dyw0Var.c();
        ((eyw0) dyw0Var.b).G();
        dyw0Var.c();
        ((eyw0) dyw0Var.b).I();
        dyw0Var.c();
        ((eyw0) dyw0Var.b).K();
        if (obj instanceof String) {
            dyw0Var.c();
            ((eyw0) dyw0Var.b).F((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            dyw0Var.c();
            ((eyw0) dyw0Var.b).H(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            dyw0Var.c();
            ((eyw0) dyw0Var.b).J(dDoubleValue);
        } else {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public final void K1(www0 www0Var, Object obj) {
        www0Var.c();
        ((yww0) www0Var.b).G();
        www0Var.c();
        ((yww0) www0Var.b).I();
        www0Var.c();
        ((yww0) www0Var.b).K();
        www0Var.c();
        ((yww0) www0Var.b).N();
        if (obj instanceof String) {
            www0Var.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            www0Var.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            www0Var.c();
            ((yww0) www0Var.b).J(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                www0 www0VarD = yww0.D();
                for (String str : bundle.keySet()) {
                    www0 www0VarD2 = yww0.D();
                    www0VarD2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        www0VarD2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        www0VarD2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        www0VarD2.c();
                        ((yww0) www0VarD2.b).J(dDoubleValue2);
                    }
                    www0VarD.c();
                    ((yww0) www0VarD.b).L((yww0) www0VarD2.e());
                }
                if (((yww0) www0VarD.b).C() > 0) {
                    arrayList.add((yww0) www0VarD.e());
                }
            }
        }
        www0Var.c();
        ((yww0) www0Var.b).M(arrayList);
    }

    public final zzoh L1(String str, jxw0 jxw0Var, qww0 qww0Var, String str2) {
        int iIndexOf;
        miw0.a();
        kxw0 kxw0Var = (kxw0) this.b;
        bkw0 bkw0Var = kxw0Var.d;
        if (!bkw0Var.x1(str, btw0.O0)) {
            return null;
        }
        kxw0Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(bkw0Var.t1(str, btw0.t0).split(Separators.COMMA)));
        m6x0 m6x0Var = this.c;
        x5x0 x5x0Var = m6x0Var.j;
        uww0 uww0Var = m6x0Var.f21293a;
        uww0 uww0Var2 = x5x0Var.c.f21293a;
        m6x0.T(uww0Var2);
        String strZ1 = uww0Var2.z1(str);
        Uri.Builder builder = new Uri.Builder();
        bkw0 bkw0Var2 = ((kxw0) x5x0Var.b).d;
        builder.scheme(bkw0Var2.t1(str, btw0.m0));
        if (TextUtils.isEmpty(strZ1)) {
            builder.authority(bkw0Var2.t1(str, btw0.n0));
        } else {
            String strT1 = bkw0Var2.t1(str, btw0.n0);
            StringBuilder sb = new StringBuilder(String.valueOf(strZ1).length() + 1 + String.valueOf(strT1).length());
            sb.append(strZ1);
            sb.append(Separators.DOT);
            sb.append(strT1);
            builder.authority(sb.toString());
        }
        builder.path(bkw0Var2.t1(str, btw0.o0));
        C1(builder, "gmp_app_id", ((mxw0) jxw0Var.b).G(), hashSet);
        bkw0Var.s1();
        C1(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strA = ((mxw0) jxw0Var.b).A();
        atw0 atw0Var = btw0.R0;
        if (bkw0Var.x1(str, atw0Var)) {
            m6x0.T(uww0Var);
            if (uww0Var.G1(str)) {
                strA = "";
            }
        }
        C1(builder, "app_instance_id", strA, hashSet);
        C1(builder, "rdid", ((mxw0) jxw0Var.b).x(), hashSet);
        C1(builder, "bundle_id", jxw0Var.r(), hashSet);
        String strP = qww0Var.p();
        String strX = o5n0.x(strP, cwr0.o, cwr0.j);
        if (true != TextUtils.isEmpty(strX)) {
            strP = strX;
        }
        C1(builder, "app_event_name", strP, hashSet);
        C1(builder, "app_version", String.valueOf(((mxw0) jxw0Var.b).M()), hashSet);
        String strL2 = ((mxw0) jxw0Var.b).l2();
        if (bkw0Var.x1(str, atw0Var)) {
            m6x0.T(uww0Var);
            if (uww0Var.F1(str) && !TextUtils.isEmpty(strL2) && (iIndexOf = strL2.indexOf(Separators.DOT)) != -1) {
                strL2 = strL2.substring(0, iIndexOf);
            }
        }
        C1(builder, "os_version", strL2, hashSet);
        C1(builder, "timestamp", String.valueOf(qww0Var.s()), hashSet);
        if (((mxw0) jxw0Var.b).z()) {
            C1(builder, "lat", "1", hashSet);
        }
        C1(builder, "privacy_sandbox_version", String.valueOf(((mxw0) jxw0Var.b).I0()), hashSet);
        C1(builder, "trigger_uri_source", "1", hashSet);
        C1(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        C1(builder, "request_uuid", str2, hashSet);
        List<yww0> listH = qww0Var.h();
        Bundle bundle = new Bundle();
        for (yww0 yww0Var : listH) {
            String strS = yww0Var.s();
            if (yww0Var.z()) {
                bundle.putString(strS, String.valueOf(yww0Var.A()));
            } else if (yww0Var.x()) {
                bundle.putString(strS, String.valueOf(yww0Var.y()));
            } else if (yww0Var.t()) {
                bundle.putString(strS, yww0Var.u());
            } else if (yww0Var.v()) {
                bundle.putString(strS, String.valueOf(yww0Var.w()));
            }
        }
        F1(builder, bkw0Var.t1(str, btw0.s0).split("\\|"), bundle, hashSet);
        List<eyw0> listUnmodifiableList = Collections.unmodifiableList(((mxw0) jxw0Var.b).X1());
        Bundle bundle2 = new Bundle();
        for (eyw0 eyw0Var : listUnmodifiableList) {
            String strT = eyw0Var.t();
            if (eyw0Var.A()) {
                bundle2.putString(strT, String.valueOf(eyw0Var.B()));
            } else if (eyw0Var.y()) {
                bundle2.putString(strT, String.valueOf(eyw0Var.z()));
            } else if (eyw0Var.u()) {
                bundle2.putString(strT, eyw0Var.v());
            } else if (eyw0Var.w()) {
                bundle2.putString(strT, String.valueOf(eyw0Var.x()));
            }
        }
        F1(builder, bkw0Var.t1(str, btw0.r0).split("\\|"), bundle2, hashSet);
        C1(builder, "dma", true != ((mxw0) jxw0Var.b).F0() ? "0" : "1", hashSet);
        if (!((mxw0) jxw0Var.b).H0().isEmpty()) {
            C1(builder, "dma_cps", ((mxw0) jxw0Var.b).H0(), hashSet);
        }
        if (((mxw0) jxw0Var.b).N0()) {
            ivw0 ivw0VarO0 = ((mxw0) jxw0Var.b).O0();
            if (!ivw0VarO0.F().isEmpty()) {
                C1(builder, "dl_gclid", ivw0VarO0.F(), hashSet);
            }
            if (!ivw0VarO0.H().isEmpty()) {
                C1(builder, "dl_gbraid", ivw0VarO0.H(), hashSet);
            }
            if (!ivw0VarO0.J().isEmpty()) {
                C1(builder, "dl_gs", ivw0VarO0.J(), hashSet);
            }
            if (ivw0VarO0.L() > 0) {
                C1(builder, "dl_ss_ts", String.valueOf(ivw0VarO0.L()), hashSet);
            }
            if (!ivw0VarO0.N().isEmpty()) {
                C1(builder, "mr_gclid", ivw0VarO0.N(), hashSet);
            }
            if (!ivw0VarO0.P().isEmpty()) {
                C1(builder, "mr_gbraid", ivw0VarO0.P(), hashSet);
            }
            if (!ivw0VarO0.R().isEmpty()) {
                C1(builder, "mr_gs", ivw0VarO0.R(), hashSet);
            }
            if (ivw0VarO0.T() > 0) {
                C1(builder, "mr_click_ts", String.valueOf(ivw0VarO0.T()), hashSet);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public final sww0 M1(lmw0 lmw0Var) {
        qww0 qww0VarH = sww0.H();
        long j = lmw0Var.f;
        qww0VarH.c();
        ((sww0) qww0VarH.b).P(j);
        long j2 = lmw0Var.e;
        qww0VarH.c();
        ((sww0) qww0VarH.b).r(j2);
        Bundle bundle = lmw0Var.g.f45543a;
        for (String str : bundle.keySet()) {
            www0 www0VarD = yww0.D();
            www0VarD.h(str);
            Object obj = bundle.get(str);
            s0x.H(obj);
            K1(www0VarD, obj);
            qww0VarH.n(www0VarD);
        }
        String str2 = lmw0Var.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            www0 www0VarD2 = yww0.D();
            www0VarD2.h("_o");
            www0VarD2.i(str2);
            qww0VarH.m((yww0) www0VarD2.e());
        }
        return (sww0) qww0VarH.e();
    }

    public final String N1(ixw0 ixw0Var) {
        String str;
        String str2;
        String str3;
        qvw0 qvw0VarK0;
        StringBuilder sbR = brm0.r("\nbatch {\n");
        if (ixw0Var.w()) {
            H1(sbR, 0, "upload_subdomain", ixw0Var.x());
        }
        if (ixw0Var.u()) {
            H1(sbR, 0, "sgtm_join_id", ixw0Var.v());
        }
        for (mxw0 mxw0Var : ixw0Var.r()) {
            if (mxw0Var != null) {
                B1(1, sbR);
                sbR.append("bundle {\n");
                if (mxw0Var.R()) {
                    H1(sbR, 1, "protocol_version", Integer.valueOf(mxw0Var.R0()));
                }
                kxw0 kxw0Var = (kxw0) this.b;
                bkw0 bkw0Var = kxw0Var.d;
                iuw0 iuw0Var = kxw0Var.j;
                if (bkw0Var.x1(mxw0Var.r(), btw0.M0) && mxw0Var.x0()) {
                    H1(sbR, 1, "session_stitching_token", mxw0Var.y0());
                }
                H1(sbR, 1, "platform", mxw0Var.k2());
                if (mxw0Var.t()) {
                    H1(sbR, 1, "gmp_version", Long.valueOf(mxw0Var.u()));
                }
                if (mxw0Var.v()) {
                    H1(sbR, 1, "uploading_gmp_version", Long.valueOf(mxw0Var.w()));
                }
                if (mxw0Var.t0()) {
                    H1(sbR, 1, "dynamite_version", Long.valueOf(mxw0Var.u0()));
                }
                if (mxw0Var.N()) {
                    H1(sbR, 1, "config_version", Long.valueOf(mxw0Var.O()));
                }
                H1(sbR, 1, "gmp_app_id", mxw0Var.G());
                H1(sbR, 1, HiAnalyticsConstant.BI_KEY_APP_ID, mxw0Var.r());
                H1(sbR, 1, "app_version", mxw0Var.s());
                if (mxw0Var.L()) {
                    H1(sbR, 1, "app_version_major", Integer.valueOf(mxw0Var.M()));
                }
                H1(sbR, 1, "firebase_instance_id", mxw0Var.K());
                if (mxw0Var.B()) {
                    H1(sbR, 1, "dev_cert_hash", Long.valueOf(mxw0Var.C()));
                }
                H1(sbR, 1, "app_store", mxw0Var.q2());
                if (mxw0Var.a2()) {
                    H1(sbR, 1, "upload_timestamp_millis", Long.valueOf(mxw0Var.b2()));
                }
                if (mxw0Var.c2()) {
                    H1(sbR, 1, "start_timestamp_millis", Long.valueOf(mxw0Var.d2()));
                }
                if (mxw0Var.e2()) {
                    H1(sbR, 1, "end_timestamp_millis", Long.valueOf(mxw0Var.f2()));
                }
                if (mxw0Var.g2()) {
                    H1(sbR, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(mxw0Var.h2()));
                }
                if (mxw0Var.i2()) {
                    H1(sbR, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(mxw0Var.j2()));
                }
                H1(sbR, 1, "app_instance_id", mxw0Var.A());
                H1(sbR, 1, "resettable_device_id", mxw0Var.x());
                H1(sbR, 1, "ds_id", mxw0Var.Q());
                if (mxw0Var.y()) {
                    H1(sbR, 1, "limited_ad_tracking", Boolean.valueOf(mxw0Var.z()));
                }
                H1(sbR, 1, "os_version", mxw0Var.l2());
                H1(sbR, 1, Payload.DEVICE_MODEL, mxw0Var.m2());
                H1(sbR, 1, "user_default_language", mxw0Var.n2());
                if (mxw0Var.o2()) {
                    H1(sbR, 1, "time_zone_offset_minutes", Integer.valueOf(mxw0Var.p2()));
                }
                if (mxw0Var.D()) {
                    H1(sbR, 1, "bundle_sequential_index", Integer.valueOf(mxw0Var.E()));
                }
                if (mxw0Var.L0()) {
                    H1(sbR, 1, "delivery_index", Integer.valueOf(mxw0Var.M0()));
                }
                if (mxw0Var.H()) {
                    H1(sbR, 1, "service_upload", Boolean.valueOf(mxw0Var.I()));
                }
                H1(sbR, 1, "health_monitor", mxw0Var.F());
                if (mxw0Var.r0()) {
                    H1(sbR, 1, "retry_counter", Integer.valueOf(mxw0Var.s0()));
                }
                if (mxw0Var.v0()) {
                    H1(sbR, 1, "consent_signals", mxw0Var.w0());
                }
                if (mxw0Var.E0()) {
                    H1(sbR, 1, "is_dma_region", Boolean.valueOf(mxw0Var.F0()));
                }
                if (mxw0Var.G0()) {
                    H1(sbR, 1, "core_platform_services", mxw0Var.H0());
                }
                if (mxw0Var.C0()) {
                    H1(sbR, 1, "consent_diagnostics", mxw0Var.D0());
                }
                if (mxw0Var.z0()) {
                    H1(sbR, 1, "target_os_version", Long.valueOf(mxw0Var.A0()));
                }
                miw0.a();
                if (bkw0Var.x1(mxw0Var.r(), btw0.O0)) {
                    H1(sbR, 1, "ad_services_version", Integer.valueOf(mxw0Var.I0()));
                    if (mxw0Var.J0() && (qvw0VarK0 = mxw0Var.K0()) != null) {
                        B1(2, sbR);
                        sbR.append("attribution_eligibility_status {\n");
                        H1(sbR, 2, "eligible", Boolean.valueOf(qvw0VarK0.r()));
                        H1(sbR, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(qvw0VarK0.s()));
                        H1(sbR, 2, "pre_r", Boolean.valueOf(qvw0VarK0.t()));
                        H1(sbR, 2, "r_extensions_too_old", Boolean.valueOf(qvw0VarK0.u()));
                        H1(sbR, 2, "adservices_extension_too_old", Boolean.valueOf(qvw0VarK0.v()));
                        H1(sbR, 2, "ad_storage_not_allowed", Boolean.valueOf(qvw0VarK0.w()));
                        H1(sbR, 2, "measurement_manager_disabled", Boolean.valueOf(qvw0VarK0.x()));
                        B1(2, sbR);
                        sbR.append("}\n");
                    }
                }
                if (mxw0Var.N0()) {
                    ivw0 ivw0VarO0 = mxw0Var.O0();
                    B1(2, sbR);
                    sbR.append("ad_campaign_info {\n");
                    if (ivw0VarO0.E()) {
                        H1(sbR, 2, "deep_link_gclid", ivw0VarO0.F());
                    }
                    if (ivw0VarO0.G()) {
                        H1(sbR, 2, "deep_link_gbraid", ivw0VarO0.H());
                    }
                    if (ivw0VarO0.I()) {
                        H1(sbR, 2, "deep_link_gad_source", ivw0VarO0.J());
                    }
                    if (ivw0VarO0.U()) {
                        H1(sbR, 2, "deep_link_url", ivw0VarO0.V());
                    }
                    if (ivw0VarO0.K()) {
                        H1(sbR, 2, "deep_link_session_millis", Long.valueOf(ivw0VarO0.L()));
                    }
                    if (ivw0VarO0.M()) {
                        H1(sbR, 2, "market_referrer_gclid", ivw0VarO0.N());
                    }
                    if (ivw0VarO0.O()) {
                        H1(sbR, 2, "market_referrer_gbraid", ivw0VarO0.P());
                    }
                    if (ivw0VarO0.Q()) {
                        H1(sbR, 2, "market_referrer_gad_source", ivw0VarO0.R());
                    }
                    if (ivw0VarO0.S()) {
                        H1(sbR, 2, "market_referrer_click_millis", Long.valueOf(ivw0VarO0.T()));
                    }
                    B1(2, sbR);
                    sbR.append("}\n");
                }
                if (mxw0Var.S()) {
                    H1(sbR, 1, "batching_timestamp_millis", Long.valueOf(mxw0Var.T()));
                }
                if (mxw0Var.P0()) {
                    byw0 byw0VarQ0 = mxw0Var.Q0();
                    B1(2, sbR);
                    sbR.append("sgtm_diagnostics {\n");
                    int iV = byw0VarQ0.v();
                    if (iV == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iV == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iV != 3) {
                        str2 = iV != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    H1(sbR, 2, "upload_type", str2);
                    H1(sbR, 2, "client_upload_eligibility", esw0.m(byw0VarQ0.r()));
                    int iW = byw0VarQ0.w();
                    if (iW == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iW == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iW == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iW != 4) {
                        str3 = iW != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    H1(sbR, 2, "service_upload_eligibility", str3);
                    B1(2, sbR);
                    sbR.append("}\n");
                }
                if (mxw0Var.U()) {
                    jww0 jww0VarV = mxw0Var.V();
                    B1(2, sbR);
                    sbR.append("consent_info_extra {\n");
                    for (eww0 eww0Var : jww0VarV.r()) {
                        B1(3, sbR);
                        sbR.append("limited_data_modes {\n");
                        int iS = eww0Var.s();
                        if (iS == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iS == 2) {
                            str = "AD_STORAGE";
                        } else if (iS != 3) {
                            str = iS != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        H1(sbR, 3, Payload.TYPE, str);
                        int iT = eww0Var.t();
                        H1(sbR, 3, "mode", iT != 1 ? iT != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        B1(3, sbR);
                        sbR.append("}\n");
                    }
                    B1(2, sbR);
                    sbR.append("}\n");
                }
                xew0<eyw0> xew0VarX1 = mxw0Var.X1();
                if (xew0VarX1 != null) {
                    for (eyw0 eyw0Var : xew0VarX1) {
                        if (eyw0Var != null) {
                            B1(2, sbR);
                            sbR.append("user_property {\n");
                            H1(sbR, 2, "set_timestamp_millis", eyw0Var.r() ? Long.valueOf(eyw0Var.s()) : null);
                            H1(sbR, 2, "name", iuw0Var.c(eyw0Var.t()));
                            H1(sbR, 2, "string_value", eyw0Var.v());
                            H1(sbR, 2, "int_value", eyw0Var.w() ? Long.valueOf(eyw0Var.x()) : null);
                            H1(sbR, 2, "double_value", eyw0Var.A() ? Double.valueOf(eyw0Var.B()) : null);
                            B1(2, sbR);
                            sbR.append("}\n");
                        }
                    }
                }
                xew0<tvw0> xew0VarJ = mxw0Var.J();
                if (xew0VarJ != null) {
                    for (tvw0 tvw0Var : xew0VarJ) {
                        if (tvw0Var != null) {
                            B1(2, sbR);
                            sbR.append("audience_membership {\n");
                            if (tvw0Var.r()) {
                                H1(sbR, 2, "audience_id", Integer.valueOf(tvw0Var.s()));
                            }
                            if (tvw0Var.w()) {
                                H1(sbR, 2, "new_audience", Boolean.valueOf(tvw0Var.x()));
                            }
                            G1(sbR, "current_data", tvw0Var.t());
                            if (tvw0Var.u()) {
                                G1(sbR, "previous_data", tvw0Var.v());
                            }
                            B1(2, sbR);
                            sbR.append("}\n");
                        }
                    }
                }
                List<sww0> listR1 = mxw0Var.R1();
                if (listR1 != null) {
                    for (sww0 sww0Var : listR1) {
                        if (sww0Var != null) {
                            B1(2, sbR);
                            sbR.append("event {\n");
                            H1(sbR, 2, "name", iuw0Var.a(sww0Var.w()));
                            if (sww0Var.x()) {
                                H1(sbR, 2, "timestamp_millis", Long.valueOf(sww0Var.y()));
                            }
                            if (bkw0Var.x1(null, btw0.e1) && sww0Var.D()) {
                                H1(sbR, 2, "corrected_timestamp_millis", Long.valueOf(sww0Var.E()));
                            }
                            if (sww0Var.z()) {
                                H1(sbR, 2, "previous_timestamp_millis", Long.valueOf(sww0Var.A()));
                            }
                            if (sww0Var.B()) {
                                H1(sbR, 2, "count", Integer.valueOf(sww0Var.C()));
                            }
                            if (sww0Var.u() != 0) {
                                z1(sbR, 2, (xew0) sww0Var.t());
                            }
                            B1(2, sbR);
                            sbR.append("}\n");
                        }
                    }
                }
                B1(1, sbR);
                sbR.append("}\n");
            }
        }
        sbR.append("} // End-of-batch\n");
        return sbR.toString();
    }

    public final String O1(ssw0 ssw0Var) {
        StringBuilder sbR = brm0.r("\nproperty_filter {\n");
        if (ssw0Var.r()) {
            H1(sbR, 0, "filter_id", Integer.valueOf(ssw0Var.s()));
        }
        H1(sbR, 0, "property_name", ((kxw0) this.b).j.c(ssw0Var.t()));
        String strD1 = D1(ssw0Var.v(), ssw0Var.w(), ssw0Var.y());
        if (!strD1.isEmpty()) {
            H1(sbR, 0, "filter_type", strD1);
        }
        A1(sbR, 1, ssw0Var.u());
        sbR.append("}\n");
        return sbR.toString();
    }

    public final Parcelable P1(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (ctg0 unused) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List T1(wew0 wew0Var, List list) {
        int i;
        kxw0 kxw0Var = (kxw0) this.b;
        ArrayList arrayList = new ArrayList(wew0Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.j.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.j.c(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean U1(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((kxw0) this.b).k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public final long V1(byte[] bArr) {
        s0x.H(bArr);
        kxw0 kxw0Var = (kxw0) this.b;
        x6x0 x6x0Var = kxw0Var.i;
        kxw0.e(x6x0Var);
        x6x0Var.m1();
        MessageDigest messageDigestF1 = x6x0.F1();
        if (messageDigestF1 != null) {
            return x6x0.G1(messageDigestF1.digest(bArr));
        }
        uuw0 uuw0Var = kxw0Var.f;
        kxw0.g(uuw0Var);
        uuw0Var.g.a("Failed to get MD5");
        return 0L;
    }

    public final byte[] W1(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            uuw0 uuw0Var = ((kxw0) this.b).f;
            kxw0.g(uuw0Var);
            uuw0Var.g.b(e, "Failed to gzip content");
            throw e;
        }
    }

    public final void s1(Map map) {
        long epochMilli;
        kxw0 kxw0Var = (kxw0) this.b;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            String strX1 = x1("Date", map);
            if (TextUtils.isEmpty(strX1)) {
                return;
            }
            if (i >= 26) {
                try {
                    epochMilli = ZonedDateTime.parse(strX1, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
                } catch (DateTimeParseException unused) {
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.j.b(strX1, "Unable to parse header time, time");
                    epochMilli = 0;
                }
            } else {
                epochMilli = 0;
            }
            if (epochMilli > 0) {
                kxw0Var.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                m1();
                if (this.f == 0) {
                    this.e = jElapsedRealtime;
                    this.f = epochMilli;
                }
            }
        }
    }

    public final long t1(long j) {
        m1();
        long j2 = this.f;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.e) + j;
    }

    public final void z1(StringBuilder sb, int i, xew0 xew0Var) {
        if (xew0Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = xew0Var.iterator();
        while (it.hasNext()) {
            yww0 yww0Var = (yww0) it.next();
            if (yww0Var != null) {
                B1(i2, sb);
                sb.append("param {\n");
                H1(sb, i2, "name", yww0Var.r() ? ((kxw0) this.b).j.b(yww0Var.s()) : null);
                H1(sb, i2, "string_value", yww0Var.t() ? yww0Var.u() : null);
                H1(sb, i2, "int_value", yww0Var.v() ? Long.valueOf(yww0Var.w()) : null);
                H1(sb, i2, "double_value", yww0Var.z() ? Double.valueOf(yww0Var.A()) : null);
                if (yww0Var.C() > 0) {
                    z1(sb, i2, yww0Var.B());
                }
                B1(i2, sb);
                sb.append("}\n");
            }
        }
    }

    @Override // a.u5x0
    public final void p1() {
    }
}
