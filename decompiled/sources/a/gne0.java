package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class gne0 implements zul0, u1j0, gmk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11582a;

    public /* synthetic */ gne0(byte b) {
        this.f11582a = b;
    }

    public static q7f0 c(int i) {
        q7f0 q7f0Var = (q7f0) q7f0.c.get(Integer.valueOf(i));
        return q7f0Var == null ? q7f0.FULL : q7f0Var;
    }

    public static nki0 d(int i) {
        nki0 nki0Var = nki0.HOUR_1;
        if (i == 1) {
            return nki0Var;
        }
        nki0 nki0Var2 = nki0.HOUR_2;
        if (i == 2) {
            return nki0Var2;
        }
        nki0 nki0Var3 = nki0.HOUR_3;
        if (i == 3) {
            return nki0Var3;
        }
        nki0 nki0Var4 = nki0.HOUR_4;
        if (i == 4) {
            return nki0Var4;
        }
        nki0 nki0Var5 = nki0.HOUR_5;
        if (i == 5) {
            return nki0Var5;
        }
        nki0 nki0Var6 = nki0.HOUR_6;
        if (i == 6) {
            return nki0Var6;
        }
        nki0 nki0Var7 = nki0.HOUR_7;
        if (i == 7) {
            return nki0Var7;
        }
        nki0 nki0Var8 = nki0.HOUR_8;
        if (i == 8) {
            return nki0Var8;
        }
        nki0 nki0Var9 = nki0.HOUR_9;
        if (i == 9) {
            return nki0Var9;
        }
        nki0 nki0Var10 = nki0.HOUR_10;
        if (i == 10) {
            return nki0Var10;
        }
        nki0 nki0Var11 = nki0.HOUR_11;
        if (i == 11) {
            return nki0Var11;
        }
        nki0 nki0Var12 = nki0.HOUR_12;
        if (i == 12) {
            return nki0Var12;
        }
        nki0 nki0Var13 = nki0.HOUR_13;
        if (i == 13) {
            return nki0Var13;
        }
        nki0 nki0Var14 = nki0.HOUR_14;
        if (i == 14) {
            return nki0Var14;
        }
        nki0 nki0Var15 = nki0.HOUR_15;
        if (i == 15) {
            return nki0Var15;
        }
        nki0 nki0Var16 = nki0.HOUR_16;
        if (i == 16) {
            return nki0Var16;
        }
        nki0 nki0Var17 = nki0.HOUR_17;
        if (i == 17) {
            return nki0Var17;
        }
        nki0 nki0Var18 = nki0.HOUR_18;
        if (i == 18) {
            return nki0Var18;
        }
        nki0 nki0Var19 = nki0.HOUR_19;
        if (i == 19) {
            return nki0Var19;
        }
        nki0 nki0Var20 = nki0.HOUR_20;
        if (i == 20) {
            return nki0Var20;
        }
        nki0 nki0Var21 = nki0.HOUR_21;
        if (i == 21) {
            return nki0Var21;
        }
        nki0 nki0Var22 = nki0.HOUR_22;
        if (i == 22) {
            return nki0Var22;
        }
        nki0 nki0Var23 = nki0.HOUR_23;
        if (i == 23) {
            return nki0Var23;
        }
        return i == -1 ? nki0.UNLIMITED : nki0.UNKNOWN;
    }

    public static int e(String str) {
        Object obj;
        Object next;
        List listSplit$default;
        List listO;
        Iterator it = StringsKt.Z(str).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.text.c.x((String) next, "m=audio ", false));
        String str2 = (String) next;
        if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{Separators.SP}, false, 0, 6, null)) == null || (listO = CollectionsKt.O(listSplit$default, 3)) == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listO.iterator();
        while (it2.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it2.next());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        for (Object obj2 : arrayList) {
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue == 0 || iIntValue == 3) {
                obj = obj2;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:3: B:50:0x00b9->B:68:?, LOOP_END, SYNTHETIC] */
    public static String g(String str) {
        Object next;
        String string;
        int iIntValue;
        Iterator it;
        Iterator it2 = StringsKt.Z(str).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!kotlin.text.c.x((String) next, "c=IN IP4 ", false));
        String str2 = (String) next;
        if (str2 == null || (string = StringsKt.u0(StringsKt.m0(str2, "c=IN IP4 ", str2)).toString()) == null || string.length() <= 0) {
            string = null;
        }
        if (string != null) {
            List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{Separators.DOT}, false, 0, 6, null);
            if (listSplit$default.size() == 4) {
                ArrayList arrayList = new ArrayList(r3d.q(listSplit$default, 10));
                Iterator it3 = listSplit$default.iterator();
                while (it3.hasNext()) {
                    Integer intOrNull = StringsKt.toIntOrNull((String) it3.next());
                    if (intOrNull != null) {
                        arrayList.add(intOrNull);
                    }
                }
                if (arrayList.isEmpty()) {
                    iIntValue = ((Number) arrayList.get(0)).intValue();
                    if (iIntValue != 0 && ((224 > iIntValue || iIntValue >= 240) && !arrayList.isEmpty())) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((Number) it.next()).intValue() == 255) {
                                return string;
                            }
                        }
                    }
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        int iIntValue2 = ((Number) it4.next()).intValue();
                        if (iIntValue2 < 0 || iIntValue2 >= 256) {
                        }
                    }
                    iIntValue = ((Number) arrayList.get(0)).intValue();
                    if (iIntValue != 0) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((Number) it.next()).intValue() == 255) {
                                return string;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean h(int i, boolean z) {
        int i2;
        if (!z || 29 > (i2 = Build.VERSION.SDK_INT) || i2 >= 33) {
            return false;
        }
        return i == 1 || i == 2 || i == 6;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[PHI: r10
  0x0021: PHI (r10v5 long) = (r10v2 long), (r10v6 long) binds: [B:18:0x0031, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x007a A[RETURN] */
    public static boolean i(int i, int i2, long j, boolean z, boolean z2, zen zenVar) {
        long j2;
        long j3;
        boolean zH = h(i, z2);
        if (zH) {
            Log.d("CXCP", "shouldRetry: Active resume mode is activated");
        }
        if (zH) {
            j2 = 1800000000000L;
            if (zenVar != null) {
                j3 = zenVar.f44260a;
                if (zen.a(1800000000000L, j3) != -1) {
                    j2 = j3;
                }
            }
        } else {
            j2 = 10000000000L;
            if (zenVar != null) {
                j3 = zenVar.f44260a;
                if (zen.a(10000000000L, j3) != -1) {
                    j2 = j3;
                }
            }
        }
        if (zen.a(j, j2) <= 0) {
            if (i == 0) {
                if (i2 <= 1) {
                    return true;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (!z || i2 <= 1) {
                            }
                        } else if (i != 4 && i != 5 && i != 6 && i != 7) {
                            if (i == 8) {
                                if (i2 <= 1) {
                                }
                            } else if (i != 10) {
                                if (i != 11) {
                                    Log.e("CXCP", "Unexpected CameraError: " + iag0.i);
                                    return false;
                                }
                                if (i2 <= 1) {
                                }
                            }
                        }
                    }
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 || i2 <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a.u1j0
    public lwi0 a(j6m0 j6m0Var, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        boolean z = false;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        x860 x860Var = jSONObject.has(ParameterNames.SESSION) ? new x860(jSONObject.getJSONObject(ParameterNames.SESSION).optInt("max_custom_exception_events", 8), z) : new x860(new JSONObject().optInt("max_custom_exception_events", 8), z);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        c34 c34Var = new c34(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new lwi0(jCurrentTimeMillis, x860Var, c34Var, dOptDouble, dOptDouble2, iOptInt2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // a.zul0
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public String toString() {
        switch (this.f11582a) {
            case 12:
                String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
                string.getClass();
                return b1j.k("CreationExtras.Key@", string, Separators.LESS_THAN, sre0.f32672a.b(riu0.class).J(), Separators.GREATER_THAN);
            case 24:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
