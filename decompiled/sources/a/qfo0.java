package a;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qfo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28646a;
    public final /* synthetic */ ufo0 b;

    public /* synthetic */ qfo0(ufo0 ufo0Var, byte b) {
        this.f28646a = b;
        this.b = ufo0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28646a;
        ufo0 ufo0Var = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = ufo0.Q1;
                ComponentCallbacks2 application = ufo0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(kho0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof kho0)) {
                        ze3Var = null;
                    }
                    kho0 kho0Var = (kho0) ze3Var;
                    if (kho0Var != null) {
                        return kho0Var.a(a4n0.f(ufo0Var), (r040) ufo0Var.O1.n(ufo0Var, ufo0.R1[1]));
                    }
                }
                jf4.n(b1j.i(kho0.class, "Cannot create dependency "));
                return null;
            default:
                s2m0 s2m0Var2 = ufo0.Q1;
                return (bwi) ((cwi) ufo0Var.M1.getValue()).B.get();
        }
    }
}
