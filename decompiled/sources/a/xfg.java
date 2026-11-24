package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xfg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40789a;
    public final /* synthetic */ zfg b;

    public /* synthetic */ xfg(zfg zfgVar, byte b) {
        this.f40789a = b;
        this.b = zfgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40789a;
        zfg zfgVar = this.b;
        switch (b) {
            case 0:
                kud kudVar = zfg.S1;
                fiu0 fiu0Var = zfgVar.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                kud kudVar2 = zfg.S1;
                ComponentCallbacks2 application = zfgVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(zdg.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof zdg)) {
                        ze3Var = null;
                    }
                    zdg zdgVar = (zdg) ze3Var;
                    if (zdgVar != null) {
                        CyberChampParams cyberChampParams = (CyberChampParams) zfgVar.O1.n(zfgVar, zfg.U1[0]);
                        gii0 gii0Var = zdgVar.f44212a;
                        m1e m1eVar = zdgVar.b;
                        mne mneVar = zdgVar.c;
                        oeg0 oeg0Var = zdgVar.d;
                        g2v g2vVar = zdgVar.e;
                        pyg pygVar = zdgVar.f;
                        rrc rrcVar = zdgVar.g;
                        wdk0 wdk0Var = zdgVar.j;
                        ctf0 ctf0Var = zdgVar.h;
                        wgu wguVar = zdgVar.i;
                        roi0 roi0Var = zdgVar.k;
                        pmi pmiVar = zdgVar.l;
                        pru pruVar = zdgVar.m;
                        kt2 kt2Var = zdgVar.n;
                        zr1 zr1Var = zdgVar.o;
                        epi0 epi0Var = zdgVar.p;
                        gii0Var.getClass();
                        m1eVar.getClass();
                        oeg0Var.getClass();
                        ctf0Var.getClass();
                        wguVar.getClass();
                        wdk0Var.getClass();
                        kt2Var.getClass();
                        pygVar.getClass();
                        return new gei(pygVar, rrcVar, roi0Var, epi0Var, cyberChampParams, m1eVar, mneVar, oeg0Var, g2vVar, ctf0Var, wguVar, wdk0Var, pmiVar, pruVar, kt2Var, zr1Var);
                    }
                }
                jf4.n(b1j.i(zdg.class, "Cannot create dependency "));
                return null;
            case 2:
                kud kudVar3 = zfg.S1;
                zfgVar.G0().x(mfg.f21692a);
                return Unit.f46060a;
            default:
                kud kudVar4 = zfg.S1;
                zfgVar.G0().x(lfg.f19954a);
                return Unit.f46060a;
        }
    }
}
