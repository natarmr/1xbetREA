package a;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes2.dex */
public final class dtg0 extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProxySelector f6655a = ProxySelector.getDefault();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        uri.getClass();
        socketAddress.getClass();
        iOException.getClass();
        ProxySelector proxySelector = this.f6655a;
        if (proxySelector != null) {
            proxySelector.connectFailed(uri, socketAddress, iOException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        ?? arrayList;
        String hostString;
        uri.getClass();
        try {
            ProxySelector proxySelector = this.f6655a;
            List<Proxy> listSelect = proxySelector != null ? proxySelector.select(uri) : null;
            if (listSelect == null) {
                listSelect = iun.f15405a;
            }
            arrayList = new ArrayList();
            for (Object obj : listSelect) {
                Proxy proxy = (Proxy) obj;
                proxy.getClass();
                if (proxy.type() != Proxy.Type.DIRECT) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if ((socketAddressAddress instanceof InetSocketAddress) && (hostString = ((InetSocketAddress) socketAddressAddress).getHostString()) != null && hostString.length() != 0) {
                        try {
                            new Dns.Request(hostString, -1);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                arrayList.add(obj);
            }
        } catch (Exception unused2) {
            arrayList = iun.f15405a;
        }
        return arrayList.isEmpty() ? kotlin.collections.a.c(Proxy.NO_PROXY) : arrayList;
    }
}
