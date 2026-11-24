package okhttp3.internal.dns;

import a.dw9;
import a.qg9;
import a.twn;
import a.ua80;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lokhttp3/internal/dns/ResourceRecord;", "", "IpAddress", "Https", "Lokhttp3/internal/dns/ResourceRecord$Https;", "Lokhttp3/internal/dns/ResourceRecord$IpAddress;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ResourceRecord {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/ResourceRecord$Https;", "Lokhttp3/internal/dns/ResourceRecord;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Https implements ResourceRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46163a;
        public final int b;
        public final int c;
        public final String d;
        public final List e;
        public final int f;
        public final List g;
        public final qg9 h;

        public Https(String str, int i, int i2, String str2, ArrayList arrayList, int i3, List list, qg9 qg9Var) {
            list.getClass();
            this.f46163a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
            this.e = arrayList;
            this.f = i3;
            this.g = list;
            this.h = qg9Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Https)) {
                return false;
            }
            Https https = (Https) obj;
            return this.f46163a.equals(https.f46163a) && this.b == https.b && this.c == https.c && this.d.equals(https.d) && Intrinsics.d(this.e, https.e) && this.f == https.f && Intrinsics.d(this.g, https.g) && Intrinsics.d(this.h, https.h);
        }

        public final int hashCode() {
            int iB = ua80.b(twn.a(this.c, twn.a(this.b, this.f46163a.hashCode() * 31, 31), 31), 31, this.d);
            List list = this.e;
            int iA = dw9.a(twn.a(this.f, (iB + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.g);
            qg9 qg9Var = this.h;
            return iA + (qg9Var != null ? qg9Var.hashCode() : 0);
        }

        public final String toString() {
            return "Https(name=" + this.f46163a + ", timeToLive=" + this.b + ", priority=" + this.c + ", targetName=" + this.d + ", alpnIds=" + this.e + ", port=" + this.f + ", ipAddressHints=" + this.g + ", echConfigList=" + this.h + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/ResourceRecord$IpAddress;", "Lokhttp3/internal/dns/ResourceRecord;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IpAddress implements ResourceRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46164a;
        public final int b;
        public final InetAddress c;

        public IpAddress(String str, InetAddress inetAddress, int i) {
            inetAddress.getClass();
            this.f46164a = str;
            this.b = i;
            this.c = inetAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IpAddress)) {
                return false;
            }
            IpAddress ipAddress = (IpAddress) obj;
            return this.f46164a.equals(ipAddress.f46164a) && this.b == ipAddress.b && Intrinsics.d(this.c, ipAddress.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + twn.a(this.b, this.f46164a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "IpAddress(name=" + this.f46164a + ", timeToLive=" + this.b + ", address=" + this.c + ')';
        }
    }
}
