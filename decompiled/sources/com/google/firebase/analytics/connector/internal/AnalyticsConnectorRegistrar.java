package com.google.firebase.analytics.connector.internal;

import a.bnk;
import a.c7k;
import a.dgd;
import a.kys0;
import a.nao;
import a.nfq;
import a.ofd;
import a.pfd;
import a.q0x;
import a.s0x;
import a.sxs0;
import a.v6n0;
import a.vp2;
import a.wp2;
import a.wrw0;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static vp2 lambda$getComponents$0(dgd dgdVar) {
        nfq nfqVar = (nfq) dgdVar.a(nfq.class);
        Context context = (Context) dgdVar.a(Context.class);
        v6n0 v6n0Var = (v6n0) dgdVar.a(v6n0.class);
        s0x.H(nfqVar);
        s0x.H(context);
        s0x.H(v6n0Var);
        s0x.H(context.getApplicationContext());
        if (wp2.c == null) {
            synchronized (wp2.class) {
                try {
                    if (wp2.c == null) {
                        Bundle bundle = new Bundle(1);
                        nfqVar.a();
                        if ("[DEFAULT]".equals(nfqVar.b)) {
                            ((nao) v6n0Var).a(bnk.d, sxs0.b);
                            bundle.putBoolean("dataCollectionDefaultEnabled", nfqVar.j());
                        }
                        wp2.c = new wp2(wrw0.e(context, bundle).b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return wp2.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        ofd ofdVarB = pfd.b(vp2.class);
        ofdVarB.a(c7k.c(nfq.class));
        ofdVarB.a(c7k.c(Context.class));
        ofdVarB.a(c7k.c(v6n0.class));
        ofdVarB.f = kys0.c;
        ofdVarB.c(2);
        return Arrays.asList(ofdVarB.b(), q0x.I("fire-analytics", "23.2.0"));
    }
}
