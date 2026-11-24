package a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.PhoneStateModel;

/* JADX INFO: loaded from: classes2.dex */
public final class j910 implements s080 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16115a;
    public Object b;
    public Object c;

    public j910(gii0 gii0Var, byte b) {
        this.f16115a = b;
        switch (b) {
            case 11:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new pl70(this, (byte) 13);
                break;
            case 12:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new pl70(this, (byte) 17);
                break;
            case 14:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new l3a0(this, (byte) 5);
                break;
            case 18:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new p7d0(this, (byte) 8);
                break;
            default:
                this.b = gii0Var;
                this.c = new rx00(this, (byte) 4);
                break;
        }
    }

    public static Map e(mbf0 mbf0Var, List list) {
        if (list.isEmpty()) {
            return mbf0Var.e;
        }
        Map map = mbf0Var.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Map map2 = (Map) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                if (!list.contains((u0f0) entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            linkedHashMap.put(key, linkedHashMap2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(boolean z, zje zjeVar) {
        mgb0 mgb0Var;
        k050 k050Var;
        if (zjeVar instanceof mgb0) {
            mgb0Var = (mgb0) zjeVar;
            int i = mgb0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                mgb0Var.m = i - Integer.MIN_VALUE;
            } else {
                mgb0Var = new mgb0(this, zjeVar);
            }
        } else {
            mgb0Var = new mgb0(this, zjeVar);
        }
        Object obj = mgb0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = mgb0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.c;
            mgb0Var.j = k050Var2;
            mgb0Var.i = z;
            mgb0Var.m = 1;
            if (k050Var2.d(mgb0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = mgb0Var.i;
            k050Var = mgb0Var.j;
            z1x.P(obj);
        }
        try {
            ((q7d0) this.b).d("POPULAR_PERSONALIZATION_STATUS", z);
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public j910 B(j910 j910Var) {
        if (!((on40) this.b).equals((on40) j910Var.b)) {
            jf4.o("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (j910Var.v()) {
            return this;
        }
        int[] iArr = (int[]) j910Var.c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            on40 on40Var = (on40) j910Var.b;
            if (i >= length) {
                return c(new j910(on40Var, iArr2));
            }
            int i2 = iArr[i];
            on40Var.getClass();
            iArr2[i] = (929 - i2) % 929;
            i++;
        }
    }

    public void C(u0f0 u0f0Var, String str) {
        str.getClass();
        ((pbf0) this.c).invoke(new zlb0(this, u0f0Var, str, (byte) 16));
    }

    public void D(ArrayList arrayList) {
        ((ArrayList) this.c).add(arrayList);
    }

    public void E(vr00 vr00Var) {
        ((ArrayList) this.b).addAll(vr00Var.b);
        ((ArrayList) this.c).addAll(vr00Var.c);
    }

    @Override // a.s080
    public List a(Integer num) {
        List listA = ((s080) this.b).a(null);
        t9k0 t9k0Var = (t9k0) this.c;
        int i = t9k0Var.v;
        return i < 0 ? listA : CollectionsKt.q0(aac.O(t9k0Var, num, i, Integer.valueOf(t9k0Var.F(t9k0Var.b, i))), listA);
    }

    @Override // a.s080
    public boolean b() {
        return ((s080) this.b).b();
    }

    public j910 c(j910 j910Var) {
        on40 on40Var = (on40) this.b;
        if (!on40Var.equals((on40) j910Var.b)) {
            jf4.o("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (v()) {
            return j910Var;
        }
        if (j910Var.v()) {
            return this;
        }
        int[] iArr = (int[]) this.c;
        int[] iArr2 = (int[]) j910Var.c;
        if (iArr.length <= iArr2.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = on40Var.a(iArr2[i - length], iArr[i]);
        }
        return new j910(on40Var, iArr3);
    }

    public Pair d(mbf0 mbf0Var, CountryStateModel countryStateModel, String str, String str2, Integer num, List list) {
        PhoneStateModel phoneStateModel;
        vzg0 vzg0Var = (vzg0) this.b;
        p1f0 p1f0Var = mbf0Var.g;
        if (p1f0Var.r != null) {
            str2.getClass();
            phoneStateModel = new PhoneStateModel("", "+" + str, str2, num);
        } else {
            phoneStateModel = new PhoneStateModel("", kng0.k("+", str), str2, num);
        }
        p1f0 p1f0VarA = p1f0.a(p1f0Var, null, false, null, null, false, false, countryStateModel, null, null, null, null, null, null, null, null, null, null, phoneStateModel, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -2228297, 127);
        Map mapE = e(mbf0Var, list);
        vzg0Var.e("COUNTRY", p1f0VarA.g);
        vzg0Var.e("PHONE", p1f0VarA.r);
        vzg0Var.e("REGION", null);
        vzg0Var.e("CITY", null);
        return new Pair(p1f0VarA, mapE);
    }

    public void f(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.b;
        g5d0 g5d0Var = new g5d0(byteArrayOutputStream, map, (HashMap) this.c);
        s960 s960Var = (s960) map.get(obj.getClass());
        if (s960Var != null) {
            s960Var.a(obj, g5d0Var);
            return;
        }
        throw new hwn("No encoder for " + obj.getClass());
    }

    public int g(int i) {
        on40 on40Var = (on40) this.b;
        int[] iArr = (int[]) this.c;
        if (i == 0) {
            return j(0);
        }
        if (i == 1) {
            int iA = 0;
            for (int i2 : iArr) {
                iA = on40Var.a(iA, i2);
            }
            return iA;
        }
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            iA2 = on40Var.a(on40Var.c(i, iA2), iArr[i3]);
        }
        return iA2;
    }

    public x45 h(mrd mrdVar) {
        String string;
        JSONArray jSONArray = mrdVar.g;
        long j = mrdVar.f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                mrd mrdVarC = ((krd) this.b).c();
                String string3 = null;
                if (mrdVarC == null) {
                    string = null;
                } else {
                    try {
                        string = mrdVarC.b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    mrd mrdVarC2 = ((krd) this.c).c();
                    if (mrdVarC2 != null) {
                        try {
                            string3 = mrdVarC2.b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i2 = hdg0.f12869a;
                u45 u45Var = new u45();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                u45Var.f35028a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                u45Var.b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                u45Var.c = strOptString;
                u45Var.d = string;
                u45Var.e = j;
                u45Var.f = (byte) (u45Var.f | 1);
                hashSet.add(u45Var.a());
            } catch (JSONException e) {
                throw new ygq("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return new x45(hashSet);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object i(zje zjeVar) {
        dmj0 dmj0Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof dmj0) {
            dmj0Var = (dmj0) zjeVar;
            int i = dmj0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmj0Var.k = i - Integer.MIN_VALUE;
            } else {
                dmj0Var = new dmj0(this, zjeVar);
            }
        } else {
            dmj0Var = new dmj0(this, zjeVar);
        }
        Object objA = dmj0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dmj0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            pmi0 pmi0Var = (pmi0) this.b;
            knf0Var.getClass();
            String strC = knf0Var.c();
            dmj0Var.k = 1;
            objA = ((flj0) ((rta0) pmi0Var.f27236a).invoke()).a(1, 1357, strC, dmj0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        nf3 nf3Var = (nf3) ((dx5) objA).a();
        String str = nf3Var.b;
        String str2 = nf3Var.c;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            jf4.k(null);
            return null;
        }
        String str3 = nf3Var.f23415a;
        if (str3 == null) {
            jf4.k(null);
            return null;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return new kf3(str3, str, str2);
    }

    public int j(int i) {
        int[] iArr = (int[]) this.c;
        return iArr[(iArr.length - 1) - i];
    }

    public int k() {
        return ((int[]) this.c).length - 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:95|24|100|25|26|27|98|28|(1:31)|86) */
    /* JADX WARN: Code duplicated, block: B:31:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:34:0x010c A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:32:0x0100, B:34:0x010c, B:35:0x011b, B:37:0x0121, B:40:0x0133, B:41:0x0135, B:43:0x013c, B:45:0x0143, B:46:0x0168, B:18:0x0093), top: B:97:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0121 A[Catch: all -> 0x0098, LOOP:0: B:35:0x011b->B:37:0x0121, LOOP_END, TryCatch #1 {all -> 0x0098, blocks: (B:32:0x0100, B:34:0x010c, B:35:0x011b, B:37:0x0121, B:40:0x0133, B:41:0x0135, B:43:0x013c, B:45:0x0143, B:46:0x0168, B:18:0x0093), top: B:97:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x012f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0133 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:32:0x0100, B:34:0x010c, B:35:0x011b, B:37:0x0121, B:40:0x0133, B:41:0x0135, B:43:0x013c, B:45:0x0143, B:46:0x0168, B:18:0x0093), top: B:97:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x013c A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:32:0x0100, B:34:0x010c, B:35:0x011b, B:37:0x0121, B:40:0x0133, B:41:0x0135, B:43:0x013c, B:45:0x0143, B:46:0x0168, B:18:0x0093), top: B:97:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0191  */
    /* JADX WARN: Code duplicated, block: B:62:0x019e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01de  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0214  */
    /* JADX WARN: Code duplicated, block: B:91:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x021d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0223  */
    /* JADX WARN: Code duplicated, block: B:95:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0170, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0171, code lost:
    
        r18 = r3;
        r22 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0175, code lost:
    
        r3 = r9;
        r9 = r0;
        r0 = r13;
        r13 = r3;
        r3 = r18;
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017f, code lost:
    
        r18 = r3;
        r3 = r9;
        r9 = r0;
        r0 = r13;
        r13 = r3;
        r3 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0204 -> B:88:0x0208). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(a.zje r27, java.lang.String r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j910.l(a.zje, java.lang.String, boolean):java.lang.Object");
    }

    public AutofillManager m() {
        AutofillManager autofillManager = (AutofillManager) this.c;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManagerJ = um30.j(((Context) this.b).getSystemService(um30.k()));
        if (autofillManagerJ != null) {
            this.c = autofillManagerJ;
            return autofillManagerJ;
        }
        jf4.n("Could not locate AutofillManager from context");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:90|24|86|25|26|27|88|28|(1:31)|77) */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f8 A[Catch: all -> 0x0085, TryCatch #3 {all -> 0x0085, blocks: (B:32:0x00ec, B:34:0x00f8, B:35:0x0107, B:37:0x010d, B:40:0x011f, B:18:0x0080), top: B:92:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x010d A[Catch: all -> 0x0085, LOOP:0: B:35:0x0107->B:37:0x010d, LOOP_END, TryCatch #3 {all -> 0x0085, blocks: (B:32:0x00ec, B:34:0x00f8, B:35:0x0107, B:37:0x010d, B:40:0x011f, B:18:0x0080), top: B:92:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x011b  */
    /* JADX WARN: Code duplicated, block: B:40:0x011f A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #3 {all -> 0x0085, blocks: (B:32:0x00ec, B:34:0x00f8, B:35:0x0107, B:37:0x010d, B:40:0x011f, B:18:0x0080), top: B:92:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x013f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0149  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:66:0x0174  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0122, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
    
        r19 = r3;
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        r3 = r19;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012e, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0130, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01aa, code lost:
    
        if (a.qcc.P(r11, r5) == r4) goto L77;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x013f -> B:54:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0172 -> B:54:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01aa -> B:80:0x01b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01af -> B:80:0x01b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01b9 -> B:78:0x01ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable n(java.lang.String r26, a.zje r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j910.n(java.lang.String, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable o(long j, long j2, zje zjeVar) {
        btl0 btl0Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof btl0) {
            btl0Var = (btl0) zjeVar;
            int i = btl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                btl0Var.k = i - Integer.MIN_VALUE;
            } else {
                btl0Var = new btl0(this, zjeVar);
            }
        } else {
            btl0Var = new btl0(this, zjeVar);
        }
        Object objA = btl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = btl0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            eyg0 eyg0Var = (eyg0) this.b;
            Map<String, String> mapF = xp20.f(new Pair("dateFrom", String.valueOf(j)), new Pair("dateTo", String.valueOf(j2)), new Pair("lng", knf0Var.c()), new Pair("ref", String.valueOf(1)), new Pair("gr", String.valueOf(1357)));
            btl0Var.k = 1;
            objA = ((jtl0) ((enj0) eyg0Var.b).invoke()).a(mapF, btl0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        dx5 dx5Var = (dx5) objA;
        dx5Var.getClass();
        Iterable<htl0> iterable = ((itl0) dx5Var.a()).b;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (htl0 htl0Var : iterable) {
            Long l = htl0Var.f13640a;
            String str = htl0Var.b;
            ifl0 ifl0Var = (l == null || str == null || str.length() == 0) ? null : new ifl0(str, 0, htl0Var.f13640a.longValue());
            if (ifl0Var != null) {
                arrayList.add(ifl0Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable p(int i, zje zjeVar, List list) {
        ctl0 ctl0Var;
        Object next;
        String str;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof ctl0) {
            ctl0Var = (ctl0) zjeVar;
            int i2 = ctl0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ctl0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                ctl0Var = new ctl0(this, zjeVar);
            }
        } else {
            ctl0Var = new ctl0(this, zjeVar);
        }
        Object objB = ctl0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = ctl0Var.l;
        if (i3 == 0) {
            z1x.P(objB);
            eyg0 eyg0Var = (eyg0) this.b;
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("fcountry", Integer.valueOf(iB));
            if (i != 0) {
                linkedHashMap.put("country", Integer.valueOf(i));
            }
            linkedHashMap.put("gr", 1357);
            linkedHashMap.put("lng", strC);
            linkedHashMap.put("ref", 1);
            linkedHashMap.put("whence", 22);
            TreeMap treeMap = new TreeMap(linkedHashMap);
            ctl0Var.i = list;
            ctl0Var.l = 1;
            objB = ((jtl0) ((enj0) eyg0Var.b).invoke()).b(treeMap, ctl0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = ctl0Var.i;
            z1x.P(objB);
        }
        dx5 dx5Var = (dx5) objB;
        dx5Var.getClass();
        list.getClass();
        Iterable<sgl0> iterable = (Iterable) dx5Var.a();
        ArrayList arrayList = new ArrayList();
        for (sgl0 sgl0Var : iterable) {
            Long l = sgl0Var.f32168a;
            long jLongValue = l != null ? l.longValue() : 0L;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ril0) next).f30549a != jLongValue);
            ril0 ril0Var = (ril0) next;
            if (ril0Var == null || (str = ril0Var.b) == null) {
                str = "-";
            }
            Integer num = sgl0Var.b;
            arrayList.add(new ifl0(str, num != null ? num.intValue() : 0, jLongValue));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(zje zjeVar) {
        nnf0 nnf0Var;
        if (zjeVar instanceof nnf0) {
            nnf0Var = (nnf0) zjeVar;
            int i = nnf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nnf0Var.k = i - Integer.MIN_VALUE;
            } else {
                nnf0Var = new nnf0(this, zjeVar);
            }
        } else {
            nnf0Var = new nnf0(this, zjeVar);
        }
        Object objW = nnf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nnf0Var.k;
        if (i2 == 0) {
            z1x.P(objW);
            f4u f4uVar = (f4u) this.b;
            nnf0Var.k = 1;
            objW = ((pzu) f4uVar.b).W(nnf0Var);
            if (objW == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW);
        }
        o7c0 o7c0Var = (o7c0) objW;
        ((trm0) this.c).k(o7c0Var.d);
        return o7c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(a.zje r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.r930
            if (r0 == 0) goto L13
            r0 = r8
            a.r930 r0 = (a.r930) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.r930 r0 = new a.r930
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            boolean r7 = r0.k
            a.z1x.P(r8)
            r11 = r7
            goto L72
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r5
        L34:
            boolean r11 = r0.k
            a.ali r7 = r0.j
            java.lang.String r9 = r0.i
            a.z1x.P(r8)
            goto L61
        L3e:
            a.z1x.P(r8)
            boolean r8 = kotlin.text.StringsKt.W(r10)
            if (r8 == 0) goto L75
            java.lang.Object r8 = r7.b
            a.ali r8 = (a.ali) r8
            java.lang.Object r7 = r7.c
            a.u8u r7 = (a.u8u) r7
            r0.i = r9
            r0.j = r8
            r0.k = r11
            r0.n = r4
            java.lang.Object r7 = r7.o(r0)
            if (r7 != r1) goto L5e
            goto L71
        L5e:
            r6 = r8
            r8 = r7
            r7 = r6
        L61:
            java.lang.String r8 = (java.lang.String) r8
            r0.i = r5
            r0.j = r5
            r0.k = r11
            r0.n = r3
            java.lang.Object r8 = r7.y(r9, r8, r0)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
        L75:
            java.lang.String r7 = ""
            r8 = 0
            java.lang.String r9 = "https://"
            java.lang.String r7 = kotlin.text.c.r(r10, r9, r7, r8)
            if (r11 == 0) goto L84
            java.lang.String r7 = r9.concat(r7)
        L84:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j910.r(a.zje, java.lang.String, java.lang.String, boolean):java.lang.Object");
    }

    public Object s(String str, xwn xwnVar, bnn0 bnn0Var) {
        if (xwnVar != null) {
            yje yjeVar = null;
            if (xwnVar instanceof vwn) {
                xex xexVar = (xex) this.b;
                Object objD0 = qjj.d0(((mne) xexVar.f40764a).b, new ke5(xexVar, str, ((vwn) xwnVar).f38160a, yjeVar, (byte) 3), bnn0Var);
                wne wneVar = wne.f39444a;
                if (objD0 != wneVar) {
                    objD0 = Unit.f46060a;
                }
                return objD0 == wneVar ? objD0 : Unit.f46060a;
            }
            if (xwnVar instanceof wwn) {
                xex xexVar2 = (xex) this.c;
                Object objD1 = qjj.d0(((mne) xexVar2.f40764a).b, new ke5(xexVar2, str, ((wwn) xwnVar).f39892a, yjeVar, (byte) 3), bnn0Var);
                wne wneVar2 = wne.f39444a;
                if (objD1 != wneVar2) {
                    objD1 = Unit.f46060a;
                }
                return objD1 == wneVar2 ? objD1 : Unit.f46060a;
            }
        }
        t9f.b();
        return null;
    }

    public void t() {
        ((ykt) ((pmi) this.b).c).c = null;
        j1q0 j1q0Var = (j1q0) this.c;
        j1q0Var.getClass();
        m1q0 m1q0Var = j1q0Var.f15748a;
        int iC = ua80.c(m1q0Var.f21021a, "FAKE_ID", 0);
        q7d0 q7d0Var = m1q0Var.f21021a;
        q7d0Var.getClass();
        String string = q7d0Var.a().getString("FAKE_NAME", "");
        if (string == null) {
            string = "";
        }
        String string2 = q7d0Var.a().getString("FAKE_CODE", "");
        j1q0Var.c(new cre(iC, string, string2 != null ? string2 : ""));
    }

    public String toString() {
        switch (this.f16115a) {
            case 5:
                StringBuilder sb = new StringBuilder(k() * 8);
                for (int iK = k(); iK >= 0; iK--) {
                    int iJ = j(iK);
                    if (iJ != 0) {
                        if (iJ < 0) {
                            sb.append(" - ");
                            iJ = -iJ;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (iK == 0 || iJ != 1) {
                            sb.append(iJ);
                        }
                        if (iK != 0) {
                            if (iK == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(iK);
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(zje zjeVar) {
        lgb0 lgb0Var;
        k050 k050Var;
        if (zjeVar instanceof lgb0) {
            lgb0Var = (lgb0) zjeVar;
            int i = lgb0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lgb0Var.l = i - Integer.MIN_VALUE;
            } else {
                lgb0Var = new lgb0(this, zjeVar);
            }
        } else {
            lgb0Var = new lgb0(this, zjeVar);
        }
        Object obj = lgb0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = lgb0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.c;
            lgb0Var.i = k050Var2;
            lgb0Var.l = 1;
            if (k050Var2.d(lgb0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = lgb0Var.i;
            z1x.P(obj);
        }
        try {
            q7d0 q7d0Var = (q7d0) this.b;
            q7d0Var.getClass();
            return Boolean.valueOf(q7d0Var.a().getBoolean("POPULAR_PERSONALIZATION_STATUS", false));
        } finally {
            k050Var.c(null);
        }
    }

    public boolean v() {
        return ((int[]) this.c)[0] == 0;
    }

    public void w(int i) {
        String str;
        if (i == 0) {
            str = "call";
        } else if (i != 1) {
            return;
        } else {
            str = "history";
        }
        i8i.D("option", str, ((yo4) this.b).f42966a, "call_back_tab");
        b1j.v(str, ((s64) this.c).f31684a, 10848L);
    }

    public j910 x(int i) {
        int[] iArr = (int[]) this.c;
        on40 on40Var = (on40) this.b;
        if (i == 0) {
            return on40Var.c;
        }
        if (i == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = on40Var.c(iArr[i2], i);
        }
        return new j910(on40Var, iArr2);
    }

    public j910 y(j910 j910Var) {
        on40 on40Var = (on40) this.b;
        if (!on40Var.equals((on40) j910Var.b)) {
            jf4.o("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (v() || j910Var.v()) {
            return on40Var.c;
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArr2 = (int[]) j910Var.c;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = on40Var.a(iArr3[i4], on40Var.c(i2, iArr2[i3]));
            }
        }
        return new j910(on40Var, iArr3);
    }

    public void z(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            m().notifyViewVisibilityChanged(view, i, z);
        }
    }

    public j910(ot10 ot10Var, us3 us3Var) {
        this.f16115a = (byte) 24;
        us3Var.getClass();
        this.b = ot10Var;
        this.c = us3Var;
    }

    public j910(dn0 dn0Var, j1q0 j1q0Var) {
        this.f16115a = (byte) 25;
        j1q0Var.getClass();
        this.b = dn0Var;
        this.c = j1q0Var;
    }

    public j910(pmi pmiVar, j1q0 j1q0Var) {
        this.f16115a = (byte) 16;
        j1q0Var.getClass();
        this.b = pmiVar;
        this.c = j1q0Var;
    }

    public j910(q7d0 q7d0Var) {
        this.f16115a = (byte) 15;
        q7d0Var.getClass();
        this.b = q7d0Var;
        this.c = new k050();
    }

    public j910(s1p s1pVar) {
        this.f16115a = (byte) 2;
        s1pVar.getClass();
        this.b = s1pVar;
        this.c = iun.f15405a;
    }

    public j910(knf0 knf0Var, pmi0 pmi0Var) {
        this.f16115a = (byte) 27;
        knf0Var.getClass();
        this.b = pmi0Var;
        this.c = knf0Var;
    }

    public /* synthetic */ j910(Object obj, Object obj2, byte b) {
        this.f16115a = b;
        this.b = obj;
        this.c = obj2;
    }

    public j910(g090 g090Var, knf0 knf0Var) {
        this.f16115a = (byte) 19;
        knf0Var.getClass();
        this.b = g090Var;
        this.c = knf0Var;
    }

    public j910(zpu zpuVar, knf0 knf0Var) {
        this.f16115a = (byte) 7;
        knf0Var.getClass();
        this.b = zpuVar;
        this.c = knf0Var;
    }

    public j910(q7d0 q7d0Var, zoq0 zoq0Var) {
        this.f16115a = (byte) 9;
        q7d0Var.getClass();
        zoq0Var.getClass();
        this.b = q7d0Var;
        this.c = zoq0Var;
    }

    public j910(eyg0 eyg0Var, knf0 knf0Var) {
        this.f16115a = (byte) 29;
        knf0Var.getClass();
        this.b = eyg0Var;
        this.c = knf0Var;
    }

    public j910(byte b) {
        this.f16115a = b;
        switch (b) {
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
        }
    }

    public j910(Object obj) {
        this.f16115a = (byte) 28;
        this.b = obj;
        this.c = Thread.currentThread();
    }

    public j910(on40 on40Var, int[] iArr) {
        this.f16115a = (byte) 5;
        if (iArr.length != 0) {
            this.b = on40Var;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.c = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.c = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.c = iArr;
            return;
        }
        e9d0.o();
        throw null;
    }

    public j910(Context context) {
        this.f16115a = (byte) 13;
        this.b = context;
    }

    public j910(rcf0 rcf0Var, int[] iArr) {
        this.f16115a = (byte) 6;
        this.b = b4x.o(rcf0Var);
        this.c = iArr;
    }
}
