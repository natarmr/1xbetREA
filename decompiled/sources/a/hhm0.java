package a;

import android.gov.nist.core.Separators;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.android.HwBuildEx;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hhm0 {
    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    public static final vcm0 A(k9p0 k9p0Var, String str) {
        String str2;
        String value;
        String strValueOf = String.valueOf(k9p0Var.f17926a);
        long j = k9p0Var.k;
        String str3 = k9p0Var.i;
        if (str3.length() != 0) {
            bh30 bh30VarB = new Regex("\\d+[:-]\\d+|\\d+ - \\d+").b(str3);
            String strR = (bh30VarB == null || (value = bh30VarB.getValue()) == null) ? null : kotlin.text.c.r(value, Separators.COLON, " : ", false);
            if (strR == null) {
                str2 = "";
            } else {
                str2 = strR;
            }
        } else {
            str2 = "";
        }
        l9p0 l9p0Var = k9p0Var.g;
        String str4 = l9p0Var.f19667a;
        String str5 = (String) CollectionsKt.firstOrNull(l9p0Var.b);
        if (str5 == null) {
            str5 = "";
        }
        iun iunVar = iun.f15405a;
        y6p0 y6p0Var = new y6p0(iunVar, "", str4, str5);
        l9p0 l9p0Var2 = k9p0Var.h;
        String str6 = l9p0Var2.f19667a;
        String str7 = (String) CollectionsKt.firstOrNull(l9p0Var2.b);
        if (str7 == null) {
            str7 = "";
        }
        return new vcm0(strValueOf, 40L, str, j, str2, "0", "0", y6p0Var, new y6p0(iunVar, "", str6, str7), 0, 0, true, str, false, false, "0", "0");
    }

    public static final q9b B(Integer num) {
        Object next;
        c0o c0oVar = q9b.d;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (true) {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            int i = ((q9b) next).f28339a;
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        q9b q9bVar = (q9b) next;
        return q9bVar == null ? q9b.NONE : q9bVar;
    }

    public static final fxs0 C(ygs ygsVar) {
        ygsVar.getClass();
        List list = ygsVar.r;
        String str = (String) CollectionsKt.W(0, list);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, list);
        String str3 = str2 != null ? str2 : "";
        String str4 = ygsVar.o;
        return new fxs0(str4, new c280(vsm0.s(ygsVar.k, str), R.drawable.ic_glyph_placeholder_player), StringsKt__StringsKt.split$default(str4, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1 ? new c280(vsm0.s(ygsVar.j, str3), R.drawable.ic_glyph_placeholder_player) : null);
    }

    public static final ArrayList D(c5q c5qVar, final long j, final int i, final Map map, final boolean z, final boolean z2, final sff0 sff0Var, List list, final vh0 vh0Var, final int i2) {
        map.getClass();
        list.getClass();
        vh0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((lok0) obj).t.contains(6)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new tx10((lok0) it.next()));
        }
        return CollectionsKt.q0(arrayList2, pgi0.t(pgi0.p(c5qVar, new Function1() { // from class: a.p8r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                iz30 iz30Var = (iz30) obj2;
                iz30Var.getClass();
                int iOrdinal = iz30Var.ordinal();
                boolean z3 = z;
                sff0 sff0Var2 = sff0Var;
                if (iOrdinal == 9) {
                    return new lx10(iz30Var, sff0Var2.d.f27973a.b, z3);
                }
                if (iOrdinal == 21) {
                    return new xx10(iz30Var, i2);
                }
                if (iOrdinal == 24) {
                    return new hx10(iz30Var, z2, z3);
                }
                if (iOrdinal == 39) {
                    return new ix10(iz30Var, j);
                }
                if (iOrdinal == 50) {
                    return new ux10(iz30Var);
                }
                if (iOrdinal == 61) {
                    return new gx10(iz30.A, vh0Var);
                }
                String string = "";
                if (iOrdinal == 32) {
                    int i3 = sff0Var2.c.n;
                    if (i3 != 0) {
                        bzu bzuVar = new bzu((byte) 23);
                        bzuVar.g("static");
                        bzuVar.g("img");
                        bzuVar.g("ImgDefault");
                        bzuVar.g("Esports");
                        bzuVar.g("ButtonImage");
                        bzuVar.g(i3 + ".png");
                        string = ((StringBuilder) bzuVar.b).toString();
                    }
                    return new mx10(iz30Var, string);
                }
                if (iOrdinal == 33) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    if (StringsKt.O("/static/img/ImgDefault/MMA/UFC/Menu_Button.png", ujn.h, false) || kotlin.text.c.x("/static/img/ImgDefault/MMA/UFC/Menu_Button.png", "https://", false)) {
                        sb.setLength(0);
                        sb.append("/static/img/ImgDefault/MMA/UFC/Menu_Button.png");
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0("/static/img/ImgDefault/MMA/UFC/Menu_Button.png", '/'));
                    }
                    return new wx10(iz30Var, sb.toString());
                }
                if (iOrdinal == 46) {
                    return new px10(iz30Var, i, sff0Var2.l.c);
                }
                if (iOrdinal == 47) {
                    return new kx10(iz30Var);
                }
                if (iOrdinal == 65) {
                    return new vx10(iz30Var);
                }
                if (iOrdinal != 66) {
                    switch (iOrdinal) {
                        case 13:
                            return new rx10(iz30Var);
                        case 14:
                            return new qx10(iz30Var);
                        case 15:
                            String str = (String) map.get(iz30Var);
                            return new lx10(iz30Var, str != null ? str : "", z3);
                        default:
                            return new sx10(iz30Var, z3);
                    }
                }
                StringBuilder sb2 = new StringBuilder(ujn.h);
                if (StringsKt.O("/static/img/ImgDefault/Polybet/polybet_menu_cell.png", ujn.h, false) || kotlin.text.c.x("/static/img/ImgDefault/Polybet/polybet_menu_cell.png", "https://", false)) {
                    sb2.setLength(0);
                    sb2.append("/static/img/ImgDefault/Polybet/polybet_menu_cell.png");
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0("/static/img/ImgDefault/Polybet/polybet_menu_cell.png", '/'));
                }
                return new ox10(iz30Var, sb2.toString());
            }
        })));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    public static final b1u0 E(h1u0 h1u0Var) {
        ?? arrayList;
        h1u0Var.getClass();
        Integer num = h1u0Var.f12302a;
        int iIntValue = num != null ? num.intValue() : -1;
        Long l = h1u0Var.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = h1u0Var.c;
        String str2 = str == null ? "" : str;
        String strE = lmc.E(h1u0Var.d);
        List<e1u0> list = h1u0Var.f;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (e1u0 e1u0Var : list) {
                e1u0Var.getClass();
                Integer num2 = e1u0Var.f7054a;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                String str3 = e1u0Var.b;
                if (str3 == null) {
                    str3 = "";
                }
                String strE2 = lmc.E(e1u0Var.h);
                String strE3 = lmc.E(e1u0Var.e);
                String str4 = e1u0Var.c;
                arrayList.add(new x0u0(iIntValue2, str3, strE2, strE3, str4 == null ? "" : str4));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new b1u0(iIntValue, jLongValue, str2, strE, arrayList);
    }

    public static final void F(i73 i73Var, l73 l73Var) {
        ((hgk0) l73Var.b).setValue(((hgk0) i73Var.e).getValue());
        t73 t73Var = l73Var.c;
        t73 t73Var2 = i73Var.f;
        int iB = t73Var.b();
        for (int i = 0; i < iB; i++) {
            t73Var.e(t73Var2.a(i), i);
        }
        l73Var.e = i73Var.h;
        l73Var.d = i73Var.g;
        l73Var.f = ((Boolean) ((hgk0) i73Var.i).getValue()).booleanValue();
    }

    public static void G(String str, ufw0 ufw0Var, ngw0 ngw0Var, xfw0 xfw0Var, fht0 fht0Var) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = ufw0Var.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
            httpURLConnection.setReadTimeout(60000);
            fht0Var.w(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                H(httpURLConnection, ngw0Var, xfw0Var);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            ngw0Var.mo2zza(Payload.RESPONSE_TIMEOUT);
        } catch (UnknownHostException unused2) {
            ngw0Var.mo2zza("<<Network Error>>");
        } catch (IOException e) {
            e = e;
            ngw0Var.mo2zza(e.getMessage());
        } catch (NullPointerException e2) {
            e = e2;
            ngw0Var.mo2zza(e.getMessage());
        } catch (JSONException e3) {
            e = e3;
            ngw0Var.mo2zza(e.getMessage());
        }
    }

    public static void H(HttpURLConnection httpURLConnection, ngw0 ngw0Var, xfw0 xfw0Var) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                boolean z = false;
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (responseCode >= 200 && responseCode < 300) {
                    z = true;
                }
                if (z) {
                    ngw0Var.h(egm0.w(string, xfw0Var));
                } else {
                    ngw0Var.mo2zza(egm0.x(string));
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                httpURLConnection.disconnect();
                throw th3;
            }
        } catch (udw0 e) {
            e = e;
            ngw0Var.mo2zza(e.getMessage());
            httpURLConnection.disconnect();
        } catch (SocketTimeoutException unused) {
            ngw0Var.mo2zza(Payload.RESPONSE_TIMEOUT);
            httpURLConnection.disconnect();
        } catch (IOException e2) {
            e = e2;
            ngw0Var.mo2zza(e.getMessage());
            httpURLConnection.disconnect();
        }
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1524326847);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundGroup = s6t0.b().f33626a.getBackgroundGroup();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new tf5(R.drawable.ic_status_green_plus_circle, new y3d(backgroundGroup), 4);
                fetVar.o0(objP);
            }
            thb.f(mm40Var, (tf5) objP, fetVar, (i2 & 14) | 48, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 10);
        }
    }

    public static final void b(mm40 mm40Var, pwr0 pwr0Var, k6z k6zVar, Function1 function1, fet fetVar, int i) {
        int i2;
        k6zVar.getClass();
        fetVar.g0(-1829900112);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(pwr0Var) : fetVar.i(pwr0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(k6zVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(bmd.n.a(k6zVar), u1c.M(-1525058192, new gdr0((Object) mm40Var, (Object) pwr0Var, (Object) function1, (byte) 6), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 17, i, (Object) mm40Var, (Object) pwr0Var, (Object) k6zVar, (Object) function1);
        }
    }

    public static final void c(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1285754931);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ntu0(function1, b);
                fetVar.o0(objP);
            }
            jcb.l(mm40Var, mdmVar, false, (Function0) objP, fetVar, i2 & 126, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var, mdmVar, function1, i, (byte) 8);
        }
    }

    public static final void d(int i, fet fetVar) {
        fetVar.g0(-1889413737);
        if (fetVar.U(i & 1, i != 0)) {
            s0x.t(iym0.r((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L)), 48, fetVar, o7k0.d(jm40.b, 1.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i9v0(i, (byte) 5);
        }
    }

    public static final void e(a4x a4xVar, fet fetVar, int i) {
        a4xVar.getClass();
        fetVar.g0(1106288516);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), "STATISTIC_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1084363014, a4xVar);
            while (itO.hasNext()) {
                m4m0 m4m0Var = (m4m0) itO.next();
                if (m4m0Var != null) {
                    if (m4m0Var instanceof k4m0) {
                        fetVar.e0(-1158541775);
                        o5n0.e((k4m0) m4m0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (m4m0Var instanceof l4m0) {
                        fetVar.e0(-1158539374);
                        dnm0.g((l4m0) m4m0Var, fetVar, 0);
                        fetVar.r(false);
                    }
                }
                throw b1j.f(-1158543917, fetVar, false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 23);
        }
    }

    public static final void f(mm40 mm40Var, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(454840396);
        int i2 = i | 6 | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 60.0f), 4.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.a(20.0f));
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new g4p0(function1, (byte) 17);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
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
            zx7 zx7Var2 = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarN2 = o7k0.n(jr8Var.b(jm40Var, zx7Var2), 24.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_first_team, 0, fetVar2);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            dww.c(pm80VarF, null, mm40VarN2, staticColors.m122getViolet0d7_KjU(), fetVar2, 56, 0);
            a(0, fetVar2, ffb0.Q(jr8Var.b(jm40Var, gqw0.i), 4.0f, 4.0f));
            fetVar2.r(true);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarN3 = s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f, 0.0f, 0.0f, 0.0f, 14);
            String strW = rsm0.w(R.string.team_first, 0, fetVar2);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            mm40Var2 = jm40Var;
            v8q0.a(strW, mm40VarN3, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 3, 0, null, g1t0.k(), fetVar, 0, 24960, 109560);
            dww.c(a8k0.F(R.drawable.ic_glyph_versus, 0, fetVar), null, o7k0.n(mm40Var2, 24.0f), s6t0.b().f33626a.getPrimary(), fetVar, 56, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarN4 = s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            String strW2 = rsm0.w(R.string.team_sec, 0, fetVar);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(strW2, mm40VarN4, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, g1t0.k(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarQ2 = i120.Q(o7k0.n(mm40Var2, 40.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.a(20.0f));
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new g4p0(function2, (byte) 18);
                fetVar2.o0(objP2);
            } else {
                function2 = function1;
            }
            mm40 mm40VarW2 = y860.W(mm40VarQ2, null, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarW2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_second_team, 0, fetVar2), null, jr8Var.b(o7k0.n(mm40Var2, 24.0f), zx7Var2), staticColors.m119getTeal0d7_KjU(), fetVar2, 56, 0);
            a(0, fetVar2, ffb0.Q(jr8Var.b(mm40Var2, gqw0.g), -4.0f, 4.0f));
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbc(mm40Var2, function2, i, (byte) 3);
        }
    }

    public static final void g(pwr0 pwr0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1862364460);
        int i2 = (fetVar.g(pwr0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (pwr0Var.c.isEmpty()) {
            fetVar.e0(-686428746);
            fetVar.r(false);
        } else {
            fetVar.e0(-687715525);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 48.0f);
            lh80 lh80Var = new lh80(xfn.a(fetVar).e, 8.0f, xfn.a(fetVar).e, 8.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b8q0((Object) pwr0Var, (Object) function1, (byte) 22);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE, null, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(pwr0Var, function1, i, (byte) 4);
        }
    }

    public static final void h(pwr0 pwr0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1948079872);
        int i2 = i | (fetVar2.g(pwr0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
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
            lgb.v(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 22.0f), pwr0Var.b, R.drawable.ic_glyph_placeholder_player, StaticColors.INSTANCE.m86getDarkGray0d7_KjU(), gqw0.f1, fetVar2, 196608, 0);
            v8q0.a(pwr0Var.f27725a, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), y3d.c, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 384, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p6r0(pwr0Var, i, (byte) 14);
        }
    }

    public static final void i(mm40 mm40Var, yfs0 yfs0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        yfs0Var.getClass();
        fetVar2.g0(1942082952);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(yfs0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40Var, backgroundContent, vgg0.a(16.0f)), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            v8q0.a(yfs0Var.b, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            jcb.a(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), yfs0Var.c, fetVar2, 0, 0);
            jcb.a(null, yfs0Var.d, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, yfs0Var, i, (byte) 8);
        }
    }

    public static final void j(mm40 mm40Var, qfr0 qfr0Var, d9z d9zVar, hh80 hh80Var, Function1 function1, fet fetVar, int i) {
        qfr0Var.getClass();
        d9zVar.getClass();
        hh80Var.getClass();
        function1.getClass();
        fetVar.g0(322173059);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(qfr0Var) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            bml bmlVar = qfr0Var.b;
            int i3 = 57344 & i2;
            boolean z = i3 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new sbt0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = i3 == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new sbt0(function1, (byte) 25);
                fetVar.o0(objP2);
            }
            ckb.f(mm40Var, bmlVar, d9zVar, hh80Var, null, null, function2, (Function1) objP2, fetVar, i2 & 8078, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvl0((Object) mm40Var, (Object) qfr0Var, (Object) d9zVar, (Object) hh80Var, (Object) function1, i, (byte) 7);
        }
    }

    public static final void k(ir8 ir8Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1166566338);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zlv0 zlv0Var = (zlv0) l7m0Var.getValue();
            if (zlv0Var != null) {
                if (zlv0Var instanceof ylv0) {
                    fetVar.e0(83794096);
                    d(0, fetVar);
                    fetVar.r(false);
                } else {
                    boolean z = zlv0Var instanceof xlv0;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar.e0(-1697287233);
                        c(ir8Var.b(jm40Var, gqw0.e), ((xlv0) zlv0Var).e, function1, fetVar, i2 & 896);
                        fetVar.r(false);
                    } else if (zlv0Var instanceof wlv0) {
                        fetVar.e0(-1697032475);
                        a4x a4xVar = ((wlv0) zlv0Var).e;
                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                        boolean z2 = (i2 & 896) == 256;
                        Object objP = fetVar.P();
                        if (z2 || objP == ukd.f35823a) {
                            objP = new szu0(function1, (byte) 7);
                            fetVar.o0(objP);
                        }
                        gkb.c(a4xVar, mm40VarD, (Function1) objP, 0, fetVar, 48, 8);
                        fetVar.r(false);
                    }
                }
            }
            throw b1j.f(83792275, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nuh(ir8Var, l7m0Var, function1, i, (byte) 4);
        }
    }

    public static final Object l(float f, float f2, float f3, j73 j73Var, Function2 function2, bnn0 bnn0Var) {
        lxs0 lxs0Var = hp4.j;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Function1 function1 = lxs0Var.f20832a;
        t73 t73VarC = (t73) function1.invoke(f6);
        if (t73VarC == null) {
            t73VarC = ((t73) function1.invoke(f4)).c();
        }
        t73 t73Var = t73VarC;
        Object objM = m(new l73(lxs0Var, f4, t73Var, 56), new wto0(j73Var, lxs0Var, f4, f5, t73Var), Long.MIN_VALUE, new nrk(function2, (byte) 4), bnn0Var);
        wne wneVar = wne.f39444a;
        if (objM != wneVar) {
            objM = Unit.f46060a;
        }
        return objM == wneVar ? objM : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015f  */
    /* JADX WARN: Code duplicated, block: B:68:0x016e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object m(l73 l73Var, z63 z63Var, long j, Function1 function1, zje zjeVar) {
        ymn0 ymn0Var;
        mie0 mie0Var;
        l73 l73Var2;
        l73 l73Var3;
        mie0 mie0Var2;
        Object objE;
        Function1 function2;
        i73 i73Var;
        i73 i73Var2;
        Object objE2;
        z63 z63Var2 = z63Var;
        if (zjeVar instanceof ymn0) {
            ymn0Var = (ymn0) zjeVar;
            int i = ymn0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ymn0Var.n = i - Integer.MIN_VALUE;
            } else {
                ymn0Var = new ymn0(zjeVar);
            }
        } else {
            ymn0Var = new ymn0(zjeVar);
        }
        ymn0 ymn0Var2 = ymn0Var;
        Object obj = ymn0Var2.m;
        wne wneVar = wne.f39444a;
        int i2 = ymn0Var2.n;
        byte b = 13;
        byte b2 = 0;
        if (i2 == 0) {
            z1x.P(obj);
            Object objF = z63Var2.f(0L);
            t73 t73VarB = z63Var2.b(0L);
            mie0Var = new mie0();
            if (j == Long.MIN_VALUE) {
                try {
                    l73Var2 = l73Var;
                    try {
                        y6s y6sVar = new y6s(mie0Var, objF, z63Var2, t73VarB, l73Var2, v(ymn0Var2.getContext()), function1);
                        mie0Var2 = mie0Var;
                        try {
                            ymn0Var2.i = l73Var2;
                            ymn0Var2.j = z63Var2;
                            ymn0Var2.k = function1;
                            ymn0Var2.l = mie0Var2;
                            ymn0Var2.n = 1;
                            if (z63Var2.a()) {
                                objE = r7x.K(y6sVar, ymn0Var2);
                            } else {
                                objE = s0x.P(ymn0Var2.getContext()).e(new zbm0(y6sVar, b), ymn0Var2);
                            }
                            if (objE != wneVar) {
                                l73Var3 = l73Var2;
                                function2 = function1;
                                mie0Var = mie0Var2;
                            }
                            return wneVar;
                        } catch (CancellationException e) {
                            e = e;
                            l73Var3 = l73Var2;
                            mie0Var = mie0Var2;
                            i73Var = (i73) mie0Var.f21842a;
                            if (i73Var != null) {
                                ((hgk0) i73Var.i).setValue(Boolean.FALSE);
                            }
                            i73Var2 = (i73) mie0Var.f21842a;
                            if (i73Var2 != null) {
                                l73Var3.f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        l73Var3 = l73Var2;
                        i73Var = (i73) mie0Var.f21842a;
                        if (i73Var != null) {
                            ((hgk0) i73Var.i).setValue(Boolean.FALSE);
                        }
                        i73Var2 = (i73) mie0Var.f21842a;
                        if (i73Var2 != null) {
                            l73Var3.f = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    l73Var2 = l73Var;
                }
            } else {
                mie0Var2 = mie0Var;
                try {
                    i73 i73Var3 = new i73(objF, z63Var2.e(), t73VarB, j, z63Var2.g(), j, new xmn0(l73Var, b2));
                    t(i73Var3, j, v(ymn0Var2.getContext()), z63Var2, l73Var, function1);
                    mie0Var2.f21842a = i73Var3;
                    l73Var3 = l73Var;
                    z63Var2 = z63Var;
                    function2 = function1;
                    mie0Var = mie0Var2;
                } catch (CancellationException e4) {
                    e = e4;
                    l73Var3 = l73Var;
                    mie0Var = mie0Var2;
                    i73Var = (i73) mie0Var.f21842a;
                    if (i73Var != null) {
                        ((hgk0) i73Var.i).setValue(Boolean.FALSE);
                    }
                    i73Var2 = (i73) mie0Var.f21842a;
                    if (i73Var2 != null) {
                        l73Var3.f = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = ymn0Var2.l;
            function2 = ymn0Var2.k;
            z63Var2 = ymn0Var2.j;
            l73Var3 = ymn0Var2.i;
            try {
                z1x.P(obj);
            } catch (CancellationException e5) {
                e = e5;
                i73Var = (i73) mie0Var.f21842a;
                if (i73Var != null) {
                    ((hgk0) i73Var.i).setValue(Boolean.FALSE);
                }
                i73Var2 = (i73) mie0Var.f21842a;
                if (i73Var2 != null) {
                    l73Var3.f = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = mie0Var.f21842a;
            obj2.getClass();
            if (!((Boolean) ((hgk0) ((i73) obj2).i).getValue()).booleanValue()) {
                return Unit.f46060a;
            }
            mie0 mie0Var3 = mie0Var;
            Function1 function3 = function2;
            z63 z63Var3 = z63Var2;
            l73 l73Var4 = l73Var3;
            try {
                m9x m9xVar = new m9x(mie0Var3, v(ymn0Var2.getContext()), z63Var3, l73Var4, function3);
                mie0Var = mie0Var3;
                z63Var2 = z63Var3;
                l73Var3 = l73Var4;
                function2 = function3;
                ymn0Var2.i = l73Var3;
                ymn0Var2.j = z63Var2;
                ymn0Var2.k = function2;
                ymn0Var2.l = mie0Var;
                ymn0Var2.n = 2;
                if (z63Var2.a()) {
                    objE2 = r7x.K(m9xVar, ymn0Var2);
                } else {
                    objE2 = s0x.P(ymn0Var2.getContext()).e(new zbm0(m9xVar, b), ymn0Var2);
                }
            } catch (CancellationException e6) {
                e = e6;
                mie0Var = mie0Var3;
                l73Var3 = l73Var4;
                i73Var = (i73) mie0Var.f21842a;
                if (i73Var != null) {
                    ((hgk0) i73Var.i).setValue(Boolean.FALSE);
                }
                i73Var2 = (i73) mie0Var.f21842a;
                if (i73Var2 != null && i73Var2.g == l73Var3.d) {
                    l73Var3.f = false;
                }
                throw e;
            }
        } while (objE2 != wneVar);
        return wneVar;
    }

    public static /* synthetic */ Object n(float f, float f2, j73 j73Var, Function2 function2, bnn0 bnn0Var, int i) {
        if ((i & 8) != 0) {
            j73Var = ro4.g0(0.0f, 0.0f, null, 7);
        }
        return l(f, f2, 0.0f, j73Var, function2, bnn0Var);
    }

    public static final Object o(l73 l73Var, sjj sjjVar, boolean z, Function1 function1, zje zjeVar) {
        Object objM = m(l73Var, new rjj(sjjVar, l73Var.f19537a, ((hgk0) l73Var.b).getValue(), l73Var.c), z ? l73Var.d : Long.MIN_VALUE, function1, zjeVar);
        return objM == wne.f39444a ? objM : Unit.f46060a;
    }

    public static final Object p(l73 l73Var, Float f, j73 j73Var, boolean z, Function1 function1, zje zjeVar) {
        Object objM = m(l73Var, new wto0(j73Var, l73Var.f19537a, ((hgk0) l73Var.b).getValue(), f, l73Var.c), z ? l73Var.d : Long.MIN_VALUE, function1, zjeVar);
        return objM == wne.f39444a ? objM : Unit.f46060a;
    }

    public static /* synthetic */ Object q(l73 l73Var, Float f, j73 j73Var, boolean z, Function1 function1, zje zjeVar, int i) {
        if ((i & 2) != 0) {
            j73Var = ro4.g0(0.0f, 0.0f, null, 7);
        }
        j73 j73Var2 = j73Var;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new rgn0((byte) 3);
        }
        return p(l73Var, f, j73Var2, z2, function1, zjeVar);
    }

    public static final LinkedHashMap r(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 3; i++) {
            int i2 = i * 3;
            linkedHashMap.put(Integer.valueOf(i), arrayList.subList(i2, i2 + 3));
        }
        return linkedHashMap;
    }

    public static final i4 s(boolean z, boolean z2, boolean z3, boolean z4, ctf0 ctf0Var, String str, double d, boolean z5, boolean z6) {
        ctf0Var.getClass();
        str.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        if (z) {
            lc00VarB.add(new tso0("LIVE", ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), oro0.f25744a));
        }
        xqo0 xqo0Var = xqo0.f41332a;
        if (z2) {
            lc00VarB.add(new tso0("PROMO", ctf0Var.b.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), xqo0Var));
        }
        if (str.length() > 0) {
            lc00VarB.add(new tso0(str, str, ero0.f8292a));
        }
        if (d != 0.0d) {
            lc00VarB.add(new tso0(str, ctf0Var.b.a(R.string.advance, Arrays.copyOf(new Object[0], 0)), gpo0.f11692a));
        }
        if (z3) {
            lc00VarB.add(new tso0("AUTO_SALE", ctf0Var.b.a(R.string.history_auto_sale, Arrays.copyOf(new Object[0], 0)), zro0.f44866a));
        }
        if (z4) {
            lc00VarB.add(new tso0("AUTO_SUB", ctf0Var.b.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)), xqo0Var));
        }
        if (z5) {
            lc00VarB.add(new tso0("OPTION_BET", ctf0Var.b.a(R.string.option_bet_label, Arrays.copyOf(new Object[0], 0)), hqo0.f13494a));
        }
        if (z6) {
            lc00VarB.add(new tso0("EACH_WAY", ctf0Var.b.a(R.string.each_way, Arrays.copyOf(new Object[0], 0)), opo0.f25653a));
        }
        return dyb.r0(kotlin.collections.a.a(lc00VarB));
    }

    public static final void t(i73 i73Var, long j, float f, z63 z63Var, l73 l73Var, Function1 function1) {
        long jD = f == 0.0f ? z63Var.d() : (long) ((j - i73Var.c) / f);
        i73Var.g = j;
        ((hgk0) i73Var.e).setValue(z63Var.f(jD));
        i73Var.f = z63Var.b(jD);
        if (z63Var.c(jD)) {
            i73Var.h = i73Var.g;
            ((hgk0) i73Var.i).setValue(Boolean.FALSE);
        }
        F(i73Var, l73Var);
        function1.invoke(i73Var);
    }

    public static final ufp0 u(odt0 odt0Var, String str) {
        Object next;
        List list = odt0Var.c;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((gip0) next).f11360a, str));
            gip0 gip0Var = (gip0) next;
            if (gip0Var != null) {
                return dnm0.q(gip0Var);
            }
        }
        return new ufp0(0, "", "", "", iun.f15405a);
    }

    public static final float v(CoroutineContext coroutineContext) {
        ks40 ks40Var = (ks40) coroutineContext.get(ujn.u);
        float fD = ks40Var != null ? ks40Var.d() : 1.0f;
        if (fD >= 0.0f) {
            return fD;
        }
        fsb0.b("negative scale factor");
        return fD;
    }

    public static final ArrayList w(List list) {
        int size = 9 - list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int iC = 0; iC < size; iC = w6x.c(0, iC, 1, arrayList)) {
        }
        return CollectionsKt.q0(list, arrayList);
    }

    public static final fyl0 x(fab fabVar) {
        iyl0 hyl0Var;
        Object next;
        oab oabVarY = y(fabVar.c);
        q9b q9bVarB = B(fabVar.d);
        oab oabVar = oab.FORM;
        List<String> list = fabVar.f9200a;
        List list2 = null;
        if (oabVarY == oabVar) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (String str : list) {
                    y2m0 y2m0Var = z2m0.b;
                    Integer intOrNull = StringsKt.toIntOrNull(str);
                    int iIntValue = intOrNull != null ? intOrNull.intValue() : -1;
                    y2m0Var.getClass();
                    Iterator it = z2m0.e.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((z2m0) next).f43677a != iIntValue);
                    z2m0 z2m0Var = (z2m0) next;
                    if (z2m0Var == null) {
                        z2m0Var = z2m0.UNKNOWN;
                    }
                    arrayList.add(z2m0Var);
                }
                list2 = arrayList;
            }
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            hyl0Var = new gyl0(list2);
        } else {
            String str2 = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
            if (str2 == null) {
                str2 = "";
            }
            hyl0Var = new hyl0(str2);
        }
        Boolean bool = fabVar.b;
        return new fyl0(oabVarY, q9bVarB, hyl0Var, bool != null ? bool.booleanValue() : false);
    }

    public static final oab y(Integer num) {
        Object next;
        c0o c0oVar = oab.e;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (true) {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            byte b = ((oab) next).f24921a;
            if (num != null && b == num.intValue()) {
                break;
            }
        }
        oab oabVar = (oab) next;
        return oabVar == null ? oab.DATA : oabVar;
    }

    public static final fxs0 z(ygs ygsVar) {
        ygsVar.getClass();
        List list = ygsVar.q;
        long j = ygsVar.j;
        String str = (String) CollectionsKt.W(0, list);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.W(1, list);
        String str3 = str2 != null ? str2 : "";
        String str4 = ygsVar.n;
        return new fxs0(str4, new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), StringsKt__StringsKt.split$default(str4, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1 ? new c280(vsm0.s(j, str3), R.drawable.ic_glyph_placeholder_player) : null);
    }
}
