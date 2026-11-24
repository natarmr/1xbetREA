package a;

import com.appsflyer.AppsFlyerLib;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rv3 implements sv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f31152a;
    public final z7z b;
    public final k9b0 c;
    public final yqc d;
    public final xex e;
    public final ehf0 f;
    public final knf0 g;
    public final sd60 h;
    public final nwd i;
    public final yzn0 j;
    public final n0o0 k;
    public volatile boolean l;
    public volatile boolean m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile boolean p;
    public volatile String q;
    public final sje r;
    public AppsFlyerLib s;

    public rv3(us00 us00Var, z7z z7zVar, k9b0 k9b0Var, yqc yqcVar, xex xexVar, ehf0 ehf0Var, knf0 knf0Var, sd60 sd60Var, nwd nwdVar, yzn0 yzn0Var, qo qoVar, bzt bztVar) {
        nwdVar.getClass();
        this.f31152a = us00Var;
        this.b = z7zVar;
        this.c = k9b0Var;
        this.d = yqcVar;
        this.e = xexVar;
        this.f = ehf0Var;
        this.g = knf0Var;
        this.h = sd60Var;
        this.i = nwdVar;
        this.j = yzn0Var;
        this.k = maz.b(new sk1(bztVar, (byte) 1));
        this.r = d5c.a(qem0.e());
    }

    public static String b(LinkedHashMap linkedHashMap) throws JSONException {
        String str = (String) linkedHashMap.get("af_sub1");
        if (str == null) {
            str = "";
        }
        String str2 = (String) linkedHashMap.get("af_sub2");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) linkedHashMap.get("af_sub3");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) linkedHashMap.get("af_sub4");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) linkedHashMap.get("af_sub5");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) linkedHashMap.get("af_sub6");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = (String) linkedHashMap.get("af_sub7");
        if (str7 == null) {
            str7 = "";
        }
        if (str.length() <= 0 && str6.length() <= 0 && str7.length() <= 0) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        d(jSONObject, "pb", str);
        d(jSONObject, "click_id", str2);
        d(jSONObject, "site_id", str3);
        d(jSONObject, "partner_id", str4);
        d(jSONObject, "other", str5);
        d(jSONObject, "QTag", str6);
        d(jSONObject, "Subid", str7);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public static void d(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (str2.length() > 0) {
            jSONObject.put(str, str2);
        }
    }

    public final void a(AppsFlyerLib appsFlyerLib) {
        String str;
        if (this.p) {
            return;
        }
        this.p = true;
        if (((v8d) this.k.getValue()).U && ((bf3) this.j.f43523a).f2481a.a().getBoolean("IS_FIRST_LAUNCH_CUID_FLAG", true)) {
            ((bf3) this.j.f43523a).f2481a.d("IS_FIRST_LAUNCH_CUID_FLAG", false);
            us3 us3Var = (us3) this.j.b;
            us3Var.getClass();
            String string = us3Var.f36191a.getString(R.string.appsflyer_channel);
            string.getClass();
            uen uenVar = wen.b;
            long jL = wen.l(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), bfn.SECONDS);
            if (string.length() == 0) {
                String strH = h97.h(jL, "org.xbet.client1 | ");
                Charset charset = Charsets.UTF_8;
                byte[] bytes = strH.getBytes(charset);
                bytes.getClass();
                str = new String(defpackage.b.c(bytes), charset);
            } else {
                String str2 = "org.xbet.client1-" + string + " | " + jL;
                Charset charset2 = Charsets.UTF_8;
                byte[] bytes2 = str2.getBytes(charset2);
                bytes2.getClass();
                str = new String(defpackage.b.c(bytes2), charset2);
            }
            appsFlyerLib.setCustomerUserId(str);
        }
        String str3 = this.q;
        if (str3 != null) {
            appsFlyerLib.setCustomerUserId(str3);
        }
        appsFlyerLib.start();
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ((gst0) this.b.get()).f11847a.d.o(null, Boolean.TRUE);
    }

    public final void e(long j) {
        String strValueOf = String.valueOf(j);
        this.q = strValueOf;
        if (this.n) {
            AppsFlyerLib.getInstance().setCustomerUserId(strValueOf);
        }
    }

    public final void f(String str, Map map) {
        if (this.n) {
            AppsFlyerLib.getInstance().logEvent(this.f31152a, str, map);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.n) {
            if (objArr.length % 2 != 0) {
                jf4.o("Illegal number of parameters");
                return;
            }
            HashMap map = new HashMap();
            for (int i = 0; i < objArr.length; i += 2) {
                Object obj = objArr[i];
                if (!(obj instanceof String)) {
                    jf4.n(String.format(Locale.ENGLISH, "eventValues element №%d must be a String!", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                    return;
                }
                map.put((String) obj, objArr[i + 1]);
            }
            f(str, map);
        }
    }
}
