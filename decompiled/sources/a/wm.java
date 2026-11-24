package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.activeteams.CyberActiveTeamsParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wm implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39380a;
    public final /* synthetic */ xm b;

    public /* synthetic */ wm(xm xmVar, byte b) {
        this.f39380a = b;
        this.b = xmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39380a;
        xm xmVar = this.b;
        switch (b) {
            case 0:
                jdk0 jdk0Var = xm.Q1;
                ComponentCallbacks2 application = xmVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ym.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ym)) {
                        ze3Var = null;
                    }
                    ym ymVar = (ym) ze3Var;
                    if (ymVar != null) {
                        CyberActiveTeamsParams cyberActiveTeamsParams = (CyberActiveTeamsParams) xmVar.O1.n(xmVar, xm.R1[0]);
                        g2v g2vVar = ymVar.f42863a;
                        cad cadVar = ymVar.b;
                        m1e m1eVar = ymVar.c;
                        gii0 gii0Var = ymVar.d;
                        oeg0 oeg0Var = ymVar.e;
                        pyg pygVar = ymVar.f;
                        ctf0 ctf0Var = ymVar.g;
                        knf0 knf0Var = ymVar.h;
                        iip iipVar = ymVar.i;
                        sjl0 sjl0Var = ymVar.k;
                        xri xriVar = ymVar.j;
                        wdk0 wdk0Var = ymVar.l;
                        kt2 kt2Var = ymVar.m;
                        zr1 zr1Var = ymVar.n;
                        pygVar.getClass();
                        iipVar.getClass();
                        xriVar.getClass();
                        m1eVar.getClass();
                        gii0Var.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        knf0Var.getClass();
                        sjl0Var.getClass();
                        wdk0Var.getClass();
                        kt2Var.getClass();
                        return new w5i(cadVar, pygVar, g2vVar, m1eVar, gii0Var, ctf0Var, cyberActiveTeamsParams, wdk0Var, kt2Var, zr1Var);
                    }
                }
                jf4.n(b1j.i(ym.class, "Cannot create dependency "));
                return null;
            case 1:
                jdk0 jdk0Var2 = xm.Q1;
                fiu0 fiu0Var = xmVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                jdk0 jdk0Var3 = xm.Q1;
                ((k3t0) xmVar.N1.getValue()).x(lm.f20271a);
                return Unit.f46060a;
            case 3:
                jdk0 jdk0Var4 = xm.Q1;
                ((k3t0) xmVar.N1.getValue()).x(jm.f16740a);
                return Unit.f46060a;
            default:
                jdk0 jdk0Var5 = xm.Q1;
                ((k3t0) xmVar.N1.getValue()).x(im.f15001a);
                return Unit.f46060a;
        }
    }
}
