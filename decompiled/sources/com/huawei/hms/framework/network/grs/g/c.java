package com.huawei.hms.framework.network.grs.g;

import a.jf4;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static final String l = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f45825a;
    private final Context b;
    private final com.huawei.hms.framework.network.grs.e.a c;
    private d d;
    private final com.huawei.hms.framework.network.grs.g.j.c i;
    private final Map<String, Future<d>> e = new ConcurrentHashMap(16);
    private final List<d> f = new CopyOnWriteArrayList();
    private final JSONArray g = new JSONArray();
    private final List<String> h = new CopyOnWriteArrayList();
    private String j = "";
    private long k = 1;

    public c(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.i = cVar;
        this.f45825a = cVar.b();
        this.b = cVar.a();
        this.c = aVar;
        b();
        c();
    }

    private void b() {
        com.huawei.hms.framework.network.grs.g.j.d dVarA = com.huawei.hms.framework.network.grs.g.i.a.a(this.b);
        if (dVarA == null) {
            Logger.w(l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(dVarA);
        List<String> listA = dVarA.a();
        if (listA == null || listA.size() <= 0) {
            Logger.v(l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (listA.size() > 10) {
            jf4.o("grs_base_url's count is larger than MAX value 10");
            return;
        }
        String strB = dVarA.b();
        if (listA.size() > 0) {
            for (String str : listA) {
                if (str.startsWith("https://")) {
                    a(strB, str);
                } else {
                    Logger.w(l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.v(l, "request to GRS server url is {%s}", this.h);
    }

    private void c() {
        String grsParasKey = this.f45825a.getGrsParasKey(true, true, this.b);
        this.j = this.c.a().a(grsParasKey + "ETag", "");
    }

    private String d() {
        com.huawei.hms.framework.network.grs.f.b bVarA = com.huawei.hms.framework.network.grs.f.b.a(this.b.getPackageName());
        com.huawei.hms.framework.network.grs.local.model.a aVarA = bVarA != null ? bVarA.a() : null;
        if (aVarA == null) {
            return "";
        }
        String strA = aVarA.a();
        Logger.v(l, "get appName from local assets is{%s}", strA);
        return strA;
    }

    public synchronized void a(d dVar) {
        try {
            this.f.add(dVar);
            d dVar2 = this.d;
            if (dVar2 == null || (!dVar2.o() && !this.d.m())) {
                if (dVar.n()) {
                    Logger.i(l, "GRS server open 503 limiting strategy.");
                    com.huawei.hms.framework.network.grs.h.d.a(this.f45825a.getGrsParasKey(true, true, this.b), new com.huawei.hms.framework.network.grs.h.d.a(dVar.k(), SystemClock.elapsedRealtime()));
                    return;
                }
                if (dVar.m()) {
                    Logger.i(l, "GRS server open 304 Not Modified.");
                }
                if (!dVar.o() && !dVar.m()) {
                    Logger.v(l, "grsResponseResult has exception so need return");
                    return;
                }
                this.d = dVar;
                this.c.a(this.f45825a, dVar, this.b, this.i);
                for (Map.Entry<String, Future<d>> entry : this.e.entrySet()) {
                    if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                        Logger.i(l, "future cancel");
                        entry.getValue().cancel(true);
                    }
                }
                return;
            }
            Logger.v(l, "grsResponseResult is ok");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096 A[LOOP:0: B:3:0x0004->B:36:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x008e A[SYNTHETIC] */
    private d a(ExecutorService executorService, List<String> list, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        c cVar2;
        String str2;
        com.huawei.hms.framework.network.grs.e.c cVar3;
        boolean z;
        ExecutionException executionException;
        InterruptedException interruptedException;
        d dVar = null;
        int i = 0;
        while (i < list.size()) {
            String str3 = list.get(i);
            if (TextUtils.isEmpty(str3)) {
                cVar2 = this;
                str2 = str;
                cVar3 = cVar;
            } else {
                cVar2 = this;
                str2 = str;
                cVar3 = cVar;
                Future<d> futureSubmit = executorService.submit(new a(str3, i, cVar2, this.b, str2, this.f45825a, cVar3).g());
                cVar2.e.put(str3, futureSubmit);
                z = true;
                try {
                    d dVar2 = futureSubmit.get(cVar2.k, TimeUnit.SECONDS);
                    if (dVar2 != null) {
                        try {
                            if (dVar2.o() || dVar2.m()) {
                                Logger.i(l, "grs request return body is not null and is OK.");
                                dVar = dVar2;
                            }
                        } catch (InterruptedException e) {
                            interruptedException = e;
                            dVar = dVar2;
                            Logger.w(l, "the current thread was interrupted while waiting", interruptedException);
                        } catch (CancellationException unused) {
                            dVar = dVar2;
                            Logger.i(l, "{requestServer} the computation was cancelled");
                        } catch (ExecutionException e2) {
                            executionException = e2;
                            dVar = dVar2;
                            Logger.w(l, "the computation threw an ExecutionException", executionException);
                        } catch (TimeoutException unused2) {
                            dVar = dVar2;
                            Logger.w(l, "the wait timed out");
                        }
                        if (z) {
                            Logger.v(l, "needBreak is true so need break current circulation");
                            return cVar2.b(dVar);
                        }
                        i++;
                        this = cVar2;
                        str = str2;
                        cVar = cVar3;
                    }
                    dVar = dVar2;
                } catch (InterruptedException e3) {
                    interruptedException = e3;
                } catch (CancellationException unused3) {
                } catch (ExecutionException e4) {
                    executionException = e4;
                } catch (TimeoutException unused4) {
                }
            }
            z = false;
            if (z) {
                Logger.v(l, "needBreak is true so need break current circulation");
                return cVar2.b(dVar);
            }
            i++;
            this = cVar2;
            str = str2;
            cVar = cVar3;
        }
        cVar2 = this;
        return cVar2.b(dVar);
    }

    private d b(d dVar) throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e = e;
                str = l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e2) {
                e = e2;
                str = l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    public String a() {
        return this.j;
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        if (this.h.isEmpty()) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d dVarA = a(executorService, this.h, str, cVar);
        Logger.i(l, "use 2.0 interface return http's code is：{%d}", Integer.valueOf(dVarA == null ? 0 : dVarA.b()));
        e.a(new ArrayList(this.f), SystemClock.elapsedRealtime() - jElapsedRealtime, this.g, this.b);
        this.f.clear();
        return dVarA;
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.d dVar) {
    }

    private void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        String grsReqParamJoint = this.f45825a.getGrsReqParamJoint(false, false, d(), this.b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb.append(Separators.QUESTION);
            sb.append(grsReqParamJoint);
        }
        this.h.add(sb.toString());
    }
}
