package a;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ype implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43027a;
    public final /* synthetic */ bqe b;

    public /* synthetic */ ype(bqe bqeVar, byte b) {
        this.f43027a = b;
        this.b = bqeVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43027a;
        bqe bqeVar = this.b;
        switch (b) {
            case 0:
                kwd kwdVar = bqe.o2;
                ComponentCallbacks2 application = bqeVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(cqe.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof cqe)) {
                        ze3Var = null;
                    }
                    cqe cqeVar = (cqe) ze3Var;
                    if (cqeVar != null) {
                        dqe dqeVar = (dqe) bqeVar.n2.n(bqeVar, bqe.p2[0]);
                        lhf0 lhf0Var = cqeVar.b;
                        mne mneVar = cqeVar.f4790a;
                        wdk0 wdk0Var = cqeVar.c;
                        ctf0 ctf0Var = cqeVar.d;
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        return new hdi(dqeVar, lhf0Var, mneVar, wdk0Var, ctf0Var);
                    }
                }
                jf4.n(b1j.i(cqe.class, "Cannot create dependency "));
                return null;
            case 1:
                kwd kwdVar2 = bqe.o2;
                return (gdi) ((hdi) bqeVar.k2.getValue()).f.get();
            default:
                kwd kwdVar3 = bqe.o2;
                return bqeVar.p0();
        }
    }
}
