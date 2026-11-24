package okhttp3;

import a.dw9;
import a.jf4;
import a.twn;
import a.ua80;
import java.io.EOFException;
import java.net.InetAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.LookupDnsCall;
import okhttp3.internal.dns._ExecuteDnsKt$execute$1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lokhttp3/Dns;", "", "Call", "Callback", "Request", "Record", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Dns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Dns$Companion$SYSTEM$1 f46091a = new Dns$Companion$SYSTEM$1();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/Dns$Call;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Call {
        void a(_ExecuteDnsKt$execute$1 _executednskt_execute_1);

        /* JADX INFO: renamed from: getRequest */
        Request getG();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/Dns$Callback;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lokhttp3/Dns$Companion;", "", "Lokhttp3/Dns;", "SYSTEM", "Lokhttp3/Dns;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/Dns$Record;", "", "IpAddress", "ServiceMetadata", "Lokhttp3/Dns$Record$IpAddress;", "Lokhttp3/Dns$Record$ServiceMetadata;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Record {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Dns$Record$IpAddress;", "Lokhttp3/Dns$Record;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class IpAddress extends Record {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InetAddress f46092a;
            public final String b;

            public IpAddress(String str, InetAddress inetAddress) throws EOFException {
                str.getClass();
                inetAddress.getClass();
                this.f46092a = inetAddress;
                String strB = _HostnamesCommonKt.b(str);
                if (strB != null) {
                    this.b = strB;
                } else {
                    jf4.o("unexpected hostname: ".concat(str));
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof IpAddress)) {
                    return false;
                }
                IpAddress ipAddress = (IpAddress) obj;
                return ipAddress.b.equals(this.b) && Intrinsics.d(ipAddress.f46092a, this.f46092a);
            }

            public final int hashCode() {
                return this.f46092a.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return this.b + '/' + this.f46092a.getHostAddress();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Dns$Record$ServiceMetadata;", "Lokhttp3/Dns$Record;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ServiceMetadata extends Record {
            public final boolean equals(Object obj) {
                if (obj instanceof ServiceMetadata) {
                    throw null;
                }
                return false;
            }

            public final int hashCode() {
                return dw9.a((((ua80.b(527, 31, null) + 0) * 31) + 0) * 31, 31, null) + 0;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder(32);
                sb.append("ServiceMetadata{");
                sb.append((String) null);
                sb.append(", port=");
                sb.append(0);
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Dns$Request;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46093a;
        public final int b;

        public Request(String str, int i) throws EOFException {
            str.getClass();
            String strB = _HostnamesCommonKt.b(str);
            if (strB == null) {
                jf4.o("unexpected hostname: ".concat(str));
                throw null;
            }
            this.f46093a = strB;
            if (i == -1) {
                i = 443;
            } else if (1 > i || i >= 65536) {
                jf4.o(twn.m(i, "unexpected port: "));
                throw null;
            }
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.d(request.f46093a, this.f46093a) && request.b == this.b;
        }

        public final int hashCode() {
            return (this.f46093a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            int i = this.b;
            String str = this.f46093a;
            if (i == 443) {
                return str;
            }
            return str + ':' + i;
        }
    }

    List a(String str);

    default Call b(Request request) {
        return new LookupDnsCall(TaskRunner.INSTANCE, this, request);
    }
}
