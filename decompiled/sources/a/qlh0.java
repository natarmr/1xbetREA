package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qlh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28934a;
    public final /* synthetic */ slh0 b;

    public /* synthetic */ qlh0(slh0 slh0Var, byte b) {
        this.f28934a = b;
        this.b = slh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28934a;
        slh0 slh0Var = this.b;
        switch (b) {
            case 0:
                cge0 cge0Var = slh0.O1;
                return new q0h0((usi) ((vsi) slh0Var.N1.getValue()).k.get());
            case 1:
                cge0 cge0Var2 = slh0.O1;
                ComponentCallbacks2 application = slh0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(tlh0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof tlh0)) {
                        ze3Var = null;
                    }
                    tlh0 tlh0Var = (tlh0) ze3Var;
                    if (tlh0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(slh0Var);
                        i1w0VarF.getClass();
                        qu quVar = tlh0Var.f34145a;
                        mne mneVar = tlh0Var.c;
                        duj dujVar = tlh0Var.b;
                        lef0 lef0Var = tlh0Var.d;
                        m1e m1eVar = tlh0Var.e;
                        wdk0 wdk0Var = tlh0Var.f;
                        ii iiVar = tlh0Var.g;
                        g2v g2vVar = tlh0Var.h;
                        d1p d1pVar = tlh0Var.i;
                        ctf0 ctf0Var = tlh0Var.j;
                        m1eVar.getClass();
                        wdk0Var.getClass();
                        iiVar.getClass();
                        ctf0Var.getClass();
                        d1pVar.getClass();
                        return new vsi(lef0Var, d1pVar, i1w0VarF, quVar, dujVar, mneVar, m1eVar, wdk0Var, g2vVar, ctf0Var);
                    }
                }
                jf4.n(b1j.i(tlh0.class, "Cannot create dependency "));
                return null;
            case 2:
                cge0 cge0Var3 = slh0.O1;
                slh0Var.G0().x(bkh0.f2747a);
                return Unit.f46060a;
            case 3:
                cge0 cge0Var4 = slh0.O1;
                slh0Var.G0().x(dkh0.f6230a);
                return Unit.f46060a;
            default:
                cge0 cge0Var5 = slh0.O1;
                slh0Var.G0().x(ekh0.f7951a);
                return Unit.f46060a;
        }
    }
}
