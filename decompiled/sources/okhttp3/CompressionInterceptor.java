package okhttp3;

import a.emk0;
import a.u99;
import a.zae0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/CompressionInterceptor;", "Lokhttp3/Interceptor;", "DecompressionAlgorithm", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CompressionInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecompressionAlgorithm[] f46083a;
    public final String b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface DecompressionAlgorithm {
        emk0 a(u99 u99Var);

        String getEncoding();
    }

    public CompressionInterceptor(DecompressionAlgorithm... decompressionAlgorithmArr) {
        this.f46083a = decompressionAlgorithmArr;
        ArrayList arrayList = new ArrayList(decompressionAlgorithmArr.length);
        for (DecompressionAlgorithm decompressionAlgorithm : decompressionAlgorithmArr) {
            arrayList.add(decompressionAlgorithm.getEncoding());
        }
        this.b = CollectionsKt.b0(arrayList, ", ", null, null, null, 62);
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        DecompressionAlgorithm[] decompressionAlgorithmArr = this.f46083a;
        if (decompressionAlgorithmArr.length != 0) {
            request.getClass();
            if (request.c.b("Accept-Encoding") == null) {
                Request.Builder builderA = request.a();
                builderA.a("Accept-Encoding", this.b);
                Response responseB = realInterceptorChain.b(new Request(builderA));
                if (HttpHeaders.a(responseB)) {
                    ResponseBody responseBody = responseB.g;
                    String strB = responseB.f.b("Content-Encoding");
                    DecompressionAlgorithm decompressionAlgorithm = null;
                    if (strB == null) {
                        strB = null;
                    }
                    if (strB != null) {
                        for (DecompressionAlgorithm decompressionAlgorithm2 : decompressionAlgorithmArr) {
                            if (decompressionAlgorithm2.getEncoding().equalsIgnoreCase(strB)) {
                                decompressionAlgorithm = decompressionAlgorithm2;
                                break;
                            }
                        }
                        if (decompressionAlgorithm != null) {
                            zae0 zae0Var = new zae0(decompressionAlgorithm.a(responseBody.getD()));
                            Response.Builder builderC = responseB.c();
                            builderC.f.d("Content-Encoding");
                            builderC.f.d("Content-Length");
                            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.f46113a;
                            builderC.g = new ResponseBody$Companion$asResponseBody$1(responseBody.getB(), -1L, zae0Var);
                            return builderC.a();
                        }
                    }
                }
                return responseB;
            }
        }
        return realInterceptorChain.b(request);
    }
}
