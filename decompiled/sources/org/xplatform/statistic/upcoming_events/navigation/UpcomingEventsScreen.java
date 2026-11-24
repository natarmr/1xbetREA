package org.xplatform.statistic.upcoming_events.navigation;

import a.igt0;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/upcoming_events/navigation/UpcomingEventsScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UpcomingEventsScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47106a;
    public final long b;

    public UpcomingEventsScreen(String str, long j) {
        str.getClass();
        this.f47106a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        igt0.Q1.getClass();
        String str = this.f47106a;
        str.getClass();
        igt0 igt0Var = new igt0();
        iiy[] iiyVarArr = igt0.R1;
        igt0Var.L1.x(igt0Var, iiyVarArr[1], str);
        igt0Var.M1.j(igt0Var, iiyVarArr[2], this.b);
        return igt0Var;
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
