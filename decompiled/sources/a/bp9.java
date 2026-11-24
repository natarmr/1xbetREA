package a;

import a.t99;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class bp9 {
    public static final ol50 a(Response response) {
        u99 d;
        int i = response.d;
        long j = response.l;
        long j2 = response.m;
        Headers headers = response.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Pair<? extends String, ? extends String>> it = headers.iterator();
        while (true) {
            y2 y2Var = (y2) it;
            if (!y2Var.hasNext()) {
                break;
            }
            Pair pair = (Pair) y2Var.next();
            String str = (String) pair.f46059a;
            String str2 = (String) pair.b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        al50 al50Var = new al50(xp20.n(linkedHashMap));
        ResponseBody responseBody = response.g;
        return new ol50(i, j, j2, al50Var, (responseBody == null || (d = responseBody.getD()) == null) ? null : new lmk0(d), response);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c A[LOOP:1: B:24:0x0086->B:26:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Request b(gl50 gl50Var, zje zjeVar) {
        ap9 ap9Var;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        gl50 gl50Var2;
        RequestBody requestBody;
        Headers.Builder builder3;
        String str2;
        Iterator it;
        if (zjeVar instanceof ap9) {
            ap9Var = (ap9) zjeVar;
            int i = ap9Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ap9Var.j = i - Integer.MIN_VALUE;
            } else {
                ap9Var = new ap9(zjeVar);
            }
        } else {
            ap9Var = new ap9(zjeVar);
        }
        Object obj = ap9Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ap9Var.j;
        Request.Builder builder4 = null;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            final qg9 qg9Var = (qg9) obj;
            if (qg9Var != null) {
                int i3 = RequestBody.f46110a;
                requestBody = new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                    @Override // okhttp3.RequestBody
                    public final long a() {
                        return qg9Var.e();
                    }

                    @Override // okhttp3.RequestBody
                    /* JADX INFO: renamed from: b */
                    public final MediaType getD() {
                        return null;
                    }

                    @Override // okhttp3.RequestBody
                    public final void d(t99 t99Var) {
                        t99Var.N0(qg9Var);
                    }
                };
                gl50Var2 = null;
                builder2 = null;
                str = null;
            } else {
                gl50Var = null;
                builder = null;
                builder2 = null;
                str = null;
            }
            builder4.b(str, requestBody);
            al50 al50Var = gl50Var2.c;
            builder3 = new Headers.Builder();
            for (Map.Entry entry : al50Var.f1052a.entrySet()) {
                str2 = (String) entry.getKey();
                it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    builder3.c(str2, (String) it.next());
                }
            }
            Headers headersB = _HeadersCommonKt.b(builder3);
            builder2.getClass();
            builder2.c = _HeadersCommonKt.d(headersB);
            return new Request(builder2);
        }
        z1x.P(obj);
        builder = new Request.Builder();
        builder.d(gl50Var.f11475a);
        str = gl50Var.b;
        builder2 = builder;
        Request.Builder builder5 = builder;
        gl50Var2 = gl50Var;
        requestBody = null;
        builder4 = builder5;
        builder4.b(str, requestBody);
        al50 al50Var2 = gl50Var2.c;
        builder3 = new Headers.Builder();
        while (r5.hasNext()) {
            str2 = (String) entry.getKey();
            it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                builder3.c(str2, (String) it.next());
            }
        }
        Headers headersB2 = _HeadersCommonKt.b(builder3);
        builder2.getClass();
        builder2.c = _HeadersCommonKt.d(headersB2);
        return new Request(builder2);
    }
}
