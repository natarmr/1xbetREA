package org.xplatform.statistic.game_events.presentation.screen;

import a.iiy;
import a.jbs;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/game_events/presentation/screen/GameEventsScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GameEventsScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47030a;
    public final String b;

    public GameEventsScreen(long j, String str) {
        this.f47030a = j;
        this.b = str;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        jbs.R1.getClass();
        jbs jbsVar = new jbs();
        iiy[] iiyVarArr = jbs.S1;
        jbsVar.L1.x(jbsVar, iiyVarArr[0], this.b);
        jbsVar.M1.j(jbsVar, iiyVarArr[1], this.f47030a);
        return jbsVar;
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
