package org.xplatform.statistic.cycling.impl.cycling_menu.presentation.screen;

import a.iiy;
import a.m1r;
import a.muh;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/cycling/impl/cycling_menu/presentation/screen/CyclingMainFragmentScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyclingMainFragmentScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47023a;
    public final long b;

    public CyclingMainFragmentScreen(String str, long j) {
        str.getClass();
        this.f47023a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        muh.R1.getClass();
        String str = this.f47023a;
        str.getClass();
        muh muhVar = new muh();
        iiy[] iiyVarArr = muh.S1;
        muhVar.L1.x(muhVar, iiyVarArr[0], str);
        muhVar.M1.j(muhVar, iiyVarArr[1], this.b);
        return muhVar;
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
