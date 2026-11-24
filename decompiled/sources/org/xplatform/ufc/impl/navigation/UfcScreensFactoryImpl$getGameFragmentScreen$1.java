package org.xplatform.ufc.impl.navigation;

import a.bek;
import a.m1r;
import a.mcs;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.ufc.api.game.UfcGameParams;
import org.xplatform.ufc.api.navigation.UfcScreensFactory$UfcGameScreen;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"org/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getGameFragmentScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "Lorg/xplatform/ufc/api/navigation/UfcScreensFactory$UfcGameScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UfcScreensFactoryImpl$getGameFragmentScreen$1 implements FragmentScreen, UfcScreensFactory$UfcGameScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f47178a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;

    public UfcScreensFactoryImpl$getGameFragmentScreen$1(int i, long j, long j2, long j3, long j4, String str, boolean z) {
        this.f47178a = j;
        this.b = z;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = str;
        this.g = i;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        bek bekVar = mcs.Z1;
        UfcGameParams ufcGameParams = new UfcGameParams(this.g, this.f47178a, this.c, this.d, this.e, this.f, this.b);
        bekVar.getClass();
        mcs mcsVar = new mcs();
        mcsVar.Y1.J(mcsVar, mcs.a2[1], ufcGameParams);
        return mcsVar;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return String.valueOf(this.f47178a);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
