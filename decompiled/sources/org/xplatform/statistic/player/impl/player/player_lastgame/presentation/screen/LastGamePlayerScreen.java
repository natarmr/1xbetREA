package org.xplatform.statistic.player.impl.player.player_lastgame.presentation.screen;

import a.iiy;
import a.m1r;
import a.pzy;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/player/impl/player/player_lastgame/presentation/screen/LastGamePlayerScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LastGamePlayerScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47048a;
    public final long b;

    public LastGamePlayerScreen(String str, long j) {
        str.getClass();
        this.f47048a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        pzy.Q1.getClass();
        String str = this.f47048a;
        str.getClass();
        pzy pzyVar = new pzy();
        iiy[] iiyVarArr = pzy.R1;
        pzyVar.N1.x(pzyVar, iiyVarArr[1], str);
        pzyVar.O1.j(pzyVar, iiyVarArr[2], this.b);
        return pzyVar;
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
