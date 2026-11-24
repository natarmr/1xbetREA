package okhttp3.internal.dns;

import a.b1j;
import a.dw9;
import a.twn;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/dns/DnsMessage;", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DnsMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f46156a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/DnsMessage$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public DnsMessage(short s, int i, List list, List list2, List list3, List list4) {
        b1j.B(list2, list3, list4);
        this.f46156a = s;
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DnsMessage)) {
            return false;
        }
        DnsMessage dnsMessage = (DnsMessage) obj;
        return this.f46156a == dnsMessage.f46156a && this.b == dnsMessage.b && this.c.equals(dnsMessage.c) && Intrinsics.d(this.d, dnsMessage.d) && Intrinsics.d(this.e, dnsMessage.e) && Intrinsics.d(this.f, dnsMessage.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(dw9.a(twn.a(this.b, Short.hashCode(this.f46156a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "DnsMessage(id=" + ((int) this.f46156a) + ", flags=" + this.b + ", questions=" + this.c + ", answers=" + this.d + ", authorityRecords=" + this.e + ", additionalRecords=" + this.f + ')';
    }
}
