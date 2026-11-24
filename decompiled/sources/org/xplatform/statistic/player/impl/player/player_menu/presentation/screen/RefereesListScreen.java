package org.xplatform.statistic.player.impl.player.player_menu.presentation.screen;

import a.iiy;
import a.m1r;
import a.nme0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/RefereesListScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RefereesListScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47050a;
    public final long b;

    public RefereesListScreen(String str, long j) {
        this.f47050a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        nme0.Q1.getClass();
        nme0 nme0Var = new nme0();
        iiy[] iiyVarArr = nme0.R1;
        nme0Var.K1.x(nme0Var, iiyVarArr[0], this.f47050a);
        nme0Var.L1.j(nme0Var, iiyVarArr[1], this.b);
        return nme0Var;
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
