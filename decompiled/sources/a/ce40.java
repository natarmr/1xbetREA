package a;

import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
public final class ce40 extends p4 {
    public final kf60 c;
    public final ywu d;
    public final String e;
    public final String f;
    public final vvt0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce40(vkr0 vkr0Var, kf60 kf60Var, ywu ywuVar, String str, String str2, vvt0 vvt0Var) {
        super((Object) vkr0Var, (byte) 3);
        kf60Var.getClass();
        str.getClass();
        str2.getClass();
        this.c = kf60Var;
        this.d = ywuVar;
        this.e = str;
        this.f = str2;
        this.g = vvt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0396  */
    /* JADX WARN: Code duplicated, block: B:141:0x042c  */
    /* JADX WARN: Code duplicated, block: B:143:0x042f A[Catch: JSONException -> 0x0407, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0407, blocks: (B:124:0x03e0, B:125:0x03e6, B:127:0x03ec, B:129:0x03fe, B:135:0x040a, B:137:0x040e, B:139:0x041f, B:143:0x042f, B:140:0x0422), top: B:208:0x03e0 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0293 A[PHI: r0
  0x0293: PHI (r0v74 java.lang.String) = (r0v29 java.lang.String), (r0v78 java.lang.String) binds: [B:72:0x0290, B:69:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.p4
    public final Object q0(td9 td9Var) throws ovt0, JSONException, IOException, c44 {
        String encodedQuery;
        MediaType mediaTypeA;
        JSONObject jSONObject;
        c44 yut0Var;
        int i;
        Object next;
        JSONObject jSONObject2;
        String strK;
        List<String> queryParameters;
        String string;
        if (((String) td9Var.b).length() > 0 && ((String) td9Var.c).length() > 0) {
            ywu ywuVar = this.d;
            ((LinkedHashMap) ywuVar.d).put("captcha_sid", (String) td9Var.b);
            ((LinkedHashMap) ywuVar.d).put("captcha_key", (String) td9Var.c);
            Integer num = (Integer) td9Var.d;
            if (num != null) {
                int iIntValue = num.intValue();
                ywu ywuVar2 = this.d;
                String strValueOf = String.valueOf(iIntValue);
                strValueOf.getClass();
                ((LinkedHashMap) ywuVar2.d).put("captcha_attempt", strValueOf);
            }
            Double d = (Double) td9Var.e;
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                ywu ywuVar3 = this.d;
                String strValueOf2 = String.valueOf(dDoubleValue);
                strValueOf2.getClass();
                ((LinkedHashMap) ywuVar3.d).put("captcha_ts", strValueOf2);
            }
        }
        if (td9Var.f33756a) {
            ((LinkedHashMap) this.d.d).put("confirm", "1");
        }
        String str = (String) ((LinkedHashMap) this.d.d).get("device_id");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (StringsKt.W(str)) {
            str = this.e;
        }
        ywu ywuVar4 = this.d;
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        ((LinkedHashMap) ywuVar4.d).put("device_id", lowerCase);
        String str3 = (String) ((LinkedHashMap) this.d.d).get(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);
        if (str3 == null) {
            str3 = "";
        }
        if (StringsKt.W(str3)) {
            str3 = this.f;
        }
        ywu ywuVar5 = this.d;
        Locale locale2 = Locale.getDefault();
        locale2.getClass();
        String lowerCase2 = str3.toLowerCase(locale2);
        lowerCase2.getClass();
        ((LinkedHashMap) ywuVar5.d).put(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, lowerCase2);
        ywu ywuVar6 = this.d;
        c44 zut0Var = null;
        if (StringsKt.W((String) ywuVar6.b)) {
            jf4.o("method is null or empty");
            return null;
        }
        if (StringsKt.W((String) ywuVar6.c)) {
            jf4.o("version is null or empty");
            return null;
        }
        String str4 = (String) ywuVar6.b;
        String str5 = (String) ywuVar6.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ywuVar6.d;
        kf60 kf60Var = this.c;
        kf60Var.getClass();
        String strM = w7n0.m((List) kf60Var.c.getValue());
        str4.getClass();
        List list = (List) kf60Var.c.getValue();
        list.getClass();
        xut0 xut0Var = (xut0) CollectionsKt.firstOrNull(list);
        String str6 = xut0Var != null ? xut0Var.b : null;
        qkd0 qkd0Var = qkd0.f28879a;
        int i2 = ((wut0) kf60Var.f18184a.b).b;
        Iterable iterable = (Iterable) kf60Var.c.getValue();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((xut0) it.next()).f41528a);
        }
        qkd0Var.getClass();
        linkedHashMap.getClass();
        str5.getClass();
        String strConcat = "/method/".concat(str4);
        lun.f20680a.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("v", str5);
        linkedHashMap2.put("https", "1");
        if (!StringsKt.W(strM)) {
            linkedHashMap2.put("access_token", strM);
        } else if (i2 != 0) {
            linkedHashMap2.put("api_id", String.valueOf(i2));
        }
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (!Intrinsics.d(entry.getKey(), "sig")) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        xun.f41520a.getClass();
        hun.f13690a.getClass();
        Uri uriBuild = builder.build();
        int i3 = 0;
        if (str6 == null || str6.length() == 0) {
            encodedQuery = uriBuild.getEncodedQuery();
            if (encodedQuery != null) {
                str2 = encodedQuery;
            }
        } else {
            String query = uriBuild.getQuery();
            qkd0.a().setLength(0);
            StringBuilder sbA = qkd0.a();
            sbA.append(strConcat);
            sbA.append('?');
            if (query != null && !StringsKt.W(query)) {
                qkd0.a().append(query);
            }
            qkd0.a().append(str6);
            String string2 = qkd0.a().toString();
            ewt0 ewt0Var = ewt0.f8544a;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM);
                Charset charsetForName = Charset.forName("UTF-8");
                charsetForName.getClass();
                byte[] bytes = string2.getBytes(charsetForName);
                bytes.getClass();
                byte[] bArrDigest = messageDigest.digest(bytes);
                ewt0Var.getClass();
                ewt0.a().setLength(0);
                bArrDigest.getClass();
                for (byte b : bArrDigest) {
                    StringBuilder sbA2 = ewt0.a();
                    char[] cArr = ewt0.c;
                    sbA2.append(cArr[(b & 240) >> 4]);
                    ewt0.a().append(cArr[b & 15]);
                }
                string = ewt0.a().toString();
            } catch (Exception unused) {
                string = "";
            }
            encodedQuery = uriBuild.buildUpon().appendQueryParameter("sig", string).build().getEncodedQuery();
            if (encodedQuery != null) {
                str2 = encodedQuery;
            }
        }
        int i4 = RequestBody.f46110a;
        if (kotlin.text.c.x(str4, "execute.", false)) {
            Uri uri = Uri.parse("https://vk.com/?".concat(str2));
            if (uri.getQueryParameters("method").contains("execute") && (queryParameters = uri.getQueryParameters("code")) != null && !queryParameters.isEmpty()) {
                throw new yut0(15, str4, "Hey dude don't execute your hacky code ;)", null, null, null, 1008);
            }
        }
        Regex regex = MediaType.e;
        try {
            mediaTypeA = MediaType.Companion.a("application/x-www-form-urlencoded; charset=utf-8");
        } catch (IllegalArgumentException unused2) {
            mediaTypeA = null;
        }
        RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3A = RequestBody.Companion.a(str2, mediaTypeA);
        String str7 = (String) ((wut0) kf60Var.f18184a.b).n.invoke();
        Request.Builder builder2 = new Request.Builder();
        builder2.b("POST", requestBody$Companion$toRequestBody$3A);
        StringBuilder sb = new StringBuilder();
        String strL = kf60Var.e;
        if (strL.length() == 0 || strL.equals("https://api.vk.com/method")) {
            strL = kng0.l("https://", str7, "/method");
        }
        sb.append(strL);
        sb.append('/');
        sb.append(str4);
        builder2.d(sb.toString());
        CacheControl cacheControl = CacheControl.n;
        cacheControl.getClass();
        String string3 = cacheControl.toString();
        if (string3.length() == 0) {
            builder2.c.d("Cache-Control");
        } else {
            builder2.a("Cache-Control", string3);
        }
        builder2.c(Map.class, null);
        Request request = new Request(builder2);
        String strM2 = w7n0.m((List) kf60Var.c.getValue());
        Response responseExecute = FirebasePerfOkHttpClient.execute(new RealCall(((uvt0) kf60Var.b.getValue()).a(), request, false));
        responseExecute.getClass();
        int i5 = responseExecute.d;
        ResponseBody responseBody = responseExecute.g;
        if (i5 == 413) {
            String str8 = responseExecute.c;
            str8.getClass();
            throw new c44(str8, (byte) 16);
        }
        if (500 <= i5 && i5 < 600) {
            if (responseBody != null) {
                try {
                    strK = responseBody.k();
                    responseBody.close();
                    if (strK == null) {
                        strK = "null";
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(responseBody, th);
                        throw th2;
                    }
                }
            } else {
                strK = "null";
            }
            throw new ovt0("Server returned httpStatusCode=" + i5 + " with body: " + strK);
        }
        if (responseBody != null) {
            InputStream inputStreamA = responseBody.a();
            ktf0 ktf0Var = (ktf0) ((wut0) kf60Var.f18184a.b).A.getValue();
            String strB = responseExecute.f.b("content-type");
            String strB2 = responseExecute.f46111a.f46108a.b();
            ktf0Var.getClass();
            if (strB != null) {
                try {
                    Iterator it2 = ktf0Var.f18863a.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        ((mvj) next).getClass();
                        if (StringsKt.O(strB, "application/json", true)) {
                            break;
                        }
                    } while (!StringsKt.O(strB, "text/javascript", true));
                    if (((mvj) next) != null) {
                        Object objNextValue = new JSONTokener(gfx.P(inputStreamA)).nextValue();
                        if (objNextValue instanceof JSONObject) {
                            jSONObject2 = (JSONObject) objNextValue;
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("root_response", objNextValue);
                            jSONObject2 = jSONObject3;
                        }
                    } else {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put("root_response", gfx.P(inputStreamA));
                    }
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    StringBuilder sbT = kng0.t("[", strB2, "] ");
                    sbT.append(e.getLocalizedMessage());
                    throw new yut0(-2, strB2, sbT.toString(), null, null, null, 1008);
                }
            } else {
                jSONObject2 = null;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                    jSONObject2.put("root_response", gfx.P(inputStreamA));
                }
                jSONObject = jSONObject2;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            throw new c44("Response returned null instead of valid string response", (byte) 15);
        }
        if (jSONObject.has("error")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("error");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = jSONObject;
            }
            zut0Var = afn0.x(jSONObjectOptJSONObject, str4, strM2);
        } else if (jSONObject.has("execute_errors")) {
            JSONArray jSONArray = jSONObject.getJSONArray("execute_errors");
            jSONArray.getClass();
            try {
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArray.length();
                while (true) {
                    if (i3 >= length) {
                        yut0Var = new yut0(Integer.MIN_VALUE, str4, "", null, arrayList2, null, 960);
                        break;
                    }
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                    jSONObject4.getClass();
                    yut0Var = afn0.x(jSONObject4, null, null);
                    if (!(yut0Var instanceof yut0) || (i = ((yut0) yut0Var).b) == 1 || i == 14 || i == 17 || i == 3610 || i == 4 || i == 5 || i == 6 || i == 9 || i == 10 || i == 24 || i == 25) {
                        break;
                    }
                    arrayList2.add(yut0Var);
                    i3++;
                }
                zut0Var = yut0Var;
            } catch (JSONException e2) {
                zut0Var = new zut0(e2, (byte) 15);
            }
        }
        if (zut0Var == null) {
            return this.g.a(jSONObject);
        }
        throw zut0Var;
    }
}
