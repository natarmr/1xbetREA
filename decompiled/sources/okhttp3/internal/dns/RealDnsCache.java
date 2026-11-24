package okhttp3.internal.dns;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache;", "", "CacheQuery", "Entry", "State", "InFlightCall", "Result", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealDnsCache {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$CacheQuery;", "Lokhttp3/internal/dns/DnsQuery;", "Lokhttp3/internal/dns/DnsQuery$Callback;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class CacheQuery implements DnsQuery, DnsQuery.Callback {
        @Override // okhttp3.internal.dns.DnsQuery
        public final void a(StateMachineDnsCall$enqueue$2 stateMachineDnsCall$enqueue$2) {
            throw new IllegalStateException("already enqueued");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$Entry;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Entry {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$InFlightCall;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InFlightCall {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InFlightCall) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "InFlightCall(query=" + ((Object) null) + ", sentAt=" + ((Object) null) + ", queries=" + ((Object) null) + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$Result;", "", "Failure", "Success", "Lokhttp3/internal/dns/RealDnsCache$Result$Failure;", "Lokhttp3/internal/dns/RealDnsCache$Result$Success;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$Result$Failure;", "Lokhttp3/internal/dns/RealDnsCache$Result;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failure implements Result {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$Result$Success;", "Lokhttp3/internal/dns/RealDnsCache$Result;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Success implements Result {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/RealDnsCache$State;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof State) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }
}
