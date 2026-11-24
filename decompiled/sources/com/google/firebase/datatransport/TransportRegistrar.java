package com.google.firebase.datatransport;

import a.c7k;
import a.dgd;
import a.eps0;
import a.fjz;
import a.jkd0;
import a.kos0;
import a.mos0;
import a.ofd;
import a.pfd;
import a.q0x;
import a.ug9;
import a.v4i0;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ mos0 lambda$getComponents$0(dgd dgdVar) {
        eps0.b((Context) dgdVar.a(Context.class));
        return eps0.a().c(ug9.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ mos0 lambda$getComponents$1(dgd dgdVar) {
        eps0.b((Context) dgdVar.a(Context.class));
        return eps0.a().c(ug9.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ mos0 lambda$getComponents$2(dgd dgdVar) {
        eps0.b((Context) dgdVar.a(Context.class));
        return eps0.a().c(ug9.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        ofd ofdVarB = pfd.b(mos0.class);
        ofdVarB.f25161a = LIBRARY_NAME;
        ofdVarB.a(c7k.c(Context.class));
        ofdVarB.f = new v4i0((byte) 22);
        pfd pfdVarB = ofdVarB.b();
        ofd ofdVarA = pfd.a(new jkd0(fjz.class, mos0.class));
        ofdVarA.a(c7k.c(Context.class));
        ofdVarA.f = new v4i0((byte) 23);
        pfd pfdVarB2 = ofdVarA.b();
        ofd ofdVarA2 = pfd.a(new jkd0(kos0.class, mos0.class));
        ofdVarA2.a(c7k.c(Context.class));
        ofdVarA2.f = new v4i0((byte) 24);
        return Arrays.asList(pfdVarB, pfdVarB2, ofdVarA2.b(), q0x.I(LIBRARY_NAME, "19.0.0"));
    }
}
