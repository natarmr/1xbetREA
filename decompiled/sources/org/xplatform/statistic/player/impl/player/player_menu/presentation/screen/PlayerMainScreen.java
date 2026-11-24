package org.xplatform.statistic.player.impl.player.player_menu.presentation.screen;

import a.iiy;
import a.m1r;
import a.oaa0;
import a.r5a0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PlayerMainScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47049a;
    public final long b;
    public final String c;
    public final oaa0 d;

    public PlayerMainScreen(String str, long j, String str2, oaa0 oaa0Var) {
        str.getClass();
        str2.getClass();
        this.f47049a = str;
        this.b = j;
        this.c = str2;
        this.d = oaa0Var;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        r5a0.S1.getClass();
        String str = this.f47049a;
        str.getClass();
        String str2 = this.c;
        str2.getClass();
        r5a0 r5a0Var = new r5a0();
        iiy[] iiyVarArr = r5a0.U1;
        r5a0Var.K1.x(r5a0Var, iiyVarArr[0], str);
        r5a0Var.L1.x(r5a0Var, iiyVarArr[1], str2);
        r5a0Var.M1.j(r5a0Var, iiyVarArr[2], this.b);
        r5a0Var.N1.u(r5a0Var, iiyVarArr[3], this.d);
        return r5a0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
