package com.google.firebase.abt.component;

import a.c6;
import a.c7k;
import a.dgd;
import a.jf4;
import a.ofd;
import a.pfd;
import a.q0x;
import a.vp2;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c6 lambda$getComponents$0(dgd dgdVar) {
        return new c6((Context) dgdVar.a(Context.class), dgdVar.j(vp2.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        ofd ofdVarB = pfd.b(c6.class);
        ofdVarB.f25161a = LIBRARY_NAME;
        ofdVarB.a(c7k.c(Context.class));
        ofdVarB.a(c7k.a(vp2.class));
        ofdVarB.f = new jf4((byte) 3);
        return Arrays.asList(ofdVarB.b(), q0x.I(LIBRARY_NAME, "21.1.1"));
    }
}
