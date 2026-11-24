package okhttp3;

import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.InetAddressDns;
import okhttp3.internal.dns.LookupDnsCall;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/Dns$Companion$SYSTEM$1", "Lokhttp3/Dns;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Dns$Companion$SYSTEM$1 implements Dns {
    @Override // okhttp3.Dns
    public final List a(String str) {
        str.getClass();
        Platform platform = Platform.f46208a;
        Platform.f46208a.getClass();
        return InetAddressDns.b.a(str);
    }

    @Override // okhttp3.Dns
    public final Dns.Call b(Dns.Request request) {
        Platform platform = Platform.f46208a;
        Platform.f46208a.getClass();
        return new LookupDnsCall(TaskRunner.INSTANCE, InetAddressDns.b, request);
    }

    public final String toString() {
        return "Dns.SYSTEM";
    }
}
