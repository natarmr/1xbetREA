package a;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes7.dex */
public final class mo80 extends q8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22123a = 1;
    public final Method b;
    public final int c;
    public final vke d;
    public final Object e;

    public mo80(Method method, int i, vke vkeVar, String str) {
        this.b = method;
        this.c = i;
        this.d = vkeVar;
        this.e = str;
    }

    @Override // a.q8x
    public final void y(emf0 emf0Var, Object obj) {
        byte b = this.f22123a;
        vke vkeVar = this.d;
        Object obj2 = this.e;
        Method method = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    RequestBody requestBody = (RequestBody) vkeVar.o(obj);
                    MultipartBody.Builder builder = emf0Var.i;
                    builder.getClass();
                    requestBody.getClass();
                    builder.c.add(MultipartBody.Part.Companion.a((Headers) obj2, requestBody));
                    return;
                } catch (IOException e) {
                    throw ay3.Z(method, i, f140.k(obj, "Unable to convert ", " to RequestBody"), e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw ay3.Z(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw ay3.Z(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw ay3.Z(method, i, kng0.l("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", kng0.l("form-data; name=\"", str, Separators.DOUBLE_QUOTE), "Content-Transfer-Encoding", (String) obj2};
                    Headers headers = Headers.b;
                    Headers headersA = Headers.Companion.a(strArr);
                    RequestBody requestBody2 = (RequestBody) vkeVar.o(value);
                    MultipartBody.Builder builder2 = emf0Var.i;
                    builder2.getClass();
                    requestBody2.getClass();
                    builder2.c.add(MultipartBody.Part.Companion.a(headersA, requestBody2));
                }
                return;
        }
    }

    public mo80(Method method, int i, Headers headers, vke vkeVar) {
        this.b = method;
        this.c = i;
        this.e = headers;
        this.d = vkeVar;
    }
}
