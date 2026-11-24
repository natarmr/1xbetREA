package okhttp3.internal.connection;

import a.hny;
import a.itt0;
import a.j0g0;
import a.jf4;
import a.kng0;
import a.lc00;
import a.ohq;
import a.r3d;
import a.w3d;
import a.wp20;
import a.xw3;
import a.z1x;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.Dns;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.dns.LookupDnsCall;
import okhttp3.internal.dns._ExecuteDnsKt$execute$1;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/internal/connection/RoutePlanner;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealRoutePlanner implements RoutePlanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskRunner f46148a;
    public final RealConnectionPool b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final Address j;
    public final RouteDatabase k;
    public final RealCall l;
    public final boolean m;
    public RouteSelector.Selection n;
    public RouteSelector o;
    public Route p;
    public final xw3 q;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, Address address, RouteDatabase routeDatabase, RealCall realCall, Request request) {
        taskRunner.getClass();
        routeDatabase.getClass();
        this.f46148a = taskRunner;
        this.b = realConnectionPool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = z2;
        this.j = address;
        this.k = routeDatabase;
        this.l = realCall;
        this.m = !Intrinsics.d(request.b, "GET");
        this.q = new xw3();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a(RealConnection realConnection) {
        RouteSelector routeSelector;
        Route route;
        if (this.q.isEmpty() && this.p == null) {
            if (realConnection != null) {
                synchronized (realConnection) {
                    route = null;
                    if (realConnection.m == 0 && realConnection.k && _UtilJvmKt.a(realConnection.c.f46114a.i, this.j.i)) {
                        route = realConnection.c;
                    }
                }
                if (route != null) {
                    this.p = route;
                    return true;
                }
            }
            RouteSelector.Selection selection = this.n;
            if ((selection == null || selection.b >= selection.f46153a.size()) && (routeSelector = this.o) != null) {
                return routeSelector.a();
            }
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean b(HttpUrl httpUrl) {
        httpUrl.getClass();
        HttpUrl httpUrl2 = this.j.i;
        return httpUrl.e == httpUrl2.e && Intrinsics.d(httpUrl.d, httpUrl2.d);
    }

    public final RoutePlanner.Plan c() throws InterruptedException, IOException {
        Socket socketG;
        ReusePlan reusePlan;
        ConnectPlan connectPlanD;
        String hostAddress;
        int port;
        ArrayList arrayList;
        List<Route> listA;
        boolean zContains;
        RealConnection realConnection = this.l.j;
        if (realConnection == null) {
            reusePlan = null;
        } else {
            boolean zH = realConnection.h(this.m);
            synchronized (realConnection) {
                boolean z = realConnection.k;
                try {
                    if (zH) {
                        socketG = (z || !b(realConnection.c.f46114a.i)) ? this.l.g() : null;
                    } else {
                        realConnection.k = true;
                        socketG = this.l.g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l.j == null) {
                if (socketG != null) {
                    _UtilJvmKt.c(socketG);
                }
                this.l.eventListener.k(this.l, realConnection);
                reusePlan = null;
            } else {
                if (socketG != null) {
                    jf4.n("Check failed.");
                    return null;
                }
                reusePlan = new ReusePlan(realConnection);
            }
        }
        if (reusePlan != null) {
            return reusePlan;
        }
        ReusePlan reusePlanE = e(null, null);
        if (reusePlanE != null) {
            return reusePlanE;
        }
        if (!this.q.isEmpty()) {
            return (RoutePlanner.Plan) this.q.removeFirst();
        }
        Route route = this.p;
        if (route != null) {
            this.p = null;
            connectPlanD = d(route, null);
        } else {
            RouteSelector.Selection selection = this.n;
            if (selection == null || selection.b >= selection.f46153a.size()) {
                RouteSelector routeSelector = this.o;
                if (routeSelector == null) {
                    routeSelector = new RouteSelector(this.j, this.k, this.l, this.i);
                    this.o = routeSelector;
                }
                if (!routeSelector.a()) {
                    ohq.l("exhausted all routes");
                    return null;
                }
                if (!routeSelector.a()) {
                    itt0.a();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                while (routeSelector.f < routeSelector.e.size()) {
                    if (routeSelector.f >= routeSelector.e.size()) {
                        throw new SocketException("No route to " + routeSelector.f46152a.i.d + "; exhausted proxy configurations: " + routeSelector.e);
                    }
                    List list = routeSelector.e;
                    int i = routeSelector.f;
                    routeSelector.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        HttpUrl httpUrl = routeSelector.f46152a.i;
                        hostAddress = httpUrl.d;
                        port = httpUrl.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            hny.v(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        Address address2 = routeSelector.f46152a;
                        InetSocketAddress inetSocketAddressCreateUnresolved = InetSocketAddress.createUnresolved(hostAddress, port);
                        inetSocketAddressCreateUnresolved.getClass();
                        listA = a.c(new Route(address2, proxy, inetSocketAddressCreateUnresolved, null));
                    } else {
                        Regex regex = _HostnamesCommonKt.f46120a;
                        hostAddress.getClass();
                        if (_HostnamesCommonKt.f46120a.g(hostAddress)) {
                            listA = a.c(new Route(routeSelector.f46152a, proxy, new InetSocketAddress(InetAddress.getByName(hostAddress), port), null));
                        } else {
                            routeSelector.c.eventListener.o(routeSelector.c, hostAddress);
                            Dns.Call callB = routeSelector.f46152a.f46075a.b(new Dns.Request(hostAddress, (routeSelector.f46152a.i.f() || port != 80) ? port : -1));
                            if (callB instanceof LookupDnsCall) {
                                List listA2 = routeSelector.f46152a.f46075a.a(hostAddress);
                                arrayList = new ArrayList(r3d.q(listA2, 10));
                                Iterator it = listA2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new Route(routeSelector.f46152a, proxy, new InetSocketAddress((InetAddress) it.next(), port), null));
                                }
                            } else {
                                callB.getClass();
                                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                                callB.a(new _ExecuteDnsKt$execute$1(callB, linkedBlockingQueue));
                                Object objTake = linkedBlockingQueue.take();
                                objTake.getClass();
                                Object obj = ((j0g0) objTake).f15681a;
                                z1x.P(obj);
                                List list2 = (List) obj;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (obj2 instanceof Dns.Record.ServiceMetadata) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                int iA = wp20.a(r3d.q(arrayList3, 10));
                                if (iA < 16) {
                                    iA = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                                for (Object obj3 : arrayList3) {
                                    ((Dns.Record.ServiceMetadata) obj3).getClass();
                                    linkedHashMap.put(null, obj3);
                                }
                                ArrayList<Dns.Record.IpAddress> arrayList4 = new ArrayList();
                                for (Object obj4 : list2) {
                                    if (obj4 instanceof Dns.Record.IpAddress) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                                for (Dns.Record.IpAddress ipAddress : arrayList4) {
                                    Address address3 = routeSelector.f46152a;
                                    InetSocketAddress inetSocketAddress2 = new InetSocketAddress(ipAddress.f46092a, port);
                                    Proxy.Type type = proxy.type();
                                    if (type != null) {
                                        int i2 = RouteSelector.WhenMappings.f46154a[type.ordinal()];
                                    }
                                    arrayList5.add(new Route(address3, proxy, inetSocketAddress2, null));
                                }
                                arrayList = arrayList5;
                            }
                            if (arrayList.isEmpty()) {
                                throw new UnknownHostException(routeSelector.f46152a.f46075a + " returned no addresses for " + hostAddress);
                            }
                            EventListener eventListener = routeSelector.c.eventListener;
                            RealCall realCall = routeSelector.c;
                            ArrayList arrayList6 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList6.add(((Route) it2.next()).c.getAddress());
                            }
                            eventListener.n(realCall, hostAddress, arrayList6);
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj5 : arrayList) {
                                if (((Route) obj5).d != null) {
                                    arrayList7.add(obj5);
                                }
                            }
                            boolean zIsEmpty = arrayList7.isEmpty();
                            ArrayList arrayList8 = arrayList7;
                            if (zIsEmpty) {
                                arrayList8 = arrayList;
                            }
                            listA = arrayList8;
                            if (routeSelector.d) {
                                int size = arrayList8.size();
                                listA = arrayList8;
                                if (size >= 2) {
                                    ArrayList arrayList9 = new ArrayList();
                                    ArrayList arrayList10 = new ArrayList();
                                    for (Object obj6 : arrayList8) {
                                        if (((Route) obj6).c.getAddress() instanceof Inet6Address) {
                                            arrayList9.add(obj6);
                                        } else {
                                            arrayList10.add(obj6);
                                        }
                                    }
                                    listA = arrayList8;
                                    if (!arrayList9.isEmpty()) {
                                        listA = arrayList8;
                                        if (!arrayList10.isEmpty()) {
                                            byte[] bArr = _UtilCommonKt.f46121a;
                                            Iterator it3 = arrayList9.iterator();
                                            Iterator it4 = arrayList10.iterator();
                                            lc00 lc00VarB = a.b();
                                            while (true) {
                                                if (!it3.hasNext() && !it4.hasNext()) {
                                                    break;
                                                }
                                                if (it3.hasNext()) {
                                                    lc00VarB.add(it3.next());
                                                }
                                                if (it4.hasNext()) {
                                                    lc00VarB.add(it4.next());
                                                }
                                            }
                                            listA = a.a(lc00VarB);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    for (Route route2 : listA) {
                        RouteDatabase routeDatabase = routeSelector.b;
                        synchronized (routeDatabase) {
                            route2.getClass();
                            zContains = routeDatabase.f46150a.contains(route2);
                        }
                        if (zContains) {
                            routeSelector.g.add(route2);
                        } else {
                            arrayList2.add(route2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                }
                if (arrayList2.isEmpty()) {
                    w3d.u(arrayList2, routeSelector.g);
                    routeSelector.g.clear();
                }
                RouteSelector.Selection selection2 = new RouteSelector.Selection(arrayList2);
                this.n = selection2;
                if (this.l.r) {
                    ohq.l("Canceled");
                    return null;
                }
                if (selection2.b >= arrayList2.size()) {
                    itt0.a();
                    return null;
                }
                int i3 = selection2.b;
                selection2.b = i3 + 1;
                connectPlanD = d((Route) arrayList2.get(i3), arrayList2);
            } else {
                int i4 = selection.b;
                ArrayList arrayList11 = selection.f46153a;
                if (i4 >= arrayList11.size()) {
                    itt0.a();
                    return null;
                }
                int i5 = selection.b;
                selection.b = i5 + 1;
                connectPlanD = d((Route) arrayList11.get(i5), null);
            }
        }
        ReusePlan reusePlanE2 = e(connectPlanD, connectPlanD.l);
        return reusePlanE2 != null ? reusePlanE2 : connectPlanD;
    }

    public final ConnectPlan d(Route route, ArrayList arrayList) throws UnknownServiceException {
        route.getClass();
        Address address = route.f46114a;
        if (address.c == null) {
            if (!address.k.contains(ConnectionSpec.h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f46114a.i.d;
            Platform platform = Platform.f46208a;
            if (!Platform.f46208a.j(str)) {
                throw new UnknownServiceException(kng0.l("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (address.j.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request request = null;
        if (route.b.type() == Proxy.Type.HTTP) {
            Address address2 = route.f46114a;
            if (address2.c != null || address2.j.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
                Request.Builder builder = new Request.Builder();
                builder.f46109a = route.f46114a.i;
                builder.b("CONNECT", null);
                Address address3 = route.f46114a;
                builder.a("Host", _UtilJvmKt.i(address3.i, true));
                builder.a("Proxy-Connection", "Keep-Alive");
                builder.a("User-Agent", "okhttp/5.5.1");
                request = new Request(builder);
                Response.Builder builder2 = new Response.Builder();
                builder2.f46112a = request;
                builder2.b = Protocol.HTTP_1_1;
                builder2.c = android.javax.sip.message.Response.PROXY_AUTHENTICATION_REQUIRED;
                builder2.d = "Preemptive Authenticate";
                builder2.l = -1L;
                builder2.m = -1L;
                builder2.f.e("Proxy-Authenticate", "OkHttp-Preemptive");
                Request requestD = address3.f.d(route, builder2.a());
                if (requestD != null) {
                    request = requestD;
                }
            }
        }
        return new ConnectPlan(this.f46148a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this, route, arrayList, 0, request, -1, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0031, B:22:0x003e, B:25:0x0045), top: B:53:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:14:0x0031, B:22:0x003e, B:25:0x0045), top: B:53:0x0031 }] */
    public final ReusePlan e(ConnectPlan connectPlan, List list) {
        RealConnection realConnection;
        boolean z;
        Socket socketG;
        RealConnectionPool realConnectionPool = this.b;
        boolean z2 = this.m;
        Address address = this.j;
        RealCall realCall = this.l;
        boolean z3 = connectPlan != null && connectPlan.isReady();
        Iterator it = realConnectionPool.d.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                realConnection = null;
                break;
            }
            realConnection = (RealConnection) it.next();
            realConnection.getClass();
            synchronized (realConnection) {
                if (z3) {
                    try {
                        if (!(realConnection.j != null)) {
                            z = false;
                        } else if (realConnection.g(address, list)) {
                            realCall.a(realConnection);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (realConnection.g(address, list)) {
                    z = false;
                } else {
                    realCall.a(realConnection);
                    z = true;
                }
            }
            if (z) {
                if (realConnection.h(z2)) {
                    break;
                }
                synchronized (realConnection) {
                    realConnection.k = true;
                    socketG = realCall.g();
                }
                if (socketG != null) {
                    _UtilJvmKt.c(socketG);
                }
            }
        }
        if (realConnection == null) {
            return null;
        }
        if (connectPlan != null) {
            this.p = connectPlan.k;
            Socket socket = connectPlan.t;
            if (socket != null) {
                _UtilJvmKt.c(socket);
            }
        }
        this.l.eventListener.j(this.l, realConnection);
        return new ReusePlan(realConnection);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    /* JADX INFO: renamed from: getAddress, reason: from getter */
    public final Address getJ() {
        return this.j;
    }
}
