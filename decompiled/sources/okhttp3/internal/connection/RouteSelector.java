package okhttp3.internal.connection;

import a.iun;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Selection", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RouteSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f46152a;
    public final RouteDatabase b;
    public final RealCall c;
    public final boolean d;
    public final List e;
    public int f;
    public final ArrayList g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Selection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f46153a;
        public int b;

        public Selection(ArrayList arrayList) {
            this.f46153a = arrayList;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46154a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f46154a = iArr;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, RealCall realCall, boolean z) {
        List<Proxy> listSelect;
        List listK;
        routeDatabase.getClass();
        this.f46152a = address;
        this.b = routeDatabase;
        this.c = realCall;
        this.d = z;
        this.e = iun.f15405a;
        this.g = new ArrayList();
        HttpUrl httpUrl = address.i;
        Proxy proxy = address.g;
        realCall.eventListener.r(realCall, httpUrl);
        if (proxy != null) {
            listK = a.c(proxy);
        } else {
            URI uriI = httpUrl.i();
            if (uriI.getHost() == null) {
                listK = _UtilJvmKt.k(new Proxy[]{Proxy.NO_PROXY});
            } else {
                try {
                    listSelect = address.h.select(uriI);
                } catch (IllegalArgumentException unused) {
                    listSelect = null;
                }
                listK = (listSelect == null || listSelect.isEmpty()) ? _UtilJvmKt.k(new Proxy[]{Proxy.NO_PROXY}) : _UtilJvmKt.j(listSelect);
            }
        }
        this.e = listK;
        this.f = 0;
        this.c.eventListener.q(this.c, httpUrl, this.e);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.g.isEmpty();
    }
}
