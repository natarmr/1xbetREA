package a;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.widget.ImageView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.YandexAuthToken;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class nr implements n1x {
    public static volatile nr e;
    public static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23978a;
    public Object b;
    public Object c;
    public Object d;

    public nr(Context context) {
        this.f23978a = (byte) 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public static nr n(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new nr(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public Intent A(Uri uri) {
        uri.getClass();
        String string = ((SharedPreferences) ((pv00) this.b).f27640a).getString("state_value", null);
        Uri uri2 = Uri.parse("dummy://dummy?" + uri.getFragment());
        Intent intent = new Intent();
        String queryParameter = uri2.getQueryParameter(CommonConstant.ReqAccessTokenParam.STATE_LABEL);
        if (TextUtils.isEmpty(queryParameter) || !Intrinsics.d(queryParameter, string)) {
            intent.putExtra("com.yandex.authsdk.EXTRA_ERROR", new d2w0(new String[]{"security.error"}));
            return intent;
        }
        String queryParameter2 = uri2.getQueryParameter("error");
        if (queryParameter2 != null) {
            intent.putExtra("com.yandex.authsdk.EXTRA_ERROR", new d2w0(new String[]{queryParameter2}));
            return intent;
        }
        String queryParameter3 = uri2.getQueryParameter("access_token");
        String queryParameter4 = uri2.getQueryParameter("expires_in");
        long j = queryParameter4 != null ? Long.parseLong(queryParameter4) : Long.MAX_VALUE;
        if (queryParameter3 != null) {
            intent.putExtra("com.yandex.authsdk.EXTRA_TOKEN", new YandexAuthToken(j, queryParameter3, (String) this.d));
        }
        return intent;
    }

    public void B(boolean z, it2 it2Var) {
        ((kt2) this.b).a("acc_add_phone_code_allert", xp20.f(new Pair("action", z ? "ok" : "cancel"), new Pair("option", "сall_code"), new Pair("point", it2Var.f15333a)));
    }

    public void C(boolean z, it2 it2Var) {
        ((kt2) this.b).a("acc_add_phone_code_allert", xp20.f(new Pair("action", z ? "ok" : "cancel"), new Pair("option", "telegram"), new Pair("point", it2Var.f15333a)));
    }

    public void D(boolean z, it2 it2Var) {
        ((kt2) this.b).a("acc_add_phone_code_allert", xp20.f(new Pair("action", z ? "ok" : "cancel"), new Pair("option", "voice_sms"), new Pair("point", it2Var.f15333a)));
    }

    public void E(x5a x5aVar) {
        ((a6a) this.d).f308a.c = x5aVar;
    }

    public void F(w6k w6kVar) {
        ((a6a) this.d).f308a.f43806a = w6kVar;
    }

    public void G(k6z k6zVar) {
        ((a6a) this.d).f308a.b = k6zVar;
    }

    public void H(long j) {
        ((a6a) this.d).f308a.d = j;
    }

    public j60 a() throws GeneralSecurityException {
        iw20 iw20Var;
        n60 n60Var = (n60) this.b;
        if (n60Var == null || (iw20Var = (iw20) this.c) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (n60Var.b != ((sg9) iw20Var.f15470a).f32150a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        m60 m60Var = n60Var.e;
        m60 m60Var2 = m60.e;
        if (m60Var != m60Var2 && ((Integer) this.d) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (m60Var == m60Var2 && ((Integer) this.d) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (m60Var == m60Var2) {
            sg9.a(new byte[0]);
        } else if (m60Var == m60.d) {
            sg9.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.d).intValue()).array());
        } else {
            if (m60Var != m60.c) {
                hny.w(((n60) this.b).e, "Unknown AesEaxParameters.Variant: ");
                return null;
            }
            sg9.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.d).intValue()).array());
        }
        return new j60();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object b(long j, long j2, zje zjeVar, String str) {
        x37 x37Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof x37) {
            x37Var = (x37) zjeVar;
            int i = x37Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                x37Var.k = i - Integer.MIN_VALUE;
            } else {
                x37Var = new x37(this, zjeVar);
            }
        } else {
            x37Var = new x37(this, zjeVar);
        }
        Object objC = x37Var.i;
        wne wneVar = wne.f39444a;
        int i2 = x37Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            dwe dweVar = new dwe(j, j2, knf0Var.a(), knf0Var.c(), str, knf0Var.c());
            yk50 yk50Var = (yk50) this.b;
            String strA = ((btt0) this.d).a();
            x37Var.k = 1;
            objC = ((w37) ((zm) yk50Var.b).invoke()).c(strA, dweVar, x37Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return d7x.O(g7x.z((q16) objC));
    }

    public void c(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (pbx.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new ss3(e2);
            }
        }
    }

    public Object d(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.b;
        if (afn0.w()) {
            try {
                String simpleName = cls.getSimpleName();
                if (simpleName.length() > 127) {
                    simpleName = simpleName.substring(0, 127);
                }
                Trace.beginSection(simpleName);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                pbx pbxVar = (pbx) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = pbxVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            d(cls2, hashSet);
                        }
                    }
                }
                objB = pbxVar.b((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new ss3(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object e(long j, xgt xgtVar, int i, long j2, int i2, zje zjeVar) {
        iht ihtVar;
        if (zjeVar instanceof iht) {
            ihtVar = (iht) zjeVar;
            int i3 = ihtVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ihtVar.k = i3 - Integer.MIN_VALUE;
            } else {
                ihtVar = new iht(this, zjeVar);
            }
        } else {
            ihtVar = new iht(this, zjeVar);
        }
        iht ihtVar2 = ihtVar;
        Object objD0 = ihtVar2.i;
        wne wneVar = wne.f39444a;
        int i4 = ihtVar2.k;
        if (i4 == 0) {
            z1x.P(objD0);
            dvj dvjVar = ((mne) this.b).b;
            jht jhtVar = new jht(this, xgtVar, j, i, j2, i2, null);
            ihtVar2.k = 1;
            objD0 = qjj.d0(dvjVar, jhtVar, ihtVar2);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        aht ahtVar = (aht) CollectionsKt.firstOrNull((List) ((q16) objD0).a());
        if (ahtVar == null) {
            jf4.k(null);
            return null;
        }
        Double d = ahtVar.f889a;
        if (d == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = d.doubleValue();
        List list = ahtVar.b;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            adq adqVar = (adq) it.next();
            adqVar.getClass();
            Double d2 = adqVar.f692a;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            Integer num = adqVar.b;
            int iIntValue = num != null ? num.intValue() : 0;
            String str = adqVar.c;
            if (str == null) {
                str = "";
            }
            Long l = adqVar.d;
            long jLongValue = l != null ? l.longValue() : 0L;
            Integer num2 = adqVar.e;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = adqVar.f;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            Long l2 = adqVar.g;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            Long l3 = adqVar.h;
            long jLongValue3 = l3 != null ? l3.longValue() : 0L;
            tqt tqtVar = uoy.b;
            Integer num4 = adqVar.i;
            int iIntValue4 = num4 != null ? num4.intValue() : 0;
            tqtVar.getClass();
            uoy uoyVarJ = tqt.j(iIntValue4);
            String str2 = adqVar.j;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = adqVar.k;
            if (str3 == null) {
                str3 = "";
            }
            Iterator it2 = it;
            Integer num5 = adqVar.l;
            int iIntValue5 = num5 != null ? num5.intValue() : 0;
            String str4 = adqVar.m;
            String str5 = str4 == null ? "" : str4;
            List list2 = adqVar.n;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            List list3 = list2;
            String str6 = adqVar.o;
            String str7 = str6 == null ? "" : str6;
            List list4 = adqVar.p;
            if (list4 == null) {
                list4 = iun.f15405a;
            }
            List list5 = list4;
            Double d3 = adqVar.q;
            double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
            Long l4 = adqVar.r;
            long jLongValue4 = l4 != null ? l4.longValue() : 0L;
            Long l5 = adqVar.s;
            long jLongValue5 = l5 != null ? l5.longValue() : 0L;
            String str8 = adqVar.t;
            String str9 = str8 == null ? "" : str8;
            Long l6 = adqVar.u;
            long jLongValue6 = l6 != null ? l6.longValue() : 0L;
            String str10 = adqVar.v;
            String str11 = str10 == null ? "" : str10;
            String str12 = adqVar.w;
            String str13 = str12 == null ? "" : str12;
            String str14 = adqVar.x;
            String str15 = str14 == null ? "" : str14;
            List list6 = adqVar.y;
            if (list6 == null) {
                list6 = iun.f15405a;
            }
            List list7 = adqVar.z;
            if (list7 == null) {
                list7 = iun.f15405a;
            }
            int i5 = iIntValue;
            long j3 = jLongValue;
            arrayList.add(new xcq(dDoubleValue2, i5, str, j3, iIntValue2, iIntValue3, jLongValue2, jLongValue3, uoyVarJ, str2, str3, iIntValue5, str5, list3, str7, list5, dDoubleValue3, jLongValue4, jLongValue5, str9, jLongValue6, str11, str13, str15, new yeo(list6, list7)));
            it = it2;
        }
        return new hht(dDoubleValue, arrayList);
    }

    public float f(xg9 xg9Var) {
        HashMap map = (HashMap) this.b;
        HashMap map2 = (HashMap) this.c;
        if (!(xg9Var instanceof eh9)) {
            if (xg9Var instanceof zg9) {
                return ((zg9) xg9Var).e();
            }
            return 0.0f;
        }
        String strC = ((eh9) xg9Var).c();
        if (map2.containsKey(strC)) {
            return ((x3e) map2.get(strC)).value();
        }
        if (map.containsKey(strC)) {
            return ((Integer) map.get(strC)).floatValue();
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(int i, long j, zje zjeVar, String str) {
        y37 y37Var;
        if (zjeVar instanceof y37) {
            y37Var = (y37) zjeVar;
            int i2 = y37Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y37Var.k = i2 - Integer.MIN_VALUE;
            } else {
                y37Var = new y37(this, zjeVar);
            }
        } else {
            y37Var = new y37(this, zjeVar);
        }
        Object objA = y37Var.i;
        wne wneVar = wne.f39444a;
        int i3 = y37Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            yk50 yk50Var = (yk50) this.b;
            String strA = ((btt0) this.d).a();
            ctt cttVar = new ctt(i, new Long(j), cs0.u(Long.parseLong(str)));
            y37Var.k = 1;
            objA = ((w37) ((zm) yk50Var.b).invoke()).a(strA, cttVar, y37Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        n97 n97Var = (n97) CollectionsKt.firstOrNull(((c57) objA).a());
        if (n97Var != null) {
            return tdc.f0(n97Var);
        }
        jf4.k(null);
        return null;
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        Function1 function1 = (Function1) this.c;
        dyw dywVar = hhn0Var.f13073a;
        Resources resources = ((ImageView) this.d).getContext().getResources();
        resources.getClass();
        function1.invoke(c3x.q(dywVar, resources));
    }

    public x5a i() {
        return ((a6a) this.d).f308a.c;
    }

    public w6k j() {
        return ((a6a) this.d).f308a.f43806a;
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        ((Function1) this.b).invoke(r1oVar.c);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cd, code lost:
    
        if (r10 == r12) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(int r11, a.zje r12) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nr.l(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r6 == r9) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r6 == r9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m(long r7, a.zje r9, a.sip r10, a.jo20 r11) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            a.iqi r0 = (a.iqi) r0
            java.lang.Object r0 = r0.b
            a.yip r0 = (a.yip) r0
            boolean r1 = r9 instanceof a.zip
            if (r1 == 0) goto L1b
            r1 = r9
            a.zip r1 = (a.zip) r1
            int r2 = r1.m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1b
            int r2 = r2 - r3
            r1.m = r2
            goto L20
        L1b:
            a.zip r1 = new a.zip
            r1.<init>(r6, r9)
        L20:
            java.lang.Object r6 = r1.k
            a.wne r9 = a.wne.f39444a
            int r2 = r1.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L35
            a.sip r10 = r1.i
            a.z1x.P(r6)
            goto L61
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L3b:
            long r7 = r1.j
            a.sip r10 = r1.i
            a.z1x.P(r6)
            goto L9e
        L43:
            a.z1x.P(r6)
            int r6 = r10.ordinal()
            if (r6 == 0) goto L8b
            if (r6 != r5) goto L87
            r1.i = r10
            r1.j = r7
            r1.m = r4
            java.lang.Object r6 = r0.invoke()
            a.thp r6 = (a.thp) r6
            java.lang.Object r6 = r6.b(r11, r1)
            if (r6 != r9) goto L61
            goto L9d
        L61:
            a.dx5 r6 = (a.dx5) r6
            java.lang.Object r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L72:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L86
            java.lang.Object r8 = r6.next()
            a.d4t r8 = (a.d4t) r8
            java.util.List r8 = a.n4c.U(r8, r10)
            a.w3d.u(r7, r8)
            goto L72
        L86:
            return r7
        L87:
            a.t9f.b()
            return r3
        L8b:
            r1.i = r10
            r1.j = r7
            r1.m = r5
            java.lang.Object r6 = r0.invoke()
            a.thp r6 = (a.thp) r6
            java.lang.Object r6 = r6.a(r11, r1)
            if (r6 != r9) goto L9e
        L9d:
            return r9
        L9e:
            a.dx5 r6 = (a.dx5) r6
            java.lang.Object r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        Laf:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto Lc3
            java.lang.Object r11 = r6.next()
            a.a4t r11 = (a.a4t) r11
            java.util.List r11 = a.v3c.g0(r11, r10, r7)
            a.w3d.u(r9, r11)
            goto Laf
        Lc3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nr.m(long, a.zje, a.sip, a.jo20):java.io.Serializable");
    }

    public k6z o() {
        return ((a6a) this.d).f308a.b;
    }

    public long p() {
        return ((a6a) this.d).f308a.d;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    public String q(Intent intent, String str) throws UnsupportedEncodingException {
        String str2;
        intent.getClass();
        Object objU = x2x.U(intent, "com.yandex.authsdk.EXTRA_OPTIONS", YandexAuthOptions.class);
        objU.getClass();
        YandexAuthOptions yandexAuthOptions = (YandexAuthOptions) objU;
        String str3 = (String) this.c;
        pv00 pv00Var = (pv00) this.b;
        str3.getClass();
        ((SharedPreferences) pv00Var.f27640a).edit().putString("state_value", str3).apply();
        String str4 = yandexAuthOptions.f46055a;
        String str5 = yandexAuthOptions.c;
        String strEncode = URLEncoder.encode(String.format("https://yx%s.%s/auth/finish?platform=android", Arrays.copyOf(new Object[]{str4, str5}, 2)), "UTF-8");
        strEncode.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        str5.getClass();
        String language = locale.getLanguage();
        if (language == null) {
            str2 = "com";
        } else {
            int iHashCode = language.hashCode();
            if (iHashCode != 3139) {
                str2 = "ru";
                if (iHashCode != 3247) {
                    if (iHashCode != 3345) {
                        if (iHashCode != 3414) {
                            if (iHashCode != 3424) {
                                if (iHashCode != 3651) {
                                    if (iHashCode != 3710) {
                                        if (iHashCode != 3734 || !language.equals("uk")) {
                                            str2 = "com";
                                        }
                                    } else if (language.equals("tr")) {
                                        str2 = "com.tr";
                                    } else {
                                        str2 = "com";
                                    }
                                } else if (!language.equals("ru")) {
                                    str2 = "com";
                                }
                            } else if (language.equals("kk")) {
                                str2 = "kz";
                            } else {
                                str2 = "com";
                            }
                        } else if (!language.equals("ka")) {
                            str2 = "com";
                        }
                    } else if (!language.equals("hy")) {
                        str2 = "com";
                    }
                } else if (!language.equals("et")) {
                    str2 = "com";
                }
            } else if (language.equals("be")) {
                str2 = "by";
            } else {
                str2 = "com";
            }
        }
        return String.format("https://%s/authorize?response_type=token&client_id=%s&redirect_uri=%s&state=%s&force_confirm=true&origin=%s", Arrays.copyOf(new Object[]{twn.p("ru$", str5, str2), str4, strEncode, str3, str}, 5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable r(int i, zje zjeVar) {
        nmu nmuVar;
        if (zjeVar instanceof nmu) {
            nmuVar = (nmu) zjeVar;
            int i2 = nmuVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nmuVar.k = i2 - Integer.MIN_VALUE;
            } else {
                nmuVar = new nmu(this, zjeVar);
            }
        } else {
            nmuVar = new nmu(this, zjeVar);
        }
        Object objC = nmuVar.i;
        wne wneVar = wne.f39444a;
        int i3 = nmuVar.k;
        if (i3 == 0) {
            z1x.P(objC);
            lbu lbuVar = (lbu) this.b;
            nmuVar.k = 1;
            objC = cdu.c((cdu) lbuVar.b, i, ((ntu) lbuVar.c).a(), nmuVar, 8);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        List listA0 = CollectionsKt.A0((Iterable) objC, new gi2(new jar(this, (byte) 21), (byte) 4));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA0) {
            pbv pbvVar = (pbv) obj;
            qg40 qg40VarC = ((b8u) this.c).c();
            int i4 = qg40VarC.f28665a;
            int i5 = qg40VarC.b;
            boolean z = i4 == 0 && i5 == Integer.MAX_VALUE;
            Double dI = kotlin.text.b.i(pbvVar.f);
            if (dI != null) {
                double dDoubleValue = dI.doubleValue();
                if (dDoubleValue >= qg40VarC.f28665a && dDoubleValue <= i5) {
                    arrayList.add(obj);
                }
            } else if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable s(long j, zje zjeVar, boolean z) {
        dut dutVar;
        List<csr> list;
        List list2;
        ArrayList arrayList;
        bsr bsrVar;
        esr esrVar;
        tf8 sf8Var;
        Iterator it;
        Object next;
        pbv pbvVar;
        if (zjeVar instanceof dut) {
            dutVar = (dut) zjeVar;
            int i = dutVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dutVar.n = i - Integer.MIN_VALUE;
            } else {
                dutVar = new dut(this, zjeVar);
            }
        } else {
            dutVar = new dut(this, zjeVar);
        }
        Object objH = dutVar.l;
        wne wneVar = wne.f39444a;
        int i2 = dutVar.n;
        if (i2 == 0) {
            z1x.P(objH);
            ivn ivnVar = (ivn) this.b;
            dutVar.i = j;
            dutVar.j = z;
            dutVar.n = 1;
            objH = ivnVar.h(j, dutVar, z);
            if (objH != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z = dutVar.j;
            j = dutVar.i;
            z1x.P(objH);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = dutVar.k;
            z1x.P(objH);
        }
        list2 = (List) objH;
        arrayList = new ArrayList();
        for (csr csrVar : list) {
            bsrVar = csrVar.f4905a;
            esrVar = bsrVar.f3145a;
            if (bsrVar.f3145a.b()) {
                je8.b.getClass();
                sf8Var = new sf8(csrVar, gl5.j(esrVar));
            } else {
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((pbv) next).f26728a != bsrVar.b);
                pbvVar = (pbv) next;
                if (pbvVar != null) {
                    je8.b.getClass();
                    sf8Var = new rf8(csrVar, gl5.j(esrVar), pbvVar);
                } else {
                    sf8Var = null;
                }
            }
            if (sf8Var != null) {
                arrayList.add(sf8Var);
            }
        }
        return arrayList;
        List list3 = (List) objH;
        cdu cduVar = (cdu) this.c;
        String strA = ((ntu) this.d).a();
        dutVar.k = list3;
        dutVar.i = j;
        dutVar.j = z;
        dutVar.n = 2;
        Object objC = cdu.c(cduVar, 0, strA, dutVar, 11);
        if (objC != wneVar) {
            objH = objC;
            list = list3;
            list2 = (List) objH;
            arrayList = new ArrayList();
            while (r9.hasNext()) {
                bsrVar = csrVar.f4905a;
                esrVar = bsrVar.f3145a;
                if (bsrVar.f3145a.b()) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((pbv) next).f26728a != bsrVar.b);
                    pbvVar = (pbv) next;
                    if (pbvVar != null) {
                        je8.b.getClass();
                        sf8Var = new rf8(csrVar, gl5.j(esrVar), pbvVar);
                    } else {
                        sf8Var = null;
                    }
                } else {
                    je8.b.getClass();
                    sf8Var = new sf8(csrVar, gl5.j(esrVar));
                }
                if (sf8Var != null) {
                    arrayList.add(sf8Var);
                }
            }
            return arrayList;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable t(zje zjeVar) {
        zzt zztVar;
        int i;
        ArrayList arrayList;
        int i2;
        ArrayList<d270> arrayList2;
        ArrayList arrayList3;
        boolean z;
        String str;
        if (zjeVar instanceof zzt) {
            zztVar = (zzt) zjeVar;
            int i3 = zztVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zztVar.m = i3 - Integer.MIN_VALUE;
            } else {
                zztVar = new zzt(this, zjeVar);
            }
        } else {
            zztVar = new zzt(this, zjeVar);
        }
        Object objA = zztVar.k;
        wne wneVar = wne.f39444a;
        int i4 = zztVar.m;
        if (i4 == 0) {
            z1x.P(objA);
            ipu ipuVar = (ipu) this.b;
            zztVar.m = 1;
            objA = ipuVar.a(zztVar);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i4 == 1) {
            z1x.P(objA);
        } else {
            if (i4 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = zztVar.j;
            arrayList = zztVar.i;
            z1x.P(objA);
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((d270) obj) == d270.LUCKY_WHEEL || zBooleanValue) {
                arrayList2.add(obj);
            }
        }
        arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
        for (d270 d270Var : arrayList2) {
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            String strA = ((ntu) this.d).a();
            d270Var.getClass();
            if (d270Var == d270.LUCKY_WHEEL) {
                str = "BonusLuckyWheel.webp";
            } else {
                str = "";
            }
            arrayList3.add(new qf8(d270Var, z, w6x.q(strA, "/static/img/android/games/game_preview/square/", str)));
        }
        return arrayList3;
        List list = (List) objA;
        if (list != null && list.isEmpty()) {
            i = 0;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            tq60 tq60Var = (tq60) it.next();
            if (tq60Var.b == d270.LUCKY_WHEEL && tq60Var.f34367a.d) {
                i = 1;
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((tq60) it2.next()).b);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            d270 d270Var2 = (d270) obj2;
            d270Var2.getClass();
            if (kotlin.collections.a.c(d270.LUCKY_WHEEL).contains(d270Var2)) {
                arrayList5.add(obj2);
            }
        }
        zztVar.i = arrayList5;
        zztVar.j = i;
        zztVar.m = 2;
        Object objY = y(zztVar);
        if (objY != wneVar) {
            arrayList = arrayList5;
            objA = objY;
            i2 = i;
            boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
            arrayList2 = new ArrayList();
            while (r0.hasNext()) {
                if (((d270) obj) == d270.LUCKY_WHEEL) {
                }
                arrayList2.add(obj);
            }
            arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            while (r0.hasNext()) {
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String strA2 = ((ntu) this.d).a();
                d270Var.getClass();
                if (d270Var == d270.LUCKY_WHEEL) {
                    str = "BonusLuckyWheel.webp";
                } else {
                    str = "";
                }
                arrayList3.add(new qf8(d270Var, z, w6x.q(strA2, "/static/img/android/games/game_preview/square/", str)));
            }
            return arrayList3;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x0169  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
    
        if (r1 == r15) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016b, code lost:
    
        if (r1 == r15) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(long r22, boolean r24, a.sgb r25, a.zje r26) throws a.n7p {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nr.u(long, boolean, a.sgb, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:103:0x0203  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:60:0x010a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124 A[PHI: r0
  0x0124: PHI (r0v30 java.lang.Object) = (r0v62 java.lang.Object), (r0v63 java.lang.Object) binds: [B:58:0x0107, B:63:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x016b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011f, code lost:
    
        if (r0 == r9) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0141, code lost:
    
        if (r0 == r9) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0153, code lost:
    
        if (r1.s(r0, r12) == r9) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(a.zje r22) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nr.v(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object w(String str, xuf xufVar, zje zjeVar) {
        pp ppVar;
        gw gwVar;
        gw gwVar2;
        if (zjeVar instanceof pp) {
            ppVar = (pp) zjeVar;
            int i = ppVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ppVar.l = i - Integer.MIN_VALUE;
            } else {
                ppVar = new pp(this, zjeVar);
            }
        } else {
            ppVar = new pp(this, zjeVar);
        }
        pp ppVar2 = ppVar;
        Object objG = ppVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = ppVar2.l;
        if (i2 == 0) {
            z1x.P(objG);
            gw gwVar3 = new gw(str, xufVar);
            rou rouVar = (rou) this.d;
            ppVar2.i = gwVar3;
            ppVar2.l = 1;
            Object objA = rouVar.a(false, ppVar2);
            if (objA != wneVar) {
                gwVar = gwVar3;
                objG = objA;
            }
            return wneVar;
        }
        if (i2 == 1) {
            gw gwVar4 = ppVar2.i;
            z1x.P(objG);
            gwVar = gwVar4;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gwVar2 = ppVar2.i;
            z1x.P(objG);
        }
        vvu0 vvu0Var = (vvu0) objG;
        sp spVarB = ((g45) ((wsf0) this.c).b).b();
        long j = vvu0Var.b;
        long j2 = gwVar2.b;
        String str2 = gwVar2.c;
        String str3 = gwVar2.d;
        txs0 txs0Var = txs0.g;
        String str4 = gwVar2.f11999a;
        spVarB.b(new ql5(j, 0.0d, false, false, j2, str2, str3, 0, txs0Var, str4, "", false, str4));
        return vvu0Var.f38121a;
        int iX = wvb.X(((m2c0) objG).c);
        r7v r7vVar = (r7v) this.b;
        String str5 = gwVar.f11999a;
        long j3 = gwVar.b;
        ppVar2.i = gwVar;
        ppVar2.l = 2;
        objG = ((h0q0) r7vVar.f29996a).g(iX, j3, ppVar2, str5);
        if (objG != wneVar) {
            gwVar2 = gwVar;
            vvu0 vvu0Var2 = (vvu0) objG;
            sp spVarB2 = ((g45) ((wsf0) this.c).b).b();
            long j4 = vvu0Var2.b;
            long j5 = gwVar2.b;
            String str6 = gwVar2.c;
            String str7 = gwVar2.d;
            txs0 txs0Var2 = txs0.g;
            String str8 = gwVar2.f11999a;
            spVarB2.b(new ql5(j4, 0.0d, false, false, j5, str6, str7, 0, txs0Var2, str8, "", false, str8));
            return vvu0Var2.f38121a;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object x(long j, sip sipVar, long j2, zje zjeVar) {
        bb9 bb9Var;
        int iA;
        Object g0g0Var;
        boolean zBooleanValue;
        Object g0g0Var2;
        long jLongValue;
        sip sipVar2;
        long j3;
        boolean z;
        long j4;
        long j5;
        boolean z2;
        Object g0g0Var3;
        boolean z3;
        long j6;
        long j7;
        Object num;
        ort ortVar = (ort) this.b;
        xyt xytVar = (xyt) this.d;
        if (zjeVar instanceof bb9) {
            bb9Var = (bb9) zjeVar;
            int i = bb9Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                bb9Var.r = i - Integer.MIN_VALUE;
            } else {
                bb9Var = new bb9(this, zjeVar);
            }
        } else {
            bb9Var = new bb9(this, zjeVar);
        }
        Object objC = bb9Var.p;
        wne wneVar = wne.f39444a;
        int i2 = bb9Var.r;
        if (i2 == 0) {
            z1x.P(objC);
            boolean zU = kpb.u(sipVar);
            iA = xytVar.a();
            boolean zA = xytVar.f41721a.a();
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = Boolean.valueOf(ortVar.f25751a.d(zU));
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            Object obj = Boolean.FALSE;
            if (g0g0Var instanceof g0g0) {
                g0g0Var = obj;
            }
            zBooleanValue = ((Boolean) g0g0Var).booleanValue();
            try {
                g0g0Var2 = new Long(ortVar.b());
            } catch (Throwable th2) {
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var2 = new g0g0(th2);
            }
            Object l = new Long(0L);
            if (g0g0Var2 instanceof g0g0) {
                g0g0Var2 = l;
            }
            jLongValue = ((Number) g0g0Var2).longValue();
            try {
                x0u x0uVar = (x0u) this.c;
                sipVar2 = sipVar;
                try {
                    bb9Var.l = sipVar2;
                    j3 = j2;
                    try {
                        bb9Var.i = j3;
                        j = j;
                        try {
                            bb9Var.j = j;
                            bb9Var.o = iA;
                            bb9Var.m = zA;
                            bb9Var.n = zBooleanValue;
                            bb9Var.k = jLongValue;
                            bb9Var.r = 1;
                            objC = x0uVar.c(bb9Var);
                            if (objC == wneVar) {
                                return wneVar;
                            }
                            z = zA;
                            j4 = jLongValue;
                            j5 = j3;
                        } catch (Throwable th3) {
                            th = th3;
                            z = zA;
                            z2 = zBooleanValue;
                            e0g0 e0g0Var4 = j0g0.b;
                            g0g0Var3 = new g0g0(th);
                            z3 = z2;
                            j6 = jLongValue;
                            j7 = j3;
                            sip sipVar3 = sipVar2;
                            boolean z4 = z;
                            int i3 = iA;
                            long j8 = j;
                            num = new Integer(0);
                            if (g0g0Var3 instanceof g0g0) {
                                g0g0Var3 = num;
                            }
                            return new sgs(j8, sipVar3, i3, z4, z3, j6, ((Number) g0g0Var3).intValue(), j7);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        j = j;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    j3 = j2;
                    z = zA;
                    z2 = zBooleanValue;
                    e0g0 e0g0Var5 = j0g0.b;
                    g0g0Var3 = new g0g0(th);
                    z3 = z2;
                    j6 = jLongValue;
                    j7 = j3;
                    sip sipVar4 = sipVar2;
                    boolean z5 = z;
                    int i4 = iA;
                    long j9 = j;
                    num = new Integer(0);
                    if (g0g0Var3 instanceof g0g0) {
                        g0g0Var3 = num;
                    }
                    return new sgs(j9, sipVar4, i4, z5, z3, j6, ((Number) g0g0Var3).intValue(), j7);
                }
            } catch (Throwable th6) {
                th = th6;
                sipVar2 = sipVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j10 = bb9Var.k;
            z2 = bb9Var.n;
            z = bb9Var.m;
            iA = bb9Var.o;
            long j11 = bb9Var.j;
            j5 = bb9Var.i;
            sip sipVar5 = bb9Var.l;
            try {
                z1x.P(objC);
                j = j11;
                zBooleanValue = z2;
                j4 = j10;
                sipVar2 = sipVar5;
            } catch (Throwable th7) {
                th = th7;
                j = j11;
                j3 = j5;
                jLongValue = j10;
                sipVar2 = sipVar5;
                e0g0 e0g0Var6 = j0g0.b;
                g0g0Var3 = new g0g0(th);
                z3 = z2;
                j6 = jLongValue;
                j7 = j3;
            }
        }
        try {
            g0g0Var3 = new Integer(((Number) objC).intValue());
            e0g0 e0g0Var7 = j0g0.b;
            j6 = j4;
            z3 = zBooleanValue;
            j7 = j5;
        } catch (Throwable th8) {
            th = th8;
            j3 = j5;
            jLongValue = j4;
            z2 = zBooleanValue;
            e0g0 e0g0Var8 = j0g0.b;
            g0g0Var3 = new g0g0(th);
            z3 = z2;
            j6 = jLongValue;
            j7 = j3;
        }
        sip sipVar6 = sipVar2;
        boolean z6 = z;
        int i5 = iA;
        long j12 = j;
        num = new Integer(0);
        if (g0g0Var3 instanceof g0g0) {
            g0g0Var3 = num;
        }
        return new sgs(j12, sipVar6, i5, z6, z3, j6, ((Number) g0g0Var3).intValue(), j7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(zje zjeVar) {
        a0u a0uVar;
        if (zjeVar instanceof a0u) {
            a0uVar = (a0u) zjeVar;
            int i = a0uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0uVar.k = i - Integer.MIN_VALUE;
            } else {
                a0uVar = new a0u(this, zjeVar);
            }
        } else {
            a0uVar = new a0u(this, zjeVar);
        }
        Object objA = a0uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = a0uVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = ((ntu) this.d).a();
            scu scuVar = (scu) this.c;
            long jA = s470.LUCKY_WHEEL.a();
            a0uVar.k = 1;
            objA = scuVar.a(jA, a0uVar, strA);
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
        return Boolean.valueOf(((pbv) objA).q);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[PHI: r1 r2 r3
  0x00d1: PHI (r1v9 boolean) = (r1v4 boolean), (r1v12 boolean) binds: [B:44:0x00ce, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00d1: PHI (r2v8 a.ytg0) = (r2v6 a.ytg0), (r2v14 a.ytg0) binds: [B:44:0x00ce, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00d1: PHI (r3v2 a.d0f) = (r3v1 a.d0f), (r3v4 a.d0f) binds: [B:44:0x00ce, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object z(String str, d0f d0fVar, boolean z, zje zjeVar) {
        z37 z37Var;
        boolean z2;
        q16 q16Var;
        d0f d0fVar2;
        ytg0 ytg0VarO;
        long j;
        String str2;
        Object objZ;
        d0f d0fVar3 = d0fVar;
        if (zjeVar instanceof z37) {
            z37Var = (z37) zjeVar;
            int i = z37Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                z37Var.n = i - Integer.MIN_VALUE;
            } else {
                z37Var = new z37(this, zjeVar);
            }
        } else {
            z37Var = new z37(this, zjeVar);
        }
        Object objB = z37Var.l;
        Object obj = wne.f39444a;
        int i2 = z37Var.n;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = z37Var.k;
                d0fVar3 = z37Var.i;
                z1x.P(objB);
                q16Var = (q16) objB;
                d0fVar2 = d0fVar3;
                if (((eug0) q16Var.d) == null) {
                    str2 = q16Var.f27936a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    throw new lai0(str2);
                }
                ytg0VarO = d7x.O(g7x.z(q16Var));
                if (ytg0VarO.j.length() > 0) {
                    return ytg0VarO;
                }
                j = ((long) ytg0VarO.k) + 1000;
                z37Var.i = d0fVar2;
                z37Var.j = ytg0VarO;
                z37Var.k = z2;
                z37Var.n = 3;
                if (qcc.O(j, z37Var) != obj) {
                }
            } else if (i2 == 2) {
                z2 = z37Var.k;
                d0fVar3 = z37Var.i;
                z1x.P(objB);
                q16Var = (q16) objB;
                d0fVar2 = d0fVar3;
                if (((eug0) q16Var.d) == null) {
                    str2 = q16Var.f27936a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    throw new lai0(str2);
                }
                ytg0VarO = d7x.O(g7x.z(q16Var));
                if (ytg0VarO.j.length() > 0) {
                    return ytg0VarO;
                }
                j = ((long) ytg0VarO.k) + 1000;
                z37Var.i = d0fVar2;
                z37Var.j = ytg0VarO;
                z37Var.k = z2;
                z37Var.n = 3;
                if (qcc.O(j, z37Var) != obj) {
                }
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        z1x.P(objB);
                        return objB;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = z37Var.k;
                ytg0VarO = z37Var.j;
                d0fVar2 = z37Var.i;
                z1x.P(objB);
            }
            String strA = ((btt0) this.d).a();
            String str3 = ytg0VarO.j;
            String str4 = d0fVar2.f5265a;
            String str5 = d0fVar2.b;
            String str6 = d0fVar2.c;
            double d = d0fVar2.d;
            double d2 = d0fVar2.e;
            double d3 = d0fVar2.g;
            long j2 = d0fVar2.h;
            long j3 = d0fVar2.i;
            String str7 = d0fVar2.j;
            str5.getClass();
            str6.getClass();
            str7.getClass();
            d0f d0fVar4 = new d0f(str4, str5, str6, d, d2, str3, d3, j2, j3, str7);
            z37Var.i = null;
            z37Var.j = null;
            z37Var.k = z2;
            z37Var.n = 4;
            objZ = z(strA, d0fVar4, z2, z37Var);
            if (objZ != obj) {
                return objZ;
            }
        } else {
            z1x.P(objB);
            zm zmVar = (zm) ((yk50) this.b).b;
            if (z) {
                z37Var.i = d0fVar3;
                z37Var.k = z;
                z37Var.n = 1;
                objB = ((w37) zmVar.invoke()).d(str, d0fVar3, z37Var);
                if (objB != obj) {
                    z2 = z;
                    q16Var = (q16) objB;
                    d0fVar2 = d0fVar3;
                    if (((eug0) q16Var.d) == null) {
                        str2 = q16Var.f27936a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        throw new lai0(str2);
                    }
                    ytg0VarO = d7x.O(g7x.z(q16Var));
                    if (ytg0VarO.j.length() > 0) {
                        return ytg0VarO;
                    }
                    j = ((long) ytg0VarO.k) + 1000;
                    z37Var.i = d0fVar2;
                    z37Var.j = ytg0VarO;
                    z37Var.k = z2;
                    z37Var.n = 3;
                    if (qcc.O(j, z37Var) != obj) {
                        String strA2 = ((btt0) this.d).a();
                        String str8 = ytg0VarO.j;
                        String str9 = d0fVar2.f5265a;
                        String str10 = d0fVar2.b;
                        String str11 = d0fVar2.c;
                        double d4 = d0fVar2.d;
                        double d5 = d0fVar2.e;
                        double d6 = d0fVar2.g;
                        long j4 = d0fVar2.h;
                        long j5 = d0fVar2.i;
                        String str12 = d0fVar2.j;
                        str10.getClass();
                        str11.getClass();
                        str12.getClass();
                        d0f d0fVar5 = new d0f(str9, str10, str11, d4, d5, str8, d6, j4, j5, str12);
                        z37Var.i = null;
                        z37Var.j = null;
                        z37Var.k = z2;
                        z37Var.n = 4;
                        objZ = z(strA2, d0fVar5, z2, z37Var);
                        if (objZ != obj) {
                            return objZ;
                        }
                    }
                }
            } else {
                z37Var.i = d0fVar3;
                z37Var.k = z;
                z37Var.n = 2;
                objB = ((w37) zmVar.invoke()).b(str, d0fVar3, z37Var);
                if (objB != obj) {
                    z2 = z;
                    q16Var = (q16) objB;
                    d0fVar2 = d0fVar3;
                    if (((eug0) q16Var.d) == null) {
                        str2 = q16Var.f27936a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        throw new lai0(str2);
                    }
                    ytg0VarO = d7x.O(g7x.z(q16Var));
                    if (ytg0VarO.j.length() > 0) {
                        return ytg0VarO;
                    }
                    j = ((long) ytg0VarO.k) + 1000;
                    z37Var.i = d0fVar2;
                    z37Var.j = ytg0VarO;
                    z37Var.k = z2;
                    z37Var.n = 3;
                    if (qcc.O(j, z37Var) != obj) {
                        String strA3 = ((btt0) this.d).a();
                        String str13 = ytg0VarO.j;
                        String str14 = d0fVar2.f5265a;
                        String str15 = d0fVar2.b;
                        String str16 = d0fVar2.c;
                        double d7 = d0fVar2.d;
                        double d8 = d0fVar2.e;
                        double d9 = d0fVar2.g;
                        long j6 = d0fVar2.h;
                        long j7 = d0fVar2.i;
                        String str17 = d0fVar2.j;
                        str15.getClass();
                        str16.getClass();
                        str17.getClass();
                        d0f d0fVar6 = new d0f(str14, str15, str16, d7, d8, str13, d9, j6, j7, str17);
                        z37Var.i = null;
                        z37Var.j = null;
                        z37Var.k = z2;
                        z37Var.n = 4;
                        objZ = z(strA3, d0fVar6, z2, z37Var);
                        if (objZ != obj) {
                            return objZ;
                        }
                    }
                }
            }
        }
        return obj;
    }

    public /* synthetic */ nr(Object obj, Object obj2, Object obj3, byte b) {
        this.f23978a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public nr(pv00 pv00Var, String str, svs0 svs0Var, String str2) {
        this.f23978a = (byte) 18;
        str.getClass();
        str2.getClass();
        this.b = pv00Var;
        this.c = str;
        this.d = str2;
    }

    public nr(cad cadVar, knf0 knf0Var, mne mneVar) {
        this.f23978a = (byte) 17;
        knf0Var.getClass();
        this.b = cadVar;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public nr(kt2 kt2Var, knf0 knf0Var, peg0 peg0Var) {
        this.f23978a = (byte) 5;
        kt2Var.getClass();
        knf0Var.getClass();
        this.b = kt2Var;
        this.c = knf0Var;
        this.d = peg0Var;
    }

    public nr(chf0 chf0Var, knf0 knf0Var, btt0 btt0Var) {
        this.f23978a = (byte) 4;
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = chf0Var;
        this.c = knf0Var;
        this.d = btt0Var;
    }

    public nr(m0o0 m0o0Var, khf0 khf0Var, m1e m1eVar) {
        this.f23978a = (byte) 0;
        m1eVar.getClass();
        this.b = m0o0Var;
        this.c = khf0Var;
        this.d = m1eVar;
    }

    public nr(mne mneVar, knf0 knf0Var, a1d a1dVar) {
        this.f23978a = (byte) 20;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = knf0Var;
        this.d = a1dVar;
    }

    public nr(uii uiiVar, j1q0 j1q0Var, gst0 gst0Var) {
        this.f23978a = (byte) 24;
        j1q0Var.getClass();
        gst0Var.getClass();
        this.b = uiiVar;
        this.c = j1q0Var;
        this.d = gst0Var;
    }

    public nr(yk50 yk50Var, knf0 knf0Var, btt0 btt0Var) {
        this.f23978a = (byte) 6;
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = yk50Var;
        this.c = knf0Var;
        this.d = btt0Var;
    }

    public nr(knf0 knf0Var, iqi iqiVar, wip wipVar) {
        this.f23978a = (byte) 19;
        knf0Var.getClass();
        wipVar.getClass();
        this.b = knf0Var;
        this.c = iqiVar;
        this.d = wipVar;
    }

    public nr(cad cadVar, ctf0 ctf0Var) {
        this.f23978a = (byte) 13;
        this.b = ctf0Var;
        this.c = cadVar;
        this.d = new t5i(this, (byte) 16);
    }

    public nr(cad cadVar, k3r0 k3r0Var) {
        this.f23978a = (byte) 15;
        this.b = cadVar;
        this.c = k3r0Var;
        this.d = new xvi(this, (byte) 26);
    }

    public nr(a6a a6aVar) {
        this.f23978a = (byte) 9;
        this.d = a6aVar;
        this.b = new fvt0(this);
    }

    public /* synthetic */ nr(byte b) {
        this.f23978a = b;
    }
}
