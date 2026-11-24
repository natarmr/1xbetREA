package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.presentation.player_transfers.PlayerTransfersScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eda0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7606a;
    public final /* synthetic */ hda0 b;

    public /* synthetic */ eda0(hda0 hda0Var, byte b) {
        this.f7606a = b;
        this.b = hda0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f7606a;
        hda0 hda0Var = this.b;
        switch (b) {
            case 0:
                mi70 mi70Var = hda0.R1;
                ComponentCallbacks2 application = hda0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ida0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ida0)) {
                        ze3Var = null;
                    }
                    ida0 ida0Var = (ida0) ze3Var;
                    if (ida0Var != null) {
                        PlayerTransfersScreenParams playerTransfersScreenParams = (PlayerTransfersScreenParams) hda0Var.O1.n(hda0Var, hda0.S1[0]);
                        cad cadVar = ida0Var.f14575a;
                        pyg pygVar = ida0Var.d;
                        iip iipVar = ida0Var.g;
                        g2v g2vVar = ida0Var.f;
                        m1e m1eVar = ida0Var.b;
                        gii0 gii0Var = ida0Var.c;
                        ctf0 ctf0Var = ida0Var.e;
                        wdk0 wdk0Var = ida0Var.h;
                        ih5 ih5Var = ida0Var.i;
                        zr1 zr1Var = ida0Var.j;
                        pygVar.getClass();
                        iipVar.getClass();
                        m1eVar.getClass();
                        gii0Var.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        return new goi(cadVar, pygVar, playerTransfersScreenParams, g2vVar, m1eVar, gii0Var, ctf0Var, wdk0Var, ih5Var, zr1Var);
                    }
                }
                jf4.n(b1j.i(ida0.class, "Cannot create dependency "));
                return null;
            case 1:
                mi70 mi70Var2 = hda0.R1;
                fiu0 fiu0Var = hda0Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                mi70 mi70Var3 = hda0.R1;
                hda0Var.G0().x(uca0.f35419a);
                return Unit.f46060a;
            case 3:
                mi70 mi70Var4 = hda0.R1;
                hda0Var.G0().x(sca0.f31977a);
                return Unit.f46060a;
            default:
                mi70 mi70Var5 = hda0.R1;
                hda0Var.G0().x(rca0.f30229a);
                return Unit.f46060a;
        }
    }
}
