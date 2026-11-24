package a;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sr4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32657a;
    public final /* synthetic */ ur4 b;

    public /* synthetic */ sr4(ur4 ur4Var, byte b) {
        this.f32657a = b;
        this.b = ur4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32657a;
        ur4 ur4Var = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = ur4.P1;
                ComponentCallbacks2 application = ur4Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(vr4.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof vr4)) {
                        ze3Var = null;
                    }
                    vr4 vr4Var = (vr4) ze3Var;
                    if (vr4Var != null) {
                        i1w0 i1w0VarF = a4n0.f(ur4Var);
                        Boolean boolN = ur4Var.K1.n(ur4Var, ur4.Q1[0]);
                        i1w0VarF.getClass();
                        g2v g2vVar = vr4Var.f37880a;
                        ctf0 ctf0Var = vr4Var.c;
                        rou rouVar = vr4Var.b;
                        ctf0Var.getClass();
                        return new i9i(g2vVar, boolN, rouVar, i1w0VarF);
                    }
                }
                jf4.n(b1j.i(vr4.class, "Cannot create dependency "));
                return null;
            default:
                qek0 qek0Var2 = ur4.P1;
                return (h9i) ((i9i) ur4Var.L1.getValue()).e.get();
        }
    }
}
