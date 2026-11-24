package org.xplatform.statistic.facts.presentation.screen;

import a.ivo;
import a.m1r;
import a.ufx;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/statistic/facts/presentation/screen/FactsStatisticScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FactsStatisticScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47026a;
    public final long b;

    public FactsStatisticScreen(String str, long j) {
        this.f47026a = str;
        this.b = j;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        ivo.P1.getClass();
        ivo ivoVar = new ivo();
        Bundle bundle = new Bundle();
        bundle.putString("KEY_GAME_ID", this.f47026a);
        bundle.putLong("KEY_SPORT_ID", this.b);
        ivoVar.s0(bundle);
        return ivoVar;
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
