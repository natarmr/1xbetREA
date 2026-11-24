package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zeg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44249a;
    public final /* synthetic */ afg b;

    public /* synthetic */ zeg(afg afgVar, byte b) {
        this.f44249a = b;
        this.b = afgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44249a;
        afg afgVar = this.b;
        switch (b) {
            case 0:
                cei ceiVar = afgVar.L1;
                if (ceiVar != null) {
                    return new q0h0(ceiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                std stdVar = afg.S1;
                ComponentCallbacks2 application = afgVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(gcg.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof gcg)) {
                        ze3Var = null;
                    }
                    gcg gcgVar = (gcg) ze3Var;
                    if (gcgVar != null) {
                        CyberChampParams cyberChampParams = (CyberChampParams) afgVar.O1.n(afgVar, afg.U1[0]);
                        ugf0 ugf0Var = gcgVar.f11060a;
                        iip iipVar = gcgVar.b;
                        m1e m1eVar = gcgVar.c;
                        g2v g2vVar = gcgVar.d;
                        duj dujVar = gcgVar.e;
                        cad cadVar = gcgVar.f;
                        pyg pygVar = gcgVar.g;
                        xri xriVar = gcgVar.h;
                        y78 y78Var = gcgVar.i;
                        lbu lbuVar = gcgVar.j;
                        pru pruVar = gcgVar.k;
                        ctf0 ctf0Var = gcgVar.l;
                        itr itrVar = gcgVar.m;
                        epi0 epi0Var = gcgVar.n;
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        iipVar.getClass();
                        pygVar.getClass();
                        xriVar.getClass();
                        itrVar.getClass();
                        return new dei(ugf0Var, cadVar, pygVar, itrVar, epi0Var, cyberChampParams, m1eVar, g2vVar, dujVar, y78Var, lbuVar, pruVar, ctf0Var);
                    }
                }
                jf4.n(b1j.i(gcg.class, "Cannot create dependency "));
                return null;
            case 2:
                std stdVar2 = afg.S1;
                afgVar.G0().x(neg.f23384a);
                return Unit.f46060a;
            default:
                std stdVar3 = afg.S1;
                afgVar.G0().x(meg.f21642a);
                return Unit.f46060a;
        }
    }
}
