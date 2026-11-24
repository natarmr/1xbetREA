package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.huawei.hms.android.HwBuildEx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class yuu implements opb0 {
    public static yuu e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43286a;
    public final Object b;
    public Object c;
    public Object d;

    public yuu(vby vbyVar, final us00 us00Var) {
        this.f43286a = (byte) 25;
        vbyVar.getClass();
        this.b = vbyVar;
        final byte b = 0;
        this.c = maz.b(new Function0() { // from class: a.wwn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                byte b2 = b;
                yuu yuuVar = this;
                us00 us00Var2 = us00Var;
                switch (b2) {
                    case 0:
                        InputStream inputStreamOpen = us00Var2.getAssets().open("cardsENG.json");
                        try {
                            byte[] bArr = new byte[inputStreamOpen.available()];
                            inputStreamOpen.read(bArr);
                            String str = new String(bArr, Charsets.UTF_8);
                            inputStreamOpen.close();
                            vby vbyVar2 = (vby) yuuVar.b;
                            vbyVar2.getClass();
                            return (pja) vbyVar2.b(pja.Companion.serializer(), str);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                bkb.E(inputStreamOpen, th);
                                throw th2;
                            }
                        }
                    default:
                        InputStream inputStreamOpen2 = us00Var2.getAssets().open("cardsRU.json");
                        try {
                            byte[] bArr2 = new byte[inputStreamOpen2.available()];
                            inputStreamOpen2.read(bArr2);
                            String str2 = new String(bArr2, Charsets.UTF_8);
                            inputStreamOpen2.close();
                            vby vbyVar3 = (vby) yuuVar.b;
                            vbyVar3.getClass();
                            return (pja) vbyVar3.b(pja.Companion.serializer(), str2);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                bkb.E(inputStreamOpen2, th3);
                                throw th4;
                            }
                        }
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.b(new Function0() { // from class: a.wwn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                byte b3 = b2;
                yuu yuuVar = this;
                us00 us00Var2 = us00Var;
                switch (b3) {
                    case 0:
                        InputStream inputStreamOpen = us00Var2.getAssets().open("cardsENG.json");
                        try {
                            byte[] bArr = new byte[inputStreamOpen.available()];
                            inputStreamOpen.read(bArr);
                            String str = new String(bArr, Charsets.UTF_8);
                            inputStreamOpen.close();
                            vby vbyVar2 = (vby) yuuVar.b;
                            vbyVar2.getClass();
                            return (pja) vbyVar2.b(pja.Companion.serializer(), str);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                bkb.E(inputStreamOpen, th);
                                throw th2;
                            }
                        }
                    default:
                        InputStream inputStreamOpen2 = us00Var2.getAssets().open("cardsRU.json");
                        try {
                            byte[] bArr2 = new byte[inputStreamOpen2.available()];
                            inputStreamOpen2.read(bArr2);
                            String str2 = new String(bArr2, Charsets.UTF_8);
                            inputStreamOpen2.close();
                            vby vbyVar3 = (vby) yuuVar.b;
                            vbyVar3.getClass();
                            return (pja) vbyVar3.b(pja.Companion.serializer(), str2);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                bkb.E(inputStreamOpen2, th3);
                                throw th4;
                            }
                        }
                }
            }
        });
    }

    public static String e(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains(Separators.QUESTION)) {
            return kng0.l(str, Separators.QUESTION, string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return str.concat(string);
    }

    @Override // a.opb0
    public void a() {
        int dimension;
        tpb0 tpb0Var = (tpb0) this.b;
        aqb0 aqb0Var = (aqb0) this.d;
        if (aqb0Var != null) {
            dimension = (int) tpb0Var.getResources().getDimension(aqb0Var.b);
        } else {
            dimension = 0;
        }
        int measuredWidth = (tpb0Var.getMeasuredWidth() - dimension) / 2;
        int measuredHeight = (tpb0Var.getMeasuredHeight() - dimension) / 2;
        Drawable drawable = (Drawable) this.c;
        if (drawable != null) {
            drawable.setBounds(measuredWidth, measuredHeight, tpb0Var.getMeasuredWidth() - measuredWidth, tpb0Var.getMeasuredHeight() - measuredHeight);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object b(int i, zje zjeVar) {
        tcc0 tcc0Var;
        yj yjVar = (yj) this.c;
        if (zjeVar instanceof tcc0) {
            tcc0Var = (tcc0) zjeVar;
            int i2 = tcc0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tcc0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                tcc0Var = new tcc0(this, zjeVar);
            }
        } else {
            tcc0Var = new tcc0(this, zjeVar);
        }
        Object objA = tcc0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = tcc0Var.l;
        if (i3 == 0) {
            z1x.P(objA);
            scc0 scc0Var = (scc0) this.b;
            yac0 yac0Var = new yac0(i);
            String strA = ((btt0) this.d).a();
            tcc0Var.i = i;
            tcc0Var.l = 1;
            objA = ((uac0) scc0Var.f31979a.invoke()).a("application/vnd.xenvelop+json", strA, yac0Var, tcc0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = tcc0Var.i;
            z1x.P(objA);
        }
        bbc0 bbc0Var = (bbc0) ((dx5) objA).a();
        Boolean bool = bbc0Var.f2302a;
        yjVar.b.o(null, Boolean.valueOf(Intrinsics.d(bool, Boolean.TRUE)));
        yjVar.f42720a.remove(Integer.valueOf(i));
        if (bool == null) {
            jf4.k(null);
            return null;
        }
        boolean zBooleanValue = bool.booleanValue();
        Long l = bbc0Var.b;
        Date date = l != null ? new Date(l.longValue()) : null;
        String str = bbc0Var.c;
        if (str == null) {
            str = "";
        }
        return new vac0(zBooleanValue, date, str);
    }

    @Override // a.opb0
    public void c(dqb0 dqb0Var) {
        tpb0 tpb0Var = (tpb0) this.b;
        aqb0 aqb0Var = dqb0Var instanceof aqb0 ? (aqb0) dqb0Var : null;
        if (aqb0Var == null) {
            return;
        }
        this.c = epv0.U(aqb0Var.f1290a, tpb0Var.getContext());
        tpb0Var.requestLayout();
        this.d = aqb0Var;
    }

    @Override // a.opb0
    public int d() {
        return 0;
    }

    public kge f() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        cu.e();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strE = e((String) this.b, (HashMap) this.c);
            String strConcat = "GET Request URL: ".concat(strE);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strE).openConnection();
            try {
                httpsURLConnection.setReadTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                httpsURLConnection.setConnectTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new kge((byte) 1, responseCode, string);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(int i, zje zjeVar) {
        ucc0 ucc0Var;
        Boolean bool;
        if (zjeVar instanceof ucc0) {
            ucc0Var = (ucc0) zjeVar;
            int i2 = ucc0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ucc0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                ucc0Var = new ucc0(this, zjeVar);
            }
        } else {
            ucc0Var = new ucc0(this, zjeVar);
        }
        Object objI = ucc0Var.i;
        Object obj = wne.f39444a;
        int i3 = ucc0Var.k;
        if (i3 == 0) {
            z1x.P(objI);
            ucc0Var.k = 1;
            objI = i(i, ucc0Var);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        rcc0 rcc0Var = ((gcc0) objI).g.f23286a;
        return Boolean.valueOf((rcc0Var == null || (bool = rcc0Var.f30232a) == null) ? false : bool.booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    public Object h(zje zjeVar) {
        kuf0 kuf0Var;
        ?? arrayList;
        List<ovf0> list;
        String str;
        String str2;
        fvf0 fvf0Var;
        fvf0 fvf0Var2;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof kuf0) {
            kuf0Var = (kuf0) zjeVar;
            int i = kuf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kuf0Var.k = i - Integer.MIN_VALUE;
            } else {
                kuf0Var = new kuf0(this, zjeVar);
            }
        } else {
            kuf0Var = new kuf0(this, zjeVar);
        }
        Object objA = kuf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kuf0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            zn00 zn00Var = (zn00) this.b;
            knf0Var.getClass();
            String strC = knf0Var.c();
            kuf0Var.k = 1;
            objA = ((duf0) ((tie0) zn00Var.b).invoke()).a("info_hosp_1", strC, kuf0Var);
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
        Iterable<xvf0> iterable = (Iterable) ((dx5) objA).a();
        int i3 = 10;
        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
        for (xvf0 xvf0Var : iterable) {
            vby vbyVar = (vby) this.d;
            xvf0Var.getClass();
            vbyVar.getClass();
            String str3 = xvf0Var.b;
            if (str3 == null) {
                str3 = "";
            }
            rvf0 rvf0Var = ((uvf0) vbyVar.b(uvf0.Companion.serializer(), str3)).f36347a;
            if (rvf0Var == null || (list = rvf0Var.f31166a) == null) {
                arrayList = iun.f15405a;
            } else {
                arrayList = new ArrayList(r3d.q(list, i3));
                for (ovf0 ovf0Var : list) {
                    List list2 = ovf0Var.b;
                    ivf0 ivf0Var = ovf0Var.d;
                    if (list2 == null) {
                        str = ovf0Var.c;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        int i4 = 0;
                        String str4 = "";
                        for (Object obj : list2) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            String str5 = ((Object) str4) + ((lvf0) obj).f20713a;
                            if (i4 != ovf0Var.b.size() - 1) {
                                str5 = ((Object) str5) + Separators.SP;
                            }
                            str4 = str5;
                            i4 = i5;
                        }
                        str = str4;
                    }
                    String str6 = ovf0Var.f25923a;
                    if (str6 == null) {
                        str6 = (ivf0Var == null || (fvf0Var2 = ivf0Var.f15444a) == null) ? null : fvf0Var2.b;
                        if (str6 == null) {
                            str6 = ivf0Var != null ? ivf0Var.c : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                        }
                    }
                    if (ivf0Var == null || (fvf0Var = ivf0Var.f15444a) == null || (str2 = fvf0Var.f10213a) == null) {
                        str2 = ivf0Var != null ? ivf0Var.b : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                    arrayList.add(new auf0(str6, str, str2));
                }
            }
            arrayList2.add(arrayList);
            i3 = 10;
        }
        List list3 = (List) CollectionsKt.firstOrNull(arrayList2);
        return list3 == null ? iun.f15405a : list3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public Object i(int i, zje zjeVar) {
        vcc0 vcc0Var;
        int i2;
        String str;
        rcc0 rcc0Var;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        Object obj;
        Date date;
        qcc0 qcc0Var;
        int i3;
        icc0 icc0Var;
        dcc0 dcc0Var;
        yj yjVar = (yj) this.c;
        if (zjeVar instanceof vcc0) {
            vcc0Var = (vcc0) zjeVar;
            int i4 = vcc0Var.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vcc0Var.l = i4 - Integer.MIN_VALUE;
            } else {
                vcc0Var = new vcc0(this, zjeVar);
            }
        } else {
            vcc0Var = new vcc0(this, zjeVar);
        }
        Object objB = vcc0Var.j;
        wne wneVar = wne.f39444a;
        int i5 = vcc0Var.l;
        if (i5 == 0) {
            z1x.P(objB);
            scc0 scc0Var = (scc0) this.b;
            String strValueOf = String.valueOf(i);
            String strA = ((btt0) this.d).a();
            vcc0Var.i = i;
            vcc0Var.l = 1;
            objB = ((uac0) scc0Var.f31979a.invoke()).b("application/vnd.xenvelop+json", strA, strValueOf, vcc0Var);
            if (objB == wneVar) {
                return wneVar;
            }
            i2 = i;
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = vcc0Var.i;
            z1x.P(objB);
        }
        ibc0 ibc0Var = (ibc0) ((dx5) objB).a();
        xbc0 xbc0Var = ibc0Var.g;
        yjVar.b.o(null, Boolean.valueOf((xbc0Var == null || (dcc0Var = xbc0Var.f40595a) == null) ? false : Intrinsics.d(dcc0Var.f5844a, Boolean.TRUE)));
        yjVar.f42720a.put(Integer.valueOf(i2), ibc0Var);
        Long l = ibc0Var.f14480a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        Date date2 = new Date(l.longValue());
        Long l2 = ibc0Var.b;
        if (l2 == null) {
            jf4.k(null);
            return null;
        }
        Date date3 = new Date(l2.longValue());
        List<ubc0> list = ibc0Var.c;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        int i6 = 10;
        ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
        for (ubc0 ubc0Var : list) {
            ubc0Var.getClass();
            Integer num = ubc0Var.f35374a;
            if (num == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue = num.intValue();
            Long l3 = ubc0Var.b;
            if (l3 == null) {
                jf4.k(null);
                return null;
            }
            Date date4 = new Date(l3.longValue());
            Long l4 = ubc0Var.c;
            if (l4 == null) {
                jf4.k(null);
                return null;
            }
            Date date5 = new Date(l4.longValue());
            Integer num2 = ubc0Var.d;
            if (num2 == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue2 = num2.intValue();
            arrayList4.add(new mcc0(iIntValue, date4, date5, iIntValue2 != 0 ? iIntValue2 != 1 ? fcc0.c : fcc0.f9306a : fcc0.b));
        }
        Integer num3 = ibc0Var.d;
        if (num3 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue3 = num3.intValue();
        String str2 = ibc0Var.e;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        Integer num4 = ibc0Var.f;
        if (num4 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue4 = num4.intValue();
        occ0 occ0Var = iIntValue4 != 0 ? iIntValue4 != 2 ? occ0.c : occ0.b : occ0.f25021a;
        if (xbc0Var == null) {
            jf4.k(null);
            return null;
        }
        dcc0 dcc0Var2 = xbc0Var.f40595a;
        if (dcc0Var2 != null) {
            Boolean bool = dcc0Var2.f5844a;
            Long l5 = dcc0Var2.b;
            str = null;
            rcc0Var = new rcc0(bool, l5 != null ? new Date(l5.longValue()) : null);
        } else {
            str = null;
            rcc0Var = null;
        }
        List<rbc0> list2 = xbc0Var.b;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (rbc0 rbc0Var : list2) {
                rbc0Var.getClass();
                Integer num5 = rbc0Var.f30178a;
                if (num5 == null) {
                    jf4.k(str);
                    return str;
                }
                int iIntValue5 = num5.intValue();
                List<fbc0> list3 = rbc0Var.b;
                if (list3 == null) {
                    jf4.k(str);
                    return str;
                }
                ArrayList arrayList5 = new ArrayList(r3d.q(list3, i6));
                for (fbc0 fbc0Var : list3) {
                    fbc0Var.getClass();
                    Integer num6 = fbc0Var.f9250a;
                    if (num6 == null) {
                        jf4.k(str);
                        return str;
                    }
                    int iIntValue6 = num6.intValue();
                    Long l6 = fbc0Var.b;
                    if (l6 == null) {
                        jf4.k(str);
                        return str;
                    }
                    xbc0 xbc0Var2 = xbc0Var;
                    Date date6 = new Date(l6.longValue());
                    Integer num7 = fbc0Var.c;
                    if (num7 != null) {
                        int iIntValue7 = num7.intValue();
                        if (iIntValue7 != 1) {
                            date = date6;
                            qcc0Var = iIntValue7 != 2 ? iIntValue7 != 3 ? qcc0.d : qcc0.c : qcc0.b;
                        } else {
                            date = date6;
                            qcc0Var = qcc0.f28478a;
                        }
                    } else {
                        date = date6;
                        qcc0Var = qcc0.d;
                    }
                    qcc0 qcc0Var2 = qcc0Var;
                    List list4 = fbc0Var.d;
                    if (list4 == null) {
                        list4 = iun.f15405a;
                    }
                    List list5 = list4;
                    Integer num8 = fbc0Var.e;
                    if (num8 == null) {
                        jf4.k(str);
                        return str;
                    }
                    int iIntValue8 = num8.intValue();
                    if (iIntValue8 != 0) {
                        i3 = 1;
                        icc0Var = iIntValue8 != 1 ? icc0.c : icc0.f14530a;
                    } else {
                        i3 = 1;
                        icc0Var = icc0.b;
                    }
                    icc0 icc0Var2 = icc0Var;
                    Integer num9 = fbc0Var.f;
                    if (num9 == null) {
                        jf4.k(str);
                        return str;
                    }
                    int iIntValue9 = num9.intValue();
                    arrayList5.add(new ecc0(iIntValue6, date, qcc0Var2, list5, icc0Var2, iIntValue9 != 0 ? iIntValue9 != i3 ? jcc0.c : jcc0.f16269a : jcc0.b));
                    xbc0Var = xbc0Var2;
                }
                arrayList.add(new lcc0(iIntValue5, arrayList5));
                i6 = 10;
            }
        } else {
            arrayList = str;
        }
        xbc0 xbc0Var3 = xbc0Var;
        ?? r4 = arrayList;
        if (arrayList == 0) {
            r4 = iun.f15405a;
        }
        ?? r17 = r4;
        List<acc0> list6 = xbc0Var3.c;
        if (list6 != null) {
            arrayList2 = new ArrayList(r3d.q(list6, 10));
            for (acc0 acc0Var : list6) {
                acc0Var.getClass();
                String str3 = acc0Var.f621a;
                if (str3 == null) {
                    jf4.k(str);
                    return str;
                }
                Integer num10 = acc0Var.b;
                if (num10 == null) {
                    jf4.k(str);
                    return str;
                }
                arrayList2.add(new pcc0(str3, num10.intValue()));
            }
        } else {
            arrayList2 = str;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ?? r18 = arrayList2;
        List<lbc0> list7 = xbc0Var3.d;
        if (list7 != null) {
            arrayList3 = new ArrayList(r3d.q(list7, 10));
            for (lbc0 lbc0Var : list7) {
                lbc0Var.getClass();
                String str4 = lbc0Var.f19749a;
                if (str4 == null) {
                    jf4.k(str);
                    return str;
                }
                Integer num11 = lbc0Var.b;
                if (num11 == null) {
                    jf4.k(str);
                    return str;
                }
                arrayList3.add(new hcc0(str4, num11.intValue()));
            }
        } else {
            arrayList3 = str;
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        ?? r19 = arrayList3;
        List<obc0> list8 = xbc0Var3.e;
        if (list8 != null) {
            ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
            for (obc0 obc0Var : list8) {
                obc0Var.getClass();
                String str5 = obc0Var.f24971a;
                if (str5 == null) {
                    jf4.k(str);
                    return str;
                }
                Integer num12 = obc0Var.b;
                if (num12 == null) {
                    jf4.k(str);
                    return str;
                }
                arrayList6.add(new kcc0(str5, num12.intValue()));
            }
            obj = arrayList6;
        } else {
            obj = str;
        }
        if (obj == null) {
            obj = iun.f15405a;
        }
        return new gcc0(date2, date3, arrayList4, iIntValue3, str2, occ0Var, new ncc0(rcc0Var, r17, r18, r19, obj));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:92|24|86|25|26|96|27|28|90|29|30|(1:33)|77) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(3:(1:(3:13|79|66)(2:14|15))(2:16|98)|64|(13:92|24|86|25|26|96|27|28|90|29|30|(1:33)|77)(1:(2:83|84)(1:85)))(4:17|94|18|19))(2:22|(13:92|24|86|25|26|96|27|28|90|29|30|(1:33)|77)(1:(2:83|84)(1:85)))|88|34|35|(1:(0))) */
    /* JADX WARN: Code duplicated, block: B:33:0x0115  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        r8 = r15;
        r15 = r0;
        r0 = r7;
        r7 = r8;
        r8 = r4;
        r4 = r6;
        r20 = r9;
        r9 = r2;
        r10 = r3;
        r3 = r13;
        r2 = r14;
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0132, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0133, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0135, code lost:
    
        r20 = r15;
        r15 = r0;
        r0 = r7;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013d, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0141, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0142, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0144, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0145, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0159 -> B:23:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0193 -> B:66:0x019d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01d2 -> B:79:0x01d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, a.zje r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yuu.j(java.lang.String, java.lang.String, boolean, boolean, a.zje):java.lang.Object");
    }

    @Override // a.opb0
    public void k(Canvas canvas) {
        Drawable drawable = (Drawable) this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void l(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public ewt m(int i) {
        int i2 = 3;
        yje yjeVar = null;
        byte b = 1;
        p6d p6dVar = new p6d(((sjl0) this.b).e(), new i89(new h2c(((t52) ((esg0) this.d).b).f33348a, (byte) 13), (byte) 22), new y8p(i2, yjeVar, (byte) 5), b);
        w5z w5zVar = (w5z) this.c;
        p7m0 p7m0VarA = q7m0.a(w5zVar.J());
        iuy iuyVar = new iuy(w5zVar, p7m0VarA, b);
        fnq fnqVar = new fnq(p7m0VarA, new bai0(w5zVar, iuyVar, yjeVar, (byte) 29));
        jgb0 jgb0Var = new jgb0(w5zVar, iuyVar, (yje) null);
        byte b2 = 0;
        return new ewt(new vuu(new p6d(p6dVar, new dnq(fnqVar, jgb0Var, b2), new y8p(i2, yjeVar, (byte) 4), b), i, b2), this, (byte) 12);
    }

    public omi0 n() {
        gmq dnqVar;
        fck0 fck0Var = (fck0) this.c;
        int iOrdinal = ((xr) this.b).i().ordinal();
        byte b = 0;
        yje yjeVar = null;
        if (iOrdinal != 0) {
            byte b2 = 1;
            if (iOrdinal != 1) {
                dnqVar = new eu4("", (byte) 12);
            } else {
                nvu nvuVar = (nvu) fck0Var.b;
                dnqVar = new dnq(new s6n0((qoj0) nvuVar.c, new cin(nvuVar, yjeVar, (byte) 19)), new gbv(nvuVar, yjeVar, b2), b);
            }
        } else {
            ywu ywuVar = (ywu) fck0Var.c;
            dnqVar = new dnq(new s6n0((qoj0) ywuVar.c, new cin(ywuVar, yjeVar, (byte) 15)), new gbv(ywuVar, yjeVar, b), b);
        }
        return new omi0(dnqVar, this, (byte) 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable o(u270 u270Var, zje zjeVar) {
        ggh0 ggh0Var;
        if (zjeVar instanceof ggh0) {
            ggh0Var = (ggh0) zjeVar;
            int i = ggh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ggh0Var.k = i - Integer.MIN_VALUE;
            } else {
                ggh0Var = new ggh0(this, zjeVar);
            }
        } else {
            ggh0Var = new ggh0(this, zjeVar);
        }
        Object objD0 = ggh0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ggh0Var.k;
        if (i2 == 0) {
            z1x.P(objD0);
            pbt pbtVar = (pbt) this.b;
            String strA = ((ntu) this.c).a();
            boolean zA = ((gst0) this.d).a();
            ggh0Var.k = 1;
            objD0 = qjj.d0(pbtVar.m.b, new tu3(zA, (Object) pbtVar, (Object) u270Var, (Object) strA, (yje) null, (byte) 5), ggh0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objD0) {
            if (x1x.G(((pbv) obj).e)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r12 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(int r11, a.zje r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.esi0
            if (r0 == 0) goto L13
            r0 = r12
            a.esi0 r0 = (a.esi0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.esi0 r0 = new a.esi0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            int r11 = r0.i
            a.z1x.P(r12)
        L2c:
            r6 = r11
            goto L61
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r3
        L34:
            int r11 = r0.i
            a.z1x.P(r12)
            goto L4c
        L3a:
            a.z1x.P(r12)
            java.lang.Object r12 = r10.c
            a.rou r12 = (a.rou) r12
            r0.i = r11
            r0.l = r5
            java.lang.Object r12 = r12.a(r5, r0)
            if (r12 != r1) goto L4c
            goto L60
        L4c:
            a.m2c0 r12 = (a.m2c0) r12
            java.lang.Object r2 = r10.b
            a.stt r2 = (a.stt) r2
            java.lang.String r12 = r12.c
            r0.i = r11
            r0.l = r4
            a.mii0 r2 = r2.f32788a
            java.lang.Object r12 = r2.U(r11, r0, r12)
            if (r12 != r1) goto L2c
        L60:
            return r1
        L61:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L87
            java.lang.Object r10 = r10.d
            a.eqx r10 = (a.eqx) r10
            a.b3c0 r10 = r10.f8256a
            a.x2c0 r10 = r10.b
            a.m2c0 r4 = r10.a()
            if (r4 != 0) goto L78
            goto L87
        L78:
            r8 = -33
            r9 = 255(0xff, float:3.57E-43)
            r5 = 0
            r7 = 0
            a.m2c0 r11 = a.m2c0.a(r4, r5, r6, r7, r8, r9)
            a.p7m0 r10 = r10.f40159a
            r10.o(r3, r11)
        L87:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yuu.p(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r1.n(r10, r12, r5, r6, r7, r8) == r0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(long r10, a.zje r12, java.lang.String r13, boolean r14) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof a.av00
            if (r0 == 0) goto L14
            r0 = r12
            a.av00 r0 = (a.av00) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.n = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            a.av00 r0 = new a.av00
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r8.l
            a.wne r0 = a.wne.f39444a
            int r1 = r8.n
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L33
            if (r1 != r2) goto L2d
            a.z1x.P(r12)
            goto L8a
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L33:
            boolean r14 = r8.k
            long r10 = r8.i
            java.lang.String r13 = r8.j
            a.z1x.P(r12)
        L3c:
            r6 = r13
            r7 = r14
            goto L55
        L3f:
            a.z1x.P(r12)
            java.lang.Object r12 = r9.c
            a.umt r12 = (a.umt) r12
            r8.j = r13
            r8.i = r10
            r8.k = r14
            r8.n = r4
            java.lang.Object r12 = r12.a(r8)
            if (r12 != r0) goto L3c
            goto L89
        L55:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r9.d
            a.rpt r13 = (a.rpt) r13
            java.lang.Object r13 = r13.f30901a
            a.xr r13 = (a.xr) r13
            a.rl40 r13 = r13.i()
            int[] r14 = a.zu00.f44987a
            int r13 = r13.ordinal()
            r13 = r14[r13]
            if (r13 != r4) goto L71
            java.lang.String r13 = "2"
        L6f:
            r5 = r13
            goto L74
        L71:
            java.lang.String r13 = "1"
            goto L6f
        L74:
            java.lang.Object r9 = r9.b
            r1 = r9
            a.yox r1 = (a.yox) r1
            r8.j = r3
            r8.i = r10
            r8.k = r7
            r8.n = r2
            r2 = r10
            r4 = r12
            java.lang.Object r9 = r1.n(r2, r4, r5, r6, r7, r8)
            if (r9 != r0) goto L8a
        L89:
            return r0
        L8a:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yuu.q(long, a.zje, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        if (r12 == r5) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(a.zje r12) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yuu.r(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object s(sip sipVar, CyberGamesPage cyberGamesPage, int i, zje zjeVar) {
        qzu qzuVar;
        sip sipVar2;
        cyu cyuVar;
        CyberGamesPage cyberGamesPage2;
        int i2;
        if (zjeVar instanceof qzu) {
            qzuVar = (qzu) zjeVar;
            int i3 = qzuVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qzuVar.o = i3 - Integer.MIN_VALUE;
            } else {
                qzuVar = new qzu(this, zjeVar);
            }
        } else {
            qzuVar = new qzu(this, zjeVar);
        }
        Object obj = qzuVar.m;
        wne wneVar = wne.f39444a;
        int i4 = qzuVar.o;
        if (i4 == 0) {
            z1x.P(obj);
            cyu cyuVar2 = (cyu) this.c;
            sjl0 sjl0Var = (sjl0) this.b;
            qzuVar.i = cyuVar2;
            sipVar2 = sipVar;
            qzuVar.j = sipVar2;
            qzuVar.k = cyberGamesPage;
            qzuVar.l = i;
            qzuVar.o = 1;
            Serializable serializableD = sjl0Var.d(qzuVar);
            if (serializableD == wneVar) {
                return wneVar;
            }
            cyuVar = cyuVar2;
            obj = serializableD;
            cyberGamesPage2 = cyberGamesPage;
            i2 = i;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = qzuVar.l;
            CyberGamesPage cyberGamesPage3 = qzuVar.k;
            sipVar2 = qzuVar.j;
            cyu cyuVar3 = qzuVar.i;
            z1x.P(obj);
            cyuVar = cyuVar3;
            cyberGamesPage2 = cyberGamesPage3;
        }
        sip sipVar3 = sipVar2;
        List list = (List) obj;
        boolean zA = ((gst0) this.d).a();
        cyuVar.getClass();
        sipVar3.getClass();
        cyberGamesPage2.getClass();
        list.getClass();
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = true;
        lnf0 lnf0VarD = ((knf0) cyuVar.f5196a).d();
        jo20 jo20Var = new jo20();
        qbt.d(jo20Var, i2, zA);
        qbt.g(lnf0VarD.b, jo20Var);
        qbt.h(jo20Var);
        qbt.j(lnf0VarD.f20342a, jo20Var);
        qbt.l(jo20Var);
        qbt.p(jo20Var);
        cyu cyuVar4 = cyuVar;
        return new fnq(new yzq0(gfx.R(((n660) cyuVar.c).r(cyberGamesPage2, sipVar3), kpb.v(sipVar3), null, new zzq0(cyuVar4, sipVar3, cyberGamesPage2, jo20Var.b(), null, (byte) 2), 252), cyuVar4, hie0Var, cyberGamesPage2, list, (byte) 2), new e0r0(cyuVar4, cyberGamesPage2, sipVar3, null));
    }

    public void t(xbq xbqVar, ocq ocqVar) {
        ocqVar.getClass();
        h7q h7qVar = (h7q) this.b;
        h7qVar.d.getClass();
        dev devVar = h7qVar.d;
        devVar.getClass();
        devVar.f5969a = ocqVar;
        long j = h7qVar.c.c;
        xbq xbqVar2 = (xbq) devVar.c.getValue();
        if (xbqVar2 == null || xbqVar.f40612a.f11074a != xbqVar2.f40612a.f11074a || j != xbqVar.c) {
            devVar.getClass();
        }
        List listA0 = CollectionsKt.A0(xbqVar.b, (vvt) this.c);
        listA0.getClass();
        devVar.getClass();
        devVar.b = listA0;
        devVar.getClass();
        devVar.c.o(null, xbqVar);
        devVar.d = ((neu) this.d).a();
    }

    public boolean u() {
        return axq.z(((of6) ((yox) this.b).f43005a).f25150a, "SHOW_BOTTOM_SHEET", true) && ((ort) this.d).f25751a.a() && ((pru) this.c).a().c0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:34|123|35|117|36|37|(1:39)(1:40)|41|42|131|43|44|119|45|46|121|47|133|48|49|127|50|(1:53)|109) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(4:(1:(1:13)(2:14|15))(1:16)|96|85|(24:34|123|35|117|36|37|(1:39)(1:40)|41|42|131|43|44|119|45|46|121|47|133|48|49|127|50|(1:53)|109)(1:(2:113|114)(1:115)))(4:17|129|18|19)|125|54|(1:56)|57|58) */
    /* JADX WARN: Code duplicated, block: B:101:0x0286  */
    /* JADX WARN: Code duplicated, block: B:103:0x028d  */
    /* JADX WARN: Code duplicated, block: B:104:0x028f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0294  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x02be  */
    /* JADX WARN: Code duplicated, block: B:112:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0143  */
    /* JADX WARN: Code duplicated, block: B:39:0x0153  */
    /* JADX WARN: Code duplicated, block: B:40:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x0197  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0225  */
    /* JADX WARN: Code duplicated, block: B:86:0x0232  */
    /* JADX WARN: Code duplicated, block: B:88:0x023b  */
    /* JADX WARN: Code duplicated, block: B:89:0x023d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0242  */
    /* JADX WARN: Code duplicated, block: B:95:0x0262  */
    /* JADX WARN: Code duplicated, block: B:97:0x026a  */
    /* JADX WARN: Code duplicated, block: B:99:0x027b  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02b1, code lost:
    
        if (a.qcc.P(r13, r10) == r5) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0264, code lost:
    
        r9 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cd, code lost:
    
        r10 = r4;
        r6 = r7;
        r8 = r9;
        r4 = r15;
        r1 = r18;
        r9 = r0;
        r0 = r3;
        r15 = r12;
        r11 = r20;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01df, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e0, code lost:
    
        r25 = r3;
        r23 = r8;
        r27 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e6, code lost:
    
        r1 = r9;
        r9 = r0;
        r0 = r1;
        r15 = r32;
        r1 = r18;
        r8 = r23;
        r3 = r25;
        r10 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fb, code lost:
    
        r1 = r9;
        r9 = r0;
        r0 = r1;
        r15 = r32;
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0203, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0204, code lost:
    
        r32 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020f, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0212, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0214, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0215, code lost:
    
        r25 = r3;
        r23 = r8;
        r27 = r10;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x02be -> B:33:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0225 -> B:85:0x022e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(int r32, int r33, long r34, a.zje r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yuu.v(int, int, long, a.zje):java.lang.Object");
    }

    public /* synthetic */ yuu(Object obj, Object obj2, Object obj3, byte b) {
        this.f43286a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public yuu(h7q h7qVar, qdq qdqVar, vvt vvtVar, neu neuVar) {
        this.f43286a = (byte) 19;
        h7qVar.getClass();
        this.b = h7qVar;
        this.c = vvtVar;
        this.d = neuVar;
    }

    public yuu(tpb0 tpb0Var) {
        this.f43286a = (byte) 15;
        this.b = tpb0Var;
    }

    public yuu(dn0 dn0Var, xoc xocVar, j1q0 j1q0Var) {
        this.f43286a = (byte) 22;
        j1q0Var.getClass();
        this.b = dn0Var;
        this.c = xocVar;
        this.d = j1q0Var;
    }

    public yuu(hsj hsjVar, lbu lbuVar, pru pruVar) {
        this.f43286a = (byte) 2;
        lbuVar.getClass();
        pruVar.getClass();
        this.b = hsjVar;
        this.c = lbuVar;
        this.d = pruVar;
    }

    public yuu(xr xrVar, fck0 fck0Var) {
        this.f43286a = (byte) 24;
        this.b = xrVar;
        this.c = fck0Var;
        this.d = Pattern.compile("\\d{4,}");
    }

    public yuu(zn00 zn00Var, knf0 knf0Var, btt0 btt0Var, vby vbyVar) {
        this.f43286a = (byte) 18;
        knf0Var.getClass();
        btt0Var.getClass();
        vbyVar.getClass();
        this.b = zn00Var;
        this.c = knf0Var;
        this.d = vbyVar;
    }

    public yuu(pbt pbtVar, ntu ntuVar, gst0 gst0Var) {
        this.f43286a = (byte) 20;
        pbtVar.getClass();
        gst0Var.getClass();
        this.b = pbtVar;
        this.c = ntuVar;
        this.d = gst0Var;
    }

    public yuu(cyu cyuVar, sjl0 sjl0Var, gst0 gst0Var) {
        this.f43286a = (byte) 1;
        sjl0Var.getClass();
        gst0Var.getClass();
        this.c = cyuVar;
        this.b = sjl0Var;
        this.d = gst0Var;
    }

    public yuu(mne mneVar, g090 g090Var, knf0 knf0Var) {
        this.f43286a = (byte) 14;
        knf0Var.getClass();
        this.b = g090Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public yuu(mne mneVar, hcp0 hcp0Var, knf0 knf0Var) {
        this.f43286a = (byte) 26;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = hcp0Var;
        this.d = knf0Var;
    }

    public yuu(abu abuVar, knf0 knf0Var, mne mneVar) {
        this.f43286a = (byte) 5;
        knf0Var.getClass();
        this.b = abuVar;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public yuu(w4p0 w4p0Var, dlr0 dlr0Var, knf0 knf0Var) {
        this.f43286a = (byte) 28;
        dlr0Var.getClass();
        knf0Var.getClass();
        this.b = w4p0Var;
        this.c = dlr0Var;
        this.d = knf0Var;
    }

    public yuu(mne mneVar, nw20 nw20Var, knf0 knf0Var) {
        this.f43286a = (byte) 17;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = nw20Var;
        this.d = knf0Var;
    }

    public yuu(sjl0 sjl0Var, w5z w5zVar, esg0 esg0Var) {
        this.f43286a = (byte) 0;
        sjl0Var.getClass();
        this.b = sjl0Var;
        this.c = w5zVar;
        this.d = esg0Var;
    }

    public yuu(mne mneVar, kd30 kd30Var, knf0 knf0Var) {
        this.f43286a = (byte) 23;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = kd30Var;
        this.d = knf0Var;
    }

    public yuu(scc0 scc0Var, yj yjVar, btt0 btt0Var) {
        this.f43286a = (byte) 16;
        yjVar.getClass();
        btt0Var.getClass();
        this.b = scc0Var;
        this.c = yjVar;
        this.d = btt0Var;
    }

    public yuu(jfk jfkVar, yox yoxVar) {
        this.f43286a = (byte) 13;
        this.b = jfkVar;
        this.c = yoxVar;
        this.d = new ConcurrentHashMap();
    }

    public yuu(String str, HashMap map) {
        this.f43286a = (byte) 4;
        this.b = str;
        this.c = map;
        this.d = new HashMap();
    }

    public yuu(ph30 ph30Var, View view) {
        Object qh30Var;
        this.f43286a = (byte) 10;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            qh30Var = new sh30();
        } else {
            qh30Var = i >= 33 ? new qh30() : null;
        }
        this.b = qh30Var;
        this.c = ph30Var;
        this.d = view;
    }

    public yuu(Context context, LocationManager locationManager) {
        this.f43286a = (byte) 29;
        this.d = new kfn0();
        this.b = context;
        this.c = locationManager;
    }

    public yuu(List list, xun xunVar, iun iunVar, xun xunVar2) {
        this.f43286a = (byte) 11;
        iunVar.getClass();
        xunVar2.getClass();
        this.b = list;
        this.c = xunVar;
        this.d = iunVar;
    }

    public yuu() {
        this.f43286a = (byte) 27;
        this.b = new dj10(8);
    }
}
