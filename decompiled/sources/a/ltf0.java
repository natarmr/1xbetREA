package a;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.ranges.IntRange;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class ltf0 implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws IOException {
        Response responseB;
        try {
            responseB = realInterceptorChain.b(realInterceptorChain.e);
            try {
                int i = responseB.d;
                if (i == 401) {
                    responseB.close();
                    throw new j7t0(0);
                }
                if (i == 403) {
                    responseB.close();
                    throw new dxb();
                }
                if (i == 409 || i == 500) {
                    responseB.close();
                    throw new wae(i);
                }
                IntRange intRange = pnm0.c;
                int i2 = intRange.f46068a;
                if (i <= intRange.b && i2 <= i) {
                    responseB.close();
                    throw new zhi0(responseB.c, (kuw) null, Integer.valueOf(i), 4);
                }
                if (responseB != null) {
                    return responseB;
                }
                ohq.l("Response is null!");
                return null;
            } catch (SocketTimeoutException unused) {
                if (responseB != null) {
                    responseB.close();
                }
            }
        } catch (SocketTimeoutException unused2) {
            responseB = null;
        }
    }
}
