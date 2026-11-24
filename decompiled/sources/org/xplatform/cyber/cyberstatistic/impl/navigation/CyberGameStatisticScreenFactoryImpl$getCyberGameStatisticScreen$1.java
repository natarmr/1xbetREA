package org.xplatform.cyber.cyberstatistic.impl.navigation;

import a.czt0;
import a.gr00;
import a.ik40;
import a.k210;
import a.m1r;
import a.rwd0;
import a.upg;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.game.lol.api.LolPostGameStatScreenParams;
import org.xplatform.cyber.game.mlbb.api.MlbbPostGameStatScreenParams;
import org.xplatform.cyber.game.rainbow.api.RainbowPostGameScreenParams;
import org.xplatform.cyber.game.valorant.api.ValorantPostGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CyberGameStatisticScreenParams f46491a;
    public final /* synthetic */ gr00 b;

    public CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(CyberGameStatisticScreenParams cyberGameStatisticScreenParams, gr00 gr00Var) {
        this.f46491a = cyberGameStatisticScreenParams;
        this.b = gr00Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        CyberGameStatisticScreenParams cyberGameStatisticScreenParams = this.f46491a;
        long j = cyberGameStatisticScreenParams.b;
        gr00 gr00Var = this.b;
        if (j == 2) {
            Object obj = gr00Var.b;
            LolPostGameStatScreenParams lolPostGameStatScreenParams = new LolPostGameStatScreenParams(cyberGameStatisticScreenParams.f46490a, cyberGameStatisticScreenParams.d, cyberGameStatisticScreenParams.c, j);
            k210.U1.getClass();
            k210 k210Var = new k210();
            k210Var.R1.J(k210Var, k210.V1[1], lolPostGameStatScreenParams);
            return k210Var;
        }
        if (j == 15) {
            Object obj2 = gr00Var.c;
            RainbowPostGameScreenParams rainbowPostGameScreenParams = new RainbowPostGameScreenParams(cyberGameStatisticScreenParams.f46490a, j, cyberGameStatisticScreenParams.c, cyberGameStatisticScreenParams.d, cyberGameStatisticScreenParams.e, cyberGameStatisticScreenParams.f, cyberGameStatisticScreenParams.g, cyberGameStatisticScreenParams.h, cyberGameStatisticScreenParams.i, cyberGameStatisticScreenParams.j);
            rwd0.U1.getClass();
            rwd0 rwd0Var = new rwd0();
            rwd0Var.R1.J(rwd0Var, rwd0.V1[1], rainbowPostGameScreenParams);
            return rwd0Var;
        }
        if (j == 27) {
            Object obj3 = gr00Var.d;
            ValorantPostGameScreenParams valorantPostGameScreenParams = new ValorantPostGameScreenParams(cyberGameStatisticScreenParams.f46490a, cyberGameStatisticScreenParams.c, cyberGameStatisticScreenParams.d, j);
            czt0.U1.getClass();
            czt0 czt0Var = new czt0();
            czt0Var.R1.J(czt0Var, czt0.V1[1], valorantPostGameScreenParams);
            return czt0Var;
        }
        if (j != 36) {
            Object obj4 = gr00Var.f11760a;
            upg.X1.getClass();
            upg upgVar = new upg();
            upgVar.S1.J(upgVar, upg.Y1[1], cyberGameStatisticScreenParams);
            return upgVar;
        }
        Object obj5 = gr00Var.e;
        MlbbPostGameStatScreenParams mlbbPostGameStatScreenParams = new MlbbPostGameStatScreenParams(cyberGameStatisticScreenParams.f46490a, j, cyberGameStatisticScreenParams.d);
        ik40.S1.getClass();
        ik40 ik40Var = new ik40();
        ik40Var.Q1.J(ik40Var, ik40.U1[1], mlbbPostGameStatScreenParams);
        return ik40Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return this.f46491a.f46490a;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
