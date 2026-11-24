package a;

import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class myk implements Interceptor {
    public static final List b = kotlin.collections.a.c("GetTranslationsOfKeys");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1q0 f22606a;

    public myk(j1q0 j1q0Var) {
        j1q0Var.getClass();
        this.f22606a = j1q0Var;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        Request.Builder builderA = request.a();
        builderA.b(request.b, request.d);
        HttpUrl httpUrl = request.f46108a;
        String strQ = w6x.q(httpUrl.f46100a, "://", httpUrl.d);
        String str = httpUrl.i;
        List list = b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.O(str, (String) it.next(), true)) {
                    return realInterceptorChain.b(new Request(builderA));
                }
            }
        }
        m1q0 m1q0Var = this.f22606a.f15748a;
        ezk ezkVar = m1q0Var.g;
        if (ezkVar == null) {
            if (m1q0Var.o()) {
                ezkVar = ezk.b;
            } else if (m1q0Var.p()) {
                ezkVar = ezk.c;
            } else {
                ezkVar = m1q0Var.g() ? ezk.d : ezk.f8675a;
            }
            m1q0Var.g = ezkVar;
        }
        int iOrdinal = ezkVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                builderA.d(kotlin.text.c.r(str, strQ, "https://mobilaserverstest.xyz", false));
            } else if (iOrdinal == 2) {
                builderA.d(kotlin.text.c.r(str, strQ, "https://mobserverstestii.xyz", false));
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                builderA.d(kotlin.text.c.r(str, strQ, "https://mobilaserverslux.xyz", false));
            }
        }
        return realInterceptorChain.b(new Request(builderA));
    }
}
