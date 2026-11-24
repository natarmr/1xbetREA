package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionSpec;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
public final class euc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zn00 f8413a;
    public final List b;
    public final List c;
    public final List d;
    public final eii0 e;
    public final List f;
    public duc g;
    public final ArrayList h;
    public duc i;
    public duc j;
    public duc k;
    public final n0o0 l;

    public euc(zn00 zn00Var, List list, eii0 eii0Var) {
        iun iunVar = iun.f15405a;
        list.getClass();
        iunVar.getClass();
        iunVar.getClass();
        eii0Var.getClass();
        this.f8413a = zn00Var;
        this.b = list;
        this.c = iunVar;
        this.d = iunVar;
        this.e = eii0Var;
        this.f = q3d.j(new ConnectionSpec.Builder(ConnectionSpec.g).a(), new ConnectionSpec.Builder(ConnectionSpec.h).a());
        this.h = new ArrayList();
        this.l = maz.b(new zxb((byte) 20));
    }

    public final OkHttpClient a(List list) {
        return new OkHttpClient(c(this.f8413a.H0(), list));
    }

    public final OkHttpClient b(List list) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit.SECONDS.getClass();
        builder.A = _UtilJvmKt.b(5L, "interval");
        builder.b(30L);
        builder.a(30L);
        builder.c(30L);
        cuc cucVar = new cuc();
        if (cucVar != builder.u) {
            builder.D = null;
        }
        builder.u = cucVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Interceptor interceptor = (Interceptor) it.next();
            interceptor.getClass();
            builder.c.add(interceptor);
        }
        eii0.b(builder, this.e.f7862a.H0());
        return new OkHttpClient(builder);
    }

    public final OkHttpClient.Builder c(e6d0 e6d0Var, List list) {
        e6d0Var.getClass();
        list.getClass();
        Dispatcher dispatcher = new Dispatcher();
        synchronized (dispatcher) {
            dispatcher.f46089a = (byte) 20;
        }
        Dispatcher.c(dispatcher, null, null, null, 7);
        synchronized (dispatcher) {
            dispatcher.b = (byte) 10;
        }
        Dispatcher.c(dispatcher, null, null, null, 7);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        this.e.a(builder);
        builder.a(60L);
        builder.c(60L);
        builder.b(60L);
        builder.f46106a = dispatcher;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Interceptor interceptor = (Interceptor) it.next();
            interceptor.getClass();
            builder.c.add(interceptor);
        }
        List list2 = this.f;
        list2.getClass();
        if (!list2.equals(builder.s)) {
            builder.D = null;
        }
        builder.s = _UtilJvmKt.j(list2);
        this.e.getClass();
        eii0.b(builder, e6d0Var);
        return builder;
    }
}
