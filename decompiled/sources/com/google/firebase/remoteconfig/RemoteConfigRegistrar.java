package com.google.firebase.remoteconfig;

import a.bhq;
import a.c6;
import a.c7k;
import a.dgd;
import a.dgq;
import a.gfq;
import a.jkd0;
import a.nfq;
import a.ofd;
import a.ouj;
import a.pfd;
import a.q0x;
import a.qff0;
import a.sa8;
import a.vp2;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static qff0 lambda$getComponents$0(jkd0 jkd0Var, dgd dgdVar) {
        gfq gfqVar;
        Context context = (Context) dgdVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dgdVar.e(jkd0Var);
        nfq nfqVar = (nfq) dgdVar.a(nfq.class);
        dgq dgqVar = (dgq) dgdVar.a(dgq.class);
        c6 c6Var = (c6) dgdVar.a(c6.class);
        synchronized (c6Var) {
            try {
                if (!c6Var.f3795a.containsKey("frc")) {
                    c6Var.f3795a.put("frc", new gfq(c6Var.b));
                }
                gfqVar = (gfq) c6Var.f3795a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new qff0(context, scheduledExecutorService, nfqVar, dgqVar, gfqVar, dgdVar.j(vp2.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        jkd0 jkd0Var = new jkd0(sa8.class, ScheduledExecutorService.class);
        ofd ofdVar = new ofd(qff0.class, bhq.class);
        ofdVar.f25161a = LIBRARY_NAME;
        ofdVar.a(c7k.c(Context.class));
        ofdVar.a(new c7k(jkd0Var, 1, 0));
        ofdVar.a(c7k.c(nfq.class));
        ofdVar.a(c7k.c(dgq.class));
        ofdVar.a(c7k.c(c6.class));
        ofdVar.a(c7k.a(vp2.class));
        ofdVar.f = new ouj(jkd0Var, (byte) 3);
        ofdVar.c(2);
        return Arrays.asList(ofdVar.b(), q0x.I(LIBRARY_NAME, "23.1.0"));
    }
}
