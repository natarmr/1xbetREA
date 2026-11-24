package com.google.firebase.crashlytics;

import a.bhq;
import a.c7k;
import a.cc5;
import a.dgq;
import a.gne;
import a.jkd0;
import a.jki0;
import a.jmz;
import a.k8f;
import a.lhq;
import a.nfq;
import a.nhq;
import a.ofd;
import a.pfd;
import a.q0x;
import a.sa8;
import a.tfq;
import a.vp2;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkd0 f45663a = new jkd0(cc5.class, ExecutorService.class);
    public final jkd0 b = new jkd0(sa8.class, ExecutorService.class);
    public final jkd0 c = new jkd0(jmz.class, ExecutorService.class);

    static {
        jki0 jki0Var = jki0.f16670a;
        Map map = nhq.b;
        if (map.containsKey(jki0Var)) {
            Log.d("FirebaseSessions", "Dependency " + jki0Var + " already added.");
            return;
        }
        map.put(jki0Var, new lhq(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + jki0Var + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ofd ofdVarB = pfd.b(tfq.class);
        ofdVarB.f25161a = "fire-cls";
        ofdVarB.a(c7k.c(nfq.class));
        ofdVarB.a(c7k.c(dgq.class));
        ofdVarB.a(new c7k(this.f45663a, 1, 0));
        ofdVarB.a(new c7k(this.b, 1, 0));
        ofdVarB.a(new c7k(this.c, 1, 0));
        ofdVarB.a(new c7k(0, 2, k8f.class));
        ofdVarB.a(new c7k(0, 2, vp2.class));
        ofdVarB.a(new c7k(0, 2, bhq.class));
        ofdVarB.f = new gne(this, (byte) 29);
        ofdVarB.c(2);
        return Arrays.asList(ofdVarB.b(), q0x.I("fire-cls", "20.1.1"));
    }
}
