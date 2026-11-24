package okhttp3.android;

import android.net.DnsResolver;
import android.net.DnsResolver$Callback;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"okhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1", "Landroid/net/DnsResolver$Callback;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1 implements DnsResolver$Callback {
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnswer(java.lang.Object r3, int r4) {
        /*
            r2 = this;
            byte[] r3 = (byte[]) r3
            r3.getClass()
            r2 = 0
            okhttp3.internal.dns.DnsMessageReader r4 = new okhttp3.internal.dns.DnsMessageReader     // Catch: java.io.IOException -> L18
            a.f99 r0 = new a.f99     // Catch: java.io.IOException -> L18
            r0.<init>()     // Catch: java.io.IOException -> L18
            int r1 = r3.length     // Catch: java.io.IOException -> L18
            r0.U(r3, r1)     // Catch: java.io.IOException -> L18
            r4.<init>(r0)     // Catch: java.io.IOException -> L18
            r4.a()     // Catch: java.io.IOException -> L18
            throw r2
        L18:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.android.AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1.onAnswer(java.lang.Object, int):void");
    }

    public final void onError(DnsResolver.DnsException dnsException) {
        dnsException.getClass();
        throw null;
    }
}
