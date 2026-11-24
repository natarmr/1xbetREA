package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.LeaderBoardScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class igz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14754a;
    public final /* synthetic */ jgz b;

    public /* synthetic */ igz(jgz jgzVar, byte b) {
        this.f14754a = b;
        this.b = jgzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14754a;
        jgz jgzVar = this.b;
        switch (b) {
            case 0:
                tqt tqtVar = jgz.Q1;
                ComponentCallbacks2 application = jgzVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(afz.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof afz)) {
                        ze3Var = null;
                    }
                    afz afzVar = (afz) ze3Var;
                    if (afzVar != null) {
                        LeaderBoardScreenParams leaderBoardScreenParams = (LeaderBoardScreenParams) jgzVar.M1.n(jgzVar, jgz.R1[0]);
                        oeg0 oeg0Var = afzVar.f802a;
                        m1e m1eVar = afzVar.b;
                        cad cadVar = afzVar.c;
                        pyg pygVar = afzVar.d;
                        xri xriVar = afzVar.e;
                        ctf0 ctf0Var = afzVar.g;
                        g2v g2vVar = afzVar.h;
                        iip iipVar = afzVar.f;
                        wdk0 wdk0Var = afzVar.i;
                        kt2 kt2Var = afzVar.j;
                        zr1 zr1Var = afzVar.k;
                        oeg0Var.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        kt2Var.getClass();
                        pygVar.getClass();
                        xriVar.getClass();
                        iipVar.getClass();
                        return new nji(cadVar, pygVar, iipVar, m1eVar, leaderBoardScreenParams, ctf0Var, g2vVar, wdk0Var, kt2Var, zr1Var);
                    }
                }
                jf4.n(b1j.i(afz.class, "Cannot create dependency "));
                return null;
            case 1:
                tqt tqtVar2 = jgz.Q1;
                fiu0 fiu0Var = jgzVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                tqt tqtVar3 = jgz.Q1;
                jgzVar.G0().x(dfz.f6022a);
                return Unit.f46060a;
            default:
                tqt tqtVar4 = jgz.Q1;
                jgzVar.G0().x(cfz.f4287a);
                return Unit.f46060a;
        }
    }
}
