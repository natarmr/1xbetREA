package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kmu0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18558a;
    public final /* synthetic */ nmu0 b;

    public /* synthetic */ kmu0(nmu0 nmu0Var, byte b) {
        this.f18558a = b;
        this.b = nmu0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18558a;
        nmu0 nmu0Var = this.b;
        switch (b) {
            case 0:
                svs0 svs0Var = nmu0.O1;
                nmu0Var.H0().x(em2.f8028a);
                return Unit.f46060a;
            case 1:
                svs0 svs0Var2 = nmu0.O1;
                ComponentCallbacks2 application = nmu0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(eep.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof eep)) {
                        ze3Var = null;
                    }
                    eep eepVar = (eep) ze3Var;
                    if (eepVar != null) {
                        return eepVar.a(a4n0.f(nmu0Var));
                    }
                }
                jf4.n(b1j.i(eep.class, "Cannot create dependency "));
                return null;
            case 2:
                svs0 svs0Var3 = nmu0.O1;
                return new q0h0((pgi) nmu0Var.G0().S.get());
            case 3:
                svs0 svs0Var4 = nmu0.O1;
                nmu0Var.H0().x(lm2.f20275a);
                return Unit.f46060a;
            default:
                svs0 svs0Var5 = nmu0.O1;
                nmu0Var.H0().x(mm2.f22018a);
                return Unit.f46060a;
        }
    }
}
