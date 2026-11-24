package com.google.firebase;

import a.a7t0;
import a.c7k;
import a.cc5;
import a.gqw0;
import a.jkd0;
import a.jmz;
import a.jtv;
import a.lne;
import a.ofd;
import a.pfd;
import a.q3d;
import a.rv00;
import a.sa8;
import a.ujn;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "La/pfd;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        ofd ofdVarA = pfd.a(new jkd0(cc5.class, lne.class));
        ofdVarA.a(new c7k(new jkd0(cc5.class, Executor.class), 1, 0));
        ofdVarA.f = ujn.l;
        pfd pfdVarB = ofdVarA.b();
        ofd ofdVarA2 = pfd.a(new jkd0(jmz.class, lne.class));
        ofdVarA2.a(new c7k(new jkd0(jmz.class, Executor.class), 1, 0));
        ofdVarA2.f = jtv.i;
        pfd pfdVarB2 = ofdVarA2.b();
        ofd ofdVarA3 = pfd.a(new jkd0(sa8.class, lne.class));
        ofdVarA3.a(new c7k(new jkd0(sa8.class, Executor.class), 1, 0));
        ofdVarA3.f = rv00.o;
        pfd pfdVarB3 = ofdVarA3.b();
        ofd ofdVarA4 = pfd.a(new jkd0(a7t0.class, lne.class));
        ofdVarA4.a(new c7k(new jkd0(a7t0.class, Executor.class), 1, 0));
        ofdVarA4.f = gqw0.l1;
        return q3d.j(pfdVarB, pfdVarB2, pfdVarB3, ofdVarA4.b());
    }
}
