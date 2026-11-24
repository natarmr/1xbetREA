package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ContextCompat;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class g {
    private static final ExecutorService b = ExecutorsUtils.newCachedThreadPool("GrsReqPool");
    private static final Map<String, com.huawei.hms.framework.network.grs.g.j.b> c = new ConcurrentHashMap(16);
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f45828a;

    public class a implements Callable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f45829a;
        final /* synthetic */ String b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c c;

        public a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
            this.f45829a = cVar;
            this.b = str;
            this.c = cVar2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return new c(this.f45829a, g.this.f45828a).a(g.b, this.b, this.c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f45830a;
        final /* synthetic */ String b;
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c c;
        final /* synthetic */ int d;
        final /* synthetic */ com.huawei.hms.framework.network.grs.b e;

        public b(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i, com.huawei.hms.framework.network.grs.b bVar) {
            this.f45830a = cVar;
            this.b = str;
            this.c = cVar2;
            this.d = i;
            this.e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.a(gVar.a(this.f45830a, this.b, this.c, this.d), this.e);
        }
    }

    public d a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i) {
        Future<d> futureSubmit;
        String str2;
        String str3;
        String str4;
        String str5;
        Logger.d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = cVar.b().getGrsParasKey(true, true, cVar.a());
        Logger.v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (d) {
            try {
                if (ContextCompat.checkSelfPermission(cVar.a(), "android.permission.ACCESS_NETWORK_STATE")) {
                    if (com.huawei.hms.framework.network.grs.h.f.a.a(cVar.a())) {
                        com.huawei.hms.framework.network.grs.h.d.a aVarA = com.huawei.hms.framework.network.grs.h.d.a(grsParasKey);
                        Map<String, com.huawei.hms.framework.network.grs.g.j.b> map = c;
                        com.huawei.hms.framework.network.grs.g.j.b bVar = map.get(grsParasKey);
                        if (bVar != null && bVar.b()) {
                            futureSubmit = bVar.a();
                        } else if (aVarA == null || !aVarA.a()) {
                            Logger.d("RequestController", "hitGrsRequestBean == null or request block is released.");
                            futureSubmit = b.submit(new a(cVar, str, cVar2));
                            map.put(grsParasKey, new com.huawei.hms.framework.network.grs.g.j.b(futureSubmit));
                        }
                        if (i == -1) {
                            com.huawei.hms.framework.network.grs.g.j.d dVarA = com.huawei.hms.framework.network.grs.g.i.a.a(cVar.a());
                            i = dVarA != null ? dVarA.c() : 10;
                        }
                        Logger.i("RequestController", "use grsQueryTimeout %d, pkg:%s", Integer.valueOf(i), cVar.a() == null ? "" : cVar.a().getPackageName());
                        try {
                            return futureSubmit.get(i, TimeUnit.SECONDS);
                        } catch (InterruptedException e) {
                            e = e;
                            str2 = "RequestController";
                            str3 = "when check result, find InterruptedException, check others";
                            Logger.w(str2, str3, e);
                            return null;
                        } catch (CancellationException e2) {
                            e = e2;
                            str2 = "RequestController";
                            str3 = "when check result, find CancellationException, check others";
                            Logger.w(str2, str3, e);
                            return null;
                        } catch (ExecutionException e3) {
                            e = e3;
                            str2 = "RequestController";
                            str3 = "when check result, find ExecutionException, check others";
                            Logger.w(str2, str3, e);
                            return null;
                        } catch (TimeoutException e4) {
                            e = e4;
                            str2 = "RequestController";
                            str3 = "when check result, find TimeoutException, check others";
                            Logger.w(str2, str3, e);
                            return null;
                        } catch (Exception e5) {
                            e = e5;
                            str2 = "RequestController";
                            str3 = "when check result, find Other Exception, check others";
                            Logger.w(str2, str3, e);
                            return null;
                        }
                    }
                    str4 = "RequestController";
                    str5 = "isNetCapabilityValidated false";
                    return null;
                }
                str4 = "RequestController";
                str5 = "no has netPermission";
                Logger.i(str4, str5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f45828a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar != null) {
            if (dVar == null) {
                Logger.v("RequestController", "GrsResponse is null");
                bVar.a();
            } else {
                Logger.v("RequestController", "GrsResponse is not null");
                bVar.a(dVar);
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.b bVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i) {
        b.execute(new b(cVar, str, cVar2, i, bVar));
    }

    public void a(String str) {
        synchronized (d) {
            c.remove(str);
        }
    }
}
