package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zxo implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45170a;
    public final /* synthetic */ byo b;

    public /* synthetic */ zxo(byo byoVar, byte b) {
        this.f45170a = b;
        this.b = byoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45170a;
        byo byoVar = this.b;
        switch (b) {
            case 0:
                bek bekVar = byo.P1;
                ComponentCallbacks2 application = byoVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(cyo.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof cyo)) {
                        ze3Var = null;
                    }
                    cyo cyoVar = (cyo) ze3Var;
                    if (cyoVar != null) {
                        i1w0 i1w0VarF = a4n0.f(byoVar);
                        we50 we50Var = (we50) byoVar.M1.n(byoVar, byo.Q1[1]);
                        i1w0VarF.getClass();
                        return new egi(cyoVar.f5187a, cyoVar.b, cyoVar.c, cyoVar.d, i1w0VarF, we50Var);
                    }
                }
                jf4.n(b1j.i(cyo.class, "Cannot create dependency "));
                return null;
            case 1:
                bek bekVar2 = byo.P1;
                return new q0h0((dgi) ((egi) byoVar.N1.getValue()).g.get());
            case 2:
                bek bekVar3 = byo.P1;
                String strH = byoVar.H(R.string.network_error);
                strH.getClass();
                byoVar.I0(rek0.b, strH);
                return Unit.f46060a;
            case 3:
                bek bekVar4 = byo.P1;
                byoVar.H0().x(lxo.f20825a);
                return Unit.f46060a;
            default:
                bek bekVar5 = byo.P1;
                byoVar.H0().x(mxo.f22566a);
                return Unit.f46060a;
        }
    }
}
