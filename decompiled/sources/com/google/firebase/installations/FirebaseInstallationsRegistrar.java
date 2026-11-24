package com.google.firebase.installations;

import a.c7k;
import a.cc5;
import a.cgq;
import a.dgd;
import a.dgq;
import a.jkd0;
import a.jtv;
import a.ktv;
import a.nfd;
import a.nfq;
import a.ofd;
import a.pfd;
import a.q0x;
import a.qgi0;
import a.sa8;
import a.udk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static dgq lambda$getComponents$0(dgd dgdVar) {
        return new cgq((nfq) dgdVar.a(nfq.class), dgdVar.j(ktv.class), (ExecutorService) dgdVar.e(new jkd0(cc5.class, ExecutorService.class)), new qgi0((Executor) dgdVar.e(new jkd0(sa8.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        ofd ofdVarB = pfd.b(dgq.class);
        ofdVarB.f25161a = LIBRARY_NAME;
        ofdVarB.a(c7k.c(nfq.class));
        ofdVarB.a(c7k.a(ktv.class));
        ofdVarB.a(new c7k(new jkd0(cc5.class, ExecutorService.class), 1, 0));
        ofdVarB.a(new c7k(new jkd0(sa8.class, Executor.class), 1, 0));
        ofdVarB.f = new udk((byte) 24);
        pfd pfdVarB = ofdVarB.b();
        jtv jtvVar = new jtv();
        ofd ofdVarB2 = pfd.b(jtv.class);
        ofdVarB2.e = true;
        ofdVarB2.f = new nfd(jtvVar, (byte) 0);
        return Arrays.asList(pfdVarB, ofdVarB2.b(), q0x.I(LIBRARY_NAME, "19.1.2"));
    }
}
