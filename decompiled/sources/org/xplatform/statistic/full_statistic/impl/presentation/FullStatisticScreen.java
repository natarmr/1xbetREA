package org.xplatform.statistic.full_statistic.impl.presentation;

import a.iiy;
import a.m1r;
import a.qcr;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/full_statistic/impl/presentation/FullStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FullStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47029a;
    public final int b;

    public FullStatisticScreen(String str, int i) {
        this.f47029a = str;
        this.b = i;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        qcr.Q1.getClass();
        qcr qcrVar = new qcr();
        iiy[] iiyVarArr = qcr.R1;
        qcrVar.M1.x(qcrVar, iiyVarArr[1], this.f47029a);
        qcrVar.N1.I(qcrVar, iiyVarArr[2], this.b);
        return qcrVar;
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
