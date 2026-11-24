package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yho implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42646a;
    public final /* synthetic */ cio b;

    public /* synthetic */ yho(cio cioVar, byte b) {
        this.f42646a = b;
        this.b = cioVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42646a;
        vf2 vf2Var = vf2.f37311a;
        cio cioVar = this.b;
        switch (b) {
            case 0:
                ddk ddkVar = cio.P1;
                cioVar.H0().x(wf2.f39047a);
                return Unit.f46060a;
            case 1:
                ddk ddkVar2 = cio.P1;
                ComponentCallbacks2 application = cioVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(cep.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof cep)) {
                        ze3Var = null;
                    }
                    cep cepVar = (cep) ze3Var;
                    if (cepVar != null) {
                        return cepVar.a(a4n0.f(cioVar));
                    }
                }
                jf4.n(b1j.i(cep.class, "Cannot create dependency "));
                return null;
            case 2:
                ddk ddkVar3 = cio.P1;
                return new q0h0((lgi) cioVar.G0().s.get());
            case 3:
                ddk ddkVar4 = cio.P1;
                cioVar.H0().x(vf2Var);
                return Unit.f46060a;
            case 4:
                ddk ddkVar5 = cio.P1;
                cioVar.H0().x(vf2Var);
                return Unit.f46060a;
            default:
                ddk ddkVar6 = cio.P1;
                cioVar.H0().x(uf2.f35559a);
                return Unit.f46060a;
        }
    }
}
