package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k1i0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17525a;
    public final /* synthetic */ m1i0 b;

    public /* synthetic */ k1i0(m1i0 m1i0Var, byte b) {
        this.f17525a = b;
        this.b = m1i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17525a;
        m1i0 m1i0Var = this.b;
        switch (b) {
            case 0:
                cge0 cge0Var = m1i0.O1;
                m1i0Var.G0().x(dec.f5943a);
                return Unit.f46060a;
            case 1:
                cge0 cge0Var2 = m1i0.O1;
                m1i0Var.G0().x(cec.f4203a);
                return Unit.f46060a;
            case 2:
                cge0 cge0Var3 = m1i0.O1;
                ComponentCallbacks2 application = m1i0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(lec.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof lec)) {
                        ze3Var = null;
                    }
                    lec lecVar = (lec) ze3Var;
                    if (lecVar != null) {
                        i1w0 i1w0VarF = a4n0.f(m1i0Var);
                        i1w0VarF.getClass();
                        iip iipVar = lecVar.f19895a;
                        mne mneVar = lecVar.b;
                        g2v g2vVar = lecVar.e;
                        x0u x0uVar = lecVar.d;
                        ii iiVar = lecVar.g;
                        m1e m1eVar = lecVar.c;
                        ctf0 ctf0Var = lecVar.f;
                        duj dujVar = lecVar.h;
                        iipVar.getClass();
                        m1eVar.getClass();
                        iiVar.getClass();
                        ctf0Var.getClass();
                        return new oci(iipVar, mneVar, dujVar, x0uVar, g2vVar, iiVar, i1w0VarF, ctf0Var);
                    }
                }
                jf4.n(b1j.i(lec.class, "Cannot create dependency "));
                return null;
            case 3:
                cge0 cge0Var4 = m1i0.O1;
                return new q0h0((nci) ((oci) m1i0Var.M1.getValue()).i.get());
            default:
                cge0 cge0Var5 = m1i0.O1;
                m1i0Var.G0().x(iec.f14625a);
                return Unit.f46060a;
        }
    }
}
