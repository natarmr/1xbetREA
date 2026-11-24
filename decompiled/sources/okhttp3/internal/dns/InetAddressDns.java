package okhttp3.internal.dns;

import a.kng0;
import a.tx3;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/InetAddressDns;", "Lokhttp3/Dns;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InetAddressDns implements Dns {
    public static final InetAddressDns b = new InetAddressDns();

    @Override // okhttp3.Dns
    public final List a(String str) throws UnknownHostException {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return tx3.g0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(kng0.k("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
