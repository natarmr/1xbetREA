package org.xplatform.statistic.grand_prix.presentation.screens;

import a.ddv;
import a.iiy;
import a.m1r;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/grand_prix/presentation/screens/GrandPrixStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GrandPrixStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47032a;
    public final long b;

    public GrandPrixStatisticScreen(String str, long j) {
        str.getClass();
        this.f47032a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ddv.Q1.getClass();
        String str = this.f47032a;
        str.getClass();
        ddv ddvVar = new ddv();
        iiy[] iiyVarArr = ddv.R1;
        ddvVar.M1.x(ddvVar, iiyVarArr[1], str);
        ddvVar.N1.j(ddvVar, iiyVarArr[2], this.b);
        return ddvVar;
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
