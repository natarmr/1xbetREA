package org.xplatform.statistic.completedmatches.navigation;

import a.hed;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/completedmatches/navigation/CompletedMatchesScreens;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CompletedMatchesScreens implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47022a;
    public final long b;

    public CompletedMatchesScreens(String str, long j) {
        str.getClass();
        this.f47022a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        hed.Q1.getClass();
        String str = this.f47022a;
        str.getClass();
        hed hedVar = new hed();
        iiy[] iiyVarArr = hed.R1;
        hedVar.O1.j(hedVar, iiyVarArr[2], this.b);
        hedVar.N1.x(hedVar, iiyVarArr[1], str);
        return hedVar;
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
