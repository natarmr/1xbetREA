package org.xplatform.cyber.calendar.impl.navigation;

import a.m1r;
import a.s7g;
import a.ufx;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/cyber/calendar/impl/navigation/CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1 implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CyberCalendarParams f46478a;

    public CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1(CyberCalendarParams cyberCalendarParams) {
        this.f46478a = cyberCalendarParams;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        s7g.U1.getClass();
        s7g s7gVar = new s7g();
        s7gVar.S1.J(s7gVar, s7g.V1[1], this.f46478a);
        return s7gVar;
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
