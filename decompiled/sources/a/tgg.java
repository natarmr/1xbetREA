package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tgg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33910a;
    public final /* synthetic */ vgg b;

    public /* synthetic */ tgg(vgg vggVar, byte b) {
        this.f33910a = b;
        this.b = vggVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33910a;
        vgg vggVar = this.b;
        switch (b) {
            case 0:
                qud qudVar = vgg.Q1;
                ((aig) vggVar.O1.getValue()).x(ihg.f14778a);
                return Unit.f46060a;
            case 1:
                qud qudVar2 = vgg.Q1;
                ComponentCallbacks2 application = vggVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(rgg.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof rgg)) {
                        ze3Var = null;
                    }
                    rgg rggVar = (rgg) ze3Var;
                    if (rggVar != null) {
                        CyberChampsMainParams cyberChampsMainParams = (CyberChampsMainParams) vggVar.M1.n(vggVar, vgg.R1[0]);
                        cad cadVar = rggVar.f30433a;
                        pyg pygVar = rggVar.b;
                        iip iipVar = rggVar.c;
                        m1e m1eVar = rggVar.d;
                        ctf0 ctf0Var = rggVar.e;
                        wdk0 wdk0Var = rggVar.f;
                        b3c0 b3c0Var = rggVar.g;
                        ib50 ib50Var = rggVar.h;
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        b3c0Var.getClass();
                        pygVar.getClass();
                        iipVar.getClass();
                        return new iei(cadVar, pygVar, ctf0Var, cyberChampsMainParams, ib50Var);
                    }
                }
                jf4.n(b1j.i(rgg.class, "Cannot create dependency "));
                return null;
            default:
                qud qudVar3 = vgg.Q1;
                return new q0h0((hei) ((iei) vggVar.N1.getValue()).h.get());
        }
    }
}
