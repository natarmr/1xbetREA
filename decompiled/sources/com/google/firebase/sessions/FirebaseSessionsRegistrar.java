package com.google.firebase.sessions;

import a.c7k;
import a.cc5;
import a.cjx;
import a.dgd;
import a.dgq;
import a.ghq;
import a.hhq;
import a.hpj0;
import a.ihq;
import a.jhi;
import a.jhq;
import a.jkd0;
import a.knx;
import a.lbl;
import a.lji0;
import a.lne;
import a.m5d0;
import a.mos0;
import a.nfq;
import a.ofd;
import a.ohq;
import a.p5d0;
import a.pco;
import a.pfd;
import a.phq;
import a.q0x;
import a.q3d;
import a.qhq;
import a.sa8;
import a.udk;
import a.wji0;
import a.ygf0;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "La/pfd;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a/phq", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final phq Companion = new phq();
    private static final jkd0 appContext = jkd0.a(Context.class);
    private static final jkd0 firebaseApp = jkd0.a(nfq.class);
    private static final jkd0 firebaseInstallationsApi = jkd0.a(dgq.class);
    private static final jkd0 backgroundDispatcher = new jkd0(cc5.class, lne.class);
    private static final jkd0 blockingDispatcher = new jkd0(sa8.class, lne.class);
    private static final jkd0 transportFactory = jkd0.a(mos0.class);
    private static final jkd0 firebaseSessionsComponent = jkd0.a(hhq.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ghq getComponents$lambda$0(dgd dgdVar) {
        return (ghq) ((jhi) ((hhq) dgdVar.e(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hhq getComponents$lambda$1(dgd dgdVar) {
        Object objE = dgdVar.e(appContext);
        objE.getClass();
        Object objE2 = dgdVar.e(backgroundDispatcher);
        objE2.getClass();
        Object objE3 = dgdVar.e(blockingDispatcher);
        objE3.getClass();
        Object objE4 = dgdVar.e(firebaseApp);
        objE4.getClass();
        Object objE5 = dgdVar.e(firebaseInstallationsApi);
        objE5.getClass();
        p5d0 p5d0VarL = dgdVar.l(transportFactory);
        p5d0VarL.getClass();
        jhi jhiVar = new jhi();
        jhiVar.f16527a = lji0.a((nfq) objE4);
        lji0 lji0VarA = lji0.a((Context) objE);
        jhiVar.b = lji0VarA;
        jhiVar.c = lbl.a(new pco(lji0VarA, (byte) 2));
        jhiVar.d = lbl.a(cjx.p);
        jhiVar.e = lji0.a((dgq) objE5);
        byte b = 1;
        jhiVar.f = lbl.a(new pco(jhiVar.f16527a, b));
        lji0 lji0VarA2 = lji0.a((CoroutineContext) objE3);
        jhiVar.g = lji0VarA2;
        jhiVar.h = lbl.a(new ihq(jhiVar.f, lji0VarA2));
        jhiVar.i = lji0.a((CoroutineContext) objE2);
        byte b2 = 0;
        jhiVar.j = lbl.a(new wji0(jhiVar.c, lbl.a(new ygf0(jhiVar.d, jhiVar.e, jhiVar.f, jhiVar.h, lbl.a(new jhq((m5d0) jhiVar.i, jhiVar.d, lbl.a(new ihq(jhiVar.b, jhiVar.g, b2)))))), b));
        m5d0 m5d0VarA = lbl.a(knx.g);
        jhiVar.k = m5d0VarA;
        jhiVar.l = lbl.a(new wji0(jhiVar.d, m5d0VarA, b2));
        jhiVar.m = lbl.a(new ygf0(jhiVar.f16527a, (m5d0) jhiVar.e, jhiVar.j, lbl.a(new pco(lji0.a(p5d0VarL), b2)), (m5d0) jhiVar.i));
        jhiVar.n = lbl.a(new jhq(jhiVar.b, (m5d0) jhiVar.g, lbl.a(new lji0(jhiVar.l, b2))));
        m5d0 m5d0VarA2 = lbl.a(new hpj0(jhiVar.j, jhiVar.l, jhiVar.m, jhiVar.d, jhiVar.n, lbl.a(new ihq(jhiVar.b, jhiVar.k, b)), jhiVar.i));
        jhiVar.o = m5d0VarA2;
        jhiVar.p = lbl.a(new qhq(jhiVar.f16527a, jhiVar.j, jhiVar.i, lbl.a(new lji0(m5d0VarA2, b))));
        return jhiVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<pfd> getComponents() {
        ofd ofdVarB = pfd.b(ghq.class);
        ofdVarB.f25161a = LIBRARY_NAME;
        ofdVarB.a(c7k.b(firebaseSessionsComponent));
        ofdVarB.f = new udk((byte) 29);
        ofdVarB.c(2);
        pfd pfdVarB = ofdVarB.b();
        ofd ofdVarB2 = pfd.b(hhq.class);
        ofdVarB2.f25161a = "fire-sessions-component";
        ofdVarB2.a(c7k.b(appContext));
        ofdVarB2.a(c7k.b(backgroundDispatcher));
        ofdVarB2.a(c7k.b(blockingDispatcher));
        ofdVarB2.a(c7k.b(firebaseApp));
        ofdVarB2.a(c7k.b(firebaseInstallationsApi));
        ofdVarB2.a(new c7k(transportFactory, 1, 1));
        ofdVarB2.f = new ohq((byte) 0);
        return q3d.j(pfdVarB, ofdVarB2.b(), q0x.I(LIBRARY_NAME, "3.0.8"));
    }
}
