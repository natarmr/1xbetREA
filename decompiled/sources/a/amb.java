package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class amb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1099a;
    public final /* synthetic */ cmb b;

    public /* synthetic */ amb(cmb cmbVar, byte b) {
        this.f1099a = b;
        this.b = cmbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1099a;
        cmb cmbVar = this.b;
        switch (b) {
            case 0:
                yk5 yk5Var = cmb.O1;
                ComponentCallbacks2 application = cmbVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(y4b.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof y4b)) {
                        ze3Var = null;
                    }
                    y4b y4bVar = (y4b) ze3Var;
                    if (y4bVar != null) {
                        return y4bVar.a(a4n0.f(cmbVar));
                    }
                }
                jf4.n(b1j.i(y4b.class, "Cannot create dependency "));
                return null;
            case 1:
                yk5 yk5Var2 = cmb.O1;
                return new q0h0((ybi) ((aci) cmbVar.L1.getValue()).Z.get());
            case 2:
                yk5 yk5Var3 = cmb.O1;
                cmbVar.G0().x(vi2.f37456a);
                return Unit.f46060a;
            default:
                yk5 yk5Var4 = cmb.O1;
                cmbVar.G0().x(wi2.f39193a);
                return Unit.f46060a;
        }
    }
}
