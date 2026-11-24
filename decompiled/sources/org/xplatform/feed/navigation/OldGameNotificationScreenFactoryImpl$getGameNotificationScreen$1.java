package org.xplatform.feed.navigation;

import a.gns;
import a.m1r;
import a.pek;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.feed.notifictation.presentation.models.GameNotificationScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f46672a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    public OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1(long j, long j2, long j3, long j4, String str, boolean z) {
        this.f46672a = j;
        this.b = j2;
        this.c = str;
        this.d = j3;
        this.e = j4;
        this.f = z;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        pek pekVar = gns.R1;
        GameNotificationScreenParams gameNotificationScreenParams = new GameNotificationScreenParams(this.f46672a, this.b, this.d, this.e, this.c, this.f);
        pekVar.getClass();
        gns gnsVar = new gns();
        gnsVar.Q1.J(gnsVar, gns.S1[1], gameNotificationScreenParams);
        return gnsVar;
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
