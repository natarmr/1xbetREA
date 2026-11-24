package org.xplatform.cyber.section.impl.navigation;

import a.iiy;
import a.m1r;
import a.ufx;
import a.uy80;
import a.vqc;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46595a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public CyberGamesScreenFactoryImpl$partnersTeamInfoScreen$1(vqc vqcVar, String str, long j, boolean z) {
        this.f46595a = str;
        this.b = j;
        this.c = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        String str = this.f46595a;
        str.getClass();
        uy80.W1.getClass();
        uy80 uy80Var = new uy80();
        iiy[] iiyVarArr = uy80.X1;
        uy80Var.Q1.x(uy80Var, iiyVarArr[0], str);
        uy80Var.R1.j(uy80Var, iiyVarArr[1], this.b);
        uy80Var.S1.v(uy80Var, iiyVarArr[2], this.c);
        return uy80Var;
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
