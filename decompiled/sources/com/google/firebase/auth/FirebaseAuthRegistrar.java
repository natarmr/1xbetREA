package com.google.firebase.auth;

import a.a7t0;
import a.c7k;
import a.cc5;
import a.dgd;
import a.gmx;
import a.jkd0;
import a.jmz;
import a.jtv;
import a.ktv;
import a.nfd;
import a.nfq;
import a.ofd;
import a.pfd;
import a.q0x;
import a.sa8;
import a.vkr0;
import a.vmx;
import a.zdw0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ zdw0 lambda$getComponents$0(jkd0 jkd0Var, jkd0 jkd0Var2, jkd0 jkd0Var3, jkd0 jkd0Var4, jkd0 jkd0Var5, dgd dgdVar) {
        return new zdw0((nfq) dgdVar.a(nfq.class), dgdVar.j(vmx.class), dgdVar.j(ktv.class), (Executor) dgdVar.e(jkd0Var), (Executor) dgdVar.e(jkd0Var2), (Executor) dgdVar.e(jkd0Var3), (ScheduledExecutorService) dgdVar.e(jkd0Var4), (Executor) dgdVar.e(jkd0Var5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        jkd0 jkd0Var = new jkd0(cc5.class, Executor.class);
        jkd0 jkd0Var2 = new jkd0(sa8.class, Executor.class);
        jkd0 jkd0Var3 = new jkd0(jmz.class, Executor.class);
        jkd0 jkd0Var4 = new jkd0(jmz.class, ScheduledExecutorService.class);
        jkd0 jkd0Var5 = new jkd0(a7t0.class, Executor.class);
        ofd ofdVar = new ofd(zdw0.class, gmx.class);
        ofdVar.a(c7k.c(nfq.class));
        ofdVar.a(new c7k(1, 1, ktv.class));
        ofdVar.a(new c7k(jkd0Var, 1, 0));
        ofdVar.a(new c7k(jkd0Var2, 1, 0));
        ofdVar.a(new c7k(jkd0Var3, 1, 0));
        ofdVar.a(new c7k(jkd0Var4, 1, 0));
        ofdVar.a(new c7k(jkd0Var5, 1, 0));
        ofdVar.a(c7k.a(vmx.class));
        vkr0 vkr0Var = new vkr0();
        vkr0Var.b = jkd0Var;
        vkr0Var.c = jkd0Var2;
        vkr0Var.d = jkd0Var3;
        vkr0Var.e = jkd0Var4;
        vkr0Var.f = jkd0Var5;
        ofdVar.f = vkr0Var;
        pfd pfdVarB = ofdVar.b();
        jtv jtvVar = new jtv();
        ofd ofdVarB = pfd.b(jtv.class);
        ofdVarB.e = true;
        ofdVarB.f = new nfd(jtvVar, (byte) 0);
        return Arrays.asList(pfdVarB, ofdVarB.b(), q0x.I("fire-auth", "24.2.0"));
    }
}
