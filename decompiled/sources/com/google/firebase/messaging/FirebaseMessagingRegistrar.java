package com.google.firebase.messaging;

import a.c7k;
import a.dgd;
import a.dgq;
import a.fgq;
import a.hny;
import a.jkd0;
import a.kos0;
import a.ltv;
import a.mos0;
import a.nfq;
import a.ofd;
import a.ouj;
import a.pfd;
import a.q0x;
import a.v6n0;
import a.yyj;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(jkd0 jkd0Var, dgd dgdVar) {
        nfq nfqVar = (nfq) dgdVar.a(nfq.class);
        if (dgdVar.a(fgq.class) == null) {
            return new FirebaseMessaging(nfqVar, dgdVar.j(yyj.class), dgdVar.j(ltv.class), (dgq) dgdVar.a(dgq.class), dgdVar.l(jkd0Var), (v6n0) dgdVar.a(v6n0.class));
        }
        hny.b();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        jkd0 jkd0Var = new jkd0(kos0.class, mos0.class);
        ofd ofdVarB = pfd.b(FirebaseMessaging.class);
        ofdVarB.f25161a = LIBRARY_NAME;
        ofdVarB.a(c7k.c(nfq.class));
        ofdVarB.a(new c7k(0, 0, fgq.class));
        ofdVarB.a(c7k.a(yyj.class));
        ofdVarB.a(c7k.a(ltv.class));
        ofdVarB.a(c7k.c(dgq.class));
        ofdVarB.a(new c7k(jkd0Var, 0, 1));
        ofdVarB.a(c7k.c(v6n0.class));
        ofdVarB.f = new ouj(jkd0Var, (byte) 1);
        ofdVarB.c(1);
        return Arrays.asList(ofdVarB.b(), q0x.I(LIBRARY_NAME, "25.1.3"));
    }
}
