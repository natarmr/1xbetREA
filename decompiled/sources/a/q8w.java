package a;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q8w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28319a = 0;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ naw c;

    public /* synthetic */ q8w(naw nawVar, Throwable th) {
        this.c = nawVar;
        this.b = th;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28319a;
        naw nawVar = this.c;
        Throwable th = this.b;
        Throwable th2 = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th2.getClass();
                str.getClass();
                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.SelfExclusionChangesProhibited) {
                    nawVar.Z0.f(x8w.f40482a);
                }
                break;
            default:
                th2.getClass();
                str.getClass();
                if (!(th instanceof SocketTimeoutException) && !(th instanceof UnknownHostException) && !(th instanceof SSLHandshakeException) && !(th instanceof ConnectException) && !(th instanceof IllegalStateException)) {
                    nawVar.Z0.f(new g9w(str));
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ q8w(Throwable th, naw nawVar) {
        this.b = th;
        this.c = nawVar;
    }
}
