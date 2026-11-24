package okhttp3.android;

import java.util.List;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.StateMachineDnsCall$enqueue$2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/android/AndroidDns;", "Lokhttp3/Dns;", "AndroidQuery", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidDns implements Dns {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/android/AndroidDns$AndroidQuery;", "Lokhttp3/internal/dns/DnsQuery;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class AndroidQuery implements DnsQuery {
        @Override // okhttp3.internal.dns.DnsQuery
        public final void a(StateMachineDnsCall$enqueue$2 stateMachineDnsCall$enqueue$2) {
            throw null;
        }
    }

    @Override // okhttp3.Dns
    public final List a(String str) {
        str.getClass();
        new Dns.Request(str, -1);
        throw null;
    }

    @Override // okhttp3.Dns
    public final Dns.Call b(Dns.Request request) {
        throw null;
    }
}
