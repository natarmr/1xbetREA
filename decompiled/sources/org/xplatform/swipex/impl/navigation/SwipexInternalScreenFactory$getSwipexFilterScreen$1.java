package org.xplatform.swipex.impl.navigation;

import a.iiy;
import a.m1r;
import a.tun0;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/swipex/impl/navigation/SwipexInternalScreenFactory$getSwipexFilterScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SwipexInternalScreenFactory$getSwipexFilterScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f47113a;
    public final /* synthetic */ long b;

    public SwipexInternalScreenFactory$getSwipexFilterScreen$1(long j, long j2) {
        this.f47113a = j;
        this.b = j2;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        tun0.P1.getClass();
        tun0 tun0Var = new tun0();
        iiy[] iiyVarArr = tun0.Q1;
        tun0Var.O1.j(tun0Var, iiyVarArr[2], this.b);
        tun0Var.N1.j(tun0Var, iiyVarArr[1], this.f47113a);
        return tun0Var;
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
