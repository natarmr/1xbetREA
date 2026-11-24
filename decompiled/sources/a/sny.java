package a;

import android.javax.sip.message.Response;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class sny implements Interceptor {
    public static final List d = q3d.j(Integer.valueOf(Response.BAD_REQUEST), Integer.valueOf(Response.UNAUTHORIZED), 422);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ouu f32516a;
    public final tgk b;
    public final boolean c;

    public sny(ouu ouuVar, tgk tgkVar, pru pruVar) {
        tgkVar.getClass();
        this.f32516a = ouuVar;
        this.b = tgkVar;
        this.c = pruVar.a().N1;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response a(RealInterceptorChain realInterceptorChain) {
        int i;
        okhttp3.Response responseB = realInterceptorChain.b(realInterceptorChain.e);
        try {
            e0g0 e0g0Var = j0g0.b;
            if (this.c && ((i = responseB.d) != 409 || !StringsKt.O(responseB.f46111a.f46108a.i, "TaxService/v1/GetTax", false))) {
                tgk tgkVar = this.b;
                ouu ouuVar = this.f32516a;
                if (i == 99 || Intrinsics.d(responseB.c, "Ошибка !")) {
                    ouuVar.J(responseB, tgkVar.j);
                } else if (!responseB.q && !d.contains(Integer.valueOf(i))) {
                    ouuVar.J(responseB, tgkVar.j);
                    return responseB;
                }
            }
            return responseB;
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
            return responseB;
        }
    }
}
